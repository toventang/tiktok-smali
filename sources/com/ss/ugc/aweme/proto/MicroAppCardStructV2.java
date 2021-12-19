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

public final class MicroAppCardStructV2 extends Message<MicroAppCardStructV2, Builder> {
    public static final ProtoAdapter<MicroAppCardStructV2> ADAPTER = new ProtoAdapter_MicroAppCardStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String image_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer wait_time;

    public MicroAppCardStructV2() {
    }

    static final class ProtoAdapter_MicroAppCardStructV2 extends ProtoAdapter<MicroAppCardStructV2> {
        static {
            Covode.recordClassIndex(102106);
        }

        public ProtoAdapter_MicroAppCardStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MicroAppCardStructV2.class);
        }

        public final int encodedSize(MicroAppCardStructV2 microAppCardStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, microAppCardStructV2.image_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, microAppCardStructV2.text) + ProtoAdapter.INT32.encodedSizeWithTag(3, microAppCardStructV2.wait_time) + microAppCardStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MicroAppCardStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.image_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.wait_time(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MicroAppCardStructV2 microAppCardStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, microAppCardStructV2.image_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, microAppCardStructV2.text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, microAppCardStructV2.wait_time);
            protoWriter.writeBytes(microAppCardStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MicroAppCardStructV2, Builder> {
        public String image_url;
        public String text;
        public Integer wait_time;

        static {
            Covode.recordClassIndex(102105);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MicroAppCardStructV2 build() {
            return new MicroAppCardStructV2(this.image_url, this.text, this.wait_time, super.buildUnknownFields());
        }

        public final Builder image_url(String str) {
            this.image_url = str;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder wait_time(Integer num) {
            this.wait_time = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102104);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MicroAppCardStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MicroAppCardStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.image_url = this.image_url;
        builder.text = this.text;
        builder.wait_time = this.wait_time;
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
        String str = this.image_url;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.text;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Integer num = this.wait_time;
        if (num != null) {
            i5 = num.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image_url != null) {
            sb.append(", image_url=").append(this.image_url);
        }
        if (this.text != null) {
            sb.append(", text=").append(this.text);
        }
        if (this.wait_time != null) {
            sb.append(", wait_time=").append(this.wait_time);
        }
        return sb.replace(0, 2, "MicroAppCardStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MicroAppCardStructV2)) {
            return false;
        }
        MicroAppCardStructV2 microAppCardStructV2 = (MicroAppCardStructV2) obj;
        if (!unknownFields().equals(microAppCardStructV2.unknownFields()) || !Internal.equals(this.image_url, microAppCardStructV2.image_url) || !Internal.equals(this.text, microAppCardStructV2.text) || !Internal.equals(this.wait_time, microAppCardStructV2.wait_time)) {
            return false;
        }
        return true;
    }

    public MicroAppCardStructV2(String str, String str2, Integer num) {
        this(str, str2, num, i.EMPTY);
    }

    public MicroAppCardStructV2(String str, String str2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.image_url = str;
        this.text = str2;
        this.wait_time = num;
    }
}
