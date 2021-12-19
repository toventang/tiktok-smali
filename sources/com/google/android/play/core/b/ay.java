package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;

public final class ay extends ax {

    /* renamed from: a  reason: collision with root package name */
    private final ax f53121a;

    /* renamed from: b  reason: collision with root package name */
    private final long f53122b;

    /* renamed from: c  reason: collision with root package name */
    private final long f53123c;

    static {
        Covode.recordClassIndex(32806);
    }

    public ay(ax axVar, long j2, long j3) {
        this.f53121a = axVar;
        long a2 = a(j2);
        this.f53122b = a2;
        this.f53123c = a(a2 + j3);
    }

    private final long a(long j2) {
        if (j2 < 0) {
            return 0;
        }
        return j2 > this.f53121a.a() ? this.f53121a.a() : j2;
    }

    @Override // com.google.android.play.core.b.ax
    public final long a() {
        return this.f53123c - this.f53122b;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.b.ax
    public final InputStream a(long j2, long j3) {
        long a2 = a(this.f53122b);
        return this.f53121a.a(a2, a(j3 + a2) - a2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
