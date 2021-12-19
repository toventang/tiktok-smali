package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ab;
import androidx.appcompat.widget.ac;
import androidx.appcompat.widget.x;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class e extends m implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: h  reason: collision with root package name */
    private static final int f1171h = R.layout.ac;
    private o.a A;
    private PopupWindow.OnDismissListener B;

    /* renamed from: a  reason: collision with root package name */
    final Handler f1172a;

    /* renamed from: b  reason: collision with root package name */
    final List<a> f1173b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1174c = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class androidx.appcompat.view.menu.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(331);
        }

        public final void onGlobalLayout() {
            if (e.this.e() && e.this.f1173b.size() > 0 && !e.this.f1173b.get(0).f1190a.v) {
                View view = e.this.f1175d;
                if (view == null || !view.isShown()) {
                    e.this.d();
                    return;
                }
                for (a aVar : e.this.f1173b) {
                    aVar.f1190a.c();
                }
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    View f1175d;

    /* renamed from: e  reason: collision with root package name */
    ViewTreeObserver f1176e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1177f;

    /* renamed from: i  reason: collision with root package name */
    private final Context f1178i;

    /* renamed from: j  reason: collision with root package name */
    private final int f1179j;

    /* renamed from: k  reason: collision with root package name */
    private final int f1180k;

    /* renamed from: l  reason: collision with root package name */
    private final int f1181l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f1182m;
    private final List<h> n = new ArrayList();
    private final View.OnAttachStateChangeListener o = new View.OnAttachStateChangeListener() {
        /* class androidx.appcompat.view.menu.e.AnonymousClass2 */

        static {
            Covode.recordClassIndex(332);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (e.this.f1176e != null) {
                if (!e.this.f1176e.isAlive()) {
                    e.this.f1176e = view.getViewTreeObserver();
                }
                e.this.f1176e.removeGlobalOnLayoutListener(e.this.f1174c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final ab p = new ab() {
        /* class androidx.appcompat.view.menu.e.AnonymousClass3 */

        static {
            Covode.recordClassIndex(333);
        }

        @Override // androidx.appcompat.widget.ab
        public final void a(h hVar, MenuItem menuItem) {
            e.this.f1172a.removeCallbacksAndMessages(hVar);
        }

        @Override // androidx.appcompat.widget.ab
        public final void b(final h hVar, final MenuItem menuItem) {
            final a aVar = null;
            e.this.f1172a.removeCallbacksAndMessages(null);
            int size = e.this.f1173b.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (hVar == e.this.f1173b.get(i2).f1191b) {
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        if (i3 < e.this.f1173b.size()) {
                            aVar = e.this.f1173b.get(i3);
                        }
                        e.this.f1172a.postAtTime(new Runnable() {
                            /* class androidx.appcompat.view.menu.e.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(334);
                            }

                            public final void run() {
                                if (aVar != null) {
                                    e.this.f1177f = true;
                                    aVar.f1191b.a(false);
                                    e.this.f1177f = false;
                                }
                                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                                    hVar.a(menuItem, (o) null, 4);
                                }
                            }
                        }, hVar, SystemClock.uptimeMillis() + 200);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    };
    private int q = 0;
    private int r = 0;
    private View s;
    private int t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    @Override // androidx.appcompat.view.menu.o
    public final void a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final Parcelable f() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.m
    public final boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a(u uVar) {
        for (a aVar : this.f1173b) {
            if (uVar == aVar.f1191b) {
                aVar.f1190a.f1473e.requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        a((h) uVar);
        o.a aVar2 = this.A;
        if (aVar2 != null) {
            aVar2.a(uVar);
        }
        return true;
    }

    static {
        Covode.recordClassIndex(330);
    }

    private int j() {
        if (v.e(this.s) == 1) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.appcompat.view.menu.s
    public final boolean e() {
        if (this.f1173b.size() <= 0 || !this.f1173b.get(0).f1190a.w.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.s
    public final ListView g() {
        if (this.f1173b.isEmpty()) {
            return null;
        }
        List<a> list = this.f1173b;
        return list.get(list.size() - 1).f1190a.f1473e;
    }

    private ac i() {
        ac acVar = new ac(this.f1178i, this.f1180k, this.f1181l);
        acVar.f1491a = this.p;
        acVar.q = this;
        acVar.a(this);
        acVar.o = this.s;
        acVar.f1478j = this.r;
        acVar.b();
        acVar.h();
        return acVar;
    }

    public final void onDismiss() {
        int size = this.f1173b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f1173b.get(i2);
            if (!aVar.f1190a.w.isShowing()) {
                aVar.f1191b.a(false);
                return;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public final void c() {
        boolean z2;
        if (!e()) {
            for (h hVar : this.n) {
                c(hVar);
            }
            this.n.clear();
            View view = this.s;
            this.f1175d = view;
            if (view != null) {
                if (this.f1176e == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f1176e = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1174c);
                }
                this.f1175d.addOnAttachStateChangeListener(this.o);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public final void d() {
        int size = this.f1173b.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.f1173b.toArray(new a[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                a aVar = aVarArr[i2];
                if (aVar.f1190a.w.isShowing()) {
                    aVar.f1190a.d();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(boolean z2) {
        this.y = z2;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void c(boolean z2) {
        this.z = z2;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(int i2) {
        this.u = true;
        this.w = i2;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void c(int i2) {
        this.v = true;
        this.x = i2;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(o.a aVar) {
        this.A = aVar;
    }

    private int d(int i2) {
        List<a> list = this.f1173b;
        x xVar = list.get(list.size() - 1).f1190a.f1473e;
        int[] iArr = new int[2];
        xVar.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1175d.getWindowVisibleDisplayFrame(rect);
        if (this.t == 1) {
            if (iArr[0] + xVar.getWidth() + i2 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i2 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void a(int i2) {
        if (this.q != i2) {
            this.q = i2;
            this.r = androidx.core.h.e.a(i2, v.e(this.s));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void a(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = androidx.core.h.e.a(this.q, v.e(view));
        }
    }

    private void c(h hVar) {
        a aVar;
        View view;
        boolean z2;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f1178i);
        g gVar = new g(hVar, from, this.f1182m, f1171h);
        if (!e() && this.y) {
            gVar.f1206b = true;
        } else if (e()) {
            gVar.f1206b = m.b(hVar);
        }
        int a2 = a(gVar, null, this.f1178i, this.f1179j);
        ac i5 = i();
        i5.a(gVar);
        i5.b(a2);
        i5.f1478j = this.r;
        if (this.f1173b.size() > 0) {
            List<a> list = this.f1173b;
            aVar = list.get(list.size() - 1);
            view = a(aVar, hVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            i5.l();
            i5.a();
            int d2 = d(a2);
            if (d2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.t = d2;
            if (Build.VERSION.SDK_INT >= 26) {
                i5.o = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.r & 7) == 5) {
                    iArr[0] = iArr[0] + this.s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.r & 5) != 5) {
                if (z2) {
                    a2 = view.getWidth();
                }
                i4 = i2 - a2;
                i5.f1476h = i4;
                i5.k();
                i5.a(i3);
            } else if (!z2) {
                a2 = view.getWidth();
                i4 = i2 - a2;
                i5.f1476h = i4;
                i5.k();
                i5.a(i3);
            }
            i4 = i2 + a2;
            i5.f1476h = i4;
            i5.k();
            i5.a(i3);
        } else {
            if (this.u) {
                i5.f1476h = this.w;
            }
            if (this.v) {
                i5.a(this.x);
            }
            i5.u = this.f1250g;
        }
        this.f1173b.add(new a(i5, hVar, this.t));
        i5.c();
        x xVar = i5.f1473e;
        xVar.setOnKeyListener(this);
        if (aVar == null && this.z && hVar.f1218h != null) {
            FrameLayout frameLayout = (FrameLayout) com.a.a(from, R.layout.aj, xVar, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(hVar.f1218h);
            xVar.addHeaderView(frameLayout, null, false);
            i5.c();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void a(h hVar) {
        hVar.a(this, this.f1178i);
        if (e()) {
            c(hVar);
        } else {
            this.n.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(boolean z2) {
        for (a aVar : this.f1173b) {
            a(aVar.f1190a.f1473e.getAdapter()).notifyDataSetChanged();
        }
    }

    private static MenuItem a(h hVar, h hVar2) {
        int size = hVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = hVar.getItem(i2);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private static View a(a aVar, h hVar) {
        g gVar;
        int i2;
        int firstVisiblePosition;
        MenuItem a2 = a(aVar.f1191b, hVar);
        if (a2 == null) {
            return null;
        }
        x xVar = aVar.f1190a.f1473e;
        ListAdapter adapter = xVar.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            gVar = (g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (g) adapter;
            i2 = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i3 >= count) {
                break;
            } else if (a2 != gVar.getItem(i3)) {
                i3++;
            } else if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - xVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < xVar.getChildCount()) {
                return xVar.getChildAt(firstVisiblePosition);
            } else {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(h hVar, boolean z2) {
        int size = this.f1173b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (hVar == this.f1173b.get(i2).f1191b) {
                if (i2 >= 0) {
                    int i3 = i2 + 1;
                    if (i3 < this.f1173b.size()) {
                        this.f1173b.get(i3).f1191b.a(false);
                    }
                    a remove = this.f1173b.remove(i2);
                    remove.f1191b.b(this);
                    if (this.f1177f) {
                        ac acVar = remove.f1190a;
                        if (Build.VERSION.SDK_INT >= 23) {
                            acVar.w.setExitTransition(null);
                        }
                        remove.f1190a.w.setAnimationStyle(0);
                    }
                    remove.f1190a.d();
                    int size2 = this.f1173b.size();
                    if (size2 > 0) {
                        this.t = this.f1173b.get(size2 - 1).f1192c;
                    } else {
                        this.t = j();
                        if (size2 == 0) {
                            d();
                            o.a aVar = this.A;
                            if (aVar != null) {
                                aVar.a(hVar, true);
                            }
                            ViewTreeObserver viewTreeObserver = this.f1176e;
                            if (viewTreeObserver != null) {
                                if (viewTreeObserver.isAlive()) {
                                    this.f1176e.removeGlobalOnLayoutListener(this.f1174c);
                                }
                                this.f1176e = null;
                            }
                            this.f1175d.removeOnAttachStateChangeListener(this.o);
                            this.B.onDismiss();
                            return;
                        }
                    }
                    if (z2) {
                        this.f1173b.get(0).f1191b.a(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ac f1190a;

        /* renamed from: b  reason: collision with root package name */
        public final h f1191b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1192c;

        static {
            Covode.recordClassIndex(335);
        }

        public a(ac acVar, h hVar, int i2) {
            this.f1190a = acVar;
            this.f1191b = hVar;
            this.f1192c = i2;
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        d();
        return true;
    }

    public e(Context context, View view, int i2, int i3, boolean z2) {
        this.f1178i = context;
        this.s = view;
        this.f1180k = i2;
        this.f1181l = i3;
        this.f1182m = z2;
        this.y = false;
        this.t = j();
        Resources resources = context.getResources();
        this.f1179j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
        this.f1172a = new Handler();
    }
}
