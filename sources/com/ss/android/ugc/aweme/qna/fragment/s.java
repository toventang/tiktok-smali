package com.ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.ui.QnaRecyclerView;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.service.IEOYService;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class s extends a implements com.bytedance.assem.arch.viewModel.h {
    public static final e q = new e((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    public QnaSuggestedTabViewModel f119448i;

    /* renamed from: j  reason: collision with root package name */
    public View f119449j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qna.ui.l f119450k;

    /* renamed from: l  reason: collision with root package name */
    public String f119451l;

    /* renamed from: m  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.qna.g.e f119452m;
    public final boolean n;
    public final AtomicLong o;
    public final int p;
    private final com.bytedance.assem.arch.viewModel.b r;
    private final com.bytedance.assem.arch.viewModel.b s;
    private QnaRecyclerView t;
    private SparseArray u;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.f, com.ss.android.ugc.aweme.qna.vm.f> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(77620);
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
            Covode.recordClassIndex(77622);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.h invoke(com.ss.android.ugc.aweme.qna.vm.h hVar) {
            h.f.b.l.c(hVar, "");
            return hVar;
        }
    }

    static {
        Covode.recordClassIndex(77618);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final View a(int i2) {
        if (this.u == null) {
            this.u = new SparseArray();
        }
        View view = (View) this.u.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.u.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.u;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final int c() {
        return R.string.f6e;
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.a
    public final String d() {
        return "suggested";
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class e {
        static {
            Covode.recordClassIndex(77623);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(s sVar) {
            super(0);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.this$0.f119448i;
            if (qnaSuggestedTabViewModel != null) {
                qnaSuggestedTabViewModel.a();
            }
            return z.f158842a;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77619);
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
            Covode.recordClassIndex(77621);
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

    @Override // com.ss.android.ugc.aweme.qna.fragment.a
    public final void e() {
        com.ss.android.ugc.aweme.qna.model.h hVar;
        super.e();
        QnaRecyclerView qnaRecyclerView = this.t;
        if (qnaRecyclerView != null) {
            RecyclerView.i layoutManager = qnaRecyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                int k2 = linearLayoutManager.k();
                int m2 = linearLayoutManager.m();
                ArrayList arrayList = new ArrayList();
                while (k2 <= m2) {
                    int i2 = k2 + 1;
                    RecyclerView.ViewHolder f2 = qnaRecyclerView.f(k2);
                    if (!(f2 instanceof com.ss.android.ugc.aweme.qna.ui.k)) {
                        f2 = null;
                    }
                    com.ss.android.ugc.aweme.qna.ui.k kVar = (com.ss.android.ugc.aweme.qna.ui.k) f2;
                    if (!(kVar == null || (hVar = kVar.f119590a) == null)) {
                        arrayList.add(hVar);
                    }
                    k2 = i2;
                }
                com.ss.android.ugc.aweme.qna.ui.l lVar = this.f119450k;
                if (lVar == null) {
                    h.f.b.l.a("suggestedTabAdapter");
                }
                lVar.b(arrayList);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.a
    public final void f() {
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.f119448i;
        if (qnaSuggestedTabViewModel == null) {
            return;
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "public_qna_suggested_tab", 0) == 3) {
            com.ss.android.ugc.aweme.qna.d.b bVar = qnaSuggestedTabViewModel.f119644a;
            String b2 = dg.a().b(h.a.n.b(bVar.a(bVar.f119277c), bVar.b(bVar.f119278d)));
            h.f.b.l.b(b2, "");
            bVar.a(b2, h.a.n.b(com.ss.android.ugc.aweme.qna.api.f.RECOMMEND, com.ss.android.ugc.aweme.qna.api.f.INVITATION), false);
        } else if (com.ss.android.ugc.aweme.qna.e.b.b()) {
            qnaSuggestedTabViewModel.f119644a.a();
        } else if (com.ss.android.ugc.aweme.qna.e.b.a()) {
            qnaSuggestedTabViewModel.f119644a.b();
        }
    }

    public s() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(QnaBannerViewModel.class);
        a aVar2 = new a(a2);
        b bVar3 = b.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, bVar3, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (aVar == null || h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar3, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.r = bVar;
        i.a aVar3 = i.a.f25718a;
        h.k.c a3 = ab.a(QnaSelectedPageViewModel.class);
        c cVar = new c(a3);
        d dVar = d.INSTANCE;
        if (h.f.b.l.a(aVar3, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, dVar, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (aVar3 == null || h.f.b.l.a(aVar3, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, dVar, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.s = bVar2;
        this.f119452m = new com.ss.android.ugc.aweme.qna.g.e();
        this.n = true;
        this.o = new AtomicLong(-1);
        this.p = 3000;
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.c, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.c cVar) {
            com.ss.android.ugc.aweme.qna.vm.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            this.this$0.a(cVar2, true);
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.b(num.intValue());
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$s  reason: collision with other inner class name */
    static final class C3085s extends h.f.b.m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3085s f119453a = new C3085s();

        static {
            Covode.recordClassIndex(77638);
        }

        C3085s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            h.f.b.l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f119454a);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.qna.ui.l a(s sVar) {
        com.ss.android.ugc.aweme.qna.ui.l lVar = sVar.f119450k;
        if (lVar == null) {
            h.f.b.l.a("suggestedTabAdapter");
        }
        return lVar;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(C3085s.f119453a);
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.model.i, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.model.i iVar) {
            com.ss.android.ugc.aweme.qna.model.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            s.a(this.this$0).a(iVar2.f119518a);
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.a, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.a aVar) {
            com.ss.android.ugc.aweme.qna.vm.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            this.this$0.a(aVar2.f119660a, aVar2.f119661b, this.this$0.n);
            return z.f158842a;
        }
    }

    public final void b(int i2) {
        new com.bytedance.tux.g.b(this).a(requireContext().getString(i2)).b();
    }

    static final class m extends h.f.b.m implements h.f.a.b<w, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(w wVar) {
            w wVar2 = wVar;
            h.f.b.l.d(wVar2, "");
            s sVar = this.this$0;
            View view = sVar.f119449j;
            if (view == null) {
                h.f.b.l.a("suggestedTabLayout");
            }
            sVar.a((a) wVar2, (w) view, (View) v.Suggestions, (v) true, (boolean) "", (String) ((h.f.a.a<z>) new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.qna.fragment.s.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(77632);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.this$0.this$0.f119448i;
                    if (qnaSuggestedTabViewModel != null) {
                        qnaSuggestedTabViewModel.a();
                    }
                    return z.f158842a;
                }
            }), (h.f.a.a) false);
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<h.p<? extends QaStruct, ? extends Boolean>, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h.p<? extends QaStruct, ? extends Boolean> pVar) {
            String str;
            h.p<? extends QaStruct, ? extends Boolean> pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            s sVar = this.this$0;
            QaStruct qaStruct = (QaStruct) pVar2.getFirst();
            if (((Boolean) pVar2.getSecond()).booleanValue()) {
                str = "click_invitation";
            } else {
                str = "click_recommendation";
            }
            androidx.fragment.app.e requireActivity = sVar.requireActivity();
            h.f.b.l.b(requireActivity, "");
            com.ss.android.ugc.aweme.comment.util.u.a(requireActivity, qaStruct, "qa_personal_profile", str, "answer");
            return z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ String $questionId;
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(s sVar, String str) {
            super(1);
            this.this$0 = sVar;
            this.$questionId = str;
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
                /* class com.ss.android.ugc.aweme.qna.fragment.s.t.AnonymousClass1 */
                final /* synthetic */ t this$0;

                static {
                    Covode.recordClassIndex(77641);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.this$0.this$0.f119448i;
                    if (qnaSuggestedTabViewModel != null) {
                        qnaSuggestedTabViewModel.a(this.this$0.$questionId);
                    }
                    return z.f158842a;
                }
            });
            String string2 = this.this$0.requireContext().getString(R.string.a9e);
            h.f.b.l.b(string2, "");
            bVar2.b(string2, AnonymousClass2.f119455a);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            s sVar = this.this$0;
            Context requireContext = sVar.requireContext();
            h.f.b.l.b(requireContext, "");
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(requireContext).a(R.string.f4g)).d(sVar.requireContext().getString(R.string.f4f)), new t(sVar, str2)).a(true)).a().b().show();
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.qna.model.f>, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.qna.model.f> list) {
            Integer num;
            List<? extends com.ss.android.ugc.aweme.qna.model.f> list2 = list;
            h.f.b.l.d(list2, "");
            com.ss.android.ugc.aweme.qna.g.e eVar = this.this$0.f119452m;
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.this$0.f119448i;
            Integer num2 = null;
            if (qnaSuggestedTabViewModel != null) {
                num = Integer.valueOf(qnaSuggestedTabViewModel.f119644a.f119275a.size());
            } else {
                num = null;
            }
            eVar.f119470a = num;
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel2 = this.this$0.f119448i;
            if (qnaSuggestedTabViewModel2 != null) {
                num2 = qnaSuggestedTabViewModel2.f119644a.f119280f;
            }
            this.this$0.f119452m.f119471b = num2;
            com.ss.android.ugc.aweme.qna.ui.l a2 = s.a(this.this$0);
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            a2.a(arrayList);
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.model.a, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.model.a aVar) {
            com.ss.android.ugc.aweme.qna.model.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (!aVar2.f119473b || aVar2.f119474c != 1) {
                if (!aVar2.f119473b) {
                    this.this$0.b(R.string.g4e);
                }
            } else if (System.currentTimeMillis() > this.this$0.o.get() + ((long) this.this$0.p)) {
                this.this$0.b(R.string.f5y);
                this.this$0.o.set(System.currentTimeMillis());
            }
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.d, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.qna.vm.d r11) {
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.fragment.s.q.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, User, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, User user) {
            User user2 = user;
            h.f.b.l.d(dVar, "");
            if (user2 != null) {
                this.this$0.f119451l = in.a(user2, false);
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends a>, z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(77629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(s sVar) {
            super(2);
            this.this$0 = sVar;
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
            if (t instanceof s) {
                this.this$0.e();
                EOYServiceImpl.b().b("qa_personal_profile");
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.model.i>> liveData;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.c>> liveData2;
        androidx.lifecycle.t<com.ss.android.ugc.aweme.qna.g.b<String>> tVar;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.a>> liveData3;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.d>> liveData4;
        androidx.lifecycle.t<com.ss.android.ugc.aweme.qna.g.b<h.p<QaStruct, Boolean>>> tVar2;
        androidx.lifecycle.t<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.model.a>> tVar3;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<Integer>> liveData5;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<w>> liveData6;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<List<com.ss.android.ugc.aweme.qna.model.f>>> liveData7;
        RecyclerView.f itemAnimator;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        IEOYService b2 = EOYServiceImpl.b();
        View view2 = this.f119449j;
        if (view2 == null) {
            h.f.b.l.a("suggestedTabLayout");
        }
        if (!(view2 instanceof ViewGroup)) {
            view2 = null;
        }
        if (b2.a((ViewGroup) view2, "qa_personal_profile")) {
            View view3 = this.f119449j;
            if (view3 == null) {
                h.f.b.l.a("suggestedTabLayout");
            }
            View findViewById = view3.findViewById(R.id.eeo);
            h.f.b.l.b(findViewById, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            com.bytedance.tux.h.i.b(findViewById, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }
        this.f119448i = (QnaSuggestedTabViewModel) new ad(this).a(QnaSuggestedTabViewModel.class);
        View view4 = this.f119449j;
        if (view4 == null) {
            h.f.b.l.a("suggestedTabLayout");
        }
        h.f.b.l.b(requireContext(), "");
        QnaRecyclerView qnaRecyclerView = (QnaRecyclerView) view4.findViewById(R.id.eeo);
        this.t = qnaRecyclerView;
        if (!(qnaRecyclerView == null || (itemAnimator = qnaRecyclerView.getItemAnimator()) == null)) {
            itemAnimator.f3833l = 0;
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.f119448i;
        Objects.requireNonNull(qnaSuggestedTabViewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.vm.QnaViewHolderClickDelegate");
        this.f119450k = new com.ss.android.ugc.aweme.qna.ui.l(qnaSuggestedTabViewModel, this.f119452m);
        QnaRecyclerView qnaRecyclerView2 = this.t;
        if (qnaRecyclerView2 != null) {
            qnaRecyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        QnaRecyclerView qnaRecyclerView3 = this.t;
        if (qnaRecyclerView3 != null) {
            com.ss.android.ugc.aweme.qna.ui.l lVar = this.f119450k;
            if (lVar == null) {
                h.f.b.l.a("suggestedTabAdapter");
            }
            qnaRecyclerView3.setAdapter(lVar);
        }
        QnaRecyclerView qnaRecyclerView4 = this.t;
        if (qnaRecyclerView4 != null) {
            com.ss.android.ugc.aweme.qna.ui.l lVar2 = this.f119450k;
            if (lVar2 == null) {
                h.f.b.l.a("suggestedTabAdapter");
            }
            qnaRecyclerView4.a(a(qnaRecyclerView4, lVar2, new f(this)));
        }
        f.a.a(this, (QnaSelectedPageViewModel) this.s.getValue(), t.f119456a, (com.bytedance.assem.arch.viewModel.k) null, new k(this), 6);
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel2 = this.f119448i;
        if (!(qnaSuggestedTabViewModel2 == null || (liveData7 = qnaSuggestedTabViewModel2.f119645b) == null)) {
            liveData7.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new l(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel3 = this.f119448i;
        if (!(qnaSuggestedTabViewModel3 == null || (liveData6 = qnaSuggestedTabViewModel3.f119646c) == null)) {
            liveData6.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new m(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel4 = this.f119448i;
        if (!(qnaSuggestedTabViewModel4 == null || (liveData5 = qnaSuggestedTabViewModel4.f119648e) == null)) {
            liveData5.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new n(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel5 = this.f119448i;
        if (!(qnaSuggestedTabViewModel5 == null || (tVar3 = qnaSuggestedTabViewModel5.f119649f) == null)) {
            tVar3.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new o(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel6 = this.f119448i;
        if (!(qnaSuggestedTabViewModel6 == null || (tVar2 = qnaSuggestedTabViewModel6.f119651h) == null)) {
            tVar2.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new p(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel7 = this.f119448i;
        if (!(qnaSuggestedTabViewModel7 == null || (liveData4 = qnaSuggestedTabViewModel7.f119657i) == null)) {
            liveData4.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new q(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel8 = this.f119448i;
        if (!(qnaSuggestedTabViewModel8 == null || (liveData3 = qnaSuggestedTabViewModel8.f119658j) == null)) {
            liveData3.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new r(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel9 = this.f119448i;
        if (!(qnaSuggestedTabViewModel9 == null || (tVar = qnaSuggestedTabViewModel9.f119650g) == null)) {
            tVar.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new g(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel10 = this.f119448i;
        if (!(qnaSuggestedTabViewModel10 == null || (liveData2 = qnaSuggestedTabViewModel10.f119659k) == null)) {
            liveData2.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new h(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel11 = this.f119448i;
        if (!(qnaSuggestedTabViewModel11 == null || (liveData = qnaSuggestedTabViewModel11.f119647d) == null)) {
            liveData.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new i(this)));
        }
        f.a.a(this, (QnaBannerViewModel) this.r.getValue(), u.f119457a, (com.bytedance.assem.arch.viewModel.k) null, new j(this), 6);
        View view5 = this.f119449j;
        if (view5 == null) {
            h.f.b.l.a("suggestedTabLayout");
        }
        ((TuxStatusView) view5.findViewById(R.id.dew)).a();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ard, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.f119449j = a2;
        if (a2 == null) {
            h.f.b.l.a("suggestedTabLayout");
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
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
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
