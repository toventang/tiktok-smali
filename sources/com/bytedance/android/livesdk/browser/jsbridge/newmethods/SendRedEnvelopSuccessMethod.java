package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;

public class SendRedEnvelopSuccessMethod extends f<Params, Object> {
    static {
        Covode.recordClassIndex(8043);
    }

    /* access modifiers changed from: package-private */
    public static final class Params {
        @c(a = "delay_time")
        String delayTime;
        @c(a = "envelope_diamond")
        String envelopeDiamond;
        @c(a = "envelope_id")
        String envelopeId;
        @c(a = "envelope_type")
        String envelopeType;
        @c(a = "left_diamond")
        String leftDiamond;

        static {
            Covode.recordClassIndex(8044);
        }

        Params() {
        }
    }

    public Object invoke(Params params, g gVar) {
        try {
            ((IWalletService) a.a(IWalletService.class)).walletCenter().a((long) Integer.parseInt(params.leftDiamond));
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("SendRedEnvelopSuccessMe", e2);
        }
        u.a().b().f();
        return null;
    }
}
