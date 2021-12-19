package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.covode.number.Covode;

public interface StreamCompleteListenerSource {
    static {
        Covode.recordClassIndex(14345);
    }

    void addStreamCompleteListener(StreamCompleteListener streamCompleteListener);

    void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener);
}
