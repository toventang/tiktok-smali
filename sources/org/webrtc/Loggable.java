package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.Logging;

public interface Loggable {
    static {
        Covode.recordClassIndex(106614);
    }

    void onLogMessage(String str, Logging.Severity severity, String str2);
}
