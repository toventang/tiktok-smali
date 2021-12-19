package com.ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f92730a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f92731b = i.a((h.f.a.a) a.f92732a);

    public static Keva a() {
        return (Keva) f92731b.getValue();
    }

    private h() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92732a = new a();

        static {
            Covode.recordClassIndex(58814);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoFromSp(d.a(), "feed_video_cache", 1);
        }
    }

    public static long b() {
        return a().getLong("feed_video_cache_time", 0);
    }

    public static long c() {
        return a().getLong("feed_video_cache_time2", 0);
    }

    public static String d() {
        return a().getString("feed_video_group_key", "");
    }

    public static String e() {
        return a().getString("feed_video_group_key2", "");
    }

    public static String g() {
        String string = a().getString("key_cookie_feed_url", "");
        l.b(string, "");
        return string;
    }

    public static String h() {
        String string = a().getString("key_cookie_feed", "");
        l.b(string, "");
        return string;
    }

    static {
        Covode.recordClassIndex(58813);
    }

    public static String f() {
        String string = a().getString("feed_cache_source", "def");
        l.b(string, "");
        return string;
    }

    public static void f(String str) {
        l.d(str, "");
        a().storeString("feed_cache_source", str);
    }

    public static void a(long j2) {
        a().storeLong("feed_video_cache_time", j2);
    }

    public static void b(long j2) {
        a().storeLong("feed_video_cache_time2", j2);
    }

    public static void c(String str) {
        a().storeString("feed_cache_request_id", str);
    }

    public static void d(String str) {
        a().storeString("feed_cache_request_id2", str);
    }

    public static void e(String str) {
        a().storeString("feed_video_cache_current_uid", str);
    }

    public static void g(String str) {
        l.d(str, "");
        a().storeString("key_cookie_feed_url", str);
    }

    public static void h(String str) {
        l.d(str, "");
        a().storeString("key_cookie_feed", str);
    }

    public static void a(String str) {
        a().storeString("feed_video_group_key", str);
    }

    public static void b(String str) {
        a().storeString("feed_video_group_key2", str);
    }
}
