package com.ss.android.ugc.aweme.profile.widgets.follow;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.profile.api.RelationCheckApi;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.tip.FollowRequestTipView;
import com.ss.android.ugc.aweme.profile.ui.dd;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends e implements WeakHandler.IHandler, c, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: j  reason: collision with root package name */
    public dd f117784j;

    /* renamed from: k  reason: collision with root package name */
    public TuxButton f117785k;

    /* renamed from: l  reason: collision with root package name */
    String f117786l;

    /* renamed from: m  reason: collision with root package name */
    private FollowRequestTipView f117787m;
    private final com.bytedance.assem.arch.extensions.i n = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    private final com.bytedance.assem.arch.viewModel.b o;
    private View p;
    private String q;
    private boolean r;

    public static final class b extends h.f.b.m implements h.f.a.b<o, o> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(76285);
        }

        public b() {
            super(1);
        }

        public final o invoke(o oVar) {
            h.f.b.l.c(oVar, "");
            return oVar;
        }
    }

    static {
        Covode.recordClassIndex(76278);
    }

    private final com.ss.android.ugc.aweme.profile.widgets.h.a.b z() {
        return (com.ss.android.ugc.aweme.profile.widgets.h.a.b) this.n.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(69, new org.greenrobot.eventbus.g(f.class, "onEvent", com.ss.android.ugc.aweme.notificationlive.i.class, ThreadMode.POSTING, 0, false));
        hashMap.put(36, new org.greenrobot.eventbus.g(f.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(22, new org.greenrobot.eventbus.g(f.class, "onMobRequestIdEvent", com.ss.android.ugc.aweme.feed.i.q.class, ThreadMode.POSTING, 0, false));
        hashMap.put(68, new org.greenrobot.eventbus.g(f.class, "onRefreshMessageButton", com.ss.android.ugc.aweme.im.service.b.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final UserProfileFollowVM u() {
        return (UserProfileFollowVM) this.o.getValue();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ d e() {
        return new d();
    }

    static final class i implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117797a;

        static {
            Covode.recordClassIndex(76292);
        }

        i(f fVar) {
            this.f117797a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f117797a.u().a(a.START);
        }
    }

    private final String A() {
        b bVar;
        com.ss.android.ugc.aweme.profile.widgets.h.a.b z2 = z();
        if (z2 == null || (bVar = z2.f117886f) == null) {
            return null;
        }
        return bVar.f117778e;
    }

    private static boolean B() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.ss.android.ugc.aweme.profile.widgets.follow.e, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        EventBus.a().b(this);
    }

    public final String x() {
        com.ss.android.ugc.aweme.profile.widgets.h.a.b z2 = z();
        if (z2 != null) {
            return z2.f117883c;
        }
        return null;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76279);
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

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.follow.f.c.invoke():java.lang.Object");
        }
    }

    public final User v() {
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null) {
            return iVar.f117705a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Aweme w() {
        com.ss.android.ugc.aweme.profile.ui.v2.ac acVar = (com.ss.android.ugc.aweme.profile.ui.v2.ac) com.bytedance.assem.arch.service.d.f(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117249g;
        }
        return null;
    }

    static final class ad extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ FollowRequestTipView $this_apply;
        final /* synthetic */ User $user$inlined;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(FollowRequestTipView followRequestTipView, f fVar, User user) {
            super(0);
            this.$this_apply = followRequestTipView;
            this.this$0 = fVar;
            this.$user$inlined = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            String str;
            INoticeService f2 = NoticeServiceImpl.f();
            WeakHandler weakHandler = new WeakHandler(this.this$0);
            String uid = this.$user$inlined.getUid();
            h.f.b.l.b(uid, "");
            f2.a(weakHandler, uid);
            this.$this_apply.b();
            String x = this.this$0.x();
            if (x == null) {
                x = "";
            }
            String uid2 = this.$user$inlined.getUid();
            h.f.b.l.b(uid2, "");
            com.ss.android.ugc.aweme.profile.ui.v2.y.a(x, uid2, 1);
            String uid3 = this.$user$inlined.getUid();
            h.f.b.l.b(uid3, "");
            if (this.$user$inlined.getFollowStatus() == 1) {
                str = "mutual";
            } else {
                str = "single";
            }
            h.f.b.l.d(uid3, "");
            h.f.b.l.d(str, "");
            com.ss.android.ugc.aweme.common.r.a("follow_approve", new com.ss.android.ugc.aweme.app.f.d().a("to_user_id", uid3).a("enter_from", "others_homepage").a("follow_type", str).f66730a);
            return h.z.f158842a;
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ FollowRequestTipView $this_apply;
        final /* synthetic */ User $user$inlined;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(FollowRequestTipView followRequestTipView, f fVar, User user) {
            super(0);
            this.$this_apply = followRequestTipView;
            this.this$0 = fVar;
            this.$user$inlined = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            INoticeService f2 = NoticeServiceImpl.f();
            WeakHandler weakHandler = new WeakHandler(this.this$0);
            String uid = this.$user$inlined.getUid();
            h.f.b.l.b(uid, "");
            f2.b(weakHandler, uid);
            this.$this_apply.b();
            String x = this.this$0.x();
            if (x == null) {
                x = "";
            }
            String uid2 = this.$user$inlined.getUid();
            h.f.b.l.b(uid2, "");
            com.ss.android.ugc.aweme.profile.ui.v2.y.a(x, uid2, 0);
            String uid3 = this.$user$inlined.getUid();
            h.f.b.l.b(uid3, "");
            h.f.b.l.d(uid3, "");
            com.ss.android.ugc.aweme.common.r.a("follow_refuse", new com.ss.android.ugc.aweme.app.f.d().a("to_user_id", uid3).a("enter_from", "others_homepage").f66730a);
            return h.z.f158842a;
        }
    }

    public f() {
        h.k.c a2 = h.f.b.ab.a(UserProfileFollowVM.class);
        this.o = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), com.bytedance.assem.arch.extensions.u.a(this), b.INSTANCE, com.bytedance.assem.arch.extensions.u.b(this), com.bytedance.assem.arch.extensions.u.c(this));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.follow.c
    public final void a() {
        User v2;
        u();
        com.ss.android.ugc.aweme.common.r.a("click_remove_fans", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").f66730a);
        a.C0731a a2 = new a.C0731a(ar_()).a(R.string.fc6);
        Context ar_ = ar_();
        if (ar_ == null) {
            h.f.b.l.b();
        }
        String string = ar_.getResources().getString(R.string.fc5);
        h.f.b.l.b(string, "");
        String a3 = com.a.a(string, Arrays.copyOf(new Object[]{in.b(v())}, 1));
        h.f.b.l.b(a3, "");
        a2.f33402b = a3;
        Dialog c2 = a2.b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.fc4, (DialogInterface.OnClickListener) new ac(this), false).a().c();
        if (c2.findViewById(R.id.f67) instanceof TextView) {
            View findViewById = c2.findViewById(R.id.f67);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById;
            Context ar_2 = ar_();
            if (ar_2 == null) {
                h.f.b.l.b();
            }
            textView.setTextColor(androidx.core.content.b.c(ar_2, R.color.gr));
        }
        if (TextUtils.equals(x(), "follow_request_page") && this.r) {
            FollowRequestTipView followRequestTipView = this.f117787m;
            if (followRequestTipView == null) {
                h.f.b.l.a("followRequestTip");
            }
            if (followRequestTipView.f116712c && (v2 = v()) != null && v2.isBlock) {
                FollowRequestTipView followRequestTipView2 = this.f117787m;
                if (followRequestTipView2 == null) {
                    h.f.b.l.a("followRequestTip");
                }
                followRequestTipView2.b();
                User v3 = v();
                if (v3 == null) {
                    h.f.b.l.b();
                }
                String uid = v3.getUid();
                h.f.b.l.b(uid, "");
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.b.b(uid, -101));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0619, code lost:
        if (r19 == false) goto L_0x01b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x05df  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
        // Method dump skipped, instructions count: 1746
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.follow.f.y():void");
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117792a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f117793b;

        static {
            Covode.recordClassIndex(76288);
        }

        e(f fVar, int i2) {
            this.f117792a = fVar;
            this.f117793b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f117792a.a(this.f117793b);
        }
    }

    static final class aa implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117788a;

        static {
            Covode.recordClassIndex(76280);
        }

        aa(f fVar) {
            this.f117788a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117788a.a((String) null);
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117805a;

        static {
            Covode.recordClassIndex(76298);
        }

        o(f fVar) {
            this.f117805a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f fVar = this.f117805a;
            h.f.b.l.b(view, "");
            fVar.c(view);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<FollowStatus, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowStatus followStatus) {
            FollowStatus followStatus2 = followStatus;
            if (followStatus2 != null) {
                this.this$0.a(followStatus2);
            }
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f117806a = new v();

        static {
            Covode.recordClassIndex(76305);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            if (dVar2 != null) {
                return new d(dVar2.f117781a);
            }
            return null;
        }
    }

    static final class w implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117807a;

        static {
            Covode.recordClassIndex(76306);
        }

        w(f fVar) {
            this.f117807a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f fVar = this.f117807a;
            h.f.b.l.b(view, "");
            fVar.c(view);
        }
    }

    static final class x implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117808a;

        static {
            Covode.recordClassIndex(76307);
        }

        x(f fVar) {
            this.f117808a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f fVar = this.f117808a;
            h.f.b.l.b(view, "");
            fVar.c(view);
        }
    }

    static final class y implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117809a;

        static {
            Covode.recordClassIndex(76308);
        }

        y(f fVar) {
            this.f117809a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f fVar = this.f117809a;
            h.f.b.l.b(view, "");
            fVar.c(view);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onMobRequestIdEvent(com.ss.android.ugc.aweme.feed.i.q qVar) {
        h.f.b.l.d(qVar, "");
        this.q = qVar.f93489a;
    }

    public static final class n implements t.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowStatus f117804b;

        static {
            Covode.recordClassIndex(76297);
        }

        @Override // com.ss.android.ugc.aweme.notificationlive.t.a
        public final void a(User user) {
            j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this.f117803a, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), user, null, false, 6);
        }

        n(f fVar, FollowStatus followStatus) {
            this.f117803a = fVar;
            this.f117804b = followStatus;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(f fVar) {
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
                this.this$0.a((Exception) th2);
            }
            return h.z.f158842a;
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                this.this$0.a(t.getFollowStatus());
                dd ddVar = this.this$0.f117784j;
                if (ddVar != null) {
                    int followStatus = t.getFollowStatus();
                    int followerStatus = t.getFollowerStatus();
                    if (followStatus == 0 && followerStatus == 1) {
                        ddVar.d().setText(com.bytedance.ies.ugc.appcontext.d.a().getResources().getText(R.string.byt));
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            int i2;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || !aVar2.f25631b.booleanValue() || this.this$0.f117784j == null)) {
                User v = this.this$0.v();
                if (v != null) {
                    i2 = v.getFollowStatus();
                } else {
                    i2 = 0;
                }
                dd.a(i2, this.this$0.v(), false);
            }
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            Throwable a2 = com.ss.android.ugc.aweme.app.api.b.a.a(th2);
            if (a2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.app.api.b.a.a(this.this$0.ar_(), (com.ss.android.ugc.aweme.base.api.a.b.a) a2);
            } else {
                com.ss.android.ugc.aweme.framework.a.a.a(a2);
            }
            return h.z.f158842a;
        }
    }

    static final class z implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117810a;

        static {
            Covode.recordClassIndex(76309);
        }

        z(f fVar) {
            this.f117810a = fVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            TuxButton tuxButton = this.f117810a.f117785k;
            if (tuxButton == null) {
                h.f.b.l.a("sendButtonView");
            }
            String obj = tuxButton.getText().toString();
            h.f.b.l.b(view, "");
            if (h.f.b.l.a((Object) obj, (Object) view.getResources().getString(R.string.d3z))) {
                str = "message";
            } else {
                str = "sayhi";
            }
            this.f117810a.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.follow.c
    public final void a(Exception exc) {
        androidx.fragment.app.i iVar;
        h.f.b.l.d(exc, "");
        if (this.f25594h) {
            if (com.ss.android.ugc.aweme.profile.service.h.f116622a.shouldDoCaptcha(exc)) {
                com.ss.android.ugc.aweme.profile.service.h hVar = com.ss.android.ugc.aweme.profile.service.h.f116622a;
                Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this);
                if (a2 != null) {
                    iVar = a2.getChildFragmentManager();
                } else {
                    iVar = null;
                }
                hVar.showCaptchaDialog(iVar, (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new m(this, exc));
                return;
            }
            Activity a3 = com.ss.android.ugc.aweme.base.utils.o.a(ar_());
            h.f.b.l.b(a3, "");
            com.ss.android.ugc.aweme.common.l.a(a3, exc);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        String str;
        h.f.b.l.d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        String str2 = followStatus.userId;
        User v2 = v();
        if (v2 != null) {
            str = v2.getUid();
        } else {
            str = null;
        }
        if (TextUtils.equals(str2, str)) {
            a(v(), followStatus.followStatus);
            com.ss.android.ugc.aweme.profile.widgets.relations.d dVar = (com.ss.android.ugc.aweme.profile.widgets.relations.d) com.bytedance.assem.arch.service.d.e(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.relations.d.class));
            if (dVar != null) {
                dVar.a(followStatus);
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(com.ss.android.ugc.aweme.im.service.b.c cVar) {
        String str;
        dd ddVar;
        h.f.b.l.d(cVar, "");
        String str2 = cVar.f103829a;
        if (str2 != null) {
            User v2 = v();
            if (v2 != null) {
                str = v2.getUid();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) str2, (Object) str) && (ddVar = this.f117784j) != null) {
                ddVar.c().setText(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.d3z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f117791b;

        static {
            Covode.recordClassIndex(76287);
        }

        d(f fVar, int i2) {
            this.f117790a = fVar;
            this.f117791b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            com.ss.android.ugc.aweme.profile.api.j jVar = (com.ss.android.ugc.aweme.profile.api.j) obj;
            h.f.b.l.d(jVar, "");
            List<com.ss.android.ugc.aweme.profile.api.i> list = jVar.f116017a;
            if (list == null || list.isEmpty()) {
                this.f117790a.a(this.f117791b);
            }
            dd ddVar = this.f117790a.f117784j;
            if (ddVar != null) {
                User v = this.f117790a.v();
                User v2 = this.f117790a.v();
                if (v2 != null) {
                    str = v2.getUid();
                } else {
                    str = null;
                }
                int i2 = this.f117791b;
                if (list == null) {
                    h.f.b.l.b();
                }
                ddVar.a(v, str, i2, list.get(0).f116016a);
            }
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<BaseResponse, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseResponse baseResponse) {
            User v;
            if (baseResponse != null) {
                User v2 = this.this$0.v();
                if (v2 != null) {
                    v2.setFollowerStatus(0);
                }
                User v3 = this.this$0.v();
                if (!(v3 == null || v3.getFollowStatus() != 2 || (v = this.this$0.v()) == null)) {
                    v.setFollowStatus(1);
                }
                j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this.this$0, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), this.this$0.v(), null, false, 6);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Object obj;
        User v2 = v();
        if (v2 != null) {
            BaseResponse baseResponse = null;
            if (message != null) {
                obj = message.obj;
            } else {
                obj = null;
            }
            if (obj instanceof BaseResponse) {
                baseResponse = obj;
            }
            BaseResponse baseResponse2 = baseResponse;
            if (baseResponse2 == null) {
                return;
            }
            if (NoticeServiceImpl.f().b(baseResponse2)) {
                String uid = v2.getUid();
                h.f.b.l.b(uid, "");
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.b.b(uid, -101));
            } else if (NoticeServiceImpl.f().a(baseResponse2)) {
                String uid2 = v2.getUid();
                h.f.b.l.b(uid2, "");
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.b.b(uid2, -100));
                v2.setFollowerStatus(1);
                if (v2.getFollowStatus() == 1) {
                    v2.setFollowStatus(2);
                }
                a(v2.getFollowStatus());
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.notificationlive.i iVar) {
        String str;
        User user;
        CommerceUserInfo commerceUserInfo;
        AwemeRawAd awemeRawAd;
        h.f.b.l.d(iVar, "");
        String str2 = iVar.f114324a;
        Aweme w2 = w();
        if (w2 == null || (awemeRawAd = w2.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd.getCreativeIdStr();
        }
        if (!(!h.f.b.l.a((Object) str2, (Object) str))) {
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar2 = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar2 != null) {
                user = iVar2.f117705a;
                if (!(user == null || (commerceUserInfo = user.getCommerceUserInfo()) == null)) {
                    commerceUserInfo.setNotificationConfig(iVar.f114325b ? 1 : 0);
                }
            } else {
                user = null;
            }
            j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), user, null, false, 6);
        }
    }

    public final void c(View view) {
        boolean z2;
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this);
        if (a2 != null) {
            z2 = a2.isAdded();
        } else {
            z2 = false;
        }
        if (this.f25594h && z2 && v() != null && ar_() != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 300)) {
            if (in.d()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.add).a();
                return;
            }
            ar_();
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = B();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                new com.bytedance.tux.g.b(view).e(R.string.de8).b();
                return;
            }
            if (!TextUtils.isEmpty(A())) {
                this.f117786l = A();
            }
            u().a(a.START);
        }
    }

    public final void a(int i2) {
        if (this.f25594h) {
            User v2 = v();
            String str = null;
            if (v2 == null || v2.getFollowStatus() != i2) {
                User v3 = v();
                if (v3 != null) {
                    v3.setFollowStatus(i2);
                }
                j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), v(), null, false, 6);
            }
            dd ddVar = this.f117784j;
            if (ddVar != null) {
                User v4 = v();
                User v5 = v();
                if (v5 != null) {
                    str = v5.getUid();
                }
                ddVar.a(v4, str, i2, 0);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        String str;
        h.f.b.l.d(view, "");
        view.findViewById(R.id.d_g).setOnClickListener(new o(this));
        View findViewById = view.findViewById(R.id.d_g);
        h.f.b.l.b(findViewById, "");
        this.p = findViewById;
        ((TuxButton) view.findViewById(R.id.b7o)).setOnClickListener(new w(this));
        ((TextView) view.findViewById(R.id.dm0)).setOnClickListener(new x(this));
        ((RelativeLayout) view.findViewById(R.id.b7p)).setOnClickListener(new y(this));
        View findViewById2 = view.findViewById(R.id.dyq);
        h.f.b.l.b(findViewById2, "");
        TuxButton tuxButton = (TuxButton) findViewById2;
        this.f117785k = tuxButton;
        if (tuxButton == null) {
            h.f.b.l.a("sendButtonView");
        }
        tuxButton.setOnClickListener(new z(this));
        view.findViewById(R.id.anu).setOnClickListener(new aa(this));
        View findViewById3 = view.findViewById(R.id.b7v);
        h.f.b.l.b(findViewById3, "");
        this.f117787m = (FollowRequestTipView) findViewById3;
        this.f117784j = new dd(view);
        com.bytedance.assem.arch.service.d.a(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), k.f117815a, new ab(this));
        com.bytedance.assem.arch.service.d.a(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), l.f117816a, new p(this));
        AssemViewModel.a(u(), h.f117812a, null, new r(this), null, new q(this), 10);
        AssemViewModel.a(u(), i.f117813a, null, new t(this), null, new s(this), 10);
        f.a.a(this, u(), j.f117814a, (com.bytedance.assem.arch.viewModel.k) null, new u(this), 6);
        com.ss.android.ugc.aweme.profile.ui.v2.ac acVar = (com.ss.android.ugc.aweme.profile.ui.v2.ac) com.bytedance.assem.arch.service.d.f(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            str = acVar.f117246d;
        } else {
            str = null;
        }
        this.f117786l = str;
        v vVar = v.f117806a;
        Class<f> cls = f.class;
        Class<?>[] interfaces = cls.getInterfaces();
        h.f.b.l.a((Object) interfaces, "");
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : interfaces) {
            if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls2)) {
                arrayList.add(cls2);
            }
        }
        while (true) {
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    break;
                }
                Class<?>[] interfaces2 = cls.getInterfaces();
                h.f.b.l.a((Object) interfaces2, "");
                arrayList = new ArrayList();
                for (Class<?> cls3 : interfaces2) {
                    if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls3)) {
                        arrayList.add(cls3);
                    }
                }
            } else {
                com.bytedance.assem.arch.core.e eVar = bx_().f25534g;
                Object g2 = h.a.n.g((List) arrayList2);
                if (g2 != null) {
                    eVar.a((Class) g2, vVar);
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            }
        }
        dd ddVar = this.f117784j;
        if (ddVar != null) {
            ddVar.b().setVisibility(8);
            ddVar.f().setVisibility(8);
        }
        dd ddVar2 = this.f117784j;
        if (ddVar2 != null) {
            com.ss.android.ugc.aweme.notification.g.a.a(ddVar2.a());
            com.ss.android.ugc.aweme.notification.g.a.a(ddVar2.c());
            com.ss.android.ugc.aweme.notification.g.a.a(ddVar2.e());
            com.ss.android.ugc.aweme.notification.g.a.a(ddVar2.f());
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.follow.c
    public final void a(FollowStatus followStatus) {
        String str;
        String str2;
        String str3;
        AwemeRawAd awemeRawAd;
        f.a.l.c<com.ss.android.ugc.aweme.notificationlive.a> a2;
        String str4;
        String str5;
        AwemeRawAd awemeRawAd2;
        User v2;
        if (followStatus != null) {
            if ((followStatus.followStatus == 1 || followStatus.followStatus == 2) && (v2 = v()) != null) {
                v2.setBlock(false);
            }
            Aweme w2 = w();
            String str6 = null;
            if (!(w2 == null || (awemeRawAd = w2.getAwemeRawAd()) == null || awemeRawAd.getNotificationConfig() != 1 || (a2 = com.ss.android.ugc.aweme.notificationlive.t.a()) == null)) {
                User v3 = v();
                View view = this.p;
                if (view == null) {
                    h.f.b.l.a("followView");
                }
                Activity a3 = com.ss.android.ugc.aweme.base.utils.o.a(view.getContext());
                com.ss.android.ugc.aweme.profile.widgets.h.a.b z2 = z();
                if (z2 != null) {
                    str4 = z2.f117883c;
                } else {
                    str4 = null;
                }
                com.ss.android.ugc.aweme.profile.ui.v2.ac acVar = (com.ss.android.ugc.aweme.profile.ui.v2.ac) com.bytedance.assem.arch.service.d.f(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (acVar != null) {
                    str5 = acVar.f117248f;
                } else {
                    str5 = null;
                }
                n nVar = new n(this, followStatus);
                Aweme w3 = w();
                if (w3 != null) {
                    awemeRawAd2 = w3.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                a2.onNext(new com.ss.android.ugc.aweme.notificationlive.a(v3, a3, "others_homepage", str4, str5, nVar, "follow_notification", awemeRawAd2));
            }
            User v4 = v();
            if (v4 == null) {
                v4 = new User();
                com.ss.android.ugc.aweme.profile.ui.v2.ac acVar2 = (com.ss.android.ugc.aweme.profile.ui.v2.ac) com.bytedance.assem.arch.service.d.f(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (acVar2 != null) {
                    str2 = acVar2.f117243a;
                } else {
                    str2 = null;
                }
                v4.setUid(str2);
                com.ss.android.ugc.aweme.profile.ui.v2.ac acVar3 = (com.ss.android.ugc.aweme.profile.ui.v2.ac) com.bytedance.assem.arch.service.d.f(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (acVar3 != null) {
                    str3 = acVar3.f117244b;
                } else {
                    str3 = null;
                }
                v4.setSecUid(str3);
                v4.setFollowStatus(followStatus.followStatus);
            }
            IMService.createIIMServicebyMonsterPlugin(false).updateIMUserFollowStatus(IMUser.fromUser(v4));
            a(v(), followStatus.followStatus);
            if ((followStatus.followStatus == 1 || followStatus.followStatus == 4) && v4.isBlock()) {
                v4.setBlock(false);
                ((com.ss.android.ugc.aweme.profile.ui.v2.ab) com.bytedance.assem.arch.service.d.a(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class))).b();
            }
            ((com.ss.android.ugc.aweme.profile.widgets.recommend.user.b) com.bytedance.assem.arch.service.d.b(this, h.f.b.ab.a(com.ss.android.ugc.aweme.profile.widgets.recommend.user.b.class))).a(followStatus.followStatus);
            if (TextUtils.equals(x(), "follow_request_page")) {
                User v5 = v();
                if (v5 != null) {
                    str = v5.getUid();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    User v6 = v();
                    if (v6 == null || (str6 = v6.getUid()) == null) {
                        h.f.b.l.b();
                    }
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.b.b(str6, followStatus.followStatus));
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("follow_status", followStatus.followStatus);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.web.e("userFollowStatusChange", jSONObject));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.follow.c
    public final void a(User user) {
        String str;
        GeneralPermission generalPermission;
        if (TextUtils.equals(x(), "follow_request_page") && !this.r) {
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
            if (ar_() != null && b2 != null && s() != null && this.f25594h && user != null) {
                User v2 = v();
                if (v2 != null) {
                    str = v2.getUid();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && !b2.isFinishing() && !user.isBlock && !user.isBlocked()) {
                    if ((user.getGeneralPermission() == null || ((generalPermission = user.getGeneralPermission()) != null && generalPermission.getFollowToastType() == 0)) && user.getFollowerStatus() != 1) {
                        FollowRequestTipView followRequestTipView = this.f117787m;
                        if (followRequestTipView == null) {
                            h.f.b.l.a("followRequestTip");
                        }
                        h.f.b.l.d(user, "");
                        ((TuxTextView) followRequestTipView.getView().findViewById(R.id.f_d)).setText(in.b(user));
                        ((TuxButton) followRequestTipView.a(R.id.x8)).setOnClickListener(new FollowRequestTipView.a(followRequestTipView));
                        ((TuxButton) followRequestTipView.a(R.id.x4)).setOnClickListener(new FollowRequestTipView.b(followRequestTipView));
                        followRequestTipView.setAcceptCallback(new ad(followRequestTipView, this, user));
                        followRequestTipView.setDeleteCallback(new ae(followRequestTipView, this, user));
                        if (!followRequestTipView.f116712c) {
                            followRequestTipView.f116712c = true;
                            if (followRequestTipView.f116711b.isRunning()) {
                                followRequestTipView.f116711b.cancel();
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(followRequestTipView, "translationY", followRequestTipView.getTranslationY(), -com.bytedance.common.utility.n.b(followRequestTipView.getContext(), 16.0f));
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(followRequestTipView, "alpha", followRequestTipView.getAlpha(), 1.0f);
                            followRequestTipView.f116710a.setDuration(200L);
                            followRequestTipView.f116710a.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                            followRequestTipView.f116710a.play(ofFloat).with(ofFloat2);
                            followRequestTipView.setVisibility(0);
                            followRequestTipView.f116710a.start();
                        }
                        String x2 = x();
                        if (x2 == null) {
                            x2 = "";
                        }
                        String uid = user.getUid();
                        h.f.b.l.b(uid, "");
                        h.f.b.l.d(x2, "");
                        h.f.b.l.d(uid, "");
                        com.ss.android.ugc.aweme.common.r.a("show_follow_request_pop_up", new com.ss.android.ugc.aweme.app.f.d().a("to_user_id", uid).a("enter_from", x2).f66730a);
                        this.r = true;
                    }
                }
            }
        }
    }

    public final void a(String str) {
        String str2;
        IMUser iMUser;
        String str3;
        String str4;
        b bVar;
        com.ss.android.ugc.aweme.recommend.g gVar;
        String str5;
        b bVar2;
        if (v() != null) {
            UserProfileFollowVM u2 = u();
            Aweme w2 = w();
            User v2 = v();
            com.ss.android.ugc.aweme.profile.widgets.h.a.b g2 = u2.g();
            String str6 = null;
            if (!(g2 == null || (bVar = g2.f117886f) == null || (gVar = bVar.f117779f) == null)) {
                gVar.getEnterFrom();
                com.ss.android.ugc.aweme.metrics.u uVar = new com.ss.android.ugc.aweme.metrics.u();
                uVar.f109597b = u.a.ENTER_CHAT;
                com.ss.android.ugc.aweme.metrics.u f2 = uVar.a(gVar).g(w2);
                com.ss.android.ugc.aweme.profile.widgets.h.a.b g3 = u2.g();
                if (g3 == null || (bVar2 = g3.f117886f) == null) {
                    str5 = null;
                } else {
                    str5 = bVar2.f117780g;
                }
                com.ss.android.ugc.aweme.metrics.u a2 = f2.p(str5).a(v2);
                String reqId = gVar.getReqId();
                if (reqId == null) {
                    reqId = "";
                }
                a2.s(reqId).f();
            }
            u2.a(u.a.ENTER_CHAT, v2);
            com.ss.android.ugc.aweme.profile.widgets.h.a.b g4 = u2.g();
            if (g4 != null) {
                str2 = g4.f117883c;
            } else {
                str2 = null;
            }
            if (h.f.b.l.a((Object) str2, (Object) "homepage_hot")) {
                com.ss.android.ugc.aweme.metrics.u a3 = new com.ss.android.ugc.aweme.metrics.u().a("homepage_hot");
                a3.f109596a = u.c.ITEM;
                a3.f109597b = u.a.ENTER_CHAT;
                com.ss.android.ugc.aweme.metrics.u a4 = a3.g(w2).a(v2);
                if (w2 == null || (str4 = w2.getRequestId()) == null) {
                    str4 = "";
                }
                a4.s(str4).b();
            }
            UserProfileFollowVM u3 = u();
            Context ar_ = ar_();
            if (ar_ == null) {
                h.f.b.l.b();
            }
            w();
            User v3 = v();
            h.f.b.l.d(ar_, "");
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin != null && createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() && !createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
            } else if (com.ss.android.ugc.aweme.profile.service.h.f116622a.canIM()) {
                if (v3 != null) {
                    iMUser = IMUser.fromUser(v3);
                } else {
                    iMUser = null;
                }
                a.C2643a b2 = a.b.a(ar_, iMUser).c("others_homepage").b("button");
                if (str != null) {
                    b2.d(str);
                }
                IMService.createIIMServicebyMonsterPlugin(false).startChat(b2.f103883a);
                if (v3 != null) {
                    str3 = v3.getUid();
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.profile.widgets.h.a.b g5 = u3.g();
                if (g5 != null) {
                    str6 = g5.f117883c;
                }
                com.bytedance.ies.ugc.appcontext.d.a();
                com.ss.android.ugc.aweme.common.r.a("chat", str6, str3, 0);
            }
        }
    }

    public static final class m implements com.ss.android.ugc.aweme.captcha.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117801a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Exception f117802b;

        static {
            Covode.recordClassIndex(76296);
        }

        m(f fVar, Exception exc) {
            this.f117801a = fVar;
            this.f117802b = exc;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$f  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC2996f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117794a;

        static {
            Covode.recordClassIndex(76289);
        }

        DialogInterface$OnClickListenerC2996f(f fVar) {
            this.f117794a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f117794a.u();
            UserProfileFollowVM.a(0);
        }
    }

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117795a;

        static {
            Covode.recordClassIndex(76290);
        }

        g(f fVar) {
            this.f117795a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f117795a.u().a(a.BLOCK);
        }
    }

    static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117796a;

        static {
            Covode.recordClassIndex(76291);
        }

        h(f fVar) {
            this.f117796a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f117796a.u().a(a.DOUBLE_CANCEL);
        }
    }

    static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117798a;

        static {
            Covode.recordClassIndex(76293);
        }

        j(f fVar) {
            this.f117798a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            if (i2 == 0) {
                this.f117798a.y();
            }
            dialogInterface.dismiss();
        }
    }

    static final class k implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117799a;

        static {
            Covode.recordClassIndex(76294);
        }

        k(f fVar) {
            this.f117799a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f117799a.u();
            UserProfileFollowVM.a(0);
        }
    }

    static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117800a;

        static {
            Covode.recordClassIndex(76295);
        }

        l(f fVar) {
            this.f117800a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f117800a.u();
            UserProfileFollowVM.a(1);
            this.f117800a.u().a(a.BAN);
        }
    }

    static final class ac implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117789a;

        static {
            Covode.recordClassIndex(76282);
        }

        ac(f fVar) {
            this.f117789a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            this.f117789a.u();
            com.ss.android.ugc.aweme.common.r.a("remove_fans", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").f66730a);
            UserProfileFollowVM u = this.f117789a.u();
            User v = this.f117789a.v();
            String str2 = null;
            if (v != null) {
                str = v.getUid();
            } else {
                str = null;
            }
            User v2 = this.f117789a.v();
            if (v2 != null) {
                str2 = v2.getSecUid();
            }
            f.a.b.b a2 = u.f117759j.a().a(str, str2).a(new UserProfileFollowVM.k(u), new UserProfileFollowVM.l(u));
            h.f.b.l.b(a2, "");
            u.a(a2);
        }
    }

    private void a(User user, int i2) {
        if (user != null) {
            RelationCheckApi.a.a().checkRelation("[\"" + user.getSecUid() + "\"]").b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this, i2), new e(this, i2));
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends a>, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends a> aVar) {
            T t;
            String str;
            int i2;
            GeneralPermission generalPermission;
            com.bytedance.assem.arch.extensions.a<? extends a> aVar2 = aVar;
            String str2 = "";
            h.f.b.l.d(pVar, str2);
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                String str3 = null;
                switch (g.f117811a[t.ordinal()]) {
                    case 1:
                        f fVar = this.this$0;
                        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(fVar);
                        String str4 = fVar.f117786l;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        ap apVar = new ap();
                        Aweme w = fVar.w();
                        if (w != null) {
                            str = w.getAid();
                        } else {
                            str = null;
                        }
                        ap a2 = apVar.a("group_id", str);
                        Aweme w2 = fVar.w();
                        if (w2 != null) {
                            str3 = w2.getAid();
                        }
                        com.ss.android.ugc.aweme.login.c.a(b2, str2, "click_follow", a2.a("log_pb", com.ss.android.ugc.aweme.metrics.ac.c(str3)).f142646a, new i(fVar));
                        break;
                    case 2:
                        f fVar2 = this.this$0;
                        new a.C0731a(fVar2.ar_()).a(R.string.h43).b(R.string.h42).a(R.string.byp, (DialogInterface.OnClickListener) new g(fVar2), false).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a().b();
                        break;
                    case 3:
                        f fVar3 = this.this$0;
                        new a.C0731a(fVar3.ar_()).a(R.string.s9).b(R.string.s_).a(R.string.b75, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC2996f(fVar3), false).a().c();
                        fVar3.u();
                        UserProfileFollowVM.a(fVar3.v());
                        break;
                    case 4:
                        f fVar4 = this.this$0;
                        a.C0731a aVar3 = new a.C0731a(fVar4.ar_());
                        User v = fVar4.v();
                        if (v == null || (generalPermission = v.getGeneralPermission()) == null || generalPermission.getFollowToastType() != 4) {
                            i2 = R.string.sb;
                        } else {
                            i2 = R.string.sc;
                        }
                        aVar3.b(i2).b(R.string.a9e, (DialogInterface.OnClickListener) new k(fVar4), false).a(R.string.byp, (DialogInterface.OnClickListener) new l(fVar4), false).a().c();
                        fVar4.u();
                        UserProfileFollowVM.a(fVar4.v());
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        f fVar5 = this.this$0;
                        Dialog c2 = new a.C0731a(fVar5.ar_()).a(R.string.h3l).b(R.string.a2g, (DialogInterface.OnClickListener) null, false).a(R.string.h84, (DialogInterface.OnClickListener) new h(fVar5), false).a().c();
                        View findViewById = c2.findViewById(R.id.f67);
                        if (findViewById instanceof TextView) {
                            TextView textView = (TextView) findViewById;
                            Context ar_ = fVar5.ar_();
                            if (ar_ == null) {
                                h.f.b.l.b();
                            }
                            textView.setTextColor(androidx.core.content.b.c(ar_, R.color.gr));
                        }
                        View findViewById2 = c2.findViewById(R.id.exf);
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(8);
                            break;
                        }
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        f fVar6 = this.this$0;
                        com.ss.android.ugc.aweme.common.f.a aVar4 = new com.ss.android.ugc.aweme.common.f.a(fVar6.ar_());
                        String[] strArr = new String[2];
                        Context ar_2 = fVar6.ar_();
                        if (ar_2 == null) {
                            h.f.b.l.b();
                        }
                        strArr[0] = ar_2.getResources().getString(R.string.a9n);
                        Context ar_3 = fVar6.ar_();
                        if (ar_3 == null) {
                            h.f.b.l.b();
                        }
                        strArr[1] = ar_3.getResources().getString(R.string.a9e);
                        aVar4.a(strArr, new j(fVar6));
                        aVar4.f76416a.b();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        this.this$0.y();
                        break;
                }
            }
            return h.z.f158842a;
        }
    }
}
