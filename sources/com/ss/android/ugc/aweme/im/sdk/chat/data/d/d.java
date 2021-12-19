package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.ay;
import f.a.t;
import f.a.z;
import h.a.ag;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class d extends t<c> {

    /* renamed from: a  reason: collision with root package name */
    private final e f100277a;

    static {
        Covode.recordClassIndex(63931);
    }

    static final class a extends ae implements com.bytedance.ies.im.core.api.b.a.d {

        /* renamed from: a  reason: collision with root package name */
        private final e f100278a;

        /* renamed from: b  reason: collision with root package name */
        private final z<? super c> f100279b;

        static {
            Covode.recordClassIndex(63932);
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(List<ai> list, boolean z) {
            z<? super c> zVar = this.f100279b;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            zVar.onNext(new q(list, z));
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(List<ai> list, Map<String, Map<String, String>> map) {
            z<? super c> zVar = this.f100279b;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            if (map == null) {
                map = ag.a();
            }
            zVar.onNext(new ab(list, map));
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.d.ae
        public final void a() {
            this.f100278a.b();
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(ai aiVar) {
            z<? super c> zVar = this.f100279b;
            if (aiVar != null) {
                zVar.onNext(new i(aiVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public a(e eVar, z<? super c> zVar) {
            l.d(eVar, "");
            l.d(zVar, "");
            this.f100278a = eVar;
            this.f100279b = zVar;
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void b(List<ai> list, boolean z) {
            z<? super c> zVar = this.f100279b;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            zVar.onNext(new p(list, z));
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(int i2, ai aiVar) {
            z<? super c> zVar = this.f100279b;
            if (aiVar != null) {
                zVar.onNext(new f(i2, aiVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(int i2, an anVar) {
            z<? super c> zVar = this.f100279b;
            if (anVar != null) {
                zVar.onNext(new w(i2, anVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(ai aiVar, boolean z) {
            z<? super c> zVar = this.f100279b;
            if (aiVar != null) {
                zVar.onNext(new u(aiVar, z));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(List<ai> list, int i2, String str) {
            z<? super c> zVar = this.f100279b;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            zVar.onNext(new r(list, i2, str));
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(int i2, ai aiVar, ay ayVar) {
            z<? super c> zVar = this.f100279b;
            if (aiVar != null) {
                zVar.onNext(new v(i2, aiVar, ayVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(ai aiVar, Map<String, List<com.bytedance.im.core.d.ag>> map, Map<String, List<com.bytedance.im.core.d.ag>> map2) {
            z<? super c> zVar = this.f100279b;
            if (aiVar != null) {
                if (map == null) {
                    map = ag.a();
                }
                if (map2 == null) {
                    map2 = ag.a();
                }
                zVar.onNext(new m(aiVar, map, map2));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
        public final void a(List<ai> list, int i2, ar arVar) {
            l.d(arVar, "");
            z<? super c> zVar = this.f100279b;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            zVar.onNext(new l(list, i2, arVar));
        }
    }

    public d(e eVar) {
        l.d(eVar, "");
        this.f100277a = eVar;
    }

    @Override // f.a.t
    public final void a(z<? super c> zVar) {
        l.d(zVar, "");
        a aVar = new a(this.f100277a, zVar);
        zVar.onSubscribe(aVar);
        this.f100277a.a(aVar);
    }
}
