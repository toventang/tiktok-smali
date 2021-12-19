package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ck extends com.bytedance.android.livesdk.ac.b.a {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public User f19497a;
    @c(a = "goods_order")

    /* renamed from: f  reason: collision with root package name */
    public a f19498f;

    public static class a {
        @c(a = "goods_room_order")

        /* renamed from: a  reason: collision with root package name */
        public long f19499a;
        @c(a = "order_num")

        /* renamed from: b  reason: collision with root package name */
        public long f19500b;
        @c(a = "order_money")

        /* renamed from: c  reason: collision with root package name */
        public long f19501c;
        @c(a = "order_id")

        /* renamed from: d  reason: collision with root package name */
        public String f19502d;

        static {
            Covode.recordClassIndex(11532);
        }
    }

    static {
        Covode.recordClassIndex(11531);
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return true;
    }

    public ck() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.GOODS_ORDER;
    }

    public int hashCode() {
        return com.bytedance.android.livesdk.model.utils.a.a(17, Long.valueOf(this.O.f23212d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ck) || this.O.f23212d != ((com.bytedance.android.livesdkapi.h.a) obj).O.f23212d) {
            return false;
        }
        return true;
    }
}
