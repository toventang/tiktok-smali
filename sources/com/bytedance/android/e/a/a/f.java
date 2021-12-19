package com.bytedance.android.e.a.a;

import com.bytedance.android.e.a.a.d;
import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f6861a = -1;

    /* renamed from: b  reason: collision with root package name */
    private d.b f6862b;

    /* renamed from: c  reason: collision with root package name */
    private long f6863c;

    /* renamed from: d  reason: collision with root package name */
    private long f6864d = Long.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f6865e;

    /* renamed from: f  reason: collision with root package name */
    private int f6866f = 2;

    /* renamed from: g  reason: collision with root package name */
    private int f6867g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f6868h = -1;

    static {
        Covode.recordClassIndex(3332);
    }

    public final byte[] c() {
        return this.f6862b.b(j());
    }

    public final String d() {
        return this.f6862b.c(j());
    }

    private long j() {
        if (this.f6866f == 2) {
            long j2 = this.f6864d;
            long j3 = j2 - this.f6863c;
            this.f6866f = 6;
            this.f6863c = j2;
            this.f6864d = this.f6868h;
            this.f6868h = -1;
            return j3;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f6866f);
    }

    public final long a() {
        if (this.f6866f == 2) {
            int i2 = this.f6865e + 1;
            this.f6865e = i2;
            if (i2 <= 65) {
                long j2 = this.f6868h;
                this.f6868h = -1;
                this.f6866f = 6;
                return j2;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    public final int e() {
        int i2 = this.f6866f;
        if (i2 == 0 || i2 == 2) {
            int i3 = i();
            b(0);
            return i3;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f6866f);
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        int i2 = this.f6866f;
        if (i2 == 5 || i2 == 2) {
            this.f6863c += 4;
            int c2 = this.f6862b.c();
            b(5);
            return c2;
        }
        throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f6866f);
    }

    /* access modifiers changed from: package-private */
    public final long h() {
        int i2 = this.f6866f;
        if (i2 == 1 || i2 == 2) {
            this.f6863c += 8;
            long d2 = this.f6862b.d();
            b(1);
            return d2;
        }
        throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f6866f);
    }

    private int i() {
        int i2;
        this.f6863c++;
        byte b2 = this.f6862b.b();
        if (b2 >= 0) {
            return b2;
        }
        int i3 = b2 & Byte.MAX_VALUE;
        this.f6863c++;
        byte b3 = this.f6862b.b();
        if (b3 >= 0) {
            i2 = b3 << 7;
        } else {
            i3 |= (b3 & Byte.MAX_VALUE) << 7;
            this.f6863c++;
            byte b4 = this.f6862b.b();
            if (b4 >= 0) {
                i2 = b4 << 14;
            } else {
                i3 |= (b4 & Byte.MAX_VALUE) << 14;
                this.f6863c++;
                byte b5 = this.f6862b.b();
                if (b5 >= 0) {
                    i2 = b5 << 21;
                } else {
                    this.f6863c++;
                    byte b6 = this.f6862b.b();
                    int i4 = i3 | ((b5 & Byte.MAX_VALUE) << 21) | (b6 << 28);
                    if (b6 >= 0) {
                        return i4;
                    }
                    int i5 = 0;
                    do {
                        this.f6863c++;
                        if (this.f6862b.b() >= 0) {
                            return i4;
                        }
                        i5++;
                    } while (i5 < 5);
                    throw new ProtocolException("Malformed VARINT");
                }
            }
        }
        return i3 | i2;
    }

    public final long f() {
        int i2 = this.f6866f;
        if (i2 == 0 || i2 == 2) {
            long j2 = 0;
            int i3 = 0;
            do {
                this.f6863c++;
                byte b2 = this.f6862b.b();
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i3;
                if ((b2 & 128) == 0) {
                    b(0);
                    return j2;
                }
                i3 += 7;
            } while (i3 < 64);
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f6866f);
    }

    public final int b() {
        int i2 = this.f6866f;
        if (i2 == 7) {
            this.f6866f = 2;
            return this.f6867g;
        } else if (i2 == 6) {
            while (this.f6863c < this.f6864d && this.f6862b.a()) {
                int i3 = i();
                if (i3 != 0) {
                    int i4 = i3 >> 3;
                    this.f6867g = i4;
                    int i5 = i3 & 7;
                    if (i5 == 0) {
                        this.f6861a = 0;
                        this.f6866f = 0;
                        return i4;
                    } else if (i5 == 1) {
                        this.f6861a = 1;
                        this.f6866f = 1;
                        return i4;
                    } else if (i5 == 2) {
                        this.f6861a = 2;
                        this.f6866f = 2;
                        int i6 = i();
                        if (i6 < 0) {
                            throw new ProtocolException("Negative length: ".concat(String.valueOf(i6)));
                        } else if (this.f6868h == -1) {
                            long j2 = this.f6864d;
                            this.f6868h = j2;
                            long j3 = this.f6863c + ((long) i6);
                            this.f6864d = j3;
                            if (j3 <= j2) {
                                return this.f6867g;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i5 == 3) {
                        a(i4);
                    } else if (i5 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i5 == 5) {
                        this.f6861a = 5;
                        this.f6866f = 5;
                        return i4;
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i5)));
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    public final f a(d.b bVar) {
        this.f6862b = bVar;
        this.f6863c = 0;
        this.f6864d = Long.MAX_VALUE;
        this.f6865e = 0;
        this.f6866f = 2;
        this.f6867g = -1;
        this.f6868h = -1;
        this.f6861a = -1;
        return this;
    }

    private void a(int i2) {
        while (this.f6863c < this.f6864d && this.f6862b.a()) {
            int i3 = i();
            if (i3 != 0) {
                int i4 = i3 >> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    this.f6866f = 0;
                    f();
                } else if (i5 == 1) {
                    this.f6866f = 1;
                    h();
                } else if (i5 == 2) {
                    long i6 = (long) i();
                    this.f6863c += i6;
                    this.f6862b.a(i6);
                } else if (i5 == 3) {
                    a(i4);
                } else if (i5 != 4) {
                    if (i5 == 5) {
                        this.f6866f = 5;
                        g();
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i5)));
                    }
                } else if (i4 != i2) {
                    throw new ProtocolException("Unexpected end group");
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    private void b(int i2) {
        if (this.f6866f == i2) {
            this.f6866f = 6;
            return;
        }
        long j2 = this.f6863c;
        long j3 = this.f6864d;
        if (j2 > j3) {
            throw new IOException("Expected to end at " + this.f6864d + " but was " + this.f6863c);
        } else if (j2 == j3) {
            this.f6864d = this.f6868h;
            this.f6868h = -1;
            this.f6866f = 6;
        } else {
            this.f6866f = 7;
        }
    }

    public final void a(long j2) {
        if (this.f6866f == 6) {
            int i2 = this.f6865e - 1;
            this.f6865e = i2;
            if (i2 < 0 || this.f6868h != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.f6863c == this.f6864d || i2 == 0) {
                this.f6864d = j2;
            } else {
                throw new IOException("Expected to end at " + this.f6864d + " but was " + this.f6863c);
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }
}
