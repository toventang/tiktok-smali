package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.detail.g.a;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.Map;

public final class DetailFeedServiceImpl implements DetailFeedService {
    static {
        Covode.recordClassIndex(38349);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Class<? extends Activity> a() {
        return DetailActivity.class;
    }

    public static DetailFeedService b() {
        MethodCollector.i(5516);
        Object a2 = b.a(DetailFeedService.class, false);
        if (a2 != null) {
            DetailFeedService detailFeedService = (DetailFeedService) a2;
            MethodCollector.o(5516);
            return detailFeedService;
        }
        if (b.p == null) {
            synchronized (DetailFeedService.class) {
                try {
                    if (b.p == null) {
                        b.p = new DetailFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5516);
                    throw th;
                }
            }
        }
        DetailFeedServiceImpl detailFeedServiceImpl = (DetailFeedServiceImpl) b.p;
        MethodCollector.o(5516);
        return detailFeedServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final a a(String str) {
        a a2 = DetailApi.a(str, (String) null, (String) null, 4);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Fragment a(Activity activity) {
        l.d(activity, "");
        com.ss.android.ugc.aweme.detail.ui.l a2 = com.ss.android.ugc.aweme.detail.ui.l.a(com.ss.android.ugc.aweme.feed.param.a.a(activity), new Bundle());
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Map<String, View> a(View view) {
        l.d(view, "");
        View findViewById = view.findViewById(R.id.c0w);
        View findViewById2 = view.findViewById(R.id.flg);
        if (findViewById != null) {
            Map<String, View> b2 = ag.b(new p("search_icon_in_feed", findViewById));
            if (findViewById2 != null) {
                b2.put("search_bar_in_feed", findViewById2);
            }
            return b2;
        }
        throw new IllegalStateException("no search icon find in your layout");
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme a(String str, String str2) {
        Aweme a2 = DetailApi.a(str, str2, 0, (String) null);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final a a(String str, String str2, String str3) {
        a a2 = DetailApi.a(str, str2, str3, 0);
        l.b(a2, "");
        return a2;
    }
}
