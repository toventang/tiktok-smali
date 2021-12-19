package com.bytedance.android.livesdk.chatroom.c;

import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.covode.number.Covode;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public int f15100a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15101b;

    static {
        Covode.recordClassIndex(8380);
    }

    public final boolean a() {
        if (!LiveMtMockLandscapeSetting.INSTANCE.getValue()) {
            return this.f15101b;
        }
        return true;
    }

    public an(boolean z, int i2) {
        this.f15101b = z;
        this.f15100a = i2;
    }
}
