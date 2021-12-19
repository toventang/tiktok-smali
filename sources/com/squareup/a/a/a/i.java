package com.squareup.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.a.a.a.b;
import com.squareup.a.a.a.h;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.aa;
import k.ab;
import k.f;
import k.g;

public final class i implements p {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f57529a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final k.i f57530b = k.i.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f57537a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f57538b = new String[64];

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f57539c = new String[256];

        b() {
        }

        static {
            Covode.recordClassIndex(35907);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr = f57539c;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = com.a.a("%8s", new Object[]{Integer.toBinaryString(i3)}).replace(' ', '0');
                i3++;
            }
            String[] strArr2 = f57538b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i4 = 0; i4 <= 0; i4++) {
                int i5 = iArr[i4];
                String[] strArr3 = f57538b;
                strArr3[i5 | 8] = strArr3[i5] + "|PADDED";
            }
            String[] strArr4 = f57538b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            int i6 = 0;
            do {
                int i7 = iArr2[i6];
                int i8 = 0;
                do {
                    int i9 = iArr[i8];
                    String[] strArr5 = f57538b;
                    int i10 = i9 | i7;
                    strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                    strArr5[i10 | 8] = strArr5[i9] + '|' + strArr5[i7] + "|PADDED";
                    i8++;
                } while (i8 <= 0);
                i6++;
            } while (i6 < 3);
            while (true) {
                String[] strArr6 = f57538b;
                if (i2 < strArr6.length) {
                    if (strArr6[i2] == null) {
                        strArr6[i2] = f57539c[i2];
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }

        private static String a(byte b2, byte b3) {
            String str;
            if (b3 == 0) {
                return "";
            }
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    if (b3 == 1) {
                        return "ACK";
                    }
                    return f57539c[b3];
                } else if (!(b2 == 7 || b2 == 8)) {
                    String[] strArr = f57538b;
                    if (b3 < strArr.length) {
                        str = strArr[b3];
                    } else {
                        str = f57539c[b3];
                    }
                    if (b2 == 5) {
                        if ((b3 & 4) != 0) {
                            return str.replace("HEADERS", "PUSH_PROMISE");
                        }
                    } else if (b2 == 0 && (b3 & 32) != 0) {
                        return str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            }
            return f57539c[b3];
        }

        static String a(boolean z, int i2, int i3, byte b2, byte b3) {
            String a2;
            String str;
            String[] strArr = f57537a;
            if (b2 < strArr.length) {
                a2 = strArr[b2];
            } else {
                a2 = com.a.a("0x%02x", new Object[]{Byte.valueOf(b2)});
            }
            String a3 = a(b2, b3);
            Object[] objArr = new Object[5];
            if (z) {
                str = "<<";
            } else {
                str = ">>";
            }
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Integer.valueOf(i3);
            objArr[3] = a2;
            objArr[4] = a3;
            return com.a.a("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final g f57544a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f57545b;

        /* renamed from: c  reason: collision with root package name */
        private final f f57546c;

        /* renamed from: d  reason: collision with root package name */
        private final h.b f57547d;

        /* renamed from: e  reason: collision with root package name */
        private int f57548e = 16384;

        /* renamed from: f  reason: collision with root package name */
        private boolean f57549f;

        static {
            Covode.recordClassIndex(35909);
        }

        @Override // com.squareup.a.a.a.c
        public final int c() {
            return this.f57548e;
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(boolean z, boolean z2, int i2, List<f> list) {
            MethodCollector.i(13650);
            if (!this.f57549f) {
                this.f57547d.a(list);
                long j2 = this.f57546c.f158864b;
                int min = (int) Math.min((long) this.f57548e, j2);
                long j3 = (long) min;
                byte b2 = j2 == j3 ? (byte) 4 : 0;
                if (z) {
                    b2 = (byte) (b2 | 1);
                }
                a(i2, min, (byte) 1, b2);
                this.f57544a.write(this.f57546c, j3);
                if (j2 > j3) {
                    b(i2, j2 - j3);
                }
                MethodCollector.o(13650);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13650);
                throw iOException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(boolean z, int i2, f fVar, int i3) {
            MethodCollector.i(13767);
            if (!this.f57549f) {
                a(i2, i3, (byte) 0, z ? (byte) 1 : 0);
                if (i3 > 0) {
                    this.f57544a.write(fVar, (long) i3);
                }
                MethodCollector.o(13767);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13767);
                throw iOException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(boolean z, int i2, int i3) {
            MethodCollector.i(13820);
            if (!this.f57549f) {
                a(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f57544a.c(i2);
                this.f57544a.c(i3);
                this.f57544a.flush();
                MethodCollector.o(13820);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13820);
                throw iOException;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            MethodCollector.i(13873);
            this.f57549f = true;
            this.f57544a.close();
            MethodCollector.o(13873);
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void b() {
            MethodCollector.i(13506);
            if (!this.f57549f) {
                this.f57544a.flush();
                MethodCollector.o(13506);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13506);
                throw iOException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a() {
            MethodCollector.i(13573);
            if (this.f57549f) {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13573);
                throw iOException;
            } else if (!this.f57545b) {
                MethodCollector.o(13573);
            } else {
                if (i.f57529a.isLoggable(Level.FINE)) {
                    i.f57529a.fine(com.a.a(">> CONNECTION %s", new Object[]{i.f57530b.hex()}));
                }
                this.f57544a.a(i.f57530b.toByteArray());
                this.f57544a.flush();
                MethodCollector.o(13573);
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void b(n nVar) {
            int i2;
            MethodCollector.i(13818);
            if (!this.f57549f) {
                int i3 = 0;
                a(0, Integer.bitCount(nVar.f57566a) * 6, (byte) 4, (byte) 0);
                while (true) {
                    if (nVar.a(i3)) {
                        if (i3 == 4) {
                            i2 = 3;
                        } else if (i3 == 7) {
                            i2 = 4;
                        } else {
                            i2 = i3;
                        }
                        this.f57544a.b(i2);
                        this.f57544a.c(nVar.f57569d[i3]);
                    }
                    i3++;
                    if (i3 >= 10) {
                        this.f57544a.flush();
                        MethodCollector.o(13818);
                    }
                }
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13818);
                throw iOException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(n nVar) {
            MethodCollector.i(13572);
            if (!this.f57549f) {
                int i2 = this.f57548e;
                if ((nVar.f57566a & 32) != 0) {
                    i2 = nVar.f57569d[5];
                }
                this.f57548e = i2;
                a(0, 0, (byte) 4, (byte) 1);
                this.f57544a.flush();
                MethodCollector.o(13572);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13572);
                throw iOException;
            }
        }

        d(g gVar, boolean z) {
            this.f57544a = gVar;
            this.f57545b = z;
            f fVar = new f();
            this.f57546c = fVar;
            this.f57547d = new h.b(fVar);
        }

        private void b(int i2, long j2) {
            byte b2;
            while (j2 > 0) {
                int min = (int) Math.min((long) this.f57548e, j2);
                long j3 = (long) min;
                j2 -= j3;
                if (j2 == 0) {
                    b2 = 4;
                } else {
                    b2 = 0;
                }
                a(i2, min, (byte) 9, b2);
                this.f57544a.write(this.f57546c, j3);
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(int i2, a aVar) {
            MethodCollector.i(13713);
            if (this.f57549f) {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13713);
                throw iOException;
            } else if (aVar.httpCode != -1) {
                a(i2, 4, (byte) 3, (byte) 0);
                this.f57544a.c(aVar.httpCode);
                this.f57544a.flush();
                MethodCollector.o(13713);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                MethodCollector.o(13713);
                throw illegalArgumentException;
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(int i2, long j2) {
            MethodCollector.i(13872);
            if (this.f57549f) {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13872);
                throw iOException;
            } else if (j2 == 0 || j2 > 2147483647L) {
                IllegalArgumentException a2 = i.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
                MethodCollector.o(13872);
                throw a2;
            } else {
                a(i2, 4, (byte) 8, (byte) 0);
                this.f57544a.c((int) j2);
                this.f57544a.flush();
                MethodCollector.o(13872);
            }
        }

        @Override // com.squareup.a.a.a.c
        public final synchronized void a(int i2, a aVar, byte[] bArr) {
            MethodCollector.i(13871);
            if (this.f57549f) {
                IOException iOException = new IOException("closed");
                MethodCollector.o(13871);
                throw iOException;
            } else if (aVar.httpCode != -1) {
                a(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f57544a.c(i2);
                this.f57544a.c(aVar.httpCode);
                if (bArr.length > 0) {
                    this.f57544a.a(bArr);
                }
                this.f57544a.flush();
                MethodCollector.o(13871);
            } else {
                IllegalArgumentException a2 = i.a("errorCode.httpCode == -1", new Object[0]);
                MethodCollector.o(13871);
                throw a2;
            }
        }

        private void a(int i2, int i3, byte b2, byte b3) {
            if (i.f57529a.isLoggable(Level.FINE)) {
                i.f57529a.fine(b.a(false, i2, i3, b2, b3));
            }
            int i4 = this.f57548e;
            if (i3 > i4) {
                throw i.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            } else if ((Integer.MIN_VALUE & i2) == 0) {
                i.a(this.f57544a, i3);
                this.f57544a.a(b2 & 255);
                this.f57544a.a(b3 & 255);
                this.f57544a.c(i2 & Integer.MAX_VALUE);
            } else {
                throw i.a("reserved bit set: %s", Integer.valueOf(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements aa {

        /* renamed from: a  reason: collision with root package name */
        int f57531a;

        /* renamed from: b  reason: collision with root package name */
        byte f57532b;

        /* renamed from: c  reason: collision with root package name */
        int f57533c;

        /* renamed from: d  reason: collision with root package name */
        int f57534d;

        /* renamed from: e  reason: collision with root package name */
        short f57535e;

        /* renamed from: f  reason: collision with root package name */
        private final k.h f57536f;

        static {
            Covode.recordClassIndex(35906);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // k.aa
        public final ab timeout() {
            return this.f57536f.timeout();
        }

        public a(k.h hVar) {
            this.f57536f = hVar;
        }

        @Override // k.aa
        public final long read(f fVar, long j2) {
            int i2;
            int j3;
            do {
                int i3 = this.f57534d;
                if (i3 == 0) {
                    this.f57536f.l((long) this.f57535e);
                    this.f57535e = 0;
                    if ((this.f57532b & 4) != 0) {
                        return -1;
                    }
                    i2 = this.f57533c;
                    int a2 = i.a(this.f57536f);
                    this.f57534d = a2;
                    this.f57531a = a2;
                    byte h2 = (byte) (this.f57536f.h() & 255);
                    this.f57532b = (byte) (this.f57536f.h() & 255);
                    if (i.f57529a.isLoggable(Level.FINE)) {
                        i.f57529a.fine(b.a(true, this.f57533c, this.f57531a, h2, this.f57532b));
                    }
                    j3 = this.f57536f.j() & Integer.MAX_VALUE;
                    this.f57533c = j3;
                    if (h2 != 9) {
                        throw i.b("%s != TYPE_CONTINUATION", Byte.valueOf(h2));
                    }
                } else {
                    long read = this.f57536f.read(fVar, Math.min(j2, (long) i3));
                    if (read == -1) {
                        return -1;
                    }
                    this.f57534d = (int) (((long) this.f57534d) - read);
                    return read;
                }
            } while (j3 == i2);
            throw i.b("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
    }

    static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        final h.a f57540a;

        /* renamed from: b  reason: collision with root package name */
        private final k.h f57541b;

        /* renamed from: c  reason: collision with root package name */
        private final a f57542c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f57543d;

        static {
            Covode.recordClassIndex(35908);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f57541b.close();
        }

        private void b() {
            this.f57541b.j();
            this.f57541b.h();
        }

        @Override // com.squareup.a.a.a.b
        public final void a() {
            if (!this.f57543d) {
                k.i g2 = this.f57541b.g((long) i.f57530b.size());
                if (i.f57529a.isLoggable(Level.FINE)) {
                    i.f57529a.fine(com.a.a("<< CONNECTION %s", new Object[]{g2.hex()}));
                }
                if (!i.f57530b.equals(g2)) {
                    throw i.b("Expected a connection header but was %s", g2.utf8());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v76, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v91, resolved type: boolean */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.a.a.a.b
        public final boolean a(b.a aVar) {
            boolean z;
            boolean z2;
            short s = 0;
            boolean z3 = false;
            short s2 = 0;
            short s3 = 0;
            try {
                this.f57541b.d(9);
                int a2 = i.a(this.f57541b);
                if (a2 < 0 || a2 > 16384) {
                    throw i.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
                }
                byte h2 = (byte) (this.f57541b.h() & 255);
                byte h3 = (byte) (this.f57541b.h() & 255);
                int j2 = this.f57541b.j() & Integer.MAX_VALUE;
                if (i.f57529a.isLoggable(Level.FINE)) {
                    i.f57529a.fine(b.a(true, j2, a2, h2, h3));
                }
                switch (h2) {
                    case 0:
                        if ((h3 & 1) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((h3 & 32) == 0) {
                            if ((h3 & 8) != 0) {
                                s = (short) (this.f57541b.h() & 255);
                            }
                            aVar.a(z, j2, this.f57541b, i.a(a2, h3, s));
                            this.f57541b.l((long) s);
                            break;
                        } else {
                            throw i.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                    case 1:
                        if (j2 != 0) {
                            if ((h3 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((h3 & 8) != 0) {
                                s3 = (short) (this.f57541b.h() & 255);
                            }
                            if ((h3 & 32) != 0) {
                                b();
                                a2 -= 5;
                            }
                            aVar.a(false, z2, j2, a(i.a(a2, h3, s3), s3, h3, j2), g.HTTP_20_HEADERS);
                            break;
                        } else {
                            throw i.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                    case 2:
                        if (a2 != 5) {
                            throw i.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a2));
                        } else if (j2 != 0) {
                            b();
                            break;
                        } else {
                            throw i.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                    case 3:
                        if (a2 != 4) {
                            throw i.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a2));
                        } else if (j2 != 0) {
                            int j3 = this.f57541b.j();
                            a fromHttp2 = a.fromHttp2(j3);
                            if (fromHttp2 != null) {
                                aVar.a(j2, fromHttp2);
                                break;
                            } else {
                                throw i.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(j3));
                            }
                        } else {
                            throw i.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                    case 4:
                        if (j2 != 0) {
                            throw i.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        } else if ((h3 & 1) != 0) {
                            if (a2 != 0) {
                                throw i.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                        } else if (a2 % 6 == 0) {
                            n nVar = new n();
                            for (int i2 = 0; i2 < a2; i2 += 6) {
                                short i3 = this.f57541b.i();
                                int j4 = this.f57541b.j();
                                switch (i3) {
                                    case 1:
                                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                        break;
                                    case 2:
                                        if (!(j4 == 0 || j4 == 1)) {
                                            throw i.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                        }
                                    case 3:
                                        i3 = 4;
                                        break;
                                    case 4:
                                        i3 = 7;
                                        if (j4 >= 0) {
                                            break;
                                        } else {
                                            throw i.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        }
                                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                        if (j4 >= 16384 && j4 <= 16777215) {
                                            break;
                                        } else {
                                            throw i.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(j4));
                                        }
                                        break;
                                    default:
                                        throw i.b("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(i3));
                                }
                                nVar.a(i3, 0, j4);
                            }
                            aVar.a(false, nVar);
                            if (nVar.a() >= 0) {
                                h.a aVar2 = this.f57540a;
                                int a3 = nVar.a();
                                aVar2.f57520a = a3;
                                aVar2.f57521b = a3;
                                aVar2.a();
                                break;
                            }
                        } else {
                            throw i.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a2));
                        }
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        if (j2 != 0) {
                            if ((h3 & 8) != 0) {
                                s2 = (short) (this.f57541b.h() & 255);
                            }
                            aVar.a(this.f57541b.j() & Integer.MAX_VALUE, a(i.a(a2 - 4, h3, s2), s2, h3, j2));
                            break;
                        } else {
                            throw i.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (a2 != 8) {
                            throw i.b("TYPE_PING length != 8: %s", Integer.valueOf(a2));
                        } else if (j2 == 0) {
                            int j5 = this.f57541b.j();
                            int j6 = this.f57541b.j();
                            if ((h3 & 1) != 0) {
                                z3 = true;
                            }
                            aVar.a(z3, j5, j6);
                            break;
                        } else {
                            throw i.b("TYPE_PING streamId != 0", new Object[0]);
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        if (a2 < 8) {
                            throw i.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a2));
                        } else if (j2 == 0) {
                            int j7 = this.f57541b.j();
                            int j8 = this.f57541b.j();
                            int i4 = a2 - 8;
                            if (a.fromHttp2(j8) != null) {
                                k.i iVar = k.i.EMPTY;
                                if (i4 > 0) {
                                    iVar = this.f57541b.g((long) i4);
                                }
                                aVar.a(j7, iVar);
                                break;
                            } else {
                                throw i.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(j8));
                            }
                        } else {
                            throw i.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        if (a2 == 4) {
                            long j9 = ((long) this.f57541b.j()) & 2147483647L;
                            if (j9 != 0) {
                                aVar.a(j2, j9);
                                break;
                            } else {
                                throw i.b("windowSizeIncrement was 0", Long.valueOf(j9));
                            }
                        } else {
                            throw i.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a2));
                        }
                    default:
                        this.f57541b.l((long) a2);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        c(k.h hVar, boolean z) {
            this.f57541b = hVar;
            this.f57543d = z;
            a aVar = new a(hVar);
            this.f57542c = aVar;
            this.f57540a = new h.a(aVar);
        }

        private List<f> a(int i2, short s, byte b2, int i3) {
            a aVar = this.f57542c;
            aVar.f57534d = i2;
            aVar.f57531a = i2;
            this.f57542c.f57535e = s;
            this.f57542c.f57532b = b2;
            this.f57542c.f57533c = i3;
            this.f57540a.b();
            return this.f57540a.c();
        }
    }

    static {
        Covode.recordClassIndex(35905);
    }

    public static int a(k.h hVar) {
        return (hVar.h() & 255) | ((hVar.h() & 255) << 16) | ((hVar.h() & 255) << 8);
    }

    @Override // com.squareup.a.a.a.p
    public final b a(k.h hVar, boolean z) {
        return new c(hVar, z);
    }

    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(com.a.a(str, objArr));
    }

    public static IOException b(String str, Object... objArr) {
        throw new IOException(com.a.a(str, objArr));
    }

    public static void a(g gVar, int i2) {
        gVar.a((i2 >>> 16) & 255);
        gVar.a((i2 >>> 8) & 255);
        gVar.a(i2 & 255);
    }

    @Override // com.squareup.a.a.a.p
    public final c a(g gVar, boolean z) {
        return new d(gVar, z);
    }

    public static int a(int i2, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
    }
}
