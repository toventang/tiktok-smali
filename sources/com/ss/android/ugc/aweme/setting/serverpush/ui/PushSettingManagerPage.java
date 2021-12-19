package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

@com.bytedance.ies.powerpage.a.a
public final class PushSettingManagerPage extends com.ss.android.ugc.aweme.setting.page.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f122597e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f122598f;

    static {
        Covode.recordClassIndex(80448);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122598f == null) {
            this.f122598f = new SparseArray();
        }
        View view = (View) this.f122598f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122598f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122598f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.ay8;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80449);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Intent intent;
        Fragment aVar;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            Fragment a2 = fragmentManager.a("FRAGMENT_PUSH_MANAGER_LIST");
            if (a2 == null) {
                IAccountUserService g2 = b.g();
                l.b(g2, "");
                if (!g2.isLogin()) {
                    aVar = new m();
                    aVar.setArguments(new Bundle());
                } else if (Build.VERSION.SDK_INT < 26 || !com.bytedance.ies.abmock.b.a().a(false, "enable_notification_category", false)) {
                    aVar = new a();
                    aVar.setArguments(new Bundle());
                } else {
                    aVar = new g();
                    aVar.setArguments(new Bundle());
                }
                a2 = aVar;
            }
            Bundle bundle2 = new Bundle();
            e activity = getActivity();
            if (activity == null || (intent = activity.getIntent()) == null) {
                str = null;
            } else {
                str = a(intent, "enter_from");
            }
            bundle2.putString("enter_from", str);
            if (a2 != null) {
                a2.setArguments(bundle2);
                n a3 = fragmentManager.a();
                l.b(a3, "");
                a3.b(R.id.b94, a2, "FRAGMENT_PUSH_MANAGER_LIST").c();
            }
        }
    }
}
