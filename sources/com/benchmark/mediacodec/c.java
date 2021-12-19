package com.benchmark.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.LinkedBlockingQueue;

public final class c extends d {

    /* renamed from: a  reason: collision with root package name */
    protected a f6246a;

    /* renamed from: b  reason: collision with root package name */
    public LinkedBlockingQueue<Integer> f6247b = new LinkedBlockingQueue<>();

    static {
        Covode.recordClassIndex(3010);
    }

    @Override // com.benchmark.mediacodec.d
    public final int b() {
        int b2 = super.b();
        if (b2 == g.f6266a) {
            this.f6247b.clear();
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    @Override // com.benchmark.mediacodec.d
    public final int a() {
        this.f6246a = new a();
        if (Build.VERSION.SDK_INT > 23) {
            this.f6252d.setCallback(this.f6246a, this.f6257i);
        } else if (Build.VERSION.SDK_INT < 21) {
            return g.f6271f;
        } else {
            this.f6252d.setCallback(this.f6246a);
        }
        return g.f6266a;
    }

    protected class a extends MediaCodec.Callback {
        static {
            Covode.recordClassIndex(3011);
        }

        protected a() {
        }

        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            codecException.getMessage();
        }

        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            c.this.f6253e = mediaFormat;
        }

        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
            if (!c.this.f6251c.useSurfaceInput()) {
                c.this.f6247b.offer(Integer.valueOf(i2));
            }
        }

        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
            c.this.a(mediaCodec, i2, bufferInfo);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.benchmark.mediacodec.d
    public final int a(i iVar) {
        if (this.f6247b.isEmpty()) {
            return g.f6277l;
        }
        return a(iVar, this.f6247b.poll().intValue());
    }
}
