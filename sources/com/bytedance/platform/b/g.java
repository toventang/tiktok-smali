package com.bytedance.platform.b;

import com.bytedance.covode.number.Covode;

public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f41935a = new g() {
        /* class com.bytedance.platform.b.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25611);
        }

        @Override // com.bytedance.platform.b.g
        public final void a(Throwable th) {
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final g f41936b;

    /* renamed from: c  reason: collision with root package name */
    public static final g f41937c = new g() {
        /* class com.bytedance.platform.b.g.AnonymousClass3 */

        static {
            Covode.recordClassIndex(25613);
        }

        @Override // com.bytedance.platform.b.g
        public final void a(Throwable th) {
            if (th != null) {
                throw new RuntimeException("Request threw uncaught throwable", th);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public static final g f41938d;

    void a(Throwable th);

    static {
        Covode.recordClassIndex(25610);
        AnonymousClass2 r1 = new g() {
            /* class com.bytedance.platform.b.g.AnonymousClass2 */

            static {
                Covode.recordClassIndex(25612);
            }

            @Override // com.bytedance.platform.b.g
            public final void a(Throwable th) {
            }
        };
        f41936b = r1;
        f41938d = r1;
    }
}
