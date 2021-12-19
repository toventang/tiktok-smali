package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class m {

    /* renamed from: h  reason: collision with root package name */
    public static final a f23097h = new a((byte) 0);
    @c(a = "target_start_time")

    /* renamed from: a  reason: collision with root package name */
    public long f23098a;
    @c(a = "duration")

    /* renamed from: b  reason: collision with root package name */
    public long f23099b;
    @c(a = "click_action")

    /* renamed from: c  reason: collision with root package name */
    public long f23100c;
    @c(a = "click_prompt")

    /* renamed from: d  reason: collision with root package name */
    public f f23101d;
    @c(a = "prompt_type")

    /* renamed from: e  reason: collision with root package name */
    public long f23102e;
    @c(a = "static_prompt")

    /* renamed from: f  reason: collision with root package name */
    public f f23103f;
    @c(a = "progress_target")

    /* renamed from: g  reason: collision with root package name */
    public long f23104g;

    static {
        Covode.recordClassIndex(13680);
    }

    public m(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f23098a == mVar.f23098a && this.f23099b == mVar.f23099b && this.f23100c == mVar.f23100c && l.a(this.f23101d, mVar.f23101d) && this.f23102e == mVar.f23102e && l.a(this.f23103f, mVar.f23103f) && this.f23104g == mVar.f23104g;
    }

    public final String toString() {
        return "TaskPeriodConfig(taskStartTime=" + this.f23098a + ", duration=" + this.f23099b + ", clickAction=" + this.f23100c + ", clickToastPrompt=" + this.f23101d + ", promptType=" + this.f23102e + ", taskStaticPrompt=" + this.f23103f + ", progressTarget=" + this.f23104g + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(13681);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private m() {
        this.f23098a = 0;
        this.f23099b = 0;
        this.f23100c = 0;
        this.f23101d = null;
        this.f23102e = 0;
        this.f23103f = null;
        this.f23104g = 0;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f23098a;
        long j3 = this.f23099b;
        long j4 = this.f23100c;
        int i3 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        f fVar = this.f23101d;
        int i4 = 0;
        if (fVar != null) {
            i2 = fVar.hashCode();
        } else {
            i2 = 0;
        }
        long j5 = this.f23102e;
        int i5 = (((i3 + i2) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        f fVar2 = this.f23103f;
        if (fVar2 != null) {
            i4 = fVar2.hashCode();
        }
        long j6 = this.f23104g;
        return ((i5 + i4) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    private /* synthetic */ m(byte b2) {
        this();
    }
}
