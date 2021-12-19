package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.a;
import com.ss.android.ugc.aweme.kids.choosemusic.d.e;
import com.ss.android.ugc.aweme.kids.choosemusic.g.d;
import com.ss.android.ugc.aweme.kids.choosemusic.h.g;
import com.ss.android.ugc.aweme.kids.choosemusic.h.r;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collection;
import java.util.List;

public class StickerMusicWidget extends ListItemWidget<r> implements u<b>, au {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.d.b f105865h;

    /* renamed from: i  reason: collision with root package name */
    int f105866i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f105867j;

    /* renamed from: k  reason: collision with root package name */
    public int f105868k;

    /* renamed from: l  reason: collision with root package name */
    a f105869l;

    /* renamed from: m  reason: collision with root package name */
    public c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> f105870m;
    public e n;
    private int o;
    private List<Music> p;

    static {
        Covode.recordClassIndex(67747);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void e() {
        this.f105865h.a((MusicModel) null);
    }

    private void f() {
        if (h.a(this.p)) {
            ((r) ((ListItemWidget) this).f66990a).itemView.setVisibility(8);
            return;
        }
        ((r) ((ListItemWidget) this).f66990a).itemView.setVisibility(0);
        ((g) ((ListItemWidget) this).f66990a).a(d.b(this.p), ((Integer) this.f67010e.b("music_position", (Object) -1)).intValue(), this.f105866i, ((Boolean) this.f67010e.b("data_sticker_music_from_video", (Object) false)).booleanValue(), (String) this.f67010e.b("sticker_id", (Object) null), new g(this), this.f105870m);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        this.f67010e.a("data_sticker", (u<b>) this).a("music_index", (u<b>) this).a("music_collect_status", (u<b>) this).a("music_loading", (u<b>) this);
        this.o = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
        super.onCreate();
        a aVar = new a("change_music_page", "attached_song", "", com.ss.android.ugc.aweme.kids.choosemusic.g.c.f105649a);
        this.f105869l = aVar;
        aVar.f105433b = "prop";
        this.f105869l.f105437f = (String) this.f67010e.b("sticker_id", (Object) null);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.a aVar) {
        super.a(aVar);
        this.p = (List) this.f67010e.b("data_sticker", (Object) null);
        f();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        char c2;
        MusicModel.CollectionType collectionType;
        b bVar2 = bVar;
        String str = bVar2.f67014a;
        str.hashCode();
        int i2 = -1;
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 502104354:
                if (str.equals("music_loading")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1579846200:
                if (str.equals("music_index")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1730565544:
                if (str.equals("data_sticker")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                com.ss.android.ugc.aweme.kids.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.kids.choosemusic.b.a) bVar2.a();
                if (((aVar.f105496a == 1 && this.f105867j == aVar.f105497b) || aVar.f105496a == 0) && ((ListItemWidget) this).f66990a != null) {
                    g gVar = (g) ((ListItemWidget) this).f66990a;
                    if (!com.bytedance.common.utility.collection.b.a((Collection) gVar.f105707c)) {
                        for (o oVar : gVar.f105707c) {
                            MusicModel musicModel = aVar.f105500e;
                            if (!(musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || oVar.u == null || !musicModel.getMusicId().equals(oVar.u.getMusicId()))) {
                                MusicModel musicModel2 = oVar.u;
                                if (aVar.f105499d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                musicModel2.setCollectionType(collectionType);
                                oVar.c();
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (((ListItemWidget) this).f66990a != null) {
                    Integer num = (Integer) this.f67010e.a("music_position");
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    if (this.f105867j == i2) {
                        g gVar2 = (g) ((ListItemWidget) this).f66990a;
                        int intValue = ((Integer) this.f67010e.a("music_index")).intValue();
                        boolean booleanValue = ((Boolean) this.f67010e.a("music_loading")).booleanValue();
                        if (intValue >= 0 && intValue < gVar2.f105707c.size()) {
                            gVar2.f105707c.get(intValue).a(booleanValue, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int intValue2 = ((Integer) this.f67010e.b("music_position", (Object) -1)).intValue();
                int intValue3 = ((Integer) this.f67010e.b("music_index", (Object) -1)).intValue();
                if (ae_()) {
                    g gVar3 = (g) ((ListItemWidget) this).f66990a;
                    int i3 = this.f105866i;
                    if (i3 >= 0 && i3 < gVar3.f105707c.size()) {
                        gVar3.f105707c.get(i3).a(false, false);
                    }
                    if (intValue2 != -2) {
                        this.f105866i = -1;
                        return;
                    } else if (this.f105866i == intValue3) {
                        this.f105865h.a((MusicModel) null);
                        return;
                    } else {
                        this.f105866i = intValue3;
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.p = (List) bVar2.a();
                f();
                return;
            default:
                return;
        }
    }
}
