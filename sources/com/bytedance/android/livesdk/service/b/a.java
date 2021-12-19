package com.bytedance.android.livesdk.service.b;

import com.bytedance.android.livesdk.model.w;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public EnumC0451a f21278a;

    /* renamed from: b  reason: collision with root package name */
    public w f21279b;

    /* renamed from: com.bytedance.android.livesdk.service.b.a$a  reason: collision with other inner class name */
    public enum EnumC0451a {
        TAB_EVENT,
        TAB_EMPTY_EVENT,
        GIFT_EVENT,
        GIFT_EMPTY_EVENT;

        static {
            Covode.recordClassIndex(12556);
        }
    }

    static {
        Covode.recordClassIndex(12555);
    }

    public a(EnumC0451a aVar, w wVar) {
        l.d(aVar, "");
        l.d(wVar, "");
        this.f21278a = aVar;
        this.f21279b = wVar;
    }
}
