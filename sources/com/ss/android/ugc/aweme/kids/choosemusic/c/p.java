package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.model.ad;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.kids.choosemusic.d.a;
import com.ss.android.ugc.aweme.kids.choosemusic.e.i;
import com.ss.android.ugc.aweme.kids.choosemusic.h.e;
import com.ss.android.ugc.aweme.kids.choosemusic.h.m;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;

public final class p extends d implements h.a, a {

    /* renamed from: l  reason: collision with root package name */
    private String f105567l;

    /* renamed from: m  reason: collision with root package name */
    private String f105568m;
    private String n;
    private boolean o;
    private String p;
    private ad q;
    private int r;
    private List<MusicModel> s;
    private int t;
    private int u;

    static {
        Covode.recordClassIndex(67626);
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String b() {
        return "music_list";
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
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
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final int n() {
        return 3;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final String o() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final void q() {
        if (this.f105530d != null) {
            this.f105530d.a(this.f105567l, this.r);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final void r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void m() {
        if (this.f105530d != null && this.f105531e != null) {
            b bVar = (b) this.f105531e.a("music_list");
            if ((this.f105532j instanceof e) && ((e) this.f105532j).f105699i) {
                if (this.f105532j != null) {
                    this.f105532j.a();
                }
                com.ss.android.ugc.aweme.kids.choosemusic.e.a aVar = this.f105530d;
                String str = this.f105567l;
                int intValue = ((Integer) bVar.a("list_cursor")).intValue();
                int i2 = this.r;
                if (!aVar.f105593e) {
                    aVar.f105593e = true;
                    ChooseMusicApi.a(str, intValue, 16, i2).a(new i(aVar), b.i.f4826c, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        super.a();
        if (this.s == null) {
            this.f105530d.a(this.f105567l, this.r);
            return;
        }
        this.f105531e.a("refresh_status_music_list", (Object) 0);
        b bVar = new b();
        bVar.a("list_cursor", Integer.valueOf(this.t)).a("list_hasmore", Integer.valueOf(this.u)).a("action_type", 1).a("list_data", this.s);
        this.f105531e.a("music_list", bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final c b(View view) {
        m mVar;
        if (this.s != null) {
            mVar = new m(getContext(), view, this, this, this, this.f105533k);
        } else {
            mVar = new m(getContext(), view, this, R.string.cn4, this, this, this.f105533k);
        }
        if (this.r != 2) {
            mVar.f105691a.setTitle(this.f105568m);
        } else if (mVar.f105694d != null) {
            mVar.f105694d.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mVar.f105693c.getLayoutParams();
        layoutParams.height = -1;
        mVar.f105693c.setLayoutParams(layoutParams);
        mVar.a(this.o);
        mVar.a(this);
        com.ss.android.ugc.aweme.kids.choosemusic.a aVar = new com.ss.android.ugc.aweme.kids.choosemusic.a(this.n, this.f105568m, this.p, com.ss.android.ugc.aweme.kids.choosemusic.g.c.f105649a);
        aVar.a(this.f105567l);
        mVar.a(aVar);
        mVar.a(new q(this));
        return mVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.kids.choosemusic.c.d, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f105567l = arguments.getString("music_class_id");
            this.f105568m = arguments.getString("music_class_name");
            this.n = arguments.getString("music_class_enter_from");
            this.o = arguments.getBoolean("music_class_is_hot", false);
            this.p = arguments.getString("music_class_enter_method");
            this.r = arguments.getInt("music_class_level");
            Serializable serializable = arguments.getSerializable("music_model_list");
            if (serializable instanceof List) {
                this.s = (List) serializable;
            }
            this.t = arguments.getInt("music_list_cursor");
            this.u = arguments.getInt("music_list_has_more");
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ad adVar = this.q;
        if (adVar != null && adVar.f74851b != null) {
            ((com.bytedance.ies.dmt.ui.titlebar.a) view.findViewById(R.id.em8)).a(false);
            final RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.em4);
            ((ViewGroup) view.findViewById(R.id.em3)).setVisibility(0);
            com.ss.android.ugc.aweme.base.e.a(remoteImageView, this.q.f74851b.f74852a, new com.facebook.drawee.c.c<f>() {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.c.p.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(67627);
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
                }
            });
        }
    }

    public static p a(String str, String str2, String str3, int i2, boolean z, String str4, int i3, b<String, Object> bVar) {
        p pVar = new p();
        Bundle bundle = new Bundle();
        bundle.putString("music_class_id", str);
        bundle.putString("music_class_name", str2);
        bundle.putString("music_class_enter_from", str3);
        bundle.putBoolean("music_class_is_hot", z);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        bundle.putString("music_class_enter_method", str4);
        bundle.putInt("music_class_level", i3);
        if (bVar != null) {
            bundle.putSerializable("music_model_list", (Serializable) ((List) bVar.a("list_data")));
            bundle.putInt("music_list_cursor", ((Integer) bVar.a("list_cursor")).intValue());
            bundle.putInt("music_list_has_more", ((Integer) bVar.a("list_hasmore")).intValue());
        }
        pVar.setArguments(bundle);
        return pVar;
    }
}
