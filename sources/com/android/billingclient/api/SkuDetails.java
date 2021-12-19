package com.android.billingclient.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import org.json.JSONObject;

public class SkuDetails {

    /* renamed from: a  reason: collision with root package name */
    public final String f5780a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f5781b;

    static {
        Covode.recordClassIndex(2423);
    }

    public int hashCode() {
        return this.f5780a.hashCode();
    }

    public final String a() {
        return this.f5781b.optString("productId");
    }

    public final String b() {
        return this.f5781b.optString("packageName");
    }

    public final String c() {
        return this.f5781b.optString(StringSet.type);
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f5781b.optString("skuDetailsToken");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f5780a);
        if (valueOf.length() != 0) {
            return "SkuDetails: ".concat(valueOf);
        }
        return new String("SkuDetails: ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f5780a, ((SkuDetails) obj).f5780a);
    }

    public SkuDetails(String str) {
        this.f5780a = str;
        this.f5781b = new JSONObject(str);
        if (TextUtils.isEmpty(a())) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(c())) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<SkuDetails> f5782a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5783b;

        /* renamed from: c  reason: collision with root package name */
        public final String f5784c;

        static {
            Covode.recordClassIndex(2424);
        }

        public a(int i2, String str, List<SkuDetails> list) {
            this.f5783b = i2;
            this.f5784c = str;
            this.f5782a = list;
        }
    }
}
