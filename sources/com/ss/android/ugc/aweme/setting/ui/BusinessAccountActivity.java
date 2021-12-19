package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import com.ss.android.ugc.aweme.setting.ui.c.a;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.utils.av;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.v;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

public final class BusinessAccountActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f122721b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TuxAlertBadge f122722a;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f122723c;

    static {
        Covode.recordClassIndex(80558);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f122723c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f122723c == null) {
            this.f122723c = new SparseArray();
        }
        View view = (View) this.f122723c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f122723c.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80559);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onResume", true);
        super.onResume();
        a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onResume", false);
    }

    private final void a() {
        TuxAlertBadge tuxAlertBadge = this.f122722a;
        if (tuxAlertBadge != null) {
            tuxAlertBadge.setCount(TcmServiceImpl.j().e());
        }
        TuxAlertBadge tuxAlertBadge2 = this.f122722a;
        if (tuxAlertBadge2 != null) {
            tuxAlertBadge2.setVariant(1);
        }
        TuxAlertBadge tuxAlertBadge3 = this.f122722a;
        if (tuxAlertBadge3 != null) {
            tuxAlertBadge3.setMaxCount(2);
        }
        TuxAlertBadge tuxAlertBadge4 = this.f122722a;
        if (tuxAlertBadge4 == null || tuxAlertBadge4.getCount() != 0) {
            TuxAlertBadge tuxAlertBadge5 = this.f122722a;
            if (tuxAlertBadge5 != null) {
                tuxAlertBadge5.setVisibility(0);
                return;
            }
            return;
        }
        TuxAlertBadge tuxAlertBadge6 = this.f122722a;
        if (tuxAlertBadge6 != null) {
            tuxAlertBadge6.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f122733b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f122734c;

        static {
            Covode.recordClassIndex(80564);
        }

        f(BusinessAccountActivity businessAccountActivity, z.e eVar, String str) {
            this.f122732a = businessAccountActivity;
            this.f122733b = eVar;
            this.f122734c = str;
        }

        public final void run() {
            String str;
            if (this.f122732a._$_findCachedViewById(R.id.wr) != null) {
                try {
                    z.e eVar = this.f122733b;
                    com.bytedance.tux.tooltip.a.b.a aVar = new com.bytedance.tux.tooltip.a.b.a(this.f122732a);
                    TuxTextCell tuxTextCell = (TuxTextCell) this.f122732a._$_findCachedViewById(R.id.wr);
                    h.f.b.l.b(tuxTextCell, "");
                    eVar.element = (T) ((com.bytedance.tux.tooltip.a.b.a) ((com.bytedance.tux.tooltip.a.b.a) ((com.bytedance.tux.tooltip.a.b.a) ((com.bytedance.tux.tooltip.a.b.a) ((com.bytedance.tux.tooltip.a.b.a) ((com.bytedance.tux.tooltip.a.b.a) aVar.b(tuxTextCell)).a(5000L)).a(false)).a(this.f122732a.getResources().getColor(R.color.dm))).e(R.string.a3y).a(com.bytedance.tux.tooltip.h.TOP)).a(true, (View.OnClickListener) new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f122735a;

                        static {
                            Covode.recordClassIndex(80565);
                        }

                        {
                            this.f122735a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            Bundle bundle = new Bundle();
                            bundle.putString("videoCounts", String.valueOf(TcmServiceImpl.j().e()));
                            bundle.putString("enter_from", "bs");
                            SmartRouter.buildRoute(this.f122735a.f122732a, com.ss.android.ugc.aweme.commercialize.util.d.a(this.f122735a.f122734c, bundle)).open();
                        }
                    })).d();
                    T t = this.f122733b.element;
                    if (t != null) {
                        t.a();
                    }
                    com.ss.android.ugc.aweme.fe.a.e eVar2 = e.a.f91018a;
                    StringBuilder sb = new StringBuilder("ba_branded_content_tip_showed");
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    User curUser = g2.getCurUser();
                    if (curUser != null) {
                        str = curUser.getUid();
                    } else {
                        str = null;
                    }
                    eVar2.b(sb.append(str).toString(), (Boolean) true);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static final class m implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122748a;

        static {
            Covode.recordClassIndex(80573);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(BusinessAccountActivity businessAccountActivity) {
            this.f122748a = businessAccountActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f122748a.finish();
        }
    }

    public static final class p implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122752a;

        static {
            Covode.recordClassIndex(80578);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(BusinessAccountActivity businessAccountActivity) {
            this.f122752a = businessAccountActivity;
        }

        @Override // com.ss.android.ugc.aweme.setting.ui.c.a.b
        public final void a(int i2) {
            if (i2 == 0) {
                this.f122752a.finish();
            }
        }
    }

    public static final class b implements com.google.c.h.a.k<PromoteEntryCheck> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f122725b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f122726c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f122727d;

        static {
            Covode.recordClassIndex(80560);
        }

        private static Context a(BusinessAccountActivity businessAccountActivity) {
            Context applicationContext = businessAccountActivity.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            h.f.b.l.d(th, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(a(this.f122724a)).a(R.string.de2).a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
            if (r8 != null) goto L_0x0079;
         */
        @Override // com.google.c.h.a.k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck r8) {
            /*
            // Method dump skipped, instructions count: 241
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity.b.onSuccess(java.lang.Object):void");
        }

        b(BusinessAccountActivity businessAccountActivity, z.e eVar, int i2, int i3) {
            this.f122724a = businessAccountActivity;
            this.f122725b = eVar;
            this.f122726c = i2;
            this.f122727d = i3;
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122741a;

        static {
            Covode.recordClassIndex(80569);
        }

        j(BusinessAccountActivity businessAccountActivity) {
            this.f122741a = businessAccountActivity;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Bundle, h.z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f122742a = new a();

            static {
                Covode.recordClassIndex(80570);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                h.f.b.l.d(bundle2, "");
                bundle2.putString("enter_from", "Business settings");
                return h.z.f158842a;
            }
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.commercialize.live.business.links.d.a a2;
            ClickAgent.onClick(view);
            ICommercializeLiveService a3 = CommercializeLiveServiceImpl.a();
            if (!(a3 == null || (a2 = a3.a(com.ss.android.ugc.aweme.commercialize.live.business.links.d.d.Settings, a.f122742a)) == null)) {
                a2.a(this.f122741a);
            }
            r.a("ttba_enter_link_management_click_uv", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "Business settings").f66730a);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122728a;

        static {
            Covode.recordClassIndex(80561);
        }

        c(BusinessAccountActivity businessAccountActivity) {
            this.f122728a = businessAccountActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                createIIMServicebyMonsterPlugin.openBaMessageSettingActivity(this.f122728a, "business_setting_page");
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f122731a = new e();

        static {
            Covode.recordClassIndex(80563);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_film_star;
            aVar2.f44753e = Integer.valueOf((int) R.attr.a1);
            return h.z.f158842a;
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122740a;

        static {
            Covode.recordClassIndex(80568);
        }

        i(BusinessAccountActivity businessAccountActivity) {
            this.f122740a = businessAccountActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            Context applicationContext = this.f122740a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            StringBuilder sb = new StringBuilder("aweme://webview/?url=https://www.tiktok.com/ba_h5/creativeHub/home?enter-from=business&hide_nav_bar=1&locale=");
            Locale a2 = com.ss.android.ugc.aweme.i18n.language.i18n.c.a(com.bytedance.ies.ugc.appcontext.d.a());
            if (a2 != null) {
                str = a2.getLanguage();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(applicationContext, sb.append(str).toString()).open();
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f122744b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f122745c;

        static {
            Covode.recordClassIndex(80571);
        }

        k(BusinessAccountActivity businessAccountActivity, int i2, z.c cVar) {
            this.f122743a = businessAccountActivity;
            this.f122744b = i2;
            this.f122745c = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                BusinessAccountActivity businessAccountActivity = this.f122743a;
                int i2 = this.f122744b;
                int i3 = this.f122745c.element;
                z.e eVar = new z.e();
                eVar.element = "business_suite";
                com.google.c.h.a.l.a(PromoteEntryCheckApi.a.a().getPromoteEntryCheck("", eVar.element), new b(businessAccountActivity, eVar, i2, i3), com.ss.android.ugc.aweme.base.m.f68150a);
            }
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f122747b;

        static {
            Covode.recordClassIndex(80572);
        }

        l(BusinessAccountActivity businessAccountActivity, String str) {
            this.f122746a = businessAccountActivity;
            this.f122747b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context applicationContext = this.f122746a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            SmartRouter.buildRoute(applicationContext, this.f122747b).open();
            r.onEventV3("ttelite_BA_business_suite_suggested_account_entry_click");
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, h.z> {
        final /* synthetic */ BusinessAccountActivity this$0;

        static {
            Covode.recordClassIndex(80575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(BusinessAccountActivity businessAccountActivity) {
            super(1);
            this.this$0 = businessAccountActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f122750a);
            if (this.this$0.getIntent().getBooleanExtra("showTransition", false)) {
                baseActivityViewModel2.config(AnonymousClass2.f122751a);
            }
            return h.z.f158842a;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122729a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f122730b;

        static {
            Covode.recordClassIndex(80562);
        }

        d(BusinessAccountActivity businessAccountActivity, String str) {
            this.f122729a = businessAccountActivity;
            this.f122730b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            try {
                String str = this.f122730b;
                av.a(str, str, this.f122729a, PrivacyCert.Builder.Companion.with("bpea-226").usage("On  the business suite page , users can copy the official web link and use it on the web side.").tag("copyOfficialWebLinkOnBusinessSuitePage").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                r.a("ttelite_business_suite_weblink_copied", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "Business suite").f66730a);
            } catch (com.bytedance.bpea.basics.a e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
            new com.bytedance.tux.g.b(this.f122729a).e(R.string.gks).b();
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f122737b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f122738c;

        static {
            Covode.recordClassIndex(80566);
        }

        g(BusinessAccountActivity businessAccountActivity, z.e eVar, String str) {
            this.f122736a = businessAccountActivity;
            this.f122737b = eVar;
            this.f122738c = str;
        }

        public final void onClick(View view) {
            T t;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                T t2 = this.f122737b.element;
                if (!(t2 == null || !t2.isShowing() || (t = this.f122737b.element) == null)) {
                    t.dismiss();
                }
                Bundle bundle = new Bundle();
                bundle.putString("videoCounts", String.valueOf(TcmServiceImpl.j().e()));
                bundle.putString("enter_from", "bs");
                SmartRouter.buildRoute(this.f122736a, com.ss.android.ugc.aweme.commercialize.util.d.a(this.f122738c, bundle)).open();
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122739a;

        static {
            Covode.recordClassIndex(80567);
        }

        h(BusinessAccountActivity businessAccountActivity) {
            this.f122739a = businessAccountActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String a2 = SettingsManager.a().a("ttba_registration_schema", "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=landing-page%2Ftemplate.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_ba_lynx_v2%2Flanding-page");
            h.f.b.l.b(a2, "");
            if (TextUtils.isEmpty(a2)) {
                a2 = com.ss.android.ugc.aweme.setting.utils.c.f123034a;
            }
            Context applicationContext = this.f122739a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            SmartRouter.buildRoute(applicationContext, a2).open();
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            h.f.b.l.b(curUser, "");
            r.a("TTBA_Registration_Click_entrance", dVar.a("UID", curUser.getUid()).f66730a);
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BusinessAccountActivity f122749a;

        static {
            Covode.recordClassIndex(80574);
        }

        n(BusinessAccountActivity businessAccountActivity) {
            this.f122749a = businessAccountActivity;
        }

        public final void onClick(View view) {
            int i2;
            int dimensionPixelSize;
            ClickAgent.onClick(view);
            BusinessAccountActivity businessAccountActivity = this.f122749a;
            int identifier = businessAccountActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0 || (dimensionPixelSize = businessAccountActivity.getResources().getDimensionPixelSize(identifier)) <= 0) {
                i2 = 44;
            } else {
                i2 = com.bytedance.common.utility.n.c(this.f122749a, (float) dimensionPixelSize);
            }
            com.ss.android.ugc.aweme.setting.utils.b.a(this.f122749a, "https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=".concat(String.valueOf(i2)), new HashMap());
            r.a("click_insight", v.a("business", "enter_from"));
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.commerce.d bizAccountInfo;
        com.ss.android.ugc.aweme.commerce.d bizAccountInfo2;
        com.ss.android.ugc.aweme.commerce.d bizAccountInfo3;
        String str;
        c.b bVar;
        com.ss.android.ugc.aweme.commerce.d bizAccountInfo4;
        com.ss.android.ugc.aweme.commerce.d bizAccountInfo5;
        com.ss.android.ugc.aweme.commerce.d bizAccountInfo6;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onCreate", true);
        activityConfiguration(new o(this));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.axz);
        ((TextTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new m(this));
        ((CommonItemView) _$_findCachedViewById(R.id.je)).setOnClickListener(new n(this));
        if (com.ss.android.ugc.aweme.setting.utils.g.a()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            h.f.b.l.b(curUser, "");
            int accountType = curUser.getAccountType();
            z.c cVar = new z.c();
            cVar.element = 0;
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            if (g3.getCurUser().getCommerceUserInfo() != null) {
                IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g4, "");
                cVar.element = g4.getCurUser().getCommerceUserInfo().getPromotePayType();
            }
            CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.dcg);
            h.f.b.l.b(commonItemView, "");
            commonItemView.setVisibility(0);
            r.a("Promote_profile_entrance_show", new com.ss.android.ugc.aweme.app.f.d().a("user_account_type", accountType).a("promote_version", cVar.element).f66730a);
            com.ss.android.ugc.aweme.setting.utils.g.a(this);
            ((CommonItemView) _$_findCachedViewById(R.id.dcg)).setOnClickListener(new k(this, accountType, cVar));
        }
        IAccountUserService e2 = AccountService.a().e();
        h.f.b.l.b(e2, "");
        User curUser2 = e2.getCurUser();
        h.f.b.l.b(curUser2, "");
        com.ss.android.ugc.aweme.commerce.d bizAccountInfo7 = curUser2.getBizAccountInfo();
        if (bizAccountInfo7 != null && bizAccountInfo7.enableAutoMsg()) {
            CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.clr);
            h.f.b.l.b(commonItemView2, "");
            commonItemView2.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.clr)).setOnClickListener(new c(this));
        }
        IAccountUserService g5 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g5, "");
        User curUser3 = g5.getCurUser();
        if (!(curUser3 == null || (bizAccountInfo6 = curUser3.getBizAccountInfo()) == null || !bizAccountInfo6.enableCreativeHub())) {
            CommonItemView commonItemView3 = (CommonItemView) _$_findCachedViewById(R.id.ah1);
            h.f.b.l.b(commonItemView3, "");
            commonItemView3.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.ah1)).setOnClickListener(new i(this));
        }
        IAccountUserService g6 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g6, "");
        User curUser4 = g6.getCurUser();
        if (!(curUser4 == null || (bizAccountInfo5 = curUser4.getBizAccountInfo()) == null || !bizAccountInfo5.enableLiveLinks())) {
            CommonItemView commonItemView4 = (CommonItemView) _$_findCachedViewById(R.id.cd9);
            h.f.b.l.b(commonItemView4, "");
            commonItemView4.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.cd9)).setOnClickListener(new j(this));
        }
        IAccountUserService g7 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g7, "");
        User curUser5 = g7.getCurUser();
        if (!(curUser5 == null || (bizAccountInfo4 = curUser5.getBizAccountInfo()) == null || !bizAccountInfo4.enableBusinessRegistration())) {
            CommonItemView commonItemView5 = (CommonItemView) _$_findCachedViewById(R.id.a0r);
            h.f.b.l.b(commonItemView5, "");
            commonItemView5.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.a0r)).setOnClickListener(new h(this));
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("bundle_show_account_dialog_when_start", false)) {
            IAccountUserService g8 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g8, "");
            User curUser6 = g8.getCurUser();
            h.f.b.l.b(curUser6, "");
            int accountType2 = curUser6.getAccountType();
            p pVar = new p(this);
            h.f.b.l.d(this, "");
            com.ss.android.ugc.aweme.setting.ui.c.a aVar = new com.ss.android.ugc.aweme.setting.ui.c.a(this);
            com.bytedance.tux.sheet.sheet.a aVar2 = new a.C1112a().a(aVar).f45299a;
            aVar.f122884i = pVar;
            h.f.b.l.d(aVar2, "");
            aVar.f122882g = aVar2;
            aVar.setAccountType(accountType2);
            new Handler().postDelayed(new a.C3182a.RunnableC3183a(this, aVar2), 400);
        }
        String str2 = null;
        this.f122722a = new TuxAlertBadge(this, null, 0, 6);
        String d2 = TcmServiceImpl.j().d();
        if (d2 == null) {
            d2 = "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=branded-content%2Ftemplate.js&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_ba_lynx_v2%2Fbranded-content%3Fpage_module%3Doverview&page_module=overview";
        }
        IAccountUserService g9 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g9, "");
        User curUser7 = g9.getCurUser();
        if (!(curUser7 == null || (bizAccountInfo3 = curUser7.getBizAccountInfo()) == null || !bizAccountInfo3.enableBrandedContent() || d2.length() == 0)) {
            TuxTextCell tuxTextCell = (TuxTextCell) _$_findCachedViewById(R.id.wr);
            h.f.b.l.b(tuxTextCell, "");
            tuxTextCell.setVisibility(0);
            a();
            ((TuxTextCell) _$_findCachedViewById(R.id.wr)).setIcon(com.bytedance.tux.c.c.a(e.f122731a));
            TuxTextCell tuxTextCell2 = (TuxTextCell) _$_findCachedViewById(R.id.wr);
            c.f fVar = new c.f(this);
            TuxAlertBadge tuxAlertBadge = this.f122722a;
            if (tuxAlertBadge != null) {
                fVar.a(tuxAlertBadge, false);
            }
            tuxTextCell2.setAccessory(fVar);
            com.ss.android.ugc.aweme.fe.a.e eVar = e.a.f91018a;
            StringBuilder sb = new StringBuilder("ba_branded_content_tip_showed");
            IAccountUserService g10 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g10, "");
            User curUser8 = g10.getCurUser();
            if (curUser8 != null) {
                str = curUser8.getUid();
            } else {
                str = null;
            }
            boolean z = !eVar.a(sb.append(str).toString(), (Boolean) false).booleanValue();
            z.e eVar2 = new z.e();
            eVar2.element = null;
            if (z) {
                com.ss.android.ugc.aweme.base.utils.m.a(new f(this, eVar2, d2), 200);
            }
            TuxTextCell tuxTextCell3 = (TuxTextCell) _$_findCachedViewById(R.id.wr);
            if (tuxTextCell3 != null) {
                bVar = tuxTextCell3.getAccessory();
            } else {
                bVar = null;
            }
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
            ((c.f) bVar).a(new g(this, eVar2, d2));
        }
        Context baseContext = getBaseContext();
        h.f.b.l.b(baseContext, "");
        SpannableString spannableString = new SpannableString(baseContext.getResources().getString(R.string.gkr, "www.tiktok.com/business-suite"));
        int a2 = h.m.p.a((CharSequence) spannableString, "www.tiktok.com/business-suite", 0, false, 6);
        spannableString.setSpan(new StyleSpan(1), a2, a2 + 29, 33);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.v4);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(spannableString);
        ((TuxTextView) _$_findCachedViewById(R.id.v4)).setOnClickListener(new d(this, "www.tiktok.com/business-suite"));
        IAccountUserService g11 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g11, "");
        User curUser9 = g11.getCurUser();
        if (!(curUser9 == null || (bizAccountInfo2 = curUser9.getBizAccountInfo()) == null)) {
            str2 = bizAccountInfo2.getSuggestedAccountsLynxSchema();
        }
        IAccountUserService g12 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g12, "");
        User curUser10 = g12.getCurUser();
        if (!(curUser10 == null || (bizAccountInfo = curUser10.getBizAccountInfo()) == null || !bizAccountInfo.enableSuggestedAccounts())) {
            CommonItemView commonItemView6 = (CommonItemView) _$_findCachedViewById(R.id.e4_);
            h.f.b.l.b(commonItemView6, "");
            commonItemView6.setVisibility(0);
            ((CommonItemView) _$_findCachedViewById(R.id.e4_)).setOnClickListener(new l(this, str2));
        }
        String a3 = a(getIntent(), "enterFrom");
        if (a3 == null) {
            a3 = "";
        }
        h.f.b.l.b(a3, "");
        h.f.b.l.d(a3, "");
        r.a("event_enter_business_setting", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a3).f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.BusinessAccountActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
