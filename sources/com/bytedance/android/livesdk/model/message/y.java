package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.aa;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class y extends a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19703a;

    /* renamed from: f  reason: collision with root package name */
    public aa f19704f;
    @c(a = "user")

    /* renamed from: g  reason: collision with root package name */
    public User f19705g;
    @c(a = "to_user")

    /* renamed from: h  reason: collision with root package name */
    public User f19706h;
    @c(a = "gift_id")

    /* renamed from: i  reason: collision with root package name */
    public long f19707i;
    @c(a = "repeat_count")

    /* renamed from: j  reason: collision with root package name */
    public int f19708j;
    @c(a = "fan_ticket_count")

    /* renamed from: k  reason: collision with root package name */
    public int f19709k;
    @c(a = "room_fan_ticket_count")

    /* renamed from: l  reason: collision with root package name */
    long f19710l;
    @c(a = "repeat_end")

    /* renamed from: m  reason: collision with root package name */
    public int f19711m;
    @c(a = "combo_count")
    public int n;
    @c(a = "group_count")
    public int o;
    @c(a = "group_id")
    public long p;
    @c(a = "text_effect")
    public ch q;
    public boolean r;
    public transient boolean s;
    @c(a = "gift")
    public u t;
    @c(a = "tray_info")
    public GiftTrayInfo u;
    public String v;
    @c(a = "monitor_info")
    public z w;

    static {
        Covode.recordClassIndex(11706);
    }

    public y() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.GIFT;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        if (this.f19705g != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        long j2;
        StringBuilder append = new StringBuilder("GiftMessage{fromUserId=").append(this.f19705g).append(", toUserId=");
        User user = this.f19706h;
        if (user != null) {
            j2 = user.getId();
        } else {
            j2 = 0;
        }
        return append.append(j2).append(", giftId=").append(this.f19707i).append(", repeatCount=").append(this.f19708j).append(", fanTicketCount=").append(this.f19709k).append(", repeatEnd=").append(this.f19711m).append(", comboCount=").append(this.n).append(", groupCount=").append(this.o).append(", groupId=").append(this.p).append(", textEffect=").append(e.a.f9628b.b(this.q)).append(", isUrgent=").append(this.r).append(", isLocal=").append(this.s).append('}').toString();
    }
}
