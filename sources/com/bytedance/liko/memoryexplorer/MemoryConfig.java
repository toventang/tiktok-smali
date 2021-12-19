package com.bytedance.liko.memoryexplorer;

import com.bytedance.covode.number.Covode;
import com.bytedance.liko.memoryexplorer.analyse.trace.AndroidExcludeRefs;
import com.bytedance.liko.memoryexplorer.analyse.trace.ExcludedRefs;
import com.bytedance.liko.memoryexplorer.android.AndroidOS;
import com.kakao.usermgmt.StringSet;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.mat.json.JSONArray;
import org.eclipse.mat.json.JSONException;
import org.eclipse.mat.json.JSONObject;

public class MemoryConfig {
    private static MemoryConfig sConfig = null;
    private static JSONObject sJsonConfig = new JSONObject();
    public String SERVERURL;
    public String SERVERURL_SUFFIX = "monitor/collect/c/exception";
    public final String adbPath;
    public int aid;
    public final String app_version;
    public final boolean bigObjectFilterSystem;
    public final int bigObjectLatitude;
    public final long bitmapLatitude;
    public final int bitmapMinSize;
    public final String channel;
    public final boolean deleteDumpFile;
    public final List<String> detectedClasses;
    public final String device_brand;
    public final String device_id;
    public final String device_manufacturer;
    public final String device_model;
    public final String dumpFilePath;
    final int dumpHprofWaitTime;
    final boolean dumpSelf;
    final boolean enableMonkey;
    public final String env;
    public ExcludedRefs excludedRefs;
    public final String mainActivity;
    public final String mappingFilePath;
    public final String monkeyCommand;
    public final boolean objectInstanceFilterSystem;
    public final int objectInstanceLatitude;
    public final int os_api;
    public final String os_version;
    public boolean oversea;
    public final String packageName;
    final int pullHprofWaitTime;
    public final String region;
    public final String release_build;
    public int strategy;
    public final boolean supportBigObjectAnalysis;
    public final boolean supportBitmapAnalysis;
    public final boolean supportObjectInstanceAnalysis;
    public final String update_versioncode;
    public final boolean uploadToSlardar;
    public final String versionName;
    public int versioncode;

    public JSONObject getJsonConfig() {
        return sJsonConfig;
    }

    static {
        Covode.recordClassIndex(24739);
    }

    public static MemoryConfig getMemoryConfig() {
        if (sConfig == null) {
            sConfig = new MemoryConfig(sJsonConfig);
        }
        return sConfig;
    }

    /* access modifiers changed from: package-private */
    public boolean canRunMonkey() {
        String str = this.monkeyCommand;
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public static MemoryConfig changeMemoryConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            sJsonConfig = jSONObject;
            sConfig = new MemoryConfig(sJsonConfig);
        }
        return sConfig;
    }

    public static void initJsonConfig(String str) {
        try {
            sJsonConfig = new JSONObject(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void buildExcludeRefs(JSONArray jSONArray) {
        ExcludedRefs.Builder builder = new ExcludedRefs.Builder();
        builder.thread("FinalizerWatchdogDaemon");
        builder.thread("main");
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                parseExcludeRef(builder, jSONArray.optJSONObject(i2));
            }
        }
        AndroidExcludeRefs.buildSystemExcludeRefs(builder);
        this.excludedRefs = builder.build();
    }

    private MemoryConfig(JSONObject jSONObject) {
        LinkedList linkedList = new LinkedList();
        this.detectedClasses = linkedList;
        this.excludedRefs = null;
        this.oversea = jSONObject.optBoolean("oversea", false);
        this.env = jSONObject.optString("env", "prod");
        String optString = jSONObject.optString("url");
        if (this.oversea) {
            this.SERVERURL = optString + this.SERVERURL_SUFFIX;
        } else {
            this.SERVERURL = optString + this.SERVERURL_SUFFIX;
        }
        this.adbPath = jSONObject.optString("adbPath");
        this.mappingFilePath = jSONObject.optString("mappingFilePath", "");
        this.strategy = jSONObject.optInt("strategy", 0);
        this.aid = jSONObject.optInt("aid", 1180);
        this.channel = jSONObject.optString("channel", "local_test");
        this.device_id = jSONObject.optString("device_id", "");
        this.app_version = jSONObject.optString("app_version", "");
        this.update_versioncode = jSONObject.optString("update_version_code", "");
        this.packageName = jSONObject.optString("process_name", "com.ss.android.ugc.trill");
        this.versionName = jSONObject.optString("version_name", "9.8");
        this.versioncode = jSONObject.optInt("version_code", 9700);
        this.region = jSONObject.optString("region", "feizhou");
        this.mainActivity = jSONObject.optString("mainActivity");
        this.monkeyCommand = jSONObject.optString("monkeyCommand");
        this.dumpSelf = jSONObject.optBoolean("dumpSelf", false);
        this.uploadToSlardar = jSONObject.optBoolean("uploadToSlardar", true);
        this.dumpHprofWaitTime = jSONObject.optInt("dump_hprof_wait_time", 20);
        this.pullHprofWaitTime = jSONObject.optInt("pull_hprof_wait_time", 60);
        this.enableMonkey = jSONObject.optBoolean("enableMonkey", false);
        this.dumpFilePath = jSONObject.optString("dumpFilePath", "");
        this.deleteDumpFile = jSONObject.optBoolean("delete_dump_file", false);
        this.os_version = jSONObject.optString("os_version", AndroidOS.RELEASE);
        this.os_api = jSONObject.optInt("os_api", AndroidOS.SDK_INT);
        this.device_model = jSONObject.optString("device_model", AndroidOS.MODEL);
        this.device_brand = jSONObject.optString("device_brand", AndroidOS.MANUFACTURER);
        this.device_manufacturer = jSONObject.optString("device_manufacturer", AndroidOS.MANUFACTURER);
        this.supportBigObjectAnalysis = jSONObject.optBoolean("supportBigObjectAnalysis", true);
        this.bigObjectFilterSystem = jSONObject.optBoolean("bigObjectFilterSystem", true);
        this.bigObjectLatitude = jSONObject.optInt("bigObjectLatitude", 3);
        this.supportObjectInstanceAnalysis = jSONObject.optBoolean("supportObjectInstanceAnalysis", true);
        this.objectInstanceFilterSystem = jSONObject.optBoolean("objectInstanceFilterSystem", true);
        this.objectInstanceLatitude = jSONObject.optInt("objectInstanceLatitude", 10);
        this.supportBitmapAnalysis = jSONObject.optBoolean("supportBitmapAnalysis", true);
        this.bitmapLatitude = jSONObject.optLong("bitmapLatitude", 204800);
        JSONArray optJSONArray = jSONObject.optJSONArray("detect_leak_classes");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                this.detectedClasses.add(optJSONArray.optString(i2));
            }
        } else {
            linkedList.add("android.app.Activity");
            linkedList.add("android.app.Fragment");
            linkedList.add("androidx.fragment.app.Fragment");
        }
        this.bitmapMinSize = jSONObject.optInt("bitmapMinSize", 500);
        this.release_build = jSONObject.optString("release_build", "");
        buildExcludeRefs(jSONObject.optJSONArray("excludedRefs"));
    }

    private static void parseExcludeRef(ExcludedRefs.Builder builder, JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("class");
            String optString2 = jSONObject.optString(StringSet.type);
            JSONArray optJSONArray = jSONObject.optJSONArray("fields");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString3 = optJSONArray.optString(i2);
                    if ("static".equalsIgnoreCase(optString2)) {
                        builder.staticField(optString, optString3);
                    } else {
                        builder.instanceField(optString, optString3);
                    }
                }
            }
        }
    }
}
