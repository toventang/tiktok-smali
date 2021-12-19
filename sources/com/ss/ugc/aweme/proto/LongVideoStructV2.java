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
import k.i;

public final class LongVideoStructV2 extends Message<LongVideoStructV2, Builder> {
    public static final ProtoAdapter<LongVideoStructV2> ADAPTER = new ProtoAdapter_LongVideoStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.AudioStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public AudioStructV2 audio;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer long_video_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public Double trailer_start_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoStructV2#ADAPTER", tag = 1)
    public VideoStructV2 video;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoControlV2#ADAPTER", tag = 4)
    public VideoControlV2 video_control;

    public LongVideoStructV2() {
    }

    static final class ProtoAdapter_LongVideoStructV2 extends ProtoAdapter<LongVideoStructV2> {
        static {
            Covode.recordClassIndex(102085);
        }

        public ProtoAdapter_LongVideoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LongVideoStructV2.class);
        }

        public final int encodedSize(LongVideoStructV2 longVideoStructV2) {
            return VideoStructV2.ADAPTER.encodedSizeWithTag(1, longVideoStructV2.video) + ProtoAdapter.INT32.encodedSizeWithTag(2, longVideoStructV2.long_video_type) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, longVideoStructV2.trailer_start_time) + VideoControlV2.ADAPTER.encodedSizeWithTag(4, longVideoStructV2.video_control) + AudioStructV2.ADAPTER.encodedSizeWithTag(5, longVideoStructV2.audio) + longVideoStructV2.unknownFields().size();
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
                } else if (nextTag == 3) {
                    builder.trailer_start_time(ProtoAdapter.DOUBLE.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.video_control(VideoControlV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.audio(AudioStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LongVideoStructV2 longVideoStructV2) {
            VideoStructV2.ADAPTER.encodeWithTag(protoWriter, 1, longVideoStructV2.video);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, longVideoStructV2.long_video_type);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, longVideoStructV2.trailer_start_time);
            VideoControlV2.ADAPTER.encodeWithTag(protoWriter, 4, longVideoStructV2.video_control);
            AudioStructV2.ADAPTER.encodeWithTag(protoWriter, 5, longVideoStructV2.audio);
            protoWriter.writeBytes(longVideoStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102083);
    }

    public static final class Builder extends Message.Builder<LongVideoStructV2, Builder> {
        public AudioStructV2 audio;
        public Integer long_video_type;
        public Double trailer_start_time;
        public VideoStructV2 video;
        public VideoControlV2 video_control;

        static {
            Covode.recordClassIndex(102084);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LongVideoStructV2 build() {
            return new LongVideoStructV2(this.video, this.long_video_type, this.trailer_start_time, this.video_control, this.audio, super.buildUnknownFields());
        }

        public final Builder audio(AudioStructV2 audioStructV2) {
            this.audio = audioStructV2;
            return this;
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

        public final Builder video_control(VideoControlV2 videoControlV2) {
            this.video_control = videoControlV2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.LongVideoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LongVideoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.video = this.video;
        builder.long_video_type = this.long_video_type;
        builder.trailer_start_time = this.trailer_start_time;
        builder.video_control = this.video_control;
        builder.audio = this.audio;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        VideoStructV2 videoStructV2 = this.video;
        int i7 = 0;
        if (videoStructV2 != null) {
            i2 = videoStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        Integer num = this.long_video_type;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        Double d2 = this.trailer_start_time;
        if (d2 != null) {
            i4 = d2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        VideoControlV2 videoControlV2 = this.video_control;
        if (videoControlV2 != null) {
            i5 = videoControlV2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        AudioStructV2 audioStructV2 = this.audio;
        if (audioStructV2 != null) {
            i7 = audioStructV2.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
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
        if (this.video_control != null) {
            sb.append(", video_control=").append(this.video_control);
        }
        if (this.audio != null) {
            sb.append(", audio=").append(this.audio);
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
        if (!unknownFields().equals(longVideoStructV2.unknownFields()) || !Internal.equals(this.video, longVideoStructV2.video) || !Internal.equals(this.long_video_type, longVideoStructV2.long_video_type) || !Internal.equals(this.trailer_start_time, longVideoStructV2.trailer_start_time) || !Internal.equals(this.video_control, longVideoStructV2.video_control) || !Internal.equals(this.audio, longVideoStructV2.audio)) {
            return false;
        }
        return true;
    }

    public LongVideoStructV2(VideoStructV2 videoStructV2, Integer num, Double d2, VideoControlV2 videoControlV2, AudioStructV2 audioStructV2) {
        this(videoStructV2, num, d2, videoControlV2, audioStructV2, i.EMPTY);
    }

    public LongVideoStructV2(VideoStructV2 videoStructV2, Integer num, Double d2, VideoControlV2 videoControlV2, AudioStructV2 audioStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.video = videoStructV2;
        this.long_video_type = num;
        this.trailer_start_time = d2;
        this.video_control = videoControlV2;
        this.audio = audioStructV2;
    }
}
