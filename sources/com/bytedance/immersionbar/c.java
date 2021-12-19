package com.bytedance.immersionbar;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class c implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    int f38882a;

    /* renamed from: b  reason: collision with root package name */
    int f38883b = -16777216;

    /* renamed from: c  reason: collision with root package name */
    float f38884c;

    /* renamed from: d  reason: collision with root package name */
    float f38885d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f38886e;

    /* renamed from: f  reason: collision with root package name */
    boolean f38887f;

    /* renamed from: g  reason: collision with root package name */
    b f38888g = b.FLAG_SHOW_BAR;

    /* renamed from: h  reason: collision with root package name */
    boolean f38889h;

    /* renamed from: i  reason: collision with root package name */
    boolean f38890i;

    /* renamed from: j  reason: collision with root package name */
    boolean f38891j;

    /* renamed from: k  reason: collision with root package name */
    boolean f38892k;

    /* renamed from: l  reason: collision with root package name */
    float f38893l;

    /* renamed from: m  reason: collision with root package name */
    float f38894m;
    boolean n = true;
    int o = -16777216;
    int p = -16777216;
    Map<View, Map<Integer, Integer>> q = new HashMap();
    float r = 0.0f;
    public boolean s = false;
    int t;
    boolean u = true;
    boolean v = false;

    static {
        Covode.recordClassIndex(23841);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
