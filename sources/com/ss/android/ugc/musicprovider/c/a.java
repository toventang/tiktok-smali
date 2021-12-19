package com.ss.android.ugc.musicprovider.c;

import b.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class a implements com.ss.android.ugc.aweme.music.service.c {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.music.service.c f148543a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f148544b;

    /* renamed from: c  reason: collision with root package name */
    private final String f148545c;

    static {
        Covode.recordClassIndex(97916);
    }

    public a(byte b2) {
        this();
    }

    private /* synthetic */ a() {
        this("");
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$a  reason: collision with other inner class name */
    static final class CallableC4014a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148546a;

        static {
            Covode.recordClassIndex(97917);
        }

        CallableC4014a(a aVar) {
            this.f148546a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.music.service.c cVar = this.f148546a.f148543a;
            if (cVar == null) {
                return null;
            }
            cVar.b();
            return z.f158842a;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148547a;

        static {
            Covode.recordClassIndex(97918);
        }

        b(a aVar) {
            this.f148547a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.music.service.c cVar = this.f148547a.f148543a;
            if (cVar == null) {
                return null;
            }
            cVar.a();
            return z.f158842a;
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148552a;

        static {
            Covode.recordClassIndex(97921);
        }

        e(a aVar) {
            this.f148552a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.music.service.c cVar = this.f148552a.f148543a;
            if (cVar == null) {
                return null;
            }
            cVar.d();
            return z.f158842a;
        }
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.musicprovider.interfaces.a f148554b;

        static {
            Covode.recordClassIndex(97922);
        }

        f(a aVar, com.ss.android.ugc.musicprovider.interfaces.a aVar2) {
            this.f148553a = aVar;
            this.f148554b = aVar2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.music.service.c cVar = this.f148553a.f148543a;
            if (cVar == null) {
                return null;
            }
            cVar.a(this.f148554b);
            return z.f158842a;
        }
    }

    static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.musicprovider.interfaces.b f148556b;

        static {
            Covode.recordClassIndex(97923);
        }

        g(a aVar, com.ss.android.ugc.musicprovider.interfaces.b bVar) {
            this.f148555a = aVar;
            this.f148556b = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.music.service.c cVar = this.f148555a.f148543a;
            if (cVar == null) {
                return null;
            }
            cVar.a(this.f148556b);
            return z.f158842a;
        }
    }

    static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.musicprovider.interfaces.c f148558b;

        static {
            Covode.recordClassIndex(97924);
        }

        h(a aVar, com.ss.android.ugc.musicprovider.interfaces.c cVar) {
            this.f148557a = aVar;
            this.f148558b = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.music.service.c cVar = this.f148557a.f148543a;
            if (cVar == null) {
                return null;
            }
            cVar.a(this.f148558b);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a() {
        i.b(new b(this), this.f148544b);
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void b() {
        i.b(new CallableC4014a(this), this.f148544b);
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void c() {
        i.b(new d(this), this.f148544b);
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void d() {
        i.b(new e(this), this.f148544b);
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148548a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.musicprovider.a.a f148549b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f148550c;

        static {
            Covode.recordClassIndex(97919);
        }

        c(a aVar, com.ss.android.ugc.musicprovider.a.a aVar2, boolean z) {
            this.f148548a = aVar;
            this.f148549b = aVar2;
            this.f148550c = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.music.service.c cVar = this.f148548a.f148543a;
            if (cVar == null) {
                return null;
            }
            cVar.a(this.f148549b, this.f148550c);
            return z.f158842a;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148551a;

        static {
            Covode.recordClassIndex(97920);
        }

        d(a aVar) {
            this.f148551a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.music.service.c cVar = this.f148551a.f148543a;
            if (cVar != null) {
                cVar.c();
            }
            this.f148551a.f148543a = null;
            return z.f158842a;
        }
    }

    private a(String str) {
        this.f148545c = str;
        this.f148543a = new e(str);
        this.f148544b = d.f148585j.f148588b;
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.a aVar) {
        i.b(new f(this, aVar), this.f148544b);
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.b bVar) {
        i.b(new g(this, bVar), this.f148544b);
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.c cVar) {
        i.b(new h(this, cVar), this.f148544b);
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.a.a aVar, boolean z) {
        l.d(aVar, "");
        i.b(new c(this, aVar, z), this.f148544b);
    }
}
