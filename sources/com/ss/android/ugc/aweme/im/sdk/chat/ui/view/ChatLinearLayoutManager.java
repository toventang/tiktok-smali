package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import h.f.b.l;

public final class ChatLinearLayoutManager extends WrapLinearLayoutManager {

    /* renamed from: d  reason: collision with root package name */
    public static final a f101237d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f101238a = true;

    /* renamed from: b  reason: collision with root package name */
    public final String f101239b = "ChatLinearLayoutManager";

    /* renamed from: c  reason: collision with root package name */
    public final Context f101240c;

    static {
        Covode.recordClassIndex(64760);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64761);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int C() {
        if (this.f3780l) {
            return m();
        }
        return k();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        if (!this.f101238a || !super.g()) {
            return false;
        }
        return true;
    }

    public static final class b extends r {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RecyclerView f101241f;

        static {
            Covode.recordClassIndex(64762);
        }

        @Override // androidx.recyclerview.widget.r
        public final int b(int i2) {
            if (i2 >= 3000) {
                i2 = 3000;
            }
            return super.b(i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecyclerView recyclerView, Context context) {
            super(context);
            this.f101241f = recyclerView;
        }
    }

    public ChatLinearLayoutManager(Context context) {
        l.d(context, "");
        this.f101240c = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i, com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        super.c(oVar, sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        l.d(recyclerView, "");
        b bVar = new b(recyclerView, recyclerView.getContext());
        bVar.f3862g = i2;
        a(bVar);
    }
}
