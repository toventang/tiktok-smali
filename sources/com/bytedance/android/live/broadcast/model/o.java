package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Map;

public final class o {
    @c(a = "cover")

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f7939a;
    @c(a = "cover_audit_status")

    /* renamed from: b  reason: collision with root package name */
    public long f7940b;
    @c(a = "last_room_id")

    /* renamed from: c  reason: collision with root package name */
    public long f7941c;
    @c(a = "title")

    /* renamed from: d  reason: collision with root package name */
    public String f7942d;
    @c(a = "go_live_prompt")

    /* renamed from: e  reason: collision with root package name */
    public String f7943e;
    @c(a = "live_scenario")

    /* renamed from: f  reason: collision with root package name */
    public e f7944f;
    @c(a = "never_go_live_flag")

    /* renamed from: g  reason: collision with root package name */
    public int f7945g;
    @c(a = "anchor_prompt_type")

    /* renamed from: h  reason: collision with root package name */
    public int f7946h;
    @c(a = "live_additional_prompt")

    /* renamed from: i  reason: collision with root package name */
    public String f7947i;
    @c(a = "anchor_fans_info")

    /* renamed from: j  reason: collision with root package name */
    public a f7948j;
    @c(a = "ban_status")

    /* renamed from: k  reason: collision with root package name */
    public d f7949k;
    @c(a = "use_avatar_as_cover")

    /* renamed from: l  reason: collision with root package name */
    public boolean f7950l;
    @c(a = "live_house_status")

    /* renamed from: m  reason: collision with root package name */
    public Long f7951m;
    @c(a = "donation_sticker")
    int n;
    @c(a = "hashtag")
    public Hashtag o;
    @c(a = "event_info")
    public h p = new h();
    @c(a = "is_new_anchor")
    public boolean q;
    @c(a = "push_stream_info")
    public Map<Long, n> r;
    @c(a = "show_game_tags")
    public boolean s = false;
    @c(a = "guide_status")
    public int t;

    static {
        Covode.recordClassIndex(3930);
    }

    public final boolean a() {
        if (this.n == 1) {
            return true;
        }
        return false;
    }
}
