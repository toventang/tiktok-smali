package com.ss.android.ugc.aweme.ecommerce.preloader;

import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.l;
import com.bytedance.lighten.a.q;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.ecommerce.util.g;
import h.a.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final LinkedList<c> f86959a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final d f86960b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static long f86961c;

    /* renamed from: d  reason: collision with root package name */
    private static int f86962d = 4;

    /* renamed from: e  reason: collision with root package name */
    private static final C2093d f86963e = new C2093d();

    public interface b {
        static {
            Covode.recordClassIndex(54519);
        }

        void a(Collection<? extends Object> collection, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.d$d  reason: collision with other inner class name */
    public static final class C2093d implements l {
        static {
            Covode.recordClassIndex(54522);
        }

        C2093d() {
        }

        @Override // com.bytedance.lighten.a.c.l
        public final void a() {
            d.c();
        }

        @Override // com.bytedance.lighten.a.c.l
        public final void b() {
            d.c();
        }
    }

    public static final class e implements b {
        static {
            Covode.recordClassIndex(54523);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.preloader.d.b
        public final void a(Collection<? extends Object> collection, int i2) {
            h.f.b.l.d(collection, "");
        }

        e() {
        }
    }

    private d() {
    }

    /* access modifiers changed from: package-private */
    public static final class c extends PriorityQueue<a> implements b {
        boolean isResumed;
        final WeakReference<i> ref;

        static {
            Covode.recordClassIndex(54520);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof a)) {
                return super.contains(obj);
            }
            return false;
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null || (obj instanceof a)) {
                return super.remove(obj);
            }
            return false;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar) {
            super(16, AnonymousClass1.f86966a);
            h.f.b.l.d(iVar, "");
            this.ref = new WeakReference<>(iVar);
            iVar.a(new ImagePreloader$Queue$2(this));
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.preloader.d.b
        public final void a(Collection<? extends Object> collection, int i2) {
            h.f.b.l.d(collection, "");
            if (d.a()) {
                int i3 = 0;
                for (T t : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        n.a();
                    }
                    add(new a(i3 + i2, t));
                    i3 = i4;
                }
                d.b();
            }
        }
    }

    static {
        Covode.recordClassIndex(54517);
    }

    public static void c() {
        if (a()) {
            f86962d++;
            b();
        }
    }

    public static boolean a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - f86961c < 15000) {
            return false;
        }
        com.bytedance.services.apm.api.a.a(new Throwable("Called not in main thread!"));
        f86961c = uptimeMillis;
        return false;
    }

    public static void b() {
        if (a() && f86962d > 0) {
            ArrayList<Object> arrayList = new ArrayList();
            LinkedList<c> linkedList = f86959a;
            ArrayList arrayList2 = new ArrayList();
            for (T t : linkedList) {
                if (t.isResumed) {
                    arrayList2.add(t);
                }
            }
            ArrayList<c> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (true ^ ((c) obj).isEmpty()) {
                    arrayList3.add(obj);
                }
            }
            for (c cVar : arrayList3) {
                while (arrayList.size() < f86962d && (!cVar.isEmpty())) {
                    arrayList.add(((a) cVar.remove()).f86965b);
                }
                if (arrayList.size() >= f86962d) {
                    break;
                }
            }
            f86962d -= arrayList.size();
            for (Object obj2 : arrayList) {
                v a2 = g.a(obj2);
                a2.A = q.LOW;
                a2.H = f86963e;
                r.c(a2.b());
            }
        }
    }

    public static b a(i iVar) {
        T t;
        h.f.b.l.d(iVar, "");
        if (!a()) {
            return new e();
        }
        Iterator<T> it = f86959a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            h.f.b.l.d(iVar, "");
            if (t.ref.get() == iVar) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2;
        }
        c cVar = new c(iVar);
        f86959a.addFirst(cVar);
        return cVar;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f86964a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f86965b;

        static {
            Covode.recordClassIndex(54518);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f86964a == aVar.f86964a && h.f.b.l.a(this.f86965b, aVar.f86965b);
        }

        public final int hashCode() {
            int i2 = this.f86964a * 31;
            Object obj = this.f86965b;
            return i2 + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            return "Holder(priority=" + this.f86964a + ", item=" + this.f86965b + ")";
        }

        public a(int i2, Object obj) {
            h.f.b.l.d(obj, "");
            this.f86964a = i2;
            this.f86965b = obj;
        }
    }
}
