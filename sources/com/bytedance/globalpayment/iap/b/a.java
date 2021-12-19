package com.bytedance.globalpayment.iap.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OneTimeOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.SubscriptionOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.d.b;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.AckStrategy;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.model.OrderStateInfo;
import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.globalpayment.payment.common.lib.a.a<OrderStateInfo> f30203a;

    /* renamed from: b  reason: collision with root package name */
    int f30204b;

    /* renamed from: c  reason: collision with root package name */
    String f30205c;

    /* renamed from: d  reason: collision with root package name */
    String f30206d;

    /* renamed from: e  reason: collision with root package name */
    HandlerC0635a f30207e;

    /* renamed from: f  reason: collision with root package name */
    com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity> f30208f;

    /* renamed from: g  reason: collision with root package name */
    private final String f30209g;

    /* renamed from: h  reason: collision with root package name */
    private int f30210h;

    /* renamed from: i  reason: collision with root package name */
    private String f30211i;

    /* renamed from: j  reason: collision with root package name */
    private String f30212j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f30213k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30214l;

    /* renamed from: m  reason: collision with root package name */
    private String f30215m;
    private IapPaymentMethod n;

    static {
        Covode.recordClassIndex(17548);
    }

    public final void a() {
        if (this.f30204b >= this.f30210h) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            com.bytedance.globalpayment.payment.common.lib.a.a<OrderStateInfo> aVar = this.f30203a;
            if (aVar != null) {
                aVar.a(new d(204, 2041, "channel pay success, but query order state timeout because query order state retry count is to maxRetryCount."));
                return;
            }
            return;
        }
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        this.f30207e.removeMessages(1);
        b.d().b().a(this.f30206d, this.f30212j, this.f30211i, this.f30205c, this.f30213k, this.f30215m, this.f30208f, this.f30214l);
    }

    /* renamed from: com.bytedance.globalpayment.iap.b.a$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30217a;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.iap.b.a.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.globalpayment.iap.b.a$a  reason: collision with other inner class name */
    public static class HandlerC0635a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private a f30218a;

        static {
            Covode.recordClassIndex(17551);
        }

        public HandlerC0635a(a aVar) {
            super(Looper.getMainLooper());
            this.f30218a = aVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                this.f30218a.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final long a(int i2) {
        int min;
        if (this.n == IapPaymentMethod.AMAZON) {
            min = Math.min(Math.max(i2 * 2, 2), 32);
        } else {
            min = Math.min(Math.max(i2, 1), 5);
        }
        return (long) min;
    }

    public final void a(AckStrategy ackStrategy, com.bytedance.globalpayment.payment.common.lib.a.a<OrderStateInfo> aVar) {
        this.f30203a = aVar;
        ackStrategy.isNeedAckAfterSuccessQuery();
        a();
    }

    public a(IapPaymentMethod iapPaymentMethod, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        this(iapPaymentMethod, str, str2, str3, 8, str4, z, str5, z2);
    }

    public a(IapPaymentMethod iapPaymentMethod, String str, String str2, String str3, int i2, String str4, boolean z, String str5, boolean z2) {
        this.f30209g = a.class.getSimpleName();
        this.f30204b = 0;
        this.f30210h = 0;
        this.f30208f = new com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity>() {
            /* class com.bytedance.globalpayment.iap.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17549);
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.a.a
            public final void a(AbsResult absResult) {
                com.bytedance.globalpayment.payment.common.lib.a.a<OrderStateInfo> aVar = a.this.f30203a;
                if (aVar != null) {
                    aVar.a(absResult);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.globalpayment.payment.common.lib.a.a
            public final /* synthetic */ void a(ResponseEntity responseEntity) {
                OrderStateEnum orderStateEnum;
                ResponseEntity responseEntity2 = responseEntity;
                if (responseEntity2 instanceof OneTimeOrderStateResponseEntity) {
                    a aVar = a.this;
                    OneTimeOrderStateResponseEntity oneTimeOrderStateResponseEntity = (OneTimeOrderStateResponseEntity) responseEntity2;
                    com.bytedance.globalpayment.payment.common.lib.a.a<OrderStateInfo> aVar2 = aVar.f30203a;
                    if (aVar2 != null) {
                        if (oneTimeOrderStateResponseEntity == null || oneTimeOrderStateResponseEntity.data == null) {
                            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                            orderStateEnum = OrderStateEnum.Failed;
                        } else {
                            orderStateEnum = OrderStateEnum.from(oneTimeOrderStateResponseEntity.data.status);
                        }
                        int i2 = AnonymousClass2.f30217a[orderStateEnum.ordinal()];
                        if (i2 != 3) {
                            switch (i2) {
                                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                                    aVar2.a(new OrderStateInfo().setProductId(aVar.f30205c).setOrderId(aVar.f30206d).setOrderState(orderStateEnum));
                                    return;
                                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                    break;
                                default:
                                    int i3 = aVar.f30204b + 1;
                                    aVar.f30204b = i3;
                                    long a2 = aVar.a(i3);
                                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                                    aVar.f30207e.sendEmptyMessageDelayed(1, a2 * 1000);
                                    return;
                            }
                        }
                        aVar2.a(new d(204, orderStateEnum.ordinal(), "query order error because of the entity state, the state is " + orderStateEnum.name()));
                        return;
                    }
                    return;
                }
                a aVar3 = a.this;
                SubscriptionOrderStateResponseEntity subscriptionOrderStateResponseEntity = (SubscriptionOrderStateResponseEntity) responseEntity2;
                com.bytedance.globalpayment.payment.common.lib.a.a<OrderStateInfo> aVar4 = aVar3.f30203a;
                if (aVar4 == null) {
                    return;
                }
                if (subscriptionOrderStateResponseEntity == null || subscriptionOrderStateResponseEntity.data == null || subscriptionOrderStateResponseEntity.data.subsInfo == null) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    aVar4.a(new d(204, 2021, "entity is null when OrderStateManager.onQuerySubscriptionOrderStateSuccess"));
                    return;
                }
                OrderStateEnum from = OrderStateEnum.from(subscriptionOrderStateResponseEntity.data.subsInfo.status);
                switch (AnonymousClass2.f30217a[from.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        aVar4.a(new OrderStateInfo().setProductId(aVar3.f30205c).setOrderId(aVar3.f30206d).setOrderState(OrderStateEnum.from(subscriptionOrderStateResponseEntity.data.subsInfo.status)));
                        return;
                    case 4:
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar4.a(new d(204, from.ordinal(), "query subscription order error because of the entity state, the state is " + from.name()));
                        return;
                    default:
                        int i4 = aVar3.f30204b + 1;
                        aVar3.f30204b = i4;
                        long a3 = aVar3.a(i4);
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        aVar3.f30207e.sendEmptyMessageDelayed(1, a3 * 1000);
                        return;
                }
            }
        };
        this.f30205c = str;
        this.f30206d = str2;
        this.f30212j = str3;
        this.f30210h = i2;
        this.f30207e = new HandlerC0635a(this);
        this.f30211i = str4;
        this.f30213k = z;
        this.f30214l = z2;
        this.f30215m = str5;
        this.n = iapPaymentMethod;
    }
}
