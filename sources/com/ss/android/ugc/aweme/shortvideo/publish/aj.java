package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.ac;
import com.ss.android.ugc.aweme.shortvideo.cj;
import com.ss.android.ugc.aweme.shortvideo.co;
import com.ss.android.ugc.tools.utils.q;
import f.a.d.f;
import f.a.t;
import java.util.concurrent.TimeUnit;

public final class aj {

    /* renamed from: h  reason: collision with root package name */
    public static final a f129720h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Boolean f129721a;

    /* renamed from: b  reason: collision with root package name */
    public ac f129722b;

    /* renamed from: c  reason: collision with root package name */
    public String f129723c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f129724d;

    /* renamed from: e  reason: collision with root package name */
    public t<ac> f129725e;

    /* renamed from: f  reason: collision with root package name */
    public f.a.b.b f129726f;

    /* renamed from: g  reason: collision with root package name */
    public f.a.b.b f129727g;

    /* renamed from: i  reason: collision with root package name */
    private final long f129728i;

    static {
        Covode.recordClassIndex(85165);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85166);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private aj() {
        this.f129728i = (long) SettingsManager.a().a("maximum_delay", 500);
    }

    public final void a() {
        String str = this.f129723c;
        if (str != null && str.length() != 0 && !com.ss.android.ugc.aweme.port.in.c.u.a()) {
            t<ac> h2 = ((TTUploaderService.RetrofitService) g.a().C().retrofitCreate(AVApiImpl.b().a(), TTUploaderService.RetrofitService.class)).getTitleSensitivityResult(this.f129723c, co.TEXT_TYPE_TITLE.getValue()).h(this.f129728i, TimeUnit.MILLISECONDS);
            f.a.e.b.b.a(16, "initialCapacity");
            t<ac> a2 = f.a.h.a.a(new f.a.e.e.e.d(h2));
            this.f129726f = a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
            this.f129725e = a2;
        }
    }

    public final void b() {
        ac acVar;
        cj postPrompts;
        String postAnyway;
        ac acVar2;
        cj postPrompts2;
        String goBack;
        cj postPrompts3;
        q.a("TitleSensitivity checkresult triggered");
        ac acVar3 = this.f129722b;
        String str = null;
        if (!(acVar3 == null || (postPrompts3 = acVar3.getPostPrompts()) == null)) {
            str = postPrompts3.getText();
        }
        boolean z = false;
        if (!(str == null || str.length() == 0 || (acVar = this.f129722b) == null || (postPrompts = acVar.getPostPrompts()) == null || (postAnyway = postPrompts.getPostAnyway()) == null || postAnyway.length() == 0 || (acVar2 = this.f129722b) == null || (postPrompts2 = acVar2.getPostPrompts()) == null || (goBack = postPrompts2.getGoBack()) == null || goBack.length() == 0)) {
            z = true;
        }
        this.f129721a = Boolean.valueOf(z);
    }

    public /* synthetic */ aj(byte b2) {
        this();
    }

    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129735b;

        static {
            Covode.recordClassIndex(85170);
        }

        public e(h.f.a.a aVar, h.f.a.a aVar2) {
            this.f129734a = aVar;
            this.f129735b = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            q.a("TitleSensitivity  sync data failed");
            this.f129734a.invoke();
            this.f129735b.invoke();
        }
    }

    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f129731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129733c;

        static {
            Covode.recordClassIndex(85169);
        }

        public d(aj ajVar, h.f.a.a aVar, h.f.a.a aVar2) {
            this.f129731a = ajVar;
            this.f129732b = aVar;
            this.f129733c = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            q.a("TitleSensitivity finish request in time");
            this.f129731a.f129722b = (ac) obj;
            this.f129731a.b();
            this.f129732b.invoke();
            this.f129733c.invoke();
        }
    }

    public final void a(String str) {
        this.f129722b = null;
        this.f129721a = null;
        this.f129724d = false;
        this.f129724d = false;
        this.f129725e = null;
        f.a.b.b bVar = this.f129726f;
        if (bVar != null) {
            bVar.dispose();
        }
        f.a.b.b bVar2 = this.f129727g;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        this.f129723c = str;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f129729a;

        static {
            Covode.recordClassIndex(85167);
        }

        b(aj ajVar) {
            this.f129729a = ajVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            ac acVar = (ac) obj;
            this.f129729a.f129722b = acVar;
            this.f129729a.b();
            o.b("tns_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/aweme/v1/post/prompts/").a("status", (Integer) 0).a());
            StringBuilder append = new StringBuilder("TitleSensitivity response:status_code").append(acVar.getStatusCode()).append(" prompts_text ");
            cj postPrompts = acVar.getPostPrompts();
            if (postPrompts != null) {
                str = postPrompts.getText();
            } else {
                str = null;
            }
            q.a(append.append(str).toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f129730a;

        static {
            Covode.recordClassIndex(85168);
        }

        c(aj ajVar) {
            this.f129730a = ajVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            Throwable th = (Throwable) obj;
            q.a("TitleSensitivity request failed or delay}");
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                i2 = ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode();
            } else {
                i2 = 1;
            }
            o.b("tns_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/aweme/v1/post/prompts/").a("status", (Integer) 1).a("error_message", String.valueOf(i2)).a("tns_logId", "").a());
            this.f129730a.f129722b = null;
            this.f129730a.f129724d = true;
            this.f129730a.f129721a = false;
        }
    }
}
