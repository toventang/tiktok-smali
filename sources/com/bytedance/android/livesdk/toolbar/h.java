package com.bytedance.android.livesdk.toolbar;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.p.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;

public final class h {
    static {
        Covode.recordClassIndex(12807);
    }

    public static final Integer a(l lVar) {
        int i2;
        h.f.b.l.d(lVar, "");
        switch (i.f21723a[lVar.ordinal()]) {
            case 1:
                if (y.g()) {
                    i2 = 2131234540;
                } else {
                    i2 = 2131234541;
                }
                return Integer.valueOf(i2);
            case 2:
                return 2131234562;
            case 3:
                return 2131234509;
            case 4:
                return 2131234596;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return 2131234429;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return 2131234654;
            default:
                return null;
        }
    }

    public static final CharSequence b(l lVar) {
        h.f.b.l.d(lVar, "");
        switch (i.f21724b[lVar.ordinal()]) {
            case 1:
                return y.a((int) R.string.edm);
            case 2:
                return y.a((int) R.string.edo);
            case 3:
                return y.a((int) R.string.edk);
            case 4:
                return y.a((int) R.string.edf);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return y.a((int) R.string.edh);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return y.a((int) R.string.edg);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return y.a((int) R.string.edl);
            default:
                return null;
        }
    }

    public static final Integer c(l lVar) {
        h.f.b.l.d(lVar, "");
        switch (i.f21725c[lVar.ordinal()]) {
            case 1:
                return Integer.valueOf((int) R.layout.bg7);
            case 2:
                return Integer.valueOf((int) R.layout.bg6);
            case 3:
                return Integer.valueOf((int) R.layout.bg2);
            case 4:
                return Integer.valueOf((int) R.layout.bg9);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return Integer.valueOf((int) R.layout.bg0);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return Integer.valueOf((int) R.layout.bfy);
            default:
                return null;
        }
    }
}
