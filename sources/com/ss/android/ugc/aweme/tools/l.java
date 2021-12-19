package com.ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.b;

public class l extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f140203a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f140204b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f140205c;

    /* renamed from: d  reason: collision with root package name */
    public int f140206d = 1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f140207e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f140208f = true;

    static {
        Covode.recordClassIndex(91603);
    }

    public final boolean a() {
        if (this.f140206d == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "SwitchDurationConfigEvent{isShortMode=" + this.f140204b + "isEnabled=" + this.f140203a + '}';
    }

    public l(boolean z, boolean z2) {
        this.f140204b = z;
        this.f140203a = z2;
    }
}
