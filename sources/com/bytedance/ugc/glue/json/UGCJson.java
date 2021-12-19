package com.bytedance.ugc.glue.json;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import org.json.JSONObject;

public class UGCJson {
    private static UGCJson instance = new UGCJson();

    /* access modifiers changed from: protected */
    public <T> T fromJsonImpl(Object obj, Type type) {
        return null;
    }

    /* access modifiers changed from: protected */
    public String toJsonImpl(Object obj) {
        return "";
    }

    static class a implements GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f45847a;

        static {
            Covode.recordClassIndex(27955);
        }

        public final Type getGenericComponentType() {
            return this.f45847a;
        }

        private a(Type type) {
            this.f45847a = type;
        }

        /* synthetic */ a(Type type, byte b2) {
            this(type);
        }
    }

    static class b implements ParameterizedType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f45848a;

        /* renamed from: b  reason: collision with root package name */
        private final Type[] f45849b;

        static {
            Covode.recordClassIndex(27956);
        }

        public final Type getOwnerType() {
            return null;
        }

        public final Type[] getActualTypeArguments() {
            return this.f45849b;
        }

        public final Type getRawType() {
            return this.f45848a;
        }

        private static void a(Type type) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    throw new IllegalArgumentException("ParameterizedType doesn't support primitive Type: ".concat(String.valueOf(cls)));
                }
            }
        }

        private b(Type type, Type... typeArr) {
            this.f45848a = type;
            this.f45849b = typeArr;
            a(type);
            for (Type type2 : typeArr) {
                a(type2);
            }
        }

        /* synthetic */ b(Type type, Type[] typeArr, byte b2) {
            this(type, typeArr);
        }
    }

    protected UGCJson() {
    }

    private static UGCJson getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    static {
        Covode.recordClassIndex(27954);
    }

    public static Type buildGenericArrayType(Type type) {
        return new a(type, (byte) 0);
    }

    public static JSONObject jsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String toJson(Object obj) {
        return getInstance().toJsonImpl(obj);
    }

    public static JSONObject mergeJSONObject(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    try {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject.putOpt(next, jSONObject2.get(next));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject jsonObject(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", th.getClass().getName());
            jSONObject.put("message", th.getMessage());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i2 = 0;
            while (i2 < 10 && i2 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                jSONObject.put("trace".concat(String.valueOf(i2)), stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName() + "@" + stackTraceElement.getLineNumber());
                i2++;
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static Type buildParameterizedType(Type type, Type... typeArr) {
        return new b(type, typeArr, (byte) 0);
    }

    public static <T> T convert(Object obj, Type type) {
        return (T) getInstance().convertImpl(obj, type);
    }

    public static <T> T fromJson(InputStream inputStream, Type type) {
        return (T) getInstance().fromJsonImpl(new InputStreamReader(inputStream), type);
    }

    /* access modifiers changed from: protected */
    public <T> T convertImpl(Object obj, Type type) {
        return (T) fromJsonImpl(toJsonImpl(obj), type);
    }

    public static <T> T fromJson(Reader reader, Type type) {
        return (T) getInstance().fromJsonImpl(reader, type);
    }

    public static <T> T fromJson(String str, Type type) {
        return (T) getInstance().fromJsonImpl(str, type);
    }

    public static JSONObject put(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!(str == null || obj == null)) {
            try {
                jSONObject.put(str, obj);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
