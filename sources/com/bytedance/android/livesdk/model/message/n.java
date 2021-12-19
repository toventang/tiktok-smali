package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class n extends com.bytedance.android.livesdk.ac.b.a {
    @c(a = "action")

    /* renamed from: a  reason: collision with root package name */
    public int f19656a;
    @c(a = "tips")

    /* renamed from: f  reason: collision with root package name */
    public String f19657f;
    @c(a = "extra")

    /* renamed from: g  reason: collision with root package name */
    public a f19658g;

    public static class a {
        @c(a = "ban_info_url")

        /* renamed from: a  reason: collision with root package name */
        public String f19659a;
        @c(a = "reason_no")

        /* renamed from: b  reason: collision with root package name */
        public long f19660b;
        @c(a = "title")

        /* renamed from: c  reason: collision with root package name */
        public b f19661c;
        @c(a = "violation_reason")

        /* renamed from: d  reason: collision with root package name */
        public b f19662d;
        @c(a = "display_text")

        /* renamed from: e  reason: collision with root package name */
        public b f19663e;

        static {
            Covode.recordClassIndex(11691);
        }
    }

    static {
        Covode.recordClassIndex(11690);
    }

    public n() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.CONTROL;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        int i2 = this.f19656a;
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }
}
