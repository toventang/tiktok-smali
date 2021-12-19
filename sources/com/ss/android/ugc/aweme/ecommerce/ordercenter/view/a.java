package com.ss.android.ugc.aweme.ecommerce.ordercenter.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public static final C2078a f86252a = new C2078a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Rect f86253b;

    /* renamed from: c  reason: collision with root package name */
    private final int f86254c = 1;

    /* renamed from: d  reason: collision with root package name */
    private final Drawable f86255d;

    static {
        Covode.recordClassIndex(53989);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.view.a$a  reason: collision with other inner class name */
    public static final class C2078a {
        static {
            Covode.recordClassIndex(53990);
        }

        private C2078a() {
        }

        public /* synthetic */ C2078a(byte b2) {
            this();
        }
    }

    public a(Drawable drawable) {
        l.d(drawable, "");
        this.f86255d = drawable;
        this.f86253b = new Rect();
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
            if (this.f86254c == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount() - 1;
                while (i4 < childCount) {
                    View childAt = recyclerView.getChildAt(i4);
                    RecyclerView.a(childAt, this.f86253b);
                    int i5 = this.f86253b.bottom;
                    l.b(childAt, "");
                    int a2 = i5 + h.g.a.a(childAt.getTranslationY());
                    this.f86255d.setBounds(i3, a2 - this.f86255d.getIntrinsicHeight(), width, a2);
                    this.f86255d.draw(canvas);
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
            int childCount2 = recyclerView.getChildCount() - 1;
            while (i4 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i4);
                if (recyclerView.getLayoutManager() == null) {
                    l.b();
                }
                RecyclerView.a(childAt2, this.f86253b);
                int i6 = this.f86253b.right;
                l.b(childAt2, "");
                int a3 = i6 + h.g.a.a(childAt2.getTranslationX());
                this.f86255d.setBounds(a3 - this.f86255d.getIntrinsicWidth(), i2, a3, height);
                this.f86255d.draw(canvas);
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
        if (this.f86254c == 1) {
            rect.set(0, 0, 0, this.f86255d.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f86255d.getIntrinsicWidth(), 0);
        }
    }
}
