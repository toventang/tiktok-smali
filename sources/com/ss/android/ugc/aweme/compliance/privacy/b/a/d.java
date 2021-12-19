package com.ss.android.ugc.aweme.compliance.privacy.b.a;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public interface d {

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.d$d  reason: collision with other inner class name */
    public interface AbstractC1784d {
        static {
            Covode.recordClassIndex(47847);
        }

        long a(long j2);
    }

    static {
        Covode.recordClassIndex(47840);
    }

    AbstractC1784d a();

    public static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractC1784d f77357a = new AbstractC1784d() {
            /* class com.ss.android.ugc.aweme.compliance.privacy.b.a.d.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47844);
            }

            @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.d.AbstractC1784d
            public final long a(long j2) {
                return -1;
            }
        };

        static {
            Covode.recordClassIndex(47843);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.d
        public final AbstractC1784d a() {
            return this.f77357a;
        }
    }

    public static class c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractC1784d f77359a = new AbstractC1784d() {
            /* class com.ss.android.ugc.aweme.compliance.privacy.b.a.d.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47846);
            }

            @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.d.AbstractC1784d
            public final long a(long j2) {
                return j2;
            }
        };

        static {
            Covode.recordClassIndex(47845);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.d
        public final AbstractC1784d a() {
            return this.f77359a;
        }
    }

    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        long f77354a;

        static {
            Covode.recordClassIndex(47841);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.d
        public final AbstractC1784d a() {
            return new C1783a();
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.d$a$a  reason: collision with other inner class name */
        class C1783a implements AbstractC1784d {

            /* renamed from: b  reason: collision with root package name */
            private final androidx.c.d<Long> f77356b = new androidx.c.d<>();

            static {
                Covode.recordClassIndex(47842);
            }

            C1783a() {
            }

            @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.d.AbstractC1784d
            public final long a(long j2) {
                Long a2 = this.f77356b.a(j2, null);
                if (a2 == null) {
                    a aVar = a.this;
                    long j3 = aVar.f77354a;
                    aVar.f77354a = 1 + j3;
                    a2 = Long.valueOf(j3);
                    this.f77356b.b(j2, a2);
                }
                return a2.longValue();
            }
        }
    }
}
