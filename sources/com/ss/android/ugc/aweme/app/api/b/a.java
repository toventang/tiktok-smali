package com.ss.android.ugc.aweme.app.api.b;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(40942);
    }

    public static Throwable a(Throwable th) {
        if (th instanceof ExecutionException) {
            return th.getCause();
        }
        return th;
    }

    public static com.ss.android.ugc.aweme.base.api.a.b.a a(Exception exc) {
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            return (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            return (com.ss.android.ugc.aweme.base.api.a.b.a) cause;
        }
        return null;
    }

    public static void a(Context context, com.ss.android.ugc.aweme.base.api.a.b.a aVar) {
        if (!TextUtils.isEmpty(aVar.getResponse())) {
            try {
                JSONObject jSONObject = new JSONObject(aVar.getResponse());
                if (!TextUtils.isEmpty(jSONObject.optString("status_msg"))) {
                    aVar.setErrorMsg(jSONObject.optString("status_msg"));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        a(context, (Throwable) aVar, (int) R.string.g4j);
    }

    public static void a(Context context, Exception exc, int i2) {
        Throwable a2 = a((Throwable) exc);
        if (a2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) a2;
            if (aVar.getErrorCode() == 2752) {
                String errorMsg = aVar.getErrorMsg();
                String string = context.getResources().getString(i2);
                a.C0731a a3 = new a.C0731a(context).a(R.string.d2_);
                if (TextUtils.isEmpty(errorMsg)) {
                    errorMsg = string;
                }
                a3.f33402b = errorMsg;
                a3.a(R.string.asg, (DialogInterface.OnClickListener) null, false).a().b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r3, java.lang.Throwable r4, int r5) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.api.b.a.a(android.content.Context, java.lang.Throwable, int):void");
    }
}
