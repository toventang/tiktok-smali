package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.h;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.p;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final b f50430a = new y();

    public interface a<R extends p, T> {
        static {
            Covode.recordClassIndex(31420);
        }

        T a(R r);
    }

    public interface b {
        static {
            Covode.recordClassIndex(31421);
        }

        e a(Status status);
    }

    static {
        Covode.recordClassIndex(31419);
    }

    public static <R extends p> h<Void> a(k<R> kVar) {
        return a(kVar, new ab());
    }

    public static <R extends p, T> h<T> a(k<R> kVar, a<R, T> aVar) {
        b bVar = f50430a;
        i iVar = new i();
        kVar.a(new aa(kVar, iVar, aVar, bVar));
        return iVar.f49902a;
    }
}
