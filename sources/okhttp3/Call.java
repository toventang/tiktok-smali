package okhttp3;

import com.bytedance.covode.number.Covode;
import k.ab;

public interface Call extends Cloneable {

    public interface Factory {
        static {
            Covode.recordClassIndex(106123);
        }

        Call newCall(Request request);
    }

    static {
        Covode.recordClassIndex(106122);
    }

    void cancel();

    @Override // java.lang.Object
    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    ab timeout();
}
