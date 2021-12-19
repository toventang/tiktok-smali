package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class cc extends a {
    @c(a = "chat_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19462a;
    @c(a = "content")

    /* renamed from: f  reason: collision with root package name */
    public String f19463f;
    @c(a = "user")

    /* renamed from: g  reason: collision with root package name */
    public User f19464g;
    @c(a = "screen_chat_type")

    /* renamed from: h  reason: collision with root package name */
    public int f19465h;
    @c(a = "priority")

    /* renamed from: i  reason: collision with root package name */
    public int f19466i;
    @c(a = "effect_v2")

    /* renamed from: j  reason: collision with root package name */
    public h f19467j;
    @c(a = "background_image_v2")

    /* renamed from: k  reason: collision with root package name */
    public ImageModel f19468k;

    static {
        Covode.recordClassIndex(11522);
    }

    public cc() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.SCREEN;
    }

    public final boolean c() {
        if (this.f19466i != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        if (this.f19464g == null || TextUtils.isEmpty(this.f19463f)) {
            return false;
        }
        return true;
    }
}
