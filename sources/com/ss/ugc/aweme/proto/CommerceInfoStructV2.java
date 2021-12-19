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

public final class CommerceInfoStructV2 extends Message<CommerceInfoStructV2, Builder> {
    public static final ProtoAdapter<CommerceInfoStructV2> ADAPTER = new ProtoAdapter_CommerceInfoStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<ChallengeStructV2> challenge_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 head_image_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.OfflineInfoStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<OfflineInfoStructV2> offline_info_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String quick_shop_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String quick_shop_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String site_id;

    public CommerceInfoStructV2() {
    }

    static final class ProtoAdapter_CommerceInfoStructV2 extends ProtoAdapter<CommerceInfoStructV2> {
        static {
            Covode.recordClassIndex(101968);
        }

        public ProtoAdapter_CommerceInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceInfoStructV2.class);
        }

        public final int encodedSize(CommerceInfoStructV2 commerceInfoStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, commerceInfoStructV2.head_image_url) + OfflineInfoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(2, commerceInfoStructV2.offline_info_list) + ChallengeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(3, commerceInfoStructV2.challenge_list) + ProtoAdapter.STRING.encodedSizeWithTag(5, commerceInfoStructV2.quick_shop_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, commerceInfoStructV2.quick_shop_name) + ProtoAdapter.STRING.encodedSizeWithTag(7, commerceInfoStructV2.site_id) + commerceInfoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CommerceInfoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.head_image_url(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.offline_info_list.add(OfflineInfoStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.challenge_list.add(ChallengeStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 5) {
                    builder.quick_shop_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 6) {
                    builder.quick_shop_name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 7) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.site_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CommerceInfoStructV2 commerceInfoStructV2) {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, commerceInfoStructV2.head_image_url);
            OfflineInfoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, commerceInfoStructV2.offline_info_list);
            ChallengeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, commerceInfoStructV2.challenge_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, commerceInfoStructV2.quick_shop_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, commerceInfoStructV2.quick_shop_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, commerceInfoStructV2.site_id);
            protoWriter.writeBytes(commerceInfoStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101966);
    }

    public static final class Builder extends Message.Builder<CommerceInfoStructV2, Builder> {
        public List<ChallengeStructV2> challenge_list = Internal.newMutableList();
        public UrlStructV2 head_image_url;
        public List<OfflineInfoStructV2> offline_info_list = Internal.newMutableList();
        public String quick_shop_name;
        public String quick_shop_url;
        public String site_id;

        static {
            Covode.recordClassIndex(101967);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CommerceInfoStructV2 build() {
            return new CommerceInfoStructV2(this.head_image_url, this.offline_info_list, this.challenge_list, this.quick_shop_url, this.quick_shop_name, this.site_id, super.buildUnknownFields());
        }

        public final Builder head_image_url(UrlStructV2 urlStructV2) {
            this.head_image_url = urlStructV2;
            return this;
        }

        public final Builder quick_shop_name(String str) {
            this.quick_shop_name = str;
            return this;
        }

        public final Builder quick_shop_url(String str) {
            this.quick_shop_url = str;
            return this;
        }

        public final Builder site_id(String str) {
            this.site_id = str;
            return this;
        }

        public final Builder challenge_list(List<ChallengeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.challenge_list = list;
            return this;
        }

        public final Builder offline_info_list(List<OfflineInfoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.offline_info_list = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CommerceInfoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CommerceInfoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.head_image_url = this.head_image_url;
        builder.offline_info_list = Internal.copyOf("offline_info_list", this.offline_info_list);
        builder.challenge_list = Internal.copyOf("challenge_list", this.challenge_list);
        builder.quick_shop_url = this.quick_shop_url;
        builder.quick_shop_name = this.quick_shop_name;
        builder.site_id = this.site_id;
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
        UrlStructV2 urlStructV2 = this.head_image_url;
        int i6 = 0;
        if (urlStructV2 != null) {
            i2 = urlStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((((hashCode + i2) * 37) + this.offline_info_list.hashCode()) * 37) + this.challenge_list.hashCode()) * 37;
        String str = this.quick_shop_url;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (hashCode2 + i3) * 37;
        String str2 = this.quick_shop_name;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 37;
        String str3 = this.site_id;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int i9 = i8 + i6;
        this.hashCode = i9;
        return i9;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.head_image_url != null) {
            sb.append(", head_image_url=").append(this.head_image_url);
        }
        if (!this.offline_info_list.isEmpty()) {
            sb.append(", offline_info_list=").append(this.offline_info_list);
        }
        if (!this.challenge_list.isEmpty()) {
            sb.append(", challenge_list=").append(this.challenge_list);
        }
        if (this.quick_shop_url != null) {
            sb.append(", quick_shop_url=").append(this.quick_shop_url);
        }
        if (this.quick_shop_name != null) {
            sb.append(", quick_shop_name=").append(this.quick_shop_name);
        }
        if (this.site_id != null) {
            sb.append(", site_id=").append(this.site_id);
        }
        return sb.replace(0, 2, "CommerceInfoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceInfoStructV2)) {
            return false;
        }
        CommerceInfoStructV2 commerceInfoStructV2 = (CommerceInfoStructV2) obj;
        if (!unknownFields().equals(commerceInfoStructV2.unknownFields()) || !Internal.equals(this.head_image_url, commerceInfoStructV2.head_image_url) || !this.offline_info_list.equals(commerceInfoStructV2.offline_info_list) || !this.challenge_list.equals(commerceInfoStructV2.challenge_list) || !Internal.equals(this.quick_shop_url, commerceInfoStructV2.quick_shop_url) || !Internal.equals(this.quick_shop_name, commerceInfoStructV2.quick_shop_name) || !Internal.equals(this.site_id, commerceInfoStructV2.site_id)) {
            return false;
        }
        return true;
    }

    public CommerceInfoStructV2(UrlStructV2 urlStructV2, List<OfflineInfoStructV2> list, List<ChallengeStructV2> list2, String str, String str2, String str3) {
        this(urlStructV2, list, list2, str, str2, str3, i.EMPTY);
    }

    public CommerceInfoStructV2(UrlStructV2 urlStructV2, List<OfflineInfoStructV2> list, List<ChallengeStructV2> list2, String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.head_image_url = urlStructV2;
        this.offline_info_list = Internal.immutableCopyOf("offline_info_list", list);
        this.challenge_list = Internal.immutableCopyOf("challenge_list", list2);
        this.quick_shop_url = str;
        this.quick_shop_name = str2;
        this.site_id = str3;
    }
}
