package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.c.a;
import androidx.core.a.a.b;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

public abstract class c<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    final Context f1167a;

    /* renamed from: c  reason: collision with root package name */
    private Map<b, MenuItem> f1168c;

    /* renamed from: d  reason: collision with root package name */
    private Map<androidx.core.a.a.c, SubMenu> f1169d;

    static {
        Covode.recordClassIndex(328);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Map<b, MenuItem> map = this.f1168c;
        if (map != null) {
            map.clear();
        }
        Map<androidx.core.a.a.c, SubMenu> map2 = this.f1169d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f1168c == null) {
            this.f1168c = new a();
        }
        MenuItem menuItem2 = this.f1168c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a2 = q.a(this.f1167a, bVar);
        this.f1168c.put(bVar, a2);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        Map<b, MenuItem> map = this.f1168c;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i2 == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof androidx.core.a.a.c)) {
            return subMenu;
        }
        androidx.core.a.a.c cVar = (androidx.core.a.a.c) subMenu;
        if (this.f1169d == null) {
            this.f1169d = new a();
        }
        SubMenu subMenu2 = this.f1169d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        v vVar = new v(this.f1167a, cVar);
        this.f1169d.put(cVar, vVar);
        return vVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        Map<b, MenuItem> map = this.f1168c;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i2 == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    c(Context context, T t) {
        super(t);
        this.f1167a = context;
    }
}
