package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class ServerEventData extends Message<ServerEventData, Builder> {
    public static final ProtoAdapter<ServerEventData> ADAPTER = new ProtoAdapter_ServerEventData();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap#ADAPTER", tag = 36)
    public final BitmojiKitCreateAvatarTap bitmoji_kit_create_avatar_tap;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate#ADAPTER", tag = 39)
    public final BitmojiKitPermissionUpdate bitmoji_kit_permission_update;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange#ADAPTER", tag = 77)
    public final BitmojiKitPreviewIconChange bitmoji_kit_preview_icon_change;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch#ADAPTER", tag = 33)
    public final BitmojiKitSearch bitmoji_kit_search;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare#ADAPTER", tag = 32)
    public final BitmojiKitShare bitmoji_kit_share;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess#ADAPTER", tag = 35)
    public final BitmojiKitSnapchatLinkSuccess bitmoji_kit_snapchat_link_success;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap#ADAPTER", tag = 34)
    public final BitmojiKitSnapchatLinkTap bitmoji_kit_snapchat_link_tap;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose#ADAPTER", tag = 31)
    public final BitmojiKitStickerPickerClose bitmoji_kit_sticker_picker_close;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerMount#ADAPTER", tag = 73)
    public final BitmojiKitStickerPickerMount bitmoji_kit_sticker_picker_mount;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen#ADAPTER", tag = 30)
    public final BitmojiKitStickerPickerOpen bitmoji_kit_sticker_picker_open;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete#ADAPTER", tag = 29)
    public final CreativeKitShareComplete creative_kit_share_complete;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart#ADAPTER", tag = 28)
    public final CreativeKitShareStart creative_kit_share_start;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitHeartbeat#ADAPTER", tag = 76)
    public final KitHeartbeat kit_heartbeat;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete#ADAPTER", tag = 38)
    public final LoginKitAuthComplete login_kit_auth_complete;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart#ADAPTER", tag = 37)
    public final LoginKitAuthStart login_kit_auth_start;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.SkateEvent#ADAPTER", tag = 232)
    public final SkateEvent skate_event;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlayback#ADAPTER", tag = 120)
    public final StoryKitSnapPlayback story_kit_snap_playback;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.StoryKitSnapPlaybackPlayerSession#ADAPTER", tag = 121)
    public final StoryKitSnapPlaybackPlayerSession story_kit_snap_playback_player_session;

    static final class ProtoAdapter_ServerEventData extends ProtoAdapter<ServerEventData> {
        static {
            Covode.recordClassIndex(35740);
        }

        public ProtoAdapter_ServerEventData() {
            super(FieldEncoding.LENGTH_DELIMITED, ServerEventData.class);
        }

        public final int encodedSize(ServerEventData serverEventData) {
            return CreativeKitShareStart.ADAPTER.encodedSizeWithTag(28, serverEventData.creative_kit_share_start) + CreativeKitShareComplete.ADAPTER.encodedSizeWithTag(29, serverEventData.creative_kit_share_complete) + BitmojiKitStickerPickerOpen.ADAPTER.encodedSizeWithTag(30, serverEventData.bitmoji_kit_sticker_picker_open) + BitmojiKitStickerPickerClose.ADAPTER.encodedSizeWithTag(31, serverEventData.bitmoji_kit_sticker_picker_close) + BitmojiKitShare.ADAPTER.encodedSizeWithTag(32, serverEventData.bitmoji_kit_share) + BitmojiKitSearch.ADAPTER.encodedSizeWithTag(33, serverEventData.bitmoji_kit_search) + BitmojiKitSnapchatLinkTap.ADAPTER.encodedSizeWithTag(34, serverEventData.bitmoji_kit_snapchat_link_tap) + BitmojiKitSnapchatLinkSuccess.ADAPTER.encodedSizeWithTag(35, serverEventData.bitmoji_kit_snapchat_link_success) + BitmojiKitCreateAvatarTap.ADAPTER.encodedSizeWithTag(36, serverEventData.bitmoji_kit_create_avatar_tap) + LoginKitAuthStart.ADAPTER.encodedSizeWithTag(37, serverEventData.login_kit_auth_start) + LoginKitAuthComplete.ADAPTER.encodedSizeWithTag(38, serverEventData.login_kit_auth_complete) + BitmojiKitPermissionUpdate.ADAPTER.encodedSizeWithTag(39, serverEventData.bitmoji_kit_permission_update) + BitmojiKitStickerPickerMount.ADAPTER.encodedSizeWithTag(73, serverEventData.bitmoji_kit_sticker_picker_mount) + KitHeartbeat.ADAPTER.encodedSizeWithTag(76, serverEventData.kit_heartbeat) + BitmojiKitPreviewIconChange.ADAPTER.encodedSizeWithTag(77, serverEventData.bitmoji_kit_preview_icon_change) + StoryKitSnapPlayback.ADAPTER.encodedSizeWithTag(120, serverEventData.story_kit_snap_playback) + StoryKitSnapPlaybackPlayerSession.ADAPTER.encodedSizeWithTag(121, serverEventData.story_kit_snap_playback_player_session) + SkateEvent.ADAPTER.encodedSizeWithTag(232, serverEventData.skate_event) + serverEventData.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ServerEventData decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 73) {
                    builder.bitmoji_kit_sticker_picker_mount(BitmojiKitStickerPickerMount.ADAPTER.decode(protoReader));
                } else if (nextTag == 232) {
                    builder.skate_event(SkateEvent.ADAPTER.decode(protoReader));
                } else if (nextTag == 76) {
                    builder.kit_heartbeat(KitHeartbeat.ADAPTER.decode(protoReader));
                } else if (nextTag == 77) {
                    builder.bitmoji_kit_preview_icon_change(BitmojiKitPreviewIconChange.ADAPTER.decode(protoReader));
                } else if (nextTag == 120) {
                    builder.story_kit_snap_playback(StoryKitSnapPlayback.ADAPTER.decode(protoReader));
                } else if (nextTag != 121) {
                    switch (nextTag) {
                        case 28:
                            builder.creative_kit_share_start(CreativeKitShareStart.ADAPTER.decode(protoReader));
                            continue;
                        case 29:
                            builder.creative_kit_share_complete(CreativeKitShareComplete.ADAPTER.decode(protoReader));
                            continue;
                        case 30:
                            builder.bitmoji_kit_sticker_picker_open(BitmojiKitStickerPickerOpen.ADAPTER.decode(protoReader));
                            continue;
                        case 31:
                            builder.bitmoji_kit_sticker_picker_close(BitmojiKitStickerPickerClose.ADAPTER.decode(protoReader));
                            continue;
                        case 32:
                            builder.bitmoji_kit_share(BitmojiKitShare.ADAPTER.decode(protoReader));
                            continue;
                        case 33:
                            builder.bitmoji_kit_search(BitmojiKitSearch.ADAPTER.decode(protoReader));
                            continue;
                        case 34:
                            builder.bitmoji_kit_snapchat_link_tap(BitmojiKitSnapchatLinkTap.ADAPTER.decode(protoReader));
                            continue;
                        case 35:
                            builder.bitmoji_kit_snapchat_link_success(BitmojiKitSnapchatLinkSuccess.ADAPTER.decode(protoReader));
                            continue;
                        case 36:
                            builder.bitmoji_kit_create_avatar_tap(BitmojiKitCreateAvatarTap.ADAPTER.decode(protoReader));
                            continue;
                        case 37:
                            builder.login_kit_auth_start(LoginKitAuthStart.ADAPTER.decode(protoReader));
                            continue;
                        case 38:
                            builder.login_kit_auth_complete(LoginKitAuthComplete.ADAPTER.decode(protoReader));
                            continue;
                        case 39:
                            builder.bitmoji_kit_permission_update(BitmojiKitPermissionUpdate.ADAPTER.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    builder.story_kit_snap_playback_player_session(StoryKitSnapPlaybackPlayerSession.ADAPTER.decode(protoReader));
                }
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.ServerEventData$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.ServerEventData redact(com.snapchat.kit.sdk.core.metrics.model.ServerEventData r4) {
            /*
            // Method dump skipped, instructions count: 300
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.ServerEventData.ProtoAdapter_ServerEventData.redact(com.snapchat.kit.sdk.core.metrics.model.ServerEventData):com.snapchat.kit.sdk.core.metrics.model.ServerEventData");
        }

        public final void encode(ProtoWriter protoWriter, ServerEventData serverEventData) {
            CreativeKitShareStart.ADAPTER.encodeWithTag(protoWriter, 28, serverEventData.creative_kit_share_start);
            CreativeKitShareComplete.ADAPTER.encodeWithTag(protoWriter, 29, serverEventData.creative_kit_share_complete);
            BitmojiKitStickerPickerOpen.ADAPTER.encodeWithTag(protoWriter, 30, serverEventData.bitmoji_kit_sticker_picker_open);
            BitmojiKitStickerPickerClose.ADAPTER.encodeWithTag(protoWriter, 31, serverEventData.bitmoji_kit_sticker_picker_close);
            BitmojiKitShare.ADAPTER.encodeWithTag(protoWriter, 32, serverEventData.bitmoji_kit_share);
            BitmojiKitSearch.ADAPTER.encodeWithTag(protoWriter, 33, serverEventData.bitmoji_kit_search);
            BitmojiKitSnapchatLinkTap.ADAPTER.encodeWithTag(protoWriter, 34, serverEventData.bitmoji_kit_snapchat_link_tap);
            BitmojiKitSnapchatLinkSuccess.ADAPTER.encodeWithTag(protoWriter, 35, serverEventData.bitmoji_kit_snapchat_link_success);
            BitmojiKitCreateAvatarTap.ADAPTER.encodeWithTag(protoWriter, 36, serverEventData.bitmoji_kit_create_avatar_tap);
            LoginKitAuthStart.ADAPTER.encodeWithTag(protoWriter, 37, serverEventData.login_kit_auth_start);
            LoginKitAuthComplete.ADAPTER.encodeWithTag(protoWriter, 38, serverEventData.login_kit_auth_complete);
            BitmojiKitPermissionUpdate.ADAPTER.encodeWithTag(protoWriter, 39, serverEventData.bitmoji_kit_permission_update);
            BitmojiKitStickerPickerMount.ADAPTER.encodeWithTag(protoWriter, 73, serverEventData.bitmoji_kit_sticker_picker_mount);
            KitHeartbeat.ADAPTER.encodeWithTag(protoWriter, 76, serverEventData.kit_heartbeat);
            BitmojiKitPreviewIconChange.ADAPTER.encodeWithTag(protoWriter, 77, serverEventData.bitmoji_kit_preview_icon_change);
            StoryKitSnapPlayback.ADAPTER.encodeWithTag(protoWriter, 120, serverEventData.story_kit_snap_playback);
            StoryKitSnapPlaybackPlayerSession.ADAPTER.encodeWithTag(protoWriter, 121, serverEventData.story_kit_snap_playback_player_session);
            SkateEvent.ADAPTER.encodeWithTag(protoWriter, 232, serverEventData.skate_event);
            protoWriter.writeBytes(serverEventData.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(35738);
    }

    public static final class Builder extends Message.Builder<ServerEventData, Builder> {
        public BitmojiKitCreateAvatarTap bitmoji_kit_create_avatar_tap;
        public BitmojiKitPermissionUpdate bitmoji_kit_permission_update;
        public BitmojiKitPreviewIconChange bitmoji_kit_preview_icon_change;
        public BitmojiKitSearch bitmoji_kit_search;
        public BitmojiKitShare bitmoji_kit_share;
        public BitmojiKitSnapchatLinkSuccess bitmoji_kit_snapchat_link_success;
        public BitmojiKitSnapchatLinkTap bitmoji_kit_snapchat_link_tap;
        public BitmojiKitStickerPickerClose bitmoji_kit_sticker_picker_close;
        public BitmojiKitStickerPickerMount bitmoji_kit_sticker_picker_mount;
        public BitmojiKitStickerPickerOpen bitmoji_kit_sticker_picker_open;
        public CreativeKitShareComplete creative_kit_share_complete;
        public CreativeKitShareStart creative_kit_share_start;
        public KitHeartbeat kit_heartbeat;
        public LoginKitAuthComplete login_kit_auth_complete;
        public LoginKitAuthStart login_kit_auth_start;
        public SkateEvent skate_event;
        public StoryKitSnapPlayback story_kit_snap_playback;
        public StoryKitSnapPlaybackPlayerSession story_kit_snap_playback_player_session;

        static {
            Covode.recordClassIndex(35739);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ServerEventData build() {
            return new ServerEventData(this.creative_kit_share_start, this.creative_kit_share_complete, this.bitmoji_kit_sticker_picker_open, this.bitmoji_kit_sticker_picker_close, this.bitmoji_kit_share, this.bitmoji_kit_search, this.bitmoji_kit_snapchat_link_tap, this.bitmoji_kit_snapchat_link_success, this.bitmoji_kit_create_avatar_tap, this.login_kit_auth_start, this.login_kit_auth_complete, this.bitmoji_kit_permission_update, this.bitmoji_kit_sticker_picker_mount, this.kit_heartbeat, this.bitmoji_kit_preview_icon_change, this.story_kit_snap_playback, this.story_kit_snap_playback_player_session, this.skate_event, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_create_avatar_tap(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            this.bitmoji_kit_create_avatar_tap = bitmojiKitCreateAvatarTap;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_permission_update(BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
            this.bitmoji_kit_permission_update = bitmojiKitPermissionUpdate;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_preview_icon_change(BitmojiKitPreviewIconChange bitmojiKitPreviewIconChange) {
            this.bitmoji_kit_preview_icon_change = bitmojiKitPreviewIconChange;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_search(BitmojiKitSearch bitmojiKitSearch) {
            this.bitmoji_kit_search = bitmojiKitSearch;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_share(BitmojiKitShare bitmojiKitShare) {
            this.bitmoji_kit_share = bitmojiKitShare;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_snapchat_link_success(BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) {
            this.bitmoji_kit_snapchat_link_success = bitmojiKitSnapchatLinkSuccess;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_snapchat_link_tap(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            this.bitmoji_kit_snapchat_link_tap = bitmojiKitSnapchatLinkTap;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_sticker_picker_close(BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose) {
            this.bitmoji_kit_sticker_picker_close = bitmojiKitStickerPickerClose;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_sticker_picker_mount(BitmojiKitStickerPickerMount bitmojiKitStickerPickerMount) {
            this.bitmoji_kit_sticker_picker_mount = bitmojiKitStickerPickerMount;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder bitmoji_kit_sticker_picker_open(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            this.bitmoji_kit_sticker_picker_open = bitmojiKitStickerPickerOpen;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder creative_kit_share_complete(CreativeKitShareComplete creativeKitShareComplete) {
            this.creative_kit_share_complete = creativeKitShareComplete;
            this.creative_kit_share_start = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder creative_kit_share_start(CreativeKitShareStart creativeKitShareStart) {
            this.creative_kit_share_start = creativeKitShareStart;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder kit_heartbeat(KitHeartbeat kitHeartbeat) {
            this.kit_heartbeat = kitHeartbeat;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder login_kit_auth_complete(LoginKitAuthComplete loginKitAuthComplete) {
            this.login_kit_auth_complete = loginKitAuthComplete;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder login_kit_auth_start(LoginKitAuthStart loginKitAuthStart) {
            this.login_kit_auth_start = loginKitAuthStart;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder skate_event(SkateEvent skateEvent) {
            this.skate_event = skateEvent;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.story_kit_snap_playback_player_session = null;
            return this;
        }

        public final Builder story_kit_snap_playback(StoryKitSnapPlayback storyKitSnapPlayback) {
            this.story_kit_snap_playback = storyKitSnapPlayback;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback_player_session = null;
            this.skate_event = null;
            return this;
        }

        public final Builder story_kit_snap_playback_player_session(StoryKitSnapPlaybackPlayerSession storyKitSnapPlaybackPlayerSession) {
            this.story_kit_snap_playback_player_session = storyKitSnapPlaybackPlayerSession;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            this.bitmoji_kit_sticker_picker_mount = null;
            this.kit_heartbeat = null;
            this.bitmoji_kit_preview_icon_change = null;
            this.story_kit_snap_playback = null;
            this.skate_event = null;
            return this;
        }
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.ServerEventData$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ServerEventData, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.creative_kit_share_start = this.creative_kit_share_start;
        builder.creative_kit_share_complete = this.creative_kit_share_complete;
        builder.bitmoji_kit_sticker_picker_open = this.bitmoji_kit_sticker_picker_open;
        builder.bitmoji_kit_sticker_picker_close = this.bitmoji_kit_sticker_picker_close;
        builder.bitmoji_kit_share = this.bitmoji_kit_share;
        builder.bitmoji_kit_search = this.bitmoji_kit_search;
        builder.bitmoji_kit_snapchat_link_tap = this.bitmoji_kit_snapchat_link_tap;
        builder.bitmoji_kit_snapchat_link_success = this.bitmoji_kit_snapchat_link_success;
        builder.bitmoji_kit_create_avatar_tap = this.bitmoji_kit_create_avatar_tap;
        builder.login_kit_auth_start = this.login_kit_auth_start;
        builder.login_kit_auth_complete = this.login_kit_auth_complete;
        builder.bitmoji_kit_permission_update = this.bitmoji_kit_permission_update;
        builder.bitmoji_kit_sticker_picker_mount = this.bitmoji_kit_sticker_picker_mount;
        builder.kit_heartbeat = this.kit_heartbeat;
        builder.bitmoji_kit_preview_icon_change = this.bitmoji_kit_preview_icon_change;
        builder.story_kit_snap_playback = this.story_kit_snap_playback;
        builder.story_kit_snap_playback_player_session = this.story_kit_snap_playback_player_session;
        builder.skate_event = this.skate_event;
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
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.hashCode;
        if (i19 != 0) {
            return i19;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CreativeKitShareStart creativeKitShareStart = this.creative_kit_share_start;
        int i20 = 0;
        if (creativeKitShareStart != null) {
            i2 = creativeKitShareStart.hashCode();
        } else {
            i2 = 0;
        }
        int i21 = (hashCode + i2) * 37;
        CreativeKitShareComplete creativeKitShareComplete = this.creative_kit_share_complete;
        if (creativeKitShareComplete != null) {
            i3 = creativeKitShareComplete.hashCode();
        } else {
            i3 = 0;
        }
        int i22 = (i21 + i3) * 37;
        BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen = this.bitmoji_kit_sticker_picker_open;
        if (bitmojiKitStickerPickerOpen != null) {
            i4 = bitmojiKitStickerPickerOpen.hashCode();
        } else {
            i4 = 0;
        }
        int i23 = (i22 + i4) * 37;
        BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose = this.bitmoji_kit_sticker_picker_close;
        if (bitmojiKitStickerPickerClose != null) {
            i5 = bitmojiKitStickerPickerClose.hashCode();
        } else {
            i5 = 0;
        }
        int i24 = (i23 + i5) * 37;
        BitmojiKitShare bitmojiKitShare = this.bitmoji_kit_share;
        if (bitmojiKitShare != null) {
            i6 = bitmojiKitShare.hashCode();
        } else {
            i6 = 0;
        }
        int i25 = (i24 + i6) * 37;
        BitmojiKitSearch bitmojiKitSearch = this.bitmoji_kit_search;
        if (bitmojiKitSearch != null) {
            i7 = bitmojiKitSearch.hashCode();
        } else {
            i7 = 0;
        }
        int i26 = (i25 + i7) * 37;
        BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap = this.bitmoji_kit_snapchat_link_tap;
        if (bitmojiKitSnapchatLinkTap != null) {
            i8 = bitmojiKitSnapchatLinkTap.hashCode();
        } else {
            i8 = 0;
        }
        int i27 = (i26 + i8) * 37;
        BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess = this.bitmoji_kit_snapchat_link_success;
        if (bitmojiKitSnapchatLinkSuccess != null) {
            i9 = bitmojiKitSnapchatLinkSuccess.hashCode();
        } else {
            i9 = 0;
        }
        int i28 = (i27 + i9) * 37;
        BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap = this.bitmoji_kit_create_avatar_tap;
        if (bitmojiKitCreateAvatarTap != null) {
            i10 = bitmojiKitCreateAvatarTap.hashCode();
        } else {
            i10 = 0;
        }
        int i29 = (i28 + i10) * 37;
        LoginKitAuthStart loginKitAuthStart = this.login_kit_auth_start;
        if (loginKitAuthStart != null) {
            i11 = loginKitAuthStart.hashCode();
        } else {
            i11 = 0;
        }
        int i30 = (i29 + i11) * 37;
        LoginKitAuthComplete loginKitAuthComplete = this.login_kit_auth_complete;
        if (loginKitAuthComplete != null) {
            i12 = loginKitAuthComplete.hashCode();
        } else {
            i12 = 0;
        }
        int i31 = (i30 + i12) * 37;
        BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate = this.bitmoji_kit_permission_update;
        if (bitmojiKitPermissionUpdate != null) {
            i13 = bitmojiKitPermissionUpdate.hashCode();
        } else {
            i13 = 0;
        }
        int i32 = (i31 + i13) * 37;
        BitmojiKitStickerPickerMount bitmojiKitStickerPickerMount = this.bitmoji_kit_sticker_picker_mount;
        if (bitmojiKitStickerPickerMount != null) {
            i14 = bitmojiKitStickerPickerMount.hashCode();
        } else {
            i14 = 0;
        }
        int i33 = (i32 + i14) * 37;
        KitHeartbeat kitHeartbeat = this.kit_heartbeat;
        if (kitHeartbeat != null) {
            i15 = kitHeartbeat.hashCode();
        } else {
            i15 = 0;
        }
        int i34 = (i33 + i15) * 37;
        BitmojiKitPreviewIconChange bitmojiKitPreviewIconChange = this.bitmoji_kit_preview_icon_change;
        if (bitmojiKitPreviewIconChange != null) {
            i16 = bitmojiKitPreviewIconChange.hashCode();
        } else {
            i16 = 0;
        }
        int i35 = (i34 + i16) * 37;
        StoryKitSnapPlayback storyKitSnapPlayback = this.story_kit_snap_playback;
        if (storyKitSnapPlayback != null) {
            i17 = storyKitSnapPlayback.hashCode();
        } else {
            i17 = 0;
        }
        int i36 = (i35 + i17) * 37;
        StoryKitSnapPlaybackPlayerSession storyKitSnapPlaybackPlayerSession = this.story_kit_snap_playback_player_session;
        if (storyKitSnapPlaybackPlayerSession != null) {
            i18 = storyKitSnapPlaybackPlayerSession.hashCode();
        } else {
            i18 = 0;
        }
        int i37 = (i36 + i18) * 37;
        SkateEvent skateEvent = this.skate_event;
        if (skateEvent != null) {
            i20 = skateEvent.hashCode();
        }
        int i38 = i37 + i20;
        this.hashCode = i38;
        return i38;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.creative_kit_share_start != null) {
            sb.append(", creative_kit_share_start=").append(this.creative_kit_share_start);
        }
        if (this.creative_kit_share_complete != null) {
            sb.append(", creative_kit_share_complete=").append(this.creative_kit_share_complete);
        }
        if (this.bitmoji_kit_sticker_picker_open != null) {
            sb.append(", bitmoji_kit_sticker_picker_open=").append(this.bitmoji_kit_sticker_picker_open);
        }
        if (this.bitmoji_kit_sticker_picker_close != null) {
            sb.append(", bitmoji_kit_sticker_picker_close=").append(this.bitmoji_kit_sticker_picker_close);
        }
        if (this.bitmoji_kit_share != null) {
            sb.append(", bitmoji_kit_share=").append(this.bitmoji_kit_share);
        }
        if (this.bitmoji_kit_search != null) {
            sb.append(", bitmoji_kit_search=").append(this.bitmoji_kit_search);
        }
        if (this.bitmoji_kit_snapchat_link_tap != null) {
            sb.append(", bitmoji_kit_snapchat_link_tap=").append(this.bitmoji_kit_snapchat_link_tap);
        }
        if (this.bitmoji_kit_snapchat_link_success != null) {
            sb.append(", bitmoji_kit_snapchat_link_success=").append(this.bitmoji_kit_snapchat_link_success);
        }
        if (this.bitmoji_kit_create_avatar_tap != null) {
            sb.append(", bitmoji_kit_create_avatar_tap=").append(this.bitmoji_kit_create_avatar_tap);
        }
        if (this.login_kit_auth_start != null) {
            sb.append(", login_kit_auth_start=").append(this.login_kit_auth_start);
        }
        if (this.login_kit_auth_complete != null) {
            sb.append(", login_kit_auth_complete=").append(this.login_kit_auth_complete);
        }
        if (this.bitmoji_kit_permission_update != null) {
            sb.append(", bitmoji_kit_permission_update=").append(this.bitmoji_kit_permission_update);
        }
        if (this.bitmoji_kit_sticker_picker_mount != null) {
            sb.append(", bitmoji_kit_sticker_picker_mount=").append(this.bitmoji_kit_sticker_picker_mount);
        }
        if (this.kit_heartbeat != null) {
            sb.append(", kit_heartbeat=").append(this.kit_heartbeat);
        }
        if (this.bitmoji_kit_preview_icon_change != null) {
            sb.append(", bitmoji_kit_preview_icon_change=").append(this.bitmoji_kit_preview_icon_change);
        }
        if (this.story_kit_snap_playback != null) {
            sb.append(", story_kit_snap_playback=").append(this.story_kit_snap_playback);
        }
        if (this.story_kit_snap_playback_player_session != null) {
            sb.append(", story_kit_snap_playback_player_session=").append(this.story_kit_snap_playback_player_session);
        }
        if (this.skate_event != null) {
            sb.append(", skate_event=").append(this.skate_event);
        }
        return sb.replace(0, 2, "ServerEventData{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerEventData)) {
            return false;
        }
        ServerEventData serverEventData = (ServerEventData) obj;
        if (!unknownFields().equals(serverEventData.unknownFields()) || !Internal.equals(this.creative_kit_share_start, serverEventData.creative_kit_share_start) || !Internal.equals(this.creative_kit_share_complete, serverEventData.creative_kit_share_complete) || !Internal.equals(this.bitmoji_kit_sticker_picker_open, serverEventData.bitmoji_kit_sticker_picker_open) || !Internal.equals(this.bitmoji_kit_sticker_picker_close, serverEventData.bitmoji_kit_sticker_picker_close) || !Internal.equals(this.bitmoji_kit_share, serverEventData.bitmoji_kit_share) || !Internal.equals(this.bitmoji_kit_search, serverEventData.bitmoji_kit_search) || !Internal.equals(this.bitmoji_kit_snapchat_link_tap, serverEventData.bitmoji_kit_snapchat_link_tap) || !Internal.equals(this.bitmoji_kit_snapchat_link_success, serverEventData.bitmoji_kit_snapchat_link_success) || !Internal.equals(this.bitmoji_kit_create_avatar_tap, serverEventData.bitmoji_kit_create_avatar_tap) || !Internal.equals(this.login_kit_auth_start, serverEventData.login_kit_auth_start) || !Internal.equals(this.login_kit_auth_complete, serverEventData.login_kit_auth_complete) || !Internal.equals(this.bitmoji_kit_permission_update, serverEventData.bitmoji_kit_permission_update) || !Internal.equals(this.bitmoji_kit_sticker_picker_mount, serverEventData.bitmoji_kit_sticker_picker_mount) || !Internal.equals(this.kit_heartbeat, serverEventData.kit_heartbeat) || !Internal.equals(this.bitmoji_kit_preview_icon_change, serverEventData.bitmoji_kit_preview_icon_change) || !Internal.equals(this.story_kit_snap_playback, serverEventData.story_kit_snap_playback) || !Internal.equals(this.story_kit_snap_playback_player_session, serverEventData.story_kit_snap_playback_player_session) || !Internal.equals(this.skate_event, serverEventData.skate_event)) {
            return false;
        }
        return true;
    }

    public ServerEventData(CreativeKitShareStart creativeKitShareStart, CreativeKitShareComplete creativeKitShareComplete, BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen, BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose, BitmojiKitShare bitmojiKitShare, BitmojiKitSearch bitmojiKitSearch, BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap, BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess, BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap, LoginKitAuthStart loginKitAuthStart, LoginKitAuthComplete loginKitAuthComplete, BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate, BitmojiKitStickerPickerMount bitmojiKitStickerPickerMount, KitHeartbeat kitHeartbeat, BitmojiKitPreviewIconChange bitmojiKitPreviewIconChange, StoryKitSnapPlayback storyKitSnapPlayback, StoryKitSnapPlaybackPlayerSession storyKitSnapPlaybackPlayerSession, SkateEvent skateEvent) {
        this(creativeKitShareStart, creativeKitShareComplete, bitmojiKitStickerPickerOpen, bitmojiKitStickerPickerClose, bitmojiKitShare, bitmojiKitSearch, bitmojiKitSnapchatLinkTap, bitmojiKitSnapchatLinkSuccess, bitmojiKitCreateAvatarTap, loginKitAuthStart, loginKitAuthComplete, bitmojiKitPermissionUpdate, bitmojiKitStickerPickerMount, kitHeartbeat, bitmojiKitPreviewIconChange, storyKitSnapPlayback, storyKitSnapPlaybackPlayerSession, skateEvent, i.EMPTY);
    }

    public ServerEventData(CreativeKitShareStart creativeKitShareStart, CreativeKitShareComplete creativeKitShareComplete, BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen, BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose, BitmojiKitShare bitmojiKitShare, BitmojiKitSearch bitmojiKitSearch, BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap, BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess, BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap, LoginKitAuthStart loginKitAuthStart, LoginKitAuthComplete loginKitAuthComplete, BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate, BitmojiKitStickerPickerMount bitmojiKitStickerPickerMount, KitHeartbeat kitHeartbeat, BitmojiKitPreviewIconChange bitmojiKitPreviewIconChange, StoryKitSnapPlayback storyKitSnapPlayback, StoryKitSnapPlaybackPlayerSession storyKitSnapPlaybackPlayerSession, SkateEvent skateEvent, i iVar) {
        super(ADAPTER, iVar);
        if (Internal.countNonNull(creativeKitShareStart, creativeKitShareComplete, bitmojiKitStickerPickerOpen, bitmojiKitStickerPickerClose, bitmojiKitShare, bitmojiKitSearch, bitmojiKitSnapchatLinkTap, bitmojiKitSnapchatLinkSuccess, bitmojiKitCreateAvatarTap, loginKitAuthStart, loginKitAuthComplete, bitmojiKitPermissionUpdate, bitmojiKitStickerPickerMount, kitHeartbeat, bitmojiKitPreviewIconChange, storyKitSnapPlayback, storyKitSnapPlaybackPlayerSession, skateEvent) <= 1) {
            this.creative_kit_share_start = creativeKitShareStart;
            this.creative_kit_share_complete = creativeKitShareComplete;
            this.bitmoji_kit_sticker_picker_open = bitmojiKitStickerPickerOpen;
            this.bitmoji_kit_sticker_picker_close = bitmojiKitStickerPickerClose;
            this.bitmoji_kit_share = bitmojiKitShare;
            this.bitmoji_kit_search = bitmojiKitSearch;
            this.bitmoji_kit_snapchat_link_tap = bitmojiKitSnapchatLinkTap;
            this.bitmoji_kit_snapchat_link_success = bitmojiKitSnapchatLinkSuccess;
            this.bitmoji_kit_create_avatar_tap = bitmojiKitCreateAvatarTap;
            this.login_kit_auth_start = loginKitAuthStart;
            this.login_kit_auth_complete = loginKitAuthComplete;
            this.bitmoji_kit_permission_update = bitmojiKitPermissionUpdate;
            this.bitmoji_kit_sticker_picker_mount = bitmojiKitStickerPickerMount;
            this.kit_heartbeat = kitHeartbeat;
            this.bitmoji_kit_preview_icon_change = bitmojiKitPreviewIconChange;
            this.story_kit_snap_playback = storyKitSnapPlayback;
            this.story_kit_snap_playback_player_session = storyKitSnapPlaybackPlayerSession;
            this.skate_event = skateEvent;
            return;
        }
        throw new IllegalArgumentException("at most one of creative_kit_share_start, creative_kit_share_complete, bitmoji_kit_sticker_picker_open, bitmoji_kit_sticker_picker_close, bitmoji_kit_share, bitmoji_kit_search, bitmoji_kit_snapchat_link_tap, bitmoji_kit_snapchat_link_success, bitmoji_kit_create_avatar_tap, login_kit_auth_start, login_kit_auth_complete, bitmoji_kit_permission_update, bitmoji_kit_sticker_picker_mount, kit_heartbeat, bitmoji_kit_preview_icon_change, story_kit_snap_playback, story_kit_snap_playback_player_session, skate_event may be non-null");
    }
}
