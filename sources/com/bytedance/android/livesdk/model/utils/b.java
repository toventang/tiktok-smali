package com.bytedance.android.livesdk.model.utils;

import com.bytedance.android.livesdk.model.utils.a.a;
import com.bytedance.android.livesdk.model.utils.a.d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f19776a;

    /* renamed from: b  reason: collision with root package name */
    public String f19777b;

    /* renamed from: c  reason: collision with root package name */
    public String f19778c;

    static {
        Covode.recordClassIndex(11726);
    }

    public final String toString() {
        return a();
    }

    public b() {
        this.f19776a = new ArrayList();
        this.f19778c = "UTF-8";
        this.f19777b = null;
    }

    public final String a() {
        if (this.f19776a.isEmpty()) {
            return this.f19777b;
        }
        String a2 = d.a(this.f19776a, this.f19778c);
        String str = this.f19777b;
        if (str == null || str.length() == 0) {
            return a2;
        }
        int indexOf = this.f19777b.indexOf(63);
        if (indexOf < 0) {
            return this.f19777b + "?" + a2;
        }
        if (this.f19777b.indexOf(61, indexOf) <= 0) {
            return this.f19777b + "&" + a2;
        }
        int i2 = indexOf + 1;
        String substring = this.f19777b.substring(0, i2);
        return substring + a2 + "&" + this.f19777b.substring(i2);
    }

    public b(String str) {
        this.f19776a = new ArrayList();
        this.f19778c = "UTF-8";
        this.f19777b = str;
    }

    public final void a(String str, int i2) {
        this.f19776a.add(new a(str, String.valueOf(i2)));
    }

    public final void a(String str, long j2) {
        this.f19776a.add(new a(str, String.valueOf(j2)));
    }

    public final void a(String str, String str2) {
        this.f19776a.add(new a(str, str2));
    }
}
