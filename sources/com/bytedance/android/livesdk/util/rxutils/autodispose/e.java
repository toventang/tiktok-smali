package com.bytedance.android.livesdk.util.rxutils.autodispose;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.util.rxutils.autodispose.a.c;
import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ah;
import f.a.b;
import f.a.e.e.a.d;
import f.a.e.e.b.l;
import f.a.f;
import f.a.h;
import f.a.h.a;
import f.a.t;

public final class e {
    static {
        Covode.recordClassIndex(13062);
    }

    public static <T> m<T> a(View view) {
        if (view == null) {
            return a(i.f22161a);
        }
        return a(c.a(view));
    }

    static final /* synthetic */ f b(ab abVar) {
        try {
            return abVar.c();
        } catch (aa e2) {
            f.a.d.f<? super aa> fVar = q.f22168a;
            if (fVar == null) {
                return b.a(e2);
            }
            fVar.accept(e2);
            return a.a(d.f157241a);
        }
    }

    static final /* synthetic */ f c(ab abVar) {
        try {
            return abVar.c();
        } catch (aa e2) {
            f.a.d.f<? super aa> fVar = q.f22168a;
            if (fVar == null) {
                return b.a(e2);
            }
            fVar.accept(e2);
            return a.a(d.f157241a);
        }
    }

    public static <T> m<T> a(Fragment fragment) {
        if (fragment == null) {
            return a(g.f22159a);
        }
        return a(a.a(fragment, i.a.ON_DESTROY));
    }

    public static <T> m<T> a(m mVar) {
        if (mVar == null) {
            return a(h.f22160a);
        }
        return a(a.a(mVar, i.a.ON_DESTROY));
    }

    public static <T> m<T> a(ab abVar) {
        s.a(abVar, "provider == null");
        return a(b.a(new j(abVar)), (com.bytedance.android.livesdk.util.rxutils.e) null);
    }

    private static <T> m<T> a(final f fVar, final com.bytedance.android.livesdk.util.rxutils.e<T> eVar) {
        s.a(fVar, "scope == null");
        return new m<T>() {
            /* class com.bytedance.android.livesdk.util.rxutils.autodispose.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13063);
            }

            @Override // f.a.ac
            public final /* synthetic */ Object a(final ab abVar) {
                com.bytedance.android.livesdk.util.rxutils.e eVar = eVar;
                if (eVar != null) {
                    abVar = abVar.a((ah) eVar);
                }
                return new ac<T>() {
                    /* class com.bytedance.android.livesdk.util.rxutils.autodispose.e.AnonymousClass1.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(13066);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.ac
                    public final f.a.b.b a() {
                        return new r(abVar, fVar).c();
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.ac
                    public final f.a.b.b a(f.a.d.f<? super T> fVar) {
                        return new r(abVar, fVar).d(fVar);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.ac
                    public final void a(ae<? super T> aeVar) {
                        new r(abVar, fVar).a_(aeVar);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.ac
                    public final f.a.b.b a(f.a.d.f<? super T> fVar, f.a.d.f<? super Throwable> fVar2) {
                        return new r(abVar, fVar).a(fVar, fVar2);
                    }
                };
            }

            @Override // f.a.u
            public final /* synthetic */ Object a(final t tVar) {
                com.bytedance.android.livesdk.util.rxutils.e eVar = eVar;
                if (eVar != null) {
                    tVar = tVar.a(eVar);
                }
                return new z<T>() {
                    /* class com.bytedance.android.livesdk.util.rxutils.autodispose.e.AnonymousClass1.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(13065);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.z
                    public final f.a.b.b a() {
                        return new p(tVar, fVar).g();
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.z
                    public final f.a.b.b a(f.a.d.f<? super T> fVar) {
                        return new p(tVar, fVar).d(fVar);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.z
                    public final f.a.b.b a(f.a.d.f<? super T> fVar, f.a.d.f<? super Throwable> fVar2) {
                        return new p(tVar, fVar).a(fVar, fVar2);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.z
                    public final f.a.b.b a(f.a.d.f<? super T> fVar, f.a.d.f<? super Throwable> fVar2, f.a.d.a aVar) {
                        return new p(tVar, fVar).a(fVar, fVar2, aVar);
                    }
                };
            }

            @Override // f.a.i
            public final /* synthetic */ Object a(final h hVar) {
                com.bytedance.android.livesdk.util.rxutils.e eVar = eVar;
                if (eVar != null) {
                    org.a.b a2 = ((f.a.m) f.a.e.b.b.a((Object) eVar, "composer is null")).a(hVar);
                    if (a2 instanceof h) {
                        hVar = a.a((h) a2);
                    } else {
                        f.a.e.b.b.a((Object) a2, "publisher is null");
                        hVar = a.a(new l(a2));
                    }
                }
                return new y<T>() {
                    /* class com.bytedance.android.livesdk.util.rxutils.autodispose.e.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(13064);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.y
                    public final f.a.b.b a(f.a.d.f<? super T> fVar) {
                        return new o(hVar, fVar).b(fVar);
                    }
                };
            }
        };
    }

    public static <T> m<T> a(ab abVar, com.bytedance.android.livesdk.util.rxutils.e<T> eVar) {
        s.a(abVar, "provider == null");
        return a(b.a(new k(abVar)), eVar);
    }
}
