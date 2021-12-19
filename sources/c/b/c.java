package c.b;

import c.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;

public final class c extends FileOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private static final a f4883a = a.C0068a.f4876a;

    static {
        Covode.recordClassIndex(1925);
    }

    public c(String str) {
        this(new a(str));
    }

    private c(File file) {
        super((File) a.a(file), false);
        MethodCollector.i(4130);
        MethodCollector.o(4130);
    }
}
