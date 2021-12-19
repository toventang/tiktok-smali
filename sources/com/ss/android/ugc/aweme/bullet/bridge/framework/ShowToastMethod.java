package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class ShowToastMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69178b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69179c = "showToast";

    static {
        Covode.recordClassIndex(42659);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42660);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69179c;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShowToastMethod f69180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f69181b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f69182c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f69183d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69184e;

        static {
            Covode.recordClassIndex(42661);
        }

        b(ShowToastMethod showToastMethod, Context context, boolean z, String str, BaseBridgeMethod.a aVar) {
            this.f69180a = showToastMethod;
            this.f69181b = context;
            this.f69182c = z;
            this.f69183d = str;
            this.f69184e = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod.b.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowToastMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        Context e2 = e();
        String optString = jSONObject.optString("message");
        boolean optBoolean = jSONObject.optBoolean("onWindow");
        if (e2 != null) {
            new Handler(Looper.getMainLooper()).post(new b(this, e2, optBoolean, optString, aVar));
        } else {
            aVar.a(0, "");
        }
    }
}
