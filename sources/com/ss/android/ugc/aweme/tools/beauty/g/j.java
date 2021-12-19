package com.ss.android.ugc.aweme.tools.beauty.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.b.a.i;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: g  reason: collision with root package name */
    public static final a f138990g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f138991a = new b(this);

    /* renamed from: b  reason: collision with root package name */
    public Context f138992b;

    /* renamed from: c  reason: collision with root package name */
    public final int f138993c;

    /* renamed from: d  reason: collision with root package name */
    final String f138994d;

    /* renamed from: e  reason: collision with root package name */
    final String f138995e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f138996f;

    static {
        Covode.recordClassIndex(90909);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90910);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f138997a;

        static {
            Covode.recordClassIndex(90911);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.b.a.i
        public final BeautyCategoryExtra b() {
            String valueOf = String.valueOf(this.f138997a.f138993c);
            String flag = com.ss.android.ugc.aweme.tools.beauty.a.ALL.getFlag();
            l.d(valueOf, "");
            l.d(flag, "");
            return new BeautyCategoryExtra(valueOf, true, true, false, flag, false, false, false, null, null, null, null, null, false, 16256, null);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.b.a.i
        public final EffectCategoryResponse c() {
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, 1, null);
            effectCategoryResponse.setId("-10000");
            String string = this.f138997a.f138992b.getResources().getString(R.string.a46);
            l.b(string, "");
            effectCategoryResponse.setName(string);
            return effectCategoryResponse;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.b.a.i
        public final List<com.ss.android.ugc.aweme.tools.beauty.b.b.a> a() {
            int i2;
            j jVar = this.f138997a;
            ArrayList arrayList = new ArrayList();
            if (jVar.f138996f) {
                i2 = 35;
            } else {
                i2 = 60;
            }
            String string = jVar.f138992b.getResources().getString(R.string.yd);
            l.b(string, "");
            arrayList.add(new com.ss.android.ugc.aweme.tools.beauty.b.b.a(2131232497, "-1000", "-1000", string, jVar.f138994d, i2, "Smooth_ALL", (byte) 0));
            if (!jVar.f138996f) {
                String string2 = jVar.f138992b.getResources().getString(R.string.yc);
                l.b(string2, "");
                arrayList.add(new com.ss.android.ugc.aweme.tools.beauty.b.b.a(2131232498, "-1001", "-1001", string2, jVar.f138995e, 40, "Face_ALL", (byte) 0));
                String string3 = jVar.f138992b.getResources().getString(R.string.y9);
                l.b(string3, "");
                arrayList.add(new com.ss.android.ugc.aweme.tools.beauty.b.b.a(2131232494, "-1002", "-1002", string3, jVar.f138995e, 30, "Eye_ALL", (byte) 0));
            }
            return arrayList;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(j jVar) {
            this.f138997a = jVar;
        }
    }

    public j(Context context, int i2, String str, String str2, boolean z) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        this.f138992b = context;
        this.f138993c = i2;
        this.f138994d = str;
        this.f138995e = str2;
        this.f138996f = z;
    }
}
