package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.covode.number.Covode;
import java.util.EventObject;

public final class StreamCompleteEvent extends EventObject {
    private static final long serialVersionUID = 1;
    private final long bytes;
    private final Exception exception;

    static {
        Covode.recordClassIndex(14342);
    }

    public final long getBytes() {
        return this.bytes;
    }

    public final Exception getException() {
        return this.exception;
    }

    public final boolean isError() {
        if (this.exception != null) {
            return true;
        }
        return false;
    }

    public StreamCompleteEvent(Object obj, long j2) {
        this(obj, j2, null);
    }

    public StreamCompleteEvent(Object obj, long j2, Exception exc) {
        super(obj);
        this.bytes = j2;
        this.exception = exc;
    }
}
