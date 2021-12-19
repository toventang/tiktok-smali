package com.bytedance.o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Type f41737a;

    /* renamed from: b  reason: collision with root package name */
    public final String f41738b;

    /* renamed from: c  reason: collision with root package name */
    private int f41739c = Integer.MIN_VALUE;

    static {
        Covode.recordClassIndex(25538);
    }

    public final int hashCode() {
        int hashCode;
        if (this.f41739c == Integer.MIN_VALUE) {
            int hashCode2 = this.f41737a.hashCode();
            String str = this.f41738b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f41739c = hashCode2 ^ hashCode;
        }
        return this.f41739c;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        if (!TextUtils.isEmpty(this.f41738b)) {
            return this.f41737a.toString() + "(" + this.f41738b + ")";
        }
        return this.f41737a.toString();
    }

    public final String toString() {
        return "ServiceKey{" + String.valueOf(this.f41737a) + " " + this.f41738b + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!t.a(qVar.f41737a, this.f41737a) || !t.a(qVar.f41738b, this.f41738b)) {
            return false;
        }
        return true;
    }

    static q a(Type type, String str) {
        return new q(type, str);
    }

    private q(Type type, String str) {
        this.f41737a = type;
        this.f41738b = str;
    }
}
