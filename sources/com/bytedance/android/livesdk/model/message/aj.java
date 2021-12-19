package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.d.c.d;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class aj extends com.bytedance.android.livesdk.ac.b.a {
    @c(a = "message_type")

    /* renamed from: a  reason: collision with root package name */
    public int f19139a;
    @c(a = "linker_id")

    /* renamed from: f  reason: collision with root package name */
    public long f19140f;
    @c(a = "scene")

    /* renamed from: g  reason: collision with root package name */
    public int f19141g;
    @c(a = "invite_content")

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.livesdk.model.message.d.c.c f19142h;
    @c(a = "reply_content")

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.livesdk.model.message.d.k.a f19143i;
    @c(a = "cancel_content")

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.android.livesdk.model.message.d.a.a f19144j;
    @c(a = "linked_list_change_content")

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.android.livesdk.model.message.d.f.a f19145k;
    @c(a = "enter_content")

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.android.livesdk.model.message.d.b.a f19146l;
    @c(a = "kick_out_content")

    /* renamed from: m  reason: collision with root package name */
    public com.bytedance.android.livesdk.model.message.d.d.a f19147m;
    @c(a = "leave_content")
    public com.bytedance.android.livesdk.model.message.d.e.a n;
    @c(a = "mute_content")
    public com.bytedance.android.livesdk.model.message.d.i.a o;
    @c(a = "random_match_content")
    public com.bytedance.android.livesdk.model.message.d.j.a p;
    @c(a = "mic_idx_update_content")
    public com.bytedance.android.livesdk.model.message.d.h.a q;
    @c(a = "update_user_setting_content")
    public com.bytedance.android.livesdk.model.a.a r;
    @c(a = "list_change_content")
    public com.bytedance.android.livesdk.model.message.d.g.a s;
    @c(a = "extra")
    public String t;
    @c(a = "expire_timestamp")
    public long u;
    @c(a = "transfer_extra")
    public String v;
    public d w;

    static {
        Covode.recordClassIndex(11400);
    }

    public aj() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_MESSAGE;
    }

    public final long d() {
        return this.M - this.O.f23209a;
    }

    public final boolean e() {
        if (this.u > 0) {
            return true;
        }
        return false;
    }

    public final long f() {
        long j2 = this.u;
        if (j2 > 0) {
            return j2 - this.M;
        }
        return 0;
    }

    public final a c() {
        int i2 = this.f19141g;
        if (i2 == 2) {
            return a.ANCHOR_LINKMIC;
        }
        if (i2 != 4) {
            return a.OTHER;
        }
        return a.AUDIENCE_LINKMIC;
    }

    public enum a {
        ANCHOR_LINKMIC,
        AUDIENCE_LINKMIC,
        OTHER;

        static {
            Covode.recordClassIndex(11401);
        }
    }

    public String toString() {
        return "LinkMessage{messageType=" + this.f19139a + ", channelId=" + this.f19140f + ", scene=" + this.f19141g + ", linkerInviteContent=" + this.f19142h + ", extraStr='" + this.t + '\'' + ", linkerInviteMessageExtra=" + this.w + '}';
    }
}
