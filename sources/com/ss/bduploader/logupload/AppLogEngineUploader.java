package com.ss.bduploader.logupload;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.bduploader.BDUploadLog;
import com.ss.bduploader.BDUploadUtil;
import com.ss.bduploader.UploadEventManager;
import com.ss.bduploader.net.BDUploadThreadPool;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLogEngineUploader implements VideoEventEngineUploader {
    static {
        Covode.recordClassIndex(100671);
    }

    public static int com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class Holder {
        public static final AppLogEngineUploader instance = new AppLogEngineUploader();

        private Holder() {
        }

        static {
            Covode.recordClassIndex(100673);
        }
    }

    private AppLogEngineUploader() {
    }

    public static AppLogEngineUploader getInstance() {
        return Holder.instance;
    }

    static void logPrint(final JSONObject jSONObject) {
        BDUploadThreadPool.addExecuteTask(new Runnable() {
            /* class com.ss.bduploader.logupload.AppLogEngineUploader.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100672);
            }

            public final void run() {
                if (jSONObject != null) {
                    BDUploadLog.i("ttmn", "++++++++++++++++");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            if (next != null) {
                                BDUploadLog.i("ttmn", "++++:" + next + ":" + jSONObject.get(next));
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    BDUploadLog.i("ttmn", "++++++++++++++++++++");
                }
            }
        });
    }

    @Override // com.ss.bduploader.logupload.VideoEventEngineUploader
    public void onEventV3(String str, JSONObject jSONObject) {
        com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_i("ttmn", "onEventV3 monitorName ".concat(String.valueOf(str)));
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            logPrint(jSONObject);
            if (BDUploadUtil.eventEngineUploader != null) {
                BDUploadUtil.eventEngineUploader.onEventV3(str, setJsonValue(jSONObject, "upload_log_type", "2"));
                return;
            }
            JSONObject jsonValue = setJsonValue(jSONObject, "upload_log_type", "1");
            try {
                Class.forName("com.ss.android.common.c.a").getMethod("a", String.class, JSONObject.class).invoke(null, str, jsonValue);
            } catch (Exception e2) {
                UploadEventManager.instance.putEvent(setJsonValue(jSONObject, "upload_log_type", "0"));
                e2.printStackTrace();
                com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "upload error ".concat(String.valueOf(e2)));
            }
        }
    }

    private JSONObject setJsonValue(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
            com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_d("ttmn", "key" + str + "value" + str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
