package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class t {

    /* renamed from: f  reason: collision with root package name */
    private static final RectF f1700f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1701g = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f1702a;

    /* renamed from: b  reason: collision with root package name */
    float f1703b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    float f1704c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    float f1705d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1706e = new int[0];

    /* renamed from: h  reason: collision with root package name */
    private boolean f1707h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1708i;

    /* renamed from: j  reason: collision with root package name */
    private TextPaint f1709j;

    /* renamed from: k  reason: collision with root package name */
    private final TextView f1710k;

    /* renamed from: l  reason: collision with root package name */
    private final Context f1711l;

    /* access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1711l.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.is, R.attr.it, R.attr.iu, R.attr.iv, R.attr.iw, R.attr.u2, R.attr.ui, R.attr.z9, R.attr.a2g, R.attr.ahm}, i2, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f1702a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!f()) {
            this.f1702a = 0;
        } else if (this.f1702a == 1) {
            if (!this.f1708i) {
                DisplayMetrics displayMetrics = this.f1711l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a(dimension2, dimension3, dimension);
            }
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (!f()) {
            return;
        }
        if (i2 == 0) {
            e();
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = this.f1711l.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (d()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(i2)));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, int i5) {
        if (f()) {
            DisplayMetrics displayMetrics = this.f1711l.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (d()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int[] iArr, int i2) {
        if (f()) {
            int length = iArr.length;
            int i3 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1711l.getResources().getDisplayMetrics();
                    do {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                        i3++;
                    } while (i3 < length);
                }
                this.f1706e = a(iArr2);
                if (!c()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1708i = false;
            }
            if (d()) {
                a();
            }
        }
    }

    private static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            int i3 = iArr[i2];
            if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                arrayList.add(Integer.valueOf(i3));
            }
            i2++;
        } while (i2 < length);
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        return iArr2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int measuredWidth;
        if (b()) {
            if (this.f1707h) {
                if (this.f1710k.getMeasuredHeight() > 0 && this.f1710k.getMeasuredWidth() > 0) {
                    if (((Boolean) a((Object) this.f1710k, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f1710k.getMeasuredWidth() - this.f1710k.getTotalPaddingLeft()) - this.f1710k.getTotalPaddingRight();
                    }
                    int height = (this.f1710k.getHeight() - this.f1710k.getCompoundPaddingBottom()) - this.f1710k.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1700f;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float a2 = (float) a(rectF);
                            if (a2 != this.f1710k.getTextSize()) {
                                a(0, a2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1707h = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2) {
        Resources resources;
        Context context = this.f1711l;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        a(TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics()));
    }

    private boolean a(int i2, RectF rectF) {
        StaticLayout a2;
        CharSequence transformation;
        CharSequence text = this.f1710k.getText();
        TransformationMethod transformationMethod = this.f1710k.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1710k)) == null)) {
            text = transformation;
        }
        int i3 = Build.VERSION.SDK_INT;
        int maxLines = this.f1710k.getMaxLines();
        TextPaint textPaint = this.f1709j;
        if (textPaint == null) {
            this.f1709j = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1709j.set(this.f1710k.getPaint());
        this.f1709j.setTextSize((float) i2);
        Layout.Alignment alignment = (Layout.Alignment) a(this.f1710k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            a2 = a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            a2 = a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && ((float) a2.getHeight()) <= rectF.bottom;
    }

    private boolean f() {
        if (!(this.f1710k instanceof AppCompatEditText)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (!f() || this.f1702a == 0) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(517);
    }

    private boolean c() {
        boolean z;
        int[] iArr = this.f1706e;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1708i = z;
        if (z) {
            this.f1702a = 1;
            this.f1704c = (float) iArr[0];
            this.f1705d = (float) iArr[length - 1];
            this.f1703b = -1.0f;
        }
        return z;
    }

    private void e() {
        this.f1702a = 0;
        this.f1704c = -1.0f;
        this.f1705d = -1.0f;
        this.f1703b = -1.0f;
        this.f1706e = new int[0];
        this.f1707h = false;
    }

    private boolean d() {
        if (!f() || this.f1702a != 1) {
            this.f1707h = false;
        } else {
            if (!this.f1708i || this.f1706e.length == 0) {
                float round = (float) Math.round(this.f1704c);
                int i2 = 1;
                while (Math.round(this.f1703b + round) <= Math.round(this.f1705d)) {
                    i2++;
                    round += this.f1703b;
                }
                int[] iArr = new int[i2];
                float f2 = this.f1704c;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Math.round(f2);
                    f2 += this.f1703b;
                }
                this.f1706e = a(iArr);
            }
            this.f1707h = true;
        }
        return this.f1707h;
    }

    t(TextView textView) {
        this.f1710k = textView;
        this.f1711l = textView.getContext();
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            int i2 = 0;
            do {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
                i2++;
            } while (i2 < length);
            this.f1706e = a(iArr);
            c();
        }
    }

    private int a(RectF rectF) {
        int length = this.f1706e.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (a(this.f1706e[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f1706e[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method a(String str) {
        try {
            Method method = f1701g.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1701g.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    private void a(float f2) {
        if (f2 != this.f1710k.getPaint().getTextSize()) {
            this.f1710k.getPaint().setTextSize(f2);
            int i2 = Build.VERSION.SDK_INT;
            boolean isInLayout = this.f1710k.isInLayout();
            if (this.f1710k.getLayout() != null) {
                this.f1707h = false;
                try {
                    Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a2.invoke(this.f1710k, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f1710k.requestLayout();
                } else {
                    this.f1710k.forceLayout();
                }
                this.f1710k.invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T a(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            java.lang.reflect.Method r1 = a(r3)     // Catch:{ Exception -> 0x000b, all -> 0x000c }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000b, all -> 0x000c }
            java.lang.Object r4 = r1.invoke(r2, r0)     // Catch:{ Exception -> 0x000b, all -> 0x000c }
        L_0x000b:
            return r4
        L_0x000c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t.a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return new StaticLayout(charSequence, this.f1709j, i2, alignment, this.f1710k.getLineSpacingMultiplier(), this.f1710k.getLineSpacingExtra(), this.f1710k.getIncludeFontPadding());
    }

    private void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f1702a = 1;
            this.f1704c = f2;
            this.f1705d = f3;
            this.f1703b = f4;
            this.f1708i = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) a(this.f1710k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1709j, i2).setAlignment(alignment).setLineSpacing(this.f1710k.getLineSpacingExtra(), this.f1710k.getLineSpacingMultiplier()).setIncludePad(this.f1710k.getIncludeFontPadding()).setBreakStrategy(this.f1710k.getBreakStrategy()).setHyphenationFrequency(this.f1710k.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i3).setTextDirection(textDirectionHeuristic).build();
    }
}
