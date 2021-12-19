package com.ss.ttm.player;

import android.content.Context;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.view.Surface;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;

public class w extends k implements h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f152120a = w.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private static String f152121d = null;

    /* renamed from: e  reason: collision with root package name */
    private static String f152122e = null;

    /* renamed from: b  reason: collision with root package name */
    private long f152123b = System.currentTimeMillis();

    /* renamed from: c  reason: collision with root package name */
    private TTPlayer f152124c;

    /* renamed from: f  reason: collision with root package name */
    private TTPlayerClient f152125f;

    /* renamed from: g  reason: collision with root package name */
    private Context f152126g;

    @Override // com.ss.ttm.player.k
    public final Context h() {
        return this.f152126g;
    }

    @Override // com.ss.ttm.player.k
    public final void a(String str) {
        MethodCollector.i(1898);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setDataSource(tTPlayer.f151983b, str);
        }
        MethodCollector.o(1898);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final void a(IMediaDataSource iMediaDataSource) {
        MethodCollector.i(1900);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setDataSource(tTPlayer.f151983b, iMediaDataSource);
        }
        MethodCollector.o(1900);
    }

    @Override // com.ss.ttm.player.k
    public final void a(Surface surface) {
        MethodCollector.i(1905);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setVideoSurface(tTPlayer.f151983b, surface);
        }
        MethodCollector.o(1905);
    }

    @Override // com.ss.ttm.player.k
    public final void a(long j2) {
        MethodCollector.i(1906);
        TTPlayer tTPlayer = this.f152124c;
        tTPlayer.f151984c = j2;
        TTPlayer._setIntValue(tTPlayer.f151983b, 16, (int) j2);
        TTPlayer._setLongValue(tTPlayer.f151983b, 16, j2);
        MethodCollector.o(1906);
    }

    @Override // com.ss.ttm.player.k
    public final void a(String str, int i2) {
        MethodCollector.i(1916);
        TTPlayer._setCacheFile(this.f152124c.f151983b, str, 1);
        MethodCollector.o(1916);
    }

    @Override // com.ss.ttm.player.h
    public final void a(int i2, int i3, String str) {
        TTPlayerClient tTPlayerClient = this.f152125f;
        if (i2 != 2) {
            if (i2 == 0) {
                tTPlayerClient.f151995e = i3;
            }
            if (str != null) {
                if (tTPlayerClient.f151992b.size() > 40) {
                    tTPlayerClient.f151992b.removeFirst();
                }
                tTPlayerClient.f151992b.addLast(a.a(Locale.US, "%s&&time:%d", new Object[]{str, Long.valueOf(System.currentTimeMillis())}));
            }
        } else if (i3 == 1) {
            tTPlayerClient.f151998h = str;
        } else if (i3 == 0) {
            tTPlayerClient.f151997g = str;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final void a(LoadControl loadControl) {
        MethodCollector.i(1926);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setLoadControl(tTPlayer.f151983b, loadControl);
        }
        MethodCollector.o(1926);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final void a(MaskInfo maskInfo) {
        MethodCollector.i(1927);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setMaskInfo(tTPlayer.f151983b, maskInfo);
        }
        MethodCollector.o(1927);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final void a(SubInfo subInfo) {
        MethodCollector.i(1928);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setSubInfo(tTPlayer.f151983b, subInfo);
        }
        MethodCollector.o(1928);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final void a(f fVar) {
        this.f152124c.f151986e = fVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final void a(AudioProcessor audioProcessor) {
        MethodCollector.i(1929);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setAudioProcessor(tTPlayer.f151983b, audioProcessor);
        }
        MethodCollector.o(1929);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final boolean i() {
        if (this.f152124c == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final int j() {
        return this.f152124c.a(35, -1);
    }

    static {
        Covode.recordClassIndex(101377);
    }

    @Override // com.ss.ttm.player.k
    public final void c() {
        MethodCollector.i(1890);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._start(tTPlayer.f151983b);
        }
        MethodCollector.o(1890);
    }

    @Override // com.ss.ttm.player.k
    public final void f() {
        MethodCollector.i(1895);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._stop(tTPlayer.f151983b);
        }
        MethodCollector.o(1895);
    }

    @Override // com.ss.ttm.player.k
    public final void g() {
        MethodCollector.i(1897);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._prepare(tTPlayer.f151983b);
        }
        MethodCollector.o(1897);
    }

    @Override // com.ss.ttm.player.k
    public final void d() {
        MethodCollector.i(1891);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._pause(tTPlayer.f151983b);
        }
        MethodCollector.o(1891);
    }

    @Override // com.ss.ttm.player.k
    public final void e() {
        MethodCollector.i(1892);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._reset(tTPlayer.f151983b);
        }
        MethodCollector.o(1892);
    }

    @Override // com.ss.ttm.player.k
    public final void b() {
        MethodCollector.i(1889);
        TTPlayer tTPlayer = this.f152124c;
        this.f152124c = null;
        tTPlayer.f151984c = 0;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._release(tTPlayer.f151983b);
            tTPlayer.f151983b = 0;
        }
        tTPlayer.f151985d = null;
        tTPlayer.f151987f = null;
        MethodCollector.o(1889);
    }

    @Override // com.ss.ttm.player.k
    public final void a() {
        MethodCollector.i(1886);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setVideoSurface(tTPlayer.f151983b, null);
        }
        MethodCollector.o(1886);
    }

    private w(Context context) {
        this.f152126g = context;
    }

    @Override // com.ss.ttm.player.k
    public final void b(int i2) {
        MethodCollector.i(1902);
        TTPlayer._setLooping(this.f152124c.f151983b, i2);
        MethodCollector.o(1902);
    }

    @Override // com.ss.ttm.player.k
    public final void c(int i2) {
        MethodCollector.i(1904);
        TTPlayer._seek(this.f152124c.f151983b, i2);
        MethodCollector.o(1904);
    }

    @Override // com.ss.ttm.player.k
    public final String d(int i2) {
        MethodCollector.i(1918);
        String _getStringValue = TTPlayer._getStringValue(this.f152124c.f151983b, i2);
        MethodCollector.o(1918);
        return _getStringValue;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final Object e(int i2) {
        MethodCollector.i(1932);
        Object _getJObjectValue = TTPlayer._getJObjectValue(this.f152124c.f151983b, i2);
        MethodCollector.o(1932);
        return _getJObjectValue;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final void a(int i2) {
        MethodCollector.i(1899);
        TTPlayer tTPlayer = this.f152124c;
        if (tTPlayer.f151983b != 0) {
            TTPlayer._setDataSourceFd(tTPlayer.f151983b, i2);
        }
        MethodCollector.o(1899);
    }

    @Override // com.ss.ttm.player.k
    public final int a(int i2, int i3) {
        return this.f152124c.a(i2, i3);
    }

    @Override // com.ss.ttm.player.k
    public final void a(float f2, float f3) {
        MethodCollector.i(1903);
        TTPlayer._setVolume(this.f152124c.f151983b, f2, f3);
        MethodCollector.o(1903);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final int a(int i2, float f2) {
        MethodCollector.i(1930);
        int _setFloatValue = TTPlayer._setFloatValue(this.f152124c.f151983b, i2, f2);
        MethodCollector.o(1930);
        return _setFloatValue;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.k
    public final float b(int i2, float f2) {
        MethodCollector.i(1931);
        float _getFloatValue = TTPlayer._getFloatValue(this.f152124c.f151983b, i2, 0.0f);
        MethodCollector.o(1931);
        return _getFloatValue;
    }

    @Override // com.ss.ttm.player.k
    public final int a(int i2, long j2) {
        MethodCollector.i(1919);
        int _setLongValue = TTPlayer._setLongValue(this.f152124c.f151983b, i2, j2);
        MethodCollector.o(1919);
        return _setLongValue;
    }

    @Override // com.ss.ttm.player.k
    public final long b(int i2, long j2) {
        MethodCollector.i(1920);
        TTPlayer tTPlayer = this.f152124c;
        if (i2 == 50) {
            long j3 = tTPlayer.f151983b;
            MethodCollector.o(1920);
            return j3;
        }
        long _getLongValue = TTPlayer._getLongValue(tTPlayer.f151983b, i2, j2);
        MethodCollector.o(1920);
        return _getLongValue;
    }

    @Override // com.ss.ttm.player.k
    public final void c(int i2, int i3) {
        MethodCollector.i(1924);
        TTPlayer._switchStream(this.f152124c.f151983b, i2, i3);
        MethodCollector.o(1924);
    }

    public static final synchronized w a(TTPlayerClient tTPlayerClient, Context context) {
        w wVar;
        StringBuffer stringBuffer;
        String str;
        synchronized (w.class) {
            MethodCollector.i(1883);
            if (f152121d == null) {
                f152121d = r.d(context);
                try {
                    if (TTPlayer.f151978h == null) {
                        TTPlayer.f151978h = f152121d;
                    }
                } catch (UnsatisfiedLinkError e2) {
                    f152122e = e2.getMessage();
                }
            }
            if (f152122e == null) {
                wVar = new w(context);
                wVar.f152125f = tTPlayerClient;
                try {
                    TTPlayer tTPlayer = new TTPlayer(context, wVar.f152123b);
                    wVar.f152124c = tTPlayer;
                    tTPlayer.f151985d = wVar;
                    MethodCollector.o(1883);
                } catch (Throwable th) {
                    str = th.toString();
                }
            } else {
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(f152122e);
                MethodCollector.o(1883);
                throw unsatisfiedLinkError;
            }
        }
        return wVar;
        stringBuffer.append(th.toString()).append(",player:").append(str);
        RuntimeException runtimeException = new RuntimeException(stringBuffer.toString());
        MethodCollector.o(1883);
        throw runtimeException;
    }

    @Override // com.ss.ttm.player.k
    public final int b(int i2, int i3) {
        int i4;
        MethodCollector.i(1915);
        try {
            TTPlayer tTPlayer = this.f152124c;
            i4 = 0;
            if (i2 == 22) {
                if (!(i3 == 0 || i3 == 2 || i3 != 1)) {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    throw new NullPointerException("endsWith");
                }
            } else if (i2 == 111) {
                int length = s.f152104a.length;
                int[] iArr = new int[s.f152104a.length];
                int i5 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    if (((1 << i6) & i3) == 0) {
                        iArr[i5] = s.f152104a[i6];
                        i5++;
                    }
                }
                TTPlayer._setSupprotSampleRates(iArr, i5);
                MethodCollector.o(1915);
                return i4;
            }
            i4 = TTPlayer._setIntValue(tTPlayer.f151983b, i2, i3);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            i4 = -1;
        }
        MethodCollector.o(1915);
        return i4;
    }

    @Override // com.ss.ttm.player.k
    public final int a(int i2, String str) {
        MethodCollector.i(1917);
        int _setStringValue = TTPlayer._setStringValue(this.f152124c.f151983b, i2, str);
        MethodCollector.o(1917);
        return _setStringValue;
    }

    @Override // com.ss.ttm.player.h
    public final void a(int i2, int i3, int i4, String str) {
        MethodCollector.i(1921);
        TTPlayerClient tTPlayerClient = this.f152125f;
        synchronized (tTPlayerClient.f151993c) {
            try {
                if (tTPlayerClient.f151999i != null) {
                    if (i3 != 40 || str == null) {
                        Message obtainMessage = tTPlayerClient.f151999i.obtainMessage(i3, i4, i2);
                        obtainMessage.obj = str;
                        obtainMessage.sendToTarget();
                        MethodCollector.o(1921);
                        return;
                    }
                    tTPlayerClient.a(i2, i3, i4, str);
                    MethodCollector.o(1921);
                }
            } finally {
                MethodCollector.o(1921);
            }
        }
    }
}
