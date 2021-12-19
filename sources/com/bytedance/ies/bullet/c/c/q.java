package com.bytedance.ies.bullet.c.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class q extends Exception {
    static {
        Covode.recordClassIndex(18785);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(i iVar, Uri uri, Throwable th) {
        super(iVar.getClass().getSimpleName() + " force rejected when processing: " + uri, th);
        l.c(iVar, "");
        l.c(uri, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(i iVar, Uri uri, Throwable th, int i2, g gVar) {
        this(iVar, uri, (i2 & 4) != 0 ? null : th);
    }
}
