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

public final class VideoMuteStructV2 extends Message<VideoMuteStructV2, Builder> {
    public static final ProtoAdapter<VideoMuteStructV2> ADAPTER = new ProtoAdapter_VideoMuteStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean is_mute;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String mute_desc;

    public VideoMuteStructV2() {
    }

    static final class ProtoAdapter_VideoMuteStructV2 extends ProtoAdapter<VideoMuteStructV2> {
        static {
            Covode.recordClassIndex(102271);
        }

        public ProtoAdapter_VideoMuteStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoMuteStructV2.class);
        }

        public final int encodedSize(VideoMuteStructV2 videoMuteStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, videoMuteStructV2.is_mute) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoMuteStructV2.mute_desc) + videoMuteStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VideoMuteStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.is_mute(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.mute_desc(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VideoMuteStructV2 videoMuteStructV2) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, videoMuteStructV2.is_mute);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoMuteStructV2.mute_desc);
            protoWriter.writeBytes(videoMuteStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<VideoMuteStructV2, Builder> {
        public Boolean is_mute;
        public String mute_desc;

        static {
            Covode.recordClassIndex(102270);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VideoMuteStructV2 build() {
            return new VideoMuteStructV2(this.is_mute, this.mute_desc, super.buildUnknownFields());
        }

        public final Builder is_mute(Boolean bool) {
            this.is_mute = bool;
            return this;
        }

        public final Builder mute_desc(String str) {
            this.mute_desc = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102269);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VideoMuteStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VideoMuteStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.is_mute = this.is_mute;
        builder.mute_desc = this.mute_desc;
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
        Boolean bool = this.is_mute;
        int i4 = 0;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.mute_desc;
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
        if (this.is_mute != null) {
            sb.append(", is_mute=").append(this.is_mute);
        }
        if (this.mute_desc != null) {
            sb.append(", mute_desc=").append(this.mute_desc);
        }
        return sb.replace(0, 2, "VideoMuteStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoMuteStructV2)) {
            return false;
        }
        VideoMuteStructV2 videoMuteStructV2 = (VideoMuteStructV2) obj;
        if (!unknownFields().equals(videoMuteStructV2.unknownFields()) || !Internal.equals(this.is_mute, videoMuteStructV2.is_mute) || !Internal.equals(this.mute_desc, videoMuteStructV2.mute_desc)) {
            return false;
        }
        return true;
    }

    public VideoMuteStructV2(Boolean bool, String str) {
        this(bool, str, i.EMPTY);
    }

    public VideoMuteStructV2(Boolean bool, String str, i iVar) {
        super(ADAPTER, iVar);
        this.is_mute = bool;
        this.mute_desc = str;
    }
}
