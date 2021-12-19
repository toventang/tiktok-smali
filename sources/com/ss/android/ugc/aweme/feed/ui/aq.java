package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.adapter.q;
import com.ss.android.ugc.aweme.feed.api.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class aq extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f94281a;

    /* renamed from: b  reason: collision with root package name */
    q f94282b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f94283c = ((RecyclerView) com.a.a(LayoutInflater.from(getContext()), R.layout.a0k, this, true).findViewById(R.id.djs));

    /* renamed from: d  reason: collision with root package name */
    private LinearLayoutManager f94284d;

    static {
        Covode.recordClassIndex(59896);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ aq this$0;

        static {
            Covode.recordClassIndex(59897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(aq aqVar) {
            super(0);
            this.this$0 = aqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.f94281a = true;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        RecyclerView.i layoutManager;
        RecyclerView recyclerView = this.f94283c;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).a(i2, 0);
        }
    }

    public final void setData(List<k> list) {
        l.d(list, "");
        q qVar = this.f94282b;
        if (qVar == null) {
            l.a("mAdapter");
        }
        qVar.b_(list);
        RecyclerView recyclerView = this.f94283c;
        if (recyclerView != null) {
            recyclerView.b(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(11542);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Context context2 = getContext();
        l.b(context2, "");
        CallBackLinearLayoutManager callBackLinearLayoutManager = new CallBackLinearLayoutManager(context2, new a(this));
        this.f94284d = callBackLinearLayoutManager;
        RecyclerView recyclerView = this.f94283c;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(callBackLinearLayoutManager);
        }
        q qVar = new q();
        this.f94282b = qVar;
        RecyclerView recyclerView2 = this.f94283c;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(qVar);
            MethodCollector.o(11542);
            return;
        }
        MethodCollector.o(11542);
    }
}
