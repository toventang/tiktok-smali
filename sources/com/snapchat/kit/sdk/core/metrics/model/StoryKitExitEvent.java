package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum StoryKitExitEvent implements WireEnum {
    STORY_KIT_EXIT_EVENT_PLAYER_NONE(0),
    STORY_KIT_EXIT_EVENT_TAP_LEFT(1),
    STORY_KIT_EXIT_EVENT_TAP_RIGHT(2),
    STORY_KIT_EXIT_EVENT_AUTO_ADVANCE(3),
    STORY_KIT_EXIT_EVENT_PLAYER_CLOSE(4),
    STORY_KIT_EXIT_EVENT_EXTERNAL_APP_EVENT(5);
    
    public static final ProtoAdapter<StoryKitExitEvent> ADAPTER = new ProtoAdapter_StoryKitExitEvent();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_StoryKitExitEvent extends EnumAdapter<StoryKitExitEvent> {
        static {
            Covode.recordClassIndex(35752);
        }

        ProtoAdapter_StoryKitExitEvent() {
            super(StoryKitExitEvent.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final StoryKitExitEvent fromValue(int i2) {
            return StoryKitExitEvent.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35751);
    }

    public static StoryKitExitEvent fromValue(int i2) {
        if (i2 == 0) {
            return STORY_KIT_EXIT_EVENT_PLAYER_NONE;
        }
        if (i2 == 1) {
            return STORY_KIT_EXIT_EVENT_TAP_LEFT;
        }
        if (i2 == 2) {
            return STORY_KIT_EXIT_EVENT_TAP_RIGHT;
        }
        if (i2 == 3) {
            return STORY_KIT_EXIT_EVENT_AUTO_ADVANCE;
        }
        if (i2 == 4) {
            return STORY_KIT_EXIT_EVENT_PLAYER_CLOSE;
        }
        if (i2 != 5) {
            return null;
        }
        return STORY_KIT_EXIT_EVENT_EXTERNAL_APP_EVENT;
    }

    private StoryKitExitEvent(int i2) {
        this.value = i2;
    }
}
