package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7457a = new a((byte) 0);

    static {
        Covode.recordClassIndex(3635);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3636);
        }

        private a() {
        }

        public static User a() {
            if (h.b()) {
                f b2 = u.a().b();
                l.b(b2, "");
                return b2.b();
            }
            f b3 = u.a().b();
            l.b(b3, "");
            return User.from(b3.a());
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
