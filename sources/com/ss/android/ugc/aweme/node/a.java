package com.ss.android.ugc.aweme.node;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.b;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import h.f.b.l;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final e f112630a;

    static {
        Covode.recordClassIndex(72380);
    }

    @Override // com.bytedance.hox.b
    public final boolean b() {
        return true;
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return null;
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        return null;
    }

    @Override // com.bytedance.hox.d
    public final String d() {
        return be.f68531c;
    }

    public a(e eVar) {
        l.d(eVar, "");
        this.f112630a = eVar;
        a(new MainPageNode(eVar));
        a(new ProfilePageNode(eVar));
    }

    @Override // com.bytedance.hox.b
    public final void a(String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        ScrollSwitchStateManager.a.a(this.f112630a).a(str, bundle.getBoolean(be.f68534f, false));
    }
}
