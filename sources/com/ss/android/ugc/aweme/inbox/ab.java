package com.ss.android.ugc.aweme.inbox;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.ss.android.ugc.aweme.inbox.g.c;
import com.ss.android.ugc.aweme.inbox.g.e;
import com.ss.android.ugc.aweme.inbox.g.g;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class ab extends RecyclerView.a<g<?>> {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f104030a;

    /* renamed from: b  reason: collision with root package name */
    final SparseArray<com.ss.android.ugc.aweme.inbox.widget.b> f104031b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f104032c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ad> f104033d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final h f104034e = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(66624);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ g<?> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ab f104035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f104036b;

        static {
            Covode.recordClassIndex(66626);
        }

        b(ab abVar, List list) {
            this.f104035a = abVar;
            this.f104036b = list;
        }

        public final void run() {
            this.f104035a.a(this.f104036b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f104033d.size();
    }

    static final class a extends m implements h.f.a.a<RecommendUserVM> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(66625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ab abVar) {
            super(0);
            this.this$0 = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecommendUserVM invoke() {
            return RecommendUserVM.a.a(this.this$0.f104032c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f104030a = recyclerView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(g<?> gVar) {
        g<?> gVar2 = gVar;
        l.d(gVar2, "");
        super.onViewAttachedToWindow(gVar2);
        gVar2.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewDetachedFromWindow(g<?> gVar) {
        g<?> gVar2 = gVar;
        l.d(gVar2, "");
        super.onViewDetachedFromWindow(gVar2);
        gVar2.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        if (l.a(this.f104030a, recyclerView)) {
            this.f104030a = null;
        }
    }

    public ab(Fragment fragment) {
        l.d(fragment, "");
        this.f104032c = fragment;
        setHasStableIds(true);
    }

    public final void a(List<? extends ad> list) {
        Boolean bool;
        StringBuilder sb = new StringBuilder("setDataInternal, rv isComputing: ");
        RecyclerView recyclerView = this.f104030a;
        if (recyclerView != null) {
            bool = Boolean.valueOf(recyclerView.l());
        } else {
            bool = null;
        }
        f.b("RecommendUserVM", sb.append(bool).append(", data size: ").append(list.size()).toString());
        this.f104033d.clear();
        this.f104033d.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        f.b("RecommendUserVM", "getItemId position: " + i2 + ", data size: " + this.f104033d.size());
        return this.f104033d.get(i2).f104039c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        f.b("RecommendUserVM", "getItemId position: " + i2 + ", data size: " + this.f104033d.size());
        ad adVar = this.f104033d.get(i2);
        if (!(adVar instanceof af)) {
            return (long) adVar.hashCode();
        }
        String uid = ((af) adVar).f104041a.getUid();
        l.b(uid, "");
        return Long.parseLong(uid);
    }

    private static View a(int i2, ViewGroup viewGroup) {
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), i2, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(g<?> gVar, int i2) {
        ad adVar;
        g<?> gVar2 = gVar;
        l.d(gVar2, "");
        ad adVar2 = this.f104033d.get(i2);
        l.d(adVar2, "");
        if (!(adVar2 instanceof ad)) {
            adVar = null;
        } else {
            adVar = adVar2;
        }
        ad adVar3 = adVar;
        if (adVar3 != null) {
            gVar2.f104268d = (T) adVar2;
            gVar2.a(adVar3);
            return;
        }
        View view = gVar2.itemView;
        l.b(view, "");
        view.setVisibility(8);
        f.c("RecommendUserBaseVH", "MultiBaseVH innerOnBind data type is not match!");
    }

    private static RecyclerView.ViewHolder a(ab abVar, ViewGroup viewGroup, int i2) {
        g hVar;
        MethodCollector.i(12465);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == -2) {
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            Context context = viewGroup.getContext();
            l.b(context, "");
            hVar = new com.ss.android.ugc.aweme.inbox.g.h(b2.a(context, 9), 9);
        } else if (i2 == -1) {
            View a2 = a(R.layout.as2, viewGroup);
            if (a2 != null) {
                hVar = new c((TuxStatusView) a2);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
                MethodCollector.o(12465);
                throw nullPointerException;
            }
        } else if (i2 == 1) {
            hVar = new com.ss.android.ugc.aweme.inbox.g.f(a(R.layout.as3, viewGroup));
        } else if (i2 == 2) {
            RecommendUserService b3 = RecommendUserServiceImpl.b();
            Context context2 = viewGroup.getContext();
            l.b(context2, "");
            hVar = new com.ss.android.ugc.aweme.inbox.g.h(b3.a(context2, 10), 10);
        } else if (i2 == 3) {
            RecommendUserService b4 = RecommendUserServiceImpl.b();
            Context context3 = viewGroup.getContext();
            l.b(context3, "");
            hVar = new e(b4.b(context3));
        } else if (i2 == 4) {
            RecommendUserService b5 = RecommendUserServiceImpl.b();
            Context context4 = viewGroup.getContext();
            l.b(context4, "");
            hVar = new com.ss.android.ugc.aweme.inbox.g.a(b5.a(context4));
        } else if (i2 != 5) {
            hVar = new com.ss.android.ugc.aweme.inbox.g.i(a(R.layout.as4, viewGroup));
        } else {
            hVar = new com.ss.android.ugc.aweme.inbox.g.b(a(R.layout.as1, viewGroup), abVar.f104032c);
        }
        RecommendUserVM recommendUserVM = (RecommendUserVM) abVar.f104034e.getValue();
        l.d(recommendUserVM, "");
        hVar.f104270f = recommendUserVM;
        Fragment fragment = abVar.f104032c;
        l.d(fragment, "");
        hVar.f104269e = fragment;
        com.ss.android.ugc.aweme.inbox.widget.b bVar = abVar.f104031b.get(i2);
        if (bVar != null) {
            hVar.a(bVar);
        }
        try {
            if (hVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(hVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) hVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(hVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = hVar.getClass().getName();
        MethodCollector.o(12465);
        return hVar;
    }
}
