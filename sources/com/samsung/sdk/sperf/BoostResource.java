package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class BoostResource {
    private int defaultLevel = 64532198;
    private int[] levelTable;
    private int maxTimeout = 64532198;

    static {
        Covode.recordClassIndex(35501);
    }

    public BoostResource(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            SPerfUtil.log("Table[" + i3 + "] : " + iArr[i3]);
        }
        SPerfUtil.log("Timeout : " + i2);
        this.levelTable = iArr;
        this.maxTimeout = i2;
    }

    public int adjustLevel(int i2) {
        int[] iArr = this.levelTable;
        if (iArr.length <= 0) {
            return 64532198;
        }
        if (i2 < 0) {
            SPerfUtil.log("");
            return 64532198;
        } else if (i2 >= iArr.length) {
            return 64532198;
        } else {
            return i2;
        }
    }

    public int adjustTimeout(int i2) {
        if (i2 < 0) {
            return 64532198;
        }
        int i3 = this.maxTimeout;
        return i2 > i3 ? i3 : i2;
    }

    public boolean check(int i2, int i3) {
        if (i3 <= 0 || i3 > this.maxTimeout) {
            return false;
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.levelTable;
            if (i4 >= iArr.length) {
                return false;
            }
            if (iArr[i4] == i2) {
                return true;
            }
            i4++;
        }
    }

    public int getDefaultLevel() {
        return this.defaultLevel;
    }

    public int getRealBoostLevel(int i2) {
        int[] iArr = this.levelTable;
        if (iArr != null && i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public void setDefaultLevel(int i2) {
        this.defaultLevel = i2;
    }
}
