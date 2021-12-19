package com.ss.android.ugc.aweme.infoSticker.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class AnimationPathView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104683a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Path> f104684b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Path> f104685c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<PathMeasure> f104686d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f104687e;

    /* renamed from: f  reason: collision with root package name */
    private float f104688f;

    /* renamed from: g  reason: collision with root package name */
    private float f104689g;

    /* renamed from: h  reason: collision with root package name */
    private b f104690h;

    /* renamed from: i  reason: collision with root package name */
    private List<? extends List<Coordinate>> f104691i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f104692j;

    /* renamed from: k  reason: collision with root package name */
    private ValueAnimator f104693k;

    /* renamed from: l  reason: collision with root package name */
    private int f104694l;

    /* renamed from: m  reason: collision with root package name */
    private float f104695m;
    private boolean n;

    public interface b {
        static {
            Covode.recordClassIndex(67091);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(67087);
    }

    public AnimationPathView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67090);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final ValueAnimator getAnimator() {
        return this.f104693k;
    }

    public final b getCompleteListener() {
        return this.f104690h;
    }

    public final boolean getDynamicLength() {
        return this.n;
    }

    public final float getLength() {
        return this.f104688f;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>>, java.util.List<java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>> */
    public final List<List<Coordinate>> getPoints() {
        return this.f104691i;
    }

    public final float getRatio() {
        return this.f104695m;
    }

    public final int getRepeatCount() {
        return this.f104694l;
    }

    public final boolean getShowAnimation() {
        return this.f104692j;
    }

    public final float getValue() {
        return this.f104689g;
    }

    public final boolean a() {
        if (this.f104693k.isRunning() || this.f104693k.isStarted()) {
            return true;
        }
        return false;
    }

    public final void setCompleteListener(b bVar) {
        this.f104690h = bVar;
    }

    public final void setDynamicLength(boolean z) {
        this.n = z;
    }

    public final void setLength(float f2) {
        this.f104688f = f2;
    }

    public final void setValue(float f2) {
        this.f104689g = f2;
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        l.d(valueAnimator, "");
        this.f104693k = valueAnimator;
    }

    public final void setRepeatCount(int i2) {
        this.f104694l = i2;
        this.f104693k.setRepeatCount(i2);
    }

    public final void setRatio(float f2) {
        this.f104695m = f2;
        this.f104687e.setStrokeWidth(((float) en.a(2.0d, i.f115645a)) / f2);
    }

    public final void setShowAnimation(boolean z) {
        this.f104692j = z;
        if (z) {
            this.f104693k.start();
            bj.d("AnimationPathView# Start animation");
        } else {
            this.f104693k.cancel();
            bj.d("AnimationPathView# cancel animation");
        }
        invalidate();
    }

    public final void setPoints(List<? extends List<Coordinate>> list) {
        this.f104691i = list;
        if (list != null) {
            this.f104684b.clear();
            this.f104685c.clear();
            this.f104686d.clear();
            int i2 = 0;
            int size = list.size();
            if (size >= 0) {
                while (true) {
                    this.f104684b.add(new Path());
                    this.f104685c.add(new Path());
                    this.f104686d.add(new PathMeasure());
                    if (i2 != size) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(4260);
        super.onDraw(canvas);
        if (!this.f104692j) {
            MethodCollector.o(4260);
            return;
        }
        List<? extends List<Coordinate>> list = this.f104691i;
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T<Coordinate> t2 = t;
                Path path = this.f104684b.get(i2);
                l.b(path, "");
                Path path2 = path;
                Path path3 = this.f104685c.get(i2);
                l.b(path3, "");
                Path path4 = path3;
                PathMeasure pathMeasure = this.f104686d.get(i2);
                l.b(pathMeasure, "");
                PathMeasure pathMeasure2 = pathMeasure;
                path2.moveTo(((Coordinate) t2.get(0)).getX(), ((Coordinate) t2.get(0)).getY());
                for (Coordinate coordinate : t2) {
                    path2.lineTo(coordinate.getX(), coordinate.getY());
                }
                path2.close();
                pathMeasure2.setPath(path2, true);
                this.f104688f = pathMeasure2.getLength();
                path4.reset();
                path4.lineTo(0.0f, 0.0f);
                float f2 = 0.2f;
                if (this.n) {
                    float f3 = this.f104688f;
                    float f4 = this.f104689g;
                    float f5 = f3 * f4;
                    float f6 = 0.4f;
                    if (f4 >= 0.0f && f4 <= 0.2f) {
                        f6 = f4 * 2.0f;
                    } else if (f4 < 0.2f || f4 > 0.4f) {
                        f6 = ((1.0f - f4) * 2.0f) / 3.0f;
                    }
                    pathMeasure2.getSegment(f5, (f3 * f6) + f5, path4, true);
                } else {
                    float f7 = this.f104688f;
                    float f8 = this.f104689g;
                    float f9 = f7 * f8;
                    if (f8 >= 0.0f && f8 <= 0.2f) {
                        f2 = f8;
                    } else if (f8 < 0.2f || f8 > 0.8f) {
                        f2 = 1.0f - f8;
                    }
                    pathMeasure2.getSegment(f9, (f7 * f2) + f9, path4, true);
                }
                if (canvas != null) {
                    canvas.drawPath(path4, this.f104687e);
                }
                i2 = i3;
            }
            MethodCollector.o(4260);
            return;
        }
        MethodCollector.o(4260);
    }

    private /* synthetic */ AnimationPathView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AnimationPathView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4289);
        this.f104684b = new ArrayList<>();
        this.f104685c = new ArrayList<>();
        this.f104686d = new ArrayList<>();
        Paint paint = new Paint();
        this.f104687e = paint;
        this.f104695m = 1.0f;
        paint.setAntiAlias(true);
        paint.setColor(androidx.core.content.b.c(context, R.color.f159928l));
        paint.setStrokeWidth((float) en.a(2.0d, i.f115645a));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        l.b(ofFloat, "");
        this.f104693k = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.ugc.aweme.infoSticker.widget.AnimationPathView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AnimationPathView f104696a;

            static {
                Covode.recordClassIndex(67088);
            }

            {
                this.f104696a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimationPathView animationPathView = this.f104696a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                animationPathView.setValue(((Float) animatedValue).floatValue());
                this.f104696a.invalidate();
            }
        });
        this.f104693k.setDuration(1200L);
        this.f104693k.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f104693k.setRepeatCount(this.f104694l);
        this.f104693k.addListener(new Animator.AnimatorListener(this) {
            /* class com.ss.android.ugc.aweme.infoSticker.widget.AnimationPathView.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AnimationPathView f104697a;

            static {
                Covode.recordClassIndex(67089);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f104697a = r1;
            }

            public final void onAnimationEnd(Animator animator) {
                b completeListener = this.f104697a.getCompleteListener();
                if (completeListener != null) {
                    completeListener.a();
                }
            }

            public final void onAnimationRepeat(Animator animator) {
                b completeListener = this.f104697a.getCompleteListener();
                if (completeListener != null) {
                    completeListener.a();
                }
            }
        });
        MethodCollector.o(4289);
    }
}
