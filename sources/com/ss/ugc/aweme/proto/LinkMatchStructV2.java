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
import java.util.List;
import k.i;

public final class LinkMatchStructV2 extends Message<LinkMatchStructV2, Builder> {
    public static final ProtoAdapter<LinkMatchStructV2> ADAPTER = new ProtoAdapter_LinkMatchStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.CaptionAnchorStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public CaptionAnchorStructV2 caption_anchor;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CaptionInfoStructV2#ADAPTER", tag = 4)
    public CaptionInfoStructV2 caption_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MatchInfoStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<MatchInfoStructV2> match_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer query_limit;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer total_limit;

    public LinkMatchStructV2() {
    }

    static final class ProtoAdapter_LinkMatchStructV2 extends ProtoAdapter<LinkMatchStructV2> {
        static {
            Covode.recordClassIndex(102070);
        }

        public ProtoAdapter_LinkMatchStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkMatchStructV2.class);
        }

        public final int encodedSize(LinkMatchStructV2 linkMatchStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, linkMatchStructV2.total_limit) + ProtoAdapter.INT32.encodedSizeWithTag(2, linkMatchStructV2.query_limit) + MatchInfoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(3, linkMatchStructV2.match_info) + CaptionInfoStructV2.ADAPTER.encodedSizeWithTag(4, linkMatchStructV2.caption_info) + CaptionAnchorStructV2.ADAPTER.encodedSizeWithTag(5, linkMatchStructV2.caption_anchor) + linkMatchStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LinkMatchStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.total_limit(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.query_limit(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.match_info.add(MatchInfoStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.caption_info(CaptionInfoStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.caption_anchor(CaptionAnchorStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LinkMatchStructV2 linkMatchStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, linkMatchStructV2.total_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, linkMatchStructV2.query_limit);
            MatchInfoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, linkMatchStructV2.match_info);
            CaptionInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 4, linkMatchStructV2.caption_info);
            CaptionAnchorStructV2.ADAPTER.encodeWithTag(protoWriter, 5, linkMatchStructV2.caption_anchor);
            protoWriter.writeBytes(linkMatchStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102068);
    }

    public static final class Builder extends Message.Builder<LinkMatchStructV2, Builder> {
        public CaptionAnchorStructV2 caption_anchor;
        public CaptionInfoStructV2 caption_info;
        public List<MatchInfoStructV2> match_info = Internal.newMutableList();
        public Integer query_limit;
        public Integer total_limit;

        static {
            Covode.recordClassIndex(102069);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LinkMatchStructV2 build() {
            return new LinkMatchStructV2(this.total_limit, this.query_limit, this.match_info, this.caption_info, this.caption_anchor, super.buildUnknownFields());
        }

        public final Builder caption_anchor(CaptionAnchorStructV2 captionAnchorStructV2) {
            this.caption_anchor = captionAnchorStructV2;
            return this;
        }

        public final Builder caption_info(CaptionInfoStructV2 captionInfoStructV2) {
            this.caption_info = captionInfoStructV2;
            return this;
        }

        public final Builder query_limit(Integer num) {
            this.query_limit = num;
            return this;
        }

        public final Builder total_limit(Integer num) {
            this.total_limit = num;
            return this;
        }

        public final Builder match_info(List<MatchInfoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.match_info = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.LinkMatchStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LinkMatchStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.total_limit = this.total_limit;
        builder.query_limit = this.query_limit;
        builder.match_info = Internal.copyOf("match_info", this.match_info);
        builder.caption_info = this.caption_info;
        builder.caption_anchor = this.caption_anchor;
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
        Integer num = this.total_limit;
        int i6 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Integer num2 = this.query_limit;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((i7 + i3) * 37) + this.match_info.hashCode()) * 37;
        CaptionInfoStructV2 captionInfoStructV2 = this.caption_info;
        if (captionInfoStructV2 != null) {
            i4 = captionInfoStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (hashCode2 + i4) * 37;
        CaptionAnchorStructV2 captionAnchorStructV2 = this.caption_anchor;
        if (captionAnchorStructV2 != null) {
            i6 = captionAnchorStructV2.hashCode();
        }
        int i9 = i8 + i6;
        this.hashCode = i9;
        return i9;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total_limit != null) {
            sb.append(", total_limit=").append(this.total_limit);
        }
        if (this.query_limit != null) {
            sb.append(", query_limit=").append(this.query_limit);
        }
        if (!this.match_info.isEmpty()) {
            sb.append(", match_info=").append(this.match_info);
        }
        if (this.caption_info != null) {
            sb.append(", caption_info=").append(this.caption_info);
        }
        if (this.caption_anchor != null) {
            sb.append(", caption_anchor=").append(this.caption_anchor);
        }
        return sb.replace(0, 2, "LinkMatchStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkMatchStructV2)) {
            return false;
        }
        LinkMatchStructV2 linkMatchStructV2 = (LinkMatchStructV2) obj;
        if (!unknownFields().equals(linkMatchStructV2.unknownFields()) || !Internal.equals(this.total_limit, linkMatchStructV2.total_limit) || !Internal.equals(this.query_limit, linkMatchStructV2.query_limit) || !this.match_info.equals(linkMatchStructV2.match_info) || !Internal.equals(this.caption_info, linkMatchStructV2.caption_info) || !Internal.equals(this.caption_anchor, linkMatchStructV2.caption_anchor)) {
            return false;
        }
        return true;
    }

    public LinkMatchStructV2(Integer num, Integer num2, List<MatchInfoStructV2> list, CaptionInfoStructV2 captionInfoStructV2, CaptionAnchorStructV2 captionAnchorStructV2) {
        this(num, num2, list, captionInfoStructV2, captionAnchorStructV2, i.EMPTY);
    }

    public LinkMatchStructV2(Integer num, Integer num2, List<MatchInfoStructV2> list, CaptionInfoStructV2 captionInfoStructV2, CaptionAnchorStructV2 captionAnchorStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.total_limit = num;
        this.query_limit = num2;
        this.match_info = Internal.immutableCopyOf("match_info", list);
        this.caption_info = captionInfoStructV2;
        this.caption_anchor = captionAnchorStructV2;
    }
}
