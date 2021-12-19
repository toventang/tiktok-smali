package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.c.d;
import com.google.gson.internal.k;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class q {
    static {
        Covode.recordClassIndex(34062);
    }

    public static l a(String str) {
        return a(new StringReader(str));
    }

    private static l a(Reader reader) {
        try {
            a aVar = new a(reader);
            l a2 = a(aVar);
            if (!(a2 instanceof n)) {
                if (aVar.f() != b.END_DOCUMENT) {
                    throw new t("Did not consume the entire document.");
                }
            }
            return a2;
        } catch (d e2) {
            throw new t(e2);
        } catch (IOException e3) {
            throw new m(e3);
        } catch (NumberFormatException e4) {
            throw new t(e4);
        }
    }

    public static l a(a aVar) {
        boolean z = aVar.f54668a;
        aVar.f54668a = true;
        try {
            l a2 = k.a(aVar);
            aVar.f54668a = z;
            return a2;
        } catch (StackOverflowError e2) {
            throw new p("Failed parsing JSON source: " + aVar + " to Json", e2);
        } catch (OutOfMemoryError e3) {
            throw new p("Failed parsing JSON source: " + aVar + " to Json", e3);
        } catch (Throwable th) {
            aVar.f54668a = z;
            throw th;
        }
    }
}
