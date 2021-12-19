package com.bytedance.common.wschannel.channel.a.a.b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import k.ab;
import k.f;
import k.g;
import k.i;
import k.y;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    final boolean f27144a;

    /* renamed from: b  reason: collision with root package name */
    final Random f27145b;

    /* renamed from: c  reason: collision with root package name */
    final g f27146c;

    /* renamed from: d  reason: collision with root package name */
    final k.f f27147d;

    /* renamed from: e  reason: collision with root package name */
    boolean f27148e;

    /* renamed from: f  reason: collision with root package name */
    final k.f f27149f = new k.f();

    /* renamed from: g  reason: collision with root package name */
    final a f27150g = new a();

    /* renamed from: h  reason: collision with root package name */
    boolean f27151h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f27152i;

    /* renamed from: j  reason: collision with root package name */
    private final f.b f27153j;

    static {
        Covode.recordClassIndex(16004);
    }

    /* access modifiers changed from: package-private */
    public final class a implements y {

        /* renamed from: a  reason: collision with root package name */
        int f27154a;

        /* renamed from: b  reason: collision with root package name */
        long f27155b;

        /* renamed from: c  reason: collision with root package name */
        boolean f27156c;

        /* renamed from: d  reason: collision with root package name */
        boolean f27157d;

        static {
            Covode.recordClassIndex(16005);
        }

        @Override // k.y
        public final ab timeout() {
            return f.this.f27146c.timeout();
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
            if (!this.f27157d) {
                f fVar = f.this;
                fVar.a(this.f27154a, fVar.f27149f.f158864b, this.f27156c, false);
                this.f27156c = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f27157d) {
                f fVar = f.this;
                fVar.a(this.f27154a, fVar.f27149f.f158864b, this.f27156c, true);
                this.f27157d = true;
                f.this.f27151h = false;
                return;
            }
            throw new IOException("closed");
        }

        a() {
        }

        @Override // k.y
        public final void write(k.f fVar, long j2) {
            boolean z;
            if (!this.f27157d) {
                f.this.f27149f.write(fVar, j2);
                if (!this.f27156c || this.f27155b == -1 || f.this.f27149f.f158864b <= this.f27155b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long g2 = f.this.f27149f.g();
                if (g2 > 0 && !z) {
                    f.this.a(this.f27154a, g2, this.f27156c, false);
                    this.f27156c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, i iVar) {
        if (!this.f27148e) {
            int size = iVar.size();
            if (((long) size) <= 125) {
                this.f27147d.a(i2 | 128);
                if (this.f27144a) {
                    this.f27147d.a(size | 128);
                    this.f27145b.nextBytes(this.f27152i);
                    this.f27147d.a(this.f27152i);
                    if (size > 0) {
                        long j2 = this.f27147d.f158864b;
                        this.f27147d.a(iVar);
                        this.f27147d.a(this.f27153j);
                        this.f27153j.a(j2);
                        d.a(this.f27153j, this.f27152i);
                        this.f27153j.close();
                    }
                } else {
                    this.f27147d.a(size);
                    this.f27147d.a(iVar);
                }
                this.f27146c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    f(boolean z, g gVar, Random random) {
        byte[] bArr;
        Objects.requireNonNull(gVar, "sink == null");
        Objects.requireNonNull(random, "random == null");
        this.f27144a = z;
        this.f27146c = gVar;
        this.f27147d = gVar.a();
        this.f27145b = random;
        f.b bVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.f27152i = bArr;
        this.f27153j = z ? new f.b() : bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2, boolean z, boolean z2) {
        if (!this.f27148e) {
            int i3 = 0;
            if (!z) {
                i2 = 0;
            }
            if (z2) {
                i2 |= 128;
            }
            this.f27147d.a(i2);
            if (this.f27144a) {
                i3 = 128;
            }
            if (j2 <= 125) {
                this.f27147d.a(((int) j2) | i3);
            } else if (j2 <= 65535) {
                this.f27147d.a(i3 | 126);
                this.f27147d.b((int) j2);
            } else {
                this.f27147d.a(i3 | 127);
                this.f27147d.m(j2);
            }
            if (this.f27144a) {
                this.f27145b.nextBytes(this.f27152i);
                this.f27147d.a(this.f27152i);
                if (j2 > 0) {
                    long j3 = this.f27147d.f158864b;
                    this.f27147d.write(this.f27149f, j2);
                    this.f27147d.a(this.f27153j);
                    this.f27153j.a(j3);
                    d.a(this.f27153j, this.f27152i);
                    this.f27153j.close();
                }
            } else {
                this.f27147d.write(this.f27149f, j2);
            }
            this.f27146c.c();
            return;
        }
        throw new IOException("closed");
    }
}
