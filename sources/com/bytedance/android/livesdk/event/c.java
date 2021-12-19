package com.bytedance.android.livesdk.event;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f17181d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f17182a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17183b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f17184c;

    static {
        Covode.recordClassIndex(9536);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17182a == cVar.f17182a && l.a(this.f17183b, cVar.f17183b) && l.a(this.f17184c, cVar.f17184c);
    }

    public final int hashCode() {
        int i2 = this.f17182a * 31;
        String str = this.f17183b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f17184c;
        if (jSONObject != null) {
            i3 = jSONObject.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "BannerH5RoomStatusChangeEvent(position=" + this.f17182a + ", type=" + this.f17183b + ", data=" + this.f17184c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9537);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
