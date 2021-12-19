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

public final class MatchedFriendStructV2 extends Message<MatchedFriendStructV2, Builder> {
    public static final ProtoAdapter<MatchedFriendStructV2> ADAPTER = new ProtoAdapter_MatchedFriendStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.ExternalRecommendReasonStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public ExternalRecommendReasonStructV2 external_recommend_reason;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MutualStructV2#ADAPTER", tag = 3)
    public MutualStructV2 mutual_struct;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String rec_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String recommend_reason;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String relation_type;

    public MatchedFriendStructV2() {
    }

    static final class ProtoAdapter_MatchedFriendStructV2 extends ProtoAdapter<MatchedFriendStructV2> {
        static {
            Covode.recordClassIndex(102094);
        }

        public ProtoAdapter_MatchedFriendStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MatchedFriendStructV2.class);
        }

        public final int encodedSize(MatchedFriendStructV2 matchedFriendStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, matchedFriendStructV2.rec_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, matchedFriendStructV2.recommend_reason) + MutualStructV2.ADAPTER.encodedSizeWithTag(3, matchedFriendStructV2.mutual_struct) + ProtoAdapter.STRING.encodedSizeWithTag(4, matchedFriendStructV2.relation_type) + ExternalRecommendReasonStructV2.ADAPTER.encodedSizeWithTag(5, matchedFriendStructV2.external_recommend_reason) + matchedFriendStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MatchedFriendStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.rec_type(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.recommend_reason(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.mutual_struct(MutualStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.relation_type(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.external_recommend_reason(ExternalRecommendReasonStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MatchedFriendStructV2 matchedFriendStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, matchedFriendStructV2.rec_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, matchedFriendStructV2.recommend_reason);
            MutualStructV2.ADAPTER.encodeWithTag(protoWriter, 3, matchedFriendStructV2.mutual_struct);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, matchedFriendStructV2.relation_type);
            ExternalRecommendReasonStructV2.ADAPTER.encodeWithTag(protoWriter, 5, matchedFriendStructV2.external_recommend_reason);
            protoWriter.writeBytes(matchedFriendStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102092);
    }

    public static final class Builder extends Message.Builder<MatchedFriendStructV2, Builder> {
        public ExternalRecommendReasonStructV2 external_recommend_reason;
        public MutualStructV2 mutual_struct;
        public String rec_type;
        public String recommend_reason;
        public String relation_type;

        static {
            Covode.recordClassIndex(102093);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MatchedFriendStructV2 build() {
            return new MatchedFriendStructV2(this.rec_type, this.recommend_reason, this.mutual_struct, this.relation_type, this.external_recommend_reason, super.buildUnknownFields());
        }

        public final Builder external_recommend_reason(ExternalRecommendReasonStructV2 externalRecommendReasonStructV2) {
            this.external_recommend_reason = externalRecommendReasonStructV2;
            return this;
        }

        public final Builder mutual_struct(MutualStructV2 mutualStructV2) {
            this.mutual_struct = mutualStructV2;
            return this;
        }

        public final Builder rec_type(String str) {
            this.rec_type = str;
            return this;
        }

        public final Builder recommend_reason(String str) {
            this.recommend_reason = str;
            return this;
        }

        public final Builder relation_type(String str) {
            this.relation_type = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MatchedFriendStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MatchedFriendStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.rec_type = this.rec_type;
        builder.recommend_reason = this.recommend_reason;
        builder.mutual_struct = this.mutual_struct;
        builder.relation_type = this.relation_type;
        builder.external_recommend_reason = this.external_recommend_reason;
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
        String str = this.rec_type;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        String str2 = this.recommend_reason;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        MutualStructV2 mutualStructV2 = this.mutual_struct;
        if (mutualStructV2 != null) {
            i4 = mutualStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        String str3 = this.relation_type;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        ExternalRecommendReasonStructV2 externalRecommendReasonStructV2 = this.external_recommend_reason;
        if (externalRecommendReasonStructV2 != null) {
            i7 = externalRecommendReasonStructV2.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rec_type != null) {
            sb.append(", rec_type=").append(this.rec_type);
        }
        if (this.recommend_reason != null) {
            sb.append(", recommend_reason=").append(this.recommend_reason);
        }
        if (this.mutual_struct != null) {
            sb.append(", mutual_struct=").append(this.mutual_struct);
        }
        if (this.relation_type != null) {
            sb.append(", relation_type=").append(this.relation_type);
        }
        if (this.external_recommend_reason != null) {
            sb.append(", external_recommend_reason=").append(this.external_recommend_reason);
        }
        return sb.replace(0, 2, "MatchedFriendStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchedFriendStructV2)) {
            return false;
        }
        MatchedFriendStructV2 matchedFriendStructV2 = (MatchedFriendStructV2) obj;
        if (!unknownFields().equals(matchedFriendStructV2.unknownFields()) || !Internal.equals(this.rec_type, matchedFriendStructV2.rec_type) || !Internal.equals(this.recommend_reason, matchedFriendStructV2.recommend_reason) || !Internal.equals(this.mutual_struct, matchedFriendStructV2.mutual_struct) || !Internal.equals(this.relation_type, matchedFriendStructV2.relation_type) || !Internal.equals(this.external_recommend_reason, matchedFriendStructV2.external_recommend_reason)) {
            return false;
        }
        return true;
    }

    public MatchedFriendStructV2(String str, String str2, MutualStructV2 mutualStructV2, String str3, ExternalRecommendReasonStructV2 externalRecommendReasonStructV2) {
        this(str, str2, mutualStructV2, str3, externalRecommendReasonStructV2, i.EMPTY);
    }

    public MatchedFriendStructV2(String str, String str2, MutualStructV2 mutualStructV2, String str3, ExternalRecommendReasonStructV2 externalRecommendReasonStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.rec_type = str;
        this.recommend_reason = str2;
        this.mutual_struct = mutualStructV2;
        this.relation_type = str3;
        this.external_recommend_reason = externalRecommendReasonStructV2;
    }
}
