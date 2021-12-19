package com.bytedance.aweme.core;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public EnumC0550b f25812a;

    /* renamed from: b  reason: collision with root package name */
    public int f25813b;

    static {
        Covode.recordClassIndex(15067);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public EnumC0550b f25814a = EnumC0550b.CLOSE;

        /* renamed from: b  reason: collision with root package name */
        public int f25815b = 30;

        static {
            Covode.recordClassIndex(15068);
        }

        public final b a() {
            return new b(this);
        }
    }

    public static b a() {
        return new a().a();
    }

    /* renamed from: com.bytedance.aweme.core.b$b  reason: collision with other inner class name */
    public enum EnumC0550b {
        CLOSE,
        COMMIT;

        static {
            Covode.recordClassIndex(15069);
        }
    }

    b(a aVar) {
        this.f25812a = aVar.f25814a;
        this.f25813b = aVar.f25815b;
    }
}
