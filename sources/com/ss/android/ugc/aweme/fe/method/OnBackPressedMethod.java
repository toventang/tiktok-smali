package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class OnBackPressedMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91099a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57314);
    }

    private OnBackPressedMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57315);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OnBackPressedMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    static final class b implements CrossPlatformActivity.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnBackPressedMethod f91100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f91101b;

        static {
            Covode.recordClassIndex(57316);
        }

        b(OnBackPressedMethod onBackPressedMethod, int i2) {
            this.f91100a = onBackPressedMethod;
            this.f91101b = i2;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.a
        public final boolean a() {
            this.f91100a.sendEvent("onBackPressed_event", new JSONObject(), 3);
            if (this.f91101b == 1) {
                return true;
            }
            return false;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        Context actContext = getActContext();
        if (!(actContext instanceof CrossPlatformActivity)) {
            actContext = null;
        }
        CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) actContext;
        if (crossPlatformActivity != null) {
            crossPlatformActivity.f78498d = null;
        }
    }

    public OnBackPressedMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        l.d(weakReference, "");
        Context context = weakReference.get();
        if (context instanceof m) {
            ((m) context).getLifecycle().a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        l.b(attach, "");
        return attach;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null && aVar != null) {
            Context actContext = getActContext();
            if (!(actContext instanceof CrossPlatformActivity)) {
                actContext = null;
            }
            CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) actContext;
            if (crossPlatformActivity != null) {
                int optInt = jSONObject.optInt("actionType", 0);
                if (optInt == 0) {
                    crossPlatformActivity.f78498d = null;
                } else {
                    crossPlatformActivity.f78498d = new b(this, optInt);
                }
            }
        }
    }
}
