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

public final class InteractionTagUserInfoV2 extends Message<InteractionTagUserInfoV2, Builder> {
    public static final ProtoAdapter<InteractionTagUserInfoV2> ADAPTER = new ProtoAdapter_InteractionTagUserInfoV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 avatar_168x168;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String custom_verify;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public String enterprise_verify_reason;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Integer follow_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer follower_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer interest_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer is_private_account;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String unique_id;

    public InteractionTagUserInfoV2() {
    }

    static final class ProtoAdapter_InteractionTagUserInfoV2 extends ProtoAdapter<InteractionTagUserInfoV2> {
        static {
            Covode.recordClassIndex(102061);
        }

        public ProtoAdapter_InteractionTagUserInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, InteractionTagUserInfoV2.class);
        }

        public final int encodedSize(InteractionTagUserInfoV2 interactionTagUserInfoV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, interactionTagUserInfoV2.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, interactionTagUserInfoV2.unique_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, interactionTagUserInfoV2.nickname) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, interactionTagUserInfoV2.avatar_168x168) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, interactionTagUserInfoV2.avatar_thumb) + ProtoAdapter.INT32.encodedSizeWithTag(6, interactionTagUserInfoV2.follow_status) + ProtoAdapter.INT32.encodedSizeWithTag(7, interactionTagUserInfoV2.follower_status) + ProtoAdapter.INT32.encodedSizeWithTag(8, interactionTagUserInfoV2.is_private_account) + ProtoAdapter.STRING.encodedSizeWithTag(9, interactionTagUserInfoV2.custom_verify) + ProtoAdapter.STRING.encodedSizeWithTag(10, interactionTagUserInfoV2.enterprise_verify_reason) + ProtoAdapter.INT32.encodedSizeWithTag(13, interactionTagUserInfoV2.interest_level) + interactionTagUserInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InteractionTagUserInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 13) {
                    switch (nextTag) {
                        case 1:
                            builder.uid(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 2:
                            builder.unique_id(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 3:
                            builder.nickname(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 4:
                            builder.avatar_168x168(UrlStructV2.ADAPTER.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.avatar_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.follow_status(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.follower_status(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.is_private_account(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.custom_verify(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.enterprise_verify_reason(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    builder.interest_level(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, InteractionTagUserInfoV2 interactionTagUserInfoV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, interactionTagUserInfoV2.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, interactionTagUserInfoV2.unique_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, interactionTagUserInfoV2.nickname);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, interactionTagUserInfoV2.avatar_168x168);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, interactionTagUserInfoV2.avatar_thumb);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, interactionTagUserInfoV2.follow_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, interactionTagUserInfoV2.follower_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, interactionTagUserInfoV2.is_private_account);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, interactionTagUserInfoV2.custom_verify);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, interactionTagUserInfoV2.enterprise_verify_reason);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, interactionTagUserInfoV2.interest_level);
            protoWriter.writeBytes(interactionTagUserInfoV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102059);
    }

    public static final class Builder extends Message.Builder<InteractionTagUserInfoV2, Builder> {
        public UrlStructV2 avatar_168x168;
        public UrlStructV2 avatar_thumb;
        public String custom_verify;
        public String enterprise_verify_reason;
        public Integer follow_status;
        public Integer follower_status;
        public Integer interest_level;
        public Integer is_private_account;
        public String nickname;
        public String uid;
        public String unique_id;

        static {
            Covode.recordClassIndex(102060);
        }

        @Override // com.squareup.wire.Message.Builder
        public final InteractionTagUserInfoV2 build() {
            return new InteractionTagUserInfoV2(this.uid, this.unique_id, this.nickname, this.avatar_168x168, this.avatar_thumb, this.follow_status, this.follower_status, this.is_private_account, this.custom_verify, this.enterprise_verify_reason, this.interest_level, super.buildUnknownFields());
        }

        public final Builder avatar_168x168(UrlStructV2 urlStructV2) {
            this.avatar_168x168 = urlStructV2;
            return this;
        }

        public final Builder avatar_thumb(UrlStructV2 urlStructV2) {
            this.avatar_thumb = urlStructV2;
            return this;
        }

        public final Builder custom_verify(String str) {
            this.custom_verify = str;
            return this;
        }

        public final Builder enterprise_verify_reason(String str) {
            this.enterprise_verify_reason = str;
            return this;
        }

        public final Builder follow_status(Integer num) {
            this.follow_status = num;
            return this;
        }

        public final Builder follower_status(Integer num) {
            this.follower_status = num;
            return this;
        }

        public final Builder interest_level(Integer num) {
            this.interest_level = num;
            return this;
        }

        public final Builder is_private_account(Integer num) {
            this.is_private_account = num;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder uid(String str) {
            this.uid = str;
            return this;
        }

        public final Builder unique_id(String str) {
            this.unique_id = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.InteractionTagUserInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<InteractionTagUserInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.unique_id = this.unique_id;
        builder.nickname = this.nickname;
        builder.avatar_168x168 = this.avatar_168x168;
        builder.avatar_thumb = this.avatar_thumb;
        builder.follow_status = this.follow_status;
        builder.follower_status = this.follower_status;
        builder.is_private_account = this.is_private_account;
        builder.custom_verify = this.custom_verify;
        builder.enterprise_verify_reason = this.enterprise_verify_reason;
        builder.interest_level = this.interest_level;
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
        int i12 = this.hashCode;
        if (i12 != 0) {
            return i12;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.uid;
        int i13 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (hashCode + i2) * 37;
        String str2 = this.unique_id;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 37;
        String str3 = this.nickname;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        UrlStructV2 urlStructV2 = this.avatar_168x168;
        if (urlStructV2 != null) {
            i5 = urlStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        UrlStructV2 urlStructV22 = this.avatar_thumb;
        if (urlStructV22 != null) {
            i6 = urlStructV22.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        Integer num = this.follow_status;
        if (num != null) {
            i7 = num.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        Integer num2 = this.follower_status;
        if (num2 != null) {
            i8 = num2.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        Integer num3 = this.is_private_account;
        if (num3 != null) {
            i9 = num3.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        String str4 = this.custom_verify;
        if (str4 != null) {
            i10 = str4.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        String str5 = this.enterprise_verify_reason;
        if (str5 != null) {
            i11 = str5.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 37;
        Integer num4 = this.interest_level;
        if (num4 != null) {
            i13 = num4.hashCode();
        }
        int i24 = i23 + i13;
        this.hashCode = i24;
        return i24;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=").append(this.uid);
        }
        if (this.unique_id != null) {
            sb.append(", unique_id=").append(this.unique_id);
        }
        if (this.nickname != null) {
            sb.append(", nickname=").append(this.nickname);
        }
        if (this.avatar_168x168 != null) {
            sb.append(", avatar_168x168=").append(this.avatar_168x168);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=").append(this.avatar_thumb);
        }
        if (this.follow_status != null) {
            sb.append(", follow_status=").append(this.follow_status);
        }
        if (this.follower_status != null) {
            sb.append(", follower_status=").append(this.follower_status);
        }
        if (this.is_private_account != null) {
            sb.append(", is_private_account=").append(this.is_private_account);
        }
        if (this.custom_verify != null) {
            sb.append(", custom_verify=").append(this.custom_verify);
        }
        if (this.enterprise_verify_reason != null) {
            sb.append(", enterprise_verify_reason=").append(this.enterprise_verify_reason);
        }
        if (this.interest_level != null) {
            sb.append(", interest_level=").append(this.interest_level);
        }
        return sb.replace(0, 2, "InteractionTagUserInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InteractionTagUserInfoV2)) {
            return false;
        }
        InteractionTagUserInfoV2 interactionTagUserInfoV2 = (InteractionTagUserInfoV2) obj;
        if (!unknownFields().equals(interactionTagUserInfoV2.unknownFields()) || !Internal.equals(this.uid, interactionTagUserInfoV2.uid) || !Internal.equals(this.unique_id, interactionTagUserInfoV2.unique_id) || !Internal.equals(this.nickname, interactionTagUserInfoV2.nickname) || !Internal.equals(this.avatar_168x168, interactionTagUserInfoV2.avatar_168x168) || !Internal.equals(this.avatar_thumb, interactionTagUserInfoV2.avatar_thumb) || !Internal.equals(this.follow_status, interactionTagUserInfoV2.follow_status) || !Internal.equals(this.follower_status, interactionTagUserInfoV2.follower_status) || !Internal.equals(this.is_private_account, interactionTagUserInfoV2.is_private_account) || !Internal.equals(this.custom_verify, interactionTagUserInfoV2.custom_verify) || !Internal.equals(this.enterprise_verify_reason, interactionTagUserInfoV2.enterprise_verify_reason) || !Internal.equals(this.interest_level, interactionTagUserInfoV2.interest_level)) {
            return false;
        }
        return true;
    }

    public InteractionTagUserInfoV2(String str, String str2, String str3, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num, Integer num2, Integer num3, String str4, String str5, Integer num4) {
        this(str, str2, str3, urlStructV2, urlStructV22, num, num2, num3, str4, str5, num4, i.EMPTY);
    }

    public InteractionTagUserInfoV2(String str, String str2, String str3, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num, Integer num2, Integer num3, String str4, String str5, Integer num4, i iVar) {
        super(ADAPTER, iVar);
        this.uid = str;
        this.unique_id = str2;
        this.nickname = str3;
        this.avatar_168x168 = urlStructV2;
        this.avatar_thumb = urlStructV22;
        this.follow_status = num;
        this.follower_status = num2;
        this.is_private_account = num3;
        this.custom_verify = str4;
        this.enterprise_verify_reason = str5;
        this.interest_level = num4;
    }
}
