package com.ss.android.ugc.aweme.ecommerce.util;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ScrollTopLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public int f87551a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f87552b = true;

    static {
        Covode.recordClassIndex(55034);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        if (!this.f87552b || !super.g()) {
            return false;
        }
        return true;
    }

    public ScrollTopLinearLayoutManager(Context context) {
        l.d(context, "");
    }

    final class a extends r {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ScrollTopLinearLayoutManager f87553f;

        static {
            Covode.recordClassIndex(55035);
        }

        @Override // androidx.recyclerview.widget.r
        public final int b() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.r
        public final int c() {
            return -1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ScrollTopLinearLayoutManager scrollTopLinearLayoutManager, Context context) {
            super(context);
            l.d(context, "");
            this.f87553f = scrollTopLinearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
        public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
            l.d(view, "");
            l.d(sVar, "");
            l.d(aVar, "");
            int b2 = b(view, -1);
            int a2 = a(view, -1) + this.f87553f.f87551a;
            int a3 = a((int) Math.sqrt((double) ((b2 * b2) + (a2 * a2))));
            if (a3 > 0) {
                aVar.a(-b2, -a2, a3, this.f4200b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        l.d(recyclerView, "");
        l.d(sVar, "");
        Context context = recyclerView.getContext();
        l.b(context, "");
        a aVar = new a(this, context);
        aVar.f3862g = i2;
        a(aVar);
    }
}
