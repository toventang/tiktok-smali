package com.ss.android.ugc.aweme.discover.alading;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import java.util.List;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f80745a = true;

    /* renamed from: i  reason: collision with root package name */
    public r f80746i = r.a.a();

    /* renamed from: j  reason: collision with root package name */
    public final d f80747j;

    static {
        Covode.recordClassIndex(50214);
    }

    public final void a(r rVar) {
        l.d(rVar, "");
        this.f80746i = rVar;
    }

    public b(d dVar) {
        l.d(dVar, "");
        this.f80747j = dVar;
    }

    public final void a(List<? extends Object> list, RecyclerView.a<?> aVar) {
        l.d(list, "");
        l.d(aVar, "");
        this.f80747j.f80749a.b(0);
        this.f80747j.a(aVar);
    }
}
