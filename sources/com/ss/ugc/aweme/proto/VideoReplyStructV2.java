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

public final class VideoReplyStructV2 extends Message<VideoReplyStructV2, Builder> {
    public static final ProtoAdapter<VideoReplyStructV2> ADAPTER = new ProtoAdapter_VideoReplyStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long alias_comment_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer collect_stat;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long comment_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String comment_msg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long comment_user_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public UrlStructV2 user_avatar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String user_name;

    public VideoReplyStructV2() {
    }

    static final class ProtoAdapter_VideoReplyStructV2 extends ProtoAdapter<VideoReplyStructV2> {
        static {
            Covode.recordClassIndex(102274);
        }

        public ProtoAdapter_VideoReplyStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoReplyStructV2.class);
        }

        public final int encodedSize(VideoReplyStructV2 videoReplyStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, videoReplyStructV2.aweme_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, videoReplyStructV2.comment_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, videoReplyStructV2.alias_comment_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, videoReplyStructV2.user_name) + ProtoAdapter.STRING.encodedSizeWithTag(5, videoReplyStructV2.comment_msg) + ProtoAdapter.INT64.encodedSizeWithTag(6, videoReplyStructV2.comment_user_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, videoReplyStructV2.user_avatar) + ProtoAdapter.INT32.encodedSizeWithTag(8, videoReplyStructV2.collect_stat) + videoReplyStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VideoReplyStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.comment_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.alias_comment_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.user_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.comment_msg(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.comment_user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.user_avatar(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.collect_stat(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, VideoReplyStructV2 videoReplyStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, videoReplyStructV2.aweme_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, videoReplyStructV2.comment_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, videoReplyStructV2.alias_comment_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoReplyStructV2.user_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoReplyStructV2.comment_msg);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, videoReplyStructV2.comment_user_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, videoReplyStructV2.user_avatar);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, videoReplyStructV2.collect_stat);
            protoWriter.writeBytes(videoReplyStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102272);
    }

    public static final class Builder extends Message.Builder<VideoReplyStructV2, Builder> {
        public Long alias_comment_id;
        public Long aweme_id;
        public Integer collect_stat;
        public Long comment_id;
        public String comment_msg;
        public Long comment_user_id;
        public UrlStructV2 user_avatar;
        public String user_name;

        static {
            Covode.recordClassIndex(102273);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VideoReplyStructV2 build() {
            return new VideoReplyStructV2(this.aweme_id, this.comment_id, this.alias_comment_id, this.user_name, this.comment_msg, this.comment_user_id, this.user_avatar, this.collect_stat, super.buildUnknownFields());
        }

        public final Builder alias_comment_id(Long l2) {
            this.alias_comment_id = l2;
            return this;
        }

        public final Builder aweme_id(Long l2) {
            this.aweme_id = l2;
            return this;
        }

        public final Builder collect_stat(Integer num) {
            this.collect_stat = num;
            return this;
        }

        public final Builder comment_id(Long l2) {
            this.comment_id = l2;
            return this;
        }

        public final Builder comment_msg(String str) {
            this.comment_msg = str;
            return this;
        }

        public final Builder comment_user_id(Long l2) {
            this.comment_user_id = l2;
            return this;
        }

        public final Builder user_avatar(UrlStructV2 urlStructV2) {
            this.user_avatar = urlStructV2;
            return this;
        }

        public final Builder user_name(String str) {
            this.user_name = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VideoReplyStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VideoReplyStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.comment_id = this.comment_id;
        builder.alias_comment_id = this.alias_comment_id;
        builder.user_name = this.user_name;
        builder.comment_msg = this.comment_msg;
        builder.comment_user_id = this.comment_user_id;
        builder.user_avatar = this.user_avatar;
        builder.collect_stat = this.collect_stat;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.aweme_id;
        int i10 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 37;
        Long l3 = this.comment_id;
        if (l3 != null) {
            i3 = l3.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        Long l4 = this.alias_comment_id;
        if (l4 != null) {
            i4 = l4.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        String str = this.user_name;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        String str2 = this.comment_msg;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        Long l5 = this.comment_user_id;
        if (l5 != null) {
            i7 = l5.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        UrlStructV2 urlStructV2 = this.user_avatar;
        if (urlStructV2 != null) {
            i8 = urlStructV2.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        Integer num = this.collect_stat;
        if (num != null) {
            i10 = num.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.comment_id != null) {
            sb.append(", comment_id=").append(this.comment_id);
        }
        if (this.alias_comment_id != null) {
            sb.append(", alias_comment_id=").append(this.alias_comment_id);
        }
        if (this.user_name != null) {
            sb.append(", user_name=").append(this.user_name);
        }
        if (this.comment_msg != null) {
            sb.append(", comment_msg=").append(this.comment_msg);
        }
        if (this.comment_user_id != null) {
            sb.append(", comment_user_id=").append(this.comment_user_id);
        }
        if (this.user_avatar != null) {
            sb.append(", user_avatar=").append(this.user_avatar);
        }
        if (this.collect_stat != null) {
            sb.append(", collect_stat=").append(this.collect_stat);
        }
        return sb.replace(0, 2, "VideoReplyStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoReplyStructV2)) {
            return false;
        }
        VideoReplyStructV2 videoReplyStructV2 = (VideoReplyStructV2) obj;
        if (!unknownFields().equals(videoReplyStructV2.unknownFields()) || !Internal.equals(this.aweme_id, videoReplyStructV2.aweme_id) || !Internal.equals(this.comment_id, videoReplyStructV2.comment_id) || !Internal.equals(this.alias_comment_id, videoReplyStructV2.alias_comment_id) || !Internal.equals(this.user_name, videoReplyStructV2.user_name) || !Internal.equals(this.comment_msg, videoReplyStructV2.comment_msg) || !Internal.equals(this.comment_user_id, videoReplyStructV2.comment_user_id) || !Internal.equals(this.user_avatar, videoReplyStructV2.user_avatar) || !Internal.equals(this.collect_stat, videoReplyStructV2.collect_stat)) {
            return false;
        }
        return true;
    }

    public VideoReplyStructV2(Long l2, Long l3, Long l4, String str, String str2, Long l5, UrlStructV2 urlStructV2, Integer num) {
        this(l2, l3, l4, str, str2, l5, urlStructV2, num, i.EMPTY);
    }

    public VideoReplyStructV2(Long l2, Long l3, Long l4, String str, String str2, Long l5, UrlStructV2 urlStructV2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.aweme_id = l2;
        this.comment_id = l3;
        this.alias_comment_id = l4;
        this.user_name = str;
        this.comment_msg = str2;
        this.comment_user_id = l5;
        this.user_avatar = urlStructV2;
        this.collect_stat = num;
    }
}
