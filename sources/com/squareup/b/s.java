package com.squareup.b;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.squareup.a.d;
import com.squareup.a.t;
import com.squareup.a.v;
import com.squareup.a.x;
import com.squareup.a.y;
import com.squareup.b.j;
import java.io.File;

public final class s implements j {

    /* renamed from: a  reason: collision with root package name */
    public final t f58072a;

    static {
        Covode.recordClassIndex(36075);
    }

    public s(Context context) {
        this(ae.b(context));
    }

    private s(t tVar) {
        this.f58072a = tVar;
    }

    private s(File file) {
        this(file, ae.a(file));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private s(java.io.File r3, long r4) {
        /*
            r2 = this;
            com.squareup.a.t r1 = new com.squareup.a.t
            r1.<init>()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.a(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.b(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.c(r0)
            r2.<init>(r1)
            com.squareup.a.t r1 = r2.f58072a     // Catch:{ IOException -> 0x0021 }
            com.squareup.a.c r0 = new com.squareup.a.c     // Catch:{ IOException -> 0x0021 }
            r0.<init>(r3, r4)     // Catch:{ IOException -> 0x0021 }
            r1.a(r0)     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.b.s.<init>(java.io.File, long):void");
    }

    @Override // com.squareup.b.j
    public final j.a a(Uri uri, int i2) {
        d dVar;
        boolean z;
        if (i2 == 0) {
            dVar = null;
        } else if (q.isOfflineOnly(i2)) {
            dVar = d.f57812b;
        } else {
            d.a aVar = new d.a();
            if (!q.shouldReadFromDiskCache(i2)) {
                aVar.a();
            }
            if (!q.shouldWriteToDiskCache(i2)) {
                aVar.b();
            }
            dVar = aVar.c();
        }
        v.a a2 = new v.a().a(uri.toString());
        if (dVar != null) {
            a2.a(dVar);
        }
        x a3 = this.f58072a.a(a2.a()).a();
        int i3 = a3.f57933c;
        if (i3 < 300) {
            if (a3.f57939i != null) {
                z = true;
            } else {
                z = false;
            }
            y yVar = a3.f57937g;
            return new j.a(yVar.c(), z, yVar.a());
        }
        a3.f57937g.close();
        throw new j.b(i3 + " " + a3.f57934d, i2, i3);
    }
}
