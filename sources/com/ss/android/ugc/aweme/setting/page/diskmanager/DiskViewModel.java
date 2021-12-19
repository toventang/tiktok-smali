package com.ss.android.ugc.aweme.setting.page.diskmanager;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.p;
import h.z;

public final class DiskViewModel extends ac {

    /* renamed from: d  reason: collision with root package name */
    public static final a f122483d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f122484a;

    /* renamed from: b  reason: collision with root package name */
    public final t<Integer> f122485b;

    /* renamed from: c  reason: collision with root package name */
    public final t<p<Integer, b<com.bytedance.tux.dialog.b.a, z>>> f122486c = new t<>();

    static {
        Covode.recordClassIndex(80326);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80327);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public DiskViewModel() {
        t<Boolean> tVar = new t<>();
        tVar.setValue(false);
        this.f122484a = tVar;
        t<Integer> tVar2 = new t<>();
        tVar2.setValue(0);
        this.f122485b = tVar2;
    }
}
