package com.ss.android.ugc.aweme.profile.widgets.g.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.dialog.b;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bu;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.musically.cut.j;
import com.ss.android.ugc.aweme.profile.edit.g;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView;
import com.ss.android.ugc.aweme.profile.ui.v2.w;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class a extends com.bytedance.assem.arch.d.a implements com.ss.android.ugc.aweme.profile.presenter.p, f, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final d r = new d((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    final com.bytedance.assem.arch.viewModel.b f117831j;

    /* renamed from: k  reason: collision with root package name */
    MusAvatarWithBorderView f117832k;

    /* renamed from: l  reason: collision with root package name */
    View f117833l;

    /* renamed from: m  reason: collision with root package name */
    AnimationImageView f117834m;
    public SmartImageView n;
    public com.ss.android.ugc.aweme.profile.presenter.a o;
    public com.ss.android.ugc.aweme.profile.g p;
    public boolean q;
    private final com.bytedance.assem.arch.extensions.i s = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    private UrlModel t;
    private final IProfileBadgeService u;
    private final IProfileBadgeService.c v;
    private final h.h w;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.story.avatar.p, com.ss.android.ugc.aweme.story.avatar.p> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(76331);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.story.avatar.p invoke(com.ss.android.ugc.aweme.story.avatar.p pVar) {
            h.f.b.l.c(pVar, "");
            return pVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q implements j.a {

        /* renamed from: a  reason: collision with root package name */
        public static final q f117844a = new q();

        static {
            Covode.recordClassIndex(76348);
        }

        q() {
        }

        @Override // com.ss.android.ugc.aweme.i18n.musically.cut.j.a
        public final void a(String str) {
        }
    }

    static {
        Covode.recordClassIndex(76329);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(169, new org.greenrobot.eventbus.g(a.class, "onClickGuideCardEvent", com.ss.android.ugc.aweme.profile.a.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final bu v() {
        return (bu) this.w.getValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(76333);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f117840b;

        static {
            Covode.recordClassIndex(76338);
        }

        i(a aVar, View view) {
            this.f117839a = aVar;
            this.f117840b = view;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            User user;
            User user2;
            ClickAgent.onClick(view);
            if (com.bytedance.assem.arch.extensions.b.b(this.f117839a) != null) {
                if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                    com.ss.android.ugc.aweme.lancet.j.f107229h = a();
                }
                if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                    new com.bytedance.tux.g.b(this.f117840b).e(R.string.de8).b();
                } else if (!com.ss.android.ugc.aweme.l.a.a.a(this.f117840b, 1200)) {
                    a aVar = this.f117839a;
                    com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(aVar, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                    Object obj = null;
                    if (iVar != null) {
                        user = iVar.f117705a;
                    } else {
                        user = null;
                    }
                    String str = "personal_homepage";
                    if (aVar.f25594h && user != null) {
                        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(aVar);
                        if (!user.isLive()) {
                            View view2 = aVar.f117833l;
                            if (view2 == null || view2.getVisibility() != 0) {
                                r.a("click_profile_icon", new com.ss.android.ugc.aweme.app.f.d().a("author_id", user.getUid()).a("enter_from", str).a("enter_method", "click_head").f66730a);
                                if (in.d() || com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
                                    com.ss.android.ugc.aweme.profile.service.h.f116622a.startHeaderDetailActivity((Activity) b2, (View) aVar.f117832k, user, true);
                                } else {
                                    if (b2 == null) {
                                        h.f.b.l.b();
                                    }
                                    MusAvatarWithBorderView musAvatarWithBorderView = aVar.f117832k;
                                    if (musAvatarWithBorderView == null) {
                                        h.f.b.l.b();
                                    }
                                    aVar.p = new com.ss.android.ugc.aweme.profile.edit.g(b2, musAvatarWithBorderView, aVar.x().f116508b, user);
                                    com.ss.android.ugc.aweme.profile.g gVar = aVar.p;
                                    if (gVar == null) {
                                        h.f.b.l.b();
                                    }
                                    gVar.a();
                                }
                            } else {
                                aVar.x().a(b2, aVar.f117832k, user);
                            }
                        }
                    }
                    SmartImageView smartImageView = this.f117839a.n;
                    if (smartImageView != null && smartImageView.getVisibility() == 0) {
                        com.ss.android.ugc.aweme.profile.widgets.common.i iVar2 = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.f117839a, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                        if (iVar2 != null) {
                            user2 = iVar2.f117705a;
                        } else {
                            user2 = null;
                        }
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        if (!this.f117839a.u()) {
                            str = "others_homepage";
                        }
                        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
                        if (user2 == null || user2.getProfileBadge() == null) {
                            obj = "";
                        } else {
                            ProfileBadgeStruct profileBadge = user2.getProfileBadge();
                            if (profileBadge != null) {
                                obj = Long.valueOf(profileBadge.getId());
                            }
                        }
                        r.a("profile_badge_click", a2.a("badge_id", obj).f66730a);
                    }
                }
            }
        }
    }

    public final boolean u() {
        com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.s.getValue();
        if (aVar != null) {
            return aVar.f117878c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.a$a  reason: collision with other inner class name */
    public static final class C2998a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2998a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.g.a.a.c.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        this.u.a(this.v);
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        this.u.b(this.v);
        EventBus.a().b(this);
    }

    static final class o extends h.f.b.m implements h.f.a.a<bu> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ bu invoke() {
            IProfileNaviService a2;
            String str;
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0);
            if (b2 == null || (a2 = ProfileNaviServiceImpl.a()) == null) {
                return null;
            }
            if (this.this$0.u()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            return a2.a(b2, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.profile.presenter.a x() {
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this);
        if (this.o == null) {
            com.ss.android.ugc.aweme.profile.presenter.a aVar = new com.ss.android.ugc.aweme.profile.presenter.a();
            this.o = aVar;
            aVar.f116509c = this;
            com.ss.android.ugc.aweme.profile.presenter.a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.b(b2, a2);
            }
        }
        com.ss.android.ugc.aweme.profile.presenter.a aVar3 = this.o;
        if (aVar3 == null) {
            h.f.b.l.b();
        }
        return aVar3;
    }

    public final void w() {
        MusAvatarWithBorderView musAvatarWithBorderView = this.f117832k;
        if (musAvatarWithBorderView != null && musAvatarWithBorderView.getController() != null) {
            MusAvatarWithBorderView musAvatarWithBorderView2 = this.f117832k;
            if (musAvatarWithBorderView2 == null) {
                h.f.b.l.b();
            }
            com.facebook.drawee.h.a controller = musAvatarWithBorderView2.getController();
            if (controller == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(controller, "");
            Animatable i2 = controller.i();
            if (i2 == null) {
                return;
            }
            if (g.b.a()) {
                i2.stop();
                return;
            }
            w wVar = (w) com.bytedance.assem.arch.service.d.f(this, ab.a(x.class));
            if (wVar == null || !wVar.f117301e) {
                if (i2.isRunning()) {
                    i2.stop();
                }
            } else if (!i2.isRunning()) {
                i2.start();
            }
        }
    }

    public final void y() {
        User user;
        UrlModel avatarVideoUri;
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            com.ss.android.ugc.aweme.profile.f.p pVar = null;
            if (iVar != null) {
                user = iVar.f117705a;
            } else {
                user = null;
            }
            MusAvatarWithBorderView musAvatarWithBorderView = this.f117832k;
            if (musAvatarWithBorderView == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.profile.presenter.a aVar = this.o;
            if (aVar != null) {
                pVar = aVar.f116508b;
            }
            com.ss.android.ugc.aweme.profile.edit.g gVar = new com.ss.android.ugc.aweme.profile.edit.g(b2, musAvatarWithBorderView, pVar, user);
            if (user == null || (avatarVideoUri = user.getAvatarVideoUri()) == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
                gVar.f116111c.a();
            } else {
                new com.ss.android.ugc.aweme.i18n.musically.cut.j().a(b2, q.f117844a);
            }
        }
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ProfileStoryRingViewModel.class);
        C2998a aVar = new C2998a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f117831j = bVar;
        this.u = ProfileBadgeServiceImpl.b();
        this.v = new h(this);
        this.w = h.i.a((h.f.a.a) new o(this));
    }

    public static final class e extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117835a;

        static {
            Covode.recordClassIndex(76334);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f117835a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            h.f.b.l.d(str, "");
            this.f117835a.w();
        }
    }

    public static final class f extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117836a;

        static {
            Covode.recordClassIndex(76335);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f117836a = aVar;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(th, "");
            super.onFailure(str, th);
            this.f117836a.q = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            h.f.b.l.d(str, "");
            this.f117836a.w();
        }
    }

    public static final class g extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117837a;

        static {
            Covode.recordClassIndex(76336);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(a aVar) {
            this.f117837a = aVar;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(th, "");
            super.onFailure(str, th);
            this.f117837a.q = false;
        }
    }

    public static final class h implements IProfileBadgeService.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117838a;

        static {
            Covode.recordClassIndex(76337);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f117838a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.c
        public final void a(ProfileBadgeStruct profileBadgeStruct) {
            this.f117838a.a(profileBadgeStruct);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(String str) {
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.o;
        if (aVar != null) {
            aVar.a(0);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar, View view) {
            super(1);
            this.this$0 = aVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) AnonymousClass1.f117841a);
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.g.a.a.k.AnonymousClass2 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(76342);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.q qVar) {
                    com.bytedance.assem.arch.core.q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view;
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.story.avatar.i.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.story.avatar.i();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bu v;
            bu v2;
            boolean booleanValue = bool.booleanValue();
            this.this$0.w();
            if (booleanValue) {
                a aVar = this.this$0;
                if (com.ss.android.ugc.aweme.profile.widgets.g.b.a.f117869a && (((v = aVar.v()) == null || !v.b()) && (v2 = this.this$0.v()) != null)) {
                    v2.a();
                }
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends h.p<? extends Exception, ? extends Integer>>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends h.p<? extends Exception, ? extends Integer>> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends h.p<? extends Exception, ? extends Integer>> aVar2 = aVar;
            if (aVar2 != null) {
                T t = aVar2.f25631b;
                Exception exc = (Exception) t.component1();
                ((Number) t.component2()).intValue();
                com.ss.android.ugc.aweme.profile.presenter.a aVar3 = this.this$0.o;
                if (aVar3 != null) {
                    aVar3.d();
                }
                com.ss.android.ugc.aweme.app.api.b.a.a(this.this$0.ar_(), (Throwable) exc, (int) R.string.ez6);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(AvatarUri avatarUri) {
        if (ar_() != null) {
            com.ss.android.ugc.aweme.profile.presenter.a aVar = this.o;
            if (aVar != null) {
                aVar.d();
            }
            if (avatarUri == null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(ar_()).a(R.string.nn).a();
                return;
            }
            com.ss.android.ugc.aweme.profile.widgets.g.e eVar = (com.ss.android.ugc.aweme.profile.widgets.g.e) com.bytedance.assem.arch.service.d.c(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.g.e.class));
            if (eVar != null) {
                eVar.b(avatarUri.uri);
            }
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends h.u<? extends Integer, ? extends Integer, ? extends Intent>>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76339);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends h.u<? extends Integer, ? extends Integer, ? extends Intent>> aVar) {
            com.ss.android.ugc.aweme.profile.presenter.a aVar2;
            com.bytedance.assem.arch.extensions.a<? extends h.u<? extends Integer, ? extends Integer, ? extends Intent>> aVar3 = aVar;
            if (aVar3 != null) {
                T t = aVar3.f25631b;
                int intValue = ((Number) t.component1()).intValue();
                int intValue2 = ((Number) t.component2()).intValue();
                Intent intent = (Intent) t.component3();
                if (intValue == 10002 && intent != null) {
                    Serializable serializableExtra = intent.getSerializableExtra("path");
                    if (!(serializableExtra instanceof UrlModel)) {
                        serializableExtra = null;
                    }
                    UrlModel urlModel = (UrlModel) serializableExtra;
                    if (urlModel != null) {
                        this.this$0.a(urlModel);
                        com.ss.android.ugc.aweme.profile.g gVar = this.this$0.p;
                        if (gVar != null) {
                            gVar.a(urlModel);
                        }
                    }
                } else if (!(this.this$0.o == null || (aVar2 = this.this$0.o) == null)) {
                    aVar2.a(intValue, intValue2, intent);
                }
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r0 == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r4) {
        /*
            r3 = this;
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L_0x0010
            java.lang.String r0 = r4.getUrl()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0022
        L_0x0010:
            boolean r0 = com.ss.android.ugc.aweme.utils.in.d()
            if (r0 != 0) goto L_0x0018
            if (r1 == 0) goto L_0x002e
        L_0x0018:
            com.bytedance.lighten.loader.SmartImageView r1 = r3.n
            if (r1 == 0) goto L_0x0021
            r0 = 8
            r1.setVisibility(r0)
        L_0x0021:
            return
        L_0x0022:
            r4.getShouldShow()
            boolean r0 = r4.getShouldShow()
            if (r0 != 0) goto L_0x002c
            goto L_0x0010
        L_0x002c:
            r1 = 0
            goto L_0x0010
        L_0x002e:
            if (r4 == 0) goto L_0x0052
            java.lang.String r0 = r4.getUrl()
            if (r0 != 0) goto L_0x0039
        L_0x0036:
            h.f.b.l.b()
        L_0x0039:
            com.bytedance.lighten.a.v r1 = com.bytedance.lighten.a.r.a(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r3.n
            r1.E = r0
            java.lang.String r0 = "ProfileWidgetProfileFragment"
            com.bytedance.lighten.a.v r0 = r1.a(r0)
            r0.c()
            com.bytedance.lighten.loader.SmartImageView r0 = r3.n
            if (r0 == 0) goto L_0x0051
            r0.setVisibility(r2)
        L_0x0051:
            return
        L_0x0052:
            r0 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.g.a.a.a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(Exception exc) {
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.o;
        if (aVar != null) {
            aVar.d();
        }
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 20022) {
            com.ss.android.ugc.aweme.common.q.a(ar_(), "profile_image_setting", "review_failure");
        }
        com.ss.android.ugc.aweme.app.api.b.a.a(ar_(), (Throwable) exc, (int) R.string.nn);
    }

    @org.greenrobot.eventbus.r
    public final void onClickGuideCardEvent(com.ss.android.ugc.aweme.profile.a.d dVar) {
        com.ss.android.ugc.aweme.profile.f.p pVar;
        File a2;
        if (dVar != null && dVar.f115834a == 1 && ar_() != null) {
            x();
            String[] strArr = new String[2];
            Context ar_ = ar_();
            if (ar_ == null) {
                h.f.b.l.b();
            }
            strArr[0] = ar_.getString(R.string.abh);
            Context ar_2 = ar_();
            if (ar_2 == null) {
                h.f.b.l.b();
            }
            strArr[1] = ar_2.getString(R.string.abi);
            if (com.ss.android.ugc.aweme.profile.f.o.a()) {
                y();
                return;
            }
            com.ss.android.ugc.aweme.profile.presenter.a aVar = this.o;
            String str = null;
            if (!(aVar == null || (pVar = aVar.f116508b) == null || (a2 = pVar.a("head")) == null)) {
                str = a2.getPath();
            }
            new b.a(ar_()).a(strArr, new p(this, str)).b().show();
        }
    }

    public final void a(UrlModel urlModel) {
        List<String> urlList;
        boolean z;
        List<String> urlList2;
        User user = null;
        if (com.ss.android.ugc.aweme.performance.i.a()) {
            if (this.f25594h) {
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                if (iVar != null) {
                    user = iVar.f117705a;
                }
                w wVar = (w) com.bytedance.assem.arch.service.d.f(this, ab.a(x.class));
                if (wVar != null) {
                    z = wVar.f117301e;
                } else {
                    z = false;
                }
                if (urlModel != null && user != null && !this.q && z) {
                    UrlModel avatarVideoUri = user.getAvatarVideoUri();
                    if (avatarVideoUri == null || (urlList2 = avatarVideoUri.getUrlList()) == null || urlList2.isEmpty()) {
                        this.t = urlModel;
                        com.ss.android.ugc.aweme.base.e.a(this.f117832k, urlModel, new g(this));
                    } else if (!u() || !com.google.c.a.i.a(this.t, avatarVideoUri)) {
                        com.ss.android.ugc.aweme.base.e.a((RemoteImageView) this.f117832k, avatarVideoUri, (com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f>) new f(this), false);
                        this.t = avatarVideoUri;
                    }
                    this.q = true;
                }
            }
        } else if (this.f25594h) {
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar2 = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar2 != null) {
                user = iVar2.f117705a;
            }
            if (!(urlModel == null || user == null)) {
                UrlModel avatarVideoUri2 = user.getAvatarVideoUri();
                if (avatarVideoUri2 == null || (urlList = avatarVideoUri2.getUrlList()) == null || urlList.isEmpty()) {
                    this.t = urlModel;
                    com.ss.android.ugc.aweme.base.e.a(this.f117832k, urlModel);
                } else if (!u() || !com.google.c.a.i.a(this.t, avatarVideoUri2)) {
                    com.ss.android.ugc.aweme.base.e.a((RemoteImageView) this.f117832k, avatarVideoUri2, (com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f>) new e(this), false);
                    this.t = avatarVideoUri2;
                }
            }
        }
        View view = this.f117833l;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        this.f117833l = view.findViewById(R.id.cwh);
        MusAvatarWithBorderView musAvatarWithBorderView = (MusAvatarWithBorderView) view.findViewById(R.id.bfb);
        this.f117832k = musAvatarWithBorderView;
        if (musAvatarWithBorderView != null) {
            ((CircleImageView) musAvatarWithBorderView).f68292f = true;
        }
        MusAvatarWithBorderView musAvatarWithBorderView2 = this.f117832k;
        if (musAvatarWithBorderView2 != null) {
            musAvatarWithBorderView2.setBorderColor(R.color.f159926j);
        }
        MusAvatarWithBorderView musAvatarWithBorderView3 = this.f117832k;
        if (musAvatarWithBorderView3 != null) {
            musAvatarWithBorderView3.setOnClickListener(new i(this, view));
        }
        this.f117834m = (AnimationImageView) view.findViewById(R.id.il);
        this.n = (SmartImageView) view.findViewById(R.id.dbp);
        com.bytedance.assem.arch.extensions.d.a(this, new k(this, view));
        com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), b.f117845a, new l(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.g.e.class), c.f117847a, new m(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), d.f117848a, new n(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), e.f117849a, new j(this));
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            ProfileBadgeStruct profileBadge;
            Long l2;
            User user;
            String str;
            long j2;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                a aVar3 = this.this$0;
                boolean isLive = t.isLive();
                if (aVar3.f117834m != null) {
                    com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(aVar3, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                    String str2 = null;
                    if (iVar != null) {
                        user = iVar.f117705a;
                    } else {
                        user = null;
                    }
                    if (!isLive || !com.ss.android.ugc.aweme.story.c.a()) {
                        MusAvatarWithBorderView musAvatarWithBorderView = aVar3.f117832k;
                        if (musAvatarWithBorderView != null) {
                            musAvatarWithBorderView.setBorderColor(R.color.f159928l);
                        }
                        AnimationImageView animationImageView = aVar3.f117834m;
                        if (animationImageView != null) {
                            animationImageView.d();
                        }
                        AnimationImageView animationImageView2 = aVar3.f117834m;
                        if (animationImageView2 != null) {
                            animationImageView2.setVisibility(8);
                        }
                    } else {
                        aVar3.ar_();
                        if (user != null) {
                            str = user.getRequestId();
                            str2 = user.getUid();
                        } else {
                            str = null;
                        }
                        if (user != null) {
                            j2 = user.roomId;
                        } else {
                            j2 = -1;
                        }
                        com.ss.android.ugc.aweme.story.live.d.a(true, 0, str, str2, j2);
                        MusAvatarWithBorderView musAvatarWithBorderView2 = aVar3.f117832k;
                        if (musAvatarWithBorderView2 != null) {
                            musAvatarWithBorderView2.setBorderColor(R.color.bh);
                        }
                        MusAvatarWithBorderView musAvatarWithBorderView3 = aVar3.f117832k;
                        if (musAvatarWithBorderView3 != null) {
                            musAvatarWithBorderView3.setBorderWidth(2);
                        }
                        AnimationImageView animationImageView3 = aVar3.f117834m;
                        if (animationImageView3 != null) {
                            animationImageView3.setVisibility(0);
                        }
                        AnimationImageView animationImageView4 = aVar3.f117834m;
                        if (animationImageView4 != null) {
                            animationImageView4.setAnimation("tag_profile_live.json");
                        }
                        AnimationImageView animationImageView5 = aVar3.f117834m;
                        if (animationImageView5 != null) {
                            animationImageView5.a();
                        }
                    }
                    ((ProfileStoryRingViewModel) aVar3.f117831j.getValue()).a("live");
                }
                this.this$0.a(t.getProfileBadge());
                if (!(t.getProfileBadge() == null || (profileBadge = t.getProfileBadge()) == null || !profileBadge.getShouldShow())) {
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage");
                    ProfileBadgeStruct profileBadge2 = t.getProfileBadge();
                    if (profileBadge2 != null) {
                        l2 = Long.valueOf(profileBadge2.getId());
                    } else {
                        l2 = "";
                    }
                    r.a("profile_badge_show", a2.a("badge_id", l2).a("group_id", "").a("author_id", "").f66730a);
                }
                this.this$0.q = false;
                this.this$0.a(com.ss.android.ugc.aweme.utils.u.a(t));
                if (this.this$0.p != null) {
                    com.ss.android.ugc.aweme.profile.g gVar = this.this$0.p;
                    if (gVar == null) {
                        h.f.b.l.b();
                    }
                    gVar.a((User) t);
                }
            }
            return z.f158842a;
        }
    }

    static final class p implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117843b;

        static {
            Covode.recordClassIndex(76347);
        }

        p(a aVar, String str) {
            this.f117842a = aVar;
            this.f117843b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.profile.f.p pVar;
            if (TextUtils.isEmpty(this.f117843b)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f117842a.ar_()).a(R.string.fhb).a();
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("SD card is not available"));
            } else if (i2 == 0) {
                com.ss.android.ugc.aweme.profile.presenter.a aVar = this.f117842a.o;
                if (aVar != null && (pVar = aVar.f116508b) != null) {
                    pVar.e(0);
                }
            } else if (i2 == 1) {
                this.f117842a.y();
            }
        }
    }
}
