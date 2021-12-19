package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class w {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final a f114475a;
    @c(a = "extra")

    /* renamed from: b  reason: collision with root package name */
    public final b f114476b;
    @c(a = "status_code")

    /* renamed from: c  reason: collision with root package name */
    public final int f114477c;

    public static final class a {
        @c(a = "push_status")

        /* renamed from: a  reason: collision with root package name */
        public final int f114478a = 2;

        static {
            Covode.recordClassIndex(73673);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.f114478a == ((a) obj).f114478a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f114478a;
        }

        public final String toString() {
            return "DataBean(pushStatus=" + this.f114478a + ")";
        }
    }

    public static final class b {
        @c(a = "now")

        /* renamed from: a  reason: collision with root package name */
        public final String f114479a;

        static {
            Covode.recordClassIndex(73674);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f114479a, ((b) obj).f114479a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f114479a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ExtraBean(now=" + this.f114479a + ")";
        }
    }

    static {
        Covode.recordClassIndex(73672);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return l.a(this.f114475a, wVar.f114475a) && l.a(this.f114476b, wVar.f114476b) && this.f114477c == wVar.f114477c;
    }

    public final int hashCode() {
        a aVar = this.f114475a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        b bVar = this.f114476b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f114477c;
    }

    public final String toString() {
        return "NotificationLiveStatus(data=" + this.f114475a + ", extra=" + this.f114476b + ", statusCode=" + this.f114477c + ")";
    }

    private w(a aVar) {
        l.d(aVar, "");
        this.f114475a = aVar;
        this.f114476b = null;
        this.f114477c = 0;
    }

    public /* synthetic */ w(a aVar, byte b2) {
        this(aVar);
    }
}
