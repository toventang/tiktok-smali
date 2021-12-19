package com.bytedance.geckox.model;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.statistic.model.d;
import com.google.gson.a.c;
import java.util.List;
import org.json.JSONObject;

public class UpdatePackage {
    @c(a = "access_key")
    private String accessKey;
    private String apiVersion;
    @c(a = "channel")
    private String channel;
    @c(a = "channel_index")
    private int channelIndex;
    @c(a = "content")
    private Content content;
    @c(a = "from")
    private List<String> from;
    @c(a = "group_name")
    private String groupName;
    @c(a = "is_zstd")
    private boolean isZstd;
    private boolean isZstdFallback;
    private long localVersion;
    private long localVersionOld;
    private String logId;
    private int notUsePatchReason;
    @c(a = "package_type")
    private int packageType;
    private d statisticModel;
    private boolean updateWithPatch;
    private boolean usePatched;
    @c(a = "package_version")
    private long version;

    public static final class FileType {
        static {
            Covode.recordClassIndex(17380);
        }
    }

    static {
        Covode.recordClassIndex(17377);
    }

    public static class Content {
        @c(a = "package")
        public Package fullPackage;
        @c(a = "patch")
        public Package patch;
        @c(a = "strategies")
        public Strategy strategy;

        static {
            Covode.recordClassIndex(17378);
        }

        public Strategy getStrategy() {
            return this.strategy;
        }
    }

    /* access modifiers changed from: package-private */
    public static class Fallback {
        @c(a = "md5")
        String md5;
        @c(a = "url_list")
        List<String> urlList;

        static {
            Covode.recordClassIndex(17379);
        }

        private Fallback() {
        }

        public String getMd5() {
            return this.md5;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }
    }

    public static class Package {
        @c(a = "decompress_md5")
        String decompressMd5;
        @c(a = "fallback")
        Fallback fallback;
        @c(a = "id")
        long id;
        @c(a = "size")
        long length;
        @c(a = "md5")
        String md5;
        String url;
        @c(a = "url_list")
        List<String> urlList;

        static {
            Covode.recordClassIndex(17381);
        }

        public Package() {
        }

        public String getDecompressMd5() {
            return this.decompressMd5;
        }

        public Fallback getFallback() {
            return this.fallback;
        }

        public long getId() {
            return this.id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public String toString() {
            return "Package{url='" + this.url + '\'' + ", md5='" + this.md5 + '\'' + '}';
        }

        public void setId(int i2) {
            this.id = (long) i2;
        }

        public void setLength(long j2) {
            this.length = j2;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public Package(int i2, List<String> list, String str) {
            this.id = (long) i2;
            this.urlList = list;
            this.md5 = str;
        }
    }

    public static class Strategy {
        @c(a = "del_if_download_failed")
        private int deleteIfFail;
        @c(a = "del_old_pkg_before_download")
        private int deleteOldPackageBeforeDownload;
        @c(a = "need_unzip")
        private int needUnzip;

        static {
            Covode.recordClassIndex(17382);
        }

        public int getDeleteIfFail() {
            return this.deleteIfFail;
        }

        public int getDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public int getNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(int i2) {
            this.deleteIfFail = i2;
        }

        public void setDeleteOldPackageBeforeDownload(int i2) {
            this.deleteOldPackageBeforeDownload = i2;
        }

        public void setNeedUnzip(int i2) {
            this.needUnzip = i2;
        }
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Content getContent() {
        return this.content;
    }

    public List<String> getFrom() {
        return this.from;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public boolean getIsZstd() {
        return this.isZstd;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public d getStatisticModel() {
        return this.statisticModel;
    }

    public boolean getUpdateWithPatch() {
        return this.updateWithPatch;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean getZstdFallback() {
        return this.isZstdFallback;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public UpdatePackage() {
        this.content = new Content();
        this.groupName = "default";
    }

    public Package getPackage() {
        if (this.updateWithPatch) {
            return this.content.patch;
        }
        return this.content.fullPackage;
    }

    public boolean hasFallback() {
        if (this.content.fullPackage.fallback != null) {
            return true;
        }
        return false;
    }

    public boolean isFullUpdate() {
        if (getFullPackage() == null || getFullPackage().getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isLastStep() {
        if (this.isZstdFallback) {
            return true;
        }
        if (!isPatchUpdate() && !hasFallback()) {
            return true;
        }
        return false;
    }

    public boolean isPatchUpdate() {
        if (getPatch() == null || getPatch().getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return a.a("ak:%s, channel:%s, version:%d, packageType:%d, isZstd:%b, updateWithPatch:%b", new Object[]{this.accessKey, this.channel, Long.valueOf(this.version), Integer.valueOf(this.packageType), Boolean.valueOf(this.isZstd), Boolean.valueOf(this.updateWithPatch)});
    }

    public UpdatePackage fallbackInstance() {
        UpdatePackage updatePackage = new UpdatePackage();
        updatePackage.groupName = this.groupName;
        updatePackage.channelIndex = this.channelIndex;
        updatePackage.version = this.version;
        updatePackage.channel = this.channel;
        updatePackage.accessKey = this.accessKey;
        updatePackage.from = this.from;
        updatePackage.packageType = this.packageType;
        updatePackage.statisticModel = this.statisticModel;
        updatePackage.apiVersion = this.apiVersion;
        updatePackage.logId = this.logId;
        updatePackage.localVersion = this.localVersion;
        updatePackage.localVersionOld = this.localVersionOld;
        updatePackage.notUsePatchReason = this.notUsePatchReason;
        updatePackage.usePatched = this.usePatched;
        updatePackage.isZstd = false;
        updatePackage.isZstdFallback = true;
        Content content2 = new Content();
        updatePackage.content = content2;
        content2.strategy = this.content.strategy;
        Package r3 = this.content.fullPackage;
        Package r2 = new Package();
        r2.id = r3.id;
        r2.urlList = r3.fallback.urlList;
        r2.md5 = r3.fallback.md5;
        updatePackage.content.fullPackage = r2;
        return updatePackage;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setApiVersion(String str) {
        this.apiVersion = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i2) {
        this.channelIndex = i2;
    }

    public void setContent(Content content2) {
        this.content = content2;
    }

    public void setFrom(List<String> list) {
        this.from = list;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j2) {
        this.localVersion = j2;
    }

    public void setLocalVersionOld(long j2) {
        this.localVersionOld = j2;
    }

    public void setLogId(String str) {
        this.logId = str;
    }

    public void setNotUsePatchReason(int i2) {
        this.notUsePatchReason = i2;
    }

    public void setPackageType(int i2) {
        this.packageType = i2;
    }

    public void setStatisticModel(d dVar) {
        this.statisticModel = dVar;
    }

    public void setVersion(long j2) {
        this.version = j2;
    }

    public void setZstdFallback(boolean z) {
        this.isZstdFallback = z;
    }

    public void setFullPackage(Package r2) {
        this.content.fullPackage = r2;
    }

    public void setPatch(Package r2) {
        this.content.patch = r2;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setUpdateWithPatch(boolean z) {
        this.updateWithPatch = z;
        if (z) {
            this.usePatched = true;
        }
    }

    public void putStatisticModelToJson(JSONObject jSONObject) {
        int i2;
        jSONObject.put("access_key", this.accessKey);
        jSONObject.put("group_name", this.groupName);
        jSONObject.put("channel", this.channel);
        jSONObject.put("id", getFullPackage().getId());
        if (this.isZstd || this.isZstdFallback) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        jSONObject.put("is_zstd", i2);
        jSONObject.put("api_version", this.apiVersion);
        if (!TextUtils.isEmpty(this.logId)) {
            jSONObject.put("x_tt_logid", this.logId);
        }
        long j2 = this.localVersion;
        if (j2 != 0) {
            jSONObject.put("local_version", j2);
        }
        if (getPatch() != null) {
            jSONObject.put("patch_id", getPatch().getId());
        }
        long j3 = this.localVersionOld;
        if (j3 != 0) {
            jSONObject.put("local_version_old", j3);
        }
        d dVar = this.statisticModel;
        if (dVar != null) {
            jSONObject.put("req_type", dVar.f30099b);
            jSONObject.put("update_priority", dVar.f30098a);
            jSONObject.put("update_result", !dVar.f30101d ? 1 : 0);
            if (dVar.f30100c != 0) {
                jSONObject.put("sync_task_id", dVar.f30100c);
            }
            if (dVar.f30102e) {
                jSONObject.put("create_by_error", dVar.f30102e);
            }
            if (dVar.f30103f > 0) {
                jSONObject.put("dur_total", dVar.f30103f);
            }
            if (dVar.f30104g > 0) {
                jSONObject.put("dur_last_stage", dVar.f30104g);
            }
            if (dVar.f30105h > 0) {
                jSONObject.put("dur_download", dVar.f30105h);
            }
            if (dVar.f30106i > 0) {
                jSONObject.put("dur_download_last_time", dVar.f30106i);
            }
            if (dVar.f30107j > 0) {
                jSONObject.put("dur_active", dVar.f30107j);
            }
            if (dVar.f30108k > 0) {
                jSONObject.put("dur_unzip", dVar.f30108k);
            }
            if (dVar.f30109l > 0) {
                jSONObject.put("dur_decompress_zstd", dVar.f30109l);
            }
            if (dVar.f30110m > 0) {
                jSONObject.put("dur_bytepatch", dVar.f30110m);
            }
            if (dVar.n > 0) {
                jSONObject.put("dur_zip_patch", dVar.n);
            }
            for (d.a aVar : dVar.u.values()) {
                jSONObject.put(aVar.f30111a + "result", !aVar.f30112b ? 1 : 0);
                jSONObject.put(aVar.f30111a + "url", aVar.f30115e);
                if (!TextUtils.isEmpty(aVar.f30114d)) {
                    jSONObject.put(aVar.f30111a + "err_msg", aVar.f30114d);
                }
                if (aVar.f30113c != 0) {
                    jSONObject.put(aVar.f30111a + "err_code", aVar.f30113c);
                }
                if (aVar.f30116f > 0) {
                    jSONObject.put(aVar.f30111a + "download_failed_times", aVar.f30116f);
                }
                if (aVar.f30117g) {
                    jSONObject.put(aVar.f30111a + "create_by_error", 1);
                }
            }
        }
        int i3 = this.notUsePatchReason;
        if (i3 != 0) {
            jSONObject.put("not_use_patch_reason", i3);
        } else if (this.localVersion != 0 && !this.usePatched) {
            jSONObject.put("not_use_patch_reason", 10);
        }
    }

    public UpdatePackage(long j2, String str, Package r5, Package r6) {
        this.version = j2;
        this.channel = str;
        Content content2 = new Content();
        this.content = content2;
        content2.fullPackage = r5;
        this.content.patch = r6;
        this.groupName = "default";
    }
}
