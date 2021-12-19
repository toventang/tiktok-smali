package com.bytedance.ies.bullet.kit.lynx.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableType;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import java.util.ArrayList;
import java.util.HashMap;

public final class b {
    static {
        Covode.recordClassIndex(19015);
    }

    public static final class h implements BulletDynamic {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.lynx.react.bridge.a f32372a;

        static {
            Covode.recordClassIndex(19023);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final boolean asBoolean() {
            return this.f32372a.b();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final double asDouble() {
            return this.f32372a.c();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final int asInt() {
            return this.f32372a.d();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final String asString() {
            return this.f32372a.e();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final boolean isNull() {
            return this.f32372a.a();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final void recycle() {
            this.f32372a.i();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final BulletReadableArray asArray() {
            return b.a(this.f32372a.f());
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final BulletReadableMap asMap() {
            return b.a(this.f32372a.g());
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final BulletReadableType getType() {
            return b.a(this.f32372a.h());
        }

        h(com.lynx.react.bridge.a aVar) {
            this.f32372a = aVar;
        }
    }

    public static final class j implements BulletReadableArray {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f32374a;

        static {
            Covode.recordClassIndex(19025);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final int size() {
            return this.f32374a.size();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final ArrayList<Object> toArrayList() {
            return this.f32374a.toArrayList();
        }

        j(ReadableArray readableArray) {
            this.f32374a = readableArray;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final boolean getBoolean(int i2) {
            return this.f32374a.getBoolean(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final byte getByte(int i2) {
            return this.f32374a.getByte(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final char getChar(int i2) {
            return this.f32374a.getChar(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final double getDouble(int i2) {
            return this.f32374a.getDouble(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final int getInt(int i2) {
            return this.f32374a.getInt(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final long getLong(int i2) {
            return this.f32374a.getLong(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final short getShort(int i2) {
            return this.f32374a.getShort(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final String getString(int i2) {
            return this.f32374a.getString(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final boolean isNull(int i2) {
            return this.f32374a.isNull(i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final BulletReadableArray getArray(int i2) {
            return b.a(this.f32374a.getArray(i2));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final BulletDynamic getDynamic(int i2) {
            com.lynx.react.bridge.b a2 = com.lynx.react.bridge.b.a(this.f32374a, i2);
            if (a2 != null) {
                return b.a(a2);
            }
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final BulletReadableMap getMap(int i2) {
            return b.a(this.f32374a.getMap(i2));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final BulletReadableType getType(int i2) {
            return b.a(this.f32374a.getType(i2));
        }
    }

    public static final class k implements BulletReadableMap {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableMap f32375a;

        static {
            Covode.recordClassIndex(19026);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final int size() {
            return this.f32375a.size();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final HashMap<String, Object> toHashMap() {
            return this.f32375a.toHashMap();
        }

        k(ReadableMap readableMap) {
            this.f32375a = readableMap;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final boolean getBoolean(String str) {
            return this.f32375a.getBoolean(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final double getDouble(String str) {
            return this.f32375a.getDouble(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final int getInt(String str) {
            return this.f32375a.getInt(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final String getString(String str) {
            return this.f32375a.getString(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final boolean isNull(String str) {
            return this.f32375a.isNull(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableArray getArray(String str) {
            return b.a(this.f32375a.getArray(str));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletDynamic getDynamic(String str) {
            com.lynx.react.bridge.c a2 = com.lynx.react.bridge.c.a(this.f32375a, str);
            if (a2 != null) {
                return b.a(a2);
            }
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableMap getMap(String str) {
            return b.a(this.f32375a.getMap(str));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableType getType(String str) {
            return b.a(this.f32375a.getType(str));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final boolean hasKey(String str) {
            l.c(str, "");
            return this.f32375a.hasKey(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final boolean getBoolean(String str, boolean z) {
            return this.f32375a.getBoolean(str, z);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final double getDouble(String str, double d2) {
            return this.f32375a.getDouble(str, d2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final int getInt(String str, int i2) {
            return this.f32375a.getInt(str, i2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final String getString(String str, String str2) {
            return this.f32375a.getString(str, str2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableArray getArray(String str, BulletReadableArray bulletReadableArray) {
            l.c(str, "");
            BulletReadableArray a2 = b.a(this.f32375a.getArray(str));
            return a2 == null ? bulletReadableArray : a2;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableMap getMap(String str, BulletReadableMap bulletReadableMap) {
            l.c(str, "");
            BulletReadableMap a2 = b.a(this.f32375a.getMap(str));
            return a2 == null ? bulletReadableMap : a2;
        }
    }

    public static final class i implements com.bytedance.ies.bullet.kit.lynx.api.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f32373a;

        static {
            Covode.recordClassIndex(19024);
        }

        i(Callback callback) {
            this.f32373a = callback;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.c
        public final void a(Object... objArr) {
            l.c(objArr, "");
            this.f32373a.invoke(objArr);
        }
    }

    public static final BulletDynamic a(com.lynx.react.bridge.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new h(aVar);
    }

    public static final BulletReadableArray a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        return new j(readableArray);
    }

    static final class a extends m implements h.f.a.b<String, String> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19016);
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

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$b  reason: collision with other inner class name */
    static final class C0693b extends m implements h.f.a.b<String, Integer> {
        final /* synthetic */ v $this_get;

        static {
            Covode.recordClassIndex(19017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0693b(v vVar) {
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
            Covode.recordClassIndex(19018);
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
            Covode.recordClassIndex(19019);
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
            Covode.recordClassIndex(19020);
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
            Covode.recordClassIndex(19021);
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
            Covode.recordClassIndex(19022);
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

    public static final BulletReadableMap a(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new k(readableMap);
    }

    public static final BulletReadableType a(ReadableType readableType) {
        if (readableType == null) {
            return null;
        }
        switch (c.f32376a[readableType.ordinal()]) {
            case 1:
                return BulletReadableType.Boolean;
            case 2:
                return BulletReadableType.Int;
            case 3:
                return BulletReadableType.Number;
            case 4:
                return BulletReadableType.String;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return BulletReadableType.Map;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return BulletReadableType.Array;
            default:
                return BulletReadableType.Null;
        }
    }

    public static final com.bytedance.ies.bullet.kit.lynx.api.c a(Callback callback) {
        if (callback == null) {
            return null;
        }
        return new i(callback);
    }
}
