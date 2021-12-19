package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f6972a;

    /* renamed from: b  reason: collision with root package name */
    List<Integer> f6973b;

    /* renamed from: c  reason: collision with root package name */
    public String f6974c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f6975d;

    /* renamed from: e  reason: collision with root package name */
    List<Integer> f6976e;

    /* renamed from: f  reason: collision with root package name */
    public String f6977f;

    /* renamed from: g  reason: collision with root package name */
    public String f6978g;

    /* renamed from: h  reason: collision with root package name */
    public String f6979h;

    /* renamed from: i  reason: collision with root package name */
    public String f6980i;

    /* renamed from: j  reason: collision with root package name */
    public String f6981j;

    static {
        Covode.recordClassIndex(3350);
    }

    public final List<Integer> a() {
        if (this.f6976e == null) {
            this.f6976e = new ArrayList();
            if (this.f6975d != null) {
                for (int i2 = 0; i2 < this.f6975d.length(); i2++) {
                    try {
                        this.f6976e.add((Integer) this.f6975d.get(i2));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.f6976e;
    }

    public final String toString() {
        return "{mCvvLength=" + this.f6972a + ", mCvvLengthList=" + this.f6973b + ", mCardBrandRegex='" + this.f6974c + '\'' + ", mCardBrandLength=" + this.f6975d + ", mCardBrandLengthList=" + this.f6976e + ", mCardBrandDisplayName='" + this.f6977f + '\'' + ", mCardBrand='" + this.f6978g + '\'' + ", mPaymentMethodId='" + this.f6979h + '\'' + ", mIconUrl='" + this.f6980i + '\'' + ", mDarkIconUrl='" + this.f6981j + '\'' + '}';
    }

    public h(a aVar, f fVar) {
        this.f6972a = aVar.f6871b;
        this.f6974c = aVar.f6872c;
        this.f6975d = aVar.f6873d;
        this.f6977f = aVar.f6874e;
        this.f6978g = aVar.f6875f;
        this.f6979h = fVar.f6955a;
        this.f6980i = fVar.f6957c;
        this.f6981j = fVar.f6958d;
    }
}
