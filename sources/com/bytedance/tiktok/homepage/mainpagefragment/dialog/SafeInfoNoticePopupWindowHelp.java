package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.security.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.compliance.api.b.c;
import com.ss.android.ugc.aweme.compliance.api.c.f;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.profile.aj;
import f.a.ae;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class SafeInfoNoticePopupWindowHelp implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public d f44288a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.service.f.a.a f44289b;

    /* renamed from: c  reason: collision with root package name */
    private final f f44290c;

    /* renamed from: d  reason: collision with root package name */
    private final View f44291d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.base.f.a f44292e;

    /* renamed from: f  reason: collision with root package name */
    private final TabChangeManager f44293f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f44294g;

    static {
        Covode.recordClassIndex(27138);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(189, new g(SafeInfoNoticePopupWindowHelp.class, "onDiscoverSearchEvent", com.ss.android.ugc.aweme.discover.e.d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(Integer.valueOf((int) BuildConfig.VERSION_CODE), new g(SafeInfoNoticePopupWindowHelp.class, "onShowPolicyNoticeToastEvent", c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(191, new g(SafeInfoNoticePopupWindowHelp.class, "onSafeInfoNoticeEvent", aj.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        this.f44294g = false;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    public final void a() {
        d dVar;
        d dVar2 = this.f44288a;
        if (!(dVar2 == null || !dVar2.isShowing() || (dVar = this.f44288a) == null)) {
            try {
                dVar.dismiss();
            } catch (Exception unused) {
            }
        }
        this.f44289b.k();
    }

    private final boolean b() {
        f fVar;
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder sb = new StringBuilder("prior_to_safe_info_");
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (!repo.getBoolean(sb.append(g2.getCurUserId()).toString(), false) && ((fVar = this.f44290c) == null || fVar.getToastVisibility() != 0)) {
            return d.a.a();
        }
        a();
        return false;
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        TabChangeManager tabChangeManager;
        this.f44294g = true;
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sb = new StringBuilder("prior_to_safe_info_");
            IAccountUserService g3 = b.g();
            l.b(g3, "");
            if (repo.getBoolean(sb.append(g3.getCurUserId()).toString(), false) || ((tabChangeManager = this.f44293f) != null && l.a((Object) "HOME", (Object) tabChangeManager.f109107d))) {
                a();
            }
        }
    }

    public static final class a implements ae<com.ss.android.ugc.aweme.account.security.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SafeInfoNoticePopupWindowHelp f44295a;

        static {
            Covode.recordClassIndex(27139);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp) {
            this.f44295a = safeInfoNoticePopupWindowHelp;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.account.security.c cVar) {
            com.ss.android.ugc.aweme.account.security.c cVar2 = cVar;
            l.d(cVar2, "");
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sb = new StringBuilder("last_time_fetch_safe_info_");
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            repo.storeLong(sb.append(g2.getCurUserId()).toString(), System.currentTimeMillis() + (SettingsManager.a().a("safe_info_notice_frequency", 86400L) * 1000));
            com.ss.android.ugc.aweme.account.security.a aVar = cVar2.f65310a;
            if (aVar != null && !TextUtils.isEmpty(aVar.f65302b)) {
                com.google.gson.f fVar = new com.google.gson.f();
                StringBuilder sb2 = new StringBuilder("safe_info_");
                IAccountUserService g3 = b.g();
                l.b(g3, "");
                repo.storeString(sb2.append(g3.getCurUserId()).toString(), fVar.b(aVar));
                StringBuilder sb3 = new StringBuilder("safe_info_need_show_");
                IAccountUserService g4 = b.g();
                l.b(g4, "");
                repo.storeBoolean(sb3.append(g4.getCurUserId()).toString(), true);
            }
            this.f44295a.a(true);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onDiscoverSearchEvent(com.ss.android.ugc.aweme.discover.e.d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.f80949a) {
            a();
        } else {
            a(false);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onSafeInfoNoticeEvent(aj ajVar) {
        if (ajVar == null) {
            return;
        }
        if (ajVar.f115959a) {
            a();
        } else {
            a(false);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onShowPolicyNoticeToastEvent(c cVar) {
        l.d(cVar, "");
        this.f44290c.setValues(cVar.f76637a);
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f44294g
            if (r0 == 0) goto L_0x000a
            boolean r0 = r3.b()
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            return
        L_0x000b:
            com.ss.android.ugc.aweme.account.security.d r0 = r3.f44288a
            if (r0 == 0) goto L_0x0017
            if (r4 == 0) goto L_0x0039
            r0.dismiss()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            r0 = 0
            r3.f44288a = r0
        L_0x0017:
            com.ss.android.ugc.aweme.account.security.d r2 = new com.ss.android.ugc.aweme.account.security.d
            com.ss.android.ugc.aweme.base.f.a r0 = r3.f44292e
            android.content.Context r1 = r0.requireContext()
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            android.view.View r0 = r3.f44291d
            r2.<init>(r1, r0)
            r3.f44288a = r2
            r0 = 1
            r2.setTouchable(r0)
            com.ss.android.ugc.aweme.account.security.d r1 = r3.f44288a
            if (r1 == 0) goto L_0x0039
            r0 = 2130772080(0x7f010070, float:1.7147268E38)
            r1.setAnimationStyle(r0)
        L_0x0039:
            com.ss.android.ugc.aweme.base.f.a r0 = r3.f44292e
            androidx.fragment.app.e r0 = r0.getActivity()
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.base.f.a r0 = r3.f44292e
            androidx.fragment.app.e r0 = r0.getActivity()
            if (r0 != 0) goto L_0x004c
            h.f.b.l.b()
        L_0x004c:
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x000a
            com.ss.android.ugc.aweme.base.f.a r0 = r3.f44292e
            boolean r0 = r0.ab_()
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.account.security.d r0 = r3.f44288a
            if (r0 == 0) goto L_0x000a
            r0.a()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp.a(boolean):void");
    }

    public SafeInfoNoticePopupWindowHelp(com.ss.android.ugc.aweme.base.f.a aVar, com.ss.android.ugc.aweme.im.service.f.a.a aVar2, f fVar, View view, TabChangeManager tabChangeManager) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(fVar, "");
        l.d(view, "");
        l.d(tabChangeManager, "");
        this.f44289b = aVar2;
        this.f44290c = fVar;
        this.f44291d = view;
        this.f44292e = aVar;
        this.f44293f = tabChangeManager;
        androidx.lifecycle.i lifecycle = aVar.getLifecycle();
        if (lifecycle != null) {
            lifecycle.a(this);
        }
        EventBus.a(EventBus.a(), this);
    }
}
