package com.ss.android.ugc.aweme.detail.ui;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.cm.a;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.i.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.aweme.share.model.a;
import com.ss.android.ugc.aweme.share.model.d;
import com.ss.android.ugc.aweme.utils.w;
import com.ss.android.ugc.aweme.video.k;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.d.a.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f79913a;

    /* renamed from: b  reason: collision with root package name */
    private final ScrollSwitchStateManager f79914b;

    /* renamed from: c  reason: collision with root package name */
    private final HomePageDataViewModel f79915c;

    static {
        Covode.recordClassIndex(49711);
    }

    ab(z zVar, ScrollSwitchStateManager scrollSwitchStateManager, HomePageDataViewModel homePageDataViewModel) {
        this.f79913a = zVar;
        this.f79914b = scrollSwitchStateManager;
        this.f79915c = homePageDataViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        String aid;
        String str;
        z zVar = this.f79913a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f79914b;
        HomePageDataViewModel homePageDataViewModel = this.f79915c;
        Integer num = (Integer) obj;
        num.intValue();
        String a2 = scrollSwitchStateManager.a(num.intValue());
        ae.f115954a.preloadProfile(zVar.getActivity(), a2);
        c.a(new d(scrollSwitchStateManager.b("page_feed")));
        if (num.intValue() == 1) {
            c.a(new a());
        }
        int i2 = zVar.o;
        zVar.o = num.intValue();
        if (TextUtils.isEmpty(a.C1605a.f71196d)) {
            a.C1605a.f71193a = a2;
        }
        if (!TextUtils.equals(a2, "page_feed")) {
            a.b.f109011a.f109002c = false;
            a.b.f109011a.f109006g = false;
        }
        if (!TextUtils.equals(a2, "page_feed")) {
            v.O().B();
            k.a().b();
            zVar.f79992k.a(0L, 0L);
        }
        scrollSwitchStateManager.a(i2);
        a2.hashCode();
        if (a2.equals("page_profile")) {
            c.a(new g());
            if (AwemeChangeCallBack.a(zVar.getActivity()) != null) {
                String c2 = homePageDataViewModel.c();
                String str2 = "";
                if (c2 == null) {
                    c2 = str2;
                }
                s sVar = new s();
                sVar.a("enter_from", c2);
                if (!homePageDataViewModel.f99129l) {
                    zVar.getContext();
                    String q = zVar.q();
                    if (AwemeChangeCallBack.a(zVar.getActivity()) == null) {
                        aid = str2;
                    } else {
                        aid = AwemeChangeCallBack.a(zVar.getActivity()).getAid();
                    }
                    r.a("slide_left", "left", q, aid, sVar.a());
                    Aweme a3 = AwemeChangeCallBack.a(zVar.getActivity());
                    String e2 = TextUtils.isEmpty(FeedParamProvider.a.a(zVar.getContext()).getVsResultId()) ? ac.e(a3) : FeedParamProvider.a.a(zVar.getContext()).getVsResultId();
                    String searchResultId = zVar.f79991j.getSearchResultId();
                    if (TextUtils.isEmpty(searchResultId)) {
                        searchResultId = ac.e(a3);
                    }
                    User user = null;
                    String str3 = null;
                    if (TextUtils.equals(c2, "general_search") || TextUtils.equals(c2, "search_result")) {
                        h hVar = h.f121133a;
                        if (a3 != null) {
                            user = a3.getAuthor();
                        }
                        str3 = hVar.a(user, zVar.getContext());
                    }
                    q qVar = (q) new q().o(c2).a("slide_left");
                    qVar.u = str2;
                    qVar.v = str2;
                    qVar.t = str2;
                    q c3 = qVar.c(AwemeChangeCallBack.a(zVar.getActivity()), 0);
                    c3.q = zVar.q();
                    c3.r = homePageDataViewModel.f99127j;
                    c3.ac = str3;
                    q qVar2 = (q) c3.a(zVar.getContext()).l(zVar.f79991j.getSearchId()).f(searchResultId);
                    qVar2.P = FeedParamProvider.a.a(zVar.getContext()).getVsEnterFrom();
                    qVar2.Q = FeedParamProvider.a.a(zVar.getContext()).getVsEntranceType();
                    qVar2.R = FeedParamProvider.a.a(zVar.getContext()).getVsSessionId();
                    qVar2.S = e2;
                    qVar2.ad = FeedParamProvider.a.a(zVar.getContext()).getCategoryName();
                    qVar2.V = com.ss.android.ugc.aweme.story.b.h.a(a3.getAuthor());
                    if (com.ss.android.ugc.aweme.story.d.a.g(a3)) {
                        str = "story";
                    } else {
                        str = UGCMonitor.TYPE_POST;
                    }
                    qVar2.W = str;
                    qVar2.b_(com.ss.android.ugc.aweme.story.d.a.b(a3)).a(w.a(a3, "enter_personal_detail", c2)).a(y.b(zVar.f79991j.getPreviousPage(), zVar.f79991j.getFromGroupId())).f();
                }
                if (TextUtils.equals(c2, "follow_card_push_publish")) {
                    r.a("follow_card", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", c2).a("event_type", "enter_profile").a("rec_uid", ac.l(AwemeChangeCallBack.a(zVar.getActivity()))).a("req_id", homePageDataViewModel.f99127j).a("card_type", "item").a("impr_order", 0).f66730a);
                }
                sVar.a("group_id", AwemeChangeCallBack.a(zVar.getActivity()) == null ? str2 : AwemeChangeCallBack.a(zVar.getActivity()).getAid());
                sVar.a("enter_method", "slide_left");
                sVar.a("request_id", homePageDataViewModel.f99127j);
                sVar.a("enter_type", "normal_way");
                MobClick labelName = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage");
                if (AwemeChangeCallBack.a(zVar.getActivity()) != null) {
                    str2 = AwemeChangeCallBack.a(zVar.getActivity()).getAuthor().getUid();
                }
                r.onEvent(labelName.setValue(str2).setJsonObject(sVar.a()));
                AwemeChangeCallBack.a(zVar.getActivity());
            }
            com.ss.android.ugc.aweme.feed.s.a(af.PROFILE);
            homePageDataViewModel.f99129l = false;
            com.bytedance.ies.dmt.ui.f.a.f33482a = false;
        } else if (a2.equals("page_feed")) {
            com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        }
    }
}
