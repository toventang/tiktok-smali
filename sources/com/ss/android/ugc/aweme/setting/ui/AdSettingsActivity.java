package com.ss.android.ugc.aweme.setting.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdSettingsApi;
import com.ss.android.ugc.aweme.commercialize.adsetting.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.utils.av;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public final class AdSettingsActivity extends com.bytedance.ies.foundation.activity.a implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public static Aweme f122681d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f122682e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    String f122683a;

    /* renamed from: b  reason: collision with root package name */
    public String f122684b;

    /* renamed from: c  reason: collision with root package name */
    public AdSettingsApi f122685c;

    /* renamed from: f  reason: collision with root package name */
    private int f122686f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f122687g;

    /* renamed from: h  reason: collision with root package name */
    private long f122688h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f122689i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f122690j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f122691k;

    public static final class q implements com.bytedance.retrofit2.d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122708a;

        static {
            Covode.recordClassIndex(80546);
        }

        static final class a extends h.f.b.m implements h.f.a.a<h.z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f122709a = new a();

            static {
                Covode.recordClassIndex(80547);
            }

            a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ h.z invoke() {
                return h.z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ q this$0;

            static {
                Covode.recordClassIndex(80548);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(q qVar) {
                super(0);
                this.this$0 = qVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                this.this$0.f122708a.d();
                return h.z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(AdSettingsActivity adSettingsActivity) {
            this.f122708a = adSettingsActivity;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            new com.bytedance.tux.g.b(this.f122708a).a("Request Failed").b();
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, com.bytedance.retrofit2.u<String> uVar) {
            int i2;
            com.google.gson.l c2;
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null) {
                com.google.gson.o a2 = this.f122708a.a(uVar.f42630b);
                if (a2 == null || (c2 = a2.c("status_code")) == null) {
                    i2 = -1;
                } else {
                    i2 = c2.g();
                }
                if (i2 == 4016) {
                    AdSettingsActivity adSettingsActivity = this.f122708a;
                    String string = adSettingsActivity.getResources().getString(R.string.f1a);
                    h.f.b.l.b(string, "");
                    String string2 = this.f122708a.getResources().getString(R.string.b75);
                    h.f.b.l.b(string2, "");
                    adSettingsActivity.a(string, string2, a.f122709a, false, "");
                } else if (i2 == 4017) {
                    AdSettingsActivity adSettingsActivity2 = this.f122708a;
                    String string3 = adSettingsActivity2.getResources().getString(R.string.f1b);
                    h.f.b.l.b(string3, "");
                    String string4 = this.f122708a.getResources().getString(R.string.b5g);
                    h.f.b.l.b(string4, "");
                    b bVar2 = new b(this);
                    String string5 = this.f122708a.getResources().getString(R.string.f1c);
                    h.f.b.l.b(string5, "");
                    adSettingsActivity2.a(string3, string4, bVar2, true, string5);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(80525);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f122691k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f122691k == null) {
            this.f122691k = new SparseArray();
        }
        View view = (View) this.f122691k.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f122691k.put(i2, findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.views.i a() {
        return (com.ss.android.ugc.aweme.views.i) this.f122689i.getValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80526);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.views.i> {
        final /* synthetic */ AdSettingsActivity this$0;

        static {
            Covode.recordClassIndex(80530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AdSettingsActivity adSettingsActivity) {
            super(0);
            this.this$0 = adSettingsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.views.i invoke() {
            return new com.ss.android.ugc.aweme.views.i(this.this$0);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.google.gson.q> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f122701a = new k();

        static {
            Covode.recordClassIndex(80540);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.google.gson.q invoke() {
            return new com.google.gson.q();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ AdSettingsActivity this$0;

        static {
            Covode.recordClassIndex(80541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(AdSettingsActivity adSettingsActivity) {
            super(0);
            this.this$0 = adSettingsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.d();
            return h.z.f158842a;
        }
    }

    public static final class z implements a.AbstractC1650a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122720a;

        static {
            Covode.recordClassIndex(80557);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.adsetting.a.AbstractC1650a
        public final void a() {
            this.f122720a.b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        z(AdSettingsActivity adSettingsActivity) {
            this.f122720a = adSettingsActivity;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.adsetting.a.AbstractC1650a
        public final void a(long j2, long j3) {
            AdSettingsActivity adSettingsActivity = this.f122720a;
            String str = adSettingsActivity.f122683a;
            if (str != null) {
                adSettingsActivity.f122685c.requestCodeExtend(str, j3).enqueue(new o(adSettingsActivity));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        super.overridePendingTransition(0, R.anim.dx);
    }

    public final void c() {
        String str = this.f122683a;
        if (str != null) {
            this.f122685c.requestAdSettings(str).enqueue(new m(this));
        }
    }

    public final void d() {
        String str = this.f122683a;
        if (str != null) {
            this.f122685c.requestCodeDelete(str, true).enqueue(new n(this));
        }
    }

    public AdSettingsActivity() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(AdSettingsApi.class);
        h.f.b.l.b(create, "");
        this.f122685c = (AdSettingsApi) create;
        this.f122689i = h.i.a((h.f.a.a) new b(this));
        this.f122690j = h.i.a((h.f.a.a) k.f122701a);
    }

    public final void b() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            h.f.b.l.b(iESSettingsProxy, "");
            AdFeSettings adFeSettings = iESSettingsProxy.getAdFeSettings();
            if (adFeSettings != null) {
                String legalPage = adFeSettings.getLegalPage();
                if (!TextUtils.isEmpty(legalPage)) {
                    com.ss.android.ugc.aweme.commercialize.utils.w.a(this, legalPage, getString(R.string.fqc));
                }
            }
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
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

    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122693a;

        static {
            Covode.recordClassIndex(80531);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(AdSettingsActivity adSettingsActivity) {
            this.f122693a = adSettingsActivity;
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(androidx.core.content.b.c(this.f122693a, R.color.c4));
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            String str;
            h.f.b.l.d(view, "");
            AdSettingsActivity adSettingsActivity = this.f122693a;
            StringBuilder sb = new StringBuilder();
            String a2 = SettingsManager.a().a("branded_content_detail_url", "aweme://webview?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fh5%2Fvideo_appeal%3Fhide_nav_bar%3D1%26from%3Dapp");
            h.f.b.l.b(a2, "");
            if (TextUtils.isEmpty(a2)) {
                a2 = com.ss.android.ugc.aweme.commercialize.l.a.f74490a;
            }
            StringBuilder append = sb.append(a2).append("%26item_id%3D");
            Aweme aweme = AdSettingsActivity.f122681d;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(adSettingsActivity, append.append(str).toString()).open();
        }
    }

    public static final class d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122694a;

        static {
            Covode.recordClassIndex(80532);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(AdSettingsActivity adSettingsActivity) {
            this.f122694a = adSettingsActivity;
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            this.f122694a.b();
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(androidx.core.content.b.c(this.f122694a, R.color.bx));
            textPaint.setFakeBoldText(true);
        }
    }

    public static final class i implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122699a;

        static {
            Covode.recordClassIndex(80538);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(AdSettingsActivity adSettingsActivity) {
            this.f122699a = adSettingsActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f122699a.finish();
        }
    }

    public static final class m implements com.bytedance.retrofit2.d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122702a;

        static {
            Covode.recordClassIndex(80542);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(AdSettingsActivity adSettingsActivity) {
            this.f122702a = adSettingsActivity;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(th, "");
            this.f122702a.a().dismiss();
            this.f122702a.finish();
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, com.bytedance.retrofit2.u<String> uVar) {
            com.ss.android.ugc.aweme.commercialize.adsetting.c cVar;
            Integer num;
            boolean z;
            int i2;
            long j2;
            int i3;
            h.f.b.l.d(bVar, "");
            this.f122702a.a().dismiss();
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null) {
                String str = null;
                try {
                    GsonProvider c2 = GsonHolder.c();
                    h.f.b.l.b(c2, "");
                    cVar = (com.ss.android.ugc.aweme.commercialize.adsetting.c) c2.b().a((String) uVar.f42630b, com.ss.android.ugc.aweme.commercialize.adsetting.c.class);
                    if (!(cVar == null || (num = cVar.f73683a) == null || num.intValue() != 0)) {
                        AdSettingsActivity adSettingsActivity = this.f122702a;
                        if (cVar != null) {
                            Boolean bool = cVar.f73685c;
                            int i4 = 0;
                            if (bool != null) {
                                z = bool.booleanValue();
                            } else {
                                z = false;
                            }
                            Integer num2 = cVar.f73687e;
                            boolean z2 = true;
                            if (num2 != null && num2.intValue() == 1) {
                                CommonItemView commonItemView = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                h.f.b.l.b(commonItemView, "");
                                commonItemView.setChecked(true);
                                String string = adSettingsActivity.getString(R.string.gkk);
                                h.f.b.l.b(string, "");
                                String string2 = adSettingsActivity.getString(R.string.gkl);
                                h.f.b.l.b(string2, "");
                                SpannableStringBuilder append = new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) string2);
                                h.f.b.l.b(append, "");
                                int a2 = h.m.p.a((CharSequence) append, string2, 0, false, 6);
                                append.setSpan(new c(adSettingsActivity), a2, string2.length() + a2, 33);
                                CommonItemView commonItemView2 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                h.f.b.l.b(commonItemView2, "");
                                TextView tvwDesc = commonItemView2.getTvwDesc();
                                h.f.b.l.b(tvwDesc, "");
                                tvwDesc.setMovementMethod(LinkMovementMethod.getInstance());
                                CommonItemView commonItemView3 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                h.f.b.l.b(commonItemView3, "");
                                TextView tvwDesc2 = commonItemView3.getTvwDesc();
                                h.f.b.l.b(tvwDesc2, "");
                                CommonItemView commonItemView4 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                h.f.b.l.b(commonItemView4, "");
                                TextView tvwDesc3 = commonItemView4.getTvwDesc();
                                h.f.b.l.b(tvwDesc3, "");
                                tvwDesc2.setText(new SpannableStringBuilder(tvwDesc3.getText()).append((CharSequence) "\n").append((CharSequence) append));
                                ((CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp)).setOnClickListener(new j(adSettingsActivity));
                            } else {
                                Integer num3 = cVar.f73686d;
                                if (num3 != null) {
                                    i3 = num3.intValue();
                                } else {
                                    i3 = 2;
                                }
                                CommonItemView commonItemView5 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.dp);
                                h.f.b.l.b(commonItemView5, "");
                                if (i3 != 1) {
                                    z2 = false;
                                }
                                commonItemView5.setChecked(z2);
                            }
                            CommonItemView commonItemView6 = (CommonItemView) adSettingsActivity._$_findCachedViewById(R.id.g8);
                            h.f.b.l.b(commonItemView6, "");
                            commonItemView6.setChecked(z);
                            CheckBox checkBox = (CheckBox) adSettingsActivity._$_findCachedViewById(R.id.a38);
                            h.f.b.l.b(checkBox, "");
                            checkBox.setChecked(z);
                            LinearLayout linearLayout = (LinearLayout) adSettingsActivity._$_findCachedViewById(R.id.c55);
                            h.f.b.l.b(linearLayout, "");
                            if (!z) {
                                i4 = 8;
                            }
                            linearLayout.setVisibility(i4);
                            String str2 = cVar.f73688f;
                            Integer num4 = cVar.f73689g;
                            if (num4 != null) {
                                i2 = num4.intValue();
                            } else {
                                i2 = -1;
                            }
                            Long l2 = cVar.f73690h;
                            long j3 = 0;
                            if (l2 != null) {
                                j2 = l2.longValue();
                            } else {
                                j2 = 0;
                            }
                            Long l3 = cVar.f73691i;
                            if (l3 != null) {
                                j3 = l3.longValue();
                            }
                            adSettingsActivity.a(str2, i2, j2, j3);
                            return;
                        }
                        return;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    cVar = null;
                }
                this.f122702a.a().dismiss();
                this.f122702a.finish();
                if (cVar != null) {
                    str = cVar.f73684b;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "Request Failed";
                }
                new com.bytedance.tux.g.b(this.f122702a).a(str).b();
            }
        }
    }

    public static final class n implements com.bytedance.retrofit2.d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122703a;

        static {
            Covode.recordClassIndex(80543);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(AdSettingsActivity adSettingsActivity) {
            this.f122703a = adSettingsActivity;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            new com.bytedance.tux.g.b(this.f122703a).a("Request Failed").b();
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, com.bytedance.retrofit2.u<String> uVar) {
            com.google.gson.o a2;
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null && (a2 = this.f122703a.a(uVar.f42630b)) != null) {
                com.google.gson.l c2 = a2.c("status_msg");
                if (c2 != null) {
                    c2.c();
                }
                com.google.gson.l c3 = a2.c("status_code");
                if (c3 != null && c3.g() == 0) {
                    new com.bytedance.tux.g.b(this.f122703a).a(this.f122703a.getResources().getString(R.string.b66)).b();
                    this.f122703a.a("", -1, 0, 0);
                }
            }
        }
    }

    public static final class o implements com.bytedance.retrofit2.d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122704a;

        static {
            Covode.recordClassIndex(80544);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(AdSettingsActivity adSettingsActivity) {
            this.f122704a = adSettingsActivity;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            new com.bytedance.tux.g.b(this.f122704a).a("Request Failed").b();
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, com.bytedance.retrofit2.u<String> uVar) {
            com.google.gson.o a2;
            com.google.gson.l c2;
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null && (a2 = this.f122704a.a(uVar.f42630b)) != null && (c2 = a2.c("status_code")) != null && c2.g() == 0) {
                new com.bytedance.tux.g.b(this.f122704a).a(this.f122704a.getResources().getString(R.string.f1g)).b();
                this.f122704a.c();
            }
        }
    }

    public static final class w implements a.AbstractC1650a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122717a;

        static {
            Covode.recordClassIndex(80554);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.adsetting.a.AbstractC1650a
        public final void a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        w(AdSettingsActivity adSettingsActivity) {
            this.f122717a = adSettingsActivity;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.adsetting.a.AbstractC1650a
        public final void a(long j2, long j3) {
            AdSettingsActivity adSettingsActivity = this.f122717a;
            String str = adSettingsActivity.f122683a;
            if (str != null) {
                adSettingsActivity.f122685c.requestCodeGenerate(str, j2, j3).enqueue(new p(adSettingsActivity, j2, j3));
            }
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ String $awemeId;
        final /* synthetic */ boolean $originChecked;
        final /* synthetic */ AdSettingsActivity this$0;

        static {
            Covode.recordClassIndex(80527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(AdSettingsActivity adSettingsActivity, String str, boolean z) {
            super(1);
            this.this$0 = adSettingsActivity;
            this.$awemeId = str;
            this.$originChecked = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.h9v, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity.aa.AnonymousClass1 */
                final /* synthetic */ aa this$0;

                static {
                    Covode.recordClassIndex(80528);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    int i2;
                    h.f.b.l.d(aVar, "");
                    AdSettingsApi adSettingsApi = this.this$0.this$0.f122685c;
                    String str = this.this$0.$awemeId;
                    if (this.this$0.$originChecked) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    adSettingsApi.requestDarkPostUpdate(str, i2).enqueue(new com.bytedance.retrofit2.d<String>(this) {
                        /* class com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity.aa.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f122692a;

                        static {
                            Covode.recordClassIndex(80529);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f122692a = r1;
                        }

                        @Override // com.bytedance.retrofit2.d
                        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
                            new com.bytedance.tux.g.b(this.f122692a.this$0.this$0).a("Request Failed").b();
                        }

                        @Override // com.bytedance.retrofit2.d
                        public final void a(com.bytedance.retrofit2.b<String> bVar, com.bytedance.retrofit2.u<String> uVar) {
                            com.google.gson.o a2;
                            com.google.gson.l c2;
                            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null && (a2 = this.f122692a.this$0.this$0.a(uVar.f42630b)) != null && (c2 = a2.c("status_code")) != null && c2.g() == 0) {
                                CommonItemView commonItemView = (CommonItemView) this.f122692a.this$0.this$0._$_findCachedViewById(R.id.dp);
                                h.f.b.l.b(commonItemView, "");
                                commonItemView.setChecked(!this.f122692a.this$0.$originChecked);
                                CommonItemView commonItemView2 = (CommonItemView) this.f122692a.this$0.this$0._$_findCachedViewById(R.id.dp);
                                h.f.b.l.b(commonItemView2, "");
                                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.b.b(commonItemView2.d()));
                            }
                        }
                    });
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.h9u, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    static final class h implements DmtSettingSwitch.a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f122698a = new h();

        static {
            Covode.recordClassIndex(80537);
        }

        h() {
        }

        @Override // com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch.a
        public final void a(boolean z) {
            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
            int i2;
            Aweme aweme = AdSettingsActivity.f122681d;
            if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                commerceVideoAuthInfo.setDarkPostStatus(i2);
            }
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122700a;

        static {
            Covode.recordClassIndex(80539);
        }

        j(AdSettingsActivity adSettingsActivity) {
            this.f122700a = adSettingsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new com.bytedance.tux.g.b(this.f122700a).a(this.f122700a.getResources().getString(R.string.gkm)).b();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f122710a = new r();

        static {
            Covode.recordClassIndex(80549);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.b75, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f122711a = new s();

        static {
            Covode.recordClassIndex(80550);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.b75, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f122712a = new t();

        static {
            Covode.recordClassIndex(80551);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.b75, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    public final com.google.gson.o a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            this.f122690j.getValue();
            com.google.gson.l a2 = com.google.gson.q.a(str);
            h.f.b.l.b(a2, "");
            return a2.j();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(boolean z2) {
        String str = this.f122683a;
        if (str != null) {
            this.f122685c.requestPromoteUpdate(str, !z2).enqueue(new v(this, z2));
        }
    }

    static final class e implements DmtSettingSwitch.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122695a;

        static {
            Covode.recordClassIndex(80533);
        }

        e(AdSettingsActivity adSettingsActivity) {
            this.f122695a = adSettingsActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch.a
        public final void a(boolean z) {
            Aweme b2;
            CheckBox checkBox = (CheckBox) this.f122695a._$_findCachedViewById(R.id.a38);
            h.f.b.l.b(checkBox, "");
            checkBox.setEnabled(!z);
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.f122695a._$_findCachedViewById(R.id.c55);
                h.f.b.l.b(linearLayout, "");
                linearLayout.setVisibility(0);
                String str = this.f122695a.f122684b;
                if (str == null || str.length() == 0) {
                    TuxTextView tuxTextView = (TuxTextView) this.f122695a._$_findCachedViewById(R.id.ezz);
                    h.f.b.l.b(tuxTextView, "");
                    tuxTextView.setVisibility(0);
                    LinearLayout linearLayout2 = (LinearLayout) this.f122695a._$_findCachedViewById(R.id.c56);
                    h.f.b.l.b(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                } else {
                    TuxTextView tuxTextView2 = (TuxTextView) this.f122695a._$_findCachedViewById(R.id.ezz);
                    h.f.b.l.b(tuxTextView2, "");
                    tuxTextView2.setVisibility(8);
                    LinearLayout linearLayout3 = (LinearLayout) this.f122695a._$_findCachedViewById(R.id.c56);
                    h.f.b.l.b(linearLayout3, "");
                    linearLayout3.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout4 = (LinearLayout) this.f122695a._$_findCachedViewById(R.id.c55);
                h.f.b.l.b(linearLayout4, "");
                linearLayout4.setVisibility(8);
                TuxTextView tuxTextView3 = (TuxTextView) this.f122695a._$_findCachedViewById(R.id.ezz);
                h.f.b.l.b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
                LinearLayout linearLayout5 = (LinearLayout) this.f122695a._$_findCachedViewById(R.id.c56);
                h.f.b.l.b(linearLayout5, "");
                linearLayout5.setVisibility(8);
            }
            String str2 = this.f122695a.f122683a;
            if (str2 != null && (b2 = AwemeService.b().b(str2)) != null) {
                com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = b2.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo == null) {
                    commerceVideoAuthInfo = new com.ss.android.ugc.aweme.commerce.a();
                    b2.setCommerceVideoAuthInfo(commerceVideoAuthInfo);
                }
                commerceVideoAuthInfo.setAdvPromotable(z);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122696a;

        static {
            Covode.recordClassIndex(80534);
        }

        f(AdSettingsActivity adSettingsActivity) {
            this.f122696a = adSettingsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f122696a._$_findCachedViewById(R.id.g8);
            h.f.b.l.b(commonItemView, "");
            boolean d2 = commonItemView.d();
            if (!d2) {
                CheckBox checkBox = (CheckBox) this.f122696a._$_findCachedViewById(R.id.a38);
                h.f.b.l.b(checkBox, "");
                if (checkBox.isChecked()) {
                    AdSettingsActivity adSettingsActivity = this.f122696a;
                    String string = adSettingsActivity.getResources().getString(R.string.f17);
                    h.f.b.l.b(string, "");
                    String string2 = this.f122696a.getResources().getString(R.string.b75);
                    h.f.b.l.b(string2, "");
                    AnonymousClass1 r6 = new h.f.a.a<h.z>(this) {
                        /* class com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity.f.AnonymousClass1 */
                        final /* synthetic */ f this$0;

                        static {
                            Covode.recordClassIndex(80535);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ h.z invoke() {
                            this.this$0.f122696a.a(false);
                            return h.z.f158842a;
                        }
                    };
                    String string3 = this.f122696a.getResources().getString(R.string.f18);
                    h.f.b.l.b(string3, "");
                    adSettingsActivity.a(string, string2, r6, false, string3);
                }
            } else if (!TextUtils.isEmpty(this.f122696a.f122684b)) {
                new com.bytedance.tux.g.b(this.f122696a).e(R.string.h02).b();
            } else {
                this.f122696a.a(d2);
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122697a;

        static {
            Covode.recordClassIndex(80536);
        }

        g(AdSettingsActivity adSettingsActivity) {
            this.f122697a = adSettingsActivity;
        }

        public final void onClick(View view) {
            Aweme aweme;
            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
            ClickAgent.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f122697a._$_findCachedViewById(R.id.dp);
            h.f.b.l.b(commonItemView, "");
            boolean d2 = commonItemView.d();
            AdSettingsActivity adSettingsActivity = this.f122697a;
            String str = adSettingsActivity.f122683a;
            if (str != null) {
                Aweme aweme2 = AdSettingsActivity.f122681d;
                Integer num = null;
                if (!(aweme2 == null || (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) == null)) {
                    num = Integer.valueOf(commerceVideoAuthInfo.getMissionItemStatus());
                }
                int i2 = 1;
                if (num != null && ((num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 7 || num.intValue() == 8) && !d2)) {
                    String str2 = adSettingsActivity.f122683a;
                    if (str2 != null) {
                        com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(adSettingsActivity).a(R.string.b4f).b(R.string.b4e), new aa(adSettingsActivity, str2, d2)).a().b().show();
                        return;
                    }
                    return;
                }
                Aweme aweme3 = AdSettingsActivity.f122681d;
                if (aweme3 == null || !aweme3.isTop() || (aweme = AdSettingsActivity.f122681d) == null || aweme.playlist_info == null) {
                    Aweme aweme4 = AdSettingsActivity.f122681d;
                    if (aweme4 == null || !aweme4.isTop()) {
                        Aweme aweme5 = AdSettingsActivity.f122681d;
                        if (aweme5 == null || aweme5.playlist_info == null) {
                            AdSettingsApi adSettingsApi = adSettingsActivity.f122685c;
                            if (d2) {
                                i2 = 2;
                            }
                            adSettingsApi.requestDarkPostUpdate(str, i2).enqueue(new u(adSettingsActivity, d2));
                            return;
                        }
                        com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(adSettingsActivity).b(R.string.b4d), t.f122712a).a().b().show();
                        return;
                    }
                    com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(adSettingsActivity).b(R.string.b4b), s.f122711a).a().b().show();
                    return;
                }
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(adSettingsActivity).b(R.string.b4c), r.f122710a).a().b().show();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.exj) {
                String str = this.f122684b;
                if (str != null) {
                    try {
                        av.a(str, str, this, PrivacyCert.Builder.Companion.with("bpea-216").usage("Users share their video code with advertisers to promote their video on  ads.").tag("clickToCopyVideoCode").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                    } catch (com.bytedance.bpea.basics.a e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                    }
                    new com.bytedance.tux.g.b(this).a(getResources().getString(R.string.auk)).b();
                }
            } else if (id == R.id.ezz) {
                com.ss.android.ugc.aweme.commercialize.adsetting.a a2 = a.b.a(getResources().getString(R.string.fk6), new w(this), 0, 0);
                a2.setCancelable(true);
                a2.show(getSupportFragmentManager(), "authorization_dialog");
            } else if (id == R.id.eya) {
                if (this.f122686f == 2) {
                    String str2 = this.f122683a;
                    if (str2 != null) {
                        this.f122685c.requestCodeDelete(str2, false).enqueue(new q(this));
                        return;
                    }
                    return;
                }
                String string = getResources().getString(R.string.b5n);
                h.f.b.l.b(string, "");
                String string2 = getResources().getString(R.string.b5g);
                h.f.b.l.b(string2, "");
                l lVar = new l(this);
                String string3 = getResources().getString(R.string.b5o);
                h.f.b.l.b(string3, "");
                a(string, string2, lVar, true, string3);
            } else if (id == R.id.ezc) {
                com.ss.android.ugc.aweme.commercialize.adsetting.a a3 = a.b.a(getResources().getString(R.string.fk6), new z(this), this.f122687g, this.f122688h);
                a3.setCancelable(true);
                a3.show(getSupportFragmentManager(), "extend_authorization_period_dialog");
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", true);
        super.onCreate(bundle);
        super.overridePendingTransition(R.anim.dq, 0);
        setContentView(R.layout.at);
        this.f122683a = a(getIntent(), "id");
        a().show();
        ((TextTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new i(this));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(R.string.fq_);
        h.f.b.l.b(string, "");
        String string2 = getString(R.string.fq9);
        h.f.b.l.b(string2, "");
        String a2 = com.a.a(string2, Arrays.copyOf(new Object[]{string}, 1));
        h.f.b.l.b(a2, "");
        int a3 = h.m.p.a((CharSequence) a2, string, 0, false, 6);
        spannableStringBuilder.append((CharSequence) a2);
        spannableStringBuilder.setSpan(new d(this), a3, string.length() + a3, 33);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.gc);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.gc);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(spannableStringBuilder);
        ((CommonItemView) _$_findCachedViewById(R.id.g8)).setOnCheckedChangeListener(new e(this));
        ((CommonItemView) _$_findCachedViewById(R.id.g8)).setOnClickListener(new f(this));
        ((CommonItemView) _$_findCachedViewById(R.id.dp)).setOnClickListener(new g(this));
        ((CommonItemView) _$_findCachedViewById(R.id.dp)).setOnCheckedChangeListener(h.f122698a);
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.ezz);
        h.f.b.l.b(tuxTextView3, "");
        tuxTextView3.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c56);
        h.f.b.l.b(linearLayout, "");
        linearLayout.setVisibility(8);
        findViewById(R.id.ezz).setOnClickListener(this);
        findViewById(R.id.exj).setOnClickListener(this);
        findViewById(R.id.eya).setOnClickListener(this);
        findViewById(R.id.ezc).setOnClickListener(this);
        c();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    public static final class y implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final y f122719a = new y();

        static {
            Covode.recordClassIndex(80556);
        }

        y() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public static final class u implements com.bytedance.retrofit2.d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f122714b;

        static {
            Covode.recordClassIndex(80552);
        }

        u(AdSettingsActivity adSettingsActivity, boolean z) {
            this.f122713a = adSettingsActivity;
            this.f122714b = z;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            new com.bytedance.tux.g.b(this.f122713a).a("Request Failed").b();
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, com.bytedance.retrofit2.u<String> uVar) {
            String str;
            com.google.gson.l c2;
            com.google.gson.l c3;
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null) {
                com.google.gson.o a2 = this.f122713a.a(uVar.f42630b);
                if (a2 == null || (c3 = a2.c("status_msg")) == null) {
                    str = null;
                } else {
                    str = c3.c();
                }
                if (!TextUtils.isEmpty(str)) {
                    new com.bytedance.tux.g.b(this.f122713a).a(str).b();
                }
                if (a2 != null && (c2 = a2.c("status_code")) != null && c2.g() == 0) {
                    CommonItemView commonItemView = (CommonItemView) this.f122713a._$_findCachedViewById(R.id.dp);
                    h.f.b.l.b(commonItemView, "");
                    commonItemView.setChecked(!this.f122714b);
                    CommonItemView commonItemView2 = (CommonItemView) this.f122713a._$_findCachedViewById(R.id.dp);
                    h.f.b.l.b(commonItemView2, "");
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.b.b(commonItemView2.d()));
                }
            }
        }
    }

    public static final class v implements com.bytedance.retrofit2.d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f122716b;

        static {
            Covode.recordClassIndex(80553);
        }

        v(AdSettingsActivity adSettingsActivity, boolean z) {
            this.f122715a = adSettingsActivity;
            this.f122716b = z;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            new com.bytedance.tux.g.b(this.f122715a).a("Request Failed").b();
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, com.bytedance.retrofit2.u<String> uVar) {
            String str;
            int i2;
            boolean z;
            com.google.gson.l c2;
            com.google.gson.l c3;
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null) {
                com.google.gson.o a2 = this.f122715a.a(uVar.f42630b);
                if (a2 == null || (c3 = a2.c("status_msg")) == null) {
                    str = null;
                } else {
                    str = c3.c();
                }
                if (!TextUtils.isEmpty(str)) {
                    new com.bytedance.tux.g.b(this.f122715a).a(str).b();
                }
                if (a2 == null || (c2 = a2.c("status_code")) == null) {
                    i2 = -1;
                } else {
                    i2 = c2.g();
                }
                CommonItemView commonItemView = (CommonItemView) this.f122715a._$_findCachedViewById(R.id.g8);
                h.f.b.l.b(commonItemView, "");
                if (i2 != 0) {
                    z = this.f122716b;
                } else if (!this.f122716b) {
                    z = true;
                } else {
                    z = false;
                }
                commonItemView.setChecked(z);
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f122718a;

        static {
            Covode.recordClassIndex(80555);
        }

        x(h.f.a.a aVar) {
            this.f122718a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f122718a.invoke();
            dialogInterface.dismiss();
        }
    }

    public static final class p implements com.bytedance.retrofit2.d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdSettingsActivity f122705a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f122706b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f122707c;

        static {
            Covode.recordClassIndex(80545);
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            new com.bytedance.tux.g.b(this.f122705a).a("Request Failed").b();
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, com.bytedance.retrofit2.u<String> uVar) {
            String str;
            com.google.gson.l c2;
            com.google.gson.l c3;
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null) {
                com.google.gson.o a2 = this.f122705a.a(uVar.f42630b);
                String str2 = null;
                if (a2 == null || (c3 = a2.c("status_msg")) == null) {
                    str = null;
                } else {
                    str = c3.c();
                }
                if (!TextUtils.isEmpty(str)) {
                    new com.bytedance.tux.g.b(this.f122705a).a(str).b();
                }
                if (!(a2 == null || (c2 = a2.c("video_code")) == null)) {
                    str2 = c2.c();
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f122705a.a(str2, 1, this.f122706b, this.f122707c);
                }
            }
        }

        p(AdSettingsActivity adSettingsActivity, long j2, long j3) {
            this.f122705a = adSettingsActivity;
            this.f122706b = j2;
            this.f122707c = j3;
        }
    }

    public final void a(String str, int i2, long j2, long j3) {
        boolean z2;
        String string;
        this.f122684b = str;
        this.f122686f = i2;
        this.f122687g = j2;
        this.f122688h = j3;
        int i3 = 0;
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = 8;
        if (z2) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.ezz);
            h.f.b.l.b(tuxTextView, "");
            CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.g8);
            h.f.b.l.b(commonItemView, "");
            if (!commonItemView.d()) {
                i3 = 8;
            }
            tuxTextView.setVisibility(i3);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c56);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.ezz);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R.id.c56);
        h.f.b.l.b(linearLayout2, "");
        CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.g8);
        h.f.b.l.b(commonItemView2, "");
        if (commonItemView2.d()) {
            i4 = 0;
        }
        linearLayout2.setVisibility(i4);
        if (i2 == 1) {
            string = getResources().getString(R.string.aha);
        } else if (i2 == 2) {
            string = getResources().getString(R.string.ahb);
        } else if (i2 != 3) {
            string = "";
        } else {
            string = getResources().getString(R.string.ahc);
        }
        h.f.b.l.b(string, "");
        String str2 = getResources().getString(R.string.ahd) + ": " + string;
        SpannableString spannableString = new SpannableString(str2);
        int a2 = h.m.p.a((CharSequence) str2, string, 0, false, 6);
        if (a2 >= 0) {
            spannableString.setSpan(new StyleSpan(1), a2, string.length() + a2, 33);
        }
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.ex2);
        h.f.b.l.b(tuxTextView3, "");
        tuxTextView3.setText(spannableString);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault());
        Date date = new Date(j2 * 1000);
        Date date2 = new Date(j3 * 1000);
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.evq);
        h.f.b.l.b(tuxTextView4, "");
        tuxTextView4.setText(getResources().getString(R.string.wn) + ":\n" + simpleDateFormat.format(date) + " - " + simpleDateFormat.format(date2));
    }

    public final void a(String str, String str2, h.f.a.a<h.z> aVar, boolean z2, String str3) {
        a.C0731a aVar2 = new a.C0731a(this);
        if (!TextUtils.isEmpty(str3)) {
            aVar2.f33401a = str3;
        }
        aVar2.f33402b = str;
        aVar2.a(str2, (DialogInterface.OnClickListener) new x(aVar), false);
        if (z2) {
            aVar2.b(R.string.a9e, (DialogInterface.OnClickListener) y.f122719a, false);
        }
        aVar2.M = false;
        aVar2.a().c();
    }
}
