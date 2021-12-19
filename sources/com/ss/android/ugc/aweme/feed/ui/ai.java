package com.ss.android.ugc.aweme.feed.ui;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

final /* synthetic */ class ai implements u {

    /* renamed from: a  reason: collision with root package name */
    private final af f94231a;

    /* renamed from: b  reason: collision with root package name */
    private final ScrollSwitchStateManager f94232b;

    static {
        Covode.recordClassIndex(59870);
    }

    ai(af afVar, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f94231a = afVar;
        this.f94232b = scrollSwitchStateManager;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        af afVar = this.f94231a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f94232b;
        Integer num = (Integer) obj;
        if (num != null && !TextUtils.equals(scrollSwitchStateManager.a(num.intValue()), "page_feed")) {
            afVar.n.a(0, 0);
        }
    }
}
