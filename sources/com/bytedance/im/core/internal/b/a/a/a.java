package com.bytedance.im.core.internal.b.a.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.at;
import com.bytedance.im.core.d.ay;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.d.c.b;
import com.bytedance.im.core.internal.b.a.z;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements z {

    /* renamed from: e  reason: collision with root package name */
    private static final Integer f38251e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static final Integer f38252f = 10;

    /* renamed from: a  reason: collision with root package name */
    private final ay f38253a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.im.core.d.c.a f38254b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f38255c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<Integer, b> f38256d = new ConcurrentHashMap<>();

    private static boolean a(long j2) {
        return j2 == 0;
    }

    private void e() {
        this.f38254b.f37932m = this.f38256d;
    }

    static {
        Covode.recordClassIndex(22915);
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void a() {
        if (a(this.f38254b.f37920a)) {
            this.f38254b.f37920a = SystemClock.uptimeMillis();
            com.bytedance.im.core.d.c.a aVar = this.f38254b;
            aVar.f37921b = aVar.f37920a - this.f38253a.f37863k;
            return;
        }
        a("logHandlerSendTime");
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void b() {
        if (a(this.f38254b.f37922c)) {
            this.f38254b.f37922c = SystemClock.uptimeMillis();
            com.bytedance.im.core.d.c.a aVar = this.f38254b;
            aVar.f37923d = aVar.f37922c - this.f38254b.f37920a;
            return;
        }
        a("logHandleWhatSendTime");
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void c() {
        if (a(this.f38254b.f37928i)) {
            this.f38254b.f37928i = SystemClock.uptimeMillis();
            com.bytedance.im.core.d.c.a aVar = this.f38254b;
            aVar.f37927h = aVar.f37928i - this.f38254b.f37922c;
            ConcurrentHashMap<Integer, b> concurrentHashMap = this.f38256d;
            concurrentHashMap.get(Collections.max(concurrentHashMap.keySet())).f37938f = true;
            return;
        }
        a("logReceiveHttpStart");
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void d() {
        if (a(this.f38254b.f37929j)) {
            this.f38254b.f37929j = SystemClock.uptimeMillis();
            com.bytedance.im.core.d.c.a aVar = this.f38254b;
            aVar.f37930k = aVar.f37929j - this.f38254b.f37928i;
            e();
            return;
        }
        a("logReceiveHttpEnd");
    }

    public a(ay ayVar) {
        this.f38253a = ayVar;
        this.f38254b = ayVar.w;
        this.f38255c = d.a().b().ay.enableCrash;
    }

    private void a(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("throwOrLogStateError:".concat(String.valueOf(str)));
        if (!this.f38255c) {
            f.b("imsdk", "SendMsgNetworkIntercept", illegalArgumentException);
            return;
        }
        throw illegalArgumentException;
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void b(int i2) {
        b bVar = this.f38256d.get(Integer.valueOf(i2 + 1));
        if (bVar == null) {
            a("logSendByWsAfterEncode is null");
        } else {
            bVar.f37940h = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void c(int i2) {
        b bVar = this.f38256d.get(Integer.valueOf(i2 + 1));
        if (bVar == null) {
            a("logSendByWsPostRetry is null");
        } else {
            bVar.f37941i = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void d(int i2) {
        b bVar = this.f38256d.get(Integer.valueOf((i2 + 1) * 10));
        if (bVar == null) {
            a("logSendByHttpBeforeSend is null");
        } else {
            bVar.f37942j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void e(int i2) {
        b bVar = this.f38256d.get(Integer.valueOf((i2 + 1) * 10));
        if (bVar == null) {
            a("logSendByHttpFailure is null");
        } else {
            bVar.f37943k = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void f(int i2) {
        b bVar = this.f38256d.get(Integer.valueOf((i2 + 1) * 10));
        if (bVar == null) {
            a("logSendByHttpFailure is null");
        } else {
            bVar.f37944l = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void a(int i2) {
        b bVar = this.f38256d.get(Integer.valueOf(i2 + 1));
        if (bVar == null) {
            a("logSendByWsBeforeEncode is null");
        } else {
            bVar.f37939g = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void a(long j2, bd bdVar) {
        if (a(this.f38254b.f37925f)) {
            com.bytedance.im.core.d.c.a aVar = this.f38254b;
            aVar.f37927h = j2 - aVar.f37922c;
            this.f38254b.f37924e = j2;
            this.f38254b.f37925f = SystemClock.uptimeMillis();
            com.bytedance.im.core.d.c.a aVar2 = this.f38254b;
            aVar2.f37926g = aVar2.f37925f - this.f38254b.f37924e;
            this.f38254b.f37931l = (bdVar.f37892a.get(Integer.valueOf(at.f37834g)).longValue() - bdVar.f37892a.get(Integer.valueOf(at.f37833f)).longValue()) / 1000000;
            e();
            return;
        }
        a("logReceiveWs");
    }

    @Override // com.bytedance.im.core.internal.b.a.z
    public final void a(int i2, int i3, boolean z, boolean z2) {
        int i4;
        if (z) {
            i4 = (i3 + 1) * 10;
        } else if (i2 > 10) {
            a("logBeforeRealSend,wsRetry is broken:".concat(String.valueOf(i2)));
            return;
        } else {
            i4 = i2 + 1;
        }
        this.f38256d.putIfAbsent(Integer.valueOf(i4), new b(i2, i3, z, z2, SystemClock.uptimeMillis()));
    }
}
