package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class ShowToastMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91193a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57393);
    }

    private ShowToastMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57394);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ ShowToastMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f91194a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f91195b;

        static {
            Covode.recordClassIndex(57395);
        }

        b(Context context, String str) {
            this.f91194a = context;
            this.f91195b = str;
        }

        public final void run() {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f91194a).a(this.f91195b).a();
        }
    }

    public ShowToastMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String optString;
        if (jSONObject != null && (optString = jSONObject.optString("message")) != null) {
            new Handler(Looper.getMainLooper()).post(new b((Context) this.mContextRef.get(), optString));
        }
    }
}
