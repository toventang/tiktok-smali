package com.android.billingclient.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

public class Purchase {

    /* renamed from: a  reason: collision with root package name */
    public final String f5773a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5774b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f5775c;

    static {
        Covode.recordClassIndex(2420);
    }

    public int hashCode() {
        return this.f5773a.hashCode();
    }

    public final String a() {
        return this.f5775c.optString("orderId");
    }

    public final String b() {
        return this.f5775c.optString("productId");
    }

    public final String c() {
        JSONObject jSONObject = this.f5775c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final int d() {
        if (this.f5775c.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    public final boolean e() {
        return this.f5775c.optBoolean("acknowledged", true);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f5773a);
        if (valueOf.length() != 0) {
            return "Purchase. Json: ".concat(valueOf);
        }
        return new String("Purchase. Json: ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (!TextUtils.equals(this.f5773a, purchase.f5773a) || !TextUtils.equals(this.f5774b, purchase.f5774b)) {
            return false;
        }
        return true;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<Purchase> f5776a;

        /* renamed from: b  reason: collision with root package name */
        public final h f5777b;

        static {
            Covode.recordClassIndex(2421);
        }

        public a(h hVar, List<Purchase> list) {
            this.f5776a = list;
            this.f5777b = hVar;
        }
    }

    public Purchase(String str, String str2) {
        this.f5773a = str;
        this.f5774b = str2;
        this.f5775c = new JSONObject(str);
    }
}
