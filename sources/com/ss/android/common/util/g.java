package com.ss.android.common.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.a.a.a;
import com.ss.android.http.a.b.d;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f59389a;

    /* renamed from: b  reason: collision with root package name */
    public String f59390b;

    /* renamed from: c  reason: collision with root package name */
    public String f59391c;

    static {
        Covode.recordClassIndex(36677);
    }

    public final String toString() {
        return a();
    }

    public g() {
        this.f59389a = new ArrayList();
        this.f59391c = "UTF-8";
        this.f59390b = null;
    }

    public final String a() {
        if (this.f59389a.isEmpty()) {
            return this.f59390b;
        }
        String a2 = a.a(this.f59389a, this.f59391c);
        String str = this.f59390b;
        if (str == null || str.length() == 0) {
            return a2;
        }
        if (this.f59390b.indexOf(63) >= 0) {
            return this.f59390b + "&" + a2;
        }
        return this.f59390b + "?" + a2;
    }

    public g(String str) {
        this.f59389a = new ArrayList();
        this.f59391c = "UTF-8";
        this.f59390b = str;
    }

    public final void a(String str, double d2) {
        this.f59389a.add(new d(str, String.valueOf(d2)));
    }

    public final void a(String str, int i2) {
        this.f59389a.add(new d(str, String.valueOf(i2)));
    }

    public final void a(String str, long j2) {
        this.f59389a.add(new d(str, String.valueOf(j2)));
    }

    public final void a(String str, String str2) {
        this.f59389a.add(new d(str, str2));
    }
}
