package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class n extends RecyclerView.h implements RecyclerView.k {
    private List<Integer> A;
    private RecyclerView.d B = null;
    private b C;
    private final RecyclerView.m D = new RecyclerView.m() {
        /* class androidx.recyclerview.widget.n.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1605);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void a(boolean z) {
            if (z) {
                n.this.a((RecyclerView.ViewHolder) null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            n.this.r.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                n.this.f4159i = motionEvent.getPointerId(0);
                n.this.f4153c = motionEvent.getX();
                n.this.f4154d = motionEvent.getY();
                n.this.a();
                if (n.this.f4152b == null) {
                    n nVar = n.this;
                    if (!nVar.f4162l.isEmpty()) {
                        View a2 = nVar.a(motionEvent);
                        int size = nVar.f4162l.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            c cVar = nVar.f4162l.get(size);
                            if (cVar.f4182h.itemView == a2) {
                                n.this.f4153c -= cVar.f4187m;
                                n.this.f4154d -= cVar.n;
                                n.this.a(cVar.f4182h, true);
                                if (n.this.f4151a.remove(cVar.f4182h.itemView)) {
                                    n.this.f4160j.d(n.this.f4163m, cVar.f4182h);
                                }
                                n.this.a(cVar.f4182h, cVar.f4183i);
                                n nVar2 = n.this;
                                nVar2.a(motionEvent, nVar2.f4161k, 0);
                            } else {
                                size--;
                            }
                        }
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                n.this.f4159i = -1;
                n.this.a((RecyclerView.ViewHolder) null, 0);
            } else if (n.this.f4159i != -1 && (findPointerIndex = motionEvent.findPointerIndex(n.this.f4159i)) >= 0) {
                n.this.a(actionMasked, motionEvent, findPointerIndex);
            }
            if (n.this.o != null) {
                n.this.o.addMovement(motionEvent);
            }
            if (n.this.f4152b != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
            n.this.r.a(motionEvent);
            if (n.this.o != null) {
                n.this.o.addMovement(motionEvent);
            }
            if (n.this.f4159i != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(n.this.f4159i);
                if (findPointerIndex >= 0) {
                    n.this.a(actionMasked, motionEvent, findPointerIndex);
                }
                RecyclerView.ViewHolder viewHolder = n.this.f4152b;
                if (viewHolder != null) {
                    int i2 = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == n.this.f4159i) {
                                        if (actionIndex == 0) {
                                            i2 = 1;
                                        }
                                        n.this.f4159i = motionEvent.getPointerId(i2);
                                        n nVar = n.this;
                                        nVar.a(motionEvent, nVar.f4161k, actionIndex);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (n.this.o != null) {
                                n.this.o.clear();
                            }
                        } else if (findPointerIndex >= 0) {
                            n nVar2 = n.this;
                            nVar2.a(motionEvent, nVar2.f4161k, findPointerIndex);
                            n.this.a(viewHolder);
                            n.this.f4163m.removeCallbacks(n.this.n);
                            n.this.n.run();
                            n.this.f4163m.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    n.this.a((RecyclerView.ViewHolder) null, 0);
                    n.this.f4159i = -1;
                }
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final List<View> f4151a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    RecyclerView.ViewHolder f4152b = null;

    /* renamed from: c  reason: collision with root package name */
    float f4153c;

    /* renamed from: d  reason: collision with root package name */
    float f4154d;

    /* renamed from: e  reason: collision with root package name */
    float f4155e;

    /* renamed from: f  reason: collision with root package name */
    float f4156f;

    /* renamed from: g  reason: collision with root package name */
    float f4157g;

    /* renamed from: h  reason: collision with root package name */
    float f4158h;

    /* renamed from: i  reason: collision with root package name */
    int f4159i = -1;

    /* renamed from: j  reason: collision with root package name */
    a f4160j;

    /* renamed from: k  reason: collision with root package name */
    int f4161k;

    /* renamed from: l  reason: collision with root package name */
    List<c> f4162l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    RecyclerView f4163m;
    final Runnable n = new Runnable() {
        /* class androidx.recyclerview.widget.n.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1604);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
            if (r4 < 0) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
            if (r4 > 0) goto L_0x007a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 317
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n.AnonymousClass1.run():void");
        }
    };
    VelocityTracker o;
    View p = null;
    int q = -1;
    androidx.core.h.d r;
    Rect s;
    long t;
    private final float[] u = new float[2];
    private float v;
    private float w;
    private int x = 0;
    private int y;
    private List<RecyclerView.ViewHolder> z;

    public interface d {
        static {
            Covode.recordClassIndex(1615);
        }

        void a(View view, View view2);
    }

    static {
        Covode.recordClassIndex(1603);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void a(View view) {
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4163m;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.c(this);
                this.f4163m.b(this.D);
                this.f4163m.b((RecyclerView.k) this);
                for (int size = this.f4162l.size() - 1; size >= 0; size--) {
                    c cVar = this.f4162l.get(0);
                    cVar.f4184j.cancel();
                    this.f4160j.d(this.f4163m, cVar.f4182h);
                }
                this.f4162l.clear();
                this.p = null;
                this.q = -1;
                b();
                b bVar = this.C;
                if (bVar != null) {
                    bVar.f4176a = false;
                    this.C = null;
                }
                if (this.r != null) {
                    this.r = null;
                }
            }
            this.f4163m = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.v = resources.getDimension(R.dimen.mz);
                this.w = resources.getDimension(R.dimen.my);
                this.y = ViewConfiguration.get(this.f4163m.getContext()).getScaledTouchSlop();
                this.f4163m.a((RecyclerView.h) this);
                this.f4163m.a(this.D);
                this.f4163m.a((RecyclerView.k) this);
                this.C = new b();
                this.r = new androidx.core.h.d(this.f4163m.getContext(), this.C);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017c, code lost:
        if (r1 > 0) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r25, int r26) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView.ViewHolder viewHolder) {
        if (!this.f4163m.isLayoutRequested() && this.x == 2) {
            int i2 = (int) (this.f4157g + this.f4155e);
            int i3 = (int) (this.f4158h + this.f4156f);
            if (((float) Math.abs(i3 - viewHolder.itemView.getTop())) >= ((float) viewHolder.itemView.getHeight()) * 0.5f || ((float) Math.abs(i2 - viewHolder.itemView.getLeft())) >= ((float) viewHolder.itemView.getWidth()) * 0.5f) {
                List<RecyclerView.ViewHolder> list = this.z;
                if (list == null) {
                    this.z = new ArrayList();
                    this.A = new ArrayList();
                } else {
                    list.clear();
                    this.A.clear();
                }
                int round = Math.round(this.f4157g + this.f4155e) - 0;
                int round2 = Math.round(this.f4158h + this.f4156f) - 0;
                int width = viewHolder.itemView.getWidth() + round + 0;
                int height = viewHolder.itemView.getHeight() + round2 + 0;
                int i4 = (round + width) / 2;
                int i5 = (round2 + height) / 2;
                RecyclerView.i layoutManager = this.f4163m.getLayoutManager();
                int s2 = layoutManager.s();
                for (int i6 = 0; i6 < s2; i6++) {
                    View g2 = layoutManager.g(i6);
                    if (g2 != viewHolder.itemView && g2.getBottom() >= round2 && g2.getTop() <= height && g2.getRight() >= round && g2.getLeft() <= width) {
                        RecyclerView.ViewHolder a2 = this.f4163m.a(g2);
                        if (this.f4160j.a(this.f4163m, this.f4152b, a2)) {
                            int abs = Math.abs(i4 - ((g2.getLeft() + g2.getRight()) / 2));
                            int abs2 = Math.abs(i5 - ((g2.getTop() + g2.getBottom()) / 2));
                            int i7 = (abs * abs) + (abs2 * abs2);
                            int size = this.z.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i9 < size && i7 > this.A.get(i9).intValue()) {
                                i8++;
                                i9++;
                            }
                            this.z.add(i8, a2);
                            this.A.add(i8, Integer.valueOf(i7));
                        }
                    }
                }
                List<RecyclerView.ViewHolder> list2 = this.z;
                if (list2.size() != 0) {
                    RecyclerView.ViewHolder a3 = a.a(viewHolder, list2, i2, i3);
                    if (a3 == null) {
                        this.z.clear();
                        this.A.clear();
                        return;
                    }
                    int absoluteAdapterPosition = a3.getAbsoluteAdapterPosition();
                    viewHolder.getAbsoluteAdapterPosition();
                    if (this.f4160j.b(this.f4163m, viewHolder, a3)) {
                        RecyclerView recyclerView = this.f4163m;
                        RecyclerView.i layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof d) {
                            ((d) layoutManager2).a(viewHolder.itemView, a3.itemView);
                            return;
                        }
                        if (layoutManager2.f()) {
                            if (RecyclerView.i.o(a3.itemView) <= recyclerView.getPaddingLeft()) {
                                recyclerView.b(absoluteAdapterPosition);
                            }
                            if (RecyclerView.i.q(a3.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.b(absoluteAdapterPosition);
                            }
                        }
                        if (layoutManager2.g()) {
                            if (RecyclerView.i.p(a3.itemView) <= recyclerView.getPaddingTop()) {
                                recyclerView.b(absoluteAdapterPosition);
                            }
                            if (RecyclerView.i.r(a3.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.b(absoluteAdapterPosition);
                            }
                        }
                    }
                }
            }
        }
    }

    private void b() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Interpolator f4173a = new Interpolator() {
            /* class androidx.recyclerview.widget.n.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1610);
            }

            public final float getInterpolation(float f2) {
                return f2 * f2 * f2 * f2 * f2;
            }
        };

        /* renamed from: b  reason: collision with root package name */
        private static final Interpolator f4174b = new Interpolator() {
            /* class androidx.recyclerview.widget.n.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1611);
            }

            public final float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        };

        /* renamed from: c  reason: collision with root package name */
        private int f4175c = -1;

        public static int a(int i2, int i3) {
            int i4;
            int i5 = i2 & 789516;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (i5 ^ -1);
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= -789517 & i7;
                i4 = (i7 & 789516) << 2;
            }
            return i6 | i4;
        }

        public static int b(int i2, int i3) {
            return (i2 << 16) | (i3 << 8) | ((i3 | i2) << 0);
        }

        public static int c(int i2, int i3) {
            int i4;
            int i5 = i2 & 3158064;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (i5 ^ -1);
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= -3158065 & i7;
                i4 = (i7 & 3158064) >> 2;
            }
            return i6 | i4;
        }

        public abstract int a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        public abstract void a(RecyclerView.ViewHolder viewHolder);

        public void a(RecyclerView.ViewHolder viewHolder, int i2) {
        }

        public boolean a() {
            return true;
        }

        public boolean a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public boolean b() {
            return true;
        }

        public abstract boolean b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        static {
            Covode.recordClassIndex(1609);
        }

        private int a(RecyclerView recyclerView) {
            if (this.f4175c == -1) {
                this.f4175c = recyclerView.getResources().getDimensionPixelSize(R.dimen.mx);
            }
            return this.f4175c;
        }

        public void d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            p.f4189a.a(viewHolder.itemView);
        }

        /* access modifiers changed from: package-private */
        public final boolean c(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((b(recyclerView, viewHolder) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final int b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return c(a(recyclerView, viewHolder), v.e(recyclerView));
        }

        public static long a(RecyclerView recyclerView, int i2) {
            RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i2 == 8) {
                    return 200;
                }
                return 250;
            } else if (i2 == 8) {
                return itemAnimator.f3832k;
            } else {
                return itemAnimator.f3831j;
            }
        }

        public static RecyclerView.ViewHolder a(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i2, int i3) {
            int left;
            int abs;
            int bottom;
            int abs2;
            int abs3;
            int abs4;
            int width = viewHolder.itemView.getWidth() + i2;
            int height = viewHolder.itemView.getHeight() + i3;
            int left2 = i2 - viewHolder.itemView.getLeft();
            int top = i3 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i4 = -1;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i5);
                if (left2 > 0) {
                    int right = viewHolder3.itemView.getRight() - width;
                    if (right < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i4) {
                        viewHolder2 = viewHolder3;
                        i4 = abs4;
                    }
                } else if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i2) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs = Math.abs(left)) > i4) {
                    viewHolder2 = viewHolder3;
                    i4 = abs;
                }
                if (top < 0) {
                    int top2 = viewHolder3.itemView.getTop() - i3;
                    if (top2 > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs3 = Math.abs(top2)) > i4) {
                        viewHolder2 = viewHolder3;
                        i4 = abs3;
                    }
                } else if (top > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs2 = Math.abs(bottom)) > i4) {
                    viewHolder2 = viewHolder3;
                    i4 = abs2;
                }
            }
            return viewHolder2;
        }

        public final int a(RecyclerView recyclerView, int i2, int i3, long j2) {
            int a2 = a(recyclerView);
            int abs = Math.abs(i3);
            float f2 = (float) abs;
            float f3 = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i3)) * a2)) * f4174b.getInterpolation(Math.min(1.0f, (f2 * 1.0f) / ((float) i2))));
            if (j2 <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                f3 = ((float) j2) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f4173a.getInterpolation(f3));
            if (interpolation != 0) {
                return interpolation;
            }
            if (i3 > 0) {
                return 1;
            }
            return -1;
        }

        public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
            p.f4189a.a(recyclerView, viewHolder.itemView, f2, f3, z);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Animator.AnimatorListener {

        /* renamed from: d  reason: collision with root package name */
        final float f4178d;

        /* renamed from: e  reason: collision with root package name */
        final float f4179e;

        /* renamed from: f  reason: collision with root package name */
        final float f4180f;

        /* renamed from: g  reason: collision with root package name */
        final float f4181g;

        /* renamed from: h  reason: collision with root package name */
        final RecyclerView.ViewHolder f4182h;

        /* renamed from: i  reason: collision with root package name */
        final int f4183i;

        /* renamed from: j  reason: collision with root package name */
        final ValueAnimator f4184j;

        /* renamed from: k  reason: collision with root package name */
        final int f4185k;

        /* renamed from: l  reason: collision with root package name */
        boolean f4186l;

        /* renamed from: m  reason: collision with root package name */
        float f4187m;
        float n;
        boolean o;
        boolean p;
        public float q = 0.0f;

        static {
            Covode.recordClassIndex(1613);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationCancel(Animator animator) {
            this.q = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.p) {
                this.f4182h.setIsRecyclable(true);
            }
            this.p = true;
        }

        c(RecyclerView.ViewHolder viewHolder, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f4183i = i3;
            this.f4185k = i2;
            this.f4182h = viewHolder;
            this.f4178d = f2;
            this.f4179e = f3;
            this.f4180f = f4;
            this.f4181g = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4184j = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class androidx.recyclerview.widget.n.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1614);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c.this.q = valueAnimator.getAnimatedFraction();
                }
            });
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f4176a = true;

        static {
            Covode.recordClassIndex(1612);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        b() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            View a2;
            RecyclerView.ViewHolder a3;
            if (this.f4176a && (a2 = n.this.a(motionEvent)) != null && (a3 = n.this.f4163m.a(a2)) != null && n.this.f4160j.c(n.this.f4163m, a3) && motionEvent.getPointerId(0) == n.this.f4159i) {
                int findPointerIndex = motionEvent.findPointerIndex(n.this.f4159i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                n.this.f4153c = x;
                n.this.f4154d = y;
                n nVar = n.this;
                nVar.f4156f = 0.0f;
                nVar.f4155e = 0.0f;
                if (n.this.f4160j.a()) {
                    n.this.a(a3, 2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(View view) {
        if (view == this.p) {
            this.p = null;
            if (this.B != null) {
                this.f4163m.setChildDrawingOrderCallback(null);
            }
        }
    }

    public n(a aVar) {
        this.f4160j = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void b(View view) {
        c(view);
        RecyclerView.ViewHolder a2 = this.f4163m.a(view);
        if (a2 != null) {
            RecyclerView.ViewHolder viewHolder = this.f4152b;
            if (viewHolder == null || a2 != viewHolder) {
                a(a2, false);
                if (this.f4151a.remove(a2.itemView)) {
                    this.f4160j.d(this.f4163m, a2);
                    return;
                }
                return;
            }
            a((RecyclerView.ViewHolder) null, 0);
        }
    }

    private int a(int i2) {
        int i3;
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i4 = 8;
        if (this.f4155e > 0.0f) {
            i3 = 8;
        } else {
            i3 = 4;
        }
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null && this.f4159i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.w);
            float xVelocity = this.o.getXVelocity(this.f4159i);
            float yVelocity = this.o.getYVelocity(this.f4159i);
            if (xVelocity <= 0.0f) {
                i4 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i4 & i2) != 0 && i3 == i4 && abs >= this.v && abs > Math.abs(yVelocity)) {
                return i4;
            }
        }
        float width = ((float) this.f4163m.getWidth()) * 0.5f;
        if ((i2 & i3) == 0 || Math.abs(this.f4155e) <= width) {
            return 0;
        }
        return i3;
    }

    private int b(int i2) {
        int i3;
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i4 = 2;
        if (this.f4156f > 0.0f) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null && this.f4159i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.w);
            float xVelocity = this.o.getXVelocity(this.f4159i);
            float yVelocity = this.o.getYVelocity(this.f4159i);
            if (yVelocity <= 0.0f) {
                i4 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i4 & i2) != 0 && i4 == i3 && abs >= this.v && abs > Math.abs(xVelocity)) {
                return i4;
            }
        }
        float height = ((float) this.f4163m.getHeight()) * 0.5f;
        if ((i2 & i3) == 0 || Math.abs(this.f4156f) <= height) {
            return 0;
        }
        return i3;
    }

    private void a(float[] fArr) {
        if ((this.f4161k & 12) != 0) {
            fArr[0] = (this.f4157g + this.f4155e) - ((float) this.f4152b.itemView.getLeft());
        } else {
            fArr[0] = this.f4152b.itemView.getTranslationX();
        }
        if ((this.f4161k & 3) != 0) {
            fArr[1] = (this.f4158h + this.f4156f) - ((float) this.f4152b.itemView.getTop());
        } else {
            fArr[1] = this.f4152b.itemView.getTranslationY();
        }
    }

    public final void b(RecyclerView.ViewHolder viewHolder) {
        if (this.f4160j.c(this.f4163m, viewHolder) && viewHolder.itemView.getParent() == this.f4163m) {
            a();
            this.f4156f = 0.0f;
            this.f4155e = 0.0f;
            a(viewHolder, 2);
        }
    }

    /* access modifiers changed from: package-private */
    public final View a(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.f4152b;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (a(view, x2, y2, this.f4157g + this.f4155e, this.f4158h + this.f4156f)) {
                return view;
            }
        }
        for (int size = this.f4162l.size() - 1; size >= 0; size--) {
            c cVar = this.f4162l.get(size);
            View view2 = cVar.f4182h.itemView;
            if (a(view2, x2, y2, cVar.f4187m, cVar.n)) {
                return view2;
            }
        }
        return this.f4163m.a(x2, y2);
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView.ViewHolder viewHolder, boolean z2) {
        for (int size = this.f4162l.size() - 1; size >= 0; size--) {
            c cVar = this.f4162l.get(size);
            if (cVar.f4182h == viewHolder) {
                cVar.o |= z2;
                if (!cVar.p) {
                    cVar.f4184j.cancel();
                }
                this.f4162l.remove(size);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        if (this.f4152b != null) {
            a(this.u);
        }
        RecyclerView.ViewHolder viewHolder = this.f4152b;
        List<c> list = this.f4162l;
        int size = list.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            canvas.restoreToCount(canvas.save());
        }
        if (viewHolder != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            c cVar = list.get(i3);
            if (cVar.p && !cVar.f4186l) {
                list.remove(i3);
            } else if (!cVar.p) {
                z2 = true;
            }
        }
        if (z2) {
            recyclerView.invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        float f2;
        float f3;
        this.q = -1;
        if (this.f4152b != null) {
            a(this.u);
            float[] fArr = this.u;
            f2 = fArr[0];
            f3 = fArr[1];
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        a aVar = this.f4160j;
        RecyclerView.ViewHolder viewHolder = this.f4152b;
        List<c> list = this.f4162l;
        int i2 = this.x;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            c cVar = list.get(i3);
            if (cVar.f4178d == cVar.f4180f) {
                cVar.f4187m = cVar.f4182h.itemView.getTranslationX();
            } else {
                cVar.f4187m = cVar.f4178d + (cVar.q * (cVar.f4180f - cVar.f4178d));
            }
            if (cVar.f4179e == cVar.f4181g) {
                cVar.n = cVar.f4182h.itemView.getTranslationY();
            } else {
                cVar.n = cVar.f4179e + (cVar.q * (cVar.f4181g - cVar.f4179e));
            }
            int save = canvas.save();
            aVar.a(canvas, recyclerView, cVar.f4182h, cVar.f4187m, cVar.n, cVar.f4183i, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            aVar.a(canvas, recyclerView, viewHolder, f2, f3, i2, true);
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, MotionEvent motionEvent, int i3) {
        View a2;
        RecyclerView.ViewHolder a3;
        int b2;
        if (this.f4152b == null && i2 == 2 && this.x != 2 && this.f4160j.b() && this.f4163m.getScrollState() != 1) {
            RecyclerView.i layoutManager = this.f4163m.getLayoutManager();
            int i4 = this.f4159i;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f4153c);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f4154d);
                int i5 = this.y;
                if (abs < ((float) i5) && abs2 < ((float) i5)) {
                    return;
                }
                if (abs > abs2 && layoutManager.f()) {
                    return;
                }
                if ((abs2 <= abs || !layoutManager.g()) && (a2 = a(motionEvent)) != null && (a3 = this.f4163m.a(a2)) != null && (b2 = (this.f4160j.b(this.f4163m, a3) & 65280) >> 8) != 0) {
                    float x2 = motionEvent.getX(i3);
                    float y2 = motionEvent.getY(i3);
                    float f2 = x2 - this.f4153c;
                    float f3 = y2 - this.f4154d;
                    float abs3 = Math.abs(f2);
                    float abs4 = Math.abs(f3);
                    int i6 = this.y;
                    if (abs3 >= ((float) i6) || abs4 >= ((float) i6)) {
                        if (abs3 > abs4) {
                            if (f2 < 0.0f && (b2 & 4) == 0) {
                                return;
                            }
                            if (f2 > 0.0f && (b2 & 8) == 0) {
                                return;
                            }
                        } else if (f3 < 0.0f && (b2 & 1) == 0) {
                            return;
                        } else {
                            if (f3 > 0.0f && (b2 & 2) == 0) {
                                return;
                            }
                        }
                        this.f4156f = 0.0f;
                        this.f4155e = 0.0f;
                        this.f4159i = motionEvent.getPointerId(0);
                        a(a3, 1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(MotionEvent motionEvent, int i2, int i3) {
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        float f2 = x2 - this.f4153c;
        this.f4155e = f2;
        this.f4156f = y2 - this.f4154d;
        if ((i2 & 4) == 0) {
            this.f4155e = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.f4155e = Math.min(0.0f, this.f4155e);
        }
        if ((i2 & 1) == 0) {
            this.f4156f = Math.max(0.0f, this.f4156f);
        }
        if ((i2 & 2) == 0) {
            this.f4156f = Math.min(0.0f, this.f4156f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        rect.setEmpty();
    }

    private static boolean a(View view, float f2, float f3, float f4, float f5) {
        if (f2 < f4 || f2 > f4 + ((float) view.getWidth()) || f3 < f5 || f3 > f5 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }
}
