package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.ag;
import androidx.lifecycle.m;
import androidx.loader.a.c;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {

    /* renamed from: androidx.loader.app.a$a  reason: collision with other inner class name */
    public interface AbstractC0052a<D> {
        static {
            Covode.recordClassIndex(1374);
        }

        c<D> a(Bundle bundle);

        void a();

        void a(D d2);
    }

    static {
        Covode.recordClassIndex(1373);
    }

    public abstract <D> c<D> a(int i2, Bundle bundle, AbstractC0052a<D> aVar);

    public abstract void a();

    public abstract void a(int i2);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public static <T extends m & ag> a a(T t) {
        return new LoaderManagerImpl(t, t.getViewModelStore());
    }
}
