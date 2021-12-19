package com.ss.android.ugc.aweme.profile.edit.api;

import android.content.Context;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public final class YoutubeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final YoutubeApi f116091a = new YoutubeApi();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f116092b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final ServerApi f116093c;

    public interface ServerApi {
        static {
            Covode.recordClassIndex(74889);
        }

        @o(a = "/aweme/v1/youtube/bind/")
        @e
        q<a> link(@c(a = "yt_raw_token") String str, @c(a = "google_account") String str2, @c(a = "youtube_channel_id") String str3, @c(a = "youtube_channel_title") String str4, @c(a = "user_agent") String str5, @c(a = "token_type") String str6, @c(a = "access_token") String str7);

        @f(a = "/aweme/v1/youtube/unbind/")
        q<a> unlink();
    }

    private YoutubeApi() {
    }

    public static final class a {
        @com.google.gson.a.c(a = "status_code")

        /* renamed from: a  reason: collision with root package name */
        public final Integer f116094a;
        @com.google.gson.a.c(a = "error_msg")

        /* renamed from: b  reason: collision with root package name */
        public final String f116095b;
        @com.google.gson.a.c(a = "fail_reason")

        /* renamed from: c  reason: collision with root package name */
        public final C2963a f116096c;
        @com.google.gson.a.c(a = "bind_info")

        /* renamed from: d  reason: collision with root package name */
        public final b f116097d;

        static {
            Covode.recordClassIndex(74890);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f116094a, aVar.f116094a) && l.a(this.f116095b, aVar.f116095b) && l.a(this.f116096c, aVar.f116096c) && l.a(this.f116097d, aVar.f116097d);
        }

        public final int hashCode() {
            Integer num = this.f116094a;
            int i2 = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.f116095b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            C2963a aVar = this.f116096c;
            int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            b bVar = this.f116097d;
            if (bVar != null) {
                i2 = bVar.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "YouTubeResponse(statusCode=" + this.f116094a + ", errorMessage=" + this.f116095b + ", errorStruct=" + this.f116096c + ", youtubeData=" + this.f116097d + ")";
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a  reason: collision with other inner class name */
        public static final class C2963a {
            @com.google.gson.a.c(a = "code")

            /* renamed from: a  reason: collision with root package name */
            public final Integer f116098a;
            @com.google.gson.a.c(a = "message")

            /* renamed from: b  reason: collision with root package name */
            public final String f116099b;

            static {
                Covode.recordClassIndex(74891);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2963a)) {
                    return false;
                }
                C2963a aVar = (C2963a) obj;
                return l.a(this.f116098a, aVar.f116098a) && l.a(this.f116099b, aVar.f116099b);
            }

            public final int hashCode() {
                Integer num = this.f116098a;
                int i2 = 0;
                int hashCode = (num != null ? num.hashCode() : 0) * 31;
                String str = this.f116099b;
                if (str != null) {
                    i2 = str.hashCode();
                }
                return hashCode + i2;
            }

            public final String toString() {
                return "YouTubeErrorStruct(code=" + this.f116098a + ", message=" + this.f116099b + ")";
            }

            private /* synthetic */ C2963a() {
                this(0, "");
            }

            private C2963a(Integer num, String str) {
                this.f116098a = num;
                this.f116099b = str;
            }
        }

        public static final class b {
            @com.google.gson.a.c(a = "google_account")

            /* renamed from: a  reason: collision with root package name */
            public final String f116100a = null;
            @com.google.gson.a.c(a = "channel_id")

            /* renamed from: b  reason: collision with root package name */
            public final String f116101b = null;
            @com.google.gson.a.c(a = "channel_title")

            /* renamed from: c  reason: collision with root package name */
            public final String f116102c = null;

            static {
                Covode.recordClassIndex(74892);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return l.a(this.f116100a, bVar.f116100a) && l.a(this.f116101b, bVar.f116101b) && l.a(this.f116102c, bVar.f116102c);
            }

            public final int hashCode() {
                String str = this.f116100a;
                int i2 = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f116101b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f116102c;
                if (str3 != null) {
                    i2 = str3.hashCode();
                }
                return hashCode2 + i2;
            }

            public final String toString() {
                return "YoutubeChannelStruct(googleAccount=" + this.f116100a + ", channelId=" + this.f116101b + ", channelTitle=" + this.f116102c + ")";
            }

            private b() {
            }
        }

        private /* synthetic */ a() {
            this(0, "");
        }

        private a(Integer num, String str) {
            this.f116094a = num;
            this.f116095b = str;
            this.f116096c = null;
            this.f116097d = null;
        }
    }

    static {
        Covode.recordClassIndex(74888);
        Object a2 = RetrofitFactory.a().b(b.f59141e).d().a(ServerApi.class);
        l.b(a2, "");
        f116093c = (ServerApi) a2;
    }

    public static final boolean a() {
        try {
            a aVar = f116093c.unlink().get();
            if (aVar == null) {
                return false;
            }
            Integer num = aVar.f116094a;
            if (num == null) {
                return false;
            }
            if (num.intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String a(Context context, Exception exc, Integer num, a aVar) {
        String str;
        Integer num2;
        String str2;
        Integer num3;
        a.C2963a aVar2;
        a.C2963a aVar3;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Exception: ");
        if (exc == null || (str = exc.getMessage()) == null) {
            str = Log.getStackTraceString(exc);
            l.b(str, "");
        }
        StringBuilder append = sb.append(sb2.append(str).toString()).append(", gms_code: ").append(com.ss.android.ugc.trill.h.a.b(context)).append(", oauth_code: ").append(num).append(", resp_code: ");
        String str3 = null;
        if (aVar != null) {
            num2 = aVar.f116094a;
        } else {
            num2 = null;
        }
        StringBuilder append2 = append.append(num2).append(", resp_msg: ");
        if (aVar != null) {
            str2 = aVar.f116095b;
        } else {
            str2 = null;
        }
        StringBuilder append3 = append2.append(str2).append(", yt_code: ");
        if (aVar == null || (aVar3 = aVar.f116096c) == null) {
            num3 = null;
        } else {
            num3 = aVar3.f116098a;
        }
        StringBuilder append4 = append3.append(num3).append(", yt_msg: ");
        if (!(aVar == null || (aVar2 = aVar.f116096c) == null)) {
            str3 = aVar2.f116099b;
        }
        String sb3 = append4.append(str3).toString();
        l.b(sb3, "");
        return sb3;
    }

    public static final a a(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            return f116093c.link(str, null, str2, str3, str4, str6, str5).get();
        } catch (Exception unused) {
            return null;
        }
    }
}
