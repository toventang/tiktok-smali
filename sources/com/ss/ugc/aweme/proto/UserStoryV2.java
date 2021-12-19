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
import java.util.List;
import k.i;

public final class UserStoryV2 extends Message<UserStoryV2, Builder> {
    public static final ProtoAdapter<UserStoryV2> ADAPTER = new ProtoAdapter_UserStoryV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public Boolean all_viewed;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public Long current_position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Boolean has_more_after;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Boolean has_more_before;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Long last_story_created_at;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long max_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long min_cursor;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<AwemeStructV2> stories;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public Long total_count;

    public UserStoryV2() {
    }

    static final class ProtoAdapter_UserStoryV2 extends ProtoAdapter<UserStoryV2> {
        static {
            Covode.recordClassIndex(102256);
        }

        public ProtoAdapter_UserStoryV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UserStoryV2.class);
        }

        public final int encodedSize(UserStoryV2 userStoryV2) {
            return AwemeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(1, userStoryV2.stories) + ProtoAdapter.INT64.encodedSizeWithTag(2, userStoryV2.total_count) + ProtoAdapter.INT64.encodedSizeWithTag(3, userStoryV2.current_position) + ProtoAdapter.BOOL.encodedSizeWithTag(4, userStoryV2.all_viewed) + ProtoAdapter.INT64.encodedSizeWithTag(5, userStoryV2.min_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(6, userStoryV2.max_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(7, userStoryV2.has_more_after) + ProtoAdapter.BOOL.encodedSizeWithTag(8, userStoryV2.has_more_before) + ProtoAdapter.INT64.encodedSizeWithTag(9, userStoryV2.last_story_created_at) + userStoryV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UserStoryV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.stories.add(AwemeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.total_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.current_position(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.all_viewed(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.min_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.max_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.has_more_after(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.has_more_before(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.last_story_created_at(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, UserStoryV2 userStoryV2) {
            AwemeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, userStoryV2.stories);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, userStoryV2.total_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, userStoryV2.current_position);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, userStoryV2.all_viewed);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, userStoryV2.min_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, userStoryV2.max_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, userStoryV2.has_more_after);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, userStoryV2.has_more_before);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, userStoryV2.last_story_created_at);
            protoWriter.writeBytes(userStoryV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102254);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.UserStoryV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UserStoryV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.stories = Internal.copyOf("stories", this.stories);
        builder.total_count = this.total_count;
        builder.current_position = this.current_position;
        builder.all_viewed = this.all_viewed;
        builder.min_cursor = this.min_cursor;
        builder.max_cursor = this.max_cursor;
        builder.has_more_after = this.has_more_after;
        builder.has_more_before = this.has_more_before;
        builder.last_story_created_at = this.last_story_created_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.stories.hashCode()) * 37) + this.total_count.hashCode()) * 37) + this.current_position.hashCode()) * 37) + this.all_viewed.hashCode()) * 37) + this.min_cursor.hashCode()) * 37) + this.max_cursor.hashCode()) * 37) + this.has_more_after.hashCode()) * 37) + this.has_more_before.hashCode()) * 37;
        Long l2 = this.last_story_created_at;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hashCode + i2;
        this.hashCode = i4;
        return i4;
    }

    public static final class Builder extends Message.Builder<UserStoryV2, Builder> {
        public Boolean all_viewed;
        public Long current_position;
        public Boolean has_more_after;
        public Boolean has_more_before;
        public Long last_story_created_at;
        public Long max_cursor;
        public Long min_cursor;
        public List<AwemeStructV2> stories = Internal.newMutableList();
        public Long total_count;

        static {
            Covode.recordClassIndex(102255);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UserStoryV2 build() {
            Long l2 = this.total_count;
            if (l2 != null && this.current_position != null && this.all_viewed != null && this.min_cursor != null && this.max_cursor != null && this.has_more_after != null && this.has_more_before != null) {
                return new UserStoryV2(this.stories, this.total_count, this.current_position, this.all_viewed, this.min_cursor, this.max_cursor, this.has_more_after, this.has_more_before, this.last_story_created_at, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "total_count", this.current_position, "current_position", this.all_viewed, "all_viewed", this.min_cursor, "min_cursor", this.max_cursor, "max_cursor", this.has_more_after, "has_more_after", this.has_more_before, "has_more_before");
        }

        public final Builder all_viewed(Boolean bool) {
            this.all_viewed = bool;
            return this;
        }

        public final Builder current_position(Long l2) {
            this.current_position = l2;
            return this;
        }

        public final Builder has_more_after(Boolean bool) {
            this.has_more_after = bool;
            return this;
        }

        public final Builder has_more_before(Boolean bool) {
            this.has_more_before = bool;
            return this;
        }

        public final Builder last_story_created_at(Long l2) {
            this.last_story_created_at = l2;
            return this;
        }

        public final Builder max_cursor(Long l2) {
            this.max_cursor = l2;
            return this;
        }

        public final Builder min_cursor(Long l2) {
            this.min_cursor = l2;
            return this;
        }

        public final Builder total_count(Long l2) {
            this.total_count = l2;
            return this;
        }

        public final Builder stories(List<AwemeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.stories = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.stories.isEmpty()) {
            sb.append(", stories=").append(this.stories);
        }
        sb.append(", total_count=").append(this.total_count);
        sb.append(", current_position=").append(this.current_position);
        sb.append(", all_viewed=").append(this.all_viewed);
        sb.append(", min_cursor=").append(this.min_cursor);
        sb.append(", max_cursor=").append(this.max_cursor);
        sb.append(", has_more_after=").append(this.has_more_after);
        sb.append(", has_more_before=").append(this.has_more_before);
        if (this.last_story_created_at != null) {
            sb.append(", last_story_created_at=").append(this.last_story_created_at);
        }
        return sb.replace(0, 2, "UserStoryV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserStoryV2)) {
            return false;
        }
        UserStoryV2 userStoryV2 = (UserStoryV2) obj;
        if (!unknownFields().equals(userStoryV2.unknownFields()) || !this.stories.equals(userStoryV2.stories) || !this.total_count.equals(userStoryV2.total_count) || !this.current_position.equals(userStoryV2.current_position) || !this.all_viewed.equals(userStoryV2.all_viewed) || !this.min_cursor.equals(userStoryV2.min_cursor) || !this.max_cursor.equals(userStoryV2.max_cursor) || !this.has_more_after.equals(userStoryV2.has_more_after) || !this.has_more_before.equals(userStoryV2.has_more_before) || !Internal.equals(this.last_story_created_at, userStoryV2.last_story_created_at)) {
            return false;
        }
        return true;
    }

    public UserStoryV2(List<AwemeStructV2> list, Long l2, Long l3, Boolean bool, Long l4, Long l5, Boolean bool2, Boolean bool3, Long l6) {
        this(list, l2, l3, bool, l4, l5, bool2, bool3, l6, i.EMPTY);
    }

    public UserStoryV2(List<AwemeStructV2> list, Long l2, Long l3, Boolean bool, Long l4, Long l5, Boolean bool2, Boolean bool3, Long l6, i iVar) {
        super(ADAPTER, iVar);
        this.stories = Internal.immutableCopyOf("stories", list);
        this.total_count = l2;
        this.current_position = l3;
        this.all_viewed = bool;
        this.min_cursor = l4;
        this.max_cursor = l5;
        this.has_more_after = bool2;
        this.has_more_before = bool3;
        this.last_story_created_at = l6;
    }
}
