package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f6955a;

    /* renamed from: b  reason: collision with root package name */
    public String f6956b;

    /* renamed from: c  reason: collision with root package name */
    public String f6957c;

    /* renamed from: d  reason: collision with root package name */
    public String f6958d;

    /* renamed from: e  reason: collision with root package name */
    public String f6959e;

    /* renamed from: f  reason: collision with root package name */
    public String f6960f;

    /* renamed from: g  reason: collision with root package name */
    public String f6961g;

    /* renamed from: h  reason: collision with root package name */
    public List<c> f6962h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, c> f6963i;

    /* renamed from: j  reason: collision with root package name */
    public String f6964j;

    /* renamed from: k  reason: collision with root package name */
    public String f6965k;

    /* renamed from: l  reason: collision with root package name */
    public String f6966l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6967m;
    public boolean n;
    public String o;
    public List<f> p;

    static {
        Covode.recordClassIndex(3348);
    }

    private List<f> a() {
        ArrayList arrayList = new ArrayList();
        List<f> list = this.p;
        if (list != null) {
            for (f fVar : list) {
                arrayList.addAll(fVar.a());
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "{mPaymentMethodId='" + this.f6955a + '\'' + ", mPaymentMethod='" + this.f6956b + '\'' + ", mIconUrl='" + this.f6957c + '\'' + ", mDarkModeIconUrl='" + this.f6958d + '\'' + ", mPaymentMethodType='" + this.f6959e + '\'' + ", mDisplayName='" + this.f6960f + '\'' + ", mStarlingKey='" + this.f6961g + '\'' + ", mElements=" + this.f6962h + ", mElementMap=" + this.f6963i + ", mMaxLimitedAmount='" + this.f6964j + '\'' + ", mMinLimitedAmount='" + this.f6965k + '\'' + ", mCurrency='" + this.f6966l + '\'' + ", mIsPciSensitive=" + this.f6967m + ", mIsSaveAble=" + this.n + ", mPackageName='" + this.o + '\'' + ", mSubPaymentMethods='" + this.p + '\'' + '}';
    }

    public f(JSONObject jSONObject) {
        a(jSONObject);
    }

    public final c a(String str) {
        return this.f6963i.get(str);
    }

    private void a(JSONObject jSONObject) {
        this.f6963i = new HashMap();
        this.f6955a = jSONObject.optString("payment_method_id");
        this.f6956b = jSONObject.optString("payment_method");
        this.f6957c = jSONObject.optString("icon_url");
        this.f6958d = jSONObject.optString("dark_mode_icon_url");
        this.f6959e = jSONObject.optString("payment_method_type");
        this.f6960f = jSONObject.optString("display_name");
        this.f6961g = jSONObject.optString("starling_key");
        this.f6964j = jSONObject.optString("max_limited_amount");
        this.f6965k = jSONObject.optString("min_limited_amount");
        this.f6967m = jSONObject.optBoolean("pci_sensitive");
        this.n = jSONObject.optBoolean("saveable");
        this.o = jSONObject.optString("package_name");
        this.f6962h = new ArrayList();
        this.f6963i = new HashMap();
        JSONArray optJSONArray = jSONObject.optJSONArray("elements");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    c cVar = new c((JSONObject) optJSONArray.get(i2));
                    this.f6962h.add(cVar);
                    this.f6962h.addAll(cVar.f6947m);
                    for (c cVar2 : cVar.f6947m) {
                        this.f6963i.put(cVar2.f6935a, cVar2);
                    }
                    this.f6963i.put(cVar.f6935a, cVar);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        this.p = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sub_payment_methods");
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                try {
                    this.p.add(new f((JSONObject) optJSONArray2.get(i3)));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
        this.p.addAll(a());
    }
}
