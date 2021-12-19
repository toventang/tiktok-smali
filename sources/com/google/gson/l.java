package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.internal.k;
import java.io.IOException;
import java.io.StringWriter;

public abstract class l {
    static {
        Covode.recordClassIndex(34057);
    }

    public abstract l i();

    public Number b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final o j() {
        if (this instanceof o) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(this)));
    }

    public final i k() {
        if (this instanceof i) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(this)));
    }

    public final r l() {
        if (this instanceof r) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(this)));
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f54684b = true;
            k.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
