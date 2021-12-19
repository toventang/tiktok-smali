package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SpeedyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static final a f126199a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private r f126200b;

    static {
        Covode.recordClassIndex(82855);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82856);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends r {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RecyclerView f126201f;

        static {
            Covode.recordClassIndex(82857);
        }

        @Override // androidx.recyclerview.widget.r
        public final int b() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.r
        public final float a(DisplayMetrics displayMetrics) {
            l.d(displayMetrics, "");
            return 440.0f / ((float) displayMetrics.densityDpi);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecyclerView recyclerView, Context context) {
            super(context);
            this.f126201f = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
        public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
            l.d(view, "");
            l.d(sVar, "");
            l.d(aVar, "");
            int b2 = b(view, -1);
            int b3 = b(b2);
            if (b3 > 0) {
                aVar.a(-b2, 0, b3, this.f4199a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpeedyLinearLayoutManager(Context context) {
        super(0, false);
        l.d(context, "");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        l.d(recyclerView, "");
        if (this.f126200b == null) {
            this.f126200b = new b(recyclerView, recyclerView.getContext());
        }
        r rVar = this.f126200b;
        if (rVar == null) {
            l.b();
        }
        rVar.f3862g = i2;
        a(this.f126200b);
    }
}
