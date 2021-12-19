package com.ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import b.j;
import c.b.a;
import c.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.e;
import com.bytedance.ies.abmock.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.bduploader.BDObjectInfo;
import com.ss.bduploader.BDObjectUploader;
import com.ss.bduploader.BDObjectUploaderListener;
import com.ss.ttuploader.TTVideoInfo;
import com.ss.ttuploader.TTVideoUploader;
import com.ss.ttuploader.TTVideoUploaderListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedbackUploadALog extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    private final String f144925a = "y+6T0b/qfIqkZDbYHfFiN/8XI5fyqrwX5d2WZ2NN3w==";

    /* renamed from: b  reason: collision with root package name */
    private final String f144926b = "y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=";

    static {
        Covode.recordClassIndex(94767);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private static boolean d() {
        return SettingsManager.a().a("abclone2_feedback", false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String c() {
        MethodCollector.i(3394);
        if (d()) {
            Map<String, ConfigItem> map = f.f31846a;
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                e.a();
                Object b2 = e.b(str, true);
                ConfigItem configItem = map.get(str);
                if (configItem != null) {
                    jSONObject.put("abKey", str);
                    jSONObject.put("filedTypedName", configItem.type.toString());
                    if (b2 == null || b2.equals("null")) {
                        jSONObject.put("value", "null");
                    } else {
                        jSONObject.put("value", b2.toString());
                    }
                    jSONArray.put(jSONObject);
                }
            }
            String jSONArray2 = jSONArray.toString();
            try {
                a aVar = new a("y+6T0b/qfIqkZDbYHfFiN/8XI5fyqrwX5d2WZ2NN3w==");
                if (!aVar.exists()) {
                    aVar.mkdir();
                }
                c cVar = new c("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=");
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(cVar));
                bufferedWriter.write(jSONArray2);
                bufferedWriter.close();
                cVar.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            IExternalUploaderService externalUploaderService = AVExternalServiceImpl.a().externalUploaderService();
            final j jVar = new j();
            String sdkV4AuthKey = externalUploaderService.getSdkV4AuthKey();
            if (TextUtils.isEmpty(sdkV4AuthKey)) {
                externalUploaderService.cacheUploadAuthKeyConfig();
                jVar.b("Failed Upload Config: NO sdkV4AuthKey");
            } else {
                ExternalUploadVideoConfig uploadVideoConfig = externalUploaderService.getUploadVideoConfig(sdkV4AuthKey);
                if (externalUploaderService.uploaderUpdateEnable()) {
                    final BDObjectUploader bDObjectUploader = new BDObjectUploader();
                    bDObjectUploader.setListener(new BDObjectUploaderListener() {
                        /* class com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(94768);
                        }

                        @Override // com.ss.bduploader.BDObjectUploaderListener
                        public final int objectUploadCheckNetState(int i2, int i3) {
                            return 0;
                        }

                        @Override // com.ss.bduploader.BDObjectUploaderListener
                        public final void onLog(int i2, int i3, String str) {
                            com.a.a("uploadABFileWithBDUploader onNotify what: %d, code: %d, info: %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str});
                        }

                        @Override // com.ss.bduploader.BDObjectUploaderListener
                        public final void onNotify(int i2, long j2, BDObjectInfo bDObjectInfo) {
                            com.a.a("uploadABFileWithBDUploader onNotify what: %d, parameter: %d, info: %s", new Object[]{Integer.valueOf(i2), Long.valueOf(j2), bDObjectInfo});
                            if (i2 == 6) {
                                jVar.b(bDObjectInfo.mImageTosKey);
                                bDObjectUploader.close();
                            } else if (i2 == 7) {
                                jVar.b("failed");
                                bDObjectUploader.close();
                            }
                        }
                    });
                    bDObjectUploader.setTopAccessKey(uploadVideoConfig.getTopAccessKey());
                    bDObjectUploader.setTopSecretKey(uploadVideoConfig.getTopSecretKey());
                    bDObjectUploader.setTopSessionToken(uploadVideoConfig.getTopSessionToken());
                    bDObjectUploader.setSpaceName(uploadVideoConfig.getSpaceName());
                    bDObjectUploader.setUploadDomain(uploadVideoConfig.getVideoHostName());
                    bDObjectUploader.setSliceSize(uploadVideoConfig.getSliceSize());
                    bDObjectUploader.setSocketNum(1);
                    bDObjectUploader.setSliceRetryCount(1);
                    bDObjectUploader.setFileRetryCount(1);
                    bDObjectUploader.setFilePath(1, new String[]{new a("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=").getAbsolutePath()});
                    bDObjectUploader.setNetworkType(403, externalUploaderService.getUploadMainNetworkType());
                    bDObjectUploader.setNetworkType(404, externalUploaderService.getUploadBackupNetworkType());
                    bDObjectUploader.start();
                } else {
                    final TTVideoUploader tTVideoUploader = new TTVideoUploader(3);
                    tTVideoUploader.setListener(new TTVideoUploaderListener() {
                        /* class com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(94769);
                        }

                        @Override // com.ss.ttuploader.TTVideoUploaderListener
                        public final String getStringFromExtern(int i2) {
                            return null;
                        }

                        @Override // com.ss.ttuploader.TTVideoUploaderListener
                        public final void onLog(int i2, int i3, String str) {
                        }

                        @Override // com.ss.ttuploader.TTVideoUploaderListener
                        public final void onUploadVideoStage(int i2, long j2) {
                        }

                        @Override // com.ss.ttuploader.TTVideoUploaderListener
                        public final int videoUploadCheckNetState(int i2, int i3) {
                            return 0;
                        }

                        @Override // com.ss.ttuploader.TTVideoUploaderListener
                        public final void onNotify(int i2, long j2, TTVideoInfo tTVideoInfo) {
                            if (i2 == 0) {
                                jVar.b(tTVideoInfo.mTosKey);
                                tTVideoUploader.close();
                            } else if (i2 == 2) {
                                jVar.b("failed");
                                tTVideoUploader.close();
                            }
                        }
                    });
                    tTVideoUploader.setMaxFailTime(uploadVideoConfig.getMaxFailTime());
                    tTVideoUploader.setSliceSize(uploadVideoConfig.getSliceSize());
                    tTVideoUploader.setFileUploadDomain(uploadVideoConfig.getFileHostName());
                    tTVideoUploader.setVideoUploadDomain(uploadVideoConfig.getVideoHostName());
                    tTVideoUploader.setSliceTimeout(uploadVideoConfig.getSliceTimeout());
                    tTVideoUploader.setPathName(new a("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=").getAbsolutePath());
                    tTVideoUploader.setFileRetryCount(1);
                    tTVideoUploader.setUserKey(uploadVideoConfig.getAppKey());
                    tTVideoUploader.setAuthorization(uploadVideoConfig.getAuthorization());
                    tTVideoUploader.setSocketNum(1);
                    tTVideoUploader.start();
                }
            }
            b.i<TResult> iVar = jVar.f4869a;
            iVar.a(10, TimeUnit.SECONDS);
            TResult d2 = iVar.d();
            MethodCollector.o(3394);
            return d2;
        }
        MethodCollector.o(3394);
        return "null";
    }

    public FeedbackUploadALog(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    private static void a(JSONObject jSONObject) {
        if (RuntimeBehaviorServiceImpl.c().a()) {
            for (Map.Entry<String, String> entry : RuntimeBehaviorServiceImpl.c().b().entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_from_h5", "true");
            String[] disableUploadRegion = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getFeedbackConf().getDisableUploadRegion();
            if (!(disableUploadRegion == null || disableUploadRegion.length == 0)) {
                jSONObject.put("disable_upload_region", dg.a().b(disableUploadRegion));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        a(jSONObject);
        String a2 = eq.a();
        if (d() && !TextUtils.isEmpty(str) && !"null".equals(str)) {
            try {
                jSONObject.put("abnor_abclone", str);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(a2)) {
            try {
                jSONObject.put("logout_info", a2);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        b.i.b(new o(this), b.i.f4824a).a(new p(this), b.i.f4824a, null).a(new q(aVar), b.i.f4826c, null);
        com.ss.android.ugc.aweme.f.a.a.a();
    }
}
