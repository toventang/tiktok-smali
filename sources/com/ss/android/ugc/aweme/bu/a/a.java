package com.ss.android.ugc.aweme.bu.a;

import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.mvtemplate.a.d;
import com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import h.f.b.l;
import h.f.b.m;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<d>, com.ss.android.ugc.aweme.mvtemplate.view.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final C1554a f68808a = new C1554a((byte) 0);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class c implements Callable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f68810a;

        static {
            Covode.recordClassIndex(42385);
        }

        c(h.f.a.a aVar) {
            this.f68810a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f68810a.invoke();
        }
    }

    static {
        Covode.recordClassIndex(42381);
    }

    /* renamed from: com.ss.android.ugc.aweme.bu.a.a$a  reason: collision with other inner class name */
    public static final class C1554a {
        static {
            Covode.recordClassIndex(42383);
        }

        private C1554a() {
        }

        public /* synthetic */ C1554a(byte b2) {
            this();
        }
    }

    public a() {
        a(new com.ss.android.ugc.aweme.common.b<d>(this) {
            /* class com.ss.android.ugc.aweme.bu.a.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f68809a;

            static {
                Covode.recordClassIndex(42382);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                l.d(objArr, "");
                return true;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f68809a = r1;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                l.d(objArr, "");
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                if (objArr.length >= 6) {
                    WeakHandler weakHandler = this.mHandler;
                    l.b(weakHandler, "");
                    Object obj = objArr[1];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = objArr[2];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    ((Integer) obj2).intValue();
                    a.a(weakHandler, (String) obj);
                } else {
                    WeakHandler weakHandler2 = this.mHandler;
                    l.b(weakHandler2, "");
                    Object obj3 = objArr[1];
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    Object obj4 = objArr[2];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    ((Integer) obj4).intValue();
                    a.a(weakHandler2, (String) obj3);
                }
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76397i != null && this.f76396h != null) {
            com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
            l.b(bVar, "");
            T t = bVar.mData;
            l.b(t, "");
            ((com.ss.android.ugc.aweme.mvtemplate.view.a) this.f76397i).a((d) t);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<d> {
        final /* synthetic */ String $mvId;

        static {
            Covode.recordClassIndex(42384);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.$mvId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            String str = this.$mvId;
            l.d(str, "");
            String str2 = MovieDetailAPi.f112159e;
            l.b(str2, "");
            d dVar = ((MovieDetailAPi.MvDetail) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str2).a(MovieDetailAPi.MvDetail.class)).getMvDetail(str).get();
            l.b(dVar, "");
            return dVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        l.d(exc, "");
        if (this.f76397i != null) {
            ((com.ss.android.ugc.aweme.mvtemplate.view.a) this.f76397i).a(exc);
        }
    }

    public static void a(Handler handler, String str) {
        n.f68155a.a(handler, new c(new b(str)), 0);
    }
}
