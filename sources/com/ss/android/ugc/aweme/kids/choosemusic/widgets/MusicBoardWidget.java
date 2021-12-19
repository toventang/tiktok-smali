package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.a.h.d;
import com.ss.android.ugc.aweme.kids.choosemusic.a;
import com.ss.android.ugc.aweme.kids.choosemusic.e.n;
import com.ss.android.ugc.aweme.kids.choosemusic.h.l;
import com.ss.android.ugc.aweme.kids.choosemusic.i.i;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MusicBoardWidget extends ListItemWidget<i> implements u<b>, au {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.d.b f105844h;

    /* renamed from: i  reason: collision with root package name */
    public int f105845i;

    /* renamed from: j  reason: collision with root package name */
    int f105846j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f105847k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f105848l;

    /* renamed from: m  reason: collision with root package name */
    int f105849m;
    a n;
    List<MusicModel> o;
    public c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> p;
    boolean[] q = new boolean[3];
    boolean[] r = new boolean[3];
    public d.a s = new c(this);
    private ViewPager.e t = new ViewPager.e() {
        /* class com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBoardWidget.AnonymousClass1 */

        static {
            Covode.recordClassIndex(67740);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            MusicBoardWidget.this.f105845i = i2;
            for (int i3 = 0; i3 < MusicBoardWidget.this.r.length; i3++) {
                MusicBoardWidget.this.r[i3] = MusicBoardWidget.this.q[i3];
            }
            MusicBoardWidget.this.f();
        }
    };

    static {
        Covode.recordClassIndex(67739);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void g() {
        this.f105844h.a((MusicModel) null);
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

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67010e.a("list", (u<b>) this).a("music_index", (u<b>) this).a("music_collect_status", (u<b>) this).a("play_compeleted", (u<b>) this).a("music_loading", (u<b>) this);
        this.f105849m = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
    }

    public final void f() {
        int i2;
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.o)) {
            int i3 = this.f105845i;
            if (i3 * 3 < 0) {
                i2 = 0;
            } else {
                i2 = i3 * 3;
            }
            int min = Math.min(i2 + 3, this.o.size());
            for (int i4 = i2; i4 < min; i4++) {
                boolean[] zArr = this.r;
                int i5 = i4 - i2;
                if (zArr[i5]) {
                    zArr[i5] = false;
                    MusicModel musicModel = this.o.get(i4);
                    if (musicModel != null) {
                        com.ss.android.ugc.aweme.kids.choosemusic.g.c.a(this.n, musicModel.getMusicId(), i4, true);
                    }
                }
            }
        }
    }

    private void a(List<Object> list) {
        if (list != null && this.f105847k < list.size()) {
            a(((n) list.get(this.f105847k)).f105621b, ((n) list.get(this.f105847k)).f105620a);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.a aVar) {
        super.a(aVar);
        a((List) this.f67010e.a("list"));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        ArrayList<o> musicItemViews;
        MusicModel.CollectionType collectionType;
        ArrayList<o> musicItemViews2;
        b bVar2 = bVar;
        String str = bVar2.f67014a;
        str.hashCode();
        int i2 = 0;
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
                com.ss.android.ugc.aweme.kids.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.kids.choosemusic.b.a) bVar2.a();
                if (((aVar.f105496a == 1 && this.f105847k == aVar.f105497b) || aVar.f105496a == 0) && ((ListItemWidget) this).f66990a != null) {
                    com.ss.android.ugc.aweme.kids.choosemusic.i.i iVar = (com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a;
                    int i3 = 0;
                    while (i3 < iVar.f105770d.getChildCount() && (r0 = (l) iVar.f105770d.getChildAt(i3)) != null && (musicItemViews = r0.getMusicItemViews()) != null) {
                        Iterator<o> it = musicItemViews.iterator();
                        while (it.hasNext()) {
                            o next = it.next();
                            MusicModel musicModel = aVar.f105500e;
                            if (musicModel != null && !TextUtils.isEmpty(musicModel.getMusicId()) && next.u != null && musicModel.getMusicId().equals(next.u.getMusicId())) {
                                MusicModel musicModel2 = next.u;
                                if (aVar.f105499d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                musicModel2.setCollectionType(collectionType);
                                next.c();
                                return;
                            }
                        }
                        i3++;
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
                    com.ss.android.ugc.aweme.kids.choosemusic.i.i iVar2 = (com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a;
                    int i4 = this.f105846j;
                    boolean booleanValue = ((Boolean) this.f67010e.a("music_loading")).booleanValue();
                    if (i4 >= 0) {
                        while (i2 < iVar2.f105770d.getChildCount() && (r0 = (l) iVar2.f105770d.getChildAt(i2)) != null && (musicItemViews2 = r0.getMusicItemViews()) != null) {
                            Iterator<o> it2 = musicItemViews2.iterator();
                            while (it2.hasNext()) {
                                o next2 = it2.next();
                                if (next2.v == i4) {
                                    next2.a(booleanValue, true);
                                    return;
                                }
                            }
                            i2++;
                        }
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
            ((com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a).a(i2, i3, this.q, this.r);
            f();
        }
    }

    private void a(List<MusicModel> list, com.ss.android.ugc.aweme.kids.a.e.d dVar) {
        if (list == null || dVar == null) {
            ViewGroup.LayoutParams layoutParams = ((com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a).itemView.getLayoutParams();
            layoutParams.height = 0;
            ((com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a).itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.f105847k == 0) {
            ((com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a).b();
        } else {
            ((com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a).a();
        }
        this.o = list;
        a aVar = new a("change_music_page", dVar.f105309b, "", com.ss.android.ugc.aweme.kids.choosemusic.g.c.f105649a);
        this.n = aVar;
        aVar.a(dVar.f105308a);
        ((com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a).a(this.t);
        ((com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a).a(dVar, list, this.f105845i, this.f105846j, this.f105847k, this.n, dVar.f105312e);
        ((com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a).a(new d(this, dVar), this.p);
    }

    private void b(int i2, int i3) {
        int i4;
        ArrayList<o> musicItemViews;
        if (((ListItemWidget) this).f66990a != null) {
            com.ss.android.ugc.aweme.kids.choosemusic.i.i iVar = (com.ss.android.ugc.aweme.kids.choosemusic.i.i) ((ListItemWidget) this).f66990a;
            int i5 = this.f105846j;
            if (i2 == this.f105847k) {
                i4 = i3;
            } else {
                i4 = -1;
            }
            iVar.f105774h = i4;
            if (i5 >= 0) {
                int i6 = 0;
                while (i6 < iVar.f105770d.getChildCount() && (r0 = (l) iVar.f105770d.getChildAt(i6)) != null && (musicItemViews = r0.getMusicItemViews()) != null) {
                    Iterator<o> it = musicItemViews.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        o next = it.next();
                        if (next.v == i5) {
                            next.a(false, false);
                            break;
                        }
                    }
                    i6++;
                }
            }
        }
        if (i2 != this.f105847k) {
            this.f105846j = -1;
        } else if (this.f105846j == i3) {
            this.f105844h.a((MusicModel) null);
        } else {
            this.f105846j = i3;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == this.f105848l) {
            d().setResult(-1, intent);
            d().finish();
        }
    }
}
