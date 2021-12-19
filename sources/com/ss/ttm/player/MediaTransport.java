package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public abstract class MediaTransport extends NativeObject {
    static {
        Covode.recordClassIndex(101306);
    }

    private native void nativeSetFilterType(int i2);

    /* access modifiers changed from: protected */
    public abstract void sendPacket(MediaPacket mediaPacket);

    public static class MediaPacket {

        /* renamed from: a  reason: collision with root package name */
        public ByteBuffer f151952a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f151953b;

        /* renamed from: c  reason: collision with root package name */
        public int f151954c;

        /* renamed from: d  reason: collision with root package name */
        public int f151955d;

        /* renamed from: e  reason: collision with root package name */
        public long f151956e;

        /* renamed from: f  reason: collision with root package name */
        public int f151957f;

        /* renamed from: g  reason: collision with root package name */
        public int f151958g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f151959h;

        static {
            Covode.recordClassIndex(101307);
        }

        public void set(ByteBuffer byteBuffer, boolean z, boolean z2, int i2, int i3, long j2, int i4, int i5) {
            this.f151952a = byteBuffer;
            this.f151954c = i2;
            this.f151955d = i3;
            this.f151956e = j2;
            this.f151957f = i4;
            this.f151953b = z;
            this.f151958g = i5;
            this.f151959h = z2;
        }
    }
}
