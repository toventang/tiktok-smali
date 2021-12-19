package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.bj;
import com.bytedance.android.livesdk.model.bx;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import java.util.ArrayList;

public final class aq implements b<Prop> {
    static {
        Covode.recordClassIndex(9950);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ Prop a(f fVar) {
        return b(fVar);
    }

    public static Prop b(f fVar) {
        Prop prop = new Prop();
        prop.gifts = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        prop.primaryEffectId = (int) g.b(fVar);
                        break;
                    case 2:
                        prop.nextExpire = g.b(fVar);
                        break;
                    case 3:
                        prop.description = fVar.d();
                        break;
                    case 4:
                        prop.id = g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        prop.manual = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        prop.diamond = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        prop.reddotTip = g.a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        prop.icon = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        prop.count = fVar.e();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        prop.name = fVar.d();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        prop.gift = bx.b(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        prop.labelIcon = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        prop.isFragment = Boolean.valueOf(g.a(fVar));
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        prop.fragmentsCompoundCount = Long.valueOf(g.b(fVar));
                        break;
                    case 15:
                        prop.isAwemeFreeGift = (int) g.b(fVar);
                        break;
                    case 16:
                        prop.diamondLabel = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 17:
                        prop.banner = bj.b(fVar);
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                        prop.propType = g.b(fVar);
                        break;
                    case 19:
                        prop.gifts.add(ao.b(fVar));
                        break;
                    case v.U /*{ENCODED_INT: 20}*/:
                        prop.schemeUrl = fVar.d();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return prop;
            }
        }
    }
}
