package com.ss.android.ugc.aweme.main;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.ss.android.ugc.aweme.base.ui.e;
import com.ss.android.ugc.aweme.base.ui.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.k;

public class bb implements o {

    /* renamed from: a  reason: collision with root package name */
    private Context f109189a;

    /* renamed from: b  reason: collision with root package name */
    private ScrollableViewPager f109190b;

    /* renamed from: c  reason: collision with root package name */
    private p f109191c;

    /* renamed from: d  reason: collision with root package name */
    private ScrollSwitchStateManager f109192d;

    /* renamed from: e  reason: collision with root package name */
    private HomePageDataViewModel f109193e;

    static {
        Covode.recordClassIndex(69925);
    }

    @Override // com.ss.android.ugc.aweme.main.o
    public final void a() {
        b();
    }

    private boolean c() {
        boolean z;
        boolean b2 = this.f109192d.b("page_feed");
        boolean z2 = this.f109192d.d("page_feed") instanceof MainPageFragment;
        if (this.f109191c == null || !z2) {
            z = false;
        } else {
            z = true;
        }
        if (!b2 || !z) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.f109190b == null) {
            return false;
        }
        if (!this.f109192d.b("page_feed")) {
            this.f109192d.a("page_feed");
            return true;
        } else if (!c()) {
            return this.f109192d.d("page_feed") instanceof MainPageFragment;
        } else {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.main.o
    public final void a(ViewPager.e eVar) {
        ScrollableViewPager scrollableViewPager = this.f109190b;
        if (scrollableViewPager != null) {
            scrollableViewPager.a(eVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.o
    public final void a(String str) {
        if (this.f109190b != null) {
            e d2 = this.f109192d.d("page_profile");
            if (d2 instanceof k) {
                ((k) d2).b(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.main.o
    public final void a(Aweme aweme, String str) {
        if (this.f109190b != null) {
            a.b(4, "FeedAvatarView", "toProfilePage() called with: mViewPager = [" + this.f109190b + "], aweme = [" + aweme + "], enterMethod = [" + str + "]viewPageSize" + this.f109190b.getItemCount() + " pageType page_profile");
            this.f109193e.f99129l = true;
            e d2 = this.f109192d.d("page_profile");
            if (d2 instanceof k) {
                k kVar = (k) d2;
                kVar.a(str);
                kVar.b(this.f109193e.f99129l);
            }
            this.f109192d.a("page_profile", true);
        } else {
            a.b(4, "FeedAvatarView", "mViewPager is null");
        }
        b.c("feed", "hot");
    }

    public bb(Context context, ScrollableViewPager scrollableViewPager, p pVar) {
        if (context instanceof androidx.fragment.app.e) {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            this.f109192d = ScrollSwitchStateManager.a.a(eVar);
            this.f109193e = HomePageDataViewModel.a.a(eVar);
        }
        this.f109189a = context;
        this.f109190b = scrollableViewPager;
        this.f109191c = pVar;
    }
}
