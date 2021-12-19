package com.bytedance.android.live.effect.model;

import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.covode.number.Covode;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private String f9888b;

    static {
        Covode.recordClassIndex(5062);
    }

    public final void a() {
        if (this.f9874a != null) {
            this.f9874a.a((String) null, 1.0f);
        }
    }

    public final void a(String str, float f2) {
        this.f9888b = str;
        if (this.f9874a == null) {
            return;
        }
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            this.f9874a.a(this.f9888b, f2);
        } else {
            this.f9874a.a(this.f9888b, 1.0f);
        }
    }
}
