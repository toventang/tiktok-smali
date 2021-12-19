package com.bytedance.ies.xbridge.platform.lynx.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ReadableArray f36411a;

    static {
        Covode.recordClassIndex(21817);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final int a() {
        return this.f36411a.size();
    }

    @Override // com.bytedance.ies.xbridge.m
    public final List<Object> b() {
        ArrayList<Object> arrayList = this.f36411a.toArrayList();
        l.a((Object) arrayList, "");
        return arrayList;
    }

    @Override // com.bytedance.ies.xbridge.m
    public final double b(int i2) {
        return this.f36411a.getDouble(i2);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final int c(int i2) {
        return this.f36411a.getInt(i2);
    }

    public e(ReadableArray readableArray) {
        l.c(readableArray, "");
        this.f36411a = readableArray;
    }

    @Override // com.bytedance.ies.xbridge.m
    public final boolean a(int i2) {
        return this.f36411a.getBoolean(i2);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final String d(int i2) {
        String string = this.f36411a.getString(i2);
        l.a((Object) string, "");
        return string;
    }

    @Override // com.bytedance.ies.xbridge.m
    public final m e(int i2) {
        ReadableArray array = this.f36411a.getArray(i2);
        if (array == null) {
            return null;
        }
        return new e(array);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final n f(int i2) {
        ReadableMap map = this.f36411a.getMap(i2);
        if (map == null) {
            return null;
        }
        return new g(map);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final k g(int i2) {
        a dynamic = this.f36411a.getDynamic(i2);
        l.a((Object) dynamic, "");
        return new a(dynamic);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final o h(int i2) {
        ReadableType type = this.f36411a.getType(i2);
        if (type != null) {
            switch (f.f36412a[type.ordinal()]) {
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
