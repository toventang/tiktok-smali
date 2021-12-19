package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum StoryKitMediaType implements WireEnum {
    STORY_KIT_MEDIA_TYPE_NONE(0),
    STORY_KIT_MEDIA_TYPE_VIDEO(1),
    STORY_KIT_MEDIA_TYPE_IMAGE(2);
    
    public static final ProtoAdapter<StoryKitMediaType> ADAPTER = new ProtoAdapter_StoryKitMediaType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_StoryKitMediaType extends EnumAdapter<StoryKitMediaType> {
        static {
            Covode.recordClassIndex(35754);
        }

        ProtoAdapter_StoryKitMediaType() {
            super(StoryKitMediaType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final StoryKitMediaType fromValue(int i2) {
            return StoryKitMediaType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35753);
    }

    public static StoryKitMediaType fromValue(int i2) {
        if (i2 == 0) {
            return STORY_KIT_MEDIA_TYPE_NONE;
        }
        if (i2 == 1) {
            return STORY_KIT_MEDIA_TYPE_VIDEO;
        }
        if (i2 != 2) {
            return null;
        }
        return STORY_KIT_MEDIA_TYPE_IMAGE;
    }

    private StoryKitMediaType(int i2) {
        this.value = i2;
    }
}
