package com.bytedance.android.live.base.model.c;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.o;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class a extends Extra {
    @c(a = "cost")

    /* renamed from: a  reason: collision with root package name */
    public long f7378a;
    @c(a = "unread_extra")

    /* renamed from: b  reason: collision with root package name */
    public String f7379b;

    /* renamed from: c  reason: collision with root package name */
    transient C0099a f7380c;
    @c(a = "max_time")

    /* renamed from: d  reason: collision with root package name */
    public long f7381d;
    @c(a = "min_time")

    /* renamed from: e  reason: collision with root package name */
    public long f7382e;
    @c(a = "req_id")

    /* renamed from: f  reason: collision with root package name */
    public String f7383f;
    @c(a = "banner")

    /* renamed from: g  reason: collision with root package name */
    public o f7384g;
    @c(a = "total")

    /* renamed from: h  reason: collision with root package name */
    public int f7385h;
    @c(a = "style")

    /* renamed from: i  reason: collision with root package name */
    public int f7386i;
    @c(a = "hashtag_text")

    /* renamed from: j  reason: collision with root package name */
    public String f7387j;
    @c(a = "log_pb")

    /* renamed from: k  reason: collision with root package name */
    private com.google.gson.o f7388k;

    /* renamed from: com.bytedance.android.live.base.model.c.a$a  reason: collision with other inner class name */
    public static final class C0099a {
        @c(a = "impr_id")

        /* renamed from: a  reason: collision with root package name */
        public String f7389a;

        static {
            Covode.recordClassIndex(3587);
        }
    }

    static {
        Covode.recordClassIndex(3586);
    }

    public final com.google.gson.o a() {
        if (this.f7380c == null) {
            return this.f7388k;
        }
        com.google.gson.o j2 = e.a.f9628b.a(this.f7380c).j();
        this.f7388k = j2;
        this.f7380c = null;
        return j2;
    }
}
