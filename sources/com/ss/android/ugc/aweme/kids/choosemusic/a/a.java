package com.ss.android.ugc.aweme.kids.choosemusic.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.b;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.d.e;
import com.ss.android.ugc.aweme.kids.choosemusic.h.h;
import com.ss.android.ugc.aweme.kids.choosemusic.h.r;
import com.ss.android.ugc.aweme.kids.choosemusic.i.i;
import com.ss.android.ugc.aweme.kids.choosemusic.i.p;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBoardWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.StickerMusicWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends b {

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.d.b f105441d;

    /* renamed from: e  reason: collision with root package name */
    public e f105442e;

    /* renamed from: f  reason: collision with root package name */
    public int f105443f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f105444g;

    /* renamed from: h  reason: collision with root package name */
    public c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> f105445h;

    /* renamed from: i  reason: collision with root package name */
    private int f105446i;

    /* renamed from: j  reason: collision with root package name */
    private RecyclerView f105447j;

    /* renamed from: k  reason: collision with root package name */
    private int f105448k;
    private boolean w;
    private int x;

    static {
        Covode.recordClassIndex(67573);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.f
    public final int c() {
        if (this.w) {
            return this.f105443f + 1;
        }
        return this.f105443f;
    }

    public final void l() {
        if (((Integer) this.f66993b.b("music_position", (Object) -1)).intValue() != -1) {
            com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar = this.f105441d;
            if (bVar != null) {
                bVar.a((MusicModel) null);
            }
            this.f66993b.a("music_position", (Object) -1);
            this.f66993b.a("music_index", (Object) -1);
        }
    }

    public final void e(int i2) {
        this.w = true;
        this.x = i2;
    }

    public final void d(int i2) {
        if (this.f105448k != i2) {
            this.f105448k = i2;
            a(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.arch.widgets.b, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f105447j = recyclerView;
        recyclerView.a(new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67574);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                super.a(recyclerView, i2, i3);
                a.this.a(false);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        if (!this.w) {
            if (i2 == 0) {
                if (this.f105444g) {
                    return 3;
                }
            } else if (i2 == 1) {
                return 1;
            }
            return 2;
        } else if (i2 == 0) {
            return this.x;
        } else {
            if (i2 == 1) {
                if (this.f105444g) {
                    return 3;
                }
            } else if (i2 == 2) {
                return 1;
            }
            return 2;
        }
    }

    public final void a(boolean z) {
        int i2;
        int measuredHeight;
        RecyclerView.i layoutManager = this.f105447j.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int k2 = linearLayoutManager.k();
            int m2 = linearLayoutManager.m();
            for (int i3 = k2; i3 <= m2; i3++) {
                View childAt = this.f105447j.getChildAt(i3 - k2);
                if (childAt == null) {
                    return;
                }
                if (!this.v || i3 != c()) {
                    ListItemWidget a2 = a(i3);
                    if (a2 instanceof MusicBoardWidget) {
                        if (z) {
                            ((MusicBoardWidget) a2).e();
                        }
                        if (childAt.getTop() > 0) {
                            i2 = 0;
                        } else {
                            i2 = -childAt.getTop();
                        }
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        int bottom = childAt.getBottom();
                        int i4 = this.f105448k;
                        if (bottom > i4) {
                            measuredHeight = (measuredHeight2 + i4) - childAt.getBottom();
                        } else {
                            measuredHeight = childAt.getMeasuredHeight();
                        }
                        ((MusicBoardWidget) a2).a(i2, measuredHeight);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.b
    public final ListItemWidget b(int i2) {
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 1) {
            MusicClassWidget musicClassWidget = new MusicClassWidget();
            if (this.w) {
                i2--;
            }
            musicClassWidget.f105851h = i2;
            musicClassWidget.f105852i = musicClassWidget.f105851h + 10086;
            return musicClassWidget;
        } else if (itemViewType == 2) {
            MusicBoardWidget musicBoardWidget = new MusicBoardWidget();
            musicBoardWidget.f105844h = this.f105441d;
            musicBoardWidget.p = this.f105445h;
            if (this.w) {
                i2--;
            }
            musicBoardWidget.f105847k = i2;
            musicBoardWidget.f105848l = musicBoardWidget.f105847k + 10086;
            return musicBoardWidget;
        } else if (itemViewType == 3) {
            MusicRadioWidget musicRadioWidget = new MusicRadioWidget();
            com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar = this.f105441d;
            l.d(bVar, "");
            musicRadioWidget.f105857j = bVar;
            musicRadioWidget.f105858k = this.f105445h;
            e eVar = this.f105442e;
            l.d(eVar, "");
            musicRadioWidget.f105859l = eVar;
            if (this.w) {
                i2--;
            }
            musicRadioWidget.f105856i = i2;
            return musicRadioWidget;
        } else if (itemViewType == 4) {
            StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
            stickerMusicWidget.f105865h = this.f105441d;
            stickerMusicWidget.f105870m = this.f105445h;
            stickerMusicWidget.n = this.f105442e;
            stickerMusicWidget.f105867j = -2;
            stickerMusicWidget.f105868k = stickerMusicWidget.f105867j + 10086;
            return stickerMusicWidget;
        } else if (itemViewType != 5) {
            return null;
        } else {
            ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
            challengeMusicWidget.f105837i = this.f105441d;
            challengeMusicWidget.n = this.f105445h;
            challengeMusicWidget.o = this.f105442e;
            challengeMusicWidget.f105839k = -2;
            challengeMusicWidget.f105840l = challengeMusicWidget.f105839k + 10086;
            return challengeMusicWidget;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.arch.widgets.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new com.ss.android.ugc.aweme.kids.choosemusic.i.l(a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i2));
        }
        if (i2 == 3) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            l.d(from, "");
            l.d(viewGroup, "");
            View a2 = com.a.a(from, R.layout.adn, viewGroup, false);
            l.b(a2, "");
            return new p(a2);
        } else if (i2 == 4) {
            r rVar = new r(a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i2), this.f105446i);
            rVar.f105712h = ((Boolean) this.f66993b.a("mvtheme_music_type")).booleanValue();
            rVar.f105713i = ((Boolean) this.f66993b.a("is_photo_mv_type")).booleanValue();
            return rVar;
        } else if (i2 != 5) {
            return new i(a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i2), this.f105446i);
        } else {
            return new h(a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i2), this.f105446i);
        }
    }

    private static View a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return com.a.a(layoutInflater, R.layout.agp, viewGroup, false);
        }
        if (i2 == 5 || i2 == 4) {
            return com.a.a(layoutInflater, R.layout.aef, viewGroup, false);
        }
        return com.a.a(layoutInflater, R.layout.ago, viewGroup, false);
    }

    public a(com.ss.android.ugc.aweme.arch.widgets.base.e eVar, DataCenter dataCenter, com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar, e eVar2, c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> cVar, int i2) {
        super(eVar, dataCenter);
        this.f105441d = bVar;
        this.f105442e = eVar2;
        this.f105445h = cVar;
        this.f105446i = i2;
    }
}
