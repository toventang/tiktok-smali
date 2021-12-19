package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class s {
    @c(a = "ngb_push_url")

    /* renamed from: a  reason: collision with root package name */
    public String f23179a = "";
    @c(a = "ngb_push_url_postfix")

    /* renamed from: b  reason: collision with root package name */
    public String f23180b = "";
    @c(a = "height")

    /* renamed from: c  reason: collision with root package name */
    public int f23181c = 640;
    @c(a = "width")

    /* renamed from: d  reason: collision with root package name */
    public int f23182d = 360;
    @c(a = "min_bitrate")

    /* renamed from: e  reason: collision with root package name */
    public int f23183e = 200;
    @c(a = "default_bitrate")

    /* renamed from: f  reason: collision with root package name */
    public int f23184f = 500;
    @c(a = "max_bitrate")

    /* renamed from: g  reason: collision with root package name */
    public int f23185g = 800;
    @c(a = "video_profile")

    /* renamed from: h  reason: collision with root package name */
    public int f23186h = 1;
    @c(a = "hardware_encode")

    /* renamed from: i  reason: collision with root package name */
    public boolean f23187i;
    @c(a = "bitrate_adapt_strategy")

    /* renamed from: j  reason: collision with root package name */
    public int f23188j;
    @c(a = "fps")

    /* renamed from: k  reason: collision with root package name */
    public int f23189k = 15;
    @c(a = "anchor_interact_profile")

    /* renamed from: l  reason: collision with root package name */
    public int f23190l;
    @c(a = "audience_interact_profile")

    /* renamed from: m  reason: collision with root package name */
    public int f23191m;
    @c(a = "super_resolution")
    public a n;
    @c(a = "bytevc1_enable")
    public boolean o;
    @c(a = "gop_sec")
    public float p = 2.0f;
    @c(a = "bframe_enable")
    public boolean q = true;
    @c(a = "roi")
    public boolean r;
    @c(a = "sw_roi")
    public boolean s;
    public int t;
    public int u;

    static {
        Covode.recordClassIndex(13729);
    }

    public static class a {
        @c(a = "enable")

        /* renamed from: a  reason: collision with root package name */
        public boolean f23192a;
        @c(a = "antialiasing")

        /* renamed from: b  reason: collision with root package name */
        public boolean f23193b;
        @c(a = "strength")

        /* renamed from: c  reason: collision with root package name */
        public int f23194c;

        static {
            Covode.recordClassIndex(13730);
        }

        public a() {
            this(false, false, 0);
        }

        public a(boolean z, boolean z2, int i2) {
            this.f23192a = z;
            this.f23193b = z2;
            this.f23194c = i2;
        }
    }

    public final int a() {
        if (this.f23181c == 0) {
            this.f23181c = 640;
        }
        return this.f23181c;
    }

    public final int b() {
        if (this.f23182d == 0) {
            this.f23182d = 360;
        }
        return this.f23182d;
    }

    public final int c() {
        if (this.f23183e == 0) {
            this.f23183e = 200;
        }
        return this.f23183e;
    }

    public final int d() {
        if (this.f23184f == 0) {
            this.f23184f = 500;
        }
        return this.f23184f;
    }

    public final int f() {
        if (this.f23189k == 0) {
            this.f23189k = 15;
        }
        return this.f23189k;
    }

    public final int e() {
        if (this.f23185g == 0) {
            this.f23185g = (d() * 2) - c();
        }
        return this.f23185g;
    }
}
