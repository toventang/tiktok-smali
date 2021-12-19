package com.facebook.drawee.c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import com.facebook.d.c;
import com.facebook.d.f;
import com.facebook.d.g;
import com.facebook.drawee.c.b;
import com.facebook.drawee.h.d;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public abstract class b<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements d {
    private static final d<Object> n = new c<Object>() {
        /* class com.facebook.drawee.c.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28750);
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };
    private static final NullPointerException o = new NullPointerException("No image request was specified!");
    private static final AtomicLong r = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final Context f47313a;

    /* renamed from: b  reason: collision with root package name */
    public Object f47314b;

    /* renamed from: c  reason: collision with root package name */
    public REQUEST f47315c;

    /* renamed from: d  reason: collision with root package name */
    public REQUEST f47316d;

    /* renamed from: e  reason: collision with root package name */
    public REQUEST[] f47317e;

    /* renamed from: f  reason: collision with root package name */
    public k<c<IMAGE>> f47318f;

    /* renamed from: g  reason: collision with root package name */
    public d<? super INFO> f47319g;

    /* renamed from: h  reason: collision with root package name */
    public e f47320h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f47321i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f47322j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f47323k;

    /* renamed from: l  reason: collision with root package name */
    public String f47324l;

    /* renamed from: m  reason: collision with root package name */
    public com.facebook.drawee.h.a f47325m;
    private final Set<d> p;
    private boolean q;

    /* access modifiers changed from: protected */
    public abstract c<IMAGE> a(com.facebook.drawee.h.a aVar, REQUEST request, Object obj, a aVar2);

    /* access modifiers changed from: protected */
    public abstract a a();

    protected static String d() {
        return String.valueOf(r.getAndIncrement());
    }

    static {
        Covode.recordClassIndex(28749);
    }

    public final void b() {
        this.f47314b = null;
        this.f47315c = null;
        this.f47316d = null;
        this.f47317e = null;
        this.q = true;
        this.f47319g = null;
        this.f47320h = null;
        this.f47321i = false;
        this.f47322j = false;
        this.f47325m = null;
        this.f47324l = null;
    }

    public enum a {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE;

        static {
            Covode.recordClassIndex(28752);
        }
    }

    /* renamed from: c */
    public final a e() {
        boolean z;
        REQUEST request;
        boolean z2 = false;
        if (this.f47317e == null || this.f47315c == null) {
            z = true;
        } else {
            z = false;
        }
        i.b(z, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f47318f == null || (this.f47317e == null && this.f47315c == null && this.f47316d == null)) {
            z2 = true;
        }
        i.b(z2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        if (this.f47315c == null && this.f47317e == null && (request = this.f47316d) != null) {
            this.f47315c = request;
            this.f47316d = null;
        }
        com.facebook.imagepipeline.p.b.a();
        a a2 = a();
        a2.o = this.f47323k;
        a2.p = this.f47324l;
        a2.f47304h = this.f47320h;
        if (this.f47321i) {
            if (a2.f47302f == null) {
                a2.f47302f = new com.facebook.drawee.b.c();
            }
            a2.f47302f.f47294a = this.f47321i;
            if (a2.f47303g == null) {
                a2.f47303g = new com.facebook.drawee.g.a(this.f47313a);
                if (a2.f47303g != null) {
                    a2.f47303g.f47485a = a2;
                }
            }
        }
        Set<d> set = this.p;
        if (set != null) {
            for (d dVar : set) {
                a2.a(dVar);
            }
        }
        d<? super INFO> dVar2 = this.f47319g;
        if (dVar2 != null) {
            a2.a((d) dVar2);
        }
        if (this.f47322j) {
            a2.a((d) n);
        }
        com.facebook.imagepipeline.p.b.a();
        return a2;
    }

    public final BUILDER a(REQUEST[] requestArr) {
        boolean z;
        if (requestArr == null || requestArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z, "No requests specified!");
        this.f47317e = requestArr;
        this.q = true;
        return this;
    }

    @Override // com.facebook.drawee.h.d
    public final /* bridge */ /* synthetic */ d a(com.facebook.drawee.h.a aVar) {
        this.f47325m = aVar;
        return this;
    }

    public b(Context context, Set<d> set) {
        this.f47313a = context;
        this.p = set;
        b();
    }

    /* access modifiers changed from: protected */
    public final k<c<IMAGE>> a(com.facebook.drawee.h.a aVar, String str) {
        k<c<IMAGE>> a2;
        k<c<IMAGE>> kVar = this.f47318f;
        if (kVar != null) {
            return kVar;
        }
        REQUEST request = this.f47315c;
        if (request != null) {
            a2 = a(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f47317e;
            if (requestArr != null) {
                boolean z = this.q;
                ArrayList arrayList = new ArrayList(requestArr.length * 2);
                if (z) {
                    for (REQUEST request2 : requestArr) {
                        arrayList.add(a(aVar, str, (Object) request2, a.BITMAP_MEMORY_CACHE));
                    }
                }
                for (REQUEST request3 : requestArr) {
                    arrayList.add(a(aVar, str, request3));
                }
                a2 = f.a(arrayList);
            }
            return new k<c<T>>(o) {
                /* class com.facebook.d.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Throwable f47191a;

                static {
                    Covode.recordClassIndex(28710);
                }

                @Override // com.facebook.common.d.k
                public final /* synthetic */ Object b() {
                    return d.a(this.f47191a);
                }

                {
                    this.f47191a = r1;
                }
            };
        }
        if (a2 != null) {
            if (this.f47316d == null) {
                return a2;
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(a2);
            arrayList2.add(a(aVar, str, this.f47316d));
            return new g(arrayList2);
        }
        return new k<c<T>>(o) {
            /* class com.facebook.d.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Throwable f47191a;

            static {
                Covode.recordClassIndex(28710);
            }

            @Override // com.facebook.common.d.k
            public final /* synthetic */ Object b() {
                return d.a(this.f47191a);
            }

            {
                this.f47191a = r1;
            }
        };
    }

    private k<c<IMAGE>> a(com.facebook.drawee.h.a aVar, String str, REQUEST request) {
        return a(aVar, str, (Object) request, a.FULL_FETCH);
    }

    private k<c<IMAGE>> a(final com.facebook.drawee.h.a aVar, final String str, final REQUEST request, final a aVar2) {
        final Object obj = this.f47314b;
        return new k<c<IMAGE>>() {
            /* class com.facebook.drawee.c.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(28751);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.facebook.drawee.c.b */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.common.d.k
            public final /* synthetic */ Object b() {
                return b.this.a(aVar, request, obj, aVar2);
            }

            public final String toString() {
                return h.a(this).a("request", request.toString()).toString();
            }
        };
    }
}
