package com.ss.android.ugc.aweme.im.sdk.privacy.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.c;

public abstract class a extends c.b {
    static {
        Covode.recordClassIndex(65982);
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.c.a$a  reason: collision with other inner class name */
    public static final class C2603a extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C2603a f102932a = new C2603a();

        private C2603a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(65983);
        }
    }

    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final int f102933a;

        static {
            Covode.recordClassIndex(65984);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.f102933a == ((b) obj).f102933a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f102933a;
        }

        public final String toString() {
            return "SelectValue(value=" + this.f102933a + ")";
        }

        public b(int i2) {
            super((byte) 0);
            this.f102933a = i2;
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
