package com.bytedance.ies.bullet.lynx_adapter_impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.lynx_adapter_impl.d;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableTypeWrapper;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(19249);
    }

    public static final class h implements DynamicWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.lynx.react.bridge.a f32485a;

        static {
            Covode.recordClassIndex(19257);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final boolean asBoolean() {
            return this.f32485a.b();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final double asDouble() {
            return this.f32485a.c();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final int asInt() {
            return this.f32485a.d();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final String asString() {
            return this.f32485a.e();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final boolean isNull() {
            return this.f32485a.a();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final void recycle() {
            this.f32485a.i();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final ReadableArrayWrapper asArray() {
            return b.a(this.f32485a.f());
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final ReadableMapWrapper asMap() {
            return b.a(this.f32485a.g());
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final ReadableTypeWrapper getType() {
            return b.a(this.f32485a.h());
        }

        h(com.lynx.react.bridge.a aVar) {
            this.f32485a = aVar;
        }
    }

    public static final class j implements ReadableArrayWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f32487a;

        static {
            Covode.recordClassIndex(19259);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final int size() {
            return this.f32487a.size();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final ArrayList<Object> toArrayList() {
            return this.f32487a.toArrayList();
        }

        j(ReadableArray readableArray) {
            this.f32487a = readableArray;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final boolean getBoolean(int i2) {
            return this.f32487a.getBoolean(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final byte getByte(int i2) {
            return this.f32487a.getByte(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final byte[] getByteArray(int i2) {
            return this.f32487a.getByteArray(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final char getChar(int i2) {
            return this.f32487a.getChar(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final double getDouble(int i2) {
            return this.f32487a.getDouble(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final int getInt(int i2) {
            return this.f32487a.getInt(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final long getLong(int i2) {
            return this.f32487a.getLong(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final short getShort(int i2) {
            return this.f32487a.getShort(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final String getString(int i2) {
            return this.f32487a.getString(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final boolean isNull(int i2) {
            return this.f32487a.isNull(i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final ReadableArrayWrapper getArray(int i2) {
            return b.a(this.f32487a.getArray(i2));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final DynamicWrapper getDynamic(int i2) {
            com.lynx.react.bridge.b a2 = com.lynx.react.bridge.b.a(this.f32487a, i2);
            if (a2 != null) {
                return b.a(a2);
            }
            return null;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final ReadableMapWrapper getMap(int i2) {
            return b.a(this.f32487a.getMap(i2));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final ReadableTypeWrapper getType(int i2) {
            return b.a(this.f32487a.getType(i2));
        }
    }

    public static final class k implements ReadableMapWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableMap f32488a;

        static {
            Covode.recordClassIndex(19260);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final int size() {
            return this.f32488a.size();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final HashMap<String, Object> toHashMap() {
            return this.f32488a.toHashMap();
        }

        k(ReadableMap readableMap) {
            this.f32488a = readableMap;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final boolean getBoolean(String str) {
            return this.f32488a.getBoolean(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final byte[] getByteArray(String str) {
            return this.f32488a.getByteArray(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final double getDouble(String str) {
            return this.f32488a.getDouble(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final int getInt(String str) {
            return this.f32488a.getInt(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final String getString(String str) {
            return this.f32488a.getString(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final boolean isNull(String str) {
            return this.f32488a.isNull(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableArrayWrapper getArray(String str) {
            return b.a(this.f32488a.getArray(str));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final DynamicWrapper getDynamic(String str) {
            com.lynx.react.bridge.c a2 = com.lynx.react.bridge.c.a(this.f32488a, str);
            if (a2 != null) {
                return b.a(a2);
            }
            return null;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final Long getLong(String str) {
            return Long.valueOf(this.f32488a.getLong(str));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableMapWrapper getMap(String str) {
            return b.a(this.f32488a.getMap(str));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableTypeWrapper getType(String str) {
            return b.a(this.f32488a.getType(str));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final boolean hasKey(String str) {
            l.c(str, "");
            return this.f32488a.hasKey(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final boolean getBoolean(String str, boolean z) {
            return this.f32488a.getBoolean(str, z);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final byte[] getByteArray(String str, byte[] bArr) {
            l.c(bArr, "");
            return this.f32488a.getByteArray(str, bArr);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final double getDouble(String str, double d2) {
            return this.f32488a.getDouble(str, d2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final int getInt(String str, int i2) {
            return this.f32488a.getInt(str, i2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final String getString(String str, String str2) {
            return this.f32488a.getString(str, str2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableArrayWrapper getArray(String str, ReadableArrayWrapper readableArrayWrapper) {
            l.c(str, "");
            ReadableArrayWrapper a2 = b.a(this.f32488a.getArray(str));
            return a2 == null ? readableArrayWrapper : a2;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final Long getLong(String str, long j2) {
            return Long.valueOf(this.f32488a.getLong(str, j2));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableMapWrapper getMap(String str, ReadableMapWrapper readableMapWrapper) {
            l.c(str, "");
            ReadableMapWrapper a2 = b.a(this.f32488a.getMap(str));
            return a2 == null ? readableMapWrapper : a2;
        }
    }

    public static final class i implements com.bytedance.ies.lynx.lynx_adapter.wrapper.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f32486a;

        static {
            Covode.recordClassIndex(19258);
        }

        i(Callback callback) {
            this.f32486a = callback;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.d
        public final void a(Object... objArr) {
            l.c(objArr, "");
            this.f32486a.invoke(objArr);
        }
    }

    public static final DynamicWrapper a(com.lynx.react.bridge.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new h(aVar);
    }

    public static final ReadableArrayWrapper a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        return new j(readableArray);
    }

    static final class a extends m implements h.f.a.b<String, String> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(v vVar) {
            super(1);
            this.$this_get = vVar;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            Object obj;
            l.c(str, "");
            try {
                obj = q.m223constructorimpl(this.$this_get.c(str));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                obj = null;
            }
            return (String) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$b  reason: collision with other inner class name */
    static final class C0698b extends m implements h.f.a.b<String, Integer> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0698b(v vVar) {
            super(1);
            this.$this_get = vVar;
        }

        /* renamed from: a */
        public final Integer invoke(String str) {
            Object obj;
            l.c(str, "");
            try {
                obj = q.m223constructorimpl(Integer.valueOf(this.$this_get.a(str, 0)));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                obj = null;
            }
            return (Integer) obj;
        }
    }

    static final class c extends m implements h.f.a.b<String, Boolean> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(v vVar) {
            super(1);
            this.$this_get = vVar;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            Object obj;
            l.c(str, "");
            try {
                obj = q.m223constructorimpl(Boolean.valueOf(this.$this_get.a(str, false)));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                obj = null;
            }
            return (Boolean) obj;
        }
    }

    static final class d extends m implements h.f.a.b<String, Float> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(v vVar) {
            super(1);
            this.$this_get = vVar;
        }

        /* renamed from: a */
        public final Float invoke(String str) {
            Object obj;
            l.c(str, "");
            try {
                obj = q.m223constructorimpl(Float.valueOf(this.$this_get.a(str, 0.0f)));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                obj = null;
            }
            return (Float) obj;
        }
    }

    static final class e extends m implements h.f.a.b<String, Double> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(v vVar) {
            super(1);
            this.$this_get = vVar;
        }

        /* renamed from: a */
        public final Double invoke(String str) {
            Object obj;
            l.c(str, "");
            try {
                obj = q.m223constructorimpl(Double.valueOf(this.$this_get.a(str, 0.0d)));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                obj = null;
            }
            return (Double) obj;
        }
    }

    static final class f extends m implements h.f.a.b<String, ReadableMap> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(v vVar) {
            super(1);
            this.$this_get = vVar;
        }

        /* renamed from: a */
        public final ReadableMap invoke(String str) {
            Object obj;
            l.c(str, "");
            try {
                obj = q.m223constructorimpl(this.$this_get.e(str));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                obj = null;
            }
            return (ReadableMap) obj;
        }
    }

    static final class g extends m implements h.f.a.b<String, ReadableArray> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(v vVar) {
            super(1);
            this.$this_get = vVar;
        }

        /* renamed from: a */
        public final ReadableArray invoke(String str) {
            Object obj;
            l.c(str, "");
            try {
                obj = q.m223constructorimpl(this.$this_get.d(str));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                obj = null;
            }
            return (ReadableArray) obj;
        }
    }

    public static final ReadableMapWrapper a(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new k(readableMap);
    }

    public static final d a(com.bytedance.ies.lynx.lynx_adapter.wrapper.f fVar) {
        Map map = null;
        if (fVar == null) {
            return null;
        }
        if (fVar.f34206b != null) {
            d a2 = d.a.a(fVar.f34206b);
            for (Map.Entry<String, Object> entry : fVar.f34205a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                l.c(key, "");
                a2.f32491a.a(key, d.a.a(value));
            }
            return a2;
        }
        Map<String, Object> map2 = fVar.f34205a;
        d dVar = new d();
        Object a3 = d.a.a(map2);
        if (a3 instanceof Map) {
            map = a3;
        }
        TemplateData a4 = TemplateData.a(map);
        l.a((Object) a4, "");
        dVar.f32491a = a4;
        return dVar;
    }

    public static final ReadableTypeWrapper a(ReadableType readableType) {
        if (readableType == null) {
            return null;
        }
        switch (c.f32489a[readableType.ordinal()]) {
            case 1:
                return ReadableTypeWrapper.Boolean;
            case 2:
                return ReadableTypeWrapper.Int;
            case 3:
                return ReadableTypeWrapper.Number;
            case 4:
                return ReadableTypeWrapper.String;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return ReadableTypeWrapper.Map;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return ReadableTypeWrapper.Array;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return ReadableTypeWrapper.Long;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return ReadableTypeWrapper.ByteArray;
            default:
                return ReadableTypeWrapper.Null;
        }
    }

    public static final com.bytedance.ies.lynx.lynx_adapter.wrapper.d a(Callback callback) {
        if (callback == null) {
            return null;
        }
        return new i(callback);
    }
}
