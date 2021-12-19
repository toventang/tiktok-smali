package com.ss.android.ugc.aweme.journey;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cm;
import dagger.hilt.a.b;
import dagger.hilt.android.internal.managers.a;

public abstract class f extends cm implements b<Object> {

    /* renamed from: f  reason: collision with root package name */
    private volatile a f104843f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f104844g = new Object();

    static {
        Covode.recordClassIndex(67240);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return a().generatedComponent();
    }

    private a a() {
        if (this.f104843f == null) {
            synchronized (this.f104844g) {
                if (this.f104843f == null) {
                    this.f104843f = new a(this);
                }
            }
        }
        return this.f104843f;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.cm, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
