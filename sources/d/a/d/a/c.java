package d.a.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.InputStream;

public class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public InputStream f156618a;

    static {
        Covode.recordClassIndex(103988);
    }

    @Override // d.a.d.a.k
    public void a() {
        InputStream inputStream = this.f156618a;
        if (inputStream == null) {
            l.a("inputStream");
        }
        inputStream.close();
    }

    public final void a(InputStream inputStream) {
        l.c(inputStream, "");
        this.f156618a = inputStream;
    }

    public int a(byte[] bArr, int i2) {
        MethodCollector.i(7030);
        l.c(bArr, "");
        InputStream inputStream = this.f156618a;
        if (inputStream == null) {
            l.a("inputStream");
        }
        int read = inputStream.read(bArr, 0, i2);
        MethodCollector.o(7030);
        return read;
    }
}
