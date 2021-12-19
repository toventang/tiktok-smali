package com.bytedance.ies.dmt.ui.widget.util;

import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;
import h.p;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f33803a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(20065);
    }

    private static String a(int i2) {
        if (i2 == 1) {
            return d.f33795a;
        }
        if (i2 == 2) {
            return d.f33801g;
        }
        if (i2 != 3) {
            return null;
        }
        return d.f33796b;
    }

    private static p<Float, Float> b(int i2) {
        Float valueOf = Float.valueOf(13.0f);
        Float valueOf2 = Float.valueOf(14.0f);
        Float valueOf3 = Float.valueOf(15.0f);
        Float valueOf4 = Float.valueOf(20.0f);
        Float valueOf5 = Float.valueOf(24.0f);
        Float valueOf6 = Float.valueOf(17.0f);
        switch (i2) {
            case 1:
                return new p<>(valueOf5, Float.valueOf(28.0f));
            case 2:
                return new p<>(valueOf4, valueOf5);
            case 3:
                return new p<>(valueOf6, valueOf4);
            case 4:
                return new p<>(valueOf3, Float.valueOf(18.0f));
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new p<>(valueOf2, valueOf6);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new p<>(valueOf, valueOf6);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return new p<>(Float.valueOf(12.0f), valueOf3);
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return new p<>(Float.valueOf(11.0f), valueOf2);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return new p<>(Float.valueOf(10.0f), valueOf);
            default:
                return null;
        }
    }

    public static void c(DmtTextView dmtTextView, int i2) {
        l.d(dmtTextView, "");
        String a2 = a(i2);
        if (a2 != null) {
            dmtTextView.setFontType(a2);
        }
    }

    public static void b(DmtTextView dmtTextView, int i2) {
        l.d(dmtTextView, "");
        if (i2 > 10 && i2 < 100) {
            a(dmtTextView, i2 / 10);
            c(dmtTextView, i2 % 10);
        }
    }

    public static void a(DmtTextView dmtTextView, int i2) {
        l.d(dmtTextView, "");
        p<Float, Float> b2 = b(i2);
        if (b2 != null) {
            dmtTextView.setTextSize(1, b2.getFirst().floatValue());
            dmtTextView.setLineHeight((int) n.b(dmtTextView.getContext(), b2.getSecond().floatValue()));
        }
    }
}
