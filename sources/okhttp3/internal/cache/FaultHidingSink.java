package okhttp3.internal.cache;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import k.f;
import k.k;
import k.y;

/* access modifiers changed from: package-private */
public class FaultHidingSink extends k {
    private boolean hasErrors;

    static {
        Covode.recordClassIndex(106211);
    }

    /* access modifiers changed from: protected */
    public void onException(IOException iOException) {
    }

    @Override // k.y, java.io.Closeable, k.k, java.lang.AutoCloseable
    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e2) {
                this.hasErrors = true;
                onException(e2);
            }
        }
    }

    @Override // k.y, k.k, java.io.Flushable
    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e2) {
                this.hasErrors = true;
                onException(e2);
            }
        }
    }

    FaultHidingSink(y yVar) {
        super(yVar);
    }

    @Override // k.y, k.k
    public void write(f fVar, long j2) {
        if (this.hasErrors) {
            fVar.l(j2);
            return;
        }
        try {
            super.write(fVar, j2);
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }
}
