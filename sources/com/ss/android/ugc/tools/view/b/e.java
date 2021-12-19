package com.ss.android.ugc.tools.view.b;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.b.c;

public final class e implements RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f150039a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f150040b;

    /* renamed from: c  reason: collision with root package name */
    private c.a f150041c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f150042d;

    /* renamed from: e  reason: collision with root package name */
    private int f150043e;

    /* renamed from: f  reason: collision with root package name */
    private float f150044f;

    static {
        Covode.recordClassIndex(98780);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public e(RecyclerView recyclerView, c.a aVar) {
        this.f150040b = recyclerView;
        this.f150041c = aVar;
        this.f150043e = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        this.f150040b.a(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f150044f = motionEvent.getY();
            this.f150042d = true;
        }
        RecyclerView recyclerView2 = this.f150040b;
        if (recyclerView2 != null && this.f150039a && this.f150042d && !recyclerView2.canScrollVertically(1) && this.f150044f - motionEvent.getY() > ((float) this.f150043e)) {
            c.a aVar = this.f150041c;
            if (aVar != null) {
                aVar.a();
            }
            this.f150039a = false;
            this.f150042d = false;
        }
        return false;
    }
}
