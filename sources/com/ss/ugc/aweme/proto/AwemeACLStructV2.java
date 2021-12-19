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
import java.util.List;
import k.i;

public final class AwemeACLStructV2 extends Message<AwemeACLStructV2, Builder> {
    public static final ProtoAdapter<AwemeACLStructV2> ADAPTER = new ProtoAdapter_AwemeACLStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", tag = 1)
    public ACLCommonStructV2 download_general;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", tag = 2)
    public ACLCommonStructV2 download_mask_panel;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", tag = 3)
    public ACLCommonStructV2 download_share_panel;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public List<ACLCommonStructV2> platform_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public ACLCommonStructV2 share_general;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer share_list_status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public ACLCommonStructV2 share_third_platform;

    public AwemeACLStructV2() {
    }

    static final class ProtoAdapter_AwemeACLStructV2 extends ProtoAdapter<AwemeACLStructV2> {
        static {
            Covode.recordClassIndex(101878);
        }

        public ProtoAdapter_AwemeACLStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeACLStructV2.class);
        }

        public final int encodedSize(AwemeACLStructV2 awemeACLStructV2) {
            return ACLCommonStructV2.ADAPTER.encodedSizeWithTag(1, awemeACLStructV2.download_general) + ACLCommonStructV2.ADAPTER.encodedSizeWithTag(2, awemeACLStructV2.download_mask_panel) + ACLCommonStructV2.ADAPTER.encodedSizeWithTag(3, awemeACLStructV2.download_share_panel) + ProtoAdapter.INT32.encodedSizeWithTag(4, awemeACLStructV2.share_list_status) + ACLCommonStructV2.ADAPTER.encodedSizeWithTag(5, awemeACLStructV2.share_general) + ACLCommonStructV2.ADAPTER.asRepeated().encodedSizeWithTag(6, awemeACLStructV2.platform_list) + ACLCommonStructV2.ADAPTER.encodedSizeWithTag(7, awemeACLStructV2.share_third_platform) + awemeACLStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeACLStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.download_general(ACLCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.download_mask_panel(ACLCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.download_share_panel(ACLCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.share_list_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.share_general(ACLCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.platform_list.add(ACLCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.share_third_platform(ACLCommonStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeACLStructV2 awemeACLStructV2) {
            ACLCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 1, awemeACLStructV2.download_general);
            ACLCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 2, awemeACLStructV2.download_mask_panel);
            ACLCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 3, awemeACLStructV2.download_share_panel);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, awemeACLStructV2.share_list_status);
            ACLCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 5, awemeACLStructV2.share_general);
            ACLCommonStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, awemeACLStructV2.platform_list);
            ACLCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 7, awemeACLStructV2.share_third_platform);
            protoWriter.writeBytes(awemeACLStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101876);
    }

    public static final class Builder extends Message.Builder<AwemeACLStructV2, Builder> {
        public ACLCommonStructV2 download_general;
        public ACLCommonStructV2 download_mask_panel;
        public ACLCommonStructV2 download_share_panel;
        public List<ACLCommonStructV2> platform_list = Internal.newMutableList();
        public ACLCommonStructV2 share_general;
        public Integer share_list_status;
        public ACLCommonStructV2 share_third_platform;

        static {
            Covode.recordClassIndex(101877);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeACLStructV2 build() {
            return new AwemeACLStructV2(this.download_general, this.download_mask_panel, this.download_share_panel, this.share_list_status, this.share_general, this.platform_list, this.share_third_platform, super.buildUnknownFields());
        }

        public final Builder download_general(ACLCommonStructV2 aCLCommonStructV2) {
            this.download_general = aCLCommonStructV2;
            return this;
        }

        public final Builder download_mask_panel(ACLCommonStructV2 aCLCommonStructV2) {
            this.download_mask_panel = aCLCommonStructV2;
            return this;
        }

        public final Builder download_share_panel(ACLCommonStructV2 aCLCommonStructV2) {
            this.download_share_panel = aCLCommonStructV2;
            return this;
        }

        public final Builder share_general(ACLCommonStructV2 aCLCommonStructV2) {
            this.share_general = aCLCommonStructV2;
            return this;
        }

        public final Builder share_list_status(Integer num) {
            this.share_list_status = num;
            return this;
        }

        public final Builder share_third_platform(ACLCommonStructV2 aCLCommonStructV2) {
            this.share_third_platform = aCLCommonStructV2;
            return this;
        }

        public final Builder platform_list(List<ACLCommonStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.platform_list = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeACLStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeACLStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.download_general = this.download_general;
        builder.download_mask_panel = this.download_mask_panel;
        builder.download_share_panel = this.download_share_panel;
        builder.share_list_status = this.share_list_status;
        builder.share_general = this.share_general;
        builder.platform_list = Internal.copyOf("platform_list", this.platform_list);
        builder.share_third_platform = this.share_third_platform;
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
        ACLCommonStructV2 aCLCommonStructV2 = this.download_general;
        int i8 = 0;
        if (aCLCommonStructV2 != null) {
            i2 = aCLCommonStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        ACLCommonStructV2 aCLCommonStructV22 = this.download_mask_panel;
        if (aCLCommonStructV22 != null) {
            i3 = aCLCommonStructV22.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        ACLCommonStructV2 aCLCommonStructV23 = this.download_share_panel;
        if (aCLCommonStructV23 != null) {
            i4 = aCLCommonStructV23.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        Integer num = this.share_list_status;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        ACLCommonStructV2 aCLCommonStructV24 = this.share_general;
        if (aCLCommonStructV24 != null) {
            i6 = aCLCommonStructV24.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode2 = (((i12 + i6) * 37) + this.platform_list.hashCode()) * 37;
        ACLCommonStructV2 aCLCommonStructV25 = this.share_third_platform;
        if (aCLCommonStructV25 != null) {
            i8 = aCLCommonStructV25.hashCode();
        }
        int i13 = hashCode2 + i8;
        this.hashCode = i13;
        return i13;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.download_general != null) {
            sb.append(", download_general=").append(this.download_general);
        }
        if (this.download_mask_panel != null) {
            sb.append(", download_mask_panel=").append(this.download_mask_panel);
        }
        if (this.download_share_panel != null) {
            sb.append(", download_share_panel=").append(this.download_share_panel);
        }
        if (this.share_list_status != null) {
            sb.append(", share_list_status=").append(this.share_list_status);
        }
        if (this.share_general != null) {
            sb.append(", share_general=").append(this.share_general);
        }
        if (!this.platform_list.isEmpty()) {
            sb.append(", platform_list=").append(this.platform_list);
        }
        if (this.share_third_platform != null) {
            sb.append(", share_third_platform=").append(this.share_third_platform);
        }
        return sb.replace(0, 2, "AwemeACLStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeACLStructV2)) {
            return false;
        }
        AwemeACLStructV2 awemeACLStructV2 = (AwemeACLStructV2) obj;
        if (!unknownFields().equals(awemeACLStructV2.unknownFields()) || !Internal.equals(this.download_general, awemeACLStructV2.download_general) || !Internal.equals(this.download_mask_panel, awemeACLStructV2.download_mask_panel) || !Internal.equals(this.download_share_panel, awemeACLStructV2.download_share_panel) || !Internal.equals(this.share_list_status, awemeACLStructV2.share_list_status) || !Internal.equals(this.share_general, awemeACLStructV2.share_general) || !this.platform_list.equals(awemeACLStructV2.platform_list) || !Internal.equals(this.share_third_platform, awemeACLStructV2.share_third_platform)) {
            return false;
        }
        return true;
    }

    public AwemeACLStructV2(ACLCommonStructV2 aCLCommonStructV2, ACLCommonStructV2 aCLCommonStructV22, ACLCommonStructV2 aCLCommonStructV23, Integer num, ACLCommonStructV2 aCLCommonStructV24, List<ACLCommonStructV2> list, ACLCommonStructV2 aCLCommonStructV25) {
        this(aCLCommonStructV2, aCLCommonStructV22, aCLCommonStructV23, num, aCLCommonStructV24, list, aCLCommonStructV25, i.EMPTY);
    }

    public AwemeACLStructV2(ACLCommonStructV2 aCLCommonStructV2, ACLCommonStructV2 aCLCommonStructV22, ACLCommonStructV2 aCLCommonStructV23, Integer num, ACLCommonStructV2 aCLCommonStructV24, List<ACLCommonStructV2> list, ACLCommonStructV2 aCLCommonStructV25, i iVar) {
        super(ADAPTER, iVar);
        this.download_general = aCLCommonStructV2;
        this.download_mask_panel = aCLCommonStructV22;
        this.download_share_panel = aCLCommonStructV23;
        this.share_list_status = num;
        this.share_general = aCLCommonStructV24;
        this.platform_list = Internal.immutableCopyOf("platform_list", list);
        this.share_third_platform = aCLCommonStructV25;
    }
}
