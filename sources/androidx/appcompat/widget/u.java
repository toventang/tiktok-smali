package androidx.appcompat.widget;

import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.o;
import com.bytedance.covode.number.Covode;

public interface u {
    static {
        Covode.recordClassIndex(518);
    }

    void a(int i2);

    void a(Menu menu, o.a aVar);

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    void g();

    void h();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
