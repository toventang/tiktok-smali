package com.ss.android.ugc.aweme.discover.lynx.container;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.discover.lynx.a.b;
import com.ss.android.ugc.aweme.discover.lynx.e.a;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import h.f.b.l;
import h.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c extends f<a> implements com.ss.android.ugc.aweme.discover.lynx.c.a {

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, List<p<String, JSONObject>>> f81457a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, List<Object>> f81458b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public Object f81459c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f81460d;

    static {
        Covode.recordClassIndex(50617);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        Object obj = this.f76354l.get(i2);
        l.b(obj, "");
        return ((a) obj).f81453a;
    }

    public c(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f81460d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof com.ss.android.ugc.aweme.discover.mixfeed.e.a) {
            ((com.ss.android.ugc.aweme.discover.mixfeed.e.a) viewHolder).D();
        }
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f81461a;

        static {
            Covode.recordClassIndex(50618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewGroup viewGroup, View view) {
            super(view);
            this.f81461a = viewGroup;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        MethodCollector.i(4375);
        l.d(viewGroup, "");
        if (i2 == b.f81455a) {
            com.ss.android.ugc.aweme.discover.lynx.e.a a2 = a.C1902a.a(viewGroup, null);
            MethodCollector.o(4375);
            return a2;
        }
        a aVar = new a(viewGroup, new View(viewGroup.getContext()));
        MethodCollector.o(4375);
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.c.a
    public final void a(int i2, b bVar) {
        List<Object> remove;
        l.d(bVar, "");
        List<p<String, JSONObject>> remove2 = this.f81457a.remove(Integer.valueOf(i2));
        if (remove2 != null) {
            for (T t : remove2) {
                bVar.a((String) t.getFirst(), (JSONObject) t.getSecond());
            }
        }
        LynxView lynxView = bVar.f81413d;
        if (!(lynxView == null || (remove = this.f81458b.remove(Integer.valueOf(i2))) == null)) {
            for (T t2 : remove) {
                if (t2 instanceof TemplateData) {
                    lynxView.updateData((TemplateData) t2);
                } else if (t2 instanceof String) {
                    lynxView.updateData((String) t2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof com.ss.android.ugc.aweme.discover.lynx.e.a) {
            ((com.ss.android.ugc.aweme.discover.lynx.e.a) viewHolder).a().o = this.f81459c;
            ((com.ss.android.ugc.aweme.discover.lynx.e.a) viewHolder).a(this);
            ((com.ss.android.ugc.aweme.discover.lynx.e.a) viewHolder).C();
            d dVar = ((a) this.f76354l.get(i2)).f81454b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rank", Integer.valueOf(i2));
            com.ss.android.ugc.aweme.discover.lynx.e.a.a((com.ss.android.ugc.aweme.discover.lynx.e.a) viewHolder, dVar, linkedHashMap, 26);
        }
    }
}
