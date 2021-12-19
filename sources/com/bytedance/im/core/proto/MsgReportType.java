package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MsgReportType implements WireEnum {
    NOT_USE(0),
    MSG_RECEIVE_BY_WS(1),
    MSG_RECEIVE_BY_USER(2),
    MSG_RECEIVE_BY_INIT(3),
    MSG_RECEIVE_BY_LOAD_HISTORY(4),
    MSG_RECEIVE_BY_LOAD_NEWER(5),
    MSG_RECEIVE_BY_CHECK_MSG_V1(6),
    MSG_RECEIVE_BY_CHECK_MSG_V2(7),
    MSG_RECEIVE_BY_STRANGER(8),
    MSG_SHOW(9);
    
    public static final ProtoAdapter<MsgReportType> ADAPTER = new ProtoAdapter_MsgReportType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_MsgReportType extends EnumAdapter<MsgReportType> {
        static {
            Covode.recordClassIndex(23638);
        }

        ProtoAdapter_MsgReportType() {
            super(MsgReportType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MsgReportType fromValue(int i2) {
            return MsgReportType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23637);
    }

    public static MsgReportType fromValue(int i2) {
        switch (i2) {
            case 0:
                return NOT_USE;
            case 1:
                return MSG_RECEIVE_BY_WS;
            case 2:
                return MSG_RECEIVE_BY_USER;
            case 3:
                return MSG_RECEIVE_BY_INIT;
            case 4:
                return MSG_RECEIVE_BY_LOAD_HISTORY;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return MSG_RECEIVE_BY_LOAD_NEWER;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return MSG_RECEIVE_BY_CHECK_MSG_V1;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return MSG_RECEIVE_BY_CHECK_MSG_V2;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return MSG_RECEIVE_BY_STRANGER;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return MSG_SHOW;
            default:
                return null;
        }
    }

    private MsgReportType(int i2) {
        this.value = i2;
    }
}
