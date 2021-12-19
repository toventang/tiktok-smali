package com.bytedance.scene.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.a.d;
import com.bytedance.scene.j;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final d f42748a;

    /* renamed from: b  reason: collision with root package name */
    public final g f42749b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42750c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.scene.d.f<j> f42751d;

    static {
        Covode.recordClassIndex(26252);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f42752a;

        /* renamed from: b  reason: collision with root package name */
        public g f42753b;

        /* renamed from: c  reason: collision with root package name */
        public d f42754c;

        /* renamed from: d  reason: collision with root package name */
        private com.bytedance.scene.d.f<j> f42755d;

        static {
            Covode.recordClassIndex(26253);
        }

        public final a a() {
            this.f42752a = true;
            return this;
        }

        public final f b() {
            return new f(this.f42755d, this.f42752a, this.f42753b, this.f42754c, (byte) 0);
        }

        public final a a(d dVar) {
            this.f42754c = dVar;
            return this;
        }
    }

    private f(com.bytedance.scene.d.f<j> fVar, boolean z, g gVar, d dVar) {
        this.f42751d = fVar;
        this.f42750c = z;
        this.f42749b = gVar;
        this.f42748a = dVar;
    }

    /* synthetic */ f(com.bytedance.scene.d.f fVar, boolean z, g gVar, d dVar, byte b2) {
        this(fVar, z, gVar, dVar);
    }
}
