package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.r;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import f.a.ab;
import f.a.ad;
import f.a.af;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class n extends a {
    public static final a r = new a((byte) 0);
    public f.a.b.b q;

    static {
        Covode.recordClassIndex(85854);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final boolean e() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85855);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130986a;

        static {
            Covode.recordClassIndex(85860);
        }

        e(n nVar) {
            this.f130986a = nVar;
        }

        static final class b extends m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f130987a = new b();

            static {
                Covode.recordClassIndex(85862);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        static final class a extends m implements h.f.a.a<i<h>> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(85861);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(0);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ i<h> invoke() {
                this.this$0.f130986a.a();
                return r.a();
            }
        }

        @Override // f.a.af
        public final void subscribe(ad<List<com.ss.android.ugc.aweme.sticker.data.h>> adVar) {
            String str;
            String str2 = "";
            l.d(adVar, str2);
            if (this.f130986a.f130903a == null) {
                this.f130986a.a(10);
                i a2 = n.a(new a(this));
                if (!a2.a()) {
                    if (a2.f130969c instanceof com.ss.android.ugc.aweme.publish.f.d) {
                        n nVar = this.f130986a;
                        T t = a2.f130969c;
                        Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                        nVar.f130903a = t.f118722a;
                        if (this.f130986a.f130903a == null) {
                            a2 = new i(2, "parse upload config failed", null, 4);
                        } else {
                            n nVar2 = this.f130986a;
                            g gVar = nVar2.f130903a;
                            if (gVar == null || (str = gVar.f118752c) == null) {
                                str = str2;
                            }
                            nVar2.a(str);
                        }
                    } else {
                        a2 = new i(2, "upload config is empty", null, 4);
                    }
                }
                this.f130986a.a(10, a2.f130967a, a2.f130968b);
                if (!adVar.isDisposed()) {
                    if (a2.a()) {
                        this.f130986a.a(a2.f130967a, a2.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!i.a(this.f130986a.f130904b)) {
                this.f130986a.a(20);
                i<String> a3 = this.f130986a.a().a(this.f130986a.n, this.f130986a.o, 16000, 128000, 2, b.f130987a);
                this.f130986a.a(20, a3.f130967a, a3.f130968b);
                if (!adVar.isDisposed()) {
                    if (a3.a()) {
                        this.f130986a.a(a3.f130967a, a3.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                    this.f130986a.f130904b = a3.f130969c;
                    q.d("OldRecognizeCaptionPresenter audioFile " + this.f130986a.f130904b);
                    n nVar3 = this.f130986a;
                    T t2 = a3.f130969c;
                    if (t2 == null) {
                        l.b();
                    }
                    nVar3.f130912j = new File((String) t2).length() / 1024;
                } else {
                    return;
                }
            }
            String str3 = this.f130986a.f130905c;
            if (str3 == null || str3.length() == 0) {
                this.f130986a.a(30);
                n nVar4 = this.f130986a;
                g gVar2 = nVar4.f130903a;
                if (gVar2 == null) {
                    l.b();
                }
                String str4 = gVar2.f118752c;
                if (str4 == null) {
                    str4 = str2;
                }
                nVar4.a(str4);
                this.f130986a.a();
                String str5 = this.f130986a.f130904b;
                if (str5 == null) {
                    str5 = str2;
                }
                g gVar3 = this.f130986a.f130903a;
                if (gVar3 == null) {
                    l.b();
                }
                i<String> a4 = r.a(str5, gVar3);
                this.f130986a.a(30, a4.f130967a, a4.f130968b);
                if (!adVar.isDisposed()) {
                    if (a4.a()) {
                        this.f130986a.a(a4.f130967a, a4.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                    this.f130986a.f130905c = a4.f130969c;
                    q.d("OldRecognizeCaptionPresenter tosKey " + this.f130986a.f130905c);
                } else {
                    return;
                }
            }
            String str6 = this.f130986a.f130906d;
            if (str6 == null || str6.length() == 0) {
                this.f130986a.a(40);
                r a5 = this.f130986a.a();
                String str7 = this.f130986a.f130905c;
                if (str7 == null) {
                    l.b();
                }
                i<String> a6 = a5.a(str7, this.f130986a.f130910h.getMaxLines(), this.f130986a.f130910h.getWordsPerLine());
                this.f130986a.a(40, a6.f130967a, a6.f130968b);
                if (!adVar.isDisposed()) {
                    if (a6.a()) {
                        this.f130986a.a(a6.f130967a, a6.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                    this.f130986a.f130906d = a6.f130969c;
                    q.d("OldRecognizeCaptionPresenter taskId " + this.f130986a.f130906d);
                } else {
                    return;
                }
            }
            if (this.f130986a.f130907e == null) {
                this.f130986a.a(50);
                r a7 = this.f130986a.a();
                String str8 = this.f130986a.f130906d;
                if (str8 != null) {
                    str2 = str8;
                }
                i<List<com.ss.android.ugc.aweme.sticker.data.h>> a8 = a7.a(str2);
                this.f130986a.a(50, a8.f130967a, a8.f130968b);
                if (!adVar.isDisposed()) {
                    if (a8.a()) {
                        this.f130986a.a(a8.f130967a, a8.f130968b);
                        adVar.a(new q(50, a8.f130967a));
                        return;
                    }
                    this.f130986a.f130907e = a8.f130969c;
                } else {
                    return;
                }
            }
            List<com.ss.android.ugc.aweme.sticker.data.h> list = this.f130986a.f130907e;
            if (list == null) {
                l.b();
            }
            adVar.a(list);
        }
    }

    static final class b implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130983a;

        static {
            Covode.recordClassIndex(85856);
        }

        b(n nVar) {
            this.f130983a = nVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f130983a.c(3);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void g() {
        f.a.b.b bVar;
        f.a.b.b bVar2 = this.q;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.q) != null) {
            bVar.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void h() {
        r.a.a();
        this.f130912j = 0;
        a("");
        this.f130903a = null;
        this.f130904b = null;
        this.f130905c = null;
        this.f130906d = null;
        this.f130907e = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void f() {
        f.a.b.b bVar = this.q;
        if (bVar == null || bVar.isDisposed()) {
            this.f130915m = SystemClock.elapsedRealtime();
            a(new d());
            ab a2 = ab.a((af) new e(this));
            l.b(a2, "");
            f.a.b.b a3 = a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(this.f130909g, TimeUnit.MILLISECONDS).b((f.a.d.a) new b(this)).a(new c(this), new d(this));
            l.b(a3, "");
            this.q = a3;
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130984a;

        static {
            Covode.recordClassIndex(85857);
        }

        c(n nVar) {
            this.f130984a = nVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<com.ss.android.ugc.aweme.sticker.data.h> list = (List) obj;
            n nVar = this.f130984a;
            l.b(list, "");
            nVar.a(list);
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130985a;

        static {
            Covode.recordClassIndex(85858);
        }

        d(n nVar) {
            this.f130985a = nVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            com.ss.android.ugc.asve.f.g.a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.n.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(85859);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    n nVar = this.this$0.f130985a;
                    Throwable th = th;
                    l.b(th, "");
                    nVar.a(th);
                    return z.f158842a;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void a(int i2) {
        this.f130914l = SystemClock.elapsedRealtime();
        this.f130911i.p = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void c(int i2) {
        this.f130911i.f130921a = SystemClock.elapsedRealtime() - this.f130915m;
        d dVar = this.f130911i;
        double d2 = (double) this.f130911i.f130921a;
        double d3 = (double) this.o;
        Double.isNaN(d2);
        Double.isNaN(d3);
        dVar.f130931k = d2 / d3;
        this.f130911i.f130932l = this.f130911i.f130922b;
        this.f130911i.f130933m = this.f130911i.f130923c;
        d dVar2 = this.f130911i;
        String str = this.f130905c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        dVar2.a(str);
        d dVar3 = this.f130911i;
        String str3 = this.f130906d;
        if (str3 != null) {
            str2 = str3;
        }
        dVar3.b(str2);
        this.f130911i.s = this.f130912j;
        this.f130911i.c(this.f130913k);
        e.a(i2, this.f130911i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(VideoPublishEditModel videoPublishEditModel, int i2) {
        super(videoPublishEditModel, i2);
        l.d(videoPublishEditModel, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void a(int i2, int i3, String str) {
        l.d(str, "");
        q.d("OldRecognizeCaptionPresenter step " + b(i2) + " end failedCode: " + i3 + " failedMsg: " + str);
        i();
    }
}
