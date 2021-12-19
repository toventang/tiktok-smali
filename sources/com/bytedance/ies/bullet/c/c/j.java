package com.bytedance.ies.bullet.c.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.as;
import h.f.a.b;
import h.f.b.l;
import h.z;

public interface j {
    static {
        Covode.recordClassIndex(18774);
    }

    void a(i iVar);

    void a(i iVar, Uri uri);

    void a(i iVar, Uri uri, b<? super Uri, z> bVar, b<? super Throwable, z> bVar2);

    void a(i iVar, Throwable th);

    public static final class a {
        static {
            Covode.recordClassIndex(18775);
        }

        public static void a(i iVar) {
            l.c(iVar, "");
            throw new as("An operation is not implemented");
        }

        public static void b(i iVar) {
            l.c(iVar, "");
            throw new as("An operation is not implemented");
        }

        public static void a(i iVar, Uri uri) {
            l.c(iVar, "");
            l.c(uri, "");
            throw new as("An operation is not implemented");
        }

        public static void a(i iVar, Uri uri, b<? super Uri, z> bVar, b<? super Throwable, z> bVar2) {
            l.c(iVar, "");
            l.c(uri, "");
            l.c(bVar, "");
            l.c(bVar2, "");
            bVar.invoke(uri);
        }
    }
}
