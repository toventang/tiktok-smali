package com.ss.android.ugc.aweme.friends.a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class e extends RecyclerView.h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f96764b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f96765a;

    /* renamed from: c  reason: collision with root package name */
    private int f96766c;

    /* renamed from: d  reason: collision with root package name */
    private int f96767d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f96768e;

    /* renamed from: f  reason: collision with root package name */
    private final int f96769f;

    /* renamed from: g  reason: collision with root package name */
    private final int f96770g;

    /* renamed from: h  reason: collision with root package name */
    private final int f96771h = 1;

    static {
        Covode.recordClassIndex(61404);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61405);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public e(int i2, int i3, int i4) {
        this.f96769f = i3;
        this.f96770g = i4;
        this.f96765a = new ColorDrawable(i2);
        this.f96768e = new Rect();
        this.f96767d = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int height;
        int i2;
        int width;
        int i3;
        l.d(canvas, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (recyclerView.getLayoutManager() != null) {
            int i4 = 0;
            if (this.f96767d == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i4 < childCount) {
                    View childAt = recyclerView.getChildAt(i4);
                    RecyclerView.a(childAt, this.f96768e);
                    int i5 = this.f96768e.bottom;
                    l.b(childAt, "");
                    int round = i5 + Math.round(childAt.getTranslationY());
                    this.f96765a.setBounds(this.f96769f + i3, round - this.f96771h, width - this.f96770g, round);
                    this.f96765a.draw(canvas);
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
            int childCount2 = recyclerView.getChildCount();
            while (i4 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i4);
                if (recyclerView.getLayoutManager() == null) {
                    l.b();
                }
                RecyclerView.a(childAt2, this.f96768e);
                int i6 = this.f96768e.right;
                l.b(childAt2, "");
                int round2 = i6 + Math.round(childAt2.getTranslationX());
                this.f96765a.setBounds(round2 - this.f96765a.getIntrinsicWidth(), i2, round2, height);
                this.f96765a.draw(canvas);
                i4++;
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (this.f96767d == 1) {
            rect.set(0, 0, 0, this.f96766c);
        } else {
            rect.set(0, 0, this.f96771h, 0);
        }
    }
}
