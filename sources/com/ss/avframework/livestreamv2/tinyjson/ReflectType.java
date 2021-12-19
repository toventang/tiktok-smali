package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public abstract class ReflectType {
    private final Field field;

    static {
        Covode.recordClassIndex(100477);
    }

    public static final class DirectType extends ReflectType {
        private final Class<? extends Object> type;

        static {
            Covode.recordClassIndex(100478);
        }

        public final Class<? extends Object> getType() {
            return this.type;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DirectType(Class<? extends Object> cls, Field field) {
            super(field, null);
            l.c(cls, "");
            l.c(field, "");
            this.type = cls;
        }
    }

    public static final class List extends ReflectType {
        private final Type memberType;

        static {
            Covode.recordClassIndex(100479);
        }

        public final Type getMemberType() {
            return this.memberType;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public List(Type type, Field field) {
            super(field, null);
            l.c(type, "");
            l.c(field, "");
            this.memberType = type;
        }
    }

    public static final class Map extends ReflectType {
        private final Type valueType;

        static {
            Covode.recordClassIndex(100480);
        }

        public final Type getValueType() {
            return this.valueType;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Map(Type type, Field field) {
            super(field, null);
            l.c(type, "");
            l.c(field, "");
            this.valueType = type;
        }
    }

    public static final class Struct extends ReflectType {
        private final Class<? extends Object> clazz;

        static {
            Covode.recordClassIndex(100481);
        }

        public final Class<? extends Object> getClazz() {
            return this.clazz;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Struct(Class<? extends Object> cls, Field field) {
            super(field, null);
            l.c(cls, "");
            this.clazz = cls;
        }
    }

    public final Field getField() {
        return this.field;
    }

    private ReflectType(Field field2) {
        this.field = field2;
    }

    public /* synthetic */ ReflectType(Field field2, g gVar) {
        this(field2);
    }
}
