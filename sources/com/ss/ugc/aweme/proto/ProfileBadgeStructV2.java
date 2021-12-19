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

public final class ProfileBadgeStructV2 extends Message<ProfileBadgeStructV2, Builder> {
    public static final ProtoAdapter<ProfileBadgeStructV2> ADAPTER = new ProtoAdapter_ProfileBadgeStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean should_show;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String url;

    public ProfileBadgeStructV2() {
    }

    static final class ProtoAdapter_ProfileBadgeStructV2 extends ProtoAdapter<ProfileBadgeStructV2> {
        static {
            Covode.recordClassIndex(102175);
        }

        public ProtoAdapter_ProfileBadgeStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ProfileBadgeStructV2.class);
        }

        public final int encodedSize(ProfileBadgeStructV2 profileBadgeStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, profileBadgeStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, profileBadgeStructV2.name) + ProtoAdapter.STRING.encodedSizeWithTag(3, profileBadgeStructV2.description) + ProtoAdapter.STRING.encodedSizeWithTag(4, profileBadgeStructV2.url) + ProtoAdapter.BOOL.encodedSizeWithTag(6, profileBadgeStructV2.should_show) + profileBadgeStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ProfileBadgeStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.description(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.should_show(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ProfileBadgeStructV2 profileBadgeStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, profileBadgeStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, profileBadgeStructV2.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, profileBadgeStructV2.description);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, profileBadgeStructV2.url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, profileBadgeStructV2.should_show);
            protoWriter.writeBytes(profileBadgeStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102173);
    }

    public static final class Builder extends Message.Builder<ProfileBadgeStructV2, Builder> {
        public String description;
        public Long id;
        public String name;
        public Boolean should_show;
        public String url;

        static {
            Covode.recordClassIndex(102174);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ProfileBadgeStructV2 build() {
            return new ProfileBadgeStructV2(this.id, this.name, this.description, this.url, this.should_show, super.buildUnknownFields());
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder id(Long l2) {
            this.id = l2;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder should_show(Boolean bool) {
            this.should_show = bool;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ProfileBadgeStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ProfileBadgeStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.name = this.name;
        builder.description = this.description;
        builder.url = this.url;
        builder.should_show = this.should_show;
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
        Long l2 = this.id;
        int i7 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        String str = this.name;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        String str2 = this.description;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        String str3 = this.url;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        Boolean bool = this.should_show;
        if (bool != null) {
            i7 = bool.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
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
        if (this.description != null) {
            sb.append(", description=").append(this.description);
        }
        if (this.url != null) {
            sb.append(", url=").append(this.url);
        }
        if (this.should_show != null) {
            sb.append(", should_show=").append(this.should_show);
        }
        return sb.replace(0, 2, "ProfileBadgeStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileBadgeStructV2)) {
            return false;
        }
        ProfileBadgeStructV2 profileBadgeStructV2 = (ProfileBadgeStructV2) obj;
        if (!unknownFields().equals(profileBadgeStructV2.unknownFields()) || !Internal.equals(this.id, profileBadgeStructV2.id) || !Internal.equals(this.name, profileBadgeStructV2.name) || !Internal.equals(this.description, profileBadgeStructV2.description) || !Internal.equals(this.url, profileBadgeStructV2.url) || !Internal.equals(this.should_show, profileBadgeStructV2.should_show)) {
            return false;
        }
        return true;
    }

    public ProfileBadgeStructV2(Long l2, String str, String str2, String str3, Boolean bool) {
        this(l2, str, str2, str3, bool, i.EMPTY);
    }

    public ProfileBadgeStructV2(Long l2, String str, String str2, String str3, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.id = l2;
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.should_show = bool;
    }
}
