package com.ss.android.ugc.aweme.choosemusic.c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.a;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.model.q;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.choosemusic.view.m;
import com.ss.android.ugc.aweme.choosemusic.view.u;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.ad;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.di.CommerceServiceImpl;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.c.d;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.g;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public final class af extends i implements h.a, h.a {

    /* renamed from: m  reason: collision with root package name */
    public String f70425m;
    public String n;
    public String o;
    ad p;
    private boolean q;
    private String r;
    private int s;
    private List<MusicModel> t;
    private int u;
    private int v;
    private int w;
    private String y;
    private boolean z;

    static {
        Covode.recordClassIndex(43432);
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String b() {
        return "music_list";
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String c() {
        return "refresh_status_music_list";
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String d() {
        return "loadmore_status_music_list";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final int o() {
        return 3;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final String p() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final int q() {
        return R.layout.a1a;
    }

    public final void u() {
        if (this.f70467d != null) {
            this.f70467d.a(this.f70425m, this.s, this.w);
        }
    }

    public final void v() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public final void t() {
        ShareInfo n2 = n();
        if (n2 != null) {
            ah.f123352a.a(getActivity(), n2, this.f70425m, "", new g() {
                /* class com.ss.android.ugc.aweme.choosemusic.c.af.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(43434);
                }

                @Override // com.ss.android.ugc.aweme.sharer.ui.g, com.ss.android.ugc.aweme.sharer.ui.f
                public final void a(com.ss.android.ugc.aweme.sharer.ui.h hVar, SharePackage sharePackage, Context context) {
                    super.a(hVar, sharePackage, context);
                    if (d.a(hVar)) {
                        b.a(af.this.o, af.this.f70425m, af.this.n, hVar.c());
                    }
                }

                @Override // com.ss.android.ugc.aweme.sharer.ui.b, com.ss.android.ugc.aweme.sharer.ui.g
                public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
                    super.a(bVar, z, sharePackage, context);
                    b.a(af.this.o, af.this.f70425m, af.this.n, bVar.a());
                }
            });
            String str = this.o;
            String str2 = this.f70425m;
            String str3 = this.n;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("enter_from", str).a("playlist_id", str2).a("playlist_name", str3);
            r.a("click_share_playlist_button", dVar.f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void m() {
        if (this.f70467d != null && this.f70468e != null) {
            com.ss.android.ugc.aweme.arch.b bVar = (com.ss.android.ugc.aweme.arch.b) this.f70468e.a("music_list");
            if ((this.f70469j instanceof m) && ((m) this.f70469j).f70849j) {
                if (this.f70469j != null) {
                    this.f70469j.a();
                }
                com.ss.android.ugc.aweme.choosemusic.model.b bVar2 = this.f70467d;
                String str = this.f70425m;
                int intValue = ((Integer) bVar.a("list_cursor")).intValue();
                int i2 = this.s;
                int i3 = this.w;
                if (!bVar2.f70645f) {
                    bVar2.f70645f = true;
                    ChooseMusicApi.a(str, intValue, 16, i2, i3).a(new q(bVar2), i.f4826c, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.i, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        super.a();
        if (this.t == null) {
            this.f70467d.a(this.f70425m, this.s, this.w);
            return;
        }
        this.f70468e.a("refresh_status_music_list", (Object) 0);
        com.ss.android.ugc.aweme.arch.b bVar = new com.ss.android.ugc.aweme.arch.b();
        bVar.a("list_cursor", Integer.valueOf(this.u)).a("list_hasmore", Integer.valueOf(this.v)).a("action_type", 1).a("list_data", this.t);
        this.f70468e.a("music_list", bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final c b(View view) {
        u uVar;
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            uVar = new u(getContext(), view, this, R.string.ant, this, this, this.f70471l);
        } else if (this.t != null) {
            uVar = new u(getContext(), view, this, this, this, this.f70471l);
        } else {
            uVar = new u(getContext(), view, this, R.string.dcj, this, this, this.f70471l);
        }
        if (this.s != 2) {
            uVar.f70840a.setTitle(this.n);
        } else if (uVar.f70843d != null) {
            uVar.f70843d.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uVar.f70842c.getLayoutParams();
        layoutParams.height = -1;
        uVar.f70842c.setLayoutParams(layoutParams);
        uVar.a(this.q);
        uVar.b(this.z);
        uVar.a(this);
        uVar.p = this.y;
        com.ss.android.ugc.aweme.choosemusic.b bVar = new com.ss.android.ugc.aweme.choosemusic.b(this.o, this.n, this.r, b.f70718a);
        bVar.a(this.f70425m);
        uVar.a(bVar);
        uVar.a(new ah(this));
        return uVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.choosemusic.c.i, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f70425m = arguments.getString("music_class_id");
            this.n = arguments.getString("music_class_name");
            this.o = arguments.getString("music_class_enter_from");
            this.q = arguments.getBoolean("music_class_is_hot", false);
            this.r = arguments.getString("music_class_enter_method");
            this.s = arguments.getInt("music_class_level");
            Serializable serializable = arguments.getSerializable("music_model_list");
            if (serializable instanceof List) {
                this.t = (List) serializable;
            }
            this.u = arguments.getInt("music_list_cursor");
            this.v = arguments.getInt("music_list_has_more");
            this.w = arguments.getInt("sound_page_scene", 0);
            this.y = arguments.getString("track_id");
            this.z = arguments.getBoolean("is_external");
        }
        this.p = CommerceServiceImpl.a().a(this.f70425m);
        String str = this.r;
        String str2 = b.f70718a;
        String str3 = this.f70425m;
        String str4 = this.n;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        dVar.a("enter_from", "change_music_page_detail").a("enter_method", str).a("previous_page", str2).a("category_id", str3).a("category_name", str4);
        r.a("playlist_page_show", dVar.f66730a);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.choosemusic.c.i, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ad adVar = this.p;
        if (adVar != null && adVar.f74851b != null && com.ss.android.ugc.aweme.music.a.b.a() != 0) {
            ((a) view.findViewById(R.id.em8)).a(false);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.em3);
            final RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.em4);
            viewGroup.setVisibility(0);
            e.a(remoteImageView, this.p.f74851b.f74852a, new com.facebook.drawee.c.c<f>() {
                /* class com.ss.android.ugc.aweme.choosemusic.c.af.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43433);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                    f fVar2 = fVar;
                    double width = (double) fVar2.getWidth();
                    double height = (double) fVar2.getHeight();
                    Double.isNaN(width);
                    Double.isNaN(height);
                    double a2 = (double) n.a(21.0d);
                    Double.isNaN(a2);
                    ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
                    layoutParams.width = (int) ((width / height) * a2);
                    layoutParams.height = (int) a2;
                    remoteImageView.setLayoutParams(layoutParams);
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "change_music_page");
                    hashMap.put("category_name", af.this.n);
                    r.a("show_ad_sticker", hashMap);
                }
            });
            viewGroup.setOnClickListener(new ag(this));
        }
    }

    public static af a(String str, String str2, String str3, int i2, boolean z2, String str4, int i3, com.ss.android.ugc.aweme.arch.b<String, Object> bVar, int i4, String str5, boolean z3) {
        af afVar = new af();
        Bundle bundle = new Bundle();
        bundle.putString("music_class_id", str);
        bundle.putString("music_class_name", str2);
        bundle.putString("music_class_enter_from", str3);
        bundle.putBoolean("music_class_is_hot", z2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        bundle.putString("music_class_enter_method", str4);
        bundle.putInt("music_class_level", i3);
        bundle.putInt("sound_page_scene", i4);
        if (bVar != null) {
            bundle.putSerializable("music_model_list", (Serializable) ((List) bVar.a("list_data")));
            bundle.putInt("music_list_cursor", ((Integer) bVar.a("list_cursor")).intValue());
            bundle.putInt("music_list_has_more", ((Integer) bVar.a("list_hasmore")).intValue());
        }
        bundle.putString("track_id", str5);
        bundle.putBoolean("is_external", z3);
        afVar.setArguments(bundle);
        return afVar;
    }
}
