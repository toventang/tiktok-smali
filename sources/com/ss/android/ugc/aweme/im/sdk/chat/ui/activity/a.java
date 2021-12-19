package com.ss.android.ugc.aweme.im.sdk.chat.ui.activity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b;

public abstract class a extends b implements dagger.hilt.a.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f101156a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f101157b = new Object();

    static {
        Covode.recordClassIndex(64711);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private dagger.hilt.android.internal.managers.a b() {
        if (this.f101156a == null) {
            synchronized (this.f101157b) {
                if (this.f101156a == null) {
                    this.f101156a = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f101156a;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
