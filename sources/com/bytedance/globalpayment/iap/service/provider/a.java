package com.bytedance.globalpayment.iap.service.provider;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.d.b;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class a {
    public final String TAG = a.class.getSimpleName();
    protected WeakReference<Activity> mActivity = new WeakReference<>(null);
    protected AtomicBoolean mInitEd = new AtomicBoolean(false);
    protected List<OrderData> mPayingRequests = Collections.synchronizedList(new ArrayList());
    protected ConcurrentHashMap<String, AbsIapChannelOrderData> mRewards = new ConcurrentHashMap<>();
    protected Set<String> mUnSuccessEdProductIds = Collections.synchronizedSet(new HashSet());

    static {
        Covode.recordClassIndex(17679);
    }

    /* access modifiers changed from: protected */
    public abstract d getIapInternalService();

    /* access modifiers changed from: protected */
    public void acquireRewardInternal(OrderData orderData) {
        new com.bytedance.globalpayment.iap.state.pre.a(getIapInternalService()).a(orderData);
        this.mPayingRequests.add(orderData);
    }

    /* access modifiers changed from: protected */
    public void executeNewPayInternal(final OrderData orderData) {
        b.d().c().a(orderData.getIapPaymentMethod(), new com.bytedance.globalpayment.iap.a.a() {
            /* class com.bytedance.globalpayment.iap.service.provider.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17680);
            }

            @Override // com.bytedance.globalpayment.iap.a.a
            public final void a(String str, String str2) {
                orderData.setChannelUserId(str);
                a.this.payInternal(orderData);
            }
        });
    }

    private void extraUploadToken(OrderData orderData) {
        this.mUnSuccessEdProductIds.add(orderData.getProductId());
        if (orderData.getIapPayMonitor() != null) {
            orderData.getIapPayMonitor().a();
        }
        b.d().a().b(orderData);
        new com.bytedance.globalpayment.iap.state.extra.b(getIapInternalService()).a(orderData);
        this.mPayingRequests.add(orderData);
    }

    /* access modifiers changed from: protected */
    public void queryRewardsInternal(final boolean z) {
        if (this.mInitEd.get()) {
            if (!z || com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30544f) {
                PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(new com.bytedance.globalpayment.iap.a.b() {
                    /* class com.bytedance.globalpayment.iap.service.provider.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(17681);
                    }

                    @Override // com.bytedance.globalpayment.iap.a.b
                    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                        com.bytedance.globalpayment.iap.common.ability.d dVar;
                        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
                            ArrayList arrayList = new ArrayList();
                            if (absResult.getCode() != 0) {
                                dVar = new com.bytedance.globalpayment.iap.common.ability.d(301, absResult.getCode(), absResult.getMessage());
                            } else {
                                dVar = new com.bytedance.globalpayment.iap.common.ability.d(0, 0, "query purchases in queryPreregisterRewards success.");
                                if (list != null) {
                                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                                    list.size();
                                    for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                                        String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                                        String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                                        if (TextUtils.isEmpty(channelOrderId) && TextUtils.isEmpty(developerPayload)) {
                                            a.this.mRewards.put(absIapChannelOrderData.getProductId(), absIapChannelOrderData);
                                            arrayList.add(absIapChannelOrderData.getProductId());
                                        }
                                    }
                                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                                    if (arrayList.size() > 0) {
                                        PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(arrayList, false, new c<AbsIapProduct>() {
                                            /* class com.bytedance.globalpayment.iap.service.provider.a.AnonymousClass2.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(17682);
                                            }

                                            @Override // com.bytedance.globalpayment.payment.common.lib.a.c
                                            public final void a(AbsResult absResult, List<AbsIapProduct> list) {
                                                com.bytedance.globalpayment.iap.common.ability.b.e().a().a(com.bytedance.globalpayment.iap.common.ability.d.a(absResult), z, list);
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                            com.bytedance.globalpayment.iap.common.ability.b.e().a().a(dVar, z, new ArrayList());
                        }
                    }
                });
            }
        }
    }

    public void payInternal(OrderData orderData) {
        if (!com.bytedance.globalpayment.payment.common.lib.h.a.a().h().b().b() || !orderData.getIapPayRequest().f30270j) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            new com.bytedance.globalpayment.iap.state.nomal.a(getIapInternalService()).a(orderData);
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            orderData.execute();
            b.d().c().a(orderData.getIapPaymentMethod(), getIapInternalService(), this.mActivity.get()).a(orderData);
        }
        this.mPayingRequests.add(orderData);
    }

    /* access modifiers changed from: protected */
    public void restoreOrderByUploadToken(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData, AbsIapProduct absIapProduct, boolean z) {
        String str;
        String str2;
        String str3;
        com.bytedance.globalpayment.iap.common.ability.c iapPayRequest;
        String str4 = "";
        if (this.mPayingRequests.size() != 0) {
            str = this.mPayingRequests.get(0).getUserId();
        } else {
            str = str4;
        }
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            Pair<String, Pair<String, String>> b2 = com.bytedance.globalpayment.iap.common.ability.h.a.b(absIapChannelOrderData.getDeveloperPayload());
            if (b2 != null) {
                str = (String) b2.first;
                str3 = (String) ((Pair) b2.second).first;
                String str5 = (String) ((Pair) b2.second).second;
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                JSONObject a2 = com.bytedance.globalpayment.iap.common.ability.h.a.a(str3);
                if (a2 != null) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    str4 = a2.optString("extra_payload", str4);
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = absIapChannelOrderData.getExtraPayload();
                }
                if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str3)) {
                    OrderInfo orderInfo = new OrderInfo();
                    orderInfo.setUserId(str);
                    orderInfo.setProductId(absIapChannelOrderData.getProductId());
                    orderInfo.setIapPaymentMethod(IapPaymentMethod.GOOGLE);
                    com.bytedance.globalpayment.iap.common.ability.d dVar = new com.bytedance.globalpayment.iap.common.ability.d();
                    dVar.withErrorCode(201);
                    dVar.withDetailCode(2012);
                    dVar.withMessage("execute un finished order failed because order info from purchase is null");
                    com.bytedance.globalpayment.iap.common.ability.b.e().a().a(dVar, orderInfo);
                    return;
                }
                str2 = str4;
                str4 = str5;
            } else {
                str2 = str4;
                str3 = str2;
            }
        } else {
            str = absIapChannelOrderData.getMerchantUserId();
            str4 = absIapChannelOrderData.getMerchantId();
            str3 = absIapChannelOrderData.getSelfOrderId();
            str2 = absIapChannelOrderData.getExtraPayload();
        }
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        if (TextUtils.isEmpty(str4)) {
            if (!this.mPayingRequests.isEmpty() && (iapPayRequest = this.mPayingRequests.get(0).getIapPayRequest()) != null) {
                str4 = iapPayRequest.f30262b;
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30542d;
            }
        }
        com.bytedance.globalpayment.iap.common.ability.c cVar = new com.bytedance.globalpayment.iap.common.ability.c(SystemClock.uptimeMillis());
        cVar.f30262b = str4;
        cVar.f30265e = str;
        cVar.f30269i = str2;
        cVar.f30267g = z;
        OrderData orderData = new OrderData(cVar, PayType.EXTRA_TOKEN);
        orderData.setProductId(absIapChannelOrderData.getProductId());
        orderData.setOrderId(str3);
        orderData.setUserId(str);
        orderData.setNewSubscription(absIapChannelOrderData.isNewSubscription());
        orderData.setAbsIapChannelOrderData(absIapChannelOrderData).setAbsIapProduct(absIapProduct);
        orderData.setOrderFromOtherSystem(absIapChannelOrderData.isOrderFromOtherSystem());
        orderData.setHost(absIapChannelOrderData.getHost());
        orderData.setIapPaymentMethod(iapPaymentMethod);
        orderData.setChannelUserId(absIapChannelOrderData.getChannelUserId());
        orderData.setIapPayMonitor(new com.bytedance.globalpayment.iap.common.ability.e.b(orderData.getProductId(), orderData.getOrderId(), cVar.f30267g, PayType.EXTRA_TOKEN, orderData));
        extraUploadToken(orderData);
    }
}
