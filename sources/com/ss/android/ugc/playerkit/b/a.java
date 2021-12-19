package com.ss.android.ugc.playerkit.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.ss.android.ugc.playerkit.model.g;
import com.ss.android.ugc.playerkit.model.i;
import com.ss.android.ugc.playerkit.model.m;

public final class a implements PlayerGlobalConfig {

    /* renamed from: a  reason: collision with root package name */
    public static Context f148653a;

    static {
        Covode.recordClassIndex(97969);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean forceHttps() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final float getAdjustedVolume() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final double getBitrateModelThreshold() {
        return -1.0d;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerBackgroundSleepStrategy() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerFramesWait() {
        return 1;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPreloadType() {
        return 2;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getRenderType() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final g getVideoEffectInfo() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isAsyncInit() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isCallbackCompletionFix() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDynamicBitrateEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1BlackList() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnablePlayerLogV2() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableSurfaceLifeCycleNotification() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isMultiPlayer() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isPrerenderSurfaceSlowSetFix() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceControl() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceView() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseVideoTextureRenderer() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final void setForceHttps(boolean z) {
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean shouldForceToKeepSurfaceBelowKITKAT() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final Context context() {
        return f148653a;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final m.e getPlayerType() {
        return m.e.TT;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final i prepareConfig() {
        return new i() {
            /* class com.ss.android.ugc.playerkit.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(97970);
            }

            @Override // com.ss.android.ugc.playerkit.model.i
            public final String getFirstFrameKey() {
                return "first_frame_time";
            }

            @Override // com.ss.android.ugc.playerkit.model.i
            public final String getPrepareKey() {
                return "prepare_time";
            }

            @Override // com.ss.android.ugc.playerkit.model.i
            public final boolean isLoop() {
                return true;
            }

            @Override // com.ss.android.ugc.playerkit.model.i
            public final boolean isPlayLoop() {
                return true;
            }
        };
    }
}
