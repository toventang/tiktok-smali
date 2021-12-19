package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class k extends RecyclerView.h {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f4114b = {16843284};

    /* renamed from: a  reason: collision with root package name */
    public Drawable f4115a;

    /* renamed from: c  reason: collision with root package name */
    private int f4116c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f4117d = new Rect();

    static {
        Covode.recordClassIndex(1593);
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            this.f4115a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public k(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4114b);
        this.f4115a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f4116c = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int height;
        int i2;
        int width;
        int i3;
        if (recyclerView.getLayoutManager() != null && this.f4115a != null) {
            int i4 = 0;
            if (this.f4116c == 1) {
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
                    RecyclerView.a(childAt, this.f4117d);
                    int round = this.f4117d.bottom + Math.round(childAt.getTranslationY());
                    this.f4115a.setBounds(i3, round - this.f4115a.getIntrinsicHeight(), width, round);
                    this.f4115a.draw(canvas);
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
                RecyclerView.a(childAt2, this.f4117d);
                int round2 = this.f4117d.right + Math.round(childAt2.getTranslationX());
                this.f4115a.setBounds(round2 - this.f4115a.getIntrinsicWidth(), i2, round2, height);
                this.f4115a.draw(canvas);
                i4++;
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        Drawable drawable = this.f4115a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f4116c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
