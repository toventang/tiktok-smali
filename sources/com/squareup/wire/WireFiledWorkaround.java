package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;

public class WireFiledWorkaround {
    static {
        Covode.recordClassIndex(36141);
    }

    private static WireField toWireFiled(final WireFieldNoEnum wireFieldNoEnum) {
        if (wireFieldNoEnum == null) {
            return null;
        }
        return new WireField() {
            /* class com.squareup.wire.WireFiledWorkaround.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36142);
            }

            @Override // java.lang.annotation.Annotation
            public final Class<? extends Annotation> annotationType() {
                return WireField.class;
            }

            @Override // com.squareup.wire.WireField
            public final String adapter() {
                return wireFieldNoEnum.adapter();
            }

            @Override // com.squareup.wire.WireField
            public final String keyAdapter() {
                return wireFieldNoEnum.keyAdapter();
            }

            @Override // com.squareup.wire.WireField
            public final boolean redacted() {
                return wireFieldNoEnum.redacted();
            }

            @Override // com.squareup.wire.WireField
            public final int tag() {
                return wireFieldNoEnum.tag();
            }

            @Override // com.squareup.wire.WireField
            public final WireField.Label label() {
                int label = wireFieldNoEnum.label();
                if (label == 0) {
                    return WireField.Label.REQUIRED;
                }
                if (label == 2) {
                    return WireField.Label.REPEATED;
                }
                if (label == 3) {
                    return WireField.Label.ONE_OF;
                }
                if (label != 4) {
                    return WireField.Label.OPTIONAL;
                }
                return WireField.Label.PACKED;
            }
        };
    }

    private static <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        try {
            return (Class<B>) Class.forName(cls.getName() + "$Builder");
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("No builder class found for message type " + cls.getName());
        }
    }

    static <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> create(Class<M> cls) {
        Class builderType = getBuilderType(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            WireField wireField = null;
            try {
                wireField = (WireField) field.getAnnotation(WireField.class);
            } catch (Throwable unused) {
            }
            if (wireField == null) {
                wireField = toWireFiled((WireFieldNoEnum) field.getAnnotation(WireFieldNoEnum.class));
            }
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, builderType));
            }
        }
        return new RuntimeMessageAdapter<>(cls, builderType, Collections.unmodifiableMap(linkedHashMap));
    }
}
