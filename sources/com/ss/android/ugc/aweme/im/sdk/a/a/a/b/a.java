package com.ss.android.ugc.aweme.im.sdk.a.a.a.b;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.a.a.a.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.upvote.event.c;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.f.a.a f100091a;

    /* renamed from: b  reason: collision with root package name */
    private final HomePageDataViewModel f100092b;

    /* renamed from: c  reason: collision with root package name */
    private final MainPageDataViewModel f100093c;

    /* renamed from: d  reason: collision with root package name */
    private final DataCenter f100094d;

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f100095e;

    static {
        Covode.recordClassIndex(63793);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(63, new g(a.class, "onDislikeAwemeEvent", f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @r
    public final void onDislikeAwemeEvent(f fVar) {
        User user;
        String str;
        String str2;
        int i2;
        String g2;
        l.d(fVar, "");
        l.d(fVar, "");
        if (fVar.f93476b == 1 && fVar.f93475a) {
            this.f100091a.f();
            Aweme aweme = this.f100092b.f99128k;
            DoubleFragmentMainActivity doubleFragmentMainActivity = null;
            if (aweme != null) {
                user = aweme.getAuthor();
            } else {
                user = null;
            }
            d dVar = new d();
            Aweme aweme2 = this.f100092b.f99128k;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            d a2 = dVar.a("group_id", str);
            if (user == null || (str2 = user.getUid()) == null) {
                str2 = "";
            }
            d a3 = a2.a("author_id", str2);
            if (user != null) {
                i2 = user.getFollowStatus();
            } else {
                i2 = -1;
            }
            d a4 = a3.a("follow_status", i2).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(this.f100092b.f99128k))).a("enter_from", this.f100093c.f99135b);
            l.b(a4, "");
            h.a(a4, this.f100092b.f99128k);
            com.ss.android.ugc.aweme.common.r.a("click_trans_layer", c.a(a4, this.f100092b.f99128k, this.f100093c.f99135b).f66730a);
            this.f100091a.a(true);
            Aweme aweme3 = this.f100092b.f99128k;
            if (MSAdaptionService.c().c(com.bytedance.ies.ugc.appcontext.f.j())) {
                e activity = this.f100095e.getActivity();
                if (activity instanceof DoubleFragmentMainActivity) {
                    doubleFragmentMainActivity = activity;
                }
                DoubleFragmentMainActivity doubleFragmentMainActivity2 = doubleFragmentMainActivity;
                if (doubleFragmentMainActivity2 == null || (g2 = doubleFragmentMainActivity2.getEnterFrom()) == null) {
                    g2 = "homepage_hot";
                }
            } else {
                g2 = this.f100091a.g();
            }
            Context requireContext = this.f100095e.requireContext();
            l.b(requireContext, "");
            l.b(g2, "");
            com.ss.android.ugc.aweme.im.sdk.a.a.a.a.a aVar = new com.ss.android.ugc.aweme.im.sdk.a.a.a.a.a(s.a.a(requireContext, aweme3, g2));
            DataCenter dataCenter = this.f100094d;
            Fragment fragment = this.f100095e;
            l.d(dataCenter, "");
            l.d(fragment, "");
            aVar.f100087a.c().setOnDismissListener(new a.DialogInterface$OnDismissListenerC2456a(aVar, dataCenter, fragment));
            aVar.f100087a.c().show();
        }
    }

    public a(com.ss.android.ugc.aweme.im.service.f.a.a aVar, HomePageDataViewModel homePageDataViewModel, MainPageDataViewModel mainPageDataViewModel, DataCenter dataCenter, Fragment fragment) {
        l.d(aVar, "");
        l.d(homePageDataViewModel, "");
        l.d(mainPageDataViewModel, "");
        l.d(dataCenter, "");
        l.d(fragment, "");
        this.f100091a = aVar;
        this.f100092b = homePageDataViewModel;
        this.f100093c = mainPageDataViewModel;
        this.f100094d = dataCenter;
        this.f100095e = fragment;
        EventBus.a(EventBus.a(), this);
    }
}
