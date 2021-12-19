package h.e;

import com.bytedance.covode.number.Covode;
import h.ab;
import h.f.a.m;
import h.f.b.l;
import h.l.h;
import h.n;
import h.z;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class g implements h<File> {

    /* renamed from: a  reason: collision with root package name */
    public final File f158683a;

    /* renamed from: b  reason: collision with root package name */
    public final i f158684b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.b<File, Boolean> f158685c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.b<File, z> f158686d;

    /* renamed from: e  reason: collision with root package name */
    public final m<File, IOException, z> f158687e;

    /* renamed from: f  reason: collision with root package name */
    public final int f158688f;

    static {
        Covode.recordClassIndex(105154);
    }

    @Override // h.l.h
    public final Iterator<File> a() {
        return new b();
    }

    final class b extends h.a.b<File> {

        /* renamed from: b  reason: collision with root package name */
        private final ArrayDeque<c> f158690b;

        static {
            Covode.recordClassIndex(105156);
        }

        /* renamed from: h.e.g$b$b  reason: collision with other inner class name */
        final class C4187b extends c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f158696a;

            /* renamed from: c  reason: collision with root package name */
            private boolean f158697c;

            static {
                Covode.recordClassIndex(105158);
            }

            @Override // h.e.g.c
            public final File a() {
                if (this.f158697c) {
                    return null;
                }
                this.f158697c = true;
                return this.f158702b;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4187b(b bVar, File file) {
                super(file);
                l.d(file, "");
                this.f158696a = bVar;
                if (ab.f158655a) {
                    boolean isFile = file.isFile();
                    if (ab.f158655a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final class a extends a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f158691a;

            /* renamed from: c  reason: collision with root package name */
            private boolean f158692c;

            /* renamed from: d  reason: collision with root package name */
            private File[] f158693d;

            /* renamed from: e  reason: collision with root package name */
            private int f158694e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f158695f;

            static {
                Covode.recordClassIndex(105157);
            }

            @Override // h.e.g.c
            public final File a() {
                if (!this.f158695f && this.f158693d == null) {
                    h.f.a.b<File, Boolean> bVar = g.this.f158685c;
                    if (bVar != null && !bVar.invoke(this.f158702b).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = this.f158702b.listFiles();
                    this.f158693d = listFiles;
                    if (listFiles == null) {
                        m<File, IOException, z> mVar = g.this.f158687e;
                        if (mVar != null) {
                            mVar.invoke(this.f158702b, new a(this.f158702b, null, "Cannot list files in a directory", 2, null));
                        }
                        this.f158695f = true;
                    }
                }
                File[] fileArr = this.f158693d;
                if (fileArr != null && this.f158694e < fileArr.length) {
                    File[] fileArr2 = this.f158693d;
                    if (fileArr2 == null) {
                        l.b();
                    }
                    int i2 = this.f158694e;
                    this.f158694e = i2 + 1;
                    return fileArr2[i2];
                } else if (!this.f158692c) {
                    this.f158692c = true;
                    return this.f158702b;
                } else {
                    h.f.a.b<File, z> bVar2 = g.this.f158686d;
                    if (bVar2 != null) {
                        bVar2.invoke(this.f158702b);
                    }
                    return null;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                l.d(file, "");
                this.f158691a = bVar;
            }
        }

        @Override // h.a.b
        public final void a() {
            File a2;
            while (true) {
                c peek = this.f158690b.peek();
                if (peek == null) {
                    b();
                    return;
                }
                a2 = peek.a();
                if (a2 == null) {
                    this.f158690b.pop();
                } else if (l.a(a2, peek.f158702b) || !a2.isDirectory() || this.f158690b.size() >= g.this.f158688f) {
                    a((Object) a2);
                } else {
                    this.f158690b.push(a(a2));
                }
            }
            a((Object) a2);
        }

        /* access modifiers changed from: package-private */
        public final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f158698a;

            /* renamed from: c  reason: collision with root package name */
            private boolean f158699c;

            /* renamed from: d  reason: collision with root package name */
            private File[] f158700d;

            /* renamed from: e  reason: collision with root package name */
            private int f158701e;

            static {
                Covode.recordClassIndex(105159);
            }

            @Override // h.e.g.c
            public final File a() {
                m<File, IOException, z> mVar;
                if (!this.f158699c) {
                    h.f.a.b<File, Boolean> bVar = g.this.f158685c;
                    if (bVar != null && !bVar.invoke(this.f158702b).booleanValue()) {
                        return null;
                    }
                    this.f158699c = true;
                    return this.f158702b;
                }
                File[] fileArr = this.f158700d;
                if (fileArr == null || this.f158701e < fileArr.length) {
                    if (this.f158700d == null) {
                        File[] listFiles = this.f158702b.listFiles();
                        this.f158700d = listFiles;
                        if (listFiles == null && (mVar = g.this.f158687e) != null) {
                            mVar.invoke(this.f158702b, new a(this.f158702b, null, "Cannot list files in a directory", 2, null));
                        }
                        File[] fileArr2 = this.f158700d;
                        if (fileArr2 == null || fileArr2.length == 0) {
                            h.f.a.b<File, z> bVar2 = g.this.f158686d;
                            if (bVar2 != null) {
                                bVar2.invoke(this.f158702b);
                            }
                            return null;
                        }
                    }
                    File[] fileArr3 = this.f158700d;
                    if (fileArr3 == null) {
                        l.b();
                    }
                    int i2 = this.f158701e;
                    this.f158701e = i2 + 1;
                    return fileArr3[i2];
                }
                h.f.a.b<File, z> bVar3 = g.this.f158686d;
                if (bVar3 != null) {
                    bVar3.invoke(this.f158702b);
                }
                return null;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                l.d(file, "");
                this.f158698a = bVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f158690b = arrayDeque;
            if (g.this.f158683a.isDirectory()) {
                arrayDeque.push(a(g.this.f158683a));
            } else if (g.this.f158683a.isFile()) {
                arrayDeque.push(new C4187b(this, g.this.f158683a));
            } else {
                b();
            }
        }

        private final a a(File file) {
            int i2 = h.f158703a[g.this.f158684b.ordinal()];
            if (i2 == 1) {
                return new c(this, file);
            }
            if (i2 == 2) {
                return new a(this, file);
            }
            throw new n();
        }
    }

    static abstract class c {

        /* renamed from: b  reason: collision with root package name */
        public final File f158702b;

        static {
            Covode.recordClassIndex(105160);
        }

        public abstract File a();

        public c(File file) {
            l.d(file, "");
            this.f158702b = file;
        }
    }

    static abstract class a extends c {
        static {
            Covode.recordClassIndex(105155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            l.d(file, "");
            if (ab.f158655a) {
                boolean isDirectory = file.isDirectory();
                if (ab.f158655a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    private g(File file, i iVar) {
        this.f158683a = file;
        this.f158684b = iVar;
        this.f158685c = null;
        this.f158686d = null;
        this.f158687e = null;
        this.f158688f = Integer.MAX_VALUE;
    }

    private /* synthetic */ g(File file, i iVar, byte b2) {
        this(file, iVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(File file, i iVar, char c2) {
        this(file, iVar, (byte) 0);
        l.d(file, "");
        l.d(iVar, "");
    }
}
