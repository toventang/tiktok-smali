package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class y extends com.bytedance.ies.a.b<b> {

    /* renamed from: a  reason: collision with root package name */
    final f.a.b.a f21896a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public a f21897b;

    /* renamed from: c  reason: collision with root package name */
    boolean f21898c;

    public interface a {
        static {
            Covode.recordClassIndex(12892);
        }

        void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar);

        void a(Throwable th);
    }

    public interface b extends com.bytedance.ies.a.a {
        static {
            Covode.recordClassIndex(12893);
        }

        void a(User user);

        void a(Throwable th);

        void f();

        void g();

        void h();
    }

    static {
        Covode.recordClassIndex(12891);
    }

    public final void a() {
        if (this.y != null) {
            ((b) this.y).h();
        }
    }

    @Override // com.bytedance.ies.a.b
    public final void b() {
        super.b();
        this.f21896a.a();
    }

    public final void a(Room room) {
        ((LinkApi) e.a().a(LinkApi.class)).checkPermissionV3(room.getId()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ae(this), af.f21800a);
    }

    public final void a(HashMap<String, String> hashMap) {
        this.f21896a.a(u.a().b().a(hashMap).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new z(this), new aa(this)));
    }

    public final void a(Room room, long j2) {
        ((LinkApi) e.a().a(LinkApi.class)).checkPermissionV1(room.getId(), room.getOwnerUserId(), 1, j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ac(this), ad.f21798a);
    }
}
