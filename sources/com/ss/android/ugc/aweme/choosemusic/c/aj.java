package com.ss.android.ugc.aweme.choosemusic.c;

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
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.model.b;
import com.ss.android.ugc.aweme.choosemusic.model.o;
import com.ss.android.ugc.aweme.choosemusic.view.y;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

public final class aj extends a implements a.AbstractC1507a<MusicCollectionItem>, com.ss.android.ugc.aweme.choosemusic.d.a<MusicCollectionItem>, h.a {

    /* renamed from: a  reason: collision with root package name */
    protected DataCenter f70431a;

    /* renamed from: b  reason: collision with root package name */
    protected c<MusicCollectionItem> f70432b;

    /* renamed from: c  reason: collision with root package name */
    protected int f70433c;

    /* renamed from: d  reason: collision with root package name */
    protected int f70434d;

    /* renamed from: e  reason: collision with root package name */
    private b f70435e;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.arch.a f70436j;

    /* renamed from: k  reason: collision with root package name */
    private final int f70437k = 20;

    static {
        Covode.recordClassIndex(43438);
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

    @Override // com.ss.android.ugc.aweme.choosemusic.d.a
    public final void t() {
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final DataCenter e() {
        DataCenter a2 = DataCenter.a(ae.a(this, (ad.b) null), this);
        this.f70431a = a2;
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.a
    public final void u() {
        b bVar = this.f70435e;
        if (bVar != null) {
            bVar.a(this.f70434d);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.a
    public final void v() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        b bVar = new b(getContext(), this.f70431a);
        this.f70435e = bVar;
        bVar.a(this.f70434d);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        DataCenter dataCenter;
        int intValue;
        c<MusicCollectionItem> cVar = this.f70432b;
        if (cVar != null) {
            cVar.a();
        }
        if (this.f70435e != null && (dataCenter = this.f70431a) != null) {
            Object a2 = ((com.ss.android.ugc.aweme.arch.b) dataCenter.a("music_sheet_list")).a("list_cursor");
            if (a2 instanceof Long) {
                intValue = ((Long) a2).intValue();
            } else if (a2 instanceof Integer) {
                intValue = ((Integer) a2).intValue();
            } else {
                return;
            }
            if (intValue > 0) {
                ChooseMusicApi.a(intValue, this.f70434d).a(new o(this.f70435e), i.f4826c, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final c<MusicCollectionItem> a(View view) {
        y yVar = new y(getContext(), view, this, this, this.f70433c);
        yVar.f70840a.setTitle(R.string.dco);
        this.f70432b = yVar;
        return yVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = 1;
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f70433c = i2;
        int i3 = 0;
        if (getArguments() != null) {
            i3 = getArguments().getInt("sound_page_scene", 0);
        }
        this.f70434d = i3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.choosemusic.d.a
    public final /* synthetic */ void b(MusicCollectionItem musicCollectionItem) {
        MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
        if (musicCollectionItem2 != null && !TextUtils.isEmpty(musicCollectionItem2.mcId)) {
            Intent intent = new Intent(getContext(), MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", musicCollectionItem2.mcId);
            intent.putExtra("music_class_name", musicCollectionItem2.mcName);
            intent.putExtra("music_category_is_hot", musicCollectionItem2.isHot);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f70433c);
            intent.putExtra("music_class_enter_method", "click_category_list");
            intent.putExtra("music_class_level", musicCollectionItem2.level);
            intent.putExtra("sound_page_scene", this.f70434d);
            startActivityForResult(intent, 10001);
            com.ss.android.ugc.aweme.choosemusic.utils.b.a(musicCollectionItem2.mcName, "click_category_list", "", "change_music_page_detail", musicCollectionItem2.mcId);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f70436j == null) {
            this.f70436j = new com.ss.android.ugc.aweme.arch.a(this);
        }
        this.f70436j.a(view);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.a1a, viewGroup, false);
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
