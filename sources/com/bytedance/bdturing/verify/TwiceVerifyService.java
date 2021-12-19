package com.bytedance.bdturing.verify;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.bdturing.b;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;
import com.bytedance.bdturing.twiceverify.c;
import com.bytedance.bdturing.verify.a.a;
import com.bytedance.bdturing.verify.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class TwiceVerifyService implements a {
    static {
        Covode.recordClassIndex(15611);
    }

    @Override // com.bytedance.bdturing.verify.a
    public boolean isProcess(int i2) {
        switch (i2) {
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                return true;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
            default:
                return false;
        }
    }

    @Override // com.bytedance.bdturing.verify.a
    public boolean execute(a aVar, final b bVar) {
        if (c.a().f26560a == null) {
            return false;
        }
        c a2 = c.a();
        a2.f26561b = new c.a() {
            /* class com.bytedance.bdturing.verify.TwiceVerifyService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15612);
            }

            @Override // com.bytedance.bdturing.twiceverify.c.a
            public final void a() {
                bVar.b(0);
            }

            @Override // com.bytedance.bdturing.twiceverify.c.a
            public final void a(int i2) {
                bVar.a(i2);
            }
        };
        if (!(aVar instanceof g) && !(aVar instanceof com.bytedance.bdturing.verify.a.c)) {
            a2.f26563d = aVar;
            Intent intent = new Intent();
            Activity activity = aVar.f26573a;
            intent.setClass(activity, TwiceVerifyWebActivity.class);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }
        return true;
    }
}
