package com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.v;
import h.f.b.l;

public final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final i f131885a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(86414);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.a
    public final boolean a(Context context) {
        l.d(context, "");
        return a(context, false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.a
    public final void a(e eVar, v.a aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        c.C.b().a(eVar, aVar, "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean a(Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        l.d(context, "");
        boolean a2 = gs.a();
        if (z || c.D.c().b(context) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a2 || c.D.c().a(context) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c.D.c().c(context) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }
}
