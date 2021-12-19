package com.google.c.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.k;
import com.google.c.c.ai;
import com.google.c.c.bq;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final bq<File> f54121a = new bq<File>() {
        /* class com.google.c.e.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(33560);
        }

        public final String toString() {
            return "Files.fileTreeTraverser()";
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final com.google.c.d.a<File> f54122b = new com.google.c.d.a<File>() {
        /* class com.google.c.e.f.AnonymousClass2 */

        static {
            Covode.recordClassIndex(33561);
        }
    };

    public static final class b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final File f54125a;

        static {
            Covode.recordClassIndex(33563);
        }

        @Override // com.google.c.e.b
        public final /* synthetic */ InputStream a() {
            MethodCollector.i(3122);
            FileInputStream fileInputStream = new FileInputStream(this.f54125a);
            MethodCollector.o(3122);
            return fileInputStream;
        }

        public final String toString() {
            return "Files.asByteSource(" + this.f54125a + ")";
        }

        private b(File file) {
            this.f54125a = (File) k.a(file);
        }

        public /* synthetic */ b(File file, byte b2) {
            this(file);
        }
    }

    public static final class a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final File f54123a;

        /* renamed from: b  reason: collision with root package name */
        private final ai<e> f54124b;

        static {
            Covode.recordClassIndex(33562);
        }

        @Override // com.google.c.e.a
        public final /* synthetic */ OutputStream a() {
            MethodCollector.i(3130);
            FileOutputStream fileOutputStream = new FileOutputStream(this.f54123a, this.f54124b.contains(e.APPEND));
            MethodCollector.o(3130);
            return fileOutputStream;
        }

        public final String toString() {
            return "Files.asByteSink(" + this.f54123a + ", " + this.f54124b + ")";
        }

        private a(File file, e... eVarArr) {
            this.f54123a = (File) k.a(file);
            this.f54124b = ai.copyOf(eVarArr);
        }

        public /* synthetic */ a(File file, e[] eVarArr, byte b2) {
            this(file, eVarArr);
        }
    }

    static {
        Covode.recordClassIndex(33559);
    }
}
