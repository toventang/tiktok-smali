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

public final class ACLCommonStructV2 extends Message<ACLCommonStructV2, Builder> {
    public static final ProtoAdapter<ACLCommonStructV2> ADAPTER = new ProtoAdapter_ACLCommonStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean mute;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String platform_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String popup_msg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer show_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String toast_msg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Integer transcode;

    public ACLCommonStructV2() {
    }

    static final class ProtoAdapter_ACLCommonStructV2 extends ProtoAdapter<ACLCommonStructV2> {
        static {
            Covode.recordClassIndex(101836);
        }

        public ProtoAdapter_ACLCommonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ACLCommonStructV2.class);
        }

        public final int encodedSize(ACLCommonStructV2 aCLCommonStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, aCLCommonStructV2.code) + ProtoAdapter.INT32.encodedSizeWithTag(2, aCLCommonStructV2.show_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, aCLCommonStructV2.toast_msg) + ProtoAdapter.STRING.encodedSizeWithTag(4, aCLCommonStructV2.extra) + ProtoAdapter.INT32.encodedSizeWithTag(5, aCLCommonStructV2.transcode) + ProtoAdapter.BOOL.encodedSizeWithTag(6, aCLCommonStructV2.mute) + ProtoAdapter.STRING.encodedSizeWithTag(7, aCLCommonStructV2.popup_msg) + ProtoAdapter.STRING.encodedSizeWithTag(8, aCLCommonStructV2.platform_id) + aCLCommonStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ACLCommonStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.code(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.show_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.toast_msg(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.transcode(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.mute(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.popup_msg(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.platform_id(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ACLCommonStructV2 aCLCommonStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, aCLCommonStructV2.code);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, aCLCommonStructV2.show_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, aCLCommonStructV2.toast_msg);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, aCLCommonStructV2.extra);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, aCLCommonStructV2.transcode);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, aCLCommonStructV2.mute);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, aCLCommonStructV2.popup_msg);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, aCLCommonStructV2.platform_id);
            protoWriter.writeBytes(aCLCommonStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101834);
    }

    public static final class Builder extends Message.Builder<ACLCommonStructV2, Builder> {
        public Integer code;
        public String extra;
        public Boolean mute;
        public String platform_id;
        public String popup_msg;
        public Integer show_type;
        public String toast_msg;
        public Integer transcode;

        static {
            Covode.recordClassIndex(101835);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ACLCommonStructV2 build() {
            return new ACLCommonStructV2(this.code, this.show_type, this.toast_msg, this.extra, this.transcode, this.mute, this.popup_msg, this.platform_id, super.buildUnknownFields());
        }

        public final Builder code(Integer num) {
            this.code = num;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder mute(Boolean bool) {
            this.mute = bool;
            return this;
        }

        public final Builder platform_id(String str) {
            this.platform_id = str;
            return this;
        }

        public final Builder popup_msg(String str) {
            this.popup_msg = str;
            return this;
        }

        public final Builder show_type(Integer num) {
            this.show_type = num;
            return this;
        }

        public final Builder toast_msg(String str) {
            this.toast_msg = str;
            return this;
        }

        public final Builder transcode(Integer num) {
            this.transcode = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ACLCommonStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ACLCommonStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.code = this.code;
        builder.show_type = this.show_type;
        builder.toast_msg = this.toast_msg;
        builder.extra = this.extra;
        builder.transcode = this.transcode;
        builder.mute = this.mute;
        builder.popup_msg = this.popup_msg;
        builder.platform_id = this.platform_id;
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
        int i8;
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.code;
        int i10 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 37;
        Integer num2 = this.show_type;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        String str = this.toast_msg;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        String str2 = this.extra;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        Integer num3 = this.transcode;
        if (num3 != null) {
            i6 = num3.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        Boolean bool = this.mute;
        if (bool != null) {
            i7 = bool.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        String str3 = this.popup_msg;
        if (str3 != null) {
            i8 = str3.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        String str4 = this.platform_id;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.code != null) {
            sb.append(", code=").append(this.code);
        }
        if (this.show_type != null) {
            sb.append(", show_type=").append(this.show_type);
        }
        if (this.toast_msg != null) {
            sb.append(", toast_msg=").append(this.toast_msg);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.transcode != null) {
            sb.append(", transcode=").append(this.transcode);
        }
        if (this.mute != null) {
            sb.append(", mute=").append(this.mute);
        }
        if (this.popup_msg != null) {
            sb.append(", popup_msg=").append(this.popup_msg);
        }
        if (this.platform_id != null) {
            sb.append(", platform_id=").append(this.platform_id);
        }
        return sb.replace(0, 2, "ACLCommonStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ACLCommonStructV2)) {
            return false;
        }
        ACLCommonStructV2 aCLCommonStructV2 = (ACLCommonStructV2) obj;
        if (!unknownFields().equals(aCLCommonStructV2.unknownFields()) || !Internal.equals(this.code, aCLCommonStructV2.code) || !Internal.equals(this.show_type, aCLCommonStructV2.show_type) || !Internal.equals(this.toast_msg, aCLCommonStructV2.toast_msg) || !Internal.equals(this.extra, aCLCommonStructV2.extra) || !Internal.equals(this.transcode, aCLCommonStructV2.transcode) || !Internal.equals(this.mute, aCLCommonStructV2.mute) || !Internal.equals(this.popup_msg, aCLCommonStructV2.popup_msg) || !Internal.equals(this.platform_id, aCLCommonStructV2.platform_id)) {
            return false;
        }
        return true;
    }

    public ACLCommonStructV2(Integer num, Integer num2, String str, String str2, Integer num3, Boolean bool, String str3, String str4) {
        this(num, num2, str, str2, num3, bool, str3, str4, i.EMPTY);
    }

    public ACLCommonStructV2(Integer num, Integer num2, String str, String str2, Integer num3, Boolean bool, String str3, String str4, i iVar) {
        super(ADAPTER, iVar);
        this.code = num;
        this.show_type = num2;
        this.toast_msg = str;
        this.extra = str2;
        this.transcode = num3;
        this.mute = bool;
        this.popup_msg = str3;
        this.platform_id = str4;
    }
}
