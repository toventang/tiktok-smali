package com.squareup.wire;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    private ProtoAdapter<Object> adapter;
    private final String adapterString;
    private final Field builderField;
    private final Method builderMethod;
    private ProtoAdapter<?> keyAdapter;
    private final String keyAdapterString;
    public final WireField.Label label;
    private final Field messageField;
    public final String name;
    public final boolean redacted;
    private ProtoAdapter<?> singleAdapter;
    public final int tag;

    static {
        Covode.recordClassIndex(36104);
    }

    private static Object com_squareup_wire_FieldBinding_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_squareup_wire_FieldBinding_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_squareup_wire_FieldBinding_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* access modifiers changed from: package-private */
    public final boolean isMap() {
        if (!this.keyAdapterString.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final ProtoAdapter<?> keyAdapter() {
        ProtoAdapter<?> protoAdapter = this.keyAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.keyAdapterString);
        this.keyAdapter = protoAdapter2;
        return protoAdapter2;
    }

    /* access modifiers changed from: package-private */
    public final ProtoAdapter<?> singleAdapter() {
        ProtoAdapter<?> protoAdapter = this.singleAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.adapterString);
        this.singleAdapter = protoAdapter2;
        return protoAdapter2;
    }

    /* access modifiers changed from: package-private */
    public final ProtoAdapter<Object> adapter() {
        ProtoAdapter<Object> protoAdapter = this.adapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        if (isMap()) {
            ProtoAdapter<Object> newMapAdapter = ProtoAdapter.newMapAdapter(keyAdapter(), singleAdapter());
            this.adapter = newMapAdapter;
            return newMapAdapter;
        }
        ProtoAdapter<?> withLabel = singleAdapter().withLabel(this.label);
        this.adapter = withLabel;
        return withLabel;
    }

    /* access modifiers changed from: package-private */
    public final Object get(M m2) {
        try {
            return this.messageField.get(m2);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final Object getFromBuilder(B b2) {
        try {
            return this.builderField.get(b2);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    private static Field getBuilderField(Class<?> cls, String str) {
        try {
            return cls.getField(str);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + cls.getName() + "." + str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void set(B b2, Object obj) {
        try {
            if (this.label.isOneOf()) {
                com_squareup_wire_FieldBinding_java_lang_reflect_Method_invoke(this.builderMethod, b2, new Object[]{obj});
                return;
            }
            this.builderField.set(b2, obj);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void value(B b2, Object obj) {
        if (this.label.isRepeated()) {
            ((List) getFromBuilder(b2)).add(obj);
        } else if (!this.keyAdapterString.isEmpty()) {
            ((Map) getFromBuilder(b2)).putAll((Map) obj);
        } else {
            set(b2, obj);
        }
    }

    FieldBinding(WireField wireField, Field field, Class<B> cls) {
        this.label = wireField.label();
        String name2 = field.getName();
        this.name = name2;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.messageField = field;
        this.builderField = getBuilderField(cls, name2);
        this.builderMethod = getBuilderMethod(cls, name2, field.getType());
    }

    private static Method getBuilderMethod(Class<?> cls, String str, Class<?> cls2) {
        try {
            return cls.getMethod(str, cls2);
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("No builder method " + cls.getName() + "." + str + "(" + cls2.getName() + ")");
        }
    }
}
