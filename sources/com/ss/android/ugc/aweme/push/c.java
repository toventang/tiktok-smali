package com.ss.android.ugc.aweme.push;

import android.app.Activity;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.notice.api.bean.e;
import com.ss.android.ugc.aweme.notice.api.bean.f;
import com.ss.android.ugc.aweme.notice.api.e.q;
import com.ss.android.ugc.aweme.push.d;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.l;
import h.r;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class c implements com.ss.android.ugc.aweme.notice.api.a.a {

    /* renamed from: b  reason: collision with root package name */
    public static c f118851b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f118852c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final LivePushApi f118853a;

    static {
        Covode.recordClassIndex(77207);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77208);
        }

        private a() {
        }

        public final synchronized c a() {
            c cVar;
            MethodCollector.i(2605);
            if (c.f118851b == null) {
                c.f118851b = new c();
            }
            cVar = c.f118851b;
            if (cVar == null) {
                l.b();
            }
            MethodCollector.o(2605);
            return cVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notice.api.bean.b f118854a;

        static {
            Covode.recordClassIndex(77209);
        }

        b(com.ss.android.ugc.aweme.notice.api.bean.b bVar) {
            this.f118854a = bVar;
        }

        public final void run() {
            d.a.a().a(true, ((e) this.f118854a).getTitle(), ((e) this.f118854a).getContent(), ((e) this.f118854a).getImageUrl(), ((e) this.f118854a).getOpenUrl(), "", (e) this.f118854a);
        }
    }

    public c() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(LivePushApi.class);
        l.b(create, "");
        this.f118853a = (LivePushApi) create;
        q.f112739f.a(f.LIVE, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.push.c$c  reason: collision with other inner class name */
    static final class C3045c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final C3045c f118855a = new C3045c();

        static {
            Covode.recordClassIndex(77210);
        }

        C3045c() {
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.a.a
    public final void a(com.ss.android.ugc.aweme.notice.api.bean.b bVar) {
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            if (eVar.getPushShowType() == 1 && androidx.core.app.l.a(com.bytedance.ies.ugc.appcontext.d.a()).a()) {
                JSONObject jSONObject = new JSONObject(eVar.getExtraStr());
                HashMap hashMap = new HashMap();
                try {
                    new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    l.b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        l.b(next, "");
                        String optString = jSONObject.optString(next);
                        l.b(optString, "");
                        hashMap.put(next, optString);
                    }
                    h.q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    h.q.m223constructorimpl(r.a(th));
                }
                Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                if (j2 != null) {
                    j2.runOnUiThread(new b(bVar));
                }
            }
        }
    }
}
