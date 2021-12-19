package com.bytedance.android.livesdk.model.message.d.k;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.d.c.e;
import com.bytedance.android.livesdk.model.message.d.h.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.HashMap;

public class a {
    @c(a = "from_user_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19571a;
    @c(a = "from_user")

    /* renamed from: b  reason: collision with root package name */
    public User f19572b;
    @c(a = "from_room_id")

    /* renamed from: c  reason: collision with root package name */
    public long f19573c;
    @c(a = "from_user_linkmic_info")

    /* renamed from: d  reason: collision with root package name */
    public c f19574d;
    @c(a = "to_user_id")

    /* renamed from: e  reason: collision with root package name */
    public long f19575e;
    @c(a = "to_user")

    /* renamed from: f  reason: collision with root package name */
    public User f19576f;
    @c(a = "to_user_linkmic_info")

    /* renamed from: g  reason: collision with root package name */
    public c f19577g;
    @c(a = "link_type")

    /* renamed from: h  reason: collision with root package name */
    public long f19578h;
    @c(a = "reply_status")

    /* renamed from: i  reason: collision with root package name */
    public int f19579i;
    @c(a = "linker_setting")

    /* renamed from: j  reason: collision with root package name */
    public b f19580j;
    @c(a = "rtc_ext_info_map")

    /* renamed from: k  reason: collision with root package name */
    public HashMap<Long, String> f19581k = new HashMap<>();
    @c(a = "invitee_mic_idx_update_info")

    /* renamed from: l  reason: collision with root package name */
    public b f19582l;
    @c(a = "applier_mic_idx_info_map")

    /* renamed from: m  reason: collision with root package name */
    public HashMap<Long, Long> f19583m = new HashMap<>();
    @c(a = "anchor_multi_live_enum")
    public int n = 0;
    @c(a = "anchor_setting_info")
    public e o;

    static {
        Covode.recordClassIndex(11583);
    }
}
