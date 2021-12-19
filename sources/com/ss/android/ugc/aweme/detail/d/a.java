package com.ss.android.ugc.aweme.detail.d;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.base.ui.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f79622a;

    static {
        Covode.recordClassIndex(49465);
    }

    public a(e eVar) {
        l.d(eVar, "");
        this.f79622a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a, com.ss.android.ugc.aweme.base.ui.a
    public final boolean a(int i2) {
        Aweme a2;
        if (i2 == -1 && ScrollSwitchStateManager.a.a(this.f79622a).b("page_feed") && ((a2 = AwemeChangeCallBack.a(this.f79622a)) == null || a2.getAuthor() == null)) {
            return false;
        }
        return true;
    }
}
