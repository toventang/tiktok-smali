package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ak extends a {
    @c(a = "guide_content")

    /* renamed from: a  reason: collision with root package name */
    public String f19149a;
    @c(a = "button_content")

    /* renamed from: f  reason: collision with root package name */
    public String f19150f;
    @c(a = "connect_type")

    /* renamed from: g  reason: collision with root package name */
    public int f19151g;

    static {
        Covode.recordClassIndex(11402);
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return true;
    }

    public ak() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_CO_HOST_GUIDE;
    }
}
