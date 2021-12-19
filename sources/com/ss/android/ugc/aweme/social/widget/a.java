package com.ss.android.ugc.aweme.social.widget;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class a implements ag, m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f133712a;

    /* renamed from: b  reason: collision with root package name */
    public final String f133713b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f133714c;

    /* renamed from: d  reason: collision with root package name */
    private final i f133715d;

    /* renamed from: e  reason: collision with root package name */
    private final af f133716e;

    static {
        Covode.recordClassIndex(87472);
    }

    public a() {
        this(null, null, null, null, 15);
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f133715d;
    }

    @Override // androidx.lifecycle.ag
    public final af getViewModelStore() {
        return this.f133716e;
    }

    public final Context a() {
        Context context = this.f133712a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r3.getLifecycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r2.f133715d = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r4 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = r4.getViewModelStore();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r3 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r0 = r3.getViewModelStore();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r2.f133716e = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r4 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        throw new java.lang.IllegalStateException("Social Context need ViewModel store!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        throw new java.lang.IllegalStateException("Social Context need Lifecycle!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r0 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r2.f133712a = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r4 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r0 = r4.getLifecycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(androidx.fragment.app.e r3, androidx.fragment.app.Fragment r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            h.f.b.l.d(r6, r0)
            r2.<init>()
            r2.f133713b = r5
            r2.f133714c = r6
            if (r3 != 0) goto L_0x0041
            if (r4 == 0) goto L_0x0056
        L_0x0013:
            androidx.fragment.app.e r0 = r4.getActivity()
            if (r0 == 0) goto L_0x0044
        L_0x0019:
            r2.f133712a = r0
            r0 = 0
            if (r4 == 0) goto L_0x0024
            androidx.lifecycle.i r0 = r4.getLifecycle()
            if (r0 != 0) goto L_0x002c
        L_0x0024:
            if (r3 == 0) goto L_0x004e
            androidx.lifecycle.i r0 = r3.getLifecycle()
            if (r0 == 0) goto L_0x004e
        L_0x002c:
            r2.f133715d = r0
            if (r4 == 0) goto L_0x0036
            androidx.lifecycle.af r0 = r4.getViewModelStore()
            if (r0 != 0) goto L_0x003e
        L_0x0036:
            if (r3 == 0) goto L_0x0046
            androidx.lifecycle.af r0 = r3.getViewModelStore()
            if (r0 == 0) goto L_0x0046
        L_0x003e:
            r2.f133716e = r0
            return
        L_0x0041:
            if (r4 == 0) goto L_0x0044
            goto L_0x0013
        L_0x0044:
            r0 = r3
            goto L_0x0019
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Social Context need ViewModel store!"
            r1.<init>(r0)
            throw r1
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Social Context need Lifecycle!"
            r1.<init>(r0)
            throw r1
        L_0x0056:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Social Context init params error!"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.widget.a.<init>(androidx.fragment.app.e, androidx.fragment.app.Fragment, java.lang.String, java.util.Map):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, Fragment fragment, String str, Map map, int i2) {
        this((i2 & 1) != 0 ? null : eVar, (i2 & 2) != 0 ? null : fragment, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? h.a.ag.a() : map);
    }
}
