package com.bytedance.ies.bullet.e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.ah;
import com.bytedance.ies.bullet.service.base.f;
import com.bytedance.ies.bullet.service.base.i;
import com.bytedance.ies.bullet.service.base.r;
import h.f.b.l;
import org.json.JSONObject;

public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final d f32115a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final c f32116b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final C0678b f32117c = new C0678b((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final a f32118d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f32119a = 3;

        /* renamed from: b  reason: collision with root package name */
        public int f32120b = 3;

        /* renamed from: c  reason: collision with root package name */
        public ah f32121c = b.f32115a;

        /* renamed from: d  reason: collision with root package name */
        public i f32122d = b.f32116b;

        static {
            Covode.recordClassIndex(18834);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.e.b$b  reason: collision with other inner class name */
    public static final class C0678b {
        static {
            Covode.recordClassIndex(18835);
        }

        private C0678b() {
        }

        public /* synthetic */ C0678b(byte b2) {
            this();
        }
    }

    public static final class c implements i {
        static {
            Covode.recordClassIndex(18836);
        }

        @Override // com.bytedance.ies.bullet.service.base.i
        public final void a(f fVar) {
            l.c(fVar, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.i
        public final void a(f fVar, JSONObject jSONObject) {
            l.c(fVar, "");
            l.c(jSONObject, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.i
        public final void b(f fVar) {
            l.c(fVar, "");
        }

        c() {
        }
    }

    public static final class d implements ah {
        static {
            Covode.recordClassIndex(18837);
        }

        @Override // com.bytedance.ies.bullet.service.base.ah
        public final Uri a(Uri uri) {
            l.c(uri, "");
            return uri;
        }

        d() {
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.r
    public final int a() {
        return this.f32118d.f32119a;
    }

    @Override // com.bytedance.ies.bullet.service.base.r
    public final int b() {
        return this.f32118d.f32120b;
    }

    @Override // com.bytedance.ies.bullet.service.base.r
    public final ah c() {
        return this.f32118d.f32121c;
    }

    @Override // com.bytedance.ies.bullet.service.base.r
    public final i d() {
        return this.f32118d.f32122d;
    }

    static {
        Covode.recordClassIndex(18833);
    }

    private b(a aVar) {
        this.f32118d = aVar;
    }

    public /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }
}
