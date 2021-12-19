package com.bytedance.router;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class RouteIntent {
    private int enterAnim = -1;
    private int exitAnim = -1;
    private Bundle mAnimationBundle;
    private OpenResultCallback mCallback;
    private Uri mData;
    private boolean mExternalType;
    private Intent mExtraIntent;
    private Fragment mFragment;
    private String mHost = "";
    private OnActivityResultCallback mOnActivityResultCallback;
    private String mOriginUrl = "";
    private String mPath = "";
    private int mRequestCode = Integer.MIN_VALUE;
    private String mScheme = "";
    private Uri mUri;
    private String mUrl = "";
    private boolean needIntercept = true;

    static {
        Covode.recordClassIndex(26114);
    }

    public Bundle getAnimationBundle() {
        return this.mAnimationBundle;
    }

    public OpenResultCallback getCallback() {
        return this.mCallback;
    }

    public Uri getData() {
        return this.mData;
    }

    public int getEnterAnim() {
        return this.enterAnim;
    }

    public int getExitAnim() {
        return this.exitAnim;
    }

    public Intent getExtra() {
        return this.mExtraIntent;
    }

    public Fragment getFragment() {
        return this.mFragment;
    }

    public String getHost() {
        return this.mHost;
    }

    public boolean getNeedIntercept() {
        return this.needIntercept;
    }

    public OnActivityResultCallback getOnActivityResultCallback() {
        return this.mOnActivityResultCallback;
    }

    public String getOriginUrl() {
        return this.mOriginUrl;
    }

    public String getPath() {
        return this.mPath;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean isExternalType() {
        return this.mExternalType;
    }

    public static class Builder {
        private int enterAnim = -1;
        private int exitAnim = -1;
        private Bundle mAnimationBundle;
        private OpenResultCallback mCallback = null;
        private Uri mData;
        private Boolean mExternalType = false;
        private Intent mExtraParams = new Intent();
        private boolean mNeedIntercept = true;
        private String mUrl = "";

        static {
            Covode.recordClassIndex(26115);
        }

        public Builder withParam(String str, boolean z) {
            this.mExtraParams.putExtra(str, z);
            return this;
        }

        public Builder withParam(String str, boolean[] zArr) {
            this.mExtraParams.putExtra(str, zArr);
            return this;
        }

        public Builder withParam(String str, byte[] bArr) {
            this.mExtraParams.putExtra(str, bArr);
            return this;
        }

        public Builder withParam(String str, char[] cArr) {
            this.mExtraParams.putExtra(str, cArr);
            return this;
        }

        public Builder withParam(String str, CharSequence charSequence) {
            this.mExtraParams.putExtra(str, charSequence);
            return this;
        }

        public Builder withParam(String str, CharSequence[] charSequenceArr) {
            this.mExtraParams.putExtra(str, charSequenceArr);
            return this;
        }

        public Builder withParam(String str, double[] dArr) {
            this.mExtraParams.putExtra(str, dArr);
            return this;
        }

        public Builder withParam(String str, float[] fArr) {
            this.mExtraParams.putExtra(str, fArr);
            return this;
        }

        public Builder withParam(String str, int[] iArr) {
            this.mExtraParams.putExtra(str, iArr);
            return this;
        }

        public Builder withParam(String str, long[] jArr) {
            this.mExtraParams.putExtra(str, jArr);
            return this;
        }

        public Builder withParam(String str, Parcelable parcelable) {
            this.mExtraParams.putExtra(str, parcelable);
            return this;
        }

        public Builder withParam(String str, Parcelable[] parcelableArr) {
            this.mExtraParams.putExtra(str, parcelableArr);
            return this;
        }

        public Builder withParam(String str, Serializable serializable) {
            this.mExtraParams.putExtra(str, serializable);
            return this;
        }

        public Builder withParam(String str, short s) {
            this.mExtraParams.putExtra(str, s);
            return this;
        }

        public Builder withParam(String str, short[] sArr) {
            this.mExtraParams.putExtra(str, sArr);
            return this;
        }

        public Builder withParam(String str, String str2) {
            this.mExtraParams.putExtra(str, str2);
            return this;
        }

        public Builder withParam(String str, String[] strArr) {
            this.mExtraParams.putExtra(str, strArr);
            return this;
        }

        public Builder() {
        }

        public RouteIntent build() {
            RouteIntent routeIntent = new RouteIntent();
            Logger.d("Build RouteIntent url: " + this.mUrl);
            RouteIntent.sliceParams2Intent(this.mExtraParams, this.mUrl, false);
            routeIntent.setOriginUrl(this.mUrl);
            routeIntent.setExtra(this.mExtraParams);
            routeIntent.setAnimation(this.enterAnim, this.exitAnim);
            routeIntent.setAnimationBundle(this.mAnimationBundle);
            routeIntent.setData(this.mData);
            routeIntent.setExternalType(this.mExternalType.booleanValue());
            routeIntent.setNeedIntercept(this.mNeedIntercept);
            OpenResultCallback openResultCallback = this.mCallback;
            if (openResultCallback != null) {
                routeIntent.setCallback(openResultCallback);
            }
            routeIntent.parseUrl();
            return routeIntent;
        }

        public Builder needIntercept(boolean z) {
            this.mNeedIntercept = z;
            return this;
        }

        public Builder withBundleAnimation(Bundle bundle) {
            this.mAnimationBundle = bundle;
            return this;
        }

        public Builder withCallback(OpenResultCallback openResultCallback) {
            this.mCallback = openResultCallback;
            return this;
        }

        public Builder withData(Uri uri) {
            this.mData = uri;
            return this;
        }

        public Builder withUrl(String str) {
            this.mUrl = str;
            return this;
        }

        public Builder addFlags(int i2) {
            this.mExtraParams.addFlags(i2);
            return this;
        }

        public Builder withExternalType(boolean z) {
            this.mExternalType = Boolean.valueOf(z);
            return this;
        }

        public Builder withParam(Intent intent) {
            this.mExtraParams.putExtras(intent);
            return this;
        }

        public Builder withParam(Bundle bundle) {
            this.mExtraParams.putExtras(bundle);
            return this;
        }

        public Builder(String str) {
            this.mUrl = str;
        }

        public Builder withAnimation(int i2, int i3) {
            this.enterAnim = i2;
            this.exitAnim = i3;
            return this;
        }

        public Builder withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
            this.mExtraParams.putExtra(str, arrayList);
            return this;
        }

        public Builder withParamIntegerList(String str, ArrayList<Integer> arrayList) {
            this.mExtraParams.putExtra(str, arrayList);
            return this;
        }

        public Builder withParamParcelableList(String str, ArrayList<Parcelable> arrayList) {
            this.mExtraParams.putExtra(str, arrayList);
            return this;
        }

        public Builder withParamStringList(String str, ArrayList<String> arrayList) {
            this.mExtraParams.putExtra(str, arrayList);
            return this;
        }

        public Builder withParam(String str, byte b2) {
            this.mExtraParams.putExtra(str, b2);
            return this;
        }

        public Builder withParam(String str, char c2) {
            this.mExtraParams.putExtra(str, c2);
            return this;
        }

        public Builder withParam(String str, double d2) {
            this.mExtraParams.putExtra(str, d2);
            return this;
        }

        public Builder withParam(String str, float f2) {
            this.mExtraParams.putExtra(str, f2);
            return this;
        }

        public Builder withParam(String str, int i2) {
            this.mExtraParams.putExtra(str, i2);
            return this;
        }

        public Builder withParam(String str, long j2) {
            this.mExtraParams.putExtra(str, j2);
            return this;
        }

        public Builder withParam(String str, Bundle bundle) {
            this.mExtraParams.putExtra(str, bundle);
            return this;
        }
    }

    public boolean hasRequestCode() {
        if (this.mRequestCode != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    protected RouteIntent() {
    }

    /* access modifiers changed from: package-private */
    public void parseUrl() {
        if (!TextUtils.isEmpty(this.mUrl)) {
            Uri parse = Uri.parse(this.mUrl);
            this.mUri = parse;
            this.mExtraIntent.setData(parse);
            this.mScheme = this.mUri.getScheme();
            this.mHost = this.mUri.getHost();
            String path = this.mUri.getPath();
            this.mPath = path;
            if (this.mScheme == null) {
                this.mScheme = "";
            }
            if (this.mHost == null) {
                this.mHost = "";
            }
            if (path == null) {
                this.mPath = "";
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setAnimationBundle(Bundle bundle) {
        this.mAnimationBundle = bundle;
    }

    public void setCallback(OpenResultCallback openResultCallback) {
        this.mCallback = openResultCallback;
    }

    public void setData(Uri uri) {
        this.mData = uri;
    }

    public void setExternalType(boolean z) {
        this.mExternalType = z;
    }

    /* access modifiers changed from: package-private */
    public void setExtra(Intent intent) {
        this.mExtraIntent = intent;
    }

    public void setFragment(Fragment fragment) {
        this.mFragment = fragment;
    }

    public void setNeedIntercept(boolean z) {
        this.needIntercept = z;
    }

    public void setOnActivityResultCallback(OnActivityResultCallback onActivityResultCallback) {
        this.mOnActivityResultCallback = onActivityResultCallback;
    }

    public void setRequestCode(int i2) {
        this.mRequestCode = i2;
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
        if (!this.mUrl.equals(str)) {
            this.mUrl = this.mOriginUrl;
        }
    }

    public void setUrl(String str) {
        if (str != null) {
            if (!Util.isLegalUrl(str)) {
                throw new IllegalArgumentException("url is illegal!!!");
            } else if (!str.equals(this.mUrl)) {
                this.mUrl = str;
                parseUrl();
                sliceParams2Intent(this.mExtraIntent, this.mUrl, true);
            }
        }
    }

    public void setAnimation(int i2, int i3) {
        this.enterAnim = i2;
        this.exitAnim = i3;
    }

    static void sliceParams2Intent(Intent intent, String str, boolean z) {
        Map<String, String> sliceUrlParams;
        if (!(intent == null || (sliceUrlParams = Util.sliceUrlParams(str)) == null || sliceUrlParams.size() == 0)) {
            for (Map.Entry<String, String> entry : sliceUrlParams.entrySet()) {
                if (z) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                } else if (!intent.hasExtra(entry.getKey())) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
