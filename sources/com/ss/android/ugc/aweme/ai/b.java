package com.ss.android.ugc.aweme.ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends RecyclerView.h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f66333c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f66334a;

    /* renamed from: b  reason: collision with root package name */
    public int f66335b;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f66336d;

    /* renamed from: e  reason: collision with root package name */
    private int f66337e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f66338f = new Rect();

    static {
        Covode.recordClassIndex(40760);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40761);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(Drawable drawable) {
        l.d(drawable, "");
        this.f66336d = drawable;
        this.f66337e = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int height;
        int i2;
        int width;
        int i3;
        l.d(canvas, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (recyclerView.getLayoutManager() != null) {
            int i4 = 0;
            if (this.f66337e == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i3 = 0;
                }
                int i5 = i3 + this.f66334a;
                int i6 = width - this.f66335b;
                int childCount = recyclerView.getChildCount() - 1;
                while (i4 < childCount) {
                    View childAt = recyclerView.getChildAt(i4);
                    RecyclerView.a(childAt, this.f66338f);
                    int i7 = this.f66338f.bottom;
                    l.b(childAt, "");
                    int round = i7 + Math.round(childAt.getTranslationY());
                    this.f66336d.setBounds(i5, round - this.f66336d.getIntrinsicHeight(), i6, round);
                    this.f66336d.draw(canvas);
                    i4++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i2 = 0;
            }
            int i8 = i2 + this.f66334a;
            int i9 = height - this.f66335b;
            int childCount2 = recyclerView.getChildCount() - 1;
            while (i4 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i4);
                if (recyclerView.getLayoutManager() == null) {
                    l.b();
                }
                RecyclerView.a(childAt2, this.f66338f);
                int i10 = this.f66338f.right;
                l.b(childAt2, "");
                int round2 = i10 + Math.round(childAt2.getTranslationX());
                this.f66336d.setBounds(round2 - this.f66336d.getIntrinsicWidth(), i8, round2, i9);
                this.f66336d.draw(canvas);
                i4++;
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (this.f66337e == 1) {
            rect.set(0, 0, 0, this.f66336d.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f66336d.getIntrinsicWidth(), 0);
        }
    }
}
