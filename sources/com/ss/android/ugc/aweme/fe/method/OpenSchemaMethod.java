package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public final class OpenSchemaMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91130a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57342);
    }

    private OpenSchemaMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57343);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenSchemaMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public OpenSchemaMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        Context context;
        String str2;
        Context context2;
        if (jSONObject != null) {
            str = jSONObject.optString("schema");
        } else {
            str = null;
        }
        if (this.mJsBridge == null) {
            return;
        }
        if (this.mContextRef.get() == null) {
            t.a(t.a(), str);
        } else if (!l.c(str)) {
            Context context3 = (Context) this.mContextRef.get();
            if (!(context3 instanceof Activity)) {
                context = null;
            } else {
                context = context3;
            }
            Activity activity = (Activity) context;
            if (activity == null) {
                if (!(context3 instanceof MutableContextWrapper)) {
                    context3 = null;
                }
                MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context3;
                if (mutableContextWrapper != null) {
                    context2 = mutableContextWrapper.getBaseContext();
                } else {
                    context2 = null;
                }
                if (!(context2 instanceof Activity)) {
                    context2 = null;
                }
                activity = (Activity) context2;
            }
            if (!t.a(t.a(), activity, str)) {
                if (!TextUtils.isEmpty(str)) {
                    if (str == null) {
                        l.b();
                    }
                    if (p.a((CharSequence) str, (CharSequence) "shoutouts/publish", false)) {
                        str2 = p.b(str, "aweme", "sslocal", false);
                        d.a.a((Context) this.mContextRef.get(), str2, (String) null, false);
                    }
                }
                if (str != null) {
                    str2 = p.a(str, "aweme", "sslocal", false);
                } else {
                    str2 = null;
                }
                d.a.a((Context) this.mContextRef.get(), str2, (String) null, false);
            }
        }
    }
}
