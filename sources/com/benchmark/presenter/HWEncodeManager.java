package com.benchmark.presenter;

import android.os.Build;
import com.benchmark.a.c;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;
import com.benchmark.mediacodec.d;
import com.benchmark.mediacodec.g;
import com.benchmark.mediacodec.j;
import com.benchmark.mediacodec.k;
import com.benchmark.settings.HWEncoderStrategyWrapper;
import com.benchmark.tools.i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;

public class HWEncodeManager {
    public volatile int encodeRet = 0;
    private Runnable feedTask = new Runnable() {
        /* class com.benchmark.presenter.HWEncodeManager.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        int f6325a;

        /* renamed from: b  reason: collision with root package name */
        i f6326b;

        static {
            Covode.recordClassIndex(3035);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:108:0x03b3, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x03b4, code lost:
            com.benchmark.a.c.a(r0);
            r28.f6327c.encodeRet = com.benchmark.mediacodec.g.o;
            r28.f6327c.mStart = false;
            com.bytedance.frameworks.apm.trace.MethodCollector.o(12410);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x03c7, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x03c8, code lost:
            r0 = e;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x039b  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x03b3 A[ExcHandler: f (r0v2 'e' com.benchmark.mediacodec.f A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x01a8 A[Catch:{ IOException -> 0x03af, f -> 0x03b3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 976
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.presenter.HWEncodeManager.AnonymousClass1.run():void");
        }
    };
    public int mChangeFPSIndex = 15;
    public d mEncode;
    public int mFrameRate;
    public HashMap<Long, com.benchmark.mediacodec.i> mInputFrames = new HashMap<>();
    public j mMuxer;
    public int mNewFrameRate = 0;
    public LinkedBlockingQueue<com.benchmark.mediacodec.i> mOutputFrames = new LinkedBlockingQueue<>();
    public TEMediaCodecEncodeSettings mSettings;
    public boolean mStart = false;
    public HWEncoderStrategyWrapper mStrategy;
    private String mVideoOutputPath;
    public String mYUVPath;
    private FutureTask<Integer> muxerTask;
    private Callable<Integer> muxerinnerTask = new Callable<Integer>() {
        /* class com.benchmark.presenter.HWEncodeManager.AnonymousClass2 */

        /* renamed from: a  reason: collision with root package name */
        final int f6331a = 30;

        static {
            Covode.recordClassIndex(3037);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
            r4.presentationTimeUs = r5.f6282d;
            r4.offset = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
            if (r5.f6284f == false) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
            r4.flags |= 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
            if (r5.f6285g == false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
            r4.flags |= 4;
            r4.size = 0;
            r2.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
            r6 = r11.f6332b.mMuxer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
            if (r6.f6289d == com.benchmark.mediacodec.j.a.STARTED) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
            r9 = com.benchmark.mediacodec.g.n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
            r2.clear();
            r2.put(r5.f6280b);
            r2.position(0);
            r2.limit(r5.f6280b.length);
            r4.size = r5.f6280b.length;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
            r6.f6286a.writeSampleData(r6.f6287b, r2, r4);
            r9 = com.benchmark.mediacodec.g.f6266a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
            if (r9 >= 0) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
            java.lang.Thread.sleep(50);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
            r11.f6332b.mOutputFrames.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
            if (r5.f6285g == false) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
            r9 = com.benchmark.mediacodec.g.f6266a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
            if (r11.f6332b.encodeRet != com.benchmark.mediacodec.g.o) goto L_0x0109;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0107, code lost:
            if (r11.f6332b.encodeRet == com.benchmark.mediacodec.g.o) goto L_0x0117;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0109, code lost:
            r11.f6332b.mEncode.b();
            r11.f6332b.mEncode.d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0117, code lost:
            r11.f6332b.mMuxer.a();
            r11.f6332b.mMuxer.b();
            r11.f6332b.mStart = false;
            r0 = java.lang.Integer.valueOf(r9);
            com.bytedance.frameworks.apm.trace.MethodCollector.o(10230);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
            return r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer call() {
            /*
            // Method dump skipped, instructions count: 350
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.presenter.HWEncodeManager.AnonymousClass2.call():java.lang.Integer");
        }
    };
    public k yuvTextureDrawer;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6333a;

        /* renamed from: b  reason: collision with root package name */
        public int f6334b;

        static {
            Covode.recordClassIndex(3038);
        }
    }

    static {
        Covode.recordClassIndex(3034);
    }

    public byte[] getCSData() {
        d dVar = this.mEncode;
        if (dVar == null) {
            return new byte[1];
        }
        return dVar.s;
    }

    public long getFirstFrameCost() {
        d dVar = this.mEncode;
        if (dVar == null) {
            return 0;
        }
        return dVar.o;
    }

    public int getHoardFrames() {
        d dVar = this.mEncode;
        if (dVar == null) {
            return 0;
        }
        return dVar.f6259k - dVar.f6258j;
    }

    public long getMediaCodecInitCost() {
        d dVar = this.mEncode;
        if (dVar == null) {
            return 0;
        }
        return dVar.n;
    }

    public int getProfile() {
        d dVar = this.mEncode;
        if (dVar == null) {
            return 0;
        }
        return dVar.f6261m;
    }

    public int getResult() {
        try {
            int intValue = this.muxerTask.get().intValue();
            if (!(intValue == g.f6266a || this.encodeRet == g.o)) {
                this.encodeRet = intValue;
            }
            return this.encodeRet;
        } catch (InterruptedException e2) {
            e2.getMessage();
            return -1;
        } catch (ExecutionException e3) {
            c.a(e3);
            e3.getMessage();
            return -1;
        }
    }

    public int init() {
        com.benchmark.mediacodec.c cVar = new com.benchmark.mediacodec.c();
        this.mEncode = cVar;
        int a2 = cVar.a(this.mSettings);
        this.mChangeFPSIndex = this.mSettings.getChangeFPSIndex();
        if (a2 < 0) {
            return a2;
        }
        this.mMuxer = new j(this.mVideoOutputPath, this.mEncode);
        return 0;
    }

    public int start() {
        try {
            int c2 = this.mEncode.c();
            if (c2 == 0) {
                this.mStart = true;
                new Thread(this.feedTask).start();
                this.muxerTask = new FutureTask<>(this.muxerinnerTask);
                new Thread(this.muxerTask).start();
            }
            return c2;
        } catch (Exception e2) {
            c.a(e2);
            return -218;
        }
    }

    private void changeFrameRate(int i2) {
        this.mNewFrameRate = i2;
    }

    public int initStrategyWrapper(long j2) {
        HWEncoderStrategyWrapper hWEncoderStrategyWrapper = new HWEncoderStrategyWrapper(j2);
        this.mStrategy = hWEncoderStrategyWrapper;
        this.mSettings = hWEncoderStrategyWrapper.getSettings();
        this.mYUVPath = this.mStrategy.getYUVPath();
        String videoOutputPath = this.mStrategy.getVideoOutputPath();
        this.mVideoOutputPath = videoOutputPath;
        if (this.mYUVPath == null || videoOutputPath == null) {
            return -205;
        }
        return 0;
    }

    public void setParams(int i2, int i3) {
        if (i2 != 303 || i3 <= 0) {
            this.mEncode.a(i2, i3);
        } else {
            changeFrameRate(i3);
        }
    }

    public int init(String str, String str2, a aVar) {
        String str3;
        TEMediaCodecEncodeSettings.a aVar2 = new TEMediaCodecEncodeSettings.a();
        if (aVar.f6333a) {
            str3 = "video/hevc";
        } else {
            str3 = "video/avc";
        }
        aVar2.f6207a.mMimeType = str3;
        aVar2.f6207a.mInputColorFormat = aVar.f6334b;
        aVar2.f6207a.mFrameRate = 30;
        aVar2.f6207a.mIFrameInternal = 1;
        aVar2.f6207a.mBitRate = 4000000;
        aVar2.f6207a.mBitRateMode = 1;
        aVar2.f6207a.mWidth = 720;
        aVar2.f6207a.mHeight = 1280;
        if (aVar.f6333a) {
            aVar2.a(1);
        } else if (Build.VERSION.SDK_INT > 25) {
            aVar2.a(8);
        } else {
            aVar2.a(1);
        }
        this.mSettings = aVar2.f6207a;
        this.mYUVPath = str;
        com.benchmark.mediacodec.c cVar = new com.benchmark.mediacodec.c();
        this.mEncode = cVar;
        int a2 = cVar.a(this.mSettings);
        if (a2 < 0) {
            return a2;
        }
        this.mMuxer = new j(str2, this.mEncode);
        return 0;
    }
}
