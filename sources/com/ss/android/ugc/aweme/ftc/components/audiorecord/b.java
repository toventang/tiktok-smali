package com.ss.android.ugc.aweme.ftc.components.audiorecord;

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
    public final ImageView f97696a;

    /* renamed from: b  reason: collision with root package name */
    final a f97697b;

    /* renamed from: c  reason: collision with root package name */
    public int f97698c;

    /* renamed from: d  reason: collision with root package name */
    int f97699d;

    /* renamed from: e  reason: collision with root package name */
    int f97700e;

    /* renamed from: f  reason: collision with root package name */
    public int f97701f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f97702g = -1;

    /* renamed from: h  reason: collision with root package name */
    int f97703h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f97704i;

    /* renamed from: j  reason: collision with root package name */
    private int f97705j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f97706k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final e f97707l;

    static {
        Covode.recordClassIndex(62072);
    }

    public final Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.f97697b.getMStack());
        return stack;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.b$b  reason: collision with other inner class name */
    static final class RunnableC2356b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f97710b;

        static {
            Covode.recordClassIndex(62074);
        }

        RunnableC2356b(b bVar, float f2) {
            this.f97709a = bVar;
            this.f97710b = f2;
        }

        public final void run() {
            this.f97709a.a();
            this.f97709a.a((int) ((((float) this.f97709a.f97698c) + (((float) (this.f97709a.f97702g - this.f97709a.f97701f)) * this.f97710b)) - ((float) (this.f97709a.f97696a.getWidth() / 2))));
        }
    }

    public final void a() {
        this.f97701f = this.f97698c;
        this.f97702g = getWidth() - this.f97698c;
        this.f97705j = this.f97701f - (this.f97696a.getWidth() / 2);
        this.f97706k = this.f97702g - (this.f97696a.getWidth() / 2);
    }

    private final int c(int i2) {
        int i3 = this.f97705j;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.f97706k;
        return i2 > i4 ? i4 : i2;
    }

    public final void a(float f2) {
        post(new RunnableC2356b(this, f2));
    }

    public final Point b(int i2) {
        Point push = this.f97697b.getMStack().push(new Point(i2, i2, System.currentTimeMillis()));
        l.b(push, "");
        return push;
    }

    public final void setStack(Stack<Point> stack) {
        l.d(stack, "");
        this.f97697b.getMStack().clear();
        if (!com.bytedance.common.utility.collection.b.a((Collection) stack)) {
            this.f97697b.getMStack().addAll(stack);
        }
        this.f97697b.invalidate();
    }

    public final void a(int i2) {
        if (i2 >= 0) {
            ViewGroup.LayoutParams layoutParams = this.f97696a.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (c.a(getContext())) {
                layoutParams2.setMarginEnd(c(i2));
            } else {
                layoutParams2.leftMargin = c(i2);
            }
            this.f97696a.setLayoutParams(layoutParams2);
        }
    }

    static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f97708a;

        static {
            Covode.recordClassIndex(62073);
        }

        a(b bVar) {
            this.f97708a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 1) {
                b bVar = this.f97708a;
                l.b(view, "");
                bVar.a(view, motionEvent.getRawX(), true);
            } else if (action == 2) {
                b bVar2 = this.f97708a;
                l.b(view, "");
                bVar2.a(view, motionEvent.getRawX(), false);
            } else if (action == 3) {
                b bVar3 = this.f97708a;
                l.b(view, "");
                bVar3.a(view, motionEvent.getRawX(), true);
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, e eVar) {
        super(context);
        l.d(context, "");
        l.d(eVar, "");
        MethodCollector.i(4476);
        this.f97696a = new ImageView(context);
        this.f97697b = new a(context);
        this.f97707l = eVar;
        MethodCollector.o(4476);
    }

    public final void a(View view, float f2, boolean z) {
        if (!this.f97707l.f97722f) {
            a();
            int i2 = (int) f2;
            a(c(i2));
            float c2 = ((float) ((c(i2) + (view.getWidth() / 2)) - this.f97698c)) / ((float) (this.f97702g - this.f97701f));
            if (((double) c2) > 0.99d) {
                c2 = 1.0f;
            }
            if (((double) c2) < 0.01d) {
                c2 = 0.0f;
            }
            g gVar = this.f97704i;
            if (gVar != null) {
                gVar.a(c2, z);
            }
        }
    }
}
