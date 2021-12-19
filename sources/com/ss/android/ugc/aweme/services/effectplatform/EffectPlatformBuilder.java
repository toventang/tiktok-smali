package com.ss.android.ugc.aweme.services.effectplatform;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class EffectPlatformBuilder {
    private String accessKey;
    private String appID;
    private String appLanguage;
    private String appVersion;
    private File cacheDir;
    private String channel;
    private Context context;
    private EffectFetcher effectFetcher;
    private long effectMaxCacheSize = -1;
    private IEffectNetWorker effectNetWorker;
    private boolean enableKNEffectPlatform;
    private ExecutorService executorService;
    private List<Host> hosts;
    private IJsonConverter jsonConverter;
    private Map<String, Object> monitorExtraParams;
    private String region;
    private Integer requestStrategy;
    private Integer retryCount;
    private String sdkVersion;
    private String systemLanguage;

    static {
        Covode.recordClassIndex(79618);
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAppID() {
        return this.appID;
    }

    public String getAppLanguage() {
        return this.appLanguage;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public File getCacheDir() {
        return this.cacheDir;
    }

    public String getChannel() {
        return this.channel;
    }

    public Context getContext() {
        return this.context;
    }

    public EffectFetcher getEffectFetcher() {
        return this.effectFetcher;
    }

    public long getEffectMaxCacheSize() {
        return this.effectMaxCacheSize;
    }

    public IEffectNetWorker getEffectNetWorker() {
        return this.effectNetWorker;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public List<Host> getHosts() {
        return this.hosts;
    }

    public IJsonConverter getJsonConverter() {
        return this.jsonConverter;
    }

    public Map<String, Object> getMonitorExtraParams() {
        return this.monitorExtraParams;
    }

    public String getRegion() {
        return this.region;
    }

    public Integer getRequestStrategy() {
        return this.requestStrategy;
    }

    public Integer getRetryCount() {
        return this.retryCount;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSystemLanguage() {
        return this.systemLanguage;
    }

    public boolean isEnableKNEffectPlatform() {
        return this.enableKNEffectPlatform;
    }

    public EffectPlatformBuilder setAccessKey(String str) {
        this.accessKey = str;
        return this;
    }

    public EffectPlatformBuilder setAppID(String str) {
        this.appID = str;
        return this;
    }

    public EffectPlatformBuilder setAppLanguage(String str) {
        this.appLanguage = str;
        return this;
    }

    public EffectPlatformBuilder setAppVersion(String str) {
        this.appVersion = str;
        return this;
    }

    public EffectPlatformBuilder setCacheDir(File file) {
        this.cacheDir = file;
        return this;
    }

    public EffectPlatformBuilder setChannel(String str) {
        this.channel = str;
        return this;
    }

    public EffectPlatformBuilder setContext(Context context2) {
        this.context = context2;
        return this;
    }

    public EffectPlatformBuilder setEffectFetcher(EffectFetcher effectFetcher2) {
        this.effectFetcher = effectFetcher2;
        return this;
    }

    public void setEffectMaxCacheSize(long j2) {
        this.effectMaxCacheSize = j2;
    }

    public EffectPlatformBuilder setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
        this.effectNetWorker = iEffectNetWorker;
        return this;
    }

    public void setEnableKNEffectPlatform(boolean z) {
        this.enableKNEffectPlatform = z;
    }

    public EffectPlatformBuilder setExecutorService(ExecutorService executorService2) {
        this.executorService = executorService2;
        return this;
    }

    public EffectPlatformBuilder setHosts(List<Host> list) {
        this.hosts = list;
        return this;
    }

    public EffectPlatformBuilder setJsonConverter(IJsonConverter iJsonConverter) {
        this.jsonConverter = iJsonConverter;
        return this;
    }

    public void setMonitorExtraParams(Map<String, Object> map) {
        this.monitorExtraParams = map;
    }

    public EffectPlatformBuilder setRegion(String str) {
        this.region = str;
        return this;
    }

    public EffectPlatformBuilder setRequestStrategy(Integer num) {
        this.requestStrategy = num;
        return this;
    }

    public EffectPlatformBuilder setRetryCount(Integer num) {
        this.retryCount = num;
        return this;
    }

    public EffectPlatformBuilder setSdkVersion(String str) {
        this.sdkVersion = str;
        return this;
    }

    public EffectPlatformBuilder setSystemLanguage(String str) {
        this.systemLanguage = str;
        return this;
    }
}
