package com.ss.android.ugc.aweme.q.a.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bl;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.q.a.a<com.ss.android.ugc.aweme.api.model.a, RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(77264);
    }

    public b(bl blVar) {
        super(blVar);
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f118934a;

        static {
            Covode.recordClassIndex(77265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view) {
            super(view);
            l.d(view, "");
            this.f118934a = bVar;
        }
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        l.d(viewHolder, "");
        l.d(obj, "");
    }

    @Override // j.a.a.c
    public final RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(3658);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        a aVar = new a(this, new View(viewGroup.getContext()));
        MethodCollector.o(3658);
        return aVar;
    }
}
