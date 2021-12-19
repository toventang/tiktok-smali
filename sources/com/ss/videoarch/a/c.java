package com.ss.videoarch.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface c {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f154230a;

        /* renamed from: b  reason: collision with root package name */
        public final String f154231b;

        /* renamed from: c  reason: collision with root package name */
        public final String f154232c;

        /* renamed from: d  reason: collision with root package name */
        public final int f154233d;

        /* renamed from: e  reason: collision with root package name */
        public final Exception f154234e;

        static {
            Covode.recordClassIndex(102847);
        }

        /* renamed from: com.ss.videoarch.a.c$a$a  reason: collision with other inner class name */
        public static class C4103a {

            /* renamed from: a  reason: collision with root package name */
            public JSONObject f154235a;

            /* renamed from: b  reason: collision with root package name */
            public String f154236b;

            /* renamed from: c  reason: collision with root package name */
            public String f154237c;

            /* renamed from: d  reason: collision with root package name */
            public Exception f154238d;

            /* renamed from: e  reason: collision with root package name */
            public int f154239e;

            static {
                Covode.recordClassIndex(102848);
            }

            private C4103a() {
            }

            public final a a() {
                return new a(this, (byte) 0);
            }

            /* synthetic */ C4103a(byte b2) {
                this();
            }
        }

        public static C4103a a() {
            return new C4103a((byte) 0);
        }

        private a(C4103a aVar) {
            this.f154230a = aVar.f154235a;
            this.f154231b = aVar.f154236b;
            this.f154232c = aVar.f154237c;
            this.f154234e = aVar.f154238d;
            this.f154233d = aVar.f154239e;
        }

        /* synthetic */ a(C4103a aVar, byte b2) {
            this(aVar);
        }
    }

    static {
        Covode.recordClassIndex(102846);
    }

    a a(String str, String str2);

    a b(String str, String str2);
}
