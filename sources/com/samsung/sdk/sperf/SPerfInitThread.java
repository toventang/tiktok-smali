package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SPerfInitThread implements Runnable {
    SPerfManager sPerfManager;

    static {
        Covode.recordClassIndex(35505);
    }

    SPerfInitThread() {
    }

    public SPerfManager getSPerfManager() {
        return this.sPerfManager;
    }

    public void run() {
        try {
            this.sPerfManager = SPerfManager.initSPerfManager();
        } catch (IllegalThreadStateException e2) {
            this.sPerfManager = null;
            e2.printStackTrace();
        }
    }
}
