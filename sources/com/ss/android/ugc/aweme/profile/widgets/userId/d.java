package com.ss.android.ugc.aweme.profile.widgets.userId;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.tooltip.b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.gy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.w;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.av;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;

public final class d extends com.bytedance.assem.arch.d.a {
    public static final C3018d n = new C3018d((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public TextView f118112j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.ies.dmt.ui.tooltip.a f118113k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f118114l;

    /* renamed from: m  reason: collision with root package name */
    boolean f118115m;
    private final com.bytedance.assem.arch.extensions.i o = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    private final com.bytedance.assem.arch.viewModel.b p;

    public static final class b extends m implements h.f.a.b<a, a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(76705);
        }

        public b() {
            super(1);
        }

        public final a invoke(a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(76703);
    }

    public final MyProfileUserIdVM v() {
        return (MyProfileUserIdVM) this.p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.d$d  reason: collision with other inner class name */
    public static final class C3018d {
        static {
            Covode.recordClassIndex(76707);
        }

        private C3018d() {
        }

        public /* synthetic */ C3018d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void l() {
        super.l();
        this.f118114l = false;
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.o.getValue();
        if (aVar != null) {
            return aVar.f117878c;
        }
        return false;
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76704);
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

    public static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76706);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.userId.d.c.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void j() {
        super.j();
        this.f118114l = true;
        this.f118115m = com.ss.android.ugc.aweme.compliance.api.a.c().a(4);
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f118116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f118117b;

        static {
            Covode.recordClassIndex(76708);
        }

        e(d dVar, User user) {
            this.f118116a = dVar;
            this.f118117b = user;
        }

        public final void run() {
            int i2;
            d dVar = this.f118116a;
            User user = this.f118117b;
            if (!in.d() && dVar.f118112j != null && !dVar.f118115m) {
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(dVar);
                if (user != null && !TextUtils.isEmpty(user.getUid())) {
                    if (b2 == null || !b2.isFinishing()) {
                        String uid = user.getUid();
                        l.b(uid, "");
                        l.d(uid, "");
                        long a2 = gy.f90188a.a("last_time_show_change_username_bubble_".concat(String.valueOf(uid)));
                        long currentTimeMillis = System.currentTimeMillis();
                        if (com.bytedance.ies.abmock.b.a().a(true, "username_modify_tip_interval", 1) == 1) {
                            i2 = 168;
                        } else if (com.bytedance.ies.abmock.b.a().a(true, "username_modify_tip_interval", 1) == 2) {
                            i2 = 72;
                        } else {
                            i2 = 24;
                        }
                        d.a(dVar.v(), new i(dVar, currentTimeMillis, a2, i2, user));
                    }
                }
            }
        }
    }

    public d() {
        h.k.c a2 = ab.a(MyProfileUserIdVM.class);
        this.p = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), b.INSTANCE, u.b(this), u.c(this));
    }

    static final class h extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(76711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            com.bytedance.ies.dmt.ui.tooltip.a aVar = this.this$0.f118113k;
            if (aVar != null) {
                aVar.dismiss();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(User user) {
        if (this.f118112j != null && user != null) {
            io.a(ar_(), new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), null), this.f118112j);
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        if (!(view instanceof TextView)) {
            view = null;
        }
        TextView textView = (TextView) view;
        this.f118112j = textView;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.f118112j;
        if (textView2 != null) {
            textView2.setOnClickListener(new f(this));
        }
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), e.f118121a, new g(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), f.f118122a, new h(this));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        Context ar_ = ar_();
        if (ar_ != null) {
            try {
                av.a("user_id", str, ar_, PrivacyCert.Builder.Companion.with("bpea-108").usage("TikTok user can share user name or profile link to others. When username is clicked in user profile page, username is copied. In profile editing page, user's profile link can also be copied.").tag("clickToCopyUsername").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                while (ar_ != null) {
                    if (ar_ instanceof Activity) {
                        Activity activity = (Activity) ar_;
                        if (activity != null) {
                            new com.bytedance.tux.g.b(activity).e(R.string.agy).b();
                            return;
                        }
                        return;
                    } else if (ar_ instanceof ContextWrapper) {
                        ar_ = ((ContextWrapper) ar_).getBaseContext();
                    } else {
                        return;
                    }
                }
            } catch (SecurityException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            } catch (com.bytedance.bpea.basics.a e3) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e3);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f118118a;

        static {
            Covode.recordClassIndex(76709);
        }

        f(d dVar) {
            this.f118118a = dVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                d dVar = this.f118118a;
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(dVar, ab.a(j.class));
                if (iVar != null) {
                    user = iVar.f117705a;
                } else {
                    user = null;
                }
                if (!dVar.u()) {
                    String b2 = in.b(user);
                    l.b(b2, "");
                    dVar.a(b2);
                } else if (dVar.f118115m || (gy.a() && (user == null || !user.nicknameUpdateReminder()))) {
                    String b3 = in.b(user);
                    l.b(b3, "");
                    dVar.a(b3);
                } else {
                    r.a("enter_profile_username", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "click_edit_username").f66730a);
                    Bundle bundle = new ap().a("need_focus_id_input", 1).f142646a;
                    if (dVar.ar_() == null) {
                        return;
                    }
                    if (in.d()) {
                        com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(dVar.ar_());
                        Context ar_ = dVar.ar_();
                        if (ar_ == null) {
                            l.b();
                        }
                        aVar.a(ar_.getString(R.string.add)).a();
                        return;
                    }
                    SmartRoute buildRoute = SmartRouter.buildRoute(dVar.ar_(), "aweme://profile_edit");
                    l.b(buildRoute, "");
                    if (bundle != null) {
                        buildRoute.withParam(bundle);
                    }
                    buildRoute.open();
                    SharePrefCache inst = SharePrefCache.inst();
                    l.b(inst, "");
                    aj<Boolean> isProfileBubbleShown = inst.getIsProfileBubbleShown();
                    l.b(isProfileBubbleShown, "");
                    isProfileBubbleShown.b(false);
                }
            }
        }
    }

    public final void b(User user) {
        String uniqueId;
        CharSequence charSequence;
        if (ar_() != null && user != null) {
            if (TextUtils.isEmpty(user.getUniqueId())) {
                uniqueId = user.getShortId();
            } else {
                uniqueId = user.getUniqueId();
            }
            String concat = "@".concat(String.valueOf(uniqueId));
            TextView textView = this.f118112j;
            if (textView != null) {
                textView.setText(concat);
            }
            a(user);
            if (this.f118115m || (gy.a() && (user.isSecret() || !user.nicknameUpdateReminder()))) {
                TextView textView2 = this.f118112j;
                if (textView2 != null) {
                    Context ar_ = ar_();
                    if (ar_ == null) {
                        l.b();
                    }
                    textView2.setTextColor(androidx.core.content.b.c(ar_, R.color.ut));
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TextView textView3 = this.f118112j;
            if (textView3 != null) {
                charSequence = textView3.getText();
            } else {
                charSequence = null;
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((CharSequence) " T");
            spannableStringBuilder.setSpan(new com.ss.android.ugc.aweme.profile.f.aj(ar_(), 2131233361), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
            TextView textView4 = this.f118112j;
            if (textView4 != null) {
                textView4.setText(spannableStringBuilder);
            }
            TextView textView5 = this.f118112j;
            if (textView5 != null) {
                Context ar_2 = ar_();
                if (ar_2 == null) {
                    l.b();
                }
                textView5.setTextColor(androidx.core.content.b.c(ar_2, R.color.uu));
            }
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(76710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            String uniqueId;
            CharSequence charSequence;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (aVar2 != null) {
                t = aVar2.f25631b;
            } else {
                t = null;
            }
            d dVar = this.this$0;
            if (t != null) {
                if (t.isAdVirtual()) {
                    uniqueId = t.getNickname();
                } else if (TextUtils.isEmpty(t.getUniqueId())) {
                    uniqueId = t.getShortId();
                } else {
                    uniqueId = t.getUniqueId();
                }
                if (dVar.u()) {
                    if (!(uniqueId == null || uniqueId.length() == 0)) {
                        TextView textView = dVar.f118112j;
                        if (textView != null) {
                            textView.setText("@".concat(String.valueOf(uniqueId)));
                        }
                        dVar.a((User) t);
                        if (!(dVar.ar_() == null || dVar.f118112j == null)) {
                            if (dVar.f118115m || (gy.a() && (t.isSecret() || !t.nicknameUpdateReminder()))) {
                                TextView textView2 = dVar.f118112j;
                                if (textView2 != null) {
                                    Context ar_ = dVar.ar_();
                                    if (ar_ == null) {
                                        l.b();
                                    }
                                    Resources resources = ar_.getResources();
                                    if (resources == null) {
                                        l.b();
                                    }
                                    textView2.setTextColor(resources.getColor(R.color.ut));
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                TextView textView3 = dVar.f118112j;
                                if (textView3 != null) {
                                    charSequence = textView3.getText();
                                } else {
                                    charSequence = null;
                                }
                                spannableStringBuilder.append(charSequence);
                                spannableStringBuilder.append((CharSequence) " T");
                                spannableStringBuilder.setSpan(new com.ss.android.ugc.aweme.profile.f.aj(dVar.ar_(), 2131233360), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
                                TextView textView4 = dVar.f118112j;
                                if (textView4 != null) {
                                    textView4.setText(spannableStringBuilder);
                                }
                                TextView textView5 = dVar.f118112j;
                                if (textView5 != null) {
                                    Context ar_2 = dVar.ar_();
                                    if (ar_2 == null) {
                                        l.b();
                                    }
                                    Resources resources2 = ar_2.getResources();
                                    if (resources2 == null) {
                                        l.b();
                                    }
                                    textView5.setTextColor(resources2.getColor(R.color.uu));
                                }
                            }
                        }
                        if (!dVar.f118115m && (!gy.a() || t.nicknameUpdateReminder())) {
                            if (t.nicknameUpdateReminder()) {
                                new Handler().post(new e(dVar, t));
                            } else {
                                dVar.b((User) t);
                                w wVar = (w) com.bytedance.assem.arch.service.d.f(dVar, ab.a(x.class));
                                if (wVar != null && wVar.f117301e && dVar.f118114l) {
                                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog("profile", null, null);
                                }
                            }
                        }
                    }
                } else if (!(uniqueId == null || uniqueId.length() == 0)) {
                    TextView textView6 = dVar.f118112j;
                    if (textView6 != null) {
                        textView6.setText("@".concat(String.valueOf(uniqueId)));
                    }
                    io.a(dVar.ar_(), t.getCustomVerify(), t.getEnterpriseVerifyReason(), dVar.f118112j);
                }
            }
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<a, z> {
        final /* synthetic */ int $day;
        final /* synthetic */ long $lastTime;
        final /* synthetic */ long $thisTime;
        final /* synthetic */ int $type = 1;
        final /* synthetic */ User $user;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(76712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar, long j2, long j3, int i2, User user) {
            super(1);
            this.this$0 = dVar;
            this.$thisTime = j2;
            this.$lastTime = j3;
            this.$day = i2;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            int i2;
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (this.this$0.ar_() != null) {
                if (this.$thisTime - this.$lastTime > ((long) (this.$day * 3600000))) {
                    w wVar = (w) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(x.class));
                    if (wVar == null || !wVar.f117301e || !this.this$0.f118114l) {
                        com.bytedance.ies.dmt.ui.tooltip.a aVar3 = this.this$0.f118113k;
                        if (aVar3 != null) {
                            aVar3.dismiss();
                        }
                    } else {
                        if (this.$type == 1) {
                            i2 = R.string.aax;
                        } else {
                            i2 = R.string.ab4;
                        }
                        TextView textView = this.this$0.f118112j;
                        if (textView == null) {
                            l.b();
                        }
                        float x = textView.getX();
                        TextView textView2 = this.this$0.f118112j;
                        if (textView2 == null) {
                            l.b();
                        }
                        float width = x + ((float) textView2.getWidth());
                        TextView textView3 = this.this$0.f118112j;
                        if (textView3 == null) {
                            l.b();
                        }
                        float height = width - ((float) (textView3.getHeight() / 2));
                        TextView textView4 = this.this$0.f118112j;
                        if (textView4 == null) {
                            l.b();
                        }
                        float x2 = textView4.getX();
                        TextView textView5 = this.this$0.f118112j;
                        if (textView5 == null) {
                            l.b();
                        }
                        float width2 = height - ((x2 + ((float) textView5.getWidth())) / 2.0f);
                        if (this.this$0.f118113k == null || !aVar2.f118108a) {
                            d dVar = this.this$0;
                            Context ar_ = this.this$0.ar_();
                            if (ar_ == null) {
                                l.b();
                            }
                            com.bytedance.ies.dmt.ui.tooltip.b bVar = new com.bytedance.ies.dmt.ui.tooltip.b(ar_);
                            TextView textView6 = this.this$0.f118112j;
                            if (textView6 == null) {
                                l.b();
                            }
                            com.bytedance.ies.dmt.ui.tooltip.b b2 = bVar.a(textView6).b(80);
                            b2.f33543a.f33555j = (int) width2;
                            dVar.f118113k = b2.a(i2).a();
                            com.bytedance.ies.dmt.ui.tooltip.a aVar4 = this.this$0.f118113k;
                            if (aVar4 != null) {
                                aVar4.a(new b.AbstractC0734b(this) {
                                    /* class com.ss.android.ugc.aweme.profile.widgets.userId.d.i.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ i f118119a;

                                    static {
                                        Covode.recordClassIndex(76713);
                                    }

                                    @Override // com.bytedance.ies.dmt.ui.tooltip.b.AbstractC0734b
                                    public final void a() {
                                        int i2;
                                        boolean z;
                                        TextView textView = this.f118119a.this$0.f118112j;
                                        if (textView == null) {
                                            l.b();
                                        }
                                        String obj = textView.getText().toString();
                                        int length = obj.length() - 1;
                                        int i3 = 0;
                                        boolean z2 = false;
                                        while (i3 <= length) {
                                            if (!z2) {
                                                i2 = i3;
                                            } else {
                                                i2 = length;
                                            }
                                            if (l.a(obj.charAt(i2), 32) <= 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z2) {
                                                if (!z) {
                                                    break;
                                                }
                                                length--;
                                            } else if (!z) {
                                                z2 = true;
                                            } else {
                                                i3++;
                                            }
                                        }
                                        String obj2 = obj.subSequence(i3, length + 1).toString();
                                        if (!TextUtils.isEmpty(obj2) && p.c(obj2, " T", false)) {
                                            p.a((CharSequence) obj2, " T", 0, false, 6);
                                            this.f118119a.this$0.b(this.f118119a.$user);
                                        }
                                        this.f118119a.this$0.v().a(false);
                                    }

                                    /* JADX WARN: Incorrect args count in method signature: ()V */
                                    {
                                        this.f118119a = r1;
                                    }
                                });
                            }
                            com.bytedance.ies.dmt.ui.tooltip.a aVar5 = this.this$0.f118113k;
                            if (aVar5 != null) {
                                aVar5.a(new b.c(this) {
                                    /* class com.ss.android.ugc.aweme.profile.widgets.userId.d.i.AnonymousClass2 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ i f118120a;

                                    static {
                                        Covode.recordClassIndex(76714);
                                    }

                                    @Override // com.bytedance.ies.dmt.ui.tooltip.b.c
                                    public final void a() {
                                        this.f118120a.this$0.v().a(true);
                                    }

                                    /* JADX WARN: Incorrect args count in method signature: ()V */
                                    {
                                        this.f118120a = r1;
                                    }
                                });
                            }
                        }
                        com.bytedance.ies.dmt.ui.tooltip.a aVar6 = this.this$0.f118113k;
                        if (aVar6 != null) {
                            aVar6.a();
                        }
                        String uid = this.$user.getUid();
                        l.b(uid, "");
                        long j2 = this.$thisTime;
                        l.d(uid, "");
                        gy.f90188a.a("last_time_show_change_username_bubble_".concat(String.valueOf(uid)), j2);
                    }
                } else if (this.this$0.f118113k == null || !aVar2.f118108a) {
                    this.this$0.b(this.$user);
                }
            }
            return z.f158842a;
        }
    }
}
