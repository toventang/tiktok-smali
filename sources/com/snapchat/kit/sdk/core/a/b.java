package com.snapchat.kit.sdk.core.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.a;
import com.google.gson.a.c;
import com.google.gson.f;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import java.io.Serializable;
import java.util.Objects;

public class b implements Serializable {
    @a
    @c(a = "mClientId")
    private String mClientId;
    @a
    @c(a = "mCodeChallenge")
    private String mCodeChallenge;
    @a
    @c(a = "mCodeChallengeMethod")
    private String mCodeChallengeMethod;
    @a
    @c(a = "mCodeVerifier")
    private String mCodeVerifier;
    @a
    @c(a = "mFeatures")
    private String mFeatures;
    @a
    @c(a = "mIsForFirebaseAuthentication")
    private boolean mIsForFirebaseAuthentication;
    @a
    @c(a = "mKitPluginType")
    private KitPluginType mKitPluginType;
    @a
    @c(a = "mRedirectUri")
    private String mRedirectUri;
    @a
    @c(a = "mResponseType")
    private String mResponseType;
    @a
    @c(a = "mScope")
    private String mScope;
    @a
    @c(a = "mSdkIsFromReactNativePlugin")
    private boolean mSdkIsFromReactNativePlugin;
    @a
    @c(a = "mState")
    private String mState;

    static {
        Covode.recordClassIndex(35566);
    }

    public String getCodeVerifier() {
        return this.mCodeVerifier;
    }

    public String getFeatures() {
        return this.mFeatures;
    }

    public boolean getIsForFirebaseAuthentication() {
        return this.mIsForFirebaseAuthentication;
    }

    public String getRedirectUri() {
        return this.mRedirectUri;
    }

    public String getResponseType() {
        return this.mResponseType;
    }

    public boolean getSdkIsFromReactNativePlugin() {
        return this.mSdkIsFromReactNativePlugin;
    }

    public String getState() {
        return this.mState;
    }

    public String toString() {
        return toJson();
    }

    public String toJson() {
        return new f().b(this);
    }

    public int hashCode() {
        return Objects.hash(this.mResponseType, this.mClientId, this.mScope, this.mRedirectUri, this.mState, this.mCodeVerifier, this.mCodeChallengeMethod, this.mCodeChallenge, this.mFeatures, this.mKitPluginType, Boolean.valueOf(this.mSdkIsFromReactNativePlugin), Boolean.valueOf(this.mIsForFirebaseAuthentication));
    }

    public b withClientId(String str) {
        this.mClientId = str;
        return this;
    }

    public b withCodeChallenge(String str) {
        this.mCodeChallenge = str;
        return this;
    }

    public b withCodeChallengeMethod(String str) {
        this.mCodeChallengeMethod = str;
        return this;
    }

    public b withCodeVerifier(String str) {
        this.mCodeVerifier = str;
        return this;
    }

    public b withFeatures(String str) {
        this.mFeatures = str;
        return this;
    }

    public b withIsForFirebaseAuthentication(boolean z) {
        this.mIsForFirebaseAuthentication = z;
        return this;
    }

    public b withKitPluginType(KitPluginType kitPluginType) {
        this.mKitPluginType = kitPluginType;
        return this;
    }

    public b withRedirectUri(String str) {
        this.mRedirectUri = str;
        return this;
    }

    public b withResponseType(String str) {
        this.mResponseType = str;
        return this;
    }

    public b withScope(String str) {
        this.mScope = str;
        return this;
    }

    public b withSdkIsFromReactNativePlugin(boolean z) {
        this.mSdkIsFromReactNativePlugin = z;
        return this;
    }

    public b withState(String str) {
        this.mState = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(this.mResponseType, bVar.mResponseType) || !Objects.equals(this.mClientId, bVar.mClientId) || !Objects.equals(this.mScope, bVar.mScope) || !Objects.equals(this.mRedirectUri, bVar.mRedirectUri) || !Objects.equals(this.mState, bVar.mState) || !Objects.equals(this.mCodeVerifier, bVar.mCodeVerifier) || !Objects.equals(this.mCodeChallengeMethod, bVar.mCodeChallengeMethod) || !Objects.equals(this.mCodeChallenge, bVar.mCodeChallenge) || !Objects.equals(this.mFeatures, bVar.mFeatures) || !Objects.equals(this.mKitPluginType, bVar.mKitPluginType) || !Objects.equals(Boolean.valueOf(this.mSdkIsFromReactNativePlugin), Boolean.valueOf(bVar.mSdkIsFromReactNativePlugin)) || !Objects.equals(Boolean.valueOf(this.mIsForFirebaseAuthentication), Boolean.valueOf(bVar.mIsForFirebaseAuthentication))) {
            return false;
        }
        return true;
    }

    public Uri toUri(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            str = "https://accounts.snapchat.com/accounts";
        }
        Uri.Builder appendQueryParameter = Uri.parse(str + str2).buildUpon().appendQueryParameter("response_type", this.mResponseType).appendQueryParameter("client_id", this.mClientId).appendQueryParameter("redirect_uri", this.mRedirectUri).appendQueryParameter("scope", this.mScope).appendQueryParameter("state", this.mState).appendQueryParameter("code_challenge_method", this.mCodeChallengeMethod).appendQueryParameter("code_challenge", this.mCodeChallenge).appendQueryParameter("sdk_is_from_react_native_plugin", String.valueOf(this.mSdkIsFromReactNativePlugin)).appendQueryParameter("is_for_firebase_authentication", String.valueOf(this.mIsForFirebaseAuthentication));
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("package_name", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter.appendQueryParameter("source", str4);
        }
        if (!TextUtils.isEmpty(this.mFeatures)) {
            appendQueryParameter.appendQueryParameter("features", this.mFeatures);
        }
        appendQueryParameter.appendQueryParameter("kit_version", "1.12.0");
        appendQueryParameter.appendQueryParameter("link", this.mClientId);
        if (this.mKitPluginType != KitPluginType.NO_PLUGIN) {
            appendQueryParameter.appendQueryParameter("kitPluginType", this.mKitPluginType.toString());
        }
        return appendQueryParameter.build();
    }
}
