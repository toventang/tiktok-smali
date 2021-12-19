package com.bytedance.geckox.settings.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import java.util.Map;

public class GlobalConfigSettings {
    @c(a = "settings_config")
    private GlobalConfig globalConfig;
    @c(a = "req_meta")
    private ReqMeta reqMeta;
    @c(a = "resource_meta")
    private ResourceMeta resourceMeta;
    @c(a = "version")
    private int version;

    static {
        Covode.recordClassIndex(17433);
    }

    public static class AccessKeyMetaInfo {
        @c(a = "channels")
        private Map<String, ChannelMetaInfo> channels;
        @c(a = "config")
        private CurrentLevelConfig config;

        static {
            Covode.recordClassIndex(17434);
        }

        public Map<String, ChannelMetaInfo> getChannels() {
            return this.channels;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class CDNFallBackConfig {
        @c(a = "domains")
        private List<String> domains;
        @c(a = "max_attempts")
        private int maxAttempts;
        @c(a = "shuffle")
        private int shuffle;

        static {
            Covode.recordClassIndex(17435);
        }

        public List<String> getDomains() {
            return this.domains;
        }

        public int getMaxAttempts() {
            return this.maxAttempts;
        }

        public int getShuffle() {
            return this.shuffle;
        }
    }

    public static class ChannelMetaInfo {
        @c(a = "config")
        private CurrentLevelConfig config;

        static {
            Covode.recordClassIndex(17436);
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class CurrentLevelConfig {
        @c(a = "cdn_fallback")
        private CDNFallBackConfig cdnFallback;
        @c(a = "pipeline")
        private List<PipelineStep> pipeline;
        @c(a = "prefix_2_ak")
        private Map<String, String> prefix2AccessKey;

        static {
            Covode.recordClassIndex(17437);
        }

        public CDNFallBackConfig getCdnFallback() {
            return this.cdnFallback;
        }

        public List<PipelineStep> getPipeline() {
            return this.pipeline;
        }

        public Map<String, String> getPrefix2AccessKey() {
            return this.prefix2AccessKey;
        }
    }

    public static class GeckoPollingConfig {
        @c(a = "combine")
        private List<SyncItem> combine;
        @c(a = "interval")
        private int interval;

        static {
            Covode.recordClassIndex(17438);
        }

        public List<SyncItem> getCombine() {
            return this.combine;
        }

        public int getInterval() {
            return this.interval;
        }
    }

    public static class GlobalConfig {
        @c(a = "check_update")
        private SettingsPollingConfig checkUpdate;
        @c(a = "host_app_id")
        private List<String> hostAppId;
        @c(a = "poll_enable")
        private int pollEnable;

        static {
            Covode.recordClassIndex(17439);
        }

        public SettingsPollingConfig getCheckUpdate() {
            return this.checkUpdate;
        }

        public List<String> getHostAppId() {
            return this.hostAppId;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }
    }

    public static class LazyItem {
        @c(a = "channels")
        private List<String> channels;
        @c(a = "groups")
        private List<String> groups;

        static {
            Covode.recordClassIndex(17440);
        }

        public List<String> getChannels() {
            return this.channels;
        }

        public List<String> getGroups() {
            return this.groups;
        }
    }

    public static class PipelineStep {
        @c(a = "no_cache")
        private int noCache;
        @c(a = StringSet.type)
        private int type;
        @c(a = "update")
        private int update;

        static {
            Covode.recordClassIndex(17441);
        }

        public int getNoCache() {
            return this.noCache;
        }

        public int getType() {
            return this.type;
        }

        public int getUpdate() {
            return this.update;
        }
    }

    public enum PipelineType {
        GECKO(1),
        CDN(2),
        BUILTIN(3);
        
        private int val;

        public final int getVal() {
            return this.val;
        }

        static {
            Covode.recordClassIndex(17442);
        }

        private PipelineType(int i2) {
            this.val = i2;
        }
    }

    public static class ReqMeta {
        @c(a = "aks")
        private List<String> aks;
        @c(a = "check_update")
        private Map<String, GeckoPollingConfig> checkUpdate;
        @c(a = "enable")
        private int enable;
        @c(a = "fre_control_enable")
        private int freControlEnable;
        @c(a = "lazy")
        private Map<String, LazyItem> lazy;
        @c(a = "poll_enable")
        private int pollEnable;
        @c(a = "queue")
        private List<RequestConfig> queue;

        static {
            Covode.recordClassIndex(17443);
        }

        public List<String> getAks() {
            return this.aks;
        }

        public Map<String, GeckoPollingConfig> getCheckUpdate() {
            return this.checkUpdate;
        }

        public int getEnable() {
            return this.enable;
        }

        public int getFreControlEnable() {
            return this.freControlEnable;
        }

        public Map<String, LazyItem> getLazy() {
            return this.lazy;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }

        public List<RequestConfig> getQueue() {
            return this.queue;
        }
    }

    public static class RequestConfig {
        @c(a = "delay")
        private long delay;
        @c(a = "sync")
        private List<SyncItem> sync;

        static {
            Covode.recordClassIndex(17444);
        }

        public long getDelay() {
            return this.delay;
        }

        public List<SyncItem> getSync() {
            return this.sync;
        }
    }

    public static class ResourceMeta {
        @c(a = "access_keys")
        private Map<String, AccessKeyMetaInfo> accessKeys;
        @c(a = "config")
        private CurrentLevelConfig config;

        static {
            Covode.recordClassIndex(17445);
        }

        public Map<String, AccessKeyMetaInfo> getAccessKeys() {
            return this.accessKeys;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class SettingsPollingConfig {
        @c(a = "interval")
        private long interval;

        static {
            Covode.recordClassIndex(17446);
        }

        public long getInterval() {
            return this.interval;
        }
    }

    public static class SyncItem {
        @c(a = "ak")
        private String ak;
        @c(a = "group")
        private List<String> group;
        @c(a = "target")
        private List<String> target;

        static {
            Covode.recordClassIndex(17447);
        }

        public SyncItem() {
        }

        public String getAccessKey() {
            return this.ak;
        }

        public List<String> getGroup() {
            return this.group;
        }

        public List<String> getTarget() {
            return this.target;
        }

        public SyncItem(String str, List<String> list, List<String> list2) {
            this.ak = str;
            this.group = list;
            this.target = list2;
        }
    }

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public ReqMeta getReqMeta() {
        return this.reqMeta;
    }

    public ResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public int getVersion() {
        return this.version;
    }
}
