package com.ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

public class RefObject {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    static {
        Covode.recordClassIndex(101014);
    }

    public boolean hasReleaseCallback() {
        if (this.releaseCallback != null) {
            return true;
        }
        return false;
    }

    public void retain() {
        this.refCount.incrementAndGet();
    }

    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() == 0 && (runnable = this.releaseCallback) != null) {
            runnable.run();
        }
    }

    public RefObject(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
