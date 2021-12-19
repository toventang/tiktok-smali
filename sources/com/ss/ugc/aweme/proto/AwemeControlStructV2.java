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

public final class AwemeControlStructV2 extends Message<AwemeControlStructV2, Builder> {
    public static final ProtoAdapter<AwemeControlStructV2> ADAPTER = new ProtoAdapter_AwemeControlStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean can_comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean can_forward;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean can_share;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean can_show_comment;

    public AwemeControlStructV2() {
    }

    static final class ProtoAdapter_AwemeControlStructV2 extends ProtoAdapter<AwemeControlStructV2> {
        static {
            Covode.recordClassIndex(101893);
        }

        public ProtoAdapter_AwemeControlStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeControlStructV2.class);
        }

        public final int encodedSize(AwemeControlStructV2 awemeControlStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, awemeControlStructV2.can_forward) + ProtoAdapter.BOOL.encodedSizeWithTag(2, awemeControlStructV2.can_share) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeControlStructV2.can_comment) + ProtoAdapter.BOOL.encodedSizeWithTag(4, awemeControlStructV2.can_show_comment) + awemeControlStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeControlStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.can_forward(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.can_share(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.can_comment(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.can_show_comment(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeControlStructV2 awemeControlStructV2) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, awemeControlStructV2.can_forward);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, awemeControlStructV2.can_share);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeControlStructV2.can_comment);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, awemeControlStructV2.can_show_comment);
            protoWriter.writeBytes(awemeControlStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101891);
    }

    public static final class Builder extends Message.Builder<AwemeControlStructV2, Builder> {
        public Boolean can_comment;
        public Boolean can_forward;
        public Boolean can_share;
        public Boolean can_show_comment;

        static {
            Covode.recordClassIndex(101892);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeControlStructV2 build() {
            return new AwemeControlStructV2(this.can_forward, this.can_share, this.can_comment, this.can_show_comment, super.buildUnknownFields());
        }

        public final Builder can_comment(Boolean bool) {
            this.can_comment = bool;
            return this;
        }

        public final Builder can_forward(Boolean bool) {
            this.can_forward = bool;
            return this;
        }

        public final Builder can_share(Boolean bool) {
            this.can_share = bool;
            return this;
        }

        public final Builder can_show_comment(Boolean bool) {
            this.can_show_comment = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeControlStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeControlStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.can_forward = this.can_forward;
        builder.can_share = this.can_share;
        builder.can_comment = this.can_comment;
        builder.can_show_comment = this.can_show_comment;
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
        Boolean bool = this.can_forward;
        int i6 = 0;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Boolean bool2 = this.can_share;
        if (bool2 != null) {
            i3 = bool2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Boolean bool3 = this.can_comment;
        if (bool3 != null) {
            i4 = bool3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        Boolean bool4 = this.can_show_comment;
        if (bool4 != null) {
            i6 = bool4.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.can_forward != null) {
            sb.append(", can_forward=").append(this.can_forward);
        }
        if (this.can_share != null) {
            sb.append(", can_share=").append(this.can_share);
        }
        if (this.can_comment != null) {
            sb.append(", can_comment=").append(this.can_comment);
        }
        if (this.can_show_comment != null) {
            sb.append(", can_show_comment=").append(this.can_show_comment);
        }
        return sb.replace(0, 2, "AwemeControlStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeControlStructV2)) {
            return false;
        }
        AwemeControlStructV2 awemeControlStructV2 = (AwemeControlStructV2) obj;
        if (!unknownFields().equals(awemeControlStructV2.unknownFields()) || !Internal.equals(this.can_forward, awemeControlStructV2.can_forward) || !Internal.equals(this.can_share, awemeControlStructV2.can_share) || !Internal.equals(this.can_comment, awemeControlStructV2.can_comment) || !Internal.equals(this.can_show_comment, awemeControlStructV2.can_show_comment)) {
            return false;
        }
        return true;
    }

    public AwemeControlStructV2(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(bool, bool2, bool3, bool4, i.EMPTY);
    }

    public AwemeControlStructV2(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, i iVar) {
        super(ADAPTER, iVar);
        this.can_forward = bool;
        this.can_share = bool2;
        this.can_comment = bool3;
        this.can_show_comment = bool4;
    }
}
