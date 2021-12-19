package com.bytedance.android.livesdk.chatroom.c;

import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public class ah implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f15086a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15087b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15088c;

    /* renamed from: d  reason: collision with root package name */
    private final m.a f15089d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Object> f15090e;

    static {
        Covode.recordClassIndex(8374);
    }

    public String b() {
        return this.f15086a;
    }

    public boolean c() {
        return this.f15087b;
    }

    public int d() {
        return this.f15088c;
    }

    public m.a e() {
        return this.f15089d;
    }

    public Map<String, Object> f() {
        return this.f15090e;
    }

    public ah(String str, boolean z, int i2, m.a aVar, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(aVar, "");
        l.d(map, "");
        this.f15086a = str;
        this.f15087b = z;
        this.f15088c = i2;
        this.f15089d = aVar;
        this.f15090e = map;
    }
}
