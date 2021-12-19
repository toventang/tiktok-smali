package com.ss.android.ugc.aweme.choosemusic.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.b;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.d.e;
import com.ss.android.ugc.aweme.choosemusic.view.ac;
import com.ss.android.ugc.aweme.choosemusic.viewholder.m;
import com.ss.android.ugc.aweme.choosemusic.viewholder.p;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.RecyclerMusicBoardWidget;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.f;
import com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.setting.bl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

public final class a extends b {

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.d.b f70270d;

    /* renamed from: e  reason: collision with root package name */
    public e f70271e;

    /* renamed from: f  reason: collision with root package name */
    public int f70272f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f70273g;

    /* renamed from: h  reason: collision with root package name */
    public k<c> f70274h;

    /* renamed from: i  reason: collision with root package name */
    private int f70275i;

    /* renamed from: j  reason: collision with root package name */
    private RecyclerView f70276j;

    /* renamed from: k  reason: collision with root package name */
    private int f70277k;
    private boolean w;
    private int x;
    private int y;

    static {
        Covode.recordClassIndex(43355);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.f
    public final int c() {
        if (this.w) {
            return this.f70272f + 1;
        }
        return this.f70272f;
    }

    public final void a() {
        if (((Integer) this.f66993b.b("music_position", (Object) -1)).intValue() != -1) {
            com.ss.android.ugc.aweme.choosemusic.d.b bVar = this.f70270d;
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
        if (this.f70277k != i2) {
            this.f70277k = i2;
            a(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.arch.widgets.b, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f70276j = recyclerView;
        recyclerView.a(new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.choosemusic.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43356);
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
        if (this.w) {
            if (i2 == 0) {
                return this.x;
            }
            if (i2 == 2) {
                return 1;
            }
            return 2;
        } else if (i2 == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.b
    public final ListItemWidget b(int i2) {
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 1) {
            MusicClassWidget musicClassWidget = new MusicClassWidget(this.y);
            if (this.w) {
                i2--;
            }
            musicClassWidget.f71051h = i2;
            musicClassWidget.f71052i = musicClassWidget.f71051h + 10086;
            return musicClassWidget;
        } else if (itemViewType != 2) {
            if (itemViewType == 4) {
                StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
                stickerMusicWidget.f71056h = this.f70270d;
                stickerMusicWidget.f71061m = this.f70274h;
                stickerMusicWidget.n = this.f70271e;
                stickerMusicWidget.f71058j = -2;
                stickerMusicWidget.f71059k = stickerMusicWidget.f71058j + 10086;
                return stickerMusicWidget;
            } else if (itemViewType != 5) {
                return null;
            } else {
                ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
                challengeMusicWidget.f71036i = this.f70270d;
                challengeMusicWidget.n = this.f70274h;
                challengeMusicWidget.o = this.f70271e;
                challengeMusicWidget.f71038k = -2;
                challengeMusicWidget.f71039l = challengeMusicWidget.f71038k + 10086;
                return challengeMusicWidget;
            }
        } else if (bl.a()) {
            RecyclerMusicBoardWidget recyclerMusicBoardWidget = new RecyclerMusicBoardWidget(this.y);
            recyclerMusicBoardWidget.f70965h = this.f70270d;
            recyclerMusicBoardWidget.p = this.f70274h;
            if (this.w) {
                i2--;
            }
            recyclerMusicBoardWidget.f70968k = i2;
            recyclerMusicBoardWidget.f70969l = recyclerMusicBoardWidget.f70968k + 10086;
            return recyclerMusicBoardWidget;
        } else {
            MusicBoardWidget musicBoardWidget = new MusicBoardWidget(this.y);
            musicBoardWidget.f71044h = this.f70270d;
            musicBoardWidget.p = this.f70274h;
            if (this.w) {
                i2--;
            }
            musicBoardWidget.f71047k = i2;
            musicBoardWidget.f71048l = musicBoardWidget.f71047k + 10086;
            return musicBoardWidget;
        }
    }

    public final void a(boolean z) {
        int measuredHeight;
        int measuredHeight2;
        RecyclerView.i layoutManager = this.f70276j.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int k2 = linearLayoutManager.k();
            int m2 = linearLayoutManager.m();
            for (int i2 = k2; i2 <= m2; i2++) {
                View childAt = this.f70276j.getChildAt(i2 - k2);
                if (childAt == null) {
                    return;
                }
                if (!this.v || i2 != c()) {
                    ListItemWidget a2 = a(i2);
                    int i3 = 0;
                    if (a2 instanceof MusicBoardWidget) {
                        if (z) {
                            ((MusicBoardWidget) a2).e();
                        }
                        if (childAt.getTop() <= 0) {
                            i3 = -childAt.getTop();
                        }
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int bottom = childAt.getBottom();
                        int i4 = this.f70277k;
                        if (bottom > i4) {
                            measuredHeight2 = (measuredHeight3 + i4) - childAt.getBottom();
                        } else {
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        ((MusicBoardWidget) a2).a(i3, measuredHeight2);
                    } else if (a2 instanceof RecyclerMusicBoardWidget) {
                        if (z) {
                            ((RecyclerMusicBoardWidget) a2).e();
                        }
                        if (childAt.getTop() <= 0) {
                            i3 = -childAt.getTop();
                        }
                        int measuredHeight4 = childAt.getMeasuredHeight();
                        int bottom2 = childAt.getBottom();
                        int i5 = this.f70277k;
                        if (bottom2 > i5) {
                            measuredHeight = (measuredHeight4 + i5) - childAt.getBottom();
                        } else {
                            measuredHeight = childAt.getMeasuredHeight();
                        }
                        ((RecyclerMusicBoardWidget) a2).a(i3, measuredHeight);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.arch.widgets.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new p(a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i2));
        }
        if (i2 == 4) {
            ac acVar = new ac(a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i2), this.f70275i);
            acVar.f70861h = ((Boolean) this.f66993b.a("mvtheme_music_type")).booleanValue();
            acVar.f70862i = ((Boolean) this.f66993b.a("is_photo_mv_type")).booleanValue();
            return acVar;
        } else if (i2 == 5) {
            return new com.ss.android.ugc.aweme.choosemusic.view.p(a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i2), this.f70275i);
        } else {
            if (bl.a()) {
                return new f(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ahc, viewGroup, false), this.f70275i);
            }
            return new m(a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i2), this.f70275i);
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

    public a(com.ss.android.ugc.aweme.arch.widgets.base.e eVar, DataCenter dataCenter, com.ss.android.ugc.aweme.choosemusic.d.b bVar, e eVar2, k<c> kVar, int i2, int i3) {
        super(eVar, dataCenter);
        this.f70270d = bVar;
        this.f70271e = eVar2;
        this.f70274h = kVar;
        this.f70275i = i2;
        this.y = i3;
    }
}
