package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.tools.c;
import h.f.b.l;
import java.util.Collection;
import java.util.Objects;
import java.util.Stack;

public final class b extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f126870a;

    /* renamed from: b  reason: collision with root package name */
    final a f126871b;

    /* renamed from: c  reason: collision with root package name */
    public int f126872c;

    /* renamed from: d  reason: collision with root package name */
    int f126873d;

    /* renamed from: e  reason: collision with root package name */
    int f126874e;

    /* renamed from: f  reason: collision with root package name */
    public int f126875f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f126876g = -1;

    /* renamed from: h  reason: collision with root package name */
    int f126877h = 1;

    /* renamed from: i  reason: collision with root package name */
    i f126878i;

    /* renamed from: j  reason: collision with root package name */
    private int f126879j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f126880k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final int f126881l = 50;

    /* renamed from: m  reason: collision with root package name */
    private final g f126882m;

    static {
        Covode.recordClassIndex(83234);
    }

    public final Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.f126871b.getMStack());
        return stack;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b$b  reason: collision with other inner class name */
    static final class RunnableC3295b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f126884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f126885b;

        static {
            Covode.recordClassIndex(83236);
        }

        RunnableC3295b(b bVar, float f2) {
            this.f126884a = bVar;
            this.f126885b = f2;
        }

        public final void run() {
            this.f126884a.a();
            this.f126884a.a((int) ((((float) this.f126884a.f126872c) + (((float) (this.f126884a.f126876g - this.f126884a.f126875f)) * this.f126885b)) - ((float) (this.f126884a.f126870a.getWidth() / 2))));
        }
    }

    public final void a() {
        this.f126875f = this.f126872c;
        this.f126876g = getWidth() - this.f126872c;
        this.f126879j = this.f126875f - (this.f126870a.getWidth() / 2);
        this.f126880k = this.f126876g - (this.f126870a.getWidth() / 2);
    }

    public static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f126883a;

        static {
            Covode.recordClassIndex(83235);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f126883a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.d(view, "");
            l.d(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 1) {
                this.f126883a.a(view, motionEvent.getRawX(), true);
            } else if (action == 2) {
                this.f126883a.a(view, motionEvent.getRawX(), false);
            } else if (action == 3) {
                this.f126883a.a(view, motionEvent.getRawX(), true);
            }
            return true;
        }
    }

    private final int c(int i2) {
        int i3 = this.f126879j;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.f126880k;
        return i2 > i4 ? i4 : i2;
    }

    public final void a(float f2) {
        post(new RunnableC3295b(this, f2));
    }

    public final Point b(int i2) {
        Point push = this.f126871b.getMStack().push(new Point(i2, i2, System.currentTimeMillis()));
        l.b(push, "");
        return push;
    }

    public final void setStack(Stack<Point> stack) {
        l.d(stack, "");
        this.f126871b.getMStack().clear();
        if (!com.bytedance.common.utility.collection.b.a((Collection) stack)) {
            this.f126871b.getMStack().addAll(stack);
        }
        this.f126871b.invalidate();
    }

    public final void a(int i2) {
        if (i2 >= 0) {
            ViewGroup.LayoutParams layoutParams = this.f126870a.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (c.a(getContext())) {
                layoutParams2.setMarginEnd(c(i2));
            } else {
                layoutParams2.leftMargin = c(i2);
            }
            this.f126870a.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, g gVar) {
        super(context);
        l.d(context, "");
        l.d(gVar, "");
        MethodCollector.i(5115);
        this.f126870a = new ImageView(context);
        this.f126871b = new a(context);
        this.f126882m = gVar;
        MethodCollector.o(5115);
    }

    public final void a(View view, float f2, boolean z) {
        if (!this.f126882m.f126902f) {
            a();
            int i2 = (int) f2;
            a(c(i2));
            float c2 = ((float) ((c(i2) + (view.getWidth() / 2)) - this.f126872c)) / ((float) (this.f126876g - this.f126875f));
            if (((double) c2) > 0.99d) {
                c2 = 1.0f;
            }
            if (((double) c2) < 0.01d) {
                c2 = 0.0f;
            }
            i iVar = this.f126878i;
            if (iVar != null) {
                iVar.a(c2, z);
            }
        }
    }
}
