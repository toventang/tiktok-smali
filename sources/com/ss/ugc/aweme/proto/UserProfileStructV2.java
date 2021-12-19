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

public final class UserProfileStructV2 extends Message<UserProfileStructV2, Builder> {
    public static final ProtoAdapter<UserProfileStructV2> ADAPTER = new ProtoAdapter_UserProfileStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 1)
    public Double head_model_score;

    public UserProfileStructV2() {
    }

    static final class ProtoAdapter_UserProfileStructV2 extends ProtoAdapter<UserProfileStructV2> {
        static {
            Covode.recordClassIndex(102253);
        }

        public ProtoAdapter_UserProfileStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UserProfileStructV2.class);
        }

        public final int encodedSize(UserProfileStructV2 userProfileStructV2) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, userProfileStructV2.head_model_score) + userProfileStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UserProfileStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.head_model_score(ProtoAdapter.DOUBLE.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UserProfileStructV2 userProfileStructV2) {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, userProfileStructV2.head_model_score);
            protoWriter.writeBytes(userProfileStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<UserProfileStructV2, Builder> {
        public Double head_model_score;

        static {
            Covode.recordClassIndex(102252);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UserProfileStructV2 build() {
            return new UserProfileStructV2(this.head_model_score, super.buildUnknownFields());
        }

        public final Builder head_model_score(Double d2) {
            this.head_model_score = d2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102251);
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d2 = this.head_model_score;
        if (d2 != null) {
            i2 = d2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hashCode + i2;
        this.hashCode = i4;
        return i4;
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.UserProfileStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UserProfileStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.head_model_score = this.head_model_score;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.head_model_score != null) {
            sb.append(", head_model_score=").append(this.head_model_score);
        }
        return sb.replace(0, 2, "UserProfileStructV2{").append('}').toString();
    }

    public UserProfileStructV2(Double d2) {
        this(d2, i.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserProfileStructV2)) {
            return false;
        }
        UserProfileStructV2 userProfileStructV2 = (UserProfileStructV2) obj;
        if (!unknownFields().equals(userProfileStructV2.unknownFields()) || !Internal.equals(this.head_model_score, userProfileStructV2.head_model_score)) {
            return false;
        }
        return true;
    }

    public UserProfileStructV2(Double d2, i iVar) {
        super(ADAPTER, iVar);
        this.head_model_score = d2;
    }
}
