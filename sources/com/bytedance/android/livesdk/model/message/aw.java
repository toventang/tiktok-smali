package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class aw extends a {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public User f19214a;
    @c(a = "title")

    /* renamed from: f  reason: collision with root package name */
    public b f19215f;
    @c(a = "describe")

    /* renamed from: g  reason: collision with root package name */
    public b f19216g;
    @c(a = "combo_count")

    /* renamed from: h  reason: collision with root package name */
    public int f19217h;
    @c(a = "group_count")

    /* renamed from: i  reason: collision with root package name */
    public int f19218i;
    @c(a = "image")

    /* renamed from: j  reason: collision with root package name */
    public ImageModel f19219j;

    static {
        Covode.recordClassIndex(11418);
    }

    public aw() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.TRAY_MESSAGE;
    }
}
