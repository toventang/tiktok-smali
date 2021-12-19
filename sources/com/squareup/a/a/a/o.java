package com.squareup.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.a.a.a.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import k.f;
import k.g;
import k.h;
import k.i;
import k.j;
import k.q;
import k.y;

public final class o implements p {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f57570a;

    static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final g f57574a;

        /* renamed from: b  reason: collision with root package name */
        private final f f57575b;

        /* renamed from: c  reason: collision with root package name */
        private final g f57576c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f57577d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f57578e;

        static {
            Covode.recordClassIndex(35921);
        }

        @Override // com.squareup.a.a.a.c
        public final void a(n nVar) {
        }

        @Override // com.squareup.a.a.a.c
        public final int c() {
            return 16383;
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(boolean z, boolean z2, int i2, List<f> list) {
            MethodCollector.i(12892);
            if (!this.f57578e) {
                a(list);
                int i3 = (int) (this.f57575b.f158864b + 10);
                int i4 = z ? 1 : 0;
                this.f57574a.c(-2147287039);
                this.f57574a.c((((i4 | 0) & 255) << 24) | (i3 & 16777215));
                this.f57574a.c(i2 & Integer.MAX_VALUE);
                this.f57574a.c(0);
                this.f57574a.b(0);
                this.f57574a.a(this.f57575b);
                this.f57574a.flush();
                MethodCollector.o(12892);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(12892);
                throw iOException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(boolean z, int i2, f fVar, int i3) {
            MethodCollector.i(12993);
            int i4 = z ? 1 : 0;
            if (!this.f57578e) {
                long j2 = (long) i3;
                if (j2 <= 16777215) {
                    this.f57574a.c(i2 & Integer.MAX_VALUE);
                    this.f57574a.c(((i4 & 255) << 24) | (16777215 & i3));
                    if (i3 > 0) {
                        this.f57574a.write(fVar, j2);
                    }
                    MethodCollector.o(12993);
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: ".concat(String.valueOf(i3)));
                    MethodCollector.o(12993);
                    throw illegalArgumentException;
                }
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(12993);
                throw iOException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a() {
            MethodCollector.i(12784);
            MethodCollector.o(12784);
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void b() {
            MethodCollector.i(12785);
            if (!this.f57578e) {
                this.f57574a.flush();
                MethodCollector.o(12785);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(12785);
                throw iOException;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            MethodCollector.i(13174);
            this.f57578e = true;
            g gVar = this.f57574a;
            g gVar2 = this.f57576c;
            Error th = null;
            try {
                gVar.close();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                gVar2.close();
                if (th == null) {
                    MethodCollector.o(13174);
                } else if (th instanceof IOException) {
                    IOException iOException = (IOException) th;
                    MethodCollector.o(13174);
                    throw iOException;
                } else if (th instanceof RuntimeException) {
                    RuntimeException runtimeException = (RuntimeException) th;
                    MethodCollector.o(13174);
                    throw runtimeException;
                } else if (th instanceof Error) {
                    Error error = th;
                    MethodCollector.o(13174);
                    throw error;
                } else {
                    AssertionError assertionError = new AssertionError(th);
                    MethodCollector.o(13174);
                    throw assertionError;
                }
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
        }

        private void a(List<f> list) {
            this.f57576c.c(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = list.get(i2).f57514h;
                this.f57576c.c(iVar.size());
                this.f57576c.a(iVar);
                i iVar2 = list.get(i2).f57515i;
                this.f57576c.c(iVar2.size());
                this.f57576c.a(iVar2);
            }
            this.f57576c.flush();
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void b(n nVar) {
            MethodCollector.i(12995);
            if (!this.f57578e) {
                int bitCount = Integer.bitCount(nVar.f57566a);
                this.f57574a.c(-2147287036);
                int i2 = 0;
                this.f57574a.c((((bitCount * 8) + 4) & 16777215) | 0);
                this.f57574a.c(bitCount);
                while (true) {
                    if (nVar.a(i2)) {
                        this.f57574a.c(((nVar.b(i2) & 255) << 24) | (i2 & 16777215));
                        this.f57574a.c(nVar.f57569d[i2]);
                    }
                    i2++;
                    if (i2 > 10) {
                        this.f57574a.flush();
                        MethodCollector.o(12995);
                    }
                }
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(12995);
                throw iOException;
            }
        }

        b(g gVar, boolean z) {
            this.f57574a = gVar;
            this.f57577d = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(o.f57570a);
            f fVar = new f();
            this.f57575b = fVar;
            this.f57576c = q.a(new j((y) fVar, deflater));
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(int i2, long j2) {
            MethodCollector.i(13173);
            if (this.f57578e) {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13173);
                throw iOException;
            } else if (j2 == 0 || j2 > 2147483647L) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: ".concat(String.valueOf(j2)));
                MethodCollector.o(13173);
                throw illegalArgumentException;
            } else {
                this.f57574a.c(-2147287031);
                this.f57574a.c(8);
                this.f57574a.c(i2);
                this.f57574a.c((int) j2);
                this.f57574a.flush();
                MethodCollector.o(13173);
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(int i2, a aVar) {
            MethodCollector.i(12894);
            if (this.f57578e) {
                IOException iOException = new IOException("closed");
                MethodCollector.o(12894);
                throw iOException;
            } else if (aVar.spdyRstCode != -1) {
                this.f57574a.c(-2147287037);
                this.f57574a.c(8);
                this.f57574a.c(i2 & Integer.MAX_VALUE);
                this.f57574a.c(aVar.spdyRstCode);
                this.f57574a.flush();
                MethodCollector.o(12894);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                MethodCollector.o(12894);
                throw illegalArgumentException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(int i2, a aVar, byte[] bArr) {
            MethodCollector.i(13087);
            if (this.f57578e) {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13087);
                throw iOException;
            } else if (aVar.spdyGoAwayCode != -1) {
                this.f57574a.c(-2147287033);
                this.f57574a.c(8);
                this.f57574a.c(i2);
                this.f57574a.c(aVar.spdyGoAwayCode);
                this.f57574a.flush();
                MethodCollector.o(13087);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
                MethodCollector.o(13087);
                throw illegalArgumentException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(boolean z, int i2, int i3) {
            boolean z2;
            MethodCollector.i(13086);
            if (!this.f57578e) {
                boolean z3 = this.f57577d;
                boolean z4 = false;
                if ((i2 & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 != z2) {
                    z4 = true;
                }
                if (z == z4) {
                    this.f57574a.c(-2147287034);
                    this.f57574a.c(4);
                    this.f57574a.c(i2);
                    this.f57574a.flush();
                    MethodCollector.o(13086);
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("payload != reply");
                    MethodCollector.o(13086);
                    throw illegalArgumentException;
                }
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13086);
                throw iOException;
            }
        }
    }

    static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final h f57571a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f57572b;

        /* renamed from: c  reason: collision with root package name */
        private final k f57573c;

        static {
            Covode.recordClassIndex(35920);
        }

        @Override // com.squareup.a.a.a.b
        public final void a() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f57573c.f57558b.close();
        }

        @Override // com.squareup.a.a.a.b
        public final boolean a(b.a aVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7 = false;
            try {
                int j2 = this.f57571a.j();
                int j3 = this.f57571a.j();
                if ((Integer.MIN_VALUE & j2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = (-16777216 & j3) >>> 24;
                int i3 = j3 & 16777215;
                if (z) {
                    int i4 = (2147418112 & j2) >>> 16;
                    int i5 = j2 & 65535;
                    if (i4 == 3) {
                        switch (i5) {
                            case 1:
                                int j4 = this.f57571a.j();
                                this.f57571a.j();
                                int i6 = j4 & Integer.MAX_VALUE;
                                this.f57571a.i();
                                List<f> a2 = this.f57573c.a(i3 - 10);
                                if ((i2 & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ((i2 & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                aVar.a(z3, z2, i6, a2, g.SPDY_SYN_STREAM);
                                return true;
                            case 2:
                                int j5 = this.f57571a.j() & Integer.MAX_VALUE;
                                List<f> a3 = this.f57573c.a(i3 - 4);
                                if ((i2 & 1) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                aVar.a(false, z4, j5, a3, g.SPDY_REPLY);
                                return true;
                            case 3:
                                if (i3 == 8) {
                                    int j6 = this.f57571a.j() & Integer.MAX_VALUE;
                                    int j7 = this.f57571a.j();
                                    a fromSpdy3Rst = a.fromSpdy3Rst(j7);
                                    if (fromSpdy3Rst != null) {
                                        aVar.a(j6, fromSpdy3Rst);
                                        return true;
                                    }
                                    throw a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(j7));
                                }
                                throw a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i3));
                            case 4:
                                a(aVar, i2, i3);
                                return true;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            default:
                                this.f57571a.l((long) i3);
                                return true;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                if (i3 == 4) {
                                    int j8 = this.f57571a.j();
                                    boolean z8 = this.f57572b;
                                    if ((j8 & 1) == 1) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z8 == z5) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    aVar.a(z6, j8, 0);
                                    return true;
                                }
                                throw a("TYPE_PING length: %d != 4", Integer.valueOf(i3));
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                if (i3 == 8) {
                                    int j9 = this.f57571a.j() & Integer.MAX_VALUE;
                                    int j10 = this.f57571a.j();
                                    if (a.fromSpdyGoAway(j10) != null) {
                                        aVar.a(j9, i.EMPTY);
                                        return true;
                                    }
                                    throw a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(j10));
                                }
                                throw a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i3));
                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                aVar.a(false, false, this.f57571a.j() & Integer.MAX_VALUE, this.f57573c.a(i3 - 4), g.SPDY_HEADERS);
                                return true;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                if (i3 == 8) {
                                    int j11 = this.f57571a.j() & Integer.MAX_VALUE;
                                    long j12 = (long) (this.f57571a.j() & Integer.MAX_VALUE);
                                    if (j12 != 0) {
                                        aVar.a(j11, j12);
                                        return true;
                                    }
                                    throw a("windowSizeIncrement was 0", Long.valueOf(j12));
                                }
                                throw a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i3));
                        }
                    } else {
                        throw new ProtocolException("version != 3: ".concat(String.valueOf(i4)));
                    }
                } else {
                    int i7 = j2 & Integer.MAX_VALUE;
                    if ((i2 & 1) != 0) {
                        z7 = true;
                    }
                    aVar.a(z7, i7, this.f57571a, i3);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        a(h hVar, boolean z) {
            this.f57571a = hVar;
            this.f57573c = new k(hVar);
            this.f57572b = z;
        }

        private static IOException a(String str, Object... objArr) {
            throw new IOException(com.a.a(str, objArr));
        }

        private void a(b.a aVar, int i2, int i3) {
            int j2 = this.f57571a.j();
            boolean z = false;
            if (i3 == (j2 * 8) + 4) {
                n nVar = new n();
                for (int i4 = 0; i4 < j2; i4++) {
                    int j3 = this.f57571a.j();
                    int i5 = j3 & 16777215;
                    nVar.a(i5, (-16777216 & j3) >>> 24, this.f57571a.j());
                }
                if ((i2 & 1) != 0) {
                    z = true;
                }
                aVar.a(z, nVar);
                return;
            }
            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i3), Integer.valueOf(j2));
        }
    }

    static {
        Covode.recordClassIndex(35919);
        try {
            f57570a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(com.squareup.a.a.j.f57777c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.squareup.a.a.a.p
    public final b a(h hVar, boolean z) {
        return new a(hVar, z);
    }

    @Override // com.squareup.a.a.a.p
    public final c a(g gVar, boolean z) {
        return new b(gVar, z);
    }
}
