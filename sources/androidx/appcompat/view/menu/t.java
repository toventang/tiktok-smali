package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ac;
import androidx.appcompat.widget.x;
import androidx.core.h.v;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class t extends m implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: e  reason: collision with root package name */
    private static final int f1264e = R.layout.ak;

    /* renamed from: a  reason: collision with root package name */
    final ac f1265a;

    /* renamed from: b  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1266b = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class androidx.appcompat.view.menu.t.AnonymousClass1 */

        static {
            Covode.recordClassIndex(363);
        }

        public final void onGlobalLayout() {
            if (t.this.e() && !t.this.f1265a.v) {
                View view = t.this.f1267c;
                if (view == null || !view.isShown()) {
                    t.this.d();
                } else {
                    t.this.f1265a.c();
                }
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    View f1267c;

    /* renamed from: d  reason: collision with root package name */
    ViewTreeObserver f1268d;

    /* renamed from: f  reason: collision with root package name */
    private final Context f1269f;

    /* renamed from: h  reason: collision with root package name */
    private final h f1270h;

    /* renamed from: i  reason: collision with root package name */
    private final g f1271i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f1272j;

    /* renamed from: k  reason: collision with root package name */
    private final int f1273k;

    /* renamed from: l  reason: collision with root package name */
    private final int f1274l;

    /* renamed from: m  reason: collision with root package name */
    private final int f1275m;
    private final View.OnAttachStateChangeListener n = new View.OnAttachStateChangeListener() {
        /* class androidx.appcompat.view.menu.t.AnonymousClass2 */

        static {
            Covode.recordClassIndex(364);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (t.this.f1268d != null) {
                if (!t.this.f1268d.isAlive()) {
                    t.this.f1268d = view.getViewTreeObserver();
                }
                t.this.f1268d.removeGlobalOnLayoutListener(t.this.f1266b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private PopupWindow.OnDismissListener o;
    private View p;
    private o.a q;
    private boolean r;
    private boolean s;
    private int t;
    private int u = 0;
    private boolean v;

    @Override // androidx.appcompat.view.menu.o
    public final void a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.m
    public final void a(h hVar) {
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final Parcelable f() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.s
    public final ListView g() {
        return this.f1265a.f1473e;
    }

    static {
        Covode.recordClassIndex(362);
    }

    @Override // androidx.appcompat.view.menu.s
    public final void d() {
        if (e()) {
            this.f1265a.d();
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public final boolean e() {
        if (this.r || !this.f1265a.w.isShowing()) {
            return false;
        }
        return true;
    }

    public final void onDismiss() {
        this.r = true;
        this.f1270h.close();
        ViewTreeObserver viewTreeObserver = this.f1268d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1268d = this.f1267c.getViewTreeObserver();
            }
            this.f1268d.removeGlobalOnLayoutListener(this.f1266b);
            this.f1268d = null;
        }
        this.f1267c.removeOnAttachStateChangeListener(this.n);
        PopupWindow.OnDismissListener onDismissListener = this.o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public final void c() {
        View view;
        boolean z;
        if (!e()) {
            if (this.r || (view = this.p) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.f1267c = view;
            this.f1265a.a(this);
            this.f1265a.q = this;
            this.f1265a.b();
            View view2 = this.f1267c;
            if (this.f1268d == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f1268d = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1266b);
            }
            view2.addOnAttachStateChangeListener(this.n);
            this.f1265a.o = view2;
            this.f1265a.f1478j = this.u;
            if (!this.s) {
                this.t = a(this.f1271i, null, this.f1269f, this.f1273k);
                this.s = true;
            }
            this.f1265a.b(this.t);
            this.f1265a.h();
            this.f1265a.u = this.f1250g;
            this.f1265a.c();
            x xVar = this.f1265a.f1473e;
            xVar.setOnKeyListener(this);
            if (this.v && this.f1270h.f1218h != null) {
                FrameLayout frameLayout = (FrameLayout) a.a(LayoutInflater.from(this.f1269f), R.layout.aj, xVar, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(this.f1270h.f1218h);
                }
                frameLayout.setEnabled(false);
                xVar.addHeaderView(frameLayout, null, false);
            }
            this.f1265a.a(this.f1271i);
            this.f1265a.c();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void a(int i2) {
        this.u = i2;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void c(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(int i2) {
        this.f1265a.f1476h = i2;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void c(int i2) {
        this.f1265a.a(i2);
    }

    @Override // androidx.appcompat.view.menu.m
    public final void a(View view) {
        this.p = view;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(boolean z) {
        this.f1271i.f1206b = z;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.o = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(o.a aVar) {
        this.q = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(boolean z) {
        this.s = false;
        g gVar = this.f1271i;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a(u uVar) {
        if (uVar.hasVisibleItems()) {
            n nVar = new n(this.f1269f, uVar, this.f1267c, this.f1272j, this.f1274l, this.f1275m);
            nVar.a(this.q);
            nVar.a(m.b(uVar));
            nVar.f1253c = this.o;
            this.o = null;
            this.f1270h.a(false);
            int i2 = this.f1265a.f1476h;
            int f2 = this.f1265a.f();
            if ((Gravity.getAbsoluteGravity(this.u, v.e(this.p)) & 7) == 5) {
                i2 += this.p.getWidth();
            }
            if (!nVar.e()) {
                if (nVar.f1251a != null) {
                    nVar.a(i2, f2, true, true);
                }
            }
            o.a aVar = this.q;
            if (aVar != null) {
                aVar.a(uVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(h hVar, boolean z) {
        if (hVar == this.f1270h) {
            d();
            o.a aVar = this.q;
            if (aVar != null) {
                aVar.a(hVar, z);
            }
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        d();
        return true;
    }

    public t(Context context, h hVar, View view, int i2, int i3, boolean z) {
        this.f1269f = context;
        this.f1270h = hVar;
        this.f1272j = z;
        this.f1271i = new g(hVar, LayoutInflater.from(context), z, f1264e);
        this.f1274l = i2;
        this.f1275m = i3;
        Resources resources = context.getResources();
        this.f1273k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
        this.p = view;
        this.f1265a = new ac(context, i2, i3);
        hVar.a(this, context);
    }
}
