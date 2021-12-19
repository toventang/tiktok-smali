package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.h;
import f.a.t;
import f.a.z;
import h.f.b.l;
import java.util.List;

public final class b extends t<a> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.ies.im.core.api.b.b f100274a;

    static {
        Covode.recordClassIndex(63928);
    }

    static final class a extends ae implements com.bytedance.ies.im.core.api.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        private final com.bytedance.ies.im.core.api.b.b f100275a;

        /* renamed from: b  reason: collision with root package name */
        private final z<? super a> f100276b;

        static {
            Covode.recordClassIndex(63929);
        }

        @Override // com.bytedance.im.core.d.r
        public final int d() {
            return 0;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.d.ae
        public final void a() {
            this.f100275a.a();
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(List<ah> list) {
            z<? super a> zVar = this.f100276b;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            zVar.onNext(new aa(list));
        }

        @Override // com.bytedance.im.core.d.r
        public final void b(List<ah> list) {
            z<? super a> zVar = this.f100276b;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            zVar.onNext(new e(list));
        }

        @Override // com.bytedance.im.core.d.r
        public final void c(List<ah> list) {
            z<? super a> zVar = this.f100276b;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            zVar.onNext(new t(list));
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(h hVar) {
            z<? super a> zVar = this.f100276b;
            if (hVar != null) {
                zVar.onNext(new h(hVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.im.core.d.r
        public final void b(h hVar) {
            z<? super a> zVar = this.f100276b;
            if (hVar != null) {
                zVar.onNext(new j(hVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.im.core.d.r
        public final void c(h hVar) {
            z<? super a> zVar = this.f100276b;
            if (hVar != null) {
                zVar.onNext(new n(hVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.im.core.d.r
        public final void d(h hVar) {
            z<? super a> zVar = this.f100276b;
            if (hVar != null) {
                zVar.onNext(new k(hVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public a(com.bytedance.ies.im.core.api.b.b bVar, z<? super a> zVar) {
            l.d(bVar, "");
            l.d(zVar, "");
            this.f100275a = bVar;
            this.f100276b = zVar;
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(h hVar, int i2) {
            z<? super a> zVar = this.f100276b;
            if (hVar != null) {
                zVar.onNext(new z(hVar, i2));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, int i2) {
            z<? super a> zVar = this.f100276b;
            if (str != null) {
                zVar.onNext(new x(str, i2));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, List<? extends ah> list) {
            z<? super a> zVar = this.f100276b;
            if (str != null) {
                if (list == null) {
                    list = h.a.z.INSTANCE;
                }
                zVar.onNext(new o(str, list));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, int i2, List<Long> list) {
            z<? super a> zVar = this.f100276b;
            if (str != null) {
                if (list == null) {
                    list = h.a.z.INSTANCE;
                }
                zVar.onNext(new y(str, i2, list));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public b(com.bytedance.ies.im.core.api.b.b bVar) {
        l.d(bVar, "");
        this.f100274a = bVar;
    }

    @Override // f.a.t
    public final void a(z<? super a> zVar) {
        l.d(zVar, "");
        a aVar = new a(this.f100274a, zVar);
        zVar.onSubscribe(aVar);
        this.f100274a.a(aVar);
    }
}
