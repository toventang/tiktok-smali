package com.ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.agegate.util.h;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.login.MusLoginManager;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.account.m.d;
import com.ss.android.ugc.aweme.account.model.CachedUserAgeInfo;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class u {
    static {
        Covode.recordClassIndex(40285);
    }

    public static CachedUserAgeInfo a() {
        try {
            HashMap hashMap = (HashMap) new f().a(q.b(), new a<HashMap<String, CachedUserAgeInfo>>() {
                /* class com.ss.android.ugc.aweme.account.util.u.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40286);
                }
            }.type);
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), cj.b())) {
                        return (CachedUserAgeInfo) entry.getValue();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    private static int a(AgeGateResponse ageGateResponse) {
        if (ageGateResponse.getAgeGatePostAction() != 0) {
            return ageGateResponse.getAgeGatePostAction();
        }
        return ageGateResponse.getRegisterAgeGatePostAction();
    }

    public static String a(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    public static i<Bundle> c(Bundle bundle) {
        return i.b(new w(bundle), i.f4824a).a(new x(bundle), i.f4826c, null);
    }

    public static i<com.ss.android.ugc.aweme.account.login.b.a> b(Bundle bundle) {
        boolean z = bundle.getBoolean("age_gate_block", false);
        CachedUserAgeInfo a2 = a();
        if (a2 != null) {
            return a(a2.getBirthday(), true, z);
        }
        if (h.f62844c) {
            return a("", false, z);
        }
        return i.b(v.f65508a, i.f4824a);
    }

    public static i<com.ss.android.ugc.aweme.account.login.b.a> a(Bundle bundle) {
        AgeGateResponse ageGateResponse;
        if (bundle.getSerializable("age_gate_response") != null) {
            ageGateResponse = (AgeGateResponse) bundle.getSerializable("age_gate_response");
        } else {
            ageGateResponse = null;
        }
        boolean z = bundle.getBoolean("age_gate_block", false);
        int i2 = 1;
        if (ageGateResponse != null) {
            if (!(ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0)) {
                i2 = 2;
            }
            bundle.putInt("user_mode", i2);
            bundle.putInt("age_gate_post_action", a(ageGateResponse));
        } else if (b.g().isNewUser() && z) {
            bundle.putInt("age_gate_post_action", 1);
            bundle.putInt("user_mode", 2);
        }
        return a(h.f62842a, false, z);
    }

    static final /* synthetic */ User d(Bundle bundle) {
        try {
            User queryUser = cj.f71084b.e().queryUser(null, true);
            d.a(true, 0, "", bundle);
            if (queryUser.getAgeGatePostAction() == 0) {
                int i2 = bundle.getInt("age_gate_post_action", -1);
                if (i2 != -1) {
                    queryUser.setAgeGatePostAction(i2);
                    queryUser.setAgeGateAction(0);
                    q.a(queryUser.getUid(), i2);
                    h.a(queryUser.getUid(), i2);
                } else {
                    int a2 = h.a(queryUser.getUid());
                    if (a2 != -1) {
                        queryUser.setAgeGatePostAction(a2);
                        queryUser.setAgeGateAction(0);
                    }
                }
            }
            if (queryUser.getUserMode() == 0) {
                SharedPreferences a3 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.a.f62426a, "aweme_user", 0);
                int i3 = bundle.getInt("user_mode", -1);
                if (i3 == 2 || i3 == 1) {
                    queryUser.setUserMode(i3);
                    a3.edit().putInt("ftc_user_mode_prefix_" + queryUser.getUid(), i3).commit();
                } else {
                    int i4 = a3.getInt("ftc_user_mode_prefix_" + queryUser.getUid(), 0);
                    if (i4 == 2 || i4 == 1) {
                        queryUser.setUserMode(i4);
                    }
                }
            }
            q.a(queryUser);
            return queryUser;
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
            d.a(false, e2.getErrorCode(), e2.getErrorMsg(), bundle);
            throw e2;
        }
    }

    private static void a(String str) {
        try {
            HashMap hashMap = (HashMap) new f().a(q.b(), new a<HashMap<String, CachedUserAgeInfo>>() {
                /* class com.ss.android.ugc.aweme.account.util.u.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(40288);
                }
            }.type);
            if (hashMap != null) {
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), str)) {
                            hashMap.remove(entry.getKey());
                            break;
                        }
                    } else {
                        break;
                    }
                }
                q.b(new f().b(hashMap));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static i<com.ss.android.ugc.aweme.account.login.b.a> a(String str, boolean z, boolean z2) {
        MusLoginManager musLoginManager = new MusLoginManager();
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("birthday", str);
        }
        if (hashMap.containsKey("birthday")) {
            return musLoginManager.a(hashMap).b(new y(str, z), i.f4824a);
        }
        if (!b.g().isNewUser() || !z2 || com.ss.android.sdk.a.b.f60131a.a("facebook") || com.ss.android.sdk.a.b.f60131a.a("google")) {
            return i.b(aa.f65476a, i.f4824a);
        }
        hashMap.put("in_device_restrict", String.valueOf(z2));
        return musLoginManager.a(hashMap).b(new z(z), i.f4824a);
    }

    static final /* synthetic */ i a(String str, boolean z, i iVar) {
        int i2;
        String str2;
        if (iVar.c() || iVar.b() || !(((com.ss.android.ugc.aweme.account.login.b.a) iVar.d()).f63384a == 0 || ((com.ss.android.ugc.aweme.account.login.b.a) iVar.d()).f63384a == 5)) {
            String b2 = cj.b();
            CachedUserAgeInfo cachedUserAgeInfo = new CachedUserAgeInfo(str);
            String b3 = q.b();
            HashMap hashMap = null;
            if (TextUtils.isEmpty(b3)) {
                hashMap = new HashMap();
                hashMap.put(b2, cachedUserAgeInfo);
            } else {
                try {
                    hashMap = (HashMap) new f().a(b3, new a<HashMap<String, CachedUserAgeInfo>>() {
                        /* class com.ss.android.ugc.aweme.account.util.u.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(40287);
                        }
                    }.type);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (hashMap != null) {
                    hashMap.put(b2, cachedUserAgeInfo);
                }
            }
            q.b(new f().b(hashMap));
            c a2 = new c().a(StringSet.type, "/aweme/v3/user/info/sync/").a("error_message", Integer.valueOf(((com.ss.android.ugc.aweme.account.login.b.a) iVar.d()).f63384a));
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            c a3 = a2.a("status", Integer.valueOf(i2));
            if (((com.ss.android.ugc.aweme.account.login.b.a) iVar.d()).f63386c != null) {
                str2 = ((com.ss.android.ugc.aweme.account.login.b.a) iVar.d()).f63386c.getImprId();
            } else {
                str2 = "";
            }
            com.ss.android.ugc.aweme.account.m.b.a("compliance_api_status", "", a3.a("tns_logId", str2).a());
            h.a();
        } else if (iVar.a() && (((com.ss.android.ugc.aweme.account.login.b.a) iVar.d()).f63384a == 0 || ((com.ss.android.ugc.aweme.account.login.b.a) iVar.d()).f63384a == 5)) {
            if (z) {
                a(cj.b());
            } else {
                h.a();
            }
            com.ss.android.ugc.aweme.account.m.b.a("compliance_api_status", "", new c().a(StringSet.type, "/aweme/v3/user/info/sync/").a("status", (Integer) 0).a());
        }
        return i.b(ac.f65478a, i.f4824a);
    }
}
