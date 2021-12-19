package com.ss.android.ugc.aweme.compliance.business.personalization;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings;
import com.ss.android.ugc.aweme.compliance.api.model.PersonalizationDataText;
import com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.items.clearcache.DiskManagerItemView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

public final class PersonalizationActivity extends com.bytedance.ies.foundation.activity.a implements com.ss.android.ugc.aweme.compliance.api.c.b, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f76978e = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private static final boolean f76979j = false;

    /* renamed from: a  reason: collision with root package name */
    public CommonItemView f76980a;

    /* renamed from: b  reason: collision with root package name */
    PersonalizationDataText f76981b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76982c;

    /* renamed from: d  reason: collision with root package name */
    public final View.OnClickListener f76983d = new aa(this);

    /* renamed from: f  reason: collision with root package name */
    private TuxNavBar f76984f;

    /* renamed from: g  reason: collision with root package name */
    private CommonItemView f76985g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f76986h = h.i.a((h.f.a.a) new v(this));

    /* renamed from: i  reason: collision with root package name */
    private boolean f76987i;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f76988k;

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f76988k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f76988k == null) {
            this.f76988k = new SparseArray();
        }
        View view = (View) this.f76988k.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f76988k.put(i2, findViewById);
        return findViewById;
    }

    public final PersonalizationViewModel a() {
        return (PersonalizationViewModel) this.f76986h.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new org.greenrobot.eventbus.g(PersonalizationActivity.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
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
    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47576);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ PersonalizationActivity this$0;

        static {
            Covode.recordClassIndex(47597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(PersonalizationActivity personalizationActivity) {
            super(0);
            this.this$0 = personalizationActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.onBackPressed();
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<PersonalizationViewModel> {
        final /* synthetic */ PersonalizationActivity this$0;

        static {
            Covode.recordClassIndex(47598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(PersonalizationActivity personalizationActivity) {
            super(0);
            this.this$0 = personalizationActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PersonalizationViewModel invoke() {
            return ae.a(this.this$0, (ad.b) null).a(PersonalizationViewModel.class);
        }
    }

    static {
        Covode.recordClassIndex(47575);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onResume", true);
        super.onResume();
        if (com.ss.android.ugc.aweme.compliance.common.b.b()) {
            com.ss.android.ugc.aweme.compliance.business.personalization.a.a.a(this, this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onResume", false);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        String str;
        if (this.f76987i) {
            AdPersonalitySettings i2 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i2 != null) {
                str = i2.getBusiness();
            } else {
                str = null;
            }
            boolean a2 = h.f.b.l.a((Object) str, (Object) "lat_strategy_update");
            boolean z2 = true;
            if (!a2) {
                if (this.f76982c) {
                    Intent intent = new Intent();
                    intent.putExtra("result", 0);
                    setResult(10, intent);
                } else {
                    if (com.ss.android.ugc.aweme.compliance.common.b.f() != 1) {
                        z2 = false;
                    }
                    c(z2);
                }
            }
        }
        super.onBackPressed();
        finish();
    }

    public static final class t extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f77015b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f77016c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f77017d;

        static {
            Covode.recordClassIndex(47596);
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            SmartRouter.buildRoute(this.f77014a, "//webview").withParam("url", this.f77015b).withParam("use_webview_title", true).open();
        }

        t(PersonalizationActivity personalizationActivity, String str, int i2, String str2) {
            this.f77014a = personalizationActivity;
            this.f77015b = str;
            this.f77016c = i2;
            this.f77017d = str2;
        }
    }

    public static final /* synthetic */ CommonItemView a(PersonalizationActivity personalizationActivity) {
        CommonItemView commonItemView = personalizationActivity.f76980a;
        if (commonItemView == null) {
            h.f.b.l.a("mAdSettingItem");
        }
        return commonItemView;
    }

    static final class aa implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f76989a;

        static {
            Covode.recordClassIndex(47577);
        }

        aa(PersonalizationActivity personalizationActivity) {
            this.f76989a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationActivity personalizationActivity = this.f76989a;
            personalizationActivity.c(!PersonalizationActivity.a(personalizationActivity).d());
            this.f76989a.f76982c = true;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f76998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f76999b = false;

        static {
            Covode.recordClassIndex(47584);
        }

        h(PersonalizationActivity personalizationActivity) {
            this.f76998a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f76998a).a(R.string.fqv).a();
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f77004b;

        static {
            Covode.recordClassIndex(47586);
        }

        j(PersonalizationActivity personalizationActivity, boolean z) {
            this.f77003a = personalizationActivity;
            this.f77004b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f77003a).a(R.string.fr0).a();
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77005a;

        static {
            Covode.recordClassIndex(47587);
        }

        k(PersonalizationActivity personalizationActivity) {
            this.f77005a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.common.r.onEventV3("click_ad_inference");
            SmartRouter.buildRoute(this.f77005a, "//privacy/setting/personalization/inference").open();
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77006a;

        static {
            Covode.recordClassIndex(47588);
        }

        l(PersonalizationActivity personalizationActivity) {
            this.f77006a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f77006a, "//webview").withParam("url", "https://www.tiktok.com/web-inapp/account/delete/guest?hide_nav_bar=1").open();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77007a;

        static {
            Covode.recordClassIndex(47589);
        }

        m(PersonalizationActivity personalizationActivity) {
            this.f77007a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationActivity personalizationActivity = this.f77007a;
            String string = personalizationActivity.getString(R.string.bv);
            h.f.b.l.b(string, "");
            personalizationActivity.a("https://www.tiktok.com/falcon/fe_tiktok_common/inferred_interests/index.html", string);
        }
    }

    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77013a;

        static {
            Covode.recordClassIndex(47595);
        }

        s(PersonalizationActivity personalizationActivity) {
            this.f77013a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationActivity personalizationActivity = this.f77013a;
            String string = personalizationActivity.getString(R.string.gez);
            h.f.b.l.b(string, "");
            personalizationActivity.a("https://www.tiktok.com/inapp/third_party_measurements?hide_more=1", string);
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f77018a = new w();

        static {
            Covode.recordClassIndex(47599);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f77019a);
            baseActivityViewModel2.config(AnonymousClass2.f77020a);
            baseActivityViewModel2.config(AnonymousClass3.f77021a);
            return h.z.f158842a;
        }
    }

    static final class z implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77024a;

        static {
            Covode.recordClassIndex(47605);
        }

        z(PersonalizationActivity personalizationActivity) {
            this.f77024a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f77024a).a(R.string.dmu).a();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemView f76991a;

        static {
            Covode.recordClassIndex(47579);
        }

        c(CommonItemView commonItemView) {
            this.f76991a = commonItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TextView tvwDesc = this.f76991a.getTvwDesc();
            h.f.b.l.b(tvwDesc, "");
            if (tvwDesc.getSelectionStart() == -1) {
                TextView tvwDesc2 = this.f76991a.getTvwDesc();
                h.f.b.l.b(tvwDesc2, "");
                if (tvwDesc2.getSelectionEnd() == -1) {
                    this.f76991a.performClick();
                }
            }
        }
    }

    static final class d<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f76992a;

        static {
            Covode.recordClassIndex(47580);
        }

        d(PersonalizationActivity personalizationActivity) {
            this.f76992a = personalizationActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f76992a._$_findCachedViewById(R.id.ekj);
            h.f.b.l.b(commonItemView, "");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemView f76993a;

        static {
            Covode.recordClassIndex(47581);
        }

        e(CommonItemView commonItemView) {
            this.f76993a = commonItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TextView tvwDesc = this.f76993a.getTvwDesc();
            h.f.b.l.b(tvwDesc, "");
            if (tvwDesc.getSelectionStart() == -1) {
                TextView tvwDesc2 = this.f76993a.getTvwDesc();
                h.f.b.l.b(tvwDesc2, "");
                if (tvwDesc2.getSelectionEnd() == -1) {
                    this.f76993a.performClick();
                }
            }
        }
    }

    static final class f<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f76994a;

        static {
            Covode.recordClassIndex(47582);
        }

        f(PersonalizationActivity personalizationActivity) {
            this.f76994a = personalizationActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f76994a._$_findCachedViewById(R.id.d1z);
            h.f.b.l.b(commonItemView, "");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemView f76995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f76996b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f76997c = true;

        static {
            Covode.recordClassIndex(47583);
        }

        g(CommonItemView commonItemView, PersonalizationActivity personalizationActivity) {
            this.f76995a = commonItemView;
            this.f76996b = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76996b.f76982c = true;
            PersonalizationViewModel a2 = this.f76996b.a();
            CommonItemView commonItemView = this.f76995a;
            h.f.b.l.b(commonItemView, "");
            PersonalizationViewModel.a(a2, Integer.valueOf(1 ^ commonItemView.d()), null, 5);
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemView f77000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77001b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f77002c;

        static {
            Covode.recordClassIndex(47585);
        }

        i(CommonItemView commonItemView, PersonalizationActivity personalizationActivity, boolean z) {
            this.f77000a = commonItemView;
            this.f77001b = personalizationActivity;
            this.f77002c = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f77001b.f76982c = true;
            PersonalizationViewModel a2 = this.f77001b.a();
            CommonItemView commonItemView = this.f77000a;
            h.f.b.l.b(commonItemView, "");
            PersonalizationViewModel.a(a2, null, Integer.valueOf(1 ^ commonItemView.d()), 3);
        }
    }

    static final class n<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77008a;

        static {
            Covode.recordClassIndex(47590);
        }

        n(PersonalizationActivity personalizationActivity) {
            this.f77008a = personalizationActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f77008a._$_findCachedViewById(R.id.d3x);
            h.f.b.l.b(commonItemView, "");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77009a;

        static {
            Covode.recordClassIndex(47591);
        }

        o(PersonalizationActivity personalizationActivity) {
            this.f77009a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationViewModel a2 = this.f77009a.a();
            CommonItemView commonItemView = (CommonItemView) this.f77009a._$_findCachedViewById(R.id.d3x);
            h.f.b.l.b(commonItemView, "");
            PersonalizationViewModel.b(a2, Integer.valueOf(!commonItemView.d()), null, 2);
        }
    }

    static final class p<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77010a;

        static {
            Covode.recordClassIndex(47592);
        }

        p(PersonalizationActivity personalizationActivity) {
            this.f77010a = personalizationActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f77010a._$_findCachedViewById(R.id.d3y);
            h.f.b.l.b(commonItemView, "");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77011a;

        static {
            Covode.recordClassIndex(47593);
        }

        q(PersonalizationActivity personalizationActivity) {
            this.f77011a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationViewModel a2 = this.f77011a.a();
            CommonItemView commonItemView = (CommonItemView) this.f77011a._$_findCachedViewById(R.id.d3y);
            h.f.b.l.b(commonItemView, "");
            PersonalizationViewModel.b(a2, null, Integer.valueOf(!commonItemView.d()), 1);
        }
    }

    static final class r<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77012a;

        static {
            Covode.recordClassIndex(47594);
        }

        r(PersonalizationActivity personalizationActivity) {
            this.f77012a = personalizationActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            h.p pVar = (h.p) obj;
            PersonalizationActivity personalizationActivity = this.f77012a;
            Integer num2 = (Integer) pVar.getFirst();
            boolean z = true;
            if ((num2 == null || num2.intValue() != 1) && ((num = (Integer) pVar.getSecond()) == null || num.intValue() != 1)) {
                z = false;
            }
            personalizationActivity.b(z);
        }
    }

    static final class x<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77022a;

        static {
            Covode.recordClassIndex(47603);
        }

        x(PersonalizationActivity personalizationActivity) {
            this.f77022a = personalizationActivity;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            Context applicationContext = this.f77022a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            h.f.b.l.b(applicationContext, "");
            String packageName = applicationContext.getPackageName();
            h.f.b.l.b(packageName, "");
            Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268468224);
                com.ss.android.ugc.tiktok.security.a.a.a(launchIntentForPackage, applicationContext);
                applicationContext.startActivity(launchIntentForPackage);
                Runtime.getRuntime().exit(0);
            }
            return h.z.f158842a;
        }
    }

    static final class y<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f77023a;

        static {
            Covode.recordClassIndex(47604);
        }

        y(PersonalizationActivity personalizationActivity) {
            this.f77023a = personalizationActivity;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            PersonalizationActivity personalizationActivity = this.f77023a;
            SmartRouter.buildRoute(personalizationActivity, "//main?tab=1").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME").addFlags(67108864).open();
            bo b2 = com.ss.android.ugc.aweme.account.b.b();
            IAccountService.d dVar = new IAccountService.d();
            dVar.f62401a = personalizationActivity;
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_fullscreen_dialog", true);
            bundle.putBoolean("is_skippable_dialog", false);
            dVar.f62404d = bundle;
            b2.showLoginAndRegisterView(dVar.a());
            return h.z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r9) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity.c(boolean):void");
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        h.f.b.l.d(jVar, "");
        try {
            if (TextUtils.equals("delete_guest_account_success", jVar.f91311b.getString("eventName"))) {
                String string = jVar.f91311b.getJSONObject("data").getString("reset_device");
                AgeGateServiceImpl.e().a(false);
                if (TextUtils.equals("true", string)) {
                    Context applicationContext = getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    DeviceRegisterManager.clearDidAndIid(applicationContext, UUID.randomUUID().toString());
                    if (Build.VERSION.SDK_INT >= 21) {
                        CookieManager.getInstance().removeAllCookies(null);
                    }
                    b.i.a(1000).a(new x(this));
                    return;
                }
                b.i.a(300).a(new y(this), b.i.f4826c, null);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.b
    public final void a(boolean z2) {
        if (z2) {
            if (com.ss.android.ugc.aweme.compliance.common.b.f() == 1) {
                c(false);
            }
            CommonItemView commonItemView = this.f76980a;
            if (commonItemView == null) {
                h.f.b.l.a("mAdSettingItem");
            }
            commonItemView.setAlpha(0.34f);
            CommonItemView commonItemView2 = this.f76980a;
            if (commonItemView2 == null) {
                h.f.b.l.a("mAdSettingItem");
            }
            commonItemView2.setOnClickListener(new z(this));
            return;
        }
        CommonItemView commonItemView3 = this.f76980a;
        if (commonItemView3 == null) {
            h.f.b.l.a("mAdSettingItem");
        }
        commonItemView3.setAlpha(1.0f);
        CommonItemView commonItemView4 = this.f76980a;
        if (commonItemView4 == null) {
            h.f.b.l.a("mAdSettingItem");
        }
        commonItemView4.setOnClickListener(this.f76983d);
    }

    public final void b(boolean z2) {
        Boolean bool;
        AdPersonalitySettings i2;
        Integer showInterestItemType;
        String str;
        String str2;
        String str3;
        AdPersonalitySettings i3 = com.ss.android.ugc.aweme.compliance.common.b.i();
        String str4 = null;
        if (i3 != null) {
            bool = i3.getShowInterestLabel();
        } else {
            bool = null;
        }
        if (!h.f.b.l.a((Object) bool, (Object) true) || !z2 || (i2 = com.ss.android.ugc.aweme.compliance.common.b.i()) == null || (showInterestItemType = i2.getShowInterestItemType()) == null || showInterestItemType.intValue() != 0) {
            CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.d40);
            h.f.b.l.b(commonItemView, "");
            commonItemView.setVisibility(8);
            return;
        }
        CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.d40);
        commonItemView2.setVisibility(0);
        commonItemView2.setOnClickListener(new m(this));
        PersonalizationDataText personalizationDataText = this.f76981b;
        if (personalizationDataText != null) {
            str = personalizationDataText.getInterestLabelTitle();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            PersonalizationDataText personalizationDataText2 = this.f76981b;
            if (personalizationDataText2 != null) {
                str3 = personalizationDataText2.getInterestLabelTitle();
            } else {
                str3 = null;
            }
            commonItemView2.setLeftText(str3);
        }
        PersonalizationDataText personalizationDataText3 = this.f76981b;
        if (personalizationDataText3 != null) {
            str2 = personalizationDataText3.getInterestLabelDetail();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            PersonalizationDataText personalizationDataText4 = this.f76981b;
            if (personalizationDataText4 != null) {
                str4 = personalizationDataText4.getInterestLabelDetail();
            }
            commonItemView2.setDesc(str4);
        }
    }

    static final class b<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationActivity f76990a;

        static {
            Covode.recordClassIndex(47578);
        }

        b(PersonalizationActivity personalizationActivity) {
            this.f76990a = personalizationActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            boolean z2;
            Boolean bool;
            Boolean bool2;
            boolean z3;
            Boolean bool3;
            Integer value;
            String str;
            String str2;
            String str3;
            float f2;
            Integer num = (Integer) obj;
            CommonItemView a2 = PersonalizationActivity.a(this.f76990a);
            if (num != null && num.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            a2.setChecked(z);
            PersonalizationActivity personalizationActivity = this.f76990a;
            if (num != null && num.intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            AdPersonalitySettings i2 = com.ss.android.ugc.aweme.compliance.common.b.i();
            String str4 = null;
            if (i2 != null) {
                bool = i2.getShowThirdAd();
            } else {
                bool = null;
            }
            float f3 = 1.0f;
            if (h.f.b.l.a((Object) bool, (Object) true)) {
                CommonItemView commonItemView = (CommonItemView) personalizationActivity._$_findCachedViewById(R.id.ekj);
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.34f;
                }
                commonItemView.setAlpha(f2);
                if (z2) {
                    commonItemView.setOnClickListener(new g(commonItemView, personalizationActivity));
                } else {
                    commonItemView.setOnClickListener(new h(personalizationActivity));
                }
            }
            AdPersonalitySettings i3 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i3 != null) {
                bool2 = i3.getShowPartnerAd();
            } else {
                bool2 = null;
            }
            if (h.f.b.l.a((Object) bool2, (Object) true)) {
                CommonItemView commonItemView2 = (CommonItemView) personalizationActivity._$_findCachedViewById(R.id.d1z);
                if (!z2) {
                    f3 = 0.34f;
                }
                commonItemView2.setAlpha(f3);
                if (z2) {
                    commonItemView2.setOnClickListener(new i(commonItemView2, personalizationActivity, z2));
                } else {
                    commonItemView2.setOnClickListener(new j(personalizationActivity, z2));
                }
            }
            PersonalizationActivity personalizationActivity2 = this.f76990a;
            if (num != null && num.intValue() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            personalizationActivity2.b(z3);
            PersonalizationActivity personalizationActivity3 = this.f76990a;
            AdPersonalitySettings i4 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i4 != null) {
                bool3 = i4.getShowThirdPartyMeasurement();
            } else {
                bool3 = null;
            }
            if (!h.f.b.l.a((Object) bool3, (Object) true) || (value = personalizationActivity3.a().a().getValue()) == null || value.intValue() != 1) {
                CommonItemView commonItemView3 = (CommonItemView) personalizationActivity3._$_findCachedViewById(R.id.ekk);
                h.f.b.l.b(commonItemView3, "");
                commonItemView3.setVisibility(8);
                return;
            }
            CommonItemView commonItemView4 = (CommonItemView) personalizationActivity3._$_findCachedViewById(R.id.ekk);
            commonItemView4.setVisibility(0);
            commonItemView4.setOnClickListener(new s(personalizationActivity3));
            PersonalizationDataText personalizationDataText = personalizationActivity3.f76981b;
            if (personalizationDataText != null) {
                str = personalizationDataText.getThirdPartyMeasurementTitle();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                PersonalizationDataText personalizationDataText2 = personalizationActivity3.f76981b;
                if (personalizationDataText2 != null) {
                    str3 = personalizationDataText2.getThirdPartyMeasurementTitle();
                } else {
                    str3 = null;
                }
                commonItemView4.setLeftText(str3);
            }
            PersonalizationDataText personalizationDataText3 = personalizationActivity3.f76981b;
            if (personalizationDataText3 != null) {
                str2 = personalizationDataText3.getThirdPartyMeasurementDetail();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                PersonalizationDataText personalizationDataText4 = personalizationActivity3.f76981b;
                if (personalizationDataText4 != null) {
                    str4 = personalizationDataText4.getThirdPartyMeasurementDetail();
                }
                commonItemView4.setDesc(str4);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v138, resolved type: com.bytedance.ies.dmt.ui.common.views.CommonItemView[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: com.ss.android.ugc.aweme.kids.setting.items.clearcache.DiskManagerItemView */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        PersonalizationDataText personalizationDataText;
        Boolean bool;
        AdPersonalitySettings i2;
        Integer showInterestItemType;
        Boolean bool2;
        String str;
        String str2;
        Boolean bool3;
        Boolean bool4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        PersonalizationDataText personalizationDataText2;
        PersonalizationDataText personalizationDataText3;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        PersonalizationDataText personalizationDataText4;
        PersonalizationDataText personalizationDataText5;
        String str14;
        Boolean bool5;
        Boolean bool6;
        String string;
        String string2;
        String string3;
        String string4;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onCreate", true);
        activityConfiguration(w.f77018a);
        super.onCreate(bundle);
        setContentView(R.layout.u3);
        View findViewById = findViewById(R.id.emo);
        h.f.b.l.b(findViewById, "");
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById;
        this.f76984f = tuxNavBar;
        if (tuxNavBar == null) {
            h.f.b.l.a("mTitle");
        }
        com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
        String string5 = getString(R.string.fmc);
        h.f.b.l.b(string5, "");
        tuxNavBar.a(gVar.a(string5));
        TuxNavBar tuxNavBar2 = this.f76984f;
        if (tuxNavBar2 == null) {
            h.f.b.l.a("mTitle");
        }
        tuxNavBar2.a((com.bytedance.tux.navigation.a.c) new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<h.z>) new u(this)));
        TuxNavBar tuxNavBar3 = this.f76984f;
        if (tuxNavBar3 == null) {
            h.f.b.l.a("mTitle");
        }
        tuxNavBar3.a(true);
        View findViewById2 = findViewById(R.id.d3z);
        h.f.b.l.b(findViewById2, "");
        this.f76980a = (CommonItemView) findViewById2;
        View findViewById3 = findViewById(R.id.aju);
        h.f.b.l.b(findViewById3, "");
        this.f76985g = (CommonItemView) findViewById3;
        this.f76987i = h.f.b.l.a((Object) "feed", (Object) a(getIntent(), "enterfrom"));
        AdPersonalitySettings i3 = com.ss.android.ugc.aweme.compliance.common.b.i();
        if (i3 != null) {
            personalizationDataText = i3.getPersonalizationDataText();
        } else {
            personalizationDataText = null;
        }
        this.f76981b = personalizationDataText;
        if (com.ss.android.ugc.aweme.compliance.common.b.h() == 2) {
            CommonItemView[] commonItemViewArr = {_$_findCachedViewById(R.id.d3z), _$_findCachedViewById(R.id.ekj), _$_findCachedViewById(R.id.d1z), _$_findCachedViewById(R.id.ekk)};
            int i4 = 0;
            do {
                DiskManagerItemView diskManagerItemView = commonItemViewArr[i4];
                h.f.b.l.b(diskManagerItemView, "");
                diskManagerItemView.setVisibility(8);
                i4++;
            } while (i4 < 4);
            NewPersAdSettings g2 = com.ss.android.ugc.aweme.compliance.common.b.g();
            if (g2 != null) {
                bool5 = g2.getShowMode1P();
            } else {
                bool5 = null;
            }
            boolean a2 = h.f.b.l.a((Object) bool5, (Object) true);
            if (g2 != null) {
                bool6 = g2.getShowMode3P();
            } else {
                bool6 = null;
            }
            boolean a3 = h.f.b.l.a((Object) bool6, (Object) true);
            if (a2) {
                CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.d3x);
                h.f.b.l.b(commonItemView, "");
                commonItemView.setVisibility(0);
                CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.d3x);
                if (g2 == null || (string3 = g2.getTitleMode1P()) == null || string3.length() <= 0) {
                    string3 = getString(R.string.fm9);
                    h.f.b.l.b(string3, "");
                }
                commonItemView2.setLeftText(string3);
                CommonItemView commonItemView3 = (CommonItemView) _$_findCachedViewById(R.id.d3x);
                if (g2 == null || (string4 = g2.getDescMode1P()) == null || string4.length() <= 0) {
                    string4 = getString(R.string.fm_);
                    h.f.b.l.b(string4, "");
                }
                commonItemView3.setDesc(string4);
                a().d().observe(this, new n(this));
                ((CommonItemView) _$_findCachedViewById(R.id.d3x)).setOnClickListener(new o(this));
            } else {
                CommonItemView commonItemView4 = (CommonItemView) _$_findCachedViewById(R.id.d3x);
                h.f.b.l.b(commonItemView4, "");
                commonItemView4.setVisibility(8);
            }
            if (a3) {
                CommonItemView commonItemView5 = (CommonItemView) _$_findCachedViewById(R.id.d3y);
                h.f.b.l.b(commonItemView5, "");
                commonItemView5.setVisibility(0);
                CommonItemView commonItemView6 = (CommonItemView) _$_findCachedViewById(R.id.d3y);
                if (g2 == null || (string = g2.getTitleMode3P()) == null || string.length() <= 0) {
                    string = getString(R.string.fma);
                    h.f.b.l.b(string, "");
                }
                commonItemView6.setLeftText(string);
                CommonItemView commonItemView7 = (CommonItemView) _$_findCachedViewById(R.id.d3y);
                if (g2 == null || (string2 = g2.getDescMode3P()) == null || string2.length() <= 0) {
                    string2 = getString(R.string.fmb);
                    h.f.b.l.b(string2, "");
                }
                commonItemView7.setDesc(string2);
                a().e().observe(this, new p(this));
                ((CommonItemView) _$_findCachedViewById(R.id.d3y)).setOnClickListener(new q(this));
            } else {
                CommonItemView commonItemView8 = (CommonItemView) _$_findCachedViewById(R.id.d3y);
                h.f.b.l.b(commonItemView8, "");
                commonItemView8.setVisibility(8);
            }
            if (a2 || a3) {
                ((LiveData) a().f77035a.getValue()).observe(this, new r(this));
            } else {
                CommonItemView commonItemView9 = (CommonItemView) _$_findCachedViewById(R.id.d40);
                h.f.b.l.b(commonItemView9, "");
                commonItemView9.setVisibility(8);
            }
        } else {
            AdPersonalitySettings i5 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i5 != null) {
                bool2 = i5.isShowSettings();
            } else {
                bool2 = null;
            }
            if (!h.f.b.l.a((Object) bool2, (Object) true)) {
                CommonItemView commonItemView10 = this.f76980a;
                if (commonItemView10 == null) {
                    h.f.b.l.a("mAdSettingItem");
                }
                commonItemView10.setVisibility(8);
                CommonItemView commonItemView11 = (CommonItemView) _$_findCachedViewById(R.id.d40);
                h.f.b.l.b(commonItemView11, "");
                commonItemView11.setVisibility(8);
                CommonItemView commonItemView12 = (CommonItemView) _$_findCachedViewById(R.id.ekk);
                h.f.b.l.b(commonItemView12, "");
                commonItemView12.setVisibility(8);
            } else {
                AdPersonalitySettings i6 = com.ss.android.ugc.aweme.compliance.common.b.i();
                if (i6 != null) {
                    str = i6.getDescription();
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.fo8);
                }
                AdPersonalitySettings i7 = com.ss.android.ugc.aweme.compliance.common.b.i();
                if (i7 != null) {
                    str2 = i7.getPaMainTitle();
                } else {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = getString(R.string.fo7);
                }
                CommonItemView commonItemView13 = this.f76980a;
                if (commonItemView13 == null) {
                    h.f.b.l.a("mAdSettingItem");
                }
                commonItemView13.setDesc(str);
                CommonItemView commonItemView14 = this.f76980a;
                if (commonItemView14 == null) {
                    h.f.b.l.a("mAdSettingItem");
                }
                commonItemView14.setLeftText(str2);
                a().a().observe(this, new b(this));
                CommonItemView commonItemView15 = this.f76980a;
                if (commonItemView15 == null) {
                    h.f.b.l.a("mAdSettingItem");
                }
                commonItemView15.setOnClickListener(this.f76983d);
            }
            AdPersonalitySettings i8 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i8 != null) {
                bool3 = i8.getShowThirdAd();
            } else {
                bool3 = null;
            }
            if (h.f.b.l.a((Object) bool3, (Object) true)) {
                CommonItemView commonItemView16 = (CommonItemView) _$_findCachedViewById(R.id.ekj);
                commonItemView16.setVisibility(0);
                PersonalizationDataText personalizationDataText6 = this.f76981b;
                if (personalizationDataText6 != null) {
                    str9 = personalizationDataText6.getThirdAdTitle();
                } else {
                    str9 = null;
                }
                if (!TextUtils.isEmpty(str9)) {
                    PersonalizationDataText personalizationDataText7 = this.f76981b;
                    if (personalizationDataText7 != null) {
                        str14 = personalizationDataText7.getThirdAdTitle();
                    } else {
                        str14 = null;
                    }
                    commonItemView16.setLeftText(str14);
                }
                PersonalizationDataText personalizationDataText8 = this.f76981b;
                if (personalizationDataText8 != null) {
                    str10 = personalizationDataText8.getThirdAdDetail();
                } else {
                    str10 = null;
                }
                if (TextUtils.isEmpty(str10) || (personalizationDataText5 = this.f76981b) == null || (str11 = personalizationDataText5.getThirdAdDetail()) == null) {
                    str11 = getString(R.string.fqu);
                    h.f.b.l.b(str11, "");
                }
                PersonalizationDataText personalizationDataText9 = this.f76981b;
                if (personalizationDataText9 != null) {
                    str12 = personalizationDataText9.getListThirdAd();
                } else {
                    str12 = null;
                }
                if (TextUtils.isEmpty(str12) || (personalizationDataText4 = this.f76981b) == null || (str13 = personalizationDataText4.getListThirdAd()) == null) {
                    str13 = getString(R.string.fqw);
                    h.f.b.l.b(str13, "");
                }
                TextView tvwDesc = commonItemView16.getTvwDesc();
                h.f.b.l.b(tvwDesc, "");
                tvwDesc.setText(a(str11, str13, "https://www.tiktok.com/falcon/fe_tiktok_common/third_party_detail/index.html/?advertisers_type=1&hide_loading=1&hide_nav_bar=1"));
                TextView tvwDesc2 = commonItemView16.getTvwDesc();
                h.f.b.l.b(tvwDesc2, "");
                tvwDesc2.setMovementMethod(LinkMovementMethod.getInstance());
                commonItemView16.getTvwDesc().setOnClickListener(new c(commonItemView16));
                a().b().observe(this, new d(this));
            } else {
                CommonItemView commonItemView17 = (CommonItemView) _$_findCachedViewById(R.id.ekj);
                h.f.b.l.b(commonItemView17, "");
                commonItemView17.setVisibility(8);
            }
            AdPersonalitySettings i9 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i9 != null) {
                bool4 = i9.getShowPartnerAd();
            } else {
                bool4 = null;
            }
            if (h.f.b.l.a((Object) bool4, (Object) true)) {
                CommonItemView commonItemView18 = (CommonItemView) _$_findCachedViewById(R.id.d1z);
                commonItemView18.setVisibility(0);
                PersonalizationDataText personalizationDataText10 = this.f76981b;
                if (personalizationDataText10 != null) {
                    str3 = personalizationDataText10.getPartnerAdTitle();
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    PersonalizationDataText personalizationDataText11 = this.f76981b;
                    if (personalizationDataText11 != null) {
                        str8 = personalizationDataText11.getPartnerAdTitle();
                    } else {
                        str8 = null;
                    }
                    commonItemView18.setLeftText(str8);
                }
                PersonalizationDataText personalizationDataText12 = this.f76981b;
                if (personalizationDataText12 != null) {
                    str4 = personalizationDataText12.getPartnerAdDetail();
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4) || (personalizationDataText3 = this.f76981b) == null || (str5 = personalizationDataText3.getPartnerAdDetail()) == null) {
                    str5 = getString(R.string.fqy);
                    h.f.b.l.b(str5, "");
                }
                PersonalizationDataText personalizationDataText13 = this.f76981b;
                if (personalizationDataText13 != null) {
                    str6 = personalizationDataText13.getListPartner();
                } else {
                    str6 = null;
                }
                if (TextUtils.isEmpty(str6) || (personalizationDataText2 = this.f76981b) == null || (str7 = personalizationDataText2.getListPartner()) == null) {
                    str7 = getString(R.string.fqz);
                    h.f.b.l.b(str7, "");
                }
                TextView tvwDesc3 = commonItemView18.getTvwDesc();
                h.f.b.l.b(tvwDesc3, "");
                tvwDesc3.setText(a(str5, str7, "https://www.tiktok.com/falcon/fe_tiktok_common/third_party/index.html?type=partner&hide_loading=1&hide_nav_bar=1"));
                TextView tvwDesc4 = commonItemView18.getTvwDesc();
                h.f.b.l.b(tvwDesc4, "");
                tvwDesc4.setMovementMethod(LinkMovementMethod.getInstance());
                commonItemView18.getTvwDesc().setOnClickListener(new e(commonItemView18));
                a().c().observe(this, new f(this));
            } else {
                CommonItemView commonItemView19 = (CommonItemView) _$_findCachedViewById(R.id.d1z);
                h.f.b.l.b(commonItemView19, "");
                commonItemView19.setVisibility(8);
            }
        }
        if (!GuestModeServiceImpl.d().c()) {
            CommonItemView commonItemView20 = this.f76985g;
            if (commonItemView20 == null) {
                h.f.b.l.a("mDeleteGuestDataItem");
            }
            commonItemView20.setVisibility(8);
        } else {
            CommonItemView commonItemView21 = this.f76985g;
            if (commonItemView21 == null) {
                h.f.b.l.a("mDeleteGuestDataItem");
            }
            commonItemView21.setOnClickListener(new l(this));
        }
        AdPersonalitySettings i10 = com.ss.android.ugc.aweme.compliance.common.b.i();
        if (i10 != null) {
            bool = i10.getShowInterestLabel();
        } else {
            bool = null;
        }
        if (!h.f.b.l.a((Object) bool, (Object) true) || (i2 = com.ss.android.ugc.aweme.compliance.common.b.i()) == null || (showInterestItemType = i2.getShowInterestItemType()) == null || showInterestItemType.intValue() != 1) {
            CommonItemView commonItemView22 = (CommonItemView) _$_findCachedViewById(R.id.d41);
            h.f.b.l.b(commonItemView22, "");
            commonItemView22.setVisibility(8);
        } else {
            CommonItemView commonItemView23 = (CommonItemView) _$_findCachedViewById(R.id.d41);
            commonItemView23.setVisibility(0);
            commonItemView23.setOnClickListener(new k(this));
        }
        SmartRouter.autowire(this);
        com.ss.android.ugc.aweme.common.r.a("pa_setting_page_show", new com.ss.android.ugc.aweme.app.f.d().a("setting_type", com.ss.android.ugc.aweme.compliance.common.b.h()).f66730a);
        com.ss.android.ugc.aweme.common.r.a("show_personalize_data", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a(getIntent(), "enter_from")).f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(String str, String str2) {
        SmartRouter.buildRoute(this, "//webview").withParam("url", str).withParam("title", str2).open();
    }

    private final SpannableStringBuilder a(String str, String str2, String str3) {
        String str4 = str + ' ' + str2;
        int a2 = h.m.p.a((CharSequence) str4, str2, 0, false, 6);
        if (a2 == -1) {
            return new SpannableStringBuilder(str4);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
        spannableStringBuilder.setSpan(new t(this, str3, a2, str2), a2, str2.length() + a2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(this, R.color.bx)), a2, str2.length() + a2, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), a2, str2.length() + a2, 33);
        return spannableStringBuilder;
    }
}
