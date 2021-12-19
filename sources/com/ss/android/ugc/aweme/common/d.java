package com.ss.android.ugc.aweme.common;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class d implements Serializable {
    public String callerLocalEntry;
    public String mAnchorInfo;
    public String mAnchorSourceType;
    public String mAppName;
    public String mCallerPackage;
    public String mCallerSDKVersion;
    public String mChallengeName;
    public String mClientKey;
    public String mCurrentPage;
    public HashMap<String, Integer> mExtraShareOptions;
    public String mExtras;
    public ArrayList<String> mHashTags;
    public boolean mIsFromDraft;
    public String mMicroAppInfo;
    public boolean mNeedShowDialog;
    public String mOpenPlatformContent;
    public String mOpenPlatformExtra;
    public String mState;
    public int mTargetSceneType;
    public String oldHashTag;

    static {
        Covode.recordClassIndex(47154);
    }

    public String getChallengeName() {
        return this.mChallengeName;
    }

    public d() {
        this.mHashTags = new ArrayList<>();
        this.mNeedShowDialog = true;
        this.mTargetSceneType = 0;
    }

    public Bundle getShareRequestBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
        bundle.putString("_aweme_open_sdk_params_caller_sdk_version", this.mCallerSDKVersion);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
        bundle.putString("_aweme_open_sdk_params_state", this.mState);
        bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.mHashTags);
        bundle.putString("_aweme_open_sdk_params_micro_app_info", this.mMicroAppInfo);
        bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
        bundle.putString("_aweme_open_sdk_params_anchor_info", this.mAnchorInfo);
        bundle.putString("_open_platform_content_json", this.mOpenPlatformContent);
        String str = this.mExtras;
        if (str != null && !str.isEmpty()) {
            Bundle bundle2 = new Bundle();
            try {
                String str2 = (String) new JSONObject(this.mExtras).get("style_id");
                if (!str2.isEmpty()) {
                    bundle2.putString("style_id", str2);
                }
                bundle.putBundle("_bytedance_params_extra", bundle2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return bundle;
    }

    public void setChallengeName(String str) {
        this.mChallengeName = str;
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, wrap(com_ss_android_ugc_aweme_common_BaseShareContext_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public static JSONArray toJSONArray(Object obj) {
        JSONArray jSONArray = new JSONArray();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray.put(wrap(Array.get(obj, i2)));
            }
            return jSONArray;
        }
        throw new JSONException("Not a primitive array: " + obj.getClass());
    }

    public static Object wrap(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return toJSONArray(obj);
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public d(Bundle bundle) {
        this.mHashTags = new ArrayList<>();
        this.mNeedShowDialog = true;
        this.mTargetSceneType = 0;
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.mCallerSDKVersion = bundle.getString("_aweme_open_sdk_params_caller_sdk_version");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
        this.oldHashTag = bundle.getString("_aweme_open_sdk_params_target_scene");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
        this.mHashTags = stringArrayList;
        if (!com.ss.android.ugc.tools.utils.d.a(stringArrayList)) {
            for (int i2 = 0; i2 < this.mHashTags.size(); i2++) {
                ArrayList<String> arrayList = this.mHashTags;
                arrayList.set(i2, arrayList.get(i2).trim());
            }
        } else if (!TextUtils.isEmpty(this.oldHashTag)) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.mHashTags = arrayList2;
            arrayList2.add(this.oldHashTag.trim());
        }
        this.mMicroAppInfo = bundle.getString("_aweme_open_sdk_params_micro_app_info");
        this.mAnchorInfo = bundle.getString("_aweme_open_sdk_params_anchor_info");
        this.mExtras = a(bundle.getBundle("_bytedance_params_extra"));
        this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene");
        this.mOpenPlatformContent = bundle.getString("_open_platform_content_json");
        this.mOpenPlatformExtra = bundle.getString("extra");
        this.mAnchorSourceType = bundle.getString("anchor_source_type");
        this.mExtraShareOptions = (HashMap) bundle.getSerializable("_aweme_open_sdk_extra_share_options");
    }

    public static Object com_ss_android_ugc_aweme_common_BaseShareContext_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
