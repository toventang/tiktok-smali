package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j {
    static {
        Covode.recordClassIndex(13720);
    }

    public static final boolean b(i iVar) {
        l.d(iVar, "");
        if (iVar == i.VIDEO) {
            return true;
        }
        return false;
    }

    public static final boolean c(i iVar) {
        l.d(iVar, "");
        if (iVar != i.VIDEO) {
            return true;
        }
        return false;
    }

    public static final boolean d(i iVar) {
        l.d(iVar, "");
        if (iVar == i.AUDIO) {
            return true;
        }
        return false;
    }

    public static final boolean e(i iVar) {
        l.d(iVar, "");
        if (iVar == i.THIRD_PARTY) {
            return true;
        }
        return false;
    }

    public static final boolean f(i iVar) {
        l.d(iVar, "");
        if (iVar == i.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    public static final boolean g(i iVar) {
        l.d(iVar, "");
        if (iVar != i.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    public static final String a(i iVar) {
        l.d(iVar, "");
        int i2 = k.f23150a[iVar.ordinal()];
        if (i2 == 1) {
            return "video_live";
        }
        if (i2 == 2) {
            return "third_party";
        }
        if (i2 != 3) {
            return "";
        }
        return "screen_share";
    }
}
