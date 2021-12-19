package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.a.a.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.Toolbar;
import androidx.core.h.ab;
import androidx.core.h.v;
import androidx.core.h.z;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class am implements v {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1552a;

    /* renamed from: b  reason: collision with root package name */
    CharSequence f1553b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f1554c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1555d;

    /* renamed from: e  reason: collision with root package name */
    private int f1556e;

    /* renamed from: f  reason: collision with root package name */
    private View f1557f;

    /* renamed from: g  reason: collision with root package name */
    private View f1558g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f1559h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f1560i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1561j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1562k;

    /* renamed from: l  reason: collision with root package name */
    private CharSequence f1563l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f1564m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    static {
        Covode.recordClassIndex(471);
    }

    @Override // androidx.appcompat.widget.v
    public final void k() {
        this.f1555d = true;
    }

    @Override // androidx.appcompat.widget.v
    public final ViewGroup a() {
        return this.f1552a;
    }

    @Override // androidx.appcompat.widget.v
    public final int m() {
        return this.f1556e;
    }

    @Override // androidx.appcompat.widget.v
    public final int n() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.v
    public final void d() {
        this.f1552a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.v
    public final CharSequence e() {
        return this.f1552a.getTitle();
    }

    @Override // androidx.appcompat.widget.v
    public final boolean f() {
        return this.f1552a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.v
    public final boolean g() {
        return this.f1552a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.v
    public final boolean h() {
        return this.f1552a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.v
    public final boolean i() {
        return this.f1552a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.v
    public final boolean j() {
        return this.f1552a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.v
    public final void l() {
        this.f1552a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.v
    public final Menu o() {
        return this.f1552a.getMenu();
    }

    @Override // androidx.appcompat.widget.v
    public final boolean c() {
        return this.f1552a.hasExpandedActionView();
    }

    private void p() {
        Drawable drawable;
        int i2 = this.f1556e;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1560i;
            if (drawable == null) {
                drawable = this.f1559h;
            }
        } else {
            drawable = this.f1559h;
        }
        this.f1552a.setLogo(drawable);
    }

    private void q() {
        if ((this.f1556e & 4) != 0) {
            Toolbar toolbar = this.f1552a;
            Drawable drawable = this.f1561j;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1552a.setNavigationIcon((Drawable) null);
    }

    private void r() {
        if ((this.f1556e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1564m)) {
            this.f1552a.setNavigationContentDescription(this.p);
        } else {
            this.f1552a.setNavigationContentDescription(this.f1564m);
        }
    }

    @Override // androidx.appcompat.widget.v
    public final Context b() {
        return this.f1552a.getContext();
    }

    private void b(Drawable drawable) {
        this.f1560i = drawable;
        p();
    }

    private void c(CharSequence charSequence) {
        this.f1564m = charSequence;
        r();
    }

    @Override // androidx.appcompat.widget.v
    public final void a(Drawable drawable) {
        this.f1559h = drawable;
        p();
    }

    private void b(CharSequence charSequence) {
        this.f1553b = charSequence;
        if ((this.f1556e & 8) != 0) {
            this.f1552a.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.v
    public final void a(Window.Callback callback) {
        this.f1554c = callback;
    }

    @Override // androidx.appcompat.widget.v
    public final void e(int i2) {
        this.f1552a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.v
    public final void d(int i2) {
        String string;
        if (i2 == 0) {
            string = null;
        } else {
            string = this.f1552a.getContext().getString(i2);
        }
        c(string);
    }

    @Override // androidx.appcompat.widget.v
    public final void a(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = a.b(this.f1552a.getContext(), i2);
        } else {
            drawable = null;
        }
        a(drawable);
    }

    @Override // androidx.appcompat.widget.v
    public final void b(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = a.b(this.f1552a.getContext(), i2);
        } else {
            drawable = null;
        }
        b(drawable);
    }

    @Override // androidx.appcompat.widget.v
    public final void c(int i2) {
        View view;
        int i3 = this.f1556e ^ i2;
        this.f1556e = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    r();
                }
                q();
            }
            if ((i3 & 3) != 0) {
                p();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f1552a.setTitle(this.f1553b);
                    this.f1552a.setSubtitle(this.f1563l);
                } else {
                    this.f1552a.setTitle((CharSequence) null);
                    this.f1552a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.f1558g) != null) {
                if ((i2 & 16) != 0) {
                    this.f1552a.addView(view);
                } else {
                    this.f1552a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.v
    public final void a(af afVar) {
        Toolbar toolbar;
        View view = this.f1557f;
        if (view != null && view.getParent() == (toolbar = this.f1552a)) {
            toolbar.removeView(this.f1557f);
        }
        this.f1557f = afVar;
        if (afVar != null && this.o == 2) {
            this.f1552a.addView(afVar, 0);
            Toolbar.b bVar = (Toolbar.b) this.f1557f.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f895a = 8388691;
            afVar.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.v
    public final void a(CharSequence charSequence) {
        if (!this.f1562k) {
            b(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.v
    public final void a(boolean z) {
        this.f1552a.setCollapsible(z);
    }

    public am(Toolbar toolbar, boolean z) {
        this(toolbar, z, (byte) 0);
    }

    @Override // androidx.appcompat.widget.v
    public final z a(final int i2, long j2) {
        float f2;
        z j3 = v.j(this.f1552a);
        if (i2 == 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        return j3.a(f2).a(j2).a(new ab() {
            /* class androidx.appcompat.widget.am.AnonymousClass2 */

            /* renamed from: c  reason: collision with root package name */
            private boolean f1569c;

            static {
                Covode.recordClassIndex(473);
            }

            @Override // androidx.core.h.aa, androidx.core.h.ab
            public final void c(View view) {
                this.f1569c = true;
            }

            @Override // androidx.core.h.aa, androidx.core.h.ab
            public final void a(View view) {
                am.this.f1552a.setVisibility(0);
            }

            @Override // androidx.core.h.aa, androidx.core.h.ab
            public final void b(View view) {
                if (!this.f1569c) {
                    am.this.f1552a.setVisibility(i2);
                }
            }
        });
    }

    @Override // androidx.appcompat.widget.v
    public final void a(Menu menu, o.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1552a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.f1164h = R.id.cc;
        }
        this.n.f1162f = aVar;
        this.f1552a.setMenu((h) menu, this.n);
    }

    @Override // androidx.appcompat.widget.v
    public final void a(o.a aVar, h.a aVar2) {
        this.f1552a.setMenuCallbacks(aVar, aVar2);
    }

    private am(Toolbar toolbar, boolean z, byte b2) {
        boolean z2;
        Drawable drawable;
        this.f1552a = toolbar;
        this.f1553b = toolbar.getTitle();
        this.f1563l = toolbar.getSubtitle();
        if (this.f1553b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1562k = z2;
        this.f1561j = toolbar.getNavigationIcon();
        al a2 = al.a(toolbar.getContext(), null, new int[]{R.attr.jc, R.attr.jf, R.attr.jg, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.pp, R.attr.pq, R.attr.qt, R.attr.rg, R.attr.ri, R.attr.sh, R.attr.vb, R.attr.vi, R.attr.vs, R.attr.vt, R.attr.vw, R.attr.wo, R.attr.y3, R.attr.a3r, R.attr.a69, R.attr.a7l, R.attr.a7x, R.attr.a7y, R.attr.afx, R.attr.ag0, R.attr.aiy, R.attr.aja}, R.attr.h2, 0);
        int i2 = 15;
        this.q = a2.a(15);
        if (z) {
            CharSequence c2 = a2.c(27);
            if (!TextUtils.isEmpty(c2)) {
                this.f1562k = true;
                b(c2);
            }
            CharSequence c3 = a2.c(25);
            if (!TextUtils.isEmpty(c3)) {
                this.f1563l = c3;
                if ((this.f1556e & 8) != 0) {
                    this.f1552a.setSubtitle(c3);
                }
            }
            Drawable a3 = a2.a(20);
            if (a3 != null) {
                b(a3);
            }
            Drawable a4 = a2.a(17);
            if (a4 != null) {
                a(a4);
            }
            if (this.f1561j == null && (drawable = this.q) != null) {
                this.f1561j = drawable;
                q();
            }
            c(a2.a(10, 0));
            int g2 = a2.g(9, 0);
            if (g2 != 0) {
                View a5 = com.a.a(LayoutInflater.from(this.f1552a.getContext()), g2, this.f1552a, false);
                View view = this.f1558g;
                if (!(view == null || (this.f1556e & 16) == 0)) {
                    this.f1552a.removeView(view);
                }
                this.f1558g = a5;
                if (!(a5 == null || (this.f1556e & 16) == 0)) {
                    this.f1552a.addView(a5);
                }
                c(this.f1556e | 16);
            }
            int f2 = a2.f(13, 0);
            if (f2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1552a.getLayoutParams();
                layoutParams.height = f2;
                this.f1552a.setLayoutParams(layoutParams);
            }
            int d2 = a2.d(7, -1);
            int d3 = a2.d(3, -1);
            if (d2 >= 0 || d3 >= 0) {
                this.f1552a.setContentInsetsRelative(Math.max(d2, 0), Math.max(d3, 0));
            }
            int g3 = a2.g(28, 0);
            if (g3 != 0) {
                Toolbar toolbar2 = this.f1552a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), g3);
            }
            int g4 = a2.g(26, 0);
            if (g4 != 0) {
                Toolbar toolbar3 = this.f1552a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), g4);
            }
            int g5 = a2.g(22, 0);
            if (g5 != 0) {
                this.f1552a.setPopupTheme(g5);
            }
        } else {
            if (this.f1552a.getNavigationIcon() != null) {
                this.q = this.f1552a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f1556e = i2;
        }
        a2.f1549a.recycle();
        if (R.string.li != this.p) {
            this.p = R.string.li;
            if (TextUtils.isEmpty(this.f1552a.getNavigationContentDescription())) {
                d(this.p);
            }
        }
        this.f1564m = this.f1552a.getNavigationContentDescription();
        this.f1552a.setNavigationOnClickListener(new View.OnClickListener() {
            /* class androidx.appcompat.widget.am.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final androidx.appcompat.view.menu.a f1565a;

            static {
                Covode.recordClassIndex(472);
            }

            {
                this.f1565a = new androidx.appcompat.view.menu.a(am.this.f1552a.getContext(), am.this.f1553b);
            }

            public final void onClick(View view) {
                if (am.this.f1554c != null && am.this.f1555d) {
                    am.this.f1554c.onMenuItemSelected(0, this.f1565a);
                }
            }
        });
    }
}
