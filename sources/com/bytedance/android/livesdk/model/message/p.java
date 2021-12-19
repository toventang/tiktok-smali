package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;

public class p extends a {
    @c(a = "digg_count")

    /* renamed from: a  reason: collision with root package name */
    public int f19665a;
    @c(a = "duration")

    /* renamed from: f  reason: collision with root package name */
    public int f19666f;
    @c(a = b.f37372a)

    /* renamed from: g  reason: collision with root package name */
    public int f19667g;
    @c(a = "user")

    /* renamed from: h  reason: collision with root package name */
    public User f19668h;
    @c(a = "icon")

    /* renamed from: i  reason: collision with root package name */
    public String f19669i;

    static {
        Covode.recordClassIndex(11693);
    }

    public p() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.DIGG;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        if (this.f19668h != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }
}
