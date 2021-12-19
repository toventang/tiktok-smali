package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.f;
import com.ss.android.ugc.aweme.property.dg;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.setting.CaptionConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.sticker.data.h;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

public abstract class a {
    public static final C3413a p = new C3413a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g f130903a;

    /* renamed from: b  reason: collision with root package name */
    public String f130904b;

    /* renamed from: c  reason: collision with root package name */
    public String f130905c;

    /* renamed from: d  reason: collision with root package name */
    public String f130906d;

    /* renamed from: e  reason: collision with root package name */
    public List<h> f130907e;

    /* renamed from: f  reason: collision with root package name */
    public k f130908f;

    /* renamed from: g  reason: collision with root package name */
    public final long f130909g = dg.a();

    /* renamed from: h  reason: collision with root package name */
    public final CaptionConfig f130910h;

    /* renamed from: i  reason: collision with root package name */
    public d f130911i;

    /* renamed from: j  reason: collision with root package name */
    public long f130912j;

    /* renamed from: k  reason: collision with root package name */
    public String f130913k;

    /* renamed from: l  reason: collision with root package name */
    public volatile long f130914l;

    /* renamed from: m  reason: collision with root package name */
    public volatile long f130915m;
    public final VideoPublishEditModel n;
    public final int o;
    private final h.h q;
    private final h.h r;

    static {
        Covode.recordClassIndex(85804);
    }

    public static String b(int i2) {
        return i2 != 10 ? i2 != 20 ? i2 != 30 ? i2 != 40 ? i2 != 50 ? "started_step" : "query_task" : "submit_task" : "upload_audio" : "extract_audio" : "get_auth_key";
    }

    /* access modifiers changed from: protected */
    public final r a() {
        return (r) this.q.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2);

    /* access modifiers changed from: protected */
    public abstract void a(int i2, int i3, String str);

    /* access modifiers changed from: protected */
    public final b b() {
        return (b) this.r.getValue();
    }

    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract void c(int i2);

    public abstract void d();

    public abstract boolean e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.a$a  reason: collision with other inner class name */
    public static final class C3413a {
        static {
            Covode.recordClassIndex(85805);
        }

        private C3413a() {
        }

        public /* synthetic */ C3413a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f130917a = new b();

        static {
            Covode.recordClassIndex(85806);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class d extends m implements h.f.a.a<r> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f130918a = new d();

        static {
            Covode.recordClassIndex(85809);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ r invoke() {
            return new r();
        }
    }

    private long k() {
        return SystemClock.elapsedRealtime() - this.f130914l;
    }

    static final class c extends m implements h.f.a.a<i<g>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(85807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.a$c$a  reason: collision with other inner class name */
        public static final class C3414a extends m implements h.f.a.a<i<com.ss.android.ugc.aweme.publish.f.h>> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(85808);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3414a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ i<com.ss.android.ugc.aweme.publish.f.h> invoke() {
                this.this$0.this$0.a();
                return r.a();
            }
        }

        /* renamed from: a */
        public final i<g> invoke() {
            String str;
            i a2 = a.a(new C3414a(this));
            if (!a2.a()) {
                if (a2.f130969c instanceof com.ss.android.ugc.aweme.publish.f.d) {
                    this.this$0.b().a(System.currentTimeMillis());
                    b b2 = this.this$0.b();
                    f G = com.ss.android.ugc.aweme.port.in.g.a().G();
                    T t = a2.f130969c;
                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                    String b3 = G.b(t);
                    String str2 = "";
                    l.b(b3, str2);
                    b2.a(b3);
                    a aVar = this.this$0;
                    T t2 = a2.f130969c;
                    Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                    aVar.f130903a = t2.f118722a;
                    if (this.this$0.f130903a == null) {
                        a2 = new i(2, "parse upload config failed", null, 4);
                    } else {
                        a aVar2 = this.this$0;
                        g gVar = aVar2.f130903a;
                        if (!(gVar == null || (str = gVar.f118752c) == null)) {
                            str2 = str;
                        }
                        aVar2.a(str2);
                    }
                } else {
                    a2 = new i(2, "upload config is empty", null, 4);
                }
            }
            if (this.this$0.f130903a != null) {
                return new i<>(0, null, this.this$0.f130903a, 3);
            }
            return new i<>(a2.f130967a, a2.f130968b, null, 4);
        }
    }

    private double l() {
        double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.f130914l);
        double d2 = (double) this.o;
        Double.isNaN(elapsedRealtime);
        Double.isNaN(d2);
        return elapsedRealtime / d2;
    }

    /* access modifiers changed from: protected */
    public final void i() {
        int i2 = this.f130911i.p;
        if (i2 == 10) {
            this.f130911i.f130922b = k();
        } else if (i2 == 20) {
            this.f130911i.f130923c = k();
            this.f130911i.f130927g = l();
        } else if (i2 == 30) {
            this.f130911i.f130924d = k();
            this.f130911i.f130928h = l();
        } else if (i2 == 40) {
            this.f130911i.f130925e = k();
            this.f130911i.f130929i = l();
        } else if (i2 == 50) {
            this.f130911i.f130926f = k();
            this.f130911i.f130930j = l();
        }
    }

    public final i<g> j() {
        c cVar = new c(this);
        if (System.currentTimeMillis() - b().f130920a.getLong("authkey_store_time", 0) <= SettingsManager.a().a("caption_authkey_expire_time", 86400000L)) {
            String string = b().f130920a.getString("authkey_value", "");
            l.b(string, "");
            if (string.length() > 0) {
                com.ss.android.ugc.aweme.publish.f.d dVar = (com.ss.android.ugc.aweme.publish.f.d) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(string, com.ss.android.ugc.aweme.publish.f.d.class);
                l.b(dVar, "");
                g gVar = dVar.f118722a;
                this.f130903a = gVar;
                if (gVar != null) {
                    q.d("BaseRecognizeCaptionPresenter get authKey from local");
                    return new i<>(0, "", this.f130903a);
                }
            }
        }
        i<g> a2 = cVar.invoke();
        q.d("BaseRecognizeCaptionPresenter get authKey from server");
        return a2;
    }

    public static <T> i<T> a(h.f.a.a<i<T>> aVar) {
        i<T> invoke;
        l.d(aVar, "");
        int i2 = 0;
        do {
            invoke = aVar.invoke();
            if (invoke.f130967a == 0) {
                return invoke;
            }
            i2++;
        } while (i2 < 3);
        if (invoke == null) {
            return new i<>(-1, null, null, 6);
        }
        return invoke;
    }

    /* access modifiers changed from: protected */
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f130911i = dVar;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        l.d(str, "");
        this.f130913k = str;
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        l.d(th, "");
        q.a(th);
        if (th instanceof TimeoutException) {
            bl.a(this.n, this.o, this.f130915m, "exceed");
            c(2);
            k kVar = this.f130908f;
            if (kVar != null) {
                kVar.L();
            }
        } else if (th instanceof q) {
            q qVar = (q) th;
            if (qVar.getStep() == 50 && qVar.getErrorCode() == 2172) {
                k kVar2 = this.f130908f;
                if (kVar2 != null) {
                    kVar2.M();
                }
            } else {
                k kVar3 = this.f130908f;
                if (kVar3 != null) {
                    kVar3.L();
                }
            }
            bl.a(this.n, this.o, this.f130915m, "error");
            c(1);
        } else {
            bl.a(this.n, this.o, this.f130915m, "error");
            c(1);
            k kVar4 = this.f130908f;
            if (kVar4 != null) {
                kVar4.L();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(List<h> list) {
        String str;
        l.d(list, "");
        if (list.isEmpty()) {
            k kVar = this.f130908f;
            if (kVar != null) {
                kVar.M();
            }
            str = "empty";
        } else {
            k kVar2 = this.f130908f;
            if (kVar2 != null) {
                kVar2.a(list);
            }
            str = "succeed";
        }
        bl.a(this.n, this.o, this.f130915m, str);
        this.f130911i.p = 0;
        c(0);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        l.d(str, "");
        this.f130911i.q = i2;
        d dVar = this.f130911i;
        l.d(str, "");
        dVar.r = str;
    }

    public a(VideoPublishEditModel videoPublishEditModel, int i2) {
        l.d(videoPublishEditModel, "");
        this.n = videoPublishEditModel;
        this.o = i2;
        CaptionConfig a2 = com.ss.android.ugc.aweme.setting.f.a();
        this.f130910h = a2 == null ? new CaptionConfig(80, 1) : a2;
        this.q = i.a((h.f.a.a) d.f130918a);
        this.f130911i = new d();
        this.f130913k = "";
        this.r = i.a((h.f.a.a) b.f130917a);
    }
}
