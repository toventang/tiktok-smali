package com.ss.android.ugc.effectmanager.common.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.utils.DeviceUtil;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import org.json.JSONObject;

public final class EffectRequestUtil {
    public static final EffectRequestUtil INSTANCE = new EffectRequestUtil();

    private EffectRequestUtil() {
    }

    static {
        Covode.recordClassIndex(95335);
    }

    public static final boolean isOnlineEnv(EffectConfiguration effectConfiguration) {
        l.c(effectConfiguration, "");
        String channel = effectConfiguration.getChannel();
        if (channel == null) {
            return false;
        }
        return p.a((CharSequence) channel, (CharSequence) "online", false);
    }

    private final String buildDeviceInfo(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("platform", 1);
        try {
            hashMap.put("gl_version", Float.valueOf(Float.parseFloat(GPUUtils.INSTANCE.getVersion())));
        } catch (Exception unused) {
        }
        hashMap.put("gl_vendor", GPUUtils.INSTANCE.getVendor());
        hashMap.put("gl_renderer", GPUUtils.INSTANCE.getRenderer());
        hashMap.put("gl_extension", GPUUtils.INSTANCE.getGlExtension());
        if (context != null) {
            DeviceUtil.MemoryInfo memoryInfo = DeviceUtil.getMemoryInfo(context);
            l.a((Object) memoryInfo, "");
            long totalSize = memoryInfo.getTotalSize();
            if (totalSize > 0) {
                hashMap.put("memory_total_size", Long.valueOf(totalSize));
            }
        }
        String cpuModel = DeviceUtil.getCpuModel();
        l.a((Object) cpuModel, "");
        hashMap.put("cpu_vendor", cpuModel);
        String str = Build.VERSION.RELEASE;
        l.a((Object) str, "");
        hashMap.put("os_version", str);
        String jSONObject = new JSONObject(hashMap).toString();
        l.a((Object) jSONObject, "");
        return jSONObject;
    }

    public final HashMap<String, String> addCommonParams(EffectConfiguration effectConfiguration) {
        l.c(effectConfiguration, "");
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(effectConfiguration.getAccessKey())) {
            String accessKey = effectConfiguration.getAccessKey();
            l.a((Object) accessKey, "");
            hashMap.put("access_key", accessKey);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getDeviceId())) {
            String deviceId = effectConfiguration.getDeviceId();
            l.a((Object) deviceId, "");
            hashMap.put("device_id", deviceId);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getDeviceType())) {
            String deviceType = effectConfiguration.getDeviceType();
            l.a((Object) deviceType, "");
            hashMap.put("device_type", deviceType);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getPlatform())) {
            String platform = effectConfiguration.getPlatform();
            l.a((Object) platform, "");
            hashMap.put("device_platform", platform);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getRegion())) {
            String region = effectConfiguration.getRegion();
            l.a((Object) region, "");
            hashMap.put("region", region);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getSdkVersion())) {
            String sdkVersion = effectConfiguration.getSdkVersion();
            l.a((Object) sdkVersion, "");
            hashMap.put("sdk_version", sdkVersion);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getAppVersion())) {
            String appVersion = effectConfiguration.getAppVersion();
            l.a((Object) appVersion, "");
            hashMap.put("app_version", appVersion);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getChannel())) {
            String channel = effectConfiguration.getChannel();
            l.a((Object) channel, "");
            hashMap.put("channel", channel);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getAppID())) {
            String appID = effectConfiguration.getAppID();
            l.a((Object) appID, "");
            hashMap.put("aid", appID);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getAppLanguage())) {
            String appLanguage = effectConfiguration.getAppLanguage();
            l.a((Object) appLanguage, "");
            hashMap.put("app_language", appLanguage);
        }
        if (!CollectionUtil.isMapEmpty(effectConfiguration.getIopInfo())) {
            hashMap.putAll(effectConfiguration.getIopInfo());
        }
        if (!TextUtils.isEmpty(effectConfiguration.getGpuVersion())) {
            String gpuVersion = effectConfiguration.getGpuVersion();
            l.a((Object) gpuVersion, "");
            hashMap.put("gpu", gpuVersion);
        }
        if (effectConfiguration.getFilterType() > 0) {
            hashMap.put("filter_type", String.valueOf(effectConfiguration.getFilterType()));
        }
        hashMap.put("platform_ab_params", String.valueOf(effectConfiguration.getRequestStrategy()));
        hashMap.put("platform_sdk_version", EPUtils.getPlatformSDKVersion());
        hashMap.put("device_info", buildDeviceInfo(effectConfiguration.getContext()));
        return hashMap;
    }
}
