package androidx.recyclerview.widget;

import com.bytedance.covode.number.Covode;

interface ad {

    public interface d {
        static {
            Covode.recordClassIndex(1540);
        }

        long a(long j2);
    }

    static {
        Covode.recordClassIndex(1533);
    }

    d a();

    public static class b implements ad {

        /* renamed from: a  reason: collision with root package name */
        private final d f3963a = new d() {
            /* class androidx.recyclerview.widget.ad.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1537);
            }

            @Override // androidx.recyclerview.widget.ad.d
            public final long a(long j2) {
                return -1;
            }
        };

        static {
            Covode.recordClassIndex(1536);
        }

        @Override // androidx.recyclerview.widget.ad
        public final d a() {
            return this.f3963a;
        }
    }

    public static class c implements ad {

        /* renamed from: a  reason: collision with root package name */
        private final d f3965a = new d() {
            /* class androidx.recyclerview.widget.ad.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1539);
            }

            @Override // androidx.recyclerview.widget.ad.d
            public final long a(long j2) {
                return j2;
            }
        };

        static {
            Covode.recordClassIndex(1538);
        }

        @Override // androidx.recyclerview.widget.ad
        public final d a() {
            return this.f3965a;
        }
    }

    public static class a implements ad {

        /* renamed from: a  reason: collision with root package name */
        long f3960a;

        static {
            Covode.recordClassIndex(1534);
        }

        @Override // androidx.recyclerview.widget.ad
        public final d a() {
            return new C0058a();
        }

        /* renamed from: androidx.recyclerview.widget.ad$a$a  reason: collision with other inner class name */
        class C0058a implements d {

            /* renamed from: b  reason: collision with root package name */
            private final androidx.c.d<Long> f3962b = new androidx.c.d<>();

            static {
                Covode.recordClassIndex(1535);
            }

            C0058a() {
            }

            @Override // androidx.recyclerview.widget.ad.d
            public final long a(long j2) {
                Long a2 = this.f3962b.a(j2, null);
                if (a2 == null) {
                    a aVar = a.this;
                    long j3 = aVar.f3960a;
                    aVar.f3960a = 1 + j3;
                    a2 = Long.valueOf(j3);
                    this.f3962b.b(j2, a2);
                }
                return a2.longValue();
            }
        }
    }
}
