package com.ss.android.ugc.aweme.q.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.bl;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.q.a.a<AnchorCell, RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(77253);
    }

    public a(bl blVar) {
        super(blVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.a.a$a  reason: collision with other inner class name */
    public final class C3048a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f118920a;

        static {
            Covode.recordClassIndex(77254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3048a(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f118920a = aVar;
        }
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        l.d(viewHolder, "");
        l.d(obj, "");
    }

    @Override // j.a.a.c
    public final RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(6704);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        C3048a aVar = new C3048a(this, new View(viewGroup.getContext()));
        MethodCollector.o(6704);
        return aVar;
    }
}
