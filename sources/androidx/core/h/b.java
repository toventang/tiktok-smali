package androidx.core.h;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class b {

    /* renamed from: e  reason: collision with root package name */
    public final Context f2520e;

    /* renamed from: f  reason: collision with root package name */
    public a f2521f;

    /* renamed from: g  reason: collision with root package name */
    public AbstractC0036b f2522g;

    public interface a {
        static {
            Covode.recordClassIndex(845);
        }

        void b(boolean z);
    }

    /* renamed from: androidx.core.h.b$b  reason: collision with other inner class name */
    public interface AbstractC0036b {
        static {
            Covode.recordClassIndex(846);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(844);
    }

    public abstract View a();

    public void a(SubMenu subMenu) {
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return true;
    }

    public b(Context context) {
        this.f2520e = context;
    }

    public View a(MenuItem menuItem) {
        return a();
    }

    public void a(AbstractC0036b bVar) {
        if (this.f2522g != null) {
            getClass().getSimpleName();
        }
        this.f2522g = bVar;
    }

    public final void a(boolean z) {
        a aVar = this.f2521f;
        if (aVar != null) {
            aVar.b(z);
        }
    }
}
