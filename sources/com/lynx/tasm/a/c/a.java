package com.lynx.tasm.a.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.a.b;
import com.lynx.tasm.a.c;
import com.lynx.tasm.a.d;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.utils.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f55682a;

    /* renamed from: b  reason: collision with root package name */
    public int f55683b;

    /* renamed from: c  reason: collision with root package name */
    public int f55684c;

    /* renamed from: d  reason: collision with root package name */
    public int f55685d;

    /* renamed from: e  reason: collision with root package name */
    public int f55686e;

    /* renamed from: f  reason: collision with root package name */
    public int f55687f;

    /* renamed from: g  reason: collision with root package name */
    public int f55688g;

    /* renamed from: h  reason: collision with root package name */
    public int f55689h;

    /* renamed from: i  reason: collision with root package name */
    public int f55690i;

    /* renamed from: j  reason: collision with root package name */
    public int f55691j;

    /* renamed from: k  reason: collision with root package name */
    public int f55692k;

    /* renamed from: l  reason: collision with root package name */
    public int f55693l;

    /* renamed from: m  reason: collision with root package name */
    public int f55694m;
    public int n;
    public int o;
    public int p;
    public Rect q;
    public boolean r;
    public final LynxBaseUI s;
    public final List<Animator> t;
    public AnimatorSet u;
    public final SparseArray<b> v = new SparseArray<>();
    private boolean w;
    private Animator x;

    static {
        Covode.recordClassIndex(34838);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.a.c.a$a  reason: collision with other inner class name */
    public static class C1257a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private static final Map<String, Object> f55737a;

        /* renamed from: g  reason: collision with root package name */
        WeakReference<LynxBaseUI> f55738g;

        /* renamed from: h  reason: collision with root package name */
        int f55739h;

        static {
            Covode.recordClassIndex(34852);
            HashMap hashMap = new HashMap();
            f55737a = hashMap;
            hashMap.put("animation_type", "transition");
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LynxBaseUI lynxBaseUI = this.f55738g.get();
            if (lynxBaseUI != null) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).f56071a;
                }
                a(lynxBaseUI, d.a(this.f55739h));
            }
        }

        public C1257a(LynxBaseUI lynxBaseUI, int i2) {
            this.f55738g = new WeakReference<>(lynxBaseUI);
            this.f55739h = i2;
        }

        public static void a(LynxBaseUI lynxBaseUI, String str) {
            if (lynxBaseUI != null && lynxBaseUI.getEvents() != null && lynxBaseUI.getEvents().containsKey("transitionend")) {
                Map<String, Object> map = f55737a;
                map.put("animation_type", "transition-".concat(String.valueOf(str)));
                lynxBaseUI.mContext.f55897e.a(new com.lynx.tasm.c.b(lynxBaseUI.getSign(), "transitionend", map));
            }
        }
    }

    public final void a() {
        AnimatorSet animatorSet = this.u;
        if (animatorSet != null) {
            animatorSet.end();
            this.u = null;
        }
        this.t.clear();
        this.x = null;
    }

    public final boolean b() {
        if (this.v.size() == 0) {
            return false;
        }
        if (b(256) || b(1024) || b(512) || b(2048) || b(16) || b(32)) {
            return true;
        }
        return false;
    }

    private boolean b(int i2) {
        if (this.v.indexOfKey(i2) >= 0) {
            return true;
        }
        return false;
    }

    public final void a(ReadableMap readableMap) {
        if (readableMap == null || readableMap.getArray("transition") == null) {
            a();
        }
    }

    public a(LynxBaseUI lynxBaseUI) {
        this.s = lynxBaseUI;
        this.t = new ArrayList();
    }

    public final boolean a(int i2) {
        if (this.v.size() == 0 || this.v.get(i2) == null) {
            return false;
        }
        return true;
    }

    public final boolean a(LynxBaseUI lynxBaseUI, final int i2, Object obj) {
        final LynxUI lynxUI;
        final int i3;
        if (this.v.size() == 0 || this.v.get(i2) == null) {
            return false;
        }
        final LynxBaseUI lynxBaseUI2 = this.s;
        if (lynxBaseUI2 == null) {
            lynxBaseUI2 = lynxBaseUI;
        }
        b bVar = this.v.get(i2);
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 64) {
                final int intValue = ((Integer) obj).intValue();
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(lynxBaseUI2.mLynxBackground.f56415h), Integer.valueOf(intValue));
                this.t.add(ofObject);
                ofObject.setDuration((long) Math.round((float) bVar.f55634b));
                ofObject.setInterpolator(c.a(bVar));
                ofObject.setStartDelay(bVar.f55635c);
                ofObject.addListener(new C1257a(i2, lynxBaseUI2) {
                    /* class com.lynx.tasm.a.c.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34839);
                    }

                    @Override // com.lynx.tasm.a.c.a.C1257a
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        lynxBaseUI2.mLynxBackground.a(intValue);
                        lynxBaseUI2.invalidate();
                        a.this.t.remove(animator);
                    }
                });
                ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.a.c.a.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(34848);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue != null) {
                            lynxBaseUI2.mLynxBackground.a(((Integer) animatedValue).intValue());
                            lynxBaseUI2.invalidate();
                        }
                    }
                });
                return false;
            } else if (i2 != 128) {
                if (i2 != 4096 || !(lynxBaseUI2 instanceof LynxUI)) {
                    return false;
                }
                final LynxUI lynxUI2 = (LynxUI) lynxBaseUI2;
                float latestWidth = (float) lynxUI2.mContext.f55901i.getLatestWidth();
                lynxUI2.mContext.f55901i.getLatestHeight();
                final h a2 = h.a((List) obj, latestWidth, (float) lynxUI2.getLatestWidth(), (float) lynxUI2.getLatestHeight());
                if (a2 == null) {
                    return false;
                }
                final float translationX = lynxUI2.getTranslationX();
                final float translationY = lynxUI2.getTranslationY();
                final float translationZ = lynxUI2.getTranslationZ();
                final float rotation = lynxUI2.mView.getRotation();
                final float rotationX = lynxUI2.mView.getRotationX();
                final float rotationY = lynxUI2.mView.getRotationY();
                final float scaleX = lynxUI2.mView.getScaleX();
                final float scaleY = lynxUI2.mView.getScaleY();
                ValueAnimator ofInt = ValueAnimator.ofInt(0);
                Animator animator = this.x;
                if (animator != null) {
                    this.t.remove(animator);
                }
                this.x = ofInt;
                this.t.add(ofInt);
                ofInt.setDuration(bVar.f55634b);
                ofInt.setInterpolator(c.a(bVar));
                ofInt.setStartDelay(bVar.f55635c);
                ofInt.addListener(new C1257a(i2, lynxUI2) {
                    /* class com.lynx.tasm.a.c.a.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(34849);
                    }

                    @Override // com.lynx.tasm.a.c.a.C1257a
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        lynxUI2.mView.setTranslationX(a2.a());
                        lynxUI2.mView.setTranslationY(a2.b());
                        if (Build.VERSION.SDK_INT >= 21) {
                            lynxUI2.mView.setTranslationZ(a2.c());
                        }
                        if (lynxUI2.mParent instanceof UIShadowProxy) {
                            ((UIShadowProxy) lynxUI2.mParent).invalidate();
                        }
                        lynxUI2.mView.setRotation(a2.d());
                        lynxUI2.mView.setRotationX(a2.e());
                        lynxUI2.mView.setRotationY(a2.f());
                        lynxUI2.mView.setScaleX(a2.g());
                        lynxUI2.mView.setScaleY(a2.h());
                        a.this.t.remove(animator);
                    }
                });
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.a.c.a.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(34850);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        float a2 = a2.a();
                        float f2 = translationX;
                        if (a2 != f2) {
                            lynxUI2.mView.setTranslationX(f2 + ((a2.a() - translationX) * animatedFraction));
                        }
                        float b2 = a2.b();
                        float f3 = translationY;
                        if (b2 != f3) {
                            lynxUI2.mView.setTranslationY(f3 + ((a2.b() - translationY) * animatedFraction));
                        }
                        float c2 = a2.c();
                        float f4 = translationZ;
                        if (c2 != f4) {
                            float c3 = f4 + ((a2.c() - translationZ) * animatedFraction);
                            if (Build.VERSION.SDK_INT >= 21) {
                                lynxUI2.mView.setTranslationZ(c3);
                            }
                        }
                        float d2 = a2.d();
                        float f5 = rotation;
                        if (d2 != f5) {
                            lynxUI2.mView.setRotation(f5 + ((a2.d() - rotation) * animatedFraction));
                        }
                        float e2 = a2.e();
                        float f6 = rotationX;
                        if (e2 != f6) {
                            lynxUI2.mView.setRotationX(f6 + ((a2.e() - rotationX) * animatedFraction));
                        }
                        float f7 = a2.f();
                        float f8 = rotationY;
                        if (f7 != f8) {
                            lynxUI2.mView.setRotationY(f8 + ((a2.f() - rotationY) * animatedFraction));
                        }
                        float g2 = a2.g();
                        float f9 = scaleX;
                        if (g2 != f9) {
                            lynxUI2.mView.setScaleX(f9 + ((a2.g() - scaleX) * animatedFraction));
                        }
                        float h2 = a2.h();
                        float f10 = scaleY;
                        if (h2 != f10) {
                            lynxUI2.mView.setScaleY(f10 + (animatedFraction * (a2.h() - scaleY)));
                        }
                        if (lynxUI2.mParent instanceof UIShadowProxy) {
                            ((UIShadowProxy) lynxUI2.mParent).invalidate();
                        }
                    }
                });
                return false;
            } else if (this.w) {
                return false;
            } else {
                if (lynxBaseUI2.mParent instanceof UIShadowProxy) {
                    lynxUI = (LynxUI) lynxBaseUI2.mParent;
                } else {
                    lynxUI = (LynxUI) lynxBaseUI2;
                }
                int intValue2 = ((Integer) obj).intValue();
                int visibility = lynxUI.mView.getVisibility();
                if (intValue2 == 1) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                if (visibility == i3) {
                    return false;
                }
                this.r = true;
                final float alpha = lynxUI.mView.getAlpha();
                float f3 = 0.0f;
                if (visibility == 0) {
                    f3 = alpha;
                    f2 = 0.0f;
                } else if ((visibility == 4 || visibility == 8) && i3 == 0) {
                    lynxUI.mView.setAlpha(0.0f);
                } else {
                    f3 = alpha;
                }
                ValueAnimator ofObject2 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f3), Float.valueOf(f2));
                ofObject2.setDuration(bVar.f55634b);
                ofObject2.setInterpolator(c.a(bVar));
                ofObject2.setStartDelay(bVar.f55635c);
                ofObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.a.c.a.AnonymousClass11 */

                    static {
                        Covode.recordClassIndex(34841);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue != null) {
                            lynxUI.mView.setAlpha(((Float) animatedValue).floatValue());
                        }
                    }
                });
                ofObject2.addListener(new C1257a(lynxBaseUI2, i2) {
                    /* class com.lynx.tasm.a.c.a.AnonymousClass12 */

                    static {
                        Covode.recordClassIndex(34842);
                    }

                    public final void onAnimationCancel(Animator animator) {
                        super.onAnimationCancel(animator);
                        a.this.r = false;
                    }

                    @Override // com.lynx.tasm.a.c.a.C1257a
                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        lynxUI.mView.setVisibility(0);
                        a.this.r = false;
                    }

                    @Override // com.lynx.tasm.a.c.a.C1257a
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C1257a.a(lynxBaseUI2, d.a(i2));
                        lynxUI.setVisibilityForView(i3);
                        lynxUI.mView.setAlpha(alpha);
                        a.this.t.remove(animator);
                    }
                });
                this.t.add(ofObject2);
                return false;
            }
        } else if (this.r) {
            return false;
        } else {
            final float min = Math.min(((Float) obj).floatValue(), 1.0f);
            final LynxUI lynxUI3 = (LynxUI) lynxBaseUI2;
            ValueAnimator ofObject3 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(lynxUI3.mView.getAlpha()), Float.valueOf(min));
            this.t.add(ofObject3);
            ofObject3.setDuration(bVar.f55634b);
            ofObject3.setInterpolator(c.a(bVar));
            ofObject3.setStartDelay(bVar.f55635c);
            ofObject3.addListener(new C1257a(i2, lynxUI3) {
                /* class com.lynx.tasm.a.c.a.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(34851);
                }

                @Override // com.lynx.tasm.a.c.a.C1257a
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    lynxUI3.mView.setAlpha(min);
                    if (lynxUI3.mParent instanceof UIShadowProxy) {
                        ((UIShadowProxy) lynxUI3.mParent).invalidate();
                    }
                    a.this.t.remove(animator);
                }
            });
            ofObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.lynx.tasm.a.c.a.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(34840);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        lynxUI3.mView.setAlpha(((Float) animatedValue).floatValue());
                        if (lynxUI3.mParent instanceof UIShadowProxy) {
                            ((UIShadowProxy) lynxUI3.mParent).invalidate();
                        }
                    }
                }
            });
            this.w = true;
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r4 != 2048) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.animation.ValueAnimator a(int r4, final com.lynx.tasm.behavior.ui.LynxBaseUI r5, int r6, int r7, com.lynx.tasm.a.b r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.a.c.a.a(int, com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, com.lynx.tasm.a.b, boolean):android.animation.ValueAnimator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017f, code lost:
        if (r15 != 2048) goto L_0x0181;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.lynx.tasm.behavior.ui.LynxBaseUI r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, android.graphics.Rect r64) {
        /*
        // Method dump skipped, instructions count: 759
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.a.c.a.a(com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, android.graphics.Rect):void");
    }
}
