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

public final class LongVideoStructV2 extends Message<LongVideoStructV2, Builder> {
    public static final ProtoAdapter<LongVideoStructV2> ADAPTER = new ProtoAdapter_LongVideoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer long_video_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public Double trailer_start_time;
    @WireField(adapter = "tiktok.kids.proto.VideoStructV2#ADAPTER", tag = 1)
    public VideoStructV2 video;

    public LongVideoStructV2() {
    }

    static final class ProtoAdapter_LongVideoStructV2 extends ProtoAdapter<LongVideoStructV2> {
        static {
            Covode.recordClassIndex(106752);
        }

        public ProtoAdapter_LongVideoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LongVideoStructV2.class);
        }

        public final int encodedSize(LongVideoStructV2 longVideoStructV2) {
            return VideoStructV2.ADAPTER.encodedSizeWithTag(1, longVideoStructV2.video) + ProtoAdapter.INT32.encodedSizeWithTag(2, longVideoStructV2.long_video_type) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, longVideoStructV2.trailer_start_time) + longVideoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LongVideoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.video(VideoStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.long_video_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.trailer_start_time(ProtoAdapter.DOUBLE.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LongVideoStructV2 longVideoStructV2) {
            VideoStructV2.ADAPTER.encodeWithTag(protoWriter, 1, longVideoStructV2.video);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, longVideoStructV2.long_video_type);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, longVideoStructV2.trailer_start_time);
            protoWriter.writeBytes(longVideoStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<LongVideoStructV2, Builder> {
        public Integer long_video_type;
        public Double trailer_start_time;
        public VideoStructV2 video;

        static {
            Covode.recordClassIndex(106751);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LongVideoStructV2 build() {
            return new LongVideoStructV2(this.video, this.long_video_type, this.trailer_start_time, super.buildUnknownFields());
        }

        public final Builder long_video_type(Integer num) {
            this.long_video_type = num;
            return this;
        }

        public final Builder trailer_start_time(Double d2) {
            this.trailer_start_time = d2;
            return this;
        }

        public final Builder video(VideoStructV2 videoStructV2) {
            this.video = videoStructV2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(106750);
    }

    /* Return type fixed from 'tiktok.kids.proto.LongVideoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LongVideoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.video = this.video;
        builder.long_video_type = this.long_video_type;
        builder.trailer_start_time = this.trailer_start_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        VideoStructV2 videoStructV2 = this.video;
        int i5 = 0;
        if (videoStructV2 != null) {
            i2 = videoStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        Integer num = this.long_video_type;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Double d2 = this.trailer_start_time;
        if (d2 != null) {
            i5 = d2.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.video != null) {
            sb.append(", video=").append(this.video);
        }
        if (this.long_video_type != null) {
            sb.append(", long_video_type=").append(this.long_video_type);
        }
        if (this.trailer_start_time != null) {
            sb.append(", trailer_start_time=").append(this.trailer_start_time);
        }
        return sb.replace(0, 2, "LongVideoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongVideoStructV2)) {
            return false;
        }
        LongVideoStructV2 longVideoStructV2 = (LongVideoStructV2) obj;
        if (!unknownFields().equals(longVideoStructV2.unknownFields()) || !Internal.equals(this.video, longVideoStructV2.video) || !Internal.equals(this.long_video_type, longVideoStructV2.long_video_type) || !Internal.equals(this.trailer_start_time, longVideoStructV2.trailer_start_time)) {
            return false;
        }
        return true;
    }

    public LongVideoStructV2(VideoStructV2 videoStructV2, Integer num, Double d2) {
        this(videoStructV2, num, d2, i.EMPTY);
    }

    public LongVideoStructV2(VideoStructV2 videoStructV2, Integer num, Double d2, i iVar) {
        super(ADAPTER, iVar);
        this.video = videoStructV2;
        this.long_video_type = num;
        this.trailer_start_time = d2;
    }
}
