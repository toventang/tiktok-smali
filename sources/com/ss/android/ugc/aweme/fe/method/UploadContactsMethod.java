package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.sdk.webview.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.friends.ui.f;
import com.ss.android.ugc.aweme.utils.be;
import h.f.b.l;
import org.json.JSONObject;

public final class UploadContactsMethod extends BaseCommonJavaMethod implements WeakHandler.IHandler, au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f91198b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final WeakHandler f91199a;

    /* renamed from: c  reason: collision with root package name */
    private BaseCommonJavaMethod.a f91200c;

    static {
        Covode.recordClassIndex(57402);
    }

    private UploadContactsMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57403);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ UploadContactsMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UploadContactsMethod f91201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91202b;

        static {
            Covode.recordClassIndex(57404);
        }

        @Override // com.ss.android.ugc.aweme.friends.ui.f
        public final void a() {
            com.ss.android.ugc.aweme.user.d.a.a();
            com.ss.android.ugc.aweme.user.d.a.a(this.f91201a.f91199a);
        }

        @Override // com.ss.android.ugc.aweme.friends.ui.f
        public final void b() {
            BaseCommonJavaMethod.a aVar = this.f91202b;
            if (aVar != null) {
                aVar.a(0, "");
            }
        }

        b(UploadContactsMethod uploadContactsMethod, BaseCommonJavaMethod.a aVar) {
            this.f91201a = uploadContactsMethod;
            this.f91202b = aVar;
        }
    }

    public UploadContactsMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91199a = new WeakHandler(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Integer valueOf;
        BaseCommonJavaMethod.a aVar;
        if (message != null && (valueOf = Integer.valueOf(message.what)) != null && valueOf.intValue() == 115 && (aVar = this.f91200c) != null) {
            aVar.a("", 1, "");
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        this.f91200c = aVar;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            Activity b2 = d.b(this.mContextRef);
            if (be.a(com.bytedance.ies.ugc.appcontext.d.a())) {
                com.ss.android.ugc.aweme.user.d.a.a();
                com.ss.android.ugc.aweme.user.d.a.a(this.f91199a);
            } else if (b2 != null) {
                be.a(b2, new b(this, aVar));
            } else if (aVar != null) {
                aVar.a(0, "");
            }
        } else if (aVar != null) {
            aVar.a(0, "");
        }
    }
}
