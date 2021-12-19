package com.ss.android.ttvecamera;

import android.hardware.camera2.TotalCaptureResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public long f61566a;

    /* renamed from: b  reason: collision with root package name */
    public c f61567b;

    /* renamed from: c  reason: collision with root package name */
    public e f61568c;

    /* renamed from: d  reason: collision with root package name */
    private int f61569d;

    /* renamed from: e  reason: collision with root package name */
    private int f61570e;

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f61581a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f61582b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f61583c = -1;

        /* renamed from: d  reason: collision with root package name */
        public TotalCaptureResult f61584d;

        /* renamed from: e  reason: collision with root package name */
        public int f61585e;

        /* renamed from: f  reason: collision with root package name */
        public int f61586f;

        static {
            Covode.recordClassIndex(37897);
        }
    }

    static {
        Covode.recordClassIndex(37893);
    }

    public static class e {

        /* renamed from: c  reason: collision with root package name */
        public TEFrameSizei f61589c;

        /* renamed from: d  reason: collision with root package name */
        public b f61590d;

        /* renamed from: e  reason: collision with root package name */
        public int f61591e;

        /* renamed from: f  reason: collision with root package name */
        public int f61592f;

        /* renamed from: g  reason: collision with root package name */
        public long f61593g;

        /* renamed from: h  reason: collision with root package name */
        public int f61594h;

        static {
            Covode.recordClassIndex(37899);
        }

        public e() {
            this(0, 0, 0, 0);
        }

        public e(int i2, int i3, long j2, int i4) {
            this.f61589c = new TEFrameSizei(i2, i3);
            this.f61593g = j2;
            this.f61594h = i4;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f61571a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.i.AnonymousClass1.<clinit>():void");
        }
    }

    public enum b {
        PIXEL_FORMAT_YUV420,
        PIXEL_FORMAT_YUV420P,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_YUYV422,
        PIXEL_FORMAT_YUV422P,
        PIXEL_FORMAT_UYVY422,
        PIXEL_FORMAT_GRAY8,
        PIXEL_FORMAT_RGB8,
        PIXEL_FORMAT_BGR8,
        PIXEL_FORMAT_ARGB8,
        PIXEL_FORMAT_RGBA8,
        PIXEL_FORMAT_BGRA8,
        PIXEL_FORMAT_OpenGL_GRAY,
        PIXEL_FORMAT_OpenGL_RGB8,
        PIXEL_FORMAT_OpenGL_RGBA8,
        PIXEL_FORMAT_OpenGL_OES,
        PIXEL_FORMAT_JPEG,
        PIXEL_FORMAT_BUFFER,
        PIXEL_FORMAT_Count,
        PIXEL_FORMAT_Recorder;

        static {
            Covode.recordClassIndex(37896);
        }
    }

    public static int a(b bVar) {
        switch (AnonymousClass1.f61571a[bVar.ordinal()]) {
            case 1:
                return 35;
            case 2:
                return 842094169;
            case 3:
                return 17;
            case 4:
                return 16;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return 39;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return 41;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return 42;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return 256;
            default:
                return 0;
        }
    }

    public i(int i2, int i3, long j2) {
        this.f61568c = new e();
        this.f61569d = i2;
        this.f61570e = i3;
        this.f61566a = j2;
    }

    public final void a(p pVar, int i2, b bVar, int i3) {
        this.f61568c = new f(this.f61569d, this.f61570e, this.f61566a, pVar, i2, bVar, i3);
    }

    public final void a(byte[] bArr, int i2, b bVar, int i3) {
        this.f61568c = new a(this.f61569d, this.f61570e, this.f61566a, bArr, i2, bVar, i3);
    }

    public i(p pVar, b bVar, int i2, int i3, int i4) {
        this(i2, i3, 0);
        a(pVar, i4, bVar, 0);
    }

    public final void a(int i2, int i3, float[] fArr, b bVar, int i4) {
        this.f61568c = new d(this.f61569d, this.f61570e, this.f61566a, i2, i3, fArr, bVar, i4);
    }

    public i(byte[] bArr, b bVar, int i2, int i3, int i4) {
        this(i2, i3, 0);
        a(bArr, i4, bVar, 0);
    }

    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public int f61572a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f61573b;

        static {
            Covode.recordClassIndex(37895);
        }

        public a(int i2, int i3, long j2, byte[] bArr, int i4, b bVar, int i5) {
            super(i2, i3, j2, i5);
            this.f61591e = 2;
            this.f61592f = i4;
            this.f61590d = bVar;
            this.f61573b = bArr;
            this.f61572a = i2 * i3 * 4;
        }
    }

    public static class f extends e {

        /* renamed from: a  reason: collision with root package name */
        public p f61595a;

        static {
            Covode.recordClassIndex(37900);
        }

        public f(int i2, int i3, long j2, p pVar, int i4, b bVar, int i5) {
            super(i2, i3, j2, i5);
            this.f61591e = 3;
            this.f61592f = i4;
            this.f61590d = bVar;
            this.f61595a = pVar;
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public int f61587a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f61588b;

        static {
            Covode.recordClassIndex(37898);
        }

        public d(int i2, int i3, long j2, int i4, int i5, float[] fArr, b bVar, int i6) {
            super(i2, i3, j2, i6);
            this.f61591e = 1;
            this.f61587a = i4;
            this.f61592f = i5;
            this.f61588b = fArr;
            this.f61590d = bVar;
        }
    }
}
