package com.squareup.wire.internal;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class Internal {
    static {
        Covode.recordClassIndex(36145);
    }

    public static int countNonNull(Object obj, Object obj2) {
        int i2 = 1;
        int i3 = obj != null ? 1 : 0;
        if (obj2 == null) {
            i2 = 0;
        }
        return i3 + i2;
    }

    public static int countNonNull(Object obj, Object obj2, Object obj3) {
        int i2 = 1;
        int i3 = (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
        if (obj3 == null) {
            i2 = 0;
        }
        return i3 + i2;
    }

    private Internal() {
    }

    public static <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    public static <T> List<T> newMutableList() {
        return new MutableOnWriteList(Collections.emptyList());
    }

    public static void checkElementsNotNull(List<?> list) {
        Objects.requireNonNull(list, "list == null");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == null) {
                throw new NullPointerException("Element at index " + i2 + " is null");
            }
        }
    }

    public static void checkElementsNotNull(Map<?, ?> map) {
        Objects.requireNonNull(map, "map == null");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Objects.requireNonNull(entry.getKey(), "map.containsKey(null)");
            if (entry.getValue() == null) {
                throw new NullPointerException("Value for key " + entry.getKey() + " is null");
            }
        }
    }

    public static IllegalStateException missingRequiredFields(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i2 = 0; i2 < length; i2 += 2) {
            if (objArr[i2] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i2 + 1]);
            }
        }
        throw new IllegalStateException("Required field" + str + " not set:" + ((Object) sb));
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static <T> void redactElements(List<T> list, ProtoAdapter<T> protoAdapter) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.set(i2, protoAdapter.redact(list.get(i2)));
        }
    }

    public static <T> List<T> copyOf(String str, List<T> list) {
        if (list == null) {
            throw new NullPointerException(str + " == null");
        } else if (list == Collections.emptyList() || (list instanceof ImmutableList)) {
            return new MutableOnWriteList(list);
        } else {
            return new ArrayList(list);
        }
    }

    public static <T> void redactElements(Map<?, T> map, ProtoAdapter<T> protoAdapter) {
        for (Map.Entry<?, T> entry : map.entrySet()) {
            entry.setValue(protoAdapter.redact(entry.getValue()));
        }
    }

    public static <K, V> Map<K, V> copyOf(String str, Map<K, V> map) {
        if (map != null) {
            return new LinkedHashMap(map);
        }
        throw new NullPointerException(str + " == null");
    }

    public static <T> List<T> immutableCopyOf(String str, List<T> list) {
        if (list != null) {
            if (list instanceof MutableOnWriteList) {
                list = ((MutableOnWriteList) list).mutableList;
            }
            if (list == Collections.emptyList() || (list instanceof ImmutableList)) {
                return list;
            }
            ImmutableList immutableList = new ImmutableList(list);
            if (!immutableList.contains(null)) {
                return immutableList;
            }
            throw new IllegalArgumentException(str + ".contains(null)");
        }
        throw new NullPointerException(str + " == null");
    }

    public static <K, V> Map<K, V> immutableCopyOf(String str, Map<K, V> map) {
        if (map == null) {
            throw new NullPointerException(str + " == null");
        } else if (map.isEmpty()) {
            return Collections.emptyMap();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (linkedHashMap.containsKey(null)) {
                throw new IllegalArgumentException(str + ".containsKey(null)");
            } else if (!linkedHashMap.containsValue(null)) {
                return Collections.unmodifiableMap(linkedHashMap);
            } else {
                throw new IllegalArgumentException(str + ".containsValue(null)");
            }
        }
    }

    public static int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... objArr) {
        int i2;
        if (obj != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (obj2 != null) {
            i2++;
        }
        if (obj3 != null) {
            i2++;
        }
        if (obj4 != null) {
            i2++;
        }
        for (Object obj5 : objArr) {
            if (obj5 != null) {
                i2++;
            }
        }
        return i2;
    }
}
