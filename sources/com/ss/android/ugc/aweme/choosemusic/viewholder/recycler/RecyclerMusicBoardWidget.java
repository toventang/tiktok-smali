package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.model.ad;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.a;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.b;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.f;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public class RecyclerMusicBoardWidget extends ListItemWidget<f> implements u<b>, au {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.d.b f70965h;

    /* renamed from: i  reason: collision with root package name */
    public int f70966i;

    /* renamed from: j  reason: collision with root package name */
    int f70967j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f70968k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f70969l;

    /* renamed from: m  reason: collision with root package name */
    int f70970m;
    com.ss.android.ugc.aweme.choosemusic.b n;
    List<MusicModel> o;
    public k<c> p;
    boolean[] q = new boolean[3];
    boolean[] r = new boolean[3];
    int s;
    private ViewPager.e t = new ViewPager.e() {
        /* class com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.RecyclerMusicBoardWidget.AnonymousClass1 */

        static {
            Covode.recordClassIndex(43699);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            RecyclerMusicBoardWidget.this.f70966i = i2;
            for (int i3 = 0; i3 < RecyclerMusicBoardWidget.this.r.length; i3++) {
                RecyclerMusicBoardWidget.this.r[i3] = RecyclerMusicBoardWidget.this.q[i3];
            }
            RecyclerMusicBoardWidget.this.f();
        }
    };

    static {
        Covode.recordClassIndex(43698);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void g() {
        this.f70965h.a((MusicModel) null);
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.r;
            if (i2 < zArr.length) {
                this.q[i2] = false;
                zArr[i2] = false;
                i2++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.o)) {
            int i2 = this.f70966i;
            if (i2 < 0) {
                i2 = 0;
            }
            int min = Math.min(i2 + 3, this.o.size());
            for (int i3 = i2; i3 < min; i3++) {
                boolean[] zArr = this.r;
                int i4 = i3 - i2;
                if (zArr[i4]) {
                    zArr[i4] = false;
                    MusicModel musicModel = this.o.get(i3);
                    if (musicModel != null) {
                        com.ss.android.ugc.aweme.choosemusic.utils.b.a(this.n, musicModel.getMusicId(), i3);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67010e.a("list", (u<b>) this).a("music_index", (u<b>) this).a("music_collect_status", (u<b>) this).a("play_compeleted", (u<b>) this).a("music_loading", (u<b>) this);
        this.f70970m = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
    }

    public RecyclerMusicBoardWidget(int i2) {
        this.s = i2;
    }

    private void a(List<Object> list) {
        if (list != null && this.f70968k < list.size()) {
            a(((ad) list.get(this.f70968k)).f70609b, ((ad) list.get(this.f70968k)).f70608a);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void a(a aVar) {
        super.a(aVar);
        a((List) this.f67010e.a("list"));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        MusicModel.CollectionType collectionType;
        c a2;
        a aVar;
        b bVar2 = bVar;
        String str = bVar2.f67014a;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1322093457:
                if (str.equals("play_compeleted")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3322014:
                if (str.equals("list")) {
                    c2 = 2;
                    break;
                }
                break;
            case 502104354:
                if (str.equals("music_loading")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1579846200:
                if (str.equals("music_index")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                com.ss.android.ugc.aweme.choosemusic.b.a aVar2 = (com.ss.android.ugc.aweme.choosemusic.b.a) bVar2.a();
                if (((aVar2.f70389a == 1 && this.f70968k == aVar2.f70390b) || aVar2.f70389a == 0) && ((ListItemWidget) this).f66990a != null) {
                    f fVar = (f) ((ListItemWidget) this).f66990a;
                    int childCount = fVar.f70986b.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        RecyclerView.ViewHolder f2 = fVar.f70986b.f(i2);
                        if (f2 instanceof s) {
                            com.ss.android.ugc.aweme.choosemusic.viewholder.a aVar3 = (com.ss.android.ugc.aweme.choosemusic.viewholder.a) f2;
                            MusicModel musicModel = aVar2.f70393e;
                            if (!(musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || aVar3.w == null)) {
                                String musicId = musicModel.getMusicId();
                                MusicModel musicModel2 = aVar3.w;
                                l.b(musicModel2, "");
                                if (l.a((Object) musicId, (Object) musicModel2.getMusicId())) {
                                    MusicModel musicModel3 = aVar3.w;
                                    l.b(musicModel3, "");
                                    if (aVar2.f70392d == 1) {
                                        collectionType = MusicModel.CollectionType.COLLECTED;
                                    } else {
                                        collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                    }
                                    musicModel3.setCollectionType(collectionType);
                                    aVar3.d();
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                b(((Integer) this.f67010e.b("music_position", (Object) -1)).intValue(), ((Integer) this.f67010e.b("music_index", (Object) -1)).intValue());
                this.f67010e.a("music_position", (Object) -1);
                this.f67010e.a("music_index", (Object) -1);
                g();
                return;
            case 2:
                if (((ListItemWidget) this).f66990a != null) {
                    a((List) bVar2.a());
                    return;
                }
                return;
            case 3:
                if (((ListItemWidget) this).f66990a != null) {
                    f fVar2 = (f) ((ListItemWidget) this).f66990a;
                    int i3 = this.f70967j;
                    boolean booleanValue = ((Boolean) this.f67010e.a("music_loading")).booleanValue();
                    if (i3 >= 0 && (a2 = fVar2.f70987c.a(i3)) != null) {
                        f.c cVar = fVar2.f70987c;
                        b.C1602b bVar3 = b.C1602b.f70976a;
                        if (booleanValue) {
                            aVar = a.b.f70973a;
                        } else {
                            aVar = a.C1601a.f70972a;
                        }
                        cVar.a(i3, c.a(a2, null, aVar, bVar3, 1));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                b(((Integer) this.f67010e.a("music_position")).intValue(), ((Integer) this.f67010e.a("music_index")).intValue());
                return;
            default:
                return;
        }
    }

    public final void a(int i2, int i3) {
        if (((ListItemWidget) this).f66990a != null) {
            ((f) ((ListItemWidget) this).f66990a).a(i2, i3, this.q, this.r);
            f();
        }
    }

    private void a(List<MusicModel> list, MusicCollectionItem musicCollectionItem) {
        if (list == null || musicCollectionItem == null) {
            ViewGroup.LayoutParams layoutParams = ((f) ((ListItemWidget) this).f66990a).itemView.getLayoutParams();
            layoutParams.height = 0;
            ((f) ((ListItemWidget) this).f66990a).itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.f70968k == 0) {
            ((f) ((ListItemWidget) this).f66990a).b();
        } else {
            ((f) ((ListItemWidget) this).f66990a).a();
        }
        this.o = list;
        com.ss.android.ugc.aweme.choosemusic.b bVar = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", musicCollectionItem.mcName, "", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a);
        this.n = bVar;
        bVar.a(musicCollectionItem.mcId);
        ((f) ((ListItemWidget) this).f66990a).f70989e = this.t;
        ((f) ((ListItemWidget) this).f66990a).a(musicCollectionItem, list, this.f70966i, this.f70967j, this.f70968k, this.n, musicCollectionItem.isHot);
        ((f) ((ListItemWidget) this).f66990a).a(new g(this, musicCollectionItem), this.p);
    }

    private void b(int i2, int i3) {
        int i4;
        c a2;
        if (((ListItemWidget) this).f66990a != null) {
            f fVar = (f) ((ListItemWidget) this).f66990a;
            int i5 = this.f70967j;
            if (i2 == this.f70968k) {
                i4 = i3;
            } else {
                i4 = -1;
            }
            fVar.f70993i = i4;
            if (i5 >= 0 && (a2 = fVar.f70987c.a(i5)) != null) {
                fVar.f70987c.a(i5, c.a(a2, null, a.C1601a.f70972a, b.a.f70975a, 1));
            }
        }
        if (i2 != this.f70968k) {
            this.f70967j = -1;
        } else if (this.f70967j == i3) {
            this.f70965h.a((MusicModel) null);
        } else {
            this.f70967j = i3;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == this.f70969l) {
            d().setResult(-1, intent);
            d().finish();
        }
    }
}
