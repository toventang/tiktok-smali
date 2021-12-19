package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.utils.fg;
import h.f.b.l;
import org.json.JSONObject;

public final class NoticePermissionMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69008b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69009c = "noticePermission";

    static {
        Covode.recordClassIndex(42551);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42552);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69009c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticePermissionMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Activity activity;
        l.d(jSONObject, "");
        l.d(aVar, "");
        Context e2 = e();
        if (e2 != null && (e2 instanceof Activity) && (activity = (Activity) e2) != null && com.ss.android.ugc.aweme.activity.a.a(activity, true)) {
            boolean optBoolean = jSONObject.optBoolean("toOpen");
            if (!fg.a(e2)) {
                if (optBoolean) {
                    try {
                        fg.c(e2);
                    } catch (Exception unused) {
                        Intent intent = new Intent("android.settings.SETTINGS");
                        com.ss.android.ugc.tiktok.security.a.a.a(intent, e2);
                        e2.startActivity(intent);
                    }
                }
                aVar.a(0, "");
                return;
            }
            aVar.a("");
        }
    }
}
