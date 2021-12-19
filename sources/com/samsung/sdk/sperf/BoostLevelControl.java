package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public class BoostLevelControl {
    private static int boostResourceCount;
    private static BoostResource[] boostResources = new BoostResource[11];
    private static BoostLevelControl instance;
    private static boolean isBoostLevelIntialized;
    private HashMap<Integer, BoostObject> scenarioBoostObjectMap = new HashMap<>();

    static {
        Covode.recordClassIndex(35499);
    }

    private BoostLevelControl(SessionControl sessionControl) {
        int i2;
        IOException e2;
        int[] iArr = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr2 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr3 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr4 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr5 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr6 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr7 = {0, 4};
        int[] iArr8 = {-20, -10, 0, 10, 20};
        int i3 = -1;
        try {
            DataOutputStream dataOutputStream = sessionControl.getDataOutputStream();
            DataInputStream dataInputStream = sessionControl.getDataInputStream();
            if (dataOutputStream != null && dataInputStream != null) {
                dataOutputStream.writeInt(Integer.reverseBytes(10));
                dataOutputStream.flush();
                Integer.reverseBytes(dataInputStream.readInt());
                Integer.reverseBytes(dataInputStream.readInt());
                Integer.reverseBytes(dataInputStream.readInt());
                i2 = Integer.reverseBytes(dataInputStream.readInt());
                i2 = i2 == -1 ? 99999999 : i2;
                int i4 = 0;
                while (true) {
                    try {
                        iArr[i4] = Integer.reverseBytes(dataInputStream.readInt());
                        i4++;
                        if (i4 >= 5) {
                            break;
                        }
                    } catch (IOException e3) {
                        e2 = e3;
                        e2.printStackTrace();
                        setBoostResource(6, iArr7, i2);
                        setBoostResource(7, iArr7, 99999999);
                        setBoostResource(8, new int[]{70, 74, 30}, i2);
                        setBoostResource(9, iArr8, i2);
                        setBoostResource(10, new int[]{1}, i2);
                        boostResources[8].setDefaultLevel(0);
                        boostResources[9].setDefaultLevel(2);
                        initScenarioBoostObject();
                        isBoostLevelIntialized = true;
                    }
                }
                int i5 = 0;
                while (true) {
                    iArr3[i5] = Integer.reverseBytes(dataInputStream.readInt());
                    i5++;
                    if (i5 >= 5) {
                        break;
                    }
                }
                int i6 = 0;
                while (true) {
                    iArr5[i6] = Integer.reverseBytes(dataInputStream.readInt());
                    i6++;
                    if (i6 >= 5) {
                        try {
                            break;
                        } catch (IOException e4) {
                            e2 = e4;
                            i3 = i2;
                            i2 = i3;
                            e2.printStackTrace();
                            setBoostResource(6, iArr7, i2);
                            setBoostResource(7, iArr7, 99999999);
                            setBoostResource(8, new int[]{70, 74, 30}, i2);
                            setBoostResource(9, iArr8, i2);
                            setBoostResource(10, new int[]{1}, i2);
                            boostResources[8].setDefaultLevel(0);
                            boostResources[9].setDefaultLevel(2);
                            initScenarioBoostObject();
                            isBoostLevelIntialized = true;
                        }
                    }
                }
                setBoostResource(0, iArr, i2);
                setBoostResource(2, iArr3, i2);
                setBoostResource(4, iArr5, i2);
                int reverseBytes = Integer.reverseBytes(dataInputStream.readInt());
                int reverseBytes2 = Integer.reverseBytes(dataInputStream.readInt());
                int reverseBytes3 = Integer.reverseBytes(dataInputStream.readInt());
                i2 = Integer.reverseBytes(dataInputStream.readInt());
                i2 = i2 == -1 ? 99999999 : i2;
                int i7 = 0;
                do {
                    iArr2[i7] = Integer.reverseBytes(dataInputStream.readInt());
                    i7++;
                } while (i7 < 5);
                int i8 = 0;
                do {
                    iArr4[i8] = Integer.reverseBytes(dataInputStream.readInt());
                    i8++;
                } while (i8 < 5);
                int i9 = 0;
                do {
                    iArr6[i9] = Integer.reverseBytes(dataInputStream.readInt());
                    i9++;
                } while (i9 < 5);
                setBoostResource(1, iArr2, i2);
                setBoostResource(3, iArr4, i2);
                setBoostResource(5, iArr6, i2);
                SPerfUtil.log("Get message : ");
                SPerfUtil.log("numCpuLevels = " + reverseBytes + ", numGpuLevels = " + reverseBytes2 + ", numBusLevels = " + reverseBytes3);
                SPerfUtil.log("cpus : " + iArr2[0] + " " + iArr2[1] + " " + iArr2[2] + " " + iArr2[3] + " " + iArr2[4]);
                SPerfUtil.log("gpus : " + iArr4[0] + " " + iArr4[1] + " " + iArr4[2] + " " + iArr4[3] + " " + iArr4[4]);
                SPerfUtil.log("buses: " + iArr6[0] + " " + iArr6[1] + " " + iArr6[2] + " " + iArr6[3] + " " + iArr6[4]);
                setBoostResource(6, iArr7, i2);
                setBoostResource(7, iArr7, 99999999);
                setBoostResource(8, new int[]{70, 74, 30}, i2);
                setBoostResource(9, iArr8, i2);
                setBoostResource(10, new int[]{1}, i2);
                boostResources[8].setDefaultLevel(0);
                boostResources[9].setDefaultLevel(2);
                initScenarioBoostObject();
                isBoostLevelIntialized = true;
            }
        } catch (IOException e5) {
            e2 = e5;
            i2 = i3;
            e2.printStackTrace();
            setBoostResource(6, iArr7, i2);
            setBoostResource(7, iArr7, 99999999);
            setBoostResource(8, new int[]{70, 74, 30}, i2);
            setBoostResource(9, iArr8, i2);
            setBoostResource(10, new int[]{1}, i2);
            boostResources[8].setDefaultLevel(0);
            boostResources[9].setDefaultLevel(2);
            initScenarioBoostObject();
            isBoostLevelIntialized = true;
        }
    }

    public static BoostLevelControl createInstance(SessionControl sessionControl) {
        if (instance == null) {
            instance = new BoostLevelControl(sessionControl);
            if (!isBoostLevelIntialized || boostResourceCount <= 0) {
                instance = null;
            }
        }
        return instance;
    }

    public static BoostResource getBoostResource(int i2) {
        if (i2 < 0 || i2 >= 11) {
            return null;
        }
        return boostResources[i2];
    }

    public static int getRealBoostLevel(int i2, int i3) {
        if (instance != null && i3 >= 0 && i3 < 11) {
            return boostResources[i3].getRealBoostLevel(i2);
        }
        return -1;
    }

    public static int getRealBoostLevel(BoostObject boostObject, int i2) {
        if (instance != null && i2 >= 0 && i2 < 11) {
            return boostResources[i2].getRealBoostLevel(boostObject.getLevel(i2));
        }
        return -1;
    }

    private void initScenarioBoostObject() {
        BoostObject boostObject = new BoostObject();
        boostObject.update(0, 2, 64532198);
        boostObject.update(6, 1, 64532198);
        this.scenarioBoostObjectMap.put(64, boostObject);
        BoostObject boostObject2 = new BoostObject();
        boostObject2.update(2, 2, 64532198);
        this.scenarioBoostObjectMap.put(128, boostObject2);
        BoostObject boostObject3 = new BoostObject();
        boostObject3.update(4, 2, 64532198);
        this.scenarioBoostObjectMap.put(256, boostObject3);
    }

    public static int setBoostResource(int i2, int[] iArr, int i3) {
        if (i2 < 0 || i2 >= 11 || boostResources[i2] != null) {
            return -1;
        }
        SPerfUtil.log("====setBoostResource==== type : " + i2);
        boostResourceCount = boostResourceCount + 1;
        boostResources[i2] = new BoostResource(iArr, i3);
        return boostResourceCount;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r3 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.sdk.sperf.BoostObject getBoostObjectByScenario(int r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            r2 = 64
            r3 = r4
        L_0x0004:
            r0 = r2 & r6
            if (r0 != r2) goto L_0x0027
            java.util.HashMap<java.lang.Integer, com.samsung.sdk.sperf.BoostObject> r1 = r5.scenarioBoostObjectMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            com.samsung.sdk.sperf.BoostObject r0 = (com.samsung.sdk.sperf.BoostObject) r0
            if (r0 == 0) goto L_0x0024
            if (r3 != 0) goto L_0x001d
            com.samsung.sdk.sperf.BoostObject r3 = new com.samsung.sdk.sperf.BoostObject
            r3.<init>()
        L_0x001d:
            boolean r0 = r3.combineBoostObject(r0)
            if (r0 != 0) goto L_0x0027
            return r4
        L_0x0024:
            if (r3 == 0) goto L_0x0027
            goto L_0x001d
        L_0x0027:
            int r2 = r2 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r2 > r0) goto L_0x002e
            goto L_0x0004
        L_0x002e:
            if (r3 != 0) goto L_0x0031
            return r4
        L_0x0031:
            r2 = 0
        L_0x0032:
            int r1 = r3.getLevel(r2)
            r0 = 64532198(0x3d8aee6, float:1.2735494E-36)
            if (r1 == r0) goto L_0x003e
            r3.update(r2, r1, r7)
        L_0x003e:
            int r2 = r2 + 1
            r0 = 11
            if (r2 >= r0) goto L_0x0045
            goto L_0x0032
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.sdk.sperf.BoostLevelControl.getBoostObjectByScenario(int, int):com.samsung.sdk.sperf.BoostObject");
    }

    public int updateBoost(int i2, int i3, int i4, BoostObject boostObject) {
        StringBuilder sb;
        if (i2 >= 0) {
            BoostResource[] boostResourceArr = boostResources;
            if (i2 >= boostResourceArr.length || boostObject == null || boostResourceArr[i2] == null) {
                return -1;
            }
            int adjustLevel = boostResourceArr[i2].adjustLevel(i3);
            int adjustTimeout = boostResources[i2].adjustTimeout(i4);
            if (adjustLevel != i3) {
                sb = new StringBuilder();
                sb.append("Requested Boost Level is not available : ");
                sb.append(i3);
            } else if (adjustTimeout == i4) {
                return boostObject.update(i2, adjustLevel, adjustTimeout);
            } else {
                sb = new StringBuilder();
                sb.append("Requested Boost timeout is not available : ");
                sb.append(i4);
            }
            SPerfUtil.log(sb.toString());
            return -1;
        }
        return -1;
    }
}
