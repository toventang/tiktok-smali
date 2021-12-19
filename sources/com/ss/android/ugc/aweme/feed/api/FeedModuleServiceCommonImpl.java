package com.ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.ea;
import com.ss.android.ugc.aweme.feed.interest.InterestApi;
import com.ss.android.ugc.aweme.feed.interest.a;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.p.b.a.b;
import com.ss.android.ugc.aweme.feed.p.b.a.c;
import com.ss.android.ugc.aweme.feed.x;
import com.ss.android.ugc.aweme.main.j;
import h.f.b.l;
import java.util.concurrent.Callable;

public abstract class FeedModuleServiceCommonImpl implements IFeedModuleService {
    static {
        Covode.recordClassIndex(57875);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public boolean fullscreenShowLive() {
        return false;
    }

    public void requestInterestSelect() {
    }

    public String getFeedRequstParam() {
        return ea.f89884c;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public boolean canResumePlay() {
        String str = ea.f89884c;
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public void maybeRequestAfterFirstFrame() {
        if (ea.d() && ea.b() != 0 && !ea.f89889h) {
            ea.f89889h = true;
            r.a("ask_interest_lable", new d().a("enter_from", "homepage_hot").a("user_id", a.a()).f66730a);
            com.ss.android.ugc.aweme.framework.a.a.b(4, ea.f89883b, "start to request,current expr is group1:" + ea.f89891j.e());
            ((InterestApi) ea.f89886e.getValue()).getInterestList().b(f.a.h.a.b(f.a.k.a.f158006c)).a(ea.c.f89897a, ea.d.f89898a);
        }
    }

    public void setFeedRequstParam(String str) {
        if (!l.a((Object) str, (Object) ea.f89884c)) {
            ea.f89884c = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public b newTopNoticeFeedManager(Activity activity, View view) {
        return c.a(activity, view);
    }

    public void mobStartRequest(Fragment fragment, String str) {
        new x(fragment).a(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public Integer getInsertIndex(int i2, Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (ea.f89891j.e()) {
            int c2 = ea.c() - 1;
            int i3 = i2 + 2;
            if (i3 >= c2) {
                c2 = i3;
            }
            return Integer.valueOf(c2);
        } else if (ea.f89891j.f()) {
            return Integer.valueOf(i2 + 1);
        } else {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public void maybeMonitorTimeSpend(Aweme aweme, Long l2) {
        long longValue = l2.longValue();
        if (ea.f89888g && ea.d() && ea.f89891j.f() && aweme != null && !aweme.isAd()) {
            if (System.currentTimeMillis() - longValue <= ((long) ea.g()) * 1000) {
                int i2 = ea.f89887f + 1;
                ea.f89887f = i2;
                if (i2 >= ea.h()) {
                    Activity j2 = f.j();
                    if (j2 instanceof j) {
                        ea.a(j2);
                        ea.f89888g = false;
                        return;
                    }
                    com.ss.android.ugc.aweme.framework.a.a.a(4, ea.f89883b, "not insert cause not IMainActivity");
                    return;
                }
                return;
            }
            ea.f89887f = 0;
        }
    }

    public void commitFeedRequest(int i2, WeakHandler weakHandler, Callable callable, int i3, boolean z) {
        k.a(i2, -1, weakHandler, callable, i3, z, null);
    }
}
