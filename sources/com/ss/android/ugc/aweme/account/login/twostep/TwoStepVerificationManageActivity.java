package com.ss.android.ugc.aweme.account.login.twostep;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.twostep.a;
import com.ss.android.ugc.aweme.br;
import com.ss.android.ugc.aweme.cb;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.cv;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseBindService;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class TwoStepVerificationManageActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public a f63769a;

    /* renamed from: b  reason: collision with root package name */
    public u f63770b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f63771c = h.i.a((h.f.a.a) new h(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f63772d = h.i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f63773e = h.i.a((h.f.a.a) new f(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f63774f = h.i.a((h.f.a.a) new g(this));

    /* renamed from: g  reason: collision with root package name */
    private final TwoStepVerificationService f63775g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f63776h;

    static {
        Covode.recordClassIndex(39311);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f63776h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f63776h == null) {
            this.f63776h = new HashMap();
        }
        View view = (View) this.f63776h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f63776h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.account.login.m a() {
        return (com.ss.android.ugc.aweme.account.login.m) this.f63771c.getValue();
    }

    public final String b() {
        return (String) this.f63772d.getValue();
    }

    public final boolean c() {
        return ((Boolean) this.f63774f.getValue()).booleanValue();
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void a(boolean z2, List<String> list, int i2) {
        bt.a(a());
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = "/passport/shark/safe_verify/verification_manage/";
        new com.bytedance.sdk.a.g.i(this, aVar.a("scene", "two_step_manage").b(), new e(this, i2, list, z2)).d();
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.account.login.m> {
        final /* synthetic */ TwoStepVerificationManageActivity this$0;

        static {
            Covode.recordClassIndex(39321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            super(0);
            this.this$0 = twoStepVerificationManageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.login.m invoke() {
            return new com.ss.android.ugc.aweme.account.login.m(this.this$0);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ TwoStepVerificationManageActivity this$0;

        static {
            Covode.recordClassIndex(39315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            super(0);
            this.this$0 = twoStepVerificationManageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "enter_from");
            if (a2 == null) {
                return "";
            }
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ TwoStepVerificationManageActivity this$0;

        static {
            Covode.recordClassIndex(39319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            super(0);
            this.this$0 = twoStepVerificationManageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "interstitial_token");
            if (a2 == null) {
                return "";
            }
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ TwoStepVerificationManageActivity this$0;

        static {
            Covode.recordClassIndex(39320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            super(0);
            this.this$0 = twoStepVerificationManageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!TextUtils.isEmpty(a(this.this$0.getIntent(), "interstitial_token")));
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public TwoStepVerificationManageActivity() {
        cb m2 = cj.f71084b.m();
        Objects.requireNonNull(m2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.TwoStepVerificationService");
        this.f63775g = (TwoStepVerificationService) m2;
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

    public static final class k implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63796a;

        static {
            Covode.recordClassIndex(39326);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            this.f63796a = twoStepVerificationManageActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f63796a.finish();
        }
    }

    public static final class q implements cv {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63818b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63819c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63820d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f63821e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63822f;

        static {
            Covode.recordClassIndex(39334);
        }

        @Override // com.ss.android.ugc.aweme.cv
        public final void onUpdateFailed(String str) {
            this.f63817a.a((Integer) null, str);
        }

        @Override // com.ss.android.ugc.aweme.cv
        public final void onUpdateSuccess(boolean z) {
            if (z) {
                ab.f63895a = true;
                this.f63817a.a(this.f63818b, this.f63819c, this.f63820d, this.f63821e, this.f63822f);
                return;
            }
            br i2 = cj.f71084b.i();
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f63817a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_skip", false);
            i2.setPassword(twoStepVerificationManageActivity, bundle, new a(this));
        }

        static final class a implements IAccountService.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f63823a;

            static {
                Covode.recordClassIndex(39335);
            }

            a(q qVar) {
                this.f63823a = qVar;
            }

            @Override // com.ss.android.ugc.aweme.IAccountService.g
            public final void onResult(int i2, int i3, Object obj) {
                if (i3 == 1) {
                    ab.f63895a = true;
                    this.f63823a.f63817a.a(this.f63823a.f63818b, this.f63823a.f63819c, this.f63823a.f63820d, this.f63823a.f63821e, this.f63823a.f63822f);
                }
                bt.b(this.f63823a.f63817a.a());
            }
        }

        q(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i2) {
            this.f63817a = twoStepVerificationManageActivity;
            this.f63818b = z;
            this.f63819c = str;
            this.f63820d = str2;
            this.f63821e = list;
            this.f63822f = i2;
        }
    }

    public static final class x implements cv {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f63861b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63862c;

        static {
            Covode.recordClassIndex(39342);
        }

        @Override // com.ss.android.ugc.aweme.cv
        public final void onUpdateFailed(String str) {
            this.f63860a.a((Integer) null, str);
        }

        @Override // com.ss.android.ugc.aweme.cv
        public final void onUpdateSuccess(boolean z) {
            User f2 = cj.f();
            if (z) {
                cj.f71084b.i().verifyPassword(this.f63860a, "settings_security", new Bundle(), new a(this));
                return;
            }
            h.f.b.l.b(f2, "");
            if (f2.isPhoneBinded()) {
                cj.h().verifyMobileForTicket(this.f63860a, "two_step_verification", "verify_for_ticket", null, new b(this));
            } else if (f2.isEmailVerified() || f2.isHasEmail()) {
                cj.h().verifyEmailForTicket(this.f63860a, "two_step_verification", "verify_for_ticket", null, new c(this));
            } else {
                this.f63861b.invoke(new a(this.f63862c, "oauth_verify"));
            }
        }

        x(TwoStepVerificationManageActivity twoStepVerificationManageActivity, h.f.a.b bVar, String str) {
            this.f63860a = twoStepVerificationManageActivity;
            this.f63861b = bVar;
            this.f63862c = str;
        }

        static final class a implements IAccountService.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f63863a;

            static {
                Covode.recordClassIndex(39343);
            }

            a(x xVar) {
                this.f63863a = xVar;
            }

            @Override // com.ss.android.ugc.aweme.IAccountService.g
            public final void onResult(int i2, int i3, Object obj) {
                String str;
                if (i3 == 1) {
                    q.a("password", "pass", "settings_security");
                    h.f.a.b bVar = this.f63863a.f63861b;
                    if (!(obj instanceof Bundle)) {
                        obj = null;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (bundle == null || (str = bundle.getString("ticket")) == null) {
                        str = "";
                    }
                    h.f.b.l.b(str, "");
                    bVar.invoke(new a(str, "pwd_verify"));
                    return;
                }
                q.a("password", "fail", "settings_security");
                bt.b(this.f63863a.f63860a.a());
            }
        }

        static final class b implements IAccountService.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f63864a;

            static {
                Covode.recordClassIndex(39344);
            }

            b(x xVar) {
                this.f63864a = xVar;
            }

            @Override // com.ss.android.ugc.aweme.IAccountService.g
            public final void onResult(int i2, int i3, Object obj) {
                String str;
                if (i3 == 1) {
                    q.a("sms", "pass", "settings_security");
                    h.f.a.b bVar = this.f63864a.f63861b;
                    if (!(obj instanceof Bundle)) {
                        obj = null;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (bundle == null || (str = bundle.getString("ticket")) == null) {
                        str = "";
                    }
                    h.f.b.l.b(str, "");
                    bVar.invoke(new a(str, "mobile_sms_verify"));
                    return;
                }
                q.a("sms", "fail", "settings_security");
                bt.b(this.f63864a.f63860a.a());
            }
        }

        static final class c implements IAccountService.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f63865a;

            static {
                Covode.recordClassIndex(39345);
            }

            c(x xVar) {
                this.f63865a = xVar;
            }

            @Override // com.ss.android.ugc.aweme.IAccountService.g
            public final void onResult(int i2, int i3, Object obj) {
                String str;
                if (i3 == 1) {
                    q.a("email", "pass", "settings_security");
                    h.f.a.b bVar = this.f63865a.f63861b;
                    if (!(obj instanceof Bundle)) {
                        obj = null;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (bundle == null || (str = bundle.getString("ticket")) == null) {
                        str = "";
                    }
                    h.f.b.l.b(str, "");
                    bVar.invoke(new a(str, "email_verify"));
                    return;
                }
                q.a("email", "fail", "settings_security");
                bt.b(this.f63865a.f63860a.a());
            }
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63795a;

        static {
            Covode.recordClassIndex(39325);
        }

        j(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            this.f63795a = twoStepVerificationManageActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63795a.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63799a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63800b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63801c;

        static {
            Covode.recordClassIndex(39328);
        }

        m(TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2) {
            this.f63799a = twoStepVerificationManageActivity;
            this.f63800b = str;
            this.f63801c = str2;
        }

        static final class a extends h.f.b.m implements h.f.a.b<a, h.z> {
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(39329);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(a aVar) {
                a aVar2 = aVar;
                h.f.b.l.d(aVar2, "");
                this.this$0.f63799a.a(this.this$0.f63800b, aVar2.f63777a, q.a(aVar2.f63778b));
                return h.z.f158842a;
            }
        }

        @Override // b.g
        public final Object then(b.i<a> iVar) {
            Integer num;
            String str;
            if (!ai.a(iVar)) {
                this.f63799a.a((Integer) null, "");
                return null;
            }
            h.f.b.l.b(iVar, "");
            a d2 = iVar.d();
            if (!h.m.p.a("success", d2.getMessage(), true) || d2.getData() == null) {
                a.C1430a data = d2.getData();
                if (data != null) {
                    num = data.getErrorCode();
                } else {
                    num = null;
                }
                a.C1430a data2 = d2.getData();
                if (data2 != null) {
                    str = data2.getErrorDescription();
                } else {
                    str = null;
                }
                if (num != null && num.intValue() == 1356) {
                    this.f63799a.a(new a(this), "");
                } else {
                    this.f63799a.a(num, str);
                }
                return null;
            }
            boolean a2 = h.f.b.l.a((Object) this.f63800b, (Object) "mobile_sms_verify");
            boolean a3 = h.f.b.l.a((Object) this.f63800b, (Object) "email_verify");
            boolean a4 = h.f.b.l.a((Object) this.f63800b, (Object) "pwd_verify");
            String b2 = this.f63799a.b();
            h.f.b.l.b(b2, "");
            q.a("remove", a2 ? 1 : 0, a3 ? 1 : 0, a4 ? 1 : 0, b2, this.f63801c);
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f63799a;
            h.f.b.l.b(d2, "");
            twoStepVerificationManageActivity.a(d2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63816c;

        static {
            Covode.recordClassIndex(39332);
        }

        p(TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2) {
            this.f63814a = twoStepVerificationManageActivity;
            this.f63815b = str;
            this.f63816c = str2;
        }

        static final class a extends h.f.b.m implements h.f.a.b<a, h.z> {
            final /* synthetic */ p this$0;

            static {
                Covode.recordClassIndex(39333);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(p pVar) {
                super(1);
                this.this$0 = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(a aVar) {
                a aVar2 = aVar;
                h.f.b.l.d(aVar2, "");
                this.this$0.f63814a.b(this.this$0.f63815b, aVar2.f63777a, q.a(aVar2.f63778b));
                return h.z.f158842a;
            }
        }

        @Override // b.g
        public final Object then(b.i<a> iVar) {
            Integer num;
            String str;
            if (!ai.a(iVar)) {
                this.f63814a.a((Integer) null, "");
                return null;
            }
            h.f.b.l.b(iVar, "");
            a d2 = iVar.d();
            if (!h.m.p.a("success", d2.getMessage(), true) || d2.getData() == null) {
                a.C1430a data = d2.getData();
                if (data != null) {
                    num = data.getErrorCode();
                } else {
                    num = null;
                }
                a.C1430a data2 = d2.getData();
                if (data2 != null) {
                    str = data2.getErrorDescription();
                } else {
                    str = null;
                }
                if (num != null && num.intValue() == 1356) {
                    this.f63814a.a(new a(this), "");
                } else {
                    this.f63814a.a(num, str);
                }
                return null;
            }
            String b2 = this.f63814a.b();
            h.f.b.l.b(b2, "");
            q.a("turn_off", 1, 1, 1, b2, this.f63816c);
            ab.f63895a = false;
            ab.f63896b = false;
            ab.f63897c = false;
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f63814a;
            h.f.b.l.b(d2, "");
            twoStepVerificationManageActivity.a(d2);
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f63792a = new i();

        static {
            Covode.recordClassIndex(39322);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f63793a);
            baseActivityViewModel2.config(AnonymousClass2.f63794a);
            return h.z.f158842a;
        }
    }

    public static final class e extends com.bytedance.sdk.a.a.b.f {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63788c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f63789d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f63790e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f63791f;

        static {
            Covode.recordClassIndex(39317);
        }

        static final class a extends h.f.b.m implements h.f.a.b<a, h.z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(39318);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(a aVar) {
                a aVar2 = aVar;
                h.f.b.l.d(aVar2, "");
                this.this$0.f63788c.a(this.this$0.f63791f, q.a(aVar2.f63778b), aVar2.f63777a, this.this$0.f63790e, this.this$0.f63789d);
                return h.z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.j jVar) {
            String str;
            Boolean bool;
            Boolean bool2;
            String email;
            String mobile;
            com.bytedance.sdk.a.a.d.j jVar2 = jVar;
            String str2 = "";
            h.f.b.l.d(jVar2, str2);
            int i2 = this.f63789d;
            List list = this.f63790e;
            boolean z = jVar2.f43102k;
            h.f.b.l.d(list, str2);
            h.f.b.l.d("settings_security", str2);
            boolean contains = list.contains("mobile_sms_verify");
            boolean contains2 = list.contains("pwd_verify");
            boolean contains3 = list.contains("email_verify");
            com.ss.android.ugc.aweme.app.f.d a2 = q.a();
            if (i2 == 1) {
                str = "new";
            } else {
                str = "backup";
            }
            com.ss.android.ugc.aweme.common.r.a("twosv_setup_method_add_submit", a2.a(StringSet.type, str).a("is_sms_selected", Boolean.valueOf(contains)).a("is_email_selected", Boolean.valueOf(contains3)).a("is_pw_selected", Boolean.valueOf(contains2)).a("is_trusted", Boolean.valueOf(z)).a("enter_from", "settings_security").f66730a);
            if (jVar2.f43102k) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f63788c;
                boolean z2 = this.f63791f;
                String str3 = jVar2.f43101j;
                h.f.b.l.b(str3, str2);
                twoStepVerificationManageActivity.a(z2, "trust_environment", str3, this.f63790e, this.f63789d);
                return;
            }
            a aVar = new a(this);
            if (this.f63788c.c()) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.f63788c;
                String str4 = jVar2.f43101j;
                h.f.b.l.b(str4, str2);
                u uVar = twoStepVerificationManageActivity2.f63770b;
                Boolean bool3 = null;
                if (uVar != null) {
                    bool = uVar.getHas_pwd();
                } else {
                    bool = null;
                }
                if (h.f.b.l.a((Object) bool, (Object) true)) {
                    cj.f71084b.i().verifyPassword(twoStepVerificationManageActivity2, "settings_security", new Bundle(), new y(twoStepVerificationManageActivity2, aVar));
                    return;
                }
                u uVar2 = twoStepVerificationManageActivity2.f63770b;
                if (uVar2 != null) {
                    bool2 = uVar2.getHas_mobile();
                } else {
                    bool2 = null;
                }
                if (h.f.b.l.a((Object) bool2, (Object) true)) {
                    BaseBindService h2 = cj.h();
                    u uVar3 = twoStepVerificationManageActivity2.f63770b;
                    if (!(uVar3 == null || (mobile = uVar3.getMobile()) == null)) {
                        str2 = mobile;
                    }
                    h2.verifyMobileWithWorkflowTokenForTicket(twoStepVerificationManageActivity2, "two_step_verification", "verify_for_ticket", str2, null, new z(twoStepVerificationManageActivity2, aVar));
                    return;
                }
                u uVar4 = twoStepVerificationManageActivity2.f63770b;
                if (uVar4 != null) {
                    bool3 = uVar4.getHas_email();
                }
                if (h.f.b.l.a((Object) bool3, (Object) true)) {
                    BaseBindService h3 = cj.h();
                    u uVar5 = twoStepVerificationManageActivity2.f63770b;
                    if (!(uVar5 == null || (email = uVar5.getEmail()) == null)) {
                        str2 = email;
                    }
                    h3.verifyEmailWithWorkflowTokenForTicket(twoStepVerificationManageActivity2, "two_step_verification", "verify_for_ticket", str2, null, new aa(twoStepVerificationManageActivity2, aVar));
                    return;
                }
                aVar.invoke(new a(str4, "oauth_verify"));
                return;
            }
            TwoStepVerificationManageActivity twoStepVerificationManageActivity3 = this.f63788c;
            String str5 = jVar2.f43101j;
            h.f.b.l.b(str5, str2);
            twoStepVerificationManageActivity3.a(aVar, str5);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.j jVar, int i2) {
            String str;
            com.bytedance.sdk.a.a.d.j jVar2 = jVar;
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f63788c;
            Integer valueOf = Integer.valueOf(i2);
            if (jVar2 == null || (str = jVar2.f43075f) == null) {
                str = "";
            }
            twoStepVerificationManageActivity.a(valueOf, str);
        }

        e(TwoStepVerificationManageActivity twoStepVerificationManageActivity, int i2, List list, boolean z) {
            this.f63788c = twoStepVerificationManageActivity;
            this.f63789d = i2;
            this.f63790e = list;
            this.f63791f = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63798b;

        static {
            Covode.recordClassIndex(39327);
        }

        l(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z) {
            this.f63797a = twoStepVerificationManageActivity;
            this.f63798b = z;
        }

        @Override // b.g
        public final Object then(b.i<a> iVar) {
            if (!ai.a(iVar)) {
                ((DmtStatusView) this.f63797a._$_findCachedViewById(R.id.e_c)).h();
                return null;
            }
            if (this.f63798b) {
                h.f.b.l.b(iVar, "");
                a d2 = iVar.d();
                h.f.b.l.b(d2, "");
                q.a(d2);
            }
            h.f.b.l.b(iVar, "");
            a d3 = iVar.d();
            if (!h.m.p.a("success", d3.getMessage(), true) || d3.getData() == null) {
                ((DmtStatusView) this.f63797a._$_findCachedViewById(R.id.e_c)).h();
                return null;
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f63797a._$_findCachedViewById(R.id.e_c);
            h.f.b.l.b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) this.f63797a._$_findCachedViewById(R.id.b94);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(0);
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f63797a;
            h.f.b.l.b(d3, "");
            twoStepVerificationManageActivity.a(d3);
            return h.z.f158842a;
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63787a;

        static {
            Covode.recordClassIndex(39316);
        }

        d(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            this.f63787a = twoStepVerificationManageActivity;
        }

        @Override // b.g
        public final Object then(b.i<c> iVar) {
            if (!ai.a(iVar)) {
                ((DmtStatusView) this.f63787a._$_findCachedViewById(R.id.e_c)).h();
                return null;
            }
            h.f.b.l.b(iVar, "");
            c d2 = iVar.d();
            if (!h.m.p.a("success", d2.getMessage(), true) || d2.getData() == null) {
                ((DmtStatusView) this.f63787a._$_findCachedViewById(R.id.e_c)).h();
                return null;
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f63787a._$_findCachedViewById(R.id.e_c);
            h.f.b.l.b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) this.f63787a._$_findCachedViewById(R.id.b94);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(0);
            this.f63787a.f63770b = d2.getData();
            u uVar = this.f63787a.f63770b;
            if (uVar == null) {
                h.f.b.l.b();
            }
            ab.f63896b = h.f.b.l.a((Object) uVar.getHas_mobile(), (Object) true);
            u uVar2 = this.f63787a.f63770b;
            if (uVar2 == null) {
                h.f.b.l.b();
            }
            ab.f63897c = h.f.b.l.a((Object) uVar2.getHas_email(), (Object) true);
            u uVar3 = this.f63787a.f63770b;
            if (uVar3 == null) {
                h.f.b.l.b();
            }
            ab.f63895a = h.f.b.l.a((Object) uVar3.getHas_pwd(), (Object) true);
            a aVar = this.f63787a.f63769a;
            if (aVar == null) {
                return null;
            }
            this.f63787a.a(aVar);
            return h.z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        int i2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onCreate", true);
        activityConfiguration(i.f63792a);
        super.onCreate(bundle);
        setContentView(R.layout.hc);
        TuxTextView tuxTextView = new TuxTextView(this, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        Integer a2 = com.bytedance.tux.h.d.a(this, R.attr.bj);
        if (a2 != null) {
            i2 = a2.intValue();
        } else {
            i2 = -16777216;
        }
        tuxTextView.setTextColor(i2);
        tuxTextView.setText(getString(R.string.cyt));
        tuxTextView.setOnClickListener(new j(this));
        DmtStatusView.a c2 = DmtStatusView.a.a(this).c(tuxTextView);
        c2.f33605g = 0;
        ((DmtStatusView) _$_findCachedViewById(R.id.e_c)).setBuilder(c2);
        ((ButtonTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new k(this));
        if (c()) {
            if (!TextUtils.isEmpty((String) this.f63773e.getValue())) {
                this.f63775g.getAvailableWays().a(new d(this), b.i.f4826c, null);
            }
            a(false);
        } else {
            a twoStepVerificationResponseFromCache = this.f63775g.getTwoStepVerificationResponseFromCache();
            if (twoStepVerificationResponseFromCache != null) {
                DmtStatusView dmtStatusView = (DmtStatusView) _$_findCachedViewById(R.id.e_c);
                h.f.b.l.b(dmtStatusView, "");
                dmtStatusView.setVisibility(8);
                FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.b94);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setVisibility(0);
                a(twoStepVerificationResponseFromCache);
                q.a(twoStepVerificationResponseFromCache);
            } else {
                a(true);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63781a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63782b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f63783c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f63784d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f63785e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f63786f;

        static {
            Covode.recordClassIndex(39314);
        }

        b(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, List list, int i2, String str, String str2) {
            this.f63781a = twoStepVerificationManageActivity;
            this.f63782b = z;
            this.f63783c = list;
            this.f63784d = i2;
            this.f63785e = str;
            this.f63786f = str2;
        }

        @Override // b.g
        public final Object then(b.i<a> iVar) {
            Integer num;
            String str;
            String str2;
            String str3;
            if (!ai.a(iVar)) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f63781a;
                h.f.b.l.b(iVar, "");
                Exception e2 = iVar.e();
                if (e2 != null) {
                    str3 = e2.toString();
                } else {
                    str3 = null;
                }
                twoStepVerificationManageActivity.a((Integer) null, str3);
                return null;
            }
            h.f.b.l.b(iVar, "");
            a d2 = iVar.d();
            if (!h.m.p.a("success", d2.getMessage(), true) || d2.getData() == null) {
                a.C1430a data = d2.getData();
                if (data != null) {
                    num = data.getErrorCode();
                } else {
                    num = null;
                }
                a.C1430a data2 = d2.getData();
                if (data2 != null) {
                    str = data2.getErrorDescription();
                } else {
                    str = null;
                }
                if (num != null && 1015 == num.intValue()) {
                    this.f63781a.a(this.f63782b, this.f63783c, this.f63784d);
                } else {
                    this.f63781a.a(num, str);
                }
                return null;
            }
            String str4 = this.f63785e;
            int i2 = this.f63784d;
            String b2 = this.f63781a.b();
            h.f.b.l.b(b2, "");
            String str5 = this.f63786f;
            boolean z = ab.f63896b;
            boolean z2 = ab.f63897c;
            boolean z3 = ab.f63895a;
            h.f.b.l.d(str4, "");
            h.f.b.l.d(b2, "");
            h.f.b.l.d(str5, "");
            boolean a2 = h.m.p.a((CharSequence) str4, (CharSequence) "mobile_sms_verify", false);
            boolean a3 = h.m.p.a((CharSequence) str4, (CharSequence) "pwd_verify", false);
            boolean a4 = h.m.p.a((CharSequence) str4, (CharSequence) "email_verify", false);
            com.ss.android.ugc.aweme.app.f.d a5 = q.a();
            a5.a("is_mobile_linked", Boolean.valueOf(z));
            a5.a("is_email_linked", Boolean.valueOf(z2));
            a5.a("is_password_set", Boolean.valueOf(z3));
            a5.a("is_sms_selected", Boolean.valueOf(a2));
            a5.a("is_email_selected", Boolean.valueOf(a4));
            a5.a("is_pw_selected", Boolean.valueOf(a3));
            a5.a("verify_method", str5);
            a5.a("enter_from", b2);
            if (i2 == 1) {
                str2 = "new";
            } else {
                str2 = "backup";
            }
            a5.a(StringSet.type, str2);
            com.ss.android.ugc.aweme.common.r.a("twosv_setup_method_add_success", a5.f66730a);
            if (this.f63781a.c()) {
                this.f63781a.finish();
                return h.z.f158842a;
            }
            TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.f63781a;
            h.f.b.l.b(d2, "");
            twoStepVerificationManageActivity2.a(d2);
            return h.z.f158842a;
        }
    }

    public final void a(a aVar) {
        String str;
        h.f.b.l.d(aVar, "");
        String str2 = null;
        if (c()) {
            this.f63769a = aVar;
            if (this.f63770b != null) {
                a.C1430a data = aVar.getData();
                if (data != null) {
                    str = data.getDefault_verify_way();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    finish();
                }
            } else {
                return;
            }
        }
        this.f63775g.setTwoStepVerificationResponseToCache(aVar);
        bt.b(a());
        Fragment a2 = getSupportFragmentManager().a(R.id.b94);
        a.C1430a data2 = aVar.getData();
        if (data2 != null) {
            str2 = data2.getDefault_verify_way();
        }
        if (TextUtils.isEmpty(str2)) {
            String b2 = b();
            h.f.b.l.b(b2, "");
            if (a2 instanceof o) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this).a(getString(R.string.g6u)).a();
                b2 = "turn_off_refresh";
            }
            if (!(a2 instanceof l)) {
                q.b(b2);
                Fragment a3 = getSupportFragmentManager().a("TurnOnTwoStepVerificationFragment");
                if (a3 == null) {
                    a3 = new l();
                }
                h.f.b.l.b(a3, "");
                a3.setArguments(new Bundle());
                Bundle arguments = a3.getArguments();
                if (arguments == null) {
                    h.f.b.l.b();
                }
                arguments.putString("enter_from", b());
                androidx.fragment.app.n a4 = getSupportFragmentManager().a();
                h.f.b.l.b(a4, "");
                a4.b(R.id.b94, a3, "TurnOnTwoStepVerificationFragment");
                a4.c();
                return;
            }
            return;
        }
        String b3 = b();
        h.f.b.l.b(b3, "");
        String str3 = "refresh";
        if (a2 instanceof o) {
            ((o) a2).a(aVar);
        } else {
            if (a2 instanceof l) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this).a(getString(R.string.g6v)).a();
                b3 = str3;
            }
            Fragment a5 = getSupportFragmentManager().a("TwoStepVerificationDetailFragment");
            if (a5 == null) {
                a5 = new o();
            }
            h.f.b.l.b(a5, "");
            androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager == null) {
                h.f.b.l.b();
            }
            androidx.fragment.app.n a6 = supportFragmentManager.a();
            h.f.b.l.b(a6, "");
            Bundle bundle = new Bundle();
            bundle.putSerializable("response", aVar);
            a5.setArguments(bundle);
            Bundle arguments2 = a5.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            arguments2.putString("enter_from", b3);
            a6.b(R.id.b94, a5, "TwoStepVerificationDetailFragment");
            a6.c();
            str3 = b3;
        }
        q.c(str3);
    }

    public final void a(boolean z2) {
        ((DmtStatusView) _$_findCachedViewById(R.id.e_c)).f();
        this.f63775g.getTwoStepStatus(z2).a(new l(this, z2), b.i.f4826c, null);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f63777a;

        /* renamed from: b  reason: collision with root package name */
        public final String f63778b;

        static {
            Covode.recordClassIndex(39312);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.f.b.l.a(this.f63777a, aVar.f63777a) && h.f.b.l.a(this.f63778b, aVar.f63778b);
        }

        public final int hashCode() {
            String str = this.f63777a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f63778b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "VerifiedWay(ticket=" + this.f63777a + ", way=" + this.f63778b + ")";
        }

        public a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            this.f63777a = str;
            this.f63778b = str2;
        }
    }

    public final void a(h.f.a.b<? super a, h.z> bVar, String str) {
        cj.f71084b.e().getSetPasswordStatus(new x(this, bVar, str));
    }

    public final void a(Integer num, String str) {
        com.ss.android.ugc.aweme.tux.a.i.a aVar;
        ab.f63895a = false;
        ab.f63896b = false;
        ab.f63897c = false;
        bt.b(a());
        if (num == null) {
            aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this);
            str = getString(R.string.bpf);
        } else if (num.intValue() < 0 || TextUtils.isEmpty(str)) {
            aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this);
            str = getString(R.string.de8);
        } else {
            aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this);
            if (str == null) {
                h.f.b.l.b();
            }
        }
        aVar.a(str).a();
    }

    public final void a(List<String> list, int i2) {
        h.f.b.l.d(list, "");
        a(false, list, i2);
    }

    /* access modifiers changed from: package-private */
    public static final class r implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63824a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63825b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63826c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63827d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f63828e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63829f;

        static {
            Covode.recordClassIndex(39336);
        }

        r(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i2) {
            this.f63824a = twoStepVerificationManageActivity;
            this.f63825b = z;
            this.f63826c = str;
            this.f63827d = str2;
            this.f63828e = list;
            this.f63829f = i2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                ab.f63896b = true;
                this.f63824a.a(this.f63825b, this.f63826c, this.f63827d, this.f63828e, this.f63829f);
            }
            bt.b(this.f63824a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63830a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63831b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63832c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63833d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f63834e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63835f;

        static {
            Covode.recordClassIndex(39337);
        }

        s(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i2) {
            this.f63830a = twoStepVerificationManageActivity;
            this.f63831b = z;
            this.f63832c = str;
            this.f63833d = str2;
            this.f63834e = list;
            this.f63835f = i2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                ab.f63897c = true;
                this.f63830a.a(this.f63831b, this.f63832c, this.f63833d, this.f63834e, this.f63835f);
            }
            bt.b(this.f63830a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63838c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63839d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f63840e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63841f;

        static {
            Covode.recordClassIndex(39338);
        }

        t(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i2) {
            this.f63836a = twoStepVerificationManageActivity;
            this.f63837b = z;
            this.f63838c = str;
            this.f63839d = str2;
            this.f63840e = list;
            this.f63841f = i2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                ab.f63897c = true;
                this.f63836a.a(this.f63837b, this.f63838c, this.f63839d, this.f63840e, this.f63841f);
            }
            bt.b(this.f63836a.a());
        }
    }

    static final class aa implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f63780b;

        static {
            Covode.recordClassIndex(39313);
        }

        aa(TwoStepVerificationManageActivity twoStepVerificationManageActivity, h.f.a.b bVar) {
            this.f63779a = twoStepVerificationManageActivity;
            this.f63780b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            String str;
            if (i3 == 1) {
                q.a("email", "pass", "settings_security");
                h.f.a.b bVar = this.f63780b;
                if (!(obj instanceof Bundle)) {
                    obj = null;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null || (str = bundle.getString("ticket")) == null) {
                    str = "";
                }
                h.f.b.l.b(str, "");
                bVar.invoke(new a(str, "email_verify"));
                return;
            }
            q.a("email", "fail", "settings_security");
            bt.b(this.f63779a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f63803b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f63804c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63805d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f63806e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63807f;

        static {
            Covode.recordClassIndex(39330);
        }

        n(TwoStepVerificationManageActivity twoStepVerificationManageActivity, List list, boolean z, String str, String str2, int i2) {
            this.f63802a = twoStepVerificationManageActivity;
            this.f63803b = list;
            this.f63804c = z;
            this.f63805d = str;
            this.f63806e = str2;
            this.f63807f = i2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                ab.f63897c = true;
                this.f63803b.add("email_verify");
            }
            this.f63802a.b(this.f63804c, this.f63805d, this.f63806e, this.f63803b, this.f63807f);
            bt.b(this.f63802a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f63809b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f63810c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63811d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f63812e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63813f;

        static {
            Covode.recordClassIndex(39331);
        }

        o(TwoStepVerificationManageActivity twoStepVerificationManageActivity, List list, boolean z, String str, String str2, int i2) {
            this.f63808a = twoStepVerificationManageActivity;
            this.f63809b = list;
            this.f63810c = z;
            this.f63811d = str;
            this.f63812e = str2;
            this.f63813f = i2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                ab.f63896b = true;
                this.f63809b.add("email_verify");
            }
            this.f63808a.b(this.f63810c, this.f63811d, this.f63812e, this.f63809b, this.f63813f);
            bt.b(this.f63808a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63843b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63844c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63845d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f63846e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63847f;

        static {
            Covode.recordClassIndex(39339);
        }

        u(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i2) {
            this.f63842a = twoStepVerificationManageActivity;
            this.f63843b = z;
            this.f63844c = str;
            this.f63845d = str2;
            this.f63846e = list;
            this.f63847f = i2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                ab.f63895a = true;
                u uVar = this.f63842a.f63770b;
                if (uVar == null) {
                    h.f.b.l.b();
                }
                uVar.setHas_pwd(true);
                this.f63842a.a(this.f63843b, this.f63844c, this.f63845d, this.f63846e, this.f63847f);
            }
            bt.b(this.f63842a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63850c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63851d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f63852e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63853f;

        static {
            Covode.recordClassIndex(39340);
        }

        v(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i2) {
            this.f63848a = twoStepVerificationManageActivity;
            this.f63849b = z;
            this.f63850c = str;
            this.f63851d = str2;
            this.f63852e = list;
            this.f63853f = i2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                ab.f63896b = true;
                u uVar = this.f63848a.f63770b;
                if (uVar != null) {
                    uVar.setHas_mobile(true);
                }
                this.f63848a.a(this.f63849b, this.f63850c, this.f63851d, this.f63852e, this.f63853f);
            }
            bt.b(this.f63848a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f63858e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f63859f;

        static {
            Covode.recordClassIndex(39341);
        }

        w(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i2) {
            this.f63854a = twoStepVerificationManageActivity;
            this.f63855b = z;
            this.f63856c = str;
            this.f63857d = str2;
            this.f63858e = list;
            this.f63859f = i2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                ab.f63897c = true;
                u uVar = this.f63854a.f63770b;
                if (uVar == null) {
                    h.f.b.l.b();
                }
                uVar.setHas_email(true);
                this.f63854a.a(this.f63855b, this.f63856c, this.f63857d, this.f63858e, this.f63859f);
            }
            bt.b(this.f63854a.a());
        }
    }

    static final class y implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63866a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f63867b;

        static {
            Covode.recordClassIndex(39346);
        }

        y(TwoStepVerificationManageActivity twoStepVerificationManageActivity, h.f.a.b bVar) {
            this.f63866a = twoStepVerificationManageActivity;
            this.f63867b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            String str;
            if (i3 == 1) {
                q.a("password", "pass", "settings_security");
                h.f.a.b bVar = this.f63867b;
                if (!(obj instanceof Bundle)) {
                    obj = null;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null || (str = bundle.getString("ticket")) == null) {
                    str = "";
                }
                h.f.b.l.b(str, "");
                bVar.invoke(new a(str, "pwd_verify"));
                return;
            }
            q.a("password", "fail", "settings_security");
            bt.b(this.f63866a.a());
        }
    }

    static final class z implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerificationManageActivity f63868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f63869b;

        static {
            Covode.recordClassIndex(39347);
        }

        z(TwoStepVerificationManageActivity twoStepVerificationManageActivity, h.f.a.b bVar) {
            this.f63868a = twoStepVerificationManageActivity;
            this.f63869b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            String str;
            if (i3 == 1) {
                q.a("sms", "pass", "settings_security");
                h.f.a.b bVar = this.f63869b;
                if (!(obj instanceof Bundle)) {
                    obj = null;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null || (str = bundle.getString("ticket")) == null) {
                    str = "";
                }
                h.f.b.l.b(str, "");
                bVar.invoke(new a(str, "mobile_sms_verify"));
                return;
            }
            q.a("sms", "fail", "settings_security");
            bt.b(this.f63868a.a());
        }
    }

    public final void a(String str, String str2, String str3) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        bt.a(a());
        TwoStepAuthApi.a(str2, str).a(new m(this, str, str3), b.i.f4826c, null);
    }

    public final void b(String str, String str2, String str3) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        bt.a(a());
        TwoStepAuthApi.a(str2).a(new p(this, str, str3), b.i.f4826c, null);
    }

    public final void b(boolean z2, String str, String str2, List<String> list, int i2) {
        String a2 = q.a(list);
        bt.a(a());
        TwoStepAuthApi.a(str2, a2, i2).a(new b(this, z2, list, i2, a2, str), b.i.f4826c, null);
    }

    private final void c(boolean z2, String str, String str2, List<String> list, int i2) {
        bt.a(a());
        BaseBindService h2 = cj.h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_success_toast", false);
        bundle.putBoolean("show_skip", true);
        h2.bindEmail(this, "two_step_verification", "turnOn", bundle, new n(this, list, z2, str, str2, i2));
    }

    private final void d(boolean z2, String str, String str2, List<String> list, int i2) {
        BaseBindService h2 = cj.h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_success_toast", false);
        bundle.putBoolean("show_skip", true);
        h2.bindMobile(this, "two_step_verification", "turnOn", bundle, new o(this, list, z2, str, str2, i2));
    }

    public final void a(boolean z2, String str, String str2, List<String> list, int i2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(list, "");
        if (!c() || this.f63770b == null) {
            User f2 = cj.f();
            if (list.contains("mobile_sms_verify") && !ab.f63896b) {
                b(z2, "trust_environment", cb.a.SMS, str2, list, i2);
            } else if (list.contains("email_verify") && !ab.f63897c) {
                b(z2, "trust_environment", cb.a.EMAIL, str2, list, i2);
            } else if (!list.contains("pwd_verify") || ab.f63895a) {
                h.f.b.l.b(f2, "");
                if (!f2.isHasEmail()) {
                    c(z2, str, str2, list, i2);
                } else if (!f2.isPhoneBinded()) {
                    d(z2, str, str2, list, i2);
                } else {
                    b(z2, str, str2, list, i2);
                }
            } else {
                b(z2, "trust_environment", cb.a.PASSWORD, str2, list, i2);
            }
        } else if (list.contains("mobile_sms_verify") && !ab.f63896b) {
            a(z2, "trust_environment", cb.a.SMS, str2, list, i2);
        } else if (list.contains("email_verify") && !ab.f63897c) {
            a(z2, "trust_environment", cb.a.EMAIL, str2, list, i2);
        } else if (!list.contains("pwd_verify") || ab.f63895a) {
            u uVar = this.f63770b;
            if (uVar == null) {
                h.f.b.l.b();
            }
            if (!h.f.b.l.a((Object) uVar.getHas_email(), (Object) true)) {
                c(z2, str, str2, list, i2);
                return;
            }
            u uVar2 = this.f63770b;
            if (uVar2 == null) {
                h.f.b.l.b();
            }
            if (!h.f.b.l.a((Object) uVar2.getHas_mobile(), (Object) true)) {
                d(z2, str, str2, list, i2);
            } else {
                b(z2, str, str2, list, i2);
            }
        } else {
            a(z2, "trust_environment", cb.a.PASSWORD, str2, list, i2);
        }
    }

    private final void a(boolean z2, String str, cb.a aVar, String str2, List<String> list, int i2) {
        int i3 = p.f64028a[aVar.ordinal()];
        if (i3 != 1) {
            Boolean bool = null;
            if (i3 == 2) {
                u uVar = this.f63770b;
                if (uVar != null) {
                    bool = uVar.getHas_mobile();
                }
                if (h.f.b.l.a((Object) bool, (Object) true)) {
                    ab.f63896b = true;
                    a(z2, str, str2, list, i2);
                    return;
                }
                BaseBindService h2 = cj.h();
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_success_toast", false);
                h2.bindMobile(this, "two_step_verification", "turnOn", bundle, new v(this, z2, str, str2, list, i2));
            } else if (i3 == 3) {
                u uVar2 = this.f63770b;
                if (uVar2 != null) {
                    bool = uVar2.getHas_email();
                }
                if (h.f.b.l.a((Object) bool, (Object) true)) {
                    ab.f63897c = true;
                    a(z2, str, str2, list, i2);
                    return;
                }
                BaseBindService h3 = cj.h();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("show_success_toast", false);
                h3.bindEmail(this, "two_step_verification", "turnOn", bundle2, new w(this, z2, str, str2, list, i2));
            }
        } else {
            u uVar3 = this.f63770b;
            if (uVar3 == null) {
                h.f.b.l.b();
            }
            if (h.f.b.l.a((Object) uVar3.getHas_pwd(), (Object) true)) {
                ab.f63895a = true;
                a(z2, str, str2, list, i2);
                return;
            }
            br i4 = cj.f71084b.i();
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("show_skip", false);
            i4.setPassword(this, bundle3, new u(this, z2, str, str2, list, i2));
        }
    }

    private final void b(boolean z2, String str, cb.a aVar, String str2, List<String> list, int i2) {
        User f2 = cj.f();
        int i3 = p.f64029b[aVar.ordinal()];
        if (i3 == 1) {
            cj.f71084b.e().getSetPasswordStatus(new q(this, z2, str, str2, list, i2));
        } else if (i3 == 2) {
            h.f.b.l.b(f2, "");
            if (f2.isPhoneBinded()) {
                ab.f63896b = true;
                a(z2, str, str2, list, i2);
                return;
            }
            BaseBindService h2 = cj.h();
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_success_toast", false);
            h2.bindMobile(this, "two_step_verification", "turnOn", bundle, new r(this, z2, str, str2, list, i2));
        } else if (i3 == 3) {
            h.f.b.l.b(f2, "");
            if (f2.isEmailVerified()) {
                ab.f63897c = true;
                a(z2, str, str2, list, i2);
            } else if (f2.isHasEmail()) {
                BaseBindService h3 = cj.h();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("show_success_toast", false);
                h3.verifyEmail(this, "two_step_verification", bundle2, new s(this, z2, str, str2, list, i2));
            } else {
                BaseBindService h4 = cj.h();
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("show_success_toast", false);
                h4.bindEmail(this, "two_step_verification", "turnOn", bundle3, new t(this, z2, str, str2, list, i2));
            }
        }
    }
}
