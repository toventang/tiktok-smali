package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class dq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dn f94608a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94609b;

    static {
        Covode.recordClassIndex(60049);
    }

    dq(dn dnVar, String str) {
        this.f94608a = dnVar;
        this.f94609b = str;
    }

    public final void run() {
        dn dnVar = this.f94608a;
        String str = this.f94609b;
        str.hashCode();
        if (str.equals("on_page_selected") && dnVar.L != null && dnVar.f94605a != null) {
            dnVar.f94605a.l();
        }
    }
}
