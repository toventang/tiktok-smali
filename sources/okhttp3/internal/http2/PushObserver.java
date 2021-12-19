package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import java.util.List;
import k.h;

public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() {
        /* class okhttp3.internal.http2.PushObserver.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106286);
        }

        @Override // okhttp3.internal.http2.PushObserver
        public final boolean onHeaders(int i2, List<Header> list, boolean z) {
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public final boolean onRequest(int i2, List<Header> list) {
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public final void onReset(int i2, ErrorCode errorCode) {
        }

        @Override // okhttp3.internal.http2.PushObserver
        public final boolean onData(int i2, h hVar, int i3, boolean z) {
            hVar.l((long) i3);
            return true;
        }
    };

    boolean onData(int i2, h hVar, int i3, boolean z);

    boolean onHeaders(int i2, List<Header> list, boolean z);

    boolean onRequest(int i2, List<Header> list);

    void onReset(int i2, ErrorCode errorCode);

    static {
        Covode.recordClassIndex(106285);
    }
}
