package com.bytedance;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a<T> extends k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f.a.l.c<T> f6411a;

    /* renamed from: b  reason: collision with root package name */
    private T f6412b;

    /* renamed from: c  reason: collision with root package name */
    private final h f6413c = i.a((h.f.a.a) C0086a.f6414a);

    static {
        Covode.recordClassIndex(3087);
    }

    @Override // com.bytedance.als.g
    public final T a() {
        return this.f6412b;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f6422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f6423b;

        static {
            Covode.recordClassIndex(3090);
        }

        c(a aVar, Object obj) {
            this.f6422a = aVar;
            this.f6423b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.a */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            this.f6422a.a(this.f6423b);
        }
    }

    /* renamed from: com.bytedance.a$a  reason: collision with other inner class name */
    static final class C0086a extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0086a f6414a = new C0086a();

        static {
            Covode.recordClassIndex(3088);
        }

        C0086a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public a() {
        f.a.l.c<T> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        this.f6411a = cVar;
    }

    static final class b<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.m f6415a;

        static {
            Covode.recordClassIndex(3089);
        }

        b(com.bytedance.als.m mVar) {
            this.f6415a = mVar;
        }

        @Override // f.a.d.f
        public final void accept(T t) {
            this.f6415a.onChanged(t);
        }
    }

    @Override // com.bytedance.als.g, com.bytedance.als.k
    public final void a(T t) {
        this.f6412b = t;
        this.f6411a.onNext(t);
    }

    @Override // com.bytedance.als.g
    public final void a(com.bytedance.als.m<T> mVar) {
        l.d(mVar, "");
        throw new RuntimeException("user  lifecycleOwner instead");
    }

    @Override // com.bytedance.als.g, com.bytedance.als.k
    public final void b(T t) {
        ((Handler) this.f6413c.getValue()).post(new c(this, t));
    }

    @Override // com.bytedance.als.g
    public final void a(androidx.lifecycle.m mVar, com.bytedance.als.m<T> mVar2) {
        l.d(mVar, "");
        l.d(mVar2, "");
        androidx.lifecycle.i lifecycle = mVar.getLifecycle();
        l.b(lifecycle, "");
        if (lifecycle.a() != i.b.DESTROYED) {
            mVar.getLifecycle().a(new RxLiveEvent$observe$1(this.f6411a.d(new b(mVar2))));
        }
    }
}
