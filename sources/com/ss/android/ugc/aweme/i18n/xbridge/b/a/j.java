package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.bullet.ui.common.g;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class j implements IHostRouterDepend {

    /* renamed from: a  reason: collision with root package name */
    private final h f99972a = i.a((h.f.a.a) f.f99982a);

    static {
        Covode.recordClassIndex(63719);
    }

    public final IMainService a() {
        return (IMainService) this.f99972a.getValue();
    }

    final class b extends com.bytedance.ies.xbridge.base.runtime.depend.a {

        /* renamed from: c  reason: collision with root package name */
        public final com.bytedance.ies.xbridge.model.b.c f99975c;

        static {
            Covode.recordClassIndex(63721);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final List<com.bytedance.ies.xbridge.e> a() {
            return n.a(com.bytedance.ies.xbridge.e.ALL);
        }

        static final class a extends m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ Context $context;

            static {
                Covode.recordClassIndex(63722);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context) {
                super(1);
                this.$context = context;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                String str;
                Boolean bool2 = bool;
                f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                a2.f74804a = "draw_ad";
                l.b(bool2, "");
                String str2 = "deeplink_success";
                if (bool2.booleanValue()) {
                    str = str2;
                } else {
                    str = "deeplink_failed";
                }
                a2.f74805b = str;
                a2.a(this.$context);
                if (!bool2.booleanValue()) {
                    str2 = "deeplink_failed";
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", str2, "0", "", "0").c();
                return z.f158842a;
            }
        }

        public b(com.bytedance.ies.xbridge.model.b.c cVar) {
            this.f99975c = cVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final boolean a(String str, Map<String, ? extends Object> map, Context context) {
            l.d(str, "");
            l.d(map, "");
            if (!(!l.a(map.get("useSysBrowser"), (Object) true)) && !TextUtils.isEmpty(str)) {
                String lowerCase = str.toLowerCase();
                l.b(lowerCase, "");
                if (p.b(lowerCase, "http://", false) || p.b(lowerCase, "https://", false)) {
                    Context context2 = (Context) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(this.f99975c, Context.class);
                    if (context2 != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent.addFlags(268435456);
                        intent.addCategory("android.intent.category.BROWSABLE");
                        ResolveInfo resolveActivity = context2.getPackageManager().resolveActivity(intent, 65536);
                        if (resolveActivity != null) {
                            intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                            com.ss.android.ugc.tiktok.security.a.a.a(intent, context2);
                            context2.startActivity(intent);
                            return true;
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(StringSet.type, "webview");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", str);
                    jSONObject.put("args", jSONObject2);
                    com.ss.android.ugc.aweme.fe.a.a.a(context2, jSONObject);
                    return true;
                } else if (context != null) {
                    boolean openAdOpenUrl = j.this.a().openAdOpenUrl(context, str, false);
                    if (!openAdOpenUrl) {
                        return openAdOpenUrl;
                    }
                    f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                    a2.f74804a = "draw_ad";
                    a2.f74805b = "open_url_app";
                    a2.a(context);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_app", "0", "", "0").c();
                    j.this.a().pendingDeepLinkLog(new a(context));
                    return openAdOpenUrl;
                }
            }
            return false;
        }
    }

    final class d extends com.bytedance.ies.xbridge.base.runtime.depend.a {
        static {
            Covode.recordClassIndex(63724);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final boolean a(String str, Map<String, ? extends Object> map, Context context) {
            l.d(str, "");
            l.d(map, "");
            return false;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final List<com.bytedance.ies.xbridge.e> a() {
            return n.a(com.bytedance.ies.xbridge.e.ALL);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }
    }

    static final class f extends m implements h.f.a.a<IMainService> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f99982a = new f();

        static {
            Covode.recordClassIndex(63726);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IMainService invoke() {
            return MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        }
    }

    final class a extends com.bytedance.ies.xbridge.base.runtime.depend.a {

        /* renamed from: c  reason: collision with root package name */
        public final com.bytedance.ies.xbridge.model.b.c f99973c;

        static {
            Covode.recordClassIndex(63720);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final List<com.bytedance.ies.xbridge.e> a() {
            return n.b(com.bytedance.ies.xbridge.e.LYNX, com.bytedance.ies.xbridge.e.WEB);
        }

        public a(com.bytedance.ies.xbridge.model.b.c cVar) {
            this.f99973c = cVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final boolean a(String str, Map<String, ? extends Object> map, Context context) {
            l.d(str, "");
            l.d(map, "");
            Context context2 = (Context) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(this.f99973c, Context.class);
            if (!(context2 instanceof Activity)) {
                return false;
            }
            return j.this.a().startAdsAppActivity(context2, p.a(str, "aweme", "sslocal", false), null);
        }
    }

    final class c extends com.bytedance.ies.xbridge.base.runtime.depend.a {

        /* renamed from: c  reason: collision with root package name */
        public final com.bytedance.ies.xbridge.model.b.c f99977c;

        static {
            Covode.recordClassIndex(63723);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final List<com.bytedance.ies.xbridge.e> a() {
            return n.b(com.bytedance.ies.xbridge.e.LYNX, com.bytedance.ies.xbridge.e.WEB);
        }

        public c(com.bytedance.ies.xbridge.model.b.c cVar) {
            this.f99977c = cVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final boolean a(String str, Map<String, ? extends Object> map, Context context) {
            l.d(str, "");
            l.d(map, "");
            return j.this.a().handleLiveSchema(str);
        }
    }

    final class e extends com.bytedance.ies.xbridge.base.runtime.depend.a {

        /* renamed from: c  reason: collision with root package name */
        public final com.bytedance.ies.xbridge.model.b.c f99980c;

        static {
            Covode.recordClassIndex(63725);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final List<com.bytedance.ies.xbridge.e> a() {
            return n.b(com.bytedance.ies.xbridge.e.WEB, com.bytedance.ies.xbridge.e.LYNX);
        }

        public e(com.bytedance.ies.xbridge.model.b.c cVar) {
            this.f99980c = cVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.a
        public final boolean a(String str, Map<String, ? extends Object> map, Context context) {
            l.d(str, "");
            l.d(map, "");
            Context context2 = (Context) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(this.f99980c, Context.class);
            if (context2 instanceof Activity) {
                return j.a(context2, str);
            }
            return j.a(null, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final com.bytedance.ies.xbridge.base.runtime.depend.a provideRouteOpenExceptionHandler(com.bytedance.ies.xbridge.model.b.c cVar) {
        return new d();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final List<com.bytedance.ies.xbridge.base.runtime.depend.a> provideRouteOpenHandlerList(com.bytedance.ies.xbridge.model.b.c cVar) {
        return n.b(new b(cVar), new c(cVar), new e(cVar), new a(cVar));
    }

    public static boolean a(Context context, String str) {
        if (context instanceof Activity) {
            return t.a(t.a(), (Activity) context, str);
        }
        return t.a(t.a(), str);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final boolean closeView(com.bytedance.ies.xbridge.model.b.c cVar, com.bytedance.ies.xbridge.e eVar, String str, boolean z) {
        com.bytedance.ies.bullet.c.d dVar;
        com.bytedance.ies.bullet.c.c.i a2;
        g z2;
        Activity a3;
        com.bytedance.hybrid.spark.a.e eVar2;
        com.bytedance.ies.bullet.c.c.z a4;
        l.d(eVar, "");
        if (str == null || str.length() <= 0) {
            try {
                com.bytedance.ies.bullet.c.c.i a5 = com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar);
                if (a5 == null || (a4 = a5.a()) == null || (str = a4.f32074a) == null) {
                    str = "";
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        Context context = (Context) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar, Context.class);
        if (context != null && BulletService.f().b(context, str)) {
            return true;
        }
        com.bytedance.lynx.hybrid.h.a aVar = SparkContext.f31048d.get(str);
        if (aVar == null || (eVar2 = (com.bytedance.hybrid.spark.a.e) aVar.a(com.bytedance.hybrid.spark.a.e.class)) == null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (!(str == null || (dVar = (com.bytedance.ies.bullet.c.d) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar, com.bytedance.ies.bullet.c.d.class)) == null || (a2 = dVar.a(str)) == null)) {
                if (!(a2 instanceof com.bytedance.ies.bullet.ui.common.c.c)) {
                    a2 = null;
                }
                com.bytedance.ies.bullet.ui.common.c.c cVar2 = (com.bytedance.ies.bullet.ui.common.c.c) a2;
                if (!(cVar2 == null || (z2 = cVar2.z()) == null || (a3 = z2.a()) == null)) {
                    a3.finish();
                    if (z) {
                        a3.overridePendingTransition(R.anim.f354do, R.anim.dx);
                    }
                }
            }
            if (!(context instanceof Activity)) {
                return false;
            }
            if (!((Activity) context).isFinishing()) {
                ((Activity) context).finish();
                if (z) {
                    ((Activity) context).overridePendingTransition(R.anim.f354do, R.anim.dx);
                }
            }
            return true;
        }
        eVar2.a();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final boolean openSchema(com.bytedance.ies.xbridge.model.b.c cVar, String str, Map<String, ? extends Object> map, com.bytedance.ies.xbridge.e eVar, Context context) {
        l.d(str, "");
        l.d(map, "");
        l.d(eVar, "");
        return IHostRouterDepend.a.a(this, cVar, str, map, eVar);
    }
}
