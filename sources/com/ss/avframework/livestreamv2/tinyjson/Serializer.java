package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.ReflectType;
import h.a.ag;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.v;
import h.w;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class Serializer {
    public static final Serializer INSTANCE = new Serializer();

    private Serializer() {
    }

    static {
        Covode.recordClassIndex(100483);
    }

    private final JSONArray asJSONArray(List<? extends Object> list, Type type) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            Object serializeSubItem = serializeSubItem(type, obj);
            if (serializeSubItem != null) {
                jSONArray.put(serializeSubItem);
            }
        }
        return jSONArray;
    }

    private final JSONObject asJSONObject(Map<String, ? extends Object> map, Type type) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object serializeSubItem = serializeSubItem(type, entry.getValue());
            if (serializeSubItem != null) {
                jSONObject.put(key, serializeSubItem);
            }
        }
        return jSONObject;
    }

    private final <T> Object getValueFromObject(TreeNode<ReflectProperty> treeNode, T t) {
        TreeNode<ReflectProperty> parent = treeNode.getParent();
        if (parent == null) {
            return t;
        }
        ArrayList arrayList = new ArrayList();
        while (parent != null && parent.getParent() != null) {
            Field field = parent.getData().getReflectType().getField();
            if (field != null) {
                arrayList.add(field);
            }
            parent = parent.getParent();
        }
        for (Field field2 : n.e((List) arrayList)) {
            t = (T) field2.get(t);
            if (t == null) {
                return null;
            }
        }
        Field field3 = treeNode.getData().getReflectType().getField();
        if (field3 != null) {
            return field3.get(t);
        }
        return null;
    }

    private final Object serializeSubItem(Type type, Object obj) {
        if (type instanceof Class) {
            Class<? extends Object> cls = (Class) type;
            if (DefinitionsKt.isDirectType(cls)) {
                return obj;
            }
            return toJson(obj, cls);
        }
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            l.a((Object) actualTypeArguments, "");
            Type type2 = (Type) i.e(actualTypeArguments);
            if (obj instanceof List) {
                if (obj != null) {
                    l.a((Object) type2, "");
                    return asJSONArray((List) obj, type2);
                }
                throw new w("null cannot be cast to non-null type");
            } else if (obj instanceof Map) {
                if (obj != null) {
                    l.a((Object) type2, "");
                    return asJSONObject((Map) obj, type2);
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    public final <T> JSONObject toJson(T t, Class<? extends Object> cls) {
        JSONObject jSONObject;
        String str;
        JSONObject asJSONObject;
        JSONArray asJSONArray;
        l.c(t, "");
        l.c(cls, "");
        TreeNode<ReflectProperty> parseAsTree = ClassParser.INSTANCE.parseAsTree(cls);
        Map b2 = ag.b(v.a(parseAsTree, new JSONObject()));
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(parseAsTree);
        while (!arrayDeque.isEmpty()) {
            int size = arrayDeque.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    TreeNode<ReflectProperty> treeNode = (TreeNode) arrayDeque.removeFirst();
                    Iterator<T> it = treeNode.getChildren().iterator();
                    while (it.hasNext()) {
                        arrayDeque.addLast(it.next());
                    }
                    if (treeNode.getParent() == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = (JSONObject) b2.get(treeNode.getParent());
                    }
                    Serialized serialized = treeNode.getData().getSerialized();
                    if (serialized != null) {
                        str = serialized.name();
                    } else {
                        str = null;
                    }
                    ReflectType reflectType = treeNode.getData().getReflectType();
                    if (reflectType instanceof ReflectType.DirectType) {
                        Serializer serializer = INSTANCE;
                        l.a((Object) treeNode, "");
                        Object valueFromObject = serializer.getValueFromObject(treeNode, t);
                        if (!(jSONObject == null || valueFromObject == null || str == null)) {
                            jSONObject.put(str, valueFromObject);
                        }
                    } else if (reflectType instanceof ReflectType.Struct) {
                        Object obj = b2.get(treeNode);
                        if (obj == null) {
                            obj = new JSONObject();
                            l.a((Object) treeNode, "");
                            b2.put(treeNode, obj);
                        }
                        if (!(jSONObject == null || str == null)) {
                            jSONObject.put(str, obj);
                        }
                    } else if (reflectType instanceof ReflectType.List) {
                        Serializer serializer2 = INSTANCE;
                        l.a((Object) treeNode, "");
                        Object valueFromObject2 = serializer2.getValueFromObject(treeNode, t);
                        if (!(valueFromObject2 instanceof List)) {
                            valueFromObject2 = null;
                        }
                        List<? extends Object> list = (List) valueFromObject2;
                        if (!(list == null || (asJSONArray = serializer2.asJSONArray(list, ((ReflectType.List) reflectType).getMemberType())) == null || jSONObject == null || str == null)) {
                            jSONObject.put(str, asJSONArray);
                        }
                    } else if (reflectType instanceof ReflectType.Map) {
                        Serializer serializer3 = INSTANCE;
                        l.a((Object) treeNode, "");
                        Object valueFromObject3 = serializer3.getValueFromObject(treeNode, t);
                        if (!(valueFromObject3 instanceof Map)) {
                            valueFromObject3 = null;
                        }
                        Map<String, ? extends Object> map = (Map) valueFromObject3;
                        if (!(map == null || (asJSONObject = serializer3.asJSONObject(map, ((ReflectType.Map) reflectType).getValueType())) == null || jSONObject == null || str == null)) {
                            jSONObject.put(str, asJSONObject);
                        }
                    } else {
                        throw new h.n();
                    }
                    i2++;
                }
            }
        }
        Object obj2 = b2.get(parseAsTree);
        if (obj2 != null) {
            return (JSONObject) obj2;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
