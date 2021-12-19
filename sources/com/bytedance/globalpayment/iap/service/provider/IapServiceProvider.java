package com.bytedance.globalpayment.iap.service.provider;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.a.b;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.d.a;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.g.b.f;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.state.extra.ExtraConsumeState;
import com.bytedance.globalpayment.iap.state.nomal.ConsumeProductState;
import com.bytedance.globalpayment.iap.state.pre.PreregisterConsumeState;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class IapServiceProvider extends a implements a, d, IapExternalService {
    public final String TAG = IapServiceProvider.class.getSimpleName();
    private b mQueryUnAckEdOrderListener = new b() {
        /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17670);
        }

        @Override // com.bytedance.globalpayment.iap.a.b
        public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            if (absResult != null && list != null) {
                if (absResult.getCode() != 0) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    absResult.getMessage();
                } else if (list.isEmpty()) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                } else {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    list.size();
                    if (iapPaymentMethod != IapPaymentMethod.GOOGLE || !PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().isEnableRestoreOrder()) {
                        for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                            absIapChannelOrderData.isSubscription();
                            absIapChannelOrderData.isAcknowledged();
                            absIapChannelOrderData.getOrderState();
                            if (absIapChannelOrderData.isOrderStateSuccess()) {
                                String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                                String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                                if ((iapPaymentMethod == IapPaymentMethod.GOOGLE && !(TextUtils.isEmpty(channelOrderId) && TextUtils.isEmpty(developerPayload))) || iapPaymentMethod == IapPaymentMethod.AMAZON) {
                                    IapServiceProvider.this.executeUnUploadTokenOrder(iapPaymentMethod, absIapChannelOrderData);
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(17669);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.globalpayment.iap.service.provider.a
    public d getIapInternalService() {
        return this;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean hasInitEd() {
        return this.mInitEd.get();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void onAppResume() {
        if (this.mInitEd.get()) {
            queryRewardsInternal(true);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryRewards() {
        if (this.mInitEd.get()) {
            queryRewardsInternal(false);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void init() {
        if (this.mInitEd.getAndSet(true)) {
            com.bytedance.globalpayment.iap.common.ability.b.e().a().a(IapPaymentMethod.GOOGLE, new com.bytedance.globalpayment.iap.common.ability.d(401, 4011, "init failed because repeated init"));
            com.bytedance.globalpayment.iap.common.ability.b.e().a().a(IapPaymentMethod.AMAZON, new com.bytedance.globalpayment.iap.common.ability.d(401, 4011, "init failed because repeated init"));
            return;
        }
        if (com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30545g) {
            PaymentServiceManager.get().getGoogleIapExternalService().setGpListener(this);
            PaymentServiceManager.get().getGoogleIapExternalService().init(new com.bytedance.globalpayment.iap.common.ability.d.b() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(17671);
                }

                @Override // com.bytedance.globalpayment.iap.common.ability.d.b
                public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                    if (dVar == null) {
                        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(IapPaymentMethod.GOOGLE, new com.bytedance.globalpayment.iap.common.ability.d(401, 4012, "google init failed"));
                    } else if (dVar.getCode() == 0) {
                        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(IapPaymentMethod.GOOGLE, new com.bytedance.globalpayment.iap.common.ability.d(0, 0, "init success"));
                        IapServiceProvider.this.tryRestoreUnAckOrder(IapPaymentMethod.GOOGLE);
                    } else {
                        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(IapPaymentMethod.GOOGLE, new com.bytedance.globalpayment.iap.common.ability.d(401, 4012, "google response code is: " + dVar.getCode() + " message is : " + dVar.getMessage()));
                    }
                }
            });
        }
        if (com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30546h) {
            PaymentServiceManager.get().getAmazonIapExternalService().init(new com.bytedance.globalpayment.iap.common.ability.d.b() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(17672);
                }

                @Override // com.bytedance.globalpayment.iap.common.ability.d.b
                public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                    if (dVar == null) {
                        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(IapPaymentMethod.AMAZON, new com.bytedance.globalpayment.iap.common.ability.d(401, 4012, "amazon init failed"));
                    } else if (dVar.getCode() == 0) {
                        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(IapPaymentMethod.AMAZON, new com.bytedance.globalpayment.iap.common.ability.d(0, 0, "init success"));
                        IapServiceProvider.this.tryRestoreUnAckOrder(IapPaymentMethod.AMAZON);
                    } else {
                        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(IapPaymentMethod.AMAZON, new com.bytedance.globalpayment.iap.common.ability.d(401, 4012, "amazon response code is: " + dVar.getCode() + " message is : " + dVar.getMessage()));
                    }
                }
            });
        }
    }

    /* renamed from: com.bytedance.globalpayment.iap.service.provider.IapServiceProvider$9  reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30468a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass9.<clinit>():void");
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void addIapObserver(com.bytedance.globalpayment.iap.common.ability.c.a aVar) {
        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(aVar);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getChannelUserData(IapPaymentMethod iapPaymentMethod) {
        com.bytedance.globalpayment.iap.d.b.d().c().a(iapPaymentMethod);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod) {
        com.bytedance.globalpayment.iap.d.b.d().c().b(iapPaymentMethod);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void onOrderTimeout(OrderInfo orderInfo) {
        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(orderInfo);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.d
    public void removeAcquireRewards(String str) {
        if (this.mRewards != null) {
            this.mRewards.remove(str);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void removeIapObserver(com.bytedance.globalpayment.iap.common.ability.c.a aVar) {
        com.bytedance.globalpayment.iap.common.ability.b.e().a().b(aVar);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.d.a
    public void onCJBillingCallback(OrderData orderData) {
        orderData.setOrderFromOtherSystem(true);
        new com.bytedance.globalpayment.iap.state.extra.b(getIapInternalService()).a(orderData);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod) {
        if (this.mInitEd.get()) {
            com.bytedance.globalpayment.iap.d.b.d().c().c(iapPaymentMethod);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHost(String str) {
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        com.bytedance.globalpayment.iap.common.ability.b.e().d().a(str);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().isSupportGooglePay();
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            return PaymentServiceManager.get().getAmazonIapExternalService().isSupportAmazonPay();
        }
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE && !com.bytedance.globalpayment.payment.common.lib.h.a.a().h().d()) {
            com.bytedance.globalpayment.iap.d.b.d().c().a(iapPaymentMethod, this.mQueryUnAckEdOrderListener);
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            com.bytedance.globalpayment.iap.d.b.d().c().a(iapPaymentMethod, this.mQueryUnAckEdOrderListener);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.d
    public void onIapOrderFinished(OrderData orderData) {
        if (orderData.isFinished()) {
            this.mPayingRequests.remove(orderData);
        }
        if (orderData.isSuccess()) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            this.mUnSuccessEdProductIds.remove(orderData.getProductId());
            return;
        }
        AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
        if (absIapChannelOrderData != null && absIapChannelOrderData.getOrderState() == 1 && !orderData.isConsumed() && !orderData.isQuerySucceed()) {
            this.mUnSuccessEdProductIds.add(orderData.getProductId());
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void acquireReward(final c cVar) {
        if (this.mInitEd.get()) {
            if (cVar == null) {
                f a2 = com.bytedance.globalpayment.iap.common.ability.b.e().a();
                com.bytedance.globalpayment.iap.common.ability.d dVar = new com.bytedance.globalpayment.iap.common.ability.d(201, 2011, "pipoRequest is null when preregisterRewardsPay.");
                dVar.f30274b = cVar;
                dVar.f30275c = PayType.PRE;
                a2.a(dVar, (OrderInfo) null);
                return;
            }
            final OrderData orderData = new OrderData(cVar, PayType.PRE);
            orderData.setIapPaymentMethod(IapPaymentMethod.GOOGLE);
            final String productId = orderData.getProductId();
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            com.bytedance.globalpayment.iap.common.ability.e.b bVar = new com.bytedance.globalpayment.iap.common.ability.e.b(productId, orderData.getOrderId(), cVar.f30267g, PayType.PRE, orderData);
            orderData.setIapPayMonitor(bVar);
            bVar.a();
            com.bytedance.globalpayment.iap.d.b.d().a().b(orderData);
            if (this.mRewards.containsKey(productId)) {
                orderData.setAbsIapChannelOrderData((AbsIapChannelOrderData) this.mRewards.get(productId));
                acquireRewardInternal(orderData);
                return;
            }
            PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(new b() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(17676);
                }

                @Override // com.bytedance.globalpayment.iap.a.b
                public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                    String str = "";
                    if (absResult.getCode() != 0) {
                        com.bytedance.globalpayment.iap.common.ability.d dVar = new com.bytedance.globalpayment.iap.common.ability.d(203, absResult.getCode(), "query purchases success in preregisterRewardsPay, result message is: " + absResult.getMessage());
                        if (orderData.getIapPayRequest() != null) {
                            str = orderData.getIapPayRequest().f30269i;
                        }
                        dVar.f30273a = str;
                        dVar.f30274b = cVar;
                        dVar.f30275c = PayType.PRE;
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        absResult.getMessage();
                        com.bytedance.globalpayment.iap.common.ability.b.e().a().a(dVar, orderData.buildOrderInfo());
                        return;
                    }
                    if (list != null) {
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        list.size();
                        for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                            String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                            String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                            if (TextUtils.isEmpty(channelOrderId) && TextUtils.isEmpty(developerPayload)) {
                                IapServiceProvider.this.mRewards.put(absIapChannelOrderData.getProductId(), absIapChannelOrderData);
                            }
                        }
                    }
                    if (IapServiceProvider.this.mRewards.containsKey(productId)) {
                        orderData.setAbsIapChannelOrderData((AbsIapChannelOrderData) IapServiceProvider.this.mRewards.get(productId));
                        IapServiceProvider.this.acquireRewardInternal(orderData);
                        return;
                    }
                    com.bytedance.globalpayment.iap.common.ability.d dVar2 = new com.bytedance.globalpayment.iap.common.ability.d(203, 2031, "doesn't has preregisterReward [" + productId + "]");
                    if (orderData.getIapPayRequest() != null) {
                        str = orderData.getIapPayRequest().f30269i;
                    }
                    dVar2.f30273a = str;
                    dVar2.f30274b = cVar;
                    dVar2.f30274b = cVar;
                    dVar2.f30275c = PayType.PRE;
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    com.bytedance.globalpayment.iap.common.ability.b.e().a().a(dVar2, orderData.buildOrderInfo());
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public com.bytedance.globalpayment.iap.common.ability.f.a getNextState(com.bytedance.globalpayment.iap.common.ability.f.a aVar) {
        switch (AnonymousClass9.f30468a[aVar.a().ordinal()]) {
            case 1:
                OrderData orderData = aVar.f30286a;
                return com.bytedance.globalpayment.iap.d.b.d().c().a(orderData.getIapPaymentMethod(), getIapInternalService(), this.mActivity.get());
            case 2:
            case 3:
                return new com.bytedance.globalpayment.iap.state.nomal.c(getIapInternalService());
            case 4:
                return new com.bytedance.globalpayment.iap.state.nomal.b(getIapInternalService());
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new ConsumeProductState(getIapInternalService());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new com.bytedance.globalpayment.iap.state.extra.a(getIapInternalService());
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return new ExtraConsumeState(getIapInternalService());
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return new com.bytedance.globalpayment.iap.state.pre.c(getIapInternalService());
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return new com.bytedance.globalpayment.iap.state.pre.b(getIapInternalService());
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return new PreregisterConsumeState(getIapInternalService());
            default:
                return null;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.d.a
    public void onPurchasesUpdated(com.bytedance.globalpayment.iap.common.ability.d dVar, List<AbsIapChannelOrderData> list) {
        queryRewardsInternal(true);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list) {
        if (this.mInitEd.get()) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(list, true, new com.bytedance.globalpayment.payment.common.lib.a.c<AbsIapProduct>() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(17675);
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.a.c
                public final void a(AbsResult absResult, List<AbsIapProduct> list) {
                    if (absResult.getCode() == 0) {
                        com.bytedance.globalpayment.iap.common.ability.b.e().a().b(new com.bytedance.globalpayment.iap.common.ability.d(0, 0, "query success in querySubscriptionDetails."), list);
                        return;
                    }
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    com.bytedance.globalpayment.iap.common.ability.b.e().a().b(new com.bytedance.globalpayment.iap.common.ability.d(301, absResult.getCode(), "query product list details from google service has error, result: " + absResult.getMessage()), list);
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void executeUnUploadTokenOrder(final IapPaymentMethod iapPaymentMethod, final AbsIapChannelOrderData absIapChannelOrderData) {
        if (this.mInitEd.get()) {
            final String productId = absIapChannelOrderData.getProductId();
            for (Object obj : this.mPayingRequests.toArray()) {
                if (TextUtils.equals(((OrderData) obj).getProductId(), productId)) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    return;
                }
            }
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            absIapChannelOrderData.getChannelOrderId();
            ArrayList arrayList = new ArrayList();
            arrayList.add(productId);
            com.bytedance.globalpayment.iap.d.b.d().c().a(iapPaymentMethod, arrayList, absIapChannelOrderData.isSubscription(), new com.bytedance.globalpayment.payment.common.lib.a.c<AbsIapProduct>() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(17677);
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.a.c
                public final void a(AbsResult absResult, List<AbsIapProduct> list) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    absIapChannelOrderData.getChannelOrderId();
                    if (absResult.getCode() != 0) {
                        IapServiceProvider iapServiceProvider = IapServiceProvider.this;
                        IapPaymentMethod iapPaymentMethod = iapPaymentMethod;
                        AbsIapChannelOrderData absIapChannelOrderData = absIapChannelOrderData;
                        iapServiceProvider.restoreOrderByUploadToken(iapPaymentMethod, absIapChannelOrderData, null, absIapChannelOrderData.isSubscription());
                        return;
                    }
                    for (AbsIapProduct absIapProduct : list) {
                        if (absIapProduct.getProductId().equals(productId)) {
                            IapServiceProvider iapServiceProvider2 = IapServiceProvider.this;
                            IapPaymentMethod iapPaymentMethod2 = iapPaymentMethod;
                            AbsIapChannelOrderData absIapChannelOrderData2 = absIapChannelOrderData;
                            iapServiceProvider2.restoreOrderByUploadToken(iapPaymentMethod2, absIapChannelOrderData2, absIapProduct, absIapChannelOrderData2.isSubscription());
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, c cVar) {
        if (this.mInitEd.get()) {
            this.mActivity = new WeakReference(activity);
            if (cVar == null) {
                f a2 = com.bytedance.globalpayment.iap.common.ability.b.e().a();
                com.bytedance.globalpayment.iap.common.ability.d dVar = new com.bytedance.globalpayment.iap.common.ability.d(201, 2011, "PipoPayManger.executeNewPay:pipoRequest is null.");
                dVar.f30274b = cVar;
                dVar.f30275c = PayType.NOMAL;
                a2.a(dVar, (OrderInfo) null);
                return;
            }
            final OrderData orderData = new OrderData(cVar, PayType.NOMAL);
            final com.bytedance.globalpayment.iap.common.ability.e.b bVar = new com.bytedance.globalpayment.iap.common.ability.e.b(orderData.getProductId(), orderData.getOrderId(), cVar.f30267g, PayType.NOMAL, orderData);
            orderData.setIapPayMonitor(bVar);
            bVar.a();
            com.bytedance.globalpayment.iap.d.b.d().a().b(orderData);
            final IapPaymentMethod iapPaymentMethod = orderData.getIapPaymentMethod();
            if (this.mUnSuccessEdProductIds.contains(orderData.getProductId())) {
                com.bytedance.globalpayment.iap.d.b.d().c().a(iapPaymentMethod, new b() {
                    /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(17673);
                    }

                    @Override // com.bytedance.globalpayment.iap.a.b
                    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                        if (absResult != null && list != null && absResult.getCode() == 0 && !list.isEmpty()) {
                            for (Object obj : list.toArray()) {
                                AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
                                if (TextUtils.equals(absIapChannelOrderData.getProductId(), orderData.getProductId())) {
                                    OrderData orderData = orderData;
                                    com.bytedance.globalpayment.iap.common.ability.e.b bVar = bVar;
                                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                                    OrderInfo buildOrderInfo = orderData.buildOrderInfo();
                                    com.bytedance.globalpayment.iap.common.ability.d dVar = new com.bytedance.globalpayment.iap.common.ability.d();
                                    dVar.f30273a = buildOrderInfo.getExtraPayload();
                                    dVar.f30275c = PayType.NOMAL;
                                    dVar.withErrorCode(208).withMessage("PipoPayManger: executeNewPay failed because cur productId is unfinished :" + orderData.getProductId() + ", then call back unFinish error");
                                    bVar.a(dVar, null);
                                    com.bytedance.globalpayment.iap.d.b.d().a().a(orderData, dVar);
                                    com.bytedance.globalpayment.iap.common.ability.b.e().a().a(dVar, buildOrderInfo);
                                    IapServiceProvider.this.executeUnUploadTokenOrder(iapPaymentMethod, absIapChannelOrderData);
                                    return;
                                }
                            }
                        }
                        IapServiceProvider.this.executeNewPayInternal(orderData);
                    }
                });
            } else {
                executeNewPayInternal(orderData);
            }
            tryRestoreUnAckOrder(iapPaymentMethod);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2) {
        com.bytedance.globalpayment.iap.d.b.d().c().a(iapPaymentMethod, str, str2);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(final IapPaymentMethod iapPaymentMethod, List<String> list, final String str) {
        if (this.mInitEd.get()) {
            com.bytedance.globalpayment.iap.d.b.d().c().a(iapPaymentMethod, list, false, (com.bytedance.globalpayment.payment.common.lib.a.c<AbsIapProduct>) new com.bytedance.globalpayment.payment.common.lib.a.c<AbsIapProduct>() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(17674);
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.a.c
                public final void a(AbsResult absResult, List<AbsIapProduct> list) {
                    if (absResult.getCode() == 0) {
                        f a2 = com.bytedance.globalpayment.iap.common.ability.b.e().a();
                        IapPaymentMethod iapPaymentMethod = iapPaymentMethod;
                        com.bytedance.globalpayment.iap.common.ability.d dVar = new com.bytedance.globalpayment.iap.common.ability.d(0, 0, "query success in queryProductDetails.");
                        dVar.f30273a = str;
                        a2.a(iapPaymentMethod, dVar, list);
                        return;
                    }
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    f a3 = com.bytedance.globalpayment.iap.common.ability.b.e().a();
                    IapPaymentMethod iapPaymentMethod2 = iapPaymentMethod;
                    com.bytedance.globalpayment.iap.common.ability.d dVar2 = new com.bytedance.globalpayment.iap.common.ability.d(301, absResult.getCode(), "query product list details from chanel service has error, result: " + absResult.getMessage());
                    dVar2.f30273a = str;
                    a3.a(iapPaymentMethod2, dVar2, list);
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.iap.a.b
    public void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        if (absResult != null && list != null) {
            if (absResult.getCode() != 0) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                absResult.getMessage();
            } else if (list.isEmpty()) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            } else {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                list.size();
                if (!com.bytedance.globalpayment.payment.common.lib.h.a.a().h().d()) {
                    for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        absIapChannelOrderData.isSubscription();
                        absIapChannelOrderData.isAcknowledged();
                        absIapChannelOrderData.getOrderState();
                        if (absIapChannelOrderData.isOrderStateSuccess()) {
                            String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                            String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                            if (!TextUtils.isEmpty(channelOrderId) || !TextUtils.isEmpty(developerPayload)) {
                                executeUnUploadTokenOrder(iapPaymentMethod, absIapChannelOrderData);
                            }
                        }
                    }
                }
            }
        }
    }
}
