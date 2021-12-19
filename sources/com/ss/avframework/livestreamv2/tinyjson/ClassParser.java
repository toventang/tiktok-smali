package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.ReflectType;
import h.a.i;
import h.f.b.l;
import h.o;
import h.w;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ClassParser {
    public static final ClassParser INSTANCE = new ClassParser();
    private static final Map<Class<? extends Object>, TreeNode<ReflectProperty>> clazzParseCache = new LinkedHashMap();

    private ClassParser() {
    }

    static {
        Covode.recordClassIndex(100472);
    }

    public final TreeNode<ReflectProperty> parseAsTree(Class<? extends Object> cls) {
        l.c(cls, "");
        TreeNode<ReflectProperty> treeNode = clazzParseCache.get(cls);
        if (treeNode != null) {
            return treeNode;
        }
        Serialized serialized = (Serialized) cls.getAnnotation(Serialized.class);
        Field[] declaredFields = cls.getDeclaredFields();
        l.a((Object) declaredFields, "");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Serialized.class)) {
                arrayList.add(field);
            }
        }
        TreeNode<ReflectProperty> treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.Struct(cls, null)), null, null, 4, null);
        parseRecursively(treeNode2, arrayList);
        clazzParseCache.put(cls, treeNode2);
        return treeNode2;
    }

    private final void parseRecursively(TreeNode<ReflectProperty> treeNode, List<Field> list) {
        TreeNode<ReflectProperty> treeNode2;
        for (Field field : list) {
            field.setAccessible(true);
            Serialized serialized = (Serialized) field.getAnnotation(Serialized.class);
            Class<?> type = field.getType();
            l.a((Object) type, "");
            if (DefinitionsKt.isDirectType(type)) {
                treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.DirectType(type, field)), treeNode, null, 4, null);
            } else if (List.class.isAssignableFrom(type)) {
                Type genericType = field.getGenericType();
                if (genericType != null) {
                    Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                    l.a((Object) actualTypeArguments, "");
                    Type type2 = (Type) i.c(actualTypeArguments);
                    l.a((Object) type2, "");
                    treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.List(type2, field)), treeNode, null, 4, null);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (Map.class.isAssignableFrom(type)) {
                Type genericType2 = field.getGenericType();
                if (genericType2 != null) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) genericType2).getActualTypeArguments();
                    l.a((Object) actualTypeArguments2, "");
                    Object e2 = i.e(actualTypeArguments2);
                    l.a(e2, "");
                    treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.Map((Type) e2, field)), treeNode, null, 4, null);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (!type.isEnum()) {
                Field[] declaredFields = type.getDeclaredFields();
                l.a((Object) declaredFields, "");
                ArrayList arrayList = new ArrayList();
                for (Field field2 : declaredFields) {
                    if (field2.isAnnotationPresent(Serialized.class)) {
                        arrayList.add(field2);
                    }
                }
                treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.Struct(type, field)), treeNode, null, 4, null);
                parseRecursively(treeNode2, arrayList);
            } else {
                throw new o("Enum is to be implemented, use Int instead.");
            }
            treeNode.getChildren().add(treeNode2);
        }
    }
}
