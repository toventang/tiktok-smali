package com.ss.android.ugc.aweme.profile.widgets.recommend.user;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.dialog.b;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus;
import com.ss.android.ugc.aweme.profile.ui.cw;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.profile.ui.widget.i;
import com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.z;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class f extends a implements b, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final c o = new c((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public RecommendCommonUserViewMus f118063j;

    /* renamed from: k  reason: collision with root package name */
    public View f118064k;

    /* renamed from: l  reason: collision with root package name */
    public TuxIconView f118065l;

    /* renamed from: m  reason: collision with root package name */
    public float f118066m;
    public View n;
    private final com.bytedance.assem.arch.viewModel.b p;

    public static final class b extends h.f.b.m implements h.f.a.b<e, e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(76638);
        }

        public b() {
            super(1);
        }

        public final e invoke(e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(76636);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(68, new org.greenrobot.eventbus.g(f.class, "onRefreshMessageButton", com.ss.android.ugc.aweme.im.service.b.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final UserProfileRecommendUserVM u() {
        return (UserProfileRecommendUserVM) this.p.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(76639);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.recommend.user.b
    public final void a() {
        u().k();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.recommend.user.b
    public final void b() {
        u().f118039l = true;
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118067a;

        static {
            Covode.recordClassIndex(76640);
        }

        d(f fVar) {
            this.f118067a = fVar;
        }

        public final void run() {
            float f2;
            f fVar = this.f118067a;
            View view = fVar.n;
            if (view != null) {
                f2 = (float) view.getHeight();
            } else {
                f2 = 0.0f;
            }
            fVar.f118066m = f2;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.recommend.user.a, com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        EventBus.a().b(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public final void v() {
        RecommendCommonUserViewMus recommendCommonUserViewMus = this.f118063j;
        if (recommendCommonUserViewMus != null) {
            recommendCommonUserViewMus.getAdapter().f();
        }
        u().m();
        u().a(UserProfileRecommendUserVM.b.f118041a);
    }

    public static final class k implements RecommendCommonUserViewMus.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118070a;

        static {
            Covode.recordClassIndex(76649);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus.b
        public final void a() {
            User user;
            Context ar_ = this.f118070a.ar_();
            if (ar_ != null) {
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.f118070a, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                if (iVar != null) {
                    user = iVar.f117705a;
                } else {
                    user = null;
                }
                FollowRelationTabActivity.c.a(ar_, user, "suggest_user");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(f fVar) {
            this.f118070a = fVar;
        }
    }

    public f() {
        h.k.c a2 = ab.a(UserProfileRecommendUserVM.class);
        this.p = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), b.INSTANCE, u.b(this), u.c(this));
    }

    public static final class m implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118072a;

        static {
            Covode.recordClassIndex(76651);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(f fVar) {
            this.f118072a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.i.b
        public final void b(User user) {
            h.f.b.l.d(user, "");
            this.f118072a.u().m();
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.i.b
        public final void c(User user) {
            h.f.b.l.d(user, "");
            UserProfileRecommendUserVM u = this.f118072a.u();
            int followStatus = user.getFollowStatus();
            h.f.b.l.d(user, "");
            u.b(new UserProfileRecommendUserVM.g(u, followStatus, user));
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.i.b
        public final void d(User user) {
            h.f.b.l.d(user, "");
            UserProfileRecommendUserVM u = this.f118072a.u();
            h.f.b.l.d(user, "");
            u.b(new UserProfileRecommendUserVM.f(u, user));
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.i.b
        public final void a(User user) {
            String str;
            h.f.b.l.d(user, "");
            UserProfileRecommendUserVM u = this.f118072a.u();
            if (user != null) {
                ac acVar = (ac) com.bytedance.assem.arch.service.d.a(u, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (acVar != null) {
                    str = acVar.f117243a;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.recommend.users.b bVar = com.ss.android.ugc.aweme.recommend.users.b.f120122a;
                String uid = user.getUid();
                h.f.b.l.b(uid, "");
                bVar.a(uid, user.getSecUid());
                u.a(new UserProfileRecommendUserVM.m(user, str));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$f  reason: collision with other inner class name */
    static final class View$OnClickListenerC3016f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118069a;

        static {
            Covode.recordClassIndex(76643);
        }

        View$OnClickListenerC3016f(f fVar) {
            this.f118069a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f118069a.u().k();
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(com.ss.android.ugc.aweme.im.service.b.c cVar) {
        h.f.b.l.d(cVar, "");
        RecommendCommonUserViewMus recommendCommonUserViewMus = this.f118063j;
        if (recommendCommonUserViewMus != null) {
            recommendCommonUserViewMus.f116805e.notifyDataSetChanged();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<RecommendList, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(RecommendList recommendList) {
            final String str;
            final RecommendList recommendList2 = recommendList;
            if (this.this$0.f118063j != null) {
                ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (acVar != null) {
                    str = acVar.f117243a;
                } else {
                    str = null;
                }
                f.a(this.this$0.u(), new h.f.a.b<e, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(76645);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(e eVar) {
                        List<User> list;
                        e eVar2 = eVar;
                        h.f.b.l.d(eVar2, "");
                        boolean z = !eVar2.f118060e;
                        RecommendCommonUserViewMus recommendCommonUserViewMus = this.this$0.this$0.f118063j;
                        if (recommendCommonUserViewMus != null) {
                            RecommendList recommendList = recommendList2;
                            String str = null;
                            if (recommendList != null) {
                                list = recommendList.getUserList();
                            } else {
                                list = null;
                            }
                            RecommendList recommendList2 = recommendList2;
                            if (recommendList2 != null) {
                                str = recommendList2.getRid();
                            }
                            recommendCommonUserViewMus.a(list, str, str, z);
                        }
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class l<T extends RecyclerView.ViewHolder> implements com.ss.android.ugc.aweme.common.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118071a;

        static {
            Covode.recordClassIndex(76650);
        }

        l(f fVar) {
            this.f118071a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.common.d.c
        public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder) {
            cw cwVar = (cw) viewHolder;
            if (cwVar != null) {
                User user = cwVar.f117105e;
                if (user == null) {
                    h.f.b.l.a("mUser");
                    return;
                }
                UserProfileRecommendUserVM u = this.f118071a.u();
                h.f.b.l.d(user, "");
                u.b(new UserProfileRecommendUserVM.j(u, user));
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<e, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            ViewGroup.LayoutParams layoutParams;
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            if (eVar2.f118061f != 2) {
                this.this$0.u();
                if (UserProfileRecommendUserVM.j() && this.this$0.n != null) {
                    View view = this.this$0.n;
                    if (view != null) {
                        view.post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.e.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ e f118068a;

                            static {
                                Covode.recordClassIndex(76642);
                            }

                            {
                                this.f118068a = r1;
                            }

                            public final void run() {
                                float f2;
                                if (this.f118068a.this$0.n != null) {
                                    f fVar = this.f118068a.this$0;
                                    View view = this.f118068a.this$0.n;
                                    if (view != null) {
                                        f2 = (float) view.getHeight();
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    fVar.f118066m = f2;
                                }
                            }
                        });
                    }
                    View view2 = this.this$0.n;
                    if (view2 != null) {
                        layoutParams = view2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = -2;
                    View view3 = this.this$0.n;
                    if (view3 != null) {
                        view3.setLayoutParams(layoutParams2);
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            User user;
            if (aVar != null) {
                UserProfileRecommendUserVM u = this.this$0.u();
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                if (iVar != null) {
                    user = iVar.f117705a;
                } else {
                    user = null;
                }
                u.f118038k = user;
                this.this$0.u();
                if (UserProfileRecommendUserVM.j()) {
                    TuxIconView tuxIconView = this.this$0.f118065l;
                    if (tuxIconView != null) {
                        tuxIconView.setVisibility(0);
                    }
                    f fVar = this.this$0;
                    f.a(fVar.u(), new e(fVar));
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f118074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f118075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f118076d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.b f118077e;

        static {
            Covode.recordClassIndex(76655);
        }

        q(f fVar, View view, View view2, float f2, z.b bVar) {
            this.f118073a = fVar;
            this.f118074b = view;
            this.f118075c = view2;
            this.f118076d = f2;
            this.f118077e = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f118074b;
            View view2 = this.f118075c;
            float f2 = this.f118076d;
            float f3 = this.f118077e.element;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            layoutParams.height = (int) (((float) h.g.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics()))) * floatValue);
            view.setLayoutParams(layoutParams);
            float f4 = 1.0f - floatValue;
            view2.setAlpha(f4);
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.height = (int) (f4 * f2);
            view2.setLayoutParams(layoutParams3);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.recommend.user.b
    public final void a(int i2) {
        User user;
        UserProfileRecommendUserVM u = u();
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.a(u, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        ac acVar = (ac) com.bytedance.assem.arch.service.d.a(u, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        String str = null;
        if (iVar != null) {
            user = iVar.f117705a;
        } else {
            user = null;
        }
        if ((!in.b(user, false) || com.ss.android.ugc.aweme.profile.experiment.k.b()) && UserProfileRecommendUserVM.j()) {
            if (acVar != null) {
                str = acVar.f117244b;
            }
            if (TextUtils.isEmpty(str) || com.ss.android.ugc.aweme.profile.experiment.k.c()) {
                return;
            }
            if (UserProfileRecommendUserVM.j() && i2 != 0) {
                u.a(false);
            } else if (UserProfileRecommendUserVM.j() && i2 == 0) {
                u.m();
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            if (th2 instanceof Exception) {
                Context ar_ = this.this$0.ar_();
                Exception exc = (Exception) th2;
                if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
                    if (aVar.getErrorCode() != 2155) {
                        int errorCode = aVar.getErrorCode();
                        if (errorCode == 1001) {
                            try {
                                new b.a(ar_).b(aVar.getErrorMsg()).a(R.string.dlz, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0045: INVOKE  
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x0041: INVOKE  (r0v30 com.bytedance.ies.uikit.dialog.b$a) = 
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x0035: INVOKE  (r2v1 com.bytedance.ies.uikit.dialog.b$a) = 
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x002e: CONSTRUCTOR  (r1v7 com.bytedance.ies.uikit.dialog.b$a) = (r2v0 'ar_' android.content.Context) call: com.bytedance.ies.uikit.dialog.b.a.<init>(android.content.Context):void type: CONSTRUCTOR)
                                      (wrap: java.lang.String : 0x0031: INVOKE  (r0v28 java.lang.String) = (r5v3 'aVar' com.ss.android.ugc.aweme.base.api.a.b.a) type: VIRTUAL call: com.ss.android.ugc.aweme.base.api.a.b.a.getErrorMsg():java.lang.String)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.b(java.lang.CharSequence):com.bytedance.ies.uikit.dialog.b$a)
                                      (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.dlz int)
                                      (wrap: com.ss.android.ugc.aweme.account.api.a$1 : 0x003e: CONSTRUCTOR  (r0v29 com.ss.android.ugc.aweme.account.api.a$1) =  call: com.ss.android.ugc.aweme.account.api.a.1.<init>():void type: CONSTRUCTOR)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.a(int, android.content.DialogInterface$OnClickListener):com.bytedance.ies.uikit.dialog.b$a)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.c():com.bytedance.ies.uikit.dialog.b in method: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.h.invoke(java.lang.Throwable):h.z, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
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
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: INVOKE  (r0v30 com.bytedance.ies.uikit.dialog.b$a) = 
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x0035: INVOKE  (r2v1 com.bytedance.ies.uikit.dialog.b$a) = 
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x002e: CONSTRUCTOR  (r1v7 com.bytedance.ies.uikit.dialog.b$a) = (r2v0 'ar_' android.content.Context) call: com.bytedance.ies.uikit.dialog.b.a.<init>(android.content.Context):void type: CONSTRUCTOR)
                                      (wrap: java.lang.String : 0x0031: INVOKE  (r0v28 java.lang.String) = (r5v3 'aVar' com.ss.android.ugc.aweme.base.api.a.b.a) type: VIRTUAL call: com.ss.android.ugc.aweme.base.api.a.b.a.getErrorMsg():java.lang.String)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.b(java.lang.CharSequence):com.bytedance.ies.uikit.dialog.b$a)
                                      (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.dlz int)
                                      (wrap: com.ss.android.ugc.aweme.account.api.a$1 : 0x003e: CONSTRUCTOR  (r0v29 com.ss.android.ugc.aweme.account.api.a$1) =  call: com.ss.android.ugc.aweme.account.api.a.1.<init>():void type: CONSTRUCTOR)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.a(int, android.content.DialogInterface$OnClickListener):com.bytedance.ies.uikit.dialog.b$a in method: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.h.invoke(java.lang.Throwable):h.z, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 39 more
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003e: CONSTRUCTOR  (r0v29 com.ss.android.ugc.aweme.account.api.a$1) =  call: com.ss.android.ugc.aweme.account.api.a.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.h.invoke(java.lang.Throwable):h.z, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 45 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.account.api.a, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 51 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 222
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.h.invoke(java.lang.Object):java.lang.Object");
                            }
                        }

                        static final class p extends h.f.b.m implements h.f.a.b<e, h.z> {
                            final /* synthetic */ int $recommendUserOpenType$inlined;
                            final /* synthetic */ TuxIconView $this_apply;
                            final /* synthetic */ f this$0;

                            static {
                                Covode.recordClassIndex(76654);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            p(TuxIconView tuxIconView, f fVar, int i2) {
                                super(1);
                                this.$this_apply = tuxIconView;
                                this.this$0 = fVar;
                                this.$recommendUserOpenType$inlined = i2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
                            @Override // h.f.a.b
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.profile.widgets.recommend.user.e r8) {
                                /*
                                // Method dump skipped, instructions count: 215
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.p.invoke(java.lang.Object):java.lang.Object");
                            }
                        }

                        @Override // com.bytedance.assem.arch.core.p
                        public final void b(View view) {
                            UserProfileRecommendUserVM userProfileRecommendUserVM;
                            int i2;
                            h.f.b.l.d(view, "");
                            this.n = view.findViewById(R.id.fdc);
                            this.f118064k = view.findViewById(R.id.cg8);
                            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.dim);
                            this.f118065l = tuxIconView;
                            if (tuxIconView != null) {
                                u();
                                if (UserProfileRecommendUserVM.j()) {
                                    i2 = 0;
                                } else {
                                    i2 = 8;
                                }
                                tuxIconView.setVisibility(i2);
                                tuxIconView.setOnClickListener(new View$OnClickListenerC3016f(this));
                            }
                            RecommendCommonUserViewMus recommendCommonUserViewMus = (RecommendCommonUserViewMus) view.findViewById(R.id.dic);
                            this.f118063j = recommendCommonUserViewMus;
                            if (recommendCommonUserViewMus != null) {
                                recommendCommonUserViewMus.setSeeAllListener(new k(this));
                            }
                            RecommendCommonUserViewMus recommendCommonUserViewMus2 = this.f118063j;
                            if (recommendCommonUserViewMus2 != null) {
                                recommendCommonUserViewMus2.setOnViewAttachedToWindowListener(new l(this));
                            }
                            RecommendCommonUserViewMus recommendCommonUserViewMus3 = this.f118063j;
                            if (recommendCommonUserViewMus3 != null) {
                                recommendCommonUserViewMus3.setOnItemOperationListener(new m(this));
                            }
                            com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), j.f118081a, k.f118082a, new n(this));
                            com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), l.f118083a, new o(this));
                            AssemViewModel.a(u(), g.f118078a, null, new h(this), null, new g(this), 10);
                            f.a.a(this, u(), h.f118079a, (com.bytedance.assem.arch.viewModel.k) null, new i(this), 6);
                            f.a.a(this, u(), i.f118080a, (com.bytedance.assem.arch.viewModel.k) null, new j(this), 6);
                            RecommendCommonUserViewMus recommendCommonUserViewMus4 = this.f118063j;
                            if (recommendCommonUserViewMus4 != null) {
                                recommendCommonUserViewMus4.setViewModel(u());
                            }
                            RecommendCommonUserViewMus recommendCommonUserViewMus5 = this.f118063j;
                            if (recommendCommonUserViewMus5 != null && (userProfileRecommendUserVM = recommendCommonUserViewMus5.f116809i) != null) {
                                com.ss.android.ugc.aweme.profile.ui.widget.i iVar = recommendCommonUserViewMus5.f116805e;
                                f.a.b.a aVar = userProfileRecommendUserVM.f118037j;
                                h.f.b.l.d(aVar, "");
                                iVar.f117436i = aVar;
                            }
                        }

                        static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Integer, h.z> {
                            final /* synthetic */ f this$0;

                            static {
                                Covode.recordClassIndex(76648);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            j(f fVar) {
                                super(2);
                                this.this$0 = fVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.core.p pVar, Integer num) {
                                RecommendCommonUserViewMus recommendCommonUserViewMus;
                                int intValue = num.intValue();
                                h.f.b.l.d(pVar, "");
                                if (intValue > 0 && (recommendCommonUserViewMus = this.this$0.f118063j) != null) {
                                    recommendCommonUserViewMus.a();
                                }
                                return h.z.f158842a;
                            }
                        }

                        static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.extensions.a<? extends h.z>, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {
                            final /* synthetic */ f this$0;

                            static {
                                Covode.recordClassIndex(76652);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            n(f fVar) {
                                super(2);
                                this.this$0 = fVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends h.z> aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
                                ViewGroup.LayoutParams layoutParams;
                                if (aVar != null) {
                                    f fVar = this.this$0;
                                    fVar.f118066m = com.bytedance.common.utility.n.b(fVar.ar_(), 20.0f);
                                    View view = fVar.n;
                                    if (view != null) {
                                        view.post(new d(fVar));
                                    }
                                    View view2 = fVar.n;
                                    if (view2 != null) {
                                        layoutParams = view2.getLayoutParams();
                                    } else {
                                        layoutParams = null;
                                    }
                                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                    layoutParams2.height = -2;
                                    View view3 = fVar.n;
                                    if (view3 != null) {
                                        view3.setLayoutParams(layoutParams2);
                                    }
                                    fVar.v();
                                }
                                if (aVar2 != null) {
                                    this.this$0.v();
                                }
                                return h.z.f158842a;
                            }
                        }

                        static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Integer, h.z> {
                            final /* synthetic */ f this$0;

                            static {
                                Covode.recordClassIndex(76647);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            i(f fVar) {
                                super(2);
                                this.this$0 = fVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.core.p pVar, Integer num) {
                                TuxIconView tuxIconView;
                                int intValue = num.intValue();
                                h.f.b.l.d(pVar, "");
                                f fVar = this.this$0;
                                fVar.u();
                                if (UserProfileRecommendUserVM.j() && (tuxIconView = fVar.f118065l) != null) {
                                    if (intValue == 0) {
                                        tuxIconView.clearAnimation();
                                        tuxIconView.setIconRes(R.raw.icon_arrow_triangle_down_fill);
                                        tuxIconView.animate().rotation(360.0f).start();
                                        View view = fVar.f118064k;
                                        if (view != null) {
                                            view.setBackgroundResource(R.drawable.b78);
                                        }
                                        fVar.a(false, (View) fVar.f118063j, fVar.n, fVar.f118066m);
                                    } else if (intValue == 1) {
                                        tuxIconView.clearAnimation();
                                        tuxIconView.setIconRes(R.raw.icon_spinner_normal);
                                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                                        rotateAnimation.setRepeatCount(-1);
                                        rotateAnimation.setRepeatMode(1);
                                        rotateAnimation.setDuration(600);
                                        tuxIconView.startAnimation(rotateAnimation);
                                        tuxIconView.setRotation(180.0f);
                                    } else if (intValue == 2) {
                                        f.a(fVar.u(), new p(tuxIconView, fVar, intValue));
                                    } else if (intValue == 3) {
                                        tuxIconView.clearAnimation();
                                        tuxIconView.setIconRes(R.raw.icon_arrow_triangle_down_fill);
                                        View view2 = fVar.f118064k;
                                        if (view2 != null) {
                                            view2.setBackgroundResource(R.drawable.b78);
                                        }
                                    }
                                }
                                return h.z.f158842a;
                            }
                        }

                        public final void a(boolean z, View view, View view2, float f2) {
                            ValueAnimator ofFloat;
                            if (view != null && view2 != null) {
                                if (z) {
                                    ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    h.f.b.l.b(ofFloat, "");
                                } else {
                                    ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                    h.f.b.l.b(ofFloat, "");
                                }
                                ofFloat.setDuration(300L);
                                z.b bVar = new z.b();
                                bVar.element = 0.0f;
                                if (view instanceof RecommendCommonUserViewMus) {
                                    bVar.element = ((RecommendCommonUserViewMus) view).getViewHeightFromInnerAdapter() + 72.0f;
                                }
                                ofFloat.addUpdateListener(new q(this, view, view2, f2, bVar));
                                ofFloat.start();
                            }
                        }
                    }
