package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ce extends a {
    @c(a = "action")

    /* renamed from: a  reason: collision with root package name */
    public long f19470a;
    @c(a = "user")

    /* renamed from: f  reason: collision with root package name */
    public User f19471f;
    @c(a = "share_target")

    /* renamed from: g  reason: collision with root package name */
    public String f19472g;
    @c(a = "share_type")

    /* renamed from: h  reason: collision with root package name */
    public long f19473h;
    @c(a = "share_display_style")

    /* renamed from: i  reason: collision with root package name */
    public long f19474i;
    @c(a = "share_count")

    /* renamed from: j  reason: collision with root package name */
    public int f19475j;

    static {
        Covode.recordClassIndex(11524);
    }

    public ce() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.SOCIAL;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        if (this.f19471f != null) {
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
