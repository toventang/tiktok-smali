package com.ss.android.ugc.aweme.choosemusic.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.g.d;
import com.ss.android.ugc.aweme.choosemusic.model.u;
import com.ss.android.ugc.aweme.choosemusic.model.z;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class ab extends i implements h.a, h.a {

    /* renamed from: m  reason: collision with root package name */
    private u f70421m;
    private long n;
    private Handler o = new SafeHandler(this);
    private boolean p = false;

    static {
        Covode.recordClassIndex(43428);
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String b() {
        return "local_music_list_data";
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String c() {
        return "local_music_list_status";
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String d() {
        return "local_music_list_load_more_status";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final int o() {
        return 5;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final String p() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final int q() {
        return R.layout.a1b;
    }

    public final void t() {
    }

    public final void u() {
        if (this.f70421m != null) {
            w();
        }
    }

    public final void v() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    private void w() {
        if (d.a()) {
            this.f70421m.c(new WeakReference<>(getActivity()));
        } else {
            this.f70421m.a(new WeakReference<>(getActivity()));
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.i, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        super.a();
        this.f70421m = new u(this.f70468e);
        this.o.postDelayed(new ac(this), 5000);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void s() {
        u uVar;
        if (d.a() && (uVar = this.f70421m) != null && !uVar.f70688b) {
            if (this.f70469j != null) {
                this.f70469j.a();
            }
            u uVar2 = this.f70421m;
            WeakReference<Activity> weakReference = new WeakReference<>(getActivity());
            long currentTimeMillis = System.currentTimeMillis();
            if (!uVar2.f70689c) {
                uVar2.f70689c = true;
                uVar2.b(weakReference).a(new z(uVar2, weakReference, currentTimeMillis), i.f4826c, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        if (!this.p && getActivity() != null) {
            this.p = true;
            if (b.a(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || this.f70421m == null) {
                com.ss.android.ugc.aweme.ce.b.a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new ad(this));
            } else {
                w();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.choosemusic.c.i, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = System.currentTimeMillis();
    }

    public static Fragment a(int i2) {
        ab abVar = new ab();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        abVar.setArguments(bundle);
        return abVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final c b(View view) {
        com.ss.android.ugc.aweme.choosemusic.view.u uVar = new com.ss.android.ugc.aweme.choosemusic.view.u(getContext(), view, this, this, this.f70471l);
        uVar.o = this.n;
        l.d(this, "");
        TuxStatusView.c cVar = new TuxStatusView.c();
        String string = getString(R.string.dcw);
        l.b(string, "");
        TuxStatusView.c a2 = cVar.a(string);
        String string2 = getString(R.string.cz5);
        l.b(string2, "");
        uVar.f70850k = a2.a((CharSequence) string2).a(com.bytedance.tux.c.c.a(a.C1590a.f70278a));
        uVar.a(R.string.dcw);
        uVar.a(this);
        uVar.a(new com.ss.android.ugc.aweme.choosemusic.b("change_music_page_detail", "local_music", "click_button", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a));
        if (d.a()) {
            uVar.a(new ae(this));
        }
        uVar.f70842c.setVisibility(0);
        uVar.f();
        return uVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final void a(String str, MusicModel musicModel, String str2, Activity activity) {
        String name;
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (musicModel == null) {
            name = "";
        } else {
            name = musicModel.getName();
        }
        intent.putExtra("local_music_name", name);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
