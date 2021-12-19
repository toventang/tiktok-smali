package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.z;
import java.io.Serializable;
import org.a.d;

public enum j {
    COMPLETE;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }

    public static Object complete() {
        return COMPLETE;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e  reason: collision with root package name */
        final Throwable f157946e;

        static {
            Covode.recordClassIndex(104872);
        }

        public final int hashCode() {
            return this.f157946e.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f157946e + "]";
        }

        b(Throwable th) {
            this.f157946e = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return f.a.e.b.b.a(this.f157946e, ((b) obj).f157946e);
            }
            return false;
        }
    }

    static final class a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final f.a.b.b upstream;

        static {
            Covode.recordClassIndex(104871);
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }

        a(f.a.b.b bVar) {
            this.upstream = bVar;
        }
    }

    static final class c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final d upstream;

        static {
            Covode.recordClassIndex(104873);
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }

        c(d dVar) {
            this.upstream = dVar;
        }
    }

    static {
        Covode.recordClassIndex(104870);
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static Object disposable(f.a.b.b bVar) {
        return new a(bVar);
    }

    public static Object error(Throwable th) {
        return new b(th);
    }

    public static f.a.b.b getDisposable(Object obj) {
        return ((a) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f157946e;
    }

    public static d getSubscription(Object obj) {
        return ((c) obj).upstream;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static Object subscription(d dVar) {
        return new c(dVar);
    }

    public static <T> boolean accept(Object obj, z<? super T> zVar) {
        if (obj == COMPLETE) {
            zVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            zVar.onError(((b) obj).f157946e);
            return true;
        } else {
            zVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean accept(Object obj, org.a.c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            cVar.onError(((b) obj).f157946e);
            return true;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, z<? super T> zVar) {
        if (obj == COMPLETE) {
            zVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            zVar.onError(((b) obj).f157946e);
            return true;
        } else if (obj instanceof a) {
            zVar.onSubscribe(((a) obj).upstream);
            return false;
        } else {
            zVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, org.a.c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            cVar.onError(((b) obj).f157946e);
            return true;
        } else if (obj instanceof c) {
            cVar.onSubscribe(((c) obj).upstream);
            return false;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }
}
