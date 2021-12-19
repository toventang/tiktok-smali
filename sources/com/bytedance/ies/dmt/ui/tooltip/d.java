package com.bytedance.ies.dmt.ui.tooltip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;

public final class d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f33559i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f33560a;

    /* renamed from: b  reason: collision with root package name */
    public int f33561b;

    /* renamed from: c  reason: collision with root package name */
    public final b f33562c = new b();

    /* renamed from: d  reason: collision with root package name */
    public final int f33563d;

    /* renamed from: e  reason: collision with root package name */
    public int f33564e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f33565f;

    /* renamed from: g  reason: collision with root package name */
    public final View f33566g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f33567h;

    /* renamed from: j  reason: collision with root package name */
    private int f33568j;

    /* renamed from: k  reason: collision with root package name */
    private int f33569k;

    /* renamed from: l  reason: collision with root package name */
    private c f33570l;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f33571a;

        /* renamed from: b  reason: collision with root package name */
        public int f33572b;

        /* renamed from: c  reason: collision with root package name */
        public int f33573c;

        /* renamed from: d  reason: collision with root package name */
        public int f33574d;

        static {
            Covode.recordClassIndex(20009);
        }
    }

    static {
        Covode.recordClassIndex(20007);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20008);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final int b() {
        return n.b(this.f33565f) + n.e(this.f33565f);
    }

    private final int a() {
        if (this.f33567h) {
            return this.f33564e + n.e(this.f33565f);
        }
        return this.f33564e;
    }

    public final boolean a(b bVar) {
        l.d(bVar, "");
        this.f33566g.measure(0, 0);
        this.f33560a = this.f33566g.getMeasuredWidth();
        this.f33561b = this.f33566g.getMeasuredHeight();
        if (this.f33570l.f33550e == null) {
            return a(this.f33570l.f33552g, bVar, 0, 0, this.f33570l.s, this.f33570l.t);
        }
        View view = this.f33570l.f33550e;
        if (view == null) {
            l.b();
        }
        int width = view.getWidth();
        View view2 = this.f33570l.f33550e;
        if (view2 == null) {
            l.b();
        }
        int height = view2.getHeight();
        int[] iArr = new int[2];
        View view3 = this.f33570l.f33550e;
        if (view3 == null) {
            l.b();
        }
        view3.getLocationInWindow(iArr);
        return a(this.f33570l.f33552g, bVar, width, height, iArr[0], iArr[1]);
    }

    private final void a(int i2, b bVar) {
        if (i2 == 48 || i2 == 80) {
            int i3 = this.f33568j;
            float f2 = ((float) bVar.f33573c) - (((float) i3) / 2.0f);
            int i4 = this.f33564e;
            int i5 = this.f33563d;
            if (f2 < ((float) (i4 + i5))) {
                f2 = ((float) i4) + ((float) i5);
            } else if (((float) i3) + f2 + ((float) i5) > ((float) (n.a(this.f33565f) - this.f33564e))) {
                f2 = ((float) ((n.a(this.f33565f) - this.f33564e) - this.f33568j)) - ((float) this.f33563d);
            }
            int i6 = bVar.f33571a;
            int i7 = this.f33563d;
            if (f2 < ((float) (i6 + i7))) {
                bVar.f33571a = h.g.a.a(f2) - this.f33563d;
            } else if (((float) this.f33568j) + f2 + ((float) i7) > ((float) (bVar.f33571a + this.f33560a))) {
                bVar.f33571a = ((h.g.a.a(f2) + this.f33568j) + this.f33563d) - this.f33560a;
            }
            bVar.f33573c = h.g.a.a((((float) this.f33568j) / 2.0f) + f2);
            float f3 = (f2 - ((float) bVar.f33571a)) - ((float) this.f33563d);
            if (i2 == 48) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f33566g.findViewById(R.id.lm);
                l.b(relativeLayout, "");
                relativeLayout.setX(f3);
                return;
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f33566g.findViewById(R.id.m1);
            l.b(relativeLayout2, "");
            relativeLayout2.setX(f3);
        } else if (i2 == 8388611 || i2 == 8388613) {
            float f4 = ((float) bVar.f33574d) - (((float) this.f33568j) / 2.0f);
            int a2 = a();
            int i8 = this.f33563d;
            if (f4 < ((float) (a2 + i8))) {
                f4 = ((float) a()) + ((float) this.f33563d);
            } else if (((float) this.f33568j) + f4 + ((float) i8) > ((float) (b() - this.f33564e))) {
                f4 = ((float) ((b() - this.f33564e) - this.f33568j)) - ((float) this.f33563d);
            }
            int i9 = bVar.f33572b;
            int i10 = this.f33563d;
            if (f4 < ((float) (i9 + i10))) {
                bVar.f33572b = ((int) f4) - i10;
            } else {
                float f5 = ((float) this.f33568j) + f4 + ((float) i10);
                int i11 = bVar.f33572b;
                int i12 = this.f33561b;
                if (f5 > ((float) (i11 + i12))) {
                    bVar.f33572b = ((((int) f4) + this.f33568j) + this.f33563d) - i12;
                }
            }
            bVar.f33574d = h.g.a.a((((float) this.f33568j) / 2.0f) + f4);
            float f6 = (f4 - ((float) bVar.f33572b)) - ((float) this.f33563d);
            if (i2 == 8388611) {
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f33566g.findViewById(R.id.lp);
                l.b(relativeLayout3, "");
                relativeLayout3.setY(f6);
                return;
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) this.f33566g.findViewById(R.id.ly);
            l.b(relativeLayout4, "");
            relativeLayout4.setY(f6);
        }
    }

    public final void a(b bVar, boolean z) {
        AnimatorSet animatorSet;
        l.d(bVar, "");
        if (this.f33570l.o) {
            if (this.f33570l.C != null) {
                m<? super View, ? super Boolean, AnimatorSet> mVar = this.f33570l.C;
                if (mVar == null) {
                    l.b();
                }
                animatorSet = mVar.invoke(this.f33566g, Boolean.valueOf(z));
            } else {
                float f2 = 1.0f;
                float f3 = 0.0f;
                if (z) {
                    f2 = 0.0f;
                    f3 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f33566g, "scaleX", f2, f3);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f33566g, "scaleY", f2, f3);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f33566g, "alpha", f2, f3);
                animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                if (z) {
                    animatorSet.setInterpolator(this.f33570l.q);
                } else {
                    animatorSet.setInterpolator(this.f33570l.r);
                }
            }
            animatorSet.setDuration(this.f33570l.n);
            this.f33566g.setPivotX((float) (bVar.f33573c - bVar.f33571a));
            this.f33566g.setPivotY((float) (bVar.f33574d - bVar.f33572b));
            animatorSet.start();
        }
    }

    private final boolean a(int i2, b bVar, int i3) {
        if (i3 == 0) {
            if (i2 == 48 || i2 == 80) {
                if (bVar.f33572b < a()) {
                    bVar.f33572b = a();
                    return false;
                } else if (bVar.f33572b + this.f33561b <= b() - this.f33564e) {
                    return true;
                } else {
                    bVar.f33572b = (b() - this.f33564e) - this.f33561b;
                    return false;
                }
            } else if (i2 == 8388611 || i2 == 8388613) {
                if (bVar.f33572b < a()) {
                    bVar.f33572b = a();
                } else if (bVar.f33572b + this.f33561b > b() - this.f33564e) {
                    bVar.f33572b = (b() - this.f33561b) - this.f33564e;
                }
            }
        } else if (i2 == 48 || i2 == 80) {
            int i4 = bVar.f33571a;
            int i5 = this.f33564e;
            if (i4 < i5) {
                bVar.f33571a = i5;
            } else if (bVar.f33571a + this.f33560a > n.a(this.f33565f) - this.f33564e) {
                bVar.f33571a = (n.a(this.f33565f) - this.f33560a) - this.f33564e;
            }
        } else if (i2 == 8388611 || i2 == 8388613) {
            int i6 = bVar.f33571a;
            int i7 = this.f33564e;
            if (i6 < i7) {
                bVar.f33571a = i7;
                return false;
            } else if (bVar.f33571a + this.f33560a <= n.a(this.f33565f) - this.f33564e) {
                return true;
            } else {
                bVar.f33571a = (n.a(this.f33565f) - this.f33560a) - this.f33564e;
                return false;
            }
        }
        return true;
    }

    public d(Context context, c cVar, View view, boolean z) {
        l.d(context, "");
        l.d(cVar, "");
        l.d(view, "");
        this.f33565f = context;
        this.f33566g = view;
        this.f33567h = z;
        this.f33568j = h.g.a.a(n.b(context, 36.0f));
        this.f33569k = h.g.a.a(n.b(context, 1.0f));
        int a2 = h.g.a.a(n.b(context, 4.0f));
        this.f33563d = a2;
        this.f33564e = a2;
        this.f33570l = cVar;
    }

    private final boolean a(int i2, b bVar, int i3, int i4, int i5, int i6) {
        if (i2 == 48) {
            int i7 = ((i5 + i5) + i3) / 2;
            bVar.f33571a = (i7 - (this.f33560a / 2)) + this.f33570l.f33553h;
            bVar.f33572b = ((i6 - this.f33561b) + this.f33570l.f33554i) - this.f33569k;
            a(i2, bVar, 1);
            bVar.f33573c = i7 + this.f33570l.f33555j;
            bVar.f33574d = (i6 + this.f33570l.f33554i) - this.f33569k;
            a(i2, bVar);
            return a(i2, bVar, 0);
        } else if (i2 == 80) {
            int i8 = ((i5 + i5) + i3) / 2;
            bVar.f33571a = (i8 - (this.f33560a / 2)) + this.f33570l.f33553h;
            int i9 = i6 + i4;
            bVar.f33572b = this.f33570l.f33554i + i9 + this.f33569k;
            a(i2, bVar, 1);
            bVar.f33573c = i8 + this.f33570l.f33555j;
            bVar.f33574d = i9 + this.f33570l.f33554i + this.f33569k;
            a(i2, bVar);
            return a(this.f33570l.f33552g, bVar, 0);
        } else if (i2 == 8388611) {
            bVar.f33571a = ((i5 - this.f33560a) + this.f33570l.f33553h) - this.f33569k;
            int i10 = ((i6 + i6) + i4) / 2;
            bVar.f33572b = (i10 - (this.f33561b / 2)) + this.f33570l.f33554i;
            a(i2, bVar, 0);
            bVar.f33573c = (i5 + this.f33570l.f33553h) - this.f33569k;
            bVar.f33574d = i10 + this.f33570l.f33555j;
            a(i2, bVar);
            return a(i2, bVar, 1);
        } else if (i2 != 8388613) {
            return false;
        } else {
            bVar.f33571a = i5 + i3 + this.f33570l.f33553h + this.f33569k;
            int i11 = ((i6 + i6) + i4) / 2;
            bVar.f33572b = (i11 - (this.f33561b / 2)) + this.f33570l.f33554i;
            a(i2, bVar, 0);
            bVar.f33573c = bVar.f33571a + this.f33570l.f33553h;
            bVar.f33574d = i11 + this.f33570l.f33555j;
            a(i2, bVar);
            return a(i2, bVar, 1);
        }
    }
}
