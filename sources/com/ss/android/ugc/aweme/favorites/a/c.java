package com.ss.android.ugc.aweme.favorites.a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.favorites.g.e;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

public final class c extends f<Music> {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.favorites.g.f f90419a;

    /* renamed from: b  reason: collision with root package name */
    public int f90420b = -1;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f90421c;

    /* renamed from: d  reason: collision with root package name */
    private int f90422d = -1;

    /* renamed from: e  reason: collision with root package name */
    private e f90423e = new e() {
        /* class com.ss.android.ugc.aweme.favorites.a.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(56763);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.favorites.g.e
        public final void a(final RecyclerView.ViewHolder viewHolder, View view, final MusicModel musicModel) {
            MethodCollector.i(9623);
            if (musicModel == null || view == null || view.getContext() == null) {
                MethodCollector.o(9623);
                return;
            }
            view.getContext();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = a();
            }
            if (!j.f107229h) {
                new a(view.getContext()).a(R.string.de8).a();
                MethodCollector.o(9623);
                return;
            }
            int id = view.getId();
            if (id != R.id.don && id != R.id.e30) {
                if (id == R.id.cgx) {
                    if (c.this.f90420b == viewHolder.getAdapterPosition()) {
                        if (c.this.f90419a != null) {
                            c.this.l();
                        }
                    } else if (c.this.f90419a != null) {
                        c.this.l();
                        if (d.a(musicModel, view.getContext(), true)) {
                            c.this.f90420b = viewHolder.getAdapterPosition();
                            c.this.f90419a.a(musicModel);
                            com.ss.android.ugc.aweme.favorites.j.e eVar = (com.ss.android.ugc.aweme.favorites.j.e) viewHolder;
                            Animation loadAnimation = AnimationUtils.loadAnimation(eVar.itemView.getContext(), R.anim.da);
                            loadAnimation.setInterpolator(new LinearInterpolator());
                            eVar.f90689f.setImageResource(2131232034);
                            eVar.f90689f.startAnimation(loadAnimation);
                        }
                        c.this.notifyDataSetChanged();
                    }
                    r.a("click_music", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "collection_music").a("music_id", musicModel.getMusicId()).f66730a);
                }
                MethodCollector.o(9623);
            } else if (!MusicService.m().a(musicModel, view.getContext(), true)) {
                MethodCollector.o(9623);
            } else {
                Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                if (j2 == null || j2.isFinishing()) {
                    com.bytedance.ies.ugc.appcontext.d.a();
                }
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getShortVideoPluginService().a(new bb.a() {
                    /* class com.ss.android.ugc.aweme.favorites.a.c.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(56764);
                    }

                    @Override // com.ss.android.ugc.aweme.port.in.bb.a
                    public final void onSuccess() {
                        if (c.this.f90419a != null && viewHolder != null) {
                            c.this.f90419a.a(musicModel, viewHolder.getLayoutPosition(), AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                        }
                    }
                });
                MethodCollector.o(9623);
            }
        }
    };

    static {
        Covode.recordClassIndex(56762);
    }

    public final void l() {
        int i2 = this.f90420b;
        if (i2 != -1) {
            RecyclerView.ViewHolder f2 = this.f90421c.f(i2);
            if (f2 instanceof com.ss.android.ugc.aweme.favorites.j.e) {
                ((com.ss.android.ugc.aweme.favorites.j.e) f2).a(false);
            }
            this.f90420b = -1;
        }
        this.f90419a.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f90421c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f90421c = null;
    }

    public c(com.ss.android.ugc.aweme.favorites.g.f fVar) {
        this.f90419a = fVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new com.ss.android.ugc.aweme.favorites.j.e(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.zy, viewGroup, false), this.f90423e);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        TextView textView;
        String authorName;
        Music music = (Music) e().get(i2);
        com.ss.android.ugc.aweme.favorites.j.e eVar = (com.ss.android.ugc.aweme.favorites.j.e) viewHolder;
        if (i2 == this.f90420b) {
            z = true;
        } else {
            z = false;
        }
        if (music != null) {
            eVar.f90695l = music;
            if (music.getCoverMedium() != null && music.getCoverMedium().getUrlList() != null && music.getCoverMedium().getUrlList().size() > 0) {
                com.ss.android.ugc.aweme.base.e.b(eVar.f90687d, eVar.f90695l.getCoverMedium().getUrlList().get(0), -1, -1);
            } else if (music.getCoverThumb() != null && music.getCoverThumb().getUrlList() != null && music.getCoverThumb().getUrlList().size() > 0) {
                com.ss.android.ugc.aweme.base.e.b(eVar.f90687d, eVar.f90695l.getCoverThumb().getUrlList().get(0), -1, -1);
            } else if (music.getCoverLarge() == null || music.getCoverLarge().getUrlList() == null || music.getCoverLarge().getUrlList().size() <= 0) {
                com.ss.android.ugc.aweme.base.e.a(eVar.f90687d, 2131232036);
            } else {
                com.ss.android.ugc.aweme.base.e.b(eVar.f90687d, eVar.f90695l.getCoverLarge().getUrlList().get(0), -1, -1);
            }
            if (eVar.f90695l.getMatchedPGCSoundInfo() == null || TextUtils.isEmpty(eVar.f90695l.getMatchedPGCSoundInfo().getMixedAuthor())) {
                textView = eVar.f90686c;
                if (TextUtils.isEmpty(eVar.f90695l.getAuthorName())) {
                    authorName = eVar.itemView.getResources().getString(R.string.h4j);
                } else {
                    authorName = eVar.f90695l.getAuthorName();
                }
            } else {
                textView = eVar.f90686c;
                authorName = eVar.f90695l.getMatchedPGCSoundInfo().getMixedAuthor();
            }
            textView.setText(authorName);
            eVar.f90684a.setText(eVar.f90695l.getMusicName());
            if (TextUtils.isEmpty(eVar.f90695l.getMusicName()) || (!music.isOriginMusic() && !music.isArtistMusic())) {
                eVar.f90685b.setVisibility(8);
            } else {
                eVar.f90685b.setVisibility(0);
            }
            MusicService.m().a(eVar.f90684a, music);
            if (b.a().a(true, "remove_15s_cap_music", true)) {
                eVar.f90693j.setText(d.a(eVar.f90695l.getPresenterDuration() * 1000));
            } else {
                eVar.f90693j.setText(d.a(eVar.f90695l.getDuration() * 1000));
            }
            eVar.f90691h.setVisibility(8);
            eVar.a(z);
            eVar.c();
        }
    }
}
