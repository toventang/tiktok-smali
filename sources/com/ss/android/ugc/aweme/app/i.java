package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.newmedia.a.a;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f66805a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(41125);
    }

    public static final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        String f2 = d.f();
        if (f2 == null) {
            f2 = "1.0";
        }
        sb.append(f2);
        sb.append(" Build ").append(d.s).append("_");
        sb.append(a.a(d.a()).a("release_build", ""));
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}
