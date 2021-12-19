package com.bytedance.android.livesdk.client;

import android.content.Context;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.MessageApi;
import com.bytedance.android.livesdk.as;
import com.bytedance.android.livesdk.livesetting.message.HotLiveMessageSizeSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdk.z;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.ugc.live.sdk.message.interfaces.IMessageClient;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private static final int f16686c = HotLiveMessageSizeSetting.INSTANCE.getValue();

    /* renamed from: b  reason: collision with root package name */
    public String f16687b;

    /* renamed from: d  reason: collision with root package name */
    private IMessageClient.Callback f16688d;

    /* renamed from: e  reason: collision with root package name */
    private long f16689e;

    /* renamed from: f  reason: collision with root package name */
    private long f16690f;

    /* renamed from: g  reason: collision with root package name */
    private Context f16691g;

    /* renamed from: h  reason: collision with root package name */
    private MessageApi f16692h = ((MessageApi) e.a().a(MessageApi.class));

    /* renamed from: i  reason: collision with root package name */
    private long f16693i;

    /* renamed from: j  reason: collision with root package name */
    private String f16694j;

    /* renamed from: k  reason: collision with root package name */
    private String f16695k;

    /* renamed from: l  reason: collision with root package name */
    private long f16696l;

    /* renamed from: m  reason: collision with root package name */
    private long f16697m;
    private long n;
    private boolean o = true;
    private boolean p = true;
    private f q = new f();
    private int r = 0;
    private int s = 0;
    private int t = 0;
    private long u = 0;
    private final as v;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final void connectToWebSocket() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final void disconnectFromWebSocket() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final long getUserId() {
        return this.f16690f;
    }

    static {
        Covode.recordClassIndex(9262);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final void onRelease() {
        z.a(this.r, this.s);
        z.a(this.u, (long) this.t);
    }

    private void a() {
        this.f16696l = -1;
        this.f16697m = 0;
        this.n = 0;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final void setCallback(IMessageClient.Callback callback) {
        this.f16688d = callback;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void apiCall(java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.b.apiCall(java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f6 A[Catch:{ all -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.ugc.live.sdk.message.data.ProtoApiResult a(com.bytedance.android.e.a.a.d.b r19) {
        /*
        // Method dump skipped, instructions count: 720
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.b.a(com.bytedance.android.e.a.a.d$b):com.ss.ugc.live.sdk.message.data.ProtoApiResult");
    }

    public b(boolean z, long j2) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.f16694j = str;
        this.f16690f = j2;
        this.v = (as) com.bytedance.android.live.t.a.a(IMessageService.class);
    }

    public final void a(long j2, Context context) {
        Context applicationContext;
        this.f16689e = j2;
        if (context != null) {
            applicationContext = a(context);
        } else {
            applicationContext = GlobalContext.getApplicationContext();
        }
        this.f16691g = applicationContext;
    }
}
