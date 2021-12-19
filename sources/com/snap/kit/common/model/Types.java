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

public final class Types extends Message<Types, Builder> {
    public static final ProtoAdapter<Types> ADAPTER = new ProtoAdapter_Types();
    private static final long serialVersionUID = 0;

    public enum Trilean implements WireEnum {
        NONE(0),
        FALSE(1),
        TRUE(2);
        
        public static final ProtoAdapter<Trilean> ADAPTER = new ProtoAdapter_Trilean();
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }

        static final class ProtoAdapter_Trilean extends EnumAdapter<Trilean> {
            static {
                Covode.recordClassIndex(35532);
            }

            ProtoAdapter_Trilean() {
                super(Trilean.class);
            }

            /* access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public final Trilean fromValue(int i2) {
                return Trilean.fromValue(i2);
            }
        }

        static {
            Covode.recordClassIndex(35531);
        }

        public static Trilean fromValue(int i2) {
            if (i2 == 0) {
                return NONE;
            }
            if (i2 == 1) {
                return FALSE;
            }
            if (i2 != 2) {
                return null;
            }
            return TRUE;
        }

        private Trilean(int i2) {
            this.value = i2;
        }
    }

    static final class ProtoAdapter_Types extends ProtoAdapter<Types> {
        static {
            Covode.recordClassIndex(35530);
        }

        public ProtoAdapter_Types() {
            super(FieldEncoding.LENGTH_DELIMITED, Types.class);
        }

        public final int encodedSize(Types types) {
            return types.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.snap.kit.common.model.Types$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snap.kit.common.model.Types redact(com.snap.kit.common.model.Types r2) {
            /*
                r1 = this;
                com.snap.kit.common.model.Types$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snap.kit.common.model.Types r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.kit.common.model.Types.ProtoAdapter_Types.redact(com.snap.kit.common.model.Types):com.snap.kit.common.model.Types");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Types decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, Types types) {
            protoWriter.writeBytes(types.unknownFields());
        }
    }

    public Types() {
        this(i.EMPTY);
    }

    public static final class Builder extends Message.Builder<Types, Builder> {
        static {
            Covode.recordClassIndex(35529);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Types build() {
            return new Types(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(35528);
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    /* Return type fixed from 'com.snap.kit.common.model.Types$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Types, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return new StringBuilder().replace(0, 2, "Types{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof Types;
    }

    public Types(i iVar) {
        super(ADAPTER, iVar);
    }
}
