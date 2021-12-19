package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.b.b;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.account.login.w;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.user.c;
import h.a.n;
import h.f.b.l;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f116474a = new x();

    private x() {
    }

    static {
        Covode.recordClassIndex(75180);
    }

    public static JSONArray a(List<c> list) {
        String permissions;
        String str;
        l.d(list, "");
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            c cVar = list.get(i2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("user_id", cVar.f142345a);
            List<BaseLoginMethod> b2 = q.b(cVar.f142345a);
            if (!b2.isEmpty()) {
                jSONObject.put("login_platform", com.ss.android.ugc.aweme.account.login.rememberaccount.a.a((BaseLoginMethod) n.a((Iterable) b2, (Comparator) new a()).get(0)));
            }
            i2++;
            jSONObject.put("order", i2);
            UserPermissionData.UserPermissionInfo b3 = w.a.b();
            if (b3 == null || (permissions = b3.getPermissions()) == null || permissions.length() == 0) {
                jSONObject.put("age_gate_region", "");
                jSONObject.put("has_permission", "");
            } else {
                Iterator<Map.Entry<String, Boolean>> it = b3.permissionsMap().entrySet().iterator();
                while (it.hasNext()) {
                    it.next();
                    String userPermissionRequestType = UserPermissionData.UserPermissionRequestType.DEFAULT_TYPE.toString();
                    if (b3.permissionsMap().containsKey(userPermissionRequestType)) {
                        if (l.a((Object) b3.permissionsMap().get(userPermissionRequestType), (Object) true)) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        jSONObject.put("has_permission", str);
                    }
                }
                jSONObject.put("age_gate_region", b3.getAgeGateRegion());
            }
            jSONObject.put("current_user_store_region", b.f44541b);
            jSONArray.put(jSONObject.toString());
        }
        return jSONArray;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(75181);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(t2.getLastActiveTime(), t.getLastActiveTime());
        }
    }
}
