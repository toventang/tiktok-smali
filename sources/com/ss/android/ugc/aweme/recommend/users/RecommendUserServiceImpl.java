package com.ss.android.ugc.aweme.recommend.users;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.widget.c;
import com.ss.android.ugc.aweme.base.widget.f;
import com.ss.android.ugc.aweme.friends.ui.aw;
import com.ss.android.ugc.aweme.inbox.RecommendUserAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.recommend.a;
import com.ss.android.ugc.aweme.recommend.d;
import com.ss.android.ugc.aweme.recommend.users.profile.ui.k;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.HashMap;

public final class RecommendUserServiceImpl implements RecommendUserService {
    static {
        Covode.recordClassIndex(78076);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.RecommendUserService
    public final /* synthetic */ Fragment a() {
        return new k();
    }

    public static RecommendUserService b() {
        MethodCollector.i(11801);
        Object a2 = b.a(RecommendUserService.class, false);
        if (a2 != null) {
            RecommendUserService recommendUserService = (RecommendUserService) a2;
            MethodCollector.o(11801);
            return recommendUserService;
        }
        if (b.df == null) {
            synchronized (RecommendUserService.class) {
                try {
                    if (b.df == null) {
                        b.df = new RecommendUserServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11801);
                    throw th;
                }
            }
        }
        RecommendUserServiceImpl recommendUserServiceImpl = (RecommendUserServiceImpl) b.df;
        MethodCollector.o(11801);
        return recommendUserServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.RecommendUserService
    public final d b(Context context) {
        l.d(context, "");
        return new f(context, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.RecommendUserService
    public final com.ss.android.ugc.aweme.recommend.b a(Context context) {
        l.d(context, "");
        return new com.ss.android.ugc.aweme.base.widget.d(context, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.RecommendUserService
    public final View a(Context context, HashMap<String, Boolean> hashMap) {
        l.d(context, "");
        l.d(hashMap, "");
        return new aw(context, hashMap, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.RecommendUserService
    public final InboxAdapterWidget a(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData) {
        l.d(fragment, "");
        l.d(liveData, "");
        return new RecommendUserAdapterWidget(fragment, liveData);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.RecommendUserService
    public final a a(Context context, int i2) {
        l.d(context, "");
        return new c(context, i2, (byte) 0);
    }
}
