package com.ss.android.ugc.aweme.profile.widgets;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.arch.ah;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.profile.ac;
import com.ss.android.ugc.aweme.profile.f.o;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.api.BAProfileGrowthShowApi;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.u;
import h.z;
import java.util.Random;

public final class MyProfileGuideWidgetV2 extends BaseMyProfileGuideWidget implements au, com.ss.android.ugc.aweme.setting.serverpush.b.c, org.greenrobot.eventbus.j {
    private com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> r;

    static {
        Covode.recordClassIndex(75976);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget, com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f117565a = new j();

        static {
            Covode.recordClassIndex(75986);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            BaseMyProfileGuideWidget.a(false);
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            myProfileGuideWidgetV2.a(myProfileGuideWidgetV2.k());
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.n().g(BaseMyProfileGuideWidget.al.f117533a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void h() {
        super.h();
        if (!com.bytedance.ies.ugc.appcontext.f.f34637l) {
            p();
        }
    }

    @Override // com.bytedance.widget.Widget, com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
    public final void i() {
        super.i();
        com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> cVar = this.r;
        if (cVar != null) {
            cVar.cd_();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            NoticeView k2 = myProfileGuideWidgetV2.k();
            if (k2 == null) {
                h.f.b.l.b();
            }
            myProfileGuideWidgetV2.b(k2);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideState $myProfileGuideState;
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, MyProfileGuideState myProfileGuideState) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
            this.$myProfileGuideState = myProfileGuideState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            NoticeView k2 = myProfileGuideWidgetV2.k();
            if (k2 == null) {
                h.f.b.l.b();
            }
            myProfileGuideWidgetV2.a(k2, this.$myProfileGuideState);
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            NoticeView k2 = myProfileGuideWidgetV2.k();
            if (k2 == null) {
                h.f.b.l.b();
            }
            myProfileGuideWidgetV2.c(k2);
            return z.f158842a;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            NoticeView k2 = myProfileGuideWidgetV2.k();
            if (k2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(k2, "");
            k2.setIconImage(R.drawable.b85);
            k2.setTitleText(R.string.d8p);
            k2.setOnInternalClickListener(new BaseMyProfileGuideWidget.ae(myProfileGuideWidgetV2, k2));
            myProfileGuideWidgetV2.a((View) k2);
            BaseMyProfileGuideWidget.a(true);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            NoticeView k2 = myProfileGuideWidgetV2.k();
            if (k2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(k2, "");
            k2.setIconImage(2131233382);
            k2.setTitleText(R.string.bnz);
            k2.setOnInternalClickListener(new BaseMyProfileGuideWidget.am(myProfileGuideWidgetV2, k2));
            myProfileGuideWidgetV2.a((View) k2);
            r.a("privacy_floating_bar_show", new com.ss.android.ugc.aweme.app.f.d().f66730a);
            BaseMyProfileGuideWidget.a(true);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget, com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
    public final void c() {
        super.c();
        com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> providePushSettingFetchPresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingFetchPresenter();
        this.r = providePushSettingFetchPresenter;
        if (providePushSettingFetchPresenter == null) {
            h.f.b.l.b();
        }
        providePushSettingFetchPresenter.a_(this);
        com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> cVar = this.r;
        if (cVar == null) {
            h.f.b.l.b();
        }
        cVar.a(new Object[0]);
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MethodCollector.i(9444);
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            try {
                View inflate = ((ViewStub) myProfileGuideWidgetV2.f117505j.getValue()).inflate();
                myProfileGuideWidgetV2.f117506k = inflate;
                TextView textView = (TextView) inflate.findViewById(R.id.f05);
                h.f.b.l.b(textView, "");
                textView.setText(com.ss.android.ugc.aweme.compliance.api.a.c().b());
                inflate.setOnClickListener(new BaseMyProfileGuideWidget.af(myProfileGuideWidgetV2, inflate));
                h.f.b.l.b(inflate, "");
                inflate.setVisibility(0);
                inflate.post(new BaseMyProfileGuideWidget.ag(myProfileGuideWidgetV2, inflate));
                com.ss.android.ugc.aweme.compliance.api.a.c().c();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
            z zVar = z.f158842a;
            MethodCollector.o(9444);
            return zVar;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            NoticeButtonView l2 = myProfileGuideWidgetV2.l();
            if (l2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(l2, "");
            l2.setOnInternalClickListener(new BaseMyProfileGuideWidget.ah(myProfileGuideWidgetV2, l2));
            myProfileGuideWidgetV2.a((View) l2);
            r.a("banner_show", new com.ss.android.ugc.aweme.app.f.d().a("banner_type", "coupon_fission").a("banner_name", "tiktok_rewards").a("enter_from", "personal_homepage").f66730a);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            NoticeButtonView m2 = myProfileGuideWidgetV2.m();
            if (m2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(m2, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            h.f.b.l.b(curUser, "");
            com.ss.android.ugc.aweme.commerce.b a2 = com.ss.android.ugc.aweme.profile.settings.a.a();
            if (a2 != null) {
                String title = a2.getTitle();
                if (title != null) {
                    m2.setTitleText(title);
                }
                String bodyText = a2.getBodyText();
                if (bodyText != null) {
                    m2.setContextText(bodyText);
                }
                String buttonText = a2.getButtonText();
                if (buttonText != null) {
                    m2.setItemText(buttonText);
                }
                m2.setOnClickListener(new BaseMyProfileGuideWidget.v(myProfileGuideWidgetV2, m2, a2));
                m2.setOnInternalClickListener(new BaseMyProfileGuideWidget.w(myProfileGuideWidgetV2, m2, a2, curUser));
                myProfileGuideWidgetV2.a((View) m2);
                r.a("ttelite_BA_acq_profile_msg_show", new com.ss.android.ugc.aweme.app.f.d().a("message_id", a2.getMessageId()).a("user_id", curUser.getUid()).a("user_status", curUser.getAccountType()).f66730a);
                String messageId = a2.getMessageId();
                if (messageId != null) {
                    f.a.b.a aVar = myProfileGuideWidgetV2.o;
                    Object a3 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(BAProfileGrowthShowApi.class);
                    h.f.b.l.b(a3, "");
                    aVar.a(((BAProfileGrowthShowApi) a3).sendMessageIsShown(messageId).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(BaseMyProfileGuideWidget.x.f117561a, BaseMyProfileGuideWidget.y.f117562a));
                }
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MyProfileGuideWidgetV2 this$0;

        static {
            Covode.recordClassIndex(75980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.this$0 = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            String str2;
            MethodCollector.i(9219);
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.this$0;
            View view = myProfileGuideWidgetV2.f46127e;
            if (view == null) {
                h.f.b.l.b();
            }
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.cs6);
            if (viewStub == null) {
                com.ss.android.ugc.aweme.framework.a.a.a(new Exception("find my_profile_survey_stub is null"));
            }
            h.f.b.l.b(viewStub, "");
            com.ss.android.ugc.aweme.profile.survey.a aVar = new com.ss.android.ugc.aweme.profile.survey.a(viewStub);
            myProfileGuideWidgetV2.f117504i = aVar;
            aVar.f116655k = new BaseMyProfileGuideWidget.k(myProfileGuideWidgetV2, aVar);
            com.ss.android.ugc.aweme.profile.survey.g gVar = myProfileGuideWidgetV2.f117504i;
            if (gVar == null) {
                h.f.b.l.b();
            }
            gVar.f116656l = ((MyProfileGuideState) myProfileGuideWidgetV2.withState(myProfileGuideWidgetV2.n(), BaseMyProfileGuideWidget.an.f117536a)).getSurveyData();
            com.ss.android.ugc.aweme.profile.survey.g gVar2 = myProfileGuideWidgetV2.f117504i;
            if (gVar2 == null) {
                h.f.b.l.b();
            }
            if (gVar2.f116645a != null && com.ss.android.ugc.aweme.profile.survey.g.a(gVar2.f116656l)) {
                if (gVar2.f116646b == null) {
                    gVar2.f116646b = gVar2.f116645a.inflate();
                    View view2 = gVar2.f116646b;
                    gVar2.f116647c = view2.findViewById(R.id.efz);
                    gVar2.f116648d = (TextView) gVar2.f116647c.findViewById(R.id.eg7);
                    gVar2.f116649e = (TextView) gVar2.f116647c.findViewById(R.id.eg0);
                    gVar2.f116653i = (TextView) gVar2.f116647c.findViewById(R.id.efy);
                    gVar2.f116654j = (TextView) gVar2.f116647c.findViewById(R.id.eg2);
                    gVar2.f116650f = view2.findViewById(R.id.eg5);
                    gVar2.f116651g = (TextView) gVar2.f116650f.findViewById(R.id.eg6);
                    gVar2.f116652h = (TextView) gVar2.f116650f.findViewById(R.id.eg4);
                    View findViewById = gVar2.f116647c.findViewById(R.id.efw);
                    View findViewById2 = gVar2.f116650f.findViewById(R.id.eg1);
                    findViewById.setOnClickListener(gVar2);
                    findViewById2.setOnClickListener(gVar2);
                    gVar2.f116653i.setOnClickListener(gVar2);
                    gVar2.f116654j.setOnClickListener(gVar2);
                    com.bytedance.ies.dmt.ui.f.c.a(findViewById, 0.75f);
                    com.bytedance.ies.dmt.ui.f.c.a(findViewById2, 0.75f);
                }
                boolean z = false;
                gVar2.o = false;
                com.ss.android.ugc.aweme.cu.a aVar2 = gVar2.f116656l;
                if (aVar2 != null) {
                    gVar2.f116648d.setText(aVar2.f79086b);
                    gVar2.f116649e.setText(aVar2.f79087c);
                    if (new Random().nextInt(2) == 1) {
                        z = true;
                    }
                    gVar2.p = z;
                    TextView textView = gVar2.f116653i;
                    if (gVar2.p) {
                        str = aVar2.f79089e;
                    } else {
                        str = aVar2.f79088d;
                    }
                    textView.setText(str);
                    TextView textView2 = gVar2.f116654j;
                    if (gVar2.p) {
                        str2 = aVar2.f79088d;
                    } else {
                        str2 = aVar2.f79089e;
                    }
                    textView2.setText(str2);
                    gVar2.f116651g.setText(aVar2.f79090f);
                    gVar2.f116652h.setText(aVar2.f79091g);
                }
                if (gVar2.f116646b.getHeight() > 0) {
                    gVar2.a();
                } else {
                    View view3 = gVar2.f116646b;
                    com.ss.android.ugc.aweme.profile.survey.h hVar = new com.ss.android.ugc.aweme.profile.survey.h(gVar2);
                    if (view3 != null) {
                        ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                        viewTreeObserver.addOnGlobalLayoutListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0166: INVOKE  
                              (r1v3 'viewTreeObserver' android.view.ViewTreeObserver)
                              (wrap: com.ss.android.ugc.aweme.base.utils.o$2 : 0x0163: CONSTRUCTOR  (r0v14 com.ss.android.ugc.aweme.base.utils.o$2) = 
                              (r1v3 'viewTreeObserver' android.view.ViewTreeObserver)
                              (r3v2 'view3' android.view.View)
                              (r2v4 'hVar' com.ss.android.ugc.aweme.profile.survey.h)
                             call: com.ss.android.ugc.aweme.base.utils.o.2.<init>(android.view.ViewTreeObserver, android.view.View, android.view.ViewTreeObserver$OnGlobalLayoutListener):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.view.ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener):void in method: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2.d.invoke():h.z, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0163: CONSTRUCTOR  (r0v14 com.ss.android.ugc.aweme.base.utils.o$2) = 
                              (r1v3 'viewTreeObserver' android.view.ViewTreeObserver)
                              (r3v2 'view3' android.view.View)
                              (r2v4 'hVar' com.ss.android.ugc.aweme.profile.survey.h)
                             call: com.ss.android.ugc.aweme.base.utils.o.2.<init>(android.view.ViewTreeObserver, android.view.View, android.view.ViewTreeObserver$OnGlobalLayoutListener):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2.d.invoke():h.z, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 29 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.base.utils.o, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 35 more
                            */
                        /*
                        // Method dump skipped, instructions count: 368
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2.d.invoke():java.lang.Object");
                    }
                }

                /* access modifiers changed from: package-private */
                public static final class n extends h.f.b.m implements s<com.bytedance.jedi.arch.i, Integer, Boolean, Boolean, Boolean, z> {
                    final /* synthetic */ NoticeView $noticeBar;
                    final /* synthetic */ MyProfileGuideWidgetV2 this$0;

                    static {
                        Covode.recordClassIndex(75990);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    n(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, NoticeView noticeView) {
                        super(5);
                        this.this$0 = myProfileGuideWidgetV2;
                        this.$noticeBar = noticeView;
                    }

                    static final /* synthetic */ class a extends h.f.b.j implements h.f.a.b<ProfileState, ProfileState> {

                        /* renamed from: a  reason: collision with root package name */
                        public static final a f117566a = new a();

                        static {
                            Covode.recordClassIndex(75991);
                        }

                        a() {
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

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // h.f.a.s
                    public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
                        com.bytedance.jedi.arch.i iVar2 = iVar;
                        int intValue = num.intValue();
                        h.f.b.l.d(iVar2, "");
                        ProfileState profileState = (ProfileState) iVar2.withState(this.this$0.r(), a.f117566a);
                        profileState.isPostAwemeEmpty();
                        if (intValue != 0 || !MyProfileGuideWidgetV2.e(profileState)) {
                            this.this$0.a(8);
                            NoticeView noticeView = this.$noticeBar;
                            if (noticeView != null) {
                                noticeView.setVisibility(4);
                            }
                            o.f116434d = false;
                        } else {
                            this.this$0.a(0);
                            com.ss.android.ugc.aweme.profile.f.n.a();
                            o.f116434d = true;
                            NoticeView noticeView2 = this.$noticeBar;
                            if (noticeView2 != null) {
                                noticeView2.setVisibility(4);
                            }
                        }
                        return z.f158842a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public MyProfileGuideWidgetV2(ViewGroup viewGroup) {
                    super(viewGroup);
                    h.f.b.l.d(viewGroup, "");
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
                public final void a(NoticeView noticeView) {
                    f.a.b.b unused = selectSubscribe(r(), l.f117925a, m.f117937a, n.f117946a, o.f118032a, new ah(), new n(this, noticeView));
                    com.ss.android.ugc.aweme.profile.f.n.a();
                    o.f116434d = true;
                }

                @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
                public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
                    if (fVar != null) {
                        if (fVar.w == 1) {
                            r().c(new ProfileViewModel.d(fVar.v));
                        }
                        r().c(new ProfileViewModel.c(fVar.r));
                    }
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
                public final u<Boolean, Boolean, h.f.a.a<z>>[] a(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
                    boolean z;
                    boolean z2;
                    h.f.b.l.d(profileState, "");
                    h.f.b.l.d(myProfileGuideState, "");
                    u<Boolean, Boolean, h.f.a.a<z>>[] uVarArr = new u[13];
                    boolean z3 = true;
                    uVarArr[0] = new u<>(true, Boolean.valueOf(a(profileState)), new a(this));
                    uVarArr[1] = new u<>(true, Boolean.valueOf(b(profileState)), new f(this));
                    com.ss.android.ugc.aweme.commerce.b a2 = com.ss.android.ugc.aweme.profile.settings.a.a();
                    if (a2 != null && !TextUtils.isEmpty(a2.getLandingPageSchema())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    uVarArr[2] = new u<>(true, Boolean.valueOf(z), new g(this));
                    uVarArr[3] = new u<>(true, Boolean.valueOf(com.ss.android.ugc.aweme.profile.service.b.f116618a.needShowSafeInfoNotice()), new h(this));
                    uVarArr[4] = new u<>(true, Boolean.valueOf(ac.f115951a), new i(this));
                    uVarArr[5] = new u<>(true, Boolean.valueOf(a(myProfileGuideState, profileState)), j.f117565a);
                    uVarArr[6] = new u<>(true, Boolean.valueOf(c(profileState)), new k(this));
                    uVarArr[7] = new u<>(Boolean.valueOf(myProfileGuideState.getPostListHasLoaded()), Boolean.valueOf(g(profileState)), new l(this, myProfileGuideState));
                    uVarArr[8] = new u<>(true, Boolean.valueOf(a(myProfileGuideState)), new m(this));
                    uVarArr[9] = new u<>(true, Boolean.valueOf(f(profileState)), new b(this));
                    if (!myProfileGuideState.getPostListHasLoaded() || profileState.isPostGuideShow() == null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    uVarArr[10] = new u<>(Boolean.valueOf(z2), Boolean.valueOf(d(profileState)), new c(this));
                    uVarArr[11] = new u<>(Boolean.valueOf(myProfileGuideState.getHasSurveyDetermined()), Boolean.valueOf(b(profileState, myProfileGuideState)), new d(this));
                    if (myProfileGuideState.getNeedShowDiskManagerGuide() == null) {
                        z3 = false;
                    }
                    uVarArr[12] = new u<>(Boolean.valueOf(z3), Boolean.valueOf(c(profileState, myProfileGuideState)), new e(this));
                    return uVarArr;
                }
            }
