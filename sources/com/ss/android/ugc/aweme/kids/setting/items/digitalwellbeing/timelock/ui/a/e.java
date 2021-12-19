package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.setting.a;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.widget.TimeLockDesc;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.NewSettingItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public class e extends a {

    /* renamed from: e  reason: collision with root package name */
    public NewSettingItem f106966e;

    /* renamed from: j  reason: collision with root package name */
    private TimeLockDesc f106967j;

    /* renamed from: k  reason: collision with root package name */
    private TimeLockDesc f106968k;

    /* renamed from: l  reason: collision with root package name */
    private TimeLockDesc f106969l;

    static {
        Covode.recordClassIndex(68422);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.a
    public final void c() {
        super.c();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ArrayList<a> f106972a;

        /* renamed from: b  reason: collision with root package name */
        public int f106973b;

        static {
            Covode.recordClassIndex(68425);
            ArrayList<a> arrayList = new ArrayList<>();
            f106972a = arrayList;
            arrayList.add(new a(40));
            f106972a.add(new a(60));
            f106972a.add(new a(90));
            f106972a.add(new a(120));
        }

        public a(int i2) {
            this.f106973b = i2;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f106967j = (TimeLockDesc) view.findViewById(R.id.el3);
        this.f106968k = (TimeLockDesc) view.findViewById(R.id.el4);
        this.f106969l = (TimeLockDesc) view.findViewById(R.id.el5);
        NewSettingItem newSettingItem = (NewSettingItem) view.findViewById(R.id.bsy);
        this.f106966e = newSettingItem;
        newSettingItem.a();
        this.f106966e.setOnSettingItemClickListener(new a.AbstractC0735a() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68423);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.setting.a.AbstractC0735a
            public final void a() {
                ((com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a) e.this.getActivity()).a(com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.a.a.a.a.a(k.class).a());
            }
        });
        TimeLockOptionViewModel timeLockOptionViewModel = (TimeLockOptionViewModel) ae.a(getActivity(), (ad.b) null).a(TimeLockOptionViewModel.class);
        timeLockOptionViewModel.f107004a.observe(this, new u<a>() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(68424);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(a aVar) {
                e.this.f106966e.setRightTxt(e.this.getString(R.string.gh2, Integer.valueOf(aVar.f106973b)));
            }
        });
        if (timeLockOptionViewModel.f107004a.getValue() == null) {
            timeLockOptionViewModel.f107004a.setValue(new a(60));
        }
        this.f106969l.setText(getString(R.string.fn5));
    }
}
