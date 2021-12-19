package com.bytedance.creativex.recorder.b.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class g {
    static {
        Covode.recordClassIndex(16516);
    }

    private g() {
    }

    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public final int f28185a;

        static {
            Covode.recordClassIndex(16517);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.f28185a == ((a) obj).f28185a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f28185a;
        }

        public final String toString() {
            return "ProcessRunningError(ret=" + this.f28185a + ")";
        }

        public a(int i2) {
            super((byte) 0);
            this.f28185a = i2;
        }
    }

    public static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final int f28186a;

        static {
            Covode.recordClassIndex(16518);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.f28186a == ((b) obj).f28186a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f28186a;
        }

        public final String toString() {
            return "StartRecordFailed(ret=" + this.f28186a + ")";
        }

        public b(int i2) {
            super((byte) 0);
            this.f28186a = i2;
        }
    }

    public static final class c extends g {

        /* renamed from: a  reason: collision with root package name */
        public final long f28187a;

        static {
            Covode.recordClassIndex(16519);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.f28187a == ((c) obj).f28187a;
            }
            return true;
        }

        public final int hashCode() {
            long j2 = this.f28187a;
            return (int) (j2 ^ (j2 >>> 32));
        }

        public final String toString() {
            return "StopRecordDurationNegative(duration=" + this.f28187a + ")";
        }

        public c(long j2) {
            super((byte) 0);
            this.f28187a = j2;
        }
    }

    public static final class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final long f28188a;

        static {
            Covode.recordClassIndex(16520);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.f28188a == ((d) obj).f28188a;
            }
            return true;
        }

        public final int hashCode() {
            long j2 = this.f28188a;
            return (int) (j2 ^ (j2 >>> 32));
        }

        public final String toString() {
            return "StopRecordReturnNegative(ret=" + this.f28188a + ")";
        }

        public d(long j2) {
            super((byte) 0);
            this.f28188a = j2;
        }
    }

    public /* synthetic */ g(byte b2) {
        this();
    }

    public static final class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final w f28189a;

        static {
            Covode.recordClassIndex(16521);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && l.a(this.f28189a, ((e) obj).f28189a);
            }
            return true;
        }

        public final int hashCode() {
            w wVar = this.f28189a;
            if (wVar != null) {
                return wVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "TryRecordOnCameraNotInit(event=" + this.f28189a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(w wVar) {
            super((byte) 0);
            l.d(wVar, "");
            this.f28189a = wVar;
        }
    }
}
