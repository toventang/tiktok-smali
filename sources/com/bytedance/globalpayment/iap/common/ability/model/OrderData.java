package com.bytedance.globalpayment.iap.common.ability.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.e.b;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.a;
import org.json.JSONException;
import org.json.JSONObject;

public class OrderData extends a {
    private final String TAG;
    private AbsIapChannelOrderData mAbsIapChannelOrderData;
    private AbsIapProduct mAbsIapProduct;
    private volatile boolean mCanceled;
    private String mChannelUserId;
    private volatile boolean mConsumed;
    private volatile boolean mExecuted;
    private volatile boolean mFinished;
    private String mHost;
    private b mIapPayMonitor;
    private c mIapPayRequest;
    private IapPaymentMethod mIapPaymentMethod;
    private boolean mIsNewSubscription;
    private String mOrderId;
    private PayType mPayType;
    private String mProductId;
    private volatile boolean mQuerySucceed;
    private long mStartPayTimeStamp;
    private String mUserId;
    private boolean orderFromOtherSystem;

    static {
        Covode.recordClassIndex(17597);
    }

    public void execute() {
        this.mExecuted = true;
    }

    public void finish() {
        this.mFinished = true;
    }

    public AbsIapChannelOrderData getAbsIapChannelOrderData() {
        return this.mAbsIapChannelOrderData;
    }

    public AbsIapProduct getAbsIapProduct() {
        return this.mAbsIapProduct;
    }

    public String getChannelUserId() {
        return this.mChannelUserId;
    }

    public String getHost() {
        return this.mHost;
    }

    public b getIapPayMonitor() {
        return this.mIapPayMonitor;
    }

    public c getIapPayRequest() {
        return this.mIapPayRequest;
    }

    public IapPaymentMethod getIapPaymentMethod() {
        return this.mIapPaymentMethod;
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public PayType getPayType() {
        return this.mPayType;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public long getStartPayTimeStamp() {
        return this.mStartPayTimeStamp;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public boolean isConsumed() {
        return this.mConsumed;
    }

    public boolean isExecuted() {
        return this.mExecuted;
    }

    public boolean isFinished() {
        return this.mFinished;
    }

    public boolean isNewSubscription() {
        return this.mIsNewSubscription;
    }

    public boolean isOrderFromOtherSystem() {
        return this.orderFromOtherSystem;
    }

    public boolean isQuerySucceed() {
        return this.mQuerySucceed;
    }

    public boolean isSuccess() {
        if (!this.mExecuted || !this.mConsumed || !this.mQuerySucceed) {
            return false;
        }
        return true;
    }

    public OrderInfo buildOrderInfo() {
        String str;
        OrderInfo userId = new OrderInfo().setProductId(getProductId()).setOrderId(getOrderId()).setUserId(getUserId());
        c cVar = this.mIapPayRequest;
        if (cVar == null) {
            str = "";
        } else {
            str = cVar.f30269i;
        }
        return userId.setExtraPayload(str).setIapPaymentMethod(this.mIapPaymentMethod);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "user_id", this.mUserId);
        add(jSONObject, "order_id", this.mOrderId);
        add(jSONObject, "host", this.mHost);
        try {
            c cVar = this.mIapPayRequest;
            JSONObject jSONObject2 = new JSONObject();
            cVar.add(jSONObject2, "merchant_id", cVar.f30262b);
            cVar.add(jSONObject2, "extra_payload", cVar.f30269i);
            jSONObject.put("iap_pay_request", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private void parseInfoFromBizContent() {
        boolean z;
        JSONObject optJSONObject;
        String str = this.mIapPayRequest.f30266f;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("SubscriptionMode", -1) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.mIsNewSubscription = z;
                if (z) {
                    this.mOrderId = jSONObject.optString("MerchantSubscriptionID");
                    this.mUserId = jSONObject.optString("UserID");
                    this.mProductId = jSONObject.optString("ProductID");
                    this.mIapPaymentMethod = IapPaymentMethod.GOOGLE;
                } else if (this.mIapPayRequest.f30267g) {
                    this.mIapPaymentMethod = IapPaymentMethod.GOOGLE;
                    this.mOrderId = jSONObject.optString("MerchantSubscriptionID");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("UserInfo");
                    if (optJSONObject2 != null) {
                        this.mUserId = optJSONObject2.optString("UserId");
                    }
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("ChannelSubscriptionParams");
                    if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("GPParams")) != null) {
                        this.mProductId = optJSONObject.optString("ProductID");
                    }
                } else {
                    this.mOrderId = jSONObject.optString("order_id");
                    this.mUserId = jSONObject.optString("merchant_user_id");
                    this.mProductId = new JSONObject(jSONObject.optString("goods_detail")).optString("product_id");
                    String optString = jSONObject.optString("payment_method");
                    if (TextUtils.equals(optString, IapPaymentMethod.GOOGLE.channelName)) {
                        this.mIapPaymentMethod = IapPaymentMethod.GOOGLE;
                    } else if (TextUtils.equals(optString, IapPaymentMethod.AMAZON.channelName)) {
                        this.mIapPaymentMethod = IapPaymentMethod.AMAZON;
                    } else {
                        throw new RuntimeException("invalid payment_method!");
                    }
                }
            } catch (JSONException e2) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                e2.getLocalizedMessage();
            }
        }
    }

    public OrderData setAbsIapChannelOrderData(AbsIapChannelOrderData absIapChannelOrderData) {
        this.mAbsIapChannelOrderData = absIapChannelOrderData;
        return this;
    }

    public OrderData setAbsIapProduct(AbsIapProduct absIapProduct) {
        this.mAbsIapProduct = absIapProduct;
        return this;
    }

    public OrderData setCanceled(boolean z) {
        this.mCanceled = z;
        return this;
    }

    public OrderData setChannelUserId(String str) {
        this.mChannelUserId = str;
        return this;
    }

    public OrderData setConsumed(boolean z) {
        this.mConsumed = z;
        return this;
    }

    public OrderData setExecuted(boolean z) {
        this.mExecuted = z;
        return this;
    }

    public OrderData setFinished(boolean z) {
        this.mFinished = z;
        return this;
    }

    public OrderData setHost(String str) {
        this.mHost = str;
        return this;
    }

    public OrderData setIapPayMonitor(b bVar) {
        this.mIapPayMonitor = bVar;
        return this;
    }

    public OrderData setIapPayRequest(c cVar) {
        this.mIapPayRequest = cVar;
        return this;
    }

    public OrderData setIapPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        this.mIapPaymentMethod = iapPaymentMethod;
        return this;
    }

    public OrderData setNewSubscription(boolean z) {
        this.mIsNewSubscription = z;
        return this;
    }

    public OrderData setOrderFromOtherSystem(boolean z) {
        this.orderFromOtherSystem = z;
        return this;
    }

    public OrderData setOrderId(String str) {
        this.mOrderId = str;
        return this;
    }

    public OrderData setPayType(PayType payType) {
        this.mPayType = payType;
        return this;
    }

    public OrderData setProductId(String str) {
        this.mProductId = str;
        return this;
    }

    public OrderData setQuerySucceed(boolean z) {
        this.mQuerySucceed = z;
        return this;
    }

    public OrderData setStartPayTimeStamp(long j2) {
        this.mStartPayTimeStamp = j2;
        return this;
    }

    public OrderData setUserId(String str) {
        this.mUserId = str;
        return this;
    }

    public OrderData(c cVar) {
        this(cVar, PayType.NOMAL);
    }

    public OrderData(JSONObject jSONObject) {
        this.TAG = OrderData.class.getSimpleName();
        this.mPayType = PayType.NOMAL;
        try {
            this.mUserId = jSONObject.optString("user_id");
            this.mOrderId = jSONObject.optString("order_id");
            this.mHost = jSONObject.optString("host");
            this.mIapPayRequest = new c(jSONObject.optJSONObject("iap_pay_request"));
        } catch (Throwable unused) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        }
    }

    public OrderData(c cVar, PayType payType) {
        this.TAG = OrderData.class.getSimpleName();
        this.mPayType = PayType.NOMAL;
        this.mStartPayTimeStamp = cVar.f30272l;
        this.mPayType = payType;
        this.mIapPayRequest = cVar;
        this.orderFromOtherSystem = false;
        parseInfoFromBizContent();
    }
}
