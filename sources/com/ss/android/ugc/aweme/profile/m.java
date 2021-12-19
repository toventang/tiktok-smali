package com.ss.android.ugc.aweme.profile;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.a;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import h.f.b.l;
import org.json.JSONObject;

final /* synthetic */ class m implements u {

    /* renamed from: a  reason: collision with root package name */
    private final k f116500a;

    /* renamed from: b  reason: collision with root package name */
    private final ScrollSwitchStateManager f116501b;

    static {
        Covode.recordClassIndex(75195);
    }

    m(k kVar, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f116500a = kVar;
        this.f116501b = scrollSwitchStateManager;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        k kVar = this.f116500a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f116501b;
        Integer num = (Integer) obj;
        if (kVar.getActivity() != null && num != null && num.intValue() != 0 && k.a(kVar.f116487l)) {
            kVar.f116487l = kVar.a(kVar.f116487l, 0);
            u<Integer> uVar = kVar.f116486k;
            l.d(uVar, "");
            scrollSwitchStateManager.f99143e.removeObserver(uVar);
            a.a("lazy_do_aweme_changed", new JSONObject());
        }
    }
}
