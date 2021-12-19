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

public final class QuickShopSecondFloorV2 extends Message<QuickShopSecondFloorV2, Builder> {
    public static final ProtoAdapter<QuickShopSecondFloorV2> ADAPTER = new ProtoAdapter_QuickShopSecondFloorV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String enter_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String process_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String trans_bg_text;

    public QuickShopSecondFloorV2() {
    }

    static final class ProtoAdapter_QuickShopSecondFloorV2 extends ProtoAdapter<QuickShopSecondFloorV2> {
        static {
            Covode.recordClassIndex(102184);
        }

        public ProtoAdapter_QuickShopSecondFloorV2() {
            super(FieldEncoding.LENGTH_DELIMITED, QuickShopSecondFloorV2.class);
        }

        public final int encodedSize(QuickShopSecondFloorV2 quickShopSecondFloorV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, quickShopSecondFloorV2.process_text) + ProtoAdapter.STRING.encodedSizeWithTag(2, quickShopSecondFloorV2.enter_text) + ProtoAdapter.STRING.encodedSizeWithTag(3, quickShopSecondFloorV2.trans_bg_text) + quickShopSecondFloorV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final QuickShopSecondFloorV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.process_text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.enter_text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.trans_bg_text(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, QuickShopSecondFloorV2 quickShopSecondFloorV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quickShopSecondFloorV2.process_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, quickShopSecondFloorV2.enter_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, quickShopSecondFloorV2.trans_bg_text);
            protoWriter.writeBytes(quickShopSecondFloorV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<QuickShopSecondFloorV2, Builder> {
        public String enter_text;
        public String process_text;
        public String trans_bg_text;

        static {
            Covode.recordClassIndex(102183);
        }

        @Override // com.squareup.wire.Message.Builder
        public final QuickShopSecondFloorV2 build() {
            return new QuickShopSecondFloorV2(this.process_text, this.enter_text, this.trans_bg_text, super.buildUnknownFields());
        }

        public final Builder enter_text(String str) {
            this.enter_text = str;
            return this;
        }

        public final Builder process_text(String str) {
            this.process_text = str;
            return this;
        }

        public final Builder trans_bg_text(String str) {
            this.trans_bg_text = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102182);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.QuickShopSecondFloorV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<QuickShopSecondFloorV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.process_text = this.process_text;
        builder.enter_text = this.enter_text;
        builder.trans_bg_text = this.trans_bg_text;
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
        String str = this.process_text;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.enter_text;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str3 = this.trans_bg_text;
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
        if (this.process_text != null) {
            sb.append(", process_text=").append(this.process_text);
        }
        if (this.enter_text != null) {
            sb.append(", enter_text=").append(this.enter_text);
        }
        if (this.trans_bg_text != null) {
            sb.append(", trans_bg_text=").append(this.trans_bg_text);
        }
        return sb.replace(0, 2, "QuickShopSecondFloorV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickShopSecondFloorV2)) {
            return false;
        }
        QuickShopSecondFloorV2 quickShopSecondFloorV2 = (QuickShopSecondFloorV2) obj;
        if (!unknownFields().equals(quickShopSecondFloorV2.unknownFields()) || !Internal.equals(this.process_text, quickShopSecondFloorV2.process_text) || !Internal.equals(this.enter_text, quickShopSecondFloorV2.enter_text) || !Internal.equals(this.trans_bg_text, quickShopSecondFloorV2.trans_bg_text)) {
            return false;
        }
        return true;
    }

    public QuickShopSecondFloorV2(String str, String str2, String str3) {
        this(str, str2, str3, i.EMPTY);
    }

    public QuickShopSecondFloorV2(String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.process_text = str;
        this.enter_text = str2;
        this.trans_bg_text = str3;
    }
}
