package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.g;
import androidx.appcompat.view.h;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.af;
import androidx.appcompat.widget.v;
import androidx.core.h.aa;
import androidx.core.h.ab;
import androidx.core.h.ac;
import androidx.core.h.z;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class m extends a implements ActionBarOverlayLayout.a {
    static final /* synthetic */ boolean s = true;
    private static final Interpolator t = new AccelerateInterpolator();
    private static final Interpolator u = new DecelerateInterpolator();
    private boolean A;
    private boolean B;
    private ArrayList<Object> C = new ArrayList<>();
    private boolean D;
    private int E = 0;
    private boolean F;
    private boolean G = true;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    Context f984a;

    /* renamed from: b  reason: collision with root package name */
    ActionBarOverlayLayout f985b;

    /* renamed from: c  reason: collision with root package name */
    ActionBarContainer f986c;

    /* renamed from: d  reason: collision with root package name */
    v f987d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContextView f988e;

    /* renamed from: f  reason: collision with root package name */
    View f989f;

    /* renamed from: g  reason: collision with root package name */
    af f990g;

    /* renamed from: h  reason: collision with root package name */
    a f991h;

    /* renamed from: i  reason: collision with root package name */
    b f992i;

    /* renamed from: j  reason: collision with root package name */
    b.a f993j;

    /* renamed from: k  reason: collision with root package name */
    boolean f994k = true;

    /* renamed from: l  reason: collision with root package name */
    boolean f995l;

    /* renamed from: m  reason: collision with root package name */
    boolean f996m;
    h n;
    boolean o;
    final aa p = new ab() {
        /* class androidx.appcompat.app.m.AnonymousClass1 */

        static {
            Covode.recordClassIndex(287);
        }

        @Override // androidx.core.h.aa, androidx.core.h.ab
        public final void b(View view) {
            if (m.this.f994k && m.this.f989f != null) {
                m.this.f989f.setTranslationY(0.0f);
                m.this.f986c.setTranslationY(0.0f);
            }
            m.this.f986c.setVisibility(8);
            m.this.f986c.setTransitioning(false);
            m.this.n = null;
            m mVar = m.this;
            if (mVar.f993j != null) {
                mVar.f993j.a(mVar.f992i);
                mVar.f992i = null;
                mVar.f993j = null;
            }
            if (m.this.f985b != null) {
                androidx.core.h.v.n(m.this.f985b);
            }
        }
    };
    final aa q = new ab() {
        /* class androidx.appcompat.app.m.AnonymousClass2 */

        static {
            Covode.recordClassIndex(288);
        }

        @Override // androidx.core.h.aa, androidx.core.h.ab
        public final void b(View view) {
            m.this.n = null;
            m.this.f986c.requestLayout();
        }
    };
    final ac r = new ac() {
        /* class androidx.appcompat.app.m.AnonymousClass3 */

        static {
            Covode.recordClassIndex(289);
        }

        @Override // androidx.core.h.ac
        public final void a() {
            ((View) m.this.f986c.getParent()).invalidate();
        }
    };
    private Context v;
    private Activity w;
    private Dialog x;
    private ArrayList<Object> y = new ArrayList<>();
    private int z = -1;

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    public class a extends b implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final androidx.appcompat.view.menu.h f1000a;

        /* renamed from: e  reason: collision with root package name */
        private final Context f1002e;

        /* renamed from: f  reason: collision with root package name */
        private b.a f1003f;

        /* renamed from: g  reason: collision with root package name */
        private WeakReference<View> f1004g;

        static {
            Covode.recordClassIndex(290);
        }

        @Override // androidx.appcompat.view.b
        public final Menu b() {
            return this.f1000a;
        }

        @Override // androidx.appcompat.view.b
        public final MenuInflater a() {
            return new g(this.f1002e);
        }

        @Override // androidx.appcompat.view.b
        public final boolean h() {
            return m.this.f988e.f1288g;
        }

        @Override // androidx.appcompat.view.b
        public final CharSequence f() {
            return m.this.f988e.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public final CharSequence g() {
            return m.this.f988e.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public final View i() {
            WeakReference<View> weakReference = this.f1004g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public final void d() {
            if (m.this.f991h == this) {
                this.f1000a.e();
                try {
                    this.f1003f.b(this, this.f1000a);
                } finally {
                    this.f1000a.f();
                }
            }
        }

        public final boolean e() {
            this.f1000a.e();
            try {
                return this.f1003f.a(this, this.f1000a);
            } finally {
                this.f1000a.f();
            }
        }

        @Override // androidx.appcompat.view.b
        public final void c() {
            if (m.this.f991h == this) {
                if (!m.a(m.this.f995l, m.this.f996m, false)) {
                    m.this.f992i = this;
                    m.this.f993j = this.f1003f;
                } else {
                    this.f1003f.a(this);
                }
                this.f1003f = null;
                m.this.f(false);
                m.this.f988e.b();
                m.this.f987d.a().sendAccessibilityEvent(32);
                m.this.f985b.setHideOnContentScrollEnabled(m.this.o);
                m.this.f991h = null;
            }
        }

        @Override // androidx.appcompat.view.b
        public final void b(CharSequence charSequence) {
            m.this.f988e.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public final void a(int i2) {
            b(m.this.f984a.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.b
        public final void b(int i2) {
            a(m.this.f984a.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.b
        public final void a(View view) {
            m.this.f988e.setCustomView(view);
            this.f1004g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void a(androidx.appcompat.view.menu.h hVar) {
            if (this.f1003f != null) {
                d();
                m.this.f988e.a();
            }
        }

        @Override // androidx.appcompat.view.b
        public final void a(CharSequence charSequence) {
            m.this.f988e.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public final void a(boolean z) {
            super.a(z);
            m.this.f988e.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            b.a aVar = this.f1003f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        public a(Context context, b.a aVar) {
            this.f1002e = context;
            this.f1003f = aVar;
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            hVar.f1216f = 1;
            this.f1000a = hVar;
            hVar.a(this);
        }
    }

    @Override // androidx.appcompat.app.a
    public final void a(boolean z2) {
        a(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public final boolean a(int i2, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.h hVar;
        a aVar = this.f991h;
        if (aVar == null || (hVar = aVar.f1000a) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        hVar.setQwertyMode(z2);
        return hVar.performShortcut(i2, keyEvent, 0);
    }

    private int n() {
        return this.f987d.n();
    }

    @Override // androidx.appcompat.app.a
    public final void a() {
        a(0, 8);
    }

    @Override // androidx.appcompat.app.a
    public final int b() {
        return this.f987d.m();
    }

    @Override // androidx.appcompat.app.a
    public final void c() {
        if (!this.f995l) {
            this.f995l = true;
            h(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.a
    public final void k() {
        if (this.f996m) {
            this.f996m = false;
            h(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.a
    public final void l() {
        if (!this.f996m) {
            this.f996m = true;
            h(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.a
    public final void m() {
        androidx.appcompat.view.h hVar = this.n;
        if (hVar != null) {
            hVar.b();
            this.n = null;
        }
    }

    static {
        Covode.recordClassIndex(286);
    }

    private void o() {
        if (!this.F) {
            this.F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f985b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            h(false);
        }
    }

    private void p() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f985b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            h(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public final void e() {
        if (this.f985b.f1299b) {
            this.o = true;
            this.f985b.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    @Override // androidx.appcompat.app.a
    public final boolean i() {
        v vVar = this.f987d;
        if (vVar == null || !vVar.c()) {
            return false;
        }
        this.f987d.d();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final Context d() {
        if (this.v == null) {
            TypedValue typedValue = new TypedValue();
            this.f984a.getTheme().resolveAttribute(R.attr.h7, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.v = new ContextThemeWrapper(this.f984a, i2);
            } else {
                this.v = this.f984a;
            }
        }
        return this.v;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.a
    public final void b(int i2) {
        this.E = i2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.a
    public final void e(boolean z2) {
        this.f994k = z2;
    }

    @Override // androidx.appcompat.app.a
    public final void b(boolean z2) {
        if (!this.A) {
            a(z2);
        }
    }

    @Override // androidx.appcompat.app.a
    public final void c(boolean z2) {
        androidx.appcompat.view.h hVar;
        this.H = z2;
        if (!z2 && (hVar = this.n) != null) {
            hVar.b();
        }
    }

    @Override // androidx.appcompat.app.a
    public final void d(boolean z2) {
        if (z2 != this.B) {
            this.B = z2;
            int size = this.C.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.C.get(i2);
            }
        }
    }

    public m(Dialog dialog) {
        this.x = dialog;
        a(dialog.getWindow().getDecorView());
    }

    private static v b(View view) {
        String str;
        if (view instanceof v) {
            return (v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        throw new IllegalStateException(sb.append(str).toString());
    }

    private void h(boolean z2) {
        if (a(this.f995l, this.f996m, this.F)) {
            if (!this.G) {
                this.G = true;
                i(z2);
            }
        } else if (this.G) {
            this.G = false;
            j(z2);
        }
    }

    @Override // androidx.appcompat.app.a
    public final b a(b.a aVar) {
        a aVar2 = this.f991h;
        if (aVar2 != null) {
            aVar2.c();
        }
        this.f985b.setHideOnContentScrollEnabled(false);
        this.f988e.c();
        a aVar3 = new a(this.f988e.getContext(), aVar);
        if (!aVar3.e()) {
            return null;
        }
        this.f991h = aVar3;
        aVar3.d();
        this.f988e.a(aVar3);
        f(true);
        this.f988e.sendAccessibilityEvent(32);
        return aVar3;
    }

    private void g(boolean z2) {
        boolean z3;
        boolean z4;
        this.D = z2;
        if (!z2) {
            this.f987d.a((af) null);
            this.f986c.setTabContainer(this.f990g);
        } else {
            this.f986c.setTabContainer(null);
            this.f987d.a(this.f990g);
        }
        boolean z5 = true;
        if (n() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        af afVar = this.f990g;
        if (afVar != null) {
            if (z3) {
                afVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f985b;
                if (actionBarOverlayLayout != null) {
                    androidx.core.h.v.n(actionBarOverlayLayout);
                }
            } else {
                afVar.setVisibility(8);
            }
        }
        v vVar = this.f987d;
        if (this.D || !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        vVar.a(z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f985b;
        if (this.D || !z3) {
            z5 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z5);
    }

    @Override // androidx.appcompat.app.a
    public final void a(float f2) {
        androidx.core.h.v.a(this.f986c, f2);
    }

    public final void f(boolean z2) {
        z a2;
        z a3;
        if (z2) {
            o();
        } else {
            p();
        }
        if (androidx.core.h.v.v(this.f986c)) {
            if (z2) {
                a3 = this.f987d.a(4, 100);
                a2 = this.f988e.a(0, 200);
            } else {
                a2 = this.f987d.a(0, 200);
                a3 = this.f988e.a(8, 100);
            }
            androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
            hVar.a(a3, a2);
            hVar.a();
        } else if (z2) {
            this.f987d.e(4);
            this.f988e.setVisibility(0);
        } else {
            this.f987d.e(0);
            this.f988e.setVisibility(8);
        }
    }

    private void a(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.air);
        this.f985b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f987d = b(view.findViewById(R.id.bx));
        this.f988e = (ActionBarContextView) view.findViewById(R.id.c7);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.bz);
        this.f986c = actionBarContainer;
        v vVar = this.f987d;
        if (vVar == null || this.f988e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f984a = vVar.b();
        if ((this.f987d.m() & 4) != 0) {
            this.A = true;
        }
        androidx.appcompat.view.a a2 = androidx.appcompat.view.a.a(this.f984a);
        a2.c();
        g(a2.b());
        TypedArray obtainStyledAttributes = this.f984a.obtainStyledAttributes(null, new int[]{R.attr.jc, R.attr.jf, R.attr.jg, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.pp, R.attr.pq, R.attr.qt, R.attr.rg, R.attr.ri, R.attr.sh, R.attr.vb, R.attr.vi, R.attr.vs, R.attr.vt, R.attr.vw, R.attr.wo, R.attr.y3, R.attr.a3r, R.attr.a69, R.attr.a7l, R.attr.a7x, R.attr.a7y, R.attr.afx, R.attr.ag0, R.attr.aiy, R.attr.aja}, R.attr.h2, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            e();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void i(boolean z2) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.n;
        if (hVar != null) {
            hVar.b();
        }
        this.f986c.setVisibility(0);
        if (this.E != 0 || (!this.H && !z2)) {
            this.f986c.setAlpha(1.0f);
            this.f986c.setTranslationY(0.0f);
            if (this.f994k && (view = this.f989f) != null) {
                view.setTranslationY(0.0f);
            }
            this.q.b(null);
        } else {
            this.f986c.setTranslationY(0.0f);
            float f2 = (float) (-this.f986c.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f986c.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f986c.setTranslationY(f2);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            z b2 = androidx.core.h.v.j(this.f986c).b(0.0f);
            b2.a(this.r);
            hVar2.a(b2);
            if (this.f994k && (view2 = this.f989f) != null) {
                view2.setTranslationY(f2);
                hVar2.a(androidx.core.h.v.j(this.f989f).b(0.0f));
            }
            hVar2.a(u);
            hVar2.c();
            hVar2.a(this.q);
            this.n = hVar2;
            hVar2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f985b;
        if (actionBarOverlayLayout != null) {
            androidx.core.h.v.n(actionBarOverlayLayout);
        }
    }

    private void j(boolean z2) {
        View view;
        androidx.appcompat.view.h hVar = this.n;
        if (hVar != null) {
            hVar.b();
        }
        if (this.E != 0 || (!this.H && !z2)) {
            this.p.b(null);
            return;
        }
        this.f986c.setAlpha(1.0f);
        this.f986c.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f2 = (float) (-this.f986c.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f986c.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        z b2 = androidx.core.h.v.j(this.f986c).b(f2);
        b2.a(this.r);
        hVar2.a(b2);
        if (this.f994k && (view = this.f989f) != null) {
            hVar2.a(androidx.core.h.v.j(view).b(f2));
        }
        hVar2.a(t);
        hVar2.c();
        hVar2.a(this.p);
        this.n = hVar2;
        hVar2.a();
    }

    @Override // androidx.appcompat.app.a
    public final void a(int i2) {
        this.f987d.d(i2);
    }

    @Override // androidx.appcompat.app.a
    public final void a(Configuration configuration) {
        g(androidx.appcompat.view.a.a(this.f984a).b());
    }

    @Override // androidx.appcompat.app.a
    public final void a(CharSequence charSequence) {
        this.f987d.a(charSequence);
    }

    private void a(int i2, int i3) {
        int m2 = this.f987d.m();
        if ((i3 & 4) != 0) {
            this.A = true;
        }
        this.f987d.c((i2 & i3) | ((i3 ^ -1) & m2));
    }

    public m(Activity activity, boolean z2) {
        this.w = activity;
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z2) {
            this.f989f = decorView.findViewById(16908290);
        }
    }
}
