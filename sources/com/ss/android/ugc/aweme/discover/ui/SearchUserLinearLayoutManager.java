package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import h.f.b.l;
import h.j.h;

public final class SearchUserLinearLayoutManager extends WrapLinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static long f82171a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final a f82172b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(51133);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(51132);
    }

    public SearchUserLinearLayoutManager(Context context) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i, com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        l.d(oVar, "");
        l.d(sVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        super.c(oVar, sVar);
        f82171a = h.a(System.currentTimeMillis() - currentTimeMillis, f82171a);
    }
}
