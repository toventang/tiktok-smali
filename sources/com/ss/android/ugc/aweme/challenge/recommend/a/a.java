package com.ss.android.ugc.aweme.challenge.recommend.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.video.hashtag.b;
import java.util.HashMap;

public final class a {
    @c(a = "mark")

    /* renamed from: a  reason: collision with root package name */
    public int f69998a;
    @c(a = "pos")

    /* renamed from: b  reason: collision with root package name */
    public int f69999b;
    @c(a = "ch_info")

    /* renamed from: c  reason: collision with root package name */
    public Challenge f70000c;
    @c(a = "ad_data")

    /* renamed from: d  reason: collision with root package name */
    public C1585a f70001d;

    static {
        Covode.recordClassIndex(43178);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.a.a$a  reason: collision with other inner class name */
    public static class C1585a implements b.a {
        @c(a = "creative_id")

        /* renamed from: a  reason: collision with root package name */
        public long f70002a;
        @c(a = StringSet.type)

        /* renamed from: b  reason: collision with root package name */
        public String f70003b;
        @c(a = "log_extra")

        /* renamed from: c  reason: collision with root package name */
        public String f70004c;
        @c(a = "is_preview")

        /* renamed from: d  reason: collision with root package name */
        public boolean f70005d;

        static {
            Covode.recordClassIndex(43179);
        }

        @Override // com.ss.android.ugc.aweme.video.hashtag.b.a
        public final void a(Context context, int i2) {
            HashMap hashMap = new HashMap();
            int i3 = i2 + 1;
            hashMap.put("topic_order", Integer.valueOf(i3));
            f.b a2 = f.a();
            a2.f74804a = "launch_ad";
            a2.f74805b = "show";
            a2.c("topic").e(this.f70004c).a(Long.valueOf(this.f70002a)).a(hashMap).a(context);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("launch_ad", "show", String.valueOf(this.f70002a), this.f70004c, "0").b("refer", "topic").a("topic_order", Integer.valueOf(i3)).c();
        }

        @Override // com.ss.android.ugc.aweme.video.hashtag.b.a
        public final void b(Context context, int i2) {
            HashMap hashMap = new HashMap();
            int i3 = i2 + 1;
            hashMap.put("topic_order", Integer.valueOf(i3));
            f.b a2 = f.a();
            a2.f74804a = "launch_ad";
            a2.f74805b = "click";
            a2.c("topic").e(this.f70004c).a(Long.valueOf(this.f70002a)).a(hashMap).a(context);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("launch_ad", "click", String.valueOf(this.f70002a), this.f70004c, "0").b("refer", "topic").a("topic_order", Integer.valueOf(i3)).c();
        }
    }
}
