package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.cy;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f142792a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final List<ev> f142793b;

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f142794c = false;

    private d() {
    }

    static {
        Covode.recordClassIndex(93412);
        ArrayList arrayList = new ArrayList();
        f142793b = arrayList;
        g.a().w();
        arrayList.add(new ev() {
            /* class com.ss.android.ugc.aweme.utils.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93413);
            }

            private static boolean a(String str, String str2) {
                if (TextUtils.equals(str, "im_story")) {
                    return true;
                }
                if (!TextUtils.equals(str, "story") || !TextUtils.equals(str2, "from_chat")) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.utils.ev
            public final boolean a(String str, Map<String, String> map) {
                String str2;
                l.d(str, "");
                String str3 = null;
                if (map != null) {
                    str2 = map.get("shoot_way");
                    str3 = map.get("enter_from");
                } else {
                    str2 = null;
                }
                return a(str2, str3);
            }

            @Override // com.ss.android.ugc.aweme.utils.ev
            public final boolean a(String str, JSONObject jSONObject) {
                String str2;
                l.d(str, "");
                String str3 = null;
                if (jSONObject != null) {
                    str2 = jSONObject.optString("shoot_way", "");
                    str3 = jSONObject.optString("enter_from", "");
                } else {
                    str2 = null;
                }
                return a(str2, str3);
            }
        });
        arrayList.add(new ev() {
            /* class com.ss.android.ugc.aweme.utils.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(93414);
            }

            @Override // com.ss.android.ugc.aweme.utils.ev
            public final boolean a(String str, Map<String, String> map) {
                String str2;
                l.d(str, "");
                if (p.b(str, "tool_performance_", false)) {
                    String str3 = null;
                    if (map != null) {
                        str2 = map.get("tool_performance_");
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2) && map != null) {
                        String str4 = cy.f126416a.f126414b;
                        if (str4 == null) {
                            str4 = "no_creationId";
                        }
                        map.put("creation_id", str4);
                    }
                    if (map != null) {
                        str3 = map.get("shoot_way");
                    }
                    if (TextUtils.isEmpty(str3) && map != null) {
                        String str5 = cy.f126416a.f126413a;
                        if (str5 == null) {
                            str5 = "no_shootWay";
                        }
                        map.put("shoot_way", str5);
                    }
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.utils.ev
            public final boolean a(String str, JSONObject jSONObject) {
                String str2;
                l.d(str, "");
                if (p.b(str, "tool_performance_", false)) {
                    String str3 = null;
                    if (jSONObject != null) {
                        str2 = jSONObject.optString("creation_id", "");
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2) && jSONObject != null) {
                        String str4 = cy.f126416a.f126414b;
                        if (str4 == null) {
                            str4 = "no_creationId";
                        }
                        jSONObject.put("creation_id", str4);
                    }
                    if (jSONObject != null) {
                        str3 = jSONObject.optString("shoot_way", "");
                    }
                    if (TextUtils.isEmpty(str3) && jSONObject != null) {
                        String str5 = cy.f126416a.f126413a;
                        if (str5 == null) {
                            str5 = "no_shootWay";
                        }
                        jSONObject.put("shoot_way", str5);
                    }
                }
                return false;
            }
        });
        arrayList.add(new ev() {
            /* class com.ss.android.ugc.aweme.utils.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(93415);
            }

            @Override // com.ss.android.ugc.aweme.utils.ev
            public final boolean a(String str, Map<String, String> map) {
                l.d(str, "");
                if (l.a((Object) str, (Object) "shoot") && map != null && map.containsKey("is_ui_shoot")) {
                    String str2 = null;
                    if (!(1 == 0 || this == null)) {
                        if (map != null) {
                            str2 = map.get("is_ui_shoot");
                        }
                        return l.a((Object) str2, (Object) "true");
                    }
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.utils.ev
            public final boolean a(String str, JSONObject jSONObject) {
                l.d(str, "");
                if (!l.a((Object) str, (Object) "shoot") || jSONObject == null || !jSONObject.has("is_ui_shoot") || this == null || jSONObject == null || !jSONObject.optBoolean("is_ui_shoot", false)) {
                    return false;
                }
                return true;
            }
        });
    }

    private static String a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        String b2 = dg.a().b(map);
        l.b(b2, "");
        return b2;
    }

    public static void a(String str, Map<String, String> map) {
        l.d(str, "");
        if (b(str, map)) {
            try {
                g.a().I().a(str, map);
                if (f142794c) {
                    a(map);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean b(String str, Map<String, String> map) {
        List<ev> list = f142793b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(str, map)) {
                return false;
            }
        }
        return true;
    }

    public static void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        if (b(str, jSONObject)) {
            try {
                g.a().I().b(str, jSONObject);
                if (!f142794c) {
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean b(String str, JSONObject jSONObject) {
        List<ev> list = f142793b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(str, jSONObject)) {
                return false;
            }
        }
        return true;
    }
}
