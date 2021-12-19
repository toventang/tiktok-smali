package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.internal.bind.d;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class v<T> {
    static {
        Covode.recordClassIndex(34069);
    }

    public abstract T read(a aVar);

    public abstract void write(c cVar, T t);

    public final v<T> nullSafe() {
        return new v<T>() {
            /* class com.google.gson.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34070);
            }

            @Override // com.google.gson.v
            public final T read(a aVar) {
                if (aVar.f() != b.NULL) {
                    return (T) v.this.read(aVar);
                }
                aVar.k();
                return null;
            }

            @Override // com.google.gson.v
            public final void write(c cVar, T t) {
                if (t == null) {
                    cVar.f();
                } else {
                    v.this.write(cVar, t);
                }
            }
        };
    }

    public final T fromJson(Reader reader) {
        return read(new a(reader));
    }

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final T fromJsonTree(l lVar) {
        try {
            return read(new com.google.gson.internal.bind.c(lVar));
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final l toJsonTree(T t) {
        try {
            d dVar = new d();
            write(dVar, t);
            return dVar.a();
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public final void toJson(Writer writer, T t) {
        write(new c(writer), t);
    }
}
