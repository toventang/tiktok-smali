package com.bytedance.globalpayment.iap.state;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.c.c;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.AckStrategy;
import com.bytedance.globalpayment.iap.model.OrderStateInfo;
import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

public abstract class a extends com.bytedance.globalpayment.iap.common.ability.f.a {

    /* renamed from: c  reason: collision with root package name */
    protected static final String f30474c = a.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    protected int f30475d = 3;

    /* renamed from: e  reason: collision with root package name */
    protected com.bytedance.globalpayment.iap.b.a f30476e;

    /* renamed from: f  reason: collision with root package name */
    protected AckStrategy f30477f;

    /* renamed from: g  reason: collision with root package name */
    public b f30478g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f30479h;

    static {
        Covode.recordClassIndex(17683);
    }

    public final void b() {
        if (!this.f30479h) {
            this.f30479h = true;
            com.bytedance.globalpayment.iap.common.ability.f.a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(this);
            if (nextState != null) {
                nextState.a(this.f30286a);
            }
        }
    }

    public final void c() {
        Context b2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b();
        if (b2 != null) {
            PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removeQueryOrderParam(b2, this.f30286a.getOrderId());
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        }
    }

    static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private a f30483a;

        static {
            Covode.recordClassIndex(17685);
        }

        public b(a aVar) {
            super(Looper.getMainLooper());
            this.f30483a = aVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1659) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                this.f30483a.b();
            }
        }
    }

    public a(d dVar) {
        super(dVar);
        PaymentOnlineSettings b2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().h().b();
        this.f30477f = new AckStrategy(b2.e(), b2.d());
        this.f30478g = new b(this);
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.a$a  reason: collision with other inner class name */
    public class C0637a implements com.bytedance.globalpayment.payment.common.lib.a.a<OrderStateInfo> {

        /* renamed from: a  reason: collision with root package name */
        protected c f30480a;

        /* renamed from: b  reason: collision with root package name */
        protected AckStrategy f30481b;

        static {
            Covode.recordClassIndex(17684);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final /* synthetic */ void a(OrderStateInfo orderStateInfo) {
            this.f30480a.a(true, orderStateInfo.getOrderState().ordinal(), null);
            a.this.f30286a.setQuerySucceed(true);
            a.this.c();
            if (this.f30481b.isNeedAckAfterSuccessQuery()) {
                a.this.b();
            }
            if (a.this.f30286a.isSuccess() && !a.this.f30286a.isFinished()) {
                a.this.a(new com.bytedance.globalpayment.iap.common.ability.d(0, 0, "pay success in QueryOrderStateCallback."));
            }
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final void a(AbsResult absResult) {
            int i2;
            int i3;
            if (this.f30481b.isNeedAckAfterSuccessQuery() && this.f30481b.getAutoAckAfterUploadTokenInMs() > 0) {
                com.bytedance.globalpayment.iap.d.b.d().a().b(a.this.f30286a, absResult);
                a.this.b();
            }
            if (absResult != null) {
                i2 = absResult.getCode();
                i3 = absResult.getDetailCode();
            } else {
                i2 = -1;
                i3 = 0;
            }
            a.this.a(com.bytedance.globalpayment.iap.common.ability.d.a(absResult));
            if (i2 != 204) {
                this.f30480a.a(false, -1, com.bytedance.globalpayment.iap.common.ability.d.a(absResult));
            } else if (i3 == OrderStateEnum.Failed.ordinal() || i3 == OrderStateEnum.Closed.ordinal() || i3 == OrderStateEnum.Expired.ordinal()) {
                this.f30480a.a(true, i3, com.bytedance.globalpayment.iap.common.ability.d.a(absResult));
                a.this.c();
            } else if (i3 == OrderStateEnum.Abandoned.ordinal() || i3 == OrderStateEnum.SusPended.ordinal() || i3 == OrderStateEnum.Preorder.ordinal()) {
                com.bytedance.globalpayment.iap.d.b.d().a().a(a.this.f30286a, absResult);
                this.f30480a.a(true, i3, com.bytedance.globalpayment.iap.common.ability.d.a(absResult));
                a.this.c();
            }
        }

        public C0637a(c cVar, AckStrategy ackStrategy) {
            this.f30480a = cVar;
            this.f30481b = ackStrategy;
            if (!ackStrategy.isNeedAckAfterSuccessQuery()) {
                a.this.b();
                return;
            }
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            ackStrategy.getAutoAckAfterUploadTokenInMs();
            if (ackStrategy.getAutoAckAfterUploadTokenInMs() > 0) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                ackStrategy.getAutoAckAfterUploadTokenInMs();
                a.this.f30478g.sendEmptyMessageDelayed(1659, ackStrategy.getAutoAckAfterUploadTokenInMs());
            }
        }
    }
}
