package com.ss.android.ugc.aweme.account.agegate.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<C1372a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.account.agegate.model.a> f62580a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Context f62581b;

    static {
        Covode.recordClassIndex(38515);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ C1372a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f62580a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.a$a  reason: collision with other inner class name */
    public static final class C1372a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TuxTextCell f62582a;

        static {
            Covode.recordClassIndex(38516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1372a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.br);
            l.b(findViewById, "");
            this.f62582a = (TuxTextCell) findViewById;
        }
    }

    public a(Context context) {
        l.d(context, "");
        this.f62581b = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C1372a aVar, int i2) {
        C1372a aVar2 = aVar;
        l.d(aVar2, "");
        com.ss.android.ugc.aweme.account.agegate.model.a aVar3 = this.f62580a.get(i2);
        aVar2.f62582a.setTitle(aVar3.f62772b);
        TuxTextCell tuxTextCell = aVar2.f62582a;
        c.i iVar = new c.i(this.f62581b);
        iVar.c(aVar3.f62773c);
        iVar.a(new b(iVar, this, aVar3, i2));
        tuxTextCell.setAccessory(iVar);
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.i f62583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f62584b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.agegate.model.a f62585c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f62586d;

        static {
            Covode.recordClassIndex(38517);
        }

        b(c.i iVar, a aVar, com.ss.android.ugc.aweme.account.agegate.model.a aVar2, int i2) {
            this.f62583a = iVar;
            this.f62584b = aVar;
            this.f62585c = aVar2;
            this.f62586d = i2;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            l.d(compoundButton, "");
            if (this.f62583a.g()) {
                a aVar = this.f62584b;
                int i2 = this.f62586d;
                int i3 = 0;
                for (T t : aVar.f62580a) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (i3 == i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    t2.f62773c = z2;
                    i3 = i4;
                }
                aVar.notifyDataSetChanged();
                h.f.a.a<z> aVar2 = this.f62585c.f62771a;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(8687);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(aVar.f62581b), R.layout.fv, viewGroup, false);
        l.b(a3, "");
        C1372a aVar2 = new C1372a(a3);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar2.getClass().getName();
        MethodCollector.o(8687);
        return aVar2;
    }
}
