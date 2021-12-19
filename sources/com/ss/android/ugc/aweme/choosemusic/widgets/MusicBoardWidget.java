package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.model.ad;
import com.ss.android.ugc.aweme.choosemusic.view.t;
import com.ss.android.ugc.aweme.choosemusic.viewholder.m;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MusicBoardWidget extends ListItemWidget<m> implements u<b>, au {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.d.b f71044h;

    /* renamed from: i  reason: collision with root package name */
    public int f71045i;

    /* renamed from: j  reason: collision with root package name */
    int f71046j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f71047k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f71048l;

    /* renamed from: m  reason: collision with root package name */
    int f71049m;
    com.ss.android.ugc.aweme.choosemusic.b n;
    List<MusicModel> o;
    public k<c> p;
    boolean[] q = new boolean[3];
    boolean[] r = new boolean[3];
    int s;
    public MusicDownloadPlayHelper.a t = new c(this);
    private ViewPager.e u = new ViewPager.e() {
        /* class com.ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget.AnonymousClass1 */

        static {
            Covode.recordClassIndex(43738);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            MusicBoardWidget.this.f71045i = i2;
            for (int i3 = 0; i3 < MusicBoardWidget.this.r.length; i3++) {
                MusicBoardWidget.this.r[i3] = MusicBoardWidget.this.q[i3];
            }
            MusicBoardWidget.this.f();
        }
    };

    static {
        Covode.recordClassIndex(43737);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void g() {
        this.f71044h.a((MusicModel) null);
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
        this.f71049m = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
    }

    public final void f() {
        int i2;
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.o)) {
            int i3 = this.f71045i;
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
                        com.ss.android.ugc.aweme.choosemusic.utils.b.a(this.n, musicModel.getMusicId(), i4);
                    }
                }
            }
        }
    }

    public MusicBoardWidget(int i2) {
        this.s = i2;
    }

    private void a(List<Object> list) {
        if (list != null && this.f71047k < list.size()) {
            a(((ad) list.get(this.f71047k)).f70609b, ((ad) list.get(this.f71047k)).f70608a);
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
        ArrayList<s> musicItemViews;
        MusicModel.CollectionType collectionType;
        ArrayList<s> musicItemViews2;
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
                com.ss.android.ugc.aweme.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.choosemusic.b.a) bVar2.a();
                if (((aVar.f70389a == 1 && this.f71047k == aVar.f70390b) || aVar.f70389a == 0) && ((ListItemWidget) this).f66990a != null) {
                    m mVar = (m) ((ListItemWidget) this).f66990a;
                    int i3 = 0;
                    while (i3 < mVar.f70918d.getChildCount() && (r0 = (t) mVar.f70918d.getChildAt(i3)) != null && (musicItemViews = r0.getMusicItemViews()) != null) {
                        Iterator<s> it = musicItemViews.iterator();
                        while (it.hasNext()) {
                            s next = it.next();
                            MusicModel musicModel = aVar.f70393e;
                            if (musicModel != null && !TextUtils.isEmpty(musicModel.getMusicId()) && next.w != null && musicModel.getMusicId().equals(next.w.getMusicId())) {
                                MusicModel musicModel2 = next.w;
                                if (aVar.f70392d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                musicModel2.setCollectionType(collectionType);
                                next.d();
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
                    m mVar2 = (m) ((ListItemWidget) this).f66990a;
                    int i4 = this.f71046j;
                    boolean booleanValue = ((Boolean) this.f67010e.a("music_loading")).booleanValue();
                    if (i4 >= 0) {
                        while (i2 < mVar2.f70918d.getChildCount() && (r0 = (t) mVar2.f70918d.getChildAt(i2)) != null && (musicItemViews2 = r0.getMusicItemViews()) != null) {
                            Iterator<s> it2 = musicItemViews2.iterator();
                            while (it2.hasNext()) {
                                s next2 = it2.next();
                                if (next2.x == i4) {
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
            ((m) ((ListItemWidget) this).f66990a).a(i2, i3, this.q, this.r);
            f();
        }
    }

    private void a(List<MusicModel> list, MusicCollectionItem musicCollectionItem) {
        if (list == null || musicCollectionItem == null) {
            ViewGroup.LayoutParams layoutParams = ((m) ((ListItemWidget) this).f66990a).itemView.getLayoutParams();
            layoutParams.height = 0;
            ((m) ((ListItemWidget) this).f66990a).itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.f71047k == 0) {
            ((m) ((ListItemWidget) this).f66990a).b();
        } else {
            ((m) ((ListItemWidget) this).f66990a).a();
        }
        this.o = list;
        com.ss.android.ugc.aweme.choosemusic.b bVar = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", musicCollectionItem.mcName, "", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a);
        this.n = bVar;
        bVar.a(musicCollectionItem.mcId);
        ((m) ((ListItemWidget) this).f66990a).a(this.u);
        ((m) ((ListItemWidget) this).f66990a).a(musicCollectionItem, list, this.f71045i, this.f71046j, this.f71047k, this.n, musicCollectionItem.isHot);
        ((m) ((ListItemWidget) this).f66990a).a(new d(this, musicCollectionItem), this.p);
    }

    private void b(int i2, int i3) {
        int i4;
        ArrayList<s> musicItemViews;
        if (((ListItemWidget) this).f66990a != null) {
            m mVar = (m) ((ListItemWidget) this).f66990a;
            int i5 = this.f71046j;
            if (i2 == this.f71047k) {
                i4 = i3;
            } else {
                i4 = -1;
            }
            mVar.f70922h = i4;
            if (i5 >= 0) {
                int i6 = 0;
                while (i6 < mVar.f70918d.getChildCount() && (r0 = (t) mVar.f70918d.getChildAt(i6)) != null && (musicItemViews = r0.getMusicItemViews()) != null) {
                    Iterator<s> it = musicItemViews.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        s next = it.next();
                        if (next.x == i5) {
                            next.a(false, false);
                            break;
                        }
                    }
                    i6++;
                }
            }
        }
        if (i2 != this.f71047k) {
            this.f71046j = -1;
        } else if (this.f71046j == i3) {
            this.f71044h.a((MusicModel) null);
        } else {
            this.f71046j = i3;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == this.f71048l) {
            d().setResult(-1, intent);
            d().finish();
        }
    }
}
