package com.google.android.material.floatingactionbutton;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.c.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.u;
import androidx.core.h.v;
import androidx.core.widget.j;
import com.bytedance.covode.number.Covode;
import com.google.android.material.a.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.d.c;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.m;
import com.google.android.material.stateful.ExtendableSavedState;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

@CoordinatorLayout.c(a = Behavior.class)
public final class FloatingActionButton extends m implements u, j, com.google.android.material.d.a {

    /* renamed from: a  reason: collision with root package name */
    public int f52378a;

    /* renamed from: b  reason: collision with root package name */
    boolean f52379b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f52380c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f52381d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuff.Mode f52382e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f52383f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f52384g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f52385h;

    /* renamed from: i  reason: collision with root package name */
    private int f52386i;

    /* renamed from: j  reason: collision with root package name */
    private int f52387j;

    /* renamed from: k  reason: collision with root package name */
    private int f52388k;

    /* renamed from: l  reason: collision with root package name */
    private final Rect f52389l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.appcompat.widget.j f52390m;
    private final c n;
    private a o;

    public static abstract class a {
        static {
            Covode.recordClassIndex(32507);
        }
    }

    static {
        Covode.recordClassIndex(32503);
    }

    public final void setBackgroundColor(int i2) {
    }

    public final void setBackgroundDrawable(Drawable drawable) {
    }

    public final void setBackgroundResource(int i2) {
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        static {
            Covode.recordClassIndex(32506);
        }

        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b, com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout.e eVar) {
            super.a(eVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            return super.a(coordinatorLayout, floatingActionButton, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.a(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.b(coordinatorLayout, floatingActionButton, view);
        }
    }

    public final ColorStateList getBackgroundTintList() {
        return this.f52381d;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f52382e;
    }

    public final int getCustomSize() {
        return this.f52387j;
    }

    public final ColorStateList getRippleColorStateList() {
        return this.f52385h;
    }

    public final int getSize() {
        return this.f52386i;
    }

    @Override // androidx.core.widget.j
    public final ColorStateList getSupportImageTintList() {
        return this.f52383f;
    }

    @Override // androidx.core.widget.j
    public final PorterDuff.Mode getSupportImageTintMode() {
        return this.f52384g;
    }

    public final boolean getUseCompatPadding() {
        return this.f52379b;
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.b<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f52393a;

        /* renamed from: b  reason: collision with root package name */
        private a f52394b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f52395c;

        static {
            Covode.recordClassIndex(32505);
        }

        public BaseBehavior() {
            this.f52395c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void a(CoordinatorLayout.e eVar) {
            if (eVar.f2107h == 0) {
                eVar.f2107h = 80;
            }
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).f2100a instanceof BottomSheetBehavior;
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k7});
            this.f52395c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
            if (this.f52395c && eVar.f2105f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.b(this.f52394b);
                return true;
            }
            floatingActionButton.a(this.f52394b);
            return true;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f52393a == null) {
                this.f52393a = new Rect();
            }
            Rect rect = this.f52393a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.b(this.f52394b);
                return true;
            }
            floatingActionButton.a(this.f52394b);
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.floatingactionbutton.FloatingActionButton r8, int r9) {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton, int):boolean");
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f52380c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, floatingActionButton);
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements com.google.android.material.h.b {
        static {
            Covode.recordClassIndex(32508);
        }

        @Override // com.google.android.material.h.b
        public final boolean b() {
            return FloatingActionButton.this.f52379b;
        }

        @Override // com.google.android.material.h.b
        public final float a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        b() {
        }

        @Override // com.google.android.material.h.b
        public final void a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.h.b
        public final void a(int i2, int i3, int i4, int i5) {
            FloatingActionButton.this.f52380c.set(i2, i3, i4, i5);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i2 + floatingActionButton.f52378a, i3 + FloatingActionButton.this.f52378a, i4 + FloatingActionButton.this.f52378a, i5 + FloatingActionButton.this.f52378a);
        }
    }

    @Override // com.google.android.material.d.b
    public final boolean a() {
        return this.n.f52376b;
    }

    public final float getCompatHoveredFocusedTranslationZ() {
        return getImpl().o;
    }

    public final float getCompatPressedTranslationZ() {
        return getImpl().p;
    }

    public final Drawable getContentBackground() {
        return getImpl().f52409m;
    }

    public final int getExpandedComponentIdHint() {
        return this.n.f52377c;
    }

    public final h getHideMotionSpec() {
        return getImpl().f52401e;
    }

    public final h getShowMotionSpec() {
        return getImpl().f52400d;
    }

    @Override // androidx.core.h.u
    public final ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.h.u
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    public final float getCompatElevation() {
        return getImpl().a();
    }

    public final int getRippleColor() {
        ColorStateList colorStateList = this.f52385h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a impl = getImpl();
        if (impl.C != null) {
            impl.A.getViewTreeObserver().removeOnPreDrawListener(impl.C);
            impl.C = null;
        }
        k.a(this);
    }

    private void b() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f52383f;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.d(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f52384g;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(androidx.appcompat.widget.h.a(colorForState, mode));
        }
    }

    public final a getImpl() {
        a aVar;
        if (this.o == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                aVar = new b(this, new b());
            } else {
                aVar = new a(this, new b());
            }
            this.o = aVar;
        }
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final int getSizeDimension() {
        int i2 = this.f52386i;
        while (true) {
            int i3 = this.f52387j;
            if (i3 != 0) {
                return i3;
            }
            Resources resources = getResources();
            if (i2 != -1) {
                if (i2 != 1) {
                    return resources.getDimensionPixelSize(R.dimen.ho);
                }
                return resources.getDimensionPixelSize(R.dimen.hn);
            } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a impl = getImpl();
        if (impl.e()) {
            if (impl.C == null) {
                impl.C = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: IPUT  
                      (wrap: com.google.android.material.floatingactionbutton.a$3 : 0x0013: CONSTRUCTOR  (r0v4 com.google.android.material.floatingactionbutton.a$3) = (r2v0 'impl' com.google.android.material.floatingactionbutton.a) call: com.google.android.material.floatingactionbutton.a.3.<init>(com.google.android.material.floatingactionbutton.a):void type: CONSTRUCTOR)
                      (r2v0 'impl' com.google.android.material.floatingactionbutton.a)
                     com.google.android.material.floatingactionbutton.a.C android.view.ViewTreeObserver$OnPreDrawListener in method: com.google.android.material.floatingactionbutton.FloatingActionButton.onAttachedToWindow():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR  (r0v4 com.google.android.material.floatingactionbutton.a$3) = (r2v0 'impl' com.google.android.material.floatingactionbutton.a) call: com.google.android.material.floatingactionbutton.a.3.<init>(com.google.android.material.floatingactionbutton.a):void type: CONSTRUCTOR in method: com.google.android.material.floatingactionbutton.FloatingActionButton.onAttachedToWindow():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.material.floatingactionbutton.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    this = this;
                    super.onAttachedToWindow()
                    com.google.android.material.floatingactionbutton.a r2 = r3.getImpl()
                    boolean r0 = r2.e()
                    if (r0 == 0) goto L_0x0023
                    android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.C
                    if (r0 != 0) goto L_0x0018
                    com.google.android.material.floatingactionbutton.a$3 r0 = new com.google.android.material.floatingactionbutton.a$3
                    r0.<init>()
                    r2.C = r0
                L_0x0018:
                    com.google.android.material.internal.m r0 = r2.A
                    android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
                    android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.C
                    r1.addOnPreDrawListener(r0)
                L_0x0023:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.onAttachedToWindow():void");
            }

            /* access modifiers changed from: protected */
            public final Parcelable onSaveInstanceState() {
                ExtendableSavedState extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
                g<String, Bundle> gVar = extendableSavedState.f52628a;
                c cVar = this.n;
                Bundle bundle = new Bundle();
                bundle.putBoolean("expanded", cVar.f52376b);
                bundle.putInt("expandedComponentIdHint", cVar.f52377c);
                gVar.put("expandableWidgetHelper", bundle);
                return extendableSavedState;
            }

            @Override // androidx.core.h.u
            public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
                setBackgroundTintList(colorStateList);
            }

            @Override // androidx.core.h.u
            public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
                setBackgroundTintMode(mode);
            }

            public final void setExpandedComponentIdHint(int i2) {
                this.n.f52377c = i2;
            }

            public final void setHideMotionSpec(h hVar) {
                getImpl().f52401e = hVar;
            }

            public final void setImageResource(int i2) {
                this.f52390m.a(i2);
            }

            public final void setRippleColor(int i2) {
                setRippleColor(ColorStateList.valueOf(i2));
            }

            public final void setShowMotionSpec(h hVar) {
                getImpl().f52400d = hVar;
            }

            private a.d c(final a aVar) {
                if (aVar == null) {
                    return null;
                }
                return new a.d() {
                    /* class com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(32504);
                    }
                };
            }

            public final void setCompatElevationResource(int i2) {
                setCompatElevation(getResources().getDimension(i2));
            }

            public final void setCompatHoveredFocusedTranslationZResource(int i2) {
                setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
            }

            public final void setCompatPressedTranslationZResource(int i2) {
                setCompatPressedTranslationZ(getResources().getDimension(i2));
            }

            public final void setCustomSize(int i2) {
                if (i2 >= 0) {
                    this.f52387j = i2;
                    return;
                }
                throw new IllegalArgumentException("Custom size must be non-negative");
            }

            public final void setHideMotionSpecResource(int i2) {
                setHideMotionSpec(h.a(getContext(), i2));
            }

            public final void setImageDrawable(Drawable drawable) {
                super.setImageDrawable(drawable);
                a impl = getImpl();
                impl.a(impl.r);
            }

            public final void setRippleColor(ColorStateList colorStateList) {
                if (this.f52385h != colorStateList) {
                    this.f52385h = colorStateList;
                    getImpl().a(this.f52385h);
                }
            }

            public final void setShowMotionSpecResource(int i2) {
                setShowMotionSpec(h.a(getContext(), i2));
            }

            public final void setSize(int i2) {
                this.f52387j = 0;
                if (i2 != this.f52386i) {
                    this.f52386i = i2;
                    requestLayout();
                }
            }

            @Override // androidx.core.widget.j
            public final void setSupportImageTintList(ColorStateList colorStateList) {
                if (this.f52383f != colorStateList) {
                    this.f52383f = colorStateList;
                    b();
                }
            }

            @Override // androidx.core.widget.j
            public final void setSupportImageTintMode(PorterDuff.Mode mode) {
                if (this.f52384g != mode) {
                    this.f52384g = mode;
                    b();
                }
            }

            public final void setUseCompatPadding(boolean z) {
                if (this.f52379b != z) {
                    this.f52379b = z;
                    getImpl().c();
                }
            }

            public final void setBackgroundTintMode(PorterDuff.Mode mode) {
                if (this.f52382e != mode) {
                    this.f52382e = mode;
                    a impl = getImpl();
                    if (impl.f52406j != null) {
                        androidx.core.graphics.drawable.a.a(impl.f52406j, mode);
                    }
                }
            }

            public final void setCompatElevation(float f2) {
                a impl = getImpl();
                if (impl.n != f2) {
                    impl.n = f2;
                    impl.a(impl.n, impl.o, impl.p);
                }
            }

            public final void setCompatHoveredFocusedTranslationZ(float f2) {
                a impl = getImpl();
                if (impl.o != f2) {
                    impl.o = f2;
                    impl.a(impl.n, impl.o, impl.p);
                }
            }

            public final void setCompatPressedTranslationZ(float f2) {
                a impl = getImpl();
                if (impl.p != f2) {
                    impl.p = f2;
                    impl.a(impl.n, impl.o, impl.p);
                }
            }

            public final boolean a(Rect rect) {
                if (!v.v(this)) {
                    return false;
                }
                rect.set(0, 0, getWidth(), getHeight());
                b(rect);
                return true;
            }

            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || !a(this.f52389l) || this.f52389l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }

            public final void setBackgroundTintList(ColorStateList colorStateList) {
                if (this.f52381d != colorStateList) {
                    this.f52381d = colorStateList;
                    a impl = getImpl();
                    if (impl.f52406j != null) {
                        androidx.core.graphics.drawable.a.a(impl.f52406j, colorStateList);
                    }
                    if (impl.f52408l != null) {
                        com.google.android.material.internal.a aVar = impl.f52408l;
                        if (colorStateList != null) {
                            aVar.f52502g = colorStateList.getColorForState(aVar.getState(), aVar.f52502g);
                        }
                        aVar.f52501f = colorStateList;
                        aVar.f52503h = true;
                        aVar.invalidateSelf();
                    }
                }
            }

            public final void b(Rect rect) {
                rect.left += this.f52380c.left;
                rect.top += this.f52380c.top;
                rect.right -= this.f52380c.right;
                rect.bottom -= this.f52380c.bottom;
            }

            /* access modifiers changed from: protected */
            public final void onRestoreInstanceState(Parcelable parcelable) {
                if (!(parcelable instanceof ExtendableSavedState)) {
                    super.onRestoreInstanceState(parcelable);
                    return;
                }
                ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
                super.onRestoreInstanceState(extendableSavedState.f2667d);
                c cVar = this.n;
                Bundle bundle = extendableSavedState.f52628a.get("expandableWidgetHelper");
                cVar.f52376b = bundle.getBoolean("expanded", false);
                cVar.f52377c = bundle.getInt("expandedComponentIdHint", 0);
                if (cVar.f52376b) {
                    ViewParent parent = cVar.f52375a.getParent();
                    if (parent instanceof CoordinatorLayout) {
                        ((CoordinatorLayout) parent).a(cVar.f52375a);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public final void a(a aVar) {
                h hVar;
                a impl = getImpl();
                a.d c2 = c(aVar);
                if (!impl.f()) {
                    if (impl.f52399c != null) {
                        impl.f52399c.cancel();
                    }
                    if (impl.g()) {
                        if (impl.A.getVisibility() != 0) {
                            impl.A.setAlpha(0.0f);
                            impl.A.setScaleY(0.0f);
                            impl.A.setScaleX(0.0f);
                            impl.a(0.0f);
                        }
                        if (impl.f52400d != null) {
                            hVar = impl.f52400d;
                        } else {
                            if (impl.f52402f == null) {
                                impl.f52402f = h.a(impl.A.getContext(), (int) R.animator.f159866c);
                            }
                            hVar = impl.f52402f;
                        }
                        AnimatorSet a2 = impl.a(hVar, 1.0f, 1.0f, 1.0f);
                        a2.addListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: INVOKE  
                              (r2v1 'a2' android.animation.AnimatorSet)
                              (wrap: com.google.android.material.floatingactionbutton.a$2 : 0x0046: CONSTRUCTOR  (r0v16 com.google.android.material.floatingactionbutton.a$2) = 
                              (r3v0 'impl' com.google.android.material.floatingactionbutton.a)
                              (r4v0 'c2' com.google.android.material.floatingactionbutton.a$d)
                             call: com.google.android.material.floatingactionbutton.a.2.<init>(com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.a$d):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: CONSTRUCTOR  (r0v16 com.google.android.material.floatingactionbutton.a$2) = 
                              (r3v0 'impl' com.google.android.material.floatingactionbutton.a)
                              (r4v0 'c2' com.google.android.material.floatingactionbutton.a$d)
                             call: com.google.android.material.floatingactionbutton.a.2.<init>(com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.a$d):void type: CONSTRUCTOR in method: com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 28 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.material.floatingactionbutton.a, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 34 more
                            */
                        /*
                        // Method dump skipped, instructions count: 153
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void");
                    }

                    /* access modifiers changed from: package-private */
                    public final void b(a aVar) {
                        h hVar;
                        a impl = getImpl();
                        a.d c2 = c(aVar);
                        if (impl.A.getVisibility() == 0) {
                            if (impl.f52398b == 1) {
                                return;
                            }
                        } else if (impl.f52398b != 2) {
                            return;
                        }
                        if (impl.f52399c != null) {
                            impl.f52399c.cancel();
                        }
                        if (impl.g()) {
                            if (impl.f52401e != null) {
                                hVar = impl.f52401e;
                            } else {
                                if (impl.f52403g == null) {
                                    impl.f52403g = h.a(impl.A.getContext(), (int) R.animator.f159865b);
                                }
                                hVar = impl.f52403g;
                            }
                            AnimatorSet a2 = impl.a(hVar, 0.0f, 0.0f, 0.0f);
                            a2.addListener(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003c: INVOKE  
                                  (r2v1 'a2' android.animation.AnimatorSet)
                                  (wrap: com.google.android.material.floatingactionbutton.a$1 : 0x0039: CONSTRUCTOR  (r0v11 com.google.android.material.floatingactionbutton.a$1) = 
                                  (r3v0 'impl' com.google.android.material.floatingactionbutton.a)
                                  (r4v0 'c2' com.google.android.material.floatingactionbutton.a$d)
                                 call: com.google.android.material.floatingactionbutton.a.1.<init>(com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.a$d):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.google.android.material.floatingactionbutton.FloatingActionButton.b(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0039: CONSTRUCTOR  (r0v11 com.google.android.material.floatingactionbutton.a$1) = 
                                  (r3v0 'impl' com.google.android.material.floatingactionbutton.a)
                                  (r4v0 'c2' com.google.android.material.floatingactionbutton.a$d)
                                 call: com.google.android.material.floatingactionbutton.a.1.<init>(com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.a$d):void type: CONSTRUCTOR in method: com.google.android.material.floatingactionbutton.FloatingActionButton.b(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 21 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.material.floatingactionbutton.a, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 27 more
                                */
                            /*
                            // Method dump skipped, instructions count: 122
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.b(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void");
                        }

                        private static int a(int i2, int i3) {
                            int mode = View.MeasureSpec.getMode(i3);
                            int size = View.MeasureSpec.getSize(i3);
                            if (mode == Integer.MIN_VALUE) {
                                return Math.min(i2, size);
                            }
                            if (mode == 0) {
                                return i2;
                            }
                            if (mode == 1073741824) {
                                return size;
                            }
                            throw new IllegalArgumentException();
                        }

                        /* access modifiers changed from: protected */
                        public final void onMeasure(int i2, int i3) {
                            int sizeDimension = getSizeDimension();
                            this.f52378a = (sizeDimension - this.f52388k) / 2;
                            getImpl().d();
                            int min = Math.min(a(sizeDimension, i2), a(sizeDimension, i3));
                            setMeasuredDimension(this.f52380c.left + min + this.f52380c.right, min + this.f52380c.top + this.f52380c.bottom);
                        }
                    }
