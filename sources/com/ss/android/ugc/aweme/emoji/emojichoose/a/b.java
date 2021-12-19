package com.ss.android.ugc.aweme.emoji.emojichoose.a;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public c f89200a;

    static {
        Covode.recordClassIndex(56077);
    }

    public b(RecyclerView recyclerView) {
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        c cVar = new c();
        this.f89200a = cVar;
        recyclerView.setAdapter(cVar);
    }
}
