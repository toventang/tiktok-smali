package com.ss.avframework.player;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.TEBundle;

public interface IAVPlayer {

    public interface ErrorListener {
        static {
            Covode.recordClassIndex(100551);
        }

        void onError(IAVPlayer iAVPlayer, int i2, Exception exc);
    }

    public interface EventListener {
        static {
            Covode.recordClassIndex(100552);
        }

        void onCompletion(IAVPlayer iAVPlayer);

        void onPause(IAVPlayer iAVPlayer, int i2);

        void onPrepared(IAVPlayer iAVPlayer, int i2);

        void onProgress(IAVPlayer iAVPlayer, long j2);

        void onSeeked(IAVPlayer iAVPlayer, long j2, boolean z);

        void onStarted(IAVPlayer iAVPlayer, int i2);

        void onStop(IAVPlayer iAVPlayer, int i2);
    }

    public static class MetaData extends TEBundle {
        static {
            Covode.recordClassIndex(100553);
        }
    }

    static {
        Covode.recordClassIndex(100550);
    }

    MetaData getMetaData();

    float getVolume();

    boolean isLoop();

    boolean isPlaying();

    void pause();

    void prepare();

    void prepareAsync();

    void release();

    void seekTo(long j2);

    void setConnectTimeoutMs(long j2);

    void setDataSource(Context context, String str);

    void setDisplay(Surface surface);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setErrorListener(ErrorListener errorListener);

    void setEventListener(EventListener eventListener);

    void setLoop(boolean z);

    void setReconnectCounts(int i2);

    void setReconnectDelayMaxMs(long j2);

    void setVolume(float f2);

    void start();

    void stop();
}
