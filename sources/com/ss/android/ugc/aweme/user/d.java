package com.ss.android.ugc.aweme.user;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.dr;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f142356a = "https://api-va.tiktokv.com/aweme/v1/commit/user/";

    /* renamed from: b  reason: collision with root package name */
    public static final String f142357b = "https://api-va.tiktokv.com/passport/login_name/update/";

    static {
        Covode.recordClassIndex(93109);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00dd, code lost:
        if (r4 != null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.profile.UserResponse a(java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.d.a(java.util.Map):com.ss.android.ugc.aweme.profile.UserResponse");
    }

    public static User a(String str, boolean z) {
        String str2;
        g gVar = new g(str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        gVar.a("is_after_login", str2);
        return ((UserResponse) dr.f83127b.a().a(dr.f83127b.a(gVar.toString()), UserResponse.class)).getUser();
    }

    private static void a(User user, User user2, Set<String> set) {
        if (!(user == null || TextUtils.isEmpty(user.getUid()))) {
            Field[] declaredFields = User.class.getDeclaredFields();
            for (Field field : declaredFields) {
                c cVar = (c) field.getAnnotation(c.class);
                if (cVar != null && !set.contains(cVar.a())) {
                    try {
                        field.setAccessible(true);
                        field.set(user2, field.get(user));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    private static boolean a(User user, Map<String, String> map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!map.containsKey("login_name")) {
                return false;
            }
            if (TextUtils.equals(jSONObject.optString("message").toLowerCase(), "success")) {
                map.put("unique_id", map.get("login_name"));
                map.remove("login_name");
                user.setUniqueId(jSONObject.getJSONObject("data").getString("login_name"));
                user.setHandleModified(new Date().getTime() / 1000);
                return true;
            } else if (!TextUtils.equals(jSONObject.optString("message").toLowerCase(), "error")) {
                return false;
            } else {
                throw new a(jSONObject.getJSONObject("data").optInt("error_code")).setErrorMsg(jSONObject.getJSONObject("data").optString("description"));
            }
        } catch (JSONException unused) {
            return false;
        }
    }
}
