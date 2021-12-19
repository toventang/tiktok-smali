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

public final class MutualStructV2 extends Message<MutualStructV2, Builder> {
    public static final ProtoAdapter<MutualStructV2> ADAPTER = new ProtoAdapter_MutualStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer mutual_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer total;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MutualUserStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<MutualUserStructV2> user_list;

    public MutualStructV2() {
    }

    static final class ProtoAdapter_MutualStructV2 extends ProtoAdapter<MutualStructV2> {
        static {
            Covode.recordClassIndex(102139);
        }

        public ProtoAdapter_MutualStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MutualStructV2.class);
        }

        public final int encodedSize(MutualStructV2 mutualStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, mutualStructV2.mutual_type) + MutualUserStructV2.ADAPTER.asRepeated().encodedSizeWithTag(2, mutualStructV2.user_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, mutualStructV2.total) + mutualStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MutualStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.mutual_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.user_list.add(MutualUserStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.total(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MutualStructV2 mutualStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mutualStructV2.mutual_type);
            MutualUserStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mutualStructV2.user_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, mutualStructV2.total);
            protoWriter.writeBytes(mutualStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MutualStructV2, Builder> {
        public Integer mutual_type;
        public Integer total;
        public List<MutualUserStructV2> user_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(102138);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MutualStructV2 build() {
            return new MutualStructV2(this.mutual_type, this.user_list, this.total, super.buildUnknownFields());
        }

        public final Builder mutual_type(Integer num) {
            this.mutual_type = num;
            return this;
        }

        public final Builder total(Integer num) {
            this.total = num;
            return this;
        }

        public final Builder user_list(List<MutualUserStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.user_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102137);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MutualStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MutualStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.mutual_type = this.mutual_type;
        builder.user_list = Internal.copyOf("user_list", this.user_list);
        builder.total = this.total;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.mutual_type;
        int i4 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((hashCode + i2) * 37) + this.user_list.hashCode()) * 37;
        Integer num2 = this.total;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        int i5 = hashCode2 + i4;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mutual_type != null) {
            sb.append(", mutual_type=").append(this.mutual_type);
        }
        if (!this.user_list.isEmpty()) {
            sb.append(", user_list=").append(this.user_list);
        }
        if (this.total != null) {
            sb.append(", total=").append(this.total);
        }
        return sb.replace(0, 2, "MutualStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutualStructV2)) {
            return false;
        }
        MutualStructV2 mutualStructV2 = (MutualStructV2) obj;
        if (!unknownFields().equals(mutualStructV2.unknownFields()) || !Internal.equals(this.mutual_type, mutualStructV2.mutual_type) || !this.user_list.equals(mutualStructV2.user_list) || !Internal.equals(this.total, mutualStructV2.total)) {
            return false;
        }
        return true;
    }

    public MutualStructV2(Integer num, List<MutualUserStructV2> list, Integer num2) {
        this(num, list, num2, i.EMPTY);
    }

    public MutualStructV2(Integer num, List<MutualUserStructV2> list, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.mutual_type = num;
        this.user_list = Internal.immutableCopyOf("user_list", list);
        this.total = num2;
    }
}
