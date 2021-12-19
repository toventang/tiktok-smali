package com.bytedance.common.wschannel.channel.a.a.b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k.f;
import k.h;
import k.i;

final class e {

    /* renamed from: a  reason: collision with root package name */
    final long f27131a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f27132b;

    /* renamed from: c  reason: collision with root package name */
    final h f27133c;

    /* renamed from: d  reason: collision with root package name */
    final a f27134d;

    /* renamed from: e  reason: collision with root package name */
    boolean f27135e;

    /* renamed from: f  reason: collision with root package name */
    int f27136f;

    /* renamed from: g  reason: collision with root package name */
    long f27137g;

    /* renamed from: h  reason: collision with root package name */
    boolean f27138h;

    /* renamed from: i  reason: collision with root package name */
    boolean f27139i;

    /* renamed from: j  reason: collision with root package name */
    final f f27140j = new f();

    /* renamed from: k  reason: collision with root package name */
    private final f f27141k = new f();

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f27142l;

    /* renamed from: m  reason: collision with root package name */
    private final f.b f27143m;

    public interface a {
        static {
            Covode.recordClassIndex(16003);
        }

        void a(int i2, String str);

        void a(String str);

        void a(i iVar);

        void b();

        void b(i iVar);
    }

    static {
        Covode.recordClassIndex(16002);
    }

    private void d() {
        while (!this.f27135e) {
            a();
            long j2 = this.f27137g;
            if (j2 > this.f27131a) {
                a(j2);
                return;
            } else if (this.f27139i) {
                b();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        while (!this.f27135e) {
            long j2 = this.f27137g;
            if (j2 > 0) {
                this.f27133c.a(this.f27140j, j2);
                if (!this.f27132b) {
                    this.f27140j.a(this.f27143m);
                    this.f27143m.a(this.f27140j.f158864b - this.f27137g);
                    d.a(this.f27143m, this.f27142l);
                    this.f27143m.close();
                }
            }
            if (!this.f27138h) {
                d();
                if (this.f27136f != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f27136f));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        String str;
        long j2 = this.f27137g;
        if (j2 > 0) {
            this.f27133c.a(this.f27141k, j2);
            if (!this.f27132b) {
                this.f27141k.a(this.f27143m);
                this.f27143m.a(0);
                d.a(this.f27143m, this.f27142l);
                this.f27143m.close();
            }
        }
        int i2 = this.f27136f;
        if (i2 == 9) {
            this.f27134d.b(this.f27141k.q());
        } else if (i2 == 10) {
            a aVar = this.f27134d;
            this.f27141k.q();
            aVar.b();
        } else if (i2 == 8) {
            short s = 1005;
            long j3 = this.f27141k.f158864b;
            if (j3 != 1) {
                if (j3 != 0) {
                    s = this.f27141k.i();
                    str = this.f27141k.r();
                    String a2 = d.a(s);
                    if (a2 != null) {
                        throw new ProtocolException(a2);
                    }
                } else {
                    str = "";
                }
                this.f27134d.a(s, str);
                this.f27135e = true;
                return;
            }
            throw new ProtocolException("Malformed close payload length of 1.");
        } else {
            throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f27136f));
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.f27135e) {
            long timeoutNanos = this.f27133c.timeout().timeoutNanos();
            this.f27133c.timeout().clearTimeout();
            try {
                int h2 = this.f27133c.h() & 255;
                this.f27133c.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.f27136f = h2 & 15;
                boolean z6 = true;
                if ((h2 & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f27138h = z;
                if ((h2 & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f27139i = z2;
                if (!z2 || z) {
                    if ((h2 & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((h2 & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((h2 & 16) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z3 || z4 || z5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    int h3 = this.f27133c.h() & 255;
                    if ((h3 & 128) == 0) {
                        z6 = false;
                    }
                    if (z6 == this.f27132b) {
                        if (this.f27132b) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j2 = (long) (h3 & 127);
                    this.f27137g = j2;
                    if (j2 == 126) {
                        this.f27137g = ((long) this.f27133c.i()) & 65535;
                    } else if (j2 == 127) {
                        long k2 = this.f27133c.k();
                        this.f27137g = k2;
                        if (k2 < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f27137g) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.f27139i && this.f27137g > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z6) {
                        this.f27133c.b(this.f27142l);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f27133c.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        try {
            this.f27133c.l(j2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    e(boolean z, h hVar, a aVar, long j2) {
        byte[] bArr;
        Objects.requireNonNull(hVar, "source == null");
        this.f27132b = z;
        this.f27133c = hVar;
        this.f27134d = aVar;
        this.f27131a = j2;
        f.b bVar = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.f27142l = bArr;
        this.f27143m = !z ? new f.b() : bVar;
    }
}
