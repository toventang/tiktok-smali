package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class BoostObject {
    private static int[] priority;
    private int id;
    private int[] levels;
    private int[] timeouts;

    static {
        Covode.recordClassIndex(35500);
        int[] iArr = new int[11];
        priority = iArr;
        iArr[0] = 1;
        iArr[1] = 0;
        iArr[2] = 1;
        iArr[3] = 0;
        iArr[4] = 1;
        iArr[5] = 0;
        iArr[6] = 1;
        iArr[7] = 0;
        iArr[8] = 1;
        iArr[9] = 1;
        iArr[10] = 2;
    }

    public BoostObject() {
        this.id = -1;
        this.levels = new int[11];
        this.timeouts = new int[11];
        int i2 = 0;
        do {
            this.levels[i2] = 64532198;
            this.timeouts[i2] = 64532198;
            i2++;
        } while (i2 < 11);
    }

    private BoostObject(int[] iArr, int[] iArr2) {
        this.id = -1;
        this.levels = new int[iArr.length];
        this.timeouts = new int[iArr2.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.levels[i2] = iArr[i2];
        }
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            this.timeouts[i3] = iArr2[i3];
        }
    }

    public boolean combineBoostObject(BoostObject boostObject) {
        if (boostObject == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.levels.length; i2++) {
            try {
                int level = boostObject.getLevel(i2);
                if (level != 64532198) {
                    int[] iArr = this.levels;
                    if (iArr[i2] != 64532198) {
                        int[] iArr2 = this.timeouts;
                        if (iArr2[i2] != 64532198) {
                            int[] iArr3 = priority;
                            if (iArr3[i2] == 0 && iArr[i2] < level) {
                                iArr[i2] = level;
                                iArr2[i2] = boostObject.getTimeout(i2);
                            } else if (iArr3[i2] == 1 && iArr[i2] > level) {
                                iArr[i2] = level;
                                iArr2[i2] = boostObject.getTimeout(i2);
                            } else if (iArr3[i2] == 2) {
                                iArr[i2] = level;
                                iArr2[i2] = boostObject.getTimeout(i2);
                            }
                        }
                    }
                    iArr[i2] = level;
                    this.timeouts[i2] = boostObject.getTimeout(i2);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
                SPerfUtil.log("Combine Boost Object has array out of bounds on type : " + i2);
                return false;
            }
        }
        return true;
    }

    public BoostObject copyBoostObject() {
        return new BoostObject(this.levels, this.timeouts);
    }

    public int getID() {
        return this.id;
    }

    public int getLevel(int i2) {
        if (i2 < 0 || i2 >= 11) {
            return 64532198;
        }
        return this.levels[i2];
    }

    public int getTimeout(int i2) {
        if (i2 < 0 || i2 >= 11) {
            return 64532198;
        }
        return this.timeouts[i2];
    }

    public void setID(int i2) {
        this.id = i2;
    }

    public int update(int i2, int i3, int i4) {
        if (i2 > 11 || i2 < 0) {
            return -1;
        }
        this.levels[i2] = i3;
        this.timeouts[i2] = i4;
        SPerfUtil.log("Update Boost - type : " + i2 + "   level : " + this.levels[i2] + "   timeouts : " + this.timeouts[i2]);
        return 0;
    }
}
