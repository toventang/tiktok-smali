package com.bytedance.android.ecommerce.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f6935a;

    /* renamed from: b  reason: collision with root package name */
    public String f6936b;

    /* renamed from: c  reason: collision with root package name */
    public String f6937c;

    /* renamed from: d  reason: collision with root package name */
    public String f6938d;

    /* renamed from: e  reason: collision with root package name */
    public String f6939e;

    /* renamed from: f  reason: collision with root package name */
    public JSONArray f6940f;

    /* renamed from: g  reason: collision with root package name */
    public String f6941g;

    /* renamed from: h  reason: collision with root package name */
    public String f6942h;

    /* renamed from: i  reason: collision with root package name */
    public String f6943i;

    /* renamed from: j  reason: collision with root package name */
    public List<Object> f6944j;

    /* renamed from: k  reason: collision with root package name */
    public String f6945k;

    /* renamed from: l  reason: collision with root package name */
    public String f6946l;

    /* renamed from: m  reason: collision with root package name */
    public List<c> f6947m;
    public Object n;
    private List<e> o;

    static {
        Covode.recordClassIndex(3345);
    }

    public final boolean a() {
        return TextUtils.equals(this.f6941g, "R");
    }

    private List<c> c() {
        ArrayList arrayList = new ArrayList();
        List<c> list = this.f6947m;
        if (list != null) {
            for (c cVar : list) {
                arrayList.addAll(cVar.c());
            }
        }
        return arrayList;
    }

    public final List<e> b() {
        if (this.o == null) {
            this.o = new ArrayList();
            if (this.f6940f != null) {
                for (int i2 = 0; i2 < this.f6940f.length(); i2++) {
                    this.o.add(new e(this.f6940f.optJSONObject(i2)));
                }
            }
        }
        return this.o;
    }

    public final String toString() {
        return "{mElement='" + this.f6935a + '\'' + ", mIconUrl='" + this.f6936b + '\'' + ", mDarkIconUrl='" + this.f6937c + '\'' + ", mStartlingKey='" + this.f6938d + '\'' + ", mStyleType='" + this.f6939e + '\'' + ", mFrontendRuleJsonArray=" + this.f6940f + ", mFrontendRuleList=" + this.o + ", mDisplayTag='" + this.f6941g + '\'' + ", mParamName='" + this.f6942h + '\'' + ", mParamValue='" + this.f6943i + '\'' + ", mOptions=" + this.f6944j + ", mPlaceHolder='" + this.f6945k + '\'' + ", mDisplayOrder='" + this.f6946l + '\'' + ", mSubElementList=" + this.f6947m + '}';
    }

    public c(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f6935a = jSONObject.optString("element");
            this.f6938d = jSONObject.optString("starling_key");
            this.f6939e = jSONObject.optString("style_type");
            this.f6941g = jSONObject.optString("display_tag");
            this.f6942h = jSONObject.optString("param_name");
            this.f6946l = jSONObject.optString("display_order");
            JSONArray optJSONArray = jSONObject.optJSONArray("sub_element_list");
            this.f6947m = new ArrayList();
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    try {
                        this.f6947m.add(new c((JSONObject) optJSONArray.get(i2)));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            this.f6947m.addAll(c());
        }
    }
}
