package com.bytedance.android.live.broadcast.h;

import com.bytedance.android.live.broadcast.stream.c.a;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public a f7877a;

    /* renamed from: b  reason: collision with root package name */
    private Room f7878b;

    /* renamed from: c  reason: collision with root package name */
    private f.a.b.b f7879c;

    static {
        Covode.recordClassIndex(3901);
    }

    public final void a() {
        f.a.b.b bVar = this.f7879c;
        if (bVar != null && !bVar.isDisposed()) {
            this.f7879c.dispose();
        }
    }

    public b(Room room) {
        this.f7878b = room;
    }

    @Override // com.bytedance.android.live.broadcast.stream.c.a
    public final void a(int i2, int i3) {
        this.f7879c = d.a.a().c().sendStatus(this.f7878b.getId(), i2, this.f7878b.getStreamId(), i3).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), new d(this));
    }
}
