package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ab.a;
import com.ss.android.ugc.aweme.common.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.openshare.Share;
import com.ss.android.ugc.aweme.utils.ha;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public Share.Request f123355a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f123356b;

    /* renamed from: c  reason: collision with root package name */
    private d f123357c;

    static {
        Covode.recordClassIndex(81010);
    }

    public aj(Activity activity, d dVar) {
        if (dVar != null && !TextUtils.isEmpty(dVar.mClientKey)) {
            this.f123356b = activity;
            this.f123355a = ha.a(dVar.getShareRequestBundle());
            this.f123357c = dVar;
        }
    }

    public final void a(String str, int i2) {
        if (this.f123355a != null) {
            Share.Response response = new Share.Response();
            response.subErrorCode = i2;
            response.errorCode = a.a(i2);
            response.state = this.f123355a.mState;
            response.errorMsg = str;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("launch_from", this.f123355a.mClientKey);
            String str2 = "";
            if (this.f123355a.extras != null) {
                str2 = this.f123355a.extras.getString("style_id", str2);
            }
            r.a("share_error_status", a2.a("style_id", str2).a("error_code", i2).f66730a);
            a(this.f123355a, response);
        }
    }

    public final boolean a(Share.Request request, Share.Response response) {
        if (request == null) {
            return false;
        }
        String callerPackage = request.getCallerPackage();
        String str = request.callerLocalEntry;
        if (TextUtils.isEmpty(callerPackage) || response == null || this.f123356b == null || TextUtils.isEmpty(str) || !response.checkArgs() || TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.a().getPackageName(), callerPackage)) {
            return false;
        }
        Bundle bundle = new Bundle();
        response.toBundle(bundle);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(callerPackage, str));
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        try {
            Activity activity = this.f123356b;
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
            this.f123356b.finish();
            return true;
        } catch (Exception unused) {
            this.f123356b.finish();
        }
        return false;
    }
}
