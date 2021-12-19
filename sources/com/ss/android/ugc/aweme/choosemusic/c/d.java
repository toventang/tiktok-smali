package com.ss.android.ugc.aweme.choosemusic.c;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.arch.widgets.base.e;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.af;
import com.ss.android.ugc.aweme.choosemusic.model.m;
import com.ss.android.ugc.aweme.choosemusic.view.ab;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.setting.bl;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.List;

public abstract class d extends a implements u<b>, h.a, a.AbstractC1744a {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f70451a;

    /* renamed from: b  reason: collision with root package name */
    TuxStatusView f70452b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f70453c;

    /* renamed from: d  reason: collision with root package name */
    public e f70454d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.a.a f70455e;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.choosemusic.d.b f70456j;

    /* renamed from: k  reason: collision with root package name */
    com.ss.android.ugc.aweme.choosemusic.d.e f70457k;

    /* renamed from: l  reason: collision with root package name */
    k<c> f70458l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.model.b f70459m;
    private int n;
    private int o;
    private int p;

    static {
        Covode.recordClassIndex(43450);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(b bVar);

    /* access modifiers changed from: protected */
    public abstract void b();

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        return this.f70451a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z e() {
        d();
        return z.f158842a;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void d() {
        com.ss.android.ugc.aweme.choosemusic.a.a aVar;
        i<af> iVar;
        int i2 = this.o - 2;
        if (i2 < 0) {
            i2 = 0;
        }
        com.ss.android.ugc.aweme.choosemusic.model.b bVar = this.f70459m;
        int i3 = this.p;
        if (!bVar.f70642c) {
            bVar.f70642c = true;
            o a2 = o.a();
            Integer valueOf = Integer.valueOf(i2);
            if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
                iVar = ChooseMusicApi.f70375a.commerceMusicCollectionFeed(valueOf, 10);
            } else {
                iVar = ChooseMusicApi.f70375a.musicCollectionFeed(valueOf, 10, i3);
            }
            iVar.a(new m(bVar, a2), i.f4826c, null);
        }
        if (ab_() && (aVar = this.f70455e) != null) {
            aVar.ag_();
        }
    }

    public final void a(int i2) {
        com.ss.android.ugc.aweme.choosemusic.a.a aVar = this.f70455e;
        if (aVar != null) {
            aVar.d(i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        com.ss.android.ugc.aweme.choosemusic.a.a aVar;
        super.setUserVisibleHint(z);
        if (this.f70451a != null && z && (aVar = this.f70455e) != null) {
            aVar.a(true);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i2;
        int i3;
        super.onCreate(bundle);
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i2 = 1;
        }
        this.n = i2;
        if (getArguments() != null) {
            i3 = getArguments().getInt("sound_page_scene");
        } else {
            i3 = 0;
        }
        this.p = i3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        List list;
        Integer num;
        b bVar2 = bVar;
        String str = bVar2.f67014a;
        str.hashCode();
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    a(bVar2);
                    return;
                }
                return;
            case 3322014:
                if (str.equals("list") && (list = (List) this.f70453c.a("list")) != null && list.size() > 0) {
                    AVExternalServiceImpl.a().provideAVPerformance().end(OpenMusicPanelPerformanceMonitor.f114756a, "set_music_data");
                    int itemCount = this.f70455e.getItemCount();
                    this.o = list.size();
                    boolean booleanValue = ((Boolean) this.f70453c.b("is_busi_sticker", (Object) false)).booleanValue();
                    if ("challenge".equals(this.f70453c.b("shoot_way", (Object) null))) {
                        if (this.f70453c.a("data_challenge") != null) {
                            this.f70455e.e(5);
                        } else {
                            List list2 = (List) this.f70453c.b("data_sticker", (Object) null);
                            if (list2 != null && list2.size() > 0) {
                                this.f70455e.e(4);
                            }
                        }
                    } else if (booleanValue) {
                        b();
                    } else {
                        List list3 = (List) this.f70453c.b("data_sticker", (Object) null);
                        if (list3 != null && list3.size() > 0) {
                            this.f70455e.e(4);
                        } else if (this.f70453c.a("data_challenge") != null) {
                            this.f70455e.e(5);
                        }
                    }
                    this.f70455e.f70273g = ((Boolean) this.f70453c.b("show_music_radio", (Object) false)).booleanValue();
                    this.f70455e.f70272f = this.o;
                    int itemCount2 = this.f70455e.getItemCount() - itemCount;
                    if (itemCount2 <= 0) {
                        this.f70455e.notifyDataSetChanged();
                    } else if (TextUtils.equals(Build.MODEL, "Redmi 6A") || TextUtils.equals(Build.MODEL, "Redmi 6")) {
                        this.f70455e.notifyDataSetChanged();
                    } else {
                        this.f70455e.notifyItemRangeInserted(itemCount, itemCount2);
                    }
                    if (this.f70453c.a("collection_feed_has_more") == null) {
                        return;
                    }
                    if (((Integer) this.f70453c.a("collection_feed_has_more")).intValue() == 1) {
                        this.f70455e.ai_();
                        return;
                    } else {
                        a();
                        return;
                    }
                } else {
                    return;
                }
            case 510590654:
                if (str.equals("should_load_more_pick")) {
                    this.f70459m.a(true, (String) null, (Music) null, false, this.p);
                    return;
                }
                return;
            case 1110903186:
                if (str.equals("collection_feed_status") && (num = (Integer) this.f70453c.a("collection_feed_status")) != null && num.intValue() == 1) {
                    a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2;
        if (bl.a()) {
            a2 = com.a.a(layoutInflater, R.layout.a0v, viewGroup, false);
        } else {
            a2 = com.a.a(layoutInflater, R.layout.a19, viewGroup, false);
        }
        this.f70451a = (RecyclerView) a2.findViewById(R.id.cb7);
        this.f70452b = (TuxStatusView) a2.findViewById(R.id.e_o);
        com.ss.android.ugc.aweme.choosemusic.a.a aVar = new com.ss.android.ugc.aweme.choosemusic.a.a(this.f70454d, this.f70453c, this.f70456j, this.f70457k, this.f70458l, this.n, this.p);
        this.f70455e = aVar;
        aVar.a((h.a) this);
        this.f70455e.g(androidx.core.content.b.c(getContext(), R.color.c5));
        this.f70451a.setOverScrollMode(2);
        RecyclerView recyclerView = this.f70451a;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f70451a.setRecycledViewPool(MusicRecyclerViewPoolViewModel.a.a(viewGroup.getContext()));
        this.f70451a.setAdapter(this.f70455e);
        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) ae.a(requireActivity(), (ad.b) null).a(ChooseMusicWithSceneViewModel.class);
        if (chooseMusicWithSceneViewModel.f70572a) {
            chooseMusicWithSceneViewModel.d().observe(this, new e(this));
        } else {
            new ab(new f(this), 5).a(this.f70451a);
        }
        this.f70453c.a("list", this, bl.a()).a("should_load_more_pick", (u<b>) this).a("music_collect_status", (u<b>) this).a("collection_feed_status", (u<b>) this);
        return a2;
    }
}
