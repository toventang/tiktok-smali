package tiktok.kids.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class AwemeStatisticsStructV2 extends Message<AwemeStatisticsStructV2, Builder> {
    public static final ProtoAdapter<AwemeStatisticsStructV2> ADAPTER = new ProtoAdapter_AwemeStatisticsStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long digg_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer lose_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long play_count;

    public AwemeStatisticsStructV2() {
    }

    static final class ProtoAdapter_AwemeStatisticsStructV2 extends ProtoAdapter<AwemeStatisticsStructV2> {
        static {
            Covode.recordClassIndex(106728);
        }

        public ProtoAdapter_AwemeStatisticsStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStatisticsStructV2.class);
        }

        public final int encodedSize(AwemeStatisticsStructV2 awemeStatisticsStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStatisticsStructV2.aweme_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, awemeStatisticsStructV2.digg_count) + ProtoAdapter.INT64.encodedSizeWithTag(3, awemeStatisticsStructV2.play_count) + ProtoAdapter.INT32.encodedSizeWithTag(4, awemeStatisticsStructV2.lose_count) + awemeStatisticsStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeStatisticsStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.aweme_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.digg_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.play_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.lose_count(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeStatisticsStructV2 awemeStatisticsStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStatisticsStructV2.aweme_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, awemeStatisticsStructV2.digg_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, awemeStatisticsStructV2.play_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, awemeStatisticsStructV2.lose_count);
            protoWriter.writeBytes(awemeStatisticsStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106726);
    }

    public static final class Builder extends Message.Builder<AwemeStatisticsStructV2, Builder> {
        public String aweme_id;
        public Long digg_count;
        public Integer lose_count;
        public Long play_count;

        static {
            Covode.recordClassIndex(106727);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeStatisticsStructV2 build() {
            return new AwemeStatisticsStructV2(this.aweme_id, this.digg_count, this.play_count, this.lose_count, super.buildUnknownFields());
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder digg_count(Long l2) {
            this.digg_count = l2;
            return this;
        }

        public final Builder lose_count(Integer num) {
            this.lose_count = num;
            return this;
        }

        public final Builder play_count(Long l2) {
            this.play_count = l2;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.AwemeStatisticsStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeStatisticsStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.digg_count = this.digg_count;
        builder.play_count = this.play_count;
        builder.lose_count = this.lose_count;
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
        String str = this.aweme_id;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Long l2 = this.digg_count;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Long l3 = this.play_count;
        if (l3 != null) {
            i4 = l3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        Integer num = this.lose_count;
        if (num != null) {
            i6 = num.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=").append(this.digg_count);
        }
        if (this.play_count != null) {
            sb.append(", play_count=").append(this.play_count);
        }
        if (this.lose_count != null) {
            sb.append(", lose_count=").append(this.lose_count);
        }
        return sb.replace(0, 2, "AwemeStatisticsStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStatisticsStructV2)) {
            return false;
        }
        AwemeStatisticsStructV2 awemeStatisticsStructV2 = (AwemeStatisticsStructV2) obj;
        if (!unknownFields().equals(awemeStatisticsStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStatisticsStructV2.aweme_id) || !Internal.equals(this.digg_count, awemeStatisticsStructV2.digg_count) || !Internal.equals(this.play_count, awemeStatisticsStructV2.play_count) || !Internal.equals(this.lose_count, awemeStatisticsStructV2.lose_count)) {
            return false;
        }
        return true;
    }

    public AwemeStatisticsStructV2(String str, Long l2, Long l3, Integer num) {
        this(str, l2, l3, num, i.EMPTY);
    }

    public AwemeStatisticsStructV2(String str, Long l2, Long l3, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.aweme_id = str;
        this.digg_count = l2;
        this.play_count = l3;
        this.lose_count = num;
    }
}
