package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.b.a.e;
import h.c.d;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.u;

public class JobSupport implements cm, u {

    /* renamed from: d  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f158935d = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    public volatile Object _parentHandle;
    private volatile Object _state;

    static {
        Covode.recordClassIndex(105464);
    }

    /* access modifiers changed from: protected */
    public void a_(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void c(Object obj) {
    }

    public boolean cH_() {
        return false;
    }

    public boolean cI_() {
        return true;
    }

    public void e() {
    }

    /* access modifiers changed from: protected */
    public boolean e(Throwable th) {
        return false;
    }

    public String g() {
        return "Job was cancelled";
    }

    /* access modifiers changed from: protected */
    public boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class Finishing implements bu {
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        private final cj list;

        static {
            Covode.recordClassIndex(105465);
        }

        private final Object getExceptionsHolder() {
            return this._exceptionsHolder;
        }

        @Override // kotlinx.coroutines.bu
        public final cj getList() {
            return this.list;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean isCompleting() {
            /*
                r1 = this;
                int r0 = r1._isCompleting
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.Finishing.isCompleting():boolean");
        }

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList<>(4);
        }

        public final Throwable getRootCause() {
            return (Throwable) this._rootCause;
        }

        @Override // kotlinx.coroutines.bu
        public final boolean isActive() {
            if (getRootCause() == null) {
                return true;
            }
            return false;
        }

        public final boolean isCancelling() {
            if (getRootCause() != null) {
                return true;
            }
            return false;
        }

        public final boolean isSealed() {
            if (getExceptionsHolder() == cf.f159089e) {
                return true;
            }
            return false;
        }

        public final String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + ']';
        }

        private final void setExceptionsHolder(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void setCompleting(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void setRootCause(Throwable th) {
            this._rootCause = th;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.ArrayList<java.lang.Throwable> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
            } else if (th != rootCause) {
                Object exceptionsHolder = getExceptionsHolder();
                if (exceptionsHolder == null) {
                    setExceptionsHolder(th);
                } else if (exceptionsHolder instanceof Throwable) {
                    if (th != exceptionsHolder) {
                        ArrayList<Throwable> allocateList = allocateList();
                        allocateList.add(exceptionsHolder);
                        allocateList.add(th);
                        setExceptionsHolder(allocateList);
                    }
                } else if (exceptionsHolder instanceof ArrayList) {
                    ((ArrayList) exceptionsHolder).add(th);
                } else {
                    throw new IllegalStateException("State is ".concat(String.valueOf(exceptionsHolder)).toString());
                }
            }
        }

        public final List<Throwable> sealLocked(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                arrayList = allocateList();
                arrayList.add(exceptionsHolder);
            } else if (exceptionsHolder instanceof ArrayList) {
                arrayList = (ArrayList) exceptionsHolder;
            } else {
                throw new IllegalStateException("State is ".concat(String.valueOf(exceptionsHolder)).toString());
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayList.add(0, rootCause);
            }
            if (th != null && (!l.a(th, rootCause))) {
                arrayList.add(th);
            }
            setExceptionsHolder(cf.f159089e);
            return arrayList;
        }

        public Finishing(cj cjVar, boolean z, Throwable th) {
            this.list = cjVar;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }
    }

    @Override // h.c.f.b
    public final f.c<?> getKey() {
        return bz.f159061c;
    }

    private static void a(Throwable th, List<? extends Throwable> list) {
        Throwable a2;
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            if (!ar.f159023c) {
                a2 = th;
            } else {
                a2 = u.a(th);
            }
            for (Throwable th2 : list) {
                if (ar.f159023c) {
                    th2 = u.a(th2);
                }
                if (th2 != th && th2 != a2 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    h.a.a(th, th2);
                }
            }
        }
    }

    private final void a(ce<?> ceVar) {
        ceVar.a(new cj());
        f158935d.compareAndSet(this, ceVar, k.a(ceVar.g()));
    }

    @Override // kotlinx.coroutines.bz
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ca(g(), null, this);
        }
        b((Throwable) cancellationException);
    }

    @Override // kotlinx.coroutines.bz
    public final s a(u uVar) {
        bh a2 = bz.a.a(this, true, false, new t(this, uVar), 2);
        if (a2 != null) {
            return (s) a2;
        }
        throw new w("null cannot be cast to non-null type");
    }

    private final void a(cj cjVar, Throwable th) {
        Object g2 = cjVar.g();
        if (g2 != null) {
            ae aeVar = null;
            for (kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) g2; !l.a(lVar, cjVar); lVar = lVar.h()) {
                if (lVar instanceof cb) {
                    ad adVar = (ad) lVar;
                    try {
                        adVar.a(th);
                    } catch (Throwable th2) {
                        if (aeVar != null) {
                            h.a.a(aeVar, th2);
                        } else {
                            aeVar = new ae("Exception in completion handler " + adVar + " for " + this, th2);
                        }
                    }
                }
            }
            if (aeVar != null) {
                a_((Throwable) aeVar);
            }
            f(th);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [kotlinx.coroutines.bt] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // kotlinx.coroutines.bz
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.bh a(boolean r8, boolean r9, h.f.a.b<? super java.lang.Throwable, h.z> r10) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.a(boolean, boolean, h.f.a.b):kotlinx.coroutines.bh");
    }

    private final boolean a(Object obj, cj cjVar, ce<?> ceVar) {
        int a2;
        c cVar = new c(ceVar, ceVar, this, obj);
        do {
            a2 = cjVar.i().a(ceVar, cjVar, cVar);
            if (a2 == 1) {
                return true;
            }
        } while (a2 != 2);
        return false;
    }

    public final void a(bz bzVar) {
        if (ar.f159021a && this._parentHandle != null) {
            throw new AssertionError();
        } else if (bzVar == null) {
            this._parentHandle = ck.f159094a;
        } else {
            bzVar.n();
            s a2 = bzVar.a(this);
            this._parentHandle = a2;
            if (k()) {
                a2.cJ_();
                this._parentHandle = ck.f159094a;
            }
        }
    }

    private final boolean a(bu buVar, Object obj) {
        if (ar.f159021a && !(buVar instanceof bk) && !(buVar instanceof ce)) {
            throw new AssertionError();
        } else if (ar.f159021a && !(!(obj instanceof CompletedExceptionally))) {
            throw new AssertionError();
        } else if (!f158935d.compareAndSet(this, buVar, cf.a(obj))) {
            return false;
        } else {
            a_(obj);
            b(buVar, obj);
            return true;
        }
    }

    public final void a(Finishing finishing, t tVar, Object obj) {
        if (!ar.f159021a || p() == finishing) {
            t a2 = a((kotlinx.coroutines.internal.l) tVar);
            if (a2 == null || !b(finishing, a2, obj)) {
                c(a(finishing, obj));
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.bz
    public /* synthetic */ void o() {
        a((CancellationException) null);
    }

    public static final class c extends l.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.l f158941a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JobSupport f158942b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f158943c;

        static {
            Covode.recordClassIndex(105468);
        }

        @Override // kotlinx.coroutines.internal.c
        public final /* synthetic */ Object a() {
            if (this.f158942b.p() == this.f158943c) {
                return null;
            }
            return k.f159131a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.internal.l lVar, kotlinx.coroutines.internal.l lVar2, JobSupport jobSupport, Object obj) {
            super(lVar2);
            this.f158941a = lVar;
            this.f158942b = jobSupport;
            this.f158943c = obj;
        }
    }

    public String h() {
        return getClass().getSimpleName();
    }

    @Override // kotlinx.coroutines.bz
    public final boolean k() {
        if (!(p() instanceof bu)) {
            return true;
        }
        return false;
    }

    public final Object p() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    @Override // kotlinx.coroutines.bz
    public final boolean l() {
        Object p = p();
        if (p instanceof CompletedExceptionally) {
            return true;
        }
        if (!(p instanceof Finishing) || !((Finishing) p).isCancelling()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.bz
    public final boolean n() {
        int b2;
        do {
            b2 = b(p());
            if (b2 == 0) {
                return false;
            }
        } while (b2 != 1);
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends ce<bz> {

        /* renamed from: a  reason: collision with root package name */
        private final JobSupport f158937a;

        /* renamed from: b  reason: collision with root package name */
        private final Finishing f158938b;

        /* renamed from: f  reason: collision with root package name */
        private final t f158939f;

        /* renamed from: g  reason: collision with root package name */
        private final Object f158940g;

        static {
            Covode.recordClassIndex(105467);
        }

        @Override // kotlinx.coroutines.internal.l
        public final String toString() {
            return "ChildCompletion[" + this.f158939f + ", " + this.f158940g + ']';
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            a(th);
            return z.f158842a;
        }

        @Override // kotlinx.coroutines.ad
        public final void a(Throwable th) {
            this.f158937a.a(this.f158938b, this.f158939f, this.f158940g);
        }

        public b(JobSupport jobSupport, Finishing finishing, t tVar, Object obj) {
            super(tVar.f159216a);
            this.f158937a = jobSupport;
            this.f158938b = finishing;
            this.f158939f = tVar;
            this.f158940g = obj;
        }
    }

    public final Object r() {
        Object p = p();
        if (!(!(p instanceof bu))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(p instanceof CompletedExceptionally)) {
            return cf.b(p);
        } else {
            throw ((CompletedExceptionally) p).cause;
        }
    }

    @Override // kotlinx.coroutines.cm
    public final CancellationException q() {
        Throwable th;
        Object p = p();
        CancellationException cancellationException = null;
        if (p instanceof Finishing) {
            th = ((Finishing) p).getRootCause();
        } else if (p instanceof CompletedExceptionally) {
            th = ((CompletedExceptionally) p).cause;
        } else if (!(p instanceof bu)) {
            th = null;
        } else {
            throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(p)).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 == null) {
            return new ca("Parent job is " + j(p), th, this);
        }
        return cancellationException2;
    }

    public String toString() {
        return (h() + '{' + j(p()) + '}') + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    @Override // kotlinx.coroutines.bz
    public final CancellationException m() {
        CancellationException a2;
        Object p = p();
        if (p instanceof Finishing) {
            Throwable rootCause = ((Finishing) p).getRootCause();
            if (rootCause != null && (a2 = a(rootCause, getClass().getSimpleName() + " is cancelling")) != null) {
                return a2;
            }
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        } else if (p instanceof bu) {
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        } else if (p instanceof CompletedExceptionally) {
            return a(((CompletedExceptionally) p).cause, (String) null);
        } else {
            return new ca(getClass().getSimpleName() + " has completed normally", null, this);
        }
    }

    @Override // kotlinx.coroutines.bz
    public boolean b() {
        Object p = p();
        if (!(p instanceof bu) || !((bu) p).isActive()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.u
    public final void a(cm cmVar) {
        f(cmVar);
    }

    public void b(Throwable th) {
        f((Object) th);
    }

    public final boolean d(Throwable th) {
        return f((Object) th);
    }

    @Override // h.c.f.b, h.c.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // h.c.f
    public f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // h.c.f
    public f plus(f fVar) {
        return f.b.a.a(this, fVar);
    }

    public void a_(Throwable th) {
        throw th;
    }

    public JobSupport(boolean z) {
        bk bkVar;
        if (z) {
            bkVar = cf.f159091g;
        } else {
            bkVar = cf.f159090f;
        }
        this._state = bkVar;
        this._parentHandle = null;
    }

    @Override // kotlinx.coroutines.bz
    public final bh a(h.f.a.b<? super Throwable, z> bVar) {
        return a(false, true, bVar);
    }

    private final boolean f(Throwable th) {
        if (i()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        s sVar = (s) this._parentHandle;
        if (sVar == null || sVar == ck.f159094a) {
            return z;
        }
        if (sVar.b(th) || z) {
            return true;
        }
        return false;
    }

    public boolean c(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!f((Object) th) || !cI_()) {
            return false;
        }
        return true;
    }

    public final boolean d(Object obj) {
        Object a2;
        do {
            a2 = a(p(), obj);
            if (a2 == cf.f159085a) {
                return false;
            }
            if (a2 == cf.f159086b) {
                return true;
            }
        } while (a2 == cf.f159087c);
        c(a2);
        return true;
    }

    static final class a<T> extends n<T> {

        /* renamed from: b  reason: collision with root package name */
        private final JobSupport f158936b;

        static {
            Covode.recordClassIndex(105466);
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.n
        public final String h() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.n
        public final Throwable a(bz bzVar) {
            Throwable rootCause;
            Object p = this.f158936b.p();
            if ((p instanceof Finishing) && (rootCause = ((Finishing) p).getRootCause()) != null) {
                return rootCause;
            }
            if (p instanceof CompletedExceptionally) {
                return ((CompletedExceptionally) p).cause;
            }
            return bzVar.m();
        }

        public a(d<? super T> dVar, JobSupport jobSupport) {
            super(dVar, 1);
            this.f158936b = jobSupport;
        }
    }

    private final int b(Object obj) {
        if (obj instanceof bk) {
            if (((bk) obj).isActive()) {
                return 0;
            }
            if (!f158935d.compareAndSet(this, obj, cf.f159091g)) {
                return -1;
            }
            e();
            return 1;
        } else if (!(obj instanceof bt)) {
            return 0;
        } else {
            if (!f158935d.compareAndSet(this, obj, ((bt) obj).getList())) {
                return -1;
            }
            e();
            return 1;
        }
    }

    private boolean f(Object obj) {
        Object obj2 = cf.f159085a;
        if (cH_() && (obj2 = g(obj)) == cf.f159086b) {
            return true;
        }
        if (obj2 == cf.f159085a) {
            obj2 = i(obj);
        }
        if (obj2 == cf.f159085a || obj2 == cf.f159086b) {
            return true;
        }
        if (obj2 == cf.f159088d) {
            return false;
        }
        c(obj2);
        return true;
    }

    private final Object g(Object obj) {
        Object a2;
        do {
            Object p = p();
            if (!(p instanceof bu) || ((p instanceof Finishing) && ((Finishing) p).isCompleting())) {
                return cf.f159085a;
            }
            a2 = a(p, new CompletedExceptionally(h(obj), false, 2, null));
        } while (a2 == cf.f159087c);
        return a2;
    }

    private final Throwable h(Object obj) {
        if (obj != null) {
            if (obj instanceof Throwable) {
                if (obj != null) {
                    return (Throwable) obj;
                }
            } else if (obj != null) {
                return ((cm) obj).q();
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        return new ca(g(), null, this);
    }

    private static String j(Object obj) {
        if (obj instanceof Finishing) {
            Finishing finishing = (Finishing) obj;
            if (finishing.isCancelling()) {
                return "Cancelling";
            }
            if (finishing.isCompleting()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof bu) {
            if (((bu) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof CompletedExceptionally) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public final Object e(Object obj) {
        Object a2;
        do {
            a2 = a(p(), obj);
            if (a2 == cf.f159085a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (!(obj instanceof CompletedExceptionally)) {
                    obj = null;
                }
                CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                if (completedExceptionally != null) {
                    th = completedExceptionally.cause;
                }
                throw new IllegalStateException(str, th);
            }
        } while (a2 == cf.f159087c);
        return a2;
    }

    public final Object c(d<Object> dVar) {
        Object p;
        do {
            p = p();
            if (!(p instanceof bu)) {
                if (!(p instanceof CompletedExceptionally)) {
                    return cf.b(p);
                }
                Throwable th = ((CompletedExceptionally) p).cause;
                if (!ar.f159023c) {
                    throw th;
                } else if (!(dVar instanceof e)) {
                    throw th;
                } else {
                    throw u.a(th, (e) dVar);
                }
            }
        } while (b(p) < 0);
        a aVar = new a(h.c.a.b.a(dVar), this);
        p.a(aVar, a(false, true, (h.f.a.b<? super Throwable, z>) new co(this, aVar)));
        Object e2 = aVar.e();
        if (e2 == h.c.a.a.COROUTINE_SUSPENDED) {
            h.f.b.l.d(dVar, "");
        }
        return e2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0096, code lost:
        if (r4 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        a(((kotlinx.coroutines.JobSupport.Finishing) r3).getList(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a3, code lost:
        return kotlinx.coroutines.cf.f159085a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x003d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0002 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object i(java.lang.Object r10) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.i(java.lang.Object):java.lang.Object");
    }

    @Override // kotlinx.coroutines.bz
    public final Object b(d<? super z> dVar) {
        Object p;
        do {
            p = p();
            if (!(p instanceof bu)) {
                de.a(dVar.getContext());
                return z.f158842a;
            }
        } while (b(p) < 0);
        n nVar = new n(h.c.a.b.a(dVar), 1);
        p.a(nVar, a(false, true, (h.f.a.b<? super Throwable, z>) new cp(this, nVar)));
        Object e2 = nVar.e();
        if (e2 == h.c.a.a.COROUTINE_SUSPENDED) {
            h.f.b.l.d(dVar, "");
        }
        if (e2 == h.c.a.a.COROUTINE_SUSPENDED) {
            return e2;
        }
        return z.f158842a;
    }

    private final cj a(bu buVar) {
        cj list = buVar.getList();
        if (list != null) {
            return list;
        }
        if (buVar instanceof bk) {
            return new cj();
        }
        if (buVar instanceof ce) {
            a((ce) buVar);
            return null;
        }
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(buVar)).toString());
    }

    private static t a(kotlinx.coroutines.internal.l lVar) {
        while (lVar.cM_()) {
            lVar = lVar.i();
        }
        while (true) {
            lVar = k.a(lVar.g());
            if (!lVar.cM_()) {
                if (lVar instanceof t) {
                    return (t) lVar;
                }
                if (lVar instanceof cj) {
                    return null;
                }
            }
        }
    }

    @Override // h.c.f
    public <R> R fold(R r, m<? super R, ? super f.b, ? extends R> mVar) {
        return (R) f.b.a.a(this, r, mVar);
    }

    /* access modifiers changed from: private */
    public CancellationException a(Throwable th, String str) {
        Throwable th2;
        if (!(th instanceof CancellationException)) {
            th2 = null;
        } else {
            th2 = th;
        }
        CancellationException cancellationException = (CancellationException) th2;
        if (cancellationException == null) {
            if (str == null) {
                str = g();
            }
            cancellationException = new ca(str, th, this);
        }
        return cancellationException;
    }

    private final Object a(Object obj, Object obj2) {
        if (!(obj instanceof bu)) {
            return cf.f159085a;
        }
        if ((!(obj instanceof bk) && !(obj instanceof ce)) || (obj instanceof t) || (obj2 instanceof CompletedExceptionally)) {
            return c((bu) obj, obj2);
        }
        if (a((bu) obj, obj2)) {
            return obj2;
        }
        return cf.f159087c;
    }

    private final Throwable a(Finishing finishing, List<? extends Throwable> list) {
        T t;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(t instanceof CancellationException)) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                return t3;
            }
            Throwable th = (Throwable) list.get(0);
            if (th instanceof cz) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        T next = it2.next();
                        if (next != th && (next instanceof cz)) {
                            t2 = next;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                T t4 = t2;
                if (t4 != null) {
                    return t4;
                }
            }
            return th;
        } else if (finishing.isCancelling()) {
            return new ca(g(), null, this);
        } else {
            return null;
        }
    }

    private final void b(bu buVar, Object obj) {
        s sVar = (s) this._parentHandle;
        if (sVar != null) {
            sVar.cJ_();
            this._parentHandle = ck.f159094a;
        }
        Throwable th = null;
        if (!(obj instanceof CompletedExceptionally)) {
            obj = null;
        }
        CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
        if (completedExceptionally != null) {
            th = completedExceptionally.cause;
        }
        if (buVar instanceof ce) {
            try {
                ((ce) buVar).a(th);
            } catch (Throwable th2) {
                a_((Throwable) new ae("Exception in completion handler " + buVar + " for " + this, th2));
            }
        } else {
            cj list = buVar.getList();
            if (list != null) {
                b(list, th);
            }
        }
    }

    private final Object a(Finishing finishing, Object obj) {
        Object obj2;
        Throwable th;
        Throwable a2;
        if (ar.f159021a && p() != finishing) {
            throw new AssertionError();
        } else if (ar.f159021a && !(!finishing.isSealed())) {
            throw new AssertionError();
        } else if (!ar.f159021a || finishing.isCompleting()) {
            if (!(obj instanceof CompletedExceptionally)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
            if (completedExceptionally != null) {
                th = completedExceptionally.cause;
            } else {
                th = null;
            }
            synchronized (finishing) {
                finishing.isCancelling();
                List<Throwable> sealLocked = finishing.sealLocked(th);
                a2 = a(finishing, (List<? extends Throwable>) sealLocked);
                if (a2 != null) {
                    a(a2, (List<? extends Throwable>) sealLocked);
                }
            }
            if (a2 != null) {
                if (a2 != th) {
                    obj = new CompletedExceptionally(a2, false, 2, null);
                }
                if (f(a2) || e(a2)) {
                    if (obj != null) {
                        ((CompletedExceptionally) obj).makeHandled();
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
            }
            a_(obj);
            boolean compareAndSet = f158935d.compareAndSet(this, finishing, cf.a(obj));
            if (!ar.f159021a || compareAndSet) {
                b(finishing, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    private final void b(cj cjVar, Throwable th) {
        Object g2 = cjVar.g();
        if (g2 != null) {
            ae aeVar = null;
            for (kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) g2; !h.f.b.l.a(lVar, cjVar); lVar = lVar.h()) {
                if (lVar instanceof ce) {
                    ad adVar = (ad) lVar;
                    try {
                        adVar.a(th);
                    } catch (Throwable th2) {
                        if (aeVar != null) {
                            h.a.a(aeVar, th2);
                        } else {
                            aeVar = new ae("Exception in completion handler " + adVar + " for " + this, th2);
                        }
                    }
                }
            }
            if (aeVar != null) {
                a_((Throwable) aeVar);
                return;
            }
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        if (r0 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0069, code lost:
        if ((r7 instanceof kotlinx.coroutines.t) != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006c, code lost:
        r0 = (kotlinx.coroutines.t) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006e, code lost:
        if (r0 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0070, code lost:
        r0 = r7.getList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0074, code lost:
        if (r0 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0076, code lost:
        r3 = a((kotlinx.coroutines.internal.l) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007a, code lost:
        if (r3 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0080, code lost:
        if (b(r2, r3, r8) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0084, code lost:
        return kotlinx.coroutines.cf.f159086b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0085, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0087, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x008d, code lost:
        return a(r2, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object c(kotlinx.coroutines.bu r7, java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.c(kotlinx.coroutines.bu, java.lang.Object):java.lang.Object");
    }

    private final ce<?> a(h.f.a.b<? super Throwable, z> bVar, boolean z) {
        cb cbVar = null;
        if (z) {
            if (bVar instanceof cb) {
                cbVar = bVar;
            }
            cb cbVar2 = cbVar;
            if (cbVar2 == null) {
                return new bx(this, bVar);
            }
            if (!ar.f159021a || cbVar2.f159084c == this) {
                return cbVar2;
            }
            throw new AssertionError();
        }
        if (bVar instanceof ce) {
            cbVar = bVar;
        }
        ce<?> ceVar = cbVar;
        if (ceVar == null) {
            return new by(this, bVar);
        }
        if (!ar.f159021a) {
            return ceVar;
        }
        if (ceVar.f159084c == this && !(ceVar instanceof cb)) {
            return ceVar;
        }
        throw new AssertionError();
    }

    private final boolean b(Finishing finishing, t tVar, Object obj) {
        while (bz.a.a(tVar.f159216a, false, false, new b(this, finishing, tVar, obj), 1) == ck.f159094a) {
            tVar = a((kotlinx.coroutines.internal.l) tVar);
            if (tVar == null) {
                return false;
            }
        }
        return true;
    }
}
