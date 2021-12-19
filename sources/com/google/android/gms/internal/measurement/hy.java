package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.gm;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* access modifiers changed from: package-private */
public final class hy {
    static {
        Covode.recordClassIndex(31864);
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    static void a(ht htVar, StringBuilder sb, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean equals;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = htVar.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str9 : treeSet) {
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i2, a(str8), gm.a(method2, htVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i2, a(str7), gm.a(method3, htVar, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(str);
            if (valueOf5.length() != 0) {
                str2 = "set".concat(valueOf5);
            } else {
                str2 = new String("set");
            }
            if (hashMap2.get(str2) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf6.length() != 0) {
                        str6 = "get".concat(valueOf6);
                    } else {
                        str6 = new String("get");
                    }
                    if (hashMap.containsKey(str6)) {
                    }
                }
                String valueOf7 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(str.substring(1));
                if (valueOf8.length() != 0) {
                    str3 = valueOf7.concat(valueOf8);
                } else {
                    str3 = new String(valueOf7);
                }
                String valueOf9 = String.valueOf(str);
                if (valueOf9.length() != 0) {
                    str4 = "get".concat(valueOf9);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                String valueOf10 = String.valueOf(str);
                if (valueOf10.length() != 0) {
                    str5 = "has".concat(valueOf10);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object a2 = gm.a(method4, htVar, new Object[0]);
                    if (method5 == null) {
                        if (a2 instanceof Boolean) {
                            if (!((Boolean) a2).booleanValue()) {
                            }
                        } else if (a2 instanceof Integer) {
                            if (((Integer) a2).intValue() == 0) {
                            }
                        } else if (a2 instanceof Float) {
                            if (((Float) a2).floatValue() == 0.0f) {
                            }
                        } else if (!(a2 instanceof Double)) {
                            if (a2 instanceof String) {
                                equals = a2.equals("");
                            } else if (a2 instanceof fe) {
                                equals = a2.equals(fe.zza);
                            } else if (a2 instanceof ht) {
                                if (a2 == ((ht) a2).H_()) {
                                }
                            } else if ((a2 instanceof Enum) && ((Enum) a2).ordinal() == 0) {
                            }
                            if (equals) {
                            }
                        } else if (((Double) a2).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) gm.a(method5, htVar, new Object[0])).booleanValue()) {
                    }
                    a(sb, i2, a(str3), a2);
                }
            }
        }
        if (htVar instanceof gm.b) {
            Iterator<Map.Entry<Object, Object>> b2 = ((gm.b) htVar).zzc.b();
            if (b2.hasNext()) {
                b2.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        gm gmVar = (gm) htVar;
        if (gmVar.zzb != null) {
            gmVar.zzb.a(sb, i2);
        }
    }

    static final void a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i2, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Object obj3 : ((Map) obj).entrySet()) {
                a(sb, i2, str, obj3);
            }
        } else {
            sb.append('\n');
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"").append(ja.a(fe.zza((String) obj))).append('\"');
            } else if (obj instanceof fe) {
                sb.append(": \"").append(ja.a((fe) obj)).append('\"');
            } else if (obj instanceof gm) {
                sb.append(" {");
                a((ev) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i5 = i2 + 2;
                a(sb, i5, "key", entry.getKey());
                a(sb, i5, "value", entry.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ").append(obj.toString());
            }
        }
    }
}
