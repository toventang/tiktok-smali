package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class q {
    static {
        Covode.recordClassIndex(105440);
    }

    public static final y a() {
        return new e();
    }

    public static final aa a(InputStream inputStream) {
        l.c(inputStream, "");
        return new p(inputStream, new ab());
    }

    public static final g a(y yVar) {
        l.c(yVar, "");
        return new t(yVar);
    }

    public static final aa b(Socket socket) {
        l.c(socket, "");
        z zVar = new z(socket);
        InputStream inputStream = socket.getInputStream();
        l.a((Object) inputStream, "");
        return zVar.source(new p(inputStream, zVar));
    }

    public static final aa c(File file) {
        MethodCollector.i(3970);
        l.c(file, "");
        aa a2 = a(new FileInputStream(file));
        MethodCollector.o(3970);
        return a2;
    }

    public static final h a(aa aaVar) {
        l.c(aaVar, "");
        return new u(aaVar);
    }

    public static final y b(File file) {
        MethodCollector.i(3968);
        l.c(file, "");
        y a2 = a(new FileOutputStream(file, true));
        MethodCollector.o(3968);
        return a2;
    }

    public static /* synthetic */ y a(File file) {
        MethodCollector.i(3728);
        l.c(file, "");
        y a2 = a(new FileOutputStream(file, false));
        MethodCollector.o(3728);
        return a2;
    }

    public static final y a(OutputStream outputStream) {
        l.c(outputStream, "");
        return new r(outputStream, new ab());
    }

    public static final y a(Socket socket) {
        l.c(socket, "");
        z zVar = new z(socket);
        OutputStream outputStream = socket.getOutputStream();
        l.a((Object) outputStream, "");
        return zVar.sink(new r(outputStream, zVar));
    }

    public static final boolean a(AssertionError assertionError) {
        String message;
        l.c(assertionError, "");
        if (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !p.a((CharSequence) message, (CharSequence) "getsockname failed", false)) {
            return false;
        }
        return true;
    }
}
