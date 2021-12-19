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

public final class StoryMetadataV2 extends Message<StoryMetadataV2, Builder> {
    public static final ProtoAdapter<StoryMetadataV2> ADAPTER = new ProtoAdapter_StoryMetadataV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public Boolean chat_disabled;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public Long expired_at;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public Boolean is_official;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public Long total_comments;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public Boolean viewed;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Long viewer_count;

    public StoryMetadataV2() {
    }

    static final class ProtoAdapter_StoryMetadataV2 extends ProtoAdapter<StoryMetadataV2> {
        static {
            Covode.recordClassIndex(102226);
        }

        public ProtoAdapter_StoryMetadataV2() {
            super(FieldEncoding.LENGTH_DELIMITED, StoryMetadataV2.class);
        }

        public final int encodedSize(StoryMetadataV2 storyMetadataV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, storyMetadataV2.expired_at) + ProtoAdapter.BOOL.encodedSizeWithTag(2, storyMetadataV2.viewed) + ProtoAdapter.INT64.encodedSizeWithTag(3, storyMetadataV2.total_comments) + ProtoAdapter.BOOL.encodedSizeWithTag(10, storyMetadataV2.is_official) + ProtoAdapter.INT64.encodedSizeWithTag(11, storyMetadataV2.viewer_count) + ProtoAdapter.BOOL.encodedSizeWithTag(12, storyMetadataV2.chat_disabled) + storyMetadataV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StoryMetadataV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.expired_at(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.viewed(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 3) {
                    switch (nextTag) {
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.is_official(ProtoAdapter.BOOL.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.viewer_count(ProtoAdapter.INT64.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.chat_disabled(ProtoAdapter.BOOL.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    builder.total_comments(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StoryMetadataV2 storyMetadataV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, storyMetadataV2.expired_at);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, storyMetadataV2.viewed);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, storyMetadataV2.total_comments);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, storyMetadataV2.is_official);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, storyMetadataV2.viewer_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, storyMetadataV2.chat_disabled);
            protoWriter.writeBytes(storyMetadataV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102224);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.StoryMetadataV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StoryMetadataV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.expired_at = this.expired_at;
        builder.viewed = this.viewed;
        builder.total_comments = this.total_comments;
        builder.is_official = this.is_official;
        builder.viewer_count = this.viewer_count;
        builder.chat_disabled = this.chat_disabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<StoryMetadataV2, Builder> {
        public Boolean chat_disabled;
        public Long expired_at;
        public Boolean is_official;
        public Long total_comments;
        public Boolean viewed;
        public Long viewer_count;

        static {
            Covode.recordClassIndex(102225);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StoryMetadataV2 build() {
            Long l2 = this.expired_at;
            if (l2 != null && this.viewed != null && this.total_comments != null) {
                return new StoryMetadataV2(this.expired_at, this.viewed, this.total_comments, this.is_official, this.viewer_count, this.chat_disabled, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "expired_at", this.viewed, "viewed", this.total_comments, "total_comments");
        }

        public final Builder chat_disabled(Boolean bool) {
            this.chat_disabled = bool;
            return this;
        }

        public final Builder expired_at(Long l2) {
            this.expired_at = l2;
            return this;
        }

        public final Builder is_official(Boolean bool) {
            this.is_official = bool;
            return this;
        }

        public final Builder total_comments(Long l2) {
            this.total_comments = l2;
            return this;
        }

        public final Builder viewed(Boolean bool) {
            this.viewed = bool;
            return this;
        }

        public final Builder viewer_count(Long l2) {
            this.viewer_count = l2;
            return this;
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = ((((((unknownFields().hashCode() * 37) + this.expired_at.hashCode()) * 37) + this.viewed.hashCode()) * 37) + this.total_comments.hashCode()) * 37;
        Boolean bool = this.is_official;
        int i5 = 0;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        Long l2 = this.viewer_count;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Boolean bool2 = this.chat_disabled;
        if (bool2 != null) {
            i5 = bool2.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", expired_at=").append(this.expired_at);
        sb.append(", viewed=").append(this.viewed);
        sb.append(", total_comments=").append(this.total_comments);
        if (this.is_official != null) {
            sb.append(", is_official=").append(this.is_official);
        }
        if (this.viewer_count != null) {
            sb.append(", viewer_count=").append(this.viewer_count);
        }
        if (this.chat_disabled != null) {
            sb.append(", chat_disabled=").append(this.chat_disabled);
        }
        return sb.replace(0, 2, "StoryMetadataV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoryMetadataV2)) {
            return false;
        }
        StoryMetadataV2 storyMetadataV2 = (StoryMetadataV2) obj;
        if (!unknownFields().equals(storyMetadataV2.unknownFields()) || !this.expired_at.equals(storyMetadataV2.expired_at) || !this.viewed.equals(storyMetadataV2.viewed) || !this.total_comments.equals(storyMetadataV2.total_comments) || !Internal.equals(this.is_official, storyMetadataV2.is_official) || !Internal.equals(this.viewer_count, storyMetadataV2.viewer_count) || !Internal.equals(this.chat_disabled, storyMetadataV2.chat_disabled)) {
            return false;
        }
        return true;
    }

    public StoryMetadataV2(Long l2, Boolean bool, Long l3, Boolean bool2, Long l4, Boolean bool3) {
        this(l2, bool, l3, bool2, l4, bool3, i.EMPTY);
    }

    public StoryMetadataV2(Long l2, Boolean bool, Long l3, Boolean bool2, Long l4, Boolean bool3, i iVar) {
        super(ADAPTER, iVar);
        this.expired_at = l2;
        this.viewed = bool;
        this.total_comments = l3;
        this.is_official = bool2;
        this.viewer_count = l4;
        this.chat_disabled = bool3;
    }
}
