package com.ss.android.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements Serializable {
    private static final long serialVersionUID = -6027923654002990158L;

    /* renamed from: a  reason: collision with root package name */
    private transient boolean f59496a;
    public volatile boolean mDownloaded;
    protected String mExtraKey;
    public int mHeight;
    public boolean mIsGif;
    public boolean mIsVideo;
    public String mKey;
    public boolean mNeedAlpha;
    public String mOpenUrl;
    public String mUri;
    public String mUrlList;
    public int mWidth;

    static {
        Covode.recordClassIndex(36736);
    }

    public String getExtraKey() {
        return this.mExtraKey;
    }

    public boolean isFixedDisplaySize() {
        return this.f59496a;
    }

    public boolean isValid() {
        if (this.mWidth <= 0 || this.mHeight <= 0 || TextUtils.isEmpty(this.mUri) || TextUtils.isEmpty(this.mUrlList)) {
            return false;
        }
        return true;
    }

    public JSONObject toJsonObj() {
        if (TextUtils.isEmpty(this.mUri)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.mUri);
            jSONObject.put("width", this.mWidth);
            jSONObject.put("height", this.mHeight);
            String str = this.mOpenUrl;
            if (str != null) {
                jSONObject.put("open_url", str);
            }
            if (!TextUtils.isEmpty(this.mUrlList)) {
                try {
                    jSONObject.put("url_list", new JSONArray(this.mUrlList));
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public void setExtraKey(String str) {
        this.mExtraKey = str;
    }

    public static f fromJsonStr(String str) {
        return fromJsonStr(str, true);
    }

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static JSONArray toJsonArray(List<f> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (f fVar : list) {
            JSONObject jsonObj = fVar.toJsonObj();
            if (jsonObj != null) {
                jSONArray.put(jsonObj);
            }
        }
        return jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            if (this.mWidth != fVar.mWidth || this.mHeight != fVar.mHeight || this.mIsGif != fVar.mIsGif || this.mDownloaded != fVar.mDownloaded || this.mIsVideo != fVar.mIsVideo || this.f59496a != fVar.f59496a) {
                return false;
            }
            String str = this.mUri;
            if (str == null ? fVar.mUri != null : !str.equals(fVar.mUri)) {
                return false;
            }
            String str2 = this.mOpenUrl;
            if (str2 == null ? fVar.mOpenUrl != null : !str2.equals(fVar.mOpenUrl)) {
                return false;
            }
            String str3 = this.mUrlList;
            if (str3 == null ? fVar.mUrlList != null : !str3.equals(fVar.mUrlList)) {
                return false;
            }
            String str4 = this.mExtraKey;
            if (str4 == null ? fVar.mExtraKey != null : !str4.equals(fVar.mExtraKey)) {
                return false;
            }
            String str5 = this.mKey;
            String str6 = fVar.mKey;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public f(String str, String str2) {
        this(str, str2, 0, 0, false);
    }

    public static f fromJsonStr(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str), z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<f> parseImageList(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            f fromJson = fromJson(jSONArray.getJSONObject(i2), z);
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static String getUrlFromImageInfo(f fVar, boolean z) {
        String str;
        if (fVar == null) {
            return null;
        }
        if (z) {
            str = fVar.mUri;
        } else {
            str = null;
        }
        List<h> extractImageUrlList = extractImageUrlList(str, fVar.mUrlList);
        if (extractImageUrlList == null || extractImageUrlList.size() <= 0) {
            return null;
        }
        return extractImageUrlList.get(0).f59512a;
    }

    public static ArrayList<f> optImageList(JSONArray jSONArray, boolean z) {
        f fromJson;
        ArrayList<f> arrayList = null;
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (!(optJSONObject == null || (fromJson = fromJson(optJSONObject, z)) == null)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fromJson);
                }
            }
        }
        return arrayList;
    }

    public static f fromJson(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("uri");
        String optString2 = jSONObject.optString("url_list");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        int optInt3 = jSONObject.optInt("r_width", -1);
        int optInt4 = jSONObject.optInt("r_height", -1);
        if (optInt3 != -1) {
            optInt = optInt3;
        }
        if (optInt4 != -1) {
            optInt2 = optInt4;
        }
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        if (z && (optInt <= 0 || optInt2 <= 0)) {
            return null;
        }
        f fVar = new f(optString, optString2, optInt, optInt2);
        fVar.mOpenUrl = jSONObject.optString("open_url", null);
        return fVar;
    }

    public static List<h> extractImageUrlList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                if (length > 3) {
                    length = 3;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String string = jSONObject.getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        h hVar = new h(string);
                        arrayList.add(hVar);
                        JSONObject optJSONObject = jSONObject.optJSONObject("header");
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string2 = optJSONObject.getString(next);
                                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                                    hVar.f59513b.add(new d(next, string2));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (arrayList.isEmpty() && !TextUtils.isEmpty(str) && isHttpUrl(str.toLowerCase())) {
            arrayList.add(new h(str));
        }
        return arrayList;
    }

    public static ArrayList<f> optImageList(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || str == null || str.length() == 0 || !jSONObject.has(str)) {
            return null;
        }
        return optImageList(jSONObject.optJSONArray(str), z);
    }

    public f(String str, String str2, int i2, int i3) {
        this(str, str2, i2, i3, false);
    }

    public f(String str, String str2, int i2, int i3, boolean z) {
        this.mUri = str;
        this.mUrlList = str2;
        this.mKey = com.bytedance.common.utility.d.b(str);
        this.mWidth = i2;
        this.mHeight = i3;
        if (i2 > 0 && i3 > 0) {
            this.f59496a = z;
        }
    }
}
