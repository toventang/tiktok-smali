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

public final class FollowersDetailV2 extends Message<FollowersDetailV2, Builder> {
    public static final ProtoAdapter<FollowersDetailV2> ADAPTER = new ProtoAdapter_FollowersDetailV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String app_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String apple_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String download_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer fans_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String package_name;

    public FollowersDetailV2() {
    }

    static final class ProtoAdapter_FollowersDetailV2 extends ProtoAdapter<FollowersDetailV2> {
        static {
            Covode.recordClassIndex(102013);
        }

        public ProtoAdapter_FollowersDetailV2() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowersDetailV2.class);
        }

        public final int encodedSize(FollowersDetailV2 followersDetailV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, followersDetailV2.name) + ProtoAdapter.STRING.encodedSizeWithTag(2, followersDetailV2.icon) + ProtoAdapter.INT32.encodedSizeWithTag(3, followersDetailV2.fans_count) + ProtoAdapter.STRING.encodedSizeWithTag(4, followersDetailV2.open_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, followersDetailV2.apple_id) + ProtoAdapter.STRING.encodedSizeWithTag(6, followersDetailV2.download_url) + ProtoAdapter.STRING.encodedSizeWithTag(7, followersDetailV2.package_name) + ProtoAdapter.STRING.encodedSizeWithTag(8, followersDetailV2.app_name) + followersDetailV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FollowersDetailV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.icon(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.fans_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.open_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.apple_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.download_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.package_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.app_name(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, FollowersDetailV2 followersDetailV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followersDetailV2.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, followersDetailV2.icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, followersDetailV2.fans_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, followersDetailV2.open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, followersDetailV2.apple_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, followersDetailV2.download_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, followersDetailV2.package_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, followersDetailV2.app_name);
            protoWriter.writeBytes(followersDetailV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102011);
    }

    public static final class Builder extends Message.Builder<FollowersDetailV2, Builder> {
        public String app_name;
        public String apple_id;
        public String download_url;
        public Integer fans_count;
        public String icon;
        public String name;
        public String open_url;
        public String package_name;

        static {
            Covode.recordClassIndex(102012);
        }

        @Override // com.squareup.wire.Message.Builder
        public final FollowersDetailV2 build() {
            return new FollowersDetailV2(this.name, this.icon, this.fans_count, this.open_url, this.apple_id, this.download_url, this.package_name, this.app_name, super.buildUnknownFields());
        }

        public final Builder app_name(String str) {
            this.app_name = str;
            return this;
        }

        public final Builder apple_id(String str) {
            this.apple_id = str;
            return this;
        }

        public final Builder download_url(String str) {
            this.download_url = str;
            return this;
        }

        public final Builder fans_count(Integer num) {
            this.fans_count = num;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder package_name(String str) {
            this.package_name = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.FollowersDetailV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<FollowersDetailV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.icon = this.icon;
        builder.fans_count = this.fans_count;
        builder.open_url = this.open_url;
        builder.apple_id = this.apple_id;
        builder.download_url = this.download_url;
        builder.package_name = this.package_name;
        builder.app_name = this.app_name;
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
        String str = this.name;
        int i10 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 37;
        String str2 = this.icon;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        Integer num = this.fans_count;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        String str3 = this.open_url;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        String str4 = this.apple_id;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        String str5 = this.download_url;
        if (str5 != null) {
            i7 = str5.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        String str6 = this.package_name;
        if (str6 != null) {
            i8 = str6.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        String str7 = this.app_name;
        if (str7 != null) {
            i10 = str7.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=").append(this.name);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.fans_count != null) {
            sb.append(", fans_count=").append(this.fans_count);
        }
        if (this.open_url != null) {
            sb.append(", open_url=").append(this.open_url);
        }
        if (this.apple_id != null) {
            sb.append(", apple_id=").append(this.apple_id);
        }
        if (this.download_url != null) {
            sb.append(", download_url=").append(this.download_url);
        }
        if (this.package_name != null) {
            sb.append(", package_name=").append(this.package_name);
        }
        if (this.app_name != null) {
            sb.append(", app_name=").append(this.app_name);
        }
        return sb.replace(0, 2, "FollowersDetailV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FollowersDetailV2)) {
            return false;
        }
        FollowersDetailV2 followersDetailV2 = (FollowersDetailV2) obj;
        if (!unknownFields().equals(followersDetailV2.unknownFields()) || !Internal.equals(this.name, followersDetailV2.name) || !Internal.equals(this.icon, followersDetailV2.icon) || !Internal.equals(this.fans_count, followersDetailV2.fans_count) || !Internal.equals(this.open_url, followersDetailV2.open_url) || !Internal.equals(this.apple_id, followersDetailV2.apple_id) || !Internal.equals(this.download_url, followersDetailV2.download_url) || !Internal.equals(this.package_name, followersDetailV2.package_name) || !Internal.equals(this.app_name, followersDetailV2.app_name)) {
            return false;
        }
        return true;
    }

    public FollowersDetailV2(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, num, str3, str4, str5, str6, str7, i.EMPTY);
    }

    public FollowersDetailV2(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, i iVar) {
        super(ADAPTER, iVar);
        this.name = str;
        this.icon = str2;
        this.fans_count = num;
        this.open_url = str3;
        this.apple_id = str4;
        this.download_url = str5;
        this.package_name = str6;
        this.app_name = str7;
    }
}
