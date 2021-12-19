package androidx.core.g;

import com.bytedance.covode.number.Covode;
import java.io.Writer;

public final class c extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f2395a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f2396b = new StringBuilder(128);

    static {
        Covode.recordClassIndex(769);
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    private void a() {
        if (this.f2396b.length() > 0) {
            StringBuilder sb = this.f2396b;
            sb.delete(0, sb.length());
        }
    }

    public c(String str) {
        this.f2395a = str;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f2396b.append(c2);
            }
        }
    }
}
