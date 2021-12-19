package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class a extends com.bytedance.android.livesdk.ac.b.a {
    @c(a = "asset_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19109a;
    @c(a = "panel_display_text")

    /* renamed from: f  reason: collision with root package name */
    public b f19110f;
    @c(a = "show_message")

    /* renamed from: g  reason: collision with root package name */
    public boolean f19111g;
    @c(a = "show_panel")

    /* renamed from: h  reason: collision with root package name */
    public boolean f19112h;
    @c(a = "user")

    /* renamed from: i  reason: collision with root package name */
    public User f19113i;
    @c(a = "to_user")

    /* renamed from: j  reason: collision with root package name */
    public User f19114j;
    @c(a = "priority")

    /* renamed from: k  reason: collision with root package name */
    public x f19115k;

    static {
        Covode.recordClassIndex(11389);
    }

    public a() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.ASSET_MESSAGE;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }
}
