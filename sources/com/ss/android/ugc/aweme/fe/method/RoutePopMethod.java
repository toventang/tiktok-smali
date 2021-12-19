package com.ss.android.ugc.aweme.fe.method;

import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.e;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class RoutePopMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f91151b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f91152a;

    static {
        Covode.recordClassIndex(57363);
    }

    private RoutePopMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57364);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ RoutePopMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public RoutePopMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91152a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        AbsActivityContainer a2 = a();
        if (a2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                e.a(jSONObject2, jSONObject);
            }
            Intent intent = new Intent();
            intent.putExtra("serialized_data", jSONObject2.toString());
            a2.a(intent);
            a2.l();
            if (aVar != null) {
                aVar.a(new JSONObject(), 1, "pop succeed");
            }
        } else if (aVar != null) {
            aVar.a(-1, "params not valid");
        }
    }
}
