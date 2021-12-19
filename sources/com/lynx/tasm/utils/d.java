package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.d.a;

public class d {
    static {
        Covode.recordClassIndex(35473);
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"")) {
            int indexOf = str.indexOf("\"", 1);
            if (indexOf == -1) {
                return null;
            }
            return str.substring(1, indexOf);
        } else if (!str.startsWith("'")) {
            return str;
        } else {
            int indexOf2 = str.indexOf("'", 1);
            if (indexOf2 == -1) {
                return null;
            }
            return str.substring(1, indexOf2);
        }
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        int i2 = 0;
        int length = str.length();
        if (str.startsWith("'") || str.startsWith("\"")) {
            i2 = 1;
        }
        if (str.endsWith("'") || str.endsWith("\"")) {
            length--;
        }
        if (i2 > length) {
            return null;
        }
        return str.substring(i2, length);
    }

    public static a a(j jVar, String str) {
        ReadableMap map;
        androidx.c.a<String, Object> arrayMap;
        String a2 = a(str);
        if (a2 == null || jVar.f55896d == null || !jVar.f55896d.hasKey(a2) || (map = jVar.f55896d.getMap(a2)) == null || (arrayMap = map.toArrayMap()) == null) {
            return null;
        }
        a aVar = new a();
        aVar.f56555a = a2;
        for (Object obj : arrayMap.values()) {
            if (obj instanceof String) {
                String str2 = (String) obj;
                int i2 = 0;
                int length = str2.length();
                while (i2 < length) {
                    int indexOf = str2.indexOf("url(", i2);
                    int indexOf2 = str2.indexOf("local(", i2);
                    if (indexOf == -1 && indexOf2 == -1) {
                        break;
                    }
                    if (indexOf != -1) {
                        if (indexOf2 == -1) {
                            if (indexOf != -1) {
                                int indexOf3 = str2.indexOf(")", indexOf);
                                if (indexOf3 == -1) {
                                    break;
                                }
                                i2 = indexOf3 + 2;
                                String b2 = b(str2.substring(indexOf + 4, indexOf3));
                                if (b2 == null) {
                                    break;
                                }
                                aVar.a(b2);
                            }
                        } else if (indexOf >= indexOf2) {
                            int indexOf4 = str2.indexOf(")", indexOf2);
                            if (indexOf4 == -1) {
                                break;
                            }
                            i2 = indexOf4 + 2;
                            String b3 = b(str2.substring(indexOf2 + 6, indexOf4));
                            if (b3 == null) {
                                break;
                            }
                            aVar.b(b3);
                        } else {
                            int indexOf5 = str2.indexOf(")", indexOf);
                            if (indexOf5 == -1) {
                                break;
                            }
                            i2 = indexOf5 + 2;
                            String b4 = b(str2.substring(indexOf + 4, indexOf5));
                            if (b4 == null) {
                                break;
                            }
                            aVar.a(b4);
                        }
                    }
                    int indexOf6 = str2.indexOf(")", indexOf2);
                    if (indexOf6 == -1) {
                        break;
                    }
                    i2 = indexOf6 + 2;
                    String b5 = b(str2.substring(indexOf2 + 6, indexOf6));
                    if (b5 == null) {
                        break;
                    }
                    aVar.b(b5);
                }
            }
        }
        return aVar;
    }
}
