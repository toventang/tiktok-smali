package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class Profile extends Message<Profile, Builder> {
    public static final ProtoAdapter<Profile> ADAPTER = new ProtoAdapter_Profile();
    public static final Long DEFAULT_UID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "basic_ext_info")
    public final String basic_ext_info;
    @c(a = "detail_ext_info")
    public final String detail_ext_info;
    @c(a = "nick_name")
    public final String nick_name;
    @c(a = "protrait")
    public final String protrait;
    @c(a = "uid")
    public final Long uid;

    static final class ProtoAdapter_Profile extends ProtoAdapter<Profile> {
        static {
            Covode.recordClassIndex(23691);
        }

        public ProtoAdapter_Profile() {
            super(FieldEncoding.LENGTH_DELIMITED, Profile.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.Profile$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.Profile redact(com.bytedance.im.core.proto.Profile r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.Profile$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.Profile r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.Profile.ProtoAdapter_Profile.redact(com.bytedance.im.core.proto.Profile):com.bytedance.im.core.proto.Profile");
        }

        public final int encodedSize(Profile profile) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, profile.nick_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, profile.protrait) + ProtoAdapter.STRING.encodedSizeWithTag(3, profile.basic_ext_info) + ProtoAdapter.STRING.encodedSizeWithTag(4, profile.detail_ext_info) + ProtoAdapter.INT64.encodedSizeWithTag(5, profile.uid) + profile.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Profile decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.nick_name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.protrait(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.basic_ext_info(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.detail_ext_info(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.uid(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Profile profile) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, profile.nick_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, profile.protrait);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, profile.basic_ext_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, profile.detail_ext_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, profile.uid);
            protoWriter.writeBytes(profile.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<Profile, Builder> {
        public String basic_ext_info;
        public String detail_ext_info;
        public String nick_name;
        public String protrait;
        public Long uid;

        static {
            Covode.recordClassIndex(23690);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Profile build() {
            return new Profile(this.nick_name, this.protrait, this.basic_ext_info, this.detail_ext_info, this.uid, super.buildUnknownFields());
        }

        public final Builder basic_ext_info(String str) {
            this.basic_ext_info = str;
            return this;
        }

        public final Builder detail_ext_info(String str) {
            this.detail_ext_info = str;
            return this;
        }

        public final Builder nick_name(String str) {
            this.nick_name = str;
            return this;
        }

        public final Builder protrait(String str) {
            this.protrait = str;
            return this;
        }

        public final Builder uid(Long l2) {
            this.uid = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23689);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "Profile" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.Profile$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Profile, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.nick_name = this.nick_name;
        builder.protrait = this.protrait;
        builder.basic_ext_info = this.basic_ext_info;
        builder.detail_ext_info = this.detail_ext_info;
        builder.uid = this.uid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public Profile(String str, String str2, String str3, String str4, Long l2) {
        this(str, str2, str3, str4, l2, i.EMPTY);
    }

    public Profile(String str, String str2, String str3, String str4, Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.nick_name = str;
        this.protrait = str2;
        this.basic_ext_info = str3;
        this.detail_ext_info = str4;
        this.uid = l2;
    }
}
