package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class au extends com.bytedance.android.livesdk.ac.b.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f19208i = new a((byte) 0);
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public long f19209a;
    @c(a = "audit_status")

    /* renamed from: f  reason: collision with root package name */
    public int f19210f;
    @c(a = "content")

    /* renamed from: g  reason: collision with root package name */
    public String f19211g;
    @c(a = "user")

    /* renamed from: h  reason: collision with root package name */
    public User f19212h;

    static {
        Covode.recordClassIndex(11415);
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11416);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public au() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LIVE_INTRO_MESSAGE;
    }
}
