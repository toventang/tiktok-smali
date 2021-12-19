package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MsgTraceMetrics implements WireEnum {
    GATEWAY(0),
    BEFORE_CALLBACK(1),
    AFTER_CALLBACK(2),
    BEFORE_CONVERSATION_KAFKA(3),
    AFTER_CONVERSATION_KAFKA(4),
    BEFORE_USER_KAFKA(5),
    AFTER_USER_KAFKA(6),
    PUSH(7);
    
    public static final ProtoAdapter<MsgTraceMetrics> ADAPTER = new ProtoAdapter_MsgTraceMetrics();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_MsgTraceMetrics extends EnumAdapter<MsgTraceMetrics> {
        static {
            Covode.recordClassIndex(23643);
        }

        ProtoAdapter_MsgTraceMetrics() {
            super(MsgTraceMetrics.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MsgTraceMetrics fromValue(int i2) {
            return MsgTraceMetrics.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23642);
    }

    public static MsgTraceMetrics fromValue(int i2) {
        switch (i2) {
            case 0:
                return GATEWAY;
            case 1:
                return BEFORE_CALLBACK;
            case 2:
                return AFTER_CALLBACK;
            case 3:
                return BEFORE_CONVERSATION_KAFKA;
            case 4:
                return AFTER_CONVERSATION_KAFKA;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return BEFORE_USER_KAFKA;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return AFTER_USER_KAFKA;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return PUSH;
            default:
                return null;
        }
    }

    private MsgTraceMetrics(int i2) {
        this.value = i2;
    }
}
