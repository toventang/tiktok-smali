package com.lynx.react.bridge;

import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class JavaOnlyMap extends HashMap<String, Object> implements ReadableMap, WritableMap {
    static {
        Covode.recordClassIndex(34767);
    }

    public static int com_lynx_react_bridge_JavaOnlyMap_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public JavaOnlyMap() {
    }

    private static JavaOnlyMap create() {
        return new JavaOnlyMap();
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator() {
            /* class com.lynx.react.bridge.JavaOnlyMap.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            Iterator<String> f55521a;

            static {
                Covode.recordClassIndex(34768);
            }

            @Override // com.lynx.react.bridge.ReadableMapKeySetIterator
            public final boolean hasNextKey() {
                return this.f55521a.hasNext();
            }

            @Override // com.lynx.react.bridge.ReadableMapKeySetIterator
            public final String nextKey() {
                return this.f55521a.next();
            }

            {
                this.f55521a = JavaOnlyMap.this.keySet().iterator();
            }
        };
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int size() {
        return super.size();
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this);
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getKeys() {
        return new ArrayList<>(keySet());
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public a<String, Object> toArrayMap() {
        a<String, Object> aVar = new a<>();
        aVar.putAll(this);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.react.bridge.JavaOnlyMap$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55523a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.react.bridge.JavaOnlyMap.AnonymousClass2.<clinit>():void");
        }
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        if (size() == 0) {
            return jSONObject;
        }
        for (String str : keySet()) {
            Object obj = get(str);
            try {
                if (getType(str) == ReadableType.Map) {
                    jSONObject.putOpt(str, ((JavaOnlyMap) obj).toJSONObject());
                } else if (getType(str) == ReadableType.Array) {
                    jSONObject.putOpt(str, ((JavaOnlyArray) obj).toJSONArray());
                } else if (getType(str) == ReadableType.Null) {
                    jSONObject.putOpt(str, JSONObject.NULL);
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (Exception e2) {
                com_lynx_react_bridge_JavaOnlyMap_com_ss_android_ugc_aweme_lancet_LogLancet_e("JavaOnlyMap", e2.toString());
            }
        }
        return jSONObject;
    }

    private JavaOnlyMap(Map map) {
        super(map);
    }

    public static JavaOnlyMap from(Map map) {
        return new JavaOnlyMap(map);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public a getDynamic(String str) {
        return c.a(this, str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean hasKey(String str) {
        return containsKey(str);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        putAll((JavaOnlyMap) readableMap);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putNull(String str) {
        put(str, null);
    }

    public int getTypeIndex(String str) {
        return getType(str).ordinal();
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean isNull(String str) {
        if (get(str) == null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.String, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public JavaOnlyArray getArray(String str) {
        Object obj = get(str);
        if (obj instanceof JavaOnlyArray) {
            return (JavaOnlyArray) obj;
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to " + JavaOnlyArray.class.getName() + ", key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj == null) {
            throw new NullPointerException("key: ".concat(String.valueOf(str)));
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.Boolean, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public byte[] getByteArray(String str) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to " + byte[].class.getName() + ", key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public double getDouble(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj == null) {
            throw new NullPointerException("key: ".concat(String.valueOf(str)));
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.Number, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int getInt(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            throw new NullPointerException("key: ".concat(String.valueOf(str)));
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.Number, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public long getLong(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj == null) {
            throw new NullPointerException("key: ".concat(String.valueOf(str)));
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.Long, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMap getMap(String str) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to " + ReadableMap.class.getName() + ", key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableType getType(String str) {
        Object obj = get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Integer) {
            return ReadableType.Int;
        }
        if (obj instanceof Long) {
            return ReadableType.Long;
        }
        if ((obj instanceof Number) || (obj instanceof Character)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof byte[]) {
            return ReadableType.ByteArray;
        }
        if (obj instanceof a) {
            return ((a) obj).h();
        }
        throw new IllegalArgumentException("Invalid value " + obj.toString() + " for key " + str + "contained in JavaOnlyMap");
    }

    public static JavaOnlyMap deepClone(ReadableMap readableMap) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (AnonymousClass2.f55523a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    javaOnlyMap.putInt(nextKey, readableMap.getInt(nextKey));
                    break;
                case 4:
                    javaOnlyMap.putLong(nextKey, readableMap.getLong(nextKey));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    javaOnlyMap.putMap(nextKey, deepClone(readableMap.getMap(nextKey)));
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    javaOnlyMap.putArray(nextKey, JavaOnlyArray.deepClone(readableMap.getArray(nextKey)));
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    javaOnlyMap.putByteArray(nextKey, (byte[]) readableMap.getByteArray(nextKey).clone());
                    break;
            }
        }
        return javaOnlyMap;
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putArray(String str, WritableArray writableArray) {
        put(str, writableArray);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteArray(String str, byte[] bArr) {
        put(str, bArr);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putMap(String str, WritableMap writableMap) {
        put(str, writableMap);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putString(String str, String str2) {
        put(str, str2);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putBoolean(String str, boolean z) {
        put(str, Boolean.valueOf(z));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putDouble(String str, double d2) {
        put(str, Double.valueOf(d2));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putInt(String str, int i2) {
        put(str, Integer.valueOf(i2));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putLong(String str, long j2) {
        put(str, Long.valueOf(j2));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableArray getArray(String str, ReadableArray readableArray) {
        Object obj = get(str);
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        return readableArray;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean getBoolean(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public byte[] getByteArray(String str, byte[] bArr) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return bArr;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public double getDouble(String str, double d2) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return d2;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int getInt(String str, int i2) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i2;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public long getLong(String str, long j2) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return j2;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMap getMap(String str, ReadableMap readableMap) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        return readableMap;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public String getString(String str, String str2) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteArrayAsString(byte[] bArr, byte[] bArr2) {
        put(new String(bArr), new String(bArr2));
    }
}
