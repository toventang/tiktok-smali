package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

public class al extends com.bytedance.android.livesdk.ac.b.a {
    @com.google.gson.a.c(a = "notice_type")

    /* renamed from: a  reason: collision with root package name */
    public int f19152a;
    @com.google.gson.a.c(a = "turn_on_guide")

    /* renamed from: f  reason: collision with root package name */
    public c f19153f;
    @com.google.gson.a.c(a = "notice_guide")

    /* renamed from: g  reason: collision with root package name */
    public a f19154g;

    public static class a {
        @com.google.gson.a.c(a = "content")

        /* renamed from: a  reason: collision with root package name */
        public b f19155a;
        @com.google.gson.a.c(a = "button_content")

        /* renamed from: b  reason: collision with root package name */
        public b f19156b;
        @com.google.gson.a.c(a = "user")

        /* renamed from: c  reason: collision with root package name */
        public User f19157c;

        static {
            Covode.recordClassIndex(11404);
        }
    }

    public static class b {
        @com.google.gson.a.c(a = "text")

        /* renamed from: a  reason: collision with root package name */
        public String f19158a;

        static {
            Covode.recordClassIndex(11405);
        }
    }

    public static class c {
        @com.google.gson.a.c(a = "content")

        /* renamed from: a  reason: collision with root package name */
        public b f19159a;
        @com.google.gson.a.c(a = "button_content")

        /* renamed from: b  reason: collision with root package name */
        public b f19160b;

        static {
            Covode.recordClassIndex(11406);
        }
    }

    static {
        Covode.recordClassIndex(11403);
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return true;
    }

    public al() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_AUDIENCE_NOTICE;
    }
}
