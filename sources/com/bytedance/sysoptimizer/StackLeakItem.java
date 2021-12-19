package com.bytedance.sysoptimizer;

import com.bytedance.covode.number.Covode;

public class StackLeakItem {
    private int leakCount;
    private String soBuildId;
    private long soEndAddr;
    private String soPath;
    private long soStartAddr;
    private long startRoutine;
    private long startRoutineOffset;

    static {
        Covode.recordClassIndex(27009);
    }

    public String getBuildId() {
        return this.soBuildId;
    }

    public int getLeakCount() {
        return this.leakCount;
    }

    public long getOffset() {
        return this.startRoutineOffset;
    }

    public String getSoName() {
        int lastIndexOf;
        String str = this.soPath;
        if (str == null || (lastIndexOf = str.lastIndexOf(47)) < 0 || lastIndexOf >= this.soPath.length() - 1) {
            return "UNKNOWN";
        }
        return this.soPath.substring(lastIndexOf + 1);
    }

    public String getLeakItem() {
        return "[" + this.leakCount + "] stacks leaked: " + Long.toHexString(this.startRoutineOffset) + " " + Long.toHexString(this.soStartAddr) + "-" + Long.toHexString(this.soEndAddr) + " r-xp " + getSoName() + " (" + this.soBuildId + ")";
    }

    public StackLeakItem(int i2, long j2, long j3, long j4, String str, String str2) {
        this.leakCount = i2;
        this.startRoutine = j2;
        this.soStartAddr = j3;
        this.soEndAddr = j4;
        this.soPath = str;
        this.soBuildId = str2;
        this.startRoutineOffset = j2 - j3;
    }
}
