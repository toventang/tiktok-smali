package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.ui.widget.setting.a;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public class l extends a {

    /* renamed from: a  reason: collision with root package name */
    public SettingItem f78050a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextCell f78051b;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextCell f78052k;

    /* renamed from: l  reason: collision with root package name */
    private TuxTextCell f78053l;

    static {
        Covode.recordClassIndex(48391);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a
    public final int c() {
        return R.layout.ug;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a
    public final void d() {
        r.a("open_time_lock", new d().f66730a);
        super.d();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ArrayList<a> f78056a;

        /* renamed from: b  reason: collision with root package name */
        public int f78057b;

        static {
            Covode.recordClassIndex(48394);
            ArrayList<a> arrayList = new ArrayList<>();
            f78056a = arrayList;
            arrayList.add(new a(40));
            f78056a.add(new a(60));
            f78056a.add(new a(90));
            f78056a.add(new a(120));
        }

        public a(int i2) {
            this.f78057b = i2;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f78051b = (TuxTextCell) view.findViewById(R.id.el3);
        this.f78052k = (TuxTextCell) view.findViewById(R.id.el4);
        this.f78053l = (TuxTextCell) view.findViewById(R.id.el5);
        SettingItem settingItem = (SettingItem) view.findViewById(R.id.bsy);
        this.f78050a = settingItem;
        settingItem.setOnSettingItemClickListener(new a.AbstractC0735a() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48392);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.setting.a.AbstractC0735a
            public final void a() {
                ((com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a) l.this.getActivity()).a(com.ss.android.ugc.aweme.compliance.common.e.a.a.a(s.class).a());
            }
        });
        TimeLockOptionViewModel timeLockOptionViewModel = (TimeLockOptionViewModel) ae.a(getActivity(), (ad.b) null).a(TimeLockOptionViewModel.class);
        timeLockOptionViewModel.f78093a.observe(this, new u<a>() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l.AnonymousClass2 */

            static {
                Covode.recordClassIndex(48393);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(a aVar) {
                l.this.f78050a.setRightTxt(l.this.getString(R.string.gh2, Integer.valueOf(aVar.f78057b)));
            }
        });
        if (timeLockOptionViewModel.f78093a.getValue() == null) {
            timeLockOptionViewModel.f78093a.setValue(new a(60));
        }
        this.f78053l.setTitle(getString(R.string.fn5));
        if (h()) {
            String str = g().getValue().f78095b.f78098c;
            if (!TextUtils.isEmpty(str)) {
                this.f78017c.setText(getString(R.string.bs3, str));
            } else {
                this.f78017c.setText(getString(R.string.do9));
            }
            this.f78051b.setTitle(getString(R.string.do_));
            this.f78052k.setTitle(getString(R.string.bs4));
            this.f78053l.setTitle(getString(R.string.bs5));
        }
    }
}
