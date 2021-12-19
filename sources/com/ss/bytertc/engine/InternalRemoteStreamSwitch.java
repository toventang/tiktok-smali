package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalRemoteStreamSwitch {
    public boolean after_enable;
    public int after_video_index;
    public boolean before_enable;
    public int before_video_index;
    public boolean isScreen;
    public int reason;
    public String uid;

    static {
        Covode.recordClassIndex(100764);
    }

    public InternalRemoteStreamSwitch() {
    }

    public static InternalRemoteStreamSwitch create(String str, boolean z, int i2, int i3, boolean z2, boolean z3, int i4) {
        return new InternalRemoteStreamSwitch(str, z, i2, i3, z2, z3, i4);
    }

    public InternalRemoteStreamSwitch(String str, boolean z, int i2, int i3, boolean z2, boolean z3, int i4) {
        this.uid = str;
        this.isScreen = z;
        this.before_video_index = i2;
        this.after_video_index = i3;
        this.before_enable = z2;
        this.after_enable = z3;
        this.reason = i4;
    }
}
