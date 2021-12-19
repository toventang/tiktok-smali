package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

public class bh extends com.bytedance.android.livesdk.ac.b.a {
    @com.google.gson.a.c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public int f19317a;
    @com.google.gson.a.c(a = "portal_id")

    /* renamed from: f  reason: collision with root package name */
    public long f19318f;
    @com.google.gson.a.c(a = "room_id")

    /* renamed from: g  reason: collision with root package name */
    public long f19319g;
    @com.google.gson.a.c(a = "portal_buy")

    /* renamed from: h  reason: collision with root package name */
    protected b f19320h;
    @com.google.gson.a.c(a = "portal_invite")

    /* renamed from: i  reason: collision with root package name */
    protected d f19321i;
    @com.google.gson.a.c(a = "portal_finish")

    /* renamed from: j  reason: collision with root package name */
    protected c f19322j;
    @com.google.gson.a.c(a = "payload")

    /* renamed from: k  reason: collision with root package name */
    public a f19323k;

    public interface a {
        static {
            Covode.recordClassIndex(11475);
        }
    }

    public static class b implements a {
        @com.google.gson.a.c(a = "sugar_daddy")

        /* renamed from: a  reason: collision with root package name */
        public User f19324a;

        static {
            Covode.recordClassIndex(11476);
        }
    }

    public static class c implements a {
        @com.google.gson.a.c(a = "lucky_person")

        /* renamed from: a  reason: collision with root package name */
        public User f19325a;

        static {
            Covode.recordClassIndex(11477);
        }
    }

    public static class d implements a {
        @com.google.gson.a.c(a = "invite_count_down")

        /* renamed from: a  reason: collision with root package name */
        public long f19326a;
        @com.google.gson.a.c(a = "reward_count_down")

        /* renamed from: b  reason: collision with root package name */
        public long f19327b;
        @com.google.gson.a.c(a = "sugar_daddy")

        /* renamed from: c  reason: collision with root package name */
        public User f19328c;
        @com.google.gson.a.c(a = "anchor")

        /* renamed from: d  reason: collision with root package name */
        public User f19329d;

        static {
            Covode.recordClassIndex(11478);
        }
    }

    static {
        Covode.recordClassIndex(11474);
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        return true;
    }

    public bh() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.PORTAL_MESSAGE;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        com.bytedance.android.livesdkapi.h.b bVar = this.O;
        if (bVar == null || bVar.f23218j == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int i2 = this.f19317a;
        if (i2 == 1) {
            this.f19323k = this.f19320h;
        } else if (i2 == 2) {
            this.f19323k = this.f19321i;
        } else if (i2 == 3) {
            this.f19323k = this.f19322j;
        }
    }
}
