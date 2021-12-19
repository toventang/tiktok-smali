package com.ss.android.ugc.aweme.music.search;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;

public abstract class b extends a implements dagger.hilt.a.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f111680a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f111681b = new Object();

    static {
        Covode.recordClassIndex(71778);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return a().generatedComponent();
    }

    private dagger.hilt.android.internal.managers.a a() {
        if (this.f111680a == null) {
            synchronized (this.f111681b) {
                if (this.f111680a == null) {
                    this.f111680a = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f111680a;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
