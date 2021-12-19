package com.ss.android.ugc.tools.view.widget.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class c<DATA> extends e {

    /* renamed from: a  reason: collision with root package name */
    private final List<p<Integer, DATA>> f150340a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, DATA> f150341b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.a<RecyclerView.ViewHolder> f150342c;

    static {
        Covode.recordClassIndex(98889);
    }

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    public abstract void a(RecyclerView.ViewHolder viewHolder, DATA data);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return b(this.f150342c.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        if (this.f150341b.keySet().contains(Integer.valueOf(i2))) {
            return -2147483647;
        }
        return this.f150342c.getItemViewType(a(i2));
    }

    public c(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        l.d(aVar, "");
        this.f150342c = aVar;
        aVar.registerAdapterDataObserver(new RecyclerView.c(this) {
            /* class com.ss.android.ugc.tools.view.widget.a.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f150343a;

            static {
                Covode.recordClassIndex(98890);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a() {
                this.f150343a.notifyDataSetChanged();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f150343a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void b(int i2, int i3) {
                this.f150343a.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void c(int i2, int i3) {
                this.f150343a.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3) {
                int b2 = this.f150343a.b(i2);
                this.f150343a.notifyItemRangeChanged(b2, this.f150343a.b(i2 + i3) - b2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, int i4) {
                this.f150343a.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, Object obj) {
                int b2 = this.f150343a.b(i2);
                this.f150343a.notifyItemRangeChanged(b2, this.f150343a.b(i2 + i3) - b2, obj);
            }
        });
    }

    public final int a(int i2) {
        Map<Integer, DATA> map = this.f150341b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, DATA> entry : map.entrySet()) {
            if (entry.getKey().intValue() < i2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return i2 - linkedHashMap.size();
    }

    public final int b(int i2) {
        List<p<Integer, DATA>> list = this.f150340a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (((Number) t.getFirst()).intValue() < i2) {
                arrayList.add(t);
            }
        }
        return i2 + arrayList.size();
    }

    public final void a(List<? extends p<Integer, ? extends DATA>> list) {
        l.d(list, "");
        this.f150340a.clear();
        List<p<Integer, DATA>> list2 = this.f150340a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (((Number) t.getFirst()).intValue() >= 0) {
                arrayList.add(t);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Integer.valueOf(((Number) ((p) obj).getFirst()).intValue()))) {
                arrayList2.add(obj);
            }
        }
        list2.addAll(arrayList2);
        List<p<Integer, DATA>> list3 = this.f150340a;
        if (list3.size() > 1) {
            n.a((List) list3, (Comparator) new a());
        }
        this.f150341b.clear();
        for (p<Integer, DATA> pVar : this.f150340a) {
            this.f150341b.put(Integer.valueOf(pVar.getFirst().intValue() + this.f150341b.size() + 1), pVar.getSecond());
        }
        notifyDataSetChanged();
    }

    public static final class a<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(98891);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a((Integer) t.getFirst(), (Integer) t2.getFirst());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (getItemViewType(i2) == -2147483647) {
            DATA data = this.f150341b.get(Integer.valueOf(i2));
            if (data == null) {
                l.b();
            }
            a(viewHolder, data);
            return;
        }
        this.f150342c.onBindViewHolder(viewHolder, a(i2));
    }

    @Override // com.ss.android.ugc.tools.view.widget.a.e
    public final int a(int i2, GridLayoutManager gridLayoutManager) {
        l.d(gridLayoutManager, "");
        if (getItemViewType(i2) == -2147483647) {
            return gridLayoutManager.f3760b;
        }
        RecyclerView.a<RecyclerView.ViewHolder> aVar = this.f150342c;
        if (aVar instanceof e) {
            return ((e) aVar).a(a(i2), gridLayoutManager);
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (getItemViewType(i2) == -2147483647) {
            onBindViewHolder(viewHolder, i2);
        } else {
            this.f150342c.onBindViewHolder(viewHolder, a(i2), list);
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        l.d(viewGroup, "");
        if (-2147483647 == i2) {
            viewHolder = cVar.a(viewGroup);
        } else {
            viewHolder = cVar.f150342c.onCreateViewHolder(viewGroup, i2);
            l.b(viewHolder, "");
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
        return viewHolder;
    }
}
