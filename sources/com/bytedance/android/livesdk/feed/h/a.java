package com.bytedance.android.livesdk.feed.h;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.android.livesdkapi.g.m;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class a extends h implements m {

    /* renamed from: a  reason: collision with root package name */
    private final List<EnterRoomConfig> f17492a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<Room> f17493b = new ArrayList();

    static {
        Covode.recordClassIndex(9691);
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void b(int i2) {
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final List<Room> b() {
        return this.f17493b;
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a() {
        return this.f17492a.size();
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void c() {
        super.c();
        this.f17492a.clear();
        this.f17493b.clear();
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a(EnterRoomConfig enterRoomConfig) {
        return this.f17492a.indexOf(enterRoomConfig);
    }

    public a(List<Room> list) {
        a(list);
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final EnterRoomConfig a(int i2) {
        return this.f17492a.get(i2);
    }

    @Override // com.bytedance.android.livesdkapi.g.h, com.bytedance.android.livesdkapi.g.f
    public final Room c(int i2) {
        if (i2 < 0 || i2 >= this.f17493b.size()) {
            return null;
        }
        return this.f17493b.get(i2);
    }

    private void a(List<Room> list) {
        this.f17492a.clear();
        this.f17493b.clear();
        if (!com.bytedance.common.utility.h.a(list)) {
            this.f17493b.addAll(list);
            for (Room room : list) {
                this.f17492a.add(com.bytedance.android.livesdkapi.g.a.a(room, false));
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void a(long j2) {
        for (int i2 = 0; i2 < this.f17492a.size(); i2++) {
            if (this.f17493b.get(i2).getId() == j2) {
                this.f17492a.remove(i2);
                this.f17493b.remove(i2);
                f();
                return;
            }
        }
    }
}
