package com.ss.android.ugc.aweme.main;

import android.os.Bundle;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import dagger.hilt.a.b;

/* access modifiers changed from: package-private */
public abstract class h extends a implements b<Object> {
    private volatile dagger.hilt.android.internal.managers.a componentManager;
    private final Object componentManagerLock = new Object();

    static {
        Covode.recordClassIndex(69978);
    }

    /* access modifiers changed from: protected */
    public void inject() {
        generatedComponent();
    }

    /* access modifiers changed from: protected */
    public dagger.hilt.android.internal.managers.a createComponentManager() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    h() {
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public ad.b getDefaultViewModelProviderFactory() {
        ad.b a2 = dagger.hilt.android.internal.b.a.a(this);
        if (a2 != null) {
            return a2;
        }
        return new ad.d();
    }

    /* access modifiers changed from: protected */
    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        inject();
        super.onCreate(bundle);
    }
}
