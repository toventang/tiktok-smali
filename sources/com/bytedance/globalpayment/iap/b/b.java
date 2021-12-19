package com.bytedance.globalpayment.iap.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public TokenInfo f30219a;

    /* renamed from: b  reason: collision with root package name */
    int f30220b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f30221c;

    /* renamed from: d  reason: collision with root package name */
    a f30222d;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity> f30223e;

    /* renamed from: f  reason: collision with root package name */
    com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity> f30224f = new com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity>() {
        /* class com.bytedance.globalpayment.iap.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17553);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final /* synthetic */ void a(ResponseEntity responseEntity) {
            PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().onSuccessFinishedTokenUpload(b.this.f30219a.getOrderId());
            if (b.this.f30223e != null) {
                b.this.f30223e.a(responseEntity);
            }
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final void a(AbsResult absResult) {
            b bVar = b.this;
            if (bVar.f30220b >= bVar.f30221c) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().onFailedFinishedTokenUpload(bVar.f30219a.getOrderId());
                if (bVar.f30223e != null) {
                    bVar.f30223e.a(absResult);
                    return;
                }
                return;
            }
            int i2 = bVar.f30220b + 1;
            bVar.f30220b = i2;
            long min = (long) Math.min(Math.max(i2, 1), 5);
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            bVar.f30222d.sendEmptyMessageDelayed(1, min * 1000);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private final String f30225g = b.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    private String f30226h;

    /* renamed from: i  reason: collision with root package name */
    private String f30227i;

    static {
        Covode.recordClassIndex(17552);
    }

    public final void a() {
        JSONObject jSONObject;
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        this.f30222d.removeMessages(1);
        try {
            jSONObject = this.f30219a.toJson();
        } catch (JSONException e2) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            e2.getLocalizedMessage();
            jSONObject = null;
        }
        com.bytedance.globalpayment.iap.d.b.d().b().a(this.f30226h, jSONObject, this.f30227i, this.f30219a.isSubscription(), this.f30219a.getOrderId(), this.f30219a.getProductId(), this.f30224f, this.f30219a.isNewSubscription());
    }

    /* access modifiers changed from: package-private */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private b f30229a;

        static {
            Covode.recordClassIndex(17554);
        }

        public a(b bVar) {
            super(Looper.getMainLooper());
            this.f30229a = bVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                this.f30229a.a();
            }
        }
    }

    public final void a(com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity> aVar) {
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        this.f30223e = aVar;
        a();
    }

    public b(String str, String str2, TokenInfo tokenInfo) {
        this.f30226h = str;
        this.f30219a = tokenInfo;
        this.f30227i = str2;
        this.f30222d = new a(this);
        this.f30221c = 8;
    }
}
