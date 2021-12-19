package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class d extends c {

    /* renamed from: e  reason: collision with root package name */
    private static final Writer f54811e = new Writer() {
        /* class com.google.gson.internal.bind.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(33981);
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static final r f54812f = new r("closed");

    /* renamed from: g  reason: collision with root package name */
    private final List<l> f54813g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private String f54814h;

    /* renamed from: i  reason: collision with root package name */
    private l f54815i = n.f54897a;

    @Override // com.google.gson.c.c, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.gson.c.c
    public final c f() {
        a(n.f54897a);
        return this;
    }

    private l i() {
        List<l> list = this.f54813g;
        return list.get(list.size() - 1);
    }

    @Override // com.google.gson.c.c
    public final c b() {
        i iVar = new i();
        a(iVar);
        this.f54813g.add(iVar);
        return this;
    }

    @Override // com.google.gson.c.c
    public final c d() {
        o oVar = new o();
        a(oVar);
        this.f54813g.add(oVar);
        return this;
    }

    static {
        Covode.recordClassIndex(33980);
    }

    public d() {
        super(f54811e);
    }

    @Override // com.google.gson.c.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f54813g.isEmpty()) {
            this.f54813g.add(f54812f);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.c.c
    public final c c() {
        if (this.f54813g.isEmpty() || this.f54814h != null) {
            throw new IllegalStateException();
        } else if (i() instanceof i) {
            List<l> list = this.f54813g;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.c.c
    public final c e() {
        if (this.f54813g.isEmpty() || this.f54814h != null) {
            throw new IllegalStateException();
        } else if (i() instanceof o) {
            List<l> list = this.f54813g;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final l a() {
        if (this.f54813g.isEmpty()) {
            return this.f54815i;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f54813g);
    }

    @Override // com.google.gson.c.c
    public final c a(long j2) {
        a(new r((Number) Long.valueOf(j2)));
        return this;
    }

    @Override // com.google.gson.c.c
    public final c a(Boolean bool) {
        if (bool == null) {
            return f();
        }
        a(new r(bool));
        return this;
    }

    @Override // com.google.gson.c.c
    public final c b(String str) {
        if (str == null) {
            return f();
        }
        a(new r(str));
        return this;
    }

    private void a(l lVar) {
        if (this.f54814h != null) {
            if (!(lVar instanceof n) || this.f54686d) {
                ((o) i()).a(this.f54814h, lVar);
            }
            this.f54814h = null;
        } else if (this.f54813g.isEmpty()) {
            this.f54815i = lVar;
        } else {
            l i2 = i();
            if (i2 instanceof i) {
                ((i) i2).a(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.c.c
    public final c a(double d2) {
        if (this.f54684b || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            a(new r((Number) Double.valueOf(d2)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(d2)));
    }

    @Override // com.google.gson.c.c
    public final c a(Number number) {
        if (number == null) {
            return f();
        }
        if (!this.f54684b) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        a(new r(number));
        return this;
    }

    @Override // com.google.gson.c.c
    public final c a(String str) {
        if (this.f54813g.isEmpty() || this.f54814h != null) {
            throw new IllegalStateException();
        } else if (i() instanceof o) {
            this.f54814h = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.c.c
    public final c a(boolean z) {
        a(new r(Boolean.valueOf(z)));
        return this;
    }
}
