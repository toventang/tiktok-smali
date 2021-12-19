package com.facebook.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, a> f48598a;

    public interface a {
        static {
            Covode.recordClassIndex(29311);
        }

        void a(Bundle bundle, String str, Object obj);
    }

    static {
        Covode.recordClassIndex(29303);
        HashMap hashMap = new HashMap();
        f48598a = hashMap;
        hashMap.put(Boolean.class, new a() {
            /* class com.facebook.internal.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29304);
            }

            @Override // com.facebook.internal.d.a
            public final void a(Bundle bundle, String str, Object obj) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        });
        hashMap.put(Integer.class, new a() {
            /* class com.facebook.internal.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29305);
            }

            @Override // com.facebook.internal.d.a
            public final void a(Bundle bundle, String str, Object obj) {
                bundle.putInt(str, ((Integer) obj).intValue());
            }
        });
        hashMap.put(Long.class, new a() {
            /* class com.facebook.internal.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(29306);
            }

            @Override // com.facebook.internal.d.a
            public final void a(Bundle bundle, String str, Object obj) {
                bundle.putLong(str, ((Long) obj).longValue());
            }
        });
        hashMap.put(Double.class, new a() {
            /* class com.facebook.internal.d.AnonymousClass4 */

            static {
                Covode.recordClassIndex(29307);
            }

            @Override // com.facebook.internal.d.a
            public final void a(Bundle bundle, String str, Object obj) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }
        });
        hashMap.put(String.class, new a() {
            /* class com.facebook.internal.d.AnonymousClass5 */

            static {
                Covode.recordClassIndex(29308);
            }

            @Override // com.facebook.internal.d.a
            public final void a(Bundle bundle, String str, Object obj) {
                bundle.putString(str, (String) obj);
            }
        });
        hashMap.put(String[].class, new a() {
            /* class com.facebook.internal.d.AnonymousClass6 */

            static {
                Covode.recordClassIndex(29309);
            }

            @Override // com.facebook.internal.d.a
            public final void a(Bundle bundle, String str, Object obj) {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        hashMap.put(JSONArray.class, new a() {
            /* class com.facebook.internal.d.AnonymousClass7 */

            static {
                Covode.recordClassIndex(29310);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.os.Bundle */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.internal.d.a
            public final void a(Bundle bundle, String str, Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    Object obj2 = jSONArray.get(i2);
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                    } else {
                        throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }
        });
    }

    public static Bundle a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    a aVar = f48598a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }
}
