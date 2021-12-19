package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.cut.m;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c;
import h.f.b.l;

public final class f extends n.a {

    /* renamed from: a  reason: collision with root package name */
    public final c f129462a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f129463b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f129464c;

    static {
        Covode.recordClassIndex(84986);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void a(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
    }

    public f(c cVar) {
        l.d(cVar, "");
        this.f129462a = cVar;
    }

    @Override // androidx.recyclerview.widget.n.a
    public final int a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        return n.a.b(15, 0);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (!(i2 == 0 || viewHolder == null)) {
            m.a(i.f115645a, 100);
            c cVar = this.f129462a;
            l.d(viewHolder, "");
            c.b bVar = (c.b) viewHolder;
            if (bVar.f129453f != null) {
                bVar.f129453f.setScaleX(1.0f);
                bVar.f129453f.setScaleY(1.0f);
            }
            cVar.f129445d = viewHolder.getAdapterPosition();
        }
        super.a(viewHolder, i2);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        c cVar = this.f129462a;
        l.d(viewHolder, "");
        if (cVar.f129445d != -1) {
            c.b bVar = (c.b) viewHolder;
            if (bVar.f129453f != null) {
                bVar.f129453f.setScaleY(1.0f);
                bVar.f129453f.setScaleX(1.0f);
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            if (!(adapterPosition == cVar.f129445d || cVar.f129447f == null)) {
                e eVar = cVar.f129447f;
                if (eVar == null) {
                    l.b();
                }
                eVar.a(cVar.f129445d, adapterPosition);
            }
            cVar.f129445d = -1;
        }
        super.d(recyclerView, viewHolder);
        this.f129463b = false;
    }

    @Override // androidx.recyclerview.widget.n.a
    public final boolean b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        l.d(viewHolder2, "");
        m.a(i.f115645a, 50);
        this.f129462a.a(viewHolder, viewHolder2);
        this.f129463b = true;
        return true;
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        float f4 = f3;
        l.d(canvas, "");
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        View view = viewHolder.itemView;
        l.b(view, "");
        double height = (double) view.getHeight();
        Double.isNaN(height);
        double d2 = (height * 0.25d) / 2.0d;
        View view2 = viewHolder.itemView;
        l.b(view2, "");
        double top = (double) view2.getTop();
        Double.isNaN(top);
        double d3 = (double) f4;
        Double.isNaN(d3);
        double d4 = (top - d2) + d3;
        View view3 = viewHolder.itemView;
        l.b(view3, "");
        double height2 = (double) (((float) view3.getHeight()) * 1.25f);
        Double.isNaN(height2);
        double d5 = height2 + d4;
        if (d4 < 0.0d) {
            View view4 = viewHolder.itemView;
            l.b(view4, "");
            double top2 = (double) view4.getTop();
            Double.isNaN(top2);
            f4 = -((float) (top2 - d2));
        } else if (d5 > ((double) recyclerView.getHeight())) {
            double bottom = (double) recyclerView.getBottom();
            double bottom2 = (double) view.getBottom();
            Double.isNaN(bottom2);
            Double.isNaN(bottom);
            f4 = (float) (bottom - (bottom2 + d2));
        }
        if (i2 != 2 || z) {
            super.a(canvas, recyclerView, viewHolder, f2, f4, i2, z);
            this.f129464c = true;
        } else if (this.f129464c) {
            this.f129464c = false;
            l.d(viewHolder, "");
            ViewPropertyAnimator scaleY = viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f);
            l.b(scaleY, "");
            scaleY.translationX(0.0f).translationY(0.0f).setDuration(a(recyclerView, 8)).start();
        }
    }
}
