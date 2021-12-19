package com.ss.ugc.effectplatform;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f153568a = new e();

    public static String a(int i2) {
        if (i2 == 1) {
            return "unknown error";
        }
        if (i2 == 10014) {
            return "Invalid effect id";
        }
        if (i2 == 10016) {
            return "link-selector context is null";
        }
        if (i2 == 1100) {
            return "The current application is not a test application";
        }
        if (i2 == 1101) {
            return "access_key does not exist";
        }
        switch (i2) {
            case 1000:
                return "Illegal params (missing or wrong params)";
            case 1001:
                return "access_key is invalid";
            case 1002:
                return "app_version is invalid";
            case 1003:
                return "sdk_version is invalid";
            case 1004:
                return "device_id is invalid";
            case 1005:
                return "device_platform is invalid";
            case 1006:
                return "device_type is invalid";
            case 1007:
                return "channel is invalid";
            case 1008:
                return "app_channel is invalid";
            default:
                switch (i2) {
                    case 2001:
                        return "no change in content";
                    case 2002:
                        return "Effect is offline";
                    case 2003:
                        return "Does not support the current device";
                    case 2004:
                        return "The current effect id does not exist";
                    case 2005:
                        return "Not on allowed list";
                    case 2006:
                        return "App needs to be updated";
                    default:
                        switch (i2) {
                            case 10001:
                                return "Cancel download";
                            case 10002:
                                return "Download error";
                            case 10003:
                                return "Sticker is null";
                            case 10004:
                                return "Invalid effect list cache !!!";
                            case 10005:
                                return "SDK error";
                            case 10006:
                                return "No Downloaded Effects";
                            case 10007:
                                return "panel is null";
                            default:
                                switch (i2) {
                                    case 10009:
                                        return "No local TAG cache";
                                    case 10010:
                                        return "MD5 error";
                                    case 10011:
                                        return "No network";
                                    case 10012:
                                        return "io error";
                                    default:
                                        return "Unkown error";
                                }
                        }
                }
        }
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(102378);
    }
}
