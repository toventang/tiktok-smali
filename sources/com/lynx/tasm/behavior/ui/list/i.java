package com.lynx.tasm.behavior.ui.list;

import android.view.ViewGroup;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.h;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.g;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.util.HashMap;
import java.util.List;

public class i extends RecyclerView.a<h> {

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Integer> f56248a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    final HashMap<Long, h> f56249b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    final UIList f56250c;

    /* renamed from: d  reason: collision with root package name */
    boolean f56251d;

    /* renamed from: e  reason: collision with root package name */
    boolean f56252e;

    /* renamed from: f  reason: collision with root package name */
    JavaOnlyArray f56253f;

    /* renamed from: g  reason: collision with root package name */
    JavaOnlyArray f56254g;

    /* renamed from: h  reason: collision with root package name */
    JavaOnlyArray f56255h;

    /* renamed from: i  reason: collision with root package name */
    JavaOnlyArray f56256i;

    /* renamed from: j  reason: collision with root package name */
    JavaOnlyArray f56257j;

    /* renamed from: k  reason: collision with root package name */
    final a f56258k = new a(this, (byte) 0);

    /* renamed from: l  reason: collision with root package name */
    boolean f56259l;

    /* renamed from: m  reason: collision with root package name */
    private int f56260m;
    private final a n;

    static {
        Covode.recordClassIndex(35133);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ h onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f56253f.size();
    }

    private long a() {
        int i2 = this.f56260m;
        this.f56260m = i2 + 1;
        return (((long) this.f56250c.getSign()) << 32) + ((long) i2);
    }

    final class a {

        /* renamed from: a  reason: collision with root package name */
        ReadableArray f56261a;

        /* renamed from: b  reason: collision with root package name */
        ReadableArray f56262b;

        /* renamed from: c  reason: collision with root package name */
        ReadableArray f56263c;

        /* renamed from: d  reason: collision with root package name */
        ReadableArray f56264d;

        /* renamed from: e  reason: collision with root package name */
        ReadableArray f56265e;

        /* renamed from: f  reason: collision with root package name */
        ReadableArray f56266f;

        static {
            Covode.recordClassIndex(35134);
        }

        private a() {
        }

        /* synthetic */ a(i iVar, byte b2) {
            this();
        }
    }

    private void a(h hVar) {
        UIComponent uIComponent = hVar.f56243a.f56245b;
        if (uIComponent != null) {
            hVar.a();
            this.f56250c.b(uIComponent);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2) {
        return this.f56255h.contains(Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final boolean c(int i2) {
        return this.f56256i.contains(Integer.valueOf(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i2) {
        if (this.mHasStableIds) {
            return (long) i2;
        }
        return -1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewDetachedFromWindow(h hVar) {
        h hVar2 = hVar;
        this.n.b(hVar2);
        if (this.f56251d) {
            a(hVar2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        Integer num = this.f56248a.get(this.f56253f.getString(i2));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewAttachedToWindow(h hVar) {
        h hVar2 = hVar;
        if (this.f56251d && hVar2.f56243a.f56245b == null) {
            a(hVar2, hVar2.getAdapterPosition());
        }
        this.n.a(hVar2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2) {
        return this.f56254g.contains(Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final int d(int i2) {
        for (int size = this.f56254g.size() - 1; size >= 0; size--) {
            Integer num = (Integer) this.f56254g.get(size);
            if (num.intValue() <= i2) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final int e(int i2) {
        for (int i3 = 0; i3 < this.f56254g.size(); i3++) {
            Integer num = (Integer) this.f56254g.get(i3);
            if (num.intValue() >= i2) {
                return num.intValue();
            }
        }
        return -1;
    }

    public i(UIList uIList, a aVar) {
        this.f56250c = uIList;
        this.n = aVar;
    }

    private void c(h hVar, int i2) {
        if (this.f56259l) {
            StaggeredGridLayoutManager.b bVar = new StaggeredGridLayoutManager.b(hVar.itemView.getLayoutParams());
            bVar.f3934b = a(i2);
            hVar.itemView.setLayoutParams(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(h hVar, int i2) {
        MethodCollector.i(12590);
        long a2 = a();
        this.f56249b.put(Long.valueOf(a2), hVar);
        UIComponent uIComponent = (UIComponent) this.f56250c.a(i2, a2);
        if (uIComponent == null || v.y(uIComponent.mView)) {
            this.f56249b.remove(Long.valueOf(a2));
            MethodCollector.o(12590);
            return;
        }
        if (uIComponent != hVar.f56243a.f56245b) {
            if (((com.lynx.tasm.behavior.ui.view.a) uIComponent.mView).getParent() != null) {
                ((ViewGroup) ((com.lynx.tasm.behavior.ui.view.a) uIComponent.mView).getParent()).removeView(uIComponent.mView);
            }
            a(hVar);
            hVar.a(uIComponent);
            this.n.c(hVar);
        }
        c(hVar, i2);
        JavaOnlyArray javaOnlyArray = this.f56257j;
        if (javaOnlyArray != null && javaOnlyArray.size() > i2) {
            hVar.a(((Integer) this.f56257j.get(i2)).intValue());
        }
        MethodCollector.o(12590);
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(12709);
        if (UIList.f56161h) {
            LLog.a(4, "UIList", "Adapter onCreateViewHolder ".concat(String.valueOf(i2)));
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        h.a aVar = new h.a(viewGroup.getContext());
        aVar.setLayoutParams(layoutParams);
        h hVar = new h(aVar);
        try {
            if (hVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        MethodCollector.o(12709);
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onBindViewHolder(h hVar, int i2) {
        MethodCollector.i(12587);
        if (UIList.f56161h) {
            LLog.a(4, "UIList", "Adapter onBindViewHolder ".concat(String.valueOf(i2)));
        }
        if (this.f56251d) {
            a(hVar, i2);
            MethodCollector.o(12587);
            return;
        }
        long a2 = a();
        this.f56249b.put(Long.valueOf(a2), hVar);
        if (hVar.f56243a.f56245b == null) {
            UIList uIList = this.f56250c;
            g gVar = uIList.f56155a;
            int sign = uIList.getSign();
            if (gVar.f56620a != null) {
                TemplateAssembler templateAssembler = gVar.f56620a;
                if (templateAssembler.f55577g) {
                    LLog.a(6, "TemplateAssembler", "renderChild: listSign " + sign + ", index " + i2);
                } else {
                    templateAssembler.nativeRenderChild(templateAssembler.f55571a, sign, i2, a2);
                }
            }
            uIList.f56156b = null;
            UIComponent uIComponent = (UIComponent) ((LynxUI) uIList.f56156b);
            if (uIComponent != null) {
                hVar.a(uIComponent);
            }
            this.n.c(hVar);
        } else {
            hVar.f56243a.f56244a = 1;
            this.f56250c.a(hVar.f56243a.f56245b, i2, a2);
        }
        c(hVar, i2);
        JavaOnlyArray javaOnlyArray = this.f56257j;
        if (javaOnlyArray != null && javaOnlyArray.size() > i2) {
            hVar.a(((Integer) this.f56257j.get(i2)).intValue());
        }
        MethodCollector.o(12587);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(h hVar, int i2, List list) {
        h hVar2 = hVar;
        if (this.f56251d) {
            if (!list.isEmpty()) {
                i2 = ((Integer) list.get(list.size() - 1)).intValue();
            }
            a(hVar2, Integer.valueOf(i2).intValue());
        } else if (list.isEmpty()) {
            onBindViewHolder(hVar2, i2);
        } else {
            long a2 = a();
            Integer num = (Integer) list.get(list.size() - 1);
            this.f56249b.put(Long.valueOf(a2), hVar2);
            this.n.b(hVar2);
            hVar2.f56243a.f56244a = 1;
            this.f56250c.a(hVar2.f56243a.f56245b, num.intValue(), a2);
            this.n.a(hVar2);
            c(hVar2, num.intValue());
            JavaOnlyArray javaOnlyArray = this.f56257j;
            if (javaOnlyArray != null && javaOnlyArray.size() > i2) {
                hVar2.a(((Integer) this.f56257j.get(i2)).intValue());
            }
        }
    }
}
