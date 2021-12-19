package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class CallBackLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public final a<z> f94080a;

    static {
        Covode.recordClassIndex(59804);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.s sVar) {
        super.a(sVar);
        this.f94080a.invoke();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallBackLinearLayoutManager(Context context, a<z> aVar) {
        super(0, false);
        l.d(context, "");
        l.d(aVar, "");
        this.f94080a = aVar;
    }
}
