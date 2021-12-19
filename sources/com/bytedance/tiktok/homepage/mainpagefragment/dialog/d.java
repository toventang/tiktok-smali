package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.feed.i.u;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.service.f.a.a;
import com.ss.android.ugc.aweme.metrics.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.l;
import com.ss.android.ugc.aweme.recommend.m;
import com.ss.android.ugc.aweme.recommend.o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class d implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f44324a;

    /* renamed from: b  reason: collision with root package name */
    public String f44325b;

    /* renamed from: c  reason: collision with root package name */
    private final a f44326c;

    /* renamed from: d  reason: collision with root package name */
    private final HomePageDataViewModel f44327d;

    /* renamed from: e  reason: collision with root package name */
    private final ScrollSwitchStateManager f44328e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f44329f;

    static {
        Covode.recordClassIndex(27149);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(18, new g(d.class, "onVideoPageChangeEvent", u.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final void a() {
        if (this.f44324a.getActivity() != null) {
            Aweme aweme = this.f44327d.f99128k;
            if (aweme == null || !b.B(aweme)) {
                if (o.b() && o.a(aweme)) {
                    a("", "HOME");
                }
                l.f120097b = true;
                return;
            }
            this.f44329f = true;
        }
    }

    @r
    public final void onVideoPageChangeEvent(u uVar) {
        h.f.b.l.d(uVar, "");
        if (uVar.f93493a != null) {
            this.f44327d.f99128k = uVar.f93493a;
            Aweme aweme = uVar.f93493a;
            h.f.b.l.b(aweme, "");
            if (aweme.getAuthor() != null) {
                Aweme aweme2 = uVar.f93493a;
                h.f.b.l.b(aweme2, "");
                User author = aweme2.getAuthor();
                h.f.b.l.b(author, "");
                this.f44325b = author.getUid();
            } else {
                this.f44325b = "";
            }
            if (this.f44329f && this.f44324a.getActivity() != null) {
                this.f44329f = false;
                a();
            }
        }
    }

    public final String a(String str) {
        if (str == null) {
            return "";
        }
        if (TextUtils.equals(str, "HOME")) {
            String j2 = this.f44326c.j();
            if (j2 != null) {
                return j2;
            }
            return "homepage_hot";
        } else if (TextUtils.equals(str, "DISCOVER")) {
            return "discovery";
        } else {
            if (TextUtils.equals(str, "NOTIFICATION")) {
                return "notification_page";
            }
            if (!TextUtils.equals(str, "USER")) {
                return "homepage_hot";
            }
            Fragment b2 = this.f44328e.b();
            if (b2 instanceof s) {
                return ((s) b2).f();
            }
            return "personal_homepage";
        }
    }

    private void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if ((TextUtils.equals(str, "HOME") || TextUtils.equals(str2, "HOME")) && TextUtils.equals(this.f44326c.g(), "homepage_hot")) {
            l.a(new m(new WeakReference(this.f44324a.getActivity()), a(str2), a(str), (byte) 0));
        }
    }

    public d(a aVar, Fragment fragment, HomePageDataViewModel homePageDataViewModel, ScrollSwitchStateManager scrollSwitchStateManager) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(fragment, "");
        h.f.b.l.d(homePageDataViewModel, "");
        h.f.b.l.d(scrollSwitchStateManager, "");
        this.f44326c = aVar;
        this.f44324a = fragment;
        this.f44327d = homePageDataViewModel;
        this.f44328e = scrollSwitchStateManager;
        EventBus.a(EventBus.a(), this);
    }
}
