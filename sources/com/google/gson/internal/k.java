package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.internal.bind.i;
import com.google.gson.l;
import java.io.Writer;

public final class k {
    static {
        Covode.recordClassIndex(34047);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f54889a;

        /* renamed from: b  reason: collision with root package name */
        private final C1247a f54890b = new C1247a();

        /* renamed from: com.google.gson.internal.k$a$a  reason: collision with other inner class name */
        static class C1247a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            char[] f54891a;

            static {
                Covode.recordClassIndex(34049);
            }

            public final int length() {
                return this.f54891a.length;
            }

            C1247a() {
            }

            public final char charAt(int i2) {
                return this.f54891a[i2];
            }

            public final CharSequence subSequence(int i2, int i3) {
                return new String(this.f54891a, i2, i3 - i2);
            }
        }

        static {
            Covode.recordClassIndex(34048);
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(int i2) {
            this.f54889a.append((char) i2);
        }

        a(Appendable appendable) {
            this.f54889a = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i2, int i3) {
            this.f54890b.f54891a = cArr;
            this.f54889a.append(this.f54890b, i2, i3 + i2);
        }
    }

    public static Writer a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new a(appendable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        throw new com.google.gson.t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        throw new com.google.gson.m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        throw new com.google.gson.t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return com.google.gson.n.f54897a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[ExcHandler: IOException (r1v2 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[ExcHandler: d (r1v1 'e' com.google.gson.c.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014 A[ExcHandler: NumberFormatException (r1v3 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.l a(com.google.gson.c.a r1) {
        /*
            r1.f()     // Catch:{ EOFException -> 0x0029, d -> 0x0022, IOException -> 0x001b, NumberFormatException -> 0x0014 }
            r0 = 0
            com.google.gson.v<com.google.gson.l> r0 = com.google.gson.internal.bind.i.X     // Catch:{ EOFException -> 0x000d, d -> 0x0022, IOException -> 0x001b, NumberFormatException -> 0x0014 }
            java.lang.Object r0 = r0.read(r1)     // Catch:{ EOFException -> 0x000d, d -> 0x0022, IOException -> 0x001b, NumberFormatException -> 0x0014 }
            com.google.gson.l r0 = (com.google.gson.l) r0     // Catch:{ EOFException -> 0x000d, d -> 0x0022, IOException -> 0x001b, NumberFormatException -> 0x0014 }
            return r0
        L_0x000d:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        L_0x0014:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        L_0x001b:
            r1 = move-exception
            com.google.gson.m r0 = new com.google.gson.m
            r0.<init>(r1)
            throw r0
        L_0x0022:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        L_0x0029:
            r0 = move-exception
            r0 = 1
            com.google.gson.n r0 = com.google.gson.n.f54897a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.k.a(com.google.gson.c.a):com.google.gson.l");
    }

    public static void a(l lVar, c cVar) {
        i.X.write(cVar, lVar);
    }
}
