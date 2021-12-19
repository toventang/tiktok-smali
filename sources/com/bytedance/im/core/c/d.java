package com.bytedance.im.core.c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f37623a;

    /* renamed from: b  reason: collision with root package name */
    public String f37624b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, Object> f37625c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Object> f37626d = new HashMap<>();

    static {
        Covode.recordClassIndex(22634);
    }

    public final void a() {
        e.a(this.f37623a, this.f37624b, this.f37625c, this.f37626d);
    }

    public final d a(String str, Object obj) {
        this.f37625c.put(str, obj);
        return this;
    }

    public final d b(String str, Object obj) {
        this.f37626d.put(str, obj);
        return this;
    }
}
