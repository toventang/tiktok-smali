package com.ss.android.ugc.aweme.upvote.publish.a;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.emoji.sysemoji.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.upvote.publish.a.e;
import com.ss.android.ugc.aweme.upvote.wiget.InterceptEventLayout;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.common.f.b implements TextWatcher, com.bytedance.assem.arch.viewModel.h, com.ss.android.ugc.aweme.common.keyboard.c {

    /* renamed from: f  reason: collision with root package name */
    public static final b f142255f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f142256a;

    /* renamed from: b  reason: collision with root package name */
    public String f142257b;

    /* renamed from: c  reason: collision with root package name */
    public UpvotePublishMobParam f142258c;

    /* renamed from: d  reason: collision with root package name */
    public String f142259d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f142260e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f142261g = h.i.a((h.f.a.a) new s(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f142262h = h.i.a((h.f.a.a) new c(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f142263i = h.i.a((h.f.a.a) new ab(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f142264j = h.i.a((h.f.a.a) new q(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f142265k = h.i.a((h.f.a.a) new h(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f142266l = h.i.a((h.f.a.a) new g(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f142267m = h.i.a((h.f.a.a) new i(this));
    private final h.h n = h.i.a((h.f.a.a) new r(this));
    private final h.h o = h.i.a((h.f.a.a) new aa(this));
    private final List<String> p = h.a.n.b("👏", "😍", "😂");
    private final List<String> q = h.a.n.b("😁", "🥰", "😳", "😏", "😅", "🥺", "😌", "😬", "😊", "😎");
    private String r;
    private final com.bytedance.assem.a.a s = new com.bytedance.assem.a.a(h.f.b.ab.a(UpvotePublishVM.class), null, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), u.c.f25670a, C3799a.INSTANCE, com.bytedance.assem.arch.extensions.u.a((Fragment) this, true), com.bytedance.assem.arch.extensions.u.b((Fragment) this, true));
    private SparseArray t;

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$a  reason: collision with other inner class name */
    public static final class C3799a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.upvote.publish.g, com.ss.android.ugc.aweme.upvote.publish.g> {
        public static final C3799a INSTANCE = new C3799a();

        static {
            Covode.recordClassIndex(93008);
        }

        public C3799a() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.upvote.publish.g invoke(com.ss.android.ugc.aweme.upvote.publish.g gVar) {
            h.f.b.l.c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(93007);
    }

    private final ConstraintLayout k() {
        return (ConstraintLayout) this.f142262h.getValue();
    }

    private final TuxNavBar l() {
        return (TuxNavBar) this.f142263i.getValue();
    }

    public final MeasureLinearLayout a() {
        return (MeasureLinearLayout) this.f142261g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final SmartAvatarImageView b() {
        return (SmartAvatarImageView) this.f142264j.getValue();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: package-private */
    public final InterceptEventLayout c() {
        return (InterceptEventLayout) this.f142265k.getValue();
    }

    public final TuxEditText d() {
        return (TuxEditText) this.f142266l.getValue();
    }

    /* access modifiers changed from: package-private */
    public final InterceptEventLayout e() {
        return (InterceptEventLayout) this.f142267m.getValue();
    }

    public final LinearLayout f() {
        return (LinearLayout) this.n.getValue();
    }

    /* access modifiers changed from: package-private */
    public final TuxButton g() {
        return (TuxButton) this.o.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final UpvotePublishVM h() {
        return (UpvotePublishVM) this.s.getValue();
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public static final class b {
        static {
            Covode.recordClassIndex(93011);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }

    @Override // com.ss.android.ugc.aweme.common.keyboard.c
    public final void a(boolean z2, int i2) {
        if (z2) {
            MeasureLinearLayout a2 = a();
            h.f.b.l.b(a2, "");
            a(a2);
        }
    }

    public final void a(boolean z2) {
        if (z2) {
            TuxEditText d2 = d();
            if (d2 != null) {
                d2.requestFocus();
            }
            KeyboardUtils.b(d());
            return;
        }
        KeyboardUtils.c(d());
        dismiss();
    }

    static final class aa extends h.f.b.m implements h.f.a.a<TuxButton> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxButton invoke() {
            return a.a(this.this$0).findViewById(R.id.eii);
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.a<TuxNavBar> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxNavBar invoke() {
            return a.a(this.this$0).findViewById(R.id.en5);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return a.a(this.this$0).findViewById(R.id.a6i);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<TuxEditText> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxEditText invoke() {
            return a.a(this.this$0).findViewById(R.id.axz);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<InterceptEventLayout> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InterceptEventLayout invoke() {
            return a.a(this.this$0).findViewById(R.id.bjw);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<InterceptEventLayout> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InterceptEventLayout invoke() {
            return a.a(this.this$0).findViewById(R.id.bjx);
        }
    }

    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f142273a;

        static {
            Covode.recordClassIndex(93022);
        }

        l(a aVar) {
            this.f142273a = aVar;
        }

        public final void run() {
            MeasureLinearLayout a2 = this.f142273a.a();
            if (a2 != null) {
                a.a(a2);
            }
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<SmartAvatarImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartAvatarImageView invoke() {
            return a.a(this.this$0).findViewById(R.id.bu0);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return a.a(this.this$0).findViewById(R.id.cf9);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<MeasureLinearLayout> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MeasureLinearLayout invoke() {
            return a.a(this.this$0).findViewById(R.id.cge);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ z.a $hasClickedLink;
        final /* synthetic */ Map $rethinkMobMap;

        static {
            Covode.recordClassIndex(93033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(z.a aVar, Map map) {
            super(0);
            this.$hasClickedLink = aVar;
            this.$rethinkMobMap = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$hasClickedLink.element = true;
            com.ss.android.ugc.aweme.common.r.a("comment_rethink_cg_ck", this.$rethinkMobMap);
            return h.z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ AlertDialog $dialog;
        final /* synthetic */ Map $discardMobMap;
        final /* synthetic */ h.f.a.a $dismissAction;

        static {
            Covode.recordClassIndex(93013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Map map, AlertDialog alertDialog, h.f.a.a aVar) {
            super(0);
            this.$discardMobMap = map;
            this.$dialog = alertDialog;
            this.$dismissAction = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$discardMobMap.put("action_type", "1");
            com.ss.android.ugc.aweme.common.r.a("click_discard_pop_up", this.$discardMobMap);
            this.$dialog.dismiss();
            this.$dismissAction.invoke();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ AlertDialog $dialog;
        final /* synthetic */ Map $discardMobMap;

        static {
            Covode.recordClassIndex(93014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Map map, AlertDialog alertDialog) {
            super(0);
            this.$discardMobMap = map;
            this.$dialog = alertDialog;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$discardMobMap.put("action_type", "0");
            com.ss.android.ugc.aweme.common.r.a("click_discard_pop_up", this.$discardMobMap);
            this.$dialog.dismiss();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            String str = this.this$0.f142257b;
            if (str != null) {
                this.this$0.h().a(str, this.this$0.f142258c);
            }
            this.this$0.a(false);
            return h.z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d
    public final void dismiss() {
        TuxEditText d2 = d();
        h.f.b.l.b(d2, "");
        d2.setCursorVisible(false);
        super.dismiss();
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MeasureLinearLayout a2 = a();
        h.f.b.l.b(a2, "");
        a2.getKeyBoardObservable().b(this);
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MeasureLinearLayout a2 = a();
        h.f.b.l.b(a2, "");
        a2.getKeyBoardObservable().a(this);
        a(true);
    }

    static final class u extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ z.a $hasClickedLink;
        final /* synthetic */ Map $rethinkMobMap;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(a aVar, z.a aVar2, Map map) {
            super(0);
            this.this$0 = aVar;
            this.$hasClickedLink = aVar2;
            this.$rethinkMobMap = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            String str;
            Map map = this.$rethinkMobMap;
            if (this.$hasClickedLink.element) {
                str = "1";
            } else {
                str = "0";
            }
            map.put("if_click_cg", str);
            com.ss.android.ugc.aweme.common.r.a("comment_rethink_edit_ck", this.$rethinkMobMap);
            this.this$0.d().postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.upvote.publish.a.a.u.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ u f142276a;

                static {
                    Covode.recordClassIndex(93032);
                }

                {
                    this.f142276a = r1;
                }

                public final void run() {
                    if (this.f142276a.this$0.ad) {
                        MeasureLinearLayout a2 = this.f142276a.this$0.a();
                        if (a2 != null) {
                            a2.setVisibility(0);
                        }
                        this.f142276a.this$0.a(true);
                    }
                }
            }, 300);
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a aVar = this.this$0;
            LinearLayout f2 = aVar.f();
            h.f.b.l.b(f2, "");
            f2.setAlpha(0.34f);
            SmartAvatarImageView b2 = aVar.b();
            h.f.b.l.b(b2, "");
            b2.setAlpha(0.34f);
            TuxEditText d2 = aVar.d();
            h.f.b.l.b(d2, "");
            d2.setAlpha(0.34f);
            aVar.c().setInterceptTouchEvent(true);
            aVar.e().setInterceptTouchEvent(true);
            aVar.g().setLoading(true);
            return h.z.f158842a;
        }
    }

    public final void j() {
        LinearLayout f2 = f();
        h.f.b.l.b(f2, "");
        f2.setAlpha(1.0f);
        SmartAvatarImageView b2 = b();
        h.f.b.l.b(b2, "");
        b2.setAlpha(1.0f);
        TuxEditText d2 = d();
        h.f.b.l.b(d2, "");
        d2.setAlpha(1.0f);
        c().setInterceptTouchEvent(false);
        e().setInterceptTouchEvent(false);
        g().setLoading(false);
    }

    static final class n extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            String str;
            boolean z;
            String str2;
            String str3;
            String obj;
            TuxEditText d2 = this.this$0.d();
            String str4 = "";
            h.f.b.l.b(d2, str4);
            Editable text = d2.getText();
            if (text == null || (obj = text.toString()) == null) {
                str = null;
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                str = h.m.p.b((CharSequence) obj).toString();
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            h.p[] pVarArr = new h.p[4];
            UpvotePublishMobParam upvotePublishMobParam = this.this$0.f142258c;
            if (!(upvotePublishMobParam == null || (str3 = upvotePublishMobParam.f142213a) == null)) {
                str4 = str3;
            }
            pVarArr[0] = h.v.a(str4, "enter_from");
            pVarArr[1] = h.v.a("icon", "enter_method");
            pVarArr[2] = h.v.a("input_page", "page");
            if (z2) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            pVarArr[3] = h.v.a(str2, "with_recommendation");
            com.ss.android.ugc.aweme.common.r.a("close_recommend_panel", pVarArr);
            this.this$0.i();
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ z.a $hasClickedLink;
        final /* synthetic */ Map $rethinkMobMap;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(a aVar, z.a aVar2, Map map) {
            super(0);
            this.this$0 = aVar;
            this.$hasClickedLink = aVar2;
            this.$rethinkMobMap = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            String str;
            String obj;
            Map map = this.$rethinkMobMap;
            if (this.$hasClickedLink.element) {
                str = "1";
            } else {
                str = "0";
            }
            map.put("if_click_cg", str);
            com.ss.android.ugc.aweme.common.r.a("comment_rethink_post_ck", this.$rethinkMobMap);
            TuxEditText d2 = this.this$0.d();
            String str2 = "";
            h.f.b.l.b(d2, str2);
            Editable text = d2.getText();
            if (!(text == null || (obj = text.toString()) == null)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = h.m.p.b((CharSequence) obj).toString();
                if (obj2 != null) {
                    str2 = obj2;
                }
            }
            String str3 = this.this$0.f142257b;
            if (str3 != null) {
                this.this$0.h().a(str3, str2, this.this$0.f142258c);
                this.this$0.dismiss();
            }
            return h.z.f158842a;
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f142268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f142269b;

        static {
            Covode.recordClassIndex(93019);
        }

        j(a aVar, List list) {
            this.f142268a = aVar;
            this.f142269b = list;
        }

        public final void run() {
            MethodCollector.i(7639);
            if (this.f142268a.getContext() == null) {
                MethodCollector.o(7639);
                return;
            }
            LinearLayout f2 = this.f142268a.f();
            h.f.b.l.b(f2, "");
            int width = f2.getWidth();
            LinearLayout f3 = this.f142268a.f();
            h.f.b.l.b(f3, "");
            int paddingStart = width - f3.getPaddingStart();
            LinearLayout f4 = this.f142268a.f();
            h.f.b.l.b(f4, "");
            int paddingEnd = paddingStart - f4.getPaddingEnd();
            int size = this.f142269b.size();
            int i2 = 0;
            for (final int i3 = 0; i3 < size; i3++) {
                int i4 = paddingEnd - i2;
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                int a2 = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                if (i4 < a2 + h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()))) {
                    break;
                }
                Context requireContext = this.f142268a.requireContext();
                h.f.b.l.b(requireContext, "");
                TuxTextView tuxTextView = new TuxTextView(requireContext, null, 0, 6);
                tuxTextView.setTuxFont(31);
                tuxTextView.setGravity(17);
                tuxTextView.setText((CharSequence) this.f142269b.get(i3));
                tuxTextView.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.upvote.publish.a.a.j.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ j f142270a;

                    static {
                        Covode.recordClassIndex(93020);
                    }

                    {
                        this.f142270a = r1;
                    }

                    public final void onClick(View view) {
                        Object obj;
                        Editable editable;
                        ClickAgent.onClick(view);
                        a aVar = this.f142270a.f142268a;
                        String str = (String) this.f142270a.f142269b.get(i3);
                        if (str != null && str.length() != 0) {
                            TuxEditText d2 = aVar.d();
                            h.f.b.l.b(d2, "");
                            int b2 = h.j.h.b(d2.getSelectionStart(), 0);
                            TuxEditText d3 = aVar.d();
                            h.f.b.l.b(d3, "");
                            int b3 = h.j.h.b(d3.getSelectionEnd(), 0);
                            if (b2 == b3) {
                                TuxEditText d4 = aVar.d();
                                h.f.b.l.b(d4, "");
                                Editable text = d4.getText();
                                if (text != null) {
                                    text.insert(b2, str);
                                }
                            } else {
                                try {
                                    TuxEditText d5 = aVar.d();
                                    h.f.b.l.b(d5, "");
                                    Editable text2 = d5.getText();
                                    if (text2 != null) {
                                        editable = text2.replace(b2, b3, str);
                                    } else {
                                        editable = null;
                                    }
                                    obj = h.q.m223constructorimpl(editable);
                                } catch (Throwable th) {
                                    obj = h.q.m223constructorimpl(h.r.a(th));
                                }
                                h.q.m226exceptionOrNullimpl(obj);
                            }
                            aVar.d().setSelection(Math.min(b2 + str.length(), aVar.d().length()));
                        }
                    }
                });
                Resources system3 = Resources.getSystem();
                h.f.b.l.a((Object) system3, "");
                int a3 = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system3.getDisplayMetrics()));
                Resources system4 = Resources.getSystem();
                h.f.b.l.a((Object) system4, "");
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a3, h.g.a.a(TypedValue.applyDimension(1, 24.0f, system4.getDisplayMetrics())));
                Resources system5 = Resources.getSystem();
                h.f.b.l.a((Object) system5, "");
                i2 += h.g.a.a(TypedValue.applyDimension(1, 24.0f, system5.getDisplayMetrics()));
                if (i3 > 0) {
                    Resources system6 = Resources.getSystem();
                    h.f.b.l.a((Object) system6, "");
                    layoutParams.setMarginStart(h.g.a.a(TypedValue.applyDimension(1, 24.0f, system6.getDisplayMetrics())));
                    Resources system7 = Resources.getSystem();
                    h.f.b.l.a((Object) system7, "");
                    i2 += h.g.a.a(TypedValue.applyDimension(1, 24.0f, system7.getDisplayMetrics()));
                }
                this.f142268a.f().addView(tuxTextView, layoutParams);
            }
            MethodCollector.o(7639);
        }
    }

    public final void i() {
        CharSequence b2;
        String b3;
        if (getContext() != null) {
            int i2 = 0;
            if (g().f44736a) {
                a(false);
                return;
            }
            f fVar = new f(this);
            TuxEditText d2 = d();
            h.f.b.l.b(d2, "");
            Editable text = d2.getText();
            String str = null;
            if (text == null || (b2 = h.m.p.b(text)) == null || b2.length() == 0) {
                fVar.invoke();
                return;
            }
            h.p[] pVarArr = new h.p[2];
            UpvotePublishMobParam upvotePublishMobParam = this.f142258c;
            if (upvotePublishMobParam != null) {
                str = upvotePublishMobParam.f142213a;
            }
            pVarArr[0] = h.v.a("enter_from", str);
            pVarArr[1] = h.v.a("pop_up_type", "cancel_text");
            Map b4 = ag.b(pVarArr);
            com.ss.android.ugc.aweme.common.r.a("show_discard_pop_up", b4);
            Context requireContext = requireContext();
            h.f.b.l.b(requireContext, "");
            e eVar = new e(requireContext, (byte) 0);
            String b5 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f8v);
            h.f.b.l.b(b5, "");
            eVar.setTitle(b5);
            if (com.ss.android.ugc.aweme.upvote.b.a.b()) {
                b3 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f8u);
            } else {
                b3 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.fd8);
            }
            h.f.b.l.b(b3, "");
            eVar.setMessage(b3);
            AlertDialog create = new AlertDialog.Builder(requireContext()).setView(eVar).create();
            String b6 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f8s);
            h.f.b.l.b(b6, "");
            d dVar = new d(b4, create, fVar);
            h.f.b.l.d(b6, "");
            TuxTextView tuxTextView = (TuxTextView) eVar.findViewById(R.id.f4q);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setText(b6);
            tuxTextView.setOnClickListener(new e.b(b6, dVar));
            String b7 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f8t);
            h.f.b.l.b(b7, "");
            e eVar2 = new e(b4, create);
            h.f.b.l.d(b7, "");
            TuxTextView tuxTextView2 = (TuxTextView) eVar.findViewById(R.id.f3d);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setText(b7);
            tuxTextView2.setOnClickListener(new e.a(b7, eVar2));
            create.show();
            h.f.b.l.b(create, "");
            Window window = create.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(R.drawable.vi);
                WindowManager.LayoutParams attributes = window.getAttributes();
                Context requireContext2 = requireContext();
                h.f.b.l.b(requireContext2, "");
                Resources resources = requireContext2.getResources();
                h.f.b.l.a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i2 = displayMetrics.widthPixels;
                }
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                int a2 = i2 - (h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())) * 2);
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                attributes.width = Math.min(a2, h.g.a.a(TypedValue.applyDimension(1, 360.0f, system2.getDisplayMetrics())));
                window.setAttributes(attributes);
            }
        }
    }

    static final class x extends h.f.b.m implements h.f.a.b<BaseResponse, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseResponse baseResponse) {
            h.f.b.l.d(baseResponse, "");
            this.this$0.a(false);
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.this$0.j();
            return h.z.f158842a;
        }
    }

    public static final /* synthetic */ View a(a aVar) {
        View view = aVar.f142256a;
        if (view == null) {
            h.f.b.l.a("contentView");
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        h.f.b.l.d(configuration, "");
        super.onConfigurationChanged(configuration);
        a().a();
    }

    public static void a(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public final void afterTextChanged(Editable editable) {
        boolean z2;
        TuxButton g2 = g();
        h.f.b.l.b(g2, "");
        if (editable == null || editable.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        g2.setEnabled(!z2);
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setLayout(-1, -1);
        }
        if (bundle != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setStyle(1, R.style.a3n);
        Bundle arguments = getArguments();
        UpvotePublishMobParam upvotePublishMobParam = null;
        if (arguments != null) {
            str = arguments.getString("upvote_item_id");
        } else {
            str = null;
        }
        this.f142257b = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("emoji_text");
        } else {
            str2 = null;
        }
        this.r = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            upvotePublishMobParam = (UpvotePublishMobParam) arguments3.getParcelable("mob_param");
        }
        this.f142258c = upvotePublishMobParam;
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        h.f.b.l.b(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(20);
        }
        Window window2 = onCreateDialog.getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.e, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(androidx.core.content.b.c(this.this$0.requireContext(), R.color.r));
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            eVar2.f44783i = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            eVar2.f44784j = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
            return h.z.f158842a;
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f142272a;

        static {
            Covode.recordClassIndex(93021);
        }

        k(a aVar) {
            this.f142272a = aVar;
        }

        public final void onClick(View view) {
            String str;
            boolean z;
            String str2;
            String str3;
            String obj;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                TuxEditText d2 = this.f142272a.d();
                String str4 = "";
                h.f.b.l.b(d2, str4);
                Editable text = d2.getText();
                if (text == null || (obj = text.toString()) == null) {
                    str = null;
                } else {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                    str = h.m.p.b((CharSequence) obj).toString();
                }
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                h.p[] pVarArr = new h.p[4];
                UpvotePublishMobParam upvotePublishMobParam = this.f142272a.f142258c;
                if (!(upvotePublishMobParam == null || (str3 = upvotePublishMobParam.f142213a) == null)) {
                    str4 = str3;
                }
                pVarArr[0] = h.v.a(str4, "enter_from");
                pVarArr[1] = h.v.a("other", "enter_method");
                pVarArr[2] = h.v.a("input_page", "page");
                if (z2) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                pVarArr[3] = h.v.a(str2, "with_recommendation");
                com.ss.android.ugc.aweme.common.r.a("close_recommend_panel", pVarArr);
                this.f142272a.i();
            }
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f142274a;

        static {
            Covode.recordClassIndex(93025);
        }

        o(a aVar) {
            this.f142274a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
            if (r0 == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
            if (r5 == null) goto L_0x00bd;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
            // Method dump skipped, instructions count: 332
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.publish.a.a.o.onClick(android.view.View):void");
        }
    }

    static final class z extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, CommentRethinkPopup, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(93037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, CommentRethinkPopup commentRethinkPopup) {
            String str;
            String str2;
            CommentRethinkPopup commentRethinkPopup2 = commentRethinkPopup;
            String str3 = "";
            h.f.b.l.d(dVar, str3);
            this.this$0.j();
            androidx.fragment.app.i fragmentManager = this.this$0.getFragmentManager();
            if (!(commentRethinkPopup2 == null || fragmentManager == null)) {
                a aVar = this.this$0;
                MeasureLinearLayout a2 = aVar.a();
                h.f.b.l.b(a2, str3);
                a2.setVisibility(4);
                KeyboardUtils.c(aVar.d());
                h.p[] pVarArr = new h.p[4];
                if (aVar.f142260e) {
                    str = "1";
                } else {
                    str = "0";
                }
                pVarArr[0] = h.v.a("resend_same_cmt", str);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, str3);
                pVarArr[1] = h.v.a("user_id", g2.getCurUserId());
                UpvotePublishMobParam upvotePublishMobParam = aVar.f142258c;
                if (!(upvotePublishMobParam == null || (str2 = upvotePublishMobParam.f142215c) == null)) {
                    str3 = str2;
                }
                pVarArr[2] = h.v.a("group_id", str3);
                pVarArr[3] = h.v.a("scene", "recommend");
                Map b2 = ag.b(pVarArr);
                com.ss.android.ugc.aweme.common.r.a("comment_rethink_sw", b2);
                z.a aVar2 = new z.a();
                aVar2.element = false;
                CommentServiceImpl.e().a(fragmentManager, commentRethinkPopup2, new t(aVar, aVar2, b2), new u(aVar, aVar2, b2), new v(aVar2, b2), "UpvoteCommentDialogFragment");
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z2;
        ArrayList arrayList;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (getContext() != null) {
            MeasureLinearLayout a2 = a();
            h.f.b.l.b(a2, "");
            a2.setKeyBoardObservable(new com.ss.android.ugc.aweme.common.keyboard.b());
            a().setOnClickListener(new k(this));
            MeasureLinearLayout a3 = a();
            h.f.b.l.b(a3, "");
            a3.setVisibility(4);
            a().postDelayed(new l(this), 500);
            ConstraintLayout k2 = k();
            h.f.b.l.b(k2, "");
            com.bytedance.tux.c.e a4 = com.bytedance.tux.c.f.a(new m(this));
            Context requireContext = requireContext();
            h.f.b.l.b(requireContext, "");
            k2.setBackground(a4.a(requireContext));
            k().setOnClickListener(null);
            TuxNavBar l2 = l();
            com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
            String b2 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f8x);
            h.f.b.l.b(b2, "");
            l2.a(gVar.a(b2));
            l().b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((h.f.a.a<h.z>) new n(this)));
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            h.f.b.l.b(curUser, "");
            com.bytedance.lighten.a.v a5 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(curUser.getAvatarThumb()));
            a5.E = b();
            a5.c();
            String str = this.r;
            if (!(str == null || str.length() == 0)) {
                TuxEditText d2 = d();
                h.f.b.l.b(d2, "");
                Editable text = d2.getText();
                if (text != null) {
                    text.append((CharSequence) this.r);
                }
            }
            d().addTextChangedListener(this);
            p pVar = new p(this);
            TuxEditText d3 = d();
            h.f.b.l.b(d3, "");
            d3.setFilters(new InputFilter[]{pVar});
            TuxButton g3 = g();
            h.f.b.l.b(g3, "");
            String str2 = this.r;
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            g3.setEnabled(!z2);
            g().setOnClickListener(new o(this));
            List<String> list = this.p;
            com.ss.android.ugc.aweme.emoji.sysemoji.h.f89395e.c();
            g.a.a();
            List<com.ss.android.ugc.aweme.emoji.sysemoji.i> a6 = com.ss.android.ugc.aweme.emoji.sysemoji.g.a(2);
            if (a6 != null) {
                ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) a6, 10));
                Iterator<T> it = a6.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().getPreviewEmoji());
                }
                ArrayList arrayList3 = arrayList2;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    List<String> list2 = this.q;
                    ArrayList arrayList4 = new ArrayList();
                    for (T t2 : list2) {
                        if (arrayList3.contains(t2) && !this.p.contains(t2)) {
                            arrayList4.add(t2);
                        }
                    }
                    arrayList = arrayList4;
                    f().post(new j(this, h.a.n.d((Collection) list, arrayList)));
                }
            }
            arrayList = h.a.z.INSTANCE;
            f().post(new j(this, h.a.n.d((Collection) list, arrayList)));
        }
        h().a(b.f142277a, com.bytedance.assem.arch.viewModel.l.a(), new y(this), new w(this), new x(this));
        f.a.a(this, h(), c.f142278a, com.bytedance.assem.arch.viewModel.l.a(), new z(this), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.bi8, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.f142256a = a2;
        if (a2 == null) {
            h.f.b.l.a("contentView");
        }
        return a2;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    static final class p implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f142275a;

        static {
            Covode.recordClassIndex(93026);
        }

        p(a aVar) {
            this.f142275a = aVar;
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            return this.f142275a.a(charSequence, i2, i3, spanned, i4, i5);
        }
    }

    public final CharSequence a(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        int i6;
        String str;
        if (spanned != null) {
            i6 = spanned.length();
        } else {
            i6 = 0;
        }
        int i7 = 150 - (i6 - (i5 - i4));
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.hfi);
        } else {
            str = null;
        }
        if (i7 <= 0) {
            if (!(charSequence == null || charSequence.length() == 0)) {
                new com.bytedance.tux.g.b(this).a(str).b();
            }
            return "";
        } else if (i7 >= i3 - i2) {
            return null;
        } else {
            int i8 = i7 + i2;
            if (charSequence == null || charSequence.length() == 0 || !Character.isHighSurrogate(charSequence.charAt(i8 - 1)) || i8 - 1 != i2) {
                new com.bytedance.tux.g.b(this).a(str).b();
                if (charSequence != null) {
                    return charSequence.subSequence(i2, i8);
                }
                return null;
            }
            new com.bytedance.tux.g.b(this).a(str).b();
            return "";
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }
}
