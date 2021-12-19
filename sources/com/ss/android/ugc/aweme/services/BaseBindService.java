package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.bean.a;
import com.ss.android.ugc.aweme.account.bean.b;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bj;
import h.z;
import java.util.ArrayList;

public abstract class BaseBindService implements au, bj {
    private boolean mKeepCallback;
    private m mLifeOwner;
    private IAccountService.g mResult;

    static {
        Covode.recordClassIndex(79423);
    }

    public void bind(d dVar, a aVar, bj.a aVar2) {
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
    }

    public void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void changeEmail(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void changeUnverifiedEmail(Activity activity, String str, Bundle bundle) {
    }

    public void checkVcdPhoneRequired(f<Boolean, z> fVar) {
    }

    public b getBindToken(Context context, a aVar) {
        return null;
    }

    public bj keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public void returnAuthorizeResult(String str, boolean z) {
    }

    public void syncAllVideos(Context context, a aVar, bj.a aVar2) {
    }

    public void unBind(Context context, a aVar, bj.a aVar2) {
    }

    public void unBindWithApi(Context context, a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str) {
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void unbindPhone(Activity activity, ArrayList<String> arrayList, String str) {
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void verifyEmail(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
    }

    public void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
    }

    public void verifyEmailWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.g gVar) {
    }

    public void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
    }

    public void verifyMobileWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.g gVar) {
    }

    public boolean hasPlatformBound() {
        return com.ss.android.sdk.a.b.f60131a.a();
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

    @Override // com.ss.android.ugc.aweme.bj
    public Intent getAuthorizeActivityStartIntent(Context context) {
        return new Intent(context, AuthorizeActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.bj
    public boolean isPlatformBound(String str) {
        return com.ss.android.sdk.a.b.f60131a.a(str);
    }

    public void returnResult(int i2, int i3, Object obj) {
        IAccountService.g gVar = this.mResult;
        if (gVar != null) {
            gVar.onResult(i2, i3, obj);
        }
        this.mResult = null;
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void bindMobile(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof m)) {
            m mVar = (m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void modifyMobile(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof m)) {
            m mVar = (m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof m)) {
            m mVar = (m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }
}
