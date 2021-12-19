package com.bytedance.android.livesdk.event;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17187a;

    /* renamed from: b  reason: collision with root package name */
    public String f17188b;

    /* renamed from: c  reason: collision with root package name */
    public long f17189c;

    /* renamed from: d  reason: collision with root package name */
    public EnterRoomConfig f17190d;

    static {
        Covode.recordClassIndex(9539);
    }

    public e(long j2) {
        this.f17189c = j2;
    }

    public e(long j2, EnterRoomConfig enterRoomConfig) {
        this.f17189c = j2;
        this.f17190d = enterRoomConfig;
    }

    public e(long j2, EnterRoomConfig enterRoomConfig, byte b2) {
        this.f17189c = j2;
        this.f17190d = enterRoomConfig;
        this.f17187a = true;
    }

    public e(long j2, EnterRoomConfig enterRoomConfig, String str) {
        this.f17189c = j2;
        this.f17190d = enterRoomConfig;
        this.f17188b = str;
    }
}
