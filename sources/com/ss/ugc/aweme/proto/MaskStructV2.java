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

public final class MaskStructV2 extends Message<MaskStructV2, Builder> {
    public static final ProtoAdapter<MaskStructV2> ADAPTER = new ProtoAdapter_MaskStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String cancel_mask_label;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer mask_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public Boolean show_mask;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String title;

    public MaskStructV2() {
    }

    static final class ProtoAdapter_MaskStructV2 extends ProtoAdapter<MaskStructV2> {
        static {
            Covode.recordClassIndex(102088);
        }

        public ProtoAdapter_MaskStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MaskStructV2.class);
        }

        public final int encodedSize(MaskStructV2 maskStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, maskStructV2.show_mask) + ProtoAdapter.INT32.encodedSizeWithTag(2, maskStructV2.mask_type) + ProtoAdapter.INT32.encodedSizeWithTag(3, maskStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(4, maskStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(5, maskStructV2.content) + ProtoAdapter.STRING.encodedSizeWithTag(6, maskStructV2.cancel_mask_label) + maskStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MaskStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show_mask(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.mask_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.cancel_mask_label(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MaskStructV2 maskStructV2) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, maskStructV2.show_mask);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, maskStructV2.mask_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, maskStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, maskStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, maskStructV2.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, maskStructV2.cancel_mask_label);
            protoWriter.writeBytes(maskStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102086);
    }

    public static final class Builder extends Message.Builder<MaskStructV2, Builder> {
        public String cancel_mask_label;
        public String content;
        public Integer mask_type;
        public Boolean show_mask;
        public Integer status;
        public String title;

        static {
            Covode.recordClassIndex(102087);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MaskStructV2 build() {
            Boolean bool = this.show_mask;
            if (bool != null && this.mask_type != null) {
                return new MaskStructV2(this.show_mask, this.mask_type, this.status, this.title, this.content, this.cancel_mask_label, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "show_mask", this.mask_type, "mask_type");
        }

        public final Builder cancel_mask_label(String str) {
            this.cancel_mask_label = str;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder mask_type(Integer num) {
            this.mask_type = num;
            return this;
        }

        public final Builder show_mask(Boolean bool) {
            this.show_mask = bool;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MaskStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MaskStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.show_mask = this.show_mask;
        builder.mask_type = this.mask_type;
        builder.status = this.status;
        builder.title = this.title;
        builder.content = this.content;
        builder.cancel_mask_label = this.cancel_mask_label;
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
        int hashCode = ((((unknownFields().hashCode() * 37) + this.show_mask.hashCode()) * 37) + this.mask_type.hashCode()) * 37;
        Integer num = this.status;
        int i6 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str = this.title;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        String str2 = this.content;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        String str3 = this.cancel_mask_label;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", show_mask=").append(this.show_mask);
        sb.append(", mask_type=").append(this.mask_type);
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=").append(this.content);
        }
        if (this.cancel_mask_label != null) {
            sb.append(", cancel_mask_label=").append(this.cancel_mask_label);
        }
        return sb.replace(0, 2, "MaskStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaskStructV2)) {
            return false;
        }
        MaskStructV2 maskStructV2 = (MaskStructV2) obj;
        if (!unknownFields().equals(maskStructV2.unknownFields()) || !this.show_mask.equals(maskStructV2.show_mask) || !this.mask_type.equals(maskStructV2.mask_type) || !Internal.equals(this.status, maskStructV2.status) || !Internal.equals(this.title, maskStructV2.title) || !Internal.equals(this.content, maskStructV2.content) || !Internal.equals(this.cancel_mask_label, maskStructV2.cancel_mask_label)) {
            return false;
        }
        return true;
    }

    public MaskStructV2(Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this(bool, num, num2, str, str2, str3, i.EMPTY);
    }

    public MaskStructV2(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.show_mask = bool;
        this.mask_type = num;
        this.status = num2;
        this.title = str;
        this.content = str2;
        this.cancel_mask_label = str3;
    }
}
