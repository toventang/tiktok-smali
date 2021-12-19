package com.ss.android.ugc.aweme.specact.popup.calendar;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class CreateCalendarEventMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134598a = new a((byte) 0);

    static {
        Covode.recordClassIndex(87951);
    }

    private CreateCalendarEventMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87952);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ CreateCalendarEventMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public CreateCalendarEventMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    static final class b extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ BaseCommonJavaMethod.a $iReturn;

        static {
            Covode.recordClassIndex(87953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BaseCommonJavaMethod.a aVar) {
            super(1);
            this.$iReturn = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            BaseCommonJavaMethod.a aVar = this.$iReturn;
            if (aVar != null) {
                aVar.a("", intValue, "");
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null) {
            Activity j2 = f.j();
            if (j2 != null) {
                b bVar = (b) dg.a(jSONObject.toString(), b.class);
                l.b(bVar, "");
                a.a(j2, bVar, true, new b(aVar));
            }
        } else if (aVar != null) {
            aVar.a(-1, "Parameter invalid");
        }
    }
}
