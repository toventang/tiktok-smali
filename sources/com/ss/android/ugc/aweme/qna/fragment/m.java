package com.ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.ss.android.ugc.aweme.qna.c.b;
import com.ss.android.ugc.aweme.qna.d.h;
import com.ss.android.ugc.aweme.qna.ui.QnaRecyclerView;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaQuestionsTabViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.service.IEOYService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class m extends a implements com.bytedance.assem.arch.viewModel.h {
    public static final f n = new f((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    public View f119434i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qna.ui.l f119435j;

    /* renamed from: k  reason: collision with root package name */
    public QnaQuestionsTabViewModel f119436k;

    /* renamed from: l  reason: collision with root package name */
    public String f119437l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f119438m;
    private QnaRecyclerView o;
    private final com.bytedance.assem.arch.viewModel.b p;
    private final com.bytedance.assem.arch.viewModel.b q;
    private final com.bytedance.assem.a.a r;
    private SparseArray s;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.f, com.ss.android.ugc.aweme.qna.vm.f> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(77583);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.f invoke(com.ss.android.ugc.aweme.qna.vm.f fVar) {
            h.f.b.l.c(fVar, "");
            return fVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.h, com.ss.android.ugc.aweme.qna.vm.h> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(77585);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.h invoke(com.ss.android.ugc.aweme.qna.vm.h hVar) {
            h.f.b.l.c(hVar, "");
            return hVar;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.g, com.ss.android.ugc.aweme.qna.vm.g> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(77586);
        }

        public e() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.g invoke(com.ss.android.ugc.aweme.qna.vm.g gVar) {
            h.f.b.l.c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(77581);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final View a(int i2) {
        if (this.s == null) {
            this.s = new SparseArray();
        }
        View view = (View) this.s.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.s.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final int c() {
        return R.string.f46;
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.a
    public final String d() {
        return "questions";
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

    public final QnaBannerViewModel i() {
        return (QnaBannerViewModel) this.p.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class f {
        static {
            Covode.recordClassIndex(77587);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
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

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.j();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.a
    public final void f() {
        if (this.f119436k != null) {
            j();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, User, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ l this$0;

            static {
                Covode.recordClassIndex(77594);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(0);
                this.this$0 = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.this$0.j();
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, User user) {
            LiveData<com.ss.android.ugc.aweme.qna.g.b<w>> liveData;
            com.ss.android.ugc.aweme.qna.g.b<w> value;
            T t;
            User user2 = user;
            h.f.b.l.d(dVar, "");
            if (user2 != null) {
                this.this$0.f119437l = in.a(user2, false);
                QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.this$0.f119436k;
                if (!(qnaQuestionsTabViewModel == null || (liveData = qnaQuestionsTabViewModel.f119636c) == null || (value = liveData.getValue()) == null || (t = value.f119462b) == null)) {
                    m mVar = this.this$0;
                    mVar.a(t, mVar.g(), v.Questions, this.this$0.h(), this.this$0.f119437l, new a(this), this.this$0.f119438m);
                }
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<w, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ w $fetchQuestionsSuccess$inlined;
            final /* synthetic */ r this$0;

            static {
                Covode.recordClassIndex(77601);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, w wVar) {
                super(0);
                this.this$0 = rVar;
                this.$fetchQuestionsSuccess$inlined = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.this$0.j();
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(w wVar) {
            w wVar2 = wVar;
            h.f.b.l.d(wVar2, "");
            if (this.this$0.f119437l != null) {
                m mVar = this.this$0;
                mVar.a(wVar2, mVar.g(), v.Questions, this.this$0.h(), this.this$0.f119437l, new a(this, wVar2), this.this$0.f119438m);
            }
            return z.f158842a;
        }
    }

    public final View g() {
        View view = this.f119434i;
        if (view == null) {
            h.f.b.l.a("questionsTabLayout");
        }
        return view;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77582);
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

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public final boolean h() {
        String str = ((a) this).f119407f;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        return TextUtils.equals(str, g2.getCurUserId());
    }

    public final void j() {
        String lastRecordedSecUid;
        String str = ((a) this).f119407f;
        if (str != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            if (h()) {
                h.f.b.l.b(g2, "");
                str = g2.getCurUserId();
            }
            boolean h2 = h();
            h.f.b.l.b(g2, "");
            if (h2) {
                lastRecordedSecUid = g2.getCurSecUserId();
            } else {
                lastRecordedSecUid = g2.getLastRecordedSecUid();
            }
            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f119436k;
            if (qnaQuestionsTabViewModel != null) {
                h.f.b.l.b(str, "");
                h.f.b.l.b(lastRecordedSecUid, "");
                qnaQuestionsTabViewModel.a(str, lastRecordedSecUid, this.f119437l, this.f119438m, h());
            }
        }
    }

    public final void k() {
        String lastRecordedSecUid;
        String str = ((a) this).f119407f;
        if (str != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            if (h()) {
                h.f.b.l.b(g2, "");
                str = g2.getCurUserId();
            }
            boolean h2 = h();
            h.f.b.l.b(g2, "");
            if (h2) {
                lastRecordedSecUid = g2.getCurSecUserId();
            } else {
                lastRecordedSecUid = g2.getLastRecordedSecUid();
            }
            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f119436k;
            if (qnaQuestionsTabViewModel != null) {
                h.f.b.l.b(str, "");
                h.f.b.l.b(lastRecordedSecUid, "");
                String str2 = this.f119437l;
                boolean z = this.f119438m;
                boolean h3 = h();
                h.f.b.l.d(str, "");
                h.f.b.l.d(lastRecordedSecUid, "");
                com.ss.android.ugc.aweme.qna.d.h hVar = qnaQuestionsTabViewModel.f119634a;
                h.f.b.l.d(str, "");
                h.f.b.l.d(lastRecordedSecUid, "");
                hVar.n.a(QnaApiV2.a.a().getQuestionsTabData(h.m.p.g(str), hVar.f119337l, 0, lastRecordedSecUid).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h.c(hVar, z, str2, h3), new h.d(hVar, z, str2, h3)));
            }
        }
    }

    public m() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(QnaBannerViewModel.class);
        a aVar2 = new a(a2);
        b bVar3 = b.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, true), com.bytedance.assem.arch.extensions.u.a((ag) this, true), u.c.f25670a, bVar3, com.bytedance.assem.arch.extensions.u.a((Fragment) this, true), com.bytedance.assem.arch.extensions.u.b((Fragment) this, true));
        } else if (aVar == null || h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), u.c.f25670a, bVar3, com.bytedance.assem.arch.extensions.u.a((Fragment) this, false), com.bytedance.assem.arch.extensions.u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.p = bVar;
        i.a aVar3 = i.a.f25718a;
        h.k.c a3 = ab.a(QnaSelectedPageViewModel.class);
        c cVar = new c(a3);
        d dVar = d.INSTANCE;
        if (h.f.b.l.a(aVar3, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, true), com.bytedance.assem.arch.extensions.u.a((ag) this, true), u.c.f25670a, dVar, com.bytedance.assem.arch.extensions.u.a((Fragment) this, true), com.bytedance.assem.arch.extensions.u.b((Fragment) this, true));
        } else if (aVar3 == null || h.f.b.l.a(aVar3, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), u.c.f25670a, dVar, com.bytedance.assem.arch.extensions.u.a((Fragment) this, false), com.bytedance.assem.arch.extensions.u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.q = bVar2;
        this.r = new com.bytedance.assem.a.a(ab.a(QnaCreationViewModel.class), null, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), u.c.f25670a, e.INSTANCE, com.bytedance.assem.arch.extensions.u.a((Fragment) this, true), com.bytedance.assem.arch.extensions.u.b((Fragment) this, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    static final class v extends h.f.b.m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f119439a = new v();

        static {
            Covode.recordClassIndex(77605);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            h.f.b.l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f119440a);
            return z.f158842a;
        }
    }

    static final class w implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f119441a;

        static {
            Covode.recordClassIndex(77607);
        }

        w(m mVar) {
            this.f119441a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119441a.k();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(v.f119439a);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$m  reason: collision with other inner class name */
    static final class C3084m extends h.f.b.m implements h.f.a.b<Long, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3084m(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Long l2) {
            this.this$0.i().a(new QnaBannerViewModel.e(l2.longValue()));
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.model.i, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.model.i iVar) {
            com.ss.android.ugc.aweme.qna.model.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            m mVar = this.this$0;
            String str = iVar2.f119518a;
            com.ss.android.ugc.aweme.qna.ui.l lVar = mVar.f119435j;
            if (lVar == null) {
                h.f.b.l.a("questionsTabAdapter");
            }
            lVar.a(str);
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.d, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.d dVar) {
            com.ss.android.ugc.aweme.qna.vm.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            String str = dVar2.f119669a;
            String str2 = dVar2.f119670b;
            Context requireContext = this.this$0.requireContext();
            h.f.b.l.b(requireContext, "");
            m.a(str, str2, requireContext, this.this$0.h());
            return z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.a, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.a aVar) {
            com.ss.android.ugc.aweme.qna.vm.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            this.this$0.a(aVar2.f119660a, aVar2.f119661b, this.this$0.h());
            return z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.c, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.c cVar) {
            com.ss.android.ugc.aweme.qna.vm.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            m mVar = this.this$0;
            mVar.a(cVar2, mVar.h());
            return z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(m mVar, View view) {
            super(1);
            this.this$0 = mVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.qna.fragment.m.x.AnonymousClass1 */
                final /* synthetic */ x this$0;

                static {
                    Covode.recordClassIndex(77609);
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
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.dqk);
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.qna.a.h.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.qna.a.h();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<w, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(w wVar) {
            h.f.b.l.d(wVar, "");
            String str = ((a) this.this$0).f119407f;
            if (str != null) {
                QnaBannerViewModel i2 = this.this$0.i();
                Long g2 = h.m.p.g(str);
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g3, "");
                String lastRecordedSecUid = g3.getLastRecordedSecUid();
                h.f.b.l.b(lastRecordedSecUid, "");
                i2.a(g2, lastRecordedSecUid);
            }
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.qna.model.f>, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.qna.model.f> list) {
            List<? extends com.ss.android.ugc.aweme.qna.model.f> list2 = list;
            h.f.b.l.d(list2, "");
            com.ss.android.ugc.aweme.qna.ui.l lVar = this.this$0.f119435j;
            if (lVar == null) {
                h.f.b.l.a("questionsTabAdapter");
            }
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            lVar.a(arrayList);
            return z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.qna.vm.b $navigateDialogUiModel;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(m mVar, com.ss.android.ugc.aweme.qna.vm.b bVar) {
            super(1);
            this.this$0 = mVar;
            this.$navigateDialogUiModel = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.requireContext().getString(R.string.b5g);
            h.f.b.l.b(string, "");
            bVar2.c(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.qna.fragment.m.y.AnonymousClass1 */
                final /* synthetic */ y this$0;

                static {
                    Covode.recordClassIndex(77611);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    T t;
                    MethodCollector.i(8494);
                    h.f.b.l.d(aVar, "");
                    String str = this.this$0.$navigateDialogUiModel.f119662a;
                    h.f.b.l.d(str, "");
                    com.ss.android.ugc.aweme.common.r.a("delete_question", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qa_personal_profile").a("question_id", str).f66730a);
                    QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.this$0.this$0.f119436k;
                    if (qnaQuestionsTabViewModel != null) {
                        String str2 = this.this$0.$navigateDialogUiModel.f119662a;
                        this.this$0.this$0.h();
                        h.f.b.l.d(str2, "");
                        com.ss.android.ugc.aweme.qna.d.h hVar = qnaQuestionsTabViewModel.f119634a;
                        h.f.b.l.d(str2, "");
                        synchronized (hVar.o) {
                            try {
                                List<com.ss.android.ugc.aweme.question.c> list = hVar.f119333h;
                                ArrayList arrayList = new ArrayList();
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    String str3 = null;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    Long id = next.getId();
                                    if (id != null) {
                                        str3 = String.valueOf(id.longValue());
                                    }
                                    if (!h.f.b.l.a((Object) str3, (Object) str2)) {
                                        arrayList.add(next);
                                    }
                                }
                                hVar.f119333h = h.a.n.g((Collection) arrayList);
                            } catch (Throwable th) {
                                MethodCollector.o(8494);
                                throw th;
                            }
                        }
                        com.ss.android.ugc.aweme.qna.d.h.a(hVar, h.a.z.INSTANCE, null, false, false, 6);
                        com.ss.android.ugc.aweme.qna.g.b<Long> value = hVar.f119331f.getValue();
                        if (!(value == null || (t = value.f119462b) == null)) {
                            hVar.f119331f.postValue(new com.ss.android.ugc.aweme.qna.g.b<>(Long.valueOf(t.longValue() - 1)));
                        }
                        hVar.f119328c.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(com.ss.android.ugc.aweme.qna.ui.o.a((com.ss.android.ugc.aweme.qna.api.i) null, hVar.f119333h)));
                        hVar.n.a(QnaApiV2.a.a().deleteQuestion(Long.parseLong(str2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h.a(hVar), h.b.f119340a));
                    }
                    z zVar = z.f158842a;
                    MethodCollector.o(8494);
                    return zVar;
                }
            });
            String string2 = this.this$0.requireContext().getString(R.string.a9e);
            h.f.b.l.b(string2, "");
            bVar2.b(string2, AnonymousClass2.f119442a);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.b, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.b bVar) {
            com.ss.android.ugc.aweme.qna.vm.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            b.a.a(bVar2.f119662a, this.this$0.h());
            ArrayList arrayList = new ArrayList();
            if (!this.this$0.h() && !bVar2.f119663b) {
                String string = this.this$0.requireContext().getString(R.string.gkc);
                h.f.b.l.b(string, "");
                arrayList.add(new f(string, 0, c.TRANSLATE));
                String string2 = this.this$0.requireContext().getString(R.string.f57);
                h.f.b.l.b(string2, "");
                arrayList.add(new f(string2, 0, c.VIEW_ANSWERS));
            } else if (!this.this$0.h()) {
                String string3 = this.this$0.requireContext().getString(R.string.f56);
                h.f.b.l.b(string3, "");
                arrayList.add(new f(string3, 0, c.UNTRANSLATE));
                String string4 = this.this$0.requireContext().getString(R.string.f57);
                h.f.b.l.b(string4, "");
                arrayList.add(new f(string4, 0, c.VIEW_ANSWERS));
            } else {
                String string5 = this.this$0.requireContext().getString(R.string.f57);
                h.f.b.l.b(string5, "");
                arrayList.add(new f(string5, 0, c.VIEW_ANSWERS));
                String string6 = this.this$0.requireContext().getString(R.string.b5g);
                h.f.b.l.b(string6, "");
                arrayList.add(new f(string6, 1, c.DELETE));
            }
            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.this$0.f119436k;
            if (qnaQuestionsTabViewModel != null) {
                this.this$0.a(arrayList, qnaQuestionsTabViewModel, bVar2);
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<e, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            int i2;
            MethodCollector.i(9553);
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            b.a.a(eVar2.f119417a.f119662a, eVar2.f119418b, this.this$0.h());
            int i3 = n.f119443a[eVar2.f119418b.ordinal()];
            if (i3 == 1) {
                QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.this$0.f119436k;
                if (qnaQuestionsTabViewModel != null) {
                    String str = eVar2.f119417a.f119662a;
                    this.this$0.h();
                    h.f.b.l.d(str, "");
                    com.ss.android.ugc.aweme.qna.d.h hVar = qnaQuestionsTabViewModel.f119634a;
                    h.f.b.l.d(str, "");
                    synchronized (hVar.o) {
                        try {
                            hVar.f119335j.add(str);
                        } catch (Throwable th) {
                            MethodCollector.o(9553);
                            throw th;
                        }
                    }
                    com.ss.android.ugc.aweme.qna.d.h.a(hVar, h.a.z.INSTANCE, null, false, false, 22);
                    String str2 = null;
                    int i4 = 0;
                    int size = hVar.f119333h.size();
                    if (size >= 0) {
                        while (true) {
                            if (!h.f.b.l.a((Object) String.valueOf(hVar.f119333h.get(i4).getId()), (Object) str)) {
                                if (i4 == size) {
                                    break;
                                }
                                i4++;
                            } else {
                                str2 = hVar.f119333h.get(i4).getContent();
                                break;
                            }
                        }
                    }
                    if (str2 != null) {
                        hVar.f119336k.a(new com.ss.android.ugc.aweme.qna.d.l(str, new com.ss.android.ugc.aweme.qna.d.a(h.a.n.a(new com.ss.android.ugc.aweme.qna.d.k(str2)), SettingServiceImpl.v().h())), hVar);
                    }
                }
            } else if (i3 == 2) {
                QnaQuestionsTabViewModel qnaQuestionsTabViewModel2 = this.this$0.f119436k;
                if (qnaQuestionsTabViewModel2 != null) {
                    String str3 = eVar2.f119417a.f119662a;
                    this.this$0.h();
                    h.f.b.l.d(str3, "");
                    com.ss.android.ugc.aweme.qna.d.h hVar2 = qnaQuestionsTabViewModel2.f119634a;
                    h.f.b.l.d(str3, "");
                    hVar2.f119334i.remove(str3);
                    com.ss.android.ugc.aweme.qna.d.h.a(hVar2, h.a.z.INSTANCE, null, false, false, 22);
                }
            } else if (i3 == 3) {
                QnaQuestionsTabViewModel qnaQuestionsTabViewModel3 = this.this$0.f119436k;
                if (qnaQuestionsTabViewModel3 != null) {
                    qnaQuestionsTabViewModel3.a(eVar2.f119417a.f119662a, "click_question");
                }
            } else if (i3 == 4) {
                m mVar = this.this$0;
                com.ss.android.ugc.aweme.qna.vm.b bVar = eVar2.f119417a;
                if (h.f.b.l.a((Object) bVar.f119665d, (Object) "textual")) {
                    i2 = R.string.f5j;
                } else {
                    i2 = R.string.f5d;
                }
                Context requireContext = mVar.requireContext();
                h.f.b.l.b(requireContext, "");
                ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(requireContext).a(R.string.d5)).d(mVar.requireContext().getString(i2)), new y(mVar, bVar)).a(true)).a().b().show();
            }
            z zVar = z.f158842a;
            MethodCollector.o(9553);
            return zVar;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.ss.android.ugc.aweme.qna.vm.e, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.ss.android.ugc.aweme.qna.vm.e eVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(eVar, "");
            if (eVar == com.ss.android.ugc.aweme.qna.vm.e.PUBLISH_SUCCEED && ((a) this.this$0).f119406e) {
                this.this$0.k();
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, Boolean, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, Boolean bool) {
            Boolean bool2 = bool;
            h.f.b.l.d(dVar, "");
            if (bool2 != null) {
                bool2.booleanValue();
                this.this$0.f119438m = !bool2.booleanValue();
            }
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends a>, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(77598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends a> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends a> aVar2 = aVar;
            h.f.b.l.d(dVar, "");
            if (aVar2 != null) {
                t = aVar2.f25631b;
            } else {
                t = null;
            }
            if (t instanceof m) {
                this.this$0.e();
                EOYServiceImpl.b().b("qa_others_profile");
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData<com.ss.android.ugc.aweme.qna.g.b<w>> liveData;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.model.i>> liveData2;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<Long>> liveData3;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<e>> liveData4;
        androidx.lifecycle.t<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.b>> tVar;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.c>> liveData5;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.a>> liveData6;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.d>> liveData7;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<w>> liveData8;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<List<com.ss.android.ugc.aweme.qna.model.f>>> liveData9;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("isSelf")) {
            IEOYService b2 = EOYServiceImpl.b();
            View view2 = this.f119434i;
            if (view2 == null) {
                h.f.b.l.a("questionsTabLayout");
            }
            if (!(view2 instanceof ViewGroup)) {
                view2 = null;
            }
            if (b2.a((ViewGroup) view2, "qa_others_profile")) {
                View view3 = this.f119434i;
                if (view3 == null) {
                    h.f.b.l.a("questionsTabLayout");
                }
                View findViewById = view3.findViewById(R.id.dgd);
                h.f.b.l.b(findViewById, "");
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                com.bytedance.tux.h.i.b(findViewById, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()))), null, null, false, 29);
            }
        }
        com.bytedance.assem.arch.extensions.d.a(this, new x(this, view));
        View view4 = this.f119434i;
        if (view4 == null) {
            h.f.b.l.a("questionsTabLayout");
        }
        ((TuxStatusView) view4.findViewById(R.id.dew)).a();
        this.f119436k = (QnaQuestionsTabViewModel) new ad(this).a(QnaQuestionsTabViewModel.class);
        View view5 = this.f119434i;
        if (view5 == null) {
            h.f.b.l.a("questionsTabLayout");
        }
        h.f.b.l.b(requireContext(), "");
        View findViewById2 = view5.findViewById(R.id.dgd);
        h.f.b.l.b(findViewById2, "");
        QnaRecyclerView qnaRecyclerView = (QnaRecyclerView) findViewById2;
        this.o = qnaRecyclerView;
        if (qnaRecyclerView == null) {
            h.f.b.l.a("rv");
        }
        RecyclerView.f itemAnimator = qnaRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f3833l = 0;
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f119436k;
        Objects.requireNonNull(qnaQuestionsTabViewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.vm.QnaViewHolderClickDelegate");
        this.f119435j = new com.ss.android.ugc.aweme.qna.ui.l(qnaQuestionsTabViewModel);
        QnaRecyclerView qnaRecyclerView2 = this.o;
        if (qnaRecyclerView2 == null) {
            h.f.b.l.a("rv");
        }
        qnaRecyclerView2.setLayoutManager(new LinearLayoutManager());
        QnaRecyclerView qnaRecyclerView3 = this.o;
        if (qnaRecyclerView3 == null) {
            h.f.b.l.a("rv");
        }
        com.ss.android.ugc.aweme.qna.ui.l lVar = this.f119435j;
        if (lVar == null) {
            h.f.b.l.a("questionsTabAdapter");
        }
        qnaRecyclerView3.setAdapter(lVar);
        QnaRecyclerView qnaRecyclerView4 = this.o;
        if (qnaRecyclerView4 == null) {
            h.f.b.l.a("rv");
        }
        QnaRecyclerView qnaRecyclerView5 = this.o;
        if (qnaRecyclerView5 == null) {
            h.f.b.l.a("rv");
        }
        com.ss.android.ugc.aweme.qna.ui.l lVar2 = this.f119435j;
        if (lVar2 == null) {
            h.f.b.l.a("questionsTabAdapter");
        }
        qnaRecyclerView4.a(a(qnaRecyclerView5, lVar2, new g(this)));
        f.a.a(this, i(), p.f119445a, (com.bytedance.assem.arch.viewModel.k) null, new o(this), 6);
        f.a.a(this, (QnaSelectedPageViewModel) this.q.getValue(), r.f119447a, (com.bytedance.assem.arch.viewModel.k) null, new p(this), 6);
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel2 = this.f119436k;
        if (!(qnaQuestionsTabViewModel2 == null || (liveData9 = qnaQuestionsTabViewModel2.f119635b) == null)) {
            liveData9.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new q(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel3 = this.f119436k;
        if (!(qnaQuestionsTabViewModel3 == null || (liveData8 = qnaQuestionsTabViewModel3.f119636c) == null)) {
            liveData8.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new r(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel4 = this.f119436k;
        if (!(qnaQuestionsTabViewModel4 == null || (liveData7 = qnaQuestionsTabViewModel4.f119657i) == null)) {
            liveData7.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new s(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel5 = this.f119436k;
        if (!(qnaQuestionsTabViewModel5 == null || (liveData6 = qnaQuestionsTabViewModel5.f119658j) == null)) {
            liveData6.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new t(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel6 = this.f119436k;
        if (!(qnaQuestionsTabViewModel6 == null || (liveData5 = qnaQuestionsTabViewModel6.f119659k) == null)) {
            liveData5.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new u(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel7 = this.f119436k;
        if (!(qnaQuestionsTabViewModel7 == null || (tVar = qnaQuestionsTabViewModel7.f119640g) == null)) {
            tVar.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new j(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel8 = this.f119436k;
        if (!(qnaQuestionsTabViewModel8 == null || (liveData4 = qnaQuestionsTabViewModel8.f119641h) == null)) {
            liveData4.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new k(this)));
        }
        f.a.a(this, i(), q.f119446a, com.bytedance.assem.arch.viewModel.l.c(), new l(this), 4);
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel9 = this.f119436k;
        if (!(qnaQuestionsTabViewModel9 == null || (liveData3 = qnaQuestionsTabViewModel9.f119638e) == null)) {
            liveData3.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new C3084m(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel10 = this.f119436k;
        if (!(qnaQuestionsTabViewModel10 == null || (liveData2 = qnaQuestionsTabViewModel10.f119639f) == null)) {
            liveData2.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new n(this)));
        }
        f.a.a(this, (QnaCreationViewModel) this.r.getValue(), o.f119444a, (com.bytedance.assem.arch.viewModel.k) null, new h(this), 6);
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel11 = this.f119436k;
        if (!(qnaQuestionsTabViewModel11 == null || (liveData = qnaQuestionsTabViewModel11.f119637d) == null)) {
            liveData.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new i(this)));
        }
        if (com.ss.android.ugc.aweme.qna.e.c.a()) {
            View view6 = this.f119434i;
            if (view6 == null) {
                h.f.b.l.a("questionsTabLayout");
            }
            Button button = (Button) view6.findViewById(R.id.b28);
            if (button != null) {
                button.setVisibility(0);
                button.setOnClickListener(new w(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.arc, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.f119434i = a2;
        if (a2 == null) {
            h.f.b.l.a("questionsTabLayout");
        }
        return a2;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
