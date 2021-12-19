package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class SpannedGridLayoutManager extends RecyclerView.i {

    /* renamed from: a  reason: collision with root package name */
    public b f144533a;

    /* renamed from: b  reason: collision with root package name */
    public int f144534b;

    /* renamed from: c  reason: collision with root package name */
    public int f144535c;

    /* renamed from: d  reason: collision with root package name */
    public int f144536d;

    /* renamed from: e  reason: collision with root package name */
    public int f144537e;

    /* renamed from: f  reason: collision with root package name */
    public int f144538f;

    /* renamed from: g  reason: collision with root package name */
    private float f144539g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f144540h;

    /* renamed from: i  reason: collision with root package name */
    private int f144541i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f144542j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray<a> f144543k;

    /* renamed from: l  reason: collision with root package name */
    private List<Integer> f144544l;

    /* renamed from: m  reason: collision with root package name */
    private int f144545m;
    private final Rect n;

    public interface b {
        static {
            Covode.recordClassIndex(94600);
        }

        d a(int i2);

        boolean a();
    }

    static {
        Covode.recordClassIndex(94597);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean x_() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        if (i2 >= A()) {
            i2 = A() - 1;
        }
        AnonymousClass1 r1 = new r(recyclerView.getContext()) {
            /* class com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94598);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r
            public final PointF c(int i2) {
                return new PointF(0.0f, (float) ((SpannedGridLayoutManager.this.a(i2) - SpannedGridLayoutManager.this.f144538f) * SpannedGridLayoutManager.this.f144535c));
            }
        };
        r1.f3862g = i2;
        a(r1);
    }

    public static class c extends RecyclerView.j {

        /* renamed from: a  reason: collision with root package name */
        int f144551a;

        /* renamed from: b  reason: collision with root package name */
        int f144552b;

        static {
            Covode.recordClassIndex(94601);
        }

        public c() {
            super(-2, -2);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private int h() {
        return this.f144544l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j b() {
        return new c();
    }

    public static class d {

        /* renamed from: c  reason: collision with root package name */
        public static final d f144553c = new d(1, 1);

        /* renamed from: a  reason: collision with root package name */
        public int f144554a;

        /* renamed from: b  reason: collision with root package name */
        public int f144555b;

        static {
            Covode.recordClassIndex(94602);
        }

        public d(int i2, int i3) {
            this.f144554a = i2;
            this.f144555b = i3;
        }
    }

    private void i() {
        int k2 = k();
        if (this.f144538f > k2) {
            this.f144538f = k2;
        }
        int f2 = f(this.f144538f);
        this.f144536d = f2;
        this.f144541i = this.f144538f;
        this.f144537e = f2;
    }

    private int k() {
        int ceil = ((int) Math.ceil((double) (((float) this.K) / ((float) this.f144535c)))) + 1;
        int i2 = this.f144545m;
        if (i2 < ceil) {
            return 0;
        }
        return a(f(i2 - ceil));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(RecyclerView.j jVar) {
        return jVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int g(RecyclerView.s sVar) {
        return this.K;
    }

    private int f(int i2) {
        return this.f144544l.get(i2).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final View c(int i2) {
        int i3 = this.f144536d;
        if (i2 < i3 || i2 > this.f144537e) {
            return null;
        }
        return g(i2 - i3);
    }

    public SpannedGridLayoutManager(b bVar) {
        this.f144534b = 1;
        this.f144539g = 1.0f;
        this.n = new Rect();
        this.f144534b = 3;
        this.f144539g = 0.75f;
        this.f144533a = bVar;
        this.C = true;
    }

    private int d(int i2) {
        int f2 = f(i2);
        do {
            i2++;
            if (i2 >= h()) {
                break;
            }
        } while (f(i2) == f2);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int c(RecyclerView.s sVar) {
        return (h() * this.f144535c) + u() + w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int e(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        return (u() + (this.f144538f * this.f144535c)) - p(g(0));
    }

    private d b(int i2) {
        for (int i3 = 0; i3 < s(); i3++) {
            View g2 = g(i3);
            if (i2 == e(g2)) {
                c cVar = (c) g2.getLayoutParams();
                return new d(cVar.f144551a, cVar.f144552b);
            }
        }
        return d.f144553c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i2) {
        if (i2 >= A()) {
            i2 = A() - 1;
        }
        this.f144538f = a(i2);
        i();
        this.f144542j = true;
        r();
        o();
    }

    public final int a(int i2) {
        if (i2 < this.f144543k.size()) {
            return this.f144543k.get(i2).f144547a;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    private int a(int i2, RecyclerView.s sVar) {
        int a2;
        int d2 = d(i2);
        if (d2 != h()) {
            a2 = f(d2);
        } else {
            a2 = sVar.a();
        }
        return a2 - 1;
    }

    private void a(int i2, int i3) {
        if (h() < i2 + 1) {
            this.f144544l.add(Integer.valueOf(i3));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b4 A[EDGE_INSN: B:71:0x00b4->B:28:0x00b4 ?: BREAK  , SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(androidx.recyclerview.widget.RecyclerView.o r17, androidx.recyclerview.widget.RecyclerView.s r18) {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.c(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.a aVar, RecyclerView.a aVar2) {
        r();
        this.f144543k = null;
        this.f144544l = null;
        this.f144536d = 0;
        this.f144538f = 0;
        this.f144537e = 0;
        this.f144541i = 0;
        this.f144535c = 0;
        this.f144542j = false;
    }

    private static int b(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - i3) - i4, mode);
        }
        return i2;
    }

    private void c(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        int f2 = f(i2);
        int a2 = a(i2, sVar);
        for (int i3 = a2; i3 >= f2; i3--) {
            a(i3 - this.f144536d, oVar);
        }
        if (i2 == this.f144538f) {
            int i4 = a2 + 1;
            this.f144536d = i4;
            this.f144538f = a(i4);
        }
        if (i2 == this.f144541i) {
            int i5 = f2 - 1;
            this.f144537e = i5;
            this.f144541i = a(i5);
        }
    }

    private void a(View view, int i2, int i3) {
        b(view, this.n);
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        view.measure(b(i2, jVar.leftMargin + this.n.left, jVar.rightMargin + this.n.right), b(i3, jVar.topMargin + this.n.top, jVar.bottomMargin + this.n.bottom));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        int i3;
        int i4;
        int i5;
        if (s() == 0 || i2 == 0) {
            return 0;
        }
        int p = p(g(0));
        if (i2 < 0) {
            if (this.f144538f == 0) {
                i2 = Math.max(i2, -(u() - p));
            }
            if (p - i2 >= 0 && (i4 = this.f144538f) - 1 >= 0) {
                a(i5, p - (i4 * this.f144535c), oVar, sVar);
            }
            if (p(g(f(this.f144541i) - this.f144536d)) - i2 > this.K) {
                c(this.f144541i, oVar, sVar);
            }
        } else {
            int r = r(g(s() - 1));
            if (this.f144537e == A() - 1) {
                i2 = Math.min(i2, Math.max((r - this.K) + w(), 0));
            }
            if (r - i2 < this.K && (i3 = this.f144541i + 1) < h()) {
                a(i3, p - (this.f144538f * this.f144535c), oVar, sVar);
            }
            if (r(g(a(this.f144538f, sVar) - this.f144536d)) - i2 < 0) {
                c(this.f144538f, oVar, sVar);
            }
        }
        i(-i2);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final int f144547a;

        /* renamed from: b  reason: collision with root package name */
        final int f144548b;

        /* renamed from: c  reason: collision with root package name */
        final int f144549c;

        /* renamed from: d  reason: collision with root package name */
        final int f144550d;

        static {
            Covode.recordClassIndex(94599);
        }

        a(int i2, int i3, int i4, int i5) {
            this.f144547a = i2;
            this.f144548b = i3;
            this.f144549c = i4;
            this.f144550d = i5;
        }
    }

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        int indexOf;
        this.f144534b = 1;
        this.f144539g = 1.0f;
        this.n = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ip, R.attr.acz}, i2, i3);
        this.f144534b = obtainStyledAttributes.getInt(1, 1);
        String string = obtainStyledAttributes.getString(0);
        if (string != null && (indexOf = string.indexOf(58)) >= 0 && indexOf < string.length() - 1) {
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring.length() > 0 && substring2.length() > 0) {
                try {
                    float parseFloat = Float.parseFloat(substring);
                    float parseFloat2 = Float.parseFloat(substring2);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        this.f144539g = Math.abs(parseFloat / parseFloat2);
                        obtainStyledAttributes.recycle();
                        this.C = true;
                        return;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        throw new IllegalArgumentException("Could not parse aspect ratio: '" + string + "'");
    }

    private int a(int i2, int i3, RecyclerView.o oVar, RecyclerView.s sVar) {
        int s;
        int a2;
        int i4;
        int i5;
        int f2 = f(i2);
        int a3 = a(i2, sVar);
        if (i2 < this.f144538f) {
            s = 0;
        } else {
            s = s();
        }
        int i6 = f2;
        boolean z = false;
        while (i6 <= a3) {
            View c2 = oVar.c(i6);
            c cVar = (c) c2.getLayoutParams();
            z |= cVar.f3847c.isRemoved();
            a aVar = this.f144543k.get(i6);
            a(c2, s);
            if (!this.f144533a.a()) {
                a2 = a(this.f144540h[aVar.f144549c + aVar.f144550d] - this.f144540h[aVar.f144549c], 1073741824, 0, cVar.width, false);
            } else {
                a2 = a(this.f144540h[aVar.f144549c] - this.f144540h[aVar.f144549c - aVar.f144550d], 1073741824, 0, cVar.width, false);
            }
            a(c2, a2, a(aVar.f144548b * this.f144535c, 1073741824, 0, cVar.height, true));
            if (!this.f144533a.a()) {
                i4 = this.f144540h[aVar.f144549c];
                i5 = cVar.leftMargin;
            } else {
                i4 = this.f144540h[aVar.f144549c - aVar.f144550d];
                i5 = cVar.leftMargin;
            }
            int i7 = i4 + i5;
            int i8 = i3 + (aVar.f144547a * this.f144535c) + cVar.topMargin;
            a(c2, i7, i8, m(c2) + i7, n(c2) + i8);
            cVar.f144551a = aVar.f144550d;
            cVar.f144552b = aVar.f144548b;
            i6++;
            s++;
        }
        if (f2 < this.f144536d) {
            this.f144536d = f2;
            this.f144538f = a(f2);
        }
        if (a3 > this.f144537e) {
            this.f144537e = a3;
            this.f144541i = a(a3);
        }
        if (z) {
            return 0;
        }
        a aVar2 = this.f144543k.get(a3);
        return ((aVar2.f144547a + aVar2.f144548b) - this.f144543k.get(f2).f144547a) * this.f144535c;
    }
}
