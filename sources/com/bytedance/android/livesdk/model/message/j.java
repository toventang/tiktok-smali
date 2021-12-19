package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;

public class j extends a {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public User f19635a;
    @c(a = "content")

    /* renamed from: f  reason: collision with root package name */
    public String f19636f;
    @c(a = b.f37372a)

    /* renamed from: g  reason: collision with root package name */
    public String f19637g;
    @c(a = "back_ground")

    /* renamed from: h  reason: collision with root package name */
    public ImageModel f19638h;
    @c(a = "action_type")

    /* renamed from: i  reason: collision with root package name */
    public long f19639i;
    @c(a = "action_content")

    /* renamed from: j  reason: collision with root package name */
    public String f19640j;

    static {
        Covode.recordClassIndex(11686);
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return true;
    }

    public j() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.COMMENT_IMAGE;
    }
}
