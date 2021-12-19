package com.ss.android.ugc.aweme.commercialize.event;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1671a f74038b = new C1671a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f74039a;

    static {
        Covode.recordClassIndex(45598);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f74039a == ((a) obj).f74039a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f74039a;
    }

    public final String toString() {
        return "AdCommentListEvent(type=" + this.f74039a + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.event.a$a  reason: collision with other inner class name */
    public static final class C1671a {
        static {
            Covode.recordClassIndex(45599);
        }

        private C1671a() {
        }

        public /* synthetic */ C1671a(byte b2) {
            this();
        }
    }

    public a(int i2) {
        this.f74039a = i2;
    }
}
