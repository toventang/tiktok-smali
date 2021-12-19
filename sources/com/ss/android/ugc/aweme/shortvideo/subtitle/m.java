package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.q;
import com.ss.android.ugc.aweme.property.r;
import com.ss.android.ugc.aweme.property.s;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.r;
import com.ss.android.ugc.aweme.utils.hx;
import f.a.ab;
import f.a.ad;
import f.a.af;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class m extends a {
    public static final a u = new a((byte) 0);
    public f.a.b.b q;
    public f.a.b.b r;
    public final com.ss.android.ugc.aweme.shortvideo.edit.e.a s = new com.ss.android.ugc.aweme.shortvideo.edit.e.a();
    public volatile boolean t;

    static {
        Covode.recordClassIndex(85840);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void h() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85841);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f130977a;

        static {
            Covode.recordClassIndex(85848);
        }

        g(m mVar) {
            this.f130977a = mVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f130977a.c(3);
        }
    }

    static final class e<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f130975a;

        static {
            Covode.recordClassIndex(85845);
        }

        e(m mVar) {
            this.f130975a = mVar;
        }

        static final class a extends h.f.b.m implements h.f.a.a<Boolean> {
            final /* synthetic */ ad $it;

            static {
                Covode.recordClassIndex(85846);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ad adVar) {
                super(0);
                this.$it = adVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                ad adVar = this.$it;
                l.b(adVar, "");
                return Boolean.valueOf(adVar.isDisposed());
            }
        }

        @Override // f.a.af
        public final void subscribe(ad<String> adVar) {
            l.d(adVar, "");
            if (!com.ss.android.ugc.tools.utils.i.a(this.f130975a.f130904b)) {
                this.f130975a.a(20);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                i<String> a2 = this.f130975a.a().a(this.f130975a.n, this.f130975a.o, s.a(), q.a(), r.a(), new a(adVar));
                this.f130975a.f130911i.f130923c = SystemClock.elapsedRealtime() - elapsedRealtime;
                d dVar = this.f130975a.f130911i;
                double d2 = (double) this.f130975a.f130911i.f130923c;
                double d3 = (double) this.f130975a.o;
                Double.isNaN(d2);
                Double.isNaN(d3);
                dVar.f130927g = d2 / d3;
                com.ss.android.ugc.tools.utils.q.d("NewRecognizeCaptionPresenter step " + m.b(20) + " end failedCode: " + a2.f130967a + " failedMsg " + a2.f130968b);
                com.ss.android.ugc.tools.utils.q.d("NewRecognizeCaptionPresenter preprocess extractAudio " + ((String) a2.f130969c));
                if (this.f130975a.t) {
                    this.f130975a.f130911i.f130933m = SystemClock.elapsedRealtime() - this.f130975a.f130915m;
                }
                if (!adVar.isDisposed()) {
                    if (a2.a()) {
                        this.f130975a.f130911i.p = 20;
                        this.f130975a.a(a2.f130967a, a2.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                    this.f130975a.f130904b = a2.f130969c;
                    m mVar = this.f130975a;
                    T t = a2.f130969c;
                    if (t == null) {
                        l.b();
                    }
                    mVar.f130912j = new File((String) t).length() / 1024;
                    this.f130975a.s.getData(this.f130975a.n);
                    adVar.a((String) a2.f130969c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f130980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f130981b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f130982c;

        static {
            Covode.recordClassIndex(85852);
        }

        j(m mVar, boolean z, boolean z2) {
            this.f130980a = mVar;
            this.f130981b = z;
            this.f130982c = z2;
        }

        static final class a extends h.f.b.m implements h.f.a.a<Boolean> {
            final /* synthetic */ ad $it;

            static {
                Covode.recordClassIndex(85853);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ad adVar) {
                super(0);
                this.$it = adVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                ad adVar = this.$it;
                l.b(adVar, "");
                return Boolean.valueOf(adVar.isDisposed());
            }
        }

        @Override // f.a.af
        public final void subscribe(ad<List<com.ss.android.ugc.aweme.sticker.data.h>> adVar) {
            String str = "";
            l.d(adVar, str);
            if (this.f130980a.f130903a == null) {
                if (!this.f130981b) {
                    adVar.a(new RuntimeException());
                    return;
                }
                this.f130980a.a(10);
                i<com.ss.android.ugc.aweme.publish.f.g> j2 = this.f130980a.j();
                this.f130980a.a(10, j2.f130967a, j2.f130968b);
                this.f130980a.f130911i.f130932l = this.f130980a.f130911i.f130922b;
                if (!adVar.isDisposed()) {
                    if (j2.a()) {
                        this.f130980a.a(j2.f130967a, j2.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!com.ss.android.ugc.tools.utils.i.a(this.f130980a.f130904b)) {
                if (!this.f130982c) {
                    adVar.a(new RuntimeException());
                    return;
                }
                this.f130980a.a(20);
                i<String> a2 = this.f130980a.a().a(this.f130980a.n, this.f130980a.o, s.a(), q.a(), r.a(), new a(adVar));
                this.f130980a.a(20, a2.f130967a, a2.f130968b);
                this.f130980a.f130911i.f130933m = this.f130980a.f130911i.f130923c;
                if (!adVar.isDisposed()) {
                    if (a2.a()) {
                        this.f130980a.a(a2.f130967a, a2.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                    this.f130980a.f130904b = a2.f130969c;
                    com.ss.android.ugc.tools.utils.q.d("NewRecognizeCaptionPresenter audioFile " + this.f130980a.f130904b);
                    m mVar = this.f130980a;
                    T t = a2.f130969c;
                    if (t == null) {
                        l.b();
                    }
                    mVar.f130912j = new File((String) t).length() / 1024;
                    this.f130980a.s.getData(this.f130980a.n);
                } else {
                    return;
                }
            }
            String str2 = this.f130980a.f130905c;
            if (str2 == null || str2.length() == 0) {
                this.f130980a.a(30);
                m mVar2 = this.f130980a;
                com.ss.android.ugc.aweme.publish.f.g gVar = mVar2.f130903a;
                if (gVar == null) {
                    l.b();
                }
                String str3 = gVar.f118752c;
                if (str3 == null) {
                    str3 = str;
                }
                mVar2.a(str3);
                this.f130980a.a();
                String str4 = this.f130980a.f130904b;
                if (str4 == null) {
                    str4 = str;
                }
                com.ss.android.ugc.aweme.publish.f.g gVar2 = this.f130980a.f130903a;
                if (gVar2 == null) {
                    l.b();
                }
                i<String> a3 = r.a(str4, gVar2);
                this.f130980a.a(30, a3.f130967a, a3.f130968b);
                if (!adVar.isDisposed()) {
                    if (a3.a()) {
                        this.f130980a.a(a3.f130967a, a3.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                    this.f130980a.f130905c = a3.f130969c;
                    com.ss.android.ugc.tools.utils.q.d("NewRecognizeCaptionPresenter tosKey " + this.f130980a.f130905c);
                } else {
                    return;
                }
            }
            String str5 = this.f130980a.f130906d;
            if (str5 == null || str5.length() == 0) {
                this.f130980a.a(40);
                r a4 = this.f130980a.a();
                String str6 = this.f130980a.f130905c;
                if (str6 == null) {
                    l.b();
                }
                i<String> a5 = a4.a(str6, this.f130980a.f130910h.getMaxLines(), this.f130980a.f130910h.getWordsPerLine());
                this.f130980a.a(40, a5.f130967a, a5.f130968b);
                if (!adVar.isDisposed()) {
                    if (a5.a()) {
                        this.f130980a.a(a5.f130967a, a5.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                    this.f130980a.f130906d = a5.f130969c;
                    com.ss.android.ugc.tools.utils.q.d("NewRecognizeCaptionPresenter taskId " + this.f130980a.f130906d);
                } else {
                    return;
                }
            }
            if (this.f130980a.f130907e == null) {
                this.f130980a.a(50);
                r a6 = this.f130980a.a();
                String str7 = this.f130980a.f130906d;
                if (str7 != null) {
                    str = str7;
                }
                i<List<com.ss.android.ugc.aweme.sticker.data.h>> a7 = a6.a(str);
                this.f130980a.a(50, a7.f130967a, a7.f130968b);
                if (!adVar.isDisposed()) {
                    if (a7.a()) {
                        this.f130980a.a(a7.f130967a, a7.f130968b);
                        adVar.a(new q(50, a7.f130967a));
                        return;
                    }
                    this.f130980a.f130907e = a7.f130969c;
                } else {
                    return;
                }
            }
            List<com.ss.android.ugc.aweme.sticker.data.h> list = this.f130980a.f130907e;
            if (list == null) {
                l.b();
            }
            adVar.a(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final boolean e() {
        return this.s.hasChanged(this.n);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void f() {
        this.t = true;
        this.f130915m = SystemClock.elapsedRealtime();
        f.a.b.b bVar = this.q;
        if (bVar == null || bVar.isDisposed()) {
            a(this.f130909g, true, true);
            this.t = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void g() {
        f.a.b.b bVar = this.r;
        if (bVar != null && !bVar.isDisposed()) {
            f.a.b.b bVar2 = this.r;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            a().b();
        }
    }

    public final void k() {
        if (this.t) {
            a(Math.min(this.f130909g, (this.f130909g - SystemClock.elapsedRealtime()) + this.f130915m), false, false);
            this.t = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void d() {
        f.a.b.b bVar = this.q;
        if (bVar != null && !bVar.isDisposed()) {
            f.a.b.b bVar2 = this.q;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            a().b();
        }
        r.a.a();
        this.f130912j = 0;
        a("");
        this.f130904b = null;
        this.f130905c = null;
        this.f130906d = null;
        this.f130907e = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void c() {
        f.a.b.b bVar = this.q;
        if (bVar == null || bVar.isDisposed()) {
            a(new d());
            ab b2 = ab.a((af) new f(this)).b(f.a.h.a.b(f.a.k.a.f158006c));
            l.b(b2, "");
            ab b3 = ab.a((af) new e(this)).b(f.a.h.a.b(f.a.k.a.f158006c));
            l.b(b3, "");
            this.q = ab.a(b2, b3, b.f130972a).a(this.f130909g, TimeUnit.MILLISECONDS).a(new c(this), new d(this));
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f130973a;

        static {
            Covode.recordClassIndex(85843);
        }

        c(m mVar) {
            this.f130973a = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f130973a.k();
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f130974a;

        static {
            Covode.recordClassIndex(85844);
        }

        d(m mVar) {
            this.f130974a = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f130974a.k();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f130978a;

        static {
            Covode.recordClassIndex(85849);
        }

        h(m mVar) {
            this.f130978a = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<com.ss.android.ugc.aweme.sticker.data.h> list = (List) obj;
            m mVar = this.f130978a;
            l.b(list, "");
            mVar.a(list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f130979a;

        static {
            Covode.recordClassIndex(85850);
        }

        i(m mVar) {
            this.f130979a = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            hx.a(0, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.m.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(85851);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    m mVar = this.this$0.f130979a;
                    Throwable th = th;
                    l.b(th, "");
                    mVar.a(th);
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

    static final class f<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f130976a;

        static {
            Covode.recordClassIndex(85847);
        }

        f(m mVar) {
            this.f130976a = mVar;
        }

        @Override // f.a.af
        public final void subscribe(ad<com.ss.android.ugc.aweme.publish.f.g> adVar) {
            l.d(adVar, "");
            if (this.f130976a.f130903a == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                i<com.ss.android.ugc.aweme.publish.f.g> j2 = this.f130976a.j();
                this.f130976a.f130911i.f130922b = SystemClock.elapsedRealtime() - elapsedRealtime;
                com.ss.android.ugc.tools.utils.q.d("NewRecognizeCaptionPresenter step " + m.b(10) + " end failedCode: " + j2.f130967a + " failedMsg " + j2.f130968b);
                com.ss.android.ugc.tools.utils.q.d("NewRecognizeCaptionPresenter preprocess getAuthKey");
                if (this.f130976a.t) {
                    this.f130976a.f130911i.f130932l = SystemClock.elapsedRealtime() - this.f130976a.f130915m;
                }
                if (!adVar.isDisposed()) {
                    if (j2.a()) {
                        this.f130976a.f130911i.p = 10;
                        this.f130976a.a(j2.f130967a, j2.f130968b);
                        adVar.a(new RuntimeException());
                        return;
                    }
                    this.f130976a.f130903a = j2.f130969c;
                    T t = j2.f130969c;
                    if (t == null) {
                        l.b();
                    }
                    adVar.a((com.ss.android.ugc.aweme.publish.f.g) t);
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.publish.f.g gVar = this.f130976a.f130903a;
            if (gVar == null) {
                l.b();
            }
            adVar.a(gVar);
        }
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

    static final class b<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f130972a = new b();

        static {
            Covode.recordClassIndex(85842);
        }

        b() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            l.d(obj, "");
            l.d(obj2, "");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(VideoPublishEditModel videoPublishEditModel, int i2) {
        super(videoPublishEditModel, i2);
        l.d(videoPublishEditModel, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.a
    public final void a(int i2, int i3, String str) {
        l.d(str, "");
        com.ss.android.ugc.tools.utils.q.d("NewRecognizeCaptionPresenter step " + b(i2) + " end failedCode: " + i3 + " failedMsg " + str);
        i();
    }

    private final void a(long j2, boolean z, boolean z2) {
        ab a2 = ab.a((af) new j(this, z, z2));
        l.b(a2, "");
        this.r = a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(j2, TimeUnit.MILLISECONDS).b((f.a.d.a) new g(this)).a(new h(this), new i(this));
    }
}
