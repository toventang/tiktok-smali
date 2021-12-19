package com.bytedance.jedi.ext.adapter.a.a;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicBoolean;

public final class q implements RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    public final r f39641a = new r((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f39642b;

    /* renamed from: c  reason: collision with root package name */
    private float f39643c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39644d;

    /* renamed from: e  reason: collision with root package name */
    private int f39645e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39646f = true;

    /* renamed from: g  reason: collision with root package name */
    private AtomicBoolean f39647g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private final o f39648h;

    static {
        Covode.recordClassIndex(24403);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        l.c(recyclerView, "");
        l.c(motionEvent, "");
    }

    public q(o oVar) {
        l.c(oVar, "");
        this.f39648h = oVar;
    }

    public final void b(RecyclerView recyclerView) {
        if (!this.f39647g.get()) {
            recyclerView.a(this);
            this.f39647g.set(true);
        }
    }

    public final void c(RecyclerView recyclerView) {
        if (this.f39647g.get()) {
            recyclerView.b(this);
            this.f39647g.set(false);
        }
    }

    public final void a(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        this.f39641a.a(recyclerView);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
        l.a((Object) viewConfiguration, "");
        this.f39645e = viewConfiguration.getScaledTouchSlop();
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        boolean z = false;
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).f3778j == 1) {
                z = true;
            }
            this.f39646f = z;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).f3900e == 1) {
                z = true;
            }
            this.f39646f = z;
        }
        if (this.f39648h.f39636h == 243 || this.f39648h.f39636h == 244) {
            b(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean canScrollHorizontally;
        l.c(recyclerView, "");
        l.c(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            this.f39643c = motionEvent.getY();
            this.f39644d = true;
        }
        RecyclerView recyclerView2 = this.f39641a.f39649a;
        if (recyclerView2 != null && this.f39642b && this.f39644d && this.f39643c - motionEvent.getY() > ((float) this.f39645e)) {
            if (this.f39646f) {
                canScrollHorizontally = recyclerView2.canScrollVertically(1);
            } else {
                canScrollHorizontally = recyclerView2.canScrollHorizontally(1);
            }
            if (!canScrollHorizontally) {
                o oVar = this.f39648h;
                if (oVar.f()) {
                    oVar.c(244);
                } else {
                    oVar.c(241);
                }
                this.f39642b = false;
                this.f39644d = false;
            }
        }
        return false;
    }
}
