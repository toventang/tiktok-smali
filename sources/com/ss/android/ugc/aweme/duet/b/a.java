package com.ss.android.ugc.aweme.duet.b;

import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.duet.api.API;
import com.ss.android.ugc.aweme.duet.ui.h;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a extends c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.duet.a.c>, h> {

    /* renamed from: a  reason: collision with root package name */
    public static final C2007a f84131a = new C2007a((byte) 0);

    static {
        Covode.recordClassIndex(52446);
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.b.a$a  reason: collision with other inner class name */
    public static final class C2007a {
        static {
            Covode.recordClassIndex(52448);
        }

        private C2007a() {
        }

        public /* synthetic */ C2007a(byte b2) {
            this();
        }
    }

    public a() {
        a(new com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.duet.a.c>(this) {
            /* class com.ss.android.ugc.aweme.duet.b.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f84132a;

            static {
                Covode.recordClassIndex(52447);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                l.d(objArr, "");
                return true;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f84132a = r1;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                l.d(objArr, "");
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                WeakHandler weakHandler = this.mHandler;
                l.b(weakHandler, "");
                Object obj = objArr[0];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                if (!in.d()) {
                    n.f68155a.a(weakHandler, new b(str), 0);
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
            ((h) this.f76397i).a((com.ss.android.ugc.aweme.duet.a.c) t);
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f84133a;

        static {
            Covode.recordClassIndex(52449);
        }

        b(String str) {
            this.f84133a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str = this.f84133a;
            l.d(str, "");
            String str2 = Api.f66569d;
            l.b(str2, "");
            com.ss.android.ugc.aweme.duet.a.c cVar = ((API) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str2).a(API.class)).getDuetDetailModel(str).get();
            l.b(cVar, "");
            return cVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        l.d(exc, "");
        if (this.f76397i != null) {
            ((h) this.f76397i).a(exc);
        }
    }
}
