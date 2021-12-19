package com.bytedance.scene.group;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import com.bytedance.covode.number.Covode;

public abstract class f extends b {

    /* renamed from: b  reason: collision with root package name */
    public final g f42882b = new g();

    /* renamed from: c  reason: collision with root package name */
    public boolean f42883c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42884d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42885e = false;

    /* renamed from: f  reason: collision with root package name */
    private final l f42886f = new UserVisibleHintGroupScene$1(this);

    static {
        Covode.recordClassIndex(26313);
    }

    @Override // com.bytedance.scene.j
    public void n_() {
        super.n_();
        getLifecycle().b(this.f42886f);
    }

    @Override // com.bytedance.scene.j
    public final boolean z() {
        if (!super.z() || !this.f42883c) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle != null) {
            this.f42883c = bundle.getBoolean("bd-scene-nav:scene_user_visible_hint");
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final void f(Bundle bundle) {
        super.f(bundle);
        bundle.putBoolean("bd-scene-nav:scene_user_visible_hint", this.f42883c);
    }

    @Override // com.bytedance.scene.j
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f42882b.a(i.a.ON_CREATE);
        getLifecycle().a(this.f42886f);
    }

    public void a(boolean z) {
        if (this.f42883c != z) {
            this.f42883c = z;
            A();
            if (this.f42883c) {
                if (this.f42885e) {
                    this.f42882b.a(i.a.ON_START);
                }
                if (this.f42884d) {
                    this.f42882b.a(i.a.ON_RESUME);
                    return;
                }
                return;
            }
            if (this.f42884d) {
                this.f42882b.a(i.a.ON_PAUSE);
            }
            if (this.f42885e) {
                this.f42882b.a(i.a.ON_STOP);
            }
        }
    }
}
