package com.ss.android.ugc.aweme.discover.lynx.container;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.lynx.container.f;
import com.ss.android.ugc.aweme.discover.lynx.e.a;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.search.k.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class e extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f81466a;

    /* renamed from: b  reason: collision with root package name */
    public c f81467b;

    static {
        Covode.recordClassIndex(50621);
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final View getRealView() {
        return this;
    }

    public final c getContainerAdapter() {
        c cVar = this.f81467b;
        if (cVar == null) {
            l.a("dynamicViewAdapter");
        }
        return cVar;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f81466a;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        return recyclerView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void b(String str) {
        l.d(str, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void a(d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void a(List<a> list) {
        l.d(list, "");
        if (this.f81467b != null) {
            c cVar = this.f81467b;
            if (cVar == null) {
                l.a("dynamicViewAdapter");
            }
            cVar.b_(list);
        }
    }

    public final void a(TemplateData templateData) {
        l.d(templateData, "");
        c cVar = this.f81467b;
        if (cVar == null) {
            l.a("dynamicViewAdapter");
            return;
        }
        l.d(templateData, "");
        RecyclerView.ViewHolder a2 = cVar.f81460d.a(0, false);
        if (a2 != null && (a2 instanceof a)) {
            a aVar = (a) a2;
            if (aVar.E()) {
                l.d(templateData, "");
                com.ss.android.ugc.aweme.discover.lynx.delegate.d c2 = aVar.c();
                if (c2 != null) {
                    LynxView lynxView = c2.f81477b.f81413d;
                    if (lynxView != null) {
                        lynxView.updateData(templateData);
                    }
                    if (l.a((Object) "guessSearchDataProcess", (Object) templateData.f55592b)) {
                        n.a.a(1);
                        n.a.a("lynx");
                        return;
                    }
                    return;
                }
                return;
            }
        }
        List<Object> list = cVar.f81458b.get(0);
        if (list == null) {
            list = new ArrayList<>();
        }
        Map<Integer, List<Object>> map = cVar.f81458b;
        list.add(templateData);
        map.put(0, list);
    }

    public final void a(String str) {
        LynxView lynxView;
        l.d(str, "");
        c cVar = this.f81467b;
        if (cVar == null) {
            l.a("dynamicViewAdapter");
            return;
        }
        l.d(str, "");
        RecyclerView.ViewHolder a2 = cVar.f81460d.a(0, false);
        if (a2 != null && (a2 instanceof a)) {
            a aVar = (a) a2;
            if (aVar.E()) {
                l.d(str, "");
                com.ss.android.ugc.aweme.discover.lynx.delegate.d c2 = aVar.c();
                if (c2 != null && (lynxView = c2.f81477b.f81413d) != null) {
                    lynxView.updateData(str);
                    return;
                }
                return;
            }
        }
        List<Object> list = cVar.f81458b.get(0);
        if (list == null) {
            list = new ArrayList<>();
        }
        Map<Integer, List<Object>> map = cVar.f81458b;
        list.add(str);
        map.put(0, list);
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        l.d(viewGroup, "");
        l.d(layoutParams, "");
        f.a.a(this, viewGroup, 0, layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private e(Context context, byte b2) {
        this(context, (char) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(Context context, char c2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(3199);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.a.a(LayoutInflater.from(getContext()), R.layout.auy, this, true);
        View findViewById = findViewById(R.id.djh);
        l.b(findViewById, "");
        this.f81466a = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f81466a;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        this.f81467b = new c(recyclerView);
        RecyclerView recyclerView2 = this.f81466a;
        if (recyclerView2 == null) {
            l.a("recyclerView");
        } else {
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView3 = this.f81466a;
        if (recyclerView3 == null) {
            l.a("recyclerView");
        }
        c cVar = this.f81467b;
        if (cVar == null) {
            l.a("dynamicViewAdapter");
        }
        recyclerView3.setAdapter(cVar);
        MethodCollector.o(3199);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[LOOP:0: B:8:0x0028->B:21:0x0059, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0011 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r11, org.json.JSONObject r12) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.lynx.container.e.a(java.lang.String, org.json.JSONObject):void");
    }
}
