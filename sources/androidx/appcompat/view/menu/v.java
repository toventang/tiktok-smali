package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.a.a.c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class v extends r implements SubMenu {
    static {
        Covode.recordClassIndex(366);
    }

    public final void clearHeader() {
        ((c) this.f1170b).clearHeader();
    }

    public final MenuItem getItem() {
        return a(((c) this.f1170b).getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        ((c) this.f1170b).setHeaderIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        ((c) this.f1170b).setHeaderTitle(i2);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((c) this.f1170b).setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        ((c) this.f1170b).setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((c) this.f1170b).setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((c) this.f1170b).setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        ((c) this.f1170b).setIcon(drawable);
        return this;
    }

    v(Context context, c cVar) {
        super(context, cVar);
    }
}
