package com.ss.android.ugc.aweme.common.a;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.h;

public final class k implements RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f76379a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f76380b;

    /* renamed from: c  reason: collision with root package name */
    private h.a f76381c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f76382d;

    /* renamed from: e  reason: collision with root package name */
    private int f76383e;

    /* renamed from: f  reason: collision with root package name */
    private float f76384f;

    static {
        Covode.recordClassIndex(47135);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public k(RecyclerView recyclerView, h.a aVar) {
        this.f76380b = recyclerView;
        this.f76381c = aVar;
        this.f76383e = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        this.f76380b.a(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f76384f = motionEvent.getY();
            this.f76382d = true;
        }
        RecyclerView recyclerView2 = this.f76380b;
        if (recyclerView2 != null && this.f76379a && this.f76382d && !recyclerView2.canScrollVertically(1) && this.f76384f - motionEvent.getY() > ((float) this.f76383e)) {
            h.a aVar = this.f76381c;
            if (aVar != null) {
                aVar.l();
            }
            this.f76379a = false;
            this.f76382d = false;
        }
        return false;
    }
}
