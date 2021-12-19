package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19266d = new a((byte) 0);
    @c(a = "user_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19267a;
    @c(a = "result")

    /* renamed from: b  reason: collision with root package name */
    public int f19268b;
    @c(a = "score")

    /* renamed from: c  reason: collision with root package name */
    public long f19269c;

    static {
        Covode.recordClassIndex(11444);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11445);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toString() {
        return "BattleResult{userId=" + this.f19267a + ", result=" + this.f19268b + ", score=" + this.f19269c + '}';
    }
}
