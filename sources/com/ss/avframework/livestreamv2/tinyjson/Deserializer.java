package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.a.n;
import h.f.b.l;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class Deserializer {
    public static final Deserializer INSTANCE = new Deserializer();

    private Deserializer() {
    }

    static {
        Covode.recordClassIndex(100474);
    }

    private final List<?> asList(JSONArray jSONArray, Type type) {
        Object deserializeSubItem;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (!(obj == null || (deserializeSubItem = deserializeSubItem(type, obj)) == null)) {
                arrayList.add(deserializeSubItem);
            }
        }
        return arrayList;
    }

    private final Map<String, ?> asMap(JSONObject jSONObject, Type type) {
        Object deserializeSubItem;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (!(opt == null || (deserializeSubItem = deserializeSubItem(type, opt)) == null)) {
                l.a((Object) next, "");
                hashMap.put(next, deserializeSubItem);
            }
        }
        return hashMap;
    }

    private final Object deserializeSubItem(Type type, Object obj) {
        if (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                l.a((Object) actualTypeArguments, "");
                Type type2 = (Type) i.e(actualTypeArguments);
                if (obj instanceof JSONObject) {
                    l.a((Object) type2, "");
                    return asMap((JSONObject) obj, type2);
                } else if (obj instanceof JSONArray) {
                    l.a((Object) type2, "");
                    return asList((JSONArray) obj, type2);
                }
            }
            return null;
        } else if (obj instanceof Number) {
            return DefinitionsKt.smartCastAs(obj, (Class) type);
        } else {
            if (obj instanceof JSONObject) {
                return fromJson$default(this, (JSONObject) obj, (Class) type, null, 4, null);
            }
            return obj;
        }
    }

    private final Object getDataFromJson(TreeNode<ReflectProperty> treeNode, JSONObject jSONObject, Class<? extends Object> cls) {
        String str;
        String name;
        TreeNode<ReflectProperty> parent = treeNode.getParent();
        if (parent == null) {
            return jSONObject;
        }
        ArrayList arrayList = new ArrayList();
        while (parent != null && parent.getParent() != null) {
            Serialized serialized = parent.getData().getSerialized();
            if (!(serialized == null || (name = serialized.name()) == null)) {
                arrayList.add(name);
            }
            parent = parent.getParent();
        }
        for (String str2 : n.e((List) arrayList)) {
            jSONObject = jSONObject.optJSONObject(str2);
            if (jSONObject == null) {
                return null;
            }
        }
        Serialized serialized2 = treeNode.getData().getSerialized();
        if (serialized2 == null || (str = serialized2.name()) == null) {
            str = "";
        }
        Object opt = jSONObject.opt(str);
        if ((opt instanceof Number) || (opt instanceof String) || (opt instanceof Boolean) || (opt instanceof JSONObject)) {
            return DefinitionsKt.smartCastAs(opt, cls);
        }
        return opt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        if (r13 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T fromJson(org.json.JSONObject r15, java.lang.Class<T> r16, T r17) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.tinyjson.Deserializer.fromJson(org.json.JSONObject, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    public static /* synthetic */ Object fromJson$default(Deserializer deserializer, JSONObject jSONObject, Class cls, Object obj, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return deserializer.fromJson(jSONObject, cls, obj);
    }
}
