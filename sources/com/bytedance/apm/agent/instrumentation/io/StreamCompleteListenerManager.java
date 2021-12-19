package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class StreamCompleteListenerManager {
    private boolean streamComplete;
    private ArrayList<StreamCompleteListener> streamCompleteListeners = new ArrayList<>();

    static {
        Covode.recordClassIndex(14344);
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this) {
            z = this.streamComplete;
        }
        return z;
    }

    StreamCompleteListenerManager() {
    }

    private boolean checkComplete() {
        boolean isComplete;
        synchronized (this) {
            isComplete = isComplete();
            if (!isComplete) {
                this.streamComplete = true;
            }
        }
        return isComplete;
    }

    private List<StreamCompleteListener> getStreamCompleteListeners() {
        ArrayList arrayList;
        synchronized (this.streamCompleteListeners) {
            arrayList = new ArrayList(this.streamCompleteListeners);
            this.streamCompleteListeners.clear();
        }
        return arrayList;
    }

    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        synchronized (this.streamCompleteListeners) {
            this.streamCompleteListeners.add(streamCompleteListener);
        }
    }

    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        synchronized (this.streamCompleteListeners) {
            this.streamCompleteListeners.remove(streamCompleteListener);
        }
    }

    public void notifyStreamComplete(StreamCompleteEvent streamCompleteEvent) {
        if (!checkComplete()) {
            for (StreamCompleteListener streamCompleteListener : getStreamCompleteListeners()) {
                streamCompleteListener.streamComplete(streamCompleteEvent);
            }
        }
    }

    public void notifyStreamError(StreamCompleteEvent streamCompleteEvent) {
        if (!checkComplete()) {
            for (StreamCompleteListener streamCompleteListener : getStreamCompleteListeners()) {
                streamCompleteListener.streamError(streamCompleteEvent);
            }
        }
    }
}
