package com.ss.android.ugc.aweme.specact.popup.calendar;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class CheckCalendarExistMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134597a = new a((byte) 0);

    static {
        Covode.recordClassIndex(87949);
    }

    private CheckCalendarExistMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87950);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ CheckCalendarExistMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public CheckCalendarExistMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String optString;
        Activity j2 = f.j();
        if (j2 != null) {
            if (jSONObject == null) {
                optString = "";
            } else {
                optString = jSONObject.optString("identifier");
                l.b(optString, "");
            }
            int i2 = 1;
            if (optString.length() != 0) {
                if (!a.a(j2, optString)) {
                    i2 = 2;
                }
                if (aVar != null) {
                    aVar.a("", i2, "");
                }
            } else if (aVar != null) {
                aVar.a(-1, "Parameter invalid");
            }
        }
    }
}
