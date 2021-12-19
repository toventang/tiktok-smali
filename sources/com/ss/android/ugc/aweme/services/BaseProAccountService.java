package com.ss.android.ugc.aweme.services;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bs;

public class BaseProAccountService implements au, bs {
    private m mLifeOwner;
    private IAccountService.g mResult;

    static {
        Covode.recordClassIndex(79429);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public void switchBusinessAccount(String str, IAccountService.g gVar) {
    }

    @Override // com.ss.android.ugc.aweme.bs
    public void switchProAccount(int i2, String str, String str2, int i3, IAccountService.g gVar) {
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        m mVar = this.mLifeOwner;
        if (mVar != null) {
            mVar.getLifecycle().b(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public void returnResult(int i2, int i3, Object obj) {
        IAccountService.g gVar = this.mResult;
        if (gVar != null) {
            gVar.onResult(i2, i3, obj);
        }
    }
}
