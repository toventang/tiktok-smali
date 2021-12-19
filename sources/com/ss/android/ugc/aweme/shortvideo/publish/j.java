package com.ss.android.ugc.aweme.shortvideo.publish;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.setting.br;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f129789a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f129790b;

    /* renamed from: c  reason: collision with root package name */
    public final CommonSettingItemStatus f129791c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f129792d;

    static {
        Covode.recordClassIndex(85204);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f129793a = true;

        /* renamed from: b  reason: collision with root package name */
        public boolean f129794b = true;

        /* renamed from: c  reason: collision with root package name */
        public boolean f129795c;

        /* renamed from: d  reason: collision with root package name */
        public int f129796d;

        /* renamed from: e  reason: collision with root package name */
        public int f129797e;

        /* renamed from: f  reason: collision with root package name */
        public int f129798f;

        /* renamed from: g  reason: collision with root package name */
        public View.OnClickListener f129799g;

        /* renamed from: h  reason: collision with root package name */
        public final String f129800h;

        static {
            Covode.recordClassIndex(85205);
        }

        public a(String str) {
            l.d(str, "");
            this.f129800h = str;
        }
    }

    public final void a(boolean z) {
        this.f129789a = z;
        if (z) {
            this.f129790b = true;
            this.f129791c._checked.setValue(false);
            this.f129791c._alpha.setValue(Float.valueOf(0.4f));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<View, z> {
        final /* synthetic */ boolean $isPrivateAccount;
        final /* synthetic */ o $privacyItem;
        final /* synthetic */ int $privacyShowType;
        final /* synthetic */ a $setupConfigs;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(85206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, int i2, o oVar, boolean z, a aVar) {
            super(1);
            this.this$0 = jVar;
            this.$privacyShowType = i2;
            this.$privacyItem = oVar;
            this.$isPrivateAccount = z;
            this.$setupConfigs = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            if (!this.this$0.f129790b) {
                View.OnClickListener onClickListener = this.$setupConfigs.f129799g;
                if (onClickListener != null) {
                    onClickListener.onClick(view2);
                }
            } else if (this.$privacyShowType == 1) {
                o oVar = this.$privacyItem;
                if (!(oVar == null || oVar.getResType() != 1 || view2 == null)) {
                    new com.bytedance.tux.g.b(view2).e(R.string.fn6).b();
                }
            } else if (!this.$isPrivateAccount || this.$setupConfigs.f129797e == 0) {
                if (!this.this$0.f129789a || this.$setupConfigs.f129798f == 0) {
                    if (!(!this.$setupConfigs.f129795c || this.$setupConfigs.f129796d == 0 || view2 == null)) {
                        new com.bytedance.tux.g.b(view2).e(this.$setupConfigs.f129796d).b();
                    }
                } else if (view2 != null) {
                    new com.bytedance.tux.g.b(view2).e(this.$setupConfigs.f129798f).b();
                }
            } else if (view2 != null) {
                new com.bytedance.tux.g.b(view2).e(this.$setupConfigs.f129797e).b();
            }
            return z.f158842a;
        }
    }

    public final void a(a aVar) {
        int i2;
        boolean z;
        int i3;
        l.d(aVar, "");
        o a2 = com.ss.android.ugc.aweme.compliance.api.a.s().a(1, aVar.f129800h);
        boolean z2 = false;
        if (a2 != null) {
            i2 = a2.getShowType();
        } else {
            i2 = 0;
        }
        boolean a3 = PrivacyServiceImpl.c().a();
        if (!aVar.f129793a || i2 == 2) {
            this.f129791c._visibility.setValue(8);
            return;
        }
        this.f129791c._visibility.setValue(0);
        if ((!a3 || aVar.f129797e == 0) && i2 != 1 && ((!this.f129789a || aVar.f129798f == 0) && !aVar.f129795c)) {
            z = false;
        } else {
            z = true;
        }
        this.f129790b = z;
        if (z) {
            this.f129791c._alpha.setValue(Float.valueOf(0.4f));
        } else {
            this.f129791c._alpha.setValue(Float.valueOf(1.0f));
        }
        t<Boolean> tVar = this.f129791c._checked;
        if (aVar.f129794b && !this.f129790b) {
            z2 = true;
        }
        tVar.setValue(Boolean.valueOf(z2));
        if (TextUtils.equals(aVar.f129800h, "duet")) {
            AVPreferences e2 = g.a().e();
            if (l.a((Object) this.f129791c._checked.getValue(), (Object) true)) {
                i3 = br.f122115e;
            } else {
                i3 = br.f122116f;
            }
            e2.setReactDuetSettingCurrent(i3);
        }
        this.f129791c.addOnClickListener(new b(this, i2, a2, a3, aVar));
    }

    public j(CommonSettingItemStatus commonSettingItemStatus, Context context) {
        l.d(commonSettingItemStatus, "");
        l.d(context, "");
        this.f129791c = commonSettingItemStatus;
        this.f129792d = context;
    }
}
