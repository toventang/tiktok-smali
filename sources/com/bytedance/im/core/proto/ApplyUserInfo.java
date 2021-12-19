package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import k.i;

public final class ApplyUserInfo extends Message<ApplyUserInfo, Builder> {
    public static final ProtoAdapter<ApplyUserInfo> ADAPTER = new ProtoAdapter_ApplyUserInfo();
    public static final Long DEFAULT_APPLY_TIME_SECOND = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "apply_time_second")
    public final Long apply_time_second;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "profile")
    public final Profile profile;
    @c(a = "status")
    public final Integer status;
    @c(a = "user_id")
    public final Long user_id;

    static final class ProtoAdapter_ApplyUserInfo extends ProtoAdapter<ApplyUserInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23191);
        }

        public ProtoAdapter_ApplyUserInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ApplyUserInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ApplyUserInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ApplyUserInfo redact(com.bytedance.im.core.proto.ApplyUserInfo r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ApplyUserInfo$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.Profile r0 = r2.profile
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.Profile> r1 = com.bytedance.im.core.proto.Profile.ADAPTER
                com.bytedance.im.core.proto.Profile r0 = r2.profile
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.Profile r0 = (com.bytedance.im.core.proto.Profile) r0
                r2.profile = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ApplyUserInfo r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ApplyUserInfo.ProtoAdapter_ApplyUserInfo.redact(com.bytedance.im.core.proto.ApplyUserInfo):com.bytedance.im.core.proto.ApplyUserInfo");
        }

        public final int encodedSize(ApplyUserInfo applyUserInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, applyUserInfo.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, applyUserInfo.apply_time_second) + this.ext.encodedSizeWithTag(3, applyUserInfo.ext) + ProtoAdapter.INT32.encodedSizeWithTag(4, applyUserInfo.status) + Profile.ADAPTER.encodedSizeWithTag(5, applyUserInfo.profile) + applyUserInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ApplyUserInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.apply_time_second(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.ext.putAll(this.ext.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.profile(Profile.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ApplyUserInfo applyUserInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, applyUserInfo.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, applyUserInfo.apply_time_second);
            this.ext.encodeWithTag(protoWriter, 3, applyUserInfo.ext);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, applyUserInfo.status);
            Profile.ADAPTER.encodeWithTag(protoWriter, 5, applyUserInfo.profile);
            protoWriter.writeBytes(applyUserInfo.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ApplyUserInfo, Builder> {
        public Long apply_time_second;
        public Map<String, String> ext = Internal.newMutableMap();
        public Profile profile;
        public Integer status;
        public Long user_id;

        static {
            Covode.recordClassIndex(23190);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ApplyUserInfo build() {
            return new ApplyUserInfo(this.user_id, this.apply_time_second, this.ext, this.status, this.profile, super.buildUnknownFields());
        }

        public final Builder apply_time_second(Long l2) {
            this.apply_time_second = l2;
            return this;
        }

        public final Builder profile(Profile profile2) {
            this.profile = profile2;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder user_id(Long l2) {
            this.user_id = l2;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23189);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ApplyUserInfo" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ApplyUserInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ApplyUserInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.apply_time_second = this.apply_time_second;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.status = this.status;
        builder.profile = this.profile;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ApplyUserInfo(Long l2, Long l3, Map<String, String> map, Integer num, Profile profile2) {
        this(l2, l3, map, num, profile2, i.EMPTY);
    }

    public ApplyUserInfo(Long l2, Long l3, Map<String, String> map, Integer num, Profile profile2, i iVar) {
        super(ADAPTER, iVar);
        this.user_id = l2;
        this.apply_time_second = l3;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.status = num;
        this.profile = profile2;
    }
}
