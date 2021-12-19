package com.bytedance.android.livesdkapi.depend.d;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

public interface i {

    public interface a {
        static {
            Covode.recordClassIndex(13605);
        }

        void m();

        void n();
    }

    public interface b {
        static {
            Covode.recordClassIndex(13606);
        }

        void a(long j2, EnterRoomConfig enterRoomConfig, boolean z);

        void a(RoomStatus roomStatus);

        void a(boolean z);

        boolean a(long j2);

        boolean i();

        boolean j();
    }

    static {
        Covode.recordClassIndex(13604);
    }

    Room A();

    void D();

    void a(a aVar);

    void a(b bVar);

    void a(EnterRoomConfig enterRoomConfig, Room room);

    void c();

    void c(int i2);

    void c(boolean z);

    void d();

    void e();

    void f();

    p g();

    long i();

    boolean i_();

    void k();

    Fragment n();

    void v();

    EnterRoomConfig w();

    void x();

    String y();

    void z();
}
