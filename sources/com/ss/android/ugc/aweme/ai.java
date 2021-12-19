package com.ss.android.ugc.aweme;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.discover.adapter.l;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.n.p;
import com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.zhiliaoapp.musically.R;
import h.a.n;
import j.a.a.f;
import java.util.ArrayList;
import java.util.List;

public final class ai extends aa implements aj, bh, o {

    /* renamed from: d  reason: collision with root package name */
    public ae f66322d;

    /* renamed from: e  reason: collision with root package name */
    private ak f66323e;

    /* renamed from: f  reason: collision with root package name */
    private f f66324f;

    /* renamed from: g  reason: collision with root package name */
    private l<RecyclerView.ViewHolder> f66325g;

    /* renamed from: h  reason: collision with root package name */
    private View f66326h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f66327i;

    static {
        Covode.recordClassIndex(40755);
    }

    @Override // com.ss.android.ugc.aweme.aa
    public final View a(int i2) {
        if (this.f66327i == null) {
            this.f66327i = new SparseArray();
        }
        View view = (View) this.f66327i.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f66327i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.aa
    public final void a() {
        SparseArray sparseArray = this.f66327i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<?>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Object> list, boolean z) {
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.aa
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        l<RecyclerView.ViewHolder> lVar = this.f66325g;
        if (lVar != null) {
            lVar.a(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        l<RecyclerView.ViewHolder> lVar = this.f66325g;
        if (lVar == null || lVar.f80562a != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ae aeVar = this.f66322d;
        if (aeVar != null) {
            aeVar.cd_();
            aeVar.h();
        }
        super.onDestroy();
    }

    static final class b implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f66332a;

        static {
            Covode.recordClassIndex(40757);
        }

        b(ai aiVar) {
            this.f66332a = aiVar;
        }

        @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
        public final void a() {
            ae aeVar = this.f66332a.f66322d;
            if (aeVar != null) {
                aeVar.a(1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        ae aeVar = this.f66322d;
        if (aeVar != null) {
            aeVar.a(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.bh
    public final void c() {
        RelativeLayout relativeLayout = (RelativeLayout) a(R.id.a3l);
        h.f.b.l.b(relativeLayout, "");
        relativeLayout.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.bh
    public final void d() {
        RelativeLayout relativeLayout = (RelativeLayout) a(R.id.a3l);
        h.f.b.l.b(relativeLayout, "");
        relativeLayout.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.cho);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) a(R.id.c5m);
        h.f.b.l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) a(R.id.ci2);
        h.f.b.l.b(doubleBallSwipeRefreshLayout, "");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        l<RecyclerView.ViewHolder> lVar = this.f66325g;
        if (lVar != null) {
            lVar.a(0);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f66331a;

        static {
            Covode.recordClassIndex(40756);
        }

        a(ai aiVar) {
            this.f66331a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e activity = this.f66331a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f66340a;

        static {
            Covode.recordClassIndex(40758);
        }

        c(ai aiVar) {
            this.f66340a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            bl blVar = this.f66340a.f62440a;
            if (blVar != null) {
                blVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z) {
        l<RecyclerView.ViewHolder> lVar = this.f66325g;
        if (lVar != null) {
            lVar.a(z ? 1 : 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        l<RecyclerView.ViewHolder> lVar = this.f66325g;
        if (lVar != null) {
            lVar.a(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.aj
    public final void a(String str) {
        TextView textView;
        h.f.b.l.d(str, "");
        View view = this.f66326h;
        if (view != null && (textView = (TextView) view.findViewById(R.id.fb7)) != null) {
            textView.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.bh
    public final void b(int i2) {
        int i3;
        f fVar = this.f66324f;
        if (fVar != null) {
            i3 = fVar.getItemCount();
        } else {
            i3 = 0;
        }
        f fVar2 = this.f66324f;
        if (fVar2 != null) {
            fVar2.notifyItemRangeChanged(i2, i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.cho);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) a(R.id.c5m);
        h.f.b.l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) a(R.id.ci2);
        h.f.b.l.b(doubleBallSwipeRefreshLayout, "");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        l<RecyclerView.ViewHolder> lVar = this.f66325g;
        if (lVar != null) {
            lVar.a(0);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.aa
    public final void onActivityCreated(Bundle bundle) {
        String str;
        f fVar;
        ImageView imageView;
        TextView textView;
        MethodCollector.i(3953);
        super.onActivityCreated(bundle);
        this.f66323e = new ak(aa.f62438b.getTYPE());
        ae aeVar = new ae();
        this.f66322d = aeVar;
        aeVar.a_(this);
        ae aeVar2 = this.f66322d;
        if (aeVar2 != null) {
            aeVar2.a(this.f66323e);
        }
        ae aeVar3 = this.f66322d;
        if (aeVar3 != null) {
            aeVar3.f66262b = this;
        }
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.cho);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
        ((DoubleBallSwipeRefreshLayout) a(R.id.ci2)).setOnRefreshListener(new b(this));
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.eda);
        h.f.b.l.b(viewStub, "");
        viewStub.setLayoutResource(aa.f62438b.anchorInfo().a());
        View inflate = ((ViewStub) getView().findViewById(R.id.eda)).inflate();
        this.f66326h = inflate;
        if (!(inflate == null || (textView = (TextView) inflate.findViewById(R.id.fb7)) == null)) {
            textView.setText("");
        }
        View view = this.f66326h;
        if (!(view == null || (imageView = (ImageView) view.findViewById(R.id.bmp)) == null)) {
            imageView.setOnClickListener(new a(this));
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.fam);
        h.f.b.l.b(tuxTextView, "");
        Context context = getContext();
        if (context != null) {
            aa.f62438b.anchorInfo();
            str = context.getString(R.string.anc);
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        ((RelativeLayout) a(R.id.a3l)).setOnClickListener(new c(this));
        e activity = getActivity();
        if (!(activity instanceof bl)) {
            activity = null;
        }
        com.ss.android.ugc.aweme.b.c adapterFactory = aa.f62438b.adapterFactory((bl) activity);
        if (adapterFactory != null) {
            fVar = adapterFactory.a();
        } else {
            fVar = null;
        }
        this.f66324f = fVar;
        this.f66325g = l.a(fVar);
        RecyclerView recyclerView = (RecyclerView) a(R.id.djs);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setAdapter(this.f66325g);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djs);
        h.f.b.l.b(recyclerView2, "");
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.djs);
        h.f.b.l.b(recyclerView3, "");
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = (RecyclerView) a(R.id.djs);
        h.f.b.l.b(recyclerView4, "");
        recyclerView4.setOnFlingListener(new p((RecyclerView) a(R.id.djs), this));
        ae aeVar4 = this.f66322d;
        if (aeVar4 != null) {
            aeVar4.a(1);
            MethodCollector.o(3953);
            return;
        }
        MethodCollector.o(3953);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Object> list, boolean z) {
        f fVar;
        if (!(list == null || list.isEmpty() || (fVar = this.f66324f) == null)) {
            fVar.a(list);
        }
        l<RecyclerView.ViewHolder> lVar = this.f66325g;
        if (lVar != null) {
            lVar.a(z ? 1 : 0);
        }
        f fVar2 = this.f66324f;
        if (fVar2 != null) {
            fVar2.notifyDataSetChanged();
        }
        aa.f62438b.anchorMob();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Object> list, boolean z) {
        if (!(list == null || list.isEmpty())) {
            RecyclerView recyclerView = (RecyclerView) a(R.id.djs);
            h.f.b.l.b(recyclerView, "");
            recyclerView.setVisibility(0);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.cho);
            h.f.b.l.b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) a(R.id.ci2);
            h.f.b.l.b(doubleBallSwipeRefreshLayout, "");
            doubleBallSwipeRefreshLayout.setRefreshing(false);
            LinearLayout linearLayout = (LinearLayout) a(R.id.c5m);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            f fVar = this.f66324f;
            if (fVar != null) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                for (T t : list) {
                    if (t instanceof AnchorCell) {
                        t.f66459g = aa.f62438b.getTYPE();
                    }
                    arrayList.add(t);
                }
                fVar.a(arrayList);
            }
            l<RecyclerView.ViewHolder> lVar = this.f66325g;
            if (lVar != null) {
                lVar.a(z ? 1 : 0);
            }
            f fVar2 = this.f66324f;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
            aa.f62438b.anchorMob();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ax, viewGroup, false);
    }
}
