package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AVDmtPanelRecycleView extends RecyclerView {
    public int O;
    public int P;
    public int Q;

    static {
        Covode.recordClassIndex(90723);
    }

    public AVDmtPanelRecycleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean q() {
        if (v.e(this) == 1) {
            return true;
        }
        return false;
    }

    public static final class a extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AVDmtPanelRecycleView f138683a;

        static {
            Covode.recordClassIndex(90724);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(AVDmtPanelRecycleView aVDmtPanelRecycleView) {
            this.f138683a = aVDmtPanelRecycleView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            int d2 = RecyclerView.d(view);
            if (d2 != -1) {
                if (d2 == 0) {
                    if (this.f138683a.q()) {
                        rect.right = this.f138683a.P;
                    } else {
                        rect.left = this.f138683a.P;
                    }
                }
                RecyclerView.a adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    l.b();
                }
                l.b(adapter, "");
                if (d2 == adapter.getItemCount() - 1) {
                    if (this.f138683a.q()) {
                        rect.left = this.f138683a.Q;
                    } else {
                        rect.right = this.f138683a.Q;
                    }
                } else if (this.f138683a.q()) {
                    rect.left = this.f138683a.O;
                } else {
                    rect.right = this.f138683a.O;
                }
            }
        }
    }

    public final void setSecondPanel(boolean z) {
        if (z) {
            int a2 = c.a(false, z, false, false);
            setBackground(com.ss.android.ugc.tools.view.a.a(a2, a2, 0, 0));
        }
    }

    private /* synthetic */ AVDmtPanelRecycleView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtPanelRecycleView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        Drawable a2;
        l.d(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            this.O = (int) obtainStyledAttributes.getDimension(20, 0.0f);
            this.P = (int) obtainStyledAttributes.getDimension(4, 0.0f);
            this.Q = (int) obtainStyledAttributes.getDimension(22, 0.0f);
            boolean z2 = obtainStyledAttributes.getBoolean(21, true);
            int b2 = (int) n.b(context, 2.0f);
            if (z2) {
                int i2 = this.O;
                if (i2 > 0) {
                    this.O = i2 - (b2 * 2);
                }
                int i3 = this.P;
                if (i3 > 0) {
                    this.P = i3 - b2;
                }
                int i4 = this.Q;
                if (i4 > 0) {
                    this.Q = i4 - b2;
                }
            }
            if (z && (a2 = c.f138716d.a(context, attributeSet)) != null) {
                setBackground(a2);
            }
            a(new a(this));
        }
        addOnAttachStateChangeListener(new f());
    }
}
