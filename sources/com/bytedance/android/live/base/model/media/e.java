package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class e {
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public long f7435a;
    @c(a = "id_str")

    /* renamed from: b  reason: collision with root package name */
    public String f7436b;
    @c(a = "album")

    /* renamed from: c  reason: collision with root package name */
    public String f7437c;
    @c(a = "title")

    /* renamed from: d  reason: collision with root package name */
    public String f7438d;
    @c(a = "cover_hd")

    /* renamed from: e  reason: collision with root package name */
    public ImageModel f7439e;
    @c(a = "cover_large")

    /* renamed from: f  reason: collision with root package name */
    public ImageModel f7440f;
    @c(a = "cover_medium")

    /* renamed from: g  reason: collision with root package name */
    public ImageModel f7441g;
    @c(a = "cover_thumb")

    /* renamed from: h  reason: collision with root package name */
    public ImageModel f7442h;
    @c(a = "play_url")

    /* renamed from: i  reason: collision with root package name */
    public b f7443i;
    @c(a = "author")

    /* renamed from: j  reason: collision with root package name */
    public String f7444j;
    @c(a = "schema_url")

    /* renamed from: k  reason: collision with root package name */
    public String f7445k;
    @c(a = "source_platform")

    /* renamed from: l  reason: collision with root package name */
    public int f7446l;
    @c(a = "start_time")

    /* renamed from: m  reason: collision with root package name */
    public int f7447m;
    @c(a = "end_time")
    public int n;
    @c(a = "duration")
    public int o;
    @c(a = "status")
    public int p;
    @c(a = "extra")
    public String q;
    @c(a = "share_url")
    public String r;
    @c(a = "share_title")
    public String s;
    @c(a = "share_description")
    public String t;
    @c(a = "original_user_id")
    public long u;
    @c(a = "original_titel_tpl")
    public String v;
    @c(a = "video_cnt")
    public long w;
    @c(a = "is_user_favorite")
    public boolean x;
    @c(a = "audio_track")
    public ImageModel y;
    public String z;

    static {
        Covode.recordClassIndex(3621);
    }

    public String toString() {
        return "Music{id=" + this.f7435a + ", mid='" + this.f7436b + '\'' + ", album='" + this.f7437c + '\'' + ", musicName='" + this.f7438d + '\'' + ", converHd=" + this.f7439e + ", coverLarge=" + this.f7440f + ", coverMedium=" + this.f7441g + ", coverThumb=" + this.f7442h + ", playUrl=" + this.f7443i + ", authorName='" + this.f7444j + '\'' + ", schema='" + this.f7445k + '\'' + ", source=" + this.f7446l + ", startTime=" + this.f7447m + ", endTime=" + this.n + ", duration=" + this.o + ", status=" + this.p + ", extra='" + this.q + '\'' + ", shareUrl='" + this.r + '\'' + ", shareTitle='" + this.s + '\'' + ", shareDescription='" + this.t + '\'' + ", oroginalUserId=" + this.u + ", originalTitelTpl='" + this.v + '\'' + ", songId='" + this.z + '\'' + '}';
    }
}
