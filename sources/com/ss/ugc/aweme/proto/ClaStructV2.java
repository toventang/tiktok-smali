package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class ClaStructV2 extends Message<ClaStructV2, Builder> {
    public static final ProtoAdapter<ClaStructV2> ADAPTER = new ProtoAdapter_ClaStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.CaptionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public List<CaptionStructV2> caption_infos;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer enable_auto_caption;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer has_original_audio;
    @WireField(adapter = "com.ss.ugc.aweme.proto.OriginalLanguageStructV2#ADAPTER", tag = 3)
    public OriginalLanguageStructV2 original_language_info;

    public ClaStructV2() {
    }

    static final class ProtoAdapter_ClaStructV2 extends ProtoAdapter<ClaStructV2> {
        static {
            Covode.recordClassIndex(101959);
        }

        public ProtoAdapter_ClaStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ClaStructV2.class);
        }

        public final int encodedSize(ClaStructV2 claStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, claStructV2.has_original_audio) + ProtoAdapter.INT32.encodedSizeWithTag(2, claStructV2.enable_auto_caption) + OriginalLanguageStructV2.ADAPTER.encodedSizeWithTag(3, claStructV2.original_language_info) + CaptionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(4, claStructV2.caption_infos) + claStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClaStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.has_original_audio(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.enable_auto_caption(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.original_language_info(OriginalLanguageStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.caption_infos.add(CaptionStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ClaStructV2 claStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, claStructV2.has_original_audio);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, claStructV2.enable_auto_caption);
            OriginalLanguageStructV2.ADAPTER.encodeWithTag(protoWriter, 3, claStructV2.original_language_info);
            CaptionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, claStructV2.caption_infos);
            protoWriter.writeBytes(claStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101957);
    }

    public static final class Builder extends Message.Builder<ClaStructV2, Builder> {
        public List<CaptionStructV2> caption_infos = Internal.newMutableList();
        public Integer enable_auto_caption;
        public Integer has_original_audio;
        public OriginalLanguageStructV2 original_language_info;

        static {
            Covode.recordClassIndex(101958);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ClaStructV2 build() {
            return new ClaStructV2(this.has_original_audio, this.enable_auto_caption, this.original_language_info, this.caption_infos, super.buildUnknownFields());
        }

        public final Builder enable_auto_caption(Integer num) {
            this.enable_auto_caption = num;
            return this;
        }

        public final Builder has_original_audio(Integer num) {
            this.has_original_audio = num;
            return this;
        }

        public final Builder original_language_info(OriginalLanguageStructV2 originalLanguageStructV2) {
            this.original_language_info = originalLanguageStructV2;
            return this;
        }

        public final Builder caption_infos(List<CaptionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.caption_infos = list;
            return this;
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.has_original_audio;
        int i5 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        Integer num2 = this.enable_auto_caption;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        OriginalLanguageStructV2 originalLanguageStructV2 = this.original_language_info;
        if (originalLanguageStructV2 != null) {
            i5 = originalLanguageStructV2.hashCode();
        }
        int hashCode2 = ((i7 + i5) * 37) + this.caption_infos.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ClaStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ClaStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.has_original_audio = this.has_original_audio;
        builder.enable_auto_caption = this.enable_auto_caption;
        builder.original_language_info = this.original_language_info;
        builder.caption_infos = Internal.copyOf("caption_infos", this.caption_infos);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.has_original_audio != null) {
            sb.append(", has_original_audio=").append(this.has_original_audio);
        }
        if (this.enable_auto_caption != null) {
            sb.append(", enable_auto_caption=").append(this.enable_auto_caption);
        }
        if (this.original_language_info != null) {
            sb.append(", original_language_info=").append(this.original_language_info);
        }
        if (!this.caption_infos.isEmpty()) {
            sb.append(", caption_infos=").append(this.caption_infos);
        }
        return sb.replace(0, 2, "ClaStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClaStructV2)) {
            return false;
        }
        ClaStructV2 claStructV2 = (ClaStructV2) obj;
        if (!unknownFields().equals(claStructV2.unknownFields()) || !Internal.equals(this.has_original_audio, claStructV2.has_original_audio) || !Internal.equals(this.enable_auto_caption, claStructV2.enable_auto_caption) || !Internal.equals(this.original_language_info, claStructV2.original_language_info) || !this.caption_infos.equals(claStructV2.caption_infos)) {
            return false;
        }
        return true;
    }

    public ClaStructV2(Integer num, Integer num2, OriginalLanguageStructV2 originalLanguageStructV2, List<CaptionStructV2> list) {
        this(num, num2, originalLanguageStructV2, list, i.EMPTY);
    }

    public ClaStructV2(Integer num, Integer num2, OriginalLanguageStructV2 originalLanguageStructV2, List<CaptionStructV2> list, i iVar) {
        super(ADAPTER, iVar);
        this.has_original_audio = num;
        this.enable_auto_caption = num2;
        this.original_language_info = originalLanguageStructV2;
        this.caption_infos = Internal.immutableCopyOf("caption_infos", list);
    }
}
