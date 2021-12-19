package com.bytedance.android.live.publicscreen.a.a;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.f.a;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import j.a.a.c;
import java.util.List;

public abstract class a<MODEL extends h, VH extends com.bytedance.android.live.publicscreen.a.f.a<MODEL>> extends c<MODEL, VH> {

    /* renamed from: a  reason: collision with root package name */
    public g f12173a;

    static {
        Covode.recordClassIndex(6688);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void c(RecyclerView.ViewHolder viewHolder) {
        com.bytedance.android.live.publicscreen.a.f.a aVar = (com.bytedance.android.live.publicscreen.a.f.a) viewHolder;
        l.d(aVar, "");
        super.c(aVar);
        aVar.a();
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder) {
        com.bytedance.android.live.publicscreen.a.f.a aVar = (com.bytedance.android.live.publicscreen.a.f.a) viewHolder;
        l.d(aVar, "");
        super.a(aVar);
        MODEL model = aVar.f12196c;
        if (model != null) {
            model.f();
        }
    }

    @Override // j.a.a.c
    public final /* synthetic */ void b(RecyclerView.ViewHolder viewHolder) {
        com.bytedance.android.live.publicscreen.a.f.a aVar = (com.bytedance.android.live.publicscreen.a.f.a) viewHolder;
        l.d(aVar, "");
        super.b(aVar);
        MODEL model = aVar.f12196c;
        if (model != null) {
            model.g();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.bytedance.android.live.publicscreen.a.f.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        com.bytedance.android.live.publicscreen.a.f.a aVar = (com.bytedance.android.live.publicscreen.a.f.a) viewHolder;
        h hVar = (h) obj;
        l.d(aVar, "");
        l.d(hVar, "");
        g gVar = this.f12173a;
        if (gVar == null) {
            l.a("publicScreenContext");
        }
        gVar.n.a(hVar);
        hVar.d().f12179a++;
        hVar.e();
        g gVar2 = this.f12173a;
        if (gVar2 == null) {
            l.a("publicScreenContext");
        }
        aVar.a(gVar2, hVar);
        g gVar3 = this.f12173a;
        if (gVar3 == null) {
            l.a("publicScreenContext");
        }
        gVar3.n.b(hVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.android.live.publicscreen.a.a.a<MODEL extends com.bytedance.android.live.publicscreen.a.d.h, VH extends com.bytedance.android.live.publicscreen.a.f.a<MODEL>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.a.a.c
    public final /* bridge */ /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        a((com.bytedance.android.live.publicscreen.a.f.a) viewHolder, (h) obj, (List<Object>) list);
    }

    public final void a(VH vh, MODEL model, List<Object> list) {
        l.d(vh, "");
        l.d(model, "");
        l.d(list, "");
        g gVar = this.f12173a;
        if (gVar == null) {
            l.a("publicScreenContext");
        }
        gVar.n.a(model);
        model.d().f12180b = SystemClock.uptimeMillis();
        model.d().f12179a++;
        model.e();
        g gVar2 = this.f12173a;
        if (gVar2 == null) {
            l.a("publicScreenContext");
        }
        vh.a(gVar2, model, list);
        model.d().f12181c = SystemClock.uptimeMillis();
        g gVar3 = this.f12173a;
        if (gVar3 == null) {
            l.a("publicScreenContext");
        }
        gVar3.n.b(model);
    }
}
