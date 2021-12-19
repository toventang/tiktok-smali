package com.ss.android.ugc.aweme.node;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.d;
import com.ss.android.ugc.aweme.TabFragmentGroup;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import h.f.b.l;
import java.util.Objects;

public final class MainPageNode extends TabFragmentGroup {

    /* renamed from: j  reason: collision with root package name */
    private final e f112629j;

    static {
        Covode.recordClassIndex(72378);
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return "page_feed";
    }

    @Override // com.ss.android.ugc.aweme.by
    public final View a(bz bzVar) {
        l.d(bzVar, "");
        return null;
    }

    @Override // com.bytedance.hox.b
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return "page_feed";
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        return null;
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return HomePageUIFrameServiceImpl.e().b("page_feed");
    }

    public MainPageNode(e eVar) {
        l.d(eVar, "");
        this.f112629j = eVar;
        for (T t : HomeTabViewModel.a.a(eVar).a()) {
            if (!(t instanceof b)) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.bytedance.hox.HoxNode");
                a((d) t);
            }
        }
    }

    @Override // com.bytedance.hox.b
    public final void a(String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        TabChangeManager.a.a(this.f112629j).a(str, bundle.getBoolean(be.f68529a, false));
    }
}
