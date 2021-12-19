package com.ss.android.ugc.aweme.discover.ui;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.search.h;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class GetABTest extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(51112);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public GetABTest() {
    }

    static final class a extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ BaseCommonJavaMethod.a $iReturn;

        static {
            Covode.recordClassIndex(51113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaseCommonJavaMethod.a aVar) {
            super(1);
            this.$iReturn = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            l.d(str, "");
            BaseCommonJavaMethod.a aVar = this.$iReturn;
            if (aVar != null) {
                aVar.a(str);
            }
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ BaseCommonJavaMethod.a $iReturn;

        static {
            Covode.recordClassIndex(51115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BaseCommonJavaMethod.a aVar) {
            super(1);
            this.$iReturn = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            l.d(str, "");
            BaseCommonJavaMethod.a aVar = this.$iReturn;
            if (aVar != null) {
                aVar.a(str);
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetABTest(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    static final class d extends h.f.b.m implements h.f.a.b<Exception, z> {
        final /* synthetic */ BaseCommonJavaMethod.a $iReturn;

        static {
            Covode.recordClassIndex(51116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaseCommonJavaMethod.a aVar) {
            super(1);
            this.$iReturn = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Exception exc) {
            Exception exc2 = exc;
            l.d(exc2, "");
            h.f121133a.a(exc2, "getABTestParams");
            BaseCommonJavaMethod.a aVar = this.$iReturn;
            if (aVar != null) {
                aVar.a(0, exc2.getMessage());
            }
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Exception, z> {
        final /* synthetic */ BaseCommonJavaMethod.a $iReturn;
        final /* synthetic */ JSONObject $params;

        static {
            Covode.recordClassIndex(51114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BaseCommonJavaMethod.a aVar, JSONObject jSONObject) {
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
            BaseCommonJavaMethod.a aVar = this.$iReturn;
            if (aVar != null) {
                aVar.a(0, exc2.getMessage());
            }
            com.bytedance.services.apm.api.a.a((Throwable) exc2, "GetConfig getConfigParams, params = " + this.$params);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (com.ss.android.ugc.aweme.settingsrequest.b.b.a()) {
            com.ss.android.ugc.aweme.settingsrequest.b.a.a(jSONObject, new a(aVar), new b(aVar, jSONObject));
        } else {
            z.f82787a.a(jSONObject, new c(aVar), new d(aVar));
        }
    }
}
