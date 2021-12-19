package com.bytedance.lynx.hybrid.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.c;
import h.f.b.l;
import java.io.Serializable;

public class b implements Serializable {
    private String bundle = "";
    private String channel = "";
    private boolean disableBuiltin;
    private boolean disableGecko;
    private boolean disableSaveImage;
    private boolean enableCanvas;
    private c engineType;
    private boolean forceH5;
    private String group = "default_lynx_group";
    private int ignoreCachePolicy;
    private String initData = "";
    private int lynxViewHeight;
    private int lynxViewWidth;
    private boolean needSecLink;
    private String preloadFonts = "";
    private int presetHeight;
    private boolean presetSafePoint;
    private int presetWidth;
    private String sUrl = "";
    private String secLinkScene = "";
    private boolean shareGroup = true;
    private int threadStrategy;
    private boolean uiRunningMode = true;
    private int useTtnet = -1;

    static {
        Covode.recordClassIndex(25110);
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final boolean getDisableBuiltin() {
        return this.disableBuiltin;
    }

    public final boolean getDisableGecko() {
        return this.disableGecko;
    }

    public final boolean getDisableSaveImage() {
        return this.disableSaveImage;
    }

    public final boolean getEnableCanvas() {
        return this.enableCanvas;
    }

    public final c getEngineType() {
        return this.engineType;
    }

    public final boolean getForceH5() {
        return this.forceH5;
    }

    public final String getGroup() {
        return this.group;
    }

    public final int getIgnoreCachePolicy() {
        return this.ignoreCachePolicy;
    }

    public final String getInitData() {
        return this.initData;
    }

    public final int getLynxViewHeight() {
        return this.lynxViewHeight;
    }

    public final int getLynxViewWidth() {
        return this.lynxViewWidth;
    }

    public final boolean getNeedSecLink() {
        return this.needSecLink;
    }

    public final String getPreloadFonts() {
        return this.preloadFonts;
    }

    public final int getPresetHeight() {
        return this.presetHeight;
    }

    public final boolean getPresetSafePoint() {
        return this.presetSafePoint;
    }

    public final int getPresetWidth() {
        return this.presetWidth;
    }

    public final String getSUrl() {
        return this.sUrl;
    }

    public final String getSecLinkScene() {
        return this.secLinkScene;
    }

    public final boolean getShareGroup() {
        return this.shareGroup;
    }

    public final int getThreadStrategy() {
        return this.threadStrategy;
    }

    public final boolean getUiRunningMode() {
        return this.uiRunningMode;
    }

    public final int getUseTtnet() {
        return this.useTtnet;
    }

    public final void setDisableBuiltin(boolean z) {
        this.disableBuiltin = z;
    }

    public final void setDisableGecko(boolean z) {
        this.disableGecko = z;
    }

    public final void setDisableSaveImage(boolean z) {
        this.disableSaveImage = z;
    }

    public final void setEnableCanvas(boolean z) {
        this.enableCanvas = z;
    }

    public final void setForceH5(boolean z) {
        this.forceH5 = z;
    }

    public final void setIgnoreCachePolicy(int i2) {
        this.ignoreCachePolicy = i2;
    }

    public final void setLynxViewHeight(int i2) {
        this.lynxViewHeight = i2;
    }

    public final void setLynxViewWidth(int i2) {
        this.lynxViewWidth = i2;
    }

    public final void setNeedSecLink(boolean z) {
        this.needSecLink = z;
    }

    public final void setPresetHeight(int i2) {
        this.presetHeight = i2;
    }

    public final void setPresetSafePoint(boolean z) {
        this.presetSafePoint = z;
    }

    public final void setPresetWidth(int i2) {
        this.presetWidth = i2;
    }

    public final void setShareGroup(boolean z) {
        this.shareGroup = z;
    }

    public final void setThreadStrategy(int i2) {
        this.threadStrategy = i2;
    }

    public final void setUiRunningMode(boolean z) {
        this.uiRunningMode = z;
    }

    public final void setUseTtnet(int i2) {
        this.useTtnet = i2;
    }

    public final void setBundle(String str) {
        l.c(str, "");
        this.bundle = str;
    }

    public final void setChannel(String str) {
        l.c(str, "");
        this.channel = str;
    }

    public final void setEngineType(c cVar) {
        l.c(cVar, "");
        this.engineType = cVar;
    }

    public final void setGroup(String str) {
        l.c(str, "");
        this.group = str;
    }

    public final void setInitData(String str) {
        l.c(str, "");
        this.initData = str;
    }

    public final void setPreloadFonts(String str) {
        l.c(str, "");
        this.preloadFonts = str;
    }

    public final void setSUrl(String str) {
        l.c(str, "");
        this.sUrl = str;
    }

    public final void setSecLinkScene(String str) {
        l.c(str, "");
        this.secLinkScene = str;
    }

    public b(c cVar) {
        l.c(cVar, "");
        this.engineType = cVar;
    }
}
