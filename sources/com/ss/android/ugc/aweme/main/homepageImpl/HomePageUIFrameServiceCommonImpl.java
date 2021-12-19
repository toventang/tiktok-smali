package com.ss.android.ugc.aweme.main.homepageImpl;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.b;
import com.ss.android.ugc.aweme.feed.i.j;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public abstract class HomePageUIFrameServiceCommonImpl implements HomePageUIFrameService {
    static {
        Covode.recordClassIndex(69980);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public void setTitleTabVisibility(boolean z) {
        c.a(new j(z, (byte) 0));
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public void runInTabHostRunnable(b bVar) {
        l.d(bVar, "");
        if (bVar.ab_()) {
            e activity = bVar.getActivity();
            if (!(activity instanceof MainActivity)) {
                activity = null;
            }
            MainActivity mainActivity = (MainActivity) activity;
            if (mainActivity != null) {
                mainActivity.refreshSlideSwitchCanScrollRight();
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r8.equals("UNLOGIN_NOTIFICATION") != false) goto L_0x003b;
     */
    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getTagForCurrentTabInMainPageFragment(com.ss.android.ugc.aweme.main.TabChangeManager r6, java.lang.String r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl.getTagForCurrentTabInMainPageFragment(com.ss.android.ugc.aweme.main.TabChangeManager, java.lang.String, java.lang.String):java.lang.String");
    }
}
