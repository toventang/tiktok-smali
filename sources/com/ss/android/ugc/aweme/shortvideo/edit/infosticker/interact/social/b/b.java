package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.c;
import h.f.b.l;
import java.util.Arrays;

public class b<T extends a<?>, K extends c> implements d {

    /* renamed from: b  reason: collision with root package name */
    public T f127622b;

    /* renamed from: c  reason: collision with root package name */
    public K f127623c;

    static {
        Covode.recordClassIndex(83661);
    }

    public void a() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.d
    public void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.d
    public void b() {
    }

    public final boolean c() {
        if (this.f127623c != null) {
            return true;
        }
        return false;
    }

    private boolean d() {
        T t = this.f127622b;
        if (t != null) {
            return t.f127619d;
        }
        return false;
    }

    public final boolean a(Object... objArr) {
        l.d(objArr, "");
        if (this.f127622b != null && !d()) {
            T t = this.f127622b;
            if (t == null) {
                l.b();
            }
            if (t.b(Arrays.copyOf(objArr, 2))) {
                a();
                return true;
            }
        }
        return false;
    }
}
