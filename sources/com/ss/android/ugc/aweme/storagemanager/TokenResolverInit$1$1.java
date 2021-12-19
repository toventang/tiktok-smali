package com.ss.android.ugc.aweme.storagemanager;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.e.b.b;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.storagemanager.a;
import java.util.List;

class TokenResolverInit$1$1 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f136681a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f136682b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f136683c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a.AnonymousClass1 f136684d;

    static {
        Covode.recordClassIndex(89271);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        int i2 = this.f136683c;
        if (i2 == 2) {
            return ae.APP_BACKGROUND;
        }
        if (i2 == 3) {
            return ae.SPARSE;
        }
        if (i2 != 4) {
            return ae.IDLE;
        }
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        this.f136681a.a(this.f136682b);
    }

    TokenResolverInit$1$1(a.AnonymousClass1 r1, b bVar, Object obj, int i2) {
        this.f136684d = r1;
        this.f136681a = bVar;
        this.f136682b = obj;
        this.f136683c = i2;
    }
}
