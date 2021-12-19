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

public final class StoryKitSnapPlayback extends Message<StoryKitSnapPlayback, Builder> {
    public static final ProtoAdapter<StoryKitSnapPlayback> ADAPTER = new ProtoAdapter_StoryKitSnapPlayback();
    public static final StoryKitEntryEvent DEFAULT_ENTRY_EVENT = StoryKitEntryEvent.STORY_KIT_ENTRY_EVENT_PLAYER_NONE;
    public static final StoryKitExitEvent DEFAULT_EXIT_EVENT = StoryKitExitEvent.STORY_KIT_EXIT_EVENT_PLAYER_NONE;
    public static final Long DEFAULT_INITIAL_STALL_MS = 0L;
    public static final Long DEFAULT_MEDIA_DURATION_UNCHECKED_MS = 0L;
    public static final StoryKitMediaType DEFAULT_MEDIA_TYPE = StoryKitMediaType.STORY_KIT_MEDIA_TYPE_NONE;
    public static final Long DEFAULT_SNAP_VIEW_INDEX = 0L;
    public static final Long DEFAULT_VIEW_TIME_MS = 0L;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.StoryKitEntryEvent#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public final StoryKitEntryEvent entry_event;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.StoryKitExitEvent#ADAPTER", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public final StoryKitExitEvent exit_event;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public final Long initial_stall_ms;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public final Long media_duration_unchecked_ms;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.StoryKitMediaType#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final StoryKitMediaType media_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String media_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String player_session_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String snap_id_unchecked;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public final Long snap_view_index;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase#ADAPTER", tag = 1)
    public final StoryKitEventBase story_kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public final Long view_time_ms;

    static final class ProtoAdapter_StoryKitSnapPlayback extends ProtoAdapter<StoryKitSnapPlayback> {
        static {
            Covode.recordClassIndex(35759);
        }

        public ProtoAdapter_StoryKitSnapPlayback() {
            super(FieldEncoding.LENGTH_DELIMITED, StoryKitSnapPlayback.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback redact(com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase r0 = r2.story_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase r0 = r2.story_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase) r0
                r2.story_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback.ProtoAdapter_StoryKitSnapPlayback.redact(com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback):com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback");
        }

        public final int encodedSize(StoryKitSnapPlayback storyKitSnapPlayback) {
            return StoryKitEventBase.ADAPTER.encodedSizeWithTag(1, storyKitSnapPlayback.story_kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(2, storyKitSnapPlayback.player_session_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, storyKitSnapPlayback.media_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, storyKitSnapPlayback.snap_id_unchecked) + StoryKitMediaType.ADAPTER.encodedSizeWithTag(5, storyKitSnapPlayback.media_type) + ProtoAdapter.UINT64.encodedSizeWithTag(6, storyKitSnapPlayback.media_duration_unchecked_ms) + ProtoAdapter.UINT64.encodedSizeWithTag(7, storyKitSnapPlayback.initial_stall_ms) + ProtoAdapter.UINT64.encodedSizeWithTag(8, storyKitSnapPlayback.snap_view_index) + ProtoAdapter.UINT64.encodedSizeWithTag(9, storyKitSnapPlayback.view_time_ms) + StoryKitEntryEvent.ADAPTER.encodedSizeWithTag(10, storyKitSnapPlayback.entry_event) + StoryKitExitEvent.ADAPTER.encodedSizeWithTag(11, storyKitSnapPlayback.exit_event) + storyKitSnapPlayback.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StoryKitSnapPlayback decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.story_kit_event_base(StoryKitEventBase.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.player_session_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.media_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.snap_id_unchecked(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            try {
                                builder.media_type(StoryKitMediaType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.media_duration_unchecked_ms(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.initial_stall_ms(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.snap_view_index(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.view_time_ms(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            try {
                                builder.entry_event(StoryKitEntryEvent.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            try {
                                builder.exit_event(StoryKitExitEvent.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
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

        public final void encode(ProtoWriter protoWriter, StoryKitSnapPlayback storyKitSnapPlayback) {
            StoryKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, storyKitSnapPlayback.story_kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, storyKitSnapPlayback.player_session_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, storyKitSnapPlayback.media_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, storyKitSnapPlayback.snap_id_unchecked);
            StoryKitMediaType.ADAPTER.encodeWithTag(protoWriter, 5, storyKitSnapPlayback.media_type);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 6, storyKitSnapPlayback.media_duration_unchecked_ms);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 7, storyKitSnapPlayback.initial_stall_ms);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 8, storyKitSnapPlayback.snap_view_index);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 9, storyKitSnapPlayback.view_time_ms);
            StoryKitEntryEvent.ADAPTER.encodeWithTag(protoWriter, 10, storyKitSnapPlayback.entry_event);
            StoryKitExitEvent.ADAPTER.encodeWithTag(protoWriter, 11, storyKitSnapPlayback.exit_event);
            protoWriter.writeBytes(storyKitSnapPlayback.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<StoryKitSnapPlayback, Builder> {
        public StoryKitEntryEvent entry_event;
        public StoryKitExitEvent exit_event;
        public Long initial_stall_ms;
        public Long media_duration_unchecked_ms;
        public StoryKitMediaType media_type;
        public String media_url;
        public String player_session_id;
        public String snap_id_unchecked;
        public Long snap_view_index;
        public StoryKitEventBase story_kit_event_base;
        public Long view_time_ms;

        static {
            Covode.recordClassIndex(35758);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StoryKitSnapPlayback build() {
            return new StoryKitSnapPlayback(this.story_kit_event_base, this.player_session_id, this.media_url, this.snap_id_unchecked, this.media_type, this.media_duration_unchecked_ms, this.initial_stall_ms, this.snap_view_index, this.view_time_ms, this.entry_event, this.exit_event, super.buildUnknownFields());
        }

        public final Builder entry_event(StoryKitEntryEvent storyKitEntryEvent) {
            this.entry_event = storyKitEntryEvent;
            return this;
        }

        public final Builder exit_event(StoryKitExitEvent storyKitExitEvent) {
            this.exit_event = storyKitExitEvent;
            return this;
        }

        public final Builder initial_stall_ms(Long l2) {
            this.initial_stall_ms = l2;
            return this;
        }

        public final Builder media_duration_unchecked_ms(Long l2) {
            this.media_duration_unchecked_ms = l2;
            return this;
        }

        public final Builder media_type(StoryKitMediaType storyKitMediaType) {
            this.media_type = storyKitMediaType;
            return this;
        }

        public final Builder media_url(String str) {
            this.media_url = str;
            return this;
        }

        public final Builder player_session_id(String str) {
            this.player_session_id = str;
            return this;
        }

        public final Builder snap_id_unchecked(String str) {
            this.snap_id_unchecked = str;
            return this;
        }

        public final Builder snap_view_index(Long l2) {
            this.snap_view_index = l2;
            return this;
        }

        public final Builder story_kit_event_base(StoryKitEventBase storyKitEventBase) {
            this.story_kit_event_base = storyKitEventBase;
            return this;
        }

        public final Builder view_time_ms(Long l2) {
            this.view_time_ms = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35757);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StoryKitSnapPlayback, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.story_kit_event_base = this.story_kit_event_base;
        builder.player_session_id = this.player_session_id;
        builder.media_url = this.media_url;
        builder.snap_id_unchecked = this.snap_id_unchecked;
        builder.media_type = this.media_type;
        builder.media_duration_unchecked_ms = this.media_duration_unchecked_ms;
        builder.initial_stall_ms = this.initial_stall_ms;
        builder.snap_view_index = this.snap_view_index;
        builder.view_time_ms = this.view_time_ms;
        builder.entry_event = this.entry_event;
        builder.exit_event = this.exit_event;
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
        StoryKitEventBase storyKitEventBase = this.story_kit_event_base;
        int i13 = 0;
        if (storyKitEventBase != null) {
            i2 = storyKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (hashCode + i2) * 37;
        String str = this.player_session_id;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 37;
        String str2 = this.media_url;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        String str3 = this.snap_id_unchecked;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        StoryKitMediaType storyKitMediaType = this.media_type;
        if (storyKitMediaType != null) {
            i6 = storyKitMediaType.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        Long l2 = this.media_duration_unchecked_ms;
        if (l2 != null) {
            i7 = l2.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        Long l3 = this.initial_stall_ms;
        if (l3 != null) {
            i8 = l3.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        Long l4 = this.snap_view_index;
        if (l4 != null) {
            i9 = l4.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        Long l5 = this.view_time_ms;
        if (l5 != null) {
            i10 = l5.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        StoryKitEntryEvent storyKitEntryEvent = this.entry_event;
        if (storyKitEntryEvent != null) {
            i11 = storyKitEntryEvent.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 37;
        StoryKitExitEvent storyKitExitEvent = this.exit_event;
        if (storyKitExitEvent != null) {
            i13 = storyKitExitEvent.hashCode();
        }
        int i24 = i23 + i13;
        this.hashCode = i24;
        return i24;
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
        if (this.media_url != null) {
            sb.append(", media_url=").append(this.media_url);
        }
        if (this.snap_id_unchecked != null) {
            sb.append(", snap_id_unchecked=").append(this.snap_id_unchecked);
        }
        if (this.media_type != null) {
            sb.append(", media_type=").append(this.media_type);
        }
        if (this.media_duration_unchecked_ms != null) {
            sb.append(", media_duration_unchecked_ms=").append(this.media_duration_unchecked_ms);
        }
        if (this.initial_stall_ms != null) {
            sb.append(", initial_stall_ms=").append(this.initial_stall_ms);
        }
        if (this.snap_view_index != null) {
            sb.append(", snap_view_index=").append(this.snap_view_index);
        }
        if (this.view_time_ms != null) {
            sb.append(", view_time_ms=").append(this.view_time_ms);
        }
        if (this.entry_event != null) {
            sb.append(", entry_event=").append(this.entry_event);
        }
        if (this.exit_event != null) {
            sb.append(", exit_event=").append(this.exit_event);
        }
        return sb.replace(0, 2, "StoryKitSnapPlayback{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoryKitSnapPlayback)) {
            return false;
        }
        StoryKitSnapPlayback storyKitSnapPlayback = (StoryKitSnapPlayback) obj;
        if (!unknownFields().equals(storyKitSnapPlayback.unknownFields()) || !Internal.equals(this.story_kit_event_base, storyKitSnapPlayback.story_kit_event_base) || !Internal.equals(this.player_session_id, storyKitSnapPlayback.player_session_id) || !Internal.equals(this.media_url, storyKitSnapPlayback.media_url) || !Internal.equals(this.snap_id_unchecked, storyKitSnapPlayback.snap_id_unchecked) || !Internal.equals(this.media_type, storyKitSnapPlayback.media_type) || !Internal.equals(this.media_duration_unchecked_ms, storyKitSnapPlayback.media_duration_unchecked_ms) || !Internal.equals(this.initial_stall_ms, storyKitSnapPlayback.initial_stall_ms) || !Internal.equals(this.snap_view_index, storyKitSnapPlayback.snap_view_index) || !Internal.equals(this.view_time_ms, storyKitSnapPlayback.view_time_ms) || !Internal.equals(this.entry_event, storyKitSnapPlayback.entry_event) || !Internal.equals(this.exit_event, storyKitSnapPlayback.exit_event)) {
            return false;
        }
        return true;
    }

    public StoryKitSnapPlayback(StoryKitEventBase storyKitEventBase, String str, String str2, String str3, StoryKitMediaType storyKitMediaType, Long l2, Long l3, Long l4, Long l5, StoryKitEntryEvent storyKitEntryEvent, StoryKitExitEvent storyKitExitEvent) {
        this(storyKitEventBase, str, str2, str3, storyKitMediaType, l2, l3, l4, l5, storyKitEntryEvent, storyKitExitEvent, i.EMPTY);
    }

    public StoryKitSnapPlayback(StoryKitEventBase storyKitEventBase, String str, String str2, String str3, StoryKitMediaType storyKitMediaType, Long l2, Long l3, Long l4, Long l5, StoryKitEntryEvent storyKitEntryEvent, StoryKitExitEvent storyKitExitEvent, i iVar) {
        super(ADAPTER, iVar);
        this.story_kit_event_base = storyKitEventBase;
        this.player_session_id = str;
        this.media_url = str2;
        this.snap_id_unchecked = str3;
        this.media_type = storyKitMediaType;
        this.media_duration_unchecked_ms = l2;
        this.initial_stall_ms = l3;
        this.snap_view_index = l4;
        this.view_time_ms = l5;
        this.entry_event = storyKitEntryEvent;
        this.exit_event = storyKitExitEvent;
    }
}
