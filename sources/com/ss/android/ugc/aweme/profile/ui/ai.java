package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import dagger.hilt.a.b;

abstract class ai extends a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f116862a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f116863b = new Object();

    static {
        Covode.recordClassIndex(75472);
    }

    ai() {
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return a().generatedComponent();
    }

    private dagger.hilt.android.internal.managers.a a() {
        if (this.f116862a == null) {
            synchronized (this.f116863b) {
                if (this.f116862a == null) {
                    this.f116862a = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f116862a;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        ((bi) generatedComponent()).a((ProfileEditActivity) this);
        super.onCreate(bundle);
    }
}
