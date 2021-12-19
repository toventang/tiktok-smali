package com.ss.android.ugc.aweme.qna.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.qna.c.d;
import com.ss.android.ugc.aweme.qna.g.e;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.qna.model.h;
import com.ss.android.ugc.aweme.qna.ui.p;
import com.ss.android.ugc.aweme.qna.vm.i;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class l extends t<f, g> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f119610b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final d f119611c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.qna.c.a f119612d;

    /* renamed from: e  reason: collision with root package name */
    private final i f119613e;

    /* renamed from: f  reason: collision with root package name */
    private final e f119614f;

    static {
        Covode.recordClassIndex(77707);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77708);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ l(i iVar) {
        this(iVar, null);
    }

    private final void a(h hVar) {
        this.f119611c.a(hVar);
        this.f119612d.a(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return ((f) a(i2)).f119496g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        g gVar = (g) viewHolder;
        h.f.b.l.d(gVar, "");
        super.onViewAttachedToWindow(gVar);
        if (!(gVar instanceof k)) {
            gVar = null;
        }
        k kVar = (k) gVar;
        if (kVar != null) {
            a(kVar.f119590a);
        }
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        List<T> list = this.f4207a.f4004f;
        h.f.b.l.b(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!h.f.b.l.a((Object) t.f119497h, (Object) str)) {
                arrayList.add(t);
            }
        }
        a(arrayList);
    }

    public final void b(List<h> list) {
        h.f.b.l.d(list, "");
        this.f119611c.f119272a.clear();
        this.f119612d.f119267a.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a((h) it.next());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(i iVar, e eVar) {
        super(m.f119615a);
        h.f.b.l.d(iVar, "");
        this.f119613e = iVar;
        this.f119614f = eVar;
        this.f119611c = new d();
        this.f119612d = new com.ss.android.ugc.aweme.qna.c.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        g gVar = (g) viewHolder;
        h.f.b.l.d(gVar, "");
        Object a2 = a(i2);
        h.f.b.l.b(a2, "");
        gVar.a((f) a2);
    }

    private static RecyclerView.ViewHolder a(l lVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(9535);
        h.f.b.l.d(viewGroup, "");
        switch (i2) {
            case 0:
                viewHolder = p.a.a(viewGroup);
                break;
            case 1:
                h.f.b.l.d(viewGroup, "");
                View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar8, viewGroup, false);
                h.f.b.l.b(a3, "");
                viewHolder = new n(a3);
                break;
            case 2:
                i iVar = lVar.f119613e;
                e eVar = lVar.f119614f;
                h.f.b.l.d(viewGroup, "");
                h.f.b.l.d(iVar, "");
                View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar5, viewGroup, false);
                h.f.b.l.b(a4, "");
                Context context = viewGroup.getContext();
                h.f.b.l.b(context, "");
                viewHolder = new k(iVar, a4, context, eVar);
                break;
            case 3:
                i iVar2 = lVar.f119613e;
                h.f.b.l.d(viewGroup, "");
                h.f.b.l.d(iVar2, "");
                View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aqz, viewGroup, false);
                h.f.b.l.b(a5, "");
                Context context2 = viewGroup.getContext();
                h.f.b.l.b(context2, "");
                viewHolder = new f(iVar2, a5, context2);
                break;
            case 4:
                i iVar3 = lVar.f119613e;
                h.f.b.l.d(viewGroup, "");
                h.f.b.l.d(iVar3, "");
                View a6 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar3, viewGroup, false);
                h.f.b.l.b(a6, "");
                viewHolder = new j(iVar3, a6);
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                h.f.b.l.d(viewGroup, "");
                View a7 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar1, viewGroup, false);
                h.f.b.l.b(a7, "");
                Context context3 = viewGroup.getContext();
                h.f.b.l.b(context3, "");
                viewHolder = new h(a7, context3);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                h.f.b.l.d(viewGroup, "");
                float dimension = com.bytedance.ies.ugc.appcontext.d.a().getResources().getDimension(R.dimen.id);
                View a8 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar9, viewGroup, false);
                h.f.b.l.b(a8, "");
                ViewGroup.LayoutParams layoutParams = a8.getLayoutParams();
                layoutParams.height = (int) (dimension * 1.5f);
                a8.setLayoutParams(layoutParams);
                viewHolder = new b(a8);
                break;
            default:
                viewHolder = p.a.a(viewGroup);
                break;
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
        MethodCollector.o(9535);
        return viewHolder;
    }
}
