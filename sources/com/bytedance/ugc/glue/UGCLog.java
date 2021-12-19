package com.bytedance.ugc.glue;

import com.bytedance.covode.number.Covode;

public class UGCLog {
    private static UGCLog instance = new UGCLog();

    /* access modifiers changed from: protected */
    public void dImpl(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    public void eImpl(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    public void eImpl(String str, String str2, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void iImpl(String str, String str2) {
    }

    protected UGCLog() {
    }

    private static UGCLog getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    static {
        Covode.recordClassIndex(27932);
    }

    public static void d(String str, String str2) {
        getInstance().dImpl(str, str2);
    }

    public static void e(String str, String str2) {
        getInstance().eImpl(str, str2);
    }

    public static void i(String str, String str2) {
        getInstance().iImpl(str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        getInstance().eImpl(str, str2, th);
    }
}
