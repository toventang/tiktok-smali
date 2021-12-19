package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public final class FlexLayout extends ViewGroup {
    private static final i A;
    private static final g B;
    private static final ag C;
    private static final ab D;
    private static final aa E;
    private static final af F;
    private static final ae G;
    private static final ad H;
    private static final ac I;
    private static final p J;
    private static final q K;
    private static final t L;
    private static final n M;
    private static final o N;
    private static final m O;
    private static final r P;
    private static final s Q;
    private static final ah R;
    private static final aj S;
    private static final al T;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f45583a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<String, Integer> f45584b;

    /* renamed from: c  reason: collision with root package name */
    public static int f45585c = 251789312;

    /* renamed from: d  reason: collision with root package name */
    public static final j f45586d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f45587e;

    /* renamed from: f  reason: collision with root package name */
    public static final f f45588f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f45589g;

    /* renamed from: h  reason: collision with root package name */
    public static final u f45590h;

    /* renamed from: i  reason: collision with root package name */
    public static final v f45591i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f45592j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f45593k;

    /* renamed from: l  reason: collision with root package name */
    public static final e f45594l;

    /* renamed from: m  reason: collision with root package name */
    public static final ai f45595m;
    public static final ak n;
    public static final List<an> o;
    public static final a p = new a((byte) 0);
    private static final w u;
    private static final l v;
    private static final y w;
    private static final b x;
    private static final z y;
    private static final x z;
    private int q;
    private int r;
    private int s;
    private int t;

    public static final class am extends ViewGroup.LayoutParams {
        public static final int[] u = {16842996, 16842997};
        public static final a v = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public ao f45596a;

        /* renamed from: b  reason: collision with root package name */
        public ao f45597b;

        /* renamed from: c  reason: collision with root package name */
        public ao f45598c;

        /* renamed from: d  reason: collision with root package name */
        public ao f45599d;

        /* renamed from: e  reason: collision with root package name */
        public ao f45600e;

        /* renamed from: f  reason: collision with root package name */
        public ao f45601f;

        /* renamed from: g  reason: collision with root package name */
        public ao f45602g;

        /* renamed from: h  reason: collision with root package name */
        public ao f45603h;

        /* renamed from: i  reason: collision with root package name */
        public float f45604i;

        /* renamed from: j  reason: collision with root package name */
        public float f45605j;

        /* renamed from: k  reason: collision with root package name */
        public float f45606k;

        /* renamed from: l  reason: collision with root package name */
        public float f45607l;

        /* renamed from: m  reason: collision with root package name */
        public float f45608m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public String t = "";

        public static final class a {
            static {
                Covode.recordClassIndex(27749);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public final boolean g() {
            if (!h() || !i()) {
                return false;
            }
            return true;
        }

        static {
            Covode.recordClassIndex(27748);
        }

        private final boolean h() {
            int i2;
            float f2 = this.f45604i;
            if (f2 == f2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            float f3 = this.f45605j;
            if (f3 == f3) {
                i2++;
            }
            float f4 = this.o;
            if (f4 == f4) {
                i2++;
            }
            float f5 = this.f45608m;
            if (f5 == f5) {
                i2++;
            }
            if (i2 >= 2) {
                return true;
            }
            return false;
        }

        private final boolean i() {
            int i2;
            float f2 = this.f45606k;
            if (f2 == f2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            float f3 = this.f45607l;
            if (f3 == f3) {
                i2++;
            }
            float f4 = this.p;
            if (f4 == f4) {
                i2++;
            }
            float f5 = this.n;
            if (f5 == f5) {
                i2++;
            }
            if (i2 >= 2) {
                return true;
            }
            return false;
        }

        public final float a() {
            float f2 = this.f45604i;
            if (f2 == f2) {
                return f2;
            }
            float f3 = this.o;
            if (f3 == f3) {
                float f4 = this.f45605j;
                if (f4 == f4) {
                    return f4 - f3;
                }
                float f5 = this.f45608m;
                if (f5 == f5) {
                    return f5 - (f3 / 2.0f);
                }
            }
            float f6 = this.f45608m;
            if (f6 != f6) {
                return Float.NaN;
            }
            float f7 = this.f45605j;
            if (f7 == f7) {
                return (f6 * 2.0f) - f7;
            }
            return Float.NaN;
        }

        public final float b() {
            float f2 = this.f45605j;
            if (f2 == f2) {
                return f2;
            }
            float f3 = this.o;
            if (f3 == f3) {
                float f4 = this.f45604i;
                if (f4 == f4) {
                    return f4 + f3;
                }
                float f5 = this.f45608m;
                if (f5 == f5) {
                    return f5 + (f3 / 2.0f);
                }
            }
            float f6 = this.f45608m;
            if (f6 != f6) {
                return Float.NaN;
            }
            float f7 = this.f45604i;
            if (f7 == f7) {
                return (f6 * 2.0f) - f7;
            }
            return Float.NaN;
        }

        public final float c() {
            float f2 = this.f45606k;
            if (f2 == f2) {
                return f2;
            }
            float f3 = this.p;
            if (f3 == f3) {
                float f4 = this.f45607l;
                if (f4 == f4) {
                    return f4 - f3;
                }
                float f5 = this.n;
                if (f5 == f5) {
                    return f5 - (f3 / 2.0f);
                }
            }
            float f6 = this.n;
            if (f6 != f6) {
                return Float.NaN;
            }
            float f7 = this.f45607l;
            if (f7 == f7) {
                return (f6 * 2.0f) - f7;
            }
            return Float.NaN;
        }

        public final float d() {
            float f2 = this.f45607l;
            if (f2 == f2) {
                return f2;
            }
            float f3 = this.p;
            if (f3 == f3) {
                float f4 = this.f45606k;
                if (f4 == f4) {
                    return f4 + f3;
                }
                float f5 = this.n;
                if (f5 == f5) {
                    return f5 + (f3 / 2.0f);
                }
            }
            float f6 = this.n;
            if (f6 != f6) {
                return Float.NaN;
            }
            float f7 = this.f45606k;
            if (f7 == f7) {
                return (f6 * 2.0f) - f7;
            }
            return Float.NaN;
        }

        public final float e() {
            float f2 = this.o;
            if (f2 == f2) {
                return f2;
            }
            float f3 = this.f45604i;
            if (f3 == f3) {
                float f4 = this.f45605j;
                if (f4 == f4) {
                    return f4 - f3;
                }
                float f5 = this.f45608m;
                if (f5 == f5) {
                    return (f5 - f3) * 2.0f;
                }
            }
            float f6 = this.f45605j;
            if (f6 != f6) {
                return Float.NaN;
            }
            float f7 = this.f45608m;
            if (f7 == f7) {
                return (f6 - f7) * 2.0f;
            }
            return Float.NaN;
        }

        public final float f() {
            float f2 = this.p;
            if (f2 == f2) {
                return f2;
            }
            float f3 = this.f45606k;
            if (f3 == f3) {
                float f4 = this.f45607l;
                if (f4 == f4) {
                    return f4 - f3;
                }
                float f5 = this.n;
                if (f5 == f5) {
                    return (f5 - f3) * 2.0f;
                }
            }
            float f6 = this.f45607l;
            if (f6 != f6) {
                return Float.NaN;
            }
            float f7 = this.n;
            if (f7 == f7) {
                return (f6 - f7) * 2.0f;
            }
            return Float.NaN;
        }

        public am(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public am(int i2) {
            super(i2, -2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public am(Context context, AttributeSet attributeSet) {
            super(0, 0);
            String attributeValue;
            String sb;
            h.f.b.l.c(context, "");
            h.f.b.l.c(attributeSet, "");
            if (!(FlexLayout.f45584b == null || (attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "id")) == null)) {
                if (h.m.p.b(attributeValue, "@+id/", false)) {
                    sb = attributeValue.substring(5);
                    h.f.b.l.a((Object) sb, "");
                } else if (h.m.p.b(attributeValue, "@id/", false)) {
                    sb = attributeValue.substring(4);
                    h.f.b.l.a((Object) sb, "");
                } else if (h.m.p.b(attributeValue, "@android:id/", false)) {
                    StringBuilder sb2 = new StringBuilder("android:");
                    String substring = attributeValue.substring(12);
                    h.f.b.l.a((Object) substring, "");
                    sb = sb2.append(substring).toString();
                } else {
                    throw new IllegalArgumentException("unidentified id ".concat(String.valueOf(attributeValue)));
                }
                this.s = a.a(sb);
            }
            if (a.a(context)) {
                String positionDescription = attributeSet.getPositionDescription();
                h.f.b.l.a((Object) positionDescription, "");
                this.t = positionDescription;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u);
            h.f.b.l.a((Object) obtainStyledAttributes, "");
            this.width = obtainStyledAttributes.getLayoutDimension(0, -5);
            this.height = obtainStyledAttributes.getLayoutDimension(1, -5);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.zg, R.attr.zh, R.attr.zi, R.attr.a1_, R.attr.a1c, R.attr.a1j, R.attr.a1r, R.attr.a1s});
            h.f.b.l.a((Object) obtainStyledAttributes2, "");
            this.f45596a = ao.a.a(context, obtainStyledAttributes2.getString(4), "layout_left");
            this.f45598c = ao.a.a(context, obtainStyledAttributes2.getString(6), "layout_top");
            this.f45597b = ao.a.a(context, obtainStyledAttributes2.getString(5), "layout_right");
            this.f45599d = ao.a.a(context, obtainStyledAttributes2.getString(0), "layout_bottom");
            this.f45600e = ao.a.a(context, obtainStyledAttributes2.getString(1), "layout_centerX");
            this.f45601f = ao.a.a(context, obtainStyledAttributes2.getString(2), "layout_centerY");
            String string = obtainStyledAttributes2.getString(7);
            if (h.f.b.l.a((Object) string, (Object) "match_parent") || h.f.b.l.a((Object) string, (Object) "fill_parent")) {
                this.width = -1;
            } else if (h.f.b.l.a((Object) string, (Object) "wrap_content")) {
                this.width = -2;
            } else {
                this.f45602g = ao.a.a(context, string, "layout_width");
            }
            String string2 = obtainStyledAttributes2.getString(3);
            if (h.f.b.l.a((Object) string2, (Object) "match_parent") || h.f.b.l.a((Object) string2, (Object) "fill_parent")) {
                this.height = -1;
            } else if (h.f.b.l.a((Object) string2, (Object) "wrap_content")) {
                this.height = -2;
            } else {
                this.f45603h = ao.a.a(context, string2, "layout_height");
            }
            obtainStyledAttributes2.recycle();
            if (this.f45596a == null && this.f45597b == null && this.f45600e == null && this.f45602g == null && this.width == -5) {
                throw new IllegalArgumentException("no LayoutParams in layout_left|layout_right|layout_centerX|layout_width");
            } else if (this.f45598c == null && this.f45599d == null && this.f45601f == null && this.f45603h == null && this.height == -5) {
                throw new IllegalArgumentException("no LayoutParams in layout_top|layout_bottom|layout_centerY|layout_height");
            }
        }
    }

    public static abstract class an {

        /* renamed from: f  reason: collision with root package name */
        public static final a f45609f = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final String f45610a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45611b;

        /* renamed from: c  reason: collision with root package name */
        public final int f45612c;

        /* renamed from: d  reason: collision with root package name */
        public final int f45613d;

        /* renamed from: e  reason: collision with root package name */
        public final int f45614e;

        static {
            Covode.recordClassIndex(27750);
        }

        public abstract float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3);

        public static final class a {
            static {
                Covode.recordClassIndex(27751);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public String toString() {
            return this.f45610a;
        }

        public an(String str, int i2, int i3, int i4, int i5) {
            h.f.b.l.c(str, "");
            this.f45610a = str;
            this.f45611b = i2;
            this.f45612c = i3;
            this.f45613d = i4;
            this.f45614e = i5;
        }
    }

    public static final class ao {

        /* renamed from: b  reason: collision with root package name */
        public static final a f45615b = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final List<Object> f45616a;

        /* renamed from: c  reason: collision with root package name */
        private final String f45617c;

        static {
            Covode.recordClassIndex(27752);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(27753);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            public static ao a(Context context, String str, String str2) {
                h.f.b.l.c(context, "");
                h.f.b.l.c(str2, "");
                String str3 = null;
                if (str == null || str.length() == 0) {
                    return null;
                }
                aq aqVar = new aq(str, str2);
                ArrayList arrayList = new ArrayList();
                Stack stack = new Stack();
                while (true) {
                    Object a2 = aqVar.a(context);
                    if (a2 == null) {
                        while (!stack.empty()) {
                            an anVar = (an) stack.pop();
                            if (h.f.b.l.a(anVar, FlexLayout.f45592j)) {
                                throw new IllegalArgumentException("parentheses mismatched: " + str2 + '=' + str);
                            } else if (anVar.f45612c != 0) {
                                h.f.b.l.a((Object) anVar, "");
                                arrayList.add(anVar);
                            } else {
                                throw new IllegalArgumentException("syntax error: " + str2 + '=' + str);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        if (a.a((Context) null)) {
                            str3 = str2 + '=' + str;
                        }
                        return new ao(arrayList, str3);
                    } else if (a2 instanceof Number) {
                        arrayList.add(a2);
                    } else if (a2 instanceof ap) {
                        arrayList.add(a2);
                    } else if (a2 instanceof an) {
                        an anVar2 = (an) a2;
                        if ((anVar2.f45614e & 1) != 0) {
                            stack.push(anVar2);
                        } else if (h.f.b.l.a(anVar2, FlexLayout.f45594l)) {
                            while (!stack.empty() && (!h.f.b.l.a(stack.peek(), FlexLayout.f45592j))) {
                                Object pop = stack.pop();
                                h.f.b.l.a(pop, "");
                                arrayList.add(pop);
                            }
                            if (stack.empty()) {
                                throw new IllegalArgumentException("comma misplaced or parentheses mismatched: " + str2 + '=' + str);
                            }
                        } else if (h.f.b.l.a(anVar2, FlexLayout.f45592j)) {
                            stack.push(anVar2);
                        } else if (h.f.b.l.a(anVar2, FlexLayout.f45593k)) {
                            while (!stack.empty() && (!h.f.b.l.a(stack.peek(), FlexLayout.f45592j))) {
                                Object pop2 = stack.pop();
                                h.f.b.l.a(pop2, "");
                                arrayList.add(pop2);
                            }
                            if (!stack.empty()) {
                                stack.pop();
                                if (!stack.empty() && (((an) stack.peek()).f45614e & 1) != 0) {
                                    Object pop3 = stack.pop();
                                    h.f.b.l.a(pop3, "");
                                    arrayList.add(pop3);
                                }
                            } else {
                                throw new IllegalArgumentException("parentheses mismatched: " + str2 + '=' + str);
                            }
                        } else if (anVar2.f45613d == 0) {
                            arrayList.add(anVar2);
                        } else {
                            while (!stack.empty()) {
                                an anVar3 = (an) stack.peek();
                                if ((anVar2.f45612c != 1 || anVar2.f45611b > anVar3.f45611b) && (anVar2.f45612c != 2 || anVar2.f45611b >= anVar3.f45611b)) {
                                    break;
                                }
                                Object pop4 = stack.pop();
                                h.f.b.l.a(pop4, "");
                                arrayList.add(pop4);
                            }
                            stack.push(anVar2);
                        }
                    } else {
                        throw new IllegalArgumentException("unknown token " + a2 + ", " + str2 + '=' + str);
                    }
                }
            }
        }

        public final String toString() {
            return this.f45616a.toString();
        }

        private final boolean a(String str) {
            if (str == null || this.f45617c == null) {
                return true;
            }
            return false;
        }

        public ao(List<? extends Object> list, String str) {
            h.f.b.l.c(list, "");
            this.f45616a = list;
            this.f45617c = str;
        }

        public final float a(FlexLayout flexLayout, int i2, int i3, String str) {
            int i4;
            int i5;
            float f2;
            float f3;
            String str2 = "";
            h.f.b.l.c(flexLayout, str2);
            float[] fArr = new float[this.f45616a.size()];
            int i6 = 0;
            for (Object obj : this.f45616a) {
                if (obj instanceof an) {
                    an anVar = (an) obj;
                    if (i6 < anVar.f45613d) {
                        StringBuilder append = new StringBuilder("arg error ").append(obj);
                        if (!(str == null || this.f45617c == null)) {
                            str2 = " (" + str + ':' + this.f45617c + ')';
                        }
                        throw new IllegalArgumentException(append.append(str2).toString());
                    }
                    float f4 = Float.NaN;
                    if (anVar.f45613d == 0) {
                        i5 = i6;
                        f2 = Float.NaN;
                    } else if (anVar.f45613d == 1) {
                        i5 = i6 - 1;
                        f2 = fArr[i5];
                    } else if (anVar.f45613d == 2) {
                        int i7 = i6 - 1;
                        f3 = fArr[i7];
                        i5 = i7 - 1;
                        f2 = fArr[i5];
                        i6 = i5 + 1;
                        fArr[i5] = anVar.a(flexLayout, i2, i3, f2, f3);
                    } else if (h.f.b.l.a(obj, FlexLayout.f45595m)) {
                        int i8 = i6 - 1;
                        float f5 = fArr[i8];
                        int i9 = i8 - 1;
                        float f6 = fArr[i9];
                        int i10 = i9 - 1;
                        float f7 = fArr[i10];
                        if (f7 == f7) {
                            if (f7 != 0.0f) {
                                f4 = f6;
                            } else {
                                f4 = f5;
                            }
                        }
                        i6 = i10 + 1;
                        fArr[i10] = f4;
                    } else {
                        StringBuilder sb = new StringBuilder("argc>2 not supported");
                        if (!a(str)) {
                            str2 = " (" + str + ':' + this.f45617c + ')';
                        }
                        throw new IllegalArgumentException(sb.append(str2).toString());
                    }
                    f3 = Float.NaN;
                    i6 = i5 + 1;
                    fArr[i5] = anVar.a(flexLayout, i2, i3, f2, f3);
                } else {
                    if (obj instanceof Float) {
                        i4 = i6 + 1;
                        fArr[i6] = ((Number) obj).floatValue();
                    } else if (obj instanceof ap) {
                        i4 = i6 + 1;
                        fArr[i6] = ((ap) obj).a(flexLayout, i2, (str == null || this.f45617c == null) ? null : str + ':' + this.f45617c);
                    } else {
                        StringBuilder append2 = new StringBuilder("unknown token ").append(obj);
                        if (!a(str)) {
                            str2 = " (" + str + ':' + this.f45617c + ')';
                        }
                        throw new IllegalArgumentException(append2.append(str2).toString());
                    }
                    i6 = i4;
                }
            }
            if (i6 == 1) {
                return fArr[0];
            }
            StringBuilder sb2 = new StringBuilder("syntax error");
            if (!a(str)) {
                str2 = " (" + str + ':' + this.f45617c + ')';
            }
            throw new IllegalArgumentException(sb2.append(str2).toString());
        }
    }

    public static final class ap {

        /* renamed from: b  reason: collision with root package name */
        public static final a f45618b = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f45619a;

        /* renamed from: c  reason: collision with root package name */
        private final int f45620c;

        static {
            Covode.recordClassIndex(27754);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(27755);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            int i2 = this.f45619a;
            if (i2 == 0) {
                sb.append("this");
            } else if (i2 == 1) {
                sb.append("prev");
            } else if (i2 == 2) {
                sb.append("next");
            } else if (i2 == 3) {
                sb.append("parent");
            } else if (i2 != 4) {
                sb.append("?");
            } else {
                sb.append("screen");
            }
            sb.append(".");
            int i3 = this.f45620c;
            if (i3 == 10) {
                sb.append("visible");
            } else if (i3 != 15) {
                switch (i3) {
                    case 0:
                        sb.append("left");
                        break;
                    case 1:
                        sb.append("top");
                        break;
                    case 2:
                        sb.append("right");
                        break;
                    case 3:
                        sb.append("bottom");
                        break;
                    case 4:
                        sb.append("centerX");
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        sb.append("centerY");
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        sb.append("width");
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        sb.append("height");
                        break;
                    default:
                        sb.append("?");
                        break;
                }
            } else {
                sb.append("tag");
            }
            String sb2 = sb.toString();
            h.f.b.l.a((Object) sb2, "");
            return sb2;
        }

        public ap(int i2, int i3) {
            this.f45619a = i2;
            this.f45620c = i3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
            if (r2 == 5) goto L_0x0065;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final float a(com.bytedance.tux.widget.FlexLayout r18, int r19, java.lang.String r20) {
            /*
            // Method dump skipped, instructions count: 804
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.FlexLayout.ap.a(com.bytedance.tux.widget.FlexLayout, int, java.lang.String):float");
        }
    }

    public FlexLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27735);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static boolean a(ao aoVar) {
            if (aoVar == null) {
                return true;
            }
            for (Object obj : aoVar.f45616a) {
                if ((obj instanceof ap) && ((ap) obj).f45619a != 0) {
                    return false;
                }
            }
            return true;
        }

        public static int a(String str) {
            Integer num;
            h.f.b.l.c(str, "");
            Map<String, Integer> map = FlexLayout.f45584b;
            if (map != null && (num = map.get(str)) != null) {
                return num.intValue();
            }
            int i2 = FlexLayout.f45585c;
            FlexLayout.f45585c = i2 + 1;
            Map<String, Integer> map2 = FlexLayout.f45584b;
            if (map2 != null) {
                map2.put(str, Integer.valueOf(i2));
            }
            return i2;
        }

        public static String a(int i2) {
            Set<Map.Entry<String, Integer>> entrySet;
            T t;
            Map<String, Integer> map = FlexLayout.f45584b;
            if (!(map == null || (entrySet = map.entrySet()) == null)) {
                Iterator<T> it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((Number) t.getValue()).intValue() == i2) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    return (String) t2.getKey();
                }
            }
            return null;
        }

        public static boolean a(Context context) {
            boolean z;
            if (FlexLayout.f45583a == null && context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                FlexLayout.f45583a = Boolean.valueOf(z);
            }
            return h.f.b.l.a((Object) FlexLayout.f45583a, (Object) true);
        }

        public static boolean a(FlexLayout flexLayout, View view, am amVar, int i2, int i3) {
            int childMeasureSpec;
            int childMeasureSpec2;
            h.f.b.l.c(flexLayout, "");
            h.f.b.l.c(view, "");
            h.f.b.l.c(amVar, "");
            if (i2 == -5) {
                float e2 = amVar.e();
                if (e2 == e2) {
                    i2 = Math.round(e2);
                } else if (!a(amVar.f45602g) || !a(amVar.f45596a) || !a(amVar.f45597b) || !a(amVar.f45600e)) {
                    return false;
                } else {
                    i2 = -2;
                }
            }
            if (i3 == -5) {
                float f2 = amVar.f();
                if (f2 == f2) {
                    i3 = Math.round(f2);
                } else if (!a(amVar.f45603h) || !a(amVar.f45598c) || !a(amVar.f45599d) || !a(amVar.f45601f)) {
                    return false;
                } else {
                    i3 = -2;
                }
            }
            if (flexLayout.getMyWidth() == -1) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(flexLayout.getMyWidthMeasureSpec(), flexLayout.getPaddingLeft() + flexLayout.getPaddingRight(), i2);
            } else {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(flexLayout.getMyWidth(), 1073741824), 0, i2);
            }
            if (flexLayout.getMyHeight() == -1) {
                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(flexLayout.getMyHeightMeasureSpec(), flexLayout.getPaddingTop() + flexLayout.getPaddingBottom(), i3);
            } else {
                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(flexLayout.getMyHeight(), 1073741824), 0, i3);
            }
            view.measure(childMeasureSpec, childMeasureSpec2);
            amVar.q = view.getMeasuredWidth();
            amVar.r = view.getMeasuredHeight();
            return true;
        }
    }

    public final int getMyHeight() {
        return this.t;
    }

    public final int getMyHeightMeasureSpec() {
        return this.r;
    }

    public final int getMyWidth() {
        return this.s;
    }

    public final int getMyWidthMeasureSpec() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new am(-2);
    }

    static {
        Covode.recordClassIndex(27734);
        w wVar = new w("*");
        u = wVar;
        l lVar = new l("/");
        v = lVar;
        y yVar = new y("%");
        w = yVar;
        b bVar = new b("+");
        x = bVar;
        z zVar = new z("-");
        y = zVar;
        x xVar = new x("!");
        z = xVar;
        i iVar = new i("<");
        A = iVar;
        j jVar = new j("<=");
        f45586d = jVar;
        g gVar = new g(">");
        B = gVar;
        h hVar = new h(">=");
        f45587e = hVar;
        f fVar = new f("==");
        f45588f = fVar;
        k kVar = new k("!=");
        f45589g = kVar;
        u uVar = new u("&&");
        f45590h = uVar;
        v vVar = new v("||");
        f45591i = vVar;
        c cVar = new c("(");
        f45592j = cVar;
        d dVar = new d(")");
        f45593k = dVar;
        e eVar = new e(",");
        f45594l = eVar;
        ag agVar = new ag("sp");
        C = agVar;
        ab abVar = new ab("dp");
        D = abVar;
        aa aaVar = new aa("dip");
        E = aaVar;
        af afVar = new af("px");
        F = afVar;
        ae aeVar = new ae("pt");
        G = aeVar;
        ad adVar = new ad("mm");
        H = adVar;
        ac acVar = new ac("in");
        I = acVar;
        p pVar = new p("max");
        J = pVar;
        q qVar = new q("min");
        K = qVar;
        t tVar = new t("round");
        L = tVar;
        n nVar = new n("ceil");
        M = nVar;
        o oVar = new o("floor");
        N = oVar;
        m mVar = new m("abs");
        O = mVar;
        r rVar = new r("mod");
        P = rVar;
        s sVar = new s("pow");
        Q = sVar;
        ah ahVar = new ah("?");
        R = ahVar;
        ai aiVar = new ai(":");
        f45595m = aiVar;
        ak akVar = new ak("match_parent");
        n = akVar;
        aj ajVar = new aj("fill_parent");
        S = ajVar;
        al alVar = new al("wrap_content");
        T = alVar;
        o = h.a.n.b(bVar, zVar, lVar, wVar, yVar, xVar, iVar, jVar, gVar, hVar, fVar, kVar, uVar, vVar, cVar, dVar, eVar, agVar, abVar, aaVar, afVar, aeVar, adVar, acVar, pVar, qVar, tVar, nVar, oVar, mVar, rVar, sVar, ahVar, aiVar, akVar, ajVar, alVar);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof am;
    }

    public final void setMyHeight(int i2) {
        this.t = i2;
    }

    public final void setMyHeightMeasureSpec(int i2) {
        this.r = i2;
    }

    public final void setMyWidth(int i2) {
        this.s = i2;
    }

    public final void setMyWidthMeasureSpec(int i2) {
        this.q = i2;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new am(layoutParams);
    }

    public static final class aa extends an {
        static {
            Covode.recordClassIndex(27736);
        }

        aa(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            h.f.b.l.a((Object) resources, "");
            return TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
    }

    public static final class ab extends an {
        static {
            Covode.recordClassIndex(27737);
        }

        ab(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            h.f.b.l.a((Object) resources, "");
            return TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
    }

    public static final class ac extends an {
        static {
            Covode.recordClassIndex(27738);
        }

        ac(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            h.f.b.l.a((Object) resources, "");
            return TypedValue.applyDimension(4, f2, resources.getDisplayMetrics());
        }
    }

    public static final class ad extends an {
        static {
            Covode.recordClassIndex(27739);
        }

        ad(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            h.f.b.l.a((Object) resources, "");
            return TypedValue.applyDimension(5, f2, resources.getDisplayMetrics());
        }
    }

    public static final class ae extends an {
        static {
            Covode.recordClassIndex(27740);
        }

        ae(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            h.f.b.l.a((Object) resources, "");
            return TypedValue.applyDimension(3, f2, resources.getDisplayMetrics());
        }
    }

    public static final class af extends an {
        static {
            Covode.recordClassIndex(27741);
        }

        af(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            h.f.b.l.a((Object) resources, "");
            return TypedValue.applyDimension(0, f2, resources.getDisplayMetrics());
        }
    }

    public static final class ag extends an {
        static {
            Covode.recordClassIndex(27742);
        }

        ag(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            h.f.b.l.a((Object) resources, "");
            return TypedValue.applyDimension(2, f2, resources.getDisplayMetrics());
        }
    }

    public static final class ah extends an {
        static {
            Covode.recordClassIndex(27743);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return f2;
        }

        ah(String str) {
            super(str, 2, 2, 1, 0);
        }
    }

    public static final class ai extends an {
        static {
            Covode.recordClassIndex(27744);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return Float.NaN;
        }

        ai(String str) {
            super(str, 1, 1, 3, 0);
        }
    }

    public static final class aj extends an {
        static {
            Covode.recordClassIndex(27745);
        }

        aj(String str) {
            super(str, 0, 0, 0, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return FlexLayout.n.a(flexLayout, i2, i3, f2, f3);
        }
    }

    public static final class ak extends an {
        static {
            Covode.recordClassIndex(27746);
        }

        ak(String str) {
            super(str, 0, 0, 0, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            int myHeight;
            h.f.b.l.c(flexLayout, "");
            if (i3 == 0) {
                if (flexLayout.getMyWidth() == -1) {
                    return Float.NaN;
                }
                myHeight = flexLayout.getMyWidth();
            } else if (flexLayout.getMyHeight() == -1) {
                return Float.NaN;
            } else {
                myHeight = flexLayout.getMyHeight();
            }
            return (float) myHeight;
        }
    }

    public static final class al extends an {
        static {
            Covode.recordClassIndex(27747);
        }

        al(String str) {
            super(str, 0, 0, 0, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            int i4;
            h.f.b.l.c(flexLayout, "");
            View childAt = flexLayout.getChildAt(i2);
            h.f.b.l.a((Object) childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                am amVar = (am) layoutParams;
                if (i3 == 0) {
                    if (amVar.q == -1) {
                        a.a(flexLayout, childAt, amVar, -2, amVar.height);
                        amVar.r = -1;
                    }
                    if (amVar.q == -1) {
                        return Float.NaN;
                    }
                    i4 = amVar.q;
                } else {
                    if (amVar.r == -1) {
                        a.a(flexLayout, childAt, amVar, amVar.width, -2);
                        amVar.q = -1;
                    }
                    if (amVar.r == -1) {
                        return Float.NaN;
                    }
                    i4 = amVar.r;
                }
                return (float) i4;
            }
            throw new h.w("null cannot be cast to non-null type");
        }
    }

    public static final class b extends an {
        static {
            Covode.recordClassIndex(27757);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return f2 + f3;
        }

        b(String str) {
            super(str, 7, 1, 2, 0);
        }
    }

    public static final class c extends an {
        static {
            Covode.recordClassIndex(27758);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return Float.NaN;
        }

        c(String str) {
            super(str, 0, 0, 0, 0);
        }
    }

    public static final class d extends an {
        static {
            Covode.recordClassIndex(27759);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return Float.NaN;
        }

        d(String str) {
            super(str, 0, 0, 0, 0);
        }
    }

    public static final class e extends an {
        static {
            Covode.recordClassIndex(27760);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return Float.NaN;
        }

        e(String str) {
            super(str, 0, 1, 0, 0);
        }
    }

    public static final class f extends an {
        static {
            Covode.recordClassIndex(27761);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2 && f3 == f3) {
                return f2 == f3 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        f(String str) {
            super(str, 5, 1, 2, 0);
        }
    }

    public static final class g extends an {
        static {
            Covode.recordClassIndex(27762);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2 && f3 == f3) {
                return f2 > f3 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        g(String str) {
            super(str, 6, 1, 2, 0);
        }
    }

    public static final class h extends an {
        static {
            Covode.recordClassIndex(27763);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2 && f3 == f3) {
                return f2 >= f3 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        h(String str) {
            super(str, 6, 1, 2, 0);
        }
    }

    public static final class i extends an {
        static {
            Covode.recordClassIndex(27764);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2 && f3 == f3) {
                return f2 < f3 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        i(String str) {
            super(str, 6, 1, 2, 0);
        }
    }

    public static final class j extends an {
        static {
            Covode.recordClassIndex(27765);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2 && f3 == f3) {
                return f2 <= f3 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        j(String str) {
            super(str, 6, 1, 2, 0);
        }
    }

    public static final class k extends an {
        static {
            Covode.recordClassIndex(27766);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2 && f3 == f3) {
                return f2 != f3 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        k(String str) {
            super(str, 5, 1, 2, 0);
        }
    }

    public static final class l extends an {
        static {
            Covode.recordClassIndex(27767);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return f2 / f3;
        }

        l(String str) {
            super(str, 8, 1, 2, 0);
        }
    }

    public static final class m extends an {
        static {
            Covode.recordClassIndex(27768);
        }

        m(String str) {
            super(str, 0, 0, 1, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return Math.abs(f2);
        }
    }

    public static final class n extends an {
        static {
            Covode.recordClassIndex(27769);
        }

        n(String str) {
            super(str, 0, 0, 1, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return (float) Math.ceil((double) f2);
        }
    }

    public static final class o extends an {
        static {
            Covode.recordClassIndex(27770);
        }

        o(String str) {
            super(str, 0, 0, 1, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return (float) Math.floor((double) f2);
        }
    }

    public static final class p extends an {
        static {
            Covode.recordClassIndex(27771);
        }

        p(String str) {
            super(str, 0, 0, 2, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return Math.max(f2, f3);
        }
    }

    public static final class q extends an {
        static {
            Covode.recordClassIndex(27772);
        }

        q(String str) {
            super(str, 0, 0, 2, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return Math.min(f2, f3);
        }
    }

    public static final class r extends an {
        static {
            Covode.recordClassIndex(27773);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return f2 % f3;
        }

        r(String str) {
            super(str, 0, 0, 2, 1);
        }
    }

    public static final class s extends an {
        static {
            Covode.recordClassIndex(27774);
        }

        s(String str) {
            super(str, 0, 0, 2, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return (float) Math.pow((double) f2, (double) f3);
        }
    }

    public static final class t extends an {
        static {
            Covode.recordClassIndex(27775);
        }

        t(String str) {
            super(str, 0, 0, 1, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return (float) Math.rint((double) f2);
        }
    }

    public static final class u extends an {
        static {
            Covode.recordClassIndex(27776);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2 && f3 == f3) {
                return (f2 == 0.0f || f3 == 0.0f) ? 0.0f : 1.0f;
            }
            return Float.NaN;
        }

        u(String str) {
            super(str, 4, 1, 2, 0);
        }
    }

    public static final class v extends an {
        static {
            Covode.recordClassIndex(27777);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2 && f3 == f3) {
                return (f2 == 0.0f && f3 == 0.0f) ? 0.0f : 1.0f;
            }
            return Float.NaN;
        }

        v(String str) {
            super(str, 3, 1, 2, 0);
        }
    }

    public static final class w extends an {
        static {
            Covode.recordClassIndex(27778);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return f2 * f3;
        }

        w(String str) {
            super(str, 8, 1, 2, 0);
        }
    }

    public static final class x extends an {
        static {
            Covode.recordClassIndex(27779);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            if (f2 == f2) {
                return f2 == 0.0f ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        x(String str) {
            super(str, 9, 2, 1, 0);
        }
    }

    public static final class y extends an {
        static {
            Covode.recordClassIndex(27780);
        }

        y(String str) {
            super(str, 8, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            int i4;
            h.f.b.l.c(flexLayout, "");
            if (i3 == 0) {
                if (flexLayout.getMyWidth() == -1) {
                    return Float.NaN;
                }
                i4 = flexLayout.getMyWidth();
            } else if (flexLayout.getMyHeight() == -1) {
                return Float.NaN;
            } else {
                i4 = flexLayout.getMyHeight();
            }
            return ((float) i4) * f2 * 0.01f;
        }
    }

    public static final class z extends an {
        static {
            Covode.recordClassIndex(27781);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.an
        public final float a(FlexLayout flexLayout, int i2, int i3, float f2, float f3) {
            h.f.b.l.c(flexLayout, "");
            return f2 - f3;
        }

        z(String str) {
            super(str, 7, 1, 2, 0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        h.f.b.l.c(attributeSet, "");
        Context context = getContext();
        h.f.b.l.a((Object) context, "");
        return new am(context, attributeSet);
    }

    public static final class aq {

        /* renamed from: a  reason: collision with root package name */
        public final String f45621a;

        /* renamed from: b  reason: collision with root package name */
        private final char[] f45622b;

        /* renamed from: c  reason: collision with root package name */
        private final int f45623c;

        /* renamed from: d  reason: collision with root package name */
        private int f45624d;

        /* renamed from: e  reason: collision with root package name */
        private final String f45625e;

        static {
            Covode.recordClassIndex(27756);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b1, code lost:
            return java.lang.Float.valueOf(b(r17, r9, r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x01bb, code lost:
            return a(r17, r8, r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(android.content.Context r17) {
            /*
            // Method dump skipped, instructions count: 498
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.FlexLayout.aq.a(android.content.Context):java.lang.Object");
        }

        public aq(String str, String str2) {
            h.f.b.l.c(str, "");
            h.f.b.l.c(str2, "");
            this.f45625e = str;
            this.f45621a = str2;
            if (str != null) {
                char[] charArray = str.toCharArray();
                h.f.b.l.a((Object) charArray, "");
                this.f45622b = charArray;
                this.f45623c = str.length();
                return;
            }
            throw new h.w("null cannot be cast to non-null type");
        }

        private final float b(Context context, StringBuilder sb, int i2) {
            String str;
            if (i2 != -1) {
                String substring = sb.substring(1, i2);
                String substring2 = sb.substring(i2 + 1);
                if (substring != null) {
                    int hashCode = substring.hashCode();
                    if (hashCode != -1750660506) {
                        if (hashCode == 95588145 && substring.equals("dimen")) {
                            str = context.getPackageName();
                        }
                    } else if (substring.equals("android:dimen")) {
                        str = "android";
                    }
                    int identifier = context.getResources().getIdentifier(substring2, "dimen", str);
                    if (identifier != 0) {
                        return context.getResources().getDimension(identifier);
                    }
                    if (FlexLayout.f45584b != null) {
                        throw new IllegalStateException(((Object) sb) + " is not supported in AndroidStudio Preview, " + this.f45621a + '=' + this.f45625e);
                    }
                    throw new IllegalArgumentException("unknown identifier " + ((Object) sb) + ", " + this.f45621a + '=' + this.f45625e);
                }
                throw new IllegalArgumentException("unknown identifier " + ((Object) sb) + ", " + this.f45621a + '=' + this.f45625e);
            }
            throw new IllegalArgumentException("unknown token " + ((Object) sb) + ", " + this.f45621a + '=' + this.f45625e);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
            if (r7.equals("left") != false) goto L_0x012d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.lang.Object a(android.content.Context r12, java.lang.StringBuilder r13, int r14) {
            /*
            // Method dump skipped, instructions count: 494
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.FlexLayout.aq.a(android.content.Context, java.lang.StringBuilder, int):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        MethodCollector.i(5748);
        super.onMeasure(i2, i3);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        this.q = i2;
        this.r = i3;
        int i12 = -1;
        if (mode == Integer.MIN_VALUE) {
            i4 = (size - paddingLeft) - paddingRight;
            this.s = -1;
        } else if (mode != 1073741824) {
            this.s = -1;
            i4 = -1;
        } else {
            i4 = (size - paddingLeft) - paddingRight;
            this.s = i4;
        }
        if (mode2 == Integer.MIN_VALUE) {
            i5 = (size2 - paddingTop) - paddingBottom;
            this.t = -1;
        } else if (mode2 != 1073741824) {
            this.t = -1;
            i5 = -1;
        } else {
            i5 = (size2 - paddingTop) - paddingBottom;
            this.t = i5;
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            h.f.b.l.a((Object) childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                am amVar = (am) layoutParams;
                amVar.f45604i = Float.NaN;
                amVar.f45605j = Float.NaN;
                amVar.f45606k = Float.NaN;
                amVar.f45607l = Float.NaN;
                amVar.f45608m = Float.NaN;
                amVar.n = Float.NaN;
                amVar.o = Float.NaN;
                amVar.p = Float.NaN;
                amVar.q = i12;
                amVar.r = i12;
                if (childAt.getVisibility() == 8) {
                    amVar.o = 0.0f;
                    amVar.p = 0.0f;
                }
                if (amVar.f45596a == null) {
                    if (amVar.f45597b != null) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (amVar.f45600e != null) {
                        i11++;
                    }
                    if (!(amVar.f45602g == null && amVar.width == -5)) {
                        i11++;
                    }
                    if (i11 < 2) {
                        amVar.f45604i = 0.0f;
                    }
                }
                if (amVar.f45598c == null) {
                    if (amVar.f45599d != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (amVar.f45601f != null) {
                        i10++;
                    }
                    if (!(amVar.f45603h == null && amVar.height == -5)) {
                        i10++;
                    }
                    if (i10 < 2) {
                        amVar.f45606k = 0.0f;
                    }
                }
                i13++;
                i12 = -1;
            } else {
                h.w wVar = new h.w("null cannot be cast to non-null type");
                MethodCollector.o(5748);
                throw wVar;
            }
        }
        if (childCount == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i14 = childCount * 4;
        int i15 = 0;
        while (true) {
            if (i15 < i14) {
                int i16 = -1;
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt2 = getChildAt(i19);
                    h.f.b.l.a((Object) childAt2, "");
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    if (layoutParams2 != null) {
                        am amVar2 = (am) layoutParams2;
                        ao aoVar = amVar2.f45596a;
                        if (!(aoVar == null || amVar2.f45604i == amVar2.f45604i)) {
                            float a2 = aoVar.a(this, i19, 0, amVar2.t);
                            if (a2 == a2) {
                                amVar2.f45604i = a2;
                                i18++;
                            }
                        }
                        ao aoVar2 = amVar2.f45597b;
                        if (!(aoVar2 == null || amVar2.f45605j == amVar2.f45605j)) {
                            float a3 = aoVar2.a(this, i19, 0, amVar2.t);
                            if (a3 == a3) {
                                amVar2.f45605j = a3;
                                i18++;
                            }
                        }
                        ao aoVar3 = amVar2.f45598c;
                        if (!(aoVar3 == null || amVar2.f45606k == amVar2.f45606k)) {
                            float a4 = aoVar3.a(this, i19, 1, amVar2.t);
                            if (a4 == a4) {
                                amVar2.f45606k = a4;
                                i18++;
                            }
                        }
                        ao aoVar4 = amVar2.f45599d;
                        if (!(aoVar4 == null || amVar2.f45607l == amVar2.f45607l)) {
                            float a5 = aoVar4.a(this, i19, 1, amVar2.t);
                            if (a5 == a5) {
                                amVar2.f45607l = a5;
                                i18++;
                            }
                        }
                        ao aoVar5 = amVar2.f45600e;
                        if (!(aoVar5 == null || amVar2.f45608m == amVar2.f45608m)) {
                            float a6 = aoVar5.a(this, i19, 0, amVar2.t);
                            if (a6 == a6) {
                                amVar2.f45608m = a6;
                                i18++;
                            }
                        }
                        ao aoVar6 = amVar2.f45601f;
                        if (!(aoVar6 == null || amVar2.n == amVar2.n)) {
                            float a7 = aoVar6.a(this, i19, 1, amVar2.t);
                            if (a7 == a7) {
                                amVar2.n = a7;
                                i18++;
                            }
                        }
                        if (amVar2.o != amVar2.o) {
                            ao aoVar7 = amVar2.f45602g;
                            if (aoVar7 != null) {
                                float a8 = aoVar7.a(this, i19, 0, amVar2.t);
                                if (a8 == a8) {
                                    amVar2.o = a8;
                                }
                            } else if (amVar2.width != -5) {
                                if (amVar2.width == -1 && (i9 = this.s) != -1) {
                                    amVar2.o = (float) i9;
                                } else if (amVar2.width >= 0) {
                                    amVar2.o = (float) amVar2.width;
                                } else {
                                    if (amVar2.q == -1 && a.a(this, childAt2, amVar2, amVar2.width, amVar2.height)) {
                                        i18++;
                                    }
                                    if (amVar2.q != -1 && amVar2.width == -2) {
                                        amVar2.o = (float) amVar2.q;
                                    }
                                }
                            }
                            i18++;
                        }
                        if (amVar2.p != amVar2.p) {
                            ao aoVar8 = amVar2.f45603h;
                            if (aoVar8 != null) {
                                float a9 = aoVar8.a(this, i19, 1, amVar2.t);
                                if (a9 == a9) {
                                    amVar2.p = a9;
                                }
                            } else if (amVar2.height != -5) {
                                if (amVar2.height == -1 && (i8 = this.t) != -1) {
                                    amVar2.p = (float) i8;
                                } else if (amVar2.height >= 0) {
                                    amVar2.p = (float) amVar2.height;
                                } else {
                                    if (amVar2.r == -1 && a.a(this, childAt2, amVar2, amVar2.width, amVar2.height)) {
                                        i18++;
                                    }
                                    if (amVar2.r != -1 && amVar2.height == -2) {
                                        amVar2.p = (float) amVar2.r;
                                    }
                                }
                            }
                            i18++;
                        }
                        if (amVar2.g()) {
                            i17++;
                        } else if (i16 == -1) {
                            i16 = i19;
                        }
                    } else {
                        h.w wVar2 = new h.w("null cannot be cast to non-null type");
                        MethodCollector.o(5748);
                        throw wVar2;
                    }
                }
                if (i17 == childCount) {
                    i7 = -1;
                    if (!(this.s == -1 || this.t == -1)) {
                        break;
                    }
                } else {
                    i7 = -1;
                }
                if (i18 == 0) {
                    if (this.s == i7 || this.t == i7) {
                        int i20 = 0;
                        int i21 = 0;
                        for (int i22 = 0; i22 < childCount; i22++) {
                            View childAt3 = getChildAt(i22);
                            h.f.b.l.a((Object) childAt3, "");
                            ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                            if (layoutParams3 != null) {
                                am amVar3 = (am) layoutParams3;
                                float b2 = amVar3.b();
                                if (b2 == b2) {
                                    i20 = Math.max(i20, Math.round(b2));
                                } else if (amVar3.q != -1) {
                                    float a10 = amVar3.a();
                                    if (a10 == a10) {
                                        i20 = Math.max(i20, Math.round(a10 + ((float) amVar3.q)));
                                    } else {
                                        i20 = Math.max(i20, amVar3.q);
                                    }
                                }
                                float d2 = amVar3.d();
                                if (d2 == d2) {
                                    i21 = Math.max(i21, Math.round(d2));
                                } else if (amVar3.r != -1) {
                                    float c2 = amVar3.c();
                                    if (c2 == c2) {
                                        i21 = Math.max(i21, Math.round(c2 + ((float) amVar3.r)));
                                    } else {
                                        i21 = Math.max(i21, amVar3.r);
                                    }
                                }
                                amVar3.q = -1;
                                amVar3.r = -1;
                            } else {
                                h.w wVar3 = new h.w("null cannot be cast to non-null type");
                                MethodCollector.o(5748);
                                throw wVar3;
                            }
                        }
                        if (this.s == -1) {
                            if (i4 != -1) {
                                i20 = Math.min(i20, i4);
                            }
                            this.s = i20;
                        }
                        if (this.t == -1) {
                            if (i5 != -1) {
                                i21 = Math.min(i21, i5);
                            }
                            this.t = i21;
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("incomplete layout, circular dependency? (index=" + i16 + ')');
                        MethodCollector.o(5748);
                        throw illegalStateException;
                    }
                }
                i15++;
            } else if (!z2) {
                StringBuilder sb = new StringBuilder();
                for (int i23 = 0; i23 < childCount; i23++) {
                    View childAt4 = getChildAt(i23);
                    h.f.b.l.a((Object) childAt4, "");
                    ViewGroup.LayoutParams layoutParams4 = childAt4.getLayoutParams();
                    if (layoutParams4 != null) {
                        if (!((am) layoutParams4).g()) {
                            if (sb.length() > 0) {
                                sb.append(',');
                            }
                            sb.append(i23);
                        }
                    } else {
                        h.w wVar4 = new h.w("null cannot be cast to non-null type");
                        MethodCollector.o(5748);
                        throw wVar4;
                    }
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("incomplete layout, circular dependency? (index=" + ((Object) sb) + ')');
                MethodCollector.o(5748);
                throw illegalStateException2;
            }
        }
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt5 = getChildAt(i24);
            h.f.b.l.a((Object) childAt5, "");
            ViewGroup.LayoutParams layoutParams5 = childAt5.getLayoutParams();
            if (layoutParams5 != null) {
                am amVar4 = (am) layoutParams5;
                if (amVar4.f45602g != null && amVar4.o == amVar4.o) {
                    i6 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round(amVar4.o), 1073741824);
                } else if (amVar4.width == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.s, Integer.MIN_VALUE);
                    i6 = 1073741824;
                } else if (amVar4.width == -1) {
                    i6 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.s, 1073741824);
                } else {
                    i6 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round(amVar4.e()), 1073741824);
                }
                if (amVar4.f45603h != null && amVar4.p == amVar4.p) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.round(amVar4.p), i6);
                } else if (amVar4.height == -2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.t, Integer.MIN_VALUE);
                } else if (amVar4.height == -1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.t, 1073741824);
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.round(amVar4.f()), 1073741824);
                }
                childAt5.measure(makeMeasureSpec, makeMeasureSpec2);
            } else {
                h.w wVar5 = new h.w("null cannot be cast to non-null type");
                MethodCollector.o(5748);
                throw wVar5;
            }
        }
        setMeasuredDimension(this.s + paddingLeft + paddingRight, this.t + paddingTop + paddingBottom);
        MethodCollector.o(5748);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlexLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlexLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        h.f.b.l.c(context, "");
        MethodCollector.i(5840);
        if (isInEditMode()) {
            f45583a = true;
            if (f45584b == null) {
                f45584b = new LinkedHashMap();
            }
        }
        MethodCollector.o(5840);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            h.f.b.l.a((Object) childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    am amVar = (am) layoutParams;
                    int i7 = Build.VERSION.SDK_INT;
                    if (getLayoutDirection() == 1) {
                        int i8 = (i4 - i2) - paddingLeft;
                        childAt.layout(i8 - Math.round(amVar.b()), Math.round(amVar.c()) + paddingTop, i8 - Math.round(amVar.a()), Math.round(amVar.d()) + paddingTop);
                    } else {
                        childAt.layout(Math.round(amVar.a()) + paddingLeft, Math.round(amVar.c()) + paddingTop, Math.round(amVar.b()) + paddingLeft, Math.round(amVar.d()) + paddingTop);
                    }
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
