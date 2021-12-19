package com.ss.android.ugc.aweme.feed.q;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.b.a.a.b;
import org.greenrobot.eventbus.EventBus;

public abstract class v extends b {
    public boolean bu;

    static {
        Covode.recordClassIndex(59689);
    }

    public boolean aw_() {
        return false;
    }

    public final boolean bV() {
        return this.bu;
    }

    /* access modifiers changed from: protected */
    public boolean aO() {
        Fragment az_ = az_();
        if (az_ == null || !az_.isResumed()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean bU() {
        com.bytedance.ies.uikit.a.b bVar = (com.bytedance.ies.uikit.a.b) az_();
        if (bVar == null || !bVar.f35364f) {
            return false;
        }
        return true;
    }

    public final i bW() {
        Fragment az_ = az_();
        if (az_ == null) {
            return null;
        }
        return az_.getChildFragmentManager();
    }

    /* access modifiers changed from: protected */
    public boolean bD() {
        com.bytedance.ies.uikit.a.b bVar = (com.bytedance.ies.uikit.a.b) az_();
        if (bVar == null || !bVar.ab_()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.b.a.a.b
    public void r() {
        super.r();
        if (aw_()) {
            EventBus.a().b(this);
        }
    }

    public void e(boolean z) {
        this.bu = z;
    }

    @Override // com.ss.android.ugc.b.a.a.b
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (aw_()) {
            EventBus.a(EventBus.a(), this);
        }
    }
}
