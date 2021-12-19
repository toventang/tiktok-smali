package c.b;

import c.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;

public final class b extends FileInputStream {

    /* renamed from: a  reason: collision with root package name */
    private static final a f4882a = a.C0068a.f4876a;

    static {
        Covode.recordClassIndex(1924);
    }

    public b(File file) {
        super(a.a(file));
        MethodCollector.i(2761);
        MethodCollector.o(2761);
    }
}
