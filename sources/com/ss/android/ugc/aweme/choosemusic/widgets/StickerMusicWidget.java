package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.d.e;
import com.ss.android.ugc.aweme.choosemusic.view.ac;
import com.ss.android.ugc.aweme.choosemusic.view.o;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collection;
import java.util.List;

public class StickerMusicWidget extends ListItemWidget<ac> implements u<b>, au {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.d.b f71056h;

    /* renamed from: i  reason: collision with root package name */
    int f71057i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f71058j;

    /* renamed from: k  reason: collision with root package name */
    public int f71059k;

    /* renamed from: l  reason: collision with root package name */
    com.ss.android.ugc.aweme.choosemusic.b f71060l;

    /* renamed from: m  reason: collision with root package name */
    public k<c> f71061m;
    public e n;
    private int o;
    private List<Music> p;

    static {
        Covode.recordClassIndex(43741);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void e() {
        this.f71056h.a((MusicModel) null);
    }

    private void f() {
        if (h.a(this.p)) {
            ((ac) ((ListItemWidget) this).f66990a).itemView.setVisibility(8);
            return;
        }
        List<MusicModel> b2 = com.ss.android.ugc.aweme.choosemusic.utils.c.b(this.p);
        ((ac) ((ListItemWidget) this).f66990a).itemView.setVisibility(0);
        ((o) ((ListItemWidget) this).f66990a).a(b2, ((Integer) this.f67010e.b("music_position", (Object) -1)).intValue(), this.f71057i, ((Boolean) this.f67010e.b("data_sticker_music_from_video", (Object) false)).booleanValue(), (String) this.f67010e.b("sticker_id", (Object) null), new g(this), this.f71061m);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        this.f67010e.a("data_sticker", (u<b>) this).a("music_index", (u<b>) this).a("music_collect_status", (u<b>) this).a("music_loading", (u<b>) this);
        this.o = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
        super.onCreate();
        com.ss.android.ugc.aweme.choosemusic.b bVar = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", "attached_song", "", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a);
        this.f71060l = bVar;
        bVar.f70380b = "prop";
        this.f71060l.f70384f = (String) this.f67010e.b("sticker_id", (Object) null);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void a(a aVar) {
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
                com.ss.android.ugc.aweme.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.choosemusic.b.a) bVar2.a();
                if (((aVar.f70389a == 1 && this.f71058j == aVar.f70390b) || aVar.f70389a == 0) && ((ListItemWidget) this).f66990a != null) {
                    o oVar = (o) ((ListItemWidget) this).f66990a;
                    if (!com.bytedance.common.utility.collection.b.a((Collection) oVar.f70856c)) {
                        for (s sVar : oVar.f70856c) {
                            MusicModel musicModel = aVar.f70393e;
                            if (!(musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || sVar.w == null || !musicModel.getMusicId().equals(sVar.w.getMusicId()))) {
                                MusicModel musicModel2 = sVar.w;
                                if (aVar.f70392d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                musicModel2.setCollectionType(collectionType);
                                sVar.d();
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
                    if (this.f71058j == i2) {
                        o oVar2 = (o) ((ListItemWidget) this).f66990a;
                        int intValue = ((Integer) this.f67010e.a("music_index")).intValue();
                        boolean booleanValue = ((Boolean) this.f67010e.a("music_loading")).booleanValue();
                        if (intValue >= 0 && intValue < oVar2.f70856c.size()) {
                            oVar2.f70856c.get(intValue).a(booleanValue, true);
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
                    o oVar3 = (o) ((ListItemWidget) this).f66990a;
                    int i3 = this.f71057i;
                    if (i3 >= 0 && i3 < oVar3.f70856c.size()) {
                        oVar3.f70856c.get(i3).a(false, false);
                    }
                    if (intValue2 != -2) {
                        this.f71057i = -1;
                        return;
                    } else if (this.f71057i == intValue3) {
                        this.f71056h.a((MusicModel) null);
                        return;
                    } else {
                        this.f71057i = intValue3;
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
