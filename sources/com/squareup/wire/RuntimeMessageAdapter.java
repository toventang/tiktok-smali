package com.squareup.wire;

import com.a;
import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class RuntimeMessageAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends ProtoAdapter<M> {
    private final Class<B> builderType;
    private final Map<Integer, FieldBinding<M, B>> fieldBindings;
    private final Class<M> messageType;

    static {
        Covode.recordClassIndex(36134);
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, FieldBinding<M, B>> fieldBindings() {
        return this.fieldBindings;
    }

    public final int hashCode() {
        return this.messageType.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final B newBuilder() {
        try {
            return this.builderType.newInstance();
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RuntimeMessageAdapter) || ((RuntimeMessageAdapter) obj).messageType != this.messageType) {
            return false;
        }
        return true;
    }

    static <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> create(Class<M> cls) {
        Class builderType2 = getBuilderType(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, builderType2));
            }
        }
        return new RuntimeMessageAdapter<>(cls, builderType2, Collections.unmodifiableMap(linkedHashMap));
    }

    private static <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        try {
            return (Class<B>) Class.forName(cls.getName() + "$Builder");
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("No builder class found for message type " + cls.getName());
        }
    }

    public final int encodedSize(M m2) {
        int i2 = m2.cachedSerializedSize;
        if (i2 != 0) {
            return i2;
        }
        int i3 = 0;
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m2);
            if (obj != null) {
                i3 += fieldBinding.adapter().encodedSizeWithTag(fieldBinding.tag, obj);
            }
        }
        int size = i3 + m2.unknownFields().size();
        m2.cachedSerializedSize = size;
        return size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final M decode(ProtoReader protoReader) {
        ProtoAdapter<?> singleAdapter;
        B newBuilder = newBuilder();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldBinding<M, B> fieldBinding = this.fieldBindings.get(Integer.valueOf(nextTag));
                if (fieldBinding != null) {
                    try {
                        if (fieldBinding.isMap()) {
                            singleAdapter = fieldBinding.adapter();
                        } else {
                            singleAdapter = fieldBinding.singleAdapter();
                        }
                        fieldBinding.value(newBuilder, singleAdapter.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        newBuilder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    newBuilder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return (M) newBuilder.build();
            }
        }
    }

    public final String toString(M m2) {
        StringBuilder sb = new StringBuilder();
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m2);
            if (obj != null) {
                StringBuilder append = sb.append(", ").append(fieldBinding.name).append('=');
                if (fieldBinding.redacted) {
                    obj = "██";
                }
                append.append(obj);
            }
        }
        sb.replace(0, 2, this.messageType.getSimpleName() + '{');
        return sb.append('}').toString();
    }

    public final M redact(M m2) {
        Message.Builder<M, B> newBuilder = m2.newBuilder();
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            if (!fieldBinding.redacted || fieldBinding.label != WireField.Label.REQUIRED) {
                boolean isAssignableFrom = Message.class.isAssignableFrom(fieldBinding.singleAdapter().javaType);
                if (!fieldBinding.redacted) {
                    if (isAssignableFrom) {
                        if (fieldBinding.label.isRepeated()) {
                            if (fieldBinding.label.isRepeated()) {
                                Internal.redactElements((List) fieldBinding.getFromBuilder(newBuilder), fieldBinding.singleAdapter());
                            }
                        }
                    }
                }
                Object fromBuilder = fieldBinding.getFromBuilder(newBuilder);
                if (fromBuilder != null) {
                    fieldBinding.set(newBuilder, fieldBinding.adapter().redact(fromBuilder));
                }
            } else {
                throw new UnsupportedOperationException(a.a("Field '%s' in %s is required and cannot be redacted.", new Object[]{fieldBinding.name, this.javaType.getName()}));
            }
        }
        newBuilder.clearUnknownFields();
        return newBuilder.build();
    }

    public final void encode(ProtoWriter protoWriter, M m2) {
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m2);
            if (obj != null) {
                fieldBinding.adapter().encodeWithTag(protoWriter, fieldBinding.tag, obj);
            }
        }
        protoWriter.writeBytes(m2.unknownFields());
    }

    RuntimeMessageAdapter(Class<M> cls, Class<B> cls2, Map<Integer, FieldBinding<M, B>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.messageType = cls;
        this.builderType = cls2;
        this.fieldBindings = map;
    }
}
