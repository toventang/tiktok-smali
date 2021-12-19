package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.cc;
import h.f.a.a;
import h.f.b.l;
import h.z;

public class BaseVerificationService implements au, cc {
    static {
        Covode.recordClassIndex(79431);
    }

    public void checkUserVerifiedStatus(Activity activity, String str, Bundle bundle, a<z> aVar) {
        l.d(activity, "");
    }

    public String getPhoneCountryCode() {
        return "";
    }

    public boolean isHighRiskPhone(String str) {
        return false;
    }

    public void notifyCheckUserComplete() {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    public boolean shouldAlertHighRiskPhone() {
        return false;
    }

    public void verifyCredential(cc.a aVar) {
        l.d(aVar, "");
    }
}
