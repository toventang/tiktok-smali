package com.bytedance.android.live.liveinteract.multiguest.a.f;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.liveinteract.multiguest.a.b.b;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class h extends b.a {

    /* renamed from: a  reason: collision with root package name */
    private Room f11155a;

    /* renamed from: b  reason: collision with root package name */
    private long f11156b = 0;

    /* renamed from: c  reason: collision with root package name */
    private String f11157c;

    /* renamed from: d  reason: collision with root package name */
    private e f11158d;

    /* renamed from: e  reason: collision with root package name */
    private long f11159e;

    static {
        Covode.recordClassIndex(5996);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.a
    public final long b() {
        return this.f11156b;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.a
    public final String c() {
        return this.f11157c;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.a
    public final e f() {
        return this.f11158d;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.a.a
    public final void g() {
        super.g();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.a
    public final User a() {
        e eVar = this.f11158d;
        if (eVar != null) {
            return eVar.f15722c;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.a
    public final boolean e() {
        e eVar = this.f11158d;
        if (eVar == null || eVar.f15725f != 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.a
    public final boolean d() {
        long j2 = this.f11156b;
        if (j2 == 0 || j2 != u.a().b().c()) {
            return false;
        }
        return true;
    }

    private void h() {
        if (this.f11898g != null) {
            if (this.f11158d == null) {
                ((b.AbstractC0207b) this.f11898g).setVisibility(false);
                return;
            }
            ((b.AbstractC0207b) this.f11898g).setVisibility(true);
            if (this.f11158d.f15722c != null) {
                ((b.AbstractC0207b) this.f11898g).a(this.f11158d.f15722c);
            }
            a(this.f11158d.f15720a);
            if (this.f11158d.f15727h > 0) {
                ((b.AbstractC0207b) this.f11898g).a(this.f11158d.f15728i, d());
            }
            ((b.AbstractC0207b) this.f11898g).a(d());
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.android.live.liveinteract.platform.common.a.b] */
    @Override // com.bytedance.android.live.liveinteract.platform.common.a.a
    public final /* synthetic */ void a(b.AbstractC0207b bVar) {
        super.a(bVar);
        h();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.a
    public final void a(long j2) {
        if (j2 >= this.f11159e) {
            this.f11159e = j2;
            if (this.f11898g != null) {
                ((b.AbstractC0207b) this.f11898g).a(this.f11159e);
            }
            if (d()) {
                c.a().a(this.f11159e);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.a
    public final void a(e eVar) {
        e eVar2 = this.f11158d;
        if (eVar2 == null) {
            this.f11158d = eVar;
        } else if (eVar != null && eVar2.f15722c.getId() == eVar.f15722c.getId()) {
            if (eVar.f15720a > eVar2.f15720a) {
                eVar2.f15720a = eVar.f15720a;
            }
            eVar2.f15721b = eVar.f15721b;
            eVar2.f15722c = eVar.f15722c;
            if (eVar.f15723d > eVar2.f15723d) {
                eVar2.f15723d = eVar.f15723d;
            }
            eVar2.f15724e = eVar.f15724e;
            eVar2.f15725f = eVar.f15725f;
            eVar2.f15726g = eVar.f15726g;
            eVar2.f15727h = eVar.f15727h;
        }
        e eVar3 = this.f11158d;
        if (eVar3 != null) {
            this.f11157c = eVar3.a();
            if (this.f11158d.f15722c != null) {
                this.f11156b = this.f11158d.f15722c.getId();
            }
        }
        h();
    }

    public h(Room room, String str, e eVar) {
        this.f11155a = room;
        this.f11157c = str;
        this.f11158d = eVar;
        if (eVar != null) {
            this.f11157c = eVar.a();
            if (this.f11158d.f15722c != null) {
                this.f11156b = this.f11158d.f15722c.getId();
            }
        }
    }
}
