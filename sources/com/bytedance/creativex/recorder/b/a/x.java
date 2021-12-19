package com.bytedance.creativex.recorder.b.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.c;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public int f28214a;

    /* renamed from: b  reason: collision with root package name */
    public Effect f28215b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28216c;

    /* renamed from: d  reason: collision with root package name */
    public s f28217d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f28218e = new Bundle();

    /* renamed from: f  reason: collision with root package name */
    public Runnable f28219f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f28220g;

    static {
        Covode.recordClassIndex(16541);
    }

    public final x a() {
        this.f28216c = true;
        return this;
    }

    public String toString() {
        return "StopRecordingCommandEvent{}";
    }

    public final x a(int i2) {
        this.f28214a = i2;
        return this;
    }

    public x(String str) {
        if (!TextUtils.isEmpty(str) || !c.f149147b) {
            this.f28220g = str;
            return;
        }
        throw new IllegalStateException("stop recording reason shouldn't be empty!!!");
    }
}
