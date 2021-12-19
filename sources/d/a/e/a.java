package d.a.e;

import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(104003);
    }

    boolean getEnabled();

    void logDebug(String str, String str2);

    void logError(String str, String str2);

    void logError(String str, String str2, Throwable th);
}
