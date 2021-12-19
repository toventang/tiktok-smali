package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.helper.g;
import h.f.b.l;
import h.h;
import org.json.JSONArray;
import org.json.JSONObject;

public final class UpdateGeneralSearchBackgroundMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final b f82723b = new b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f82724c;

    /* renamed from: d  reason: collision with root package name */
    private final String f82725d = "updateGeneralSearchBackground";

    static {
        Covode.recordClassIndex(51524);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(51526);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82725d;
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.c.e.a.c<? extends g>> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $contextProviderFactory;

        static {
            Covode.recordClassIndex(51527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.$contextProviderFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.c.e.a.c<? extends g> invoke() {
            return this.$contextProviderFactory.b(g.class);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f82726a;

        static {
            Covode.recordClassIndex(51525);
        }

        public a(JSONObject jSONObject) {
            l.d(jSONObject, "");
            this.f82726a = jSONObject;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateGeneralSearchBackgroundMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        this.f82724c = h.i.a((h.f.a.a) new c(bVar));
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        g gVar;
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            com.bytedance.ies.bullet.c.e.a.c cVar = (com.bytedance.ies.bullet.c.e.a.c) this.f82724c.getValue();
            if (!(cVar == null || (gVar = (g) cVar.b()) == null)) {
                gVar.a(new a(jSONObject));
            }
            aVar.a(new JSONArray());
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.discover.ui.search.b.a(e2, "UpdateGeneralSearchBackgroundMethod");
            aVar.a(0, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
