package com.ss.android.ugc.aweme.livewallpaper.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f108875a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f108876b = i.a((h.f.a.a) a.f108878a);

    public static a[] a() {
        return (a[]) f108876b.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<a[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108878a = new a();

        static {
            Covode.recordClassIndex(69726);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a[] invoke() {
            return new a[]{new com.ss.android.ugc.aweme.livewallpaper.d.a.b(), new com.ss.android.ugc.aweme.livewallpaper.d.a.a()};
        }
    }

    static {
        Covode.recordClassIndex(69723);
        ColdLaunchRequestCombinerImpl.b().a(new com.ss.android.ugc.aweme.requestcombine.a() {
            /* class com.ss.android.ugc.aweme.livewallpaper.d.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69724);
            }

            @Override // com.ss.android.ugc.aweme.requestcombine.a
            public final void a(Throwable th) {
                l.d(th, "");
            }

            /* renamed from: com.ss.android.ugc.aweme.livewallpaper.d.b$1$a */
            static final class a<V> implements Callable {

                /* renamed from: a  reason: collision with root package name */
                public static final a f108877a = new a();

                static {
                    Covode.recordClassIndex(69725);
                }

                a() {
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    c.a();
                    return z.f158842a;
                }
            }

            @Override // com.ss.android.ugc.aweme.requestcombine.a
            public final void a() {
                b.i.b(a.f108877a, b.i.f4824a);
            }
        });
    }
}
