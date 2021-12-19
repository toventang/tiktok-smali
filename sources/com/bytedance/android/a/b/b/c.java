package com.bytedance.android.a.b.b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f6704a = -1;

    /* renamed from: b  reason: collision with root package name */
    public String f6705b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<String>> f6706c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6707d;

    /* renamed from: e  reason: collision with root package name */
    public final b f6708e;

    /* renamed from: f  reason: collision with root package name */
    public Throwable f6709f;

    static {
        Covode.recordClassIndex(3231);
    }

    public final boolean a() {
        int i2 = this.f6704a;
        if (i2 < 200 || i2 >= 300) {
            return false;
        }
        return true;
    }

    public static c a(Throwable th, b bVar) {
        return new c(-1, th.getMessage(), null, bVar, th);
    }

    public c(int i2, String str, Map<String, List<String>> map, b bVar, Throwable th) {
        this.f6704a = i2;
        this.f6705b = str;
        this.f6706c = map;
        this.f6708e = bVar;
        this.f6709f = th;
        this.f6707d = System.currentTimeMillis();
    }
}
