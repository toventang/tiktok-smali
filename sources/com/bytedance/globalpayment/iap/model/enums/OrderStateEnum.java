package com.bytedance.globalpayment.iap.model.enums;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public enum OrderStateEnum {
    Init("INIT"),
    Pending("PENDING"),
    Success("SUCCEED"),
    Failed("FAILED"),
    Closed("CLOSED"),
    Expired("EXPIRED"),
    Processing("PROCESSING"),
    Active("ACTIVE"),
    Abandoned("ABANDONED"),
    Cancelled("CANCELLED"),
    Preorder("PREORDER"),
    SusPended("SUSPENDED"),
    Unknown("UNKNOWN");
    
    private String state;

    static {
        Covode.recordClassIndex(17668);
    }

    public static OrderStateEnum from(int i2) {
        switch (i2) {
            case 1:
                return Pending;
            case 2:
                return Active;
            case 3:
                return Abandoned;
            case 4:
                return Cancelled;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return SusPended;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return Expired;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return Preorder;
            default:
                return Unknown;
        }
    }

    public static OrderStateEnum from(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -1149187550:
                if (str.equals("SUCCEED")) {
                    return Success;
                }
                break;
            case -591252731:
                if (str.equals("EXPIRED")) {
                    return Expired;
                }
                break;
            case 2252048:
                if (str.equals("INIT")) {
                    return Init;
                }
                break;
            case 35394935:
                if (str.equals("PENDING")) {
                    return Pending;
                }
                break;
            case 907287315:
                if (str.equals("PROCESSING")) {
                    return Processing;
                }
                break;
            case 1990776172:
                if (str.equals("CLOSED")) {
                    return Closed;
                }
                break;
            case 2066319421:
                if (str.equals("FAILED")) {
                    return Failed;
                }
                break;
        }
        return Unknown;
    }

    private OrderStateEnum(String str) {
        this.state = str;
    }
}
