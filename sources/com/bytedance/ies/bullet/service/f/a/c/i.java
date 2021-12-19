package com.bytedance.ies.bullet.service.f.a.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.p;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.service.f.a.c.i;
import h.f.b.l;

public abstract class i<T extends i<T, S>, S extends q> extends p<T, S, Uri.Builder> {
    static {
        Covode.recordClassIndex(19568);
    }

    public final Uri.Builder b() {
        return (Uri.Builder) a(Uri.Builder.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Uri.Builder builder) {
        super(builder);
        l.c(builder, "");
    }
}
