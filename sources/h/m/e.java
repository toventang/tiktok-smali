package h.m;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.j.g;
import h.l.h;
import h.p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class e implements h<g> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f158815a;

    /* renamed from: b  reason: collision with root package name */
    public final int f158816b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final int f158817c;

    /* renamed from: d  reason: collision with root package name */
    public final m<CharSequence, Integer, p<Integer, Integer>> f158818d;

    static {
        Covode.recordClassIndex(105343);
    }

    @Override // h.l.h
    public final Iterator<g> a() {
        return new a(this);
    }

    public static final class a implements h.f.b.a.a, Iterator<g> {

        /* renamed from: a  reason: collision with root package name */
        public int f158819a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f158820b;

        /* renamed from: c  reason: collision with root package name */
        public int f158821c;

        /* renamed from: d  reason: collision with root package name */
        public g f158822d;

        /* renamed from: e  reason: collision with root package name */
        public int f158823e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f158824f;

        static {
            Covode.recordClassIndex(105344);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f158819a == -1) {
                a();
            }
            if (this.f158819a == 1) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ g next() {
            if (this.f158819a == -1) {
                a();
            }
            if (this.f158819a != 0) {
                g gVar = this.f158822d;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f158822d = null;
                this.f158819a = -1;
                return gVar;
            }
            throw new NoSuchElementException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
            if (r1 < r6.f158824f.f158817c) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: h.m.e.a.a():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(e eVar) {
            this.f158824f = eVar;
            int a2 = h.j.h.a(eVar.f158816b, 0, eVar.f158815a.length());
            this.f158820b = a2;
            this.f158821c = a2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super java.lang.CharSequence, ? super java.lang.Integer, h.p<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i2, m<? super CharSequence, ? super Integer, p<Integer, Integer>> mVar) {
        l.d(charSequence, "");
        l.d(mVar, "");
        this.f158815a = charSequence;
        this.f158817c = i2;
        this.f158818d = mVar;
    }
}
