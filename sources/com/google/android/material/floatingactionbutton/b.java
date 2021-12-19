package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.android.material.g.a;
import com.google.android.material.internal.m;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class b extends a {
    private InsetDrawable D;

    static {
        Covode.recordClassIndex(32519);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public final void b() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public final boolean e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public final void c() {
        d();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public final float a() {
        return this.A.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public final void a(ColorStateList colorStateList) {
        if (this.f52407k instanceof RippleDrawable) {
            ((RippleDrawable) this.f52407k).setColor(a.a(colorStateList));
        } else {
            super.a(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public final void b(Rect rect) {
        if (this.B.b()) {
            this.D = new InsetDrawable(this.f52407k, rect.left, rect.top, rect.right, rect.bottom);
            this.B.a(this.D);
            return;
        }
        this.B.a(this.f52407k);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public final void a(Rect rect) {
        if (this.B.b()) {
            float a2 = this.B.a();
            float elevation = this.A.getElevation() + this.p;
            int ceil = (int) Math.ceil((double) com.google.android.material.h.a.b(elevation, a2, false));
            int ceil2 = (int) Math.ceil((double) com.google.android.material.h.a.a(elevation, a2, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public final void a(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.A.isEnabled()) {
            this.A.setElevation(this.n);
            if (this.A.isPressed()) {
                this.A.setTranslationZ(this.p);
            } else if (this.A.isFocused() || this.A.isHovered()) {
                this.A.setTranslationZ(this.o);
            } else {
                this.A.setTranslationZ(0.0f);
            }
        } else {
            this.A.setElevation(0.0f);
            this.A.setTranslationZ(0.0f);
        }
    }

    b(m mVar, com.google.android.material.h.b bVar) {
        super(mVar, bVar);
    }

    private Animator a(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.A, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.A, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(f52397a);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public final void a(float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT == 21) {
            this.A.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(u, a(f2, f4));
            stateListAnimator.addState(v, a(f2, f3));
            stateListAnimator.addState(w, a(f2, f3));
            stateListAnimator.addState(x, a(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.A, "elevation", f2).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.A, View.TRANSLATION_Z, this.A.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.A, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f52397a);
            stateListAnimator.addState(y, animatorSet);
            stateListAnimator.addState(z, a(0.0f, 0.0f));
            this.A.setStateListAnimator(stateListAnimator);
        }
        if (this.B.b()) {
            d();
        }
    }
}
