package com.bytedance.helios.sdk.anchor;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.c;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f30766a;

    /* renamed from: b  reason: collision with root package name */
    public int f30767b;

    /* renamed from: c  reason: collision with root package name */
    public List<c> f30768c;

    static {
        Covode.recordClassIndex(17883);
    }

    public final String toString() {
        return this.f30766a + '@' + Integer.toHexString(this.f30767b);
    }

    public a(Activity activity) {
        String str;
        int i2;
        Class<?> cls;
        if (activity == null || (cls = activity.getClass()) == null) {
            str = null;
        } else {
            str = cls.getName();
        }
        this.f30766a = str;
        if (activity != null) {
            i2 = activity.hashCode();
        } else {
            i2 = 0;
        }
        this.f30767b = i2;
    }

    public a(String str, int i2, List<c> list) {
        this.f30766a = str;
        this.f30767b = i2;
        this.f30768c = list;
    }
}
