package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class w {

    /* renamed from: d  reason: collision with root package name */
    public static final w f19781d = new w();
    @c(a = "left_icon")

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f19782a;
    @c(a = "display_text")

    /* renamed from: b  reason: collision with root package name */
    public b f19783b;
    @c(a = "schema_url")

    /* renamed from: c  reason: collision with root package name */
    public String f19784c;

    static {
        Covode.recordClassIndex(11728);
    }

    public final boolean a() {
        if (this.f19782a == null || this.f19784c == null) {
            return false;
        }
        return true;
    }
}
