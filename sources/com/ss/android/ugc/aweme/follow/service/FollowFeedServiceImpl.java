package com.ss.android.ugc.aweme.follow.service;

import android.content.Context;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.feed.i.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FollowTab;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.a;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.service.IFollowFeedService;
import com.ss.android.ugc.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.List;

public final class FollowFeedServiceImpl implements IFollowFeedService {
    static {
        Covode.recordClassIndex(60971);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final Fragment b() {
        return new p();
    }

    public static IFollowFeedService c() {
        MethodCollector.i(9879);
        Object a2 = b.a(IFollowFeedService.class, false);
        if (a2 != null) {
            IFollowFeedService iFollowFeedService = (IFollowFeedService) a2;
            MethodCollector.o(9879);
            return iFollowFeedService;
        }
        if (b.bq == null) {
            synchronized (IFollowFeedService.class) {
                try {
                    if (b.bq == null) {
                        b.bq = new FollowFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9879);
                    throw th;
                }
            }
        }
        FollowFeedServiceImpl followFeedServiceImpl = (FollowFeedServiceImpl) b.bq;
        MethodCollector.o(9879);
        return followFeedServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void a() {
        c.a(new g());
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final by a(Context context) {
        l.d(context, "");
        return new FollowTab(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final String a(e eVar) {
        String l2;
        l.d(eVar, "");
        FollowTab followTab = (FollowTab) HomeTabViewModel.a.a(eVar).a("Following");
        if (followTab == null || (l2 = followTab.l()) == null) {
            return "";
        }
        return l2;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final List<Aweme> a(List<? extends FollowFeed> list) {
        l.d(list, "");
        List<Aweme> a2 = a.a((List<FollowFeed>) list);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final float b(e eVar) {
        TextView textView;
        TextPaint paint;
        l.d(eVar, "");
        FollowTab followTab = (FollowTab) HomeTabViewModel.a.a(eVar).a("Following");
        if (followTab == null || (textView = followTab.f94095k) == null || (paint = textView.getPaint()) == null) {
            return 0.0f;
        }
        return paint.measureText(followTab.U_());
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void a(e eVar, float f2) {
        TextView textView;
        l.d(eVar, "");
        FollowTab followTab = (FollowTab) HomeTabViewModel.a.a(eVar).a("Following");
        if (followTab != null && (textView = followTab.f94095k) != null) {
            textView.setTextSize(1, f2);
        }
    }
}
