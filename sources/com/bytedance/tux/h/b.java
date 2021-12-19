package com.bytedance.tux.h;

import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Pair;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f45088b = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Method> f45089k = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public boolean f45090a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45091c;

    /* renamed from: d  reason: collision with root package name */
    private int f45092d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f45093e = -1;

    /* renamed from: f  reason: collision with root package name */
    private final int f45094f = 1;

    /* renamed from: g  reason: collision with root package name */
    private final RectF f45095g = new RectF();

    /* renamed from: h  reason: collision with root package name */
    private int[] f45096h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    private TextPaint f45097i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f45098j;

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_tux_tools_TuxAutoSizeHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_tux_tools_TuxAutoSizeHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27502);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(int i2, int i3) {
        b(i2, i3);
        if (c()) {
            b();
        }
    }

    private final boolean a(int i2, RectF rectF) {
        StaticLayout a2;
        CharSequence transformation;
        CharSequence text = this.f45098j.getText();
        TransformationMethod transformationMethod = this.f45098j.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f45098j)) == null)) {
            text = transformation;
        }
        int maxLines = this.f45098j.getMaxLines();
        TextPaint textPaint = this.f45097i;
        if (textPaint == null) {
            textPaint = new TextPaint();
        }
        textPaint.reset();
        textPaint.set(this.f45098j.getPaint());
        textPaint.setTextSize((float) i2);
        this.f45097i = textPaint;
        Layout.Alignment alignment = (Layout.Alignment) a(this.f45098j, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            l.a((Object) text, "");
            a2 = a(text, alignment, h.g.a.a(rectF.right), maxLines);
        } else {
            l.a((Object) text, "");
            a2 = a(text, alignment, h.g.a.a(rectF.right));
        }
        if (maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) {
            return true;
        }
        return false;
    }

    public final void a() {
        this.f45092d = -1;
        this.f45093e = -1;
        this.f45096h = new int[0];
        this.f45091c = false;
    }

    static {
        Covode.recordClassIndex(27501);
    }

    private final boolean c() {
        int i2 = this.f45092d;
        int i3 = 1;
        while (true) {
            int i4 = this.f45094f;
            if (i2 + i4 > this.f45093e) {
                break;
            }
            i3++;
            i2 += i4;
        }
        int[] iArr = new int[i3];
        int i5 = this.f45092d;
        for (int i6 = 0; i6 < i3; i6++) {
            iArr[i6] = i5;
            i5 += this.f45094f;
        }
        this.f45096h = iArr;
        this.f45091c = true;
        return true;
    }

    public final void b() {
        int measuredWidth;
        MethodCollector.i(7832);
        if (this.f45091c) {
            if (this.f45098j.getMeasuredHeight() <= 0 || this.f45098j.getMeasuredWidth() <= 0) {
                MethodCollector.o(7832);
                return;
            }
            if (((Boolean) a((Object) this.f45098j, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                measuredWidth = 1048576;
            } else {
                measuredWidth = (this.f45098j.getMeasuredWidth() - this.f45098j.getTotalPaddingLeft()) - this.f45098j.getTotalPaddingRight();
            }
            if (!this.f45090a || this.f45098j.getMinWidth() == this.f45098j.getMeasuredWidth()) {
                int height = (this.f45098j.getHeight() - this.f45098j.getCompoundPaddingBottom()) - this.f45098j.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    MethodCollector.o(7832);
                    return;
                }
                synchronized (this.f45095g) {
                    try {
                        this.f45095g.setEmpty();
                        this.f45095g.right = (float) measuredWidth;
                        this.f45095g.bottom = (float) height;
                        float a2 = (float) a(this.f45095g);
                        if (a2 != this.f45098j.getTextSize()) {
                            a(a2);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(7832);
                        throw th;
                    }
                }
            } else {
                MethodCollector.o(7832);
                return;
            }
        }
        this.f45091c = true;
        MethodCollector.o(7832);
    }

    public b(TextView textView) {
        l.c(textView, "");
        this.f45098j = textView;
    }

    private final int a(RectF rectF) {
        int length = this.f45096h.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (a(this.f45096h[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f45096h[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.".toString());
    }

    private static Method a(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f45089k;
            Method method = concurrentHashMap.get(str);
            if (method != null) {
                return method;
            }
            Method declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    private final void a(float f2) {
        TextPaint paint = this.f45098j.getPaint();
        l.a((Object) paint, "");
        if (f2 != paint.getTextSize()) {
            TextPaint paint2 = this.f45098j.getPaint();
            l.a((Object) paint2, "");
            paint2.setTextSize(f2);
            int i2 = Build.VERSION.SDK_INT;
            boolean isInLayout = this.f45098j.isInLayout();
            if (this.f45098j.getLayout() != null) {
                this.f45091c = false;
                try {
                    Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a(a2, this.f45098j, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f45098j.requestLayout();
                } else {
                    this.f45098j.forceLayout();
                }
                this.f45098j.invalidate();
            }
        }
    }

    private final void b(int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(("Minimum auto-size text size ( " + i2 + " px) is less or equal to (0px)").toString());
        } else if (i3 > i2) {
            this.f45092d = i2;
            this.f45093e = i3;
        } else {
            throw new IllegalArgumentException(("Maximum auto-size text size ( " + i3 + " px) is less or equal to minimum auto-size text size ( " + i2 + " px)").toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T a(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            java.lang.reflect.Method r1 = a(r3)     // Catch:{ Exception -> 0x000f, all -> 0x0015 }
            if (r1 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000f, all -> 0x0015 }
            java.lang.Object r0 = a(r1, r2, r0)     // Catch:{ Exception -> 0x000f, all -> 0x0015 }
            goto L_0x0010
        L_0x000f:
            r0 = r4
        L_0x0010:
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            return r4
        L_0x0013:
            r4 = r0
            goto L_0x0012
        L_0x0015:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.h.b.a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private final StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        float lineSpacingMultiplier = this.f45098j.getLineSpacingMultiplier();
        float lineSpacingExtra = this.f45098j.getLineSpacingExtra();
        boolean includeFontPadding = this.f45098j.getIncludeFontPadding();
        TextPaint textPaint = this.f45097i;
        if (textPaint == null) {
            textPaint = new TextPaint();
        }
        return new StaticLayout(charSequence, textPaint, i2, alignment, lineSpacingMultiplier, lineSpacingExtra, includeFontPadding);
    }

    private final StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) a(this.f45098j, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        int length = charSequence.length();
        TextPaint textPaint = this.f45097i;
        if (textPaint == null) {
            textPaint = new TextPaint();
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, i2);
        l.a((Object) obtain, "");
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f45098j.getLineSpacingExtra(), this.f45098j.getLineSpacingMultiplier()).setIncludePad(this.f45098j.getIncludeFontPadding()).setBreakStrategy(this.f45098j.getBreakStrategy()).setHyphenationFrequency(this.f45098j.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        StaticLayout build = hyphenationFrequency.setMaxLines(i3).setTextDirection(textDirectionHeuristic).build();
        l.a((Object) build, "");
        return build;
    }
}
