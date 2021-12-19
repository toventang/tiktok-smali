package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.a.f;
import androidx.core.widget.b;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class s {

    /* renamed from: a  reason: collision with root package name */
    final t f1687a;

    /* renamed from: b  reason: collision with root package name */
    int f1688b;

    /* renamed from: c  reason: collision with root package name */
    Typeface f1689c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1690d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f1691e;

    /* renamed from: f  reason: collision with root package name */
    private aj f1692f;

    /* renamed from: g  reason: collision with root package name */
    private aj f1693g;

    /* renamed from: h  reason: collision with root package name */
    private aj f1694h;

    /* renamed from: i  reason: collision with root package name */
    private aj f1695i;

    /* renamed from: j  reason: collision with root package name */
    private aj f1696j;

    /* renamed from: k  reason: collision with root package name */
    private aj f1697k;

    static {
        Covode.recordClassIndex(515);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.f1691e.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public final void a(int[] iArr, int i2) {
        this.f1687a.a(iArr, i2);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (!b.f2633d) {
            this.f1687a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!(this.f1692f == null && this.f1693g == null && this.f1694h == null && this.f1695i == null)) {
            Drawable[] compoundDrawables = this.f1691e.getCompoundDrawables();
            a(compoundDrawables[0], this.f1692f);
            a(compoundDrawables[1], this.f1693g);
            a(compoundDrawables[2], this.f1694h);
            a(compoundDrawables[3], this.f1695i);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (this.f1696j != null || this.f1697k != null) {
            Drawable[] compoundDrawablesRelative = this.f1691e.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1696j);
            a(compoundDrawablesRelative[2], this.f1697k);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.f1687a.a(i2);
    }

    s(TextView textView) {
        this.f1691e = textView;
        this.f1687a = new t(textView);
    }

    private void b(int i2, float f2) {
        this.f1687a.a(i2, f2);
    }

    private void a(Drawable drawable, aj ajVar) {
        if (drawable != null && ajVar != null) {
            h.a(drawable, ajVar, this.f1691e.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2) {
        if (!b.f2633d && !this.f1687a.b()) {
            b(i2, f2);
        }
    }

    private void a(Context context, al alVar) {
        String d2;
        this.f1688b = alVar.a(2, this.f1688b);
        int i2 = 10;
        boolean z = false;
        if (alVar.f(10) || alVar.f(11)) {
            this.f1689c = null;
            if (alVar.f(11)) {
                i2 = 11;
            }
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f1691e);
                try {
                    Typeface a2 = alVar.a(i2, this.f1688b, new f.a() {
                        /* class androidx.appcompat.widget.s.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(516);
                        }

                        @Override // androidx.core.content.a.f.a
                        public final void a(Typeface typeface) {
                            s sVar = s.this;
                            WeakReference weakReference = weakReference;
                            if (sVar.f1690d) {
                                sVar.f1689c = typeface;
                                TextView textView = (TextView) weakReference.get();
                                if (textView != null) {
                                    textView.setTypeface(typeface, sVar.f1688b);
                                }
                            }
                        }
                    });
                    this.f1689c = a2;
                    if (a2 == null) {
                        z = true;
                    }
                    this.f1690d = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1689c == null && (d2 = alVar.d(i2)) != null) {
                this.f1689c = Typeface.create(d2, this.f1688b);
            }
        } else if (alVar.f(1)) {
            this.f1690d = false;
            int a3 = alVar.a(1, 1);
            if (a3 == 1) {
                this.f1689c = Typeface.SANS_SERIF;
            } else if (a3 == 2) {
                this.f1689c = Typeface.SERIF;
            } else if (a3 == 3) {
                this.f1689c = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, int i2) {
        ColorStateList e2;
        al a2 = al.a(context, i2, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
        if (a2.f(12)) {
            a(a2.a(12, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.f(3) && (e2 = a2.e(3)) != null) {
            this.f1691e.setTextColor(e2);
        }
        if (a2.f(0) && a2.e(0, -1) == 0) {
            this.f1691e.setTextSize(0, 0.0f);
        }
        a(context, a2);
        a2.f1549a.recycle();
        Typeface typeface = this.f1689c;
        if (typeface != null) {
            this.f1691e.setTypeface(typeface, this.f1688b);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        ColorStateList colorStateList3;
        boolean z2;
        Context context = this.f1691e.getContext();
        h a2 = h.a();
        al a3 = al.a(context, attributeSet, new int[]{16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667}, i2, 0);
        int g2 = a3.g(0, -1);
        if (a3.f(3)) {
            this.f1692f = a(context, a2, a3.g(3, 0));
        }
        if (a3.f(1)) {
            this.f1693g = a(context, a2, a3.g(1, 0));
        }
        if (a3.f(4)) {
            this.f1694h = a(context, a2, a3.g(4, 0));
        }
        if (a3.f(2)) {
            this.f1695i = a(context, a2, a3.g(2, 0));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (a3.f(5)) {
            this.f1696j = a(context, a2, a3.g(5, 0));
        }
        if (a3.f(6)) {
            this.f1697k = a(context, a2, a3.g(6, 0));
        }
        a3.f1549a.recycle();
        boolean z3 = this.f1691e.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g2 != -1) {
            al a4 = al.a(context, g2, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
            if (z3 || !a4.f(12)) {
                z = false;
                z2 = false;
            } else {
                z = a4.a(12, false);
                z2 = true;
            }
            a(context, a4);
            if (Build.VERSION.SDK_INT < 23) {
                if (a4.f(3)) {
                    colorStateList2 = a4.e(3);
                } else {
                    colorStateList2 = null;
                }
                if (a4.f(4)) {
                    colorStateList3 = a4.e(4);
                } else {
                    colorStateList3 = null;
                }
                if (a4.f(5)) {
                    colorStateList = a4.e(5);
                } else {
                    colorStateList = null;
                }
            } else {
                colorStateList2 = null;
                colorStateList = null;
                colorStateList3 = null;
            }
            a4.f1549a.recycle();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            z = false;
            colorStateList3 = null;
            z2 = false;
        }
        al a5 = al.a(context, attributeSet, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm}, i2, 0);
        if (!z3 && a5.f(12)) {
            z = a5.a(12, false);
            z2 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a5.f(3)) {
                colorStateList2 = a5.e(3);
            }
            if (a5.f(4)) {
                colorStateList3 = a5.e(4);
            }
            if (a5.f(5)) {
                colorStateList = a5.e(5);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a5.f(0) && a5.e(0, -1) == 0) {
            this.f1691e.setTextSize(0, 0.0f);
        }
        a(context, a5);
        a5.f1549a.recycle();
        if (colorStateList2 != null) {
            this.f1691e.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            this.f1691e.setHintTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f1691e.setLinkTextColor(colorStateList);
        }
        if (!z3 && z2) {
            a(z);
        }
        Typeface typeface = this.f1689c;
        if (typeface != null) {
            this.f1691e.setTypeface(typeface, this.f1688b);
        }
        this.f1687a.a(attributeSet, i2);
        if (b.f2633d && this.f1687a.f1702a != 0) {
            int[] iArr = this.f1687a.f1706e;
            if (iArr.length > 0) {
                if (((float) this.f1691e.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f1691e.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f1687a.f1704c), Math.round(this.f1687a.f1705d), Math.round(this.f1687a.f1703b), 0);
                } else {
                    this.f1691e.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
                }
            }
        }
        al a6 = al.a(context, attributeSet, new int[]{16842804, R.attr.is, R.attr.it, R.attr.iu, R.attr.iv, R.attr.iw, R.attr.u2, R.attr.ui, R.attr.z9, R.attr.a2g, R.attr.ahm});
        int e2 = a6.e(6, -1);
        int e3 = a6.e(8, -1);
        int e4 = a6.e(9, -1);
        a6.f1549a.recycle();
        if (e2 != -1) {
            h.c(this.f1691e, e2);
        }
        if (e3 != -1) {
            h.d(this.f1691e, e3);
        }
        if (e4 != -1) {
            h.e(this.f1691e, e4);
        }
    }

    private static aj a(Context context, h hVar, int i2) {
        ColorStateList b2 = hVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        aj ajVar = new aj();
        ajVar.f1547d = true;
        ajVar.f1544a = b2;
        return ajVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, int i5) {
        this.f1687a.a(i2, i3, i4, i5);
    }
}
