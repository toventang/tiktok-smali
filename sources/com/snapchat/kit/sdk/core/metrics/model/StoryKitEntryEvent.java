package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum StoryKitEntryEvent implements WireEnum {
    STORY_KIT_ENTRY_EVENT_PLAYER_NONE(0),
    STORY_KIT_ENTRY_EVENT_PLAYER_OPEN(1),
    STORY_KIT_ENTRY_EVENT_TAP_LEFT(2),
    STORY_KIT_ENTRY_EVENT_TAP_RIGHT(3),
    STORY_KIT_ENTRY_EVENT_AUTO_ADVANCE(4);
    
    public static final ProtoAdapter<StoryKitEntryEvent> ADAPTER = new ProtoAdapter_StoryKitEntryEvent();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_StoryKitEntryEvent extends EnumAdapter<StoryKitEntryEvent> {
        static {
            Covode.recordClassIndex(35747);
        }

        ProtoAdapter_StoryKitEntryEvent() {
            super(StoryKitEntryEvent.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final StoryKitEntryEvent fromValue(int i2) {
            return StoryKitEntryEvent.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35746);
    }

    public static StoryKitEntryEvent fromValue(int i2) {
        if (i2 == 0) {
            return STORY_KIT_ENTRY_EVENT_PLAYER_NONE;
        }
        if (i2 == 1) {
            return STORY_KIT_ENTRY_EVENT_PLAYER_OPEN;
        }
        if (i2 == 2) {
            return STORY_KIT_ENTRY_EVENT_TAP_LEFT;
        }
        if (i2 == 3) {
            return STORY_KIT_ENTRY_EVENT_TAP_RIGHT;
        }
        if (i2 != 4) {
            return null;
        }
        return STORY_KIT_ENTRY_EVENT_AUTO_ADVANCE;
    }

    private StoryKitEntryEvent(int i2) {
        this.value = i2;
    }
}
