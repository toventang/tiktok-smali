package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.z;
import java.io.Serializable;
import java.util.HashMap;

public final class b extends com.bytedance.ies.foundation.fragment.a implements ar<h>, q {

    /* renamed from: f  reason: collision with root package name */
    public static final d f100541f = new d((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public Long f100542e;

    /* renamed from: g  reason: collision with root package name */
    private h f100543g = new h();

    /* renamed from: h  reason: collision with root package name */
    private final lifecycleAwareLazy f100544h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap f100545i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$b  reason: collision with other inner class name */
    public static final class C2476b extends h.f.b.m implements h.f.a.m<GroupInviteState, Bundle, GroupInviteState> {
        public static final C2476b INSTANCE = new C2476b();

        static {
            Covode.recordClassIndex(64294);
        }

        public C2476b() {
            super(2);
        }

        public final GroupInviteState invoke(GroupInviteState groupInviteState, Bundle bundle) {
            h.f.b.l.c(groupInviteState, "");
            return groupInviteState;
        }
    }

    static {
        Covode.recordClassIndex(64292);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f100545i == null) {
            this.f100545i = new HashMap();
        }
        View view = (View) this.f100545i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f100545i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        HashMap hashMap = this.f100545i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final GroupInviteViewModel c() {
        return (GroupInviteViewModel) this.f100544h.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(64297);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(64293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<GroupInviteViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(64295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_im_sdk_chat_feature_group_invite_GroupInviteFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel> r0 = com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$c$1 r0 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_im_sdk_chat_feature_group_invite_GroupInviteFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public b() {
        h.k.c a2 = h.f.b.ab.a(GroupInviteViewModel.class);
        a aVar = new a(a2);
        this.f100544h = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, C2476b.INSTANCE));
    }

    private final int f() {
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().equals(String.valueOf(this.f100542e))) {
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            return h.g.a.a(TypedValue.applyDimension(1, 216.0f, system.getDisplayMetrics()));
        }
        Resources system2 = Resources.getSystem();
        h.f.b.l.a((Object) system2, "");
        return h.g.a.a(TypedValue.applyDimension(1, 342.0f, system2.getDisplayMetrics()));
    }

    private final void g() {
        String str;
        TuxButton tuxButton = (TuxButton) a(R.id.yc);
        h.f.b.l.b(tuxButton, "");
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.c95);
        } else {
            str = null;
        }
        tuxButton.setText(str);
        TuxButton tuxButton2 = (TuxButton) a(R.id.yc);
        h.f.b.l.b(tuxButton2, "");
        tuxButton2.setEnabled(true);
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* synthetic */ h d() {
        String str;
        Serializable serializable;
        Bundle arguments = getArguments();
        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar = null;
        if (arguments != null) {
            str = arguments.getString("arg_invite_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("arg_default_group");
        } else {
            serializable = null;
        }
        if (serializable instanceof com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a) {
            aVar = serializable;
        }
        return new h(str, aVar);
    }

    public final void e() {
        FrameLayout frameLayout = (FrameLayout) a(R.id.adh);
        h.f.b.l.b(frameLayout, "");
        frameLayout.getLayoutParams().height = f();
        TuxDualBallView tuxDualBallView = (TuxDualBallView) a(R.id.aq4);
        tuxDualBallView.setVisibility(8);
        tuxDualBallView.c();
        LinearLayout linearLayout = (LinearLayout) a(R.id.aem);
        h.f.b.l.b(linearLayout, "");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) a(R.id.axu);
        h.f.b.l.b(linearLayout2, "");
        linearLayout2.setVisibility(0);
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100548a;

        static {
            Covode.recordClassIndex(64304);
        }

        k(b bVar) {
            this.f100548a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100548a.c().g();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100546a;

        static {
            Covode.recordClassIndex(64298);
        }

        e(b bVar) {
            this.f100546a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f100546a.getContext();
            if (context != null) {
                GroupInviteViewModel c2 = this.f100546a.c();
                h.f.b.l.b(context, "");
                c2.a(context);
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            ((TuxButton) this.this$0.a(R.id.xo)).setLoading(true);
            return z.f158842a;
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100547a;

        static {
            Covode.recordClassIndex(64303);
        }

        j(b bVar) {
            this.f100547a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100547a.c().b();
            this.f100547a.c().a("close", "in_app");
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Long l2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            l2 = Long.valueOf(arguments.getLong("arg_invite_sender"));
        } else {
            l2 = null;
        }
        this.f100542e = l2;
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            TuxDualBallView tuxDualBallView = (TuxDualBallView) this.this$0.a(R.id.aq4);
            tuxDualBallView.setVisibility(0);
            tuxDualBallView.b();
            LinearLayout linearLayout = (LinearLayout) this.this$0.a(R.id.aem);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) this.this$0.a(R.id.axu);
            h.f.b.l.b(linearLayout2, "");
            linearLayout2.setVisibility(8);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100549a;

        static {
            Covode.recordClassIndex(64309);
        }

        p(b bVar) {
            this.f100549a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.im.service.c.b.a()) {
                new com.bytedance.tux.g.b(this.f100549a).e(R.string.cof).b();
                ((AppCompatImageView) this.f100549a.a(R.id.bve)).performClick();
                return;
            }
            this.f100549a.c().a();
            this.f100549a.c().a("join", "in_app");
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            this.this$0.e();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            ((TuxButton) this.this$0.a(R.id.xo)).setLoading(false);
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r3, java.lang.Boolean r4) {
            /*
                r2 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r1 = r4.booleanValue()
                java.lang.String r0 = ""
                h.f.b.l.d(r3, r0)
                if (r1 == 0) goto L_0x0012
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b r0 = r2.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
            L_0x0012:
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, AcceptInviteCardResponse, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, AcceptInviteCardResponse acceptInviteCardResponse) {
            AcceptInviteCardResponse acceptInviteCardResponse2 = acceptInviteCardResponse;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(acceptInviteCardResponse2, "");
            ((TuxButton) this.this$0.a(R.id.xo)).setLoading(false);
            Integer inviteeGroupStatus = acceptInviteCardResponse2.getInviteeGroupStatus();
            if (inviteeGroupStatus != null && inviteeGroupStatus.intValue() == 3) {
                Context context = this.this$0.getContext();
                if (context != null) {
                    GroupInviteViewModel c2 = this.this$0.c();
                    h.f.b.l.b(context, "");
                    c2.a(context);
                }
            } else {
                this.this$0.a(acceptInviteCardResponse2.getInviteeGroupStatus(), acceptInviteCardResponse2.getInviteError());
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar) {
            String str;
            Resources resources;
            int i2;
            int i3;
            com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar2 = aVar;
            h.f.b.l.d(iVar, "");
            if (aVar2 != null) {
                com.ss.android.ugc.aweme.base.e.b((RemoteImageView) this.this$0.a(R.id.or), aVar2.getAvatarUrl(), -1, -1);
                TuxTextView tuxTextView = (TuxTextView) this.this$0.a(R.id.f07);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setText(aVar2.getName());
                TuxTextView tuxTextView2 = (TuxTextView) this.this$0.a(R.id.f06);
                h.f.b.l.b(tuxTextView2, "");
                Context context = this.this$0.getContext();
                if (context == null || (resources = context.getResources()) == null) {
                    str = null;
                } else {
                    Integer groupSize = aVar2.getGroupSize();
                    if (groupSize != null) {
                        i2 = groupSize.intValue();
                    } else {
                        i2 = 0;
                    }
                    Object[] objArr = new Object[1];
                    Integer groupSize2 = aVar2.getGroupSize();
                    if (groupSize2 != null) {
                        i3 = groupSize2.intValue();
                    } else {
                        i3 = 0;
                    }
                    objArr[0] = Integer.valueOf(i3);
                    str = resources.getQuantityString(R.plurals.cy, i2, objArr);
                }
                tuxTextView2.setText(str);
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, InviteCardDetailInnerResponse, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, InviteCardDetailInnerResponse inviteCardDetailInnerResponse) {
            String str;
            InviteCardDetailInnerResponse inviteCardDetailInnerResponse2 = inviteCardDetailInnerResponse;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(inviteCardDetailInnerResponse2, "");
            Integer inviteeGroupStatus = inviteCardDetailInnerResponse2.getInviteeGroupStatus();
            if ((inviteeGroupStatus != null && inviteeGroupStatus.intValue() == 0) || inviteCardDetailInnerResponse2.getInviteeGroupStatus() == null) {
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().equals(String.valueOf(this.this$0.f100542e))) {
                    this.this$0.e();
                    return z.f158842a;
                }
            }
            TuxTextView tuxTextView = (TuxTextView) this.this$0.a(R.id.f0o);
            h.f.b.l.b(tuxTextView, "");
            Context context = this.this$0.getContext();
            if (context != null) {
                str = context.getString(R.string.c7n, String.valueOf(inviteCardDetailInnerResponse2.getInviterName()));
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            this.this$0.a(inviteCardDetailInnerResponse2.getInviteeGroupStatus(), inviteCardDetailInnerResponse2.getInviteError());
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) a(R.id.adh);
        h.f.b.l.b(frameLayout, "");
        frameLayout.getLayoutParams().height = f();
        ((TuxButton) a(R.id.yc)).setOnClickListener(new e(this));
        ((AppCompatImageView) a(R.id.bve)).setOnClickListener(new j(this));
        ((TuxButton) a(R.id.zi)).setOnClickListener(new k(this));
        f.a.b.b unused = selectSubscribe(c(), e.f100552a, new ah(), new l(this));
        h.a.a(this, c(), f.f100553a, (ah) null, new o(this), new m(this), new n(this), 2);
        h.a.a(this, c(), c.f100550a, (ah) null, new h(this), new f(this), new g(this), 2);
        f.a.b.b unused2 = selectSubscribe(c(), d.f100551a, new ah(), new i(this));
    }

    public final void a(Integer num, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar) {
        i iVar;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        FrameLayout frameLayout = (FrameLayout) a(R.id.adh);
        h.f.b.l.b(frameLayout, "");
        frameLayout.getLayoutParams().height = -2;
        TuxDualBallView tuxDualBallView = (TuxDualBallView) a(R.id.aq4);
        int i4 = 8;
        tuxDualBallView.setVisibility(8);
        tuxDualBallView.c();
        LinearLayout linearLayout = (LinearLayout) a(R.id.aem);
        h.f.b.l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) a(R.id.axu);
        h.f.b.l.b(linearLayout2, "");
        linearLayout2.setVisibility(8);
        String str = null;
        boolean z3 = true;
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().equals(String.valueOf(this.f100542e))) {
            if (num != null && num.intValue() == 3) {
                g();
            } else {
                TuxButton tuxButton = (TuxButton) a(R.id.yc);
                h.f.b.l.b(tuxButton, "");
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.c9a);
                }
                tuxButton.setText(str);
                TuxButton tuxButton2 = (TuxButton) a(R.id.yc);
                h.f.b.l.b(tuxButton2, "");
                tuxButton2.setEnabled(false);
            }
            iVar = i.ENTER;
        } else if (cVar == null) {
            if (num != null) {
                if (num.intValue() == 3) {
                    g();
                    iVar = i.ENTER;
                } else if (num != null) {
                    if (num.intValue() == 2) {
                        TuxButton tuxButton3 = (TuxButton) a(R.id.xo);
                        h.f.b.l.b(tuxButton3, "");
                        Context context2 = getContext();
                        if (context2 != null) {
                            str = context2.getString(R.string.c6f);
                        }
                        tuxButton3.setText(str);
                        TuxButton tuxButton4 = (TuxButton) a(R.id.xo);
                        h.f.b.l.b(tuxButton4, "");
                        tuxButton4.setEnabled(false);
                        iVar = i.INVITE;
                    } else if (num.intValue() == 1 || num.intValue() == 0) {
                        TuxButton tuxButton5 = (TuxButton) a(R.id.xo);
                        h.f.b.l.b(tuxButton5, "");
                        Context context3 = getContext();
                        if (context3 != null) {
                            str = context3.getString(R.string.c6d);
                        }
                        tuxButton5.setText(str);
                        ((TuxButton) a(R.id.xo)).setButtonVariant(0);
                        ((LinearLayout) a(R.id.cfm)).setOnClickListener(new p(this));
                        iVar = i.INVITE;
                    }
                }
            }
            iVar = i.INVITE;
        } else {
            String str2 = cVar.f102670c;
            TuxTextView tuxTextView = (TuxTextView) a(R.id.ezb);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setText(str2);
            iVar = i.EXPIRE;
        }
        if (iVar == i.ENTER) {
            z = true;
        } else {
            z = false;
        }
        if (iVar == i.INVITE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iVar != i.EXPIRE) {
            z3 = false;
        }
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.ezb);
        h.f.b.l.b(tuxTextView2, "");
        if (z3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
        LinearLayout linearLayout3 = (LinearLayout) a(R.id.cfm);
        h.f.b.l.b(linearLayout3, "");
        if (z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        linearLayout3.setVisibility(i3);
        TuxButton tuxButton6 = (TuxButton) a(R.id.yc);
        h.f.b.l.b(tuxButton6, "");
        if (z) {
            i4 = 0;
        }
        tuxButton6.setVisibility(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a4r, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
