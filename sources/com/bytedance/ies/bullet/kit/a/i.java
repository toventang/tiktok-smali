package com.bytedance.ies.bullet.kit.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.a.b.a;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.o;
import h.f.b.l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class i extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private an f32258a = new an("bdx_resourceloader_comsume", null, null, 254);

    /* renamed from: b  reason: collision with root package name */
    private boolean f32259b = true;

    /* renamed from: c  reason: collision with root package name */
    private List<Byte> f32260c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f32261d = true;

    /* renamed from: e  reason: collision with root package name */
    private final f f32262e;

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f32263f;

    static {
        Covode.recordClassIndex(18913);
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.f32263f.available();
        } catch (Exception e2) {
            a(e2);
            throw e2;
        }
    }

    public final boolean markSupported() {
        try {
            return this.f32263f.markSupported();
        } catch (Exception e2) {
            a(e2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.f32263f.reset();
        } catch (Exception e2) {
            a(e2);
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        try {
            this.f32263f.close();
            if (this.f32259b) {
                an anVar = this.f32258a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_state", "success");
                jSONObject.put("res_from", this.f32262e.b());
                anVar.f32554g = jSONObject;
                o oVar = (o) e.a.a().a(o.class);
                if (oVar != null) {
                    oVar.a(this.f32258a);
                }
                if (l.a((Object) this.f32262e.f32246g, (Object) "template") && this.f32261d) {
                    a aVar = a.b.f32215a;
                    String str = this.f32262e.f32241b;
                    if (str == null) {
                        str = "";
                    }
                    List<Byte> list = this.f32260c;
                    l.c(str, "");
                    l.c(list, "");
                    if (str.length() != 0 && !list.isEmpty()) {
                        b.i.b(new a.d(aVar, list, str), b.i.f4824a);
                    }
                }
            }
        } catch (Exception e2) {
            a(e2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.i(10853);
        try {
            int read = this.f32263f.read();
            if (!this.f32262e.f32247h) {
                this.f32261d = false;
                MethodCollector.o(10853);
                return read;
            }
            if (read != -1 && a.b.f32215a.a(this.f32262e.f32241b) == null) {
                try {
                    this.f32260c.add(Byte.valueOf((byte) read));
                } catch (OutOfMemoryError unused) {
                    this.f32260c.clear();
                    this.f32261d = false;
                }
            }
            MethodCollector.o(10853);
            return read;
        } catch (Exception e2) {
            a(e2);
            MethodCollector.o(10853);
            throw e2;
        }
    }

    public final void mark(int i2) {
        try {
            this.f32263f.mark(i2);
        } catch (Exception e2) {
            a(e2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        try {
            return this.f32263f.skip(j2);
        } catch (Exception e2) {
            a(e2);
            throw e2;
        }
    }

    private final void a(Exception exc) {
        this.f32259b = false;
        an anVar = this.f32258a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_state", "failed");
        jSONObject.put("res_from", this.f32262e.b());
        jSONObject.put("res_message", exc.getMessage());
        anVar.f32554g = jSONObject;
        o oVar = (o) e.a.a().a(o.class);
        if (oVar != null) {
            oVar.a(this.f32258a);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.i(10855);
        try {
            int read = this.f32263f.read(bArr);
            if (!this.f32262e.f32247h) {
                this.f32261d = false;
                MethodCollector.o(10855);
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && a.b.f32215a.a(this.f32262e.f32241b) == null) {
                try {
                    if (read == bArr.length) {
                        this.f32260c.addAll(h.a.i.a(bArr));
                    } else {
                        this.f32260c.addAll(h.a.i.a(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    this.f32260c.clear();
                    this.f32261d = false;
                }
            }
            MethodCollector.o(10855);
            return read;
        } catch (Exception e2) {
            a(e2);
            MethodCollector.o(10855);
            throw e2;
        }
    }

    public i(f fVar, InputStream inputStream) {
        l.c(fVar, "");
        l.c(inputStream, "");
        MethodCollector.i(11188);
        this.f32262e = fVar;
        this.f32263f = inputStream;
        MethodCollector.o(11188);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(11031);
        try {
            int read = this.f32263f.read(bArr, i2, i3);
            if (!this.f32262e.f32247h) {
                this.f32261d = false;
                MethodCollector.o(11031);
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && a.b.f32215a.a(this.f32262e.f32241b) == null) {
                try {
                    if (read == bArr.length) {
                        this.f32260c.addAll(h.a.i.a(bArr));
                    } else {
                        this.f32260c.addAll(h.a.i.a(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    this.f32260c.clear();
                    this.f32261d = false;
                }
            }
            MethodCollector.o(11031);
            return read;
        } catch (Exception e2) {
            a(e2);
            MethodCollector.o(11031);
            throw e2;
        }
    }
}
