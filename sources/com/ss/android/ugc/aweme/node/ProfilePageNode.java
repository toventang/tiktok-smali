package com.ss.android.ugc.aweme.node;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import h.f.b.l;

public final class ProfilePageNode extends TabFragmentNode {
    static {
        Covode.recordClassIndex(72379);
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return "page_profile";
    }

    @Override // com.ss.android.ugc.aweme.by
    public final View a(bz bzVar) {
        l.d(bzVar, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return "page_profile";
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        return null;
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return HomePageUIFrameServiceImpl.e().b("page_profile");
    }

    public ProfilePageNode(e eVar) {
        l.d(eVar, "");
    }
}
