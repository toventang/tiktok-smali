package com.ss.android.ugc.aweme.favorites.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import dagger.hilt.a.b;

abstract class h extends a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f90891a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f90892b = new Object();

    static {
        Covode.recordClassIndex(57134);
    }

    h() {
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return a().generatedComponent();
    }

    private dagger.hilt.android.internal.managers.a a() {
        if (this.f90891a == null) {
            synchronized (this.f90892b) {
                if (this.f90891a == null) {
                    this.f90891a = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f90891a;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        ((w) generatedComponent()).a((UserFavoritesActivity) this);
        super.onCreate(bundle);
    }
}
