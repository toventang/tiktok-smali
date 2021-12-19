package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class RelationLabelStructV2 extends Message<RelationLabelStructV2, Builder> {
    public static final ProtoAdapter<RelationLabelStructV2> ADAPTER = new ProtoAdapter_RelationLabelStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RelativeUserStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<RelativeUserStructV2> user_list;

    public RelationLabelStructV2() {
    }

    static final class ProtoAdapter_RelationLabelStructV2 extends ProtoAdapter<RelationLabelStructV2> {
        static {
            Covode.recordClassIndex(102196);
        }

        public ProtoAdapter_RelationLabelStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RelationLabelStructV2.class);
        }

        public final int encodedSize(RelationLabelStructV2 relationLabelStructV2) {
            return RelativeUserStructV2.ADAPTER.asRepeated().encodedSizeWithTag(1, relationLabelStructV2.user_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, relationLabelStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(3, relationLabelStructV2.extra) + relationLabelStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RelationLabelStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.user_list.add(RelativeUserStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.extra(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, RelationLabelStructV2 relationLabelStructV2) {
            RelativeUserStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, relationLabelStructV2.user_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, relationLabelStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, relationLabelStructV2.extra);
            protoWriter.writeBytes(relationLabelStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<RelationLabelStructV2, Builder> {
        public String extra;
        public Integer type;
        public List<RelativeUserStructV2> user_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(102195);
        }

        @Override // com.squareup.wire.Message.Builder
        public final RelationLabelStructV2 build() {
            return new RelationLabelStructV2(this.user_list, this.type, this.extra, super.buildUnknownFields());
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder user_list(List<RelativeUserStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.user_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102194);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.RelationLabelStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<RelationLabelStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_list = Internal.copyOf("user_list", this.user_list);
        builder.type = this.type;
        builder.extra = this.extra;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.user_list.hashCode()) * 37;
        Integer num = this.type;
        int i4 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.extra;
        if (str != null) {
            i4 = str.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.user_list.isEmpty()) {
            sb.append(", user_list=").append(this.user_list);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        return sb.replace(0, 2, "RelationLabelStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelationLabelStructV2)) {
            return false;
        }
        RelationLabelStructV2 relationLabelStructV2 = (RelationLabelStructV2) obj;
        if (!unknownFields().equals(relationLabelStructV2.unknownFields()) || !this.user_list.equals(relationLabelStructV2.user_list) || !Internal.equals(this.type, relationLabelStructV2.type) || !Internal.equals(this.extra, relationLabelStructV2.extra)) {
            return false;
        }
        return true;
    }

    public RelationLabelStructV2(List<RelativeUserStructV2> list, Integer num, String str) {
        this(list, num, str, i.EMPTY);
    }

    public RelationLabelStructV2(List<RelativeUserStructV2> list, Integer num, String str, i iVar) {
        super(ADAPTER, iVar);
        this.user_list = Internal.immutableCopyOf("user_list", list);
        this.type = num;
        this.extra = str;
    }
}
