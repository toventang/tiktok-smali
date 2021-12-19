package com.ss.android.ugc.aweme.ecommerce.jsb;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class UpdateNonceMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86138a = new a((byte) 0);

    static {
        Covode.recordClassIndex(53898);
    }

    private UpdateNonceMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53899);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethod$a$a  reason: collision with other inner class name */
        public static final class RunnableC2071a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JSONObject f86139a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ JSONObject f86140b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ BaseCommonJavaMethod.a f86141c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ BaseBridgeMethod.a f86142d;

            static {
                Covode.recordClassIndex(53900);
            }

            RunnableC2071a(JSONObject jSONObject, JSONObject jSONObject2, BaseCommonJavaMethod.a aVar, BaseBridgeMethod.a aVar2) {
                this.f86139a = jSONObject;
                this.f86140b = jSONObject2;
                this.f86141c = aVar;
                this.f86142d = aVar2;
            }

            public final void run() {
                BaseCommonJavaMethod.a aVar = this.f86141c;
                if (aVar != null) {
                    aVar.a(this.f86139a);
                }
                BaseBridgeMethod.a aVar2 = this.f86142d;
                if (aVar2 != null) {
                    aVar2.a(this.f86139a);
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar, BaseBridgeMethod.a aVar2) {
            if (jSONObject != null) {
                com.bytedance.android.ecommerce.a.f6869a.c(jSONObject.getString("nonce"));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "success");
                new Handler(Looper.getMainLooper()).post(new RunnableC2071a(jSONObject2, jSONObject, aVar, aVar2));
            }
        }
    }

    private /* synthetic */ UpdateNonceMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public UpdateNonceMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        a.a(jSONObject, aVar, null);
    }
}
