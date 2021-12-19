package f.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    static {
        Covode.recordClassIndex(104377);
    }

    /* renamed from: f.a.c.a$a  reason: collision with other inner class name */
    static final class C4155a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        static {
            Covode.recordClassIndex(104378);
        }

        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        C4155a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class b {
        static {
            Covode.recordClassIndex(104379);
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Object obj);

        b() {
        }
    }

    public final List<Throwable> getExceptions() {
        return this.exceptions;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final int size() {
        return this.exceptions.size();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x001b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x001b */
    public final synchronized Throwable getCause() {
        Throwable th;
        MethodCollector.i(12500);
        if (this.cause == null) {
            Throwable aVar = new C4155a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.exceptions.iterator();
            Throwable th2 = aVar;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th3 : a(next)) {
                        if (hashSet.contains(th3)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th3);
                        }
                    }
                    try {
                        th2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    th2 = b(th2);
                }
            }
            this.cause = aVar;
        }
        th = this.cause;
        MethodCollector.o(12500);
        return th;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final PrintStream f157182a;

        static {
            Covode.recordClassIndex(104380);
        }

        c(PrintStream printStream) {
            this.f157182a = printStream;
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.c.a.b
        public final void a(Object obj) {
            this.f157182a.println(obj);
        }
    }

    static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        private final PrintWriter f157183a;

        static {
            Covode.recordClassIndex(104381);
        }

        d(PrintWriter printWriter) {
            this.f157183a = printWriter;
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.c.a.b
        public final void a(Object obj) {
            this.f157183a.println(obj);
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        a(new c(printStream));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.Throwable... r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0011
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "exceptions was null"
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
        L_0x000d:
            r2.<init>(r0)
            return
        L_0x0011:
            java.util.List r0 = java.util.Arrays.asList(r3)
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.c.a.<init>(java.lang.Throwable[]):void");
    }

    private static List<Throwable> a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause2 = th.getCause();
        if (cause2 != null && cause2 != th) {
            while (true) {
                arrayList.add(cause2);
                Throwable cause3 = cause2.getCause();
                if (cause3 == null || cause3 == cause2) {
                    break;
                }
                cause2 = cause3;
            }
        }
        return arrayList;
    }

    private static Throwable b(Throwable th) {
        Throwable cause2 = th.getCause();
        if (cause2 == null || th == cause2) {
            return th;
        }
        while (true) {
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return cause2;
            }
            cause2 = cause3;
        }
        return cause2;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        a(new d(printWriter));
    }

    public a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof a) {
                    linkedHashSet.addAll(((a) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.exceptions = unmodifiableList;
            this.message = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void a(b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this).append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ").append(stackTraceElement).append('\n');
        }
        int i2 = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ").append(i2).append(" :\n");
            a(sb, th, "\t");
            i2++;
        }
        bVar.a(sb.toString());
    }

    private static void a(StringBuilder sb, Throwable th, String str) {
        while (true) {
            sb.append(str).append(th).append('\n');
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\t\tat ").append(stackTraceElement).append('\n');
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }
}
