package com.bytedance.android.livesdk.watch.chatroom;

import com.bytedance.covode.number.Covode;

public final class StackContext {
    private int activityHashCode;

    static {
        Covode.recordClassIndex(13237);
    }

    public final int getActivityHashCode() {
        return this.activityHashCode;
    }

    public final void setActivityHashCode(int i2) {
        this.activityHashCode = i2;
    }
}
