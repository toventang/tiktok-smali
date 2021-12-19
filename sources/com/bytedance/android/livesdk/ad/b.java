package com.bytedance.android.livesdk.ad;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class b extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    List<com.bytedance.android.live.s.a.a> f13648a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    final List<com.bytedance.android.live.s.a.a> f13649b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    h.f.a.b<? super Boolean, z> f13650c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13651d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13652e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f13653f;

    /* renamed from: g  reason: collision with root package name */
    private final long f13654g;

    static {
        Covode.recordClassIndex(7570);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f13648a.size();
    }

    public final void a(long j2) {
        T t = null;
        for (T t2 : this.f13649b) {
            if (t2.f12593a == j2) {
                t = t2;
            }
        }
        if (t != null) {
            this.f13649b.remove(t);
            this.f13648a.remove(t);
            notifyDataSetChanged();
        }
    }

    public final void a(List<com.bytedance.android.live.s.a.a> list) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.f12593a != this.f13652e) {
                    arrayList.add(t);
                }
            }
            List a2 = n.a((Iterable) arrayList, (Comparator) new a());
            this.f13649b.clear();
            this.f13649b.addAll(a2);
            this.f13648a.clear();
            this.f13648a.addAll(a2);
            notifyDataSetChanged();
        }
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(7571);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(t.f12596d, t2.f12596d);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        aVar2.a(this.f13648a.get(i2));
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2014);
        l.d(viewGroup, "");
        c cVar = new c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_8, viewGroup, false), bVar.f13651d, bVar.f13652e, bVar.f13654g, bVar.f13653f);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(2014);
        return cVar;
    }

    public b(String str, long j2, boolean z, long j3) {
        l.d(str, "");
        this.f13651d = str;
        this.f13652e = j2;
        this.f13653f = z;
        this.f13654g = j3;
    }
}
