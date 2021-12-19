package h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.PrintWriter;
import java.io.StringWriter;

public class b {
    static {
        Covode.recordClassIndex(105093);
    }

    public static final String a(Throwable th) {
        l.d(th, "");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        l.b(stringWriter2, "");
        return stringWriter2;
    }

    public static final void a(Throwable th, Throwable th2) {
        l.d(th, "");
        l.d(th2, "");
        if (th != th2) {
            h.d.b.f158680a.a(th, th2);
        }
    }
}
