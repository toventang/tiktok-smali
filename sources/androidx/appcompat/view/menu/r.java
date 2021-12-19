package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.a.a.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class r extends c<a> implements Menu {
    static {
        Covode.recordClassIndex(360);
    }

    public void close() {
        ((a) this.f1170b).close();
    }

    public void clear() {
        a();
        ((a) this.f1170b).clear();
    }

    public boolean hasVisibleItems() {
        return ((a) this.f1170b).hasVisibleItems();
    }

    public int size() {
        return ((a) this.f1170b).size();
    }

    public void setQwertyMode(boolean z) {
        ((a) this.f1170b).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(((a) this.f1170b).add(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return a(((a) this.f1170b).addSubMenu(i2));
    }

    public MenuItem findItem(int i2) {
        return a(((a) this.f1170b).findItem(i2));
    }

    public MenuItem getItem(int i2) {
        return a(((a) this.f1170b).getItem(i2));
    }

    public void removeGroup(int i2) {
        a(i2);
        ((a) this.f1170b).removeGroup(i2);
    }

    public void removeItem(int i2) {
        b(i2);
        ((a) this.f1170b).removeItem(i2);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(((a) this.f1170b).add(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return a(((a) this.f1170b).addSubMenu(charSequence));
    }

    r(Context context, a aVar) {
        super(context, aVar);
    }

    public void setGroupEnabled(int i2, boolean z) {
        ((a) this.f1170b).setGroupEnabled(i2, z);
    }

    public void setGroupVisible(int i2, boolean z) {
        ((a) this.f1170b).setGroupVisible(i2, z);
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return ((a) this.f1170b).isShortcutKey(i2, keyEvent);
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return ((a) this.f1170b).performIdentifierAction(i2, i3);
    }

    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        ((a) this.f1170b).setGroupCheckable(i2, z, z2);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return ((a) this.f1170b).performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(((a) this.f1170b).add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return a(((a) this.f1170b).addSubMenu(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(((a) this.f1170b).add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return a(((a) this.f1170b).addSubMenu(i2, i3, i4, charSequence));
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((a) this.f1170b).addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = a(menuItemArr2[i6]);
            }
        }
        return addIntentOptions;
    }
}
