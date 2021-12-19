package com.ss.android.ugc.aweme.discover.alading;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f80749a;

    /* renamed from: b  reason: collision with root package name */
    public final a f80750b;

    static {
        Covode.recordClassIndex(50216);
    }

    public final void a(RecyclerView.a<?> aVar) {
        l.d(aVar, "");
        this.f80750b.a(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.a2p);
        l.b(recyclerView, "");
        this.f80749a = recyclerView;
        a aVar = new a();
        this.f80750b = aVar;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar);
    }
}
