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

public final class UtteranceV2 extends Message<UtteranceV2, Builder> {
    public static final ProtoAdapter<UtteranceV2> ADAPTER = new ProtoAdapter_UtteranceV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public Long end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public Long start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String text;

    public UtteranceV2() {
    }

    static final class ProtoAdapter_UtteranceV2 extends ProtoAdapter<UtteranceV2> {
        static {
            Covode.recordClassIndex(102262);
        }

        public ProtoAdapter_UtteranceV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UtteranceV2.class);
        }

        public final int encodedSize(UtteranceV2 utteranceV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, utteranceV2.text) + ProtoAdapter.INT64.encodedSizeWithTag(2, utteranceV2.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, utteranceV2.end_time) + utteranceV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UtteranceV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.start_time(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.end_time(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UtteranceV2 utteranceV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, utteranceV2.text);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, utteranceV2.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, utteranceV2.end_time);
            protoWriter.writeBytes(utteranceV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102260);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.UtteranceV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UtteranceV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<UtteranceV2, Builder> {
        public Long end_time;
        public Long start_time;
        public String text;

        static {
            Covode.recordClassIndex(102261);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UtteranceV2 build() {
            Long l2 = this.start_time;
            if (l2 != null && this.end_time != null) {
                return new UtteranceV2(this.text, this.start_time, this.end_time, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "start_time", this.end_time, "end_time");
        }

        public final Builder end_time(Long l2) {
            this.end_time = l2;
            return this;
        }

        public final Builder start_time(Long l2) {
            this.start_time = l2;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = ((((hashCode + i2) * 37) + this.start_time.hashCode()) * 37) + this.end_time.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=").append(this.text);
        }
        sb.append(", start_time=").append(this.start_time);
        sb.append(", end_time=").append(this.end_time);
        return sb.replace(0, 2, "UtteranceV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UtteranceV2)) {
            return false;
        }
        UtteranceV2 utteranceV2 = (UtteranceV2) obj;
        if (!unknownFields().equals(utteranceV2.unknownFields()) || !Internal.equals(this.text, utteranceV2.text) || !this.start_time.equals(utteranceV2.start_time) || !this.end_time.equals(utteranceV2.end_time)) {
            return false;
        }
        return true;
    }

    public UtteranceV2(String str, Long l2, Long l3) {
        this(str, l2, l3, i.EMPTY);
    }

    public UtteranceV2(String str, Long l2, Long l3, i iVar) {
        super(ADAPTER, iVar);
        this.text = str;
        this.start_time = l2;
        this.end_time = l3;
    }
}
