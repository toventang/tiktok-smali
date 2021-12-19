package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public final class at {
    public c A = c.LV_GRAPH_TYPE;
    public VEDisplaySettings B;
    public boolean C;
    public boolean D = true;
    public boolean E = true;
    public boolean F;
    public boolean G = false;

    /* renamed from: a  reason: collision with root package name */
    public VESize f150945a = new VESize(720, 1280);

    /* renamed from: b  reason: collision with root package name */
    public boolean f150946b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f150947c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f150948d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f150949e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f150950f = false;

    /* renamed from: g  reason: collision with root package name */
    public int f150951g = 30;

    /* renamed from: h  reason: collision with root package name */
    public boolean f150952h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f150953i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f150954j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f150955k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f150956l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f150957m;
    public boolean n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public b s = b.RecordFullContent;
    public boolean t = false;
    public int u = Integer.MAX_VALUE;
    public int v;
    public boolean w = false;
    public boolean x = false;
    public boolean y = true;
    public d z = d.Default;

    static {
        Covode.recordClassIndex(99281);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public at f150958a;

        static {
            Covode.recordClassIndex(99282);
        }

        public final a a() {
            this.f150958a.f150956l = true;
            return this;
        }

        public final a b() {
            this.f150958a.n = true;
            return this;
        }

        public final a c() {
            this.f150958a.o = true;
            return this;
        }

        public final a d() {
            this.f150958a.C = true;
            return this;
        }

        public final a e() {
            this.f150958a.D = false;
            return this;
        }

        public final a f() {
            this.f150958a.E = false;
            return this;
        }

        public a() {
            at atVar = new at();
            this.f150958a = atVar;
            atVar.f150951g = ((Integer) u.a().a("ve_titan_max_count_of_render_frame_buffer", Integer.valueOf(this.f150958a.f150951g))).intValue();
            an.a("VEPreviewSettings", "AB maxCountOfBufCache: " + this.f150958a.f150951g);
        }

        public final a a(long j2) {
            this.f150958a.p = j2;
            return this;
        }

        public final a b(boolean z) {
            this.f150958a.f150947c = z;
            return this;
        }

        public final a c(boolean z) {
            this.f150958a.f150953i = z;
            return this;
        }

        public final a d(boolean z) {
            this.f150958a.f150954j = z;
            return this;
        }

        public final a e(boolean z) {
            this.f150958a.f150957m = z;
            return this;
        }

        public final a f(boolean z) {
            this.f150958a.t = z;
            return this;
        }

        public final a a(VEDisplaySettings vEDisplaySettings) {
            this.f150958a.B = vEDisplaySettings;
            return this;
        }

        public final a a(VESize vESize) {
            this.f150958a.f150945a = vESize;
            return this;
        }

        public final a a(c cVar) {
            this.f150958a.A = cVar;
            return this;
        }

        public final a a(boolean z) {
            this.f150958a.f150946b = z;
            return this;
        }
    }

    public enum b {
        RecordOriginContent,
        RecordEffectContent,
        RecordFullContent,
        RecordIntermediateContent;

        static {
            Covode.recordClassIndex(99283);
        }
    }

    public enum c {
        LV_GRAPH_TYPE,
        AWESOME_GRAPH_TYPE,
        QR_CODE_GRAPH;

        static {
            Covode.recordClassIndex(99284);
        }
    }

    public enum d {
        Default,
        Pro;

        static {
            Covode.recordClassIndex(99285);
        }
    }
}
