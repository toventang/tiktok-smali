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

public final class MixStructV2 extends Message<MixStructV2, Builder> {
    public static final ProtoAdapter<MixStructV2> ADAPTER = new ProtoAdapter_MixStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public UserStructV2 author;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 cover_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String mix_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String mix_name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MixStatisStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public MixStatisStructV2 statis;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MixStatusStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public MixStatusStructV2 status;

    public MixStructV2() {
    }

    static final class ProtoAdapter_MixStructV2 extends ProtoAdapter<MixStructV2> {
        static {
            Covode.recordClassIndex(102118);
        }

        public ProtoAdapter_MixStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MixStructV2.class);
        }

        public final int encodedSize(MixStructV2 mixStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, mixStructV2.mix_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, mixStructV2.mix_name) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, mixStructV2.cover_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, mixStructV2.icon_url) + MixStatusStructV2.ADAPTER.encodedSizeWithTag(5, mixStructV2.status) + MixStatisStructV2.ADAPTER.encodedSizeWithTag(6, mixStructV2.statis) + ProtoAdapter.STRING.encodedSizeWithTag(7, mixStructV2.desc) + UserStructV2.ADAPTER.encodedSizeWithTag(8, mixStructV2.author) + ProtoAdapter.STRING.encodedSizeWithTag(9, mixStructV2.extra) + ShareStructV2.ADAPTER.encodedSizeWithTag(10, mixStructV2.share_info) + mixStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MixStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mix_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.mix_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.cover_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.icon_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.status(MixStatusStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.statis(MixStatisStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.author(UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.share_info(ShareStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MixStructV2 mixStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mixStructV2.mix_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mixStructV2.mix_name);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, mixStructV2.cover_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, mixStructV2.icon_url);
            MixStatusStructV2.ADAPTER.encodeWithTag(protoWriter, 5, mixStructV2.status);
            MixStatisStructV2.ADAPTER.encodeWithTag(protoWriter, 6, mixStructV2.statis);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, mixStructV2.desc);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 8, mixStructV2.author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, mixStructV2.extra);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 10, mixStructV2.share_info);
            protoWriter.writeBytes(mixStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102116);
    }

    public static final class Builder extends Message.Builder<MixStructV2, Builder> {
        public UserStructV2 author;
        public UrlStructV2 cover_url;
        public String desc;
        public String extra;
        public UrlStructV2 icon_url;
        public String mix_id;
        public String mix_name;
        public ShareStructV2 share_info;
        public MixStatisStructV2 statis;
        public MixStatusStructV2 status;

        static {
            Covode.recordClassIndex(102117);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MixStructV2 build() {
            String str = this.mix_id;
            if (str != null && this.mix_name != null) {
                return new MixStructV2(this.mix_id, this.mix_name, this.cover_url, this.icon_url, this.status, this.statis, this.desc, this.author, this.extra, this.share_info, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mix_id", this.mix_name, "mix_name");
        }

        public final Builder author(UserStructV2 userStructV2) {
            this.author = userStructV2;
            return this;
        }

        public final Builder cover_url(UrlStructV2 urlStructV2) {
            this.cover_url = urlStructV2;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
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

        public final Builder mix_id(String str) {
            this.mix_id = str;
            return this;
        }

        public final Builder mix_name(String str) {
            this.mix_name = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder statis(MixStatisStructV2 mixStatisStructV2) {
            this.statis = mixStatisStructV2;
            return this;
        }

        public final Builder status(MixStatusStructV2 mixStatusStructV2) {
            this.status = mixStatusStructV2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MixStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MixStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.mix_id = this.mix_id;
        builder.mix_name = this.mix_name;
        builder.cover_url = this.cover_url;
        builder.icon_url = this.icon_url;
        builder.status = this.status;
        builder.statis = this.statis;
        builder.desc = this.desc;
        builder.author = this.author;
        builder.extra = this.extra;
        builder.share_info = this.share_info;
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
        int hashCode = ((((unknownFields().hashCode() * 37) + this.mix_id.hashCode()) * 37) + this.mix_name.hashCode()) * 37;
        UrlStructV2 urlStructV2 = this.cover_url;
        int i10 = 0;
        if (urlStructV2 != null) {
            i2 = urlStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 37;
        UrlStructV2 urlStructV22 = this.icon_url;
        if (urlStructV22 != null) {
            i3 = urlStructV22.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        MixStatusStructV2 mixStatusStructV2 = this.status;
        if (mixStatusStructV2 != null) {
            i4 = mixStatusStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        MixStatisStructV2 mixStatisStructV2 = this.statis;
        if (mixStatisStructV2 != null) {
            i5 = mixStatisStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        String str = this.desc;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        UserStructV2 userStructV2 = this.author;
        if (userStructV2 != null) {
            i7 = userStructV2.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        String str2 = this.extra;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        ShareStructV2 shareStructV2 = this.share_info;
        if (shareStructV2 != null) {
            i10 = shareStructV2.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", mix_id=").append(this.mix_id);
        sb.append(", mix_name=").append(this.mix_name);
        if (this.cover_url != null) {
            sb.append(", cover_url=").append(this.cover_url);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=").append(this.icon_url);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.statis != null) {
            sb.append(", statis=").append(this.statis);
        }
        if (this.desc != null) {
            sb.append(", desc=").append(this.desc);
        }
        if (this.author != null) {
            sb.append(", author=").append(this.author);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.share_info != null) {
            sb.append(", share_info=").append(this.share_info);
        }
        return sb.replace(0, 2, "MixStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MixStructV2)) {
            return false;
        }
        MixStructV2 mixStructV2 = (MixStructV2) obj;
        if (!unknownFields().equals(mixStructV2.unknownFields()) || !this.mix_id.equals(mixStructV2.mix_id) || !this.mix_name.equals(mixStructV2.mix_name) || !Internal.equals(this.cover_url, mixStructV2.cover_url) || !Internal.equals(this.icon_url, mixStructV2.icon_url) || !Internal.equals(this.status, mixStructV2.status) || !Internal.equals(this.statis, mixStructV2.statis) || !Internal.equals(this.desc, mixStructV2.desc) || !Internal.equals(this.author, mixStructV2.author) || !Internal.equals(this.extra, mixStructV2.extra) || !Internal.equals(this.share_info, mixStructV2.share_info)) {
            return false;
        }
        return true;
    }

    public MixStructV2(String str, String str2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, MixStatusStructV2 mixStatusStructV2, MixStatisStructV2 mixStatisStructV2, String str3, UserStructV2 userStructV2, String str4, ShareStructV2 shareStructV2) {
        this(str, str2, urlStructV2, urlStructV22, mixStatusStructV2, mixStatisStructV2, str3, userStructV2, str4, shareStructV2, i.EMPTY);
    }

    public MixStructV2(String str, String str2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, MixStatusStructV2 mixStatusStructV2, MixStatisStructV2 mixStatisStructV2, String str3, UserStructV2 userStructV2, String str4, ShareStructV2 shareStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.mix_id = str;
        this.mix_name = str2;
        this.cover_url = urlStructV2;
        this.icon_url = urlStructV22;
        this.status = mixStatusStructV2;
        this.statis = mixStatisStructV2;
        this.desc = str3;
        this.author = userStructV2;
        this.extra = str4;
        this.share_info = shareStructV2;
    }
}
