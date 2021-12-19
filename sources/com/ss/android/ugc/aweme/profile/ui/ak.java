package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import dagger.hilt.a.b;

abstract class ak extends a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f116867a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f116868b = new Object();

    static {
        Covode.recordClassIndex(75474);
    }

    ak() {
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return a().generatedComponent();
    }

    private dagger.hilt.android.internal.managers.a a() {
        if (this.f116867a == null) {
            synchronized (this.f116868b) {
                if (this.f116867a == null) {
                    this.f116867a = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f116867a;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
