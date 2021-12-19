package com.ss.android.ugc.aweme.profile.widgets;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.aq;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.survey.SurveyApi;
import com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public class BaseMyProfileGuideWidget extends ProfileWidget implements au, com.ss.android.ugc.aweme.base.ui.g, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final d p = new d((byte) 0);
    private static final boolean t = false;

    /* renamed from: g  reason: collision with root package name */
    public final String f117502g = "BaseMyProfileGuieWidget";

    /* renamed from: h  reason: collision with root package name */
    public View f117503h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.profile.survey.g f117504i;

    /* renamed from: j  reason: collision with root package name */
    final h.h f117505j = h.i.a(h.m.NONE, new i(this));

    /* renamed from: k  reason: collision with root package name */
    View f117506k;

    /* renamed from: l  reason: collision with root package name */
    public ObjectAnimator f117507l;

    /* renamed from: m  reason: collision with root package name */
    public View f117508m;
    public AnimatorSet n;
    final f.a.b.a o;
    private final h.h r = h.i.a(h.m.NONE, new m(this));
    private final WidgetLifecycleAwareLazy s;

    /* access modifiers changed from: package-private */
    public static final class ac<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f117513a = new ac();

        static {
            Covode.recordClassIndex(75925);
        }

        ac() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(75938);
        }

        public b() {
            super(1);
        }

        public final MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            h.f.b.l.c(myProfileGuideState, "");
            return myProfileGuideState;
        }
    }

    static final class x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final x f117561a = new x();

        static {
            Covode.recordClassIndex(75973);
        }

        x() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class y<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final y f117562a = new y();

        static {
            Covode.recordClassIndex(75974);
        }

        y() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private final ViewStub s() {
        return (ViewStub) this.r.getValue();
    }

    /* access modifiers changed from: protected */
    public void a(NoticeView noticeView) {
    }

    /* access modifiers changed from: protected */
    public h.u<Boolean, Boolean, h.f.a.a<h.z>>[] a(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
        h.f.b.l.d(profileState, "");
        h.f.b.l.d(myProfileGuideState, "");
        return new h.u[0];
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(285, new org.greenrobot.eventbus.g(BaseMyProfileGuideWidget.class, "onProfilePageScrolledEvent", com.ss.android.ugc.aweme.profile.widgets.a.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(286, new org.greenrobot.eventbus.g(BaseMyProfileGuideWidget.class, "onI18nRecommendUserDialogDissmissEvent", com.ss.android.ugc.aweme.profile.b.c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final MyProfileGuideViewModel n() {
        return (MyProfileGuideViewModel) this.s.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class d {
        static {
            Covode.recordClassIndex(75940);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    public static final class ab implements NoticeView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoticeView f117512a;

        static {
            Covode.recordClassIndex(75924);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void b() {
            this.f117512a.setVisibility(8);
        }

        ab(NoticeView noticeView) {
            this.f117512a = noticeView;
        }
    }

    public static final class k implements com.ss.android.ugc.aweme.profile.survey.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.profile.survey.g f117545b;

        static {
            Covode.recordClassIndex(75949);
        }

        @Override // com.ss.android.ugc.aweme.profile.survey.c
        public final void a() {
            this.f117545b.b();
        }

        @Override // com.ss.android.ugc.aweme.profile.survey.c
        public final void a(com.ss.android.ugc.aweme.cu.a aVar) {
            String str;
            h.f.b.l.d(aVar, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("pop_survey_id", String.valueOf(aVar.f79085a));
            if (!TextUtils.isEmpty(aVar.f79092h)) {
                str = aVar.f79092h;
            } else {
                str = aVar.f79087c;
            }
            com.ss.android.ugc.aweme.common.r.a("pop_survey_show", a2.a("pop_survey_question", str).a("original_id", aVar.f79093i).f66730a);
        }

        k(BaseMyProfileGuideWidget baseMyProfileGuideWidget, com.ss.android.ugc.aweme.profile.survey.g gVar) {
            this.f117544a = baseMyProfileGuideWidget;
            this.f117545b = gVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.survey.c
        public final void a(com.ss.android.ugc.aweme.cu.a aVar, int i2, String str) {
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(str, "");
            if (i2 == 1) {
                this.f117545b.c();
            } else if (i2 == 2) {
                this.f117545b.c();
            } else if (i2 == 3) {
                this.f117545b.b();
            }
            com.ss.android.ugc.aweme.profile.survey.d.a();
            com.ss.android.ugc.aweme.profile.survey.d.a(new com.ss.android.ugc.aweme.profile.survey.b(i2, aVar.f79085a, aVar.f79093i));
            com.ss.android.ugc.aweme.utils.ai.a(new l(i2, aVar, str), this.f117544a.f117502g);
        }
    }

    public static final class ak implements NoticeView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117529a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117530b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NoticeView f117531c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f117532d;

        static {
            Covode.recordClassIndex(75933);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void b() {
            p.a();
            this.f117531c.setVisibility(8);
            com.ss.android.ugc.aweme.profile.ui.v2.y.c("close");
        }

        ak(BaseMyProfileGuideWidget baseMyProfileGuideWidget, String str, NoticeView noticeView, String str2) {
            this.f117529a = baseMyProfileGuideWidget;
            this.f117530b = str;
            this.f117531c = noticeView;
            this.f117532d = str2;
        }
    }

    public static final class am implements NoticeView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeView f117535b;

        static {
            Covode.recordClassIndex(75935);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void b() {
            this.f117535b.setVisibility(8);
            BaseMyProfileGuideWidget.a(false);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void a() {
            this.f117535b.setVisibility(8);
            SmartRouter.buildRoute(com.bytedance.jedi.ext.adapter.b.b(this.f117534a), "aweme://privacy/setting").open();
            SharePrefCache inst = SharePrefCache.inst();
            h.f.b.l.b(inst, "");
            com.ss.android.ugc.aweme.app.aj<Boolean> shouldShowPrivateAccountTipInProfile = inst.getShouldShowPrivateAccountTipInProfile();
            h.f.b.l.b(shouldShowPrivateAccountTipInProfile, "");
            shouldShowPrivateAccountTipInProfile.b(false);
            com.ss.android.ugc.aweme.common.r.a("privacy_floating_bar_click", new com.ss.android.ugc.aweme.app.f.d().f66730a);
            BaseMyProfileGuideWidget.a(false);
        }

        am(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeView noticeView) {
            this.f117534a = baseMyProfileGuideWidget;
            this.f117535b = noticeView;
        }
    }

    public static final class z implements NoticeView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeView f117564b;

        static {
            Covode.recordClassIndex(75975);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void b() {
            com.ss.android.ugc.aweme.profile.service.h.f116622a.logShowProfileDiskManagerGuideView();
            this.f117564b.setVisibility(8);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void a() {
            com.ss.android.ugc.aweme.profile.service.h.f116622a.logShowProfileDiskManagerGuideView();
            com.ss.android.ugc.aweme.profile.service.h.f116622a.startDiskManagerActivity(com.bytedance.jedi.ext.adapter.b.b(this.f117563a));
            this.f117564b.setVisibility(8);
        }

        z(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeView noticeView) {
            this.f117563a = baseMyProfileGuideWidget;
            this.f117564b = noticeView;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final e f117538a = new e();

        static {
            Covode.recordClassIndex(75941);
        }

        e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Keva repo = Keva.getRepo("keva_repo_profile_component");
            int i2 = repo.getInt("show_yt_removed_toast", -1);
            if (i2 == 1) {
                repo.storeInt("show_yt_removed_toast", 0);
            }
            return Integer.valueOf(i2);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<ViewStub> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(0);
            this.this$0 = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewStub invoke() {
            View view = this.this$0.f46127e;
            if (view == null) {
                h.f.b.l.b();
            }
            return view.findViewById(R.id.cs5);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<ViewStub> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(0);
            this.this$0 = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewStub invoke() {
            View view = this.this$0.f46127e;
            if (view == null) {
                h.f.b.l.b();
            }
            return view.findViewById(R.id.cvz);
        }
    }

    static {
        Covode.recordClassIndex(75921);
    }

    /* access modifiers changed from: protected */
    public final NoticeView k() {
        View view = this.f46127e;
        if (view == null) {
            h.f.b.l.b();
        }
        return (NoticeView) view.findViewById(R.id.fj1);
    }

    /* access modifiers changed from: protected */
    public final NoticeButtonView l() {
        View view = this.f46127e;
        if (view == null) {
            h.f.b.l.b();
        }
        return (NoticeButtonView) view.findViewById(R.id.fji);
    }

    /* access modifiers changed from: protected */
    public final NoticeButtonView m() {
        View view = this.f46127e;
        if (view == null) {
            h.f.b.l.b();
        }
        return (NoticeButtonView) view.findViewById(R.id.fi9);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ Widget $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(75922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, h.k.c cVar) {
            super(0);
            this.$this_viewModel = widget;
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return this.$this_viewModel.getClass().getName() + '_' + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class ag implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f117520b;

        static {
            Covode.recordClassIndex(75929);
        }

        ag(BaseMyProfileGuideWidget baseMyProfileGuideWidget, View view) {
            this.f117519a = baseMyProfileGuideWidget;
            this.f117520b = view;
        }

        public final void run() {
            ObjectAnimator duration;
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = this.f117519a;
            View view = this.f117520b;
            h.f.b.l.b(c.b.f66221a, "");
            baseMyProfileGuideWidget.f117507l = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -((float) com.ss.android.ugc.aweme.adaptation.c.a()));
            ObjectAnimator objectAnimator = this.f117519a.f117507l;
            if (objectAnimator != null && (duration = objectAnimator.setDuration(200L)) != null) {
                duration.start();
            }
        }
    }

    public static final class ah implements NoticeButtonView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeButtonView f117522b;

        static {
            Covode.recordClassIndex(75930);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void b() {
            this.f117522b.setVisibility(8);
            com.ss.android.ugc.aweme.profile.c.a().b(true);
            com.ss.android.ugc.aweme.common.r.a("banner_click", new com.ss.android.ugc.aweme.app.f.d().a("banner_type", "coupon_fission").a("banner_name", "tiktok_rewards").a("enter_from", "personal_homepage").a("click_position", "cross").f66730a);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void c() {
            new StringBuilder("onTextClick").append(this.f117522b.getTitleTextView().getText()).append("  ").append(this.f117522b.getContextTextView().getText());
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void a() {
            UgProfileActivityButton profileActivityButton;
            this.f117522b.setVisibility(8);
            com.ss.android.ugc.aweme.profile.c.a().b(true);
            com.ss.android.ugc.aweme.common.r.a("banner_click", new com.ss.android.ugc.aweme.app.f.d().a("banner_type", "coupon_fission").a("banner_name", "tiktok_rewards").a("enter_from", "personal_homepage").a("click_position", "join").f66730a);
            SmartRoute buildRoute = SmartRouter.buildRoute(com.bytedance.jedi.ext.adapter.b.b(this.f117521a), "//webview");
            String str = null;
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                h.f.b.l.b(iESSettingsProxy, "");
                UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                if (!(awemeActivitySetting == null || (profileActivityButton = awemeActivitySetting.getProfileActivityButton()) == null)) {
                    str = profileActivityButton.getH5Link();
                }
            } catch (com.bytedance.ies.a unused) {
            }
            buildRoute.withParam("url", str).withParam("hide_nav_bar", true).addFlags(268435456).open();
        }

        ah(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeButtonView noticeButtonView) {
            this.f117521a = baseMyProfileGuideWidget;
            this.f117522b = noticeButtonView;
        }
    }

    public static final class w implements NoticeButtonView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeButtonView f117558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.b f117559c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ User f117560d;

        static {
            Covode.recordClassIndex(75972);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void b() {
            this.f117558b.setVisibility(8);
            com.ss.android.ugc.aweme.common.r.a("ttelite_BA_acq_profile_msg_x_click", new com.ss.android.ugc.aweme.app.f.d().a("message_id", this.f117559c.getMessageId()).a("user_id", this.f117560d.getUid()).f66730a);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void c() {
            this.f117558b.setVisibility(8);
            SmartRouter.buildRoute(com.bytedance.jedi.ext.adapter.b.b(this.f117557a), this.f117559c.getLandingPageSchema()).addFlags(268435456).open();
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void a() {
            this.f117558b.setVisibility(8);
            com.ss.android.ugc.aweme.common.r.a("ttelite_BA_acq_profile_msg_cta_click", new com.ss.android.ugc.aweme.app.f.d().a("message_id", this.f117559c.getMessageId()).a("user_id", this.f117560d.getUid()).a("cta_url", this.f117559c.getLandingPageSchema()).f66730a);
            SmartRouter.buildRoute(com.bytedance.jedi.ext.adapter.b.b(this.f117557a), this.f117559c.getLandingPageSchema()).addFlags(268435456).open();
        }

        w(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeButtonView noticeButtonView, com.ss.android.ugc.aweme.commerce.b bVar, User user) {
            this.f117557a = baseMyProfileGuideWidget;
            this.f117558b = noticeButtonView;
            this.f117559c = bVar;
            this.f117560d = user;
        }
    }

    private final void u() {
        MethodCollector.i(10013);
        if (this.f117503h != null) {
            MethodCollector.o(10013);
            return;
        }
        View inflate = s().inflate();
        this.f117503h = inflate;
        if (inflate != null) {
            inflate.setVisibility(0);
            MethodCollector.o(10013);
            return;
        }
        MethodCollector.o(10013);
    }

    @Override // com.bytedance.widget.Widget
    public void i() {
        super.i();
        com.ss.android.ugc.aweme.profile.survey.d.a().f116642b = null;
        EventBus.a().b(this);
        Activity q2 = q();
        Objects.requireNonNull(q2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        TabChangeManager.a.a((androidx.fragment.app.e) q2).b(this);
        this.o.dispose();
    }

    public static final class ae implements NoticeView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeView f117516b;

        static {
            Covode.recordClassIndex(75927);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void a() {
            this.f117516b.setVisibility(8);
            SmartRouter.buildRoute(com.bytedance.jedi.ext.adapter.b.b(this.f117515a), "//webview").withParam("url", "https://www.tiktok.com/aweme/inapp/v2/c_feedback").withParam("hide_nav_bar", true).open();
            com.ss.android.ugc.aweme.app.s sVar = s.a.f66880a;
            h.f.b.l.b(sVar, "");
            com.ss.android.ugc.aweme.app.aj<Long> s = sVar.s();
            h.f.b.l.b(s, "");
            s.b(Long.valueOf(System.currentTimeMillis()));
            com.ss.android.ugc.aweme.app.s sVar2 = s.a.f66880a;
            h.f.b.l.b(sVar2, "");
            com.ss.android.ugc.aweme.app.aj<Long> t = sVar2.t();
            h.f.b.l.b(t, "");
            Long c2 = t.c();
            if (c2 != null && c2.longValue() == 0) {
                com.ss.android.ugc.aweme.app.s sVar3 = s.a.f66880a;
                h.f.b.l.b(sVar3, "");
                com.ss.android.ugc.aweme.app.aj<Long> t2 = sVar3.t();
                h.f.b.l.b(t2, "");
                t2.b(Long.valueOf(System.currentTimeMillis()));
            }
            BaseMyProfileGuideWidget.a(false);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
        public final void b() {
            this.f117516b.setVisibility(8);
            com.ss.android.ugc.aweme.app.s sVar = s.a.f66880a;
            h.f.b.l.b(sVar, "");
            com.ss.android.ugc.aweme.app.aj<Long> s = sVar.s();
            h.f.b.l.b(s, "");
            s.b(Long.valueOf(System.currentTimeMillis()));
            com.ss.android.ugc.aweme.app.s sVar2 = s.a.f66880a;
            h.f.b.l.b(sVar2, "");
            com.ss.android.ugc.aweme.app.aj<Long> t = sVar2.t();
            h.f.b.l.b(t, "");
            Long c2 = t.c();
            if (c2 != null && c2.longValue() == 0) {
                com.ss.android.ugc.aweme.app.s sVar3 = s.a.f66880a;
                h.f.b.l.b(sVar3, "");
                com.ss.android.ugc.aweme.app.aj<Long> t2 = sVar3.t();
                h.f.b.l.b(t2, "");
                t2.b(Long.valueOf(System.currentTimeMillis()));
            }
            BaseMyProfileGuideWidget.a(false);
        }

        ae(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeView noticeView) {
            this.f117515a = baseMyProfileGuideWidget;
            this.f117516b = noticeView;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ai implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f117524b;

        static {
            Covode.recordClassIndex(75931);
        }

        ai(BaseMyProfileGuideWidget baseMyProfileGuideWidget, View view) {
            this.f117523a = baseMyProfileGuideWidget;
            this.f117524b = view;
        }

        public final void run() {
            this.f117523a.n = new AnimatorSet();
            View view = this.f117523a.f117508m;
            if (view == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(c.b.f66221a, "");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) com.ss.android.ugc.aweme.adaptation.c.a(), 0.0f);
            View view2 = this.f117523a.f117508m;
            if (view2 == null) {
                h.f.b.l.b();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet = this.f117523a.n;
            if (animatorSet != null) {
                animatorSet.playTogether(ofFloat2, ofFloat);
            }
            AnimatorSet animatorSet2 = this.f117523a.n;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(200L);
            }
            AnimatorSet animatorSet3 = this.f117523a.n;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            this.f117524b.setVisibility(0);
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<MyProfileGuideViewModel> {
        final /* synthetic */ h.f.a.b $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Widget $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(75939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Widget widget, h.f.a.a aVar, h.k.c cVar, h.f.a.b bVar) {
            super(0);
            this.$this_viewModel = widget;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.widget.Widget r0 = r3.$this_viewModel
                com.bytedance.widget.b r0 = r0.j()
                java.lang.Object r1 = r0.b()
                boolean r0 = r1 instanceof androidx.fragment.app.Fragment
                if (r0 == 0) goto L_0x0048
                androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                com.bytedance.widget.Widget r0 = r3.$this_viewModel
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
            L_0x001c:
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_profile_widgets_BaseMyProfileGuideWidget$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel> r0 = com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0042
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0042:
                h.f.a.b r0 = r3.$argumentsAcceptor
                r2.a_(r0)
                return r2
            L_0x0048:
                boolean r0 = r1 instanceof androidx.fragment.app.e
                if (r0 == 0) goto L_0x005b
                androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                com.bytedance.widget.Widget r0 = r3.$this_viewModel
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                goto L_0x001c
            L_0x005b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_profile_widgets_BaseMyProfileGuideWidget$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    private final void t() {
        MethodCollector.i(9843);
        Activity q2 = q();
        u();
        View view = this.f117503h;
        if (view == null) {
            MethodCollector.o(9843);
            return;
        }
        view.setLayerType(2, null);
        Animation loadAnimation = AnimationUtils.loadAnimation(q2, R.anim.d6);
        h.f.b.l.b(loadAnimation, "");
        loadAnimation.setRepeatMode(2);
        loadAnimation.setRepeatCount(-1);
        loadAnimation.setAnimationListener(new ao(this));
        View view2 = this.f117503h;
        if (view2 != null) {
            view2.startAnimation(loadAnimation);
            MethodCollector.o(9843);
            return;
        }
        MethodCollector.o(9843);
    }

    @Override // com.bytedance.widget.Widget
    public final void g() {
        Animation animation;
        Animation animation2;
        super.g();
        View view = this.f117503h;
        if (!(view == null || (animation2 = view.getAnimation()) == null)) {
            animation2.cancel();
            animation2.reset();
        }
        int i2 = Build.VERSION.SDK_INT;
        ObjectAnimator objectAnimator = this.f117507l;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.pause();
        }
        View view2 = this.f117508m;
        if (!(view2 == null || (animation = view2.getAnimation()) == null)) {
            animation.cancel();
            animation.reset();
        }
        int i3 = Build.VERSION.SDK_INT;
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
    }

    public final void o() {
        NoticeButtonView l2;
        NoticeButtonView l3;
        com.ss.android.ugc.aweme.profile.c a2 = com.ss.android.ugc.aweme.profile.c.a();
        h.f.b.l.b(a2, "");
        a2.c();
        NoticeButtonView l4 = l();
        if (l4 != null && l4.getVisibility() == 0) {
            com.ss.android.ugc.aweme.profile.c a3 = com.ss.android.ugc.aweme.profile.c.a();
            h.f.b.l.b(a3, "");
            if (a3.e() && (l3 = l()) != null) {
                l3.setVisibility(8);
            }
            com.ss.android.ugc.aweme.profile.c.a().d();
            com.ss.android.ugc.aweme.profile.c a4 = com.ss.android.ugc.aweme.profile.c.a();
            h.f.b.l.b(a4, "");
            a4.c();
            com.ss.android.ugc.aweme.profile.c a5 = com.ss.android.ugc.aweme.profile.c.a();
            h.f.b.l.b(a5, "");
            if (a5.e() && (l2 = l()) != null) {
                l2.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void p() {
        int i2;
        com.ss.android.ugc.aweme.profile.survey.g gVar = this.f117504i;
        if (gVar != null && gVar.n) {
            com.ss.android.ugc.aweme.profile.survey.g gVar2 = this.f117504i;
            if (gVar2 == null) {
                h.f.b.l.b();
            }
            gVar2.b();
            com.ss.android.ugc.aweme.profile.survey.d.a();
            com.ss.android.ugc.aweme.profile.survey.g gVar3 = this.f117504i;
            if (gVar3 == null) {
                h.f.b.l.b();
            }
            int i3 = 0;
            if (gVar3.f116656l != null) {
                i2 = gVar3.f116656l.f79085a;
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.profile.survey.g gVar4 = this.f117504i;
            if (gVar4 == null) {
                h.f.b.l.b();
            }
            if (gVar4.f116656l != null) {
                i3 = gVar4.f116656l.f79093i;
            }
            com.ss.android.ugc.aweme.profile.survey.d.a(new com.ss.android.ugc.aweme.profile.survey.b(3, i2, i3));
        }
    }

    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f117546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.cu.a f117547b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f117548c;

        static {
            Covode.recordClassIndex(75950);
        }

        l(int i2, com.ss.android.ugc.aweme.cu.a aVar, String str) {
            this.f117546a = i2;
            this.f117547b = aVar;
            this.f117548c = str;
        }

        public final void run() {
            String str;
            String str2;
            int i2 = this.f117546a;
            if (i2 == 3) {
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("pop_survey_id", String.valueOf(this.f117547b.f79085a));
                if (!TextUtils.isEmpty(this.f117547b.f79092h)) {
                    str2 = this.f117547b.f79092h;
                } else {
                    str2 = this.f117547b.f79087c;
                }
                com.ss.android.ugc.aweme.common.r.a("pop_survey_close", a2.a("pop_survey_question", str2).a("original_id", this.f117547b.f79093i).f66730a);
            } else if (i2 == 1 || i2 == 2) {
                com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("pop_survey_id", String.valueOf(this.f117547b.f79085a));
                if (!TextUtils.isEmpty(this.f117547b.f79092h)) {
                    str = this.f117547b.f79092h;
                } else {
                    str = this.f117547b.f79087c;
                }
                com.ss.android.ugc.aweme.common.r.a("pop_survey_answer", a3.a("pop_survey_question", str).a("original_id", this.f117547b.f79093i).a("pop_survey_answer", this.f117548c).f66730a);
            }
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void f() {
        View view;
        Animation animation;
        View view2;
        super.f();
        View view3 = this.f117503h;
        Object obj = null;
        if (view3 != null && view3.getVisibility() == 0) {
            t();
        }
        int i2 = Build.VERSION.SDK_INT;
        ObjectAnimator objectAnimator = this.f117507l;
        if (objectAnimator != null && (view2 = this.f117506k) != null && view2.getVisibility() == 0 && objectAnimator.isPaused()) {
            objectAnimator.resume();
        }
        View view4 = this.f117508m;
        if (!(view4 == null || view4.getVisibility() != 0 || (animation = view4.getAnimation()) == null)) {
            animation.start();
        }
        int i3 = Build.VERSION.SDK_INT;
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null && (view = this.f117508m) != null && view.getVisibility() == 0 && animatorSet.isPaused()) {
            animatorSet.resume();
        }
        o();
        NoticeView k2 = k();
        if (k2 != null && k2.getVisibility() == 0) {
            NoticeView k3 = k();
            if (k3 != null) {
                obj = k3.getTag();
            }
            if (h.f.b.l.a(obj, (Object) "tag_guide_private_account")) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                User curUser = g2.getCurUser();
                h.f.b.l.b(curUser, "");
                if (curUser.isSecret() || curUser.getAccountType() == 3) {
                    NoticeView k4 = k();
                    if (k4 != null) {
                        k4.setVisibility(8);
                    }
                    NoticeView k5 = k();
                    if (k5 != null) {
                        k5.setTag("");
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget
    public void c() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super.c();
        EventBus.a(EventBus.a(), this);
        Activity q2 = q();
        Objects.requireNonNull(q2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        TabChangeManager.a.a((androidx.fragment.app.e) q2).a(this);
        f.a.b.b unused = selectSubscribe(r(), a.f117568a, e.f117737a, f.f117753a, g.f117826a, new com.bytedance.jedi.arch.ah(), new r(this));
        f.a.b.b unused2 = selectSubscribe(r(), h.f117875a, new com.bytedance.jedi.arch.ah(), new s(this));
        f.a.b.b unused3 = selectSubscribe(r(), i.f117889a, new com.bytedance.jedi.arch.ah(), new t(this));
        f.a.b.b unused4 = selectSubscribe(r(), b.f117649a, new com.bytedance.jedi.arch.ah(), new n(this));
        f.a.b.b unused5 = selectSubscribe(r(), c.f117679a, new com.bytedance.jedi.arch.ah(), new o(this));
        f.a.b.b unused6 = selectSubscribe(r(), d.f117717a, new com.bytedance.jedi.arch.ah(), new p(this));
        f.a.b.b unused7 = subscribe(n(), new com.bytedance.jedi.arch.ah(), new q(this));
        if (com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            n().g(g.f117540a);
        } else {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (g2.isChildrenMode()) {
                n().g(h.f117541a);
            } else {
                com.ss.android.ugc.aweme.profile.survey.d.a().f116642b = new q(n());
                com.ss.android.ugc.aweme.profile.survey.d a2 = com.ss.android.ugc.aweme.profile.survey.d.a();
                b.i<com.ss.android.ugc.aweme.cu.a> a3 = SurveyApi.a();
                if (a3 != null) {
                    a3.a(new com.ss.android.ugc.aweme.profile.survey.e(a2));
                }
            }
        }
        com.ss.android.ugc.aweme.profile.service.h.f116622a.needShowDiskManagerGuideView().b(new j(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        b.i.b(e.f117538a, b.i.f4824a).a(new f(this), b.i.f4826c, null);
        MyProfileGuideViewModel n2 = n();
        h.f.b.l.d(n2, "");
        com.ss.android.ugc.aweme.profile.ac.f115952b = new WeakReference<>(n2);
        NoticeView k2 = k();
        if (k2 != null) {
            layoutParams = k2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams2 != null) {
            h.f.b.l.b(c.b.f66221a, "");
            marginLayoutParams2.bottomMargin = com.ss.android.ugc.aweme.adaptation.c.a();
        }
        NoticeButtonView l2 = l();
        if (l2 != null) {
            layoutParams2 = l2.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
        if (marginLayoutParams3 != null) {
            h.f.b.l.b(c.b.f66221a, "");
            marginLayoutParams3.bottomMargin = com.ss.android.ugc.aweme.adaptation.c.a();
        }
        NoticeView k3 = k();
        if (k3 != null) {
            k3.setNoticeBackgroundColor(androidx.core.content.b.c(q(), R.color.c9));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, MyProfileGuideState, h.z> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.this$0 = baseMyProfileGuideWidget;
        }

        static final /* synthetic */ class b extends h.f.b.j implements h.f.a.b<ProfileState, ProfileState> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f117551a = new b();

            static {
                Covode.recordClassIndex(75960);
            }

            b() {
                super(1, com.ss.android.ugc.aweme.profile.d.class, "identity", "identity(Ljava/lang/Object;)Ljava/lang/Object;", 1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
                ProfileState profileState2 = profileState;
                h.f.b.l.d(profileState2, "");
                return profileState2;
            }
        }

        static final class a extends h.f.b.m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f117550a = new a();

            static {
                Covode.recordClassIndex(75959);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                h.f.b.l.d(myProfileGuideState2, "");
                return MyProfileGuideState.copy$default(myProfileGuideState2, true, false, false, false, null, null, null, false, false, false, null, null, null, null, 16382, null);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, MyProfileGuideState myProfileGuideState) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(myProfileGuideState2, "");
            if (!((MyProfileGuideState) iVar2.withState(this.this$0.n(), AnonymousClass1.f117549a)).getHasGuideShowed()) {
                myProfileGuideState2.getCurrentDownloadSetting();
                myProfileGuideState2.getPostListHasLoaded();
                myProfileGuideState2.getAvatarHasLoaded();
                myProfileGuideState2.getHasSurveyDetermined();
                myProfileGuideState2.getNeedShowDiskManagerGuide();
                h.u<Boolean, Boolean, h.f.a.a<h.z>>[] a2 = this.this$0.a((ProfileState) iVar2.withState(this.this$0.r(), b.f117551a), myProfileGuideState2);
                int length = a2.length;
                int i2 = 0;
                boolean z = true;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    h.u<Boolean, Boolean, h.f.a.a<h.z>> uVar = a2[i2];
                    if (z) {
                        if (uVar.getFirst().booleanValue() && uVar.getSecond().booleanValue()) {
                            h.f.a.a<h.z> third = uVar.getThird();
                            if (third != null) {
                                this.this$0.n().g(a.f117550a);
                                third.invoke();
                            }
                        } else if (uVar.getFirst().booleanValue()) {
                            z = true;
                            i2++;
                        }
                    }
                    z = false;
                    i2++;
                }
            }
            return h.z.f158842a;
        }
    }

    static final /* synthetic */ class an extends h.f.b.j implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a  reason: collision with root package name */
        public static final an f117536a = new an();

        static {
            Covode.recordClassIndex(75936);
        }

        an() {
            super(1, com.ss.android.ugc.aweme.profile.d.class, "identity", "identity(Ljava/lang/Object;)Ljava/lang/Object;", 1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            h.f.b.l.d(myProfileGuideState2, "");
            return myProfileGuideState2;
        }
    }

    public static final class ao implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117537a;

        static {
            Covode.recordClassIndex(75937);
        }

        public final void onAnimationRepeat(Animation animation) {
            h.f.b.l.d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            h.f.b.l.d(animation, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ao(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            this.f117537a = baseMyProfileGuideWidget;
        }

        public final void onAnimationEnd(Animation animation) {
            h.f.b.l.d(animation, "");
            View view = this.f117537a.f117503h;
            if (view != null) {
                view.setLayerType(0, null);
            }
        }
    }

    public static final class j implements f.a.z<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117542a;

        static {
            Covode.recordClassIndex(75946);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            this.f117542a = baseMyProfileGuideWidget;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
            this.f117542a.n().g(a.f117543a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(Boolean bool) {
            this.f117542a.n().g(new b(bool.booleanValue()));
        }

        static final class a extends h.f.b.m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f117543a = new a();

            static {
                Covode.recordClassIndex(75947);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                h.f.b.l.d(myProfileGuideState2, "");
                return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, false, null, false, false, false, null, null, null, null, 16351, null);
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {
            final /* synthetic */ boolean $showGuide;

            static {
                Covode.recordClassIndex(75948);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(boolean z) {
                super(1);
                this.$showGuide = z;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                h.f.b.l.d(myProfileGuideState2, "");
                return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, Boolean.valueOf(this.$showGuide), null, false, false, false, null, null, null, null, 16351, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        this.f117508m = view;
        if (view != null) {
            view.post(new ai(this, view));
        }
    }

    @org.greenrobot.eventbus.r
    public final void onI18nRecommendUserDialogDissmissEvent(com.ss.android.ugc.aweme.profile.b.c cVar) {
        h.f.b.l.d(cVar, "");
        n().g(u.f117553a);
    }

    public static final class aa extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeView f117510b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MyProfileGuideState f117511c;

        static {
            Covode.recordClassIndex(75923);
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(com.bytedance.jedi.ext.adapter.b.b(this.f117509a), R.color.bh));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            this.f117510b.setVisibility(8);
            com.ss.android.ugc.aweme.profile.service.h hVar = com.ss.android.ugc.aweme.profile.service.h.f116622a;
            androidx.fragment.app.e b2 = com.bytedance.jedi.ext.adapter.b.b(this.f117509a);
            Integer currentDownloadSetting = this.f117511c.getCurrentDownloadSetting();
            if (currentDownloadSetting == null) {
                h.f.b.l.b();
            }
            hVar.startDownloadControlSettingActivity(b2, currentDownloadSetting.intValue());
        }

        aa(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeView noticeView, MyProfileGuideState myProfileGuideState) {
            this.f117509a = baseMyProfileGuideWidget;
            this.f117510b = noticeView;
            this.f117511c = myProfileGuideState;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ad<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final ad f117514a = new ad();

        static {
            Covode.recordClassIndex(75926);
        }

        ad() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (!(th instanceof Exception)) {
                th = null;
            }
            Exception exc = (Exception) th;
            if (exc != null) {
                com.ss.android.ugc.aweme.framework.a.a.a("", exc);
            }
        }
    }

    public static final class aj extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117526b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NoticeView f117527c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f117528d;

        static {
            Covode.recordClassIndex(75932);
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(com.bytedance.jedi.ext.adapter.b.b(this.f117525a), R.color.bh));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            p.a();
            this.f117527c.setVisibility(8);
            SmartRouter.buildRoute(com.bytedance.jedi.ext.adapter.b.b(this.f117525a), "//privacy/setting").withParam("highlight_private_account_item", true).open();
            com.ss.android.ugc.aweme.profile.ui.v2.y.c("enter");
        }

        aj(BaseMyProfileGuideWidget baseMyProfileGuideWidget, String str, NoticeView noticeView, String str2) {
            this.f117525a = baseMyProfileGuideWidget;
            this.f117526b = str;
            this.f117527c = noticeView;
            this.f117528d = str2;
        }
    }

    static final class al extends h.f.b.m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a  reason: collision with root package name */
        public static final al f117533a = new al();

        static {
            Covode.recordClassIndex(75934);
        }

        al() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            h.f.b.l.d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, true, false, null, null, null, null, 16127, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f117540a = new g();

        static {
            Covode.recordClassIndex(75943);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            h.f.b.l.d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, true, null, null, null, false, false, false, null, null, null, null, 16359, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f117541a = new h();

        static {
            Covode.recordClassIndex(75944);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            h.f.b.l.d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, true, null, null, null, false, false, false, null, null, null, null, 16359, null);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f117553a = new u();

        static {
            Covode.recordClassIndex(75970);
        }

        u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            h.f.b.l.d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, null, null, null, null, 15871, null);
        }
    }

    protected static boolean d(ProfileState profileState) {
        h.f.b.l.d(profileState, "");
        if (!h.f.b.l.a((Object) profileState.isPostGuideShow(), (Object) false) || !e(profileState)) {
            return false;
        }
        return true;
    }

    protected static boolean f(ProfileState profileState) {
        h.f.b.l.d(profileState, "");
        if (!h.f.b.l.a((Object) profileState.getFrom(), (Object) "from_main") || !com.ss.android.ugc.aweme.compliance.api.a.c().a()) {
            return false;
        }
        return true;
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onProfilePageScrolledEvent(com.ss.android.ugc.aweme.profile.widgets.a.b bVar) {
        h.f.b.l.d(bVar, "");
        NoticeButtonView m2 = m();
        if (m2 != null) {
            m2.setVisibility(8);
        }
    }

    static final class af implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117517a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f117518b;

        static {
            Covode.recordClassIndex(75928);
        }

        af(BaseMyProfileGuideWidget baseMyProfileGuideWidget, View view) {
            this.f117517a = baseMyProfileGuideWidget;
            this.f117518b = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                View view2 = this.f117518b;
                h.f.b.l.b(view2, "");
                view2.setVisibility(8);
                com.ss.android.ugc.aweme.compliance.api.a.c().a((Context) com.bytedance.jedi.ext.adapter.b.b(this.f117517a));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117539a;

        static {
            Covode.recordClassIndex(75942);
        }

        f(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            this.f117539a = baseMyProfileGuideWidget;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (com.ss.android.ugc.aweme.utils.ai.a(iVar)) {
                h.f.b.l.b(iVar, "");
                Integer num = (Integer) iVar.d();
                if (num != null && num.intValue() == 1) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.jedi.ext.adapter.b.b(this.f117539a)).a(R.string.eyi).a();
                }
            }
            return h.z.f158842a;
        }
    }

    static final class v implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMyProfileGuideWidget f117554a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeButtonView f117555b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.b f117556c;

        static {
            Covode.recordClassIndex(75971);
        }

        v(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeButtonView noticeButtonView, com.ss.android.ugc.aweme.commerce.b bVar) {
            this.f117554a = baseMyProfileGuideWidget;
            this.f117555b = noticeButtonView;
            this.f117556c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117555b.setVisibility(8);
            SmartRouter.buildRoute(com.bytedance.jedi.ext.adapter.b.b(this.f117554a), this.f117556c.getLandingPageSchema()).addFlags(268435456).open();
        }
    }

    public static void a(boolean z2) {
        Keva repo = Keva.getRepo("account_security_keva_name");
        h.f.b.l.d("prior_to_safe_info", "");
        StringBuilder append = new StringBuilder().append("prior_to_safe_info").append('_');
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        repo.storeBoolean(append.append(g2.getCurUserId()).toString(), z2);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.aj(z2));
    }

    private static boolean b(int i2) {
        boolean z2;
        boolean z3;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        User curUser = g2.getCurUser();
        if (i2 < 1000) {
            z2 = true;
        } else {
            z2 = false;
        }
        h.f.b.l.b(curUser, "");
        if (curUser.getAccountType() == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || curUser.isSecret() || z3) {
            return false;
        }
        return true;
    }

    protected static boolean g(ProfileState profileState) {
        int i2;
        h.f.b.l.d(profileState, "");
        try {
            i2 = SettingsManager.a().a("download_setting_enable", 0);
        } catch (com.bytedance.ies.a unused) {
            i2 = 0;
        }
        if (!h.f.b.l.a((Object) profileState.getFrom(), (Object) "from_main") || !h.f.b.l.a((Object) profileState.isPostAwemeEmpty(), (Object) false) || profileState.getCurrentDownloadSetting() == null || in.d() || i2 != 1) {
            return false;
        }
        return true;
    }

    public BaseMyProfileGuideWidget(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        this.f46127e = viewGroup;
        h.k.c a2 = h.f.b.ab.a(MyProfileGuideViewModel.class);
        a aVar = new a(this, a2);
        this.s = new WidgetLifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
        this.o = new f.a.b.a();
    }

    private static boolean b(MyProfileGuideState myProfileGuideState) {
        List<Aweme> d2;
        List<Aweme> firstRefreshPublishAwemeList = myProfileGuideState.getFirstRefreshPublishAwemeList();
        if (!(firstRefreshPublishAwemeList == null || (d2 = h.a.n.d((Iterable) firstRefreshPublishAwemeList, 10)) == null || ((d2 instanceof Collection) && d2.isEmpty()))) {
            for (Aweme aweme : d2) {
                AwemeStatus status = aweme.getStatus();
                if (status != null && status.getPrivateStatus() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    protected static boolean c(ProfileState profileState) {
        UgProfileActivityButton profileActivityButton;
        String h5Link;
        h.f.b.l.d(profileState, "");
        if (h.f.b.l.a((Object) profileState.getFrom(), (Object) "from_main")) {
            Boolean bool = com.ss.android.ugc.aweme.profile.b.f116042a;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue() && !in.d()) {
                com.ss.android.ugc.aweme.profile.c a2 = com.ss.android.ugc.aweme.profile.c.a();
                h.f.b.l.b(a2, "");
                if (!a2.e()) {
                    com.ss.android.ugc.aweme.profile.c a3 = com.ss.android.ugc.aweme.profile.c.a();
                    if (a3.f116054b.contains("show_bubble") && !a3.f116054b.getBoolean("show_bar", false)) {
                        try {
                            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                            h.f.b.l.b(iESSettingsProxy, "");
                            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                            if (awemeActivitySetting == null || (profileActivityButton = awemeActivitySetting.getProfileActivityButton()) == null || (h5Link = profileActivityButton.getH5Link()) == null || h5Link.length() == 0) {
                                return false;
                            }
                            return true;
                        } catch (com.bytedance.ies.a unused) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r0.getAwemeCount() == 0) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static boolean e(com.ss.android.ugc.aweme.profile.viewmodel.ProfileState r4) {
        /*
            java.lang.String r3 = ""
            h.f.b.l.d(r4, r3)
            boolean r0 = com.ss.android.ugc.aweme.utils.in.d()
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = r4.getFrom()
            java.lang.String r0 = "from_main"
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 == 0) goto L_0x005c
            java.lang.Boolean r1 = r4.isPostAwemeEmpty()
            r2 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.b.g()
            h.f.b.l.b(r0, r3)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0039
            int r0 = r0.getAwemeCount()
            if (r0 == 0) goto L_0x004b
        L_0x0039:
            boolean r0 = com.ss.android.ugc.aweme.profile.experiment.l.f116366a
            if (r0 == 0) goto L_0x005c
            java.lang.Boolean r1 = r4.isPostAwemeEmptyWhenPrivateShow()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 == 0) goto L_0x005c
        L_0x004b:
            boolean r0 = com.ss.android.ugc.aweme.profile.f.o.e()
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService r0 = com.ss.android.ugc.aweme.compliance.api.a.c()
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto L_0x005c
            return r2
        L_0x005c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.e(com.ss.android.ugc.aweme.profile.viewmodel.ProfileState):boolean");
    }

    protected static boolean a(ProfileState profileState) {
        h.f.b.l.d(profileState, "");
        if ((!h.f.b.l.a((Object) profileState.getFrom(), (Object) "from_main")) || !in.d()) {
            return false;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        User curUser = g2.getCurUser();
        h.f.b.l.b(curUser, "");
        if (curUser.getUserPeriod() != 1) {
            return false;
        }
        com.ss.android.ugc.aweme.app.s sVar = s.a.f66880a;
        h.f.b.l.b(sVar, "");
        com.ss.android.ugc.aweme.app.aj<Long> t2 = sVar.t();
        h.f.b.l.b(t2, "");
        Long c2 = t2.c();
        if (c2 == null || c2.longValue() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            h.f.b.l.b(c2, "");
            if (currentTimeMillis - c2.longValue() > TimeUnit.DAYS.toMillis(30)) {
                return false;
            }
        }
        com.ss.android.ugc.aweme.app.s sVar2 = s.a.f66880a;
        h.f.b.l.b(sVar2, "");
        com.ss.android.ugc.aweme.app.aj<Long> s2 = sVar2.s();
        h.f.b.l.b(s2, "");
        Long c3 = s2.c();
        long currentTimeMillis2 = System.currentTimeMillis();
        h.f.b.l.b(c3, "");
        if (currentTimeMillis2 - c3.longValue() > TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    protected static boolean b(ProfileState profileState) {
        h.f.b.l.d(profileState, "");
        if (!h.f.b.l.a((Object) profileState.getFrom(), (Object) "from_main")) {
            return false;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (!g2.isLogin()) {
            return false;
        }
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g3, "");
        User curUser = g3.getCurUser();
        h.f.b.l.b(curUser, "");
        if (!curUser.isSecret()) {
            return false;
        }
        SharePrefCache inst = SharePrefCache.inst();
        h.f.b.l.b(inst, "");
        com.ss.android.ugc.aweme.app.aj<Boolean> shouldShowPrivateAccountTipInProfile = inst.getShouldShowPrivateAccountTipInProfile();
        h.f.b.l.b(shouldShowPrivateAccountTipInProfile, "");
        Boolean c2 = shouldShowPrivateAccountTipInProfile.c();
        h.f.b.l.b(c2, "");
        if (c2.booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void c(NoticeView noticeView) {
        h.f.b.l.d(noticeView, "");
        String string = q().getString(R.string.h06);
        h.f.b.l.b(string, "");
        String string2 = q().getString(R.string.c5g);
        h.f.b.l.b(string2, "");
        String str = string + ' ' + string2;
        noticeView.setIconImage(R.raw.icon_private_account);
        SpannableString spannableString = new SpannableString(str);
        aj ajVar = new aj(this, str, noticeView, string2);
        int a2 = h.m.p.a((CharSequence) str, string2, 0, false, 6);
        if (a2 < 0) {
            a2 = str.length();
        }
        spannableString.setSpan(ajVar, a2, str.length(), 17);
        noticeView.setTitleText(spannableString);
        TextView textView = (TextView) noticeView.findViewById(R.id.f9l);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View findViewById = noticeView.findViewById(R.id.emj);
        if (findViewById != null) {
            findViewById.setClickable(false);
        }
        noticeView.setOnInternalClickListener(new ak(this, str, noticeView, string2));
        noticeView.setTag("tag_guide_private_account");
        a((View) noticeView);
        p.f118033a.storeInt(p.b() + "-guide_showed_times", p.f118033a.getInt(p.b() + "-guide_showed_times", 0) + 1);
        p.f118033a.storeLong(p.b() + "-guide_last_showed_time_stamp", System.currentTimeMillis());
        com.ss.android.ugc.aweme.common.r.a("show_private_guide_pop_up", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").f66730a);
    }

    protected static boolean a(MyProfileGuideState myProfileGuideState) {
        int i2;
        boolean z2;
        boolean z3;
        List<Aweme> firstRefreshPrivateAwemeList;
        Aweme aweme;
        h.f.b.l.d(myProfileGuideState, "");
        if (!p.f118033a.getBoolean(p.b() + "-guide_disabled", false)) {
            if (System.currentTimeMillis() - p.f118033a.getLong(p.b() + "-guide_last_showed_time_stamp", 0) >= 86400000 && p.f118033a.getInt(p.b() + "-guide_showed_times", 0) < 5) {
                Integer followerCount = myProfileGuideState.getFollowerCount();
                if (followerCount != null) {
                    i2 = followerCount.intValue();
                } else {
                    i2 = 0;
                }
                if (((Boolean) com.ss.android.ugc.aweme.profile.experiment.c.f116336a.getValue()).booleanValue()) {
                    Integer currentCommentSetting = myProfileGuideState.getCurrentCommentSetting();
                    if (currentCommentSetting != null && currentCommentSetting.intValue() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (com.ss.android.ugc.aweme.profile.experiment.c.a() != 1) {
                        if (myProfileGuideState.getFirstRefreshPublishAwemeList() == null || myProfileGuideState.getFirstRefreshPublishAwemeList().isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (com.ss.android.ugc.aweme.profile.experiment.c.a() == 2) {
                            if (!b(i2) || !z3) {
                                return false;
                            }
                            return true;
                        }
                    } else if (!b(i2) || (!b(myProfileGuideState) && (((firstRefreshPrivateAwemeList = myProfileGuideState.getFirstRefreshPrivateAwemeList()) == null || (aweme = (Aweme) h.a.n.h((List) firstRefreshPrivateAwemeList)) == null || aweme.getCreateTime() * 1000 <= System.currentTimeMillis() - 604800000) && !z2))) {
                        return false;
                    } else {
                        return true;
                    }
                }
                if (((Boolean) com.ss.android.ugc.aweme.profile.experiment.d.f116342b.getValue()).booleanValue()) {
                    return b(i2);
                }
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        if (i2 == 0) {
            View view = this.f117503h;
            if (view == null || view.getVisibility() != 0) {
                u();
                View view2 = this.f117503h;
                if (view2 != null) {
                    view2.setVisibility(i2);
                    view2.setScaleX(0.8f);
                    view2.setScaleY(0.8f);
                    t();
                    return;
                }
                return;
            }
            return;
        }
        View view3 = this.f117503h;
        if (view3 != null) {
            view3.setVisibility(i2);
            View view4 = this.f117503h;
            if (view4 != null) {
                view4.clearAnimation();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(NoticeView noticeView) {
        h.f.b.l.d(noticeView, "");
        noticeView.setIconImage(2131233378);
        noticeView.setTitleText(R.string.fq1);
        String string = q().getString(R.string.fpw);
        h.f.b.l.b(string, "");
        SpannableString spannableString = new SpannableString(new h.m.l("(.)").replace(string, "⁠"));
        spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(q(), R.color.al)), 0, spannableString.length(), 18);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
        noticeView.setTitleText(new SpannableStringBuilder(q().getString(R.string.fq1)).append((CharSequence) spannableString));
        noticeView.setOnInternalClickListener(new z(this, noticeView));
        noticeView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Aweme>, h.z> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.this$0 = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Aweme> list) {
            final List<? extends Aweme> list2 = list;
            h.f.b.l.d(iVar, "");
            this.this$0.n().g(new h.f.a.b<MyProfileGuideState, MyProfileGuideState>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.n.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75953);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                    MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                    h.f.b.l.d(myProfileGuideState2, "");
                    return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, null, null, list2, null, 12287, null);
                }
            });
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Aweme>, h.z> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.this$0 = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Aweme> list) {
            final List<? extends Aweme> list2 = list;
            h.f.b.l.d(iVar, "");
            this.this$0.n().g(new h.f.a.b<MyProfileGuideState, MyProfileGuideState>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75955);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                    MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                    h.f.b.l.d(myProfileGuideState2, "");
                    return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, null, null, null, list2, 8191, null);
                }
            });
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.this$0 = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.p();
            } else {
                this.this$0.o();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.this$0 = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            final Integer num2 = num;
            h.f.b.l.d(iVar, "");
            this.this$0.n().g(new h.f.a.b<MyProfileGuideState, MyProfileGuideState>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.s.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75967);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                    MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                    h.f.b.l.d(myProfileGuideState2, "");
                    return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, null, num2, null, null, 14335, null);
                }
            });
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, User, h.z> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.this$0 = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, User user) {
            final User user2 = user;
            h.f.b.l.d(iVar, "");
            this.this$0.n().g(new h.f.a.b<MyProfileGuideState, MyProfileGuideState>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.t.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75969);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                    int i2;
                    MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                    h.f.b.l.d(myProfileGuideState2, "");
                    User user = user2;
                    if (user != null) {
                        i2 = user.getFollowerCount();
                    } else {
                        i2 = 0;
                    }
                    return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, Integer.valueOf(i2), null, null, null, 15359, null);
                }
            });
            return h.z.f158842a;
        }
    }

    protected static boolean c(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
        h.f.b.l.d(profileState, "");
        h.f.b.l.d(myProfileGuideState, "");
        if (!h.f.b.l.a((Object) profileState.getFrom(), (Object) "from_main") || !com.ss.android.ugc.aweme.profile.service.h.f116622a.isEnableSettingDiskManager() || !h.f.b.l.a((Object) myProfileGuideState.getNeedShowDiskManagerGuide(), (Object) true)) {
            return false;
        }
        return true;
    }

    protected static boolean a(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        h.f.b.l.d(myProfileGuideState, "");
        h.f.b.l.d(profileState, "");
        if (!myProfileGuideState.getNeedCheckI18nRecommendUserDialog() || !h.f.b.l.a((Object) profileState.getFrom(), (Object) "from_main") || !com.ss.android.ugc.aweme.profile.service.b.f116618a.shouldShowI18nRecommendUserDialogOnMyPrifile()) {
            return false;
        }
        return true;
    }

    protected static boolean b(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
        h.f.b.l.d(profileState, "");
        h.f.b.l.d(myProfileGuideState, "");
        if (!h.f.b.l.a((Object) profileState.getFrom(), (Object) "from_main") || com.ss.android.ugc.aweme.compliance.api.a.o().a() || !com.ss.android.ugc.aweme.profile.survey.g.a(myProfileGuideState.getSurveyData())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(NoticeView noticeView, MyProfileGuideState myProfileGuideState) {
        h.f.b.l.d(noticeView, "");
        h.f.b.l.d(myProfileGuideState, "");
        String string = q().getString(R.string.eu1);
        h.f.b.l.b(string, "");
        String string2 = q().getString(R.string.eu2);
        h.f.b.l.b(string2, "");
        noticeView.setIconImage(2131233382);
        noticeView.setTitleText(R.string.eu1);
        SpannableString spannableString = new SpannableString(string);
        aa aaVar = new aa(this, noticeView, myProfileGuideState);
        int a2 = h.m.p.a((CharSequence) string, string2, 0, false, 6);
        if (a2 < 0) {
            a2 = string.length();
        }
        spannableString.setSpan(aaVar, a2, string.length(), 17);
        noticeView.setTitleText(spannableString);
        TextView textView = (TextView) noticeView.findViewById(R.id.f9l);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View findViewById = noticeView.findViewById(R.id.emj);
        if (findViewById != null) {
            findViewById.setClickable(false);
        }
        noticeView.setOnInternalClickListener(new ab(noticeView));
        com.ss.android.ugc.aweme.profile.service.h.f116622a.setPrivateSettingItem("download_prompt", 1).a(ac.f117513a, ad.f117514a);
        a((View) noticeView);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.g
    public final void a(String str, String str2, boolean z2, boolean z3) {
        NoticeView k2;
        Object obj;
        if (h.f.b.l.a((Object) str2, (Object) "USER") && (k2 = k()) != null && k2.getVisibility() == 0) {
            NoticeView k3 = k();
            if (k3 != null) {
                obj = k3.getTag();
            } else {
                obj = null;
            }
            if (h.f.b.l.a(obj, (Object) "tag_guide_private_account")) {
                NoticeView k4 = k();
                if (k4 != null) {
                    k4.setTag("");
                }
                NoticeView k5 = k();
                if (k5 != null) {
                    k5.setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.s<com.bytedance.jedi.arch.i, Boolean, com.bytedance.jedi.arch.a<? extends h.p<? extends UrlModel, ? extends com.bytedance.lighten.a.o>>, String, Integer, h.z> {
        final /* synthetic */ BaseMyProfileGuideWidget this$0;

        static {
            Covode.recordClassIndex(75961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(5);
            this.this$0 = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.s
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool, com.bytedance.jedi.arch.a<? extends h.p<? extends UrlModel, ? extends com.bytedance.lighten.a.o>> aVar, String str, Integer num) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final Boolean bool2 = bool;
            final com.bytedance.jedi.arch.a<? extends h.p<? extends UrlModel, ? extends com.bytedance.lighten.a.o>> aVar2 = aVar;
            final Integer num2 = num;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(aVar2, "");
            if (!((MyProfileGuideState) iVar2.withState(this.this$0.n(), AnonymousClass1.f117552a)).getHasGuideShowed() && !(!h.f.b.l.a((Object) str, (Object) "from_main"))) {
                this.this$0.n().g(new h.f.a.b<MyProfileGuideState, MyProfileGuideState>() {
                    /* class com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.r.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(75963);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        boolean z;
                        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                        h.f.b.l.d(myProfileGuideState2, "");
                        if (bool2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return MyProfileGuideState.copy$default(myProfileGuideState2, false, z, false, false, null, null, null, false, false, false, null, null, null, null, 16381, null);
                    }
                });
                this.this$0.n().g(new h.f.a.b<MyProfileGuideState, MyProfileGuideState>() {
                    /* class com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.r.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(75964);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                        h.f.b.l.d(myProfileGuideState2, "");
                        return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, !(aVar2 instanceof aq), false, null, null, null, false, false, false, null, null, null, null, 16379, null);
                    }
                });
                this.this$0.n().g(new h.f.a.b<MyProfileGuideState, MyProfileGuideState>() {
                    /* class com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.r.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(75965);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                        h.f.b.l.d(myProfileGuideState2, "");
                        return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, num2, false, false, false, null, null, null, null, 16319, null);
                    }
                });
            }
            return h.z.f158842a;
        }
    }
}
