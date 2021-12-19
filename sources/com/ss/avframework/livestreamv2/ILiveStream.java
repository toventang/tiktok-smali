package com.ss.avframework.livestreamv2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.capture.audio.AudioRecordThread;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.livestreamv2.filter.VideoCatcher;
import com.ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.ss.avframework.utils.TEBundle;
import com.ss.optimizer.live.sdk.dns.e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;

public interface ILiveStream {

    public interface CatchMediaDataCallback {
        static {
            Covode.recordClassIndex(99861);
        }

        void onComplete();

        void onError(int i2, String str);
    }

    public interface CatchPicCallback extends CatchMediaDataCallback {
        static {
            Covode.recordClassIndex(99862);
        }

        void onCatchedPic(boolean z, VideoCatcher videoCatcher);
    }

    public interface CatchVideoCallback extends CatchMediaDataCallback {
        static {
            Covode.recordClassIndex(99863);
        }
    }

    public interface IAudioFrameAvailableListener {
        static {
            Covode.recordClassIndex(99864);
        }

        void onAudioFrameAvailable(Buffer buffer, int i2, int i3, int i4, long j2);
    }

    public interface ILiveStreamDataListener {
        static {
            Covode.recordClassIndex(99865);
        }

        void onData(int i2, int i3, int i4);
    }

    public interface ILiveStreamErrorListener {
        static {
            Covode.recordClassIndex(99866);
        }

        void onError(int i2, int i3, Exception exc);
    }

    public interface ILiveStreamInfoListener {
        static {
            Covode.recordClassIndex(99867);
        }

        void onInfo(int i2, int i3, int i4);
    }

    public interface ITextureFrameAvailableListener {
        static {
            Covode.recordClassIndex(99868);
        }

        void onTextureFrameAvailable(EGLContext eGLContext, int i2, boolean z, int i3, int i4, long j2, float[] fArr, Object... objArr);
    }

    static {
        Covode.recordClassIndex(99860);
    }

    void adaptedVideoResolution(int i2, int i3);

    void adaptedVideoResolution(int i2, int i3, int i4);

    int addSeiField(String str, Object obj, int i2);

    int addSeiField(String str, Object obj, int i2, boolean z, boolean z2);

    int addSeiField(String str, Object obj, int i2, boolean z, boolean z2, int i3);

    void addUserMetaData(String str, String str2, int i2);

    boolean audioMute();

    void catchMediaData(Bundle bundle, CatchMediaDataCallback catchMediaDataCallback);

    void catchMediaData(Bundle bundle, CatchPicCallback catchPicCallback);

    void catchVideo(Bundle bundle, CatchVideoCallback catchVideoCallback);

    void changeVideoBitrate(int i2, int i3, int i4);

    void changeVideoFps(int i2);

    void changeVideoResolution(int i2, int i3);

    IInputAudioStream createInputAudioStream();

    IInputVideoStream createInputVideoStream();

    void enableMirror(boolean z, boolean z2);

    void enableMixer(boolean z, boolean z2);

    boolean getAdaptedVideoResolution(int[] iArr);

    IAudioFilterManager getAudioFilterMgr();

    IAudioRecordManager getAudioRecorMgr();

    boolean getLiveStreamInfo(LiveStreamReport liveStreamReport);

    LiveStreamOption getOption();

    IInputAudioStream getOriginInputAudioStream();

    IInputVideoStream getOriginInputVideoStream();

    IRecorderManager getRecorderMgr();

    String getVersion();

    IVideoCapturerControl getVideoCapturerControl();

    IFilterManager getVideoFilterMgr();

    boolean isEnableMixer(boolean z);

    boolean isMirror(boolean z);

    void pause();

    int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2);

    int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2);

    int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2, Bundle bundle);

    int pushVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2);

    void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback);

    void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i2);

    void release();

    void requestKeyFrame();

    void resume();

    void sendSdkControlMsg(String str);

    int sendSeiMsg(String str);

    void setAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void setAudioMute(boolean z);

    void setAudioRecordPath(String str);

    void setAudioScenario(int i2);

    void setBackGroundPhotoPath(Bitmap bitmap);

    void setBackGroundPhotoPath(String str);

    void setDataListener(ILiveStreamDataListener iLiveStreamDataListener);

    void setDns(e eVar);

    void setErrorListener(ILiveStreamErrorListener iLiveStreamErrorListener);

    void setInfoListener(ILiveStreamInfoListener iLiveStreamInfoListener);

    void setLowPowerLevel(int i2);

    void setOption(LiveStreamOption liveStreamOption);

    void setOriginVideoTrack(String str);

    void setPublishPlanarRender(boolean z);

    void setRadioModeBgBitmap(Bitmap bitmap);

    void setRenderSink(VideoSink videoSink);

    void setScreenIntent(Intent intent);

    void setSeiCurrentShiftDiffTime(long j2);

    void setTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    void setTimeInterval(int i2);

    void start(String str);

    void start(List<String> list);

    void startAudioCapture();

    void startTransportInDebug();

    void startVideoCapture();

    void stop();

    void stopAudioCapture();

    void stopTransportInDebug();

    void stopVideoCapture();

    void switchAudioCapture(int i2);

    void switchAudioMode(int i2);

    void switchVideoCapture(int i2);

    void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback);

    void unregisterScreenAudioPlayBack();

    void updateSdkParams(TEBundle tEBundle);

    void updateSdkParams(String str);
}
