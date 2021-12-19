package com.ss.android.ugc.aweme.liveevent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
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
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aa;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.aj;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.bh;
import com.ss.android.ugc.aweme.bl;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.n.p;
import com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.zhiliaoapp.musically.R;
import h.a.n;
import j.a.a.f;
import java.util.ArrayList;
import java.util.List;

public final class l extends aa implements aj, bh, o {

    /* renamed from: d  reason: collision with root package name */
    public h f108697d;

    /* renamed from: e  reason: collision with root package name */
    public j f108698e;

    /* renamed from: f  reason: collision with root package name */
    public f f108699f;

    /* renamed from: g  reason: collision with root package name */
    private i f108700g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> f108701h;

    /* renamed from: i  reason: collision with root package name */
    private View f108702i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f108703j;

    static {
        Covode.recordClassIndex(69648);
    }

    @Override // com.ss.android.ugc.aweme.aa
    public final View a(int i2) {
        if (this.f108703j == null) {
            this.f108703j = new SparseArray();
        }
        View view = (View) this.f108703j.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f108703j.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.aa
    public final void a() {
        SparseArray sparseArray = this.f108703j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.aj
    public final void a(String str) {
        h.f.b.l.d(str, "");
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
        com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> lVar = this.f108701h;
        if (lVar != null) {
            lVar.a(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> lVar = this.f108701h;
        if (lVar == null || lVar.f80562a != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        h hVar = this.f108697d;
        if (hVar != null) {
            hVar.cd_();
            hVar.h();
        }
        super.onDestroy();
    }

    static final class b implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f108705a;

        static {
            Covode.recordClassIndex(69650);
        }

        b(l lVar) {
            this.f108705a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
        public final void a() {
            h hVar = this.f108705a.f108697d;
            if (hVar != null) {
                hVar.a(1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        h hVar = this.f108697d;
        if (hVar != null) {
            hVar.a(4);
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
        relativeLayout.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.cho);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.yb);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) a(R.id.c5m);
        h.f.b.l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) a(R.id.ci2);
        h.f.b.l.b(doubleBallSwipeRefreshLayout, "");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> lVar = this.f108701h;
        if (lVar != null) {
            lVar.a(0);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f108704a;

        static {
            Covode.recordClassIndex(69649);
        }

        a(l lVar) {
            this.f108704a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e activity = this.f108704a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> lVar = this.f108701h;
        if (lVar != null) {
            lVar.a(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z) {
        com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> lVar = this.f108701h;
        if (lVar != null) {
            lVar.a(z ? 1 : 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.bh
    public final void b(int i2) {
        int i3;
        f fVar = this.f108699f;
        if (fVar != null) {
            i3 = fVar.getItemCount();
        } else {
            i3 = 0;
        }
        f fVar2 = this.f108699f;
        if (fVar2 != null) {
            fVar2.notifyItemRangeChanged(i2, i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.cho);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.yb);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) a(R.id.c5m);
        h.f.b.l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) a(R.id.ci2);
        h.f.b.l.b(doubleBallSwipeRefreshLayout, "");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> lVar = this.f108701h;
        if (lVar != null) {
            lVar.a(0);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f108706a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bl f108707b;

        static {
            Covode.recordClassIndex(69651);
        }

        c(l lVar, bl blVar) {
            this.f108706a = lVar;
            this.f108707b = blVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x015e A[LOOP:1: B:53:0x0158->B:55:0x015e, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0170  */
        /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r25) {
            /*
            // Method dump skipped, instructions count: 382
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.liveevent.l.c.onClick(android.view.View):void");
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.aa
    public final void onActivityCreated(Bundle bundle) {
        f fVar;
        ImageView imageView;
        TextView textView;
        String str;
        Resources resources;
        MethodCollector.i(6655);
        super.onActivityCreated(bundle);
        this.f108700g = new i(aa.f62438b.getTYPE());
        h hVar = new h();
        this.f108697d = hVar;
        hVar.a_(this);
        h hVar2 = this.f108697d;
        if (hVar2 != null) {
            hVar2.a(this.f108700g);
        }
        h hVar3 = this.f108697d;
        if (hVar3 != null) {
            hVar3.f108676b = this;
        }
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.cho);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
        ((DoubleBallSwipeRefreshLayout) a(R.id.ci2)).setOnRefreshListener(new b(this));
        aa.a.a(ab.LIVE_EVENT);
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.eda);
        h.f.b.l.b(viewStub, "");
        viewStub.setLayoutResource(aa.f62438b.anchorInfo().a());
        View inflate = ((ViewStub) getView().findViewById(R.id.eda)).inflate();
        this.f108702i = inflate;
        if (!(inflate == null || (textView = (TextView) inflate.findViewById(R.id.fb7)) == null)) {
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.dk5)) == null) {
                str = "LIVE Events";
            }
            textView.setText(str);
        }
        View view = this.f108702i;
        if (!(view == null || (imageView = (ImageView) view.findViewById(R.id.bmp)) == null)) {
            imageView.setOnClickListener(new a(this));
        }
        RelativeLayout relativeLayout = (RelativeLayout) a(R.id.a3l);
        h.f.b.l.b(relativeLayout, "");
        relativeLayout.setVisibility(8);
        e activity = getActivity();
        if (!(activity instanceof bl)) {
            activity = null;
        }
        bl blVar = (bl) activity;
        com.ss.android.ugc.aweme.b.c adapterFactory = aa.f62438b.adapterFactory(blVar);
        if (adapterFactory != null) {
            fVar = adapterFactory.a();
        } else {
            fVar = null;
        }
        this.f108699f = fVar;
        this.f108701h = com.ss.android.ugc.aweme.discover.adapter.l.a(fVar);
        RecyclerView recyclerView = (RecyclerView) a(R.id.djs);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setAdapter(this.f108701h);
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
        v a2 = r.a(2131232645);
        a2.E = (SmartImageView) a(R.id.biq);
        a2.c();
        TuxTextView tuxTextView = (TuxTextView) a(R.id.yb);
        h.f.b.l.b(tuxTextView, "");
        Context context2 = getContext();
        if (context2 == null) {
            h.f.b.l.b();
        }
        tuxTextView.setBackground(new ColorDrawable(androidx.core.content.b.c(context2, R.color.f159923g)));
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.yb);
        Context context3 = getContext();
        if (context3 == null) {
            h.f.b.l.b();
        }
        tuxTextView2.setTextColor(androidx.core.content.b.c(context3, R.color.bz));
        if (this.f108698e == null) {
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.yb);
            h.f.b.l.b(tuxTextView3, "");
            tuxTextView3.setClickable(false);
        }
        ((TuxTextView) a(R.id.yb)).setOnClickListener(new c(this, blVar));
        h hVar4 = this.f108697d;
        if (hVar4 != null) {
            hVar4.a(1);
            MethodCollector.o(6655);
            return;
        }
        MethodCollector.o(6655);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Object> list, boolean z) {
        f fVar;
        if (!(list == null || list.isEmpty() || (fVar = this.f108699f) == null)) {
            fVar.a(list);
        }
        com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> lVar = this.f108701h;
        if (lVar != null) {
            lVar.a(z ? 1 : 0);
        }
        f fVar2 = this.f108699f;
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
            TuxTextView tuxTextView = (TuxTextView) a(R.id.yb);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.cho);
            h.f.b.l.b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) a(R.id.ci2);
            h.f.b.l.b(doubleBallSwipeRefreshLayout, "");
            doubleBallSwipeRefreshLayout.setRefreshing(false);
            LinearLayout linearLayout = (LinearLayout) a(R.id.c5m);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            f fVar = this.f108699f;
            if (fVar != null) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                boolean z2 = false;
                for (T t : list) {
                    if (t instanceof AnchorCell) {
                        t.f66459g = aa.f62438b.getTYPE();
                    }
                    T t2 = null;
                    if (!z2) {
                        if (t instanceof j) {
                            t2 = t;
                        }
                        T t3 = t2;
                        if (t3 != null) {
                            t3.f108691e = true;
                        }
                        z2 = true;
                    } else {
                        if (t instanceof j) {
                            t2 = t;
                        }
                        T t4 = t2;
                        if (t4 != null) {
                            t4.f108691e = false;
                        }
                    }
                    arrayList.add(t);
                }
                fVar.a(arrayList);
            }
            com.ss.android.ugc.aweme.discover.adapter.l<RecyclerView.ViewHolder> lVar = this.f108701h;
            if (lVar != null) {
                lVar.a(z ? 1 : 0);
            }
            f fVar2 = this.f108699f;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
            aa.f62438b.anchorMob();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ay, viewGroup, false);
    }
}
