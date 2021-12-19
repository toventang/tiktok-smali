package com.ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import java.nio.Buffer;

public abstract class IAudioStrangeVoice {
    protected boolean mEnable;
    protected boolean mIsPlayerMode;

    static {
        Covode.recordClassIndex(100386);
    }

    /* access modifiers changed from: protected */
    public abstract Buffer process(Buffer buffer, int i2, int i3, int i4, long j2);

    public abstract int setAudioStrangeResource(String str);

    public boolean isEnable() {
        return this.mEnable;
    }

    public boolean isPlayerMode() {
        return this.mIsPlayerMode;
    }

    /* access modifiers changed from: protected */
    public void release() {
        setEnable(false);
    }

    public void enablePlayerMode(boolean z) {
        this.mIsPlayerMode = z;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }
}
