package com.bytedance.bae.router.receiver.base;

import android.content.BroadcastReceiver;
import com.bytedance.covode.number.Covode;

public abstract class BaseAudioDeviceBroadcastReceiver extends BroadcastReceiver {
    private boolean isRegistered;

    static {
        Covode.recordClassIndex(15401);
    }

    public boolean getRegistered() {
        return this.isRegistered;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }
}
