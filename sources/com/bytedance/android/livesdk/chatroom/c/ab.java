package com.bytedance.android.livesdk.chatroom.c;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class ab extends ah {

    /* renamed from: a  reason: collision with root package name */
    public final String f15070a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15071b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15072c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15073d;

    /* renamed from: e  reason: collision with root package name */
    private final m.a f15074e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f15075f;

    static {
        Covode.recordClassIndex(8368);
    }

    @Override // com.bytedance.android.livesdk.chatroom.c.ah
    public final String b() {
        return this.f15071b;
    }

    @Override // com.bytedance.android.livesdk.chatroom.c.ah
    public final boolean c() {
        return this.f15073d;
    }

    @Override // com.bytedance.android.livesdk.chatroom.c.ah
    public final int d() {
        return this.f15072c;
    }

    @Override // com.bytedance.android.livesdk.chatroom.c.ah
    public final m.a e() {
        return this.f15074e;
    }

    @Override // com.bytedance.android.livesdk.chatroom.c.ah
    public final Map<String, Object> f() {
        return this.f15075f;
    }

    public final boolean a() {
        return TextUtils.equals(this.f15070a, this.f15071b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ab(String str, String str2, boolean z, int i2, m.a aVar, Map<String, ? extends Object> map) {
        super(str2, z, i2, aVar, map);
        l.d(str2, "");
        l.d(aVar, "");
        l.d(map, "");
        this.f15070a = str;
        this.f15071b = str2;
        this.f15073d = z;
        this.f15072c = i2;
        this.f15074e = aVar;
        this.f15075f = map;
    }
}
