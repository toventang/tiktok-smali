package com.lynx.tasm.c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f56485a;

    /* renamed from: b  reason: collision with root package name */
    public String f56486b;

    /* renamed from: c  reason: collision with root package name */
    public String f56487c;

    static {
        Covode.recordClassIndex(35245);
    }

    public static Map<String, a> a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        androidx.c.a aVar = new androidx.c.a();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            a aVar2 = new a(map.getString(StringSet.name), map.getString(StringSet.type), map.getString("function"));
            aVar.put(aVar2.f56485a, aVar2);
        }
        return aVar;
    }

    public a(String str, String str2, String str3) {
        this.f56485a = str;
        this.f56486b = str2;
        this.f56487c = str3;
    }
}
