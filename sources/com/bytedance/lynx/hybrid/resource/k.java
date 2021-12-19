package com.bytedance.lynx.hybrid.resource;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.c.a;
import h.f.b.l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public final class k extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private boolean f41221a = true;

    /* renamed from: b  reason: collision with root package name */
    private List<Byte> f41222b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f41223c = true;

    /* renamed from: d  reason: collision with root package name */
    private final j f41224d;

    /* renamed from: e  reason: collision with root package name */
    private final InputStream f41225e;

    static {
        Covode.recordClassIndex(25247);
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.f41225e.available();
        } catch (Exception e2) {
            this.f41221a = false;
            throw e2;
        }
    }

    public final boolean markSupported() {
        try {
            return this.f41225e.markSupported();
        } catch (Exception e2) {
            this.f41221a = false;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.f41225e.reset();
        } catch (Exception e2) {
            this.f41221a = false;
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        try {
            this.f41225e.close();
            if (this.f41221a && l.a((Object) this.f41224d.f41219g, (Object) "template") && this.f41223c) {
                a aVar = a.b.f41072a;
                String str = this.f41224d.f41214b;
                if (str == null) {
                    str = "";
                }
                List<Byte> list = this.f41222b;
                l.c(str, "");
                l.c(list, "");
                if (str.length() != 0 && !list.isEmpty()) {
                    i.a(new a.d(aVar, list, str), i.f4824a);
                }
            }
        } catch (Exception e2) {
            this.f41221a = false;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.i(8695);
        try {
            int read = this.f41225e.read();
            if (!this.f41224d.f41220h) {
                this.f41223c = false;
                MethodCollector.o(8695);
                return read;
            }
            if (read != -1 && a.b.f41072a.a(this.f41224d.f41214b) == null) {
                try {
                    this.f41222b.add(Byte.valueOf((byte) read));
                } catch (OutOfMemoryError unused) {
                    this.f41222b.clear();
                    this.f41223c = false;
                }
            }
            MethodCollector.o(8695);
            return read;
        } catch (Exception e2) {
            this.f41221a = false;
            MethodCollector.o(8695);
            throw e2;
        }
    }

    public final void mark(int i2) {
        try {
            this.f41225e.mark(i2);
        } catch (Exception e2) {
            this.f41221a = false;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        try {
            return this.f41225e.skip(j2);
        } catch (Exception e2) {
            this.f41221a = false;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.i(8697);
        try {
            int read = this.f41225e.read(bArr);
            if (!this.f41224d.f41220h) {
                this.f41223c = false;
                MethodCollector.o(8697);
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && a.b.f41072a.a(this.f41224d.f41214b) == null) {
                try {
                    if (read == bArr.length) {
                        this.f41222b.addAll(h.a.i.a(bArr));
                    } else {
                        this.f41222b.addAll(h.a.i.a(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    this.f41222b.clear();
                    this.f41223c = false;
                }
            }
            MethodCollector.o(8697);
            return read;
        } catch (Exception e2) {
            this.f41221a = false;
            MethodCollector.o(8697);
            throw e2;
        }
    }

    public k(j jVar, InputStream inputStream) {
        l.c(jVar, "");
        l.c(inputStream, "");
        MethodCollector.i(8706);
        this.f41224d = jVar;
        this.f41225e = inputStream;
        MethodCollector.o(8706);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(8698);
        try {
            int read = this.f41225e.read(bArr, i2, i3);
            if (!this.f41224d.f41220h) {
                this.f41223c = false;
                MethodCollector.o(8698);
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && a.b.f41072a.a(this.f41224d.f41214b) == null) {
                try {
                    if (read == bArr.length) {
                        this.f41222b.addAll(h.a.i.a(bArr));
                    } else {
                        this.f41222b.addAll(h.a.i.a(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    this.f41222b.clear();
                    this.f41223c = false;
                }
            }
            MethodCollector.o(8698);
            return read;
        } catch (Exception e2) {
            this.f41221a = false;
            MethodCollector.o(8698);
            throw e2;
        }
    }
}
