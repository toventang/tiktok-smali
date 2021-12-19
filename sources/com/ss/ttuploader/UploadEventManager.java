package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONArray;
import org.json.JSONObject;

public enum UploadEventManager {
    instance;
    
    private JSONArray mImageJsonArray = new JSONArray();
    private JSONArray mVideoJsonArray = new JSONArray();

    static {
        Covode.recordClassIndex(101412);
    }

    public final JSONArray popAllEvents() {
        MethodCollector.i(4351);
        JSONArray jSONArray = this.mVideoJsonArray;
        synchronized (UploadEventManager.class) {
            try {
                this.mVideoJsonArray = new JSONArray();
            } finally {
                MethodCollector.o(4351);
            }
        }
        return jSONArray;
    }

    public final JSONArray popAllImageEvents() {
        MethodCollector.i(4358);
        JSONArray jSONArray = this.mImageJsonArray;
        synchronized (UploadEventManager.class) {
            try {
                this.mImageJsonArray = new JSONArray();
            } finally {
                MethodCollector.o(4358);
            }
        }
        return jSONArray;
    }

    /* access modifiers changed from: protected */
    public final void addEvent(JSONObject jSONObject) {
        MethodCollector.i(4353);
        synchronized (UploadEventManager.class) {
            try {
                this.mVideoJsonArray.put(jSONObject);
            } finally {
                MethodCollector.o(4353);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void addImageEvent(JSONObject jSONObject) {
        MethodCollector.i(4360);
        synchronized (UploadEventManager.class) {
            try {
                this.mImageJsonArray.put(jSONObject);
            } finally {
                MethodCollector.o(4360);
            }
        }
    }

    private UploadEventManager() {
    }
}
