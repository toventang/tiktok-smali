package com.ss.android.ugc.aweme.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.n.p;
import com.ss.android.ugc.aweme.framework.b.a;

public final class gc {
    static {
        Covode.recordClassIndex(93562);
    }

    public static RecyclerView a(RecyclerView recyclerView, o oVar, int i2) {
        recyclerView.a(new a(d.a()));
        p pVar = new p(recyclerView, oVar);
        pVar.f93616b = i2;
        recyclerView.setOnFlingListener(pVar);
        return recyclerView;
    }
}
