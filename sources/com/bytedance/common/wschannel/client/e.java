package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.b.b;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class e extends b {
    static {
        Covode.recordClassIndex(16017);
    }

    /* renamed from: com.bytedance.common.wschannel.client.e$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27185a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 16018(0x3e92, float:2.2446E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.common.wschannel.b.c[] r0 = com.bytedance.common.wschannel.b.c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.common.wschannel.client.e.AnonymousClass1.f27185a = r2
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.b.c.CONNECT_FAILED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.common.wschannel.client.e.AnonymousClass1.f27185a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.b.c.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.e.AnonymousClass1.<clinit>():void");
        }
    }

    public e(c.a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.d
    public final void a(Intent intent, a aVar) {
        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
        SocketState socketState = (SocketState) intent.getParcelableExtra("connection");
        com.bytedance.common.wschannel.b.c a2 = a(socketState.f27270d, socketState.f27268b);
        this.f27183a.a(new b(a2, com.bytedance.common.wschannel.b.a.of(socketState.f27271e), socketState.f27270d), socketState.a());
        int i2 = AnonymousClass1.f27185a[a2.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 0;
            } else {
                return;
            }
        }
        if (WsConstants.getLinkProgressChangeListener() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lp_status", i3);
                WsConstants.getLinkProgressChangeListener().a("CMP_RECEIVE_CONNECTION", jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
