package h.e;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.l.h;
import h.l.k;
import h.z;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;

public final class q {
    static {
        Covode.recordClassIndex(105171);
    }

    public static final class a extends m implements b<String, z> {
        final /* synthetic */ ArrayList $result;

        static {
            Covode.recordClassIndex(105172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.$result = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            l.d(str, "");
            this.$result.add(str);
            return z.f158842a;
        }
    }

    public static final h<String> a(BufferedReader bufferedReader) {
        l.d(bufferedReader, "");
        return k.b(new o(bufferedReader));
    }

    public static final String a(Reader reader) {
        l.d(reader, "");
        StringWriter stringWriter = new StringWriter();
        a(reader, stringWriter);
        String stringWriter2 = stringWriter.toString();
        l.b(stringWriter2, "");
        return stringWriter2;
    }

    /* access modifiers changed from: private */
    public static long a(Reader reader, Writer writer) {
        l.d(reader, "");
        l.d(writer, "");
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        long j2 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j2 += (long) read;
            read = reader.read(cArr);
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        h.e.c.a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.Reader r2, h.f.a.b<? super java.lang.String, h.z> r3) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r2, r0)
            h.f.b.l.d(r3, r0)
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            r0 = r2
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x0028 }
            h.l.h r0 = a(r0)     // Catch:{ all -> 0x0028 }
            java.util.Iterator r1 = r0.a()     // Catch:{ all -> 0x0028 }
        L_0x0015:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0028 }
            r3.invoke(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0015
        L_0x0023:
            r0 = 0
            h.e.c.a(r2, r0)
            return
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            h.e.c.a(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e.q.a(java.io.Reader, h.f.a.b):void");
    }
}
