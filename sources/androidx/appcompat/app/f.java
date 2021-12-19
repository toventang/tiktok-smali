package androidx.appcompat.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import com.bytedance.covode.number.Covode;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static int f905a = -1;

    public abstract <T extends View> T a(int i2);

    public abstract a a();

    public abstract b a(b.a aVar);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(Toolbar toolbar);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(int i2);

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public abstract boolean c(int i2);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract b.a i();

    public abstract void j();

    public abstract boolean k();

    f() {
    }

    static {
        Covode.recordClassIndex(254);
    }

    public static f a(Dialog dialog, e eVar) {
        return new g(dialog.getContext(), dialog.getWindow(), eVar);
    }
}
