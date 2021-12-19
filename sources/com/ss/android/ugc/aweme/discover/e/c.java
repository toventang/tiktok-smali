package com.ss.android.ugc.aweme.discover.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class c implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f80947b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f80948a;

    static {
        Covode.recordClassIndex(50322);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && this.f80948a == ((c) obj).f80948a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f80948a;
    }

    public final String toString() {
        return "ContainerStatusChangedEvent(status=" + this.f80948a + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50323);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c(int i2) {
        this.f80948a = i2;
    }
}
