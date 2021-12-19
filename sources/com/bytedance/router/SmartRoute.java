package com.bytedance.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class SmartRoute {
    private int enterAnim = -1;
    private int exitAnim = -1;
    private Bundle mAnimationBundle;
    private OpenResultCallback mCallback;
    private Context mContext;
    private Uri mData;
    private Boolean mExternalType = false;
    private Intent mExtraParams;
    private Fragment mFragment = null;
    private String mUrl = "";

    static {
        Covode.recordClassIndex(26129);
    }

    public SmartRoute withParam(String str, boolean z) {
        this.mExtraParams.putExtra(str, z);
        return this;
    }

    public SmartRoute withParam(String str, boolean[] zArr) {
        this.mExtraParams.putExtra(str, zArr);
        return this;
    }

    public SmartRoute withParam(String str, byte[] bArr) {
        this.mExtraParams.putExtra(str, bArr);
        return this;
    }

    public SmartRoute withParam(String str, char[] cArr) {
        this.mExtraParams.putExtra(str, cArr);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence charSequence) {
        this.mExtraParams.putExtra(str, charSequence);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence[] charSequenceArr) {
        this.mExtraParams.putExtra(str, charSequenceArr);
        return this;
    }

    public SmartRoute withParam(String str, double[] dArr) {
        this.mExtraParams.putExtra(str, dArr);
        return this;
    }

    public SmartRoute withParam(String str, float[] fArr) {
        this.mExtraParams.putExtra(str, fArr);
        return this;
    }

    public SmartRoute withParam(String str, int[] iArr) {
        this.mExtraParams.putExtra(str, iArr);
        return this;
    }

    public SmartRoute withParam(String str, long[] jArr) {
        this.mExtraParams.putExtra(str, jArr);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable parcelable) {
        this.mExtraParams.putExtra(str, parcelable);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable[] parcelableArr) {
        this.mExtraParams.putExtra(str, parcelableArr);
        return this;
    }

    public SmartRoute withParam(String str, Serializable serializable) {
        this.mExtraParams.putExtra(str, serializable);
        return this;
    }

    public SmartRoute withParam(String str, short s) {
        this.mExtraParams.putExtra(str, s);
        return this;
    }

    public SmartRoute withParam(String str, short[] sArr) {
        this.mExtraParams.putExtra(str, sArr);
        return this;
    }

    public SmartRoute withParam(String str, String str2) {
        this.mExtraParams.putExtra(str, str2);
        return this;
    }

    public SmartRoute withParam(String str, String[] strArr) {
        this.mExtraParams.putExtra(str, strArr);
        return this;
    }

    public Intent buildIntent() {
        RouteManager.getInstance().setTempResultCallback(this.mCallback);
        if (TextUtils.isEmpty(this.mUrl) || !Util.isLegalUrl(this.mUrl)) {
            Logger.e("SmartRoute#buildIntent error!!!");
            RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#buildIntent error!");
            return null;
        }
        return RouteManager.getInstance().buildIntent(this.mContext, buildRouteIntent());
    }

    public void open() {
        RouteManager.getInstance().setTempResultCallback(this.mCallback);
        if (this.mContext == null || TextUtils.isEmpty(this.mUrl) || !Util.isLegalUrl(this.mUrl)) {
            Logger.e("SmartRoute#open error");
            RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#open error");
            return;
        }
        RouteManager.getInstance().open(this.mContext, buildRouteIntent());
    }

    /* access modifiers changed from: protected */
    public RouteIntent buildRouteIntent() {
        return new RouteIntent.Builder().withUrl(this.mUrl).withParam(this.mExtraParams).addFlags(this.mExtraParams.getFlags()).withAnimation(this.enterAnim, this.exitAnim).withBundleAnimation(this.mAnimationBundle).withCallback(this.mCallback).withData(this.mData).withExternalType(this.mExternalType.booleanValue()).build();
    }

    public SmartRoute withBundleAnimation(Bundle bundle) {
        this.mAnimationBundle = bundle;
        return this;
    }

    public SmartRoute withCallback(OpenResultCallback openResultCallback) {
        this.mCallback = openResultCallback;
        return this;
    }

    /* access modifiers changed from: protected */
    public SmartRoute withFragment(Fragment fragment) {
        this.mFragment = fragment;
        return this;
    }

    public SmartRoute withParam(Uri uri) {
        this.mData = uri;
        return this;
    }

    public SmartRoute withUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public static Bundle com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public SmartRoute addFlags(int i2) {
        this.mExtraParams.addFlags(i2);
        return this;
    }

    public void open(int i2) {
        open(i2, null);
    }

    public SmartRoute setExternal(boolean z) {
        this.mExternalType = Boolean.valueOf(z);
        return this;
    }

    public SmartRoute withParam(Bundle bundle) {
        this.mExtraParams.putExtras(bundle);
        return this;
    }

    public SmartRoute withNavArg(Parcelable parcelable) {
        if (parcelable != null) {
            this.mExtraParams.putExtra("smart_key_route_arg", parcelable);
        }
        return this;
    }

    public SmartRoute(Context context) {
        this.mContext = context;
        this.mExtraParams = new Intent();
    }

    public SmartRoute withParam(Intent intent) {
        if (com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent) != null) {
            if (com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.mExtraParams) == null) {
                this.mExtraParams.putExtras(new Bundle());
            }
            com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.mExtraParams).putAll(com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
        }
        return this;
    }

    public SmartRoute withAnimation(int i2, int i3) {
        this.enterAnim = i2;
        this.exitAnim = i3;
        return this;
    }

    public SmartRoute withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
        this.mExtraParams.putCharSequenceArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamIntegerList(String str, ArrayList<Integer> arrayList) {
        this.mExtraParams.putIntegerArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamParcelableList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.mExtraParams.putParcelableArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamStringList(String str, ArrayList<String> arrayList) {
        this.mExtraParams.putStringArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParam(String str, byte b2) {
        this.mExtraParams.putExtra(str, b2);
        return this;
    }

    public SmartRoute withParam(String str, char c2) {
        this.mExtraParams.putExtra(str, c2);
        return this;
    }

    private void sliceParams2Intent(Intent intent, String str) {
        Map<String, String> sliceUrlParams = Util.sliceUrlParams(str);
        if (!(sliceUrlParams == null || sliceUrlParams.size() == 0)) {
            for (Map.Entry<String, String> entry : sliceUrlParams.entrySet()) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
        }
    }

    public void open(int i2, OnActivityResultCallback onActivityResultCallback) {
        if (i2 != Integer.MIN_VALUE) {
            RouteManager.getInstance().setTempResultCallback(this.mCallback);
            if (this.mContext == null || TextUtils.isEmpty(this.mUrl) || !Util.isLegalUrl(this.mUrl) || !(this.mContext instanceof Activity)) {
                RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#open(int requestCode) error!");
                Logger.e("SmartRoute#open(int requestCode) error");
                return;
            }
            RouteIntent buildRouteIntent = buildRouteIntent();
            buildRouteIntent.setRequestCode(i2);
            buildRouteIntent.setOnActivityResultCallback(onActivityResultCallback);
            Fragment fragment = this.mFragment;
            if (fragment != null) {
                buildRouteIntent.setFragment(fragment);
            }
            RouteManager.getInstance().open(this.mContext, buildRouteIntent);
            return;
        }
        throw new IllegalArgumentException("requestCode must not be Integer.MIN_VALUE:-2147483648 !!!");
    }

    public SmartRoute withParam(String str, double d2) {
        this.mExtraParams.putExtra(str, d2);
        return this;
    }

    public SmartRoute withParam(String str, float f2) {
        this.mExtraParams.putExtra(str, f2);
        return this;
    }

    public SmartRoute withParam(String str, int i2) {
        this.mExtraParams.putExtra(str, i2);
        return this;
    }

    public SmartRoute withParam(String str, long j2) {
        this.mExtraParams.putExtra(str, j2);
        return this;
    }

    public SmartRoute withParam(String str, Bundle bundle) {
        this.mExtraParams.putExtra(str, bundle);
        return this;
    }
}
