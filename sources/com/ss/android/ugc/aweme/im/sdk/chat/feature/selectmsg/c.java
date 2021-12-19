package com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static HashMap<String, List<ai>> f101017a;

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, Integer> f101018b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f101019c = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(64613);
    }

    public static final void a() {
        if (f101018b != null) {
            f101018b = null;
        }
        if (f101017a != null) {
            f101017a = null;
        }
    }

    public static final void a(String str) {
        HashMap<String, List<ai>> hashMap = f101017a;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    public static final void a(String str, Integer num) {
        if (f101018b == null) {
            f101018b = new HashMap<>();
        }
        HashMap<String, Integer> hashMap = f101018b;
        if (hashMap == null) {
            l.b();
        }
        hashMap.put(str, num);
    }

    public static final void a(String str, List<ai> list) {
        if (f101017a == null) {
            f101017a = new HashMap<>();
        }
        HashMap<String, List<ai>> hashMap = f101017a;
        if (hashMap == null) {
            l.b();
        }
        hashMap.put(str, list);
    }
}
