package com.ss.android.ugc.effectmanager.common.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.cache.EffectCacheManager;
import com.ss.android.ugc.effectmanager.common.cache.EffectDiskLruCache;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EffectUtils {
    static {
        Covode.recordClassIndex(95336);
    }

    public static String getUrl(ProviderEffect providerEffect) {
        if (providerEffect.getSticker() == null || providerEffect.getSticker().getUrl() == null) {
            return "";
        }
        return providerEffect.getSticker().getUrl();
    }

    public static boolean isEffectValid(Effect effect) {
        if (effect != null && !isUrlModelEmpty(effect.getFileUrl())) {
            return true;
        }
        return false;
    }

    public static boolean isUrlModelEmpty(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return true;
        }
        return false;
    }

    public static void throwIllegalNullException(String str) {
        throw new IllegalArgumentException(str + " should not null");
    }

    public static List<String> getUrl(UrlModel urlModel) {
        if (urlModel == null || isUrlModelEmpty(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrlList();
    }

    public static String toDiskLruCacheKey(String str) {
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c2 = charArray[i2];
            if (!(c2 == '_' || c2 == '-' || ((c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9')))) {
                charArray[i2] = '_';
            }
        }
        return new String(charArray);
    }

    public static boolean isRequirementsInvalid(Effect effect) {
        if (effect != null && !CollectionUtil.isListEmpty(effect.getRequirements_sec())) {
            int i2 = 0;
            for (String str : effect.getRequirements_sec()) {
                if (!TextUtils.isEmpty(str) && str.trim().length() > 0) {
                    i2++;
                }
            }
            int i3 = 0;
            for (String str2 : effect.getRequirements()) {
                if (!TextUtils.isEmpty(str2) && str2.trim().length() > 0) {
                    i3++;
                }
            }
            if (i2 == 0 || i3 == i2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static File convertStreamToFile(InputStream inputStream, String str) {
        return convertStreamToFile(inputStream, str, -1, null);
    }

    public static void setEffectRecId(String str, List<Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                if (!TextUtils.isEmpty(str)) {
                    effect.setRecId(str);
                }
            }
        }
    }

    private static List<String> appendUriForUrlPrefix(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next() + str);
        }
        return arrayList;
    }

    public static void setEffectPath(String str, List<Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                effect.setZipPath(str + File.separator + effect.getId() + ".zip");
                effect.setUnzipPath(str + File.separator + effect.getId());
            }
        }
    }

    public static void setUrlModel(List<String> list, List<Effect> list2) {
        if (list2 != null) {
            for (Effect effect : list2) {
                effect.getFileUrl().setUrlList(appendUriForUrlPrefix(list, effect.getFileUrl().getUri()));
                effect.getIconUrl().setUrlList(appendUriForUrlPrefix(list, effect.getIconUrl().getUri()));
                if (effect.getHintIcon().isValid()) {
                    effect.getHintIcon().setUrlList(appendUriForUrlPrefix(list, effect.getHintIcon().getUri()));
                }
            }
        }
    }

    public static void unZipEffect(Effect effect, MonitorTrace monitorTrace) {
        EPMonitor.traceStep(monitorTrace, "EffectUtils#unZipEffect::from " + effect.getZipPath() + " to " + effect.getUnzipPath());
        String addPathSuffix = FileUtils.INSTANCE.addPathSuffix(effect.getUnzipPath(), "_tmp");
        try {
            FileUtils.INSTANCE.removeDir(addPathSuffix);
            FileUtils.INSTANCE.unZip(effect.getZipPath(), addPathSuffix);
            FileUtils.INSTANCE.rename(addPathSuffix, effect.getUnzipPath(), true, true);
            FileUtils.INSTANCE.removeFile(effect.getZipPath());
            EPMonitor.traceStep(monitorTrace, "EffectUtils#unZipEffect::success!!");
        } catch (Exception e2) {
            EPLog.e("EffectUtils", "unzip effect fail without disklrucache: " + e2.getMessage());
            FileUtils.INSTANCE.removeDir(addPathSuffix);
            FileUtils.INSTANCE.removeDir(effect.getUnzipPath());
            EPMonitor.traceStep(monitorTrace, "EffectUtils#unZipEffect::failed, cause=" + e2.getMessage());
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0177 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void downloadEffect(com.ss.android.ugc.effectmanager.EffectConfiguration r14, com.ss.android.ugc.effectmanager.effect.model.Effect r15) {
        /*
        // Method dump skipped, instructions count: 428
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.EffectUtils.downloadEffect(com.ss.android.ugc.effectmanager.EffectConfiguration, com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    public static void download(EffectNetWorkerWrapper effectNetWorkerWrapper, String str, Effect effect) {
        download(effectNetWorkerWrapper, str, effect, null, null);
    }

    public static void setEffectField(String str, String str2, List<Effect> list) {
        setEffectField(str, str2, "", list);
    }

    public static void download(EffectConfiguration effectConfiguration, String str, Effect effect, MonitorTrace monitorTrace) {
        download(effectConfiguration.getEffectNetWorker(), str, effect, monitorTrace, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066 A[SYNTHETIC, Splitter:B:35:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070 A[SYNTHETIC, Splitter:B:40:0x0070] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File convertStreamToFile(java.io.InputStream r11, java.lang.String r12, long r13, com.ss.android.ugc.effectmanager.common.download.DownloadListener r15) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.EffectUtils.convertStreamToFile(java.io.InputStream, java.lang.String, long, com.ss.android.ugc.effectmanager.common.download.DownloadListener):java.io.File");
    }

    public static void setEffectField(String str, String str2, String str3, List<Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                effect.setZipPath(str + File.separator + effect.getId() + ".zip");
                effect.setUnzipPath(str + File.separator + effect.getId());
                effect.setPanel(str2);
                if (!TextUtils.isEmpty(str3)) {
                    effect.setRecId(str3);
                }
            }
        }
    }

    public static void download(EffectNetWorkerWrapper effectNetWorkerWrapper, String str, Effect effect, MonitorTrace monitorTrace, DownloadListener downloadListener) {
        try {
            EPMonitor.traceStep(monitorTrace, "EffectUtils#download::net request begin.");
            EffectRequest effectRequest = new EffectRequest("GET", str, false);
            InputStream execute = effectNetWorkerWrapper.execute(effectRequest);
            EPMonitor.traceStep(monitorTrace, "EffectUtils#download::net request success.");
            String parent = new File(effect.getZipPath()).getParent();
            EPMonitor.traceStep(monitorTrace, "EffectUtils#download::write disk begin.");
            if (EffectCacheManager.Companion.getInstance().getCache(parent) instanceof EffectDiskLruCache) {
                ((EffectDiskLruCache) EffectCacheManager.Companion.getInstance().getCache(parent)).writeEffectZipToDisk(effect, execute, effect.getFileUrl().getUri(), effectRequest.getContentLength(), downloadListener);
            } else {
                convertStreamToFile(execute, effect.getZipPath(), effectRequest.getContentLength(), downloadListener);
            }
            EPMonitor.traceStep(monitorTrace, "EffectUtils#download::write disk success.");
            CloseUtil.close(execute);
        } catch (IOException e2) {
            EPMonitor.traceStep(monitorTrace, "EffectUtils#download::fail cause::" + e2.getMessage());
            e2.printStackTrace();
            throw e2;
        } catch (Throwable th) {
            CloseUtil.close(null);
            throw th;
        }
    }
}
