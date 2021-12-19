package com.he.lynx.player;

import android.view.Surface;
import com.bytedance.covode.number.Covode;

public interface IHeliumPlayer {

    public interface HeliumPlayerFactory {
        static {
            Covode.recordClassIndex(34221);
        }

        IHeliumPlayer create();
    }

    public interface IHeliumPlayerListener {
        static {
            Covode.recordClassIndex(34222);
        }

        void onCompletion(IHeliumPlayer iHeliumPlayer);

        boolean onError(IHeliumPlayer iHeliumPlayer, Object obj);

        void onPrepared(IHeliumPlayer iHeliumPlayer);

        void onRenderStart(IHeliumPlayer iHeliumPlayer);

        void onSeekComplete(IHeliumPlayer iHeliumPlayer);
    }

    static {
        Covode.recordClassIndex(34220);
    }

    int getCurrentPosition();

    int getDuration();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying();

    void pause();

    void play();

    void prepare();

    void release();

    void seekTo(int i2);

    void setDataSource(String str);

    void setListener(IHeliumPlayerListener iHeliumPlayerListener);

    void setLooping(boolean z);

    void setSurface(Surface surface);

    void setVolume(float f2, float f3);

    void stop();
}
