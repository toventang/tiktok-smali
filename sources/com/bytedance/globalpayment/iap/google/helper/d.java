package com.bytedance.globalpayment.iap.google.helper;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.a.b;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class d implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public Handler f30437a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30438b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30439c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList<String> f30440d;

    /* renamed from: e  reason: collision with root package name */
    volatile Runnable f30441e;

    /* renamed from: f  reason: collision with root package name */
    public final b f30442f;

    /* renamed from: g  reason: collision with root package name */
    private final int f30443g;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.globalpayment.iap.google.d.b f30444h;

    static {
        Covode.recordClassIndex(17652);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f30448a = new d((byte) 0);

        static {
            Covode.recordClassIndex(17656);
        }
    }

    public final com.bytedance.globalpayment.iap.google.d.b a() {
        if (this.f30444h == null) {
            this.f30444h = new com.bytedance.globalpayment.iap.google.d.b();
        }
        return this.f30444h;
    }

    public final boolean b() {
        if (this.f30438b <= 0) {
            return true;
        }
        return false;
    }

    public final void c() {
        if (!b()) {
            AnonymousClass3 r1 = new Runnable() {
                /* class com.bytedance.globalpayment.iap.google.helper.d.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(17655);
                }

                public final void run() {
                    com.bytedance.globalpayment.iap.google.a.a().a(d.this.f30442f);
                }
            };
            Handler handler = this.f30437a;
            if (handler == null) {
                this.f30441e = r1;
            } else {
                handler.post(r1);
            }
        }
    }

    private d() {
        this.f30443g = 1020;
        this.f30440d = new CopyOnWriteArrayList<>();
        this.f30442f = new b() {
            /* class com.bytedance.globalpayment.iap.google.helper.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17654);
            }

            @Override // com.bytedance.globalpayment.iap.a.b
            public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                if (!(absResult == null || absResult.getCode() != 0 || list == null)) {
                    Object[] array = list.toArray();
                    for (Object obj : array) {
                        if (obj != null) {
                            AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
                            String selfOrderId = absIapChannelOrderData.getSelfOrderId();
                            if (!TextUtils.isEmpty(selfOrderId) && d.this.f30440d.contains(selfOrderId) && absIapChannelOrderData.getOrderState() != 2) {
                                PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(IapPaymentMethod.GOOGLE, absIapChannelOrderData);
                                d dVar = d.this;
                                if (!dVar.b() && dVar.f30440d.contains(absIapChannelOrderData.getSelfOrderId())) {
                                    dVar.f30440d.remove(absIapChannelOrderData.getSelfOrderId());
                                    dVar.a().a(absIapChannelOrderData.getProductId(), absIapChannelOrderData.getSelfOrderId(), absIapChannelOrderData.isSubscription(), 2);
                                }
                            }
                        }
                    }
                }
                if (d.this.f30440d.size() > 0 && d.this.f30437a != null) {
                    d.this.f30437a.sendEmptyMessageDelayed(1020, d.this.f30438b);
                }
            }
        };
        this.f30438b = com.bytedance.globalpayment.payment.common.lib.h.a.a().h().g();
        this.f30439c = com.bytedance.globalpayment.payment.common.lib.h.a.a().h().h();
        new Thread(new Runnable() {
            /* class com.bytedance.globalpayment.iap.google.helper.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17653);
            }

            public final void run() {
                d dVar = d.this;
                Looper.prepare();
                dVar.f30437a = new WeakHandler(Looper.myLooper(), dVar);
                if (dVar.f30441e != null) {
                    dVar.f30437a.post(dVar.f30441e);
                    dVar.f30441e = null;
                }
                Looper.loop();
            }
        }, "restore_order_opt_thread").start();
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1020) {
            c();
        }
    }
}
