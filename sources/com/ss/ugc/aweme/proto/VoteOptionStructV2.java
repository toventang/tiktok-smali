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

public final class VoteOptionStructV2 extends Message<VoteOptionStructV2, Builder> {
    public static final ProtoAdapter<VoteOptionStructV2> ADAPTER = new ProtoAdapter_VoteOptionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String option;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long option_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String option_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long vote_count;

    public VoteOptionStructV2() {
    }

    static final class ProtoAdapter_VoteOptionStructV2 extends ProtoAdapter<VoteOptionStructV2> {
        static {
            Covode.recordClassIndex(102289);
        }

        public ProtoAdapter_VoteOptionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VoteOptionStructV2.class);
        }

        public final int encodedSize(VoteOptionStructV2 voteOptionStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, voteOptionStructV2.option_text) + ProtoAdapter.INT64.encodedSizeWithTag(2, voteOptionStructV2.option_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, voteOptionStructV2.vote_count) + ProtoAdapter.STRING.encodedSizeWithTag(4, voteOptionStructV2.option) + voteOptionStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VoteOptionStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.option_text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.option_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.vote_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.option(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VoteOptionStructV2 voteOptionStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, voteOptionStructV2.option_text);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, voteOptionStructV2.option_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, voteOptionStructV2.vote_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, voteOptionStructV2.option);
            protoWriter.writeBytes(voteOptionStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102287);
    }

    public static final class Builder extends Message.Builder<VoteOptionStructV2, Builder> {
        public String option;
        public Long option_id;
        public String option_text;
        public Long vote_count;

        static {
            Covode.recordClassIndex(102288);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VoteOptionStructV2 build() {
            return new VoteOptionStructV2(this.option_text, this.option_id, this.vote_count, this.option, super.buildUnknownFields());
        }

        public final Builder option(String str) {
            this.option = str;
            return this;
        }

        public final Builder option_id(Long l2) {
            this.option_id = l2;
            return this;
        }

        public final Builder option_text(String str) {
            this.option_text = str;
            return this;
        }

        public final Builder vote_count(Long l2) {
            this.vote_count = l2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VoteOptionStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VoteOptionStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.option_text = this.option_text;
        builder.option_id = this.option_id;
        builder.vote_count = this.vote_count;
        builder.option = this.option;
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
        String str = this.option_text;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Long l2 = this.option_id;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Long l3 = this.vote_count;
        if (l3 != null) {
            i4 = l3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        String str2 = this.option;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.option_text != null) {
            sb.append(", option_text=").append(this.option_text);
        }
        if (this.option_id != null) {
            sb.append(", option_id=").append(this.option_id);
        }
        if (this.vote_count != null) {
            sb.append(", vote_count=").append(this.vote_count);
        }
        if (this.option != null) {
            sb.append(", option=").append(this.option);
        }
        return sb.replace(0, 2, "VoteOptionStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoteOptionStructV2)) {
            return false;
        }
        VoteOptionStructV2 voteOptionStructV2 = (VoteOptionStructV2) obj;
        if (!unknownFields().equals(voteOptionStructV2.unknownFields()) || !Internal.equals(this.option_text, voteOptionStructV2.option_text) || !Internal.equals(this.option_id, voteOptionStructV2.option_id) || !Internal.equals(this.vote_count, voteOptionStructV2.vote_count) || !Internal.equals(this.option, voteOptionStructV2.option)) {
            return false;
        }
        return true;
    }

    public VoteOptionStructV2(String str, Long l2, Long l3, String str2) {
        this(str, l2, l3, str2, i.EMPTY);
    }

    public VoteOptionStructV2(String str, Long l2, Long l3, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.option_text = str;
        this.option_id = l2;
        this.vote_count = l3;
        this.option = str2;
    }
}
