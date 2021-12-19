package com.ss.android.ugc.aweme.request_combine.request.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.j;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.u;
import com.google.gson.o;
import com.ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.legoImp.task.y;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import f.a.d.g;
import f.a.d.k;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class e implements r {

    /* renamed from: c  reason: collision with root package name */
    public static final a f120635c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f120636a;

    /* renamed from: b  reason: collision with root package name */
    public final int f120637b;

    static {
        Covode.recordClassIndex(78563);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78564);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.P0;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    public /* synthetic */ e() {
        this(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$e  reason: collision with other inner class name */
    static final class C3116e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C3116e f120641a = new C3116e();

        static {
            Covode.recordClassIndex(78568);
        }

        C3116e() {
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$e$a */
        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            public static final a f120642a = new a();

            static {
                Covode.recordClassIndex(78569);
            }

            a() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                AbTestManagerImpl.b().a(true);
                return z.f158842a;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
            if (r5 != null) goto L_0x007e;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 323
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.request_combine.request.a.e.C3116e.accept(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class c<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final c f120639a = new c();

        static {
            Covode.recordClassIndex(78566);
        }

        c() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            l.d(obj, "");
            return obj instanceof o;
        }
    }

    static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120640a = new d();

        static {
            Covode.recordClassIndex(78567);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.google.gson.l lVar = (com.google.gson.l) obj;
            l.d(lVar, "");
            return lVar.j();
        }
    }

    public e(int i2) {
        this.f120637b = i2;
        if (i2 == 1 || i2 == 2) {
            com.bytedance.ies.abmock.c.a();
        }
        this.f120636a = new f.a.b.a();
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120638a = new b();

        static {
            Covode.recordClassIndex(78565);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            T t;
            String str;
            u uVar = (u) obj;
            l.d(uVar, "");
            List<com.bytedance.retrofit2.client.b> list = uVar.f42629a.f42476d;
            l.b(list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                l.b(t2, "");
                if (l.a((Object) t2.f42471a, (Object) "x-tt-logid")) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (str = t3.f42472b) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("x-tt-logid", str);
                com.bytedance.retrofit2.client.c cVar = uVar.f42629a;
                l.b(cVar, "");
                String str2 = cVar.f42473a;
                l.b(str2, "");
                linkedHashMap.put("url", str2);
                ISettingRequestExtraInfo a2 = SettingRequestExtraInfoImpl.a();
                if (a2 != null) {
                    a2.a(linkedHashMap);
                }
            }
            return uVar.f42630b;
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f120643a = new f();

        static {
            Covode.recordClassIndex(78570);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.lego.f.e().a(new com.ss.android.ugc.aweme.request_combine.request.b.a()).a(new com.ss.android.ugc.aweme.request_combine.request.b.b()).a();
            JSONObject jSONObject = new JSONObject();
            if (th == null || (str = th.getMessage()) == null) {
                str = "";
            }
            jSONObject.put("errorMsg", str);
            com.bytedance.apm.b.a("settings_v3_result", 1, jSONObject);
            com.ss.android.ugc.aweme.framework.a.a.a("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = false, is_v3 = " + j.a().c() + ", is_v3_api = true");
            com.ss.android.ugc.aweme.common.r.a("config_fetch_success", new com.ss.android.ugc.aweme.app.f.d().a("status", "0").a("source", "0").f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        String b2 = com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "last_setting_version", "");
        this.f120636a.a(((SettingApi) RetrofitFactory.a().a(com.ss.android.c.b.f59141e).a(SettingApi.class)).queryV3Setting(y.a(), com.ss.android.ugc.aweme.base.utils.k.a(com.bytedance.ies.ugc.appcontext.d.a()), b2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).c(b.f120638a).a(c.f120639a).c(d.f120640a).a(C3116e.f120641a, f.f120643a));
    }
}
