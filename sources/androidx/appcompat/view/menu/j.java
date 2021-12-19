package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.p;
import androidx.core.a.a.b;
import androidx.core.h.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;

public final class j implements b {
    private int A = 16;
    private int B;
    private View C;
    private MenuItem.OnActionExpandListener D;
    private boolean E;

    /* renamed from: a  reason: collision with root package name */
    public final int f1228a;

    /* renamed from: b  reason: collision with root package name */
    int f1229b = 4096;

    /* renamed from: c  reason: collision with root package name */
    int f1230c = 4096;

    /* renamed from: d  reason: collision with root package name */
    h f1231d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f1232e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.core.h.b f1233f;

    /* renamed from: g  reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f1234g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1235h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1236i;

    /* renamed from: j  reason: collision with root package name */
    private final int f1237j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1238k;

    /* renamed from: l  reason: collision with root package name */
    private CharSequence f1239l;

    /* renamed from: m  reason: collision with root package name */
    private Intent f1240m;
    private char n;
    private char o;
    private Drawable p;
    private int q;
    private u r;
    private MenuItem.OnMenuItemClickListener s;
    private CharSequence t;
    private CharSequence u;
    private ColorStateList v;
    private PorterDuff.Mode w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        Covode.recordClassIndex(343);
    }

    @Override // androidx.core.a.a.b
    public final androidx.core.h.b a() {
        return this.f1233f;
    }

    @Override // androidx.core.a.a.b
    public final int getAlphabeticModifiers() {
        return this.f1230c;
    }

    public final char getAlphabeticShortcut() {
        return this.o;
    }

    @Override // androidx.core.a.a.b
    public final CharSequence getContentDescription() {
        return this.t;
    }

    public final int getGroupId() {
        return this.f1236i;
    }

    @Override // androidx.core.a.a.b
    public final ColorStateList getIconTintList() {
        return this.v;
    }

    @Override // androidx.core.a.a.b
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    public final Intent getIntent() {
        return this.f1240m;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f1235h;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1234g;
    }

    @Override // androidx.core.a.a.b
    public final int getNumericModifiers() {
        return this.f1229b;
    }

    public final char getNumericShortcut() {
        return this.n;
    }

    public final int getOrder() {
        return this.f1237j;
    }

    public final SubMenu getSubMenu() {
        return this.r;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f1238k;
    }

    @Override // androidx.core.a.a.b
    public final CharSequence getTooltipText() {
        return this.u;
    }

    @Override // androidx.core.a.a.b
    public final boolean isActionViewExpanded() {
        return this.E;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final boolean hasSubMenu() {
        if (this.r != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final char c() {
        if (this.f1231d.c()) {
            return this.o;
        }
        return this.n;
    }

    public final boolean e() {
        if ((this.A & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.A & 32) == 32) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.B & 1) == 1) {
            return true;
        }
        return false;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1239l;
        if (charSequence == null) {
            charSequence = this.f1238k;
        }
        int i2 = Build.VERSION.SDK_INT;
        return charSequence;
    }

    public final boolean h() {
        if ((this.B & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.B & 4) == 4) {
            return true;
        }
        return false;
    }

    public final boolean isCheckable() {
        if ((this.A & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.A & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.A & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        CharSequence charSequence = this.f1238k;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.a.a.b
    public final boolean collapseActionView() {
        if ((this.B & 8) == 0) {
            return false;
        }
        if (this.C == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.D;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1231d.b(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (!this.f1231d.d() || c() == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.a.a.b
    public final boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.D;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1231d.a(this);
        }
        return false;
    }

    @Override // androidx.core.a.a.b
    public final View getActionView() {
        View view = this.C;
        if (view != null) {
            return view;
        }
        androidx.core.h.b bVar = this.f1233f;
        if (bVar == null) {
            return null;
        }
        View a2 = bVar.a(this);
        this.C = a2;
        return a2;
    }

    public final boolean j() {
        androidx.core.h.b bVar;
        if ((this.B & 8) != 0) {
            if (this.C == null && (bVar = this.f1233f) != null) {
                this.C = bVar.a(this);
            }
            if (this.C != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.s;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        h hVar = this.f1231d;
        if (hVar.a(hVar, this)) {
            return true;
        }
        Runnable runnable = this.f1232e;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1240m != null) {
            try {
                Context context = this.f1231d.f1211a;
                Intent intent = this.f1240m;
                a.a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        androidx.core.h.b bVar = this.f1233f;
        if (bVar == null || !bVar.b()) {
            return false;
        }
        return true;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.p;
        if (drawable != null) {
            return a(drawable);
        }
        if (this.q == 0) {
            return null;
        }
        Drawable b2 = androidx.appcompat.a.a.a.b(this.f1231d.f1211a, this.q);
        this.q = 0;
        this.p = b2;
        return a(b2);
    }

    public final boolean isVisible() {
        androidx.core.h.b bVar = this.f1233f;
        if (bVar == null || !bVar.d()) {
            if ((this.A & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.A & 8) != 0 || !this.f1233f.e()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setIntent(Intent intent) {
        this.f1240m = intent;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.D = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.s = onMenuItemClickListener;
        return this;
    }

    @Override // androidx.core.a.a.b
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.a.a.b
    /* renamed from: a */
    public final b setContentDescription(CharSequence charSequence) {
        this.t = charSequence;
        this.f1231d.b(false);
        return this;
    }

    @Override // androidx.core.a.a.b
    /* renamed from: b */
    public final b setTooltipText(CharSequence charSequence) {
        this.u = charSequence;
        this.f1231d.b(false);
        return this;
    }

    public final void d(boolean z2) {
        this.E = z2;
        this.f1231d.b(false);
    }

    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.A;
        int i3 = (z2 ? 1 : 0) | (i2 & -2);
        this.A = i3;
        if (i2 != i3) {
            this.f1231d.b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.p = null;
        this.q = i2;
        this.z = true;
        this.f1231d.b(false);
        return this;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.f1231d.b(false);
        return this;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.f1231d.b(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.n == c2) {
            return this;
        }
        this.n = c2;
        this.f1231d.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        return setTitle(this.f1231d.f1211a.getString(i2));
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1239l = charSequence;
        this.f1231d.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        if (b(z2)) {
            this.f1231d.g();
        }
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public b setActionView(View view) {
        int i2;
        this.C = view;
        this.f1233f = null;
        if (view != null && view.getId() == -1 && (i2 = this.f1235h) > 0) {
            view.setId(i2);
        }
        this.f1231d.h();
        return this;
    }

    private void e(boolean z2) {
        int i2;
        int i3 = this.A;
        int i4 = i3 & -3;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        int i5 = i2 | i4;
        this.A = i5;
        if (i3 != i5) {
            this.f1231d.b(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(boolean z2) {
        int i2;
        int i3 = this.A;
        int i4 = i3 & -9;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        int i5 = i2 | i4;
        this.A = i5;
        if (i3 != i5) {
            return true;
        }
        return false;
    }

    public final void c(boolean z2) {
        if (z2) {
            this.A |= 32;
        } else {
            this.A &= -33;
        }
    }

    @Override // androidx.core.a.a.b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i2) {
        Context context = this.f1231d.f1211a;
        setActionView(com.a.a(LayoutInflater.from(context), i2, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.o == c2) {
            return this;
        }
        this.o = Character.toLowerCase(c2);
        this.f1231d.b(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.A |= 16;
        } else {
            this.A &= -17;
        }
        this.f1231d.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.q = 0;
        this.p = drawable;
        this.z = true;
        this.f1231d.b(false);
        return this;
    }

    @Override // androidx.core.a.a.b
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.B = i2;
            this.f1231d.h();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1238k = charSequence;
        this.f1231d.b(false);
        u uVar = this.r;
        if (uVar != null) {
            uVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    private Drawable a(Drawable drawable) {
        if (drawable != null && this.z && (this.x || this.y)) {
            drawable = androidx.core.graphics.drawable.a.e(drawable).mutate();
            if (this.x) {
                androidx.core.graphics.drawable.a.a(drawable, this.v);
            }
            if (this.y) {
                androidx.core.graphics.drawable.a.a(drawable, this.w);
            }
            this.z = false;
        }
        return drawable;
    }

    @Override // androidx.core.a.a.b
    public final b a(androidx.core.h.b bVar) {
        androidx.core.h.b bVar2 = this.f1233f;
        if (bVar2 != null) {
            bVar2.f2522g = null;
            bVar2.f2521f = null;
        }
        this.C = null;
        this.f1233f = bVar;
        this.f1231d.b(true);
        androidx.core.h.b bVar3 = this.f1233f;
        if (bVar3 != null) {
            bVar3.a(new b.AbstractC0036b() {
                /* class androidx.appcompat.view.menu.j.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(344);
                }

                @Override // androidx.core.h.b.AbstractC0036b
                public final void a() {
                    j.this.f1231d.g();
                }
            });
        }
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        boolean z3;
        if ((this.A & 4) != 0) {
            h hVar = this.f1231d;
            int groupId = getGroupId();
            int size = hVar.f1214d.size();
            hVar.e();
            for (int i2 = 0; i2 < size; i2++) {
                j jVar = hVar.f1214d.get(i2);
                if (jVar.getGroupId() == groupId && jVar.e() && jVar.isCheckable()) {
                    if (jVar == this) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    jVar.e(z3);
                }
            }
            hVar.f();
        } else {
            e(z2);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence a(p.a aVar) {
        if (aVar.a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    public final void a(u uVar) {
        this.r = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    public final void a(boolean z2) {
        int i2;
        int i3 = this.A & -5;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        this.A = i2 | i3;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.n = c2;
        this.o = Character.toLowerCase(c3);
        this.f1231d.b(false);
        return this;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.n == c2 && this.f1229b == i2) {
            return this;
        }
        this.n = c2;
        this.f1229b = KeyEvent.normalizeMetaState(i2);
        this.f1231d.b(false);
        return this;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.o == c2 && this.f1230c == i2) {
            return this;
        }
        this.o = Character.toLowerCase(c2);
        this.f1230c = KeyEvent.normalizeMetaState(i2);
        this.f1231d.b(false);
        return this;
    }

    static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.n = c2;
        this.f1229b = KeyEvent.normalizeMetaState(i2);
        this.o = Character.toLowerCase(c3);
        this.f1230c = KeyEvent.normalizeMetaState(i3);
        this.f1231d.b(false);
        return this;
    }

    j(h hVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f1231d = hVar;
        this.f1235h = i3;
        this.f1236i = i2;
        this.f1237j = i4;
        this.f1228a = i5;
        this.f1238k = charSequence;
        this.B = i6;
    }
}
