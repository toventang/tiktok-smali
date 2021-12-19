package com.ss.android.ugc.aweme.profile.ui.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.ui.z;
import h.f.a.a;
import h.f.b.l;

public final class d extends z {

    /* renamed from: a  reason: collision with root package name */
    public final a<h.z> f117397a;

    static {
        Covode.recordClassIndex(75851);
    }

    public d(a<h.z> aVar) {
        l.d(aVar, "");
        this.f117397a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.challenge.ui.z
    public final void a(RecyclerView recyclerView, int i2) {
        l.d(recyclerView, "");
        super.a(recyclerView, i2);
        if (i2 == 0) {
            this.f117397a.invoke();
        }
    }
}
