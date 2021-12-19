package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class CustomParams {
    private static SPerfManager sPerfManager;
    private BoostObject boostObj;
    private boolean isBoostObjUpdated;

    static {
        Covode.recordClassIndex(35502);
    }

    protected static int getBoostType(int i2) {
        return (i2 == 8 || i2 == 9) ? 1 : 0;
    }

    public int add(int i2, int i3, int i4) {
        int i5;
        MethodCollector.i(2105);
        synchronized (this) {
            try {
                if (this.boostObj == null) {
                    this.boostObj = new BoostObject();
                    this.isBoostObjUpdated = false;
                }
                if (sPerfManager == null) {
                    SPerfManager createInstance = SPerfManager.createInstance(null);
                    sPerfManager = createInstance;
                    if (createInstance == null) {
                        i5 = -1;
                    }
                }
                i5 = sPerfManager.updateBoost(i2, i3, i4, this.boostObj);
                if (i5 >= 0) {
                    this.isBoostObjUpdated = true;
                }
            } finally {
                MethodCollector.o(2105);
            }
        }
        return i5;
    }

    /* access modifiers changed from: protected */
    public BoostObject getBoostObject() {
        if (!this.isBoostObjUpdated) {
            return null;
        }
        return this.boostObj;
    }
}
