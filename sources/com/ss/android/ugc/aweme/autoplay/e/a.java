package com.ss.android.ugc.aweme.autoplay.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.utils.bc;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<b.d> f67463a;

    /* renamed from: b  reason: collision with root package name */
    public static int f67464b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final a f67465c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final h f67466d = i.a((h.f.a.a) C1520a.f67467a);

    public static bc<WeakReference<b.d>> a() {
        return (bc) f67466d.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.e.a$a  reason: collision with other inner class name */
    static final class C1520a extends m implements h.f.a.a<bc<WeakReference<b.d>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1520a f67467a = new C1520a();

        static {
            Covode.recordClassIndex(41536);
        }

        C1520a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ bc<WeakReference<b.d>> invoke() {
            return new bc();
        }
    }

    static {
        Covode.recordClassIndex(41535);
    }

    public static void b() {
        for (WeakReference<b.d> weakReference : a().a()) {
            b.d dVar = weakReference.get();
            if (dVar != null) {
                dVar.y();
            }
        }
    }

    public static void c() {
        for (WeakReference<b.d> weakReference : a().a()) {
            b.d dVar = weakReference.get();
            if (dVar != null) {
                dVar.z();
            }
        }
    }

    public static void d(b.d dVar) {
        l.d(dVar, "");
        dVar.hashCode();
        f67463a = new WeakReference<>(dVar);
    }

    public static void a(b.d dVar) {
        l.d(dVar, "");
        dVar.hashCode();
        for (WeakReference<b.d> weakReference : a().a()) {
            if (l.a(weakReference.get(), dVar)) {
                return;
            }
        }
        dVar.hashCode();
        a().a(new WeakReference<>(dVar));
    }

    public static void b(b.d dVar) {
        WeakReference<b.d> weakReference;
        l.d(dVar, "");
        dVar.hashCode();
        Iterator<WeakReference<b.d>> it = a().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                weakReference = null;
                break;
            }
            weakReference = it.next();
            if (l.a(weakReference.get(), dVar)) {
                break;
            }
        }
        dVar.hashCode();
        a().b(weakReference);
    }

    public static void c(b.d dVar) {
        for (WeakReference<b.d> weakReference : a().a()) {
            b.d dVar2 = weakReference.get();
            if ((!l.a(dVar2, dVar)) && dVar2 != null) {
                dVar2.y();
            }
        }
    }
}
