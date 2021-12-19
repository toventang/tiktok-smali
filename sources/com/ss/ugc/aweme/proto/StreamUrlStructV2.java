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

public final class StreamUrlStructV2 extends Message<StreamUrlStructV2, Builder> {
    public static final ProtoAdapter<StreamUrlStructV2> ADAPTER = new ProtoAdapter_StreamUrlStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer provider;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String rtmp_pull_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String rtmp_push_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long sid;

    public StreamUrlStructV2() {
    }

    static final class ProtoAdapter_StreamUrlStructV2 extends ProtoAdapter<StreamUrlStructV2> {
        static {
            Covode.recordClassIndex(102229);
        }

        public ProtoAdapter_StreamUrlStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, StreamUrlStructV2.class);
        }

        public final int encodedSize(StreamUrlStructV2 streamUrlStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, streamUrlStructV2.sid) + ProtoAdapter.STRING.encodedSizeWithTag(2, streamUrlStructV2.rtmp_pull_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, streamUrlStructV2.rtmp_push_url) + ProtoAdapter.INT32.encodedSizeWithTag(4, streamUrlStructV2.provider) + ProtoAdapter.STRING.encodedSizeWithTag(5, streamUrlStructV2.extra) + ProtoAdapter.STRING.encodedSizeWithTag(6, streamUrlStructV2.id) + streamUrlStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StreamUrlStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.sid(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.rtmp_pull_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.rtmp_push_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.provider(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.id(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, StreamUrlStructV2 streamUrlStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, streamUrlStructV2.sid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, streamUrlStructV2.rtmp_pull_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, streamUrlStructV2.rtmp_push_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, streamUrlStructV2.provider);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, streamUrlStructV2.extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, streamUrlStructV2.id);
            protoWriter.writeBytes(streamUrlStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102227);
    }

    public static final class Builder extends Message.Builder<StreamUrlStructV2, Builder> {
        public String extra;
        public String id;
        public Integer provider;
        public String rtmp_pull_url;
        public String rtmp_push_url;
        public Long sid;

        static {
            Covode.recordClassIndex(102228);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StreamUrlStructV2 build() {
            return new StreamUrlStructV2(this.sid, this.rtmp_pull_url, this.rtmp_push_url, this.provider, this.extra, this.id, super.buildUnknownFields());
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder provider(Integer num) {
            this.provider = num;
            return this;
        }

        public final Builder rtmp_pull_url(String str) {
            this.rtmp_pull_url = str;
            return this;
        }

        public final Builder rtmp_push_url(String str) {
            this.rtmp_push_url = str;
            return this;
        }

        public final Builder sid(Long l2) {
            this.sid = l2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.StreamUrlStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StreamUrlStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.sid = this.sid;
        builder.rtmp_pull_url = this.rtmp_pull_url;
        builder.rtmp_push_url = this.rtmp_push_url;
        builder.provider = this.provider;
        builder.extra = this.extra;
        builder.id = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.sid;
        int i8 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        String str = this.rtmp_pull_url;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        String str2 = this.rtmp_push_url;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        Integer num = this.provider;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        String str3 = this.extra;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        String str4 = this.id;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        int i14 = i13 + i8;
        this.hashCode = i14;
        return i14;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sid != null) {
            sb.append(", sid=").append(this.sid);
        }
        if (this.rtmp_pull_url != null) {
            sb.append(", rtmp_pull_url=").append(this.rtmp_pull_url);
        }
        if (this.rtmp_push_url != null) {
            sb.append(", rtmp_push_url=").append(this.rtmp_push_url);
        }
        if (this.provider != null) {
            sb.append(", provider=").append(this.provider);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        return sb.replace(0, 2, "StreamUrlStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamUrlStructV2)) {
            return false;
        }
        StreamUrlStructV2 streamUrlStructV2 = (StreamUrlStructV2) obj;
        if (!unknownFields().equals(streamUrlStructV2.unknownFields()) || !Internal.equals(this.sid, streamUrlStructV2.sid) || !Internal.equals(this.rtmp_pull_url, streamUrlStructV2.rtmp_pull_url) || !Internal.equals(this.rtmp_push_url, streamUrlStructV2.rtmp_push_url) || !Internal.equals(this.provider, streamUrlStructV2.provider) || !Internal.equals(this.extra, streamUrlStructV2.extra) || !Internal.equals(this.id, streamUrlStructV2.id)) {
            return false;
        }
        return true;
    }

    public StreamUrlStructV2(Long l2, String str, String str2, Integer num, String str3, String str4) {
        this(l2, str, str2, num, str3, str4, i.EMPTY);
    }

    public StreamUrlStructV2(Long l2, String str, String str2, Integer num, String str3, String str4, i iVar) {
        super(ADAPTER, iVar);
        this.sid = l2;
        this.rtmp_pull_url = str;
        this.rtmp_push_url = str2;
        this.provider = num;
        this.extra = str3;
        this.id = str4;
    }
}
