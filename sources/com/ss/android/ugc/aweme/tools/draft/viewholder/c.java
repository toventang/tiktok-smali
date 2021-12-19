package com.ss.android.ugc.aweme.tools.draft.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.tools.draft.aw;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c extends RecyclerView.a<a<? extends com.ss.android.ugc.aweme.tools.draft.d.a>> {

    /* renamed from: a  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.tools.draft.d.a> f139913a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f139914b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f139915c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.draft.f.a f139916d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.draft.viewmodel.a f139917e;

    /* renamed from: f  reason: collision with root package name */
    private final String f139918f = c.class.getSimpleName();

    static {
        Covode.recordClassIndex(91433);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a<? extends com.ss.android.ugc.aweme.tools.draft.d.a> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f139913a.size();
    }

    public static final class a extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f139919e;

        static {
            Covode.recordClassIndex(91434);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f139919e = cVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            int itemViewType = this.f139919e.getItemViewType(i2);
            if (itemViewType == 105 || itemViewType == 107 || itemViewType == 108) {
                return 3;
            }
            return 1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f139913a.get(i2).a();
    }

    public final void a(List<com.ss.android.ugc.aweme.tools.draft.d.a> list) {
        l.d(list, "");
        j.d a2 = j.a(new b(this.f139913a, list), true);
        l.b(a2, "");
        a2.a(this);
        this.f139913a = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).a(new a(this));
        }
    }

    public c(com.ss.android.ugc.aweme.tools.draft.f.a aVar, com.ss.android.ugc.aweme.tools.draft.viewmodel.a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f139916d = aVar;
        this.f139917e = aVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a<? extends com.ss.android.ugc.aweme.tools.draft.d.a> aVar, int i2) {
        a<? extends com.ss.android.ugc.aweme.tools.draft.d.a> aVar2 = aVar;
        l.d(aVar2, "");
        if (i2 == aw.f139418b) {
            aw.a(i2, this.f139913a);
        }
        this.f139913a.get(i2).f139476a = this.f139914b;
        this.f139913a.get(i2).f139477b = this.f139915c;
        aVar2.a(this.f139913a.get(i2));
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(4901);
        l.d(viewGroup, "");
        com.ss.android.ugc.aweme.tools.draft.f.a aVar = cVar.f139916d;
        com.ss.android.ugc.aweme.tools.draft.viewmodel.a aVar2 = cVar.f139917e;
        l.d(viewGroup, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        switch (i2) {
            case 101:
                View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_1, viewGroup, false);
                l.b(a3, "");
                viewHolder = new DraftViewHolder(a3, aVar, aVar2);
                break;
            case 102:
                View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_9, viewGroup, false);
                l.b(a4, "");
                viewHolder = new j(a4);
                break;
            case 103:
                View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_6, viewGroup, false);
                l.b(a5, "");
                viewHolder = new g(a5, aVar);
                break;
            case 104:
                View a6 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_3, viewGroup, false);
                l.b(a6, "");
                viewHolder = new d(a6);
                break;
            case 105:
                View a7 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_4, viewGroup, false);
                l.b(a7, "");
                viewHolder = new e(a7);
                break;
            case 106:
                View a8 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_8, viewGroup, false);
                l.b(a8, "");
                viewHolder = new NewDraftViewHolder(a8, aVar, aVar2);
                break;
            case 107:
                View a9 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_2, viewGroup, false);
                l.b(a9, "");
                viewHolder = new h(a9);
                break;
            case 108:
                View a10 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_7, viewGroup, false);
                l.b(a10, "");
                viewHolder = new f(a10, aVar);
                break;
            default:
                RuntimeException runtimeException = new RuntimeException("wrong draft type");
                MethodCollector.o(4901);
                throw runtimeException;
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(4901);
        return viewHolder;
    }
}
