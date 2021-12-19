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

public final class GuideWordV2 extends Message<GuideWordV2, Builder> {
    public static final ProtoAdapter<GuideWordV2> ADAPTER = new ProtoAdapter_GuideWordV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer breathe_times;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String search_word;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String word;

    public GuideWordV2() {
    }

    static final class ProtoAdapter_GuideWordV2 extends ProtoAdapter<GuideWordV2> {
        static {
            Covode.recordClassIndex(102022);
        }

        public ProtoAdapter_GuideWordV2() {
            super(FieldEncoding.LENGTH_DELIMITED, GuideWordV2.class);
        }

        public final int encodedSize(GuideWordV2 guideWordV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, guideWordV2.word) + ProtoAdapter.STRING.encodedSizeWithTag(2, guideWordV2.search_word) + ProtoAdapter.INT32.encodedSizeWithTag(3, guideWordV2.type) + ProtoAdapter.INT32.encodedSizeWithTag(4, guideWordV2.breathe_times) + guideWordV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GuideWordV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.word(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.search_word(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.breathe_times(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GuideWordV2 guideWordV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, guideWordV2.word);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, guideWordV2.search_word);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, guideWordV2.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, guideWordV2.breathe_times);
            protoWriter.writeBytes(guideWordV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102020);
    }

    public static final class Builder extends Message.Builder<GuideWordV2, Builder> {
        public Integer breathe_times;
        public String search_word;
        public Integer type;
        public String word;

        static {
            Covode.recordClassIndex(102021);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GuideWordV2 build() {
            return new GuideWordV2(this.word, this.search_word, this.type, this.breathe_times, super.buildUnknownFields());
        }

        public final Builder breathe_times(Integer num) {
            this.breathe_times = num;
            return this;
        }

        public final Builder search_word(String str) {
            this.search_word = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder word(String str) {
            this.word = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.GuideWordV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GuideWordV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.word = this.word;
        builder.search_word = this.search_word;
        builder.type = this.type;
        builder.breathe_times = this.breathe_times;
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
        String str = this.word;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str2 = this.search_word;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Integer num = this.type;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        Integer num2 = this.breathe_times;
        if (num2 != null) {
            i6 = num2.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.word != null) {
            sb.append(", word=").append(this.word);
        }
        if (this.search_word != null) {
            sb.append(", search_word=").append(this.search_word);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.breathe_times != null) {
            sb.append(", breathe_times=").append(this.breathe_times);
        }
        return sb.replace(0, 2, "GuideWordV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GuideWordV2)) {
            return false;
        }
        GuideWordV2 guideWordV2 = (GuideWordV2) obj;
        if (!unknownFields().equals(guideWordV2.unknownFields()) || !Internal.equals(this.word, guideWordV2.word) || !Internal.equals(this.search_word, guideWordV2.search_word) || !Internal.equals(this.type, guideWordV2.type) || !Internal.equals(this.breathe_times, guideWordV2.breathe_times)) {
            return false;
        }
        return true;
    }

    public GuideWordV2(String str, String str2, Integer num, Integer num2) {
        this(str, str2, num, num2, i.EMPTY);
    }

    public GuideWordV2(String str, String str2, Integer num, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.word = str;
        this.search_word = str2;
        this.type = num;
        this.breathe_times = num2;
    }
}
