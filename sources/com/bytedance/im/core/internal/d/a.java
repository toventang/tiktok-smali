package com.bytedance.im.core.internal.d;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.q;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.av;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.internal.b.a.z;
import com.bytedance.im.core.internal.d.b.c;
import com.bytedance.im.core.internal.utils.x;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Response;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class a implements e, x.a {

    /* renamed from: a  reason: collision with root package name */
    protected x f38685a;

    /* renamed from: b  reason: collision with root package name */
    protected x f38686b;

    /* renamed from: c  reason: collision with root package name */
    protected x f38687c;

    /* renamed from: d  reason: collision with root package name */
    protected final ConcurrentLinkedQueue<k> f38688d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private long f38689e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f38690f = 0;

    /* renamed from: g  reason: collision with root package name */
    private long f38691g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f38692h;

    static {
        Covode.recordClassIndex(23073);
    }

    /* access modifiers changed from: protected */
    public abstract void b(k kVar);

    /* access modifiers changed from: protected */
    public abstract String c();

    /* access modifiers changed from: protected */
    public abstract void c(k kVar);

    @Override // com.bytedance.im.core.internal.d.e
    public final c d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f38688d.clear();
    }

    private void f() {
        this.f38690f = 0;
        this.f38689e = 0;
        this.f38691g = 0;
    }

    private static q g() {
        return d.a().b().Y;
    }

    private static boolean h() {
        q g2 = g();
        if (g2 == null || g2.f37612b <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public String b() {
        return getClass().getSimpleName() + " ";
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void e() {
        a();
        this.f38685a.removeMessages(101);
        this.f38686b.removeMessages(102);
        this.f38685a.removeMessages(103);
        this.f38685a.removeMessages(105);
    }

    a() {
        HandlerThread handlerThread = new HandlerThread(c());
        handlerThread.start();
        this.f38685a = new x(handlerThread.getLooper(), this);
        this.f38686b = new x(handlerThread.getLooper(), this);
        boolean z = d.a().b().ay.logCmdUsage;
        this.f38692h = z;
        f.a(b(), "BaseRequestManager logCmd:" + z, (Throwable) null);
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void a(x xVar) {
        this.f38687c = xVar;
    }

    private void j(k kVar) {
        int i2 = d.a().b().r;
        if (i2 > 0) {
            a(105, kVar);
            a(105, kVar, (long) i2);
        }
    }

    private void m(k kVar) {
        x xVar = this.f38687c;
        if (xVar != null) {
            Message obtain = Message.obtain(xVar, kVar.k());
            obtain.obj = kVar;
            this.f38687c.sendMessage(obtain);
        }
    }

    public final void f(k kVar) {
        if (kVar != null) {
            z zVar = kVar.u;
            if (zVar != null) {
                zVar.c();
            }
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = kVar;
            obtain.arg1 = 2;
            this.f38686b.sendMessage(obtain);
        }
    }

    /* access modifiers changed from: protected */
    public void g(k kVar) {
        if (this.f38688d.contains(kVar)) {
            a(103, kVar);
            a(105, kVar);
            this.f38688d.remove(kVar);
        }
    }

    /* access modifiers changed from: protected */
    public void h(k kVar) {
        if (this.f38688d.contains(kVar)) {
            a(103, kVar);
            a(105, kVar);
            this.f38688d.remove(kVar);
            m(kVar);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean i(k kVar) {
        k peek;
        if (kVar == null || this.f38688d.isEmpty() || (peek = this.f38688d.peek()) == null || peek.f38720a != kVar.f38720a) {
            return false;
        }
        return true;
    }

    private k a(Response response) {
        if (response == null) {
            return null;
        }
        Iterator<k> it = this.f38688d.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.f38724e != null && response.sequence_id != null && next.f38720a == response.sequence_id.longValue()) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void d(k kVar) {
        f.b("imsdk", getClass().getSimpleName() + " handleTimeOut" + kVar, (Throwable) null);
        a(kVar, -1002, "request time out");
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void e(k kVar) {
        if (kVar == null || kVar.f38724e == null || kVar.f38724e.cmd.intValue() <= IMCMD.IMCMD_NOT_USED.getValue()) {
            f.b("imsdk", getClass().getSimpleName() + " send abort, item invalid:" + kVar, (Throwable) null);
            return;
        }
        z zVar = kVar.u;
        if (zVar != null) {
            zVar.a();
        }
        Message obtain = Message.obtain();
        obtain.what = 101;
        obtain.obj = kVar;
        this.f38685a.sendMessage(obtain);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.Request$Builder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l(final com.bytedance.im.core.internal.d.k r10) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.d.a.l(com.bytedance.im.core.internal.d.k):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.bytedance.im.core.proto.Request$Builder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k(com.bytedance.im.core.internal.d.k r19) {
        /*
        // Method dump skipped, instructions count: 501
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.d.a.k(com.bytedance.im.core.internal.d.k):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.im.core.internal.d.k r14) {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.d.a.a(com.bytedance.im.core.internal.d.k):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r8 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if (r8.cmd != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c7, code lost:
        r9 = r8.cmd;
        r4 = new java.lang.StringBuilder("On Get Response By NetType (");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r11 == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        r0 = "WS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d4, code lost:
        com.bytedance.im.core.internal.utils.r.a(r9, r4.append(r0).append("): cmd:").append(r8.cmd).append(", sequence_id=").append(r8.sequence_id).toString(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        if (r1 != null) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        r1 = a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0105, code lost:
        if (com.bytedance.im.core.internal.utils.e.a(r8.cmd) != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0107, code lost:
        com.bytedance.im.core.c.f.b("imsdk", "find local waiting request item : ".concat(java.lang.String.valueOf(r1)), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        r3 = android.os.SystemClock.uptimeMillis() - r1.f38730k;
        r9 = r1.f38731l - 1;
        r10 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        r0 = "HTTP";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        r9 = com.bytedance.im.core.proto.IMCMD.fromValue(r8.cmd.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0134, code lost:
        if (r9 != null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0137, code lost:
        r4 = com.bytedance.im.core.internal.d.k.a(com.bytedance.im.core.a.e.b.f37585a);
        r4.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        if (r8.status_code == null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
        r0 = r8.status_code.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        r4.f38728i = r0;
        r4 = com.bytedance.im.core.internal.b.a.x.a(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0150, code lost:
        if (r4 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0152, code lost:
        com.bytedance.im.core.internal.utils.r.a(r8.cmd, "On Get Notify By WS: " + r8.cmd, r8);
        r4.f38726g = r13;
        m(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016e, code lost:
        r0 = com.bytedance.im.core.a.e.b.f37591g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r10.put("duration", r3);
        r10.put("retry", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cc, code lost:
        r0.printStackTrace();
     */
    @Override // com.bytedance.im.core.internal.utils.x.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Message r17) {
        /*
        // Method dump skipped, instructions count: 858
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.d.a.a(android.os.Message):void");
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void a(List<Long> list) {
        if (!(list == null || list.isEmpty() || this.f38688d.isEmpty())) {
            for (Long l2 : list) {
                Iterator<k> it = this.f38688d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    k next = it.next();
                    if (l2.longValue() == next.f38720a) {
                        next.f38722c = null;
                        break;
                    }
                }
            }
        }
    }

    private void a(int i2, k kVar) {
        x xVar = this.f38685a;
        if (xVar != null && kVar != null) {
            xVar.removeMessages(i2, kVar);
        }
    }

    @Override // com.bytedance.im.core.internal.d.e
    public final void a(Response response, bd bdVar) {
        if (response != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = new av(response, bdVar, SystemClock.uptimeMillis());
            obtain.arg1 = 1;
            this.f38686b.sendMessage(obtain);
        }
    }

    private void a(k kVar, int i2, String str) {
        if (kVar != null) {
            kVar.a(i2, str);
            m(kVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, k kVar, long j2) {
        x xVar = this.f38685a;
        if (xVar != null && kVar != null) {
            if (j2 < 0) {
                j2 = 0;
            }
            Message obtainMessage = xVar.obtainMessage(i2);
            obtainMessage.obj = kVar;
            this.f38685a.sendMessageDelayed(obtainMessage, j2);
        }
    }
}
