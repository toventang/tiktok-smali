package com.ss.bytertc.engine.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import com.ss.bytertc.engine.video.IVideoSink;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;

public class VideoSinkAdapter implements IVideoSink {
    public com.ss.bytertc.engine.mediaio.IVideoSink mBridgedOldSink;
    private boolean mInitialized;
    private IVideoSink mSink;
    private boolean mStarted;
    private VideoSinkTask mVideoSinkTask;

    static {
        Covode.recordClassIndex(100833);
    }

    public void release() {
        VideoSinkTask videoSinkTask;
        if (this.mBridgedOldSink != null && (videoSinkTask = this.mVideoSinkTask) != null) {
            videoSinkTask.post(new Runnable() {
                /* class com.ss.bytertc.engine.adapter.VideoSinkAdapter.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100834);
                }

                public void run() {
                    if (VideoSinkAdapter.this.mBridgedOldSink != null) {
                        VideoSinkAdapter.this.mBridgedOldSink.onStop();
                        VideoSinkAdapter.this.mBridgedOldSink.onDispose();
                    }
                }
            });
        }
    }

    public VideoSinkAdapter(IVideoSink iVideoSink) {
        this.mSink = iVideoSink;
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public void onFrame(RTCVideoFrame rTCVideoFrame) {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            iVideoSink.onFrame(rTCVideoFrame);
            return;
        }
        com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink2 = this.mBridgedOldSink;
        if (iVideoSink2 != null) {
            iVideoSink2.consumeVideoFrame(rTCVideoFrame);
        }
    }

    /* access modifiers changed from: package-private */
    public void onVideoFrame(VideoFrame videoFrame) {
        MethodCollector.i(9373);
        if (videoFrame != null) {
            int width = videoFrame.getBuffer().getWidth();
            int height = videoFrame.getBuffer().getHeight();
            final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer((width * height) + (((width + 1) / 2) * ((height + 1) / 2) * 2));
            RTCVideoFrame rTCVideoFrame = new RTCVideoFrame(nativeAllocateBuffer, videoFrame.getExtendedData(), null, width, height, videoFrame.getRotation(), videoFrame.getTimestampNs(), new Runnable() {
                /* class com.ss.bytertc.engine.adapter.VideoSinkAdapter.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(100835);
                }

                public void run() {
                    MethodCollector.i(8752);
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                    MethodCollector.o(8752);
                }
            });
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            if (i420 != null) {
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), rTCVideoFrame.buffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
            onFrame(rTCVideoFrame);
            videoFrame.release();
            rTCVideoFrame.release();
        }
        MethodCollector.o(9373);
    }

    public VideoSinkAdapter(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, VideoSinkTask videoSinkTask) {
        this.mBridgedOldSink = iVideoSink;
        this.mVideoSinkTask = videoSinkTask;
    }
}
