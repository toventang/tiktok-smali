package com.snapchat.kit.sdk.core.metrics.model;

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

public final class StoryKitSnapPlaybackPlayerSession extends Message<StoryKitSnapPlaybackPlayerSession, Builder> {
    public static final ProtoAdapter<StoryKitSnapPlaybackPlayerSession> ADAPTER = new ProtoAdapter_StoryKitSnapPlaybackPlayerSession();
    public static final StoryKitPlayerType DEFAULT_PLAYER_TYPE = StoryKitPlayerType.STORY_KIT_PLAYER_TYPE_NONE;
    public static final Long DEFAULT_SESSION_DURATION_MS = 0L;
    public static final Long DEFAULT_SNAP_COUNT = 0L;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String player_session_id;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.StoryKitPlayerType#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final StoryKitPlayerType player_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 4)
    public final Long session_duration_ms;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 3)
    public final Long snap_count;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase#ADAPTER", tag = 1)
    public final StoryKitEventBase story_kit_event_base;

    static final class ProtoAdapter_StoryKitSnapPlaybackPlayerSession extends ProtoAdapter<StoryKitSnapPlaybackPlayerSession> {
        static {
            Covode.recordClassIndex(35762);
        }

        public ProtoAdapter_StoryKitSnapPlaybackPlayerSession() {
            super(FieldEncoding.LENGTH_DELIMITED, StoryKitSnapPlaybackPlayerSession.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession redact(com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase r0 = r2.story_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase r0 = r2.story_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase) r0
                r2.story_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession.ProtoAdapter_StoryKitSnapPlaybackPlayerSession.redact(com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession):com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession");
        }

        public final int encodedSize(StoryKitSnapPlaybackPlayerSession storyKitSnapPlaybackPlayerSession) {
            return StoryKitEventBase.ADAPTER.encodedSizeWithTag(1, storyKitSnapPlaybackPlayerSession.story_kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(2, storyKitSnapPlaybackPlayerSession.player_session_id) + ProtoAdapter.UINT64.encodedSizeWithTag(3, storyKitSnapPlaybackPlayerSession.snap_count) + ProtoAdapter.UINT64.encodedSizeWithTag(4, storyKitSnapPlaybackPlayerSession.session_duration_ms) + StoryKitPlayerType.ADAPTER.encodedSizeWithTag(5, storyKitSnapPlaybackPlayerSession.player_type) + storyKitSnapPlaybackPlayerSession.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StoryKitSnapPlaybackPlayerSession decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.story_kit_event_base(StoryKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.player_session_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.snap_count(ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.session_duration_ms(ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.player_type(StoryKitPlayerType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StoryKitSnapPlaybackPlayerSession storyKitSnapPlaybackPlayerSession) {
            StoryKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, storyKitSnapPlaybackPlayerSession.story_kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, storyKitSnapPlaybackPlayerSession.player_session_id);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 3, storyKitSnapPlaybackPlayerSession.snap_count);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 4, storyKitSnapPlaybackPlayerSession.session_duration_ms);
            StoryKitPlayerType.ADAPTER.encodeWithTag(protoWriter, 5, storyKitSnapPlaybackPlayerSession.player_type);
            protoWriter.writeBytes(storyKitSnapPlaybackPlayerSession.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<StoryKitSnapPlaybackPlayerSession, Builder> {
        public String player_session_id;
        public StoryKitPlayerType player_type;
        public Long session_duration_ms;
        public Long snap_count;
        public StoryKitEventBase story_kit_event_base;

        static {
            Covode.recordClassIndex(35761);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StoryKitSnapPlaybackPlayerSession build() {
            return new StoryKitSnapPlaybackPlayerSession(this.story_kit_event_base, this.player_session_id, this.snap_count, this.session_duration_ms, this.player_type, super.buildUnknownFields());
        }

        public final Builder player_session_id(String str) {
            this.player_session_id = str;
            return this;
        }

        public final Builder player_type(StoryKitPlayerType storyKitPlayerType) {
            this.player_type = storyKitPlayerType;
            return this;
        }

        public final Builder session_duration_ms(Long l2) {
            this.session_duration_ms = l2;
            return this;
        }

        public final Builder snap_count(Long l2) {
            this.snap_count = l2;
            return this;
        }

        public final Builder story_kit_event_base(StoryKitEventBase storyKitEventBase) {
            this.story_kit_event_base = storyKitEventBase;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35760);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StoryKitSnapPlaybackPlayerSession, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.story_kit_event_base = this.story_kit_event_base;
        builder.player_session_id = this.player_session_id;
        builder.snap_count = this.snap_count;
        builder.session_duration_ms = this.session_duration_ms;
        builder.player_type = this.player_type;
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
        StoryKitEventBase storyKitEventBase = this.story_kit_event_base;
        int i7 = 0;
        if (storyKitEventBase != null) {
            i2 = storyKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        String str = this.player_session_id;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        Long l2 = this.snap_count;
        if (l2 != null) {
            i4 = l2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        Long l3 = this.session_duration_ms;
        if (l3 != null) {
            i5 = l3.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        StoryKitPlayerType storyKitPlayerType = this.player_type;
        if (storyKitPlayerType != null) {
            i7 = storyKitPlayerType.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.story_kit_event_base != null) {
            sb.append(", story_kit_event_base=").append(this.story_kit_event_base);
        }
        if (this.player_session_id != null) {
            sb.append(", player_session_id=").append(this.player_session_id);
        }
        if (this.snap_count != null) {
            sb.append(", snap_count=").append(this.snap_count);
        }
        if (this.session_duration_ms != null) {
            sb.append(", session_duration_ms=").append(this.session_duration_ms);
        }
        if (this.player_type != null) {
            sb.append(", player_type=").append(this.player_type);
        }
        return sb.replace(0, 2, "StoryKitSnapPlaybackPlayerSession{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoryKitSnapPlaybackPlayerSession)) {
            return false;
        }
        StoryKitSnapPlaybackPlayerSession storyKitSnapPlaybackPlayerSession = (StoryKitSnapPlaybackPlayerSession) obj;
        if (!unknownFields().equals(storyKitSnapPlaybackPlayerSession.unknownFields()) || !Internal.equals(this.story_kit_event_base, storyKitSnapPlaybackPlayerSession.story_kit_event_base) || !Internal.equals(this.player_session_id, storyKitSnapPlaybackPlayerSession.player_session_id) || !Internal.equals(this.snap_count, storyKitSnapPlaybackPlayerSession.snap_count) || !Internal.equals(this.session_duration_ms, storyKitSnapPlaybackPlayerSession.session_duration_ms) || !Internal.equals(this.player_type, storyKitSnapPlaybackPlayerSession.player_type)) {
            return false;
        }
        return true;
    }

    public StoryKitSnapPlaybackPlayerSession(StoryKitEventBase storyKitEventBase, String str, Long l2, Long l3, StoryKitPlayerType storyKitPlayerType) {
        this(storyKitEventBase, str, l2, l3, storyKitPlayerType, i.EMPTY);
    }

    public StoryKitSnapPlaybackPlayerSession(StoryKitEventBase storyKitEventBase, String str, Long l2, Long l3, StoryKitPlayerType storyKitPlayerType, i iVar) {
        super(ADAPTER, iVar);
        this.story_kit_event_base = storyKitEventBase;
        this.player_session_id = str;
        this.snap_count = l2;
        this.session_duration_ms = l3;
        this.player_type = storyKitPlayerType;
    }
}
