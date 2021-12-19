package com.bytedance.ies.xbridge.platform.lynx.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.a;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class g implements n {

    /* renamed from: a  reason: collision with root package name */
    private final ReadableMap f36413a;

    static {
        Covode.recordClassIndex(21819);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final Map<String, Object> b() {
        HashMap<String, Object> hashMap = this.f36413a.toHashMap();
        l.a((Object) hashMap, "");
        return hashMap;
    }

    @Override // com.bytedance.ies.xbridge.n
    public final com.bytedance.ies.xbridge.l a() {
        ReadableMapKeySetIterator keySetIterator = this.f36413a.keySetIterator();
        l.a((Object) keySetIterator, "");
        return new c(keySetIterator);
    }

    public g(ReadableMap readableMap) {
        l.c(readableMap, "");
        this.f36413a = readableMap;
    }

    @Override // com.bytedance.ies.xbridge.n
    public final boolean a(String str) {
        l.c(str, "");
        return this.f36413a.hasKey(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final boolean c(String str) {
        l.c(str, "");
        return this.f36413a.getBoolean(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final double d(String str) {
        l.c(str, "");
        return this.f36413a.getDouble(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final int e(String str) {
        l.c(str, "");
        return this.f36413a.getInt(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final String f(String str) {
        l.c(str, "");
        String string = this.f36413a.getString(str);
        l.a((Object) string, "");
        return string;
    }

    @Override // com.bytedance.ies.xbridge.n
    public final boolean b(String str) {
        l.c(str, "");
        return this.f36413a.isNull(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final m g(String str) {
        l.c(str, "");
        ReadableArray array = this.f36413a.getArray(str);
        if (array == null) {
            return null;
        }
        return new e(array);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final n h(String str) {
        l.c(str, "");
        ReadableMap map = this.f36413a.getMap(str);
        if (map == null) {
            return null;
        }
        return new g(map);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final k i(String str) {
        l.c(str, "");
        a dynamic = this.f36413a.getDynamic(str);
        l.a((Object) dynamic, "");
        return new a(dynamic);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final o j(String str) {
        l.c(str, "");
        ReadableType type = this.f36413a.getType(str);
        if (type != null) {
            switch (h.f36414a[type.ordinal()]) {
                case 1:
                    return o.Null;
                case 2:
                    return o.Array;
                case 3:
                    return o.Boolean;
                case 4:
                    return o.Map;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return o.Number;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return o.String;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    return o.Int;
            }
        }
        return o.Null;
    }
}
