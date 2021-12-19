package com.ss.android.ugc.aweme.activity.processor;

import android.content.Intent;
import android.view.KeyEvent;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

final class LifecycleOnKeyDownListener implements k, u {

    /* renamed from: a  reason: collision with root package name */
    private boolean f65528a;

    /* renamed from: b  reason: collision with root package name */
    private final u f65529b;

    /* renamed from: c  reason: collision with root package name */
    private final m f65530c;

    static {
        Covode.recordClassIndex(40308);
    }

    @Override // com.ss.android.ugc.aweme.activity.processor.u
    public final void a(int i2, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.activity.processor.u
    public final boolean a() {
        if (this.f65528a) {
            return this.f65529b.a();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.activity.processor.u
    public final boolean a(int i2, KeyEvent keyEvent) {
        return this.f65529b.a(i2, keyEvent);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        int i2 = z.f65566a[aVar.ordinal()];
        if (i2 == 1) {
            this.f65528a = true;
        } else if (i2 == 2) {
            this.f65528a = false;
        } else if (i2 == 3) {
            this.f65530c.getLifecycle().b(this);
        }
    }
}
