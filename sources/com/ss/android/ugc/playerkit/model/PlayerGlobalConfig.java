package com.ss.android.ugc.playerkit.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.m;

public interface PlayerGlobalConfig {
    static {
        Covode.recordClassIndex(97989);
    }

    Context context();

    boolean forceHttps();

    float getAdjustedVolume();

    double getBitrateModelThreshold();

    int getPlayerBackgroundSleepStrategy();

    int getPlayerFramesWait();

    m.e getPlayerType();

    int getPreloadType();

    int getRenderType();

    g getVideoEffectInfo();

    boolean isAsyncInit();

    boolean isCallbackCompletionFix();

    boolean isDebug();

    boolean isDynamicBitrateEnable();

    boolean isEnableBytevc1();

    boolean isEnableBytevc1BlackList();

    boolean isEnablePlayerLogV2();

    boolean isEnableSurfaceLifeCycleNotification();

    boolean isMultiPlayer();

    boolean isPrerenderSurfaceSlowSetFix();

    boolean isUseSurfaceControl();

    boolean isUseSurfaceView();

    boolean isUseVideoTextureRenderer();

    i prepareConfig();

    void setForceHttps(boolean z);

    boolean shouldForceToKeepSurfaceBelowKITKAT();
}
