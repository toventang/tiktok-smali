package com.snap.kit.common.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import k.i;

public final class KitType extends Message<KitType, Builder> {
    public static final ProtoAdapter<KitType> ADAPTER = new ProtoAdapter_KitType();
    private static final long serialVersionUID = 0;

    public enum Enum implements WireEnum {
        NONE(0),
        LOGIN_KIT(1),
        BITMOJI_KIT(2),
        CREATIVE_KIT(3),
        STORY_KIT(4);
        
        public static final ProtoAdapter<Enum> ADAPTER = new ProtoAdapter_Enum();
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }

        static final class ProtoAdapter_Enum extends EnumAdapter<Enum> {
            static {
                Covode.recordClassIndex(35521);
            }

            ProtoAdapter_Enum() {
                super(Enum.class);
            }

            /* access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public final Enum fromValue(int i2) {
                return Enum.fromValue(i2);
            }
        }

        static {
            Covode.recordClassIndex(35520);
        }

        public static Enum fromValue(int i2) {
            if (i2 == 0) {
                return NONE;
            }
            if (i2 == 1) {
                return LOGIN_KIT;
            }
            if (i2 == 2) {
                return BITMOJI_KIT;
            }
            if (i2 == 3) {
                return CREATIVE_KIT;
            }
            if (i2 != 4) {
                return null;
            }
            return STORY_KIT;
        }

        private Enum(int i2) {
            this.value = i2;
        }
    }

    static final class ProtoAdapter_KitType extends ProtoAdapter<KitType> {
        static {
            Covode.recordClassIndex(35522);
        }

        public ProtoAdapter_KitType() {
            super(FieldEncoding.LENGTH_DELIMITED, KitType.class);
        }

        public final int encodedSize(KitType kitType) {
            return kitType.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.snap.kit.common.model.KitType$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snap.kit.common.model.KitType redact(com.snap.kit.common.model.KitType r2) {
            /*
                r1 = this;
                com.snap.kit.common.model.KitType$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snap.kit.common.model.KitType r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.kit.common.model.KitType.ProtoAdapter_KitType.redact(com.snap.kit.common.model.KitType):com.snap.kit.common.model.KitType");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final KitType decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, KitType kitType) {
            protoWriter.writeBytes(kitType.unknownFields());
        }
    }

    public KitType() {
        this(i.EMPTY);
    }

    public static final class Builder extends Message.Builder<KitType, Builder> {
        static {
            Covode.recordClassIndex(35519);
        }

        @Override // com.squareup.wire.Message.Builder
        public final KitType build() {
            return new KitType(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(35518);
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    /* Return type fixed from 'com.snap.kit.common.model.KitType$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<KitType, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return new StringBuilder().replace(0, 2, "KitType{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof KitType;
    }

    public KitType(i iVar) {
        super(ADAPTER, iVar);
    }
}
