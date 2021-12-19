package com.ss.android.ugc.aweme.detail.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import dagger.hilt.a.b;

/* access modifiers changed from: package-private */
public abstract class ak extends a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f79924a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f79925b = new Object();

    static {
        Covode.recordClassIndex(49720);
    }

    ak() {
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return a().generatedComponent();
    }

    private dagger.hilt.android.internal.managers.a a() {
        if (this.f79924a == null) {
            synchronized (this.f79925b) {
                if (this.f79924a == null) {
                    this.f79924a = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f79924a;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
