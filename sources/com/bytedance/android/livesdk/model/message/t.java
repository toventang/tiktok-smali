package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class t extends a {
    @c(a = "duration")

    /* renamed from: a  reason: collision with root package name */
    public long f19688a = 4000;
    @c(a = "content")

    /* renamed from: f  reason: collision with root package name */
    public String f19689f;
    @c(a = "avatar_url")

    /* renamed from: g  reason: collision with root package name */
    public ImageModel f19690g;
    @c(a = "gift_id")

    /* renamed from: h  reason: collision with root package name */
    public long f19691h;
    @c(a = "hour_rank_info")

    /* renamed from: i  reason: collision with root package name */
    public String f19692i;

    static {
        Covode.recordClassIndex(11697);
    }

    public t() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.FOLLOW_GUIDE;
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
        if (!TextUtils.isEmpty(this.f19689f)) {
            return true;
        }
        return false;
    }
}
