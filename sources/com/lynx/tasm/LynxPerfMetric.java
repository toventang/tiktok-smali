package com.lynx.tasm;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class LynxPerfMetric {
    private static String[] PERF_POINTS = {"tasm_binary_decode", "tasm_end_decode_finish_load_template", "tasm_finish_load_template", "diff_root_create", "js_finish_load_core", "js_finish_load_app", "js_and_tasm_all_ready", "tti", "js_runtime_type", "corejs_size", "source_js_size", "first_page_layout", "FIRST_SEP", "layout", "BOTH_SEP", "render_page", "diff_same_root", "UPDATE_SEP"};
    private static String[] PERF_STAMP_POINTS = {"init_start", "init_end", "load_template_start", "load_template_end", "decode_binary_start", "decode_binary_end", "render_template_start", "render_template_end", "diff_root_start", "diff_root_end", "layout_start", "layout_end", "load_corejs_start", "load_corejs_end", "load_appjs_start", "load_appjs_end", "start_diff", "end_diff", "update_page_start", "update_page_end"};
    private double corejs_size;
    private double diff_root_create;
    private double diff_same_root;
    private double first_page_layout;
    private double js_and_tasm_all_ready;
    private double js_finish_load_app;
    private double js_finish_load_core;
    private double js_runtime_type;
    private double layout;
    private h mConfig;
    private boolean mIsColdBoot;
    private final HashMap<String, Double> mMetricMap;
    private final HashMap<String, Object> mMetricTimingMap;
    private double render_page;
    private double source_js_size;
    private double tasm_binary_decode;
    private double tasm_end_decode_finish_load_template;
    private double tasm_finish_load_template;
    private double tti;
    private String url;

    public final h getConfigInfo() {
        return this.mConfig;
    }

    public final double getCoreJSSize() {
        return this.corejs_size;
    }

    public final double getDiffRootCreate() {
        return this.diff_root_create;
    }

    public final double getDiffSameRoot() {
        return this.diff_same_root;
    }

    public final double getFirsPageLayout() {
        return this.first_page_layout;
    }

    public final double getJsAndTasmAllReady() {
        return this.js_and_tasm_all_ready;
    }

    public final double getJsFinishLoadApp() {
        return this.js_finish_load_app;
    }

    public final double getJsFinishLoadCore() {
        return this.js_finish_load_core;
    }

    public final double getJsRuntimeType() {
        return this.js_runtime_type;
    }

    public final double getLayout() {
        return this.layout;
    }

    public final double getRenderPage() {
        return this.render_page;
    }

    public final double getTasmBinaryDecode() {
        return this.tasm_binary_decode;
    }

    public final double getTasmEndDecodeFinishLoadTemplate() {
        return this.tasm_end_decode_finish_load_template;
    }

    public final double getTasmFinishLoadTemplate() {
        return this.tasm_finish_load_template;
    }

    public final double getTti() {
        return this.tti;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject(this.mMetricMap);
        try {
            String str = this.url;
            if (str != null) {
                jSONObject.put("url", str);
                jSONObject.put("cold_boot", this.mIsColdBoot);
            }
            h hVar = this.mConfig;
            if (hVar != null) {
                jSONObject.put("page_type", hVar.f56624b);
                jSONObject.put("react_version", this.mConfig.f56633k);
            }
            if (this.mMetricTimingMap.size() > 0) {
                jSONObject.put("timing", new JSONObject(this.mMetricTimingMap));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "LynxPerfMetric" + this.mMetricMap + "\nurl=" + this.url + "\npage_type=" + this.mConfig.f56624b + "\nreact_version=" + this.mConfig.f56633k;
    }

    static {
        Covode.recordClassIndex(34783);
    }

    /* access modifiers changed from: package-private */
    public final void setIsColdBoot(boolean z) {
        this.mIsColdBoot = z;
    }

    private void convert(ReadableMap readableMap) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            fillIn(Integer.parseInt(nextKey), readableMap.getDouble(nextKey));
        }
    }

    private void convertTiming(ReadableMap readableMap) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.mMetricTimingMap.put(PERF_STAMP_POINTS[Integer.parseInt(nextKey)], readableMap.getString(nextKey));
        }
    }

    /* access modifiers changed from: package-private */
    public final void correctFirstPageLayout(long j2) {
        Object obj = this.mMetricTimingMap.get("load_template_start");
        if ((obj instanceof String) && j2 != 0) {
            try {
                long longValue = j2 - Long.valueOf((String) obj).longValue();
                if (longValue > 0) {
                    double d2 = (double) longValue;
                    if (d2 < this.first_page_layout) {
                        this.first_page_layout = d2;
                        this.mMetricMap.put("first_page_layout", Double.valueOf(d2));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setInitTiming(long j2, long j3) {
        this.mMetricTimingMap.put("init_start", Long.valueOf(j2));
        this.mMetricTimingMap.put("init_end", Long.valueOf(j3));
    }

    private void fillIn(int i2, double d2) {
        switch (i2) {
            case 0:
                this.tasm_binary_decode = d2;
                break;
            case 1:
                this.tasm_end_decode_finish_load_template = d2;
                break;
            case 2:
                this.tasm_finish_load_template = d2;
                break;
            case 3:
                this.diff_root_create = d2;
                break;
            case 4:
                this.js_finish_load_core = d2;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                this.js_finish_load_app = d2;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.js_and_tasm_all_ready = d2;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                this.tti = d2;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                this.js_runtime_type = d2;
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                this.corejs_size = d2;
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                this.source_js_size = d2;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                this.first_page_layout = d2;
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            default:
                LLog.a(6, "lynx_LynxPerfMetric", "no such perf key=".concat(String.valueOf(i2)));
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                this.layout = d2;
                break;
            case 15:
                this.render_page = d2;
                break;
            case 16:
                this.diff_same_root = d2;
                break;
        }
        this.mMetricMap.put(PERF_POINTS[i2], Double.valueOf(d2));
    }

    public LynxPerfMetric(ReadableMap readableMap, ReadableMap readableMap2, String str, h hVar) {
        this.url = str;
        this.mConfig = hVar;
        this.mMetricMap = new HashMap<>(readableMap.size());
        this.mMetricTimingMap = new HashMap<>(readableMap2.size());
        convert(readableMap);
        convertTiming(readableMap2);
    }
}
