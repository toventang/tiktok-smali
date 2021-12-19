package com.ss.android.ugc.aweme.homepage.ui.view.tab;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.dj;
import com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.e;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b implements bz {

    /* renamed from: a  reason: collision with root package name */
    public static final b f99536a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(63481);
    }

    @Override // com.ss.android.ugc.aweme.bz
    public final <T extends View> T a(dj djVar) {
        l.d(djVar, "");
        return new e(djVar);
    }

    @Override // com.ss.android.ugc.aweme.bz
    public final List<by> a(Context context) {
        l.d(context, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(FollowFeedServiceImpl.c().a(context));
        by b2 = FeedModuleServiceImpl.a().b(context);
        l.b(b2, "");
        arrayList.add(b2);
        return arrayList;
    }
}
