package com.ss.android.ugc.aweme.profile;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.ui.d.b;
import com.ss.android.ugc.aweme.story.d.a;
import com.ss.android.ugc.d.a.c;

final /* synthetic */ class u implements androidx.lifecycle.u {

    /* renamed from: a  reason: collision with root package name */
    private final k f116716a;

    /* renamed from: b  reason: collision with root package name */
    private final ScrollSwitchStateManager f116717b;

    static {
        Covode.recordClassIndex(75392);
    }

    u(k kVar, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f116716a = kVar;
        this.f116717b = scrollSwitchStateManager;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        k kVar = this.f116716a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f116717b;
        Integer num = (Integer) obj;
        if (kVar.o) {
            kVar.o = false;
            kVar.f116487l = kVar.a(kVar.f116487l, 0);
        }
        if (num.intValue() == 1) {
            kVar.f116488m = "slide";
            if (kVar.f116484e != null && k.b(kVar.f116484e) && a.g(kVar.f116484e) && !(kVar.f116482c instanceof b)) {
                if (kVar.f116481b == null) {
                    kVar.f116481b = kVar.d();
                }
                kVar.a((Fragment) kVar.f116481b, "tag_fragment_page_my");
            }
        }
        Context context = kVar.getContext();
        if (num.intValue() == 0 && scrollSwitchStateManager.b("page_profile") && context != null && kVar.f116484e != null && !com.ss.android.ugc.aweme.commercialize.e.a.b.aB(kVar.f116484e)) {
            com.ss.android.ugc.aweme.profile.service.a.f116616a.openProfilePopUpWebPage(context, kVar.f116484e.getAwemeRawAd(), kVar.f116484e.getAid());
        }
        if (num.intValue() == 0 && scrollSwitchStateManager.b("page_feed") && context != null && kVar.f116484e != null && kVar.f116484e.isAd() && kVar.f116484e.getAwemeRawAd().getGetAdStatus() == 1 && com.ss.android.ugc.aweme.profile.service.a.f116616a.shouldShowAdBrowser(kVar.f116484e)) {
            com.ss.android.ugc.aweme.profile.service.a.f116616a.onProfileWebPageHide(kVar.getContext(), kVar.f116484e, kVar.f116488m);
        }
        if (num.intValue() == 0 && scrollSwitchStateManager.b("page_feed")) {
            c.a(new com.ss.android.ugc.aweme.commercialize.event.a(0));
        }
    }
}
