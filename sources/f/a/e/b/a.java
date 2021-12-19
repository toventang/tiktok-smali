package f.a.e.b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final f.a.d.g<Object, Object> f157188a = new m();

    /* renamed from: b  reason: collision with root package name */
    public static final Runnable f157189b = new i();

    /* renamed from: c  reason: collision with root package name */
    public static final f.a.d.a f157190c = new f();

    /* renamed from: d  reason: collision with root package name */
    public static final f.a.d.f<Object> f157191d = new g();

    /* renamed from: e  reason: collision with root package name */
    public static final f.a.d.f<Throwable> f157192e = new j();

    /* renamed from: f  reason: collision with root package name */
    public static final f.a.d.f<Throwable> f157193f = new r();

    /* renamed from: g  reason: collision with root package name */
    public static final f.a.d.j f157194g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final f.a.d.k<Object> f157195h = new s();

    /* renamed from: i  reason: collision with root package name */
    static final f.a.d.k<Object> f157196i = new k();

    /* renamed from: j  reason: collision with root package name */
    static final Callable<Object> f157197j = new q();

    /* renamed from: k  reason: collision with root package name */
    static final Comparator<Object> f157198k = new p();

    /* renamed from: l  reason: collision with root package name */
    public static final f.a.d.f<org.a.d> f157199l = new o();

    static final class f implements f.a.d.a {
        static {
            Covode.recordClassIndex(104412);
        }

        @Override // f.a.d.a
        public final void a() {
        }

        public final String toString() {
            return "EmptyAction";
        }

        f() {
        }
    }

    static final class g implements f.a.d.f<Object> {
        static {
            Covode.recordClassIndex(104413);
        }

        @Override // f.a.d.f
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }

        g() {
        }
    }

    static final class h implements f.a.d.j {
        static {
            Covode.recordClassIndex(104414);
        }

        h() {
        }
    }

    static final class i implements Runnable {
        static {
            Covode.recordClassIndex(104415);
        }

        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }

        i() {
        }
    }

    static final class j implements f.a.d.f<Throwable> {
        static {
            Covode.recordClassIndex(104416);
        }

        j() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            f.a.h.a.a(th);
        }
    }

    static final class k implements f.a.d.k<Object> {
        static {
            Covode.recordClassIndex(104417);
        }

        @Override // f.a.d.k
        public final boolean a(Object obj) {
            return false;
        }

        k() {
        }
    }

    static final class m implements f.a.d.g<Object, Object> {
        static {
            Covode.recordClassIndex(104419);
        }

        @Override // f.a.d.g
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }

        m() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T, U> implements f.a.d.g<T, U>, Callable<U> {

        /* renamed from: a  reason: collision with root package name */
        final U f157207a;

        static {
            Covode.recordClassIndex(104420);
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return this.f157207a;
        }

        @Override // f.a.d.g
        public final U apply(T t) {
            return this.f157207a;
        }

        n(U u) {
            this.f157207a = u;
        }
    }

    static final class o implements f.a.d.f<org.a.d> {
        static {
            Covode.recordClassIndex(104421);
        }

        o() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(org.a.d dVar) {
            dVar.request(Long.MAX_VALUE);
        }
    }

    static final class p implements Comparator<Object> {
        static {
            Covode.recordClassIndex(104422);
        }

        p() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static final class q implements Callable<Object> {
        static {
            Covode.recordClassIndex(104423);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }

        q() {
        }
    }

    static final class r implements f.a.d.f<Throwable> {
        static {
            Covode.recordClassIndex(104424);
        }

        r() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            f.a.h.a.a(new f.a.c.d(th));
        }
    }

    static final class s implements f.a.d.k<Object> {
        static {
            Covode.recordClassIndex(104425);
        }

        @Override // f.a.d.k
        public final boolean a(Object obj) {
            return true;
        }

        s() {
        }
    }

    public static final class c<T> implements Callable<List<T>> {

        /* renamed from: a  reason: collision with root package name */
        final int f157202a = 16;

        static {
            Covode.recordClassIndex(104409);
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return new ArrayList(this.f157202a);
        }

        public c(int i2) {
        }
    }

    public enum l implements Callable<Set<Object>> {
        INSTANCE;

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Set<Object> call() {
            return new HashSet();
        }

        static {
            Covode.recordClassIndex(104418);
        }
    }

    static {
        Covode.recordClassIndex(104406);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.b.a$a  reason: collision with other inner class name */
    public static final class C4156a<T1, T2, R> implements f.a.d.g<Object[], R> {

        /* renamed from: a  reason: collision with root package name */
        final f.a.d.c<? super T1, ? super T2, ? extends R> f157200a;

        static {
            Covode.recordClassIndex(104407);
        }

        C4156a(f.a.d.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f157200a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.f157200a.a(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T1, T2, T3, R> implements f.a.d.g<Object[], R> {

        /* renamed from: a  reason: collision with root package name */
        final f.a.d.h<T1, T2, T3, R> f157201a;

        static {
            Covode.recordClassIndex(104408);
        }

        b(f.a.d.h<T1, T2, T3, R> hVar) {
            this.f157201a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: f.a.d.h<T1, T2, T3, R> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 3) {
                return this.f157201a.a(objArr2[0], objArr2[1], objArr2[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
        }
    }

    public static final class d<T, U> implements f.a.d.g<T, U> {

        /* renamed from: a  reason: collision with root package name */
        final Class<U> f157203a;

        static {
            Covode.recordClassIndex(104410);
        }

        public d(Class<U> cls) {
            this.f157203a = cls;
        }

        @Override // f.a.d.g
        public final U apply(T t) {
            return this.f157203a.cast(t);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, U> implements f.a.d.k<T> {

        /* renamed from: a  reason: collision with root package name */
        final Class<U> f157204a;

        static {
            Covode.recordClassIndex(104411);
        }

        e(Class<U> cls) {
            this.f157204a = cls;
        }

        @Override // f.a.d.k
        public final boolean a(T t) {
            return this.f157204a.isInstance(t);
        }
    }

    public static <T, U> f.a.d.k<T> a(Class<U> cls) {
        return new e(cls);
    }

    public static <T, U> f.a.d.g<T, U> b(U u) {
        return new n(u);
    }

    public static <T1, T2, R> f.a.d.g<Object[], R> a(f.a.d.c<? super T1, ? super T2, ? extends R> cVar) {
        b.a((Object) cVar, "f is null");
        return new C4156a(cVar);
    }

    public static <T1, T2, T3, R> f.a.d.g<Object[], R> a(f.a.d.h<T1, T2, T3, R> hVar) {
        b.a((Object) hVar, "f is null");
        return new b(hVar);
    }

    public static <T> Callable<T> a(T t) {
        return new n(t);
    }
}
