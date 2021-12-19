package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.sdk.webview.c;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.utils.bi;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class ClosePopUpWebPageMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91031a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57259);
    }

    private ClosePopUpWebPageMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57260);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ ClosePopUpWebPageMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public ClosePopUpWebPageMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        bi biVar;
        Context context;
        Context context2;
        c cVar = (c) this.mProviderFactoryRef.get();
        if (cVar != null) {
            biVar = (bi) cVar.a(bi.class);
            if (biVar != null) {
                context = biVar.getContext();
            }
            context = null;
        } else {
            biVar = null;
            context = null;
        }
        if (!(context instanceof e) && aVar != null) {
            aVar.a(-1, "not fragmentActivity");
        }
        if (biVar != null) {
            context2 = biVar.getContext();
        } else {
            context2 = null;
        }
        if (!(context2 instanceof e)) {
            context2 = null;
        }
        e eVar = (e) context2;
        if (eVar != null) {
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.c a2 = b.a();
            if (a2 != null) {
                a2.b(eVar);
            }
            if (aVar != null) {
                aVar.a((Object) null);
            }
        }
    }
}
