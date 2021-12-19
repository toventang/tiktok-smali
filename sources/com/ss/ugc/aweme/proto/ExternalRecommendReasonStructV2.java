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

public final class ExternalRecommendReasonStructV2 extends Message<ExternalRecommendReasonStructV2, Builder> {
    public static final ProtoAdapter<ExternalRecommendReasonStructV2> ADAPTER = new ProtoAdapter_ExternalRecommendReasonStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String external_username;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String hashed_phone_number;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String reason;

    public ExternalRecommendReasonStructV2() {
    }

    static final class ProtoAdapter_ExternalRecommendReasonStructV2 extends ProtoAdapter<ExternalRecommendReasonStructV2> {
        static {
            Covode.recordClassIndex(102001);
        }

        public ProtoAdapter_ExternalRecommendReasonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ExternalRecommendReasonStructV2.class);
        }

        public final int encodedSize(ExternalRecommendReasonStructV2 externalRecommendReasonStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, externalRecommendReasonStructV2.reason) + ProtoAdapter.STRING.encodedSizeWithTag(2, externalRecommendReasonStructV2.hashed_phone_number) + ProtoAdapter.STRING.encodedSizeWithTag(3, externalRecommendReasonStructV2.external_username) + externalRecommendReasonStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ExternalRecommendReasonStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.reason(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.hashed_phone_number(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.external_username(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ExternalRecommendReasonStructV2 externalRecommendReasonStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, externalRecommendReasonStructV2.reason);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, externalRecommendReasonStructV2.hashed_phone_number);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, externalRecommendReasonStructV2.external_username);
            protoWriter.writeBytes(externalRecommendReasonStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ExternalRecommendReasonStructV2, Builder> {
        public String external_username;
        public String hashed_phone_number;
        public String reason;

        static {
            Covode.recordClassIndex(102000);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ExternalRecommendReasonStructV2 build() {
            return new ExternalRecommendReasonStructV2(this.reason, this.hashed_phone_number, this.external_username, super.buildUnknownFields());
        }

        public final Builder external_username(String str) {
            this.external_username = str;
            return this;
        }

        public final Builder hashed_phone_number(String str) {
            this.hashed_phone_number = str;
            return this;
        }

        public final Builder reason(String str) {
            this.reason = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101999);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ExternalRecommendReasonStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ExternalRecommendReasonStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.reason = this.reason;
        builder.hashed_phone_number = this.hashed_phone_number;
        builder.external_username = this.external_username;
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
        String str = this.reason;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.hashed_phone_number;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str3 = this.external_username;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.reason != null) {
            sb.append(", reason=").append(this.reason);
        }
        if (this.hashed_phone_number != null) {
            sb.append(", hashed_phone_number=").append(this.hashed_phone_number);
        }
        if (this.external_username != null) {
            sb.append(", external_username=").append(this.external_username);
        }
        return sb.replace(0, 2, "ExternalRecommendReasonStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalRecommendReasonStructV2)) {
            return false;
        }
        ExternalRecommendReasonStructV2 externalRecommendReasonStructV2 = (ExternalRecommendReasonStructV2) obj;
        if (!unknownFields().equals(externalRecommendReasonStructV2.unknownFields()) || !Internal.equals(this.reason, externalRecommendReasonStructV2.reason) || !Internal.equals(this.hashed_phone_number, externalRecommendReasonStructV2.hashed_phone_number) || !Internal.equals(this.external_username, externalRecommendReasonStructV2.external_username)) {
            return false;
        }
        return true;
    }

    public ExternalRecommendReasonStructV2(String str, String str2, String str3) {
        this(str, str2, str3, i.EMPTY);
    }

    public ExternalRecommendReasonStructV2(String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.reason = str;
        this.hashed_phone_number = str2;
        this.external_username = str3;
    }
}
