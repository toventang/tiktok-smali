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

public final class CommerceUserStructV2 extends Message<CommerceUserStructV2, Builder> {
    public static final ProtoAdapter<CommerceUserStructV2> ADAPTER = new ProtoAdapter_CommerceUserStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Integer ad_influencer_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean has_ads_entry;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LinkUserInfoStructV2#ADAPTER", tag = 4)
    public LinkUserInfoStructV2 link_user_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean show_star_atlas_cooperation;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer star_atlas;

    public CommerceUserStructV2() {
    }

    static final class ProtoAdapter_CommerceUserStructV2 extends ProtoAdapter<CommerceUserStructV2> {
        static {
            Covode.recordClassIndex(101980);
        }

        public ProtoAdapter_CommerceUserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceUserStructV2.class);
        }

        public final int encodedSize(CommerceUserStructV2 commerceUserStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, commerceUserStructV2.star_atlas) + ProtoAdapter.BOOL.encodedSizeWithTag(2, commerceUserStructV2.show_star_atlas_cooperation) + ProtoAdapter.BOOL.encodedSizeWithTag(3, commerceUserStructV2.has_ads_entry) + LinkUserInfoStructV2.ADAPTER.encodedSizeWithTag(4, commerceUserStructV2.link_user_info) + ProtoAdapter.INT32.encodedSizeWithTag(5, commerceUserStructV2.ad_influencer_type) + commerceUserStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CommerceUserStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.star_atlas(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.show_star_atlas_cooperation(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.has_ads_entry(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.link_user_info(LinkUserInfoStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ad_influencer_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CommerceUserStructV2 commerceUserStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commerceUserStructV2.star_atlas);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, commerceUserStructV2.show_star_atlas_cooperation);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, commerceUserStructV2.has_ads_entry);
            LinkUserInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 4, commerceUserStructV2.link_user_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, commerceUserStructV2.ad_influencer_type);
            protoWriter.writeBytes(commerceUserStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101978);
    }

    public static final class Builder extends Message.Builder<CommerceUserStructV2, Builder> {
        public Integer ad_influencer_type;
        public Boolean has_ads_entry;
        public LinkUserInfoStructV2 link_user_info;
        public Boolean show_star_atlas_cooperation;
        public Integer star_atlas;

        static {
            Covode.recordClassIndex(101979);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CommerceUserStructV2 build() {
            return new CommerceUserStructV2(this.star_atlas, this.show_star_atlas_cooperation, this.has_ads_entry, this.link_user_info, this.ad_influencer_type, super.buildUnknownFields());
        }

        public final Builder ad_influencer_type(Integer num) {
            this.ad_influencer_type = num;
            return this;
        }

        public final Builder has_ads_entry(Boolean bool) {
            this.has_ads_entry = bool;
            return this;
        }

        public final Builder link_user_info(LinkUserInfoStructV2 linkUserInfoStructV2) {
            this.link_user_info = linkUserInfoStructV2;
            return this;
        }

        public final Builder show_star_atlas_cooperation(Boolean bool) {
            this.show_star_atlas_cooperation = bool;
            return this;
        }

        public final Builder star_atlas(Integer num) {
            this.star_atlas = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CommerceUserStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CommerceUserStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.star_atlas = this.star_atlas;
        builder.show_star_atlas_cooperation = this.show_star_atlas_cooperation;
        builder.has_ads_entry = this.has_ads_entry;
        builder.link_user_info = this.link_user_info;
        builder.ad_influencer_type = this.ad_influencer_type;
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
        Integer num = this.star_atlas;
        int i7 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        Boolean bool = this.show_star_atlas_cooperation;
        if (bool != null) {
            i3 = bool.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        Boolean bool2 = this.has_ads_entry;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        LinkUserInfoStructV2 linkUserInfoStructV2 = this.link_user_info;
        if (linkUserInfoStructV2 != null) {
            i5 = linkUserInfoStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        Integer num2 = this.ad_influencer_type;
        if (num2 != null) {
            i7 = num2.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.star_atlas != null) {
            sb.append(", star_atlas=").append(this.star_atlas);
        }
        if (this.show_star_atlas_cooperation != null) {
            sb.append(", show_star_atlas_cooperation=").append(this.show_star_atlas_cooperation);
        }
        if (this.has_ads_entry != null) {
            sb.append(", has_ads_entry=").append(this.has_ads_entry);
        }
        if (this.link_user_info != null) {
            sb.append(", link_user_info=").append(this.link_user_info);
        }
        if (this.ad_influencer_type != null) {
            sb.append(", ad_influencer_type=").append(this.ad_influencer_type);
        }
        return sb.replace(0, 2, "CommerceUserStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceUserStructV2)) {
            return false;
        }
        CommerceUserStructV2 commerceUserStructV2 = (CommerceUserStructV2) obj;
        if (!unknownFields().equals(commerceUserStructV2.unknownFields()) || !Internal.equals(this.star_atlas, commerceUserStructV2.star_atlas) || !Internal.equals(this.show_star_atlas_cooperation, commerceUserStructV2.show_star_atlas_cooperation) || !Internal.equals(this.has_ads_entry, commerceUserStructV2.has_ads_entry) || !Internal.equals(this.link_user_info, commerceUserStructV2.link_user_info) || !Internal.equals(this.ad_influencer_type, commerceUserStructV2.ad_influencer_type)) {
            return false;
        }
        return true;
    }

    public CommerceUserStructV2(Integer num, Boolean bool, Boolean bool2, LinkUserInfoStructV2 linkUserInfoStructV2, Integer num2) {
        this(num, bool, bool2, linkUserInfoStructV2, num2, i.EMPTY);
    }

    public CommerceUserStructV2(Integer num, Boolean bool, Boolean bool2, LinkUserInfoStructV2 linkUserInfoStructV2, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.star_atlas = num;
        this.show_star_atlas_cooperation = bool;
        this.has_ads_entry = bool2;
        this.link_user_info = linkUserInfoStructV2;
        this.ad_influencer_type = num2;
    }
}
