package androidx.h;

import androidx.a.a.a.a;
import androidx.h.d;
import androidx.h.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class f<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public i.a f3106a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f3107b = a.f785c;

    /* renamed from: c  reason: collision with root package name */
    private Key f3108c;

    /* renamed from: d  reason: collision with root package name */
    private i.d f3109d;

    /* renamed from: e  reason: collision with root package name */
    private d.a<Key, Value> f3110e;

    static {
        Covode.recordClassIndex(1113);
    }

    public final LiveData<i<Value>> a() {
        final Key key = this.f3108c;
        final i.d dVar = this.f3109d;
        final i.a aVar = this.f3106a;
        final d.a<Key, Value> aVar2 = this.f3110e;
        final Executor executor = a.f784b;
        final Executor executor2 = this.f3107b;
        return new b<i<Value>>(executor2) {
            /* class androidx.h.f.AnonymousClass1 */

            /* renamed from: m  reason: collision with root package name */
            private i<Value> f3117m;
            private d<Key, Value> n;
            private final d.b o = new d.b() {
                /* class androidx.h.f.AnonymousClass1.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1115);
                }

                @Override // androidx.h.d.b
                public final void a() {
                    AnonymousClass1 r0 = AnonymousClass1.this;
                    a a2 = a.a();
                    Runnable runnable = r0.f3518f;
                    if (a2.b()) {
                        runnable.run();
                    } else {
                        a2.b(runnable);
                    }
                }
            };

            static {
                Covode.recordClassIndex(1114);
            }

            @Override // androidx.lifecycle.b
            public final /* synthetic */ Object a() {
                i<Value> a2;
                Key key = (Key) key;
                i<Value> iVar = this.f3117m;
                if (iVar != null) {
                    key = (Key) iVar.c();
                }
                do {
                    d<Key, Value> dVar = this.n;
                    if (dVar != null) {
                        dVar.b(this.o);
                    }
                    d<Key, Value> a3 = aVar2.a();
                    this.n = a3;
                    a3.a(this.o);
                    i.b bVar = new i.b(this.n, dVar);
                    bVar.f3157a = executor;
                    bVar.f3158b = executor2;
                    bVar.f3159c = aVar;
                    bVar.f3160d = key;
                    a2 = bVar.a();
                    this.f3117m = a2;
                } while (a2.f());
                return this.f3117m;
            }
        }.f3514b;
    }

    public f(d.a<Key, Value> aVar, i.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PagedList.Config must be provided");
        } else if (aVar != null) {
            this.f3110e = aVar;
            this.f3109d = dVar;
        } else {
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        }
    }
}
