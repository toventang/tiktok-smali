package com.ss.android.ugc.aweme.commercialize.egg.impl.e;

import android.net.Uri;
import android.text.TextUtils;
import b.i;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f.c;
import com.airbnb.lottie.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.commercialize.egg.a;
import com.ss.android.ugc.aweme.commercialize.g.b;
import h.z;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74025a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45586);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.e.a$a  reason: collision with other inner class name */
    public static final class CallableC1670a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.egg.d.a f74026a;

        static {
            Covode.recordClassIndex(45587);
        }

        CallableC1670a(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar) {
            this.f74026a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (TextUtils.isEmpty(this.f74026a.f73933a)) {
                this.f74026a.f73942j.set(false);
                a.a(this.f74026a, false);
            } else if (com.ss.android.ugc.aweme.commercialize.g.b.a(Uri.parse(this.f74026a.f73933a))) {
                this.f74026a.f73942j.set(true);
                a.a(this.f74026a, true);
            } else {
                com.ss.android.ugc.aweme.commercialize.g.b.a(this.f74026a.f73933a, new b.a(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.egg.impl.e.a.CallableC1670a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ CallableC1670a f74027a;

                    static {
                        Covode.recordClassIndex(45588);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.g.b.a
                    public final void a() {
                        this.f74027a.f74026a.f73942j.set(true);
                        a.a(this.f74027a.f74026a, true);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.g.b.a
                    public final void b() {
                        this.f74027a.f74026a.f73942j.set(false);
                        a.a(this.f74027a.f74026a, false);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f74027a = r1;
                    }
                });
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.egg.d.a f74028a;

        static {
            Covode.recordClassIndex(45589);
        }

        b(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar) {
            this.f74028a = aVar;
        }

        public final void run() {
            try {
                com.ss.android.ugc.aweme.framework.a.a.b(3, null, "CommerceLikeLayout:setCommerceDigg url = " + this.f74028a.f73933a);
                final l<e> a2 = new c(d.a(), this.f74028a.f73933a).a();
                h.f.b.l.b(a2, "");
                if (a2.f5749b != null || a2.f5748a == null) {
                    com.ss.android.b.a.a.a.b(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.commercialize.egg.impl.e.a.b.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f74031a;

                        static {
                            Covode.recordClassIndex(45591);
                        }

                        {
                            this.f74031a = r1;
                        }

                        public final void run() {
                            this.f74031a.f74028a.f73942j.set(false);
                            a.a(this.f74031a.f74028a, false);
                        }
                    });
                } else {
                    com.ss.android.b.a.a.a.b(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.commercialize.egg.impl.e.a.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f74029a;

                        static {
                            Covode.recordClassIndex(45590);
                        }

                        {
                            this.f74029a = r1;
                        }

                        public final void run() {
                            this.f74029a.f74028a.f73942j.set(true);
                            com.ss.android.ugc.aweme.commercialize.egg.d.a aVar = this.f74029a.f74028a;
                            l lVar = a2;
                            h.f.b.l.b(lVar, "");
                            aVar.f73943k = new com.ss.android.ugc.aweme.commercialize.egg.d.c(lVar.f5748a);
                            a.a(this.f74029a.f74028a, true);
                        }
                    });
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                e2.printStackTrace();
                a.a(this.f74028a, false);
            }
        }
    }

    private static void b(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar) {
        i.b(new CallableC1670a(aVar), i.f4824a);
    }

    private static void c(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar) {
        com.ss.android.b.a.a.a.a(new b(aVar));
    }

    public static void a(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar) {
        com.ss.android.ugc.aweme.commercialize.egg.impl.d.a.a(aVar);
        if (aVar == null) {
            return;
        }
        if (h.f.b.l.a((Object) aVar.f73934b, (Object) a.C1661a.f73923a)) {
            c(aVar);
        } else {
            b(aVar);
        }
    }

    static void a(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar, boolean z) {
        if (!com.ss.android.ugc.aweme.commercialize.egg.impl.d.a.a() && aVar != null) {
            com.ss.android.ugc.aweme.commercialize.egg.impl.d.a.a("preload_result", aVar.f73944l, !z ? 1 : 0, 8);
            com.ss.android.ugc.aweme.commercialize.egg.impl.d.a.a("aweme_ad_egg_preload_error_rate", aVar, z);
        }
    }
}
