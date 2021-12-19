package com.benchmark.mediacodec;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private int f6249a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6250b;

    /* renamed from: c  reason: collision with root package name */
    protected TEMediaCodecEncodeSettings f6251c;

    /* renamed from: d  reason: collision with root package name */
    protected MediaCodec f6252d;

    /* renamed from: e  reason: collision with root package name */
    public MediaFormat f6253e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f6254f;

    /* renamed from: g  reason: collision with root package name */
    public e f6255g;

    /* renamed from: h  reason: collision with root package name */
    protected HandlerThread f6256h;

    /* renamed from: i  reason: collision with root package name */
    protected Handler f6257i;

    /* renamed from: j  reason: collision with root package name */
    public int f6258j;

    /* renamed from: k  reason: collision with root package name */
    public int f6259k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6260l;

    /* renamed from: m  reason: collision with root package name */
    public int f6261m = -1;
    public long n = -1;
    public long o = -1;
    protected long p = -1;
    protected LinkedBlockingQueue<Long> q = new LinkedBlockingQueue<>();
    protected volatile c r = c.UNSET;
    public byte[] s;
    private int t;

    static {
        Covode.recordClassIndex(3012);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(i iVar);

    public int b() {
        f();
        return g.f6266a;
    }

    public final int c() {
        return e();
    }

    /* access modifiers changed from: protected */
    public final int e() {
        if (this.r != c.INITED) {
            return g.n;
        }
        this.f6252d.start();
        this.r = c.STARTED;
        return g.f6266a;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        if (this.r != c.STARTED) {
            return g.n;
        }
        int i2 = g.f6266a;
        this.r = c.STOPPED;
        MediaCodec mediaCodec = this.f6252d;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        return i2;
    }

    protected d() {
        HandlerThread handlerThread = new HandlerThread("TECodecEncoder");
        this.f6256h = handlerThread;
        handlerThread.start();
        this.f6257i = new Handler(this.f6256h.getLooper(), new a(this));
    }

    public final int d() {
        g();
        int i2 = Build.VERSION.SDK_INT;
        this.f6256h.quitSafely();
        this.f6257i = null;
        this.f6256h = null;
        this.f6258j = 0;
        this.f6259k = 0;
        this.s = null;
        this.f6253e = null;
        this.r = c.UNSET;
        return g.f6266a;
    }

    /* access modifiers changed from: protected */
    public final void g() {
        if (this.r != c.UNSET && this.r != c.RELEASED) {
            if (this.r != c.STOPPED) {
                b();
            }
            Surface surface = this.f6254f;
            if (surface != null) {
                surface.release();
                this.f6254f = null;
            }
            MediaCodec mediaCodec = this.f6252d;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            this.f6251c = null;
            this.f6252d = null;
        }
    }

    /* access modifiers changed from: protected */
    public enum c {
        UNSET,
        INITED,
        STARTED,
        STOPPED,
        RELEASED;

        static {
            Covode.recordClassIndex(3015);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r2 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int h() {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.d.h():int");
    }

    protected static class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<d> f6262a;

        static {
            Covode.recordClassIndex(3013);
        }

        public a(d dVar) {
            this.f6262a = new WeakReference<>(dVar);
        }

        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            Object obj = message.obj;
            d dVar = this.f6262a.get();
            if (i2 == 1) {
                b bVar = (b) obj;
                dVar.b(bVar.f6263a);
                bVar.f6264b.open();
                return false;
            } else if (i2 == 2) {
                dVar.e();
                return false;
            } else if (i2 == 3) {
                dVar.f();
                return false;
            } else if (i2 != 4) {
                return false;
            } else {
                dVar.g();
                return true;
            }
        }
    }

    public final int a(TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings) {
        int i2 = Build.VERSION.SDK_INT;
        if (tEMediaCodecEncodeSettings.getBitRateMode() < 0 || tEMediaCodecEncodeSettings.getBitRateMode() > 2) {
            tEMediaCodecEncodeSettings.getBitRateMode();
            return g.f6270e;
        } else if (tEMediaCodecEncodeSettings.getWidth() <= 0 || tEMediaCodecEncodeSettings.getHeight() <= 0) {
            return g.f6276k;
        } else {
            Message message = new Message();
            message.what = 1;
            ConditionVariable conditionVariable = new ConditionVariable();
            conditionVariable.close();
            message.obj = new b(tEMediaCodecEncodeSettings, conditionVariable);
            this.f6257i.sendMessage(message);
            if (!conditionVariable.block(500000)) {
                return g.f6272g;
            }
            if (this.r != c.INITED) {
                return g.f6272g;
            }
            return g.f6266a;
        }
    }

    public final int b(i iVar) {
        int a2;
        if (this.r != c.STARTED) {
            return g.n;
        }
        if (this.f6255g == null) {
            return g.f6278m;
        }
        if (!iVar.a() && !iVar.f6285g) {
            return g.f6270e;
        }
        int i2 = this.f6249a;
        if (i2 > 0 && i2 == this.f6258j + 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f6252d.setParameters(bundle);
            this.f6249a = 0;
            this.f6250b = true;
        }
        if (this.t > 0 && this.f6258j + 1 == 26) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("video-bitrate", this.t);
            this.f6252d.setParameters(bundle2);
            this.t = 0;
        }
        try {
            if (!this.f6251c.useSurfaceInput()) {
                a2 = a(iVar);
            } else if (this.r != c.STARTED) {
                a2 = g.n;
            } else {
                if (iVar.a()) {
                    this.f6255g.a(iVar);
                }
                if (iVar.f6285g) {
                    this.f6252d.signalEndOfInputStream();
                }
                a2 = g.f6266a;
            }
            if (iVar.f6282d == 0) {
                this.p = System.currentTimeMillis();
            }
            if (a2 == g.f6266a) {
                this.f6258j++;
                this.q.offer(Long.valueOf(iVar.f6282d));
                if (iVar.f6285g) {
                    this.f6260l = true;
                }
            }
            return a2;
        } catch (Exception e2) {
            throw new f(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b5 A[Catch:{ Exception -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d8 A[Catch:{ Exception -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ff A[Catch:{ Exception -> 0x0121 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(com.benchmark.mediacodec.TEMediaCodecEncodeSettings r12) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.d.b(com.benchmark.mediacodec.TEMediaCodecEncodeSettings):int");
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        TEMediaCodecEncodeSettings f6263a;

        /* renamed from: b  reason: collision with root package name */
        ConditionVariable f6264b;

        static {
            Covode.recordClassIndex(3014);
        }

        public b(TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings, ConditionVariable conditionVariable) {
            this.f6263a = tEMediaCodecEncodeSettings;
            this.f6264b = conditionVariable;
        }
    }

    public final void a(int i2, int i3) {
        if (this.f6252d != null) {
            if (i2 == 301) {
                this.t = i3;
            } else if (i2 == 302) {
                try {
                    this.f6249a = i3;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a(i iVar, int i2) {
        byte[] bArr;
        if (this.r != c.STARTED) {
            return g.n;
        }
        if (iVar == null) {
            return g.f6270e;
        }
        if (iVar.a()) {
            if (this.f6251c.getInputColorFormat() == com.benchmark.b.f6029a) {
                Image inputImage = this.f6252d.getInputImage(i2);
                if (inputImage == null || inputImage.getPlanes()[1].getPixelStride() != 2) {
                    bArr = iVar.f6280b;
                } else {
                    bArr = new byte[iVar.f6280b.length];
                    int i3 = 0;
                    for (int i4 = 0; i4 < this.f6251c.getHeight(); i4++) {
                        for (int i5 = 0; i5 < this.f6251c.getWidth(); i5++) {
                            bArr[i3] = iVar.f6280b[(this.f6251c.getWidth() * i4) + i5];
                            i3++;
                        }
                    }
                    for (int i6 = 0; i6 < this.f6251c.getHeight() / 4; i6++) {
                        for (int i7 = 0; i7 < this.f6251c.getWidth(); i7++) {
                            int width = (this.f6251c.getWidth() * this.f6251c.getHeight()) + (this.f6251c.getWidth() * i6) + i7;
                            bArr[i3] = iVar.f6280b[width];
                            bArr[i3 + 1] = iVar.f6280b[width + ((this.f6251c.getWidth() * this.f6251c.getHeight()) / 4)];
                            i3 += 2;
                        }
                    }
                }
            } else {
                bArr = iVar.f6280b;
            }
            ByteBuffer inputBuffer = this.f6252d.getInputBuffer(i2);
            inputBuffer.clear();
            inputBuffer.put(bArr);
            inputBuffer.position(0);
            inputBuffer.limit(bArr.length);
            this.f6252d.queueInputBuffer(i2, 0, iVar.f6280b.length, iVar.f6282d, 0);
        } else if (!iVar.f6285g) {
            return g.f6270e;
        } else {
            this.f6252d.queueInputBuffer(i2, 0, 0, iVar.f6282d, 4);
        }
        return g.f6266a;
    }

    /* access modifiers changed from: protected */
    public final void a(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        if (this.r == c.STARTED) {
            boolean z2 = false;
            if ((bufferInfo.flags & 2) != 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i2);
                outputBuffer.get(4);
                this.s = new byte[bufferInfo.size];
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                outputBuffer.get(this.s);
                this.f6261m = this.s[5];
                mediaCodec.releaseOutputBuffer(i2, false);
                return;
            }
            int i3 = this.f6259k + 1;
            this.f6259k = i3;
            if (i3 == 1) {
                this.o = System.currentTimeMillis() - this.p;
            }
            i iVar = new i();
            ByteBuffer outputBuffer2 = mediaCodec.getOutputBuffer(i2);
            outputBuffer2.position(bufferInfo.offset);
            outputBuffer2.limit(bufferInfo.offset + bufferInfo.size);
            if (bufferInfo.size > 0) {
                iVar.f6280b = new byte[bufferInfo.size];
                outputBuffer2.get(iVar.f6280b);
            } else if ((bufferInfo.flags & 4) == 0) {
                int i4 = bufferInfo.size;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            if ((bufferInfo.flags & 1) != 0) {
                z = true;
                if (this.s != null && iVar.f6280b != null && iVar.f6280b.length > this.s.length + 4 && iVar.f6280b[4] == this.s[4] && (iVar.f6280b[this.s.length + 4] & 31) == 5) {
                    int length = iVar.f6280b.length - this.s.length;
                    byte[] bArr = new byte[length];
                    System.arraycopy(iVar.f6280b, this.s.length, bArr, 0, length);
                    iVar.f6280b = bArr;
                }
            } else {
                z = false;
            }
            Long poll = this.q.poll();
            if (poll != null) {
                if ((bufferInfo.flags & 4) != 0) {
                    z2 = true;
                    iVar.f6282d = poll.longValue();
                } else {
                    iVar.f6282d = bufferInfo.presentationTimeUs;
                }
                iVar.f6283e = poll.longValue();
                iVar.f6285g = z2;
                iVar.f6284f = z;
                e eVar = this.f6255g;
                if (eVar != null) {
                    eVar.b(iVar);
                }
            }
        }
    }
}
