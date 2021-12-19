package com.bytedance.apm.agent.tracing;

import com.bytedance.covode.number.Covode;

public class PageTraceEntity {
    public long onCreateEndTs;
    public long onCreateStartTs;
    public long onResumeEndTs;
    public long onResumeStartTs;
    public long onViewShowTs;
    public long onWindowFocusTs;
    public String pageName;

    static {
        Covode.recordClassIndex(14382);
    }

    public long getOnCreateEndTs() {
        return this.onCreateEndTs;
    }

    public long getOnCreateStartTs() {
        return this.onCreateStartTs;
    }

    public long getOnResumeEndTs() {
        return this.onResumeEndTs;
    }

    public long getOnResumeStartTs() {
        return this.onResumeStartTs;
    }

    public long getOnWindowFocusTs() {
        return this.onWindowFocusTs;
    }

    public String getPageName() {
        return this.pageName;
    }

    public boolean isCreateAndResumeValid() {
        if (this.onCreateStartTs <= 0 || this.onCreateEndTs <= 0 || this.onResumeStartTs <= 0 || this.onResumeEndTs <= 0) {
            return false;
        }
        return true;
    }

    public void setOnCreateEndTs(long j2) {
        this.onCreateEndTs = j2;
    }

    public void setOnCreateStartTs(long j2) {
        this.onCreateStartTs = j2;
    }

    public void setOnResumeEndTs(long j2) {
        this.onResumeEndTs = j2;
    }

    public void setOnResumeStartTs(long j2) {
        this.onResumeStartTs = j2;
    }

    public void setOnWindowFocusTs(long j2) {
        this.onWindowFocusTs = j2;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public PageTraceEntity(String str, long j2) {
        this.pageName = str;
        this.onCreateStartTs = j2;
    }
}
