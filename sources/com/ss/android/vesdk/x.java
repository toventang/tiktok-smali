package com.ss.android.vesdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEReverseCallback;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.runtime.VEPublishSettingManager;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.u;
import com.ss.android.vesdk.utils.DigestUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class x implements SurfaceTexture.OnFrameAvailableListener {
    private static volatile boolean at = true;
    private static Map<String, Pair<Long, String>> aw = new HashMap();
    private static final Object ax = new Object();
    private static volatile boolean ay = false;
    private static int az = 0;
    public int A;
    public TEInterface B;
    public SurfaceTexture C;
    public Surface D;
    public SurfaceView E;
    public TextureView F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public boolean O;
    public int P;
    public l Q;
    public k R;
    public m S;
    public boolean T;
    public int U;
    String V;
    long W;
    public boolean X;
    public b Y;
    public VEListener.t Z;

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.vesdk.f.d f151512a;
    private int aA;
    private com.ss.android.ttve.common.b aB;
    private com.ss.android.ttve.common.b aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;
    private boolean aI;
    private boolean aJ;
    private boolean aK;
    private boolean aL;
    private boolean aM;
    private float aN;
    private float aO;
    private float aP;
    private int aQ;
    private NativeCallbacks.h aR;
    private NativeCallbacks.c aS;
    private NativeCallbacks.d aT;
    private NativeCallbacks.d aU;
    private NativeCallbacks.g aV;
    private NativeCallbacks.e aW;
    public VEListener.w aa;
    public VEListener.w ab;
    public com.ss.android.ttve.monitor.i ac;
    public boolean ad;
    public Bitmap ae;
    public int af;
    public int ag;
    public int ah;
    public float ai;
    public final TextureView.SurfaceTextureListener aj;
    public SurfaceHolder.Callback2 ak;
    public String al;
    public double am;
    public double an;
    public double ao;
    public double ap;
    private com.ss.android.vesdk.f.b aq;
    private com.ss.android.vesdk.f.a ar;
    private boolean as;
    private VERecordData au;
    private final String av;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.vesdk.f.f f151513b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.vesdk.f.c f151514c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.vesdk.f.e f151515d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.vesdk.runtime.b f151516e;

    /* renamed from: f  reason: collision with root package name */
    public VESize f151517f;

    /* renamed from: g  reason: collision with root package name */
    String f151518g;

    /* renamed from: h  reason: collision with root package name */
    public i f151519h;

    /* renamed from: i  reason: collision with root package name */
    public volatile VEListener.s f151520i;

    /* renamed from: j  reason: collision with root package name */
    public volatile VEListener.q f151521j;

    /* renamed from: k  reason: collision with root package name */
    public volatile VEListener.v f151522k;

    /* renamed from: l  reason: collision with root package name */
    public volatile VEListener.aj f151523l;

    /* renamed from: m  reason: collision with root package name */
    public volatile VEListener.p f151524m;
    public volatile VEListener.y n;
    public volatile VEListener.ab o;
    public volatile VEListener.e p;
    public r q;
    public r r;
    public com.ss.android.ttve.common.j s;
    public com.ss.android.ttve.a.a t;
    public String u;
    public Map<Integer, String> v;
    public AtomicBoolean w;
    public int x;
    public int y;
    public Boolean z;

    public interface c {
        static {
            Covode.recordClassIndex(99638);
        }

        BefTextLayoutResult a();
    }

    public interface d {
        static {
            Covode.recordClassIndex(99639);
        }
    }

    public enum a {
        GET_FRAMES_MODE_NORMAL(1),
        GET_FRAMES_MODE_NOEFFECT(2),
        GET_FRAMES_MODE_ORIGINAL(4),
        GET_FRAMES_MODE_NORMAL_SCORE(9),
        GET_FRAMES_MODE_NOEFFECT_SCORE(10),
        GET_FRAMES_MODE_ORIGINAL_SCORE(12);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        static {
            Covode.recordClassIndex(99636);
        }

        private a(int i2) {
            this.mValue = i2;
        }
    }

    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateIn can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateOut can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateInOut can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Forward can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Clear can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Accurate can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Accurate_Clear can be incorrect */
    public enum f {
        EDITOR_SEEK_FLAG_OnGoing(0),
        EDITOR_SEEK_FLAG_LastSeek(1),
        EDITOR_SEEK_FLAG_ToIframe(2),
        EDITOR_SEEK_FLAG_LAST_UpdateIn(r13.getValue() | 4),
        EDITOR_SEEK_FLAG_LAST_UpdateOut(r13.getValue() | 8),
        EDITOR_SEEK_FLAG_LAST_UpdateInOut(r13.getValue() | 16),
        EDITOR_SEEK_FLAG_Forward(128),
        EDITOR_SEEK_FLAG_LAST_Forward(r8.getValue() | r13.getValue()),
        EDITOR_SEEK_FLAG_LAST_Clear(r13.getValue() | 256),
        EDITOR_SEEK_FLAG_LAST_Accurate(r13.getValue() | 640),
        EDITOR_SEEK_FLAG_LAST_Accurate_Clear(r13.getValue() | 896),
        EDITOR_REFRESH_MODE(1024),
        EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker(24577),
        EDITOR_REFRESH_MODE_FOECE(536870912);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        static {
            Covode.recordClassIndex(99641);
        }

        private f(int i2) {
            this.mValue = i2;
        }
    }

    public enum g {
        EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
        EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        static {
            Covode.recordClassIndex(99642);
        }

        private g(int i2) {
            this.mValue = i2;
        }
    }

    public enum j {
        ANY(65535),
        ERROR(0),
        NOTHING(1048576),
        IDLE(1),
        INITIALIZED(2),
        PREPARED(4),
        STARTED(8),
        PAUSED(16),
        SEEKING(32),
        STOPPED(64),
        COMPLETED(128);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        static {
            Covode.recordClassIndex(99645);
        }

        public static j valueOf(int i2) {
            if (i2 == 0) {
                return ERROR;
            }
            if (i2 == 1) {
                return IDLE;
            }
            if (i2 == 2) {
                return INITIALIZED;
            }
            if (i2 == 4) {
                return PREPARED;
            }
            if (i2 == 8) {
                return STARTED;
            }
            if (i2 == 16) {
                return PAUSED;
            }
            if (i2 == 32) {
                return SEEKING;
            }
            if (i2 == 64) {
                return STOPPED;
            }
            if (i2 == 128) {
                return COMPLETED;
            }
            if (i2 == 65535) {
                return ANY;
            }
            if (i2 != 1048576) {
                return null;
            }
            return NOTHING;
        }

        private j(int i2) {
            this.mValue = i2;
        }
    }

    public final void a() {
        MethodCollector.i(6373);
        if (this.w.get()) {
            an.c("VEEditor", "no need to releasePreviewSurface, is destroying, just return");
            MethodCollector.o(6373);
            return;
        }
        synchronized (this) {
            try {
                if (this.w.get()) {
                    an.c("VEEditor", "no need to releasePreviewSurface, just lock return");
                    return;
                }
                an.c("VEEditor", "surfaceDestroyed...");
                this.B.releasePreviewSurface();
                MethodCollector.o(6373);
            } finally {
                MethodCollector.o(6373);
            }
        }
    }

    public final void a(Bitmap bitmap) {
        if (this.w.get()) {
            an.c("VEEditor", "no need to setPreviewSurfaceBitmap, is destroying, just return");
            return;
        }
        an.a("VEEditor", "setPreviewSurfaceBitmap...");
        this.B.setPreviewSurfaceBitmap(bitmap);
    }

    public final void a(Surface surface) {
        Rect rect;
        an.c("VEEditor", "surfaceCreated...");
        this.aL = false;
        if (this.ad && this.ae != null) {
            Canvas lockCanvas = surface.lockCanvas(null);
            int width = lockCanvas.getWidth();
            int height = lockCanvas.getHeight();
            int width2 = this.ae.getWidth();
            int height2 = this.ae.getHeight();
            an.a("VEEditor", "width " + width + " height " + height + " image width " + width2 + " image height " + height2);
            float f2 = (float) width;
            float f3 = (float) height;
            float f4 = ((float) width2) / ((float) height2);
            if (f4 > f2 / f3) {
                int i2 = (height - ((int) (f2 / f4))) / 2;
                rect = new Rect(0, i2, width, height - i2);
            } else {
                int i3 = (width - ((int) (f3 * f4))) / 2;
                rect = new Rect(i3, 0, width - i3, height);
            }
            lockCanvas.drawBitmap(this.ae, (Rect) null, rect, (Paint) null);
            surface.unlockCanvasAndPost(lockCanvas);
            if (this.aM) {
                Bitmap bitmap = this.ae;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.ae.recycle();
                    this.ae = null;
                }
                this.aM = false;
            }
        }
        this.B.setPreviewSurface(surface);
    }

    public final void a(int i2, int i3) {
        an.a("VEEditor", "onSurfaceChanged... " + i2 + ", " + i3);
        this.x = i2;
        this.y = i3;
        x();
        if (i2 != 0 && i3 != 0) {
            this.B.setSurfaceSize(i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        MethodCollector.i(6408);
        boolean b2 = this.ac.b();
        long j2 = 0;
        com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_add", b2 ? 0 : 1);
        if (!b2) {
            com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_json", this.ac.a(0));
        }
        boolean c2 = this.ac.c();
        if (!c2) {
            j2 = 1;
        }
        com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_add", j2);
        if (!c2) {
            com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_json", this.ac.a(1));
        }
        this.ac.a();
        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_file", this.f151518g);
        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_result", "fail");
        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_reason", "");
        TEMonitorInvoker.nativeMonitorPerfWithType(1);
        MethodCollector.o(6408);
    }

    public x(String str, bj bjVar) {
        this.f151517f = new VESize(-1, -1);
        this.f151518g = "mp4";
        this.f151519h = new i(Looper.getMainLooper());
        this.f151520i = null;
        this.f151521j = null;
        this.f151522k = null;
        this.f151523l = null;
        this.f151524m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new com.ss.android.ttve.common.j();
        this.t = new com.ss.android.ttve.a.a();
        this.as = true;
        this.u = "unknown";
        this.au = null;
        this.av = "/concatShootVideo";
        this.v = new HashMap();
        this.w = new AtomicBoolean(false);
        this.aA = -1;
        this.aB = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99616);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(int i2, int i3, float f2, String str) {
                long j2;
                long j3;
                int i4;
                MethodCollector.i(9395);
                if (i2 == 4101) {
                    if (x.this.M > 0) {
                        System.currentTimeMillis();
                    }
                    if (x.this.f151520i != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        x.this.f151519h.sendEmptyMessage(4101);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        x.this.q.onCallback(4101, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (i2 != 4103) {
                    if (i2 != 4105) {
                        if (i2 != 4129) {
                            if (i2 != 4157) {
                                if (i2 != 4133) {
                                    if (i2 == 4134) {
                                        x.this.ai = f2;
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (i2 != 4144) {
                                        if (i2 != 4145) {
                                            if (i2 != 4160) {
                                                if (i2 != 4161) {
                                                    if (x.this.q != null) {
                                                        an.b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                                        x.this.q.onCallback(i2, i3, f2, str);
                                                    }
                                                } else if (x.this.X && x.this.Y != null) {
                                                    x.this.Y.f151581m = i3;
                                                    MethodCollector.o(9395);
                                                    return;
                                                }
                                            } else if (x.this.X && x.this.Y != null) {
                                                x.this.Y.f151580l = i3;
                                                MethodCollector.o(9395);
                                                return;
                                            }
                                        } else if (x.this.f151524m != null) {
                                            x.this.f151524m.b();
                                            MethodCollector.o(9395);
                                            return;
                                        } else if (x.this.q != null) {
                                            an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                            x.this.q.onCallback(i2, i3, f2, str);
                                            MethodCollector.o(9395);
                                            return;
                                        }
                                    } else if (x.this.f151524m != null) {
                                        x.this.f151524m.a();
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (x.this.q != null) {
                                        an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                        x.this.q.onCallback(i2, i3, f2, str);
                                        MethodCollector.o(9395);
                                        return;
                                    }
                                } else if (!(x.this.f151523l == null || x.this.f151519h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i3;
                                    message.arg2 = (int) f2;
                                    x.this.f151519h.sendMessage(message);
                                    MethodCollector.o(9395);
                                    return;
                                }
                            } else if (!(x.this.p == null || x.this.f151519h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i3;
                                message2.arg2 = (int) f2;
                                x.this.f151519h.sendMessage(message2);
                                MethodCollector.o(9395);
                                return;
                            }
                        } else if (x.this.N == 0) {
                            x.this.N = System.currentTimeMillis();
                            an.a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.o(9395);
                            return;
                        }
                    } else if (x.this.f151521j != null && x.this.f151519h != null) {
                        Message message3 = new Message();
                        message3.what = i2;
                        message3.obj = Float.valueOf(f2);
                        x.this.f151519h.sendMessage(message3);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (x.this.X) {
                    x.this.Y.f151572d = x.this.q;
                    new Thread(x.this.Y).start();
                    x.this.X = false;
                    MethodCollector.o(9395);
                    return;
                } else {
                    x xVar = x.this;
                    if (i3 == 1 || i3 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - xVar.W;
                        an.c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        com.ss.android.ttve.monitor.h.a("te_composition_time", currentTimeMillis);
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_time", currentTimeMillis);
                        if (com.ss.android.medialib.e.a(xVar.V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(xVar.V, iArr) != null) {
                                long length = new File(xVar.V).length();
                                com.ss.android.ttve.monitor.h.a("te_composition_page_mode", (long) xVar.af);
                                double d2 = (double) length;
                                Double.isNaN(d2);
                                double d3 = (d2 / 1024.0d) / 1024.0d;
                                com.ss.android.ttve.monitor.h.a("te_composition_file_size", d3);
                                com.ss.android.ttve.monitor.h.a("te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a("te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    an.c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_page_mode", (long) xVar.af);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_fps", (double) iArr[7]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_size", d3);
                                int i5 = xVar.ac.f61225c;
                                if (i5 != 0) {
                                    com.ss.android.ttve.monitor.h.a(1, "te_composition_time_filter_type", (long) i5);
                                }
                                com.ss.android.ttve.editorInfo.a.a("te_composition_file_duration", (long) iArr[3]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_frame_rate", (long) iArr[7]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_width", (long) iArr[0]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b2 = xVar.ac.b();
                        if (b2) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_add", j2);
                        if (!b2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_json", xVar.ac.a(0));
                        }
                        boolean c2 = xVar.ac.c();
                        if (c2) {
                            j3 = 0;
                        } else {
                            j3 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_add", j3);
                        if (!c2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_json", xVar.ac.a(1));
                        }
                        xVar.ac.a();
                        TEMonitorInvoker.nativeMonitorPerf(com.ss.android.ttve.monitor.h.f61219b);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_file", xVar.f151518g);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_result", "succ");
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.ss.android.ttve.monitor.h.a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", xVar.u);
                            if (i3 == 1 || i3 == 2) {
                                i4 = 0;
                            } else {
                                i4 = i3;
                            }
                            jSONObject.put("resultCode", i4);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (x.this.f151521j != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i3;
                        message4.obj = str;
                        x.this.f151519h.sendMessage(message4);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                }
                MethodCollector.o(9395);
            }
        };
        this.aC = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99633);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(final int i2, final int i3, final float f2, final String str) {
                x.this.b();
                if (x.this.r != null) {
                    x.this.r.onCallback(i2, i3, f2, str);
                }
                if (x.this.f151521j != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass8.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99634);
                        }

                        public final void run() {
                            if (x.this.f151521j != null) {
                                x.this.f151521j.onCompileError(i2, i3, f2, str);
                            }
                        }
                    });
                }
            }
        };
        this.x = 0;
        this.y = 0;
        this.aD = 0;
        this.aE = 0;
        this.z = false;
        this.A = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.aF = 0;
        this.aG = 0;
        this.aH = 0;
        this.P = -1;
        this.R = k.ALIGN_PARENT_BOTTOM;
        this.S = m.CENTER;
        this.T = false;
        this.aI = false;
        this.aJ = false;
        this.U = -1;
        this.V = null;
        this.W = 0;
        this.aK = false;
        this.X = false;
        this.Y = null;
        this.Z = null;
        this.aa = null;
        this.ab = null;
        this.ac = new com.ss.android.ttve.monitor.i();
        this.ad = false;
        this.aL = true;
        this.aM = false;
        this.ae = null;
        this.aN = 0.0f;
        this.aO = 1.0f;
        this.aP = 1.0f;
        this.af = -1;
        this.aQ = -1;
        this.ag = -16777216;
        this.ah = -16777216;
        this.ai = 0.0f;
        this.aj = new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.vesdk.x.AnonymousClass9 */

            static {
                Covode.recordClassIndex(99635);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                x.this.a();
                if (x.this.D == null) {
                    return true;
                }
                x.this.D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                x.this.x = i2;
                x.this.y = i3;
                x.this.x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (x.this.C == surfaceTexture) {
                    x xVar = x.this;
                    xVar.a(xVar.D);
                } else {
                    x.this.D = new Surface(surfaceTexture);
                    x xVar2 = x.this;
                    xVar2.a(xVar2.D);
                }
                x.this.C = surfaceTexture;
            }
        };
        this.ak = new SurfaceHolder.Callback2() {
            /* class com.ss.android.vesdk.x.AnonymousClass10 */

            static {
                Covode.recordClassIndex(99617);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                an.b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                x.this.a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (x.this.w.get()) {
                    an.c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    x.this.a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                an.b("VEEditor", com.a.a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
                x.this.a(i3, i4);
            }
        };
        this.aR = new NativeCallbacks.h() {
            /* class com.ss.android.vesdk.x.AnonymousClass11 */

            static {
                Covode.recordClassIndex(99618);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2) {
                an.b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int b(int i2) {
                an.b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2, double d2) {
                long j2;
                long j3;
                an.e("VEEditor", "onOpenGLDrawing: tex = " + i2 + " timeStamp = " + d2);
                if (!x.this.O) {
                    x.this.O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (x.this.N > 0) {
                        j2 = x.this.N;
                    } else {
                        j2 = currentTimeMillis;
                    }
                    if (x.this.L > 0) {
                        j3 = x.this.L;
                    } else {
                        j3 = x.this.K;
                    }
                    if (j3 == 0 || j3 < x.this.J) {
                        an.d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + x.this.L + ", mlFirstSeekTimeMS = " + x.this.K + ", mlInitTimeMS = " + x.this.J);
                        j3 = x.this.J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j3 - x.this.J);
                        jSONObject.put("time_seek", j2 - j3);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j2);
                        jSONObject.put("time_total", currentTimeMillis - x.this.J);
                        jSONObject.put("usage_type", x.this.u);
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        an.a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e2) {
                        an.d("VEEditor", "report first frame json err ".concat(String.valueOf(e2)));
                    }
                    com.ss.android.ttve.monitor.h.a(1, "te_edit_first_frame_time", currentTimeMillis - x.this.J);
                    if (x.this.f151522k != null) {
                        x.this.f151522k.a();
                    }
                }
                x.this.G++;
                if (x.this.G == 30) {
                    x.this.H = System.currentTimeMillis();
                    if (x.this.I != x.this.H) {
                        float f2 = 30000.0f / ((float) (x.this.H - x.this.I));
                        if (az.f151039c) {
                            an.a("VEEditor", "Render FPS = ".concat(String.valueOf(f2)));
                        }
                        x xVar = x.this;
                        xVar.I = xVar.H;
                        x.this.G = 0;
                    }
                }
                return 0;
            }
        };
        this.aS = new NativeCallbacks.c() {
            /* class com.ss.android.vesdk.x.AnonymousClass12 */

            static {
                Covode.recordClassIndex(99619);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.c
            public final int a(byte[] bArr, int i2, int i3, boolean z) {
                if (bArr == null || i2 < 0 || i3 <= 0) {
                    return -1;
                }
                if (x.this.Z == null) {
                    return -2;
                }
                x.this.Z.a(bArr, i2, i3, z);
                return 0;
            }
        };
        this.aT = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass13 */

            static {
                Covode.recordClassIndex(99620);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.aa == null) {
                    return -100;
                }
                if (bArr != null || x.this.f151519h == null) {
                    return x.this.aa.a(bArr, i2, i3);
                }
                Message message = new Message();
                message.what = 4117;
                x.this.f151519h.sendMessage(message);
                return 0;
            }
        };
        this.aU = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass14 */

            static {
                Covode.recordClassIndex(99621);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return x.this.ab.a(bArr, i2, i3);
            }
        };
        this.aV = new NativeCallbacks.g() {
            /* class com.ss.android.vesdk.x.AnonymousClass15 */

            static {
                Covode.recordClassIndex(99622);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int a() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.a();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int b() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.b();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int c() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.c();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int d() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.d();
            }
        };
        this.aW = new NativeCallbacks.e() {
            /* class com.ss.android.vesdk.x.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99623);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final int i4) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99624);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final String str) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(99625);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                if (str != null) {
                                    x.this.v.put(Integer.valueOf(i2), str);
                                }
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            an.a("VEEditor", "VEEditor offscreen");
            this.B = TEInterface.createEngine(bjVar);
            this.f151516e = new com.ss.android.vesdk.runtime.b(str);
            this.B.setOpenGLListeners(this.aR);
            this.B.setInfoListener(this.aB);
            this.B.setErrorListener(this.aC);
            com.ss.android.ttve.monitor.e.a("iesve_veeditor_offscreen", 1, (com.ss.android.vesdk.g.a) null);
            c(false);
            M();
            return;
        }
        throw new z(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    public final void a(r rVar) {
        this.r = rVar;
        an.a("VEEditor", "setOnErrorListener...");
    }

    public final void b(r rVar) {
        an.a("VEEditor", "setOnInfoListener...");
        this.q = rVar;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        an.a("VEEditor", "setDisplayPos... " + i2 + " " + i3 + " " + i4 + " " + i5);
        a(((float) i4) / ((float) this.aD), ((float) i5) / ((float) this.aE), 0.0f, -(((this.x / 2) - (i4 / 2)) - i2), ((this.y / 2) - (i5 / 2)) - i3);
    }

    public final VESize b(int i2, int i3) {
        VESize vESize = new VESize(0, 0);
        float f2 = (float) i2;
        float f3 = (float) i3;
        if (((float) this.f151517f.width) / ((float) this.f151517f.height) > f2 / f3) {
            vESize.width = i2;
            vESize.height = (int) (f2 / (((float) this.f151517f.width) / ((float) this.f151517f.height)));
        } else {
            vESize.height = i3;
            vESize.width = (int) (f3 / (((float) this.f151517f.height) / ((float) this.f151517f.width)));
        }
        an.a("VEEditor", "getInitSize... surfaceWidth:" + i2 + ", surfaceHeight:" + i3 + ", width:" + vESize.width + ", height:" + vESize.height);
        return vESize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r0 == 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        com.ss.android.vesdk.an.d("VEEditor", "getDisplayImage failed ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        if (r3 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        if (r3.isRecycled() != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        r3.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7465);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        r4 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(int r7) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.x.a(int):android.graphics.Bitmap");
    }

    public final void b(int i2) {
        an.a("VEEditor", "setBackgroundColor... color:".concat(String.valueOf(i2)));
        this.ag = i2;
        this.B.setBackGroundColor(i2);
    }

    public final int a(boolean z2) {
        return this.B.setDestroyVersion(z2);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String[] r25, java.lang.String[] r26, java.lang.String[] r27, com.ss.android.vesdk.x.l r28) {
        /*
        // Method dump skipped, instructions count: 484
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.x.a(java.lang.String[], java.lang.String[], java.lang.String[], com.ss.android.vesdk.x$l):int");
    }

    public final int a(String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        MethodCollector.i(7599);
        synchronized (this) {
            try {
                this.I = System.currentTimeMillis();
                this.J = System.currentTimeMillis();
                an.a("VEEditor", "initOnlyAudio...");
                com.ss.android.vesdk.runtime.b bVar = this.f151516e;
                if (bVar == null) {
                    an.d("VEEditor", "init mResManager is null");
                    return -112;
                }
                int initAudioEditor = this.B.initAudioEditor(bVar.f151426a, strArr, iArr, iArr2, fArr);
                if (initAudioEditor != 0) {
                    an.d("VEEditor", "initAudioEditor failed, ret = ".concat(String.valueOf(initAudioEditor)));
                    MethodCollector.o(7599);
                    return initAudioEditor;
                }
                this.T = true;
                this.f151516e.f151432g = false;
                this.f151516e.f151428c = strArr;
                this.f151516e.f151427b = null;
                this.f151516e.f151429d = null;
                this.Q = null;
                this.f151514c.i();
                this.z = true;
                this.f151516e.f151436k = 1;
                this.f151516e.f151435j = 0;
                this.A = 0;
                MethodCollector.o(7599);
                return 0;
            } finally {
                MethodCollector.o(7599);
            }
        }
    }

    public final int a(VERecordData vERecordData, boolean z2, boolean z3) {
        long currentTimeMillis = System.currentTimeMillis();
        this.au = vERecordData;
        if (!z2) {
            int size = vERecordData.f150790b.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            int[] iArr4 = new int[size];
            float[] fArr = new float[size];
            float[] fArr2 = new float[size];
            ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
            int i2 = 0;
            for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f150790b) {
                if (vERecordSegmentData.f150803j) {
                    strArr[i2] = vERecordSegmentData.f150794a;
                    strArr2[i2] = vERecordSegmentData.f150795b;
                    iArr[i2] = (int) (vERecordSegmentData.f150804k / 1000);
                    iArr2[i2] = (int) (vERecordSegmentData.f150805l / 1000);
                    fArr[i2] = vERecordSegmentData.f150798e == 0.0f ? 1.0f : vERecordSegmentData.f150798e;
                    fArr2[i2] = vERecordSegmentData.f150799f == 0.0f ? 1.0f : vERecordSegmentData.f150799f;
                    rotate_degreeArr[i2] = vERecordSegmentData.f150800g;
                    if (vERecordSegmentData.f150806m) {
                        iArr3[i2] = (int) (((float) iArr[i2]) * 1.0f);
                        iArr4[i2] = (int) (((float) iArr2[i2]) * 1.0f);
                    } else {
                        iArr3[i2] = (int) (((float) iArr[i2]) * fArr[i2]);
                        iArr4[i2] = (int) (((float) iArr2[i2]) * fArr[i2]);
                    }
                    i2++;
                }
            }
            if (i2 == 0) {
                an.d("VEEditor", "There are no valid clips!");
                return -100;
            }
            String[] strArr3 = (String[]) Arrays.copyOf(strArr, i2);
            String[] strArr4 = (String[]) Arrays.copyOf(strArr2, i2);
            int[] copyOf = Arrays.copyOf(iArr, i2);
            int[] copyOf2 = Arrays.copyOf(iArr2, i2);
            int[] copyOf3 = Arrays.copyOf(iArr3, i2);
            int[] copyOf4 = Arrays.copyOf(iArr4, i2);
            float[] copyOf5 = Arrays.copyOf(fArr, i2);
            float[] copyOf6 = Arrays.copyOf(fArr2, i2);
            ROTATE_DEGREE[] rotate_degreeArr2 = (ROTATE_DEGREE[]) Arrays.copyOf(rotate_degreeArr, i2);
            this.f151514c.c();
            this.B.clearFilter();
            this.s.a();
            if (vERecordData.f150791c) {
                strArr4 = null;
                copyOf4 = null;
                copyOf5 = null;
                copyOf3 = null;
            }
            int a2 = a(strArr3, copyOf, copyOf2, (String[]) null, strArr4, copyOf3, copyOf4, copyOf6, copyOf5, rotate_degreeArr2, l.VIDEO_OUT_RATIO_ORIGINAL, z3);
            an.a("VEEditor", "init with VERecordData: " + (System.currentTimeMillis() - currentTimeMillis));
            return a2;
        } else if (vERecordData.f150792d.isEmpty()) {
            an.d("VEEditor", "Merged video file path unconfigured!");
            return -100;
        } else {
            this.s.a();
            this.f151514c.c();
            this.B.clearFilter();
            return a(new String[]{vERecordData.f150792d}, (String[]) null, vERecordData.f150791c ? null : new String[]{vERecordData.f150793e}, l.VIDEO_OUT_RATIO_ORIGINAL);
        }
    }

    public final int a(VEEditorModel vEEditorModel, bg bgVar) {
        MethodCollector.i(7623);
        synchronized (this) {
            try {
                TEMonitorInvoker.nativeReset(1);
                com.ss.android.ttve.monitor.h.a(1);
                this.I = System.currentTimeMillis();
                this.J = System.currentTimeMillis();
                an.a("VEEditor", "init with model...");
                a(1.0f, 1.0f, 0.0f, 0, 0);
                com.ss.android.vesdk.runtime.b bVar = this.f151516e;
                if (bVar == null) {
                    an.d("VEEditor", "init mResManager is null");
                    return -112;
                }
                this.T = true;
                bVar.f151432g = vEEditorModel.f150771d;
                this.Q = vEEditorModel.f150772e;
                this.f151516e.f151428c = vEEditorModel.o;
                this.f151516e.f151427b = vEEditorModel.n;
                this.f151516e.f151429d = vEEditorModel.p;
                this.f151514c.i();
                this.z = Boolean.valueOf(vEEditorModel.f150773f);
                this.f151516e.f151435j = 0;
                this.A = vEEditorModel.f150774g;
                this.B.setHostTrackIndex(vEEditorModel.f150775h);
                if (bgVar != null) {
                    int updateSenceTime = this.B.updateSenceTime(bgVar);
                    if (updateSenceTime < 0) {
                        an.d("VEEditor", "updateSceneTime failed, ret = ".concat(String.valueOf(updateSenceTime)));
                        MethodCollector.o(7623);
                        return updateSenceTime;
                    }
                    this.B.setTimeRange(0, updateSenceTime, 0);
                }
                int a2 = this.f151514c.a(vEEditorModel);
                MethodCollector.o(7623);
                return a2;
            } finally {
                MethodCollector.o(7623);
            }
        }
    }

    public final void b(boolean z2) {
        this.B.setForceDetectForFirstFrameByClip(z2);
    }

    public final void a(float f2) {
        an.a("VEEditor", "setHeightWidthRatio... ratio:".concat(String.valueOf(f2)));
        this.B.setHeightWidthRatio(f2);
    }

    public final int a(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, String[] strArr3, int[] iArr3, int[] iArr4, float[] fArr, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr, l lVar) {
        return a(strArr, iArr, iArr2, strArr2, strArr3, iArr3, iArr4, fArr, fArr2, rotate_degreeArr, lVar, false);
    }

    protected static VESize[] a(String[] strArr, String[] strArr2, List<VESize> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                } else if (str.equals(strArr[i2])) {
                    arrayList.add(list.get(i2));
                    an.d("VEEditor", strArr[i2] + "... (" + list.get(i2).width + ", " + list.get(i2).height + ")");
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (VESize[]) arrayList.toArray(new VESize[0]);
    }

    public final int a(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        if (strArr == null || strArr.length == 0) {
            return -100;
        }
        boolean[] zArr = new boolean[strArr.length];
        Arrays.fill(zArr, true);
        return a(zArr, strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, rotate_degreeArr);
    }

    public final int a(boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        float f2;
        an.a("VEEditor", "changeResWithEffect in...");
        if (strArr.length == 0 || zArr.length != strArr.length) {
            return -100;
        }
        int stop = this.B.stop();
        if (stop != 0) {
            an.a("VEEditor", "stop in changeResWithEffect failed, ret = ".concat(String.valueOf(stop)));
            return -1;
        }
        an.a("VEEditor", "changeResWithEffect clear reverse before, mOriginalSoundTrackType = " + this.f151516e.f151436k);
        if (!this.f151516e.f151432g || !this.f151516e.f151433h || this.f151516e.f151431f == null || this.f151516e.f151436k != 1) {
            f2 = -1.0f;
        } else {
            f2 = h(this.f151516e.f151435j);
            A(this.f151516e.f151435j);
            this.f151516e.f151435j = 0;
            an.c("VEEditor", "changeResWithEffect remove org audio track index " + this.f151516e.f151435j);
        }
        this.f151516e.f151431f = null;
        this.f151516e.f151430e = null;
        this.f151516e.f151432g = false;
        this.f151516e.f151433h = false;
        Boolean valueOf = Boolean.valueOf((strArr3 == null || strArr3.length == 0) ? false : true);
        this.z = valueOf;
        if (valueOf.booleanValue()) {
            this.f151516e.f151436k = 1;
        } else {
            this.f151516e.f151436k = 0;
        }
        an.a("VEEditor", "changeResWithEffect clear reverse after, mOriginalSoundTrackType = " + this.f151516e.f151436k);
        this.f151516e.f151427b = strArr;
        this.f151516e.f151428c = strArr3;
        int changeResWithEffect = this.B.changeResWithEffect(zArr, strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, ROTATE_DEGREE.toIntArray(rotate_degreeArr));
        if (changeResWithEffect != 0) {
            an.d("VEEditor", "updateRes in changeResWithEffect failed, ret = ".concat(String.valueOf(changeResWithEffect)));
            return changeResWithEffect;
        }
        this.B.createTimeline();
        int prepareEngine = this.B.prepareEngine(0);
        if (f2 >= 0.0f) {
            a(this.f151516e.f151435j, this.f151516e.f151436k, f2);
        }
        an.a("VEEditor", "changeResWithEffect done，mInitSize.width = " + this.f151517f.width + ", mInitSize.height = " + this.f151517f.height + ", ret = " + prepareEngine);
        return prepareEngine;
    }

    public final void a(VEListener.p pVar) {
        MethodCollector.i(8260);
        synchronized (this) {
            try {
                if (this.B != null) {
                    an.c("VEEditor", "onRelease Async... ");
                    this.f151524m = pVar;
                    this.B.stop();
                    this.B.releaseEngineAsync();
                }
            } finally {
                MethodCollector.o(8260);
            }
        }
    }

    public final int a(String[] strArr) {
        an.c("VEEditor", "setReverseVideoPaths");
        if (strArr == null || strArr.length <= 0) {
            an.d("VEEditor", "setReverseVideoPaths error, reverseVideoPaths is null");
            return -100;
        }
        com.ss.android.vesdk.runtime.b bVar = this.f151516e;
        if (bVar == null) {
            return 0;
        }
        bVar.f151430e = strArr;
        this.f151516e.f151432g = true;
        return 0;
    }

    public final void b(String[] strArr) {
        an.c("VEEditor", "setVideoPaths");
        this.f151516e.f151427b = strArr;
    }

    public final int a(String[] strArr, String[] strArr2) {
        an.c("VEEditor", "setReverseMediaPaths");
        if (strArr == null || strArr.length <= 0) {
            an.d("VEEditor", "setReverseMediaPaths error, reverseVideoPaths = null");
            return -100;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            an.c("VEEditor", "setReverseMediaPaths with reverseAudioPaths is null");
        }
        com.ss.android.vesdk.runtime.b bVar = this.f151516e;
        if (bVar == null) {
            return 0;
        }
        bVar.f151431f = strArr2;
        this.f151516e.f151430e = strArr;
        this.f151516e.f151432g = true;
        return 0;
    }

    public final int a(e eVar) {
        return b(eVar);
    }

    public final int a(int i2, f fVar) {
        int seek;
        MethodCollector.i(8885);
        synchronized (this) {
            try {
                an.c("VEEditor", "seek... " + i2 + " flags " + fVar);
                if ((fVar.getValue() & f.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                    this.f151520i = null;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.M = currentTimeMillis;
                    if (this.K == 0) {
                        this.K = currentTimeMillis;
                    }
                }
                seek = this.B.seek(i2, this.x, this.y, fVar.getValue());
            } finally {
                MethodCollector.o(8885);
            }
        }
        return seek;
    }

    public final int a(int i2, VEListener.w wVar) {
        int seekWithResult;
        MethodCollector.i(8886);
        synchronized (this) {
            try {
                an.c("VEEditor", "seekWithResult... ".concat(String.valueOf(i2)));
                this.ab = wVar;
                this.B.setSeekFrameCallback(this.aU);
                seekWithResult = this.B.seekWithResult(i2);
                if (seekWithResult != 0) {
                    an.d("VEEditor", "seek failed, result = ".concat(String.valueOf(seekWithResult)));
                    this.ab = null;
                }
            } finally {
                MethodCollector.o(8886);
            }
        }
        return seekWithResult;
    }

    public final int a(int i2, f fVar, VEListener.s sVar) {
        int seek;
        MethodCollector.i(8887);
        synchronized (this) {
            try {
                an.c("VEEditor", "seek with cb... " + i2 + " flags " + fVar);
                if ((fVar.getValue() & f.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                    this.f151520i = sVar;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.M = currentTimeMillis;
                    if (this.K == 0) {
                        this.K = currentTimeMillis;
                    }
                }
                seek = this.B.seek(i2, this.x, this.y, fVar.getValue());
                if (seek != 0) {
                    an.d("VEEditor", "seek failed, result = ".concat(String.valueOf(seek)));
                    this.f151520i = null;
                }
            } finally {
                MethodCollector.o(8887);
            }
        }
        return seek;
    }

    public final int a(String str, String str2) {
        MethodCollector.i(9114);
        synchronized (this) {
            try {
                an.c("VEEditor", "addMetadata...");
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.B.addMetaData(str, str2);
                        MethodCollector.o(9114);
                        return 0;
                    }
                }
                return -100;
            } finally {
                MethodCollector.o(9114);
            }
        }
    }

    public final String a(String str) {
        MethodCollector.i(9304);
        synchronized (this) {
            try {
                an.c("VEEditor", "getMetadata...");
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                String metaData = this.B.getMetaData(str);
                MethodCollector.o(9304);
                return metaData;
            } finally {
                MethodCollector.o(9304);
            }
        }
    }

    public final int a(int[] iArr, int i2, int i3, a aVar, VEListener.w wVar) {
        MethodCollector.i(9489);
        synchronized (this) {
            try {
                an.a("VEEditor", "getImages... width:" + i2 + ", height:" + i3 + ", flags:" + aVar);
                if (i2 != 0) {
                    if (i3 != 0) {
                        this.aa = wVar;
                        this.B.setGetImageCallback(this.aT);
                        int images = this.B.getImages(iArr, i2, i3, aVar.getValue());
                        com.ss.android.ttve.monitor.h.a(4, "te_edit_get_frame_with_effect_ret", (long) images);
                        TEMonitorInvoker.nativeMonitorPerfWithType(4);
                        MethodCollector.o(9489);
                        return images;
                    }
                }
                an.d("VEEditor", "getImages error, size invalid");
                com.ss.android.ttve.monitor.h.a(4, "te_edit_get_frame_with_effect_ret", -100L);
                TEMonitorInvoker.nativeMonitorPerfWithType(4);
                return -100;
            } finally {
                MethodCollector.o(9489);
            }
        }
    }

    public final boolean a(VEVideoEncodeSettings vEVideoEncodeSettings) {
        MethodCollector.i(9637);
        synchronized (this) {
            try {
                if (!this.T) {
                    z zVar = new z(-105, "Make sure the initialization is successful before calling!!!");
                    MethodCollector.o(9637);
                    throw zVar;
                } else if (this.B.getNativeHandler() == 0) {
                    return false;
                } else {
                    VEPublishSettingManager.a.INSTANCE.vePublishSettingManager.nativeSetEditorStatus(this.B.genEditorStatus());
                    VEPublishSettingManager.a.INSTANCE.vePublishSettingManager.a(vEVideoEncodeSettings, VERuntime.a.INSTANCE.veRuntime.nativeGetNativeContext());
                    boolean nativeIsCanRemuxVideo = VEPublishSettingManager.a.INSTANCE.vePublishSettingManager.nativeIsCanRemuxVideo();
                    MethodCollector.o(9637);
                    return nativeIsCanRemuxVideo;
                }
            } finally {
                MethodCollector.o(9637);
            }
        }
    }

    public final boolean a(String str, VEAudioEncodeSettings vEAudioEncodeSettings, VEListener.q qVar) {
        this.f151521j = qVar;
        return a(str, vEAudioEncodeSettings);
    }

    public final boolean a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, VEListener.q qVar) {
        this.f151521j = qVar;
        boolean a2 = a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f150676a);
        if (!a2) {
            this.f151521j = null;
        }
        return a2;
    }

    public final boolean a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.f151521j = null;
        boolean a2 = a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f150676a);
        if (!a2) {
            an.d("VEEditor", "_compile failed");
        }
        return a2;
    }

    public final void a(VEListener.aj ajVar) {
        this.f151523l = ajVar;
        if (this.f151523l != null) {
            TEInterface.openOutputCallback(true);
        }
    }

    public final void a(Looper looper) {
        if (looper != null) {
            this.f151519h = new i(looper);
            return;
        }
        this.f151519h.removeCallbacksAndMessages(null);
        this.f151519h = null;
    }

    private boolean a(String str, String[] strArr, long[] jArr) {
        MethodCollector.i(10933);
        synchronized (this) {
            try {
                if (!this.T) {
                    z zVar = new z(-105, "Make sure the initialization is successful before coding!!!");
                    MethodCollector.o(10933);
                    throw zVar;
                } else if (this.B.getNativeHandler() == 0) {
                    return false;
                } else {
                    u.d a2 = u.a().a("video_duration_opt");
                    int concatShootVideo = this.B.concatShootVideo(str, strArr, jArr, (a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Boolean)) ? false : ((Boolean) a2.f151496b).booleanValue());
                    if (concatShootVideo != 0) {
                        an.d("VEEditor", "concatShootVideo failed = ret: ".concat(String.valueOf(concatShootVideo)));
                        MethodCollector.o(10933);
                        return false;
                    }
                    MethodCollector.o(10933);
                    return true;
                }
            } finally {
                MethodCollector.o(10933);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04bf, code lost:
        if (r21.B.prepareEngine(1) != 0) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04cb, code lost:
        if (r7 != null) goto L_0x04db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r22, java.lang.String r23, com.ss.android.vesdk.VEVideoEncodeSettings r24, com.ss.android.vesdk.VEAudioEncodeSettings r25) {
        /*
        // Method dump skipped, instructions count: 1354
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.x.a(java.lang.String, java.lang.String, com.ss.android.vesdk.VEVideoEncodeSettings, com.ss.android.vesdk.VEAudioEncodeSettings):boolean");
    }

    private boolean a(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        MethodCollector.i(12747);
        synchronized (this) {
            try {
                if (this.T) {
                    if (this.B.getNativeHandler() != 0) {
                        if (!TextUtils.isEmpty(str)) {
                            this.W = System.currentTimeMillis();
                            an.a("VEEditor", "_compileOnlyAudio...");
                            this.B.stop();
                            this.B.setCompileType(16);
                            this.B.setEngineCompilePath(str + ".tmp", str);
                            this.B.setEnableRemuxVideo(true);
                            this.B.setAudioCompileSetting(vEAudioEncodeSettings.f150678c, vEAudioEncodeSettings.f150680e, vEAudioEncodeSettings.f150679d);
                            P();
                            this.B.prepareEngine(1);
                            this.B.start();
                            MethodCollector.o(12747);
                            return true;
                        }
                    }
                    return false;
                }
                z zVar = new z(-105, "Make sure the initialization is successful before coding!!!");
                MethodCollector.o(12747);
                throw zVar;
            } finally {
                MethodCollector.o(12747);
            }
        }
    }

    public final int a(int i2, int i3, g gVar) {
        return this.f151515d.a(i2, i3, gVar);
    }

    public final int a(bg bgVar) {
        return this.f151515d.a(bgVar);
    }

    public final int a(bg bgVar, int i2, int i3) {
        return this.f151515d.a(bgVar, i2, i3);
    }

    public final int a(int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        return this.f151515d.a(0, i2, arrayList, arrayList2);
    }

    public final int a(int i2, ROTATE_DEGREE rotate_degree) {
        return this.f151515d.a(0, i2, rotate_degree);
    }

    public final String a(int i2, int i3, int i4, String str) {
        return this.f151515d.a(i2, i3, i4, str);
    }

    public final int a(String str, int i2, int i3, boolean z2) {
        return this.f151515d.a(str, i2, i3, z2);
    }

    public final int a(int i2, int i3, int i4, boolean z2) {
        return this.f151515d.a(i2, i3, i4, z2);
    }

    public final boolean a(int i2, int i3, float f2) {
        return this.f151515d.a(i2, i3, f2);
    }

    public final int a(String[] strArr, l lVar) {
        return this.aq.initWithAlgorithm(strArr, lVar);
    }

    public final int a(String str, int i2, int i3, VEAlgorithmPath vEAlgorithmPath) {
        return this.aq.setMusicAndResult(str, i2, i3, vEAlgorithmPath);
    }

    public final int b(int i2, ROTATE_DEGREE rotate_degree) {
        return this.aq.setAIRotation(i2, rotate_degree);
    }

    public final int a(int i2, VEListener.i iVar) {
        return this.aq.beginGenVideoFrames(i2, 1, true, iVar);
    }

    public final int a(int i2, String str, String str2) {
        return this.f151514c.a(i2, str, 0, 0, str2);
    }

    public final int[] a(int[] iArr, int[] iArr2, String[] strArr) {
        return this.f151514c.a(iArr, iArr2, strArr);
    }

    public final int[] a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2) {
        return this.f151514c.a(iArr, iArr2, strArr, iArr3, iArr4, strArr2);
    }

    public final int a(int[] iArr) {
        return this.f151514c.a(iArr);
    }

    public final int a(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        return this.f151514c.a(i2, i3, vEBaseFilterParam);
    }

    public final int a(int i2, int i3, VEBaseFilterParam vEBaseFilterParam, int i4, int i5) {
        return this.f151514c.a(i2, i3, vEBaseFilterParam, i4, i5);
    }

    public final int b(int[] iArr) {
        return this.f151514c.b(iArr);
    }

    public final int a(int i2, VEBaseFilterParam vEBaseFilterParam) {
        return this.f151514c.a(i2, vEBaseFilterParam);
    }

    public final int a(String str, float f2) {
        return this.f151514c.a(str, f2);
    }

    public final int a(String str, String str2, float f2) {
        return this.f151514c.a(str, str2, f2);
    }

    public final int b(String str, float f2) {
        return this.f151514c.b(str, f2);
    }

    public final int a(String str, String str2, float f2, float f3, float f4) {
        return this.f151514c.a(str, str2, f2, f3, f4);
    }

    public final int a(VEBaseFilterParam vEBaseFilterParam) {
        return this.f151514c.c(0, 0, vEBaseFilterParam);
    }

    public final int[] a(VECherEffectParam vECherEffectParam) {
        return this.f151514c.a(0, 1, vECherEffectParam);
    }

    public final int a(int i2, int i3, String str, byte[] bArr, int i4, int i5, VEListener.a aVar) {
        return this.f151514c.a(i2, i3, str, bArr, i4, i5, aVar);
    }

    public final int a(int i2, int i3, String str, byte[] bArr, int i4, VEListener.a aVar) {
        return this.f151514c.a(i2, i3, str, bArr, i4, aVar);
    }

    public final int a(String str, String[] strArr) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.addInfoSticker(str, strArr);
        }
        an.d("VEEditor", "addInfoSticker 1 STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int a(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setInfoStickerBufferCallback(vEInfoStickerBufferListener);
        }
        an.d("VEEditor", "setInfoStickerBufferCallback STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int a(String str, float f2, float f3, float f4, float f5) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.addImageSticker(str, f2, f3, f4, f5);
        }
        an.d("VEEditor", "addImageSticker STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int a(int i2, float f2, float f3) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setInfoStickerPosition(i2, f2, f3);
        }
        an.d("VEEditor", "setInfoStickerPosition STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int a(int i2, float[] fArr) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.getSrtInfoStickerInitPosition(i2, fArr);
        }
        an.d("VEEditor", "getSrtInfoStickerInitPosition STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int a(int i2, ByteBuffer[] byteBufferArr) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.getInfoStickerPinData(i2, byteBufferArr);
        }
        an.d("VEEditor", "getInfoStickerPinData STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int a(int i2, ByteBuffer byteBuffer) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.restoreInfoStickerPinWithData(i2, byteBuffer);
        }
        an.d("VEEditor", "restoreInfoStickerPinWithData STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final void a(VEListener.aa aaVar) {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar == null) {
            an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        } else {
            dVar.setListenerForMV(aaVar);
        }
    }

    public final int a(String str, String[] strArr, String[] strArr2, String str2, int i2, int i3) {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.initMV(str, strArr, strArr2, str2, i2, i3);
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public final int a(VEMVParams vEMVParams) {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.initMV(vEMVParams);
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public final int a(String str, int i2, int i3) {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.updateMVBackgroundAudioTrack(str, i2, i3);
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public final int b(VEMVParams vEMVParams) {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.updateMVResources(vEMVParams);
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public final int a(String str, String[] strArr, String[] strArr2) {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.updateMVResources(str, strArr, strArr2);
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public final int a(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type) {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.setExternalAlgorithmResult(str, str2, str3, mv_reesult_in_type);
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public final int a(String[] strArr, int[] iArr, int[] iArr2, VETransitionFilterParam[] vETransitionFilterParamArr, String[] strArr2, int[] iArr3, int[] iArr4, float[] fArr, VECanvasFilterParam[] vECanvasFilterParamArr, l lVar) {
        return b(strArr, iArr, iArr2, vETransitionFilterParamArr, strArr2, iArr3, iArr4, fArr, vECanvasFilterParamArr, lVar);
    }

    public final int a(int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        return this.f151515d.a(i2, 0, iArr, vEClipTimelineParamArr);
    }

    public final int a(String str, int i2, int i3, int i4, int i5, boolean z2) {
        return this.f151515d.a(str, i2, i3, i4, i5, z2);
    }

    public final int a(int i2, int i3, int i4, int i5, int i6, boolean z2) {
        return this.f151515d.a(i2, i3, i4, i5, i6, z2);
    }

    public final int B() {
        return this.aq.restoreAllVideoSound();
    }

    public final int C() {
        return this.aq.genRandomSolve();
    }

    public final int D() {
        return this.aq.genSmartCutting();
    }

    public final List<VEClipAlgorithmParam> E() {
        return this.aq.getAllVideoRangeData();
    }

    public final int F() {
        return this.aq.updateAlgorithmFromNormal();
    }

    public final void G() {
        this.f151514c.a();
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ttve.model.c J() {
        return this.f151514c.d();
    }

    /* access modifiers changed from: protected */
    public final void K() {
        this.f151514c.i();
    }

    /* access modifiers changed from: protected */
    public final int L() {
        return this.f151514c.a();
    }

    public final int e() {
        return this.B.enableHighSpeedForSingle(true);
    }

    public final int t() {
        return this.B.getCurPosition();
    }

    public final int y() {
        return this.f151515d.a(0, 0, 0);
    }

    public final int z() {
        return this.aq.initBingoAlgorithm();
    }

    public final int A() {
        return this.aq.removeAllVideoSound();
    }

    public final String[] l() {
        if (this.f151516e.f151432g) {
            return this.f151516e.f151430e;
        }
        return null;
    }

    public final String[] m() {
        if (this.f151516e.f151432g) {
            return this.f151516e.f151431f;
        }
        return null;
    }

    public final String[] n() {
        return this.f151516e.f151427b;
    }

    static {
        Covode.recordClassIndex(99615);
    }

    private int O() {
        int pause;
        MethodCollector.i(7790);
        synchronized (this) {
            try {
                an.c("VEEditor", "pause... refreshFrame:false");
                pause = this.B.pause(0);
            } finally {
                MethodCollector.o(7790);
            }
        }
        return pause;
    }

    private void P() {
        String generateMd5Checkcode = DigestUtils.generateMd5Checkcode(Build.MODEL.toLowerCase());
        an.c("VEEditor", "addCopyright... ");
        this.B.addMetaData("copyright", generateMd5Checkcode);
    }

    public final int H() {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.getMVBackgroundAudioTrackIndex();
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public final VEMVAudioInfo I() {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.getMVOriginalBackgroundAudio();
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return null;
    }

    public final Bitmap d() {
        an.a("VEEditor", "getCurrDisplayImage...");
        return a(-1);
    }

    public final int p() {
        int O2;
        MethodCollector.i(7842);
        synchronized (this) {
            try {
                O2 = O();
            } finally {
                MethodCollector.o(7842);
            }
        }
        return O2;
    }

    public final int q() {
        int pause;
        MethodCollector.i(7893);
        synchronized (this) {
            try {
                pause = this.B.pause(1);
            } finally {
                MethodCollector.o(7893);
            }
        }
        return pause;
    }

    public final int r() {
        int refreshCurrentFrame;
        MethodCollector.i(7952);
        synchronized (this) {
            try {
                an.b("VEEditor", "refreshCurrentFrame...");
                refreshCurrentFrame = this.B.refreshCurrentFrame(0);
            } finally {
                MethodCollector.o(7952);
            }
        }
        return refreshCurrentFrame;
    }

    public final int s() {
        int duration;
        MethodCollector.i(9108);
        synchronized (this) {
            try {
                duration = this.B.getDuration();
            } finally {
                MethodCollector.o(9108);
            }
        }
        return duration;
    }

    public final boolean w() {
        boolean z2;
        MethodCollector.i(10143);
        synchronized (this) {
            try {
                if (this.B.getNativeHandler() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } finally {
                MethodCollector.o(10143);
            }
        }
        return z2;
    }

    public enum h {
        EDITOR_NORMAl_MODE,
        EDITOR_SLOMO_MODE;

        static {
            Covode.recordClassIndex(99643);
        }
    }

    private void N() {
        an.c("VEEditor", "clearNativeFromInvokers... ");
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            dVar.clearNativeFromMV();
        }
        com.ss.android.vesdk.f.b bVar = this.aq;
        if (bVar != null) {
            bVar.clearNativeFromBingo();
        }
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            fVar.clearNativeFromSticker();
        }
        com.ss.android.vesdk.f.c cVar = this.f151514c;
        if (cVar != null) {
            cVar.j();
        }
    }

    public final void i() {
        MethodCollector.i(8211);
        this.w.set(true);
        an.c("VEEditor", "destroy... set destroying true");
        synchronized (this) {
            try {
                if (this.B != null) {
                    an.c("VEEditor", "onRelease... ");
                    this.B.stop();
                    this.B.releaseEngine();
                }
                this.w.set(false);
            } finally {
                MethodCollector.o(8211);
            }
        }
    }

    public final j k() {
        MethodCollector.i(7147);
        synchronized (this) {
            try {
                TEInterface tEInterface = this.B;
                if (tEInterface == null) {
                    an.c("VEEditor", "video editor is created yet");
                    return j.IDLE;
                }
                int curState = tEInterface.getCurState();
                if (curState < 0) {
                    an.c("VEEditor", "native video editor is not inited, already released or releasing");
                    j jVar = j.IDLE;
                    MethodCollector.o(7147);
                    return jVar;
                }
                j valueOf = j.valueOf(curState);
                MethodCollector.o(7147);
                return valueOf;
            } finally {
                MethodCollector.o(7147);
            }
        }
    }

    public final int u() {
        int cancelGetImages;
        MethodCollector.i(9635);
        synchronized (this) {
            try {
                an.c("VEEditor", "cancelGetVideoFrames...");
                cancelGetImages = this.B.cancelGetImages();
            } finally {
                MethodCollector.o(9635);
            }
        }
        return cancelGetImages;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.x$7  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f151559a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f151560b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.x.AnonymousClass7.<clinit>():void");
        }
    }

    public enum e {
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE,
        SCALE_MODE_FIT_START_WITH_2DENGINE,
        SCALE_MODE_FIT_END_WITH_2DENGINE,
        SCALE_MODE_CANVAS;

        static {
            Covode.recordClassIndex(99640);
        }
    }

    public enum k {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_RIGHT,
        ALIGN_PARENT_BOTTOM,
        CENTER_IN_PARENT,
        CENTER_HORIZONTAL,
        CENTER_VERTICAL;

        static {
            Covode.recordClassIndex(99646);
        }
    }

    public enum l {
        VIDEO_OUT_RATIO_1_1,
        VIDEO_OUT_RATIO_4_3,
        VIDEO_OUT_RATIO_3_4,
        VIDEO_OUT_RATIO_16_9,
        VIDEO_OUT_RATIO_9_16,
        VIDEO_OUT_RATIO_ORIGINAL;

        static {
            Covode.recordClassIndex(99647);
        }
    }

    public enum m {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE;

        static {
            Covode.recordClassIndex(99648);
        }
    }

    private void M() {
        this.f151512a = (com.ss.android.vesdk.f.d) ak.a("com.ss.android.vesdk.VEMVInvoker", new Class[]{x.class}, this);
        this.aq = (com.ss.android.vesdk.f.b) ak.a("com.ss.android.vesdk.VEBingoInvoker", new Class[]{x.class}, this);
        this.f151513b = (com.ss.android.vesdk.f.f) ak.a("com.ss.android.vesdk.VEStickerInvoker", new Class[]{x.class}, this);
        this.f151514c = new ab(this);
        this.f151515d = new bd(this);
        this.ar = new n(this);
        if (this.f151513b == null) {
            an.d("VEEditor", "VEStickerInvoker is NULL");
        }
    }

    public final void h() {
        MethodCollector.i(8129);
        synchronized (this) {
            try {
                if (this.B != null) {
                    an.c("VEEditor", "stop... ");
                    this.B.stop();
                }
            } finally {
                MethodCollector.o(8129);
            }
        }
    }

    public final int o() {
        MethodCollector.i(7728);
        if (this.w.get()) {
            an.c("VEEditor", "no need to play, is destroying, just return");
            MethodCollector.o(7728);
            return 0;
        }
        synchronized (this) {
            try {
                if (this.w.get()) {
                    an.c("VEEditor", "no need to play, is destroying, just lock return");
                    return 0;
                }
                an.c("VEEditor", "play...");
                this.G = 0;
                long currentTimeMillis = System.currentTimeMillis();
                this.I = currentTimeMillis;
                if (this.L == 0) {
                    this.L = currentTimeMillis;
                }
                int start = this.B.start();
                MethodCollector.o(7728);
                return start;
            } finally {
                MethodCollector.o(7728);
            }
        }
    }

    public final boolean v() {
        MethodCollector.i(9810);
        synchronized (this) {
            try {
                if (!this.T) {
                    z zVar = new z(-105, "Make sure the initialization is successful before calling!!!");
                    MethodCollector.o(9810);
                    throw zVar;
                } else if (this.B.getNativeHandler() == 0) {
                    return false;
                } else {
                    VEPublishSettingManager.a.INSTANCE.vePublishSettingManager.nativeSetEditorStatus(this.B.genEditorStatus());
                    boolean nativeIsUseFilterProcess = VEPublishSettingManager.a.INSTANCE.vePublishSettingManager.nativeIsUseFilterProcess();
                    MethodCollector.o(9810);
                    return nativeIsUseFilterProcess;
                }
            } finally {
                MethodCollector.o(9810);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void x() {
        int i2 = this.x;
        int i3 = this.y;
        if (((float) this.f151517f.width) / ((float) this.f151517f.height) > ((float) i2) / ((float) i3)) {
            this.aD = i2;
            this.aE = (int) (((float) i2) / (((float) this.f151517f.width) / ((float) this.f151517f.height)));
        } else {
            this.aE = i3;
            this.aD = (int) (((float) i3) / (((float) this.f151517f.height) / ((float) this.f151517f.width)));
        }
        an.a("VEEditor", "updateInitDisplaySize... mInitDisplayWidth:" + this.aD + ", mInitDisplayHeight:" + this.aE);
    }

    public final int f() {
        int prepareEngine;
        MethodCollector.i(7982);
        synchronized (this) {
            try {
                an.c("VEEditor", "prepare...");
                z(this.ah);
                this.B.setEnableRemuxVideo(false);
                this.B.setUsrRotate(0);
                this.B.enableReEncodeOpt(false);
                int i2 = this.aQ;
                if (i2 == 1) {
                    u.d a2 = u.a().a("ve_editor_firstframe_delay");
                    if (!(a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Integer))) {
                        this.B.setEditorFirstFrameDelay(((Integer) a2.f151496b).intValue());
                    }
                } else if (i2 == 2) {
                    u.d a3 = u.a().a("ve_record_editor_firstframe_delay");
                    if (!(a3 == null || a3.f151496b == null || !(a3.f151496b instanceof Integer))) {
                        this.B.setEditorFirstFrameDelay(((Integer) a3.f151496b).intValue());
                    }
                } else {
                    this.B.setEditorFirstFrameDelay(0);
                }
                prepareEngine = this.B.prepareEngine(0);
                if (prepareEngine != 0) {
                    an.d("VEEditor", "prepare() prepareEngine failed: result: ".concat(String.valueOf(prepareEngine)));
                    b();
                }
                int[] initResolution = this.B.getInitResolution();
                this.f151517f.width = initResolution[0];
                this.f151517f.height = initResolution[1];
                if (this.x > 0 && this.y > 0) {
                    x();
                }
                b(this.ag);
            } finally {
                MethodCollector.o(7982);
            }
        }
        return prepareEngine;
    }

    /* access modifiers changed from: protected */
    public final int g() {
        if (!this.as || !at) {
            return 0;
        }
        z(this.ah);
        if (this.q != null) {
            j jVar = j.ERROR;
            try {
                jVar = k();
                int curPosition = this.B.getCurPosition();
                this.B.setEnableRemuxVideo(false);
                this.B.setUsrRotate(0);
                this.B.enableReEncodeOpt(false);
                int prepareEngine = this.B.prepareEngine(0);
                if (prepareEngine != 0) {
                    an.d("VEEditor", "prepareEngine error: ".concat(String.valueOf(prepareEngine)));
                    this.q.onCallback(4120, jVar.ordinal(), (float) curPosition, null);
                    return prepareEngine;
                }
                int[] initResolution = this.B.getInitResolution();
                this.f151517f.width = initResolution[0];
                this.f151517f.height = initResolution[1];
                if (this.x > 0 && this.y > 0) {
                    x();
                }
                this.q.onCallback(4120, jVar.ordinal(), (float) curPosition, null);
                return 0;
            } catch (Exception e2) {
                an.d("VEEditor", "prepareWithCallback error: ".concat(String.valueOf(e2)));
                this.q.onCallback(4120, jVar.ordinal(), 0.0f, null);
                return -1;
            }
        } else {
            this.B.setEnableRemuxVideo(false);
            this.B.setUsrRotate(0);
            this.B.enableReEncodeOpt(false);
            return this.B.prepareEngine(0);
        }
    }

    public final void j() {
        MethodCollector.i(7136);
        this.w.set(true);
        an.c("VEEditor", "destroy... set destroying true");
        synchronized (this) {
            try {
                this.T = false;
                an.c("VEEditor", "onDestroy... ");
                TEVideoUtils.nativeCancelCompileProbe();
                if (this.B.getNativeHandler() != 0) {
                    this.B.stop();
                    if (this.af == 1) {
                        TEMonitorInvoker.nativeMonitorPerfWithType(3);
                    }
                    SurfaceView surfaceView = this.E;
                    if (surfaceView != null) {
                        surfaceView.getHolder().removeCallback(this.ak);
                    } else {
                        TextureView textureView = this.F;
                        if (textureView != null && textureView.getSurfaceTextureListener() == this.aj) {
                            this.F.setSurfaceTextureListener(null);
                        }
                    }
                    this.E = null;
                    this.F = null;
                    this.C = null;
                    TEInterface tEInterface = this.B;
                    if (tEInterface != null) {
                        tEInterface.setOpenGLListeners(null);
                        this.B.setInfoListener(null);
                        this.B.setErrorListener(null);
                        this.B.destroyEngine();
                        N();
                    }
                    this.f151516e = null;
                    Bitmap bitmap = this.ae;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.ae.recycle();
                        this.ae = null;
                    }
                    this.w.set(false);
                    MethodCollector.o(7136);
                }
            } finally {
                MethodCollector.o(7136);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        String f151569a;

        /* renamed from: b  reason: collision with root package name */
        public String f151570b;

        /* renamed from: c  reason: collision with root package name */
        String f151571c;

        /* renamed from: d  reason: collision with root package name */
        public r f151572d;

        /* renamed from: e  reason: collision with root package name */
        boolean f151573e;

        /* renamed from: f  reason: collision with root package name */
        public String f151574f;

        /* renamed from: g  reason: collision with root package name */
        public int f151575g = 50;

        /* renamed from: h  reason: collision with root package name */
        public int f151576h = 50;

        /* renamed from: i  reason: collision with root package name */
        public int f151577i = 100;

        /* renamed from: j  reason: collision with root package name */
        public int f151578j = 100;

        /* renamed from: k  reason: collision with root package name */
        public boolean f151579k;

        /* renamed from: l  reason: collision with root package name */
        public int f151580l;

        /* renamed from: m  reason: collision with root package name */
        public int f151581m;
        public int n = -1;

        static {
            Covode.recordClassIndex(99637);
        }

        public final void run() {
            String a2;
            String a3;
            if (TextUtils.isEmpty(this.f151570b) || TextUtils.isEmpty(this.f151571c) || this.f151573e) {
                r rVar = this.f151572d;
                if (rVar != null) {
                    rVar.onCallback(4103, -205, 0.0f, "File is empty or running");
                    return;
                }
                return;
            }
            this.f151573e = true;
            if (this.f151579k) {
                a2 = com.a.a(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -y -i %s -vf palettegen=reserve_transparent=on %s", new Object[]{Integer.valueOf(this.f151580l), Integer.valueOf(this.f151581m), this.f151570b, this.f151569a});
            } else {
                a2 = com.a.a("ffmpeg -y -i %s -vf palettegen %s", new Object[]{this.f151570b, this.f151569a});
            }
            int executeFFmpegCommand = TEVideoUtils.executeFFmpegCommand(a2, null);
            if (executeFFmpegCommand != 0) {
                this.f151573e = false;
                r rVar2 = this.f151572d;
                if (rVar2 != null) {
                    rVar2.onCallback(4103, executeFFmpegCommand, 0.0f, "ffmpeg gen palette");
                    return;
                }
                return;
            }
            if (this.f151579k) {
                a3 = com.a.a(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -r %d -y -i %s -i %s -lavfi paletteuse=dither=bayer %s", new Object[]{Integer.valueOf(this.f151580l), Integer.valueOf(this.f151581m), Integer.valueOf(this.n), this.f151570b, this.f151569a, this.f151571c});
            } else if (this.f151574f != null) {
                a3 = com.a.a(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [2:v]scale=w=%d:h=%d[o0];[0:v][o0]overlay=x=%d-w/2:y=%d-h/2[o1];[o1][1:v]paletteuse -f gif %s", new Object[]{this.f151570b, this.f151569a, this.f151574f, Integer.valueOf(this.f151575g), Integer.valueOf(this.f151576h), Integer.valueOf(this.f151577i), Integer.valueOf(this.f151578j), this.f151571c});
            } else {
                a3 = com.a.a(Locale.US, "ffmpeg -y -i %s -i %s -lavfi paletteuse -f gif %s", new Object[]{this.f151570b, this.f151569a, this.f151571c});
            }
            int executeFFmpegCommand2 = TEVideoUtils.executeFFmpegCommand(a3, null);
            r rVar3 = this.f151572d;
            if (rVar3 != null) {
                rVar3.onCallback(4103, executeFFmpegCommand2, 0.0f, "ffmepg convert to gif");
            }
            if (this.f151579k) {
                if (a(new File(this.f151570b))) {
                    an.a("VEEditor", "clear raw data:" + this.f151570b);
                }
                if (a(new File(this.f151569a))) {
                    an.a("VEEditor", "clear palette:" + this.f151569a);
                }
            }
            this.f151573e = false;
        }

        b() {
        }

        public final void a(String str) {
            this.f151571c = str;
            if (TextUtils.isEmpty(str)) {
                this.f151569a = null;
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = this.f151571c;
            this.f151569a = sb.append(str2.substring(0, str2.lastIndexOf("."))).append(".png").toString();
        }

        private static boolean a(File file) {
            MethodCollector.i(8737);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(8737);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(8737);
            return delete;
        }
    }

    public final VESize c() {
        VESize vESize = new VESize(this.aD, this.aE);
        an.b("VEEditor", "getInitSize... initWidth:" + vESize.width + ", initHeight:" + vESize.height);
        return vESize;
    }

    private int A(int i2) {
        return this.f151515d.b(i2);
    }

    public final float b(String str) {
        return this.f151514c.a(str);
    }

    public final int c(String str) {
        return this.f151514c.b(str);
    }

    public final int g(int i2) {
        return A(i2);
    }

    public final float h(int i2) {
        return this.f151515d.c(i2);
    }

    public final int i(int i2) {
        return this.f151515d.a(i2);
    }

    public final int j(int i2) {
        return this.aq.removeMusic(i2);
    }

    public final int k(int i2) {
        return this.aq.cancelGenVideoFrame(i2);
    }

    public final void l(int i2) {
        this.f151514c.a(i2);
    }

    public final int m(int i2) {
        return this.f151514c.b(i2);
    }

    public final int n(int i2) {
        return this.f151514c.c(i2);
    }

    public final int o(int i2) {
        return this.f151514c.d(i2);
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        an.e("VEEditor", "onFrameAvailable...");
    }

    public final int p(int i2) {
        return this.f151514c.e(i2);
    }

    public final int c(int[] iArr) {
        return this.f151514c.c(iArr);
    }

    public final int d(String str) {
        return this.f151514c.a(str, 1.0d);
    }

    public final void i(boolean z2) {
        this.f151514c.a(z2);
    }

    public final void j(boolean z2) {
        this.f151514c.b(z2);
    }

    public final void k(boolean z2) {
        this.f151514c.c(z2);
    }

    private void z(int i2) {
        an.a("VEEditor", "setVideoBackgroudColor... color:".concat(String.valueOf(i2)));
        this.ah = i2;
        this.B.setVideoBackGroundColor(i2);
    }

    public final int c(float f2) {
        com.ss.android.vesdk.f.d dVar = this.f151512a;
        if (dVar != null) {
            return dVar.setMvOriginalAudio(true, f2);
        }
        an.d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public final void e(int i2) {
        this.aQ = i2;
        an.c("VEEditor", "setEditorMode: ".concat(String.valueOf(i2)));
    }

    public final int f(int i2) {
        an.a("VEEditor", "setPreviewFps = ".concat(String.valueOf(i2)));
        this.B.setPreviewFps(i2);
        return 0;
    }

    public final int t(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setInfoStickerRestoreMode(i2);
        }
        an.d("VEEditor", "setInfoStickerRestoreMode STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final float u(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.getInfoStickerScale(i2);
        }
        an.d("VEEditor", "getInfoStickerScale STICKER IS NOT SUPPORT !!!");
        return -901.0f;
    }

    public final float v(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.getInfoStickerRotate(i2);
        }
        an.d("VEEditor", "getInfoStickerRotate STICKER IS NOT SUPPORT !!!");
        return -901.0f;
    }

    public final int x(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.beginInfoStickerPin(i2);
        }
        an.d("VEEditor", "beginInfoStickerPin STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int y(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.cancelInfoStickerPin(i2);
        }
        an.d("VEEditor", "cancelInfoStickerPin STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    private boolean[] c(String[] strArr) {
        boolean[] zArr;
        MethodCollector.i(12749);
        synchronized (this) {
            try {
                int length = strArr.length;
                zArr = new boolean[length];
                for (int i2 = 0; i2 < length; i2++) {
                    String str = strArr[i2];
                    if (str != null && !str.isEmpty()) {
                        zArr[i2] = true;
                    }
                }
            } finally {
                MethodCollector.o(12749);
            }
        }
        return zArr;
    }

    private String[] d(String[] strArr) {
        String[] strArr2;
        MethodCollector.i(12868);
        synchronized (this) {
            try {
                int length = strArr.length;
                this.aF = 0;
                this.aG = 0;
                strArr2 = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    String e2 = e(strArr[i2]);
                    if (e2 == null || e2.isEmpty()) {
                        strArr2[i2] = "";
                    } else {
                        strArr2[i2] = e2;
                    }
                }
            } finally {
                MethodCollector.o(12868);
            }
        }
        return strArr2;
    }

    public final int b(float f2) {
        an.c("VEEditor", "setSpeedRatioAndUpdate = ".concat(String.valueOf(f2)));
        this.B.stop();
        if (f2 > 3.0f) {
            f2 = 3.0f;
        }
        this.B.setSpeedRatio(f2);
        this.B.createTimeline();
        return this.B.prepareEngine(0);
    }

    public final void e(boolean z2) {
        an.a("VEEditor", "setLoopPlay");
        this.B.setLooping(z2);
    }

    public final synchronized void f(boolean z2) {
        MethodCollector.i(8020);
        an.a("VEEditor", "enableSimpleProcessor: " + String.valueOf(z2));
        this.B.enableSimpleProcessor(z2);
        MethodCollector.o(8020);
    }

    public final int h(boolean z2) {
        an.c("VEEditor", "enableEffect... enable = ".concat(String.valueOf(z2)));
        int enableEffect = this.B.enableEffect(z2);
        if (enableEffect != 0) {
            an.d("VEEditor", "enableEffect failed, ret = ".concat(String.valueOf(enableEffect)));
        }
        return enableEffect;
    }

    public final boolean q(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.isInfoStickerAnimatable(i2);
        }
        an.d("VEEditor", "isInfoStickerAnimatable STICKER IS NOT SUPPORT !!!");
        return false;
    }

    public final int r(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.removeInfoSticker(i2);
        }
        an.d("VEEditor", "removeInfoSticker STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final float[] s(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.getInfoStickerBoundingBox(i2);
        }
        an.d("VEEditor", "getInfoStickerBoundingBox STICKER IS NOT SUPPORT !!!");
        return null;
    }

    public final boolean w(int i2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.getInfoStickerVisible(i2);
        }
        an.d("VEEditor", "getInfoStickerVisible STICKER IS NOT SUPPORT !!!");
        return false;
    }

    private int b(e eVar) {
        an.c("VEEditor", "setScaleMode... mode:" + eVar + ", x = 0.0, y = 0.0");
        switch (AnonymousClass7.f151559a[eVar.ordinal()]) {
            case 1:
                this.B.setResizer(2, 0.0f, 0.0f);
                return 0;
            case 2:
                this.B.setResizer(1, 0.0f, 0.0f);
                return 0;
            case 3:
                this.B.setResizer(3, 0.0f, 0.0f);
                return 0;
            case 4:
                this.B.setResizer(4, 0.0f, 0.0f);
                return 0;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                this.B.setResizer(5, 0.0f, 0.0f);
                return 0;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.B.setResizer(6, 0.0f, 0.0f);
                return 0;
            default:
                return 0;
        }
    }

    private String f(String str) {
        MethodCollector.i(7025);
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                String addFileInfoCache = this.B.addFileInfoCache(str);
                if (addFileInfoCache == null || addFileInfoCache.equals("")) {
                    MethodCollector.o(7025);
                    return "";
                }
                long lastModified = new File(str).lastModified();
                if (lastModified == 0) {
                    MethodCollector.o(7025);
                    return "";
                }
                aw.put(str, new Pair<>(Long.valueOf(lastModified), addFileInfoCache));
                MethodCollector.o(7025);
                return addFileInfoCache;
            } finally {
                MethodCollector.o(7025);
            }
        }
    }

    public final void d(int i2) {
        this.af = i2;
        an.c("VEEditor", "setPageMode: ".concat(String.valueOf(i2)));
        this.B.setPageMode(i2);
    }

    /* access modifiers changed from: package-private */
    public class i extends Handler {
        static {
            Covode.recordClassIndex(99644);
        }

        public final void handleMessage(Message message) {
            String obj;
            int i2 = message.what;
            if (i2 != 4101) {
                if (i2 != 4103) {
                    if (i2 != 4105) {
                        if (i2 != 4117) {
                            if (i2 != 4133) {
                                if (i2 == 4157 && x.this.p != null) {
                                    VEListener.e eVar = x.this.p;
                                    int i3 = message.arg1;
                                    int i4 = message.arg2;
                                }
                            } else if (x.this.f151523l != null) {
                                VEListener.aj ajVar = x.this.f151523l;
                                int i5 = message.arg1;
                                int i6 = message.arg2;
                            }
                        } else if (x.this.aa != null) {
                            x.this.aa.a(null, -1, -1);
                            x.this.aa = null;
                        }
                    } else if (x.this.f151521j != null) {
                        x.this.f151521j.onCompileProgress(((Float) message.obj).floatValue());
                    }
                } else if (x.this.f151521j != null) {
                    if (message.arg1 < 0) {
                        VEListener.q qVar = x.this.f151521j;
                        int i7 = message.arg1;
                        int i8 = message.arg1;
                        if (message.obj == null) {
                            obj = "";
                        } else {
                            obj = message.obj.toString();
                        }
                        qVar.onCompileError(i7, i8, 0.0f, obj);
                    } else {
                        x.this.f151521j.onCompileDone();
                    }
                    x.this.f151521j = null;
                }
            } else if (x.this.f151520i != null) {
                x.this.f151520i.a();
                x.this.f151520i = null;
            }
        }

        public i(Looper looper) {
            super(looper);
        }
    }

    public x(String str) {
        this.f151517f = new VESize(-1, -1);
        this.f151518g = "mp4";
        this.f151519h = new i(Looper.getMainLooper());
        this.f151520i = null;
        this.f151521j = null;
        this.f151522k = null;
        this.f151523l = null;
        this.f151524m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new com.ss.android.ttve.common.j();
        this.t = new com.ss.android.ttve.a.a();
        this.as = true;
        this.u = "unknown";
        this.au = null;
        this.av = "/concatShootVideo";
        this.v = new HashMap();
        this.w = new AtomicBoolean(false);
        this.aA = -1;
        this.aB = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99616);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(int i2, int i3, float f2, String str) {
                long j2;
                long j3;
                int i4;
                MethodCollector.i(9395);
                if (i2 == 4101) {
                    if (x.this.M > 0) {
                        System.currentTimeMillis();
                    }
                    if (x.this.f151520i != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        x.this.f151519h.sendEmptyMessage(4101);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        x.this.q.onCallback(4101, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (i2 != 4103) {
                    if (i2 != 4105) {
                        if (i2 != 4129) {
                            if (i2 != 4157) {
                                if (i2 != 4133) {
                                    if (i2 == 4134) {
                                        x.this.ai = f2;
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (i2 != 4144) {
                                        if (i2 != 4145) {
                                            if (i2 != 4160) {
                                                if (i2 != 4161) {
                                                    if (x.this.q != null) {
                                                        an.b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                                        x.this.q.onCallback(i2, i3, f2, str);
                                                    }
                                                } else if (x.this.X && x.this.Y != null) {
                                                    x.this.Y.f151581m = i3;
                                                    MethodCollector.o(9395);
                                                    return;
                                                }
                                            } else if (x.this.X && x.this.Y != null) {
                                                x.this.Y.f151580l = i3;
                                                MethodCollector.o(9395);
                                                return;
                                            }
                                        } else if (x.this.f151524m != null) {
                                            x.this.f151524m.b();
                                            MethodCollector.o(9395);
                                            return;
                                        } else if (x.this.q != null) {
                                            an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                            x.this.q.onCallback(i2, i3, f2, str);
                                            MethodCollector.o(9395);
                                            return;
                                        }
                                    } else if (x.this.f151524m != null) {
                                        x.this.f151524m.a();
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (x.this.q != null) {
                                        an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                        x.this.q.onCallback(i2, i3, f2, str);
                                        MethodCollector.o(9395);
                                        return;
                                    }
                                } else if (!(x.this.f151523l == null || x.this.f151519h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i3;
                                    message.arg2 = (int) f2;
                                    x.this.f151519h.sendMessage(message);
                                    MethodCollector.o(9395);
                                    return;
                                }
                            } else if (!(x.this.p == null || x.this.f151519h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i3;
                                message2.arg2 = (int) f2;
                                x.this.f151519h.sendMessage(message2);
                                MethodCollector.o(9395);
                                return;
                            }
                        } else if (x.this.N == 0) {
                            x.this.N = System.currentTimeMillis();
                            an.a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.o(9395);
                            return;
                        }
                    } else if (x.this.f151521j != null && x.this.f151519h != null) {
                        Message message3 = new Message();
                        message3.what = i2;
                        message3.obj = Float.valueOf(f2);
                        x.this.f151519h.sendMessage(message3);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (x.this.X) {
                    x.this.Y.f151572d = x.this.q;
                    new Thread(x.this.Y).start();
                    x.this.X = false;
                    MethodCollector.o(9395);
                    return;
                } else {
                    x xVar = x.this;
                    if (i3 == 1 || i3 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - xVar.W;
                        an.c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        com.ss.android.ttve.monitor.h.a("te_composition_time", currentTimeMillis);
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_time", currentTimeMillis);
                        if (com.ss.android.medialib.e.a(xVar.V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(xVar.V, iArr) != null) {
                                long length = new File(xVar.V).length();
                                com.ss.android.ttve.monitor.h.a("te_composition_page_mode", (long) xVar.af);
                                double d2 = (double) length;
                                Double.isNaN(d2);
                                double d3 = (d2 / 1024.0d) / 1024.0d;
                                com.ss.android.ttve.monitor.h.a("te_composition_file_size", d3);
                                com.ss.android.ttve.monitor.h.a("te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a("te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    an.c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_page_mode", (long) xVar.af);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_fps", (double) iArr[7]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_size", d3);
                                int i5 = xVar.ac.f61225c;
                                if (i5 != 0) {
                                    com.ss.android.ttve.monitor.h.a(1, "te_composition_time_filter_type", (long) i5);
                                }
                                com.ss.android.ttve.editorInfo.a.a("te_composition_file_duration", (long) iArr[3]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_frame_rate", (long) iArr[7]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_width", (long) iArr[0]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b2 = xVar.ac.b();
                        if (b2) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_add", j2);
                        if (!b2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_json", xVar.ac.a(0));
                        }
                        boolean c2 = xVar.ac.c();
                        if (c2) {
                            j3 = 0;
                        } else {
                            j3 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_add", j3);
                        if (!c2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_json", xVar.ac.a(1));
                        }
                        xVar.ac.a();
                        TEMonitorInvoker.nativeMonitorPerf(com.ss.android.ttve.monitor.h.f61219b);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_file", xVar.f151518g);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_result", "succ");
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.ss.android.ttve.monitor.h.a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", xVar.u);
                            if (i3 == 1 || i3 == 2) {
                                i4 = 0;
                            } else {
                                i4 = i3;
                            }
                            jSONObject.put("resultCode", i4);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (x.this.f151521j != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i3;
                        message4.obj = str;
                        x.this.f151519h.sendMessage(message4);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                }
                MethodCollector.o(9395);
            }
        };
        this.aC = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99633);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(final int i2, final int i3, final float f2, final String str) {
                x.this.b();
                if (x.this.r != null) {
                    x.this.r.onCallback(i2, i3, f2, str);
                }
                if (x.this.f151521j != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass8.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99634);
                        }

                        public final void run() {
                            if (x.this.f151521j != null) {
                                x.this.f151521j.onCompileError(i2, i3, f2, str);
                            }
                        }
                    });
                }
            }
        };
        this.x = 0;
        this.y = 0;
        this.aD = 0;
        this.aE = 0;
        this.z = false;
        this.A = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.aF = 0;
        this.aG = 0;
        this.aH = 0;
        this.P = -1;
        this.R = k.ALIGN_PARENT_BOTTOM;
        this.S = m.CENTER;
        this.T = false;
        this.aI = false;
        this.aJ = false;
        this.U = -1;
        this.V = null;
        this.W = 0;
        this.aK = false;
        this.X = false;
        this.Y = null;
        this.Z = null;
        this.aa = null;
        this.ab = null;
        this.ac = new com.ss.android.ttve.monitor.i();
        this.ad = false;
        this.aL = true;
        this.aM = false;
        this.ae = null;
        this.aN = 0.0f;
        this.aO = 1.0f;
        this.aP = 1.0f;
        this.af = -1;
        this.aQ = -1;
        this.ag = -16777216;
        this.ah = -16777216;
        this.ai = 0.0f;
        this.aj = new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.vesdk.x.AnonymousClass9 */

            static {
                Covode.recordClassIndex(99635);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                x.this.a();
                if (x.this.D == null) {
                    return true;
                }
                x.this.D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                x.this.x = i2;
                x.this.y = i3;
                x.this.x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (x.this.C == surfaceTexture) {
                    x xVar = x.this;
                    xVar.a(xVar.D);
                } else {
                    x.this.D = new Surface(surfaceTexture);
                    x xVar2 = x.this;
                    xVar2.a(xVar2.D);
                }
                x.this.C = surfaceTexture;
            }
        };
        this.ak = new SurfaceHolder.Callback2() {
            /* class com.ss.android.vesdk.x.AnonymousClass10 */

            static {
                Covode.recordClassIndex(99617);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                an.b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                x.this.a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (x.this.w.get()) {
                    an.c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    x.this.a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                an.b("VEEditor", com.a.a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
                x.this.a(i3, i4);
            }
        };
        this.aR = new NativeCallbacks.h() {
            /* class com.ss.android.vesdk.x.AnonymousClass11 */

            static {
                Covode.recordClassIndex(99618);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2) {
                an.b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int b(int i2) {
                an.b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2, double d2) {
                long j2;
                long j3;
                an.e("VEEditor", "onOpenGLDrawing: tex = " + i2 + " timeStamp = " + d2);
                if (!x.this.O) {
                    x.this.O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (x.this.N > 0) {
                        j2 = x.this.N;
                    } else {
                        j2 = currentTimeMillis;
                    }
                    if (x.this.L > 0) {
                        j3 = x.this.L;
                    } else {
                        j3 = x.this.K;
                    }
                    if (j3 == 0 || j3 < x.this.J) {
                        an.d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + x.this.L + ", mlFirstSeekTimeMS = " + x.this.K + ", mlInitTimeMS = " + x.this.J);
                        j3 = x.this.J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j3 - x.this.J);
                        jSONObject.put("time_seek", j2 - j3);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j2);
                        jSONObject.put("time_total", currentTimeMillis - x.this.J);
                        jSONObject.put("usage_type", x.this.u);
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        an.a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e2) {
                        an.d("VEEditor", "report first frame json err ".concat(String.valueOf(e2)));
                    }
                    com.ss.android.ttve.monitor.h.a(1, "te_edit_first_frame_time", currentTimeMillis - x.this.J);
                    if (x.this.f151522k != null) {
                        x.this.f151522k.a();
                    }
                }
                x.this.G++;
                if (x.this.G == 30) {
                    x.this.H = System.currentTimeMillis();
                    if (x.this.I != x.this.H) {
                        float f2 = 30000.0f / ((float) (x.this.H - x.this.I));
                        if (az.f151039c) {
                            an.a("VEEditor", "Render FPS = ".concat(String.valueOf(f2)));
                        }
                        x xVar = x.this;
                        xVar.I = xVar.H;
                        x.this.G = 0;
                    }
                }
                return 0;
            }
        };
        this.aS = new NativeCallbacks.c() {
            /* class com.ss.android.vesdk.x.AnonymousClass12 */

            static {
                Covode.recordClassIndex(99619);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.c
            public final int a(byte[] bArr, int i2, int i3, boolean z) {
                if (bArr == null || i2 < 0 || i3 <= 0) {
                    return -1;
                }
                if (x.this.Z == null) {
                    return -2;
                }
                x.this.Z.a(bArr, i2, i3, z);
                return 0;
            }
        };
        this.aT = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass13 */

            static {
                Covode.recordClassIndex(99620);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.aa == null) {
                    return -100;
                }
                if (bArr != null || x.this.f151519h == null) {
                    return x.this.aa.a(bArr, i2, i3);
                }
                Message message = new Message();
                message.what = 4117;
                x.this.f151519h.sendMessage(message);
                return 0;
            }
        };
        this.aU = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass14 */

            static {
                Covode.recordClassIndex(99621);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return x.this.ab.a(bArr, i2, i3);
            }
        };
        this.aV = new NativeCallbacks.g() {
            /* class com.ss.android.vesdk.x.AnonymousClass15 */

            static {
                Covode.recordClassIndex(99622);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int a() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.a();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int b() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.b();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int c() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.c();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int d() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.d();
            }
        };
        this.aW = new NativeCallbacks.e() {
            /* class com.ss.android.vesdk.x.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99623);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final int i4) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99624);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final String str) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(99625);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                if (str != null) {
                                    x.this.v.put(Integer.valueOf(i2), str);
                                }
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            an.a("VEEditor", "VEEditor offscreen");
            this.B = TEInterface.createEngine();
            this.f151516e = new com.ss.android.vesdk.runtime.b(str);
            this.B.setOpenGLListeners(this.aR);
            this.B.setInfoListener(this.aB);
            this.B.setErrorListener(this.aC);
            com.ss.android.ttve.monitor.e.a("iesve_veeditor_offscreen", 1, (com.ss.android.vesdk.g.a) null);
            c(false);
            M();
            return;
        }
        throw new z(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    public static int c(int i2) {
        boolean z2;
        boolean z3;
        an.a("VEEditor", "setOptConfig... ".concat(String.valueOf(i2)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("config", i2);
            com.ss.android.ttve.monitor.b.a("vesdk_event_editor_opt_config", jSONObject, "performance");
        } catch (JSONException e2) {
            an.d("VEEditor", "report optConfig json err ".concat(String.valueOf(e2)));
        }
        boolean z4 = false;
        if (((Boolean) u.a().a("crossplat_glbase_fbo", (Object) false)).booleanValue()) {
            i2 |= 2097152;
        }
        if (((Boolean) u.a().a("use_byte264", (Object) false)).booleanValue()) {
            i2 |= 33554432;
        }
        boolean booleanValue = ((Boolean) u.a().a("optimize srv_um crash", (Object) false)).booleanValue();
        if (booleanValue) {
            i2 |= 1073741824;
        }
        an.d("VEEditor", "enableColorspace: ".concat(String.valueOf(booleanValue)));
        if (((Boolean) u.a().a("color_space", (Object) false)).booleanValue()) {
            i2 |= 536870912;
        }
        if (((Boolean) u.a().a("ve_enable_render_encode_resolution_align4", (Object) false)).booleanValue() && Build.VERSION.SDK_INT >= 24) {
            an.a("VEEditor", "enableRenderEncodeAlign4: true");
            i2 |= 16777216;
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        if ((i2 & 8) == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        az.f151038b = z2;
        if ((i2 & 8192) == 8192) {
            z3 = true;
        } else {
            z3 = false;
        }
        az.f151040d = z3;
        if ((i2 & 16777216) == 16777216) {
            z4 = true;
        }
        az.f151041e = z4;
        an.a(az.f151037a, "setConfig, sUseSingleGLThread = " + az.f151038b + ", sSeekTimeCostOpt = " + az.f151040d + ", sOutResolutionBase4 = " + az.f151041e);
        return TEInterface.setEnableOpt(i2);
    }

    private String e(String str) {
        MethodCollector.i(7010);
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(str)) {
                    an.a("VEEditor", "file info cache miss: ".concat(String.valueOf(str)));
                    this.aG++;
                    return "";
                }
                Pair<Long, String> pair = aw.get(str);
                if (pair == null) {
                    an.a("VEEditor", "file info cache miss: ".concat(String.valueOf(str)));
                    this.aG++;
                    String f2 = f(str);
                    if (f2.equals("")) {
                        an.d("VEEditor", "add file info cache for " + str + " failed");
                        MethodCollector.o(7010);
                        return "";
                    }
                    MethodCollector.o(7010);
                    return f2;
                }
                long lastModified = new File(str).lastModified();
                if (lastModified == 0) {
                    aw.remove(str);
                    an.a("VEEditor", "file info cache miss: ".concat(String.valueOf(str)));
                    this.aG++;
                    MethodCollector.o(7010);
                    return "";
                } else if (lastModified > ((Long) pair.first).longValue()) {
                    aw.remove(str);
                    String f3 = f(str);
                    if (f3.equals("")) {
                        an.a("VEEditor", "file info cache miss: ".concat(String.valueOf(str)));
                        MethodCollector.o(7010);
                        return "";
                    }
                    an.a("VEEditor", "update file info cache for ".concat(String.valueOf(str)));
                    this.aG++;
                    MethodCollector.o(7010);
                    return f3;
                } else {
                    an.a("VEEditor", "file info cache hit: ".concat(String.valueOf(str)));
                    this.aF++;
                    String str2 = (String) pair.second;
                    MethodCollector.o(7010);
                    return str2;
                }
            } finally {
                MethodCollector.o(7010);
            }
        }
    }

    public final void d(boolean z2) {
        an.a("VEEditor", "setAutoPrepare... ".concat(String.valueOf(z2)));
        this.as = z2;
    }

    public final int g(boolean z2) {
        String[] strArr;
        boolean z3;
        boolean z4;
        MethodCollector.i(7182);
        synchronized (this) {
            try {
                an.c("VEEditor", "enableReversePlay:".concat(String.valueOf(z2)));
                if (!this.f151516e.f151432g) {
                    an.d("VEEditor", "enableReversePlay error: reverse video is not ready!");
                    return -100;
                }
                com.ss.android.vesdk.runtime.b bVar = this.f151516e;
                if (bVar == null || bVar.f151430e == null || this.f151516e.f151430e.length <= 0) {
                    an.d("VEEditor", "enableReversePlay error: reverse video path is invalid!");
                    MethodCollector.o(7182);
                    return -105;
                }
                TEVideoUtils.nativeCancelCompileProbe();
                long durationUs = this.B.getDurationUs();
                this.B.stop();
                if (z2) {
                    strArr = this.f151516e.f151430e;
                } else {
                    strArr = this.f151516e.f151427b;
                }
                int updateTrackClips = this.B.updateTrackClips(0, 0, strArr);
                if (updateTrackClips != 0) {
                    an.d("VEEditor", "updateTrackClips failed, ret = ".concat(String.valueOf(updateTrackClips)));
                    MethodCollector.o(7182);
                    return updateTrackClips;
                }
                StringBuilder sb = new StringBuilder("enableReversePlay: mReverseAudioPaths == null: ");
                if (this.f151516e.f151431f == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                an.a("VEEditor", sb.append(z3).toString());
                an.a("VEEditor", "enableReversePlay: mOriginalSoundTrackType = " + this.f151516e.f151436k);
                if (!(this.f151516e.f151431f == null || this.f151516e.f151436k == 1)) {
                    int addAudioTrack = this.B.addAudioTrack(this.f151516e.f151431f[0], 0, this.B.getDuration(), 0, this.B.getDuration(), false);
                    this.f151516e.f151435j = this.s.a(addAudioTrack);
                    this.f151516e.f151436k = 1;
                    this.f151516e.f151433h = true;
                    an.c("VEEditor", "enableReversePlay: add org audio track index = " + this.f151516e.f151435j + " mOriginalSoundTrackType = " + this.f151516e.f151436k);
                }
                TEInterface tEInterface = this.B;
                if (z2 != this.aK) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                tEInterface.updateTrackFilterDuration(0, 0, z4, durationUs);
                this.B.createTimeline();
                int prepareEngine = this.B.prepareEngine(0);
                if (prepareEngine != 0) {
                    an.d("VEEditor", "enableReversePlay() prepareEngine failed: result: ".concat(String.valueOf(prepareEngine)));
                    MethodCollector.o(7182);
                    return prepareEngine;
                }
                this.f151514c.i();
                a(0, f.EDITOR_SEEK_FLAG_LastSeek);
                this.aK = z2;
                if (z2) {
                    com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
                    aVar.a("iesve_veeditor_time_effect_id", "reverse");
                    com.ss.android.ttve.monitor.e.a("iesve_veeditor_time_effect", 1, aVar);
                    this.ac.f61225c = 3;
                }
                MethodCollector.o(7182);
                return 0;
            } finally {
                MethodCollector.o(7182);
            }
        }
    }

    private boolean b(VEVideoEncodeSettings vEVideoEncodeSettings) {
        com.ss.android.vesdk.runtime.b bVar;
        if (this.au == null || (bVar = this.f151516e) == null) {
            an.d("VEEditor", "concatShootVideo mRecordData or mResManager is empty ");
            return false;
        }
        String str = bVar.f151426a;
        if (str.isEmpty()) {
            an.d("VEEditor", "workSpace is empty ");
            return false;
        }
        String str2 = str + "/concatShootVideo" + System.currentTimeMillis();
        an.b("VEEditor", "concatVideoPath = ".concat(String.valueOf(str2)));
        List<VERecordData.VERecordSegmentData> list = this.au.f150790b;
        if (list != null && list.size() > 1) {
            an.b("VEEditor", "listRecordSegmentData size() = " + list.size());
            String[] strArr = new String[list.size()];
            long[] jArr = new long[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                VERecordData.VERecordSegmentData vERecordSegmentData = list.get(i2);
                strArr[i2] = vERecordSegmentData.f150794a;
                jArr[i2] = vERecordSegmentData.f150796c;
            }
            if (a(vEVideoEncodeSettings) && vEVideoEncodeSettings.isEnableRemuxVideoForShoot() && this.au.a()) {
                if (!t.a(strArr)) {
                    an.d("VEEditor", "isCodecsValid false ");
                    this.aA = 1025;
                    return false;
                }
                boolean a2 = a(str2, strArr, jArr);
                an.d("VEEditor", "_concatShootVideo ret = ".concat(String.valueOf(a2)));
                if (a2 && aa.b(str2)) {
                    this.B.stop();
                    if (this.B.updateTrackClips(0, 0, new String[]{str2}) != 0) {
                        an.d("VEEditor", "updateTrackClips failed, ret = ".concat(String.valueOf(a2)));
                        return false;
                    }
                    this.B.createTimeline();
                    return true;
                }
            }
        }
        return false;
    }

    public final int c(boolean z2) {
        int enableEffectAmazing;
        MethodCollector.i(7911);
        synchronized (this) {
            try {
                enableEffectAmazing = this.B.enableEffectAmazing(z2);
            } finally {
                MethodCollector.o(7911);
            }
        }
        return enableEffectAmazing;
    }

    private static boolean a(File file) {
        MethodCollector.i(10141);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(10141);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10141);
        return delete;
    }

    public x(String str, SurfaceView surfaceView) {
        this(str, surfaceView, null, (byte) 0);
    }

    public final int f(int i2, int i3) {
        return this.f151515d.b(0, i2, i3);
    }

    public final int e(int i2, int i3) {
        return this.f151515d.a(i2, i3);
    }

    public final List<VEClipParam> g(int i2, int i3) {
        return this.f151515d.b(i2, i3);
    }

    public final int h(int i2, int i3) {
        return this.f151514c.a(i2, i3);
    }

    public x(String str, TextureView textureView) {
        this(str, textureView, (byte) 0);
    }

    public final int a(int i2, float f2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setInfoStickerRotation(i2, f2);
        }
        an.d("VEEditor", "setInfoStickerRotation STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int b(int i2, float f2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setInfoStickerScale(i2, f2);
        }
        an.d("VEEditor", "setInfoStickerScale STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int i(int i2, int i3) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setInfoStickerLayer(i2, i3);
        }
        an.d("VEEditor", "setInfoStickerLayer STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int c(int i2, float f2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setInfoStickerAlpha(i2, f2);
        }
        an.d("VEEditor", "setInfoStickerAlpha STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final int c(String str, float f2) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.addImageStickerWithRatio(str, 0.0f, 0.0f, 1.0f, f2);
        }
        an.d("VEEditor", "addImageStickerWithRatio STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    public final void d(int i2, int i3) {
        an.a("VEEditor", "setMaxWidthHeight... width:" + i2 + ", height:" + i3);
        this.B.setMaxWidthHeight(i2, i3);
    }

    public final void c(int i2, int i3) {
        an.a("VEEditor", "setWidthHeight... width:" + i2 + ", height:" + i3);
        this.B.setWidthHeight(i2, i3);
    }

    public static LoudnessDetectResult[] a(String[] strArr, int[] iArr, int[] iArr2) {
        return TEInterface.detectAudioLoudness(strArr, iArr, iArr2);
    }

    public x(String str, SurfaceView surfaceView, bj bjVar) {
        this(str, surfaceView, bjVar, (byte) 0);
    }

    public final int a(int i2, int i3, int i4) {
        return this.f151514c.a(i2, i3, i4);
    }

    public final int b(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        return this.f151514c.b(i2, i3, vEBaseFilterParam);
    }

    public x(String str, SurfaceView surfaceView, long j2) {
        this.f151517f = new VESize(-1, -1);
        this.f151518g = "mp4";
        this.f151519h = new i(Looper.getMainLooper());
        this.f151520i = null;
        this.f151521j = null;
        this.f151522k = null;
        this.f151523l = null;
        this.f151524m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new com.ss.android.ttve.common.j();
        this.t = new com.ss.android.ttve.a.a();
        this.as = true;
        this.u = "unknown";
        this.au = null;
        this.av = "/concatShootVideo";
        this.v = new HashMap();
        this.w = new AtomicBoolean(false);
        this.aA = -1;
        this.aB = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99616);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(int i2, int i3, float f2, String str) {
                long j2;
                long j3;
                int i4;
                MethodCollector.i(9395);
                if (i2 == 4101) {
                    if (x.this.M > 0) {
                        System.currentTimeMillis();
                    }
                    if (x.this.f151520i != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        x.this.f151519h.sendEmptyMessage(4101);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        x.this.q.onCallback(4101, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (i2 != 4103) {
                    if (i2 != 4105) {
                        if (i2 != 4129) {
                            if (i2 != 4157) {
                                if (i2 != 4133) {
                                    if (i2 == 4134) {
                                        x.this.ai = f2;
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (i2 != 4144) {
                                        if (i2 != 4145) {
                                            if (i2 != 4160) {
                                                if (i2 != 4161) {
                                                    if (x.this.q != null) {
                                                        an.b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                                        x.this.q.onCallback(i2, i3, f2, str);
                                                    }
                                                } else if (x.this.X && x.this.Y != null) {
                                                    x.this.Y.f151581m = i3;
                                                    MethodCollector.o(9395);
                                                    return;
                                                }
                                            } else if (x.this.X && x.this.Y != null) {
                                                x.this.Y.f151580l = i3;
                                                MethodCollector.o(9395);
                                                return;
                                            }
                                        } else if (x.this.f151524m != null) {
                                            x.this.f151524m.b();
                                            MethodCollector.o(9395);
                                            return;
                                        } else if (x.this.q != null) {
                                            an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                            x.this.q.onCallback(i2, i3, f2, str);
                                            MethodCollector.o(9395);
                                            return;
                                        }
                                    } else if (x.this.f151524m != null) {
                                        x.this.f151524m.a();
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (x.this.q != null) {
                                        an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                        x.this.q.onCallback(i2, i3, f2, str);
                                        MethodCollector.o(9395);
                                        return;
                                    }
                                } else if (!(x.this.f151523l == null || x.this.f151519h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i3;
                                    message.arg2 = (int) f2;
                                    x.this.f151519h.sendMessage(message);
                                    MethodCollector.o(9395);
                                    return;
                                }
                            } else if (!(x.this.p == null || x.this.f151519h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i3;
                                message2.arg2 = (int) f2;
                                x.this.f151519h.sendMessage(message2);
                                MethodCollector.o(9395);
                                return;
                            }
                        } else if (x.this.N == 0) {
                            x.this.N = System.currentTimeMillis();
                            an.a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.o(9395);
                            return;
                        }
                    } else if (x.this.f151521j != null && x.this.f151519h != null) {
                        Message message3 = new Message();
                        message3.what = i2;
                        message3.obj = Float.valueOf(f2);
                        x.this.f151519h.sendMessage(message3);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (x.this.X) {
                    x.this.Y.f151572d = x.this.q;
                    new Thread(x.this.Y).start();
                    x.this.X = false;
                    MethodCollector.o(9395);
                    return;
                } else {
                    x xVar = x.this;
                    if (i3 == 1 || i3 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - xVar.W;
                        an.c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        com.ss.android.ttve.monitor.h.a("te_composition_time", currentTimeMillis);
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_time", currentTimeMillis);
                        if (com.ss.android.medialib.e.a(xVar.V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(xVar.V, iArr) != null) {
                                long length = new File(xVar.V).length();
                                com.ss.android.ttve.monitor.h.a("te_composition_page_mode", (long) xVar.af);
                                double d2 = (double) length;
                                Double.isNaN(d2);
                                double d3 = (d2 / 1024.0d) / 1024.0d;
                                com.ss.android.ttve.monitor.h.a("te_composition_file_size", d3);
                                com.ss.android.ttve.monitor.h.a("te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a("te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    an.c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_page_mode", (long) xVar.af);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_fps", (double) iArr[7]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_size", d3);
                                int i5 = xVar.ac.f61225c;
                                if (i5 != 0) {
                                    com.ss.android.ttve.monitor.h.a(1, "te_composition_time_filter_type", (long) i5);
                                }
                                com.ss.android.ttve.editorInfo.a.a("te_composition_file_duration", (long) iArr[3]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_frame_rate", (long) iArr[7]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_width", (long) iArr[0]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b2 = xVar.ac.b();
                        if (b2) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_add", j2);
                        if (!b2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_json", xVar.ac.a(0));
                        }
                        boolean c2 = xVar.ac.c();
                        if (c2) {
                            j3 = 0;
                        } else {
                            j3 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_add", j3);
                        if (!c2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_json", xVar.ac.a(1));
                        }
                        xVar.ac.a();
                        TEMonitorInvoker.nativeMonitorPerf(com.ss.android.ttve.monitor.h.f61219b);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_file", xVar.f151518g);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_result", "succ");
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.ss.android.ttve.monitor.h.a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", xVar.u);
                            if (i3 == 1 || i3 == 2) {
                                i4 = 0;
                            } else {
                                i4 = i3;
                            }
                            jSONObject.put("resultCode", i4);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (x.this.f151521j != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i3;
                        message4.obj = str;
                        x.this.f151519h.sendMessage(message4);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                }
                MethodCollector.o(9395);
            }
        };
        this.aC = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99633);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(final int i2, final int i3, final float f2, final String str) {
                x.this.b();
                if (x.this.r != null) {
                    x.this.r.onCallback(i2, i3, f2, str);
                }
                if (x.this.f151521j != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass8.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99634);
                        }

                        public final void run() {
                            if (x.this.f151521j != null) {
                                x.this.f151521j.onCompileError(i2, i3, f2, str);
                            }
                        }
                    });
                }
            }
        };
        this.x = 0;
        this.y = 0;
        this.aD = 0;
        this.aE = 0;
        this.z = false;
        this.A = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.aF = 0;
        this.aG = 0;
        this.aH = 0;
        this.P = -1;
        this.R = k.ALIGN_PARENT_BOTTOM;
        this.S = m.CENTER;
        this.T = false;
        this.aI = false;
        this.aJ = false;
        this.U = -1;
        this.V = null;
        this.W = 0;
        this.aK = false;
        this.X = false;
        this.Y = null;
        this.Z = null;
        this.aa = null;
        this.ab = null;
        this.ac = new com.ss.android.ttve.monitor.i();
        this.ad = false;
        this.aL = true;
        this.aM = false;
        this.ae = null;
        this.aN = 0.0f;
        this.aO = 1.0f;
        this.aP = 1.0f;
        this.af = -1;
        this.aQ = -1;
        this.ag = -16777216;
        this.ah = -16777216;
        this.ai = 0.0f;
        this.aj = new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.vesdk.x.AnonymousClass9 */

            static {
                Covode.recordClassIndex(99635);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                x.this.a();
                if (x.this.D == null) {
                    return true;
                }
                x.this.D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                x.this.x = i2;
                x.this.y = i3;
                x.this.x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (x.this.C == surfaceTexture) {
                    x xVar = x.this;
                    xVar.a(xVar.D);
                } else {
                    x.this.D = new Surface(surfaceTexture);
                    x xVar2 = x.this;
                    xVar2.a(xVar2.D);
                }
                x.this.C = surfaceTexture;
            }
        };
        this.ak = new SurfaceHolder.Callback2() {
            /* class com.ss.android.vesdk.x.AnonymousClass10 */

            static {
                Covode.recordClassIndex(99617);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                an.b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                x.this.a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (x.this.w.get()) {
                    an.c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    x.this.a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                an.b("VEEditor", com.a.a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
                x.this.a(i3, i4);
            }
        };
        this.aR = new NativeCallbacks.h() {
            /* class com.ss.android.vesdk.x.AnonymousClass11 */

            static {
                Covode.recordClassIndex(99618);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2) {
                an.b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int b(int i2) {
                an.b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2, double d2) {
                long j2;
                long j3;
                an.e("VEEditor", "onOpenGLDrawing: tex = " + i2 + " timeStamp = " + d2);
                if (!x.this.O) {
                    x.this.O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (x.this.N > 0) {
                        j2 = x.this.N;
                    } else {
                        j2 = currentTimeMillis;
                    }
                    if (x.this.L > 0) {
                        j3 = x.this.L;
                    } else {
                        j3 = x.this.K;
                    }
                    if (j3 == 0 || j3 < x.this.J) {
                        an.d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + x.this.L + ", mlFirstSeekTimeMS = " + x.this.K + ", mlInitTimeMS = " + x.this.J);
                        j3 = x.this.J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j3 - x.this.J);
                        jSONObject.put("time_seek", j2 - j3);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j2);
                        jSONObject.put("time_total", currentTimeMillis - x.this.J);
                        jSONObject.put("usage_type", x.this.u);
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        an.a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e2) {
                        an.d("VEEditor", "report first frame json err ".concat(String.valueOf(e2)));
                    }
                    com.ss.android.ttve.monitor.h.a(1, "te_edit_first_frame_time", currentTimeMillis - x.this.J);
                    if (x.this.f151522k != null) {
                        x.this.f151522k.a();
                    }
                }
                x.this.G++;
                if (x.this.G == 30) {
                    x.this.H = System.currentTimeMillis();
                    if (x.this.I != x.this.H) {
                        float f2 = 30000.0f / ((float) (x.this.H - x.this.I));
                        if (az.f151039c) {
                            an.a("VEEditor", "Render FPS = ".concat(String.valueOf(f2)));
                        }
                        x xVar = x.this;
                        xVar.I = xVar.H;
                        x.this.G = 0;
                    }
                }
                return 0;
            }
        };
        this.aS = new NativeCallbacks.c() {
            /* class com.ss.android.vesdk.x.AnonymousClass12 */

            static {
                Covode.recordClassIndex(99619);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.c
            public final int a(byte[] bArr, int i2, int i3, boolean z) {
                if (bArr == null || i2 < 0 || i3 <= 0) {
                    return -1;
                }
                if (x.this.Z == null) {
                    return -2;
                }
                x.this.Z.a(bArr, i2, i3, z);
                return 0;
            }
        };
        this.aT = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass13 */

            static {
                Covode.recordClassIndex(99620);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.aa == null) {
                    return -100;
                }
                if (bArr != null || x.this.f151519h == null) {
                    return x.this.aa.a(bArr, i2, i3);
                }
                Message message = new Message();
                message.what = 4117;
                x.this.f151519h.sendMessage(message);
                return 0;
            }
        };
        this.aU = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass14 */

            static {
                Covode.recordClassIndex(99621);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return x.this.ab.a(bArr, i2, i3);
            }
        };
        this.aV = new NativeCallbacks.g() {
            /* class com.ss.android.vesdk.x.AnonymousClass15 */

            static {
                Covode.recordClassIndex(99622);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int a() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.a();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int b() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.b();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int c() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.c();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int d() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.d();
            }
        };
        this.aW = new NativeCallbacks.e() {
            /* class com.ss.android.vesdk.x.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99623);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final int i4) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99624);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final String str) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(99625);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                if (str != null) {
                                    x.this.v.put(Integer.valueOf(i2), str);
                                }
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            an.a("VEEditor", "VEEditor surfaceView with handler:".concat(String.valueOf(j2)));
            this.B = TEInterface.createEngine(j2);
            this.f151516e = new com.ss.android.vesdk.runtime.b(str);
            this.E = surfaceView;
            surfaceView.getHolder().addCallback(this.ak);
            this.B.setOpenGLListeners(this.aR);
            this.B.setInfoListener(this.aB);
            this.B.setErrorListener(this.aC);
            c(false);
            M();
            return;
        }
        throw new z(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    public final int b(int i2, float f2, float f3) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setSrtInitialPosition(i2, f2, f3);
        }
        an.d("VEEditor", "setSrtInitialPosition STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    private x(String str, TextureView textureView, byte b2) {
        this.f151517f = new VESize(-1, -1);
        this.f151518g = "mp4";
        this.f151519h = new i(Looper.getMainLooper());
        this.f151520i = null;
        this.f151521j = null;
        this.f151522k = null;
        this.f151523l = null;
        this.f151524m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new com.ss.android.ttve.common.j();
        this.t = new com.ss.android.ttve.a.a();
        this.as = true;
        this.u = "unknown";
        this.au = null;
        this.av = "/concatShootVideo";
        this.v = new HashMap();
        this.w = new AtomicBoolean(false);
        this.aA = -1;
        this.aB = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99616);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(int i2, int i3, float f2, String str) {
                long j2;
                long j3;
                int i4;
                MethodCollector.i(9395);
                if (i2 == 4101) {
                    if (x.this.M > 0) {
                        System.currentTimeMillis();
                    }
                    if (x.this.f151520i != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        x.this.f151519h.sendEmptyMessage(4101);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        x.this.q.onCallback(4101, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (i2 != 4103) {
                    if (i2 != 4105) {
                        if (i2 != 4129) {
                            if (i2 != 4157) {
                                if (i2 != 4133) {
                                    if (i2 == 4134) {
                                        x.this.ai = f2;
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (i2 != 4144) {
                                        if (i2 != 4145) {
                                            if (i2 != 4160) {
                                                if (i2 != 4161) {
                                                    if (x.this.q != null) {
                                                        an.b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                                        x.this.q.onCallback(i2, i3, f2, str);
                                                    }
                                                } else if (x.this.X && x.this.Y != null) {
                                                    x.this.Y.f151581m = i3;
                                                    MethodCollector.o(9395);
                                                    return;
                                                }
                                            } else if (x.this.X && x.this.Y != null) {
                                                x.this.Y.f151580l = i3;
                                                MethodCollector.o(9395);
                                                return;
                                            }
                                        } else if (x.this.f151524m != null) {
                                            x.this.f151524m.b();
                                            MethodCollector.o(9395);
                                            return;
                                        } else if (x.this.q != null) {
                                            an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                            x.this.q.onCallback(i2, i3, f2, str);
                                            MethodCollector.o(9395);
                                            return;
                                        }
                                    } else if (x.this.f151524m != null) {
                                        x.this.f151524m.a();
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (x.this.q != null) {
                                        an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                        x.this.q.onCallback(i2, i3, f2, str);
                                        MethodCollector.o(9395);
                                        return;
                                    }
                                } else if (!(x.this.f151523l == null || x.this.f151519h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i3;
                                    message.arg2 = (int) f2;
                                    x.this.f151519h.sendMessage(message);
                                    MethodCollector.o(9395);
                                    return;
                                }
                            } else if (!(x.this.p == null || x.this.f151519h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i3;
                                message2.arg2 = (int) f2;
                                x.this.f151519h.sendMessage(message2);
                                MethodCollector.o(9395);
                                return;
                            }
                        } else if (x.this.N == 0) {
                            x.this.N = System.currentTimeMillis();
                            an.a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.o(9395);
                            return;
                        }
                    } else if (x.this.f151521j != null && x.this.f151519h != null) {
                        Message message3 = new Message();
                        message3.what = i2;
                        message3.obj = Float.valueOf(f2);
                        x.this.f151519h.sendMessage(message3);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (x.this.X) {
                    x.this.Y.f151572d = x.this.q;
                    new Thread(x.this.Y).start();
                    x.this.X = false;
                    MethodCollector.o(9395);
                    return;
                } else {
                    x xVar = x.this;
                    if (i3 == 1 || i3 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - xVar.W;
                        an.c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        com.ss.android.ttve.monitor.h.a("te_composition_time", currentTimeMillis);
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_time", currentTimeMillis);
                        if (com.ss.android.medialib.e.a(xVar.V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(xVar.V, iArr) != null) {
                                long length = new File(xVar.V).length();
                                com.ss.android.ttve.monitor.h.a("te_composition_page_mode", (long) xVar.af);
                                double d2 = (double) length;
                                Double.isNaN(d2);
                                double d3 = (d2 / 1024.0d) / 1024.0d;
                                com.ss.android.ttve.monitor.h.a("te_composition_file_size", d3);
                                com.ss.android.ttve.monitor.h.a("te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a("te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    an.c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_page_mode", (long) xVar.af);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_fps", (double) iArr[7]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_size", d3);
                                int i5 = xVar.ac.f61225c;
                                if (i5 != 0) {
                                    com.ss.android.ttve.monitor.h.a(1, "te_composition_time_filter_type", (long) i5);
                                }
                                com.ss.android.ttve.editorInfo.a.a("te_composition_file_duration", (long) iArr[3]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_frame_rate", (long) iArr[7]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_width", (long) iArr[0]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b2 = xVar.ac.b();
                        if (b2) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_add", j2);
                        if (!b2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_json", xVar.ac.a(0));
                        }
                        boolean c2 = xVar.ac.c();
                        if (c2) {
                            j3 = 0;
                        } else {
                            j3 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_add", j3);
                        if (!c2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_json", xVar.ac.a(1));
                        }
                        xVar.ac.a();
                        TEMonitorInvoker.nativeMonitorPerf(com.ss.android.ttve.monitor.h.f61219b);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_file", xVar.f151518g);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_result", "succ");
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.ss.android.ttve.monitor.h.a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", xVar.u);
                            if (i3 == 1 || i3 == 2) {
                                i4 = 0;
                            } else {
                                i4 = i3;
                            }
                            jSONObject.put("resultCode", i4);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (x.this.f151521j != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i3;
                        message4.obj = str;
                        x.this.f151519h.sendMessage(message4);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                }
                MethodCollector.o(9395);
            }
        };
        this.aC = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99633);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(final int i2, final int i3, final float f2, final String str) {
                x.this.b();
                if (x.this.r != null) {
                    x.this.r.onCallback(i2, i3, f2, str);
                }
                if (x.this.f151521j != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass8.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99634);
                        }

                        public final void run() {
                            if (x.this.f151521j != null) {
                                x.this.f151521j.onCompileError(i2, i3, f2, str);
                            }
                        }
                    });
                }
            }
        };
        this.x = 0;
        this.y = 0;
        this.aD = 0;
        this.aE = 0;
        this.z = false;
        this.A = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.aF = 0;
        this.aG = 0;
        this.aH = 0;
        this.P = -1;
        this.R = k.ALIGN_PARENT_BOTTOM;
        this.S = m.CENTER;
        this.T = false;
        this.aI = false;
        this.aJ = false;
        this.U = -1;
        this.V = null;
        this.W = 0;
        this.aK = false;
        this.X = false;
        this.Y = null;
        this.Z = null;
        this.aa = null;
        this.ab = null;
        this.ac = new com.ss.android.ttve.monitor.i();
        this.ad = false;
        this.aL = true;
        this.aM = false;
        this.ae = null;
        this.aN = 0.0f;
        this.aO = 1.0f;
        this.aP = 1.0f;
        this.af = -1;
        this.aQ = -1;
        this.ag = -16777216;
        this.ah = -16777216;
        this.ai = 0.0f;
        AnonymousClass9 r3 = new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.vesdk.x.AnonymousClass9 */

            static {
                Covode.recordClassIndex(99635);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                x.this.a();
                if (x.this.D == null) {
                    return true;
                }
                x.this.D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                x.this.x = i2;
                x.this.y = i3;
                x.this.x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (x.this.C == surfaceTexture) {
                    x xVar = x.this;
                    xVar.a(xVar.D);
                } else {
                    x.this.D = new Surface(surfaceTexture);
                    x xVar2 = x.this;
                    xVar2.a(xVar2.D);
                }
                x.this.C = surfaceTexture;
            }
        };
        this.aj = r3;
        this.ak = new SurfaceHolder.Callback2() {
            /* class com.ss.android.vesdk.x.AnonymousClass10 */

            static {
                Covode.recordClassIndex(99617);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                an.b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                x.this.a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (x.this.w.get()) {
                    an.c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    x.this.a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                an.b("VEEditor", com.a.a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
                x.this.a(i3, i4);
            }
        };
        this.aR = new NativeCallbacks.h() {
            /* class com.ss.android.vesdk.x.AnonymousClass11 */

            static {
                Covode.recordClassIndex(99618);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2) {
                an.b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int b(int i2) {
                an.b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2, double d2) {
                long j2;
                long j3;
                an.e("VEEditor", "onOpenGLDrawing: tex = " + i2 + " timeStamp = " + d2);
                if (!x.this.O) {
                    x.this.O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (x.this.N > 0) {
                        j2 = x.this.N;
                    } else {
                        j2 = currentTimeMillis;
                    }
                    if (x.this.L > 0) {
                        j3 = x.this.L;
                    } else {
                        j3 = x.this.K;
                    }
                    if (j3 == 0 || j3 < x.this.J) {
                        an.d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + x.this.L + ", mlFirstSeekTimeMS = " + x.this.K + ", mlInitTimeMS = " + x.this.J);
                        j3 = x.this.J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j3 - x.this.J);
                        jSONObject.put("time_seek", j2 - j3);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j2);
                        jSONObject.put("time_total", currentTimeMillis - x.this.J);
                        jSONObject.put("usage_type", x.this.u);
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        an.a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e2) {
                        an.d("VEEditor", "report first frame json err ".concat(String.valueOf(e2)));
                    }
                    com.ss.android.ttve.monitor.h.a(1, "te_edit_first_frame_time", currentTimeMillis - x.this.J);
                    if (x.this.f151522k != null) {
                        x.this.f151522k.a();
                    }
                }
                x.this.G++;
                if (x.this.G == 30) {
                    x.this.H = System.currentTimeMillis();
                    if (x.this.I != x.this.H) {
                        float f2 = 30000.0f / ((float) (x.this.H - x.this.I));
                        if (az.f151039c) {
                            an.a("VEEditor", "Render FPS = ".concat(String.valueOf(f2)));
                        }
                        x xVar = x.this;
                        xVar.I = xVar.H;
                        x.this.G = 0;
                    }
                }
                return 0;
            }
        };
        this.aS = new NativeCallbacks.c() {
            /* class com.ss.android.vesdk.x.AnonymousClass12 */

            static {
                Covode.recordClassIndex(99619);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.c
            public final int a(byte[] bArr, int i2, int i3, boolean z) {
                if (bArr == null || i2 < 0 || i3 <= 0) {
                    return -1;
                }
                if (x.this.Z == null) {
                    return -2;
                }
                x.this.Z.a(bArr, i2, i3, z);
                return 0;
            }
        };
        this.aT = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass13 */

            static {
                Covode.recordClassIndex(99620);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.aa == null) {
                    return -100;
                }
                if (bArr != null || x.this.f151519h == null) {
                    return x.this.aa.a(bArr, i2, i3);
                }
                Message message = new Message();
                message.what = 4117;
                x.this.f151519h.sendMessage(message);
                return 0;
            }
        };
        this.aU = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass14 */

            static {
                Covode.recordClassIndex(99621);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return x.this.ab.a(bArr, i2, i3);
            }
        };
        this.aV = new NativeCallbacks.g() {
            /* class com.ss.android.vesdk.x.AnonymousClass15 */

            static {
                Covode.recordClassIndex(99622);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int a() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.a();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int b() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.b();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int c() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.c();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int d() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.d();
            }
        };
        this.aW = new NativeCallbacks.e() {
            /* class com.ss.android.vesdk.x.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99623);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final int i4) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99624);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final String str) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(99625);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                if (str != null) {
                                    x.this.v.put(Integer.valueOf(i2), str);
                                }
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            an.a("VEEditor", "VEEditor textureView");
            this.B = TEInterface.createEngine((bj) null);
            this.f151516e = new com.ss.android.vesdk.runtime.b(str);
            this.F = textureView;
            textureView.setSurfaceTextureListener(r3);
            this.B.setOpenGLListeners(this.aR);
            this.B.setInfoListener(this.aB);
            this.B.setErrorListener(this.aC);
            c(false);
            M();
            return;
        }
        throw new z(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    public final int b(int i2, int i3, int i4) {
        com.ss.android.vesdk.f.f fVar = this.f151513b;
        if (fVar != null) {
            return fVar.setInfoStickerTime(i2, i3, i4);
        }
        an.d("VEEditor", "setInfoStickerTime STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    private x(String str, SurfaceView surfaceView, bj bjVar, byte b2) {
        this.f151517f = new VESize(-1, -1);
        this.f151518g = "mp4";
        this.f151519h = new i(Looper.getMainLooper());
        this.f151520i = null;
        this.f151521j = null;
        this.f151522k = null;
        this.f151523l = null;
        this.f151524m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new com.ss.android.ttve.common.j();
        this.t = new com.ss.android.ttve.a.a();
        this.as = true;
        this.u = "unknown";
        this.au = null;
        this.av = "/concatShootVideo";
        this.v = new HashMap();
        this.w = new AtomicBoolean(false);
        this.aA = -1;
        this.aB = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99616);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(int i2, int i3, float f2, String str) {
                long j2;
                long j3;
                int i4;
                MethodCollector.i(9395);
                if (i2 == 4101) {
                    if (x.this.M > 0) {
                        System.currentTimeMillis();
                    }
                    if (x.this.f151520i != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        x.this.f151519h.sendEmptyMessage(4101);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        x.this.q.onCallback(4101, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (i2 != 4103) {
                    if (i2 != 4105) {
                        if (i2 != 4129) {
                            if (i2 != 4157) {
                                if (i2 != 4133) {
                                    if (i2 == 4134) {
                                        x.this.ai = f2;
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (i2 != 4144) {
                                        if (i2 != 4145) {
                                            if (i2 != 4160) {
                                                if (i2 != 4161) {
                                                    if (x.this.q != null) {
                                                        an.b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                                        x.this.q.onCallback(i2, i3, f2, str);
                                                    }
                                                } else if (x.this.X && x.this.Y != null) {
                                                    x.this.Y.f151581m = i3;
                                                    MethodCollector.o(9395);
                                                    return;
                                                }
                                            } else if (x.this.X && x.this.Y != null) {
                                                x.this.Y.f151580l = i3;
                                                MethodCollector.o(9395);
                                                return;
                                            }
                                        } else if (x.this.f151524m != null) {
                                            x.this.f151524m.b();
                                            MethodCollector.o(9395);
                                            return;
                                        } else if (x.this.q != null) {
                                            an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                            x.this.q.onCallback(i2, i3, f2, str);
                                            MethodCollector.o(9395);
                                            return;
                                        }
                                    } else if (x.this.f151524m != null) {
                                        x.this.f151524m.a();
                                        MethodCollector.o(9395);
                                        return;
                                    } else if (x.this.q != null) {
                                        an.a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i2)));
                                        x.this.q.onCallback(i2, i3, f2, str);
                                        MethodCollector.o(9395);
                                        return;
                                    }
                                } else if (!(x.this.f151523l == null || x.this.f151519h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i3;
                                    message.arg2 = (int) f2;
                                    x.this.f151519h.sendMessage(message);
                                    MethodCollector.o(9395);
                                    return;
                                }
                            } else if (!(x.this.p == null || x.this.f151519h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i3;
                                message2.arg2 = (int) f2;
                                x.this.f151519h.sendMessage(message2);
                                MethodCollector.o(9395);
                                return;
                            }
                        } else if (x.this.N == 0) {
                            x.this.N = System.currentTimeMillis();
                            an.a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.o(9395);
                            return;
                        }
                    } else if (x.this.f151521j != null && x.this.f151519h != null) {
                        Message message3 = new Message();
                        message3.what = i2;
                        message3.obj = Float.valueOf(f2);
                        x.this.f151519h.sendMessage(message3);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                } else if (x.this.X) {
                    x.this.Y.f151572d = x.this.q;
                    new Thread(x.this.Y).start();
                    x.this.X = false;
                    MethodCollector.o(9395);
                    return;
                } else {
                    x xVar = x.this;
                    if (i3 == 1 || i3 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - xVar.W;
                        an.c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        com.ss.android.ttve.monitor.h.a("te_composition_time", currentTimeMillis);
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_time", currentTimeMillis);
                        if (com.ss.android.medialib.e.a(xVar.V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(xVar.V, iArr) != null) {
                                long length = new File(xVar.V).length();
                                com.ss.android.ttve.monitor.h.a("te_composition_page_mode", (long) xVar.af);
                                double d2 = (double) length;
                                Double.isNaN(d2);
                                double d3 = (d2 / 1024.0d) / 1024.0d;
                                com.ss.android.ttve.monitor.h.a("te_composition_file_size", d3);
                                com.ss.android.ttve.monitor.h.a("te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a("te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    an.c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_page_mode", (long) xVar.af);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_fps", (double) iArr[7]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.h.a(1, "te_composition_file_size", d3);
                                int i5 = xVar.ac.f61225c;
                                if (i5 != 0) {
                                    com.ss.android.ttve.monitor.h.a(1, "te_composition_time_filter_type", (long) i5);
                                }
                                com.ss.android.ttve.editorInfo.a.a("te_composition_file_duration", (long) iArr[3]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_frame_rate", (long) iArr[7]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_width", (long) iArr[0]);
                                com.ss.android.ttve.editorInfo.a.a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b2 = xVar.ac.b();
                        if (b2) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_add", j2);
                        if (!b2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_effect_json", xVar.ac.a(0));
                        }
                        boolean c2 = xVar.ac.c();
                        if (c2) {
                            j3 = 0;
                        } else {
                            j3 = 1;
                        }
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_add", j3);
                        if (!c2) {
                            com.ss.android.ttve.monitor.h.a(1, "te_composition_info_sticker_json", xVar.ac.a(1));
                        }
                        xVar.ac.a();
                        TEMonitorInvoker.nativeMonitorPerf(com.ss.android.ttve.monitor.h.f61219b);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_file", xVar.f151518g);
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_result", "succ");
                        com.ss.android.ttve.monitor.h.a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.ss.android.ttve.monitor.h.a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", xVar.u);
                            if (i3 == 1 || i3 == 2) {
                                i4 = 0;
                            } else {
                                i4 = i3;
                            }
                            jSONObject.put("resultCode", i4);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (x.this.f151521j != null && x.this.f151519h != null) {
                        an.c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i3;
                        message4.obj = str;
                        x.this.f151519h.sendMessage(message4);
                        MethodCollector.o(9395);
                        return;
                    } else if (x.this.q != null) {
                        an.c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        x.this.q.onCallback(i2, i3, f2, str);
                        MethodCollector.o(9395);
                        return;
                    }
                }
                MethodCollector.o(9395);
            }
        };
        this.aC = new com.ss.android.ttve.common.b() {
            /* class com.ss.android.vesdk.x.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99633);
            }

            @Override // com.ss.android.ttve.common.b
            public final void a(final int i2, final int i3, final float f2, final String str) {
                x.this.b();
                if (x.this.r != null) {
                    x.this.r.onCallback(i2, i3, f2, str);
                }
                if (x.this.f151521j != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass8.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99634);
                        }

                        public final void run() {
                            if (x.this.f151521j != null) {
                                x.this.f151521j.onCompileError(i2, i3, f2, str);
                            }
                        }
                    });
                }
            }
        };
        this.x = 0;
        this.y = 0;
        this.aD = 0;
        this.aE = 0;
        this.z = false;
        this.A = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.aF = 0;
        this.aG = 0;
        this.aH = 0;
        this.P = -1;
        this.R = k.ALIGN_PARENT_BOTTOM;
        this.S = m.CENTER;
        this.T = false;
        this.aI = false;
        this.aJ = false;
        this.U = -1;
        this.V = null;
        this.W = 0;
        this.aK = false;
        this.X = false;
        this.Y = null;
        this.Z = null;
        this.aa = null;
        this.ab = null;
        this.ac = new com.ss.android.ttve.monitor.i();
        this.ad = false;
        this.aL = true;
        this.aM = false;
        this.ae = null;
        this.aN = 0.0f;
        this.aO = 1.0f;
        this.aP = 1.0f;
        this.af = -1;
        this.aQ = -1;
        this.ag = -16777216;
        this.ah = -16777216;
        this.ai = 0.0f;
        this.aj = new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.vesdk.x.AnonymousClass9 */

            static {
                Covode.recordClassIndex(99635);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                x.this.a();
                if (x.this.D == null) {
                    return true;
                }
                x.this.D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                x.this.x = i2;
                x.this.y = i3;
                x.this.x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (x.this.C == surfaceTexture) {
                    x xVar = x.this;
                    xVar.a(xVar.D);
                } else {
                    x.this.D = new Surface(surfaceTexture);
                    x xVar2 = x.this;
                    xVar2.a(xVar2.D);
                }
                x.this.C = surfaceTexture;
            }
        };
        this.ak = new SurfaceHolder.Callback2() {
            /* class com.ss.android.vesdk.x.AnonymousClass10 */

            static {
                Covode.recordClassIndex(99617);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                an.b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                x.this.a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (x.this.w.get()) {
                    an.c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    x.this.a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                an.b("VEEditor", com.a.a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
                x.this.a(i3, i4);
            }
        };
        this.aR = new NativeCallbacks.h() {
            /* class com.ss.android.vesdk.x.AnonymousClass11 */

            static {
                Covode.recordClassIndex(99618);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2) {
                an.b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int b(int i2) {
                an.b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i2)));
                return 0;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.h
            public final int a(int i2, double d2) {
                long j2;
                long j3;
                an.e("VEEditor", "onOpenGLDrawing: tex = " + i2 + " timeStamp = " + d2);
                if (!x.this.O) {
                    x.this.O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (x.this.N > 0) {
                        j2 = x.this.N;
                    } else {
                        j2 = currentTimeMillis;
                    }
                    if (x.this.L > 0) {
                        j3 = x.this.L;
                    } else {
                        j3 = x.this.K;
                    }
                    if (j3 == 0 || j3 < x.this.J) {
                        an.d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + x.this.L + ", mlFirstSeekTimeMS = " + x.this.K + ", mlInitTimeMS = " + x.this.J);
                        j3 = x.this.J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j3 - x.this.J);
                        jSONObject.put("time_seek", j2 - j3);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j2);
                        jSONObject.put("time_total", currentTimeMillis - x.this.J);
                        jSONObject.put("usage_type", x.this.u);
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        an.a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e2) {
                        an.d("VEEditor", "report first frame json err ".concat(String.valueOf(e2)));
                    }
                    com.ss.android.ttve.monitor.h.a(1, "te_edit_first_frame_time", currentTimeMillis - x.this.J);
                    if (x.this.f151522k != null) {
                        x.this.f151522k.a();
                    }
                }
                x.this.G++;
                if (x.this.G == 30) {
                    x.this.H = System.currentTimeMillis();
                    if (x.this.I != x.this.H) {
                        float f2 = 30000.0f / ((float) (x.this.H - x.this.I));
                        if (az.f151039c) {
                            an.a("VEEditor", "Render FPS = ".concat(String.valueOf(f2)));
                        }
                        x xVar = x.this;
                        xVar.I = xVar.H;
                        x.this.G = 0;
                    }
                }
                return 0;
            }
        };
        this.aS = new NativeCallbacks.c() {
            /* class com.ss.android.vesdk.x.AnonymousClass12 */

            static {
                Covode.recordClassIndex(99619);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.c
            public final int a(byte[] bArr, int i2, int i3, boolean z) {
                if (bArr == null || i2 < 0 || i3 <= 0) {
                    return -1;
                }
                if (x.this.Z == null) {
                    return -2;
                }
                x.this.Z.a(bArr, i2, i3, z);
                return 0;
            }
        };
        this.aT = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass13 */

            static {
                Covode.recordClassIndex(99620);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.aa == null) {
                    return -100;
                }
                if (bArr != null || x.this.f151519h == null) {
                    return x.this.aa.a(bArr, i2, i3);
                }
                Message message = new Message();
                message.what = 4117;
                x.this.f151519h.sendMessage(message);
                return 0;
            }
        };
        this.aU = new NativeCallbacks.d() {
            /* class com.ss.android.vesdk.x.AnonymousClass14 */

            static {
                Covode.recordClassIndex(99621);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.d
            public final int a(byte[] bArr, int i2, int i3) {
                if (x.this.ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return x.this.ab.a(bArr, i2, i3);
            }
        };
        this.aV = new NativeCallbacks.g() {
            /* class com.ss.android.vesdk.x.AnonymousClass15 */

            static {
                Covode.recordClassIndex(99622);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int a() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.a();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int b() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.b();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int c() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.c();
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.g
            public final int d() {
                if (x.this.o == null) {
                    return -100;
                }
                return x.this.o.d();
            }
        };
        this.aW = new NativeCallbacks.e() {
            /* class com.ss.android.vesdk.x.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99623);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final int i4) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99624);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.e
            public final void a(final int i2, final int i3, final String str) {
                if (x.this.n != null && x.this.f151519h != null) {
                    x.this.f151519h.post(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass2.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(99625);
                        }

                        public final void run() {
                            if (x.this.n != null) {
                                if (str != null) {
                                    x.this.v.put(Integer.valueOf(i2), str);
                                }
                                VEListener.y yVar = x.this.n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            an.a("VEEditor", "VEEditor surfaceView");
            this.B = TEInterface.createEngine(bjVar);
            this.f151516e = new com.ss.android.vesdk.runtime.b(str);
            this.E = surfaceView;
            surfaceView.getHolder().addCallback(this.ak);
            this.B.setOpenGLListeners(this.aR);
            this.B.setInfoListener(this.aB);
            this.B.setErrorListener(this.aC);
            c(false);
            M();
            return;
        }
        throw new z(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    public static x a(x xVar, final com.ss.android.vesdk.runtime.b bVar, VEVideoEncodeSettings vEVideoEncodeSettings, final VEListener.r rVar) {
        String str;
        String str2;
        String str3;
        String str4;
        MethodCollector.i(7531);
        System.currentTimeMillis();
        TEVideoUtils.nativeCancelCompileProbe();
        final TEReverseCallback tEReverseCallback = new TEReverseCallback();
        tEReverseCallback.setListener(rVar);
        bVar.f151432g = false;
        if (vEVideoEncodeSettings == null) {
            an.c("VEEditor", "using default video setting for genReverseVideo2");
            vEVideoEncodeSettings = new VEVideoEncodeSettings.a(2).a(-1, -1).f(1).a(30).b(false).c(13).g(1).c().a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).d();
        }
        az++;
        if (bVar.f151437l != null && bVar.f151437l.size() > 0) {
            Iterator<String> it = bVar.f151437l.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    com.ss.android.vesdk.runtime.b.a(file);
                }
            }
        }
        final String a2 = bVar.a(az + "-0");
        final String a3 = bVar.a(az + "-1");
        final String str5 = com.ss.android.vesdk.runtime.f.a(bVar.f151426a, "concat") + File.separator + (az + "-0") + "_reverse.wav";
        bVar.f151437l.add(str5);
        xVar.b(new r(xVar) {
            /* class com.ss.android.vesdk.x.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f151541a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f151542b = true;

            static {
                Covode.recordClassIndex(99626);
            }

            @Override // com.ss.android.vesdk.r
            public final void onCallback(int i2, int i3, float f2, String str) {
                if (i2 != 4103) {
                    if (i2 == 4105) {
                        TEReverseCallback tEReverseCallback = tEReverseCallback;
                        double d2 = (double) f2;
                        Double.isNaN(d2);
                        tEReverseCallback.onProgressChanged(d2 * 0.5d);
                    }
                } else if (this.f151541a.w()) {
                    if (this.f151542b) {
                        TEVideoUtils.reverseAllIVideo(a2, a3, tEReverseCallback);
                    } else {
                        TEVideoUtils.reverseAllIVideoAndMuxAudio(a2, str5, a3, tEReverseCallback);
                    }
                    new Thread(new Runnable() {
                        /* class com.ss.android.vesdk.x.AnonymousClass3.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99627);
                        }

                        public final void run() {
                            AnonymousClass3.this.f151541a.j();
                            com.ss.android.vesdk.runtime.b bVar = bVar;
                            bVar.f151427b = new String[]{a2};
                            if (AnonymousClass3.this.f151542b) {
                                com.ss.android.vesdk.runtime.b bVar2 = bVar;
                                bVar2.f151431f = new String[]{str5};
                            }
                            com.ss.android.vesdk.runtime.b bVar3 = bVar;
                            bVar3.f151430e = new String[]{a3};
                            bVar.f151432g = true;
                            an.a("VEEditor", "reverse compileDone: needSeparateAudioPath = " + AnonymousClass3.this.f151542b);
                            an.a("VEEditor", "reverse compileDone: mOriginalSoundTrackType = " + bVar.f151436k);
                            if (rVar != null) {
                                rVar.a(0);
                            }
                        }
                    }).start();
                }
            }

            {
                this.f151541a = r2;
            }
        });
        xVar.a(new r(xVar) {
            /* class com.ss.android.vesdk.x.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f151550a;

            static {
                Covode.recordClassIndex(99628);
            }

            {
                this.f151550a = r1;
            }

            @Override // com.ss.android.vesdk.r
            public final void onCallback(int i2, int i3, float f2, String str) {
                new Thread(new Runnable() {
                    /* class com.ss.android.vesdk.x.AnonymousClass4.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99629);
                    }

                    public final void run() {
                        AnonymousClass4.this.f151550a.j();
                        if (rVar != null) {
                            rVar.a(-1);
                        }
                    }
                }).start();
            }
        });
        xVar.a(a2, str5, vEVideoEncodeSettings);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mWorkSpace", bVar.f151426a);
            String str6 = null;
            if (bVar.f151427b != null) {
                str = Arrays.toString(bVar.f151427b);
            } else {
                str = null;
            }
            jSONObject.put("mVideoPaths", str);
            if (bVar.f151428c != null) {
                str2 = Arrays.toString(bVar.f151428c);
            } else {
                str2 = null;
            }
            jSONObject.put("mAudioPaths", str2);
            if (bVar.f151429d != null) {
                str3 = Arrays.toString(bVar.f151429d);
            } else {
                str3 = null;
            }
            jSONObject.put("mTransitions", str3);
            if (bVar.f151430e != null) {
                str4 = Arrays.toString(bVar.f151430e);
            } else {
                str4 = null;
            }
            jSONObject.put("mReverseVideoPath", str4);
            if (bVar.f151431f != null) {
                str6 = Arrays.toString(bVar.f151431f);
            }
            jSONObject.put("mReverseAudioPaths", str6);
            jSONObject.put("resultCode", 0);
            com.ss.android.ttve.monitor.b.a("vesdk_event_editor_reverse_video", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(7531);
        return xVar;
    }

    public final void a(float f2, float f3, float f4, int i2, int i3) {
        b(f2, f3, f4, i2, i3);
    }

    public static x a(com.ss.android.vesdk.runtime.b bVar, VERecordData vERecordData, int i2, int i3, VEListener.r rVar) {
        VEVideoEncodeSettings d2;
        an.c("VEEditor", "genReverseVideo2 with recordData.");
        if (vERecordData.f150790b == null || vERecordData.f150790b.size() <= 1) {
            d2 = new VEVideoEncodeSettings.a(2).a(i2, i3).a(30).b(false).c(13).g(1).c().a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).a(false, false).d();
        } else {
            d2 = new VEVideoEncodeSettings.a(2).a(i2, i3).f(1).a(30).b(false).c(13).g(1).c().a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).a(false, false).d();
        }
        x xVar = new x(bVar.f151426a);
        int a2 = xVar.a(vERecordData, false, false);
        if (a2 == 0) {
            return a(xVar, bVar, d2, rVar);
        }
        an.d("VEEditor", "genReverseVideo2 init error:".concat(String.valueOf(a2)));
        return null;
    }

    private void b(float f2, float f3, float f4, int i2, int i3) {
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        aVar.a("iesve_veeditor_video_scale_width", f2).a("iesve_veeditor_video_scale_heigh", f3);
        com.ss.android.ttve.monitor.e.a("iesve_veeditor_video_scale", 1, aVar);
        this.aN = f4;
        this.aO = f3;
        this.aP = f3;
        an.a("VEEditor", "setDisplayState... " + f2 + " " + f3 + " " + f4 + " " + i2 + " " + i3 + " 0");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scaleW", String.valueOf(f2));
            jSONObject.put("scaleH", String.valueOf(f3));
            jSONObject.put("degree", String.valueOf(f4));
            jSONObject.put("transX", String.valueOf(i2));
            jSONObject.put("transY", String.valueOf(i3));
            com.ss.android.ttve.monitor.b.a("vesdk_event_editor_scale_rotate_trans", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.B.setDisplayState(f2, f3, f4, 0.0f, i2, i3, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r22 != 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        com.ss.android.vesdk.an.c("VEEditor", "compile use not hard encode, not soft encode");
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10133);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return -100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r1 = a(r15, r16, 1080, 1920, r17, r19, r21, r22, (com.ss.android.vesdk.VEListener.m) null, r23);
        com.ss.android.vesdk.x.ay = false;
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10133);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r15, java.lang.String r16, long r17, long r19, java.lang.String r21, int r22, com.ss.android.vesdk.VEListener.n r23) {
        /*
            r2 = 10133(0x2795, float:1.42E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            java.lang.Object r1 = com.ss.android.vesdk.x.ax
            monitor-enter(r1)
            boolean r0 = com.ss.android.vesdk.x.ay     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0012
            r0 = -2
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return r0
        L_0x0012:
            r0 = 1
            com.ss.android.vesdk.x.ay = r0
            monitor-exit(r1)
            r12 = r22
            if (r12 != 0) goto L_0x0027
            java.lang.String r1 = "VEEditor"
            java.lang.String r0 = "compile use not hard encode, not soft encode"
            com.ss.android.vesdk.an.c(r1, r0)
            r0 = -100
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return r0
        L_0x0027:
            r5 = 1080(0x438, float:1.513E-42)
            r6 = 1920(0x780, float:2.69E-42)
            r13 = 0
            r9 = r19
            r7 = r17
            r4 = r16
            r14 = r23
            r11 = r21
            r3 = r15
            int r1 = a(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = 0
            com.ss.android.vesdk.x.ay = r0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return r1
        L_0x0042:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.x.a(java.lang.String, java.lang.String, long, long, java.lang.String, int, com.ss.android.vesdk.VEListener$n):int");
    }

    public static int a(String str, String str2, int i2, int i3, long j2, long j3, String str3, VEListener.m mVar) {
        MethodCollector.i(9977);
        synchronized (ax) {
            try {
                if (ay) {
                    return -2;
                }
                ay = true;
                int a2 = a(str, str2, i2, i3, j2, j3, str3, 1, mVar, (VEListener.n) null);
                ay = false;
                MethodCollector.o(9977);
                return a2;
            } finally {
                MethodCollector.o(9977);
            }
        }
    }

    private static int a(String str, String str2, int i2, int i3, long j2, long j3, String str3, int i4, final VEListener.m mVar, final VEListener.n nVar) {
        final int i5;
        AnonymousClass6 r8;
        AnonymousClass5 r9;
        MethodCollector.i(10139);
        final VEVideoEncodeSettings d2 = new VEVideoEncodeSettings.a(2).a(str3).d();
        u.d a2 = u.a().a("use_byte264");
        u.d a3 = u.a().a("compile_probe_use_byte264");
        if (a2 == null || a2.f151496b == null || !((Boolean) a2.f151496b).booleanValue()) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        if (!(a3 == null || a3.f151496b == null || ((Boolean) a3.f151496b).booleanValue())) {
            i5 = 0;
        }
        an.a("VEEditor", "KEY_USE_BYTE264= " + ((Boolean) a2.f151496b).booleanValue() + "KEY_COMPILE_PROBE_USE_BYTE264= " + ((Boolean) a3.f151496b).booleanValue() + "tempValue= " + i5);
        if (nVar != null) {
            r9 = new TEVideoUtils.CompileProbeListener2() {
                /* class com.ss.android.vesdk.x.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(99630);
                }

                @Override // com.ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener2
                public final void onCompileProbeResult2(int i2, int i3, float f2, float f3, int i4, int i5, int i6, int i7, float f4) {
                    double d2;
                    double d3;
                    float f5 = f3;
                    if (nVar != null) {
                        int min = Math.min(i6, i7);
                        if (min <= 716 || min >= 724) {
                            if (min > 1076 && min < 1084) {
                                d2 = (double) d2.getVideoCompileEncodeSetting().mHWEncodeSetting.mBitrate;
                                d3 = d2.getVideoCompileEncodeSetting().mHWEncodeSetting.mFullHd_bitrate_ratio;
                                Double.isNaN(d2);
                            } else if (min > 572 && min < 580) {
                                d2 = (double) d2.getVideoCompileEncodeSetting().mHWEncodeSetting.mBitrate;
                                d3 = d2.getVideoCompileEncodeSetting().mHWEncodeSetting.mSd_bitrate_ratio;
                                Double.isNaN(d2);
                            }
                            f5 = (float) (d2 * d3);
                        } else {
                            f5 = (float) d2.getVideoCompileEncodeSetting().mHWEncodeSetting.mBitrate;
                        }
                        if (f5 > 0.0f) {
                            f5 /= 1000.0f;
                        }
                        an.a("VEEditor", "callback opt_crf=" + i3 + " optBitrate=" + f5 + " videoBitrate=" + f2 + " encoder_type=" + i5 + " preset=" + i4 + " max_bitrate=" + i5 + " encode_width=" + i6 + " encoder_height=" + i7 + " psnr= " + f4 + " pre_crf= " + d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf + " pre_gop=" + d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop + " pre_qpoffset=" + d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                        nVar.a(i2, i3, f2, f5, i5, i4, i5, i6, i7, f4, d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf, d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop, d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                    }
                }
            };
            r8 = null;
        } else if (mVar != null) {
            r8 = new TEVideoUtils.CompileProbeListener() {
                /* class com.ss.android.vesdk.x.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(99631);
                }

                @Override // com.ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener
                public final void onCompileProbeResult(int i2, int i3, float f2, int i4, int i5, int i6, int i7, float f3) {
                    if (mVar != null) {
                        an.a("VEEditor", "callback opt_crf=" + i3 + " videoBitrate=" + f2 + " encoder_type=" + i5 + " preset=" + i4 + " max_bitrate=" + i5 + " encode_width=" + i6 + " encoder_height=" + i7 + " psnr=" + f3 + " pre_crf=" + d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf + " pre_gop=" + d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop + " pre_qpoffset=" + d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                        mVar.a(i2, i3, f2, i5, i4, i5, i6, i7, f3, d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf, d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop, d2.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                    }
                }
            };
            r9 = null;
        } else {
            MethodCollector.o(10139);
            return -100;
        }
        VEVideoCompileEncodeSettings videoCompileEncodeSetting = d2.getVideoCompileEncodeSetting();
        if (videoCompileEncodeSetting.useHWEncoder && i4 == 1) {
            an.c("VEEditor", "compile use hard encode, not soft encode");
            MethodCollector.o(10139);
            return -100;
        } else if (str2 == null || str2.isEmpty()) {
            an.c("VEEditor", "savepath is null or savepath is empty");
            MethodCollector.o(10139);
            return -100;
        } else {
            File file = new File(str2);
            if (!file.exists() || !file.isDirectory()) {
                an.c("VEEditor", "savepath is not exist, savepath: ".concat(String.valueOf(str2)));
                MethodCollector.o(10139);
                return -1;
            }
            String str4 = str2 + "/probe/";
            if (new File(str4).exists() || aa.c(str4)) {
                String str5 = str4 + "compile_probe";
                TEVideoUtils.nativeCompileProbe(str, str5, i2, i3, j2, j3, videoCompileEncodeSetting.mSWEncodeSetting.mPreset, videoCompileEncodeSetting.mSWEncodeSetting.mCrf, videoCompileEncodeSetting.mSWEncodeSetting.mGop, videoCompileEncodeSetting.mSWEncodeSetting.mMaxRate, videoCompileEncodeSetting.mSWEncodeSetting.mQPOffset, r8, r9, i4);
                File file2 = new File(str5);
                if (file2.exists()) {
                    an.c("VEEditor", "delete file: ".concat(String.valueOf(str5)));
                    a(file2);
                }
                MethodCollector.o(10139);
                return 0;
            }
            an.c("VEEditor", "create probeDir failed");
            MethodCollector.o(10139);
            return -1;
        }
    }

    private int b(String[] strArr, int[] iArr, int[] iArr2, VETransitionFilterParam[] vETransitionFilterParamArr, String[] strArr2, int[] iArr3, int[] iArr4, float[] fArr, VECanvasFilterParam[] vECanvasFilterParamArr, l lVar) {
        int[] iArr5;
        int[] iArr6;
        boolean z2;
        MethodCollector.i(7672);
        synchronized (this) {
            if (vECanvasFilterParamArr != null) {
                try {
                    if (vECanvasFilterParamArr.length != 0 && vECanvasFilterParamArr[0].height > 0 && vECanvasFilterParamArr[0].width > 0) {
                        if (strArr.length == iArr.length && strArr.length == iArr2.length) {
                            for (int i2 = 0; i2 < iArr.length; i2++) {
                                if (iArr2[i2] >= 0 && iArr2[i2] <= iArr[i2]) {
                                    an.d("VEEditor", "initWithCanvas invalid param vTrimIn[" + i2 + "]=" + iArr[i2] + ", vTrimOut[" + i2 + "]=" + iArr2[i2]);
                                    MethodCollector.o(7672);
                                    return -100;
                                }
                            }
                            TEMonitorInvoker.nativeReset(1);
                            com.ss.android.ttve.monitor.h.a(1);
                            long currentTimeMillis = System.currentTimeMillis();
                            this.J = currentTimeMillis;
                            this.I = currentTimeMillis;
                            an.a("VEEditor", "initWithCanvasAndInfos...");
                            String[] strArr3 = null;
                            if (vETransitionFilterParamArr == null || vETransitionFilterParamArr.length <= 0) {
                                iArr5 = null;
                                iArr6 = null;
                            } else {
                                strArr3 = new String[vETransitionFilterParamArr.length];
                                iArr5 = new int[vETransitionFilterParamArr.length];
                                iArr6 = new int[vETransitionFilterParamArr.length];
                                for (int i3 = 0; i3 < vETransitionFilterParamArr.length; i3++) {
                                    strArr3[i3] = vETransitionFilterParamArr[i3].transName;
                                    iArr5[i3] = vETransitionFilterParamArr[i3].tranType;
                                    iArr6[i3] = vETransitionFilterParamArr[i3].tranDuration;
                                }
                            }
                            int initVideoEditorWithCanvas = this.B.initVideoEditorWithCanvas(strArr, null, strArr.length, null, iArr, iArr2, strArr2, null, iArr3, iArr4, strArr3, iArr5, iArr6, null, fArr, l.VIDEO_OUT_RATIO_ORIGINAL.ordinal(), null);
                            if (initVideoEditorWithCanvas != 0) {
                                an.d("VEEditor", "initVideoEditorWithCanvas, ret = ".concat(String.valueOf(initVideoEditorWithCanvas)));
                                b();
                                this.T = false;
                                MethodCollector.o(7672);
                                return initVideoEditorWithCanvas;
                            }
                            this.T = true;
                            this.aI = false;
                            this.Q = lVar;
                            this.f151516e.f151428c = strArr2;
                            this.f151516e.f151427b = strArr;
                            this.f151516e.f151429d = strArr3;
                            this.f151514c.i();
                            if (strArr2 == null || strArr2.length == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            this.z = Boolean.valueOf(z2);
                            this.A = 0;
                            this.B.setTrackDurationType(0, 0, 1);
                            b(e.SCALE_MODE_CANVAS);
                            c(vECanvasFilterParamArr[0].width, vECanvasFilterParamArr[0].height);
                            this.t.f61037a = 1;
                            try {
                                int i4 = this.B.addFilters(new int[]{0}, new String[]{"canvas wrap"}, new int[]{0}, new int[]{this.P}, new int[]{0}, new int[]{15}, new int[]{1})[0];
                                this.U = i4;
                                b(-1, i4, vECanvasFilterParamArr[0]);
                                int length = strArr.length;
                                for (int i5 = 0; i5 < length; i5++) {
                                    b(i5, this.U, vECanvasFilterParamArr[i5]);
                                }
                                VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
                                for (int i6 = 0; i6 < length; i6++) {
                                    b(i6, this.U, vEVideoTransformFilterParam);
                                }
                                MethodCollector.o(7672);
                                return initVideoEditorWithCanvas;
                            } catch (NullPointerException unused) {
                                z zVar = new z(-1, "init failed: VESDK need to be init");
                                MethodCollector.o(7672);
                                throw zVar;
                            }
                        } else {
                            an.d("VEEditor", "initWithCanvas invalid param, videoFilePaths.length: " + strArr.length + ", vTrimIn.length: " + iArr.length + ", vTrimOut.length: " + iArr2.length);
                            return -100;
                        }
                    }
                } finally {
                    MethodCollector.o(7672);
                }
            }
            an.d("VEEditor", "initWithCanvas invalid canvasFilterParam!");
            MethodCollector.o(7672);
            return -100;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(java.lang.String[] r30, int[] r31, int[] r32, java.lang.String[] r33, java.lang.String[] r34, int[] r35, int[] r36, float[] r37, float[] r38, com.ss.android.vesdk.ROTATE_DEGREE[] r39, com.ss.android.vesdk.x.l r40, boolean r41) {
        /*
        // Method dump skipped, instructions count: 522
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.x.a(java.lang.String[], int[], int[], java.lang.String[], java.lang.String[], int[], int[], float[], float[], com.ss.android.vesdk.ROTATE_DEGREE[], com.ss.android.vesdk.x$l, boolean):int");
    }
}
