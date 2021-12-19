package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.ew;
import com.ss.android.ugc.aweme.utils.fg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import java.util.HashMap;
import org.json.JSONObject;

public final class PushOperationMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f91135b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f91136a = "";

    static {
        Covode.recordClassIndex(57350);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57351);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public PushOperationMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PushOperationMethod f91137a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f91138b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91139c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f91140d;

        static {
            Covode.recordClassIndex(57352);
        }

        b(PushOperationMethod pushOperationMethod, z.e eVar, BaseCommonJavaMethod.a aVar, Context context) {
            this.f91137a = pushOperationMethod;
            this.f91138b = eVar;
            this.f91139c = aVar;
            this.f91140d = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str = this.f91137a.f91136a;
            HashMap hashMap = new HashMap();
            ew.a(str, hashMap);
            r.a("push_pre_permission_auth", hashMap);
            this.f91138b.element.put("auth_result", 2);
            this.f91139c.a((JSONObject) this.f91138b.element);
            try {
                fg.c(this.f91140d);
            } catch (Exception unused) {
                Context context = this.f91140d;
                Intent intent = new Intent("android.settings.SETTINGS");
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
            }
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PushOperationMethod f91141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f91142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91143c;

        static {
            Covode.recordClassIndex(57353);
        }

        c(PushOperationMethod pushOperationMethod, z.e eVar, BaseCommonJavaMethod.a aVar) {
            this.f91141a = pushOperationMethod;
            this.f91142b = eVar;
            this.f91143c = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str = this.f91141a.f91136a;
            HashMap hashMap = new HashMap();
            ew.a(str, hashMap);
            r.a("push_pre_permission_deny", hashMap);
            this.f91142b.element.put("auth_result", 0);
            this.f91143c.a((JSONObject) this.f91142b.element);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Context context;
        Activity activity;
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (this.mContextRef != null) {
            context = (Context) this.mContextRef.get();
        } else {
            context = null;
        }
        String optString = jSONObject.optString("track_info", "");
        l.b(optString, "");
        this.f91136a = optString;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null || activity.isFinishing()) {
            aVar.a(0, null);
        } else if (!fg.a(activity)) {
            a.C0731a aVar2 = new a.C0731a(activity);
            z.e eVar = new z.e();
            eVar.element = (T) new JSONObject();
            eVar.element.put("code", 1);
            aVar2.a(R.string.fro).b(R.string.frr).a(R.string.frq, (DialogInterface.OnClickListener) new b(this, eVar, aVar, activity), false).b(R.string.frp, (DialogInterface.OnClickListener) new c(this, eVar, aVar), false).a().b();
            String str = this.f91136a;
            HashMap hashMap = new HashMap();
            ew.a(str, hashMap);
            r.a("push_pre_permission_show", hashMap);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("auth_result", 1);
            aVar.a(jSONObject2);
        }
    }
}
