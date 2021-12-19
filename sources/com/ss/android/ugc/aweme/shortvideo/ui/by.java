package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.b;
import com.bytedance.tux.navigation.a.d;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.shortvideo.model.CommentSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.DuetSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class by extends Fragment implements com.bytedance.tux.navigation.a {

    /* renamed from: a  reason: collision with root package name */
    public CommonItemView f131561a;

    /* renamed from: b  reason: collision with root package name */
    public CommonItemView f131562b;

    /* renamed from: c  reason: collision with root package name */
    public CommonItemView f131563c;

    /* renamed from: d  reason: collision with root package name */
    private CommentSettingItemStatus f131564d;

    /* renamed from: e  reason: collision with root package name */
    private CommonSettingItemStatus f131565e;

    /* renamed from: f  reason: collision with root package name */
    private CommonSettingItemStatus f131566f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f131567g;

    static {
        Covode.recordClassIndex(86166);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ by f131568a;

        static {
            Covode.recordClassIndex(86167);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            a.b.a(this.f131568a, c.d.f45284a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(by byVar) {
            this.f131568a = byVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f131567g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a b2 = new TuxNavBar.a().b(new b().a(R.raw.icon_x_mark_small).a((d) new a(this)));
        g gVar = new g();
        String string = getString(R.string.b05);
        l.b(string, "");
        TuxNavBar.a a2 = b2.a(gVar.a(string));
        a2.f45188d = true;
        return a2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(10366);
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.a1j, viewGroup, false);
        e activity = getActivity();
        if (activity != null) {
            this.f131564d = (CommentSettingItemStatus) ae.a(activity, (ad.b) null).a(CommentSettingItemStatus.class);
            this.f131565e = (CommonSettingItemStatus) ae.a(activity, (ad.b) null).a(DuetSettingItemStatus.class);
            this.f131566f = (CommonSettingItemStatus) ae.a(activity, (ad.b) null).a(StitchSettingItemStatus.class);
        }
        if (this.f131561a == null) {
            View inflate = ((ViewStub) a2.findViewById(R.id.aa3)).inflate();
            if (inflate != null) {
                CommonItemView commonItemView = (CommonItemView) inflate;
                this.f131561a = commonItemView;
                CommentSettingItemStatus commentSettingItemStatus = this.f131564d;
                if (commentSettingItemStatus != null) {
                    if (commonItemView == null) {
                        l.b();
                    }
                    commentSettingItemStatus.bindView(commonItemView, this);
                }
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
                MethodCollector.o(10366);
                throw nullPointerException;
            }
        }
        if (this.f131562b == null) {
            View inflate2 = ((ViewStub) a2.findViewById(R.id.aqs)).inflate();
            if (inflate2 != null) {
                CommonItemView commonItemView2 = (CommonItemView) inflate2;
                this.f131562b = commonItemView2;
                CommonSettingItemStatus commonSettingItemStatus = this.f131565e;
                if (commonSettingItemStatus != null) {
                    if (commonItemView2 == null) {
                        l.b();
                    }
                    commonSettingItemStatus.bindView(commonItemView2, this);
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
                MethodCollector.o(10366);
                throw nullPointerException2;
            }
        }
        if (this.f131563c == null) {
            View inflate3 = ((ViewStub) a2.findViewById(R.id.ebw)).inflate();
            if (inflate3 != null) {
                CommonItemView commonItemView3 = (CommonItemView) inflate3;
                this.f131563c = commonItemView3;
                CommonSettingItemStatus commonSettingItemStatus2 = this.f131566f;
                if (commonSettingItemStatus2 != null) {
                    if (commonItemView3 == null) {
                        l.b();
                    }
                    commonSettingItemStatus2.bindView(commonItemView3, this);
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
                MethodCollector.o(10366);
                throw nullPointerException3;
            }
        }
        MethodCollector.o(10366);
        return a2;
    }
}
