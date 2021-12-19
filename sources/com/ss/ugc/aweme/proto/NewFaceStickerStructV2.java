package com.ss.ugc.aweme.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
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

public final class NewFaceStickerStructV2 extends Message<NewFaceStickerStructV2, Builder> {
    public static final ProtoAdapter<NewFaceStickerStructV2> ADAPTER = new ProtoAdapter_NewFaceStickerStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 avatar_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 15)
    public UrlStructV2 avatar_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_SELECT_SCENE)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 3)
    public List<String> children;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceStickerStructV2#ADAPTER", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public CommerceStickerStructV2 commerce_sticker;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String effect_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public String extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Boolean is_favorite;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String owner_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String owner_nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 19)
    public String sec_uid;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public List<String> tags;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer user_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 17)
    public Long vv_count;

    public NewFaceStickerStructV2() {
    }

    static final class ProtoAdapter_NewFaceStickerStructV2 extends ProtoAdapter<NewFaceStickerStructV2> {
        static {
            Covode.recordClassIndex(102145);
        }

        public ProtoAdapter_NewFaceStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, NewFaceStickerStructV2.class);
        }

        public final int encodedSize(NewFaceStickerStructV2 newFaceStickerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, newFaceStickerStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, newFaceStickerStructV2.name) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, newFaceStickerStructV2.children) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, newFaceStickerStructV2.icon_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, newFaceStickerStructV2.owner_id) + ProtoAdapter.STRING.encodedSizeWithTag(6, newFaceStickerStructV2.owner_nickname) + ProtoAdapter.INT32.encodedSizeWithTag(7, newFaceStickerStructV2.user_count) + ProtoAdapter.STRING.encodedSizeWithTag(8, newFaceStickerStructV2.desc) + ProtoAdapter.STRING.encodedSizeWithTag(9, newFaceStickerStructV2.effect_id) + ShareStructV2.ADAPTER.encodedSizeWithTag(10, newFaceStickerStructV2.share_info) + ProtoAdapter.BOOL.encodedSizeWithTag(11, newFaceStickerStructV2.is_favorite) + CommerceStickerStructV2.ADAPTER.encodedSizeWithTag(12, newFaceStickerStructV2.commerce_sticker) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(13, newFaceStickerStructV2.tags) + UrlStructV2.ADAPTER.encodedSizeWithTag(14, newFaceStickerStructV2.avatar_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(15, newFaceStickerStructV2.avatar_medium) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, newFaceStickerStructV2.avatar_large) + ProtoAdapter.INT64.encodedSizeWithTag(17, newFaceStickerStructV2.vv_count) + ProtoAdapter.STRING.encodedSizeWithTag(18, newFaceStickerStructV2.extra) + ProtoAdapter.STRING.encodedSizeWithTag(19, newFaceStickerStructV2.sec_uid) + newFaceStickerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final NewFaceStickerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.children.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.icon_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.owner_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.owner_nickname(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.user_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.effect_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.share_info(ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.is_favorite(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.commerce_sticker(CommerceStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.tags.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.avatar_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.avatar_medium(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.avatar_large(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.vv_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 19:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, NewFaceStickerStructV2 newFaceStickerStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, newFaceStickerStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, newFaceStickerStructV2.name);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, newFaceStickerStructV2.children);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, newFaceStickerStructV2.icon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, newFaceStickerStructV2.owner_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, newFaceStickerStructV2.owner_nickname);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, newFaceStickerStructV2.user_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, newFaceStickerStructV2.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, newFaceStickerStructV2.effect_id);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 10, newFaceStickerStructV2.share_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, newFaceStickerStructV2.is_favorite);
            CommerceStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 12, newFaceStickerStructV2.commerce_sticker);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 13, newFaceStickerStructV2.tags);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 14, newFaceStickerStructV2.avatar_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 15, newFaceStickerStructV2.avatar_medium);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, newFaceStickerStructV2.avatar_large);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, newFaceStickerStructV2.vv_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, newFaceStickerStructV2.extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, newFaceStickerStructV2.sec_uid);
            protoWriter.writeBytes(newFaceStickerStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102143);
    }

    public static final class Builder extends Message.Builder<NewFaceStickerStructV2, Builder> {
        public UrlStructV2 avatar_large;
        public UrlStructV2 avatar_medium;
        public UrlStructV2 avatar_thumb;
        public List<String> children = Internal.newMutableList();
        public CommerceStickerStructV2 commerce_sticker;
        public String desc;
        public String effect_id;
        public String extra;
        public UrlStructV2 icon_url;
        public String id;
        public Boolean is_favorite;
        public String name;
        public String owner_id;
        public String owner_nickname;
        public String sec_uid;
        public ShareStructV2 share_info;
        public List<String> tags = Internal.newMutableList();
        public Integer user_count;
        public Long vv_count;

        static {
            Covode.recordClassIndex(102144);
        }

        @Override // com.squareup.wire.Message.Builder
        public final NewFaceStickerStructV2 build() {
            return new NewFaceStickerStructV2(this.id, this.name, this.children, this.icon_url, this.owner_id, this.owner_nickname, this.user_count, this.desc, this.effect_id, this.share_info, this.is_favorite, this.commerce_sticker, this.tags, this.avatar_thumb, this.avatar_medium, this.avatar_large, this.vv_count, this.extra, this.sec_uid, super.buildUnknownFields());
        }

        public final Builder avatar_large(UrlStructV2 urlStructV2) {
            this.avatar_large = urlStructV2;
            return this;
        }

        public final Builder avatar_medium(UrlStructV2 urlStructV2) {
            this.avatar_medium = urlStructV2;
            return this;
        }

        public final Builder avatar_thumb(UrlStructV2 urlStructV2) {
            this.avatar_thumb = urlStructV2;
            return this;
        }

        public final Builder commerce_sticker(CommerceStickerStructV2 commerceStickerStructV2) {
            this.commerce_sticker = commerceStickerStructV2;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder effect_id(String str) {
            this.effect_id = str;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder icon_url(UrlStructV2 urlStructV2) {
            this.icon_url = urlStructV2;
            return this;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder is_favorite(Boolean bool) {
            this.is_favorite = bool;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder owner_id(String str) {
            this.owner_id = str;
            return this;
        }

        public final Builder owner_nickname(String str) {
            this.owner_nickname = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder user_count(Integer num) {
            this.user_count = num;
            return this;
        }

        public final Builder vv_count(Long l2) {
            this.vv_count = l2;
            return this;
        }

        public final Builder children(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.children = list;
            return this;
        }

        public final Builder tags(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.tags = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.NewFaceStickerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<NewFaceStickerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.name = this.name;
        builder.children = Internal.copyOf("children", this.children);
        builder.icon_url = this.icon_url;
        builder.owner_id = this.owner_id;
        builder.owner_nickname = this.owner_nickname;
        builder.user_count = this.user_count;
        builder.desc = this.desc;
        builder.effect_id = this.effect_id;
        builder.share_info = this.share_info;
        builder.is_favorite = this.is_favorite;
        builder.commerce_sticker = this.commerce_sticker;
        builder.tags = Internal.copyOf("tags", this.tags);
        builder.avatar_thumb = this.avatar_thumb;
        builder.avatar_medium = this.avatar_medium;
        builder.avatar_large = this.avatar_large;
        builder.vv_count = this.vv_count;
        builder.extra = this.extra;
        builder.sec_uid = this.sec_uid;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.hashCode;
        if (i18 != 0) {
            return i18;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int i19 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i20 = (hashCode + i2) * 37;
        String str2 = this.name;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((i20 + i3) * 37) + this.children.hashCode()) * 37;
        UrlStructV2 urlStructV2 = this.icon_url;
        if (urlStructV2 != null) {
            i4 = urlStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i21 = (hashCode2 + i4) * 37;
        String str3 = this.owner_id;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i22 = (i21 + i5) * 37;
        String str4 = this.owner_nickname;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (i22 + i6) * 37;
        Integer num = this.user_count;
        if (num != null) {
            i7 = num.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 37;
        String str5 = this.desc;
        if (str5 != null) {
            i8 = str5.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 37;
        String str6 = this.effect_id;
        if (str6 != null) {
            i9 = str6.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 37;
        ShareStructV2 shareStructV2 = this.share_info;
        if (shareStructV2 != null) {
            i10 = shareStructV2.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 37;
        Boolean bool = this.is_favorite;
        if (bool != null) {
            i11 = bool.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 37;
        CommerceStickerStructV2 commerceStickerStructV2 = this.commerce_sticker;
        if (commerceStickerStructV2 != null) {
            i12 = commerceStickerStructV2.hashCode();
        } else {
            i12 = 0;
        }
        int hashCode3 = (((i28 + i12) * 37) + this.tags.hashCode()) * 37;
        UrlStructV2 urlStructV22 = this.avatar_thumb;
        if (urlStructV22 != null) {
            i13 = urlStructV22.hashCode();
        } else {
            i13 = 0;
        }
        int i29 = (hashCode3 + i13) * 37;
        UrlStructV2 urlStructV23 = this.avatar_medium;
        if (urlStructV23 != null) {
            i14 = urlStructV23.hashCode();
        } else {
            i14 = 0;
        }
        int i30 = (i29 + i14) * 37;
        UrlStructV2 urlStructV24 = this.avatar_large;
        if (urlStructV24 != null) {
            i15 = urlStructV24.hashCode();
        } else {
            i15 = 0;
        }
        int i31 = (i30 + i15) * 37;
        Long l2 = this.vv_count;
        if (l2 != null) {
            i16 = l2.hashCode();
        } else {
            i16 = 0;
        }
        int i32 = (i31 + i16) * 37;
        String str7 = this.extra;
        if (str7 != null) {
            i17 = str7.hashCode();
        } else {
            i17 = 0;
        }
        int i33 = (i32 + i17) * 37;
        String str8 = this.sec_uid;
        if (str8 != null) {
            i19 = str8.hashCode();
        }
        int i34 = i33 + i19;
        this.hashCode = i34;
        return i34;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=").append(this.name);
        }
        if (!this.children.isEmpty()) {
            sb.append(", children=").append(this.children);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=").append(this.icon_url);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=").append(this.owner_id);
        }
        if (this.owner_nickname != null) {
            sb.append(", owner_nickname=").append(this.owner_nickname);
        }
        if (this.user_count != null) {
            sb.append(", user_count=").append(this.user_count);
        }
        if (this.desc != null) {
            sb.append(", desc=").append(this.desc);
        }
        if (this.effect_id != null) {
            sb.append(", effect_id=").append(this.effect_id);
        }
        if (this.share_info != null) {
            sb.append(", share_info=").append(this.share_info);
        }
        if (this.is_favorite != null) {
            sb.append(", is_favorite=").append(this.is_favorite);
        }
        if (this.commerce_sticker != null) {
            sb.append(", commerce_sticker=").append(this.commerce_sticker);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=").append(this.tags);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=").append(this.avatar_thumb);
        }
        if (this.avatar_medium != null) {
            sb.append(", avatar_medium=").append(this.avatar_medium);
        }
        if (this.avatar_large != null) {
            sb.append(", avatar_large=").append(this.avatar_large);
        }
        if (this.vv_count != null) {
            sb.append(", vv_count=").append(this.vv_count);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=").append(this.sec_uid);
        }
        return sb.replace(0, 2, "NewFaceStickerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewFaceStickerStructV2)) {
            return false;
        }
        NewFaceStickerStructV2 newFaceStickerStructV2 = (NewFaceStickerStructV2) obj;
        if (!unknownFields().equals(newFaceStickerStructV2.unknownFields()) || !Internal.equals(this.id, newFaceStickerStructV2.id) || !Internal.equals(this.name, newFaceStickerStructV2.name) || !this.children.equals(newFaceStickerStructV2.children) || !Internal.equals(this.icon_url, newFaceStickerStructV2.icon_url) || !Internal.equals(this.owner_id, newFaceStickerStructV2.owner_id) || !Internal.equals(this.owner_nickname, newFaceStickerStructV2.owner_nickname) || !Internal.equals(this.user_count, newFaceStickerStructV2.user_count) || !Internal.equals(this.desc, newFaceStickerStructV2.desc) || !Internal.equals(this.effect_id, newFaceStickerStructV2.effect_id) || !Internal.equals(this.share_info, newFaceStickerStructV2.share_info) || !Internal.equals(this.is_favorite, newFaceStickerStructV2.is_favorite) || !Internal.equals(this.commerce_sticker, newFaceStickerStructV2.commerce_sticker) || !this.tags.equals(newFaceStickerStructV2.tags) || !Internal.equals(this.avatar_thumb, newFaceStickerStructV2.avatar_thumb) || !Internal.equals(this.avatar_medium, newFaceStickerStructV2.avatar_medium) || !Internal.equals(this.avatar_large, newFaceStickerStructV2.avatar_large) || !Internal.equals(this.vv_count, newFaceStickerStructV2.vv_count) || !Internal.equals(this.extra, newFaceStickerStructV2.extra) || !Internal.equals(this.sec_uid, newFaceStickerStructV2.sec_uid)) {
            return false;
        }
        return true;
    }

    public NewFaceStickerStructV2(String str, String str2, List<String> list, UrlStructV2 urlStructV2, String str3, String str4, Integer num, String str5, String str6, ShareStructV2 shareStructV2, Boolean bool, CommerceStickerStructV2 commerceStickerStructV2, List<String> list2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, Long l2, String str7, String str8) {
        this(str, str2, list, urlStructV2, str3, str4, num, str5, str6, shareStructV2, bool, commerceStickerStructV2, list2, urlStructV22, urlStructV23, urlStructV24, l2, str7, str8, i.EMPTY);
    }

    public NewFaceStickerStructV2(String str, String str2, List<String> list, UrlStructV2 urlStructV2, String str3, String str4, Integer num, String str5, String str6, ShareStructV2 shareStructV2, Boolean bool, CommerceStickerStructV2 commerceStickerStructV2, List<String> list2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, Long l2, String str7, String str8, i iVar) {
        super(ADAPTER, iVar);
        this.id = str;
        this.name = str2;
        this.children = Internal.immutableCopyOf("children", list);
        this.icon_url = urlStructV2;
        this.owner_id = str3;
        this.owner_nickname = str4;
        this.user_count = num;
        this.desc = str5;
        this.effect_id = str6;
        this.share_info = shareStructV2;
        this.is_favorite = bool;
        this.commerce_sticker = commerceStickerStructV2;
        this.tags = Internal.immutableCopyOf("tags", list2);
        this.avatar_thumb = urlStructV22;
        this.avatar_medium = urlStructV23;
        this.avatar_large = urlStructV24;
        this.vv_count = l2;
        this.extra = str7;
        this.sec_uid = str8;
    }
}
