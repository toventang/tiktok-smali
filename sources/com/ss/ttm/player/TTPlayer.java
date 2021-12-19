package com.ss.ttm.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttm.player.m;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public class TTPlayer {

    /* renamed from: a  reason: collision with root package name */
    public static final String f151977a = TTPlayer.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    static String f151978h;

    /* renamed from: j  reason: collision with root package name */
    private static int f151979j;

    /* renamed from: k  reason: collision with root package name */
    private static int[] f151980k;

    /* renamed from: l  reason: collision with root package name */
    private static String f151981l;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f151982m = false;
    private static boolean o = false;
    private static g p = new a();

    /* renamed from: b  reason: collision with root package name */
    public long f151983b;

    /* renamed from: c  reason: collision with root package name */
    long f151984c = Long.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public h f151985d;

    /* renamed from: e  reason: collision with root package name */
    public f f151986e;

    /* renamed from: f  reason: collision with root package name */
    public m.h f151987f;

    /* renamed from: g  reason: collision with root package name */
    public Context f151988g;

    /* renamed from: i  reason: collision with root package name */
    private long f151989i;
    private long mMediaDataSource;
    private int n;

    private static final native void _close(long j2);

    private final native long _create(Context context, int i2, String str);

    private static final native String _getAppPath();

    private static final native int _getCurrentPosition(long j2);

    private static final native double _getDoubleValue(long j2, int i2, double d2);

    private static final native int _getDuration(long j2);

    static final native float _getFloatValue(long j2, int i2, float f2);

    private static final native int _getIntValue(long j2, int i2, int i3);

    static final native Object _getJObjectValue(long j2, int i2);

    static final native long _getLongValue(long j2, int i2, long j3);

    static final native String _getStringValue(long j2, int i2);

    private static final native int _getVideoHeight(long j2);

    private static final native int _getVideoWidth(long j2);

    private static final native int _isLooping(long j2);

    private static final native int _isPlaying(long j2);

    private static final native void _mouseEvent(long j2, int i2, int i3, int i4);

    static final native int _pause(long j2);

    static final native int _prepare(long j2);

    private static final native void _prevClose(long j2);

    private static final native void _registerPlayerInfo();

    static final native void _release(long j2);

    static final native int _reset(long j2);

    private static final native void _rotateCamera(long j2, float f2, float f3);

    static final native int _seek(long j2, int i2);

    static final native void _setAudioProcessor(long j2, AudioProcessor audioProcessor);

    static final native void _setCacheFile(long j2, String str, int i2);

    static final native void _setDataSource(long j2, IMediaDataSource iMediaDataSource);

    static final native void _setDataSource(long j2, String str);

    static final native void _setDataSourceFd(long j2, int i2);

    private static final native int _setDoubleValue(long j2, int i2, double d2);

    static final native int _setFloatValue(long j2, int i2, float f2);

    static final native int _setIntValue(long j2, int i2, int i3);

    static final native void _setLoadControl(long j2, LoadControl loadControl);

    static final native int _setLongValue(long j2, int i2, long j3);

    static final native void _setLooping(long j2, int i2);

    static final native void _setMaskInfo(long j2, MaskInfo maskInfo);

    private static final native void _setMediaTransport(long j2, MediaTransport mediaTransport);

    static final native int _setStringValue(long j2, int i2, String str);

    static final native void _setSubInfo(long j2, SubInfo subInfo);

    private static final native void _setSupportFormatNB(int i2);

    static final native void _setSupprotSampleRates(int[] iArr, int i2);

    private static final native int _setSurfaceValue(long j2, long j3);

    static final native int _setVideoSurface(long j2, Surface surface);

    static final native void _setVolume(long j2, float f2, float f3);

    static final native int _start(long j2);

    static final native void _stop(long j2);

    static final native void _switchStream(long j2, int i2, int i3);

    private static final native void _takeScreenshot(long j2);

    public void frameDTSNotify(int i2, long j2, long j3) {
    }

    public void receiveBinarySei(ByteBuffer byteBuffer) {
    }

    public final void takeScreenshotComplete(Bitmap bitmap) {
    }

    public void updateFrameTerminatedDTS(int i2, long j2, long j3) {
    }

    public static final String getCrashPath() {
        return f151981l;
    }

    public static boolean isIPPlayer() {
        return f151982m;
    }

    public static int getThreadPoolStackSize() {
        return r.a(25, 32);
    }

    public static int isUsedThreadPool() {
        if (r.a(24)) {
            return 1;
        }
        return 0;
    }

    static {
        int i2;
        MethodCollector.i(262);
        Covode.recordClassIndex(101318);
        f151979j = 0;
        synchronized (TTPlayer.class) {
            try {
                t.a();
                try {
                    if (f151979j == 0) {
                        int[] iArr = new int[AudioFormats.f151941a.length];
                        f151980k = iArr;
                        int length = AudioFormats.f151941a.length;
                        if (Build.VERSION.SDK_INT >= 23) {
                            i2 = length - 3;
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            i2 = length - 5;
                        } else {
                            i2 = length - 9;
                        }
                        for (int i3 = 0; i3 < i2; i3++) {
                            iArr[i3] = AudioFormats.f151941a[i3];
                        }
                        f151979j = i2;
                        _setSupprotSampleRates(f151980k, i2);
                    }
                } catch (UnsatisfiedLinkError e2) {
                    String str = t.f152106b;
                    if (str != null) {
                        UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(str);
                        MethodCollector.o(262);
                        throw unsatisfiedLinkError;
                    }
                    MethodCollector.o(262);
                    throw e2;
                }
            } finally {
                MethodCollector.o(262);
            }
        }
    }

    static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        boolean f151990a = true;

        static {
            Covode.recordClassIndex(101319);
        }

        @Override // com.ss.ttm.player.g
        public final boolean a(List<String> list) {
            MethodCollector.i(2071);
            for (String str : list) {
                try {
                    if (this.f151990a) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        System.load(str);
                        com.ss.android.ugc.aweme.lancet.m.a(uptimeMillis, str);
                    } else {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        Librarian.a(str);
                        com.ss.android.ugc.aweme.lancet.m.a(uptimeMillis2, str);
                    }
                } catch (Throwable th) {
                    th.getMessage();
                    MethodCollector.o(2071);
                    return false;
                }
            }
            MethodCollector.o(2071);
            return true;
        }
    }

    public TTPlayer(Context context, long j2) {
        MethodCollector.i(240);
        this.f151988g = context;
        this.f151985d = null;
        boolean z = f151982m;
        long _create = _create(context, z ? 1 : 0, f151978h);
        this.f151983b = _create;
        this.f151989i = j2;
        if (_create != 0) {
            MethodCollector.o(240);
            return;
        }
        Exception exc = new Exception("create native player is fail.");
        MethodCollector.o(240);
        throw exc;
    }

    public final int a(int i2, int i3) {
        MethodCollector.i(241);
        if (i2 == 11) {
            int _getIntValue = _getIntValue(this.f151983b, i2, i3);
            MethodCollector.o(241);
            return _getIntValue;
        } else if (i2 != 51) {
            switch (i2) {
                case 1:
                    int _getDuration = _getDuration(this.f151983b);
                    MethodCollector.o(241);
                    return _getDuration;
                case 2:
                    int _getCurrentPosition = _getCurrentPosition(this.f151983b);
                    MethodCollector.o(241);
                    return _getCurrentPosition;
                case 3:
                    int _getVideoWidth = _getVideoWidth(this.f151983b);
                    MethodCollector.o(241);
                    return _getVideoWidth;
                case 4:
                    int _getVideoHeight = _getVideoHeight(this.f151983b);
                    MethodCollector.o(241);
                    return _getVideoHeight;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    int _isLooping = _isLooping(this.f151983b);
                    MethodCollector.o(241);
                    return _isLooping;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    int _isPlaying = _isPlaying(this.f151983b);
                    MethodCollector.o(241);
                    return _isPlaying;
                default:
                    int _getIntValue2 = _getIntValue(this.f151983b, i2, i3);
                    MethodCollector.o(241);
                    return _getIntValue2;
            }
        } else {
            int i4 = this.n;
            MethodCollector.o(241);
            return i4;
        }
    }

    public final void onLogInfo(int i2, int i3, String str) {
        h hVar = this.f151985d;
        if (hVar != null) {
            try {
                hVar.a(i2, i3, str);
            } catch (Throwable unused) {
            }
        }
    }

    public void onFrameAboutToBeRendered(int i2, long j2, long j3, Map<Integer, String> map) {
        try {
            f fVar = this.f151986e;
            if (fVar != null) {
                fVar.a(j2, j3, map);
            }
        } catch (Throwable unused) {
        }
    }

    public void onNotify(int i2, int i3, int i4, String str) {
        if (((this.f151984c >> i3) & 1) == 1) {
            try {
                h hVar = this.f151985d;
                if (hVar != null) {
                    hVar.a(i2, i3, i4, str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
