package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import f.a.ad;
import f.a.af;
import h.f.b.l;
import java.util.concurrent.Callable;

final /* synthetic */ class ac {
    static {
        Covode.recordClassIndex(63919);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.im.core.api.b.a f100263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100264b;

        static {
            Covode.recordClassIndex(63920);
        }

        public a(com.bytedance.ies.im.core.api.b.a aVar, String str) {
            this.f100263a = aVar;
            this.f100264b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f100263a.a(this.f100264b);
        }
    }

    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.im.core.api.b.a f100265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100266b;

        static {
            Covode.recordClassIndex(63921);
        }

        public b(com.bytedance.ies.im.core.api.b.a aVar, String str) {
            this.f100265a = aVar;
            this.f100266b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f100265a.b(this.f100266b);
        }
    }

    public static final class c<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.im.core.api.b.a f100267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100268b;

        static {
            Covode.recordClassIndex(63922);
        }

        public c(com.bytedance.ies.im.core.api.b.a aVar, String str) {
            this.f100267a = aVar;
            this.f100268b = str;
        }

        @Override // f.a.af
        public final void subscribe(final ad<h> adVar) {
            l.d(adVar, "");
            long c2 = b.a.c(this.f100268b);
            if (c2 > 0) {
                this.f100267a.b(String.valueOf(c2), new com.bytedance.im.core.a.a.b<h>() {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.data.d.ac.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(63923);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.a.a.b
                    public final /* synthetic */ void a(h hVar) {
                        l.d(hVar, "");
                        adVar.a(hVar);
                    }

                    @Override // com.bytedance.im.core.a.a.b
                    public final void a(u uVar) {
                        Throwable th;
                        ad adVar = adVar;
                        if (uVar == null || (th = uVar.f38030h) == null) {
                            th = new RuntimeException("createSingleConversation() failed with no errors");
                        }
                        adVar.b(th);
                    }
                });
            } else {
                adVar.b(new IllegalArgumentException("createSingleConversation() uid invalid: uid = ".concat(String.valueOf(c2))));
            }
        }
    }
}
