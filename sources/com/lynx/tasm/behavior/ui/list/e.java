package com.lynx.tasm.behavior.ui.list;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.a;
import com.lynx.tasm.c;
import com.lynx.tasm.c.g;
import com.lynx.tasm.o;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

public final class e extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    int f56207a;

    /* renamed from: b  reason: collision with root package name */
    int f56208b = 200;

    /* renamed from: c  reason: collision with root package name */
    int f56209c = 50;

    /* renamed from: d  reason: collision with root package name */
    int f56210d = 50;

    /* renamed from: e  reason: collision with root package name */
    int f56211e;

    /* renamed from: f  reason: collision with root package name */
    int f56212f;

    /* renamed from: g  reason: collision with root package name */
    boolean f56213g;

    /* renamed from: h  reason: collision with root package name */
    private final c f56214h;

    /* renamed from: i  reason: collision with root package name */
    private final RecyclerView f56215i;

    /* renamed from: j  reason: collision with root package name */
    private long f56216j;

    /* renamed from: k  reason: collision with root package name */
    private final UIList f56217k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f56218l = true;

    /* renamed from: m  reason: collision with root package name */
    private int f56219m;
    private int n = 1;

    static {
        Covode.recordClassIndex(35124);
    }

    private static boolean a(int i2) {
        return (i2 & 1) != 0;
    }

    private static boolean b(int i2) {
        return (i2 & 2) != 0;
    }

    private static boolean c(int i2) {
        return (i2 & 4) != 0;
    }

    private static boolean d(int i2) {
        return (i2 & 8) != 0;
    }

    public final void a(JavaOnlyArray javaOnlyArray) {
        if (a()) {
            com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(this.f56217k.getSign(), "layoutcomplete");
            cVar.a("timestamp", Long.valueOf(new Date().getTime()));
            cVar.a("cells", javaOnlyArray);
            this.f56214h.a(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        int i4;
        boolean z;
        boolean z2;
        if (!(i2 == 0 && i3 == 0)) {
            this.f56219m += i3;
            if (System.currentTimeMillis() - this.f56216j > ((long) this.f56208b)) {
                a("scroll", 1, this.f56219m, i2, i3);
                this.f56216j = System.currentTimeMillis();
            }
            RecyclerView.i layoutManager = this.f56215i.getLayoutManager();
            int childCount = this.f56215i.getChildCount();
            int A = layoutManager.A();
            int u = layoutManager.u();
            int w = layoutManager.K - layoutManager.w();
            int i5 = this.f56211e;
            boolean z3 = true;
            if (i5 > 0 || this.f56212f > 0) {
                int i6 = (A - this.f56212f) - 1;
                int i7 = Integer.MAX_VALUE;
                int i8 = Integer.MIN_VALUE;
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = this.f56215i.getChildAt(i9);
                    int e2 = RecyclerView.e(childAt);
                    int p = RecyclerView.i.p(childAt);
                    if (RecyclerView.i.r(childAt) > u) {
                        i7 = Math.min(e2, i7);
                    }
                    if (p < w) {
                        i8 = Math.max(e2, i8);
                    }
                }
                if (i7 < i5) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                if (i8 > i6) {
                    i4 |= 8;
                }
            } else {
                i4 = 0;
            }
            if (this.f56215i.a(0, false) != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.f56215i.a(A - 1, false) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                int i10 = Integer.MIN_VALUE;
                int i11 = Integer.MAX_VALUE;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = this.f56215i.getChildAt(i12);
                    i11 = Math.min(RecyclerView.i.p(childAt2), i11);
                    i10 = Math.max(RecyclerView.i.r(childAt2), i10);
                }
                if (z) {
                    if (i11 == u) {
                        this.f56219m = 0;
                    }
                    if (i11 > u - this.f56209c) {
                        i4 |= 1;
                        if (this.f56211e > 0) {
                            i4 &= -5;
                        }
                    }
                }
                if (z2 && i10 < w + this.f56210d) {
                    i4 |= 2;
                    if (this.f56212f > 0) {
                        i4 &= -9;
                    }
                }
            }
            boolean z4 = a(i4) && !a(this.n);
            boolean z5 = c(i4) && !c(this.n);
            boolean z6 = b(i4) && !b(this.n);
            if (!d(i4) || d(this.n)) {
                z3 = false;
            }
            if (z4 || z5) {
                a("scrolltoupper", 2, this.f56219m, 0, 0);
            } else if (z6 || z3) {
                a("scrolltolower", 4, this.f56219m, 0, 0);
            }
            this.n = i4;
        }
    }

    public final boolean a() {
        if ((this.f56207a & 16) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final JavaOnlyArray b() {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (DisplayMetricsHolder.a() == null) {
            return javaOnlyArray;
        }
        ArrayList arrayList = new ArrayList();
        RecyclerView.i layoutManager = this.f56215i.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int m2 = linearLayoutManager.m();
            for (int k2 = linearLayoutManager.k(); k2 <= m2; k2++) {
                arrayList.add(Integer.valueOf(k2));
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] a2 = staggeredGridLayoutManager.a((int[]) null);
            int[] b2 = staggeredGridLayoutManager.b((int[]) null);
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : a2) {
                arrayList.add(Integer.valueOf(i4));
                i3 = Math.max(i3, i4);
            }
            for (int i5 : b2) {
                arrayList.add(Integer.valueOf(i5));
                i2 = Math.min(i2, i5);
            }
            while (true) {
                i3++;
                if (i3 >= i2) {
                    break;
                }
                arrayList.add(Integer.valueOf(i3));
            }
            Collections.sort(arrayList);
        }
        float f2 = DisplayMetricsHolder.a().density;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            h hVar = (h) this.f56215i.e(intValue);
            if (!(hVar == null || hVar.f56243a.f56245b == null)) {
                View view = hVar.itemView;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.put("id", hVar.f56243a.f56245b.mIdSelector);
                javaOnlyMap.put("position", Integer.valueOf(intValue));
                javaOnlyMap.put("top", Float.valueOf(((float) view.getTop()) / f2));
                javaOnlyMap.put("bottom", Float.valueOf(((float) view.getBottom()) / f2));
                javaOnlyMap.put("left", Float.valueOf(((float) view.getLeft()) / f2));
                javaOnlyMap.put("right", Float.valueOf(((float) view.getRight()) / f2));
                javaOnlyArray.add(javaOnlyMap);
            }
        }
        return javaOnlyArray;
    }

    public static int a(a aVar, int i2) {
        ReadableType h2 = aVar.h();
        if (h2 == ReadableType.String) {
            try {
                i2 = Integer.parseInt(aVar.e());
                return i2;
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                return i2;
            }
        } else if (h2 == ReadableType.Int || h2 == ReadableType.Number || h2 == ReadableType.Long) {
            return aVar.d();
        } else {
            return i2;
        }
    }

    private void a(int i2, String str) {
        JavaOnlyArray javaOnlyArray;
        if ((this.f56207a & 8) != 0) {
            g a2 = g.a(this.f56217k.getSign(), str);
            if (this.f56213g) {
                javaOnlyArray = b();
            } else {
                javaOnlyArray = null;
            }
            a2.a(i2, javaOnlyArray);
            this.f56214h.a(a2);
        }
    }

    public static boolean a(a aVar, boolean z) {
        if (aVar == null) {
            return z;
        }
        ReadableType h2 = aVar.h();
        if (h2 == ReadableType.String) {
            return Boolean.parseBoolean(aVar.e());
        }
        if (h2 == ReadableType.Int || h2 == ReadableType.Number || h2 == ReadableType.Long) {
            if (aVar.d() != 0) {
                return true;
            }
            return false;
        } else if (h2 == ReadableType.Boolean) {
            return aVar.b();
        } else {
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (!this.f56218l && i3 == 0) {
            if (i2 > 0) {
                a("scrolltolower", 4, this.f56219m, 0, 0);
                this.f56218l = true;
            } else if (i2 < 0) {
                this.f56219m = 0;
                a("scrolltoupper", 2, 0, 0, 0);
                this.f56218l = true;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        this.f56217k.recognizeGesturere();
        if (i2 == 0) {
            a(1, "scrollstatechange");
            if (this.f56217k.mEnableScrollMonitor) {
                this.f56217k.mContext.f55905m.b(new o.b(recyclerView, this.f56217k.mTagName, this.f56217k.mScrollMonitorTag));
            }
        } else if (i2 == 1) {
            this.f56218l = false;
            a(2, "scrollstatechange");
            if (this.f56217k.mEnableScrollMonitor) {
                this.f56217k.mContext.f55905m.a(new o.b(recyclerView, this.f56217k.mTagName, this.f56217k.mScrollMonitorTag));
            }
        } else if (i2 == 2) {
            a(3, "scrollstatechange");
        }
    }

    public e(c cVar, RecyclerView recyclerView, UIList uIList) {
        this.f56214h = cVar;
        this.f56215i = recyclerView;
        recyclerView.a(this);
        this.f56217k = uIList;
    }

    private void a(String str, int i2, int i3, int i4, int i5) {
        JavaOnlyArray javaOnlyArray;
        if ((i2 & this.f56207a) != 0) {
            g a2 = g.a(this.f56217k.getSign(), str);
            if (this.f56213g) {
                javaOnlyArray = b();
            } else {
                javaOnlyArray = null;
            }
            a2.a(i3, i4, i5, javaOnlyArray);
            this.f56214h.a(a2);
        }
    }
}
