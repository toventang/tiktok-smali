package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.br;

public abstract class BasePasswordService implements au, br {
    private boolean mKeepCallback;
    private m mLifeOwner;
    private IAccountService.g mResult;

    static {
        Covode.recordClassIndex(79428);
    }

    public br keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.br
    public void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.g gVar) {
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        m mVar = this.mLifeOwner;
        if (mVar != null) {
            mVar.getLifecycle().b(this);
        }
        this.mResult = null;
        this.mLifeOwner = null;
    }

    public void returnResult(int i2, int i3, Object obj) {
        IAccountService.g gVar = this.mResult;
        if (gVar != null) {
            gVar.onResult(i2, i3, obj);
            this.mResult = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.br
    public void setPassword(Activity activity, Bundle bundle, IAccountService.g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof m)) {
            m mVar = (m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.ss.android.ugc.aweme.br
    public void verifyPassword(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof m)) {
            m mVar = (m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.ss.android.ugc.aweme.br
    public void changePassword(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof m)) {
            m mVar = (m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }
}
