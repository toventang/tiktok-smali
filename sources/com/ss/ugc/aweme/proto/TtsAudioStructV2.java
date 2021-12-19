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

public final class TtsAudioStructV2 extends Message<TtsAudioStructV2, Builder> {
    public static final ProtoAdapter<TtsAudioStructV2> ADAPTER = new ProtoAdapter_TtsAudioStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Integer bit_rate;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String lang;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long language_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 play_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String voice_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String volume_info;

    public TtsAudioStructV2() {
    }

    static final class ProtoAdapter_TtsAudioStructV2 extends ProtoAdapter<TtsAudioStructV2> {
        static {
            Covode.recordClassIndex(102244);
        }

        public ProtoAdapter_TtsAudioStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, TtsAudioStructV2.class);
        }

        public final int encodedSize(TtsAudioStructV2 ttsAudioStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, ttsAudioStructV2.lang) + ProtoAdapter.INT64.encodedSizeWithTag(2, ttsAudioStructV2.language_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, ttsAudioStructV2.voice_type) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, ttsAudioStructV2.play_addr) + ProtoAdapter.STRING.encodedSizeWithTag(5, ttsAudioStructV2.volume_info) + ProtoAdapter.INT32.encodedSizeWithTag(6, ttsAudioStructV2.bit_rate) + ttsAudioStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TtsAudioStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.lang(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.language_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.voice_type(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.play_addr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.volume_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.bit_rate(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, TtsAudioStructV2 ttsAudioStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ttsAudioStructV2.lang);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, ttsAudioStructV2.language_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ttsAudioStructV2.voice_type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, ttsAudioStructV2.play_addr);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, ttsAudioStructV2.volume_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, ttsAudioStructV2.bit_rate);
            protoWriter.writeBytes(ttsAudioStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102242);
    }

    public static final class Builder extends Message.Builder<TtsAudioStructV2, Builder> {
        public Integer bit_rate;
        public String lang;
        public Long language_id;
        public UrlStructV2 play_addr;
        public String voice_type;
        public String volume_info;

        static {
            Covode.recordClassIndex(102243);
        }

        @Override // com.squareup.wire.Message.Builder
        public final TtsAudioStructV2 build() {
            return new TtsAudioStructV2(this.lang, this.language_id, this.voice_type, this.play_addr, this.volume_info, this.bit_rate, super.buildUnknownFields());
        }

        public final Builder bit_rate(Integer num) {
            this.bit_rate = num;
            return this;
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

        public final Builder voice_type(String str) {
            this.voice_type = str;
            return this;
        }

        public final Builder volume_info(String str) {
            this.volume_info = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.TtsAudioStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<TtsAudioStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.lang = this.lang;
        builder.language_id = this.language_id;
        builder.voice_type = this.voice_type;
        builder.play_addr = this.play_addr;
        builder.volume_info = this.volume_info;
        builder.bit_rate = this.bit_rate;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.lang;
        int i8 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        Long l2 = this.language_id;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        String str2 = this.voice_type;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        UrlStructV2 urlStructV2 = this.play_addr;
        if (urlStructV2 != null) {
            i5 = urlStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        String str3 = this.volume_info;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        Integer num = this.bit_rate;
        if (num != null) {
            i8 = num.hashCode();
        }
        int i14 = i13 + i8;
        this.hashCode = i14;
        return i14;
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
        if (this.volume_info != null) {
            sb.append(", volume_info=").append(this.volume_info);
        }
        if (this.bit_rate != null) {
            sb.append(", bit_rate=").append(this.bit_rate);
        }
        return sb.replace(0, 2, "TtsAudioStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtsAudioStructV2)) {
            return false;
        }
        TtsAudioStructV2 ttsAudioStructV2 = (TtsAudioStructV2) obj;
        if (!unknownFields().equals(ttsAudioStructV2.unknownFields()) || !Internal.equals(this.lang, ttsAudioStructV2.lang) || !Internal.equals(this.language_id, ttsAudioStructV2.language_id) || !Internal.equals(this.voice_type, ttsAudioStructV2.voice_type) || !Internal.equals(this.play_addr, ttsAudioStructV2.play_addr) || !Internal.equals(this.volume_info, ttsAudioStructV2.volume_info) || !Internal.equals(this.bit_rate, ttsAudioStructV2.bit_rate)) {
            return false;
        }
        return true;
    }

    public TtsAudioStructV2(String str, Long l2, String str2, UrlStructV2 urlStructV2, String str3, Integer num) {
        this(str, l2, str2, urlStructV2, str3, num, i.EMPTY);
    }

    public TtsAudioStructV2(String str, Long l2, String str2, UrlStructV2 urlStructV2, String str3, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.lang = str;
        this.language_id = l2;
        this.voice_type = str2;
        this.play_addr = urlStructV2;
        this.volume_info = str3;
        this.bit_rate = num;
    }
}
