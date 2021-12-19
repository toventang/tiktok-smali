package com.bytedance.apm.h;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static a f25001a = new a() {
        /* class com.bytedance.apm.h.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14601);
        }

        @Override // com.bytedance.apm.h.e.a
        public final void a(String str, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                com.a.a(str, objArr);
            }
        }

        @Override // com.bytedance.apm.h.e.a
        public final void b(String str, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                com.a.a(str, objArr);
            }
        }

        @Override // com.bytedance.apm.h.e.a
        public final void c(String str, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                com.a.a(str, objArr);
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(14602);
        }

        void a(String str, Object... objArr);

        void b(String str, Object... objArr);

        void c(String str, Object... objArr);
    }

    static {
        Covode.recordClassIndex(14600);
    }
}
