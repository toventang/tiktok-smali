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

public final class LiveHonorStructV2 extends Message<LiveHonorStructV2, Builder> {
    public static final ProtoAdapter<LiveHonorStructV2> ADAPTER = new ProtoAdapter_LiveHonorStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 badge_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer honor_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long honor_score;

    public LiveHonorStructV2() {
    }

    static final class ProtoAdapter_LiveHonorStructV2 extends ProtoAdapter<LiveHonorStructV2> {
        static {
            Covode.recordClassIndex(102079);
        }

        public ProtoAdapter_LiveHonorStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveHonorStructV2.class);
        }

        public final int encodedSize(LiveHonorStructV2 liveHonorStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, liveHonorStructV2.honor_level) + ProtoAdapter.INT64.encodedSizeWithTag(2, liveHonorStructV2.honor_score) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, liveHonorStructV2.badge_thumb) + liveHonorStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LiveHonorStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.honor_level(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.honor_score(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.badge_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LiveHonorStructV2 liveHonorStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, liveHonorStructV2.honor_level);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, liveHonorStructV2.honor_score);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, liveHonorStructV2.badge_thumb);
            protoWriter.writeBytes(liveHonorStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<LiveHonorStructV2, Builder> {
        public UrlStructV2 badge_thumb;
        public Integer honor_level;
        public Long honor_score;

        static {
            Covode.recordClassIndex(102078);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LiveHonorStructV2 build() {
            return new LiveHonorStructV2(this.honor_level, this.honor_score, this.badge_thumb, super.buildUnknownFields());
        }

        public final Builder badge_thumb(UrlStructV2 urlStructV2) {
            this.badge_thumb = urlStructV2;
            return this;
        }

        public final Builder honor_level(Integer num) {
            this.honor_level = num;
            return this;
        }

        public final Builder honor_score(Long l2) {
            this.honor_score = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102077);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.LiveHonorStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LiveHonorStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.honor_level = this.honor_level;
        builder.honor_score = this.honor_score;
        builder.badge_thumb = this.badge_thumb;
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
        Integer num = this.honor_level;
        int i5 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        Long l2 = this.honor_score;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        UrlStructV2 urlStructV2 = this.badge_thumb;
        if (urlStructV2 != null) {
            i5 = urlStructV2.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.honor_level != null) {
            sb.append(", honor_level=").append(this.honor_level);
        }
        if (this.honor_score != null) {
            sb.append(", honor_score=").append(this.honor_score);
        }
        if (this.badge_thumb != null) {
            sb.append(", badge_thumb=").append(this.badge_thumb);
        }
        return sb.replace(0, 2, "LiveHonorStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveHonorStructV2)) {
            return false;
        }
        LiveHonorStructV2 liveHonorStructV2 = (LiveHonorStructV2) obj;
        if (!unknownFields().equals(liveHonorStructV2.unknownFields()) || !Internal.equals(this.honor_level, liveHonorStructV2.honor_level) || !Internal.equals(this.honor_score, liveHonorStructV2.honor_score) || !Internal.equals(this.badge_thumb, liveHonorStructV2.badge_thumb)) {
            return false;
        }
        return true;
    }

    public LiveHonorStructV2(Integer num, Long l2, UrlStructV2 urlStructV2) {
        this(num, l2, urlStructV2, i.EMPTY);
    }

    public LiveHonorStructV2(Integer num, Long l2, UrlStructV2 urlStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.honor_level = num;
        this.honor_score = l2;
        this.badge_thumb = urlStructV2;
    }
}
