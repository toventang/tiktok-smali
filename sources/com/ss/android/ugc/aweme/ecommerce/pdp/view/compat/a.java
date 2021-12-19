package com.ss.android.ugc.aweme.ecommerce.pdp.view.compat;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Iterator;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    public static final C2089a f86844d = new C2089a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f86845a;

    /* renamed from: b  reason: collision with root package name */
    public final int f86846b;

    /* renamed from: c  reason: collision with root package name */
    public final float f86847c;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f86848e;

    static {
        Covode.recordClassIndex(54412);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a$a  reason: collision with other inner class name */
    public static final class C2089a {
        static {
            Covode.recordClassIndex(54413);
        }

        private C2089a() {
        }

        public /* synthetic */ C2089a(byte b2) {
            this();
        }

        public static boolean a(View view) {
            l.d(view, "");
            if (view.getTag(R.id.ab7) != null) {
                return true;
            }
            return false;
        }

        public static void a(View view, boolean z) {
            l.d(view, "");
            if (z) {
                view.setTag(R.id.ab7, z.f158842a);
            } else {
                view.setTag(R.id.ab7, null);
            }
        }
    }

    public static final class b implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f86849a;

        static {
            Covode.recordClassIndex(54414);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f86850a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f86851b;

                static {
                    Covode.recordClassIndex(54415);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f86850a < this.f86851b.f86849a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f86851b.f86849a;
                    int i2 = this.f86850a;
                    this.f86850a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f86851b = r1;
                }
            };
        }

        public b(ViewGroup viewGroup) {
            this.f86849a = viewGroup;
        }
    }

    public a(int i2, int i3, float f2) {
        this.f86845a = i2;
        this.f86846b = i3;
        this.f86847c = f2;
        Paint paint = new Paint();
        this.f86848e = paint;
        paint.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(canvas, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.onDraw(canvas, recyclerView, sVar);
        for (View view : new b(recyclerView)) {
            if (C2089a.a(view)) {
                int left = view.getLeft();
                int right = view.getRight();
                int bottom = view.getBottom();
                int bottom2 = view.getBottom() + this.f86846b;
                float f2 = this.f86847c;
                canvas.drawRect(((float) left) + f2, (float) bottom, ((float) right) - f2, (float) bottom2, this.f86848e);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, int i3, float f2, int i4) {
        this(i2, (i4 & 2) != 0 ? 1 : i3, (i4 & 4) != 0 ? (float) h.f87571e : f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (C2089a.a(view)) {
            rect.set(0, 0, 0, this.f86846b);
        }
    }
}
