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

public final class ExtraStructV2 extends Message<ExtraStructV2, Builder> {
    public static final ProtoAdapter<ExtraStructV2> ADAPTER = new ProtoAdapter_ExtraStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 3)
    public List<String> fatal_item_ids;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String logid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long now;

    public ExtraStructV2() {
    }

    static final class ProtoAdapter_ExtraStructV2 extends ProtoAdapter<ExtraStructV2> {
        static {
            Covode.recordClassIndex(102007);
        }

        public ProtoAdapter_ExtraStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraStructV2.class);
        }

        public final int encodedSize(ExtraStructV2 extraStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, extraStructV2.now) + ProtoAdapter.STRING.encodedSizeWithTag(2, extraStructV2.logid) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, extraStructV2.fatal_item_ids) + extraStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ExtraStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.now(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.logid(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.fatal_item_ids.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ExtraStructV2 extraStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, extraStructV2.now);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extraStructV2.logid);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, extraStructV2.fatal_item_ids);
            protoWriter.writeBytes(extraStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ExtraStructV2, Builder> {
        public List<String> fatal_item_ids = Internal.newMutableList();
        public String logid;
        public Long now;

        static {
            Covode.recordClassIndex(102006);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ExtraStructV2 build() {
            return new ExtraStructV2(this.now, this.logid, this.fatal_item_ids, super.buildUnknownFields());
        }

        public final Builder logid(String str) {
            this.logid = str;
            return this;
        }

        public final Builder now(Long l2) {
            this.now = l2;
            return this;
        }

        public final Builder fatal_item_ids(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.fatal_item_ids = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102005);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ExtraStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ExtraStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.now = this.now;
        builder.logid = this.logid;
        builder.fatal_item_ids = Internal.copyOf("fatal_item_ids", this.fatal_item_ids);
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
        Long l2 = this.now;
        int i4 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.logid;
        if (str != null) {
            i4 = str.hashCode();
        }
        int hashCode2 = ((i5 + i4) * 37) + this.fatal_item_ids.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.now != null) {
            sb.append(", now=").append(this.now);
        }
        if (this.logid != null) {
            sb.append(", logid=").append(this.logid);
        }
        if (!this.fatal_item_ids.isEmpty()) {
            sb.append(", fatal_item_ids=").append(this.fatal_item_ids);
        }
        return sb.replace(0, 2, "ExtraStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtraStructV2)) {
            return false;
        }
        ExtraStructV2 extraStructV2 = (ExtraStructV2) obj;
        if (!unknownFields().equals(extraStructV2.unknownFields()) || !Internal.equals(this.now, extraStructV2.now) || !Internal.equals(this.logid, extraStructV2.logid) || !this.fatal_item_ids.equals(extraStructV2.fatal_item_ids)) {
            return false;
        }
        return true;
    }

    public ExtraStructV2(Long l2, String str, List<String> list) {
        this(l2, str, list, i.EMPTY);
    }

    public ExtraStructV2(Long l2, String str, List<String> list, i iVar) {
        super(ADAPTER, iVar);
        this.now = l2;
        this.logid = str;
        this.fatal_item_ids = Internal.immutableCopyOf("fatal_item_ids", list);
    }
}
