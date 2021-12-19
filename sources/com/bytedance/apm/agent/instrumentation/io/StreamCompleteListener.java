package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.covode.number.Covode;

public interface StreamCompleteListener {
    static {
        Covode.recordClassIndex(14343);
    }

    void streamComplete(StreamCompleteEvent streamCompleteEvent);

    void streamError(StreamCompleteEvent streamCompleteEvent);
}
