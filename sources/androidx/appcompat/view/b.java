package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class b {

    /* renamed from: c  reason: collision with root package name */
    public Object f1064c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1065d;

    public interface a {
        static {
            Covode.recordClassIndex(309);
        }

        void a(b bVar);

        boolean a(b bVar, Menu menu);

        boolean a(b bVar, MenuItem menuItem);

        boolean b(b bVar, Menu menu);
    }

    static {
        Covode.recordClassIndex(308);
    }

    public abstract MenuInflater a();

    public abstract void a(int i2);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public abstract Menu b();

    public abstract void b(int i2);

    public abstract void b(CharSequence charSequence);

    public abstract void c();

    public abstract void d();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public boolean h() {
        return false;
    }

    public abstract View i();

    public void a(boolean z) {
        this.f1065d = z;
    }
}
