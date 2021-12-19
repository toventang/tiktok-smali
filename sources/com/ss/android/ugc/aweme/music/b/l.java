package com.ss.android.ugc.aweme.music.b;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.favorites.g.e;
import com.ss.android.ugc.aweme.favorites.g.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.music.n;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class l extends h {

    /* renamed from: a  reason: collision with root package name */
    public f f111356a;

    /* renamed from: b  reason: collision with root package name */
    public int f111357b = -1;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f111358c;

    /* renamed from: d  reason: collision with root package name */
    public List<MusicModel> f111359d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public String f111360e;

    /* renamed from: f  reason: collision with root package name */
    public int f111361f;

    /* renamed from: g  reason: collision with root package name */
    public String f111362g;

    /* renamed from: h  reason: collision with root package name */
    private e f111363h = new e() {
        /* class com.ss.android.ugc.aweme.music.b.l.AnonymousClass2 */

        static {
            Covode.recordClassIndex(71553);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.favorites.g.e
        public final void a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
            String str;
            if (musicModel != null && view != null && view.getContext() != null) {
                if (view.getId() == R.id.don) {
                    if (MusicService.m().a(musicModel, view.getContext(), true)) {
                        if (!b.g().isLogin() && AVExternalServiceImpl.a().configService().avsettingsConfig().needLoginBeforeRecord()) {
                            bo b2 = b.b();
                            IAccountService.d dVar = new IAccountService.d();
                            dVar.f62401a = (Activity) view.getContext();
                            b2.showLoginAndRegisterView(dVar.a());
                            r.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_music_shoot"));
                        } else if (l.this.f111356a != null) {
                            l.this.f111356a.a(musicModel, viewHolder.getLayoutPosition(), false);
                            MobClick value = MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(musicModel.getMusicId());
                            c cVar = new c();
                            if (TextUtils.equals(b.g().getCurUserId(), l.this.f111360e)) {
                                str = "personal_homepage";
                            } else {
                                str = "others_homepage";
                            }
                            r.onEvent(value.setJsonObject(cVar.a("enter_from", str).a()));
                            r.a("shoot", new d().a("shoot_way", "single_song").a("music_id", musicModel.getMusicId()).f66730a);
                        }
                    }
                } else if (view.getId() == R.id.cgx) {
                    r.a("play_music", new d().a("enter_from", "personal_homepage_list").a("previous_page", l.this.f111362g).a("music_id", musicModel.getMusicId()).a("enter_method", "personal_list").f66730a);
                    view.getContext();
                    if (!j.f107229h || !j.b() || j.c()) {
                        j.f107229h = a();
                    }
                    if (!j.f107229h) {
                        new a(view.getContext()).a(R.string.de8).a();
                    } else if (l.this.f111357b == viewHolder.getAdapterPosition()) {
                        if (l.this.f111356a != null) {
                            l.this.e();
                        }
                    } else if (l.this.f111356a != null) {
                        l.this.e();
                        l.this.f111357b = viewHolder.getAdapterPosition();
                        l.this.f111356a.a(musicModel);
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(71551);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c() {
        return this.f111359d.size();
    }

    public final void e() {
        int i2 = this.f111357b;
        if (i2 != -1) {
            RecyclerView.ViewHolder f2 = this.f111358c.f(i2);
            if (f2 instanceof com.ss.android.ugc.aweme.music.j) {
                ((com.ss.android.ugc.aweme.music.j) f2).a(false);
            }
            this.f111357b = -1;
        }
        this.f111356a.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f111358c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f111358c = null;
    }

    public final void a(List<MusicModel> list) {
        this.f111359d.clear();
        this.f111359d.addAll(list);
        notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return super.c(i2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new com.ss.android.ugc.aweme.music.j(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aox, viewGroup, false), this.f111363h, this.f111362g);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        String str;
        if (viewHolder instanceof com.ss.android.ugc.aweme.music.j) {
            com.ss.android.ugc.aweme.music.j jVar = (com.ss.android.ugc.aweme.music.j) viewHolder;
            MusicModel musicModel = this.f111359d.get(i2);
            int i3 = 0;
            if (i2 == this.f111357b) {
                z = true;
            } else {
                z = false;
            }
            if (musicModel != null) {
                jVar.o = musicModel;
                jVar.f111538k.setBackground(androidx.core.content.b.a(jVar.f111538k.getContext(), (int) R.drawable.qc));
                if (!TextUtils.isEmpty(jVar.o.getName())) {
                    str = jVar.o.getName();
                } else {
                    str = "";
                }
                jVar.f111528a.setText(str);
                jVar.o.getMusic().isOriginMusic();
                jVar.f111528a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                jVar.f111536i.setOnClickListener(new n(jVar));
                jVar.f111540m.setText(jVar.q.getString(R.string.dno, Integer.valueOf(jVar.o.getUserCount())));
                if (com.bytedance.ies.abmock.b.a().a(true, "remove_15s_cap_music", true)) {
                    jVar.f111529b.setText(MusicService.m().a(jVar.o.getPresenterDuration()));
                    TextView textView = jVar.f111529b;
                    if (jVar.o.getPresenterDuration() <= 0) {
                        i3 = 4;
                    }
                    textView.setVisibility(i3);
                } else {
                    jVar.f111529b.setText(MusicService.m().a(jVar.o.getDuration()));
                    TextView textView2 = jVar.f111529b;
                    if (jVar.o.getDuration() <= 0) {
                        i3 = 4;
                    }
                    textView2.setVisibility(i3);
                }
                if (!TextUtils.isEmpty(jVar.o.getPicPremium())) {
                    com.ss.android.ugc.aweme.base.e.b(jVar.f111530c, jVar.o.getPicPremium(), -1, -1);
                } else if (!TextUtils.isEmpty(jVar.o.getPicBig())) {
                    com.ss.android.ugc.aweme.base.e.b(jVar.f111530c, jVar.o.getPicBig(), -1, -1);
                } else {
                    com.ss.android.ugc.aweme.base.e.a(jVar.f111530c, 2131233359);
                }
                jVar.a(z);
                if (jVar.o.getCollectionType() != null) {
                    jVar.p = MusicModel.CollectionType.COLLECTED.equals(jVar.o.getCollectionType());
                }
                jVar.a();
            }
        }
    }

    public l(com.ss.android.ugc.aweme.favorites.g.f fVar, String str, String str2) {
        this.f111356a = fVar;
        this.f111360e = str;
        this.f111362g = str2;
        registerAdapterDataObserver(new RecyclerView.c() {
            /* class com.ss.android.ugc.aweme.music.b.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71552);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a() {
                l lVar = l.this;
                lVar.f111361f = lVar.getItemCount();
                l.this.e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void b(int i2, int i3) {
                l lVar = l.this;
                lVar.f111361f = lVar.getItemCount();
                l.this.e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void c(int i2, int i3) {
                l lVar = l.this;
                lVar.f111361f = lVar.getItemCount();
                l.this.e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3) {
                l lVar = l.this;
                lVar.f111361f = lVar.getItemCount();
                l.this.e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, int i4) {
                l lVar = l.this;
                lVar.f111361f = lVar.getItemCount();
                l.this.e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, Object obj) {
                l lVar = l.this;
                lVar.f111361f = lVar.getItemCount();
                l.this.e();
            }
        });
    }
}
