package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public class ABRConfig {
    public static final int ABR_4G_MAX_BITRATE_KEY = 2;
    public static final int ABR_BANDWIDTH_PARAMETER_KEY = 11;
    public static final int ABR_DEFAULT_WIFI_BITRATE = 12;
    public static final int ABR_FIXED_LEVEL = 4;
    public static final int ABR_LOG_LEVEL_KEY = 0;
    public static final int ABR_PLAYER_DISPLAY_HEIGHT_KEY = 7;
    public static final int ABR_PLAYER_DISPLAY_WIDTH_KEY = 6;
    public static final int ABR_SELECT_SCENE = 14;
    public static final int ABR_STALL_PENALTY_PARAMETER_KEY = 9;
    public static final int ABR_STARTUP_BANDWIDTH_PARAMETER_KEY = 8;
    public static final int ABR_STARTUP_MAX_BITRATE = 13;
    public static final int ABR_STARTUP_MODEL_KEY = 5;
    public static final int ABR_SWITCH_MODEL_KEY = 3;
    public static final int ABR_SWITCH_PENALTY_PARAMETER_KEY = 10;
    public static final int ABR_SWITCH_SENSITIVITY_KEY = 1;
    private static float sBandwidthParameter = 1.0f;
    private static int sFixedLevel = 2;
    private static int sLogLevel = 3;
    private static float sStallPenaltyParameter = 9.0f;
    private static float sStartupBandwidthParameter = 0.9f;
    private static int sStartupModel;
    private static double sStartupModelFirstParam;
    private static double sStartupModelFourthParam = 69.0106422d;
    private static double sStartupModelSecondParam = 2.67952228E-5d;
    private static double sStartupModelThirdParam = 0.151840652d;
    private static int sStartupUseCache;
    private static int sSwitchModel = 1;
    private static float sSwitchPenaltyParameter = 2.0f;
    private static int sSwitchSensitivity;

    public static float getBandwidthParameter() {
        return sBandwidthParameter;
    }

    public static int getFixedLevel() {
        return sFixedLevel;
    }

    public static int getLogLevel() {
        return sLogLevel;
    }

    public static float getStallPenaltyParameter() {
        return sStallPenaltyParameter;
    }

    public static float getStartupBandwidthParameter() {
        return sStartupBandwidthParameter;
    }

    public static int getStartupModel() {
        return sStartupModel;
    }

    public static double getStartupModelFirstParam() {
        return sStartupModelFirstParam;
    }

    public static double getStartupModelFourthParam() {
        return sStartupModelFourthParam;
    }

    public static double getStartupModelSecondParam() {
        return sStartupModelSecondParam;
    }

    public static double getStartupModelThirdParam() {
        return sStartupModelThirdParam;
    }

    public static int getStartupUseCache() {
        return sStartupUseCache;
    }

    public static int getSwitchModel() {
        return sSwitchModel;
    }

    public static float getSwitchPenaltyParameter() {
        return sSwitchPenaltyParameter;
    }

    public static int getSwitchSensitivity() {
        return sSwitchSensitivity;
    }

    static {
        Covode.recordClassIndex(27998);
    }

    public static void setBandwidthParameter(float f2) {
        sBandwidthParameter = f2;
    }

    public static void setFixedLevel(int i2) {
        sFixedLevel = i2;
    }

    public static void setLoglevel(int i2) {
        sLogLevel = i2;
    }

    public static void setStallPenaltyParameter(float f2) {
        sStallPenaltyParameter = f2;
    }

    public static void setStartupBandwidthParameter(float f2) {
        sStartupBandwidthParameter = f2;
    }

    public static void setStartupModel(int i2) {
        sStartupModel = i2;
    }

    public static void setStartupModelFirstParam(double d2) {
        sStartupModelFirstParam = d2;
    }

    public static void setStartupModelFourthParam(double d2) {
        sStartupModelFourthParam = d2;
    }

    public static void setStartupModelSecondParam(double d2) {
        sStartupModelSecondParam = d2;
    }

    public static void setStartupModelThirdParam(double d2) {
        sStartupModelThirdParam = d2;
    }

    public static void setStartupUseCache(int i2) {
        sStartupUseCache = i2;
    }

    public static void setSwitchModel(int i2) {
        sSwitchModel = i2;
    }

    public static void setSwitchPenaltyParameter(float f2) {
        sSwitchPenaltyParameter = f2;
    }

    public static void setSwitchSensitivity(int i2) {
        sSwitchSensitivity = i2;
    }
}
