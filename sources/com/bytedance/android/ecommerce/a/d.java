package com.bytedance.android.ecommerce.a;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.k.j;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6948a = true;

    /* renamed from: b  reason: collision with root package name */
    public List<d> f6949b;

    /* renamed from: c  reason: collision with root package name */
    private String f6950c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f6951d;

    static {
        Covode.recordClassIndex(3346);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f6951d)) {
            return j.a(this.f6950c, new String[0]);
        }
        return j.a(this.f6950c, this.f6951d);
    }

    public final String toString() {
        return "{mIsValid=" + this.f6948a + ", mErrorMessage='" + a() + '\'' + ", mChildElementValidity=" + this.f6949b + '}';
    }

    public static d a(String str) {
        throw new RuntimeException(str);
    }

    public final void a(d dVar) {
        if (this.f6949b == null) {
            this.f6949b = new ArrayList();
        }
        this.f6949b.add(dVar);
    }

    public final d a(String str, String... strArr) {
        this.f6950c = str;
        if (strArr.length > 0) {
            this.f6951d = strArr[0];
        }
        return this;
    }
}
