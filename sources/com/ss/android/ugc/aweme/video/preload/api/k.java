package com.ss.android.ugc.aweme.video.preload.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.n;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.w;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public interface k {

    public enum c {
        Waiting,
        Loading,
        Success,
        Failed,
        Cancel;

        static {
            Covode.recordClassIndex(93978);
        }
    }

    static {
        Covode.recordClassIndex(93973);
    }

    public static final class b implements k, l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143630a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final ConcurrentHashMap<String, a> f143631b = new ConcurrentHashMap<>();

        /* renamed from: c  reason: collision with root package name */
        private static final CopyOnWriteArrayList<Object> f143632c = new CopyOnWriteArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private static final CopyOnWriteArrayList<h.f.a.a<z>> f143633d = new CopyOnWriteArrayList<>();

        private b() {
        }

        @Override // com.ss.android.ugc.aweme.video.preload.api.l
        public final List<a> a() {
            Collection<a> values = f143631b.values();
            l.a((Object) values, "");
            return n.k(values);
        }

        static {
            Covode.recordClassIndex(93977);
        }

        @Override // com.ss.android.ugc.aweme.video.preload.api.l
        public final void a(a aVar) {
            l.c(aVar, "");
            Iterator<T> it = f143632c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }

        @Override // com.ss.android.ugc.aweme.video.preload.api.l
        public final void a(h.f.a.a<z> aVar) {
            l.c(aVar, "");
            f143633d.add(aVar);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f143623a;

        /* renamed from: b  reason: collision with root package name */
        public final int f143624b;

        /* renamed from: c  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.video.preload.n f143625c;

        /* renamed from: d  reason: collision with root package name */
        public final h.f.a.b<i, Boolean> f143626d;

        /* renamed from: e  reason: collision with root package name */
        public final m<a, c, z> f143627e;

        static {
            Covode.recordClassIndex(93974);
        }

        public final String toString() {
            return "IdlePreloadTask(model=" + this.f143623a + ", size=" + this.f143624b + ", type=" + this.f143625c + ", enable=" + this.f143626d + ", listener=" + this.f143627e + ")";
        }

        public final int hashCode() {
            return (this.f143623a.hashCode() * 31) + this.f143624b;
        }

        public /* synthetic */ a(i iVar) {
            this(iVar, -1, n.c.f143761b, AnonymousClass1.f143628a, AnonymousClass2.f143629a);
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!l.a(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                a aVar = (a) obj;
                if (!(!l.a(this.f143623a, aVar.f143623a)) && this.f143624b == aVar.f143624b && !(!l.a(this.f143625c, aVar.f143625c))) {
                    return true;
                }
                return false;
            }
            throw new w("null cannot be cast to non-null type");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.playerkit.simapicommon.a.i, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.video.preload.api.k$a, ? super com.ss.android.ugc.aweme.video.preload.api.k$c, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        private a(i iVar, int i2, com.ss.android.ugc.aweme.video.preload.n nVar, h.f.a.b<? super i, Boolean> bVar, m<? super a, ? super c, z> mVar) {
            l.c(iVar, "");
            l.c(nVar, "");
            l.c(bVar, "");
            l.c(mVar, "");
            this.f143623a = iVar;
            this.f143624b = i2;
            this.f143625c = nVar;
            this.f143626d = bVar;
            this.f143627e = mVar;
        }

        public static /* synthetic */ a a(a aVar, i iVar, int i2, com.ss.android.ugc.aweme.video.preload.n nVar, h.f.a.b bVar, m mVar, int i3) {
            m mVar2 = mVar;
            i iVar2 = iVar;
            int i4 = i2;
            com.ss.android.ugc.aweme.video.preload.n nVar2 = nVar;
            h.f.a.b bVar2 = bVar;
            if ((i3 & 1) != 0) {
                iVar2 = aVar.f143623a;
            }
            if ((i3 & 2) != 0) {
                i4 = aVar.f143624b;
            }
            if ((i3 & 4) != 0) {
                nVar2 = aVar.f143625c;
            }
            if ((i3 & 8) != 0) {
                bVar2 = aVar.f143626d;
            }
            if ((i3 & 16) != 0) {
                mVar2 = aVar.f143627e;
            }
            l.c(iVar2, "");
            l.c(nVar2, "");
            l.c(bVar2, "");
            l.c(mVar2, "");
            return new a(iVar2, i4, nVar2, bVar2, mVar2);
        }
    }
}
