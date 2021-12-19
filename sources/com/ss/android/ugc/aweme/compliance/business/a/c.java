package com.ss.android.ugc.aweme.compliance.business.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog;
import com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.v;
import h.a.am;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final h f76718e = i.a(m.SYNCHRONIZED, b.f76730a);

    /* renamed from: f  reason: collision with root package name */
    public static final Keva f76719f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f76720g;

    /* renamed from: h  reason: collision with root package name */
    public static final Set<String> f76721h = am.a((Object[]) new String[]{"AL", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB", "AX"});

    /* renamed from: i  reason: collision with root package name */
    public static final String f76722i = "IT";

    /* renamed from: j  reason: collision with root package name */
    public static final List<com.ss.android.ugc.aweme.compliance.api.services.termspp.a> f76723j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public static final a f76724k = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    private static final String f76725l = "tpc_consent";

    /* renamed from: a  reason: collision with root package name */
    public b f76726a;

    /* renamed from: b  reason: collision with root package name */
    public String f76727b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.compliance.api.services.consent.a f76728c;

    /* renamed from: d  reason: collision with root package name */
    public long f76729d;

    public static final class a {
        static {
            Covode.recordClassIndex(47429);
        }

        public static c a() {
            return (c) c.f76718e.getValue();
        }

        private a() {
        }

        public static boolean b() {
            if (c.f76719f.getBoolean("is_consent_accepted", false) || c.f76719f.getBoolean("user_logged_in_atleast_once", false)) {
                return true;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                return true;
            }
            return false;
        }

        public static ITpcConsentService.a c() {
            String a2 = com.ss.android.ugc.aweme.language.d.a();
            l.b(a2, "");
            Locale locale = Locale.ROOT;
            l.b(locale, "");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a2.toUpperCase(locale);
            l.b(upperCase, "");
            if (l.a((Object) upperCase, (Object) "US")) {
                return ITpcConsentService.a.US;
            }
            if (c.f76721h.contains(upperCase)) {
                return ITpcConsentService.a.EU;
            }
            if (l.a((Object) upperCase, (Object) "KR")) {
                return ITpcConsentService.a.KR;
            }
            return ITpcConsentService.a.ROW;
        }

        public static boolean d() {
            boolean z;
            if (!c.f76719f.contains("have_passed_consent")) {
                if ((!b() || in.d()) && !GuestModeServiceImpl.d().c()) {
                    z = false;
                } else {
                    z = true;
                }
                Iterator<T> it = c.f76723j.iterator();
                while (it.hasNext()) {
                    it.next().a(z);
                }
                c.f76719f.storeBoolean("have_passed_consent", z);
            }
            if (!c.f76719f.getBoolean("have_passed_consent", false)) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (!g2.isLogin() || in.d()) {
                    return false;
                }
            }
            return true;
        }

        public static int e() {
            int i2;
            if (!c.f76719f.contains("consent_reason")) {
                Keva keva = c.f76719f;
                if (in.d()) {
                    i2 = 2;
                } else if (GuestModeServiceImpl.d().c()) {
                    i2 = 3;
                } else if (c.f76719f.getBoolean("is_consent_accepted", false)) {
                    i2 = 6;
                } else if (c.f76719f.getBoolean("user_logged_in_atleast_once", false)) {
                    i2 = 4;
                } else {
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    if (g2.isLogin()) {
                        i2 = 1;
                    } else if (!d()) {
                        i2 = 7;
                    } else {
                        i2 = 0;
                    }
                }
                keva.storeInt("consent_reason", i2);
            }
            return c.f76719f.getInt("consent_reason", 0);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void b(int i2) {
            c.f76719f.storeInt("consent_reason", i2);
        }

        public static void a(int i2) {
            if (!c.f76719f.getBoolean("have_passed_consent", false)) {
                SplashAdServiceImpl.h().f();
            }
            Iterator<T> it = c.f76723j.iterator();
            while (it.hasNext()) {
                it.next().a(true);
            }
            c.f76719f.storeBoolean("have_passed_consent", true);
            b(i2);
        }
    }

    private c() {
    }

    static final class b extends h.f.b.m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f76730a = new b();

        static {
            Covode.recordClassIndex(47430);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.c$c  reason: collision with other inner class name */
    public static final class CallableC1748c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f76731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f76732b;

        static {
            Covode.recordClassIndex(47431);
        }

        public CallableC1748c(c cVar, Activity activity) {
            this.f76731a = cVar;
            this.f76732b = activity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            Activity activity = this.f76732b;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            DialogContext.a aVar2 = new DialogContext.a((e) activity);
            aVar2.f33424a = b.a.TERMS_PRIVACY_COOKIE;
            aVar2.f33428e = b.d.TERMS_PRIVACY_COOKIE;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.a.c.CallableC1748c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CallableC1748c f76733a;

                static {
                    Covode.recordClassIndex(47432);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    boolean z;
                    if (((e) this.f76733a.f76732b).isFinishing()) {
                        a.C0732a.f33434a.a(b.a.TERMS_PRIVACY_COOKIE);
                        return;
                    }
                    this.f76733a.f76731a.f76729d = System.currentTimeMillis();
                    this.f76733a.f76731a.f76726a = new b(this.f76733a.f76732b);
                    b bVar = this.f76733a.f76731a.f76726a;
                    if (bVar != null) {
                        bVar.setOnDismissListener(new a(this));
                    }
                    b bVar2 = this.f76733a.f76731a.f76726a;
                    if (bVar2 != null) {
                        if (a.c() == ITpcConsentService.a.EU) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bVar2.f76710a = z;
                    }
                    b bVar3 = this.f76733a.f76731a.f76726a;
                    if (bVar3 == null || bVar3.isShowing()) {
                        b bVar4 = this.f76733a.f76731a.f76726a;
                        if (bVar4 != null) {
                            bVar4.a();
                            return;
                        }
                        return;
                    }
                    b bVar5 = this.f76733a.f76731a.f76726a;
                    if (bVar5 != null) {
                        bVar5.show();
                    }
                    SpecActServiceImpl.i().a(true);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f76733a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.c$c$1$a */
                static final class a implements DialogInterface.OnDismissListener {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f76734a;

                    static {
                        Covode.recordClassIndex(47433);
                    }

                    a(AnonymousClass1 r1) {
                        this.f76734a = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                        a.C0732a.f33434a.a(b.a.TERMS_PRIVACY_COOKIE);
                        SpecActServiceImpl.i().a(false);
                    }
                }
            }));
            return z.f158842a;
        }
    }

    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f76735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f76736b;

        static {
            Covode.recordClassIndex(47434);
        }

        public d(c cVar, Activity activity) {
            this.f76735a = cVar;
            this.f76736b = activity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            Activity activity = this.f76736b;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            DialogContext.a aVar2 = new DialogContext.a((e) activity);
            aVar2.f33424a = b.a.TERMS_PRIVACY_COOKIE;
            aVar2.f33428e = b.d.TERMS_PRIVACY_COOKIE;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.a.c.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f76737a;

                static {
                    Covode.recordClassIndex(47435);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    if (((e) this.f76737a.f76736b).isFinishing()) {
                        a.C0732a.f33434a.a(b.a.TERMS_PRIVACY_COOKIE);
                        return;
                    }
                    this.f76737a.f76735a.f76729d = System.currentTimeMillis();
                    Activity activity = this.f76737a.f76736b;
                    l.d(activity, "");
                    if (com.ss.android.ugc.aweme.compliance.business.termspp.c.a() == 0) {
                        Intent intent = new Intent(activity, TermsConsentCombineDialog.class);
                        intent.putExtra("style", 3);
                        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                        activity.startActivity(intent);
                        return;
                    }
                    l.d(activity, "");
                    Intent intent2 = new Intent(activity, TermsConsentCombineDialogV2.class);
                    com.ss.android.ugc.tiktok.security.a.a.a(intent2, activity);
                    activity.startActivity(intent2);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f76737a = r1;
                }
            }));
            return z.f158842a;
        }
    }

    private final void b() {
        a(true);
        com.ss.android.ugc.aweme.compliance.api.services.consent.a aVar = this.f76728c;
        if (aVar != null) {
            aVar.j();
        }
        a.C0732a.f33434a.a(b.a.TERMS_PRIVACY_COOKIE);
        f76719f.storeBoolean("is_consent_accepted", true);
        a.a(6);
        v.O().y();
        AppsflyerImpl.b().a();
    }

    public final void a() {
        b();
        SecApiImpl.a().updateCollectMode(null);
        int i2 = d.f76738a[a.c().ordinal()];
        if (i2 == 1) {
            com.ss.android.ugc.aweme.compliance.api.a.n().a("kr_dnu_consent_box", "v1803");
        } else if (i2 != 2) {
            com.ss.android.ugc.aweme.compliance.api.a.n().a("row_dnu_consent_box", "v1");
        } else {
            com.ss.android.ugc.aweme.compliance.api.a.n().a("eu_dnu_consent_box", "v1");
        }
    }

    static {
        Covode.recordClassIndex(47428);
        Keva repo = Keva.getRepo("tpc_consent");
        f76719f = repo;
        if (!repo.contains("is_consent_accepted")) {
            repo.storeBoolean("is_consent_accepted", false);
        }
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(boolean z) {
        String str;
        long j2;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f76727b).a("stay_time", System.currentTimeMillis() - this.f76729d);
        if (z) {
            str = "confirm";
        } else {
            str = "background";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("result", str);
        Integer a4 = HybridABInfoService.b().a();
        if (a4 != null) {
            a3.a("is_ab_backend_resp_received", a4.intValue());
        }
        r.a("confirm_consent_box", a3.f66730a);
        if (z) {
            j2 = 0;
        } else {
            j2 = -1;
        }
        this.f76729d = j2;
    }
}
