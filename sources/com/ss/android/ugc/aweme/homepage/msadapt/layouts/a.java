package com.ss.android.ugc.aweme.homepage.msadapt.layouts;

import com.bytedance.covode.number.Covode;

public enum a {
    BLACK(0),
    WHITE(1);
    
    public static final C2426a Companion = new C2426a((byte) 0);
    private final int id;

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.layouts.a$a  reason: collision with other inner class name */
    public static final class C2426a {
        static {
            Covode.recordClassIndex(63216);
        }

        private C2426a() {
        }

        public /* synthetic */ C2426a(byte b2) {
            this();
        }

        public static a a(int i2) {
            a[] values = a.values();
            for (a aVar : values) {
                if (aVar.getId() == i2) {
                    return aVar;
                }
            }
            throw new IllegalArgumentException("The HingeColor id doesn't exit");
        }
    }

    public final int getId() {
        return this.id;
    }

    static {
        Covode.recordClassIndex(63215);
    }

    private a(int i2) {
        this.id = i2;
    }
}
