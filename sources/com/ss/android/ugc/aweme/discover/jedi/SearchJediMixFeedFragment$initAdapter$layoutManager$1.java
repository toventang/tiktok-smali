package com.ss.android.ugc.aweme.discover.jedi;

import android.content.Context;
import com.bytedance.android.alog.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

public final class SearchJediMixFeedFragment$initAdapter$layoutManager$1 extends WrapGridLayoutManager {
    final /* synthetic */ b L;

    static {
        Covode.recordClassIndex(50528);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(String str) {
        try {
            super.a(str);
        } catch (Exception e2) {
            c.a(1, "MixFeedFragment", e2.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchJediMixFeedFragment$initAdapter$layoutManager$1(b bVar, Context context) {
        super(context, 2);
        this.L = bVar;
    }
}
