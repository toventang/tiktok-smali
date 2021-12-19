package com.ss.android.ugc.aweme.commercialize.util.adrouter;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public Context f75457a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a> f75458b;

    /* renamed from: c  reason: collision with root package name */
    public b f75459c;

    static {
        Covode.recordClassIndex(46553);
    }

    /* synthetic */ c() {
        this(d.a(), new ArrayList(), new b.a().f75413a);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.f
    public final boolean a() {
        a.f75399a.a("ad_lynx_download_AdRouterTask_execute", (JSONObject) null, "begin", String.valueOf(this.f75459c.f75407a.f75416c));
        for (com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a aVar : this.f75458b) {
            Context context = this.f75457a;
            l.d(context, "");
            aVar.f75401b = context;
            b bVar = this.f75459c;
            l.d(bVar, "");
            aVar.f75402c = bVar;
            if (aVar.a()) {
                boolean b2 = aVar.b();
                aVar.a(b2, this.f75459c);
                if (b2) {
                    a.f75399a.a("ad_lynx_download_AdRouterTask_execute", (JSONObject) null, "success", String.valueOf(this.f75459c.f75407a.f75416c));
                    return true;
                }
            }
        }
        a.f75399a.a("ad_lynx_download_AdRouterTask_execute", (JSONObject) null, "fail", String.valueOf(this.f75459c.f75407a.f75416c));
        return false;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public c f75460a = new c();

        static {
            Covode.recordClassIndex(46554);
        }

        public final a a(Context context) {
            if (context != null) {
                c cVar = this.f75460a;
                l.d(context, "");
                cVar.f75457a = context;
            }
            return this;
        }

        public final a a(com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a aVar) {
            l.d(aVar, "");
            this.f75460a.f75458b.add(aVar);
            return this;
        }

        public final a a(b bVar) {
            l.d(bVar, "");
            c cVar = this.f75460a;
            l.d(bVar, "");
            cVar.f75459c = bVar;
            return this;
        }
    }

    private c(Context context, List<com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a> list, b bVar) {
        this.f75457a = context;
        this.f75458b = list;
        this.f75459c = bVar;
    }
}
