package com.lynx.tasm.behavior.b;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.a.a.c;
import com.lynx.tasm.a.b;
import com.lynx.tasm.behavior.b.b;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final LynxUI f55784a;

    /* renamed from: b  reason: collision with root package name */
    public int f55785b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f55786c;

    /* renamed from: d  reason: collision with root package name */
    public UIGroup f55787d;

    /* renamed from: e  reason: collision with root package name */
    public b f55788e;

    /* renamed from: f  reason: collision with root package name */
    public b f55789f;

    /* renamed from: g  reason: collision with root package name */
    public b f55790g;

    /* renamed from: h  reason: collision with root package name */
    public b f55791h;

    /* renamed from: i  reason: collision with root package name */
    public String f55792i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f55793j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f55794k;

    /* renamed from: l  reason: collision with root package name */
    public HashMap<String, c.AbstractC1256c> f55795l = new HashMap<>();

    static {
        Covode.recordClassIndex(34890);
    }

    public final boolean a() {
        if (this.f55793j || this.f55794k) {
            return true;
        }
        return false;
    }

    public a(LynxUI lynxUI) {
        this.f55784a = lynxUI;
    }

    public final void a(String str) {
        this.f55792i = str;
        b.a.f55815a.a(this.f55784a, str);
    }
}
