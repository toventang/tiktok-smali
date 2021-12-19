package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend;
import com.ss.android.ugc.aweme.commercialize.utils.b.e;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class AdRouterHandlerDependImpl implements IAdRouterHandlerDepend {

    final /* synthetic */ class c implements n.a {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f73774a;

        static {
            Covode.recordClassIndex(45398);
        }

        c(h.f.a.b bVar) {
            this.f73774a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
        public final /* synthetic */ void sendLog(boolean z) {
            l.b(this.f73774a.invoke(Boolean.valueOf(z)), "");
        }
    }

    static {
        Covode.recordClassIndex(45395);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final String a() {
        return "snssdk" + com.ss.android.ugc.aweme.app.application.b.f66649a;
    }

    public static IAdRouterHandlerDepend b() {
        MethodCollector.i(2483);
        Object a2 = com.ss.android.ugc.b.a(IAdRouterHandlerDepend.class, false);
        if (a2 != null) {
            IAdRouterHandlerDepend iAdRouterHandlerDepend = (IAdRouterHandlerDepend) a2;
            MethodCollector.o(2483);
            return iAdRouterHandlerDepend;
        }
        if (com.ss.android.ugc.b.al == null) {
            synchronized (IAdRouterHandlerDepend.class) {
                try {
                    if (com.ss.android.ugc.b.al == null) {
                        com.ss.android.ugc.b.al = new AdRouterHandlerDependImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2483);
                    throw th;
                }
            }
        }
        AdRouterHandlerDependImpl adRouterHandlerDependImpl = (AdRouterHandlerDependImpl) com.ss.android.ugc.b.al;
        MethodCollector.o(2483);
        return adRouterHandlerDependImpl;
    }

    public static final class a extends h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f73772a;

        static {
            Covode.recordClassIndex(45396);
        }

        a(h.f.a.b bVar) {
            this.f73772a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a
        public final void a(boolean z, com.ss.android.ugc.aweme.commercialize.util.adrouter.b bVar) {
            l.d(bVar, "");
            super.a(z, bVar);
            h.f.a.b bVar2 = this.f73772a;
            if (bVar2 != null) {
                bVar2.invoke(Boolean.valueOf(z));
            }
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.commercialize.utils.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f73773a;

        static {
            Covode.recordClassIndex(45397);
        }

        b(h.f.a.b bVar) {
            this.f73773a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a
        public final void a(boolean z, com.ss.android.ugc.aweme.commercialize.util.adrouter.b bVar) {
            l.d(bVar, "");
            super.a(z, bVar);
            h.f.a.b bVar2 = this.f73773a;
            if (bVar2 != null) {
                bVar2.invoke(Boolean.valueOf(z));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a b(h.f.a.b<? super Boolean, z> bVar) {
        return new b(bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a c(h.f.a.b<? super Boolean, z> bVar) {
        return new a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void a(h.f.a.b<? super Boolean, z> bVar) {
        l.d(bVar, "");
        w.a(new c(bVar));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean b(String str) {
        l.d(str, "");
        return t.a(t.a(), str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void a(String str) {
        l.d(str, "");
        e.a(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean a(Context context, String str, String str2) {
        return d.a.a(context, str, (String) null, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void a(String str, JSONObject jSONObject, String str2, String str3) {
        l.d(str, "");
        if (com.ss.android.ugc.aweme.bullet.ab.c.f68844a) {
            l.d(str, "");
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean a(Context context, String str, Uri uri, com.ss.android.ugc.aweme.commercialize.util.adrouter.b bVar) {
        l.d(context, "");
        ALog.d("commerce_jump", "【filterUrl】 = " + str + " 【market】 special handle");
        l.d(context, "");
        if (uri == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
        return true;
    }
}
