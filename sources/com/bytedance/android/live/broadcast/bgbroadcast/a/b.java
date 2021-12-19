package com.bytedance.android.live.broadcast.bgbroadcast.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.api.d.c;
import com.bytedance.android.live.broadcast.bgbroadcast.a;
import com.bytedance.android.live.broadcast.stream.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.m.e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.avframework.livestreamv2.ILiveStream;

public final class b extends a implements com.bytedance.android.live.broadcast.api.d.b, ILiveStream.ILiveStreamErrorListener {

    /* renamed from: j  reason: collision with root package name */
    private static final int[][] f7611j = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};

    /* renamed from: b  reason: collision with root package name */
    final Context f7612b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.d.a f7613c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.d.b f7614d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f7615e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private final Room f7616f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7617g = false;

    /* renamed from: h  reason: collision with root package name */
    private f.a.b.b f7618h;

    /* renamed from: i  reason: collision with root package name */
    private int f7619i = 0;

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onNetworkStatus(int i2) {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void connected() {
        e();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a
    public final com.bytedance.android.live.broadcast.api.d.a d() {
        return this.f7613c;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void beforeLiveCoreStartStream() {
        com.bytedance.android.live.broadcast.api.d.b bVar = this.f7614d;
        if (bVar != null) {
            bVar.beforeLiveCoreStartStream();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onStreamStart() {
        com.bytedance.android.live.broadcast.api.d.b bVar = this.f7614d;
        if (bVar != null) {
            bVar.onStreamStart();
        }
    }

    private static void e() {
        e.f23262a = 1;
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.e.a.a(1));
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onCaptureFirstFrame() {
        com.bytedance.android.live.broadcast.api.c.a.a("capture_first_frame", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onReconnected() {
        this.f7615e.post(new d(this));
        e();
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onFirstRTMPConnect() {
        com.bytedance.android.live.broadcast.api.c.a.a("rtmp_connected", String.valueOf(System.currentTimeMillis()));
        com.bytedance.android.live.broadcast.api.c.a.a();
        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).startLiveManager().a();
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onNetworkLow() {
        if (this.f7617g) {
            e.f23262a = 2;
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.e.a.a(2));
        }
        this.f7617g = true;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onReconnect() {
        this.f7615e.post(new c(this));
        e.f23262a = 0;
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.e.a.a(0));
    }

    static {
        Covode.recordClassIndex(3753);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a
    public final void a() {
        com.bytedance.android.live.broadcast.api.d.a aVar = this.f7613c;
        if (aVar != null) {
            aVar.a(false, PrivacyCert.Builder.with("bpea-383").usage("").tag("screen record broadcast start audio").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a
    public final void b() {
        com.bytedance.android.live.broadcast.api.d.a aVar = this.f7613c;
        if (aVar != null) {
            aVar.a(true, PrivacyCert.Builder.with("bpea-384").usage("").tag("screen record broadcast stop audio").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a
    public final void c() {
        com.bytedance.android.live.broadcast.api.d.a aVar = this.f7613c;
        if (aVar != null) {
            aVar.c(PrivacyCert.Builder.with("bpea-488").usage("").tag("release when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        f.a.b.b bVar = this.f7618h;
        if (bVar != null) {
            bVar.dispose();
        }
        DataChannelGlobal.f34575d.c(com.bytedance.android.live.broadcast.api.e.class);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onInfo(float f2) {
        com.bytedance.android.live.broadcast.api.d.b bVar = this.f7614d;
        if (bVar != null) {
            bVar.onInfo(f2);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a
    public final boolean b(PrivacyCert privacyCert) {
        com.bytedance.android.live.broadcast.api.d.a aVar = this.f7613c;
        if (aVar == null) {
            return false;
        }
        aVar.i(privacyCert);
        f.a("release_audio");
        this.f7613c.g(privacyCert);
        f.a("release_screen");
        this.f7613c.a();
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a
    public final boolean a(PrivacyCert privacyCert) {
        com.bytedance.android.live.broadcast.api.d.a aVar;
        if (this.f7616f.getStreamUrl() == null || this.f7616f.getStreamUrl().a() == null || (aVar = this.f7613c) == null) {
            return false;
        }
        aVar.h(privacyCert);
        f.a("capture_audio");
        this.f7613c.f(privacyCert);
        f.a("capture_screen");
        this.f7613c.a(this.f7616f.getStreamUrl().a());
        return true;
    }

    public b(Context context, Room room) {
        this.f7612b = context;
        this.f7616f = room;
        e.f23262a = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa A[Catch:{ Exception -> 0x010b }, LOOP:0: B:47:0x00f4->B:49:0x00fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0102 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x026c  */
    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 624
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.a.b.a(android.content.Intent, boolean):void");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener
    public final void onError(int i2, int i3, Exception exc) {
        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).startLiveManager().a(i2);
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.a.b.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onStreamEnd(int i2, int i3, String str) {
        if (c.a(i2)) {
            this.f7615e.post(new e(this));
            if (i2 <= 0) {
                return;
            }
        } else if (i2 > 0) {
            this.f7615e.post(new f(this));
        } else {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = c.b(i2);
        }
        c.a.c("ttlive_obs_stream_end_error").b("error_code", Integer.valueOf(i2)).b("error_msg", str).a();
        if (this.f7603a != null) {
            this.f7603a.a();
        }
    }
}
