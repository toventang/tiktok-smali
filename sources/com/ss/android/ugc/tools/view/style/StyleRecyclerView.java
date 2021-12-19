package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class StyleRecyclerView extends RecyclerView {
    public int O;
    public int P;
    public int Q;
    private int R;
    private boolean S;
    private RecyclerView.h T;

    static {
        Covode.recordClassIndex(98817);
    }

    public StyleRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final void q() {
        RecyclerView.h hVar = this.T;
        if (hVar != null) {
            c(hVar);
        }
        if (this.S) {
            int i2 = this.O;
            if (i2 > 0) {
                this.O = i2 - (this.R * 2);
            }
            int i3 = this.P;
            if (i3 > 0) {
                this.P = i3 - this.R;
            }
            int i4 = this.Q;
            if (i4 > 0) {
                this.Q = i4 - this.R;
            }
        }
        if (this.O != 0 || this.P != 0 || this.Q != 0) {
            a aVar = new a(this);
            b(aVar);
            this.T = aVar;
        }
    }

    public static final class a extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StyleRecyclerView f150132a;

        static {
            Covode.recordClassIndex(98818);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(StyleRecyclerView styleRecyclerView) {
            this.f150132a = styleRecyclerView;
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
                    if (r.a(this.f150132a)) {
                        rect.right = this.f150132a.P;
                    } else {
                        rect.left = this.f150132a.P;
                    }
                }
                RecyclerView.a adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    l.b();
                }
                l.b(adapter, "");
                if (d2 == adapter.getItemCount() - 1) {
                    if (r.a(this.f150132a)) {
                        rect.left = this.f150132a.Q;
                    } else {
                        rect.right = this.f150132a.Q;
                    }
                } else if (r.a(this.f150132a)) {
                    rect.left = this.f150132a.O;
                } else {
                    rect.right = this.f150132a.O;
                }
            }
        }
    }

    public final void setItemMargin(int i2) {
        this.O = i2;
        q();
    }

    public final void setItemShowBorder(boolean z) {
        this.S = z;
        q();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StyleRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.R = (int) r.a(context, 2.0f);
        this.S = true;
        GradientDrawable a2 = g.a(context, attributeSet, false);
        if (a2 != null) {
            setBackground(a2);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
            l.b(obtainStyledAttributes, "");
            this.O = (int) obtainStyledAttributes.getDimension(10, 0.0f);
            this.P = (int) obtainStyledAttributes.getDimension(6, 0.0f);
            this.Q = (int) obtainStyledAttributes.getDimension(12, 0.0f);
            this.R = (int) obtainStyledAttributes.getDimension(14, r.a(context, 2.0f));
            this.S = obtainStyledAttributes.getBoolean(11, true);
            obtainStyledAttributes.recycle();
        }
        q();
        addOnAttachStateChangeListener(new f());
    }
}
