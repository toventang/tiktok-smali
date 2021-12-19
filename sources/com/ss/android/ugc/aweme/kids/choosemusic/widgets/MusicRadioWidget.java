package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.a.h.d;
import com.ss.android.ugc.aweme.kids.choosemusic.d.e;
import com.ss.android.ugc.aweme.kids.choosemusic.e.n;
import com.ss.android.ugc.aweme.kids.choosemusic.i.p;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class MusicRadioWidget extends ListItemWidget<p> implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, au {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.a f105855h;

    /* renamed from: i  reason: collision with root package name */
    public int f105856i = -1;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.d.b f105857j;

    /* renamed from: k  reason: collision with root package name */
    public c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> f105858k;

    /* renamed from: l  reason: collision with root package name */
    public e f105859l;

    /* renamed from: m  reason: collision with root package name */
    private int f105860m = -1;
    private boolean n;

    static {
        Covode.recordClassIndex(67743);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b implements p.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicRadioWidget f105864a;

        static {
            Covode.recordClassIndex(67746);
        }

        @Override // com.ss.android.ugc.aweme.kids.choosemusic.i.p.b
        public final void a() {
            this.f105864a.e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(MusicRadioWidget musicRadioWidget) {
            this.f105864a = musicRadioWidget;
        }
    }

    public final void f() {
        com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar = this.f105857j;
        if (bVar != null) {
            bVar.a((MusicModel) null);
        }
    }

    public final void e() {
        if (!this.n) {
            this.n = true;
            this.f67010e.a("should_load_more_pick", (Object) true);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        this.f67010e.a("music_index", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("music_collect_status", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("status_pick_load_more", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("pick_list_more", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("play_compeleted", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("play_error", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("music_loading", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.a aVar) {
        l.d(aVar, "");
        super.a(aVar);
        List list = (List) this.f67010e.a("list");
        com.ss.android.ugc.aweme.kids.choosemusic.a aVar2 = new com.ss.android.ugc.aweme.kids.choosemusic.a("change_music_page", "my_fm", "click_start_your_fm", com.ss.android.ugc.aweme.kids.choosemusic.g.c.f105649a);
        this.f105855h = aVar2;
        aVar2.f105439h = true;
        if (list != null && this.f105856i < list.size()) {
            Object obj = list.get(this.f105856i);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.choosemusic.model.MusicBlockItem");
            List<MusicModel> list2 = ((n) obj).f105621b;
            p pVar = (p) ((ListItemWidget) this).f66990a;
            pVar.q = list2;
            List<MusicModel> list3 = pVar.q;
            if (list3 != null && !list3.isEmpty()) {
                pVar.a(pVar.r, false);
            }
            a aVar3 = new a(this, list2);
            l.d(aVar3, "");
            ((p) ((ListItemWidget) this).f66990a).o = aVar3;
        }
        ((p) ((ListItemWidget) this).f66990a).p = this.f105858k;
        ((p) ((ListItemWidget) this).f66990a).n = new b(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (((ListItemWidget) this).f66990a != null) {
            if (bVar2 == null) {
                l.b();
            }
            String str = bVar2.f67014a;
            String str2 = null;
            int i2 = -1;
            switch (str.hashCode()) {
                case -1322093457:
                    if (str.equals("play_compeleted")) {
                        Object a2 = bVar2.a();
                        MusicModel c2 = ((p) ((ListItemWidget) this).f66990a).c();
                        if (c2 != null) {
                            str2 = c2.getMusicId();
                        }
                        if (l.a(a2, (Object) str2)) {
                            this.f67010e.a("music_position", (Object) -1);
                            this.f67010e.a("music_index", (Object) -1);
                            return;
                        }
                        return;
                    }
                    return;
                case -60075939:
                    if (str.equals("status_pick_load_more")) {
                        this.n = false;
                        ((p) ((ListItemWidget) this).f66990a).a((List<? extends MusicModel>) null);
                        return;
                    }
                    return;
                case 502104354:
                    if (str.equals("music_loading")) {
                        Integer num = (Integer) this.f67010e.a("music_position");
                        if (num != null) {
                            i2 = num.intValue();
                        }
                        if (this.f105856i == i2) {
                            Object a3 = this.f67010e.a("music_loading");
                            l.b(a3, "");
                            ((p) ((ListItemWidget) this).f66990a).a(true, ((Boolean) a3).booleanValue());
                            return;
                        }
                        return;
                    }
                    return;
                case 945257400:
                    if (str.equals("pick_list_more")) {
                        this.n = false;
                        ((p) ((ListItemWidget) this).f66990a).a((List) bVar2.a());
                        return;
                    }
                    return;
                case 1579846200:
                    if (str.equals("music_index")) {
                        Integer num2 = (Integer) this.f67010e.b("music_position", (Object) -1);
                        Integer num3 = (Integer) this.f67010e.b("music_index", (Object) -1);
                        int i3 = this.f105856i;
                        if (num2 != null && num2.intValue() == i3) {
                            int i4 = this.f105860m;
                            if (num3 != null && i4 == num3.intValue()) {
                                ((p) ((ListItemWidget) this).f66990a).a(false, false);
                                com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar3 = this.f105857j;
                                if (bVar3 != null) {
                                    bVar3.a((MusicModel) null);
                                    return;
                                }
                                return;
                            }
                            l.b(num3, "");
                            this.f105860m = num3.intValue();
                            return;
                        }
                        ((p) ((ListItemWidget) this).f66990a).a(false, false);
                        this.f105860m = -1;
                        return;
                    }
                    return;
                case 1912965437:
                    if (str.equals("play_error")) {
                        Object a4 = bVar2.a();
                        MusicModel c3 = ((p) ((ListItemWidget) this).f66990a).c();
                        if (c3 != null) {
                            str2 = c3.getMusicId();
                        }
                        if (l.a(a4, (Object) str2)) {
                            this.f67010e.a("music_position", (Object) -1);
                            this.f67010e.a("music_index", (Object) -1);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    static final class a implements com.ss.android.ugc.aweme.kids.a.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicRadioWidget f105861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f105862b;

        static {
            Covode.recordClassIndex(67744);
        }

        a(MusicRadioWidget musicRadioWidget, List list) {
            this.f105861a = musicRadioWidget;
            this.f105862b = list;
        }

        @Override // com.ss.android.ugc.aweme.kids.a.a.b
        public final void a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
            String str;
            MusicModel musicModel2;
            String str2;
            if (viewHolder instanceof p) {
                if (musicModel == null) {
                    List list = this.f105862b;
                    if (list == null || list.isEmpty()) {
                        this.f105861a.e();
                        return;
                    }
                    return;
                }
                l.b(view, "");
                int id = view.getId();
                if (id == R.id.bz3) {
                    Activity j2 = f.j();
                    if (j2 != null) {
                        l.b(j2.getString(R.string.bss), "");
                    }
                    p pVar = (p) viewHolder;
                    List<MusicModel> list2 = pVar.q;
                    MusicModel musicModel3 = null;
                    if (!(list2 == null || h.a.n.b((List) list2, pVar.r) == null)) {
                        List<MusicModel> list3 = pVar.q;
                        if (list3 != null) {
                            musicModel2 = (MusicModel) h.a.n.b((List) list3, pVar.r);
                        } else {
                            musicModel2 = null;
                        }
                        if (com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel2, pVar.s, true)) {
                            c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> cVar = pVar.p;
                            if (cVar != null) {
                                List<MusicModel> list4 = pVar.q;
                                if (list4 != null) {
                                    musicModel3 = (MusicModel) h.a.n.b((List) list4, pVar.r);
                                }
                                if (pVar.t) {
                                    str2 = "unfollow_type";
                                } else {
                                    str2 = "follow_type";
                                }
                                cVar.a(new com.ss.android.ugc.aweme.kids.choosemusic.b.b(musicModel3, str2, 0, pVar.r));
                            }
                            pVar.t = !pVar.t;
                            CheckableImageView checkableImageView = pVar.f105821i;
                            if (checkableImageView != null) {
                                checkableImageView.b();
                            }
                        }
                    }
                    com.ss.android.ugc.aweme.kids.choosemusic.a aVar = this.f105861a.f105855h;
                    if (aVar != null) {
                        aVar.f105434c = "click_button";
                    }
                    boolean z = pVar.t;
                    String musicId = musicModel.getMusicId();
                    com.ss.android.ugc.aweme.kids.choosemusic.a aVar2 = this.f105861a.f105855h;
                    musicModel.getLogPb();
                    com.ss.android.ugc.aweme.kids.choosemusic.g.c.a(z, musicId, aVar2);
                } else if (id == R.id.cfv || id == R.id.cf1 || id == R.id.ch0) {
                    Integer num = (Integer) this.f105861a.f67010e.b("music_position", (Object) -1);
                    int i2 = this.f105861a.f105856i;
                    if (num != null && num.intValue() == i2) {
                        Integer num2 = (Integer) this.f105861a.f67010e.b("music_index", (Object) -1);
                        int i3 = ((p) viewHolder).r;
                        if (num2 != null && num2.intValue() == i3) {
                            this.f105861a.f67010e.a("music_position", (Object) -1);
                            this.f105861a.f67010e.a("music_index", (Object) -1);
                            this.f105861a.f();
                            return;
                        }
                    }
                    p pVar2 = (p) viewHolder;
                    com.ss.android.ugc.aweme.kids.choosemusic.g.c.f105650b = pVar2.r;
                    com.ss.android.ugc.aweme.kids.choosemusic.a aVar3 = this.f105861a.f105855h;
                    if (aVar3 != null) {
                        if (view.getId() == R.id.cf1) {
                            str = "click_start_your_fm";
                        } else {
                            str = "click_play_icon";
                        }
                        aVar3.f105434c = str;
                    }
                    this.f105861a.f();
                    pVar2.a(true, true);
                    com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar = this.f105861a.f105857j;
                    if (bVar != null) {
                        bVar.a(new d.a(this) {
                            /* class com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget.a.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ a f105863a;

                            static {
                                Covode.recordClassIndex(67745);
                            }

                            {
                                this.f105863a = r1;
                            }

                            @Override // com.ss.android.ugc.aweme.kids.a.h.d.a
                            public final void a() {
                                this.f105863a.f105861a.f67010e.a("music_loading", (Object) false);
                            }
                        });
                    }
                    com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar2 = this.f105861a.f105857j;
                    if (bVar2 != null) {
                        bVar2.a(musicModel, this.f105861a.f105855h);
                    }
                    this.f105861a.f67010e.a("music_position", Integer.valueOf(this.f105861a.f105856i));
                    this.f105861a.f67010e.a("music_index", Integer.valueOf(pVar2.r));
                    this.f105861a.f67010e.a("music_loading", (Object) true);
                } else if (id == R.id.ch1) {
                    com.ss.android.ugc.aweme.kids.choosemusic.a aVar4 = this.f105861a.f105855h;
                    if (aVar4 != null) {
                        aVar4.f105434c = "";
                    }
                    e eVar = this.f105861a.f105859l;
                    if (eVar != null) {
                        eVar.b(8);
                    }
                    com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar3 = this.f105861a.f105857j;
                    if (bVar3 != null) {
                        bVar3.b(musicModel);
                    }
                    com.ss.android.ugc.aweme.kids.choosemusic.a aVar5 = this.f105861a.f105855h;
                    String musicId2 = musicModel.getMusicId();
                    int i4 = this.f105861a.f105856i;
                    musicModel.getLogPb();
                    com.ss.android.ugc.aweme.kids.choosemusic.g.c.a(aVar5, musicId2, i4);
                }
            }
        }
    }
}
