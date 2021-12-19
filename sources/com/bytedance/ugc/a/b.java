package com.bytedance.ugc.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ugc.glue.UGCTools;
import h.f.b.l;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final int f45834a = UGCTools.getPxByDp(5.0f);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<Integer[]> f45835b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final int f45836c;

    /* renamed from: d  reason: collision with root package name */
    final int f45837d;

    static {
        Covode.recordClassIndex(27919);
    }

    /* renamed from: com.bytedance.ugc.a.b$b  reason: collision with other inner class name */
    static final class RunnableC1128b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f45840a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewGroup f45841b;

        static {
            Covode.recordClassIndex(27921);
        }

        public final void run() {
            MethodCollector.i(807);
            int childCount = this.f45841b.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = this.f45841b.getChildAt(i2);
                if (childAt instanceof a) {
                    this.f45841b.removeView(childAt);
                    break;
                }
                i2++;
            }
            a aVar = new a(this.f45840a, this.f45841b.getContext());
            this.f45841b.addView(aVar, new ViewGroup.LayoutParams(-1, -1));
            aVar.setAlpha(0.1f);
            MethodCollector.o(807);
        }

        public RunnableC1128b(b bVar, ViewGroup viewGroup) {
            l.c(bVar, "");
            l.c(viewGroup, "");
            this.f45840a = bVar;
            this.f45841b = viewGroup;
        }
    }

    public static final class a extends View {

        /* renamed from: a  reason: collision with root package name */
        private final Paint f45838a;

        /* renamed from: b  reason: collision with root package name */
        private final b f45839b;

        static {
            Covode.recordClassIndex(27920);
        }

        public final void draw(Canvas canvas) {
            int i2;
            super.draw(canvas);
            if (c.f45842a && canvas != null) {
                for (Integer[] numArr : this.f45839b.f45835b) {
                    Paint paint = this.f45838a;
                    if (numArr[4].intValue() != 1) {
                        i2 = -65536;
                    } else {
                        i2 = -16711936;
                    }
                    paint.setColor(i2);
                    canvas.drawRect((float) numArr[0].intValue(), (float) numArr[1].intValue(), (float) numArr[2].intValue(), (float) numArr[3].intValue(), this.f45838a);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, Context context) {
            super(context);
            l.c(bVar, "");
            MethodCollector.i(830);
            this.f45839b = bVar;
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f45838a = paint;
            MethodCollector.o(830);
        }
    }

    public b(int i2, int i3) {
        this.f45836c = i2;
        this.f45837d = i3;
    }

    public final void a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            this.f45835b.add(new Integer[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)});
        }
    }
}
