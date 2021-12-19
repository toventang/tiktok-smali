package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.AudioSink;
import com.ss.avframework.livestreamv2.ILiveStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class AudioFrameAvailableSink extends AudioSink {
    private final Object mFence = new Object();
    private List<ILiveStream.IAudioFrameAvailableListener> mListeners = new ArrayList();
    private List<ILiveStream.IAudioFrameAvailableListener> mListenersToBeAdded = new ArrayList();
    private List<ILiveStream.IAudioFrameAvailableListener> mListenersToBeRemoved = new ArrayList();

    static {
        Covode.recordClassIndex(99844);
    }

    @Override // com.ss.avframework.engine.AudioSink
    public void onNoData() {
    }

    public void addListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        MethodCollector.i(14191);
        synchronized (this.mFence) {
            try {
                this.mListenersToBeRemoved.remove(iAudioFrameAvailableListener);
                if (!this.mListeners.contains(iAudioFrameAvailableListener) && !this.mListenersToBeAdded.contains(iAudioFrameAvailableListener)) {
                    this.mListenersToBeAdded.add(iAudioFrameAvailableListener);
                }
            } finally {
                MethodCollector.o(14191);
            }
        }
    }

    public void removeListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        MethodCollector.i(14220);
        synchronized (this.mFence) {
            try {
                this.mListenersToBeAdded.remove(iAudioFrameAvailableListener);
                if (this.mListeners.contains(iAudioFrameAvailableListener) && !this.mListenersToBeRemoved.contains(iAudioFrameAvailableListener)) {
                    this.mListenersToBeRemoved.add(iAudioFrameAvailableListener);
                }
            } finally {
                MethodCollector.o(14220);
            }
        }
    }

    @Override // com.ss.avframework.engine.AudioSink
    public void onData(Buffer buffer, int i2, int i3, int i4, long j2) {
        MethodCollector.i(14150);
        synchronized (this.mFence) {
            try {
                if (!this.mListenersToBeAdded.isEmpty()) {
                    this.mListeners.addAll(this.mListenersToBeAdded);
                    this.mListenersToBeAdded.clear();
                }
                if (!this.mListenersToBeRemoved.isEmpty()) {
                    this.mListeners.removeAll(this.mListenersToBeRemoved);
                    this.mListenersToBeRemoved.clear();
                }
            } finally {
                MethodCollector.o(14150);
            }
        }
        for (ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener : this.mListeners) {
            if (iAudioFrameAvailableListener != null) {
                buffer.position(0);
                iAudioFrameAvailableListener.onAudioFrameAvailable(buffer, i2, i3, i4, j2);
            }
        }
    }
}
