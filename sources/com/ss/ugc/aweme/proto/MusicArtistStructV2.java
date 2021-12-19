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

public final class MusicArtistStructV2 extends Message<MusicArtistStructV2, Builder> {
    public static final ProtoAdapter<MusicArtistStructV2> ADAPTER = new ProtoAdapter_MusicArtistStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UrlStructV2 avatar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer enter_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer follow_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String handle;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean is_verified;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String nick_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uid;

    public MusicArtistStructV2() {
    }

    static final class ProtoAdapter_MusicArtistStructV2 extends ProtoAdapter<MusicArtistStructV2> {
        static {
            Covode.recordClassIndex(102121);
        }

        public ProtoAdapter_MusicArtistStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MusicArtistStructV2.class);
        }

        public final int encodedSize(MusicArtistStructV2 musicArtistStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, musicArtistStructV2.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, musicArtistStructV2.sec_uid) + ProtoAdapter.STRING.encodedSizeWithTag(3, musicArtistStructV2.nick_name) + ProtoAdapter.STRING.encodedSizeWithTag(4, musicArtistStructV2.handle) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, musicArtistStructV2.avatar) + ProtoAdapter.BOOL.encodedSizeWithTag(6, musicArtistStructV2.is_verified) + ProtoAdapter.INT32.encodedSizeWithTag(7, musicArtistStructV2.enter_type) + ProtoAdapter.INT32.encodedSizeWithTag(8, musicArtistStructV2.follow_status) + musicArtistStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MusicArtistStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.nick_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.handle(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.avatar(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.is_verified(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.enter_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.follow_status(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MusicArtistStructV2 musicArtistStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, musicArtistStructV2.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, musicArtistStructV2.sec_uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, musicArtistStructV2.nick_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, musicArtistStructV2.handle);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, musicArtistStructV2.avatar);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, musicArtistStructV2.is_verified);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, musicArtistStructV2.enter_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, musicArtistStructV2.follow_status);
            protoWriter.writeBytes(musicArtistStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102119);
    }

    public static final class Builder extends Message.Builder<MusicArtistStructV2, Builder> {
        public UrlStructV2 avatar;
        public Integer enter_type;
        public Integer follow_status;
        public String handle;
        public Boolean is_verified;
        public String nick_name;
        public String sec_uid;
        public String uid;

        static {
            Covode.recordClassIndex(102120);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MusicArtistStructV2 build() {
            return new MusicArtistStructV2(this.uid, this.sec_uid, this.nick_name, this.handle, this.avatar, this.is_verified, this.enter_type, this.follow_status, super.buildUnknownFields());
        }

        public final Builder avatar(UrlStructV2 urlStructV2) {
            this.avatar = urlStructV2;
            return this;
        }

        public final Builder enter_type(Integer num) {
            this.enter_type = num;
            return this;
        }

        public final Builder follow_status(Integer num) {
            this.follow_status = num;
            return this;
        }

        public final Builder handle(String str) {
            this.handle = str;
            return this;
        }

        public final Builder is_verified(Boolean bool) {
            this.is_verified = bool;
            return this;
        }

        public final Builder nick_name(String str) {
            this.nick_name = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder uid(String str) {
            this.uid = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MusicArtistStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MusicArtistStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.sec_uid = this.sec_uid;
        builder.nick_name = this.nick_name;
        builder.handle = this.handle;
        builder.avatar = this.avatar;
        builder.is_verified = this.is_verified;
        builder.enter_type = this.enter_type;
        builder.follow_status = this.follow_status;
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
        String str = this.uid;
        int i10 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 37;
        String str2 = this.sec_uid;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        String str3 = this.nick_name;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        String str4 = this.handle;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        UrlStructV2 urlStructV2 = this.avatar;
        if (urlStructV2 != null) {
            i6 = urlStructV2.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        Boolean bool = this.is_verified;
        if (bool != null) {
            i7 = bool.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        Integer num = this.enter_type;
        if (num != null) {
            i8 = num.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        Integer num2 = this.follow_status;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=").append(this.uid);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=").append(this.sec_uid);
        }
        if (this.nick_name != null) {
            sb.append(", nick_name=").append(this.nick_name);
        }
        if (this.handle != null) {
            sb.append(", handle=").append(this.handle);
        }
        if (this.avatar != null) {
            sb.append(", avatar=").append(this.avatar);
        }
        if (this.is_verified != null) {
            sb.append(", is_verified=").append(this.is_verified);
        }
        if (this.enter_type != null) {
            sb.append(", enter_type=").append(this.enter_type);
        }
        if (this.follow_status != null) {
            sb.append(", follow_status=").append(this.follow_status);
        }
        return sb.replace(0, 2, "MusicArtistStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicArtistStructV2)) {
            return false;
        }
        MusicArtistStructV2 musicArtistStructV2 = (MusicArtistStructV2) obj;
        if (!unknownFields().equals(musicArtistStructV2.unknownFields()) || !Internal.equals(this.uid, musicArtistStructV2.uid) || !Internal.equals(this.sec_uid, musicArtistStructV2.sec_uid) || !Internal.equals(this.nick_name, musicArtistStructV2.nick_name) || !Internal.equals(this.handle, musicArtistStructV2.handle) || !Internal.equals(this.avatar, musicArtistStructV2.avatar) || !Internal.equals(this.is_verified, musicArtistStructV2.is_verified) || !Internal.equals(this.enter_type, musicArtistStructV2.enter_type) || !Internal.equals(this.follow_status, musicArtistStructV2.follow_status)) {
            return false;
        }
        return true;
    }

    public MusicArtistStructV2(String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, Boolean bool, Integer num, Integer num2) {
        this(str, str2, str3, str4, urlStructV2, bool, num, num2, i.EMPTY);
    }

    public MusicArtistStructV2(String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, Boolean bool, Integer num, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.uid = str;
        this.sec_uid = str2;
        this.nick_name = str3;
        this.handle = str4;
        this.avatar = urlStructV2;
        this.is_verified = bool;
        this.enter_type = num;
        this.follow_status = num2;
    }
}
