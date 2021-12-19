package com.ss.android.ugc.tools.h.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.h.a.d;
import com.ss.android.ugc.tools.h.a.e;
import f.a.d.c;
import f.a.l.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public final class f<KEY, RESULT> implements Comparable<Object>, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final b<d<KEY, RESULT>> f149248a;

    /* renamed from: b  reason: collision with root package name */
    public final KEY f149249b;

    /* renamed from: c  reason: collision with root package name */
    public final int f149250c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f149251d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Future<?> f149252e;

    /* renamed from: f  reason: collision with root package name */
    private final c<KEY, h.f.a.b<Integer, z>, RESULT> f149253f;

    static {
        Covode.recordClassIndex(98294);
    }

    public final void run() {
        this.f149248a.onNext(new d<>(e.START, this.f149249b, null, null));
        try {
            this.f149248a.onNext(new d<>(e.SUCCESS, this.f149249b, this.f149253f.a(this.f149249b, new a(this)), null));
        } catch (Exception e2) {
            this.f149248a.onNext(new d<>(e.FAILED, this.f149249b, null, e2));
        } catch (Throwable th) {
            this.f149248a.onComplete();
            throw th;
        }
        this.f149248a.onComplete();
    }

    static final class a extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(98295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.f149248a.onNext(new d<>(e.START, this.this$0.f149249b, null, null, Integer.valueOf(num.intValue())));
            return z.f158842a;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l.d(obj, "");
        if (!(obj instanceof f)) {
            return 0;
        }
        boolean z = this.f149251d;
        f fVar = (f) obj;
        boolean z2 = fVar.f149251d;
        int i2 = this.f149250c;
        int i3 = fVar.f149250c;
        if (z == z2) {
            return l.a(i2, i3);
        }
        if (z) {
            return -1;
        }
        return 1;
    }

    private f(KEY key, int i2, c<KEY, h.f.a.b<Integer, z>, RESULT> cVar, boolean z) {
        l.d(cVar, "");
        this.f149249b = key;
        this.f149250c = i2;
        this.f149253f = cVar;
        this.f149251d = z;
        this.f149252e = null;
        b<d<KEY, RESULT>> bVar = new b<>();
        l.b(bVar, "");
        this.f149248a = bVar;
    }

    public /* synthetic */ f(Object obj, int i2, c cVar, boolean z, byte b2) {
        this(obj, i2, cVar, z);
    }
}
