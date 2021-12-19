package com.ss.android.ugc.aweme.detail.d;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.a;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import h.f.b.l;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final e f79623a;

    /* renamed from: c  reason: collision with root package name */
    private final a f79624c;

    static {
        Covode.recordClassIndex(49466);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a, com.ss.android.ugc.aweme.base.ui.a
    public final boolean a(int i2) {
        if (!this.f79624c.a(i2)) {
            return false;
        }
        if (i2 == -1) {
            return ScrollSwitchStateManager.a.a(this.f79623a).b("page_discover");
        }
        return true;
    }

    public b(e eVar, a aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        this.f79623a = eVar;
        this.f79624c = aVar;
    }
}
