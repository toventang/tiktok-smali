package com.ss.android.ugc.trill.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.List;
import java.util.Objects;

public final class j extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public a f150597a;

    /* renamed from: b  reason: collision with root package name */
    private Context f150598b;

    /* renamed from: c  reason: collision with root package name */
    private List<c> f150599c;

    public interface a {
        static {
            Covode.recordClassIndex(99033);
        }

        void b(int i2);
    }

    static {
        Covode.recordClassIndex(99032);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<c> list = this.f150599c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    static final class d extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ c $currentItem$inlined;
        final /* synthetic */ int $position$inlined;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(99036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar, c cVar, int i2) {
            super(0);
            this.this$0 = jVar;
            this.$currentItem$inlined = cVar;
            this.$position$inlined = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            a aVar = this.this$0.f150597a;
            if (aVar != null) {
                aVar.b(this.$position$inlined);
            }
            return false;
        }
    }

    public final void a(List<c> list) {
        l.d(list, "");
        this.f150599c = list;
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TuxTextCell f150600a;

        static {
            Covode.recordClassIndex(99034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.fkk);
            l.b(findViewById, "");
            this.f150600a = (TuxTextCell) findViewById;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f150601a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f150602b;

        static {
            Covode.recordClassIndex(99035);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f150601a, cVar.f150601a) && this.f150602b == cVar.f150602b;
        }

        public final int hashCode() {
            String str = this.f150601a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f150602b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public final String toString() {
            return "VoiceItemData(title=" + this.f150601a + ", isChecked=" + this.f150602b + ")";
        }

        public c(String str, boolean z) {
            l.d(str, "");
            this.f150601a = str;
            this.f150602b = z;
        }
    }

    public j(Context context, a aVar) {
        l.d(aVar, "");
        this.f150598b = context;
        this.f150597a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        List<c> list = this.f150599c;
        if (list != null && !list.isEmpty()) {
            List<c> list2 = this.f150599c;
            if (list2 == null) {
                l.b();
            }
            c cVar = list2.get(i2);
            bVar2.f150600a.setTitle(cVar.f150601a);
            c.b accessory = bVar2.f150600a.getAccessory();
            Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
            c.e eVar = (c.e) accessory;
            eVar.c(cVar.f150602b);
            eVar.a(new d(this, cVar, i2));
            List<c> list3 = this.f150599c;
            if (list3 == null) {
                l.b();
            }
            if (i2 != list3.size() - 1) {
                bVar2.f150600a.setWithSeparator(true);
            }
        }
    }

    private static RecyclerView.ViewHolder a(j jVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6480);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(jVar.f150598b), R.layout.ayz, viewGroup, false);
        l.b(a3, "");
        b bVar = new b(a3);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(6480);
        return bVar;
    }
}
