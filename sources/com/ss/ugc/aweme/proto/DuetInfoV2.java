package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

/* access modifiers changed from: package-private */
public final class DuetInfoV2 extends Message<DuetInfoV2, Builder> {
    public static final ProtoAdapter<DuetInfoV2> ADAPTER = new ProtoAdapter_DuetInfoV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long original_item_duetted_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String original_item_id;

    static final class ProtoAdapter_DuetInfoV2 extends ProtoAdapter<DuetInfoV2> {
        static {
            Covode.recordClassIndex(101992);
        }

        public ProtoAdapter_DuetInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DuetInfoV2.class);
        }

        public final int encodedSize(DuetInfoV2 duetInfoV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(2, duetInfoV2.original_item_duetted_count) + ProtoAdapter.STRING.encodedSizeWithTag(3, duetInfoV2.original_item_id) + duetInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DuetInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 2) {
                    builder.original_item_duetted_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.original_item_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DuetInfoV2 duetInfoV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, duetInfoV2.original_item_duetted_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, duetInfoV2.original_item_id);
            protoWriter.writeBytes(duetInfoV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DuetInfoV2, Builder> {
        public Long original_item_duetted_count;
        public String original_item_id;

        static {
            Covode.recordClassIndex(101991);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DuetInfoV2 build() {
            return new DuetInfoV2(this.original_item_duetted_count, this.original_item_id, super.buildUnknownFields());
        }

        public final Builder original_item_duetted_count(Long l2) {
            this.original_item_duetted_count = l2;
            return this;
        }

        public final Builder original_item_id(String str) {
            this.original_item_id = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101990);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.DuetInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DuetInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.original_item_duetted_count = this.original_item_duetted_count;
        builder.original_item_id = this.original_item_id;
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
        Long l2 = this.original_item_duetted_count;
        int i4 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.original_item_id;
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
        if (this.original_item_duetted_count != null) {
            sb.append(", original_item_duetted_count=").append(this.original_item_duetted_count);
        }
        if (this.original_item_id != null) {
            sb.append(", original_item_id=").append(this.original_item_id);
        }
        return sb.replace(0, 2, "DuetInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DuetInfoV2)) {
            return false;
        }
        DuetInfoV2 duetInfoV2 = (DuetInfoV2) obj;
        if (!unknownFields().equals(duetInfoV2.unknownFields()) || !Internal.equals(this.original_item_duetted_count, duetInfoV2.original_item_duetted_count) || !Internal.equals(this.original_item_id, duetInfoV2.original_item_id)) {
            return false;
        }
        return true;
    }

    public DuetInfoV2(Long l2, String str) {
        this(l2, str, i.EMPTY);
    }

    public DuetInfoV2(Long l2, String str, i iVar) {
        super(ADAPTER, iVar);
        this.original_item_duetted_count = l2;
        this.original_item_id = str;
    }
}
