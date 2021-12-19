package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class GetAbTestMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68978b = "getABTestParams";

    static {
        Covode.recordClassIndex(42523);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68978b;
    }

    static final class a extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ BaseBridgeMethod.a $iReturn;

        static {
            Covode.recordClassIndex(42524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaseBridgeMethod.a aVar) {
            super(1);
            this.$iReturn = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            l.d(str, "");
            this.$iReturn.a(str);
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ BaseBridgeMethod.a $iReturn;

        static {
            Covode.recordClassIndex(42526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BaseBridgeMethod.a aVar) {
            super(1);
            this.$iReturn = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            l.d(str, "");
            this.$iReturn.a(str);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAbTestMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class d extends h.f.b.m implements h.f.a.b<Exception, z> {
        final /* synthetic */ BaseBridgeMethod.a $iReturn;

        static {
            Covode.recordClassIndex(42527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaseBridgeMethod.a aVar) {
            super(1);
            this.$iReturn = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Exception exc) {
            Exception exc2 = exc;
            l.d(exc2, "");
            this.$iReturn.a(0, exc2.getMessage());
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Exception, z> {
        final /* synthetic */ BaseBridgeMethod.a $iReturn;
        final /* synthetic */ JSONObject $params;

        static {
            Covode.recordClassIndex(42525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BaseBridgeMethod.a aVar, JSONObject jSONObject) {
            super(1);
            this.$iReturn = aVar;
            this.$params = jSONObject;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Exception exc) {
            Exception exc2 = exc;
            l.d(exc2, "");
            this.$iReturn.a(0, exc2.getMessage());
            com.bytedance.services.apm.api.a.a((Throwable) exc2, "GetConfigMethod getConfigParams, params = " + this.$params);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (com.ss.android.ugc.aweme.settingsrequest.b.b.a()) {
            com.ss.android.ugc.aweme.settingsrequest.b.a.a(jSONObject, new a(aVar), new b(aVar, jSONObject));
        } else {
            com.ss.android.ugc.aweme.discover.ui.z.f82787a.a(jSONObject, new c(aVar), new d(aVar));
        }
    }
}
