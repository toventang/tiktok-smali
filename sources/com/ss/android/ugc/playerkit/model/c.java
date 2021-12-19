package com.ss.android.ugc.playerkit.model;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.b.a;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.model.m;

public final class c implements PlayerGlobalConfig {

    /* renamed from: a  reason: collision with root package name */
    public static c f148702a = new c();

    /* renamed from: b  reason: collision with root package name */
    public PlayerGlobalConfig f148703b;

    /* renamed from: c  reason: collision with root package name */
    private PlayerGlobalConfig f148704c = new a();

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final void setForceHttps(boolean z) {
    }

    static {
        Covode.recordClassIndex(97992);
    }

    private void a() {
        if (this.f148703b == null) {
            this.f148703b = (PlayerGlobalConfig) InjectedConfigManager.getConfig(PlayerGlobalConfig.class);
        }
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final float getAdjustedVolume() {
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getAdjustedVolume();
        }
        return this.f148704c.getAdjustedVolume();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final Context context() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.context();
        }
        return this.f148704c.context();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean forceHttps() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.forceHttps();
        }
        return this.f148704c.forceHttps();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final double getBitrateModelThreshold() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getBitrateModelThreshold();
        }
        return this.f148704c.getBitrateModelThreshold();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerBackgroundSleepStrategy() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerBackgroundSleepStrategy();
        }
        return this.f148704c.getPlayerBackgroundSleepStrategy();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerFramesWait() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerFramesWait();
        }
        return this.f148704c.getPlayerFramesWait();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final m.e getPlayerType() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerType();
        }
        return this.f148704c.getPlayerType();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPreloadType() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPreloadType();
        }
        return this.f148704c.getPreloadType();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getRenderType() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getRenderType();
        }
        return this.f148704c.getRenderType();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final g getVideoEffectInfo() {
        a();
        try {
            PlayerGlobalConfig playerGlobalConfig = this.f148703b;
            if (playerGlobalConfig != null) {
                return playerGlobalConfig.getVideoEffectInfo();
            }
            return this.f148704c.getVideoEffectInfo();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isAsyncInit() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isAsyncInit();
        }
        return this.f148704c.isAsyncInit();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isCallbackCompletionFix() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isCallbackCompletionFix();
        }
        return this.f148704c.isCallbackCompletionFix();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDynamicBitrateEnable() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isDynamicBitrateEnable();
        }
        return this.f148704c.isDynamicBitrateEnable();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableBytevc1();
        }
        return this.f148704c.isEnableBytevc1();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1BlackList() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableBytevc1BlackList();
        }
        return this.f148704c.isEnableBytevc1BlackList();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnablePlayerLogV2() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnablePlayerLogV2();
        }
        return this.f148704c.isEnablePlayerLogV2();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableSurfaceLifeCycleNotification() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableSurfaceLifeCycleNotification();
        }
        return this.f148704c.isEnableSurfaceLifeCycleNotification();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isMultiPlayer() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isMultiPlayer();
        }
        return this.f148704c.isMultiPlayer();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isPrerenderSurfaceSlowSetFix() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isPrerenderSurfaceSlowSetFix();
        }
        return this.f148704c.isPrerenderSurfaceSlowSetFix();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceControl() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig == null) {
            return this.f148704c.isUseSurfaceControl();
        }
        if (!playerGlobalConfig.isUseSurfaceControl() || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceView() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isUseSurfaceView();
        }
        return this.f148704c.isUseSurfaceView();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseVideoTextureRenderer() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isUseVideoTextureRenderer();
        }
        return this.f148704c.isUseVideoTextureRenderer();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final i prepareConfig() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.prepareConfig();
        }
        return this.f148704c.prepareConfig();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean shouldForceToKeepSurfaceBelowKITKAT() {
        a();
        PlayerGlobalConfig playerGlobalConfig = this.f148703b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.shouldForceToKeepSurfaceBelowKITKAT();
        }
        return this.f148704c.shouldForceToKeepSurfaceBelowKITKAT();
    }
}
