package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.h;
import f.a.l;
import org.a.c;

public final class p<T, U> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final g<? super T, ? extends U> f157329c;

    static {
        Covode.recordClassIndex(104518);
    }

    static final class a<T, U> extends f.a.e.h.a<T, U> {

        /* renamed from: a  reason: collision with root package name */
        final g<? super T, ? extends U> f157330a;

        static {
            Covode.recordClassIndex(104519);
        }

        @Override // f.a.e.c.i
        public final U poll() {
            Object poll = this.f157928g.poll();
            if (poll != null) {
                return (U) f.a.e.b.b.a(this.f157330a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: f.a.e.c.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.e.c.a
        public final boolean a(T t) {
            if (this.f157929h) {
                return false;
            }
            try {
                return this.f157926e.a(f.a.e.b.b.a(this.f157330a.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: f.a.e.c.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.f157929h) {
                if (this.f157930i != 0) {
                    this.f157926e.onNext(null);
                    return;
                }
                try {
                    this.f157926e.onNext(f.a.e.b.b.a(this.f157330a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        a(f.a.e.c.a<? super U> aVar, g<? super T, ? extends U> gVar) {
            super(aVar);
            this.f157330a = gVar;
        }
    }

    static final class b<T, U> extends f.a.e.h.b<T, U> {

        /* renamed from: a  reason: collision with root package name */
        final g<? super T, ? extends U> f157331a;

        static {
            Covode.recordClassIndex(104520);
        }

        @Override // f.a.e.c.i
        public final U poll() {
            Object poll = this.f157933g.poll();
            if (poll != null) {
                return (U) f.a.e.b.b.a(this.f157331a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: org.a.c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.f157934h) {
                if (this.f157935i != 0) {
                    this.f157931e.onNext(null);
                    return;
                }
                try {
                    this.f157931e.onNext(f.a.e.b.b.a(this.f157331a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        b(c<? super U> cVar, g<? super T, ? extends U> gVar) {
            super(cVar);
            this.f157331a = gVar;
        }
    }

    @Override // f.a.h
    public final void a(c<? super U> cVar) {
        if (cVar instanceof f.a.e.c.a) {
            this.f157263b.a((l) new a((f.a.e.c.a) cVar, this.f157329c));
        } else {
            this.f157263b.a((l) new b(cVar, this.f157329c));
        }
    }

    public p(h<T> hVar, g<? super T, ? extends U> gVar) {
        super(hVar);
        this.f157329c = gVar;
    }
}
