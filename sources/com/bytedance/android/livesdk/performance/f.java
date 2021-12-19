package com.bytedance.android.livesdk.performance;

import com.bytedance.android.livesdk.livesetting.performance.LiveDegradeThresholdSettingSetting;
import com.bytedance.android.livesdk.model.ak;
import com.bytedance.covode.number.Covode;

public class f {

    /* renamed from: a  reason: collision with root package name */
    a f20225a = new a(1);

    /* renamed from: b  reason: collision with root package name */
    a f20226b = new a(2);

    static {
        Covode.recordClassIndex(11930);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f20227a;

        /* renamed from: b  reason: collision with root package name */
        private long f20228b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f20229c = -1;

        static {
            Covode.recordClassIndex(11931);
        }

        public final void a() {
            this.f20229c = -1;
            this.f20228b = -1;
        }

        private int c() {
            int i2;
            ak.a f2 = f();
            if (f2 != null && (i2 = f2.f18956b) >= 0 && i2 <= 1) {
                return i2;
            }
            return 0;
        }

        private long d() {
            ak.a f2 = f();
            if (f2 == null) {
                return 60000;
            }
            long j2 = f2.f18955a;
            if (j2 > 0) {
                return j2;
            }
            return 60000;
        }

        private float e() {
            ak.a f2 = f();
            if (f2 == null) {
                return 40.0f;
            }
            float f3 = f2.f18958d;
            if (LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f18952b) {
                return Math.max(f3, 40.0f);
            }
            return f3;
        }

        private ak.a f() {
            int i2 = this.f20227a;
            if (i2 == 1) {
                return LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f18953c;
            }
            if (i2 == 2) {
                return LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f18954d;
            }
            return null;
        }

        private boolean b() {
            boolean z;
            boolean z2;
            if (this.f20228b <= 0 || System.currentTimeMillis() - this.f20228b < d()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f20229c <= 0 || System.currentTimeMillis() - this.f20229c < d()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (c() == 1) {
                if (z || z2) {
                    return true;
                }
            } else if (!z || !z2) {
                return false;
            } else {
                return true;
            }
            return false;
        }

        public a(int i2) {
            this.f20227a = i2;
        }

        public final boolean a(float f2) {
            if (f2 <= e()) {
                this.f20228b = -1;
            } else if (this.f20228b <= 0) {
                this.f20228b = System.currentTimeMillis();
            }
            return b();
        }

        public final boolean a(double d2) {
            ak.a f2 = f();
            float f3 = 47.0f;
            if (f2 != null) {
                float f4 = f2.f18957c;
                if (LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f18952b) {
                    f4 = Math.min(f4, 47.0f);
                }
                f3 = f4;
            }
            if (d2 >= ((double) f3)) {
                this.f20229c = -1;
            } else if (this.f20229c <= 0) {
                this.f20229c = System.currentTimeMillis();
            }
            return b();
        }
    }

    static boolean a() {
        return LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f18951a;
    }

    static void a(int i2) {
        com.bytedance.android.livesdk.an.a.a().a(new e(i2));
    }

    public final void a(float f2) {
        if (a()) {
            boolean a2 = this.f20225a.a(f2);
            if (this.f20226b.a(f2)) {
                a(2);
                this.f20226b.a();
                this.f20225a.a();
            } else if (a2) {
                a(1);
                this.f20225a.a();
            }
        }
    }
}
