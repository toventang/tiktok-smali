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

public final class VideoTextStructV2 extends Message<VideoTextStructV2, Builder> {
    public static final ProtoAdapter<VideoTextStructV2> ADAPTER = new ProtoAdapter_VideoTextStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String color;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String color_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer type;

    public VideoTextStructV2() {
    }

    static final class ProtoAdapter_VideoTextStructV2 extends ProtoAdapter<VideoTextStructV2> {
        static {
            Covode.recordClassIndex(102280);
        }

        public ProtoAdapter_VideoTextStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoTextStructV2.class);
        }

        public final int encodedSize(VideoTextStructV2 videoTextStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, videoTextStructV2.text) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoTextStructV2.color) + ProtoAdapter.STRING.encodedSizeWithTag(3, videoTextStructV2.color_text) + ProtoAdapter.INT32.encodedSizeWithTag(4, videoTextStructV2.type) + videoTextStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VideoTextStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.color(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.color_text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VideoTextStructV2 videoTextStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoTextStructV2.text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoTextStructV2.color);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoTextStructV2.color_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, videoTextStructV2.type);
            protoWriter.writeBytes(videoTextStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102278);
    }

    public static final class Builder extends Message.Builder<VideoTextStructV2, Builder> {
        public String color;
        public String color_text;
        public String text;
        public Integer type;

        static {
            Covode.recordClassIndex(102279);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VideoTextStructV2 build() {
            return new VideoTextStructV2(this.text, this.color, this.color_text, this.type, super.buildUnknownFields());
        }

        public final Builder color(String str) {
            this.color = str;
            return this;
        }

        public final Builder color_text(String str) {
            this.color_text = str;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VideoTextStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VideoTextStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.color = this.color;
        builder.color_text = this.color_text;
        builder.type = this.type;
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
        String str = this.text;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str2 = this.color;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        String str3 = this.color_text;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        Integer num = this.type;
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
        if (this.text != null) {
            sb.append(", text=").append(this.text);
        }
        if (this.color != null) {
            sb.append(", color=").append(this.color);
        }
        if (this.color_text != null) {
            sb.append(", color_text=").append(this.color_text);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        return sb.replace(0, 2, "VideoTextStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoTextStructV2)) {
            return false;
        }
        VideoTextStructV2 videoTextStructV2 = (VideoTextStructV2) obj;
        if (!unknownFields().equals(videoTextStructV2.unknownFields()) || !Internal.equals(this.text, videoTextStructV2.text) || !Internal.equals(this.color, videoTextStructV2.color) || !Internal.equals(this.color_text, videoTextStructV2.color_text) || !Internal.equals(this.type, videoTextStructV2.type)) {
            return false;
        }
        return true;
    }

    public VideoTextStructV2(String str, String str2, String str3, Integer num) {
        this(str, str2, str3, num, i.EMPTY);
    }

    public VideoTextStructV2(String str, String str2, String str3, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.text = str;
        this.color = str2;
        this.color_text = str3;
        this.type = num;
    }
}
