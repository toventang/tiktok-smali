package com.ss.android.ugc.aweme.homepage.ui.view.tab;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.dj;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab.HomeTab;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.notification.view.NotificationTab;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a implements bz {

    /* renamed from: a  reason: collision with root package name */
    public static final a f99535a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(63480);
    }

    @Override // com.ss.android.ugc.aweme.bz
    public final <T extends View> T a(dj djVar) {
        l.d(djVar, "");
        return new m((ar) djVar);
    }

    @Override // com.ss.android.ugc.aweme.bz
    public final List<by> a(Context context) {
        l.d(context, "");
        by[] byVarArr = new by[5];
        byVarArr[0] = new HomeTab(context);
        by a2 = MusicDspServiceImpl.g().a(context);
        if (a2 == null) {
            a2 = HomePageUIFrameServiceImpl.e().b(context);
        }
        byVarArr[1] = a2;
        byVarArr[2] = new b(context);
        byVarArr[3] = new NotificationTab(context);
        byVarArr[4] = ProfileServiceImpl.g().a(context);
        return n.c(byVarArr);
    }
}
