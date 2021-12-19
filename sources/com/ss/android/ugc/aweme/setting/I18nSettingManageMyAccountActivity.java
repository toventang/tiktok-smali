package com.ss.android.ugc.aweme.setting;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.creatortools.api.CanQuitBusinessAccountApi;
import com.ss.android.ugc.aweme.cv;
import com.ss.android.ugc.aweme.dc.c;
import com.ss.android.ugc.aweme.dc.f;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.profile.f.ag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi;
import com.ss.android.ugc.aweme.setting.api.IUnbindValidateApi;
import com.ss.android.ugc.aweme.setting.api.c;
import com.ss.android.ugc.aweme.setting.d.e;
import com.ss.android.ugc.aweme.setting.j.b;
import com.ss.android.ugc.aweme.setting.model.h;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.aweme.setting.verification.c;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.utils.hp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.ref.SoftReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class I18nSettingManageMyAccountActivity extends a implements WeakHandler.IHandler, i, j {
    private static final boolean p = false;

    /* renamed from: a  reason: collision with root package name */
    protected User f121979a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f121980b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f121981c;

    /* renamed from: d  reason: collision with root package name */
    h f121982d = new h();

    /* renamed from: e  reason: collision with root package name */
    TextView f121983e;

    /* renamed from: f  reason: collision with root package name */
    f f121984f;

    /* renamed from: g  reason: collision with root package name */
    f f121985g;

    /* renamed from: h  reason: collision with root package name */
    f f121986h;

    /* renamed from: i  reason: collision with root package name */
    f f121987i;

    /* renamed from: j  reason: collision with root package name */
    f f121988j;

    /* renamed from: k  reason: collision with root package name */
    f f121989k;

    /* renamed from: l  reason: collision with root package name */
    c f121990l;

    /* renamed from: m  reason: collision with root package name */
    f f121991m;
    TuxIconView n;
    TuxTextView o;
    private com.ss.android.ugc.aweme.setting.verification.c q;
    private WeakHandler r;
    private final f.a.b.a s = new f.a.b.a();
    private dm t;

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(55, new g(I18nSettingManageMyAccountActivity.class, "onSwitchBusinessAccountSuccessEvent", e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final void a(final boolean z) {
        final o oVar = new o(this);
        oVar.show();
        IUnbindValidateApi iUnbindValidateApi = IUnbindValidateApi.a.f122054a;
        String a2 = com.bytedance.sdk.a.f.h.a(b.f59141e + "/passport/email/unbind_validate/");
        l.b(a2, "");
        iUnbindValidateApi.unbindEmailValidate(a2).a(new b.g<com.ss.android.ugc.aweme.setting.api.c, Object>() {
            /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass8 */

            static {
                Covode.recordClassIndex(79973);
            }

            @Override // b.g
            public final Object then(b.i<com.ss.android.ugc.aweme.setting.api.c> iVar) {
                oVar.dismiss();
                if (!ai.a(iVar) || iVar.d().f122073b == null) {
                    I18nSettingManageMyAccountActivity.this.c();
                    I18nSettingManageMyAccountActivity.a("unlink", false, z, -1);
                    return null;
                }
                c.a aVar = iVar.d().f122073b;
                int i2 = aVar.f122074a;
                I18nSettingManageMyAccountActivity.a("unlink", false, z, i2);
                if (i2 == 0) {
                    I18nSettingManageMyAccountActivity.this.f121981c = true;
                    com.ss.android.ugc.aweme.account.b.e().unbindEmail(I18nSettingManageMyAccountActivity.this, z, aVar.f122075b, "manage_my_account");
                    return null;
                }
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                i18nSettingManageMyAccountActivity.b(i18nSettingManageMyAccountActivity.a(false, aVar.f122074a));
                return null;
            }
        }, b.i.f4826c, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface, int i2, int i3) {
        if (i2 == 14 && i3 == 1) {
            com.ss.android.ugc.aweme.account.b.g().queryUser();
            com.ss.android.ugc.aweme.compliance.api.a.s().a();
            b(true);
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(getResources().getString(R.string.gbf)).a();
            if (com.bytedance.ies.abmock.j.a().c()) {
                SettingManagerServiceImpl.b().a(1);
            } else {
                SettingManagerServiceImpl.b().a(this);
            }
            SettingManagerServiceImpl.b().a();
            r.a("switch_to_personal_account_success", new HashMap());
        } else {
            b();
        }
        dialogInterface.dismiss();
    }

    static {
        Covode.recordClassIndex(79964);
    }

    private void m() {
        this.f121979a = com.ss.android.ugc.aweme.account.b.g().getCurUser();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de9).a();
    }

    private void n() {
        User user = this.f121979a;
        if (user != null && user.getBindPhone() != null) {
            this.f121984f.a(c(this.f121979a.getBindPhone()));
        }
    }

    public final void c() {
        new com.bytedance.tux.g.b(this).e(R.string.c4f).b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z d() {
        this.f121981c = true;
        a("change", false, false, -1);
        com.ss.android.ugc.aweme.account.b.e().changeUnverifiedEmail(this, "manage_my_account", new Bundle());
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z e() {
        this.f121981c = true;
        a("verify", false, false, -1);
        com.ss.android.ugc.aweme.account.b.e().verifyEmail(this, "manage_my_account", new Bundle(), null);
        return z.f158842a;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        this.q.f123053a.a();
        EventBus.a().b(this);
        this.r = null;
        this.s.dispose();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z f() {
        r.a("enter_email_setting", new d().a("status", "verified").f66730a);
        this.f121981c = true;
        a("change", false, true, -1);
        com.ss.android.ugc.aweme.account.b.e().changeEmail(this, "manage_my_account", new Bundle(), null);
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z g() {
        a("change", true, false, -1);
        AnonymousClass1 r1 = new com.ss.android.ugc.aweme.setting.j.a() {
            /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79965);
            }

            @Override // com.ss.android.ugc.aweme.setting.j.a
            public final void a(boolean z, boolean z2) {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new a.e().a(i18nSettingManageMyAccountActivity.getString(R.string.dpw)).a(new View.OnClickListener() {
                    /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(79968);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        I18nSettingManageMyAccountActivity.this.f121981c = true;
                        com.ss.android.ugc.aweme.account.b.e().modifyMobile(I18nSettingManageMyAccountActivity.this, "manage_my_account", null, null);
                    }
                }));
                if (z) {
                    arrayList.add(new a.e().a(i18nSettingManageMyAccountActivity.getString(R.string.dpv)).a(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(79969);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            I18nSettingManageMyAccountActivity.this.f121981c = true;
                            com.ss.android.ugc.aweme.account.b.e().modifyMobileVerifyByEmail(I18nSettingManageMyAccountActivity.this, "manage_my_account", null, null);
                        }
                    }));
                }
                if (z2) {
                    arrayList.add(new a.e().a(i18nSettingManageMyAccountActivity.getString(R.string.dpx)).a(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(79970);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            I18nSettingManageMyAccountActivity.this.f121981c = true;
                            com.ss.android.ugc.aweme.account.b.e().modifyMobileVerifyByPassword(I18nSettingManageMyAccountActivity.this, "manage_my_account", null, null);
                        }
                    }));
                }
                a.b bVar = new a.b();
                bVar.f45252a.f45241i = Integer.valueOf((int) R.string.dpy);
                bVar.b(arrayList).b().show(i18nSettingManageMyAccountActivity.getSupportFragmentManager(), (String) null);
            }
        };
        l.d(r1, "");
        com.ss.android.ugc.aweme.setting.j.b.f122240a = new SoftReference<>(r1);
        l.d("change_mobile_without_old_mobile", "");
        l.d("change_mobile_without_old_mobile", "");
        IChangePhoneHelperApi.a.f122051a.safeEnv("change_mobile_without_old_mobile", "change_mobile_without_old_mobile").a(b.c.f122244a);
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z h() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f121982d.getAppealUrl()));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
            startActivity(intent);
            return null;
        } catch (ActivityNotFoundException unused) {
            SmartRouter.buildRoute(this, "//webview").withParam(Uri.parse(this.f121982d.getAppealUrl())).open();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        r.onEventV3("manage_account_password_click");
        this.f121981c = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("have_set_password", this.f121980b);
        com.ss.android.ugc.aweme.account.b.f().changePassword(this, "manage_my_account", "password_click", bundle, null);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", true);
        super.onResume();
        com.ss.android.ugc.aweme.account.b.g().getSetPasswordStatus(new cv() {
            /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass9 */

            static {
                Covode.recordClassIndex(79974);
            }

            @Override // com.ss.android.ugc.aweme.cv
            public final void onUpdateFailed(String str) {
            }

            @Override // com.ss.android.ugc.aweme.cv
            public final void onUpdateSuccess(boolean z) {
                I18nSettingManageMyAccountActivity.this.f121980b = z;
                SharePrefCache.inst().getUserHasPassword().b(Boolean.valueOf(I18nSettingManageMyAccountActivity.this.f121980b));
            }
        });
        if (this.f121981c) {
            this.f121981c = false;
            m();
            a(this.f121979a);
            n();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
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

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        m();
        int i2 = 0;
        r.a("ttelite_click_backto_PA_button", new d().a("status", 0).f66730a);
        if (ag.a()) {
            MixFeedService.k().a(true);
            if (this.f121979a.getAccountType() == 3) {
                f.a.b.a aVar = this.s;
                String str = com.ss.android.c.b.f59141e;
                l.b(str, "");
                aVar.a(((CanQuitBusinessAccountApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(CanQuitBusinessAccountApi.class)).check().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ae(this), new af(this)));
                return;
            } else if (this.f121979a.getAccountType() == 2) {
                if (!hp.a.d() || !hp.a.a()) {
                    i2 = R.string.f03;
                } else {
                    i2 = R.string.a8_;
                }
            } else if (!hp.a.d() || !hp.a.a()) {
                i2 = R.string.b74;
            } else {
                i2 = R.string.ge0;
            }
        }
        a(i2, R.string.gb7);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        boolean isPhoneBinded = com.ss.android.ugc.aweme.account.b.g().getCurUser().isPhoneBinded();
        r.a("manage_account_phone_click", new d().a("phone_binding_status", isPhoneBinded ? 1 : 0).f66730a);
        if (isPhoneBinded) {
            r.a("show_unlink_phone_email_popup", new d().a("enter_from", "manage_my_account").a("unlink_type", "phone").f66730a);
            final com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(this);
            bVar.f44820b = true;
            bVar.a(getString(R.string.h5m), new ah(this));
            bVar.a(getString(R.string.h5q), new ai(this));
            final o oVar = new o(this);
            oVar.show();
            com.ss.android.ugc.aweme.setting.verification.c cVar = this.q;
            User user = this.f121979a;
            AnonymousClass2 r1 = new com.ss.android.ugc.aweme.setting.verification.b() {
                /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(79966);
                }

                @Override // com.ss.android.ugc.aweme.setting.verification.b
                public final void a() {
                    oVar.dismiss();
                }

                @Override // com.ss.android.ugc.aweme.setting.verification.b
                public final void a(VerificationResponse verificationResponse) {
                    StringBuilder sb = new StringBuilder(I18nSettingManageMyAccountActivity.this.getString(R.string.h5n));
                    com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.a(new com.bytedance.tux.dialog.b(I18nSettingManageMyAccountActivity.this).b(I18nSettingManageMyAccountActivity.this.getString(R.string.h5p, new Object[]{"\n" + I18nSettingManageMyAccountActivity.this.f121979a.getBindPhone()})).d(sb.toString()).a(bVar).a(new com.bytedance.tux.dialog.e.g(I18nSettingManageMyAccountActivity.this, R.raw.icon_phone)), true).a(new h.f.a.b<com.bytedance.tux.dialog.a, z>() {
                        /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(79967);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
                            return a(aVar);
                        }

                        private static z a(com.bytedance.tux.dialog.a aVar) {
                            Object obj = aVar.f44884j;
                            if (!(obj instanceof String) || !TextUtils.equals("button_close", (String) obj)) {
                                return null;
                            }
                            I18nSettingManageMyAccountActivity.a("x-out", true, false, -1);
                            return null;
                        }
                    }).a(false);
                    if (verificationResponse.shouldShowChangeMobileDialog()) {
                        TuxTextView tuxTextView = new TuxTextView(I18nSettingManageMyAccountActivity.this);
                        tuxTextView.setText(I18nSettingManageMyAccountActivity.this.getString(R.string.h5o));
                        tuxTextView.setTuxFont(41);
                        tuxTextView.setTextColorRes(R.attr.bi);
                        tuxTextView.setGravity(17);
                        bVar.a(new com.bytedance.tux.dialog.a.b(tuxTextView));
                    }
                    bVar.a().b().show();
                }
            };
            l.d(user, "");
            l.d(r1, "");
            cVar.a(c.a.c(), user, r1);
            return;
        }
        this.f121981c = true;
        com.ss.android.ugc.aweme.account.b.e().bindMobile(this, "manage_my_account", null, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        int i2;
        int i3;
        User user = this.f121979a;
        if (com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getEnableEmailVerification().intValue() == 1) {
            String email = user.getEmail();
            if (!TextUtils.isEmpty(email)) {
                boolean isEmailVerified = user.isEmailVerified();
                r.a("show_unlink_phone_email_popup", new d().a("enter_from", "manage_my_account").a("unlink_type", "email").a("is_email_verified", isEmailVerified ? 1 : 0).f66730a);
                com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(this);
                bVar.f44820b = true;
                if (isEmailVerified) {
                    bVar.a(R.string.h54, new aj(this));
                    bVar.a(R.string.h57, new ak(this));
                    i2 = R.string.h56;
                } else {
                    bVar.a(R.string.h53, new al(this));
                    bVar.b(R.string.h4y, new an(this));
                    bVar.b(R.string.h52, new ao(this));
                    i2 = R.string.h51;
                }
                String string = getString(i2, new Object[]{"\n".concat(String.valueOf(email))});
                if (isEmailVerified) {
                    i3 = R.string.h55;
                } else {
                    i3 = R.string.h4z;
                }
                com.bytedance.tux.dialog.b bVar2 = (com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.a(new com.bytedance.tux.dialog.b(this).b(string).d(getString(i3)).a(bVar).a(new com.bytedance.tux.dialog.e.g(this, R.raw.icon_envelope)), true).a(false).a(new h.f.a.b<com.bytedance.tux.dialog.a, z>() {
                    /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(79972);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
                        return a(aVar);
                    }

                    private static z a(com.bytedance.tux.dialog.a aVar) {
                        Object obj = aVar.f44884j;
                        if (!(obj instanceof String) || !TextUtils.equals("button_close", (String) obj)) {
                            return null;
                        }
                        I18nSettingManageMyAccountActivity.a("x-out", false, false, -1);
                        return null;
                    }
                });
                if (!isEmailVerified) {
                    TuxTextView tuxTextView = new TuxTextView(this);
                    tuxTextView.setText(getString(R.string.h50));
                    tuxTextView.setTuxFont(41);
                    tuxTextView.setTextColorRes(R.attr.bi);
                    tuxTextView.setGravity(17);
                    bVar2.a(new com.bytedance.tux.dialog.a.b(tuxTextView));
                }
                bVar2.a().b().show();
                return;
            }
            this.f121981c = true;
            com.ss.android.ugc.aweme.account.b.e().bindEmail(this, "manage_my_account", "click_email", new Bundle(), null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        r.a("click_manage_account_birthday_edit", new d().a("enter_from", "age_edit_page").a("user_age_status", this.f121982d.getType()).f66730a);
    }

    public void exit(View view) {
        finish();
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(e eVar) {
        finish();
    }

    private static com.bytedance.ies.dmt.ui.d.a c(String str) {
        return new a.C0730a().b(str).f33382a;
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            new com.bytedance.tux.g.b(this).a(str).b();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 112 && (message.obj instanceof User)) {
            com.ss.android.ugc.aweme.account.b.g().updateCurUser((User) message.obj);
            m();
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        try {
            return DateFormat.getDateInstance(1, new Locale(((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a(), com.ss.android.ugc.aweme.language.d.a())).format(new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).parse(str));
        } catch (ParseException unused) {
            return getString(R.string.ov);
        }
    }

    private void a(User user) {
        if (com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getEnableEmailVerification().intValue() != 1) {
            this.f121990l.a(false);
            return;
        }
        this.f121990l.a(true);
        if (p) {
            user.getEmail();
            user.isEmailVerified();
        }
        String email = user.getEmail();
        if (TextUtils.isEmpty(email)) {
            this.o.setText(email);
            com.ss.android.ugc.aweme.setting.b.a.a(this.f121990l, this.o, null);
        } else if (user.isEmailVerified()) {
            this.o.setText(email);
            com.ss.android.ugc.aweme.setting.b.a.a(this.f121990l, this.o, null);
        } else {
            com.ss.android.ugc.aweme.setting.b.a.a(this.f121990l, this.n, getString(R.string.h5v, new Object[]{user.getEmail()}));
        }
    }

    private void b(boolean z) {
        m();
        if (this.f121979a != null) {
            this.f121988j.a(8);
            this.f121989k.a(8);
            if (this.f121979a.getAccountType() == 0 || z) {
                this.f121989k.a(0);
            } else if (this.f121979a.getAccountType() == 3) {
                this.f121988j.a(0);
            } else if (this.f121979a.getAccountType() == 2) {
                this.f121988j.a(0);
                this.f121989k.a(0);
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        int i2;
        String a2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65559e = R.attr.f159902m;
        xVar.f65560f = R.attr.f159902m;
        xVar.f65562h = true;
        activityConfiguration(new aa(xVar));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.ayc);
        this.f121983e = (TextView) findViewById(R.id.title);
        if (getIntent().getSerializableExtra("dob_status") != null) {
            this.f121982d = (h) getIntent().getSerializableExtra("dob_status");
        }
        this.r = new WeakHandler(getMainLooper(), this);
        EventBus.a(EventBus.a(), this);
        com.ss.android.ugc.aweme.account.b.g().queryUser(this.r);
        this.t = new dm((PowerList) findViewById(R.id.d7z));
        m();
        View findViewById = findViewById(R.id.qb);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ab(this));
        }
        this.f121983e.setText(R.string.d1x);
        com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
        aVar.f44749a = R.raw.icon_exclamation_mark_circle_fill;
        aVar.f44753e = Integer.valueOf((int) R.attr.av);
        int a3 = (int) com.bytedance.android.ecommerce.k.l.a(this, 16.0f);
        aVar.f44750b = a3;
        aVar.f44751c = a3;
        TuxIconView tuxIconView = new TuxIconView(this);
        this.n = tuxIconView;
        tuxIconView.setTuxIcon(aVar);
        this.n.setIconWidth(a3);
        this.n.setIconHeight(a3);
        TuxTextView tuxTextView = new TuxTextView(this);
        this.o = tuxTextView;
        tuxTextView.setTuxFont(41);
        this.o.setTextColor(androidx.core.content.b.c(this, R.color.c5));
        this.t.a(new com.ss.android.ugc.aweme.dc.d(new com.ss.android.ugc.aweme.be.e(getString(R.string.d1z), false, true)));
        f a4 = com.ss.android.ugc.aweme.setting.b.a.a(getString(R.string.fob), new am(this));
        this.f121984f = a4;
        this.t.a(a4);
        String string = getString(R.string.d7w);
        av avVar = new av(this);
        l.d(string, "");
        l.d(avVar, "");
        com.ss.android.ugc.aweme.dc.c cVar = new com.ss.android.ugc.aweme.dc.c(new com.ss.android.ugc.aweme.be.d(string, null, avVar, null, false, null, null, false, null, false, null, false, null, 131066));
        this.f121990l = cVar;
        this.t.a(cVar);
        f a5 = com.ss.android.ugc.aweme.setting.b.a.a(getString(R.string.qr), new aw(this));
        this.f121991m = a5;
        this.t.a(a5);
        f a6 = com.ss.android.ugc.aweme.setting.b.a.a(getString(R.string.d_q), new ax(this));
        this.f121985g = a6;
        this.t.a(a6);
        this.t.a(new com.ss.android.ugc.aweme.dc.d(new com.ss.android.ugc.aweme.be.e(getString(R.string.d1y), true, true)));
        f a7 = com.ss.android.ugc.aweme.setting.b.a.a(getString(R.string.fdv), new ay(this));
        this.f121986h = a7;
        this.t.a(a7);
        f a8 = com.ss.android.ugc.aweme.setting.b.a.a(getString(R.string.gij), new az(this));
        this.f121988j = a8;
        this.t.a(a8);
        f a9 = com.ss.android.ugc.aweme.setting.b.a.a(getString(R.string.gb_), new ba(this));
        this.f121989k = a9;
        this.t.a(a9);
        f a10 = com.ss.android.ugc.aweme.setting.b.a.a(getString(R.string.b5k), new bb(this));
        this.f121987i = a10;
        this.t.a(a10);
        n();
        a(this.f121979a);
        b(false);
        f fVar = this.f121986h;
        if (c.a.a()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        fVar.a(i2);
        this.q = new com.ss.android.ugc.aweme.setting.verification.c();
        if (this.f121982d.getType().intValue() == 0) {
            this.f121991m.a(8);
        } else {
            this.f121991m.a(0);
            f fVar2 = this.f121991m;
            if (this.f121982d.getType().intValue() == 1) {
                a2 = getString(R.string.ov);
            } else {
                a2 = a(this.f121982d.getDefaultDoB());
            }
            fVar2.a(a2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onCreate", false);
    }

    public final String a(boolean z, int i2) {
        if (i2 != 2031) {
            if (i2 != 2050) {
                return getString(R.string.c4f);
            }
            if (z) {
                return getString(R.string.h5a);
            }
            return getString(R.string.h4n);
        } else if (z) {
            return getString(R.string.h5_);
        } else {
            return getString(R.string.h4l);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        a.C0731a aVar = new a.C0731a(this);
        aVar.E = true;
        aVar.a(R.string.gl4).b(i2).a(getResources().getString(i3), (DialogInterface.OnClickListener) new ag(this), false).c(getResources().getString(R.string.a9e), null, false).a().c();
    }

    public static void a(String str, boolean z, boolean z2, int i2) {
        String str2;
        int i3;
        d a2 = new d().a("enter_from", "manage_my_account").a("exit_method", str);
        if (z) {
            str2 = "phone";
        } else {
            str2 = "email";
        }
        d a3 = a2.a("unlink_type", str2);
        if (!z) {
            a3.a("is_email_verified", z2 ? 1 : 0);
        }
        if (TextUtils.equals("unlink", str)) {
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 == 2031) {
                i3 = 2;
            } else if (i2 != 2050) {
                i3 = 100;
            } else {
                i3 = 3;
            }
            a3.a("unlink_eligible_status", i3);
        }
        r.a("exit_unlink_phone_email_popup", a3.f66730a);
    }
}
