package com.ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f65123a = Keva.getRepo("check_multi_account_repo");

    /* renamed from: b  reason: collision with root package name */
    public static final a f65124b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(40023);
        }

        private a() {
        }

        public static boolean a() {
            if (!b.g().isLogin()) {
                return false;
            }
            return w.f65123a.getBoolean("use_current_user_info", false);
        }

        public static UserPermissionData.UserPermissionInfo b() {
            if (!w.f65123a.contains("user_permission_info")) {
                return null;
            }
            HashMap hashMap = new HashMap();
            a(new JSONObject(w.f65123a.getString("user_permission_info", "")), hashMap);
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            if (!hashMap.containsKey(curUserId)) {
                return null;
            }
            f fVar = new f();
            Object obj = hashMap.get(curUserId);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            return (UserPermissionData.UserPermissionInfo) fVar.a((String) obj, UserPermissionData.UserPermissionInfo.class);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(JSONObject jSONObject, HashMap<String, Object> hashMap) {
            Iterator<String> keys = jSONObject.keys();
            l.b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
        }
    }

    static {
        Covode.recordClassIndex(40022);
    }
}
