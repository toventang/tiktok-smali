package b;

import com.bytedance.covode.number.Covode;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class a extends Exception {
    private static final long serialVersionUID = 1;
    private List<Throwable> innerThrowables;

    static {
        Covode.recordClassIndex(1890);
    }

    public final List<Throwable> getInnerThrowables() {
        return this.innerThrowables;
    }

    public final Throwable[] getCauses() {
        List<Throwable> list = this.innerThrowables;
        return (Throwable[]) list.toArray(new Throwable[list.size()]);
    }

    public final List<Exception> getErrors() {
        ArrayList arrayList = new ArrayList();
        List<Throwable> list = this.innerThrowables;
        if (list == null) {
            return arrayList;
        }
        for (Throwable th : list) {
            if (th instanceof Exception) {
                arrayList.add(th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public a(List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i2 = -1;
        for (Throwable th : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i2++;
            printStream.append((CharSequence) Integer.toString(i2));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i2 = -1;
        for (Throwable th : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i2++;
            printWriter.append((CharSequence) Integer.toString(i2));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }

    public a(String str, Throwable[] thArr) {
        this(str, Arrays.asList(thArr));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.String r2, java.util.List<? extends java.lang.Throwable> r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0019
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0019
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x000f:
            r1.<init>(r2, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r3)
            r1.innerThrowables = r0
            return
        L_0x0019:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.<init>(java.lang.String, java.util.List):void");
    }
}
