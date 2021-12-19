package com.ss.android.ugc.aweme.story.g;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "should_refresh_in_background")

    /* renamed from: a  reason: collision with root package name */
    public final int f137764a;
    @c(a = "background_refresh_interval")

    /* renamed from: b  reason: collision with root package name */
    public final long f137765b;
    @c(a = "refresh_interval_when_sidebar_opened")

    /* renamed from: c  reason: collision with root package name */
    public final long f137766c;
    @c(a = "tiktok_story_get_user_stories_pagesize")

    /* renamed from: d  reason: collision with root package name */
    public final int f137767d;
    @c(a = "story_user_state_cache_expiration_time")

    /* renamed from: e  reason: collision with root package name */
    public final long f137768e;
    @c(a = "tiktok_story_official_foru_guide_max_count")

    /* renamed from: f  reason: collision with root package name */
    public final int f137769f;

    static {
        Covode.recordClassIndex(90134);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f137764a == bVar.f137764a && this.f137765b == bVar.f137765b && this.f137766c == bVar.f137766c && this.f137767d == bVar.f137767d && this.f137768e == bVar.f137768e && this.f137769f == bVar.f137769f;
    }

    public final String toString() {
        return "StoryConfig(enableBackgroundRefresh=" + this.f137764a + ", backgroundRefreshInterval=" + this.f137765b + ", sidebarCacheValidInterval=" + this.f137766c + ", getUserStoryPageSize=" + this.f137767d + ", userStoryCacheValidInterval=" + this.f137768e + ", guidePageShowMaxCount=" + this.f137769f + ")";
    }

    private b() {
        this.f137764a = 1;
        this.f137765b = 1800;
        this.f137766c = 600;
        this.f137767d = 8;
        this.f137768e = 1800;
        this.f137769f = 1;
    }

    public final int hashCode() {
        long j2 = this.f137765b;
        long j3 = this.f137766c;
        long j4 = this.f137768e;
        return (((((((((this.f137764a * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f137767d) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f137769f;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
