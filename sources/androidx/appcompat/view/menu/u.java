package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;
import com.bytedance.covode.number.Covode;

public class u extends h implements SubMenu {
    public h n;
    private j o;

    static {
        Covode.recordClassIndex(365);
    }

    public MenuItem getItem() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean b() {
        return this.n.b();
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean c() {
        return this.n.c();
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean d() {
        return this.n.d();
    }

    @Override // androidx.appcompat.view.menu.h
    public final h l() {
        return this.n.l();
    }

    @Override // androidx.appcompat.view.menu.h
    public final String a() {
        int itemId;
        j jVar = this.o;
        if (jVar == null || (itemId = jVar.getItemId()) == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }

    @Override // androidx.appcompat.view.menu.h
    public final void a(h.a aVar) {
        this.n.a(aVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public void setGroupDividerEnabled(boolean z) {
        this.n.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        return (SubMenu) super.b(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        return (SubMenu) super.a(i2);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.o.setIcon(i2);
        return this;
    }

    @Override // androidx.appcompat.view.menu.h
    public void setQwertyMode(boolean z) {
        this.n.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean a(j jVar) {
        return this.n.a(jVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean b(j jVar) {
        return this.n.b(jVar);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.o.setIcon(drawable);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.h
    public final boolean a(h hVar, MenuItem menuItem) {
        if (super.a(hVar, menuItem) || this.n.a(hVar, menuItem)) {
            return true;
        }
        return false;
    }

    public u(Context context, h hVar, j jVar) {
        super(context);
        this.n = hVar;
        this.o = jVar;
    }
}
