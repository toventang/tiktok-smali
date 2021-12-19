package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.a.a.b;
import com.bytedance.covode.number.Covode;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f1144a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1145b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1146c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1147d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1148e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1149f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1150g;

    /* renamed from: h  reason: collision with root package name */
    private char f1151h;

    /* renamed from: i  reason: collision with root package name */
    private int f1152i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f1153j;

    /* renamed from: k  reason: collision with root package name */
    private int f1154k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1155l;

    /* renamed from: m  reason: collision with root package name */
    private int f1156m;
    private Context n;
    private MenuItem.OnMenuItemClickListener o;
    private CharSequence p;
    private CharSequence q;
    private ColorStateList r;
    private PorterDuff.Mode s;
    private boolean t;
    private boolean u;
    private int v = 16;

    static {
        Covode.recordClassIndex(326);
    }

    @Override // androidx.core.a.a.b
    public final androidx.core.h.b a() {
        return null;
    }

    @Override // androidx.core.a.a.b
    public final boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.a.a.b
    public final boolean expandActionView() {
        return false;
    }

    @Override // androidx.core.a.a.b
    public final View getActionView() {
        return null;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.a.a.b
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // androidx.core.a.a.b
    public final void setShowAsAction(int i2) {
    }

    @Override // androidx.core.a.a.b
    public final int getAlphabeticModifiers() {
        return this.f1154k;
    }

    public final char getAlphabeticShortcut() {
        return this.f1153j;
    }

    @Override // androidx.core.a.a.b
    public final CharSequence getContentDescription() {
        return this.p;
    }

    public final int getGroupId() {
        return this.f1145b;
    }

    public final Drawable getIcon() {
        return this.f1155l;
    }

    @Override // androidx.core.a.a.b
    public final ColorStateList getIconTintList() {
        return this.r;
    }

    @Override // androidx.core.a.a.b
    public final PorterDuff.Mode getIconTintMode() {
        return this.s;
    }

    public final Intent getIntent() {
        return this.f1150g;
    }

    public final int getItemId() {
        return this.f1144a;
    }

    @Override // androidx.core.a.a.b
    public final int getNumericModifiers() {
        return this.f1152i;
    }

    public final char getNumericShortcut() {
        return this.f1151h;
    }

    public final int getOrder() {
        return this.f1147d;
    }

    public final CharSequence getTitle() {
        return this.f1148e;
    }

    @Override // androidx.core.a.a.b
    public final CharSequence getTooltipText() {
        return this.q;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1149f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f1148e;
    }

    public final boolean isCheckable() {
        if ((this.v & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.v & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.v & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.v & 8) == 0) {
            return true;
        }
        return false;
    }

    private void b() {
        Drawable drawable = this.f1155l;
        if (drawable == null) {
            return;
        }
        if (this.t || this.u) {
            Drawable e2 = androidx.core.graphics.drawable.a.e(drawable);
            this.f1155l = e2;
            Drawable mutate = e2.mutate();
            this.f1155l = mutate;
            if (this.t) {
                androidx.core.graphics.drawable.a.a(mutate, this.r);
            }
            if (this.u) {
                androidx.core.graphics.drawable.a.a(this.f1155l, this.s);
            }
        }
    }

    @Override // androidx.core.a.a.b
    public final b a(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    @Override // androidx.core.a.a.b
    public final b b(CharSequence charSequence) {
        this.q = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f1150g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.f1151h = c2;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.o = onMenuItemClickListener;
        return this;
    }

    @Override // androidx.core.a.a.b
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1148e = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1149f = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.q = charSequence;
        return this;
    }

    @Override // androidx.core.a.a.b
    public final b a(androidx.core.h.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.a.a.b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f1153j = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.v = (z ? 1 : 0) | (this.v & -2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.a.a.b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setChecked(boolean z) {
        int i2;
        int i3 = this.v & -3;
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.v = i2 | i3;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        int i2;
        int i3 = this.v & -17;
        if (z) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        this.v = i2 | i3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f1156m = i2;
        this.f1155l = androidx.core.content.b.a(this.n, i2);
        b();
        return this;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.r = colorStateList;
        this.t = true;
        b();
        return this;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.s = mode;
        this.u = true;
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f1148e = this.n.getResources().getString(i2);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.v & 8;
        if (z) {
            i2 = 0;
        }
        this.v = i3 | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1155l = drawable;
        this.f1156m = 0;
        b();
        return this;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1153j = Character.toLowerCase(c2);
        this.f1154k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f1151h = c2;
        this.f1152i = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.f1151h = c2;
        this.f1153j = Character.toLowerCase(c3);
        return this;
    }

    public a(Context context, CharSequence charSequence) {
        this.n = context;
        this.f1144a = 16908332;
        this.f1145b = 0;
        this.f1146c = 0;
        this.f1147d = 0;
        this.f1148e = charSequence;
    }

    @Override // androidx.core.a.a.b
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1151h = c2;
        this.f1152i = KeyEvent.normalizeMetaState(i2);
        this.f1153j = Character.toLowerCase(c3);
        this.f1154k = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
