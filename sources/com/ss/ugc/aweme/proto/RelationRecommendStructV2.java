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

public final class RelationRecommendStructV2 extends Message<RelationRecommendStructV2, Builder> {
    public static final ProtoAdapter<RelationRecommendStructV2> ADAPTER = new ProtoAdapter_RelationRecommendStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String friend_type_str;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String rec_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long recommend_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String relation_text_key;

    public RelationRecommendStructV2() {
    }

    static final class ProtoAdapter_RelationRecommendStructV2 extends ProtoAdapter<RelationRecommendStructV2> {
        static {
            Covode.recordClassIndex(102199);
        }

        public ProtoAdapter_RelationRecommendStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RelationRecommendStructV2.class);
        }

        public final int encodedSize(RelationRecommendStructV2 relationRecommendStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, relationRecommendStructV2.recommend_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, relationRecommendStructV2.relation_text_key) + ProtoAdapter.STRING.encodedSizeWithTag(3, relationRecommendStructV2.rec_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, relationRecommendStructV2.friend_type_str) + relationRecommendStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RelationRecommendStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.recommend_type(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.relation_text_key(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.rec_type(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.friend_type_str(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, RelationRecommendStructV2 relationRecommendStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, relationRecommendStructV2.recommend_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, relationRecommendStructV2.relation_text_key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, relationRecommendStructV2.rec_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, relationRecommendStructV2.friend_type_str);
            protoWriter.writeBytes(relationRecommendStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102197);
    }

    public static final class Builder extends Message.Builder<RelationRecommendStructV2, Builder> {
        public String friend_type_str;
        public String rec_type;
        public Long recommend_type;
        public String relation_text_key;

        static {
            Covode.recordClassIndex(102198);
        }

        @Override // com.squareup.wire.Message.Builder
        public final RelationRecommendStructV2 build() {
            return new RelationRecommendStructV2(this.recommend_type, this.relation_text_key, this.rec_type, this.friend_type_str, super.buildUnknownFields());
        }

        public final Builder friend_type_str(String str) {
            this.friend_type_str = str;
            return this;
        }

        public final Builder rec_type(String str) {
            this.rec_type = str;
            return this;
        }

        public final Builder recommend_type(Long l2) {
            this.recommend_type = l2;
            return this;
        }

        public final Builder relation_text_key(String str) {
            this.relation_text_key = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.RelationRecommendStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<RelationRecommendStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.recommend_type = this.recommend_type;
        builder.relation_text_key = this.relation_text_key;
        builder.rec_type = this.rec_type;
        builder.friend_type_str = this.friend_type_str;
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
        Long l2 = this.recommend_type;
        int i6 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str = this.relation_text_key;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        String str2 = this.rec_type;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        String str3 = this.friend_type_str;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.recommend_type != null) {
            sb.append(", recommend_type=").append(this.recommend_type);
        }
        if (this.relation_text_key != null) {
            sb.append(", relation_text_key=").append(this.relation_text_key);
        }
        if (this.rec_type != null) {
            sb.append(", rec_type=").append(this.rec_type);
        }
        if (this.friend_type_str != null) {
            sb.append(", friend_type_str=").append(this.friend_type_str);
        }
        return sb.replace(0, 2, "RelationRecommendStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelationRecommendStructV2)) {
            return false;
        }
        RelationRecommendStructV2 relationRecommendStructV2 = (RelationRecommendStructV2) obj;
        if (!unknownFields().equals(relationRecommendStructV2.unknownFields()) || !Internal.equals(this.recommend_type, relationRecommendStructV2.recommend_type) || !Internal.equals(this.relation_text_key, relationRecommendStructV2.relation_text_key) || !Internal.equals(this.rec_type, relationRecommendStructV2.rec_type) || !Internal.equals(this.friend_type_str, relationRecommendStructV2.friend_type_str)) {
            return false;
        }
        return true;
    }

    public RelationRecommendStructV2(Long l2, String str, String str2, String str3) {
        this(l2, str, str2, str3, i.EMPTY);
    }

    public RelationRecommendStructV2(Long l2, String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.recommend_type = l2;
        this.relation_text_key = str;
        this.rec_type = str2;
        this.friend_type_str = str3;
    }
}
