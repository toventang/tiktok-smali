package com.bytedance.scene.navigation;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f43009a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f43010b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f43011c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43012d;

    /* renamed from: e  reason: collision with root package name */
    public int f43013e;

    static {
        Covode.recordClassIndex(26364);
    }

    public final Bundle a() {
        if (!TextUtils.isEmpty(this.f43009a)) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_rootScene", this.f43009a);
            bundle.putBundle("extra_rootScene_arguments", this.f43010b);
            bundle.putBoolean("extra_drawWindowBackground", this.f43011c);
            bundle.putBoolean("extra_fixSceneBackground_enabled", this.f43012d);
            bundle.putInt("extra_sceneBackground", this.f43013e);
            return bundle;
        }
        throw new IllegalArgumentException("call setRootScene first");
    }

    public g(Class<? extends j> cls) {
        this(cls, (Bundle) null);
    }

    g(String str, Bundle bundle) {
        this.f43011c = true;
        this.f43012d = true;
        this.f43009a = str;
        this.f43010b = bundle;
    }

    public g(Class<? extends j> cls, Bundle bundle) {
        this.f43011c = true;
        this.f43012d = true;
        if (!cls.isAssignableFrom(d.class)) {
            this.f43009a = cls.getName();
            this.f43010b = bundle;
            return;
        }
        throw new IllegalArgumentException("cant use NavigationScene as root scene");
    }
}
