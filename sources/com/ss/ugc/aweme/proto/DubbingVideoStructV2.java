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

/* access modifiers changed from: package-private */
public final class DubbingVideoStructV2 extends Message<DubbingVideoStructV2, Builder> {
    public static final ProtoAdapter<DubbingVideoStructV2> ADAPTER = new ProtoAdapter_DubbingVideoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String lang;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long language_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 play_addr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 play_addr_bytevc1;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String voice_type;

    static final class ProtoAdapter_DubbingVideoStructV2 extends ProtoAdapter<DubbingVideoStructV2> {
        static {
            Covode.recordClassIndex(101989);
        }

        public ProtoAdapter_DubbingVideoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DubbingVideoStructV2.class);
        }

        public final int encodedSize(DubbingVideoStructV2 dubbingVideoStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, dubbingVideoStructV2.lang) + ProtoAdapter.INT64.encodedSizeWithTag(2, dubbingVideoStructV2.language_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, dubbingVideoStructV2.voice_type) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, dubbingVideoStructV2.play_addr) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, dubbingVideoStructV2.play_addr_bytevc1) + dubbingVideoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DubbingVideoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.lang(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.language_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.voice_type(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.play_addr(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.play_addr_bytevc1(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DubbingVideoStructV2 dubbingVideoStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dubbingVideoStructV2.lang);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, dubbingVideoStructV2.language_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, dubbingVideoStructV2.voice_type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, dubbingVideoStructV2.play_addr);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, dubbingVideoStructV2.play_addr_bytevc1);
            protoWriter.writeBytes(dubbingVideoStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101987);
    }

    public static final class Builder extends Message.Builder<DubbingVideoStructV2, Builder> {
        public String lang;
        public Long language_id;
        public UrlStructV2 play_addr;
        public UrlStructV2 play_addr_bytevc1;
        public String voice_type;

        static {
            Covode.recordClassIndex(101988);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DubbingVideoStructV2 build() {
            return new DubbingVideoStructV2(this.lang, this.language_id, this.voice_type, this.play_addr, this.play_addr_bytevc1, super.buildUnknownFields());
        }

        public final Builder lang(String str) {
            this.lang = str;
            return this;
        }

        public final Builder language_id(Long l2) {
            this.language_id = l2;
            return this;
        }

        public final Builder play_addr(UrlStructV2 urlStructV2) {
            this.play_addr = urlStructV2;
            return this;
        }

        public final Builder play_addr_bytevc1(UrlStructV2 urlStructV2) {
            this.play_addr_bytevc1 = urlStructV2;
            return this;
        }

        public final Builder voice_type(String str) {
            this.voice_type = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.DubbingVideoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DubbingVideoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.lang = this.lang;
        builder.language_id = this.language_id;
        builder.voice_type = this.voice_type;
        builder.play_addr = this.play_addr;
        builder.play_addr_bytevc1 = this.play_addr_bytevc1;
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
        String str = this.lang;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        Long l2 = this.language_id;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        String str2 = this.voice_type;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        UrlStructV2 urlStructV2 = this.play_addr;
        if (urlStructV2 != null) {
            i5 = urlStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        UrlStructV2 urlStructV22 = this.play_addr_bytevc1;
        if (urlStructV22 != null) {
            i7 = urlStructV22.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.lang != null) {
            sb.append(", lang=").append(this.lang);
        }
        if (this.language_id != null) {
            sb.append(", language_id=").append(this.language_id);
        }
        if (this.voice_type != null) {
            sb.append(", voice_type=").append(this.voice_type);
        }
        if (this.play_addr != null) {
            sb.append(", play_addr=").append(this.play_addr);
        }
        if (this.play_addr_bytevc1 != null) {
            sb.append(", play_addr_bytevc1=").append(this.play_addr_bytevc1);
        }
        return sb.replace(0, 2, "DubbingVideoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DubbingVideoStructV2)) {
            return false;
        }
        DubbingVideoStructV2 dubbingVideoStructV2 = (DubbingVideoStructV2) obj;
        if (!unknownFields().equals(dubbingVideoStructV2.unknownFields()) || !Internal.equals(this.lang, dubbingVideoStructV2.lang) || !Internal.equals(this.language_id, dubbingVideoStructV2.language_id) || !Internal.equals(this.voice_type, dubbingVideoStructV2.voice_type) || !Internal.equals(this.play_addr, dubbingVideoStructV2.play_addr) || !Internal.equals(this.play_addr_bytevc1, dubbingVideoStructV2.play_addr_bytevc1)) {
            return false;
        }
        return true;
    }

    public DubbingVideoStructV2(String str, Long l2, String str2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22) {
        this(str, l2, str2, urlStructV2, urlStructV22, i.EMPTY);
    }

    public DubbingVideoStructV2(String str, Long l2, String str2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, i iVar) {
        super(ADAPTER, iVar);
        this.lang = str;
        this.language_id = l2;
        this.voice_type = str2;
        this.play_addr = urlStructV2;
        this.play_addr_bytevc1 = urlStructV22;
    }
}
