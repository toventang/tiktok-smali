package com.kakao.auth.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PageableContext {
    private String afterUrl;
    private String beforeUrl;
    private final int limit;
    private final int offset;
    private final String order;

    static {
        Covode.recordClassIndex(34309);
    }

    public int getLimit() {
        return this.limit;
    }

    public int getOffset() {
        return this.offset;
    }

    public String getOrder() {
        return this.order;
    }

    public synchronized String getAfterUrl() {
        String str;
        MethodCollector.i(6591);
        str = this.afterUrl;
        MethodCollector.o(6591);
        return str;
    }

    public synchronized String getBeforeUrl() {
        String str;
        MethodCollector.i(6527);
        str = this.beforeUrl;
        MethodCollector.o(6527);
        return str;
    }

    public synchronized boolean hasNext() {
        MethodCollector.i(6715);
        if (this.afterUrl != null) {
            MethodCollector.o(6715);
            return true;
        }
        MethodCollector.o(6715);
        return false;
    }

    public synchronized void setAfterUrl(String str) {
        MethodCollector.i(6650);
        this.afterUrl = str;
        MethodCollector.o(6650);
    }

    public synchronized void setBeforeUrl(String str) {
        MethodCollector.i(6647);
        this.beforeUrl = str;
        MethodCollector.o(6647);
    }

    public PageableContext(int i2, int i3, String str) {
        this.offset = i2;
        this.limit = i3;
        this.order = str;
    }
}
