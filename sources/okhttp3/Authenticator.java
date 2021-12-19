package okhttp3;

import com.bytedance.covode.number.Covode;

public interface Authenticator {
    public static final Authenticator NONE = new Authenticator() {
        /* class okhttp3.Authenticator.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106111);
        }

        @Override // okhttp3.Authenticator
        public final Request authenticate(Route route, Response response) {
            return null;
        }
    };

    Request authenticate(Route route, Response response);

    static {
        Covode.recordClassIndex(106110);
    }
}
