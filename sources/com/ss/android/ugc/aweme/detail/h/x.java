package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.c.f;
import h.f.b.ad;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class x extends b {
    public static final a H = new a((byte) 0);
    public boolean F;
    public Bundle G;

    /* renamed from: a  reason: collision with root package name */
    public List<Aweme> f79757a;

    static {
        Covode.recordClassIndex(49566);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49567);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void C() {
        super.C();
        if (!n() && this.F) {
            VerticalViewPager verticalViewPager = this.N;
            l.b(verticalViewPager, "");
            verticalViewPager.setDisableScroll(true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void m() {
        if (!f.c()) {
            super.m();
        } else if (!n()) {
            Fragment az_ = az_();
            l.b(az_, "");
            IMService.createIIMServicebyMonsterPlugin(false).showReplyFragment((ViewGroup) az_.getView(), bW(), this.G, null);
        }
    }

    public final boolean n() {
        if (this.bv == null) {
            return true;
        }
        Activity activity = this.bv;
        l.b(activity, "");
        if (activity.isFinishing()) {
            return true;
        }
        Activity activity2 = this.bv;
        l.b(activity2, "");
        if (activity2.isDestroyed() || az_() == null) {
            return true;
        }
        return false;
    }

    public static final class b implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f79758a;

        static {
            Covode.recordClassIndex(49568);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(x xVar) {
            this.f79758a = xVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            List<Aweme> list;
            String str;
            Aweme aweme;
            if (!this.f79758a.n() && (list = this.f79758a.f79757a) != null && i2 < list.size()) {
                List<Aweme> list2 = this.f79758a.f79757a;
                if (list2 == null || (aweme = list2.get(i2)) == null) {
                    str = null;
                } else {
                    str = aweme.getAid();
                }
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                Fragment fragment = this.f79758a.bw;
                l.b(fragment, "");
                createIIMServicebyMonsterPlugin.showReplyFragment(fragment.getView(), this.f79758a.bW(), this.f79758a.G, str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b
    public final void c(int i2) {
        super.c(i2);
        if (!n()) {
            if (i2 != 1 && i2 != 4 && i2 != 2) {
                return;
            }
            if (this.bv instanceof DetailActivity) {
                Activity activity = this.bv;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.ui.DetailActivity");
                ((DetailActivity) activity).onBackPressed();
                return;
            }
            Activity activity2 = this.bv;
            if (activity2 != null) {
                activity2.onBackPressed();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.c, com.ss.android.ugc.b.a.a.b
    public final void a(Bundle bundle) {
        super.a(bundle);
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        l.b(bVar, "");
        if (l.a((Object) bVar.getEnterMethodValue(), (Object) "click_quoted_message")) {
            this.F = true;
            this.ag = true;
        }
        StringBuilder sb = new StringBuilder("enter method: ");
        com.ss.android.ugc.aweme.feed.param.b bVar2 = this.aJ;
        l.b(bVar2, "");
        StringBuilder append = sb.append(bVar2.getEnterMethodValue()).append(" aid: ");
        com.ss.android.ugc.aweme.feed.param.b bVar3 = this.aJ;
        l.b(bVar3, "");
        StringBuilder append2 = append.append(bVar3.getAid()).append(" playing aid:");
        com.ss.android.ugc.aweme.feed.param.b bVar4 = this.aJ;
        l.b(bVar4, "");
        com.ss.android.ugc.aweme.im.service.m.a.c("ReplyMessagePanel", append2.append(bVar4.getChatRoomPlayingRealAid()).toString());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.b
    public final void b(List<Aweme> list, boolean z) {
        if (!this.F) {
            super.b(list, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(Bundle bundle, com.ss.android.ugc.aweme.feed.param.b bVar) {
        super(bVar);
        l.d(bVar, "");
        this.G = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.b
    public final void c(List<Aweme> list, boolean z) {
        if (this.F) {
            super.c(list, false);
        } else {
            super.c(list, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.detail.h.b
    public final void a(View view, Bundle bundle) {
        if (!f.c()) {
            super.a(view, bundle);
            return;
        }
        super.a(view, bundle);
        if (this.F) {
            FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.U;
            l.b(feedSwipeRefreshLayout, "");
            feedSwipeRefreshLayout.setEnabled(false);
        }
        this.N.a(new b(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.b
    public final void a(List<Aweme> list, boolean z) {
        Object obj;
        this.f79757a = ad.d(list);
        StringBuilder sb = new StringBuilder("onRefreshResult size: ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "null";
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("ReplyMessagePanel", sb.append(obj).append(" ").append(z).toString());
        if (this.F) {
            super.a(list, false);
        } else {
            super.a(list, z);
        }
    }
}
