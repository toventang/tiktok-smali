package com.facebook.imagepipeline.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.b;
import com.facebook.common.d.i;
import com.facebook.common.d.m;
import com.facebook.common.g.a;
import com.facebook.common.g.g;
import com.facebook.imagepipeline.j.e;
import java.io.IOException;
import java.io.InputStream;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f47973a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f47974b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47975c;

    /* renamed from: d  reason: collision with root package name */
    private int f47976d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f47977e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f47978f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f47979g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final a f47980h;

    static {
        Covode.recordClassIndex(29009);
    }

    private void a(int i2) {
        int i3 = this.f47979g;
        if (i3 > 0) {
            this.f47974b = i2;
        }
        this.f47979g = i3 + 1;
        this.f47973a = i3;
    }

    public f(a aVar) {
        this.f47980h = (a) i.a(aVar);
    }

    public final boolean a(e eVar) {
        if (this.f47976d == 6 || eVar.h() <= this.f47978f) {
            return false;
        }
        g gVar = new g(eVar.b(), (byte[]) this.f47980h.a(16384), this.f47980h);
        try {
            com.facebook.common.k.e.a(gVar, (long) this.f47978f);
            return a(gVar);
        } catch (IOException e2) {
            m.b(e2);
            return false;
        } finally {
            b.a((InputStream) gVar);
        }
    }

    private boolean a(InputStream inputStream) {
        int read;
        MethodCollector.i(14336);
        int i2 = this.f47973a;
        while (this.f47976d != 6 && (read = inputStream.read()) != -1) {
            try {
                int i3 = this.f47978f + 1;
                this.f47978f = i3;
                if (this.f47975c) {
                    this.f47976d = 6;
                    this.f47975c = false;
                    MethodCollector.o(14336);
                    return false;
                }
                int i4 = this.f47976d;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.f47976d = 5;
                                } else if (i4 != 5) {
                                    i.b(false);
                                } else {
                                    int i5 = ((this.f47977e << 8) + read) - 2;
                                    com.facebook.common.k.e.a(inputStream, (long) i5);
                                    this.f47978f += i5;
                                    this.f47976d = 2;
                                }
                            } else if (read == 255) {
                                this.f47976d = 3;
                            } else if (read == 0) {
                                this.f47976d = 2;
                            } else if (read == 217) {
                                this.f47975c = true;
                                a(i3 - 2);
                                this.f47976d = 2;
                            } else {
                                if (read == 218) {
                                    a(i3 - 2);
                                } else if (read == 1 || ((read >= 208 && read <= 215) || read == 217 || read == 216)) {
                                    this.f47976d = 2;
                                }
                                this.f47976d = 4;
                            }
                        } else if (read == 255) {
                            this.f47976d = 3;
                        }
                    } else if (read == 216) {
                        this.f47976d = 2;
                    } else {
                        this.f47976d = 6;
                    }
                } else if (read == 255) {
                    this.f47976d = 1;
                } else {
                    this.f47976d = 6;
                }
                this.f47977e = read;
            } catch (IOException e2) {
                m.b(e2);
            }
        }
        if (this.f47976d == 6 || this.f47973a == i2) {
            MethodCollector.o(14336);
            return false;
        }
        MethodCollector.o(14336);
        return true;
    }
}
