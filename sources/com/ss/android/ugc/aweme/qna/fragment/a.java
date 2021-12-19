package com.ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.a.a;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qna.c.b;
import com.ss.android.ugc.aweme.qna.g.c;
import com.ss.android.ugc.aweme.qna.ui.QnaRecyclerView;
import com.ss.android.ugc.aweme.qna.ui.g;
import com.ss.android.ugc.aweme.qna.ui.i;
import com.ss.android.ugc.aweme.qna.vm.c;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class a extends com.bytedance.ies.foundation.fragment.a {

    /* renamed from: e  reason: collision with root package name */
    public boolean f119406e;

    /* renamed from: f  reason: collision with root package name */
    public String f119407f;

    /* renamed from: g  reason: collision with root package name */
    public String f119408g;

    /* renamed from: h  reason: collision with root package name */
    public String f119409h;

    /* renamed from: i  reason: collision with root package name */
    private final String f119410i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f119411j;

    static {
        Covode.recordClassIndex(77545);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public View a(int i2) {
        if (this.f119411j == null) {
            this.f119411j = new SparseArray();
        }
        View view = (View) this.f119411j.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f119411j.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public void br_() {
        SparseArray sparseArray = this.f119411j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public abstract int c();

    public void f() {
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public String d() {
        return this.f119410i;
    }

    public void e() {
        if (!this.f119406e) {
            this.f119406e = true;
            f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.a$a  reason: collision with other inner class name */
    static final class C3082a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ d $delegate$inlined;
        final /* synthetic */ f $model;
        final /* synthetic */ com.ss.android.ugc.aweme.qna.vm.b $navigateDialogUiModel$inlined;

        static {
            Covode.recordClassIndex(77546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3082a(f fVar, d dVar, com.ss.android.ugc.aweme.qna.vm.b bVar) {
            super(1);
            this.$model = fVar;
            this.$delegate$inlined = dVar;
            this.$navigateDialogUiModel$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$delegate$inlined.a(new e(this.$navigateDialogUiModel$inlined, this.$model.f119421c));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f119407f = arguments.getString("author_id");
            this.f119408g = arguments.getString("enter_from");
            this.f119409h = arguments.getString("enter_method");
        }
    }

    public static final class b extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaRecyclerView f119412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.ui.l f119413b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f119414c;

        static {
            Covode.recordClassIndex(77547);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            RecyclerView.i layoutManager = this.f119412a.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int m2 = ((LinearLayoutManager) layoutManager).m();
            int itemCount = this.f119413b.getItemCount();
            if (m2 >= itemCount - 1 && i2 == 0 && this.f119412a.getPrevDragDir() == QnaRecyclerView.a.UP) {
                RecyclerView.ViewHolder f2 = this.f119412a.f(itemCount - 2);
                if (!(f2 instanceof i)) {
                    f2 = null;
                }
                g gVar = (g) f2;
                if (gVar != null) {
                    View findViewById = gVar.f119574c.findViewById(R.id.aq4);
                    l.b(findViewById, "");
                    ((DoubleColorBallAnimationView) findViewById).setVisibility(0);
                }
                this.f119414c.invoke();
            }
        }

        b(QnaRecyclerView qnaRecyclerView, com.ss.android.ugc.aweme.qna.ui.l lVar, h.f.a.a aVar) {
            this.f119412a = qnaRecyclerView;
            this.f119413b = lVar;
            this.f119414c = aVar;
        }
    }

    public final void a(c cVar, boolean z) {
        l.d(cVar, "");
        String str = cVar.f119667a;
        SmartRouter.buildRoute(getActivity(), "//qna/detail/").withParam("id", str).withParam("enter_method", cVar.f119668b).withParam("enter_from", b.a.a(z)).open();
    }

    public static RecyclerView.n a(QnaRecyclerView qnaRecyclerView, com.ss.android.ugc.aweme.qna.ui.l lVar, h.f.a.a<z> aVar) {
        l.d(qnaRecyclerView, "");
        l.d(lVar, "");
        l.d(aVar, "");
        return new b(qnaRecyclerView, lVar, aVar);
    }

    public final void a(String str, String str2, boolean z) {
        if (str != null) {
            SmartRoute withParam = SmartRouter.buildRoute(requireActivity(), "aweme://aweme/detail/".concat(String.valueOf(str))).withParam("enter_from", b.a.a(z)).withParam("show_answer_question_button", 1);
            if (str2 == null) {
                str2 = "";
            }
            withParam.withParam("question_content", str2).open();
        }
    }

    public final void a(List<f> list, d dVar, com.ss.android.ugc.aweme.qna.vm.b bVar) {
        l.d(list, "");
        l.d(dVar, "");
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new a.e().a(t.f119419a).b(t.f119420b).a(new C3082a(t, dVar, bVar)));
        }
        Object[] array = arrayList.toArray(new a.e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        a.e[] eVarArr = (a.e[]) array;
        new a.b().a((a.e[]) Arrays.copyOf(eVarArr, eVarArr.length)).b().show(getFragmentManager(), "BaseQnaTabFragment");
    }

    public static void a(String str, String str2, Context context, boolean z) {
        l.d(context, "");
        r.a("enter_personal_detail", new d().a("enter_from", "qa_personal_profile").f66730a);
        if (!TextUtils.isEmpty(str)) {
            SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", str).withParam("enter_from", b.a.a(z)).withParam("sec_uid", str2).open();
        }
    }

    public final void a(w wVar, View view, v vVar, boolean z, String str, h.f.a.a<z> aVar, boolean z2) {
        c.a aVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        l.d(wVar, "");
        l.d(view, "");
        l.d(vVar, "");
        l.d(aVar, "");
        int i2 = b.f119415a[wVar.ordinal()];
        if (i2 == 1) {
            View findViewById = view.findViewById(vVar.getRvId());
            l.b(findViewById, "");
            ((RecyclerView) findViewById).setVisibility(0);
            View findViewById2 = view.findViewById(R.id.deo);
            l.b(findViewById2, "");
            ((ConstraintLayout) findViewById2).setVisibility(8);
        } else if (i2 == 2) {
            TuxStatusView tuxStatusView = (TuxStatusView) view.findViewById(R.id.dew);
            boolean z3 = this instanceof s;
            l.d(vVar, "");
            if (z) {
                int i3 = com.ss.android.ugc.aweme.qna.g.d.f119468a[vVar.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        aVar2 = new c.a(com.ss.android.ugc.aweme.qna.g.c.a(R.string.f40), com.ss.android.ugc.aweme.qna.g.c.a(R.string.f3z));
                    } else if (i3 != 3) {
                        throw new h.n();
                    } else if (z2) {
                        aVar2 = new c.a(com.ss.android.ugc.aweme.qna.g.c.a(R.string.f6v), com.ss.android.ugc.aweme.qna.g.c.a(R.string.f6u));
                    } else {
                        aVar2 = new c.a(com.ss.android.ugc.aweme.qna.g.c.a(R.string.f3y), com.ss.android.ugc.aweme.qna.g.c.a(R.string.f3x));
                    }
                } else if (com.ss.android.ugc.aweme.qna.e.b.a()) {
                    aVar2 = new c.a(com.ss.android.ugc.aweme.qna.g.c.a(R.string.f6s), com.ss.android.ugc.aweme.qna.g.c.a(R.string.f6r));
                } else {
                    aVar2 = new c.a(com.ss.android.ugc.aweme.qna.g.c.a(R.string.f6c), com.ss.android.ugc.aweme.qna.g.c.a(R.string.f6b));
                }
            } else {
                int i4 = com.ss.android.ugc.aweme.qna.g.d.f119469b[vVar.ordinal()];
                if (i4 == 1) {
                    aVar2 = new c.a("", "");
                } else if (i4 == 2) {
                    if (str != null) {
                        str3 = com.ss.android.ugc.aweme.qna.g.c.a(R.string.f6a, str);
                        str2 = com.ss.android.ugc.aweme.qna.g.c.a(R.string.f6_, str);
                    } else {
                        str2 = "";
                        str3 = str2;
                    }
                    aVar2 = new c.a(str3, str2);
                } else if (i4 == 3) {
                    if (str != null) {
                        str5 = com.ss.android.ugc.aweme.qna.g.c.a(R.string.f3w, str);
                        str4 = com.ss.android.ugc.aweme.qna.g.c.a(R.string.f3v, str);
                    } else {
                        str4 = "";
                        str5 = str4;
                    }
                    aVar2 = new c.a(str5, str4);
                } else {
                    throw new h.n();
                }
            }
            TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(new c.d(z3)));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a3 = h.g.a.a(TypedValue.applyDimension(1, 72.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            tuxStatusView.setStatus(a2.b(a3, h.g.a.a(TypedValue.applyDimension(1, 72.0f, system2.getDisplayMetrics()))).a(aVar2.f119464a).a((CharSequence) aVar2.f119465b));
            View findViewById3 = view.findViewById(vVar.getRvId());
            l.b(findViewById3, "");
            ((RecyclerView) findViewById3).setVisibility(8);
            View findViewById4 = view.findViewById(R.id.deo);
            l.b(findViewById4, "");
            ((ConstraintLayout) findViewById4).setVisibility(0);
        } else if (i2 == 3) {
            TuxStatusView tuxStatusView2 = (TuxStatusView) view.findViewById(R.id.dew);
            Context requireContext = requireContext();
            l.b(requireContext, "");
            l.b(tuxStatusView2, "");
            l.d(requireContext, "");
            l.d(tuxStatusView2, "");
            l.d(aVar, "");
            TuxStatusView.c a4 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(c.b.f119466a));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            int a5 = h.g.a.a(TypedValue.applyDimension(1, 72.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            TuxStatusView.c a6 = a4.b(a5, h.g.a.a(TypedValue.applyDimension(1, 72.0f, system4.getDisplayMetrics()))).a(com.ss.android.ugc.aweme.qna.g.c.a(R.string.de2)).a((CharSequence) com.ss.android.ugc.aweme.qna.g.c.a(R.string.bpc));
            a6.f45362j = new c.C3086c(aVar, tuxStatusView2);
            tuxStatusView2.setStatus(a6);
        }
    }
}
