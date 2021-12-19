package com.lynx.tasm;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f56826a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f56827b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f56828c;

    /* renamed from: d  reason: collision with root package name */
    public String f56829d = "error";

    /* renamed from: e  reason: collision with root package name */
    public boolean f56830e;

    /* renamed from: f  reason: collision with root package name */
    public String f56831f;

    /* renamed from: g  reason: collision with root package name */
    public String f56832g;

    /* renamed from: h  reason: collision with root package name */
    public String f56833h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f56834i;

    /* renamed from: j  reason: collision with root package name */
    public String f56835j;

    /* renamed from: k  reason: collision with root package name */
    public String f56836k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f56837l;

    /* renamed from: m  reason: collision with root package name */
    public String f56838m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;

    static {
        Covode.recordClassIndex(35392);
    }

    public final String toString() {
        return "PageConfig{autoExpose=" + this.f56826a + ", pageVersion='" + this.f56829d + '}';
    }

    public q(ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("autoExpose")) {
                this.f56826a = readableMap.getBoolean("autoExpose");
            }
            if (readableMap.hasKey("pageVersion")) {
                this.f56829d = readableMap.getString("pageVersion");
            }
            if (readableMap.hasKey("enableEventThrough")) {
                this.f56827b = readableMap.getBoolean("enableEventThrough");
            }
            if (readableMap.hasKey("defaultOverflowVisible")) {
                this.f56828c = readableMap.getBoolean("defaultOverflowVisible");
            }
            if (readableMap.hasKey("useNewImage")) {
                this.f56830e = readableMap.getBoolean("useNewImage");
            }
            if (readableMap.hasKey("pageType")) {
                this.f56831f = readableMap.getString("pageType");
            }
            if (readableMap.hasKey("cliVersion")) {
                this.f56832g = readableMap.getString("cliVersion");
            }
            if (readableMap.hasKey("customData")) {
                this.f56833h = readableMap.getString("customData");
            }
            if (readableMap.hasKey("useNewSwiper")) {
                this.f56834i = readableMap.getBoolean("useNewSwiper");
            }
            if (readableMap.hasKey("targetSdkVersion")) {
                this.f56835j = readableMap.getString("targetSdkVersion");
            }
            if (readableMap.hasKey("lepusVersion")) {
                this.f56836k = readableMap.getString("lepusVersion");
            }
            if (readableMap.hasKey("enableLepusNG")) {
                this.f56837l = readableMap.getBoolean("enableLepusNG");
            }
            if (readableMap.hasKey("radonMode")) {
                this.f56838m = readableMap.getString("radonMode");
            }
            if (readableMap.hasKey("tapSlop")) {
                this.n = readableMap.getString("tapSlop");
            }
            if (readableMap.hasKey("enableCreateViewAsync")) {
                this.o = readableMap.getBoolean("enableCreateViewAsync");
            }
            if (readableMap.hasKey("enableAccessibilityElement")) {
                this.p = readableMap.getBoolean("enableAccessibilityElement");
            }
            if (readableMap.hasKey("enableNewFlatten")) {
                this.q = readableMap.getBoolean("enableNewFlatten");
            }
            if (readableMap.hasKey("reactVersion")) {
                this.r = readableMap.getString("reactVersion");
            }
        }
    }
}
