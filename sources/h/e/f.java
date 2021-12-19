package h.e;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import java.io.File;
import java.io.IOException;

public class f extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    static {
        Covode.recordClassIndex(105153);
    }

    public final File getFile() {
        return this.file;
    }

    public final File getOther() {
        return this.other;
    }

    public final String getReason() {
        return this.reason;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.io.File r5, java.io.File r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = r5.toString()
            r2.<init>(r0)
            if (r6 == 0) goto L_0x001d
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = " -> "
            java.lang.String r0 = r0.concat(r1)
            r2.append(r0)
        L_0x001d:
            if (r7 == 0) goto L_0x002c
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = ": "
            java.lang.String r0 = r0.concat(r1)
            r2.append(r0)
        L_0x002c:
            java.lang.String r0 = r2.toString()
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.file = r5
            r4.other = r6
            r4.reason = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e.f.<init>(java.io.File, java.io.File, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(File file2, File file3, String str, int i2, g gVar) {
        this(file2, (i2 & 2) != 0 ? null : file3, (i2 & 4) != 0 ? null : str);
    }
}
