package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;
import java.util.Map;

public class i {
    @c(a = "followed_list")

    /* renamed from: a  reason: collision with root package name */
    public List<Room> f15622a;
    @c(a = "recommend_list")

    /* renamed from: b  reason: collision with root package name */
    public List<Room> f15623b;
    @c(a = "rival_extra_infos")

    /* renamed from: c  reason: collision with root package name */
    public Map<Long, h> f15624c;
    @c(a = "auto_match_info")

    /* renamed from: d  reason: collision with root package name */
    public a f15625d;

    public static class a {
        @c(a = "title")

        /* renamed from: a  reason: collision with root package name */
        public String f15626a;
        @c(a = "subtitle")

        /* renamed from: b  reason: collision with root package name */
        public String f15627b;
        @c(a = "button")

        /* renamed from: c  reason: collision with root package name */
        public String f15628c;
        @c(a = "match_valid")

        /* renamed from: d  reason: collision with root package name */
        public boolean f15629d;

        static {
            Covode.recordClassIndex(8620);
        }
    }

    static {
        Covode.recordClassIndex(8619);
    }
}
