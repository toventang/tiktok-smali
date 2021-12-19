package com.ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f59702a = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static d f59703b = null;
    private static int t = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    private int A = 0;
    private int B = 0;

    /* renamed from: c  reason: collision with root package name */
    MediaCodec.BufferInfo f59704c;

    /* renamed from: d  reason: collision with root package name */
    ByteBuffer[] f59705d;

    /* renamed from: e  reason: collision with root package name */
    ByteBuffer[] f59706e;

    /* renamed from: f  reason: collision with root package name */
    public MediaCodec f59707f;

    /* renamed from: g  reason: collision with root package name */
    public Surface f59708g;

    /* renamed from: h  reason: collision with root package name */
    public i f59709h;

    /* renamed from: i  reason: collision with root package name */
    public int f59710i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f59711j = 30;

    /* renamed from: k  reason: collision with root package name */
    public float f59712k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f59713l = 1;

    /* renamed from: m  reason: collision with root package name */
    public float f59714m = 1.0f;
    public float n = 1.0f;
    public float o = 1.0f;
    public float p = 1.0f;
    public float q = 1.0f;
    public float r = 1.0f;
    BufferedOutputStream s = null;
    private String u = "video/avc";
    private MediaCodecInfo v;
    private int w;
    private int x;
    private boolean y;
    private Queue<Pair<Integer, Integer>> z = new LinkedList();

    static {
        Covode.recordClassIndex(36870);
        new Thread(new Runnable() {
            /* class com.ss.android.medialib.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36871);
            }

            public final void run() {
                MediaCodecList.getCodecCount();
            }
        }).start();
    }

    private MediaCodecInfo a() {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equalsIgnoreCase(this.u)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0072 A[Catch:{ Exception -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC, Splitter:B:59:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface a(int r17, int r18, int r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.c.a(int, int, int, boolean):android.view.Surface");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0103, code lost:
        if (r8 >= 0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010b, code lost:
        r7 = r13.f59707f.getOutputBuffer(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0111, code lost:
        r5 = r13.f59704c.size - r13.f59704c.offset;
        r7.position(r13.f59704c.offset);
        r10 = new byte[r5];
        r7.get(r10, 0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012b, code lost:
        if ((r13.f59704c.flags & 2) == 0) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
        r0 = com.ss.android.medialib.c.f59703b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        if (r0 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r0.onMarkSetCodecConfig(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        r13.f59704c.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0144, code lost:
        if ((r13.f59704c.flags & 1) == 0) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014b, code lost:
        if (com.ss.android.medialib.c.f59703b == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014d, code lost:
        com.ss.android.vesdk.an.b(r1, "encode: pts queue size = " + r13.z.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016b, code lost:
        if (r13.z.size() <= 0) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016d, code lost:
        r13.B++;
        r7 = r13.z.poll();
        com.ss.android.medialib.c.f59703b.onMarkWriteFile(r10, ((java.lang.Integer) r7.first).intValue(), ((java.lang.Integer) r7.second).intValue(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0190, code lost:
        com.ss.android.vesdk.an.b(r1, "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0196, code lost:
        com.ss.android.vesdk.an.b(r1, "encode: no output.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019c, code lost:
        r7 = r13.f59706e[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a2, code lost:
        com.ss.android.vesdk.an.c(r1, "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a7, code lost:
        if (r18 == false) goto L_0x01b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r14, int r15, int r16, int r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 486
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.c.a(int, int, int, int, boolean):int");
    }
}
