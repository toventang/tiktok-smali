package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class UpvoteReasonV2 extends Message<UpvoteReasonV2, Builder> {
    public static final ProtoAdapter<UpvoteReasonV2> ADAPTER = new ProtoAdapter_UpvoteReasonV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long item_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer middle_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 3)
    public List<Long> middle_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer reason_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer sub_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long user_id;

    public UpvoteReasonV2() {
    }

    static final class ProtoAdapter_UpvoteReasonV2 extends ProtoAdapter<UpvoteReasonV2> {
        static {
            Covode.recordClassIndex(102247);
        }

        public ProtoAdapter_UpvoteReasonV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UpvoteReasonV2.class);
        }

        public final int encodedSize(UpvoteReasonV2 upvoteReasonV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, upvoteReasonV2.reason_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, upvoteReasonV2.sub_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, upvoteReasonV2.middle_info) + ProtoAdapter.INT32.encodedSizeWithTag(4, upvoteReasonV2.middle_count) + ProtoAdapter.INT64.encodedSizeWithTag(5, upvoteReasonV2.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(6, upvoteReasonV2.item_id) + upvoteReasonV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpvoteReasonV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.reason_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.sub_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.middle_info.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.middle_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.item_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UpvoteReasonV2 upvoteReasonV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, upvoteReasonV2.reason_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, upvoteReasonV2.sub_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 3, upvoteReasonV2.middle_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, upvoteReasonV2.middle_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, upvoteReasonV2.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, upvoteReasonV2.item_id);
            protoWriter.writeBytes(upvoteReasonV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102245);
    }

    public static final class Builder extends Message.Builder<UpvoteReasonV2, Builder> {
        public Long item_id;
        public Integer middle_count;
        public List<Long> middle_info = Internal.newMutableList();
        public Integer reason_type;
        public Integer sub_type;
        public Long user_id;

        static {
            Covode.recordClassIndex(102246);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpvoteReasonV2 build() {
            Long l2 = this.user_id;
            if (l2 != null) {
                return new UpvoteReasonV2(this.reason_type, this.sub_type, this.middle_info, this.middle_count, this.user_id, this.item_id, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "user_id");
        }

        public final Builder item_id(Long l2) {
            this.item_id = l2;
            return this;
        }

        public final Builder middle_count(Integer num) {
            this.middle_count = num;
            return this;
        }

        public final Builder reason_type(Integer num) {
            this.reason_type = num;
            return this;
        }

        public final Builder sub_type(Integer num) {
            this.sub_type = num;
            return this;
        }

        public final Builder user_id(Long l2) {
            this.user_id = l2;
            return this;
        }

        public final Builder middle_info(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.middle_info = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.UpvoteReasonV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpvoteReasonV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.reason_type = this.reason_type;
        builder.sub_type = this.sub_type;
        builder.middle_info = Internal.copyOf("middle_info", this.middle_info);
        builder.middle_count = this.middle_count;
        builder.user_id = this.user_id;
        builder.item_id = this.item_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.reason_type;
        int i6 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Integer num2 = this.sub_type;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((i7 + i3) * 37) + this.middle_info.hashCode()) * 37;
        Integer num3 = this.middle_count;
        if (num3 != null) {
            i4 = num3.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode3 = (((hashCode2 + i4) * 37) + this.user_id.hashCode()) * 37;
        Long l2 = this.item_id;
        if (l2 != null) {
            i6 = l2.hashCode();
        }
        int i8 = hashCode3 + i6;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.reason_type != null) {
            sb.append(", reason_type=").append(this.reason_type);
        }
        if (this.sub_type != null) {
            sb.append(", sub_type=").append(this.sub_type);
        }
        if (!this.middle_info.isEmpty()) {
            sb.append(", middle_info=").append(this.middle_info);
        }
        if (this.middle_count != null) {
            sb.append(", middle_count=").append(this.middle_count);
        }
        sb.append(", user_id=").append(this.user_id);
        if (this.item_id != null) {
            sb.append(", item_id=").append(this.item_id);
        }
        return sb.replace(0, 2, "UpvoteReasonV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpvoteReasonV2)) {
            return false;
        }
        UpvoteReasonV2 upvoteReasonV2 = (UpvoteReasonV2) obj;
        if (!unknownFields().equals(upvoteReasonV2.unknownFields()) || !Internal.equals(this.reason_type, upvoteReasonV2.reason_type) || !Internal.equals(this.sub_type, upvoteReasonV2.sub_type) || !this.middle_info.equals(upvoteReasonV2.middle_info) || !Internal.equals(this.middle_count, upvoteReasonV2.middle_count) || !this.user_id.equals(upvoteReasonV2.user_id) || !Internal.equals(this.item_id, upvoteReasonV2.item_id)) {
            return false;
        }
        return true;
    }

    public UpvoteReasonV2(Integer num, Integer num2, List<Long> list, Integer num3, Long l2, Long l3) {
        this(num, num2, list, num3, l2, l3, i.EMPTY);
    }

    public UpvoteReasonV2(Integer num, Integer num2, List<Long> list, Integer num3, Long l2, Long l3, i iVar) {
        super(ADAPTER, iVar);
        this.reason_type = num;
        this.sub_type = num2;
        this.middle_info = Internal.immutableCopyOf("middle_info", list);
        this.middle_count = num3;
        this.user_id = l2;
        this.item_id = l3;
    }
}
