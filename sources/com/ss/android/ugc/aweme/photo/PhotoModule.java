package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.asve.recorder.c.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.property.cy;
import com.ss.android.ugc.aweme.record.f;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import f.a.d.g;
import f.a.t;
import java.io.File;
import java.util.List;

public class PhotoModule implements au, f {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f114825g = {g.f114866a, g.f114867b};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f114826h = {1080, 1920};

    /* renamed from: a  reason: collision with root package name */
    final a f114827a;

    /* renamed from: b  reason: collision with root package name */
    f.a f114828b;

    /* renamed from: c  reason: collision with root package name */
    final b f114829c = new b();

    /* renamed from: d  reason: collision with root package name */
    boolean f114830d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f114831e;

    /* renamed from: f  reason: collision with root package name */
    List<String> f114832f;

    /* renamed from: i  reason: collision with root package name */
    private SafeHandler f114833i;

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.record.f
    public final List<String> a() {
        return this.f114831e;
    }

    private static boolean b() {
        if (SettingsManager.a().a("enable_1080p_photo_mv", false) || cy.a.a().f118429a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(73869);
    }

    @Override // com.ss.android.ugc.aweme.record.f
    public final void a(String str) {
        this.f114829c.f114838b = str;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public PhotoModule(e eVar, a aVar, f.a aVar2) {
        this.f114827a = aVar;
        this.f114828b = aVar2;
        eVar.getLifecycle().a(this);
        this.f114833i = new SafeHandler(eVar);
    }

    @Override // com.ss.android.ugc.aweme.record.f
    public final void a(int i2, int i3, boolean z) {
        if (!this.f114830d) {
            this.f114830d = true;
            this.f114829c.f114839c = Bitmap.CompressFormat.PNG;
            if (i2 == 0) {
                if (b()) {
                    i2 = f114826h[0];
                } else {
                    i2 = f114825g[0];
                }
            }
            if (i3 == 0) {
                if (b()) {
                    i3 = f114826h[1];
                } else {
                    i3 = f114825g[1];
                }
            }
            this.f114833i.post(new n(this));
            t.a(new l(this, i2, i3)).a((g) new i(this, z, i2, i3), false).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new j(this, System.currentTimeMillis()), new k(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.record.f
    public final void a(int i2, int i3, boolean z, List<String> list) {
        this.f114832f = list;
        a(i2, i3, z);
    }
}
