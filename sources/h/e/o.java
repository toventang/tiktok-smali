package h.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.l.h;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class o implements h<String> {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f158705a;

    static {
        Covode.recordClassIndex(105168);
    }

    @Override // h.l.h
    public final Iterator<String> a() {
        return new a(this);
    }

    public static final class a implements h.f.b.a.a, Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f158706a;

        /* renamed from: b  reason: collision with root package name */
        private String f158707b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f158708c;

        static {
            Covode.recordClassIndex(105169);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f158707b == null && !this.f158708c) {
                String readLine = this.f158706a.f158705a.readLine();
                this.f158707b = readLine;
                if (readLine == null) {
                    this.f158708c = true;
                }
            }
            if (this.f158707b != null) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ String next() {
            if (hasNext()) {
                String str = this.f158707b;
                this.f158707b = null;
                if (str == null) {
                    l.b();
                }
                return str;
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(o oVar) {
            this.f158706a = oVar;
        }
    }

    public o(BufferedReader bufferedReader) {
        l.d(bufferedReader, "");
        this.f158705a = bufferedReader;
    }
}
