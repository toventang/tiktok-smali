package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* access modifiers changed from: package-private */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater f159063a = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");

    /* renamed from: b  reason: collision with root package name */
    public final av<T>[] f159064b;
    volatile int notCompletedCount;

    static {
        Covode.recordClassIndex(105584);
    }

    /* access modifiers changed from: package-private */
    public final class a extends ce<bz> {
        public volatile Object _disposer;

        /* renamed from: a  reason: collision with root package name */
        public bh f159065a;

        /* renamed from: f  reason: collision with root package name */
        private final m<List<? extends T>> f159067f;

        static {
            Covode.recordClassIndex(105585);
        }

        public final bh a() {
            bh bhVar = this.f159065a;
            if (bhVar == null) {
                l.a("handle");
            }
            return bhVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            a(th);
            return z.f158842a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.concurrent.atomic.AtomicIntegerFieldUpdater */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.ad
        public final void a(Throwable th) {
            if (th != null) {
                Object a2 = this.f159067f.a(th);
                if (a2 != null) {
                    this.f159067f.b(a2);
                    b bVar = (b) this._disposer;
                    if (bVar != null) {
                        bVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (c.f159063a.decrementAndGet(c.this) == 0) {
                m<List<? extends T>> mVar = this.f159067f;
                av<T>[] avVarArr = c.this.f159064b;
                ArrayList arrayList = new ArrayList(avVarArr.length);
                for (av<T> avVar : avVarArr) {
                    arrayList.add(avVar.c());
                }
                mVar.resumeWith(q.m223constructorimpl(arrayList));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.m<? super java.util.List<? extends T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m<? super List<? extends T>> mVar, bz bzVar) {
            super(bzVar);
            this.f159067f = mVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final class b extends k {

        /* renamed from: b  reason: collision with root package name */
        private final c<T>.a[] f159074b;

        static {
            Covode.recordClassIndex(105586);
        }

        public final void a() {
            for (c<T>.a aVar : this.f159074b) {
                aVar.a().cJ_();
            }
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f159074b + ']';
        }

        @Override // kotlinx.coroutines.l
        public final void a(Throwable th) {
            a();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            a();
            return z.f158842a;
        }

        public b(c<T>.a[] aVarArr) {
            this.f159074b = aVarArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.av<? extends T>[] */
    /* JADX WARN: Multi-variable type inference failed */
    public c(av<? extends T>[] avVarArr) {
        this.f159064b = avVarArr;
        this.notCompletedCount = avVarArr.length;
    }
}
