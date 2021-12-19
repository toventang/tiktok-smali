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

public final class AwemeRiskStructV2 extends Message<AwemeRiskStructV2, Builder> {
    public static final ProtoAdapter<AwemeRiskStructV2> ADAPTER = new ProtoAdapter_AwemeRiskStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean notice;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean risk_sink;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean vote;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean warn;

    public AwemeRiskStructV2() {
    }

    static final class ProtoAdapter_AwemeRiskStructV2 extends ProtoAdapter<AwemeRiskStructV2> {
        static {
            Covode.recordClassIndex(101902);
        }

        public ProtoAdapter_AwemeRiskStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeRiskStructV2.class);
        }

        public final int encodedSize(AwemeRiskStructV2 awemeRiskStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, awemeRiskStructV2.vote) + ProtoAdapter.BOOL.encodedSizeWithTag(2, awemeRiskStructV2.warn) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeRiskStructV2.risk_sink) + ProtoAdapter.INT32.encodedSizeWithTag(4, awemeRiskStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(5, awemeRiskStructV2.content) + ProtoAdapter.BOOL.encodedSizeWithTag(6, awemeRiskStructV2.notice) + ProtoAdapter.STRING.encodedSizeWithTag(7, awemeRiskStructV2.url) + awemeRiskStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeRiskStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.vote(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.warn(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.risk_sink(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.notice(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.url(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeRiskStructV2 awemeRiskStructV2) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, awemeRiskStructV2.vote);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, awemeRiskStructV2.warn);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeRiskStructV2.risk_sink);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, awemeRiskStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, awemeRiskStructV2.content);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, awemeRiskStructV2.notice);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, awemeRiskStructV2.url);
            protoWriter.writeBytes(awemeRiskStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101900);
    }

    public static final class Builder extends Message.Builder<AwemeRiskStructV2, Builder> {
        public String content;
        public Boolean notice;
        public Boolean risk_sink;
        public Integer type;
        public String url;
        public Boolean vote;
        public Boolean warn;

        static {
            Covode.recordClassIndex(101901);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeRiskStructV2 build() {
            return new AwemeRiskStructV2(this.vote, this.warn, this.risk_sink, this.type, this.content, this.notice, this.url, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder notice(Boolean bool) {
            this.notice = bool;
            return this;
        }

        public final Builder risk_sink(Boolean bool) {
            this.risk_sink = bool;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }

        public final Builder vote(Boolean bool) {
            this.vote = bool;
            return this;
        }

        public final Builder warn(Boolean bool) {
            this.warn = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeRiskStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeRiskStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.vote = this.vote;
        builder.warn = this.warn;
        builder.risk_sink = this.risk_sink;
        builder.type = this.type;
        builder.content = this.content;
        builder.notice = this.notice;
        builder.url = this.url;
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
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.vote;
        int i9 = 0;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (hashCode + i2) * 37;
        Boolean bool2 = this.warn;
        if (bool2 != null) {
            i3 = bool2.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        Boolean bool3 = this.risk_sink;
        if (bool3 != null) {
            i4 = bool3.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        Integer num = this.type;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        String str = this.content;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        Boolean bool4 = this.notice;
        if (bool4 != null) {
            i7 = bool4.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 37;
        String str2 = this.url;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        int i16 = i15 + i9;
        this.hashCode = i16;
        return i16;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.vote != null) {
            sb.append(", vote=").append(this.vote);
        }
        if (this.warn != null) {
            sb.append(", warn=").append(this.warn);
        }
        if (this.risk_sink != null) {
            sb.append(", risk_sink=").append(this.risk_sink);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.content != null) {
            sb.append(", content=").append(this.content);
        }
        if (this.notice != null) {
            sb.append(", notice=").append(this.notice);
        }
        if (this.url != null) {
            sb.append(", url=").append(this.url);
        }
        return sb.replace(0, 2, "AwemeRiskStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeRiskStructV2)) {
            return false;
        }
        AwemeRiskStructV2 awemeRiskStructV2 = (AwemeRiskStructV2) obj;
        if (!unknownFields().equals(awemeRiskStructV2.unknownFields()) || !Internal.equals(this.vote, awemeRiskStructV2.vote) || !Internal.equals(this.warn, awemeRiskStructV2.warn) || !Internal.equals(this.risk_sink, awemeRiskStructV2.risk_sink) || !Internal.equals(this.type, awemeRiskStructV2.type) || !Internal.equals(this.content, awemeRiskStructV2.content) || !Internal.equals(this.notice, awemeRiskStructV2.notice) || !Internal.equals(this.url, awemeRiskStructV2.url)) {
            return false;
        }
        return true;
    }

    public AwemeRiskStructV2(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, Boolean bool4, String str2) {
        this(bool, bool2, bool3, num, str, bool4, str2, i.EMPTY);
    }

    public AwemeRiskStructV2(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, Boolean bool4, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.vote = bool;
        this.warn = bool2;
        this.risk_sink = bool3;
        this.type = num;
        this.content = str;
        this.notice = bool4;
        this.url = str2;
    }
}
