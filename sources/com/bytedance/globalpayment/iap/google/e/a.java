package com.bytedance.globalpayment.iap.google.e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.helper.d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.j.c;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import org.json.JSONObject;

public class a extends com.bytedance.globalpayment.iap.common.ability.f.a {

    /* renamed from: c  reason: collision with root package name */
    public final String f30414c = a.class.getCanonicalName();

    /* renamed from: d  reason: collision with root package name */
    public Activity f30415d;

    /* renamed from: e  reason: collision with root package name */
    public b f30416e;

    static {
        Covode.recordClassIndex(17639);
    }

    /* renamed from: com.bytedance.globalpayment.iap.google.e.a$a  reason: collision with other inner class name */
    public class C0636a implements com.bytedance.globalpayment.iap.google.b.a {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.globalpayment.iap.google.d.a f30417a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f30418b;

        /* renamed from: c  reason: collision with root package name */
        public OrderData f30419c;

        /* renamed from: d  reason: collision with root package name */
        public OrderInfo f30420d;

        /* renamed from: e  reason: collision with root package name */
        public Message f30421e;

        /* renamed from: g  reason: collision with root package name */
        private g f30423g;

        /* renamed from: h  reason: collision with root package name */
        private Application.ActivityLifecycleCallbacks f30424h;

        /* renamed from: i  reason: collision with root package name */
        private int f30425i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f30426j;

        static {
            Covode.recordClassIndex(17640);
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final int b() {
            return this.f30425i;
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final g d() {
            return this.f30423g;
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final boolean e() {
            return this.f30418b;
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final void a() {
            this.f30425i++;
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final Activity c() {
            return a.this.f30415d;
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final void f() {
            if (a.this.f30415d != null && !this.f30426j) {
                this.f30426j = true;
                a.this.f30415d.getApplication().registerActivityLifecycleCallbacks(this.f30424h);
            }
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final void a(g gVar) {
            this.f30423g = gVar;
            this.f30425i = -1;
            this.f30418b = false;
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final void a(com.bytedance.globalpayment.iap.google.c.a aVar) {
            d dVar = new d(209, 2091, "pay failed because signature is invalid");
            dVar.f30275c = this.f30419c.getPayType();
            this.f30417a.a(aVar.getOrderState(), dVar);
            a.this.a(dVar);
        }

        public C0636a(com.bytedance.globalpayment.iap.google.d.a aVar, OrderData orderData) {
            this.f30417a = aVar;
            this.f30419c = orderData;
            this.f30420d = new OrderInfo(a.this.f30286a);
            this.f30424h = new Application.ActivityLifecycleCallbacks(a.this) {
                /* class com.bytedance.globalpayment.iap.google.e.a.C0636a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17641);
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                public final void onActivityPaused(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityResumed(Activity activity) {
                    if (activity.getClass() == ProxyBillingActivity.class) {
                        C0636a.this.f30417a.f30407b = SystemClock.uptimeMillis();
                        C0636a.this.f30418b = true;
                    }
                }

                public final void onActivityDestroyed(Activity activity) {
                    if (activity.getClass() == ProxyBillingActivity.class) {
                        C0636a.this.f30417a.f30408c = SystemClock.uptimeMillis();
                        if (com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30541c > 0) {
                            C0636a.this.f30421e = Message.obtain();
                            C0636a.this.f30421e.what = 1435;
                            C0636a.this.f30421e.obj = C0636a.this.f30420d;
                            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                            Object obj = C0636a.this.f30421e.obj;
                            a.this.f30416e.sendMessageDelayed(C0636a.this.f30421e, com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30541c);
                        }
                        RestoreOrderService.getIns(a.this.f30415d).onGooglePanelDismiss(C0636a.this.f30419c);
                    }
                }
            };
        }

        @Override // com.bytedance.globalpayment.iap.google.b.a
        public final void a(d dVar, com.bytedance.globalpayment.iap.google.c.a aVar, com.bytedance.globalpayment.iap.google.c.b bVar) {
            d dVar2;
            d dVar3;
            a.this.f30415d = null;
            if (a.this.f30415d != null && this.f30426j) {
                a.this.f30415d.getApplication().unregisterActivityLifecycleCallbacks(this.f30424h);
                this.f30426j = false;
            }
            int code = dVar.getCode();
            if (aVar != null) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            }
            int i2 = -1;
            if (code == 0) {
                if (aVar != null) {
                    if (aVar.isOrderStateSuccess()) {
                        if (bVar == null) {
                            if (d.a.f30448a.f30439c) {
                                this.f30417a.a(aVar.getOrderState(), new com.bytedance.globalpayment.iap.common.ability.d(-201, dVar.getCode(), "pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is " + dVar.getMessage()));
                            }
                        }
                        a.this.f30416e.removeMessages(1435, this.f30421e);
                        this.f30417a.a(aVar.getOrderState(), null);
                        a aVar2 = a.this;
                        aVar2.f30286a.setAbsIapChannelOrderData(aVar).setAbsIapProduct(bVar);
                        aVar2.f30286a.setHost(aVar.getHost());
                        com.bytedance.globalpayment.iap.common.ability.f.a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(aVar2);
                        if (nextState != null) {
                            nextState.a(aVar2.f30286a);
                        }
                        com.bytedance.globalpayment.iap.google.helper.d dVar4 = d.a.f30448a;
                        if (!dVar4.b() && dVar4.f30440d.contains(aVar.getSelfOrderId())) {
                            dVar4.f30440d.remove(aVar.getSelfOrderId());
                            dVar4.a().a(aVar.getProductId(), aVar.getSelfOrderId(), aVar.isSubscription(), 3);
                            return;
                        }
                        return;
                    }
                    if (!aVar.isOrderStateSuccess()) {
                        dVar3 = new com.bytedance.globalpayment.iap.common.ability.d(-202, code, "pay successful in GooglePayPurchasesUpdatedListener but isOrderStateSuccess() is false,resultMessage is " + dVar.getMessage());
                    } else if (bVar == null) {
                        dVar3 = new com.bytedance.globalpayment.iap.common.ability.d(-200, code, "pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is " + dVar.getMessage());
                    } else {
                        return;
                    }
                } else {
                    dVar3 = new com.bytedance.globalpayment.iap.common.ability.d(-203, code, "pay successful in GooglePayPurchasesUpdatedListener but googleIapOrderData is null,resultMessage is " + dVar.getMessage());
                }
                com.bytedance.globalpayment.iap.google.d.a aVar3 = this.f30417a;
                if (aVar != null) {
                    i2 = aVar.getOrderState();
                }
                aVar3.a(i2, dVar3);
                return;
            }
            if (code == 1) {
                dVar2 = new com.bytedance.globalpayment.iap.common.ability.d(206, code, "pay failed in GooglePayPurchasesUpdatedListener because user canceled,resultMessage is " + dVar.getMessage());
                com.bytedance.globalpayment.iap.google.helper.d dVar5 = d.a.f30448a;
                OrderData orderData = this.f30419c;
                if (!dVar5.b() && orderData != null) {
                    String orderId = orderData.getOrderId();
                    if (!dVar5.f30440d.contains(orderId)) {
                        dVar5.f30440d.add(orderId);
                        dVar5.a().a(orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().f30267g, 1);
                        if (dVar5.f30440d.size() == 1) {
                            dVar5.c();
                        }
                    }
                }
            } else {
                dVar2 = new com.bytedance.globalpayment.iap.common.ability.d(203, code, "pay failed in GooglePayPurchasesUpdatedListener,resultMessage is " + dVar.getMessage());
            }
            com.bytedance.globalpayment.iap.google.d.a aVar4 = this.f30417a;
            if (aVar != null) {
                i2 = aVar.getOrderState();
            }
            aVar4.a(i2, dVar2);
            com.bytedance.globalpayment.iap.common.ability.h.a.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b(), this.f30419c.getOrderId());
            a.this.a(dVar2);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.PerformPay;
    }

    static class b extends Handler {
        static {
            Covode.recordClassIndex(17642);
        }

        public b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1435) {
                PaymentServiceManager.get().getIapExternalService().onOrderTimeout((OrderInfo) message.obj);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final void a(OrderData orderData) {
        super.a(orderData);
        if (orderData.isCanceled() || orderData.isFinished()) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            return;
        }
        Activity activity = this.f30415d;
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        orderData.getProductId();
        com.bytedance.globalpayment.iap.google.d.a aVar = new com.bytedance.globalpayment.iap.google.d.a(orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().f30267g, this.f30286a.getPayType());
        aVar.f30406a = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        aVar.add(jSONObject, "product_id", aVar.f30409d);
        aVar.add(jSONObject, "request_id", aVar.f30410e);
        JSONObject jSONObject2 = new JSONObject();
        aVar.add(jSONObject2, "pay_type", (long) aVar.f30412g);
        aVar.add(jSONObject2, "is_subscription", aVar.f30411f);
        aVar.add(jSONObject2, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_google_pay_start", jSONObject2, null, jSONObject);
        Context b2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b();
        if (b2 != null) {
            orderData.getProductId();
            String orderId = orderData.getOrderId();
            String str = orderData.getIapPayRequest().f30262b;
            String str2 = orderData.getIapPayRequest().f30265e;
            String str3 = orderData.getIapPayRequest().f30269i;
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            com.bytedance.globalpayment.iap.common.ability.h.a.a(b2).edit().putString(c.a("key_google_pay_".concat(String.valueOf(orderId))), com.bytedance.globalpayment.iap.common.ability.h.a.a(orderId, str, str2, str3)).apply();
        }
        com.bytedance.globalpayment.iap.google.a.a().a(activity, orderData.getProductId(), orderData.getIapPayRequest().f30267g, this.f30286a, new C0636a(aVar, this.f30286a));
    }

    public a(com.bytedance.globalpayment.iap.common.ability.g.b.d dVar, Activity activity) {
        super(dVar);
        this.f30415d = activity;
        this.f30416e = new b();
    }
}
