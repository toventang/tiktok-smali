package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import f.a.o;
import f.a.q;
import h.f.b.l;
import java.util.Map;

final /* synthetic */ class ad {
    static {
        Covode.recordClassIndex(63924);
    }

    public static final class a<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f100271b;

        static {
            Covode.recordClassIndex(63925);
        }

        public a(b bVar, Map map) {
            this.f100270a = bVar;
            this.f100271b = map;
        }

        @Override // f.a.q
        public final void a(final o<h> oVar) {
            l.d(oVar, "");
            this.f100270a.b(this.f100271b, new com.bytedance.im.core.a.a.b<h>() {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.data.d.ad.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(63926);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* bridge */ /* synthetic */ void a(h hVar) {
                    if (hVar == null) {
                        oVar.a();
                    } else {
                        oVar.a(hVar);
                    }
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    Throwable th;
                    o oVar = oVar;
                    if (uVar == null || (th = uVar.f38030h) == null) {
                        th = new RuntimeException("updateLocalExt() failed with no errors");
                    }
                    oVar.b(th);
                }
            });
        }
    }
}
