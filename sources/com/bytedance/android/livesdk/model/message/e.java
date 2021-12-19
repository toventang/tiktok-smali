package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Map;

public class e extends com.bytedance.android.livesdk.ac.b.a {
    @c(a = "event")

    /* renamed from: a  reason: collision with root package name */
    public a f19599a;
    @c(a = "msg_type")

    /* renamed from: f  reason: collision with root package name */
    public int f19600f;
    @c(a = "icon")

    /* renamed from: g  reason: collision with root package name */
    public ImageModel f19601g;
    @c(a = "content")

    /* renamed from: h  reason: collision with root package name */
    public b f19602h;

    public static class a {
        @c(a = "event_name")

        /* renamed from: a  reason: collision with root package name */
        public String f19603a;
        @c(a = "params")

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f19604b;

        static {
            Covode.recordClassIndex(11616);
        }
    }

    static {
        Covode.recordClassIndex(11615);
    }

    public e() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.BARRAGE_MESSAGE;
    }
}
