package com.ss.avframework.livestreamv2;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.capture.video.ExternalVideoCapturer;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.engine.VideoTrack;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;

class InputVideoStream implements VideoCapturer.VideoCapturerObserver, IInputVideoStream {
    private int mCurrentFrameHeight;
    private int mCurrentFrameWidth;
    private ExternalVideoCapturer mExternalVideoCapturer;
    private int mFps;
    private Handler mHandler;
    private int mHeight;
    private Observer mObserver;
    private VideoMixer.VideoMixerDescription mVideoMixerDescription = new VideoMixer.VideoMixerDescription();
    private VideoTrack mVideoTrack;
    private int mWidth;

    public interface Observer {
        static {
            Covode.recordClassIndex(99872);
        }

        void onMixerDescriptionChange(InputVideoStream inputVideoStream, VideoMixer.VideoMixerDescription videoMixerDescription);

        void releaseInputStream(InputVideoStream inputVideoStream);
    }

    static {
        Covode.recordClassIndex(99871);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerError(int i2, Exception exc) {
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStarted() {
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStoped() {
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public int fps() {
        return this.mFps;
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public VideoMixer.VideoMixerDescription getMixerDescription() {
        return this.mVideoMixerDescription;
    }

    public VideoTrack getVideoTrack() {
        return this.mVideoTrack;
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public String name() {
        VideoTrack videoTrack = this.mVideoTrack;
        if (videoTrack != null) {
            return videoTrack.id();
        }
        return "";
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public int stop() {
        if (this.mExternalVideoCapturer == null) {
            return 0;
        }
        AVLog.iow("InputVideoStream", "InputVideoStream: stop.");
        this.mExternalVideoCapturer.stop();
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public synchronized void release() {
        MethodCollector.i(11734);
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.releaseInputStream(this);
        }
        ExternalVideoCapturer externalVideoCapturer = this.mExternalVideoCapturer;
        if (externalVideoCapturer != null) {
            externalVideoCapturer.release();
            this.mExternalVideoCapturer = null;
        }
        VideoTrack videoTrack = this.mVideoTrack;
        if (videoTrack != null) {
            videoTrack.release();
            this.mVideoTrack = null;
        }
        MethodCollector.o(11734);
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public int start() {
        if (this.mExternalVideoCapturer == null) {
            return 0;
        }
        AVLog.iow("InputVideoStream", "InputVideoStream: start.width:" + this.mWidth + ",height:" + this.mHeight + ",fps:" + this.mFps);
        this.mExternalVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        if (videoMixerDescription != null) {
            AVLog.iow("InputVideoStream", "update mix description:" + this + ",desc:" + videoMixerDescription.toString());
            this.mVideoMixerDescription.copy(videoMixerDescription);
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onMixerDescriptionChange(this, videoMixerDescription);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public int pushVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        ExternalVideoCapturer externalVideoCapturer = this.mExternalVideoCapturer;
        if (externalVideoCapturer != null) {
            return externalVideoCapturer.pushVideoFrame(byteBuffer, i2, i3, i4, j2, TimeUtils.currentTimeMs());
        }
        return -1;
    }

    public InputVideoStream(MediaEngineFactory mediaEngineFactory, Handler handler, Observer observer, int i2, int i3, int i4) {
        ExternalVideoCapturer externalVideoCapturer = new ExternalVideoCapturer(this, handler);
        this.mExternalVideoCapturer = externalVideoCapturer;
        this.mVideoTrack = mediaEngineFactory.createVideoTrack(externalVideoCapturer);
        this.mObserver = observer;
        this.mFps = i4;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mHandler = handler;
    }

    @Override // com.ss.avframework.livestreamv2.IInputVideoStream
    public int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2) {
        if (!(i3 == this.mCurrentFrameWidth && i4 == this.mCurrentFrameHeight)) {
            this.mCurrentFrameWidth = i3;
            this.mCurrentFrameHeight = i4;
            this.mExternalVideoCapturer.adaptOutputFormat(i3, i4, this.mFps, false);
            AVLog.iod("InputVideoStream", "Report first video frame at " + i3 + "x" + i4 + " timestamp " + j2);
        }
        ExternalVideoCapturer externalVideoCapturer = this.mExternalVideoCapturer;
        if (externalVideoCapturer != null) {
            return externalVideoCapturer.pushVideoFrame(i2, z, i3, i4, i5, fArr, j2, null, TimeUtils.currentTimeMs());
        }
        return -1;
    }
}
