package com.bytedance.android.livesdk.list;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class h extends com.bytedance.android.livesdkapi.g.h {

    /* renamed from: a  reason: collision with root package name */
    private EnterRoomConfig f18645a;

    /* renamed from: b  reason: collision with root package name */
    private List<Room> f18646b = new ArrayList();

    static {
        Covode.recordClassIndex(10444);
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a() {
        return 1;
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a(EnterRoomConfig enterRoomConfig) {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void a(long j2) {
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void b(int i2) {
    }

    @Override // com.bytedance.android.livesdkapi.g.h, com.bytedance.android.livesdkapi.g.f
    public final Room c(int i2) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final List<Room> b() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final List<Room> d() {
        return this.f18646b;
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final EnterRoomConfig a(int i2) {
        return this.f18645a;
    }

    public h(EnterRoomConfig enterRoomConfig) {
        this.f18645a = enterRoomConfig == null ? new EnterRoomConfig() : enterRoomConfig;
    }
}
