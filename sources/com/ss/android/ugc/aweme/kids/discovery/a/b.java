package com.ss.android.ugc.aweme.kids.discovery.a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class b extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f106380a = {16843284};

    /* renamed from: b  reason: collision with root package name */
    private Drawable f106381b;

    /* renamed from: c  reason: collision with root package name */
    private int f106382c;

    /* renamed from: d  reason: collision with root package name */
    private final int f106383d;

    /* renamed from: e  reason: collision with root package name */
    private final int f106384e;

    /* renamed from: f  reason: collision with root package name */
    private final int f106385f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f106386g;

    static {
        Covode.recordClassIndex(67989);
    }

    public b(int i2, int i3) {
        this(i2, i3, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int height;
        int i2;
        int width;
        int i3;
        if (recyclerView.getLayoutManager() != null && this.f106381b != null) {
            int i4 = 0;
            if (this.f106382c == 1) {
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
                    RecyclerView.a(childAt, this.f106386g);
                    int round = this.f106386g.bottom + Math.round(childAt.getTranslationY());
                    this.f106381b.setBounds(this.f106384e + i3, round - this.f106383d, width - this.f106385f, round);
                    this.f106381b.draw(canvas);
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
                recyclerView.getLayoutManager();
                RecyclerView.a(childAt2, this.f106386g);
                int round2 = this.f106386g.right + Math.round(childAt2.getTranslationX());
                this.f106381b.setBounds(round2 - this.f106383d, this.f106384e + i2, round2, height - this.f106385f);
                this.f106381b.draw(canvas);
                i4++;
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        if (this.f106381b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f106382c == 1) {
            rect.set(0, 0, 0, this.f106383d);
        } else {
            rect.set(0, 0, this.f106383d, 0);
        }
    }

    public b(int i2, int i3, int i4, int i5, int i6) {
        this.f106386g = new Rect();
        this.f106381b = new ColorDrawable(i2);
        this.f106383d = i3;
        this.f106384e = i5;
        this.f106385f = i6;
        this.f106382c = i4;
    }
}
