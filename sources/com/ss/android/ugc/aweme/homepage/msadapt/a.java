package com.ss.android.ugc.aweme.homepage.msadapt;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import dagger.hilt.a.b;

public abstract class a extends com.bytedance.ies.foundation.activity.a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f99203a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f99204b = new Object();

    static {
        Covode.recordClassIndex(63202);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return a().generatedComponent();
    }

    private dagger.hilt.android.internal.managers.a a() {
        if (this.f99203a == null) {
            synchronized (this.f99204b) {
                if (this.f99203a == null) {
                    this.f99203a = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f99203a;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
