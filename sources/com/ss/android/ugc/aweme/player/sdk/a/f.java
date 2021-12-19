package com.ss.android.ugc.aweme.player.sdk.a;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.player.sdk.b.b;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.ttvideoengine.w;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f115121a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(73991);
    }

    public static b a(w wVar) {
        l.c(wVar, "");
        switch (g.f115123b[wVar.ordinal()]) {
            case 1:
                return b.Undefine;
            case 2:
                return b.Standard;
            case 3:
                return b.High;
            case 4:
                return b.SuperHigh;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return b.ExtremelyHigh;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return b.FourK;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return b.HDR;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return b.Auto;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return b.L_Standard;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return b.H_High;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return b.TwoK;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return b.ExtremelyHigh_50F;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return b.TwoK_50F;
            case ABRConfig.ABR_SELECT_SCENE:
                return b.FourK_50F;
            case 15:
                return b.ExtremelyHigh_60F;
            case 16:
                return b.TwoK_60F;
            case 17:
                return b.FourK_60F;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return b.ExtremelyHigh_120F;
            case 19:
                return b.TwoK_120F;
            case v.U:
                return b.FourK_120F;
            default:
                return b.Undefine;
        }
    }

    public static w a(b bVar) {
        if (bVar != null) {
            switch (g.f115122a[bVar.ordinal()]) {
                case 1:
                    return w.Undefine;
                case 2:
                    return w.Standard;
                case 3:
                    return w.High;
                case 4:
                    return w.SuperHigh;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return w.ExtremelyHigh;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return w.FourK;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return w.HDR;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return w.Auto;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return w.L_Standard;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return w.H_High;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return w.TwoK;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    return w.ExtremelyHigh_50F;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return w.TwoK_50F;
                case ABRConfig.ABR_SELECT_SCENE:
                    return w.FourK_50F;
                case 15:
                    return w.ExtremelyHigh_60F;
                case 16:
                    return w.TwoK_60F;
                case 17:
                    return w.FourK_60F;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    return w.ExtremelyHigh_120F;
                case 19:
                    return w.TwoK_120F;
                case v.U:
                    return w.FourK_120F;
            }
        }
        return w.Undefine;
    }
}
