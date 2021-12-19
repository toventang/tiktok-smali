package com.ss.android.ugc.aweme.discover.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.ss.android.ugc.aweme.discover.ui.a.b.b.a;
import com.ss.android.ugc.aweme.discover.ui.a.b.b.b;
import com.ss.android.ugc.aweme.discover.ui.a.b.b.c;
import com.ss.android.ugc.aweme.discover.ui.a.b.b.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.search.g.f;
import com.ss.android.ugc.aweme.search.g.g;
import com.ss.android.ugc.aweme.search.g.h;
import com.ss.android.ugc.aweme.search.l.m;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public static final C1923a f82182b = new C1923a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static final int f82183e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static final int f82184f = 2;

    /* renamed from: g  reason: collision with root package name */
    private static final int f82185g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final int f82186h = 4;

    /* renamed from: i  reason: collision with root package name */
    private static final int f82187i = 5;

    /* renamed from: j  reason: collision with root package name */
    private static final int f82188j = -1;

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.ui.a.b.b f82189a;

    /* renamed from: c  reason: collision with root package name */
    private List<Object> f82190c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f82191d;

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.a$a  reason: collision with other inner class name */
    public static final class C1923a {
        static {
            Covode.recordClassIndex(51155);
        }

        private C1923a() {
        }

        public /* synthetic */ C1923a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<Object> list = this.f82190c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static {
        Covode.recordClassIndex(51154);
    }

    public a(com.ss.android.ugc.aweme.discover.ui.a.b.b bVar) {
        l.d(bVar, "");
        this.f82189a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        List<Object> list = this.f82190c;
        if (list == null) {
            l.b();
        }
        Object obj = list.get(i2);
        if (obj instanceof String) {
            return f82183e;
        }
        if (obj instanceof g) {
            return f82184f;
        }
        if (obj instanceof h) {
            return f82185g;
        }
        if (obj instanceof f) {
            return f82187i;
        }
        if (obj instanceof SearchUserFeedback) {
            return f82186h;
        }
        return f82188j;
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f82195a;

        static {
            Covode.recordClassIndex(51156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ViewGroup viewGroup, View view) {
            super(view);
            this.f82195a = viewGroup;
        }
    }

    public final void a(List<Object> list, Map<String, String> map) {
        l.d(list, "");
        this.f82190c = list;
        this.f82191d = map;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        List<Object> list = this.f82190c;
        if (list == null) {
            l.b();
        }
        Object obj = list.get(i2);
        if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            l.d(str, "");
            dVar.f82244a.setText(str);
            dVar.f82245b.setVisibility(0);
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.discover.ui.a.b.b.b) {
            com.ss.android.ugc.aweme.discover.ui.a.b.b.b bVar = (com.ss.android.ugc.aweme.discover.ui.a.b.b.b) viewHolder;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct");
            g gVar = (g) obj;
            l.d(gVar, "");
            ((TextView) bVar.f82232a.getValue()).setText(gVar.getName());
            if (gVar.isSelected()) {
                View view = bVar.itemView;
                l.b(view, "");
                bVar.a().setImageDrawable(androidx.appcompat.a.a.a.b(view.getContext(), 2131233587));
            } else {
                View view2 = bVar.itemView;
                l.b(view2, "");
                bVar.a().setImageDrawable(androidx.appcompat.a.a.a.b(view2.getContext(), 2131233586));
            }
            bVar.a().setOnClickListener(new b.a(bVar, gVar));
        } else if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.filter.SubSwitchStruct");
            h hVar = (h) obj;
            l.d(hVar, "");
            cVar.a().setTitle(hVar.getName());
            if (hVar.getDescription() != null) {
                cVar.a().setSubtitle(hVar.getDescription());
            }
            TuxTextCell a2 = cVar.a();
            View view3 = cVar.itemView;
            l.b(view3, "");
            Context context = view3.getContext();
            l.b(context, "");
            c.j jVar = new c.j(context);
            jVar.c(hVar.isSelected());
            jVar.a(new c.a(jVar, cVar, hVar));
            a2.setAccessory(jVar);
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.discover.ui.a.b.b.a) {
            com.ss.android.ugc.aweme.discover.ui.a.b.b.a aVar = (com.ss.android.ugc.aweme.discover.ui.a.b.b.a) viewHolder;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.filter.SearchFilterMore");
            f fVar = (f) obj;
            l.d(fVar, "");
            aVar.f82228b = fVar;
            i.a.a.a.a.b.c(aVar.a());
            aVar.a().setOnClickListener(new a.View$OnClickListenerC1928a(aVar));
            View view4 = aVar.itemView;
            l.b(view4, "");
            ((TuxTextView) aVar.f82227a.getValue()).setText(view4.getResources().getText(R.string.d5u));
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.discover.ui.a.a.b.a) {
            com.ss.android.ugc.aweme.discover.ui.a.a.b.a aVar2 = (com.ss.android.ugc.aweme.discover.ui.a.a.b.a) viewHolder;
            aVar2.f82198b = this.f82191d;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchUserFeedback");
            SearchUserFeedback searchUserFeedback = (SearchUserFeedback) obj;
            l.d(searchUserFeedback, "");
            aVar2.f82197a = searchUserFeedback;
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(2286);
        l.d(viewGroup, "");
        if (i2 == f82183e) {
            viewHolder = new d(m.a(viewGroup, R.layout.axk));
        } else if (i2 == f82184f) {
            viewHolder = new com.ss.android.ugc.aweme.discover.ui.a.b.b.b(m.a(viewGroup, R.layout.avg), aVar, aVar.f82189a);
        } else if (i2 == f82185g) {
            viewHolder = new com.ss.android.ugc.aweme.discover.ui.a.b.b.c(m.a(viewGroup, R.layout.avi), aVar, aVar.f82189a);
        } else if (i2 == f82186h) {
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.awb, viewGroup, false);
            l.b(a3, "");
            viewHolder = new com.ss.android.ugc.aweme.discover.ui.a.a.b.a(a3);
        } else if (i2 == f82187i) {
            viewHolder = new com.ss.android.ugc.aweme.discover.ui.a.b.b.a(m.a(viewGroup, R.layout.avh), aVar.f82189a);
        } else {
            viewHolder = new b(viewGroup, new View(viewGroup.getContext()));
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
        MethodCollector.o(2286);
        return viewHolder;
    }
}
