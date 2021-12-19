package com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public f f115492a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Map<String, String> f115493b;

    static {
        Covode.recordClassIndex(74137);
    }

    public final Map<String, String> a() {
        if (this.f115493b == null) {
            f fVar = this.f115492a;
            if (fVar == null) {
                a.a("ServerPortrait params null !!");
            } else if (fVar.f115468d != null) {
                this.f115493b = this.f115492a.f115468d;
            } else if (this.f115492a.f115467c != null) {
                this.f115493b = (Map) b.a(this.f115492a.f115467c, new com.google.gson.b.a<Map<String, String>>() {
                    /* class com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(74138);
                    }
                }.type);
            }
        }
        return this.f115493b;
    }
}
