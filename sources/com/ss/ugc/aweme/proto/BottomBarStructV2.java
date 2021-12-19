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

public final class BottomBarStructV2 extends Message<BottomBarStructV2, Builder> {
    public static final ProtoAdapter<BottomBarStructV2> ADAPTER = new ProtoAdapter_BottomBarStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String content;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer type;

    public BottomBarStructV2() {
    }

    static final class ProtoAdapter_BottomBarStructV2 extends ProtoAdapter<BottomBarStructV2> {
        static {
            Covode.recordClassIndex(101935);
        }

        public ProtoAdapter_BottomBarStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BottomBarStructV2.class);
        }

        public final int encodedSize(BottomBarStructV2 bottomBarStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, bottomBarStructV2.content) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, bottomBarStructV2.icon) + ProtoAdapter.INT32.encodedSizeWithTag(3, bottomBarStructV2.type) + bottomBarStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BottomBarStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.content(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.icon(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BottomBarStructV2 bottomBarStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bottomBarStructV2.content);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, bottomBarStructV2.icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, bottomBarStructV2.type);
            protoWriter.writeBytes(bottomBarStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BottomBarStructV2, Builder> {
        public String content;
        public UrlStructV2 icon;
        public Integer type;

        static {
            Covode.recordClassIndex(101934);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BottomBarStructV2 build() {
            return new BottomBarStructV2(this.content, this.icon, this.type, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101933);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.BottomBarStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BottomBarStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.content = this.content;
        builder.icon = this.icon;
        builder.type = this.type;
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
        String str = this.content;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        UrlStructV2 urlStructV2 = this.icon;
        if (urlStructV2 != null) {
            i3 = urlStructV2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Integer num = this.type;
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
        if (this.content != null) {
            sb.append(", content=").append(this.content);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        return sb.replace(0, 2, "BottomBarStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BottomBarStructV2)) {
            return false;
        }
        BottomBarStructV2 bottomBarStructV2 = (BottomBarStructV2) obj;
        if (!unknownFields().equals(bottomBarStructV2.unknownFields()) || !Internal.equals(this.content, bottomBarStructV2.content) || !Internal.equals(this.icon, bottomBarStructV2.icon) || !Internal.equals(this.type, bottomBarStructV2.type)) {
            return false;
        }
        return true;
    }

    public BottomBarStructV2(String str, UrlStructV2 urlStructV2, Integer num) {
        this(str, urlStructV2, num, i.EMPTY);
    }

    public BottomBarStructV2(String str, UrlStructV2 urlStructV2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.content = str;
        this.icon = urlStructV2;
        this.type = num;
    }
}
