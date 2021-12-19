package androidx.i.a;

import android.database.Cursor;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.List;

public interface b extends Closeable {
    static {
        Covode.recordClassIndex(1150);
    }

    Cursor a(e eVar);

    f a(String str);

    void a();

    Cursor b(String str);

    void b();

    void c();

    void c(String str);

    boolean d();

    boolean e();

    String f();

    List<Pair<String, String>> g();
}
