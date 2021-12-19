package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.dd;
import com.ss.android.ugc.aweme.feed.i.ad;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class b extends dd implements a, i, j {

    /* renamed from: a  reason: collision with root package name */
    public View.OnClickListener f99552a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a f99553b;

    /* renamed from: c  reason: collision with root package name */
    public d f99554c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.ies.dmt.ui.tooltip.a f99555d;

    /* renamed from: j  reason: collision with root package name */
    public final Context f99556j;

    /* renamed from: k  reason: collision with root package name */
    private final h f99557k = h.i.a((h.f.a.a) new C2436b(this));

    static {
        Covode.recordClassIndex(63488);
    }

    public final ar b() {
        return (ar) this.f99557k.getValue();
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return null;
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        return null;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(16, new g(b.class, "onScrollToProfileEvent", ad.class, ThreadMode.POSTING, 0, false));
        hashMap.put(357, new g(b.class, "onSuperEntranceEvent", SuperEntranceEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return b().f82873i;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return b().f82872h;
    }

    public final void j() {
        com.bytedance.ies.dmt.ui.tooltip.a aVar = this.f99555d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b$b  reason: collision with other inner class name */
    static final class C2436b extends m implements h.f.a.a<ar> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2436b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ar invoke() {
            return c.a(this.this$0.f99556j);
        }
    }

    public final boolean k() {
        d dVar = this.f99554c;
        if (dVar == null || !dVar.d()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.dd
    public final void h() {
        if (this.f99552a == null) {
            this.f99552a = HomePageUIFrameServiceImpl.e().a(this.f99556j, b().f82872h);
        }
        View.OnClickListener onClickListener = this.f99552a;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99559a;

        static {
            Covode.recordClassIndex(63491);
        }

        c(b bVar) {
            this.f99559a = bVar;
        }

        public final void run() {
            ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(this.f99559a.f99556j).b(b.a(this.f99559a)).a(com.bytedance.tux.tooltip.h.TOP).b((int) n.b(this.f99559a.f99556j, 10.0f))).e(R.string.esh).d().a();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f99561b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Long f99562c;

        static {
            Covode.recordClassIndex(63492);
        }

        d(b bVar, String str, Long l2) {
            this.f99560a = bVar;
            this.f99561b = str;
            this.f99562c = l2;
        }

        public final void run() {
            b bVar = this.f99560a;
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a a2 = b.a(bVar);
            String str = this.f99561b;
            if (!TextUtils.isEmpty(str)) {
                Context context = a2.getContext();
                l.b(context, "");
                com.bytedance.ies.dmt.ui.tooltip.b bVar2 = new com.bytedance.ies.dmt.ui.tooltip.b(context);
                if (str == null) {
                    str = "";
                }
                bVar.f99555d = bVar2.a(str).a(a2).b(48).a(5000L).a(false).a();
                com.bytedance.ies.dmt.ui.tooltip.a aVar = bVar.f99555d;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99558a;

        static {
            Covode.recordClassIndex(63489);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f99558a = bVar;
        }

        public final void onViewAttachedToWindow(View view) {
            l.d(view, "");
            EventBus.a(EventBus.a(), this.f99558a);
        }

        public final void onViewDetachedFromWindow(View view) {
            l.d(view, "");
            EventBus.a().b(this.f99558a);
            d dVar = this.f99558a.f99554c;
            if (dVar != null) {
                dVar.b();
                dVar.a();
            }
        }
    }

    @r
    public final void onScrollToProfileEvent(ad adVar) {
        if (adVar != null) {
            j();
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a a(b bVar) {
        com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = bVar.f99553b;
        if (aVar == null) {
            l.a("tabView");
        }
        return aVar;
    }

    public b(Context context) {
        l.d(context, "");
        this.f99556j = context;
    }

    private void a(boolean z) {
        d dVar = this.f99554c;
        if (dVar != null) {
            dVar.b(z);
        }
        d dVar2 = this.f99554c;
        if (dVar2 != null) {
            dVar2.c(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        if (r4 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        if (r3 == null) goto L_0x001b;
     */
    @Override // com.ss.android.ugc.aweme.by
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(com.ss.android.ugc.aweme.bz r10) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b.a(com.ss.android.ugc.aweme.bz):android.view.View");
    }

    @r
    public final void onSuperEntranceEvent(SuperEntranceEvent superEntranceEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        if (superEntranceEvent != null) {
            ISpecialPlusService specialPlusService = AVExternalServiceImpl.a().specialPlusService();
            boolean z4 = true;
            if (!superEntranceEvent.getShow()) {
                d dVar = this.f99554c;
                if (dVar == null || !dVar.d()) {
                    z = false;
                    z2 = false;
                } else {
                    z = true;
                    if (superEntranceEvent.getType() == 1) {
                        z2 = true;
                    }
                    z2 = false;
                }
                d dVar2 = this.f99554c;
                if (dVar2 != null && dVar2.c() && superEntranceEvent.getType() == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z || superEntranceEvent.getType() != 0) {
                    z4 = false;
                }
                if (!z2 && !z3 && !z4) {
                    d dVar3 = this.f99554c;
                    if (dVar3 != null) {
                        dVar3.a();
                    }
                    specialPlusService.setSpecialPlusState(false);
                    d dVar4 = this.f99554c;
                    if (dVar4 != null) {
                        dVar4.a(false);
                    }
                    d dVar5 = this.f99554c;
                    if (dVar5 != null) {
                        dVar5.c(false);
                    }
                }
            } else if (superEntranceEvent.getType() == 3) {
                d dVar6 = this.f99554c;
                if (dVar6 != null && !dVar6.c()) {
                    if (!specialPlusService.isQuickPromoPlusEnabled()) {
                        String specialPlusTips = specialPlusService.getSpecialPlusTips();
                        if (!TextUtils.isEmpty(specialPlusTips)) {
                            d dVar7 = this.f99554c;
                            if (dVar7 == null) {
                                l.b();
                            }
                            if (!dVar7.d()) {
                                d dVar8 = this.f99554c;
                                if (dVar8 == null || !dVar8.d()) {
                                    com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = this.f99553b;
                                    if (aVar == null) {
                                        l.a("tabView");
                                    }
                                    aVar.post(new d(this, specialPlusTips, 5000L));
                                }
                                IMainPageFragment i2 = MainPageFragmentImpl.i();
                                if (i2 != null) {
                                    i2.a();
                                }
                            }
                        }
                    }
                    d dVar9 = this.f99554c;
                    if (dVar9 == null) {
                        l.b();
                    }
                    if (!dVar9.d()) {
                        if (MSAdaptionService.c().c(this.f99556j)) {
                            str = "homepage_hot";
                        } else {
                            com.ss.android.ugc.aweme.main.j jVar = (com.ss.android.ugc.aweme.main.j) this.f99556j;
                            if (jVar != null) {
                                str = jVar.getEnterFrom();
                            } else {
                                str = null;
                            }
                        }
                        if (specialPlusService.isQuickPromoPlusEnabled() && specialPlusService.getQuickPromoPlusDebutTime() == 0) {
                            specialPlusService.setQuickPromoPlusDebutTime(System.currentTimeMillis() / 1000);
                        }
                        com.ss.android.ugc.aweme.common.r.a("special_icon_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("prop_id", specialPlusService.getEffectId()).f66730a);
                    }
                    a(true);
                    specialPlusService.setSpecialPlusState(true);
                    specialPlusService.setSpecialPlusShowed();
                }
            } else if (superEntranceEvent.getType() == 4) {
                d dVar10 = this.f99554c;
                if (dVar10 == null || !dVar10.d()) {
                    d dVar11 = this.f99554c;
                    if (dVar11 == null || !dVar11.c()) {
                        com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar2 = this.f99553b;
                        if (aVar2 == null) {
                            l.a("tabView");
                        }
                        aVar2.post(new c(this));
                    }
                }
            }
        }
    }
}
