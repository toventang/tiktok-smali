package com.ss.android.ugc.aweme.homepage.ui.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.a;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import h.f.b.l;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final e f99499a;

    /* renamed from: c  reason: collision with root package name */
    private final b f99500c;

    static {
        Covode.recordClassIndex(63464);
    }

    private final boolean a() {
        if (!ScrollSwitchStateManager.a.a(this.f99499a).b("page_feed") || !l.a((Object) ScrollSwitchStateManager.a.a(this.f99499a).f99148j, (Object) "USER")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a, com.ss.android.ugc.aweme.base.ui.a
    public final boolean a(int i2) {
        if (!this.f99500c.a(i2) && !a()) {
            return false;
        }
        if (i2 == -1) {
            if (ScrollSwitchStateManager.a.a(this.f99499a).b("page_discover") || a()) {
                return true;
            }
            return false;
        } else if (i2 != 1 || !a()) {
            return true;
        } else {
            return false;
        }
    }

    public c(e eVar, b bVar) {
        l.d(eVar, "");
        l.d(bVar, "");
        this.f99499a = eVar;
        this.f99500c = bVar;
    }
}
