package d.a.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.FileOutputStream;

public class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public FileOutputStream f156632a;

    static {
        Covode.recordClassIndex(103994);
    }

    @Override // d.a.d.a.k
    public void a() {
        FileOutputStream fileOutputStream = this.f156632a;
        if (fileOutputStream == null) {
            l.a("outputStream");
        } else {
            fileOutputStream.close();
        }
    }

    public final FileOutputStream b() {
        FileOutputStream fileOutputStream = this.f156632a;
        if (fileOutputStream == null) {
            l.a("outputStream");
        }
        return fileOutputStream;
    }

    public void c() {
        FileOutputStream fileOutputStream = this.f156632a;
        if (fileOutputStream == null) {
            l.a("outputStream");
        } else {
            fileOutputStream.close();
        }
    }

    public final void a(FileOutputStream fileOutputStream) {
        l.c(fileOutputStream, "");
        this.f156632a = fileOutputStream;
    }

    public void a(byte[] bArr, int i2, int i3) {
        MethodCollector.i(7863);
        l.c(bArr, "");
        FileOutputStream fileOutputStream = this.f156632a;
        if (fileOutputStream == null) {
            l.a("outputStream");
            MethodCollector.o(7863);
            return;
        }
        fileOutputStream.write(bArr, i2, i3);
        MethodCollector.o(7863);
    }
}
