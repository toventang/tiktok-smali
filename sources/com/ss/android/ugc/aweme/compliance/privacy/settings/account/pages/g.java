package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class g {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Integer f77723a = 0;

    /* renamed from: b  reason: collision with root package name */
    public String f77724b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f77725c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f77726d;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.a<? extends CharSequence> f77727e;

    /* renamed from: f  reason: collision with root package name */
    public int f77728f;

    /* renamed from: g  reason: collision with root package name */
    public int f77729g;

    /* renamed from: h  reason: collision with root package name */
    public int f77730h = 1;

    /* renamed from: i  reason: collision with root package name */
    public t<Integer> f77731i;

    /* renamed from: j  reason: collision with root package name */
    public t<Boolean> f77732j;

    /* renamed from: k  reason: collision with root package name */
    public i f77733k;

    /* renamed from: l  reason: collision with root package name */
    public b<? super Integer, z> f77734l;

    /* renamed from: m  reason: collision with root package name */
    public h.f.a.a<z> f77735m;
    public b<? super Integer, Boolean> n;

    static {
        Covode.recordClassIndex(48124);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48125);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final f a() {
        if (this.f77728f == 0) {
            return new e(this);
        }
        return new h(this);
    }

    public final g a(int i2) {
        this.f77723a = Integer.valueOf(i2);
        return this;
    }

    public final g b(int i2) {
        this.f77725c = Integer.valueOf(i2);
        return this;
    }

    public final g c(int i2) {
        this.f77728f = 0;
        this.f77729g = i2;
        return this;
    }

    public final g b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f77735m = aVar;
        return this;
    }

    public final g b(b<? super Integer, Boolean> bVar) {
        l.d(bVar, "");
        this.n = bVar;
        return this;
    }

    public final g a(i iVar) {
        l.d(iVar, "");
        this.f77733k = iVar;
        return this;
    }

    public final g a(BasePrivacySettingViewModel basePrivacySettingViewModel) {
        l.d(basePrivacySettingViewModel, "");
        this.f77731i = basePrivacySettingViewModel.f77673d;
        this.f77732j = basePrivacySettingViewModel.f77674e;
        return this;
    }

    public final g a(h.f.a.a<? extends CharSequence> aVar) {
        l.d(aVar, "");
        this.f77727e = aVar;
        return this;
    }

    public final g a(b<? super Integer, z> bVar) {
        l.d(bVar, "");
        this.f77734l = bVar;
        return this;
    }

    public final g a(int i2, int i3) {
        this.f77728f = 1;
        this.f77729g = i2;
        this.f77730h = i3;
        return this;
    }
}
