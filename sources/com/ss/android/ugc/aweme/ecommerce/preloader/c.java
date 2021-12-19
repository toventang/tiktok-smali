package com.ss.android.ugc.aweme.ecommerce.preloader;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.t;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.utils.hl;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.r;
import h.z;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.ci;
import kotlinx.coroutines.i;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f86947e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<String> f86948a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f86949b;

    /* renamed from: c  reason: collision with root package name */
    public long f86950c;

    /* renamed from: d  reason: collision with root package name */
    public int f86951d;

    /* renamed from: f  reason: collision with root package name */
    private long f86952f = SystemClock.uptimeMillis();

    /* renamed from: g  reason: collision with root package name */
    private long f86953g;

    /* renamed from: h  reason: collision with root package name */
    private String f86954h = "";

    /* renamed from: i  reason: collision with root package name */
    private Integer f86955i;

    /* renamed from: j  reason: collision with root package name */
    private o f86956j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f86957k;

    /* renamed from: l  reason: collision with root package name */
    private String f86958l;

    static {
        Covode.recordClassIndex(54511);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54512);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void b() {
        bz unused = i.a(bs.f159054a, bf.f159041b, null, new b(this, null), 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.preloader.c.a():void");
    }

    public final void a(int i2) {
        this.f86955i = Integer.valueOf(i2);
    }

    public final void a(com.bytedance.lighten.a.a.a aVar) {
        List<String> list;
        if (aVar != null) {
            list = aVar.f39811a;
        } else {
            list = null;
        }
        this.f86948a = list;
        b();
    }

    public final void a(o oVar) {
        this.f86953g = SystemClock.uptimeMillis();
        this.f86956j = oVar;
        this.f86957k = true;
        this.f86951d++;
        bz unused = i.a(bs.f159054a, bf.f159041b, null, new C2092c(this, null), 2);
    }

    public final void a(Image image) {
        List<String> list;
        if (image != null) {
            list = image.getUrls();
        } else {
            list = null;
        }
        this.f86948a = list;
        b();
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(54513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            T t;
            T t2;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                List<String> list = this.this$0.f86948a;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        if (t.a(t2)) {
                            break;
                        }
                    }
                    t = t2;
                } else {
                    t = null;
                }
                final boolean a2 = hl.a(t);
                ci ciVar = kotlinx.coroutines.internal.o.f159148a;
                AnonymousClass1 r0 = new m<am, d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.ecommerce.preloader.c.b.AnonymousClass1 */
                    int label;
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(54514);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final d<z> create(Object obj, d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.c$c  reason: collision with other inner class name */
                        public static final class C2092c extends k implements m<am, d<? super z>, Object> {
                            int label;
                            final /* synthetic */ c this$0;

                            static {
                                Covode.recordClassIndex(54515);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C2092c(c cVar, d dVar) {
                                super(2, dVar);
                                this.this$0 = cVar;
                            }

                            @Override // h.c.b.a.a
                            public final d<z> create(Object obj, d<?> dVar) {
                                l.d(dVar, "");
                                return new C2092c(this.this$0, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, d<? super z> dVar) {
                                return ((C2092c) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                boolean z;
                                long j2;
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj);
                                    final z.d dVar = new z.d();
                                    dVar.element = 0;
                                    List<String> list = this.this$0.f86948a;
                                    if (list != null) {
                                        Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                File b2 = com.bytedance.lighten.a.r.b().b(Uri.parse(it.next()));
                                                if (b2 != null) {
                                                    j2 = b2.length();
                                                } else {
                                                    j2 = 0;
                                                }
                                                dVar.element = j2;
                                            } catch (Throwable unused) {
                                            }
                                            if (dVar.element > 0) {
                                                z = true;
                                                continue;
                                            } else {
                                                z = false;
                                                continue;
                                            }
                                            if (z) {
                                                break;
                                            }
                                        }
                                    }
                                    ci ciVar = kotlinx.coroutines.internal.o.f159148a;
                                    AnonymousClass1 r1 = new m<am, d<? super h.z>, Object>(this, null) {
                                        /* class com.ss.android.ugc.aweme.ecommerce.preloader.c.C2092c.AnonymousClass1 */
                                        int label;
                                        final /* synthetic */ C2092c this$0;

                                        static {
                                            Covode.recordClassIndex(54516);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        @Override // h.c.b.a.a
                                        public final d<h.z> create(Object obj, d<?> dVar) {
                                            l.d(dVar, "");
                                            return 

                                            public final void a(String str) {
                                                l.d(str, "");
                                                this.f86954h = str;
                                            }

                                            public final void a(Throwable th) {
                                                String message;
                                                this.f86953g = SystemClock.uptimeMillis();
                                                this.f86957k = false;
                                                if (!(th == null || (message = th.getMessage()) == null)) {
                                                    int min = Math.min(128, message.length());
                                                    Objects.requireNonNull(message, "null cannot be cast to non-null type java.lang.String");
                                                    String substring = message.substring(0, min);
                                                    l.b(substring, "");
                                                    this.f86958l = substring;
                                                }
                                                this.f86951d += 2;
                                                a();
                                            }
                                        }
