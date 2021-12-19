package com.ss.android.ugc.aweme.shortvideo;

import androidx.c.a;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public class ShortVideoContextViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public ShortVideoContext f124769a;

    /* renamed from: b  reason: collision with root package name */
    private a<String, Object> f124770b = new a<>();

    /* renamed from: c  reason: collision with root package name */
    private t<Boolean> f124771c;

    static {
        Covode.recordClassIndex(81983);
    }

    public final boolean b() {
        Boolean bool = (Boolean) a("has_go_next");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void c() {
        if (this.f124771c == null) {
            this.f124771c = new t<>();
        }
        this.f124771c.setValue(true);
    }

    public final boolean a() {
        Boolean bool = (Boolean) a("photo_mode");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private Object a(String str) {
        return this.f124770b.get(str);
    }

    public final void b(boolean z) {
        a("has_go_next", Boolean.valueOf(z));
    }

    public final void a(int i2) {
        a("shoot_mode", Integer.valueOf(i2));
    }

    public final void a(boolean z) {
        a("photo_mode", Boolean.valueOf(z));
    }

    private void a(String str, Object obj) {
        this.f124770b.put(str, obj);
    }
}
