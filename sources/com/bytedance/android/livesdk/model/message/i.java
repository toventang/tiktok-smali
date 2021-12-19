package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class i extends a {
    @c(a = "chat_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19628a;
    @c(a = "content")

    /* renamed from: f  reason: collision with root package name */
    public String f19629f;
    @c(a = "user")

    /* renamed from: g  reason: collision with root package name */
    public User f19630g;
    @c(a = "visible_to_sender")

    /* renamed from: h  reason: collision with root package name */
    public boolean f19631h;
    @c(a = "background_image")

    /* renamed from: i  reason: collision with root package name */
    public ImageModel f19632i;
    @c(a = "full_screen_text_color")

    /* renamed from: j  reason: collision with root package name */
    public String f19633j = "#FF0000";

    /* renamed from: k  reason: collision with root package name */
    public transient String f19634k;

    static {
        Covode.recordClassIndex(11685);
    }

    public i() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.CHAT;
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
        if (this.f19630g == null || TextUtils.isEmpty(this.f19629f)) {
            return false;
        }
        return true;
    }
}
