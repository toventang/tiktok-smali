package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ar extends a {
    @c(a = "from_room_id")
    public long A;
    @c(a = "tips")
    public String B;
    @c(a = "invite_type")
    public int C;
    @c(a = "sub_type")
    public long D;
    @c(a = "confluence_type")
    public int E;
    @c(a = "rival_anchor_id")
    public long F;
    @c(a = "rival_linkmic_id")
    public int G;
    @c(a = "rival_linkmic_id_str")
    public String H;
    @c(a = "show_popup")
    public boolean I;
    @c(a = "rtc_ext_info")
    public String J;
    @c(a = "rtc_join_channel")
    public boolean K;
    @c(a = "message_type")

    /* renamed from: a  reason: collision with root package name */
    public int f19190a;
    @c(a = "app_id")

    /* renamed from: f  reason: collision with root package name */
    public String f19191f;
    @c(a = "app_sign")

    /* renamed from: g  reason: collision with root package name */
    public String f19192g;
    @c(a = "access_key")

    /* renamed from: h  reason: collision with root package name */
    public String f19193h;
    @c(a = "anchor_linkmic_id")

    /* renamed from: i  reason: collision with root package name */
    public int f19194i;
    @c(a = "anchor_linkmic_id_str")

    /* renamed from: j  reason: collision with root package name */
    public String f19195j;
    @c(a = "user_id")

    /* renamed from: k  reason: collision with root package name */
    public long f19196k;
    @c(a = "fan_ticket")

    /* renamed from: l  reason: collision with root package name */
    public long f19197l;
    @c(a = "total_linkmic_fan_ticket")

    /* renamed from: m  reason: collision with root package name */
    long f19198m;
    @c(a = "channel_id")
    public long n;
    @c(a = "layout")
    public int o;
    @c(a = "vendor")
    public int p;
    @c(a = "dimension")
    public int q;
    @c(a = "theme")
    public String r;
    @c(a = "invite_uid")
    public long s;
    @c(a = "answer")
    public int t;
    @c(a = "start_time_ms")
    public long u;
    @c(a = "duration")
    public int v;
    @c(a = "match_type")
    public int w;
    @c(a = "win")
    public boolean x;
    @c(a = "prompts")
    public String y;
    @c(a = "to_user_id")
    public long z;

    static {
        Covode.recordClassIndex(11412);
    }

    public ar() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_MIC;
    }
}
