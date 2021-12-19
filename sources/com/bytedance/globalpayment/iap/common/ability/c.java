package com.bytedance.globalpayment.iap.common.ability;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.a;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f30261a;

    /* renamed from: b  reason: collision with root package name */
    public String f30262b;

    /* renamed from: c  reason: collision with root package name */
    public long f30263c;

    /* renamed from: d  reason: collision with root package name */
    public String f30264d;

    /* renamed from: e  reason: collision with root package name */
    public String f30265e;

    /* renamed from: f  reason: collision with root package name */
    public String f30266f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30267g;

    /* renamed from: h  reason: collision with root package name */
    public String f30268h;

    /* renamed from: i  reason: collision with root package name */
    public String f30269i = "";

    /* renamed from: j  reason: collision with root package name */
    public boolean f30270j;

    /* renamed from: k  reason: collision with root package name */
    public Map<String, String> f30271k;

    /* renamed from: l  reason: collision with root package name */
    public long f30272l;

    static {
        Covode.recordClassIndex(17563);
    }

    public String toString() {
        return "IapPayRequest{mSign='" + this.f30261a + '\'' + ", mMerchantId='" + this.f30262b + '\'' + ", mTimestamp=" + this.f30263c + ", mDid='" + this.f30264d + '\'' + ", mUid='" + this.f30265e + '\'' + ", mBizContent='" + this.f30266f + '\'' + ", mIsSubscription=" + this.f30267g + ", mProductId='" + this.f30268h + '\'' + ", mExtraPayload='" + this.f30269i + '\'' + ", mHasCreateOrderOnServer=" + this.f30270j + ", mPayRequestParams=" + this.f30271k + ", mStartPayTimeStamp=" + this.f30272l + '}';
    }

    public c(long j2) {
        this.f30272l = j2;
        this.f30271k = new TreeMap();
    }

    public c(JSONObject jSONObject) {
        this.f30262b = jSONObject.optString("merchant_id");
        this.f30269i = jSONObject.optString("extra_payload");
    }
}
