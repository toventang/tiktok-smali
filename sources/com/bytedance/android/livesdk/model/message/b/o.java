package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final o f19286e = new o();

    /* renamed from: f  reason: collision with root package name */
    public static final o f19287f = new o();

    /* renamed from: g  reason: collision with root package name */
    public static final a f19288g = new a((byte) 0);
    @c(a = "user_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19289a;
    @c(a = "score")

    /* renamed from: b  reason: collision with root package name */
    public int f19290b;
    @c(a = "nickname")

    /* renamed from: c  reason: collision with root package name */
    public String f19291c;
    @c(a = "avatar_thumb")

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f19292d;

    public static final class a {
        static {
            Covode.recordClassIndex(11454);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(11453);
    }

    public final String toString() {
        return "BattleUserArmy{userId=" + this.f19289a + ", score=" + this.f19290b + ", nickname='" + this.f19291c + '\'' + ", avatarThumb=" + this.f19292d + '}';
    }
}
