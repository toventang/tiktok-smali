package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.Comparator;

public class az extends com.bytedance.android.livesdk.ac.b.a implements Comparator {
    @c(a = "member_count")

    /* renamed from: a  reason: collision with root package name */
    public int f19233a;
    @c(a = "user")

    /* renamed from: f  reason: collision with root package name */
    public User f19234f;
    @c(a = "is_top_user")

    /* renamed from: g  reason: collision with root package name */
    public boolean f19235g;
    @c(a = "action")

    /* renamed from: h  reason: collision with root package name */
    public int f19236h;
    @c(a = "top_user_no")

    /* renamed from: i  reason: collision with root package name */
    public int f19237i;
    @c(a = "operator")

    /* renamed from: j  reason: collision with root package name */
    public User f19238j;
    @c(a = "is_set_to_admin")

    /* renamed from: k  reason: collision with root package name */
    public boolean f19239k;
    @c(a = "rank_score")

    /* renamed from: l  reason: collision with root package name */
    public int f19240l;
    @c(a = "enter_type")

    /* renamed from: m  reason: collision with root package name */
    public int f19241m;
    @c(a = "action_description")
    public String n;
    @c(a = "enter_effect_config")
    public a o;
    @c(a = "user_id")
    public long p;
    @c(a = "pop_str")
    public String q;
    @c(a = "background_image_v2")
    public ImageModel r;
    @c(a = "anchor_display_text")
    public b s;
    @c(a = "client_enter_source")
    public String t;
    @c(a = "client_enter_type")
    public String u;
    @c(a = "client_live_reason")
    public String v;
    @c(a = "action_duration")
    public Long w;
    public boolean x;
    public boolean y = true;

    public static class a {
        @c(a = StringSet.type)

        /* renamed from: a  reason: collision with root package name */
        public int f19242a;
        @c(a = "icon")

        /* renamed from: b  reason: collision with root package name */
        public ImageModel f19243b;
        @c(a = "text")

        /* renamed from: c  reason: collision with root package name */
        public b f19244c;
        @c(a = "badge")

        /* renamed from: d  reason: collision with root package name */
        public ImageModel f19245d;

        static {
            Covode.recordClassIndex(11423);
        }
    }

    static {
        Covode.recordClassIndex(11422);
    }

    public az() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.MEMBER;
    }

    public int hashCode() {
        return com.bytedance.android.livesdk.model.utils.a.a(17, Long.valueOf(this.O.f23212d));
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (!this.y || this.O == null || this.O.f23218j == null || this.f19235g) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        if (this.f19234f == null) {
            return false;
        }
        if (this.x || this.f19236h != 7) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MemberMessage{action=" + this.f19236h + ", enterType=" + this.f19241m + ", actionDescription='" + this.n + '\'' + ", enterEffectConfig=" + this.o + ", userId=" + this.p + '}';
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof az) || this.O.f23212d != ((com.bytedance.android.livesdkapi.h.a) obj).O.f23212d) {
            return false;
        }
        return true;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i2 = ((az) obj).f19240l;
        int i3 = ((az) obj2).f19240l;
        if (i2 == i3) {
            return -1;
        }
        return i2 - i3;
    }
}
