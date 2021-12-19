package com.bytedance.android.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface b {

    public interface a {
        static {
            Covode.recordClassIndex(3284);
        }

        void a(int i2, int i3);

        void a(int i2, String str);

        void a(Exception exc);

        void a(Object obj);

        void a(String str);

        void k();

        void l();

        void m();

        void n();

        void o();
    }

    static {
        Covode.recordClassIndex(3283);
    }

    void changeSRSupportScene(boolean z);

    long getAudioLostFocusTime();

    int getDecodeStatus();

    d getLogger();

    String getMediaErrorMessage();

    long getStartTime();

    void getVideoSize(int[] iArr);

    boolean isVideoHorizontal();

    void onBackground();

    void onForeground();

    boolean pipResumePlay();

    void recycle();

    void setAnchorInteractMode(boolean z);

    void setEnterRoomScene(String str);

    void setMute(boolean z);

    void setReusePlayer(boolean z, String str);

    void setScreenOrientation(boolean z);

    void setSeiOpen(boolean z);

    boolean start();

    boolean startWithNewLivePlayer();

    void stop(boolean z);

    void stopWhenJoinInteract(Context context);

    void stopWhenPlayingOther(Context context);

    void switchResolution(String str);

    boolean tryResumePlay();

    void tryToStartAudioDevice();

    void tryToUploadFirstScreenTime();
}
