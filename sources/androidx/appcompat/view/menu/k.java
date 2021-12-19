package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public class k extends c<androidx.core.a.a.b> implements MenuItem {

    /* renamed from: c  reason: collision with root package name */
    public Method f1242c;

    static {
        Covode.recordClassIndex(345);
    }

    /* access modifiers changed from: package-private */
    public class a extends androidx.core.h.b {

        /* renamed from: a  reason: collision with root package name */
        final ActionProvider f1243a;

        static {
            Covode.recordClassIndex(346);
        }

        @Override // androidx.core.h.b
        public final View a() {
            return this.f1243a.onCreateActionView();
        }

        @Override // androidx.core.h.b
        public final boolean b() {
            return this.f1243a.onPerformDefaultAction();
        }

        @Override // androidx.core.h.b
        public final boolean c() {
            return this.f1243a.hasSubMenu();
        }

        @Override // androidx.core.h.b
        public final void a(SubMenu subMenu) {
            this.f1243a.onPrepareSubMenu(k.this.a(subMenu));
        }

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1243a = actionProvider;
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a  reason: collision with root package name */
        final CollapsibleActionView f1245a;

        static {
            Covode.recordClassIndex(347);
        }

        @Override // androidx.appcompat.view.c
        public final void a() {
            this.f1245a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public final void b() {
            this.f1245a.onActionViewCollapsed();
        }

        b(View view) {
            super(view.getContext());
            this.f1245a = (CollapsibleActionView) view;
            addView(view);
        }
    }

    public boolean collapseActionView() {
        return ((androidx.core.a.a.b) this.f1170b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((androidx.core.a.a.b) this.f1170b).expandActionView();
    }

    public int getAlphabeticModifiers() {
        return ((androidx.core.a.a.b) this.f1170b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((androidx.core.a.a.b) this.f1170b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((androidx.core.a.a.b) this.f1170b).getContentDescription();
    }

    public int getGroupId() {
        return ((androidx.core.a.a.b) this.f1170b).getGroupId();
    }

    public Drawable getIcon() {
        return ((androidx.core.a.a.b) this.f1170b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((androidx.core.a.a.b) this.f1170b).getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((androidx.core.a.a.b) this.f1170b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((androidx.core.a.a.b) this.f1170b).getIntent();
    }

    public int getItemId() {
        return ((androidx.core.a.a.b) this.f1170b).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((androidx.core.a.a.b) this.f1170b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((androidx.core.a.a.b) this.f1170b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((androidx.core.a.a.b) this.f1170b).getNumericShortcut();
    }

    public int getOrder() {
        return ((androidx.core.a.a.b) this.f1170b).getOrder();
    }

    public SubMenu getSubMenu() {
        return a(((androidx.core.a.a.b) this.f1170b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((androidx.core.a.a.b) this.f1170b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((androidx.core.a.a.b) this.f1170b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((androidx.core.a.a.b) this.f1170b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((androidx.core.a.a.b) this.f1170b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((androidx.core.a.a.b) this.f1170b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((androidx.core.a.a.b) this.f1170b).isCheckable();
    }

    public boolean isChecked() {
        return ((androidx.core.a.a.b) this.f1170b).isChecked();
    }

    public boolean isEnabled() {
        return ((androidx.core.a.a.b) this.f1170b).isEnabled();
    }

    public boolean isVisible() {
        return ((androidx.core.a.a.b) this.f1170b).isVisible();
    }

    public ActionProvider getActionProvider() {
        androidx.core.h.b a2 = ((androidx.core.a.a.b) this.f1170b).a();
        if (a2 instanceof a) {
            return ((a) a2).f1243a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((androidx.core.a.a.b) this.f1170b).getActionView();
        if (actionView instanceof b) {
            return (View) ((b) actionView).f1245a;
        }
        return actionView;
    }

    /* access modifiers changed from: package-private */
    public a a(ActionProvider actionProvider) {
        return new a(this.f1167a, actionProvider);
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        ((androidx.core.a.a.b) this.f1170b).setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((androidx.core.a.a.b) this.f1170b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((androidx.core.a.a.b) this.f1170b).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((androidx.core.a.a.b) this.f1170b).a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((androidx.core.a.a.b) this.f1170b).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        ((androidx.core.a.a.b) this.f1170b).setIcon(i2);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((androidx.core.a.a.b) this.f1170b).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((androidx.core.a.a.b) this.f1170b).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((androidx.core.a.a.b) this.f1170b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        ((androidx.core.a.a.b) this.f1170b).setNumericShortcut(c2);
        return this;
    }

    public void setShowAsAction(int i2) {
        ((androidx.core.a.a.b) this.f1170b).setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        ((androidx.core.a.a.b) this.f1170b).setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        ((androidx.core.a.a.b) this.f1170b).setTitle(i2);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((androidx.core.a.a.b) this.f1170b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((androidx.core.a.a.b) this.f1170b).b(charSequence);
        return this;
    }

    class c extends d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        static {
            Covode.recordClassIndex(348);
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1170b).onMenuItemActionCollapse(k.this.a(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1170b).onMenuItemActionExpand(k.this.a(menuItem));
        }

        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }
    }

    class d extends d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        static {
            Covode.recordClassIndex(349);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1170b).onMenuItemClick(k.this.a(menuItem));
        }

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar;
        androidx.core.a.a.b bVar = (androidx.core.a.a.b) this.f1170b;
        if (actionProvider != null) {
            aVar = a(actionProvider);
        } else {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((androidx.core.a.a.b) this.f1170b).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((androidx.core.a.a.b) this.f1170b).setTitle(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((androidx.core.a.a.b) this.f1170b).setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        ((androidx.core.a.a.b) this.f1170b).setActionView(i2);
        View actionView = ((androidx.core.a.a.b) this.f1170b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((androidx.core.a.a.b) this.f1170b).setActionView(new b(actionView));
        }
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        c cVar;
        androidx.core.a.a.b bVar = (androidx.core.a.a.b) this.f1170b;
        if (onActionExpandListener != null) {
            cVar = new c(onActionExpandListener);
        } else {
            cVar = null;
        }
        bVar.setOnActionExpandListener(cVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        d dVar;
        androidx.core.a.a.b bVar = (androidx.core.a.a.b) this.f1170b;
        if (onMenuItemClickListener != null) {
            dVar = new d(onMenuItemClickListener);
        } else {
            dVar = null;
        }
        bVar.setOnMenuItemClickListener(dVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((androidx.core.a.a.b) this.f1170b).setActionView(view);
        return this;
    }

    k(Context context, androidx.core.a.a.b bVar) {
        super(context, bVar);
    }

    public MenuItem setShortcut(char c2, char c3) {
        ((androidx.core.a.a.b) this.f1170b).setShortcut(c2, c3);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        ((androidx.core.a.a.b) this.f1170b).setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        ((androidx.core.a.a.b) this.f1170b).setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        ((androidx.core.a.a.b) this.f1170b).setShortcut(c2, c3, i2, i3);
        return this;
    }
}
