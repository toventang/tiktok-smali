package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.google.android.material.a.g;
import com.google.android.material.a.h;
import com.google.android.material.internal.i;
import com.google.android.material.internal.m;
import java.util.ArrayList;

public class a {

    /* renamed from: a  reason: collision with root package name */
    static final TimeInterpolator f52397a = com.google.android.material.a.a.f52128c;
    static final int[] u = {16842919, 16842910};
    static final int[] v = {16843623, 16842908, 16842910};
    static final int[] w = {16842908, 16842910};
    static final int[] x = {16843623, 16842910};
    static final int[] y = {16842910};
    static final int[] z = new int[0];
    final m A;
    final com.google.android.material.h.b B;
    ViewTreeObserver.OnPreDrawListener C;
    private final i D;
    private final Rect E = new Rect();
    private final RectF F = new RectF();
    private final RectF G = new RectF();
    private final Matrix H = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    int f52398b;

    /* renamed from: c  reason: collision with root package name */
    Animator f52399c;

    /* renamed from: d  reason: collision with root package name */
    public h f52400d;

    /* renamed from: e  reason: collision with root package name */
    public h f52401e;

    /* renamed from: f  reason: collision with root package name */
    h f52402f;

    /* renamed from: g  reason: collision with root package name */
    h f52403g;

    /* renamed from: h  reason: collision with root package name */
    com.google.android.material.h.a f52404h;

    /* renamed from: i  reason: collision with root package name */
    float f52405i;

    /* renamed from: j  reason: collision with root package name */
    Drawable f52406j;

    /* renamed from: k  reason: collision with root package name */
    Drawable f52407k;

    /* renamed from: l  reason: collision with root package name */
    com.google.android.material.internal.a f52408l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f52409m;
    float n;
    public float o;
    public float p;
    int q;
    float r = 1.0f;
    public ArrayList<Animator.AnimatorListener> s;
    public ArrayList<Animator.AnimatorListener> t;

    /* access modifiers changed from: package-private */
    public interface d {
        static {
            Covode.recordClassIndex(32516);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Rect rect) {
    }

    /* access modifiers changed from: package-private */
    public void c() {
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public float a() {
        return this.n;
    }

    class e extends f {
        static {
            Covode.recordClassIndex(32517);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.a.f
        public final float a() {
            return a.this.n;
        }

        e() {
            super(a.this, (byte) 0);
        }
    }

    class b extends f {
        static {
            Covode.recordClassIndex(32514);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.a.f
        public final float a() {
            return a.this.n + a.this.o;
        }

        b() {
            super(a.this, (byte) 0);
        }
    }

    class c extends f {
        static {
            Covode.recordClassIndex(32515);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.a.f
        public final float a() {
            return a.this.n + a.this.p;
        }

        c() {
            super(a.this, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        i iVar = this.D;
        if (iVar.f52559c != null) {
            iVar.f52559c.end();
            iVar.f52559c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        Rect rect = this.E;
        a(rect);
        b(rect);
        this.B.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final boolean f() {
        if (this.A.getVisibility() != 0) {
            if (this.f52398b == 2) {
                return true;
            }
            return false;
        } else if (this.f52398b != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        if (!v.v(this.A) || this.A.isInEditMode()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(32509);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    class C1220a extends f {
        static {
            Covode.recordClassIndex(32513);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.a.f
        public final float a() {
            return 0.0f;
        }

        C1220a() {
            super(a.this, (byte) 0);
        }
    }

    abstract class f extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f52422a;

        /* renamed from: c  reason: collision with root package name */
        private float f52424c;

        /* renamed from: d  reason: collision with root package name */
        private float f52425d;

        static {
            Covode.recordClassIndex(32518);
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        private f() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f52404h.a(this.f52425d);
            this.f52422a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f52422a) {
                this.f52424c = a.this.f52404h.f52445k;
                this.f52425d = a();
                this.f52422a = true;
            }
            com.google.android.material.h.a aVar = a.this.f52404h;
            float f2 = this.f52424c;
            aVar.a(f2 + ((this.f52425d - f2) * valueAnimator.getAnimatedFraction()));
        }

        /* synthetic */ f(a aVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Rect rect) {
        this.f52404h.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        this.r = f2;
        Matrix matrix = this.H;
        a(f2, matrix);
        this.A.setImageMatrix(matrix);
    }

    private static ValueAnimator a(f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f52397a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        Drawable drawable = this.f52407k;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, com.google.android.material.g.a.a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr) {
        i.a aVar;
        i iVar = this.D;
        int size = iVar.f52557a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                aVar = null;
                break;
            }
            aVar = iVar.f52557a.get(i2);
            if (StateSet.stateSetMatches(aVar.f52562a, iArr)) {
                break;
            }
            i2++;
        }
        if (aVar != iVar.f52558b) {
            if (!(iVar.f52558b == null || iVar.f52559c == null)) {
                iVar.f52559c.cancel();
                iVar.f52559c = null;
            }
            iVar.f52558b = aVar;
            if (aVar != null) {
                iVar.f52559c = aVar.f52563b;
                iVar.f52559c.start();
            }
        }
    }

    private void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.A.getDrawable();
        if (drawable != null && this.q != 0) {
            RectF rectF = this.F;
            RectF rectF2 = this.G;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.q;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.q;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    a(m mVar, com.google.android.material.h.b bVar) {
        this.A = mVar;
        this.B = bVar;
        i iVar = new i();
        this.D = iVar;
        iVar.a(u, a(new c()));
        iVar.a(v, a(new b()));
        iVar.a(w, a(new b()));
        iVar.a(x, a(new b()));
        iVar.a(y, a(new e()));
        iVar.a(z, a(new C1220a()));
        this.f52405i = mVar.getRotation();
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, float f3, float f4) {
        com.google.android.material.h.a aVar = this.f52404h;
        if (aVar != null) {
            aVar.a(f2, this.p + f2);
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final AnimatorSet a(h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A, View.ALPHA, f2);
        hVar.a("opacity").a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A, View.SCALE_X, f3);
        hVar.a("scale").a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A, View.SCALE_Y, f3);
        hVar.a("scale").a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.H);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.A, new com.google.android.material.a.f(), new g(), new Matrix(this.H));
        hVar.a("iconScale").a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.a.b.a(animatorSet, arrayList);
        return animatorSet;
    }
}
