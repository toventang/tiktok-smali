package com.ss.android.socialbase.downloader.f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.socialbase.downloader.b.f;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.b;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.s;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.g.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(37387);
    }

    public static void a(DownloadTask downloadTask, BaseException baseException, int i2) {
        if (downloadTask != null) {
            try {
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo != null) {
                    w monitorDepend = downloadTask.getMonitorDepend();
                    if (f.b(i2) || a(downloadInfo.getExtraMonitorStatus(), i2) || (monitorDepend != null && (monitorDepend instanceof b) && a(((b) monitorDepend).a(), i2))) {
                        try {
                            IDownloadDepend depend = downloadTask.getDepend();
                            if (depend != null) {
                                depend.monitorLogSend(downloadInfo, baseException, i2);
                            }
                        } catch (Throwable unused) {
                        }
                        a(monitorDepend, downloadInfo, baseException, i2);
                        a(c.f60428c, downloadInfo, baseException, i2);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private static boolean a(int[] iArr, int i2) {
        if (iArr != null && iArr.length > 0) {
            for (int i3 : iArr) {
                if (i2 == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r23, int r24, com.ss.android.socialbase.downloader.i.a r25, com.ss.android.socialbase.downloader.model.DownloadInfo r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, com.ss.android.socialbase.downloader.g.i r30, boolean r31, boolean r32, com.ss.android.socialbase.downloader.exception.BaseException r33, long r34, long r36, boolean r38, long r39, long r41, long r43) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.f.a.a(java.lang.String, int, com.ss.android.socialbase.downloader.i.a, com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String, java.lang.String, com.ss.android.socialbase.downloader.g.i, boolean, boolean, com.ss.android.socialbase.downloader.exception.BaseException, long, long, boolean, long, long, long):void");
    }

    public static void a(com.ss.android.socialbase.downloader.i.a aVar, DownloadInfo downloadInfo, String str, String str2, String str3, boolean z, i iVar, BaseException baseException, long j2, long j3) {
        a("segment_io", aVar.a("monitor_segment_io", 0), aVar, downloadInfo, str, str2, str3, iVar, z, false, baseException, j2, j3, false, -1, -1, -1);
    }

    public static String a(String str) {
        try {
            if (TextUtils.isDigitsOnly(str)) {
                return String.valueOf(Long.valueOf(str).longValue() % 100);
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static void a(int i2, JSONObject jSONObject, DownloadInfo downloadInfo) {
        String str;
        if (i2 == -5) {
            str = "download_uncomplete";
        } else if (i2 == -4) {
            str = "download_cancel";
        } else if (i2 == -3) {
            double downloadSpeed = downloadInfo.getDownloadSpeed();
            if (downloadSpeed >= 0.0d) {
                jSONObject.put("download_speed", downloadSpeed);
            }
            str = "download_success";
        } else if (i2 == -2) {
            str = "download_pause";
        } else if (i2 == 0) {
            str = "download_create";
        } else if (i2 == 2) {
            str = "download_start";
        } else if (i2 != 6) {
            str = "";
        } else {
            str = "download_first_start";
        }
        jSONObject.put("status", str);
    }

    public static void a(w wVar, DownloadInfo downloadInfo, BaseException baseException, int i2) {
        if (wVar != null) {
            try {
                String eventPage = wVar.getEventPage();
                if (TextUtils.isEmpty(eventPage)) {
                    eventPage = "default";
                }
                JSONObject a2 = a(eventPage, downloadInfo, baseException, i2);
                if (a2 == null) {
                    a2 = new JSONObject();
                }
                wVar.monitorLogSend(a2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(b bVar, DownloadInfo downloadInfo, BaseException baseException, int i2) {
        if (bVar != null && downloadInfo.isNeedSDKMonitor() && !TextUtils.isEmpty(downloadInfo.getMonitorScene())) {
            try {
                JSONObject a2 = a(downloadInfo.getMonitorScene(), downloadInfo, baseException, i2);
                if (a2 == null) {
                    a2 = new JSONObject();
                }
                if (i2 == -1) {
                    a2.put("status", baseException.getErrorCode());
                    bVar.a("download_failed", a2, null, null);
                    return;
                }
                a(i2, a2, downloadInfo);
                bVar.a("download_common", a2, null, null);
            } catch (Throwable unused) {
            }
        }
    }

    private static JSONObject a(String str, DownloadInfo downloadInfo, BaseException baseException, int i2) {
        JSONException e2;
        String str2;
        String str3;
        String str4;
        int i3;
        String str5;
        int i4;
        int i5;
        int i6;
        String str6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str7;
        String str8;
        int i13;
        int i14;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                s f2 = c.f();
                int i15 = 0;
                String str14 = "";
                if (f2 != null) {
                    str3 = f2.b();
                    str4 = a(str3);
                    str2 = f2.a();
                    i3 = f2.c();
                } else {
                    str3 = str14;
                    str4 = str3;
                    str2 = str4;
                    i3 = 0;
                }
                if (baseException == null || !(baseException instanceof DownloadTTNetException)) {
                    str5 = str14;
                } else {
                    str5 = ((DownloadTTNetException) baseException).getRequestLog();
                }
                jSONObject2.put("event_page", str);
                jSONObject2.put("app_id", str2);
                jSONObject2.put("device_id", str3);
                jSONObject2.put("device_id_postfix", str4);
                jSONObject2.put("update_version", i3);
                jSONObject2.put("download_status", i2);
                if (downloadInfo != null) {
                    jSONObject2.put("setting_tag", com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), (DownloadInfo) null).a("setting_tag", str14));
                    jSONObject2.put("download_id", downloadInfo.getId());
                    jSONObject2.put(StringSet.name, downloadInfo.getName());
                    jSONObject2.put("url", downloadInfo.getUrl());
                    jSONObject2.put("save_path", downloadInfo.getSavePath());
                    jSONObject2.put("download_time", downloadInfo.getDownloadTime());
                    jSONObject2.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject2.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject2.put("network_quality", downloadInfo.getNetworkQuality());
                    int i16 = 1;
                    if (downloadInfo.isOnlyWifi()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    jSONObject2.put("only_wifi", i4);
                    if (downloadInfo.isNeedHttpsToHttpRetry()) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jSONObject2.put("need_https_degrade", i5);
                    if (downloadInfo.isHttpsToHttpRetryUsed()) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    jSONObject2.put("https_degrade_retry_used", i6);
                    if (downloadInfo.getMd5() == null) {
                        str6 = str14;
                    } else {
                        str6 = downloadInfo.getMd5();
                    }
                    jSONObject2.put("md5", str6);
                    jSONObject2.put("chunk_count", downloadInfo.getChunkCount());
                    if (downloadInfo.isForce()) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    jSONObject2.put("is_force", i7);
                    jSONObject2.put("retry_count", downloadInfo.getRetryCount());
                    jSONObject2.put("cur_retry_time", downloadInfo.getCurRetryTime());
                    if (downloadInfo.isNeedRetryDelay()) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    jSONObject2.put("need_retry_delay", i8);
                    if (downloadInfo.isNeedReuseFirstConnection()) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    jSONObject2.put("need_reuse_first_connection", i9);
                    if (downloadInfo.isNeedDefaultHttpServiceBackUp()) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    jSONObject2.put("default_http_service_backup", i10);
                    jSONObject2.put("retry_delay_status", downloadInfo.getRetryDelayStatus().ordinal());
                    if (downloadInfo.isBackUpUrlUsed()) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    jSONObject2.put("backup_url_used", i11);
                    jSONObject2.put("download_byte_error_retry_status", downloadInfo.getByteInvalidRetryStatus().ordinal());
                    jSONObject2.put("forbidden_handler_status", downloadInfo.getAsyncHandleStatus().ordinal());
                    if (downloadInfo.isNeedIndependentProcess()) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    jSONObject2.put("need_independent_process", i12);
                    if (downloadInfo.getHeadConnectionException() != null) {
                        str7 = downloadInfo.getHeadConnectionException();
                    } else {
                        str7 = str14;
                    }
                    jSONObject2.put("head_connection_error_msg", str7);
                    if (downloadInfo.getExtra() != null) {
                        str8 = downloadInfo.getExtra();
                    } else {
                        str8 = str14;
                    }
                    jSONObject2.put("extra", str8);
                    if (!downloadInfo.isAddListenerToSameTask()) {
                        i16 = 0;
                    }
                    jSONObject2.put("add_listener_to_same_task", i16);
                    if (downloadInfo.getBackUpUrls() != null) {
                        i13 = downloadInfo.getBackUpUrls().size();
                    } else {
                        i13 = 0;
                    }
                    jSONObject2.put("backup_url_count", i13);
                    if (downloadInfo.getBackUpUrls() != null) {
                        i14 = downloadInfo.getCurBackUpUrlIndex();
                    } else {
                        i14 = -1;
                    }
                    jSONObject2.put("cur_backup_url_index", i14);
                    if (downloadInfo.getForbiddenBackupUrls() != null) {
                        str9 = downloadInfo.getForbiddenBackupUrls().toString();
                    } else {
                        str9 = str14;
                    }
                    jSONObject2.put("forbidden_urls", str9);
                    if (TextUtils.isEmpty(downloadInfo.getTaskId())) {
                        str10 = str14;
                    } else {
                        str10 = downloadInfo.getTaskId();
                    }
                    jSONObject2.put("task_id", str10);
                    try {
                        String url = downloadInfo.getUrl();
                        if (!TextUtils.isEmpty(url)) {
                            Uri parse = Uri.parse(url);
                            str11 = parse.getHost();
                            str12 = parse.getPath();
                            str13 = parse.getLastPathSegment();
                            if (!TextUtils.isEmpty(str12) && !TextUtils.isEmpty(str13)) {
                                try {
                                    str12 = str12.substring(0, str12.length() - str13.length());
                                } catch (Throwable unused) {
                                }
                            }
                        } else {
                            str13 = str14;
                            str11 = str13;
                            str12 = str11;
                        }
                        jSONObject2.put("url_host", str11);
                        jSONObject2.put("url_path", str12);
                        jSONObject2.put("url_last_path_segment", str13);
                    } catch (Throwable unused2) {
                    }
                }
                if (baseException != null) {
                    i15 = baseException.getErrorCode();
                }
                jSONObject2.put("error_code", i15);
                if (baseException != null) {
                    str14 = baseException.getErrorMessage();
                }
                jSONObject2.put("error_msg", str14);
                jSONObject2.put("request_log", str5);
                return jSONObject2;
            } catch (JSONException e3) {
                e2 = e3;
                jSONObject = jSONObject2;
                e2.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e4) {
            e2 = e4;
            e2.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[Catch:{ all -> 0x012c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.ss.android.socialbase.downloader.g.g r13, java.lang.String r14, java.lang.String r15, long r16, java.lang.String r18, int r19, java.io.IOException r20, com.ss.android.socialbase.downloader.model.DownloadInfo r21) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.f.a.a(com.ss.android.socialbase.downloader.g.g, java.lang.String, java.lang.String, long, java.lang.String, int, java.io.IOException, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static void a(com.ss.android.socialbase.downloader.i.a aVar, DownloadInfo downloadInfo, String str, i iVar, boolean z, boolean z2, BaseException baseException, long j2, long j3, boolean z3, long j4, long j5, long j6) {
        a("download_io", aVar.a("monitor_download_io", 0), aVar, downloadInfo, str, null, null, iVar, z, z2, baseException, j2, j3, z3, j4, j5, j6);
    }
}
