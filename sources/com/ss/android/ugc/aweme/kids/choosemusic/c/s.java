package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.a;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.kids.a.e.d;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.kids.choosemusic.e.g;
import com.ss.android.ugc.aweme.kids.choosemusic.h.n;
import com.zhiliaoapp.musically.R;

public final class s extends a implements a.AbstractC1507a<d>, h.a, com.ss.android.ugc.aweme.kids.choosemusic.d.a<d> {

    /* renamed from: a  reason: collision with root package name */
    protected DataCenter f105572a;

    /* renamed from: b  reason: collision with root package name */
    protected c<d> f105573b;

    /* renamed from: c  reason: collision with root package name */
    protected int f105574c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.choosemusic.e.a f105575d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.arch.a f105576e;

    /* renamed from: j  reason: collision with root package name */
    private final int f105577j = 20;

    static {
        Covode.recordClassIndex(67630);
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String b() {
        return "music_sheet_list";
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String c() {
        return "refresh_status_music_sheet";
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String d() {
        return "loadmore_status_music_sheet";
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final void q() {
        com.ss.android.ugc.aweme.kids.choosemusic.e.a aVar = this.f105575d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final DataCenter e() {
        DataCenter a2 = DataCenter.a(ae.a(this, (ad.b) null), this);
        this.f105572a = a2;
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final void r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        com.ss.android.ugc.aweme.kids.choosemusic.e.a aVar = new com.ss.android.ugc.aweme.kids.choosemusic.e.a(getContext(), this.f105572a);
        this.f105575d = aVar;
        aVar.a();
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        DataCenter dataCenter;
        int intValue;
        c<d> cVar = this.f105573b;
        if (cVar != null) {
            cVar.a();
        }
        if (this.f105575d != null && (dataCenter = this.f105572a) != null) {
            Object a2 = ((b) dataCenter.a("music_sheet_list")).a("list_cursor");
            if (a2 instanceof Long) {
                intValue = ((Long) a2).intValue();
            } else if (a2 instanceof Integer) {
                intValue = ((Integer) a2).intValue();
            } else {
                return;
            }
            if (intValue > 0) {
                ChooseMusicApi.b(intValue).a(new g(this.f105575d), i.f4826c, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final c<d> a(View view) {
        n nVar = new n(getContext(), view, this, this, this.f105574c);
        nVar.f105691a.setTitle(R.string.dco);
        this.f105573b = nVar;
        return nVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = 1;
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f105574c = i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final /* synthetic */ void b(d dVar) {
        d dVar2 = dVar;
        if (dVar2 != null && !TextUtils.isEmpty(dVar2.f105308a)) {
            Intent intent = new Intent(getContext(), MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", dVar2.f105308a);
            intent.putExtra("music_class_name", dVar2.f105309b);
            intent.putExtra("music_category_is_hot", dVar2.f105312e);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f105574c);
            intent.putExtra("music_class_enter_method", "click_category_list");
            intent.putExtra("music_class_level", dVar2.f105313f);
            startActivityForResult(intent, 10001);
            com.ss.android.ugc.aweme.kids.choosemusic.g.c.a(dVar2.f105309b, "click_category_list", "", "change_music_page_detail", dVar2.f105308a);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f105576e == null) {
            this.f105576e = new com.ss.android.ugc.aweme.arch.a(this);
        }
        this.f105576e.a(view);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.adi, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 10001 && i3 == -1) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }
}
