package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public final class g {
    @c(a = "avatars")

    /* renamed from: a  reason: collision with root package name */
    public List<ImageModel> f15608a;
    @c(a = "settings")

    /* renamed from: b  reason: collision with root package name */
    private String f15609b;

    public static class a {
        @c(a = "except_match_time")

        /* renamed from: a  reason: collision with root package name */
        public int f15610a;
        @c(a = "timeout_time")

        /* renamed from: b  reason: collision with root package name */
        public int f15611b;
        @c(a = "round_time")

        /* renamed from: c  reason: collision with root package name */
        public int f15612c;
        @c(a = "bubble_text_first_round")

        /* renamed from: d  reason: collision with root package name */
        public String f15613d;
        @c(a = "bubble_text_second_round")

        /* renamed from: e  reason: collision with root package name */
        public String f15614e;
        @c(a = "bubble_text_connecting")

        /* renamed from: f  reason: collision with root package name */
        public String f15615f;

        static {
            Covode.recordClassIndex(8617);
        }
    }

    static {
        Covode.recordClassIndex(8616);
    }

    public final a a() {
        if (a((a) e.a.f9629c.a(this.f15609b, a.class))) {
            return (a) e.a.f9629c.a(this.f15609b, a.class);
        }
        a aVar = new a();
        aVar.f15610a = 16;
        aVar.f15611b = LiveFeedRefreshTimeSetting.DEFAULT;
        aVar.f15612c = 4;
        return aVar;
    }

    private static boolean a(a aVar) {
        if (aVar != null && aVar.f15610a > 0 && aVar.f15611b > 0 && aVar.f15612c > 0) {
            return true;
        }
        return false;
    }
}
