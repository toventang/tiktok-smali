package com.ss.android.ugc.aweme.choosemusic.a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.choosemusic.e.c;
import com.ss.android.ugc.aweme.choosemusic.model.aj;
import com.ss.android.ugc.aweme.choosemusic.model.ap;
import com.ss.android.ugc.aweme.choosemusic.model.aq;
import com.ss.android.ugc.aweme.choosemusic.view.s;
import com.ss.android.ugc.aweme.choosemusic.viewholder.q;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.ss.android.ugc.aweme.discover.model.MusicTitleModel;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.music.b.a;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.music.k.h;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

public final class b extends f<MusicModel> {
    private a A;
    private boolean B;
    private s C = new s() {
        /* class com.ss.android.ugc.aweme.choosemusic.a.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(43359);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.choosemusic.view.s
        public final void a(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, View view, MusicModel musicModel, int i2) {
            String str;
            String str2;
            String str3;
            if (musicModel != null && view != null && view.getContext() != null) {
                if (!TextUtils.isEmpty(musicModel.getSearchKeyWords())) {
                    c.g().b(new MusicSearchHistory(musicModel.getSearchKeyWords()));
                }
                view.getContext();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = a();
                }
                if (!j.f107229h) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.de8).a();
                    return;
                }
                int id = view.getId();
                b.this.f70284e.f70387i = musicModel.getLogPb();
                b.this.f70284e.f70388j = musicModel.getSearchId();
                if (id == R.id.bz3) {
                    Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                    if (j2 != null) {
                        j2.getString(R.string.bss);
                    }
                    if (!AccountService.a().e().isLogin()) {
                        com.ss.android.ugc.aweme.choosemusic.a.a(com.bytedance.ies.ugc.appcontext.f.j(), com.ss.android.ugc.aweme.choosemusic.utils.c.a(i2), "click_favorite_music");
                        return;
                    }
                    sVar.e();
                    com.ss.android.ugc.aweme.choosemusic.utils.b.a(sVar.u, musicModel.getMusicId(), b.this.f70284e, sVar.x, musicModel.getLogPb());
                    com.ss.android.ugc.aweme.choosemusic.b bVar = b.this.f70284e;
                    if (bVar != null) {
                        str = bVar.f70379a;
                    } else {
                        str = null;
                    }
                    if (TextUtils.equals("search_music", str)) {
                        com.ss.android.ugc.aweme.discover.h.b f2 = SearchServiceImpl.t().f();
                        if (bVar == null || (str2 = bVar.f70379a) == null) {
                            str2 = "";
                        }
                        int position = sVar.getPosition();
                        if (sVar.u) {
                            str3 = "click_favourite_button";
                        } else {
                            str3 = "click_cancel_favourite";
                        }
                        f2.a(str2, musicModel, position, str3);
                    }
                } else if (id == R.id.bz5) {
                    if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(R.string.dcb);
                        }
                        new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(offlineDesc).a();
                    } else if (d.a(musicModel, view.getContext(), true)) {
                        String uuid = UUID.randomUUID().toString();
                        t.a(t.a(), u.a("aweme://music/detail/" + musicModel.getMusicId()).a("process_id", uuid).a());
                        com.ss.android.ugc.aweme.choosemusic.utils.b.a(b.this.f70284e, musicModel.getMusicId(), false, uuid);
                    }
                } else if (id == R.id.ch1 || id == R.id.dpd) {
                    if (d.a(musicModel, view.getContext(), true) && b.this.f70280a != null) {
                        com.ss.android.ugc.aweme.bf.d.a(view.getContext(), "av_settings.xml", 0);
                        b.this.f70280a.b(musicModel);
                        com.ss.android.ugc.aweme.choosemusic.utils.b.a(b.this.f70284e, musicModel.getMusicId(), sVar.getLayoutPosition(), musicModel.getLogPb());
                    }
                } else if (id == R.id.cfv) {
                    b.this.a(sVar, musicModel);
                }
            }
        }
    };
    private RecyclerView.c D = new RecyclerView.c() {
        /* class com.ss.android.ugc.aweme.choosemusic.a.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(43360);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            super.a();
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            b.this.d();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.d.b f70280a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f70281b;

    /* renamed from: c  reason: collision with root package name */
    int f70282c = -1;

    /* renamed from: d  reason: collision with root package name */
    public String f70283d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.b f70284e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f70285f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f70286g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f70287h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f70288i;

    /* renamed from: j  reason: collision with root package name */
    public aj f70289j;

    /* renamed from: k  reason: collision with root package name */
    String f70290k = "";
    private k<com.ss.android.ugc.aweme.choosemusic.b.c> w;
    private String x;
    private boolean y;
    private boolean z;

    static {
        Covode.recordClassIndex(43357);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void ah_() {
        super.ah_();
        r.a("music_search_feedback_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "video_shoot_page").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.f
    public final int c() {
        if (!this.B) {
            return super.c();
        }
        if (this.f76354l == null) {
            return 0;
        }
        return this.f76354l.size() + 1;
    }

    public final void a() {
        if (this.f70282c < 0) {
            this.x = null;
            return;
        }
        MediaPlayer a2 = com.ss.android.ugc.aweme.music.k.c.a();
        int i2 = this.f70282c;
        if (i2 != -1) {
            RecyclerView.ViewHolder f2 = this.f70281b.f(i2);
            if (f2 instanceof com.ss.android.ugc.aweme.choosemusic.viewholder.s) {
                ((com.ss.android.ugc.aweme.choosemusic.viewholder.a) f2).a(false, false);
            }
            int i3 = this.f70282c;
            this.f70282c = -1;
            this.x = null;
            if (f2 == null) {
                notifyItemChanged(i3);
            }
        }
        if (a2 != null && a2.isPlaying()) {
            a2.pause();
        }
        com.ss.android.ugc.aweme.choosemusic.d.b bVar = this.f70280a;
        if (bVar != null) {
            bVar.a((MusicModel) null);
        }
    }

    public final void d() {
        int i2 = -1;
        if (TextUtils.isEmpty(this.x) || com.bytedance.common.utility.collection.b.a((Collection) e())) {
            this.f70282c = -1;
            return;
        }
        for (MusicModel musicModel : e()) {
            i2++;
            if (musicModel != null && TextUtils.equals(musicModel.getMusicId(), this.x)) {
                this.f70282c = i2;
                return;
            }
        }
        this.f70282c = i2;
    }

    public final void a(boolean z2) {
        if (this.f70282c >= 0) {
            this.f70281b.post(new f(this, z2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f70281b = recyclerView;
        registerAdapterDataObserver(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.D);
        this.f70281b = null;
    }

    public b(k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar) {
        this.w = kVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        Object obj;
        if (!this.B) {
            obj = this.f76354l.get(i2);
        } else if (i2 == 0) {
            return 2;
        } else {
            obj = this.f76354l.get(i2 - 1);
        }
        if (obj instanceof DynamicMusicModel) {
            return 5;
        }
        if (obj instanceof MusicTitleModel) {
            return 6;
        }
        if (obj instanceof aq) {
            return 3;
        }
        if (obj instanceof ap) {
            return 4;
        }
        if (obj != null) {
            return 0;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        boolean z2;
        MethodCollector.i(4490);
        try {
            z2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getShowMusicFeedbackEntrance().booleanValue();
        } catch (Exception unused) {
            z2 = false;
        }
        if (this.y && z2) {
            RecyclerView.ViewHolder a_ = super.a_(viewGroup);
            try {
                this.f70290k = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getFeConfigCollection().getMusicFaq().getSchema();
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString("");
            AnonymousClass1 r2 = new ClickableSpan() {
                /* class com.ss.android.ugc.aweme.choosemusic.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43358);
                }

                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    h.a a2 = h.a(b.this.f70290k);
                    a2.a("enter_from", "video_shoot_page");
                    t.a(t.a(), a2.a().toString());
                    r.a("music_search_feedback_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "video_shoot_page").f66730a);
                }
            };
            if (spannableString.length() > 9) {
                spannableString.setSpan(r2, 9, spannableString.length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(viewGroup.getContext(), R.color.nh)), 9, spannableString.length(), 33);
            }
            TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjc, (ViewGroup) null);
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setTextColor(androidx.core.content.b.c(viewGroup.getContext(), R.color.c6));
            textView.setPadding(0, 20, 0, 0);
            DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
            dmtStatusView.setBuilder(dmtStatusView.c().b(textView));
            MethodCollector.o(4490);
            return a_;
        } else if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            RecyclerView.ViewHolder a_2 = super.a_(viewGroup);
            TextView textView2 = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjc, (ViewGroup) null);
            textView2.setText(viewGroup.getContext().getText(R.string.ant));
            if (Build.VERSION.SDK_INT >= 23) {
                textView2.setTextColor(viewGroup.getContext().getColor(R.color.c6));
            } else {
                textView2.setTextColor(viewGroup.getContext().getResources().getColor(R.color.c6));
            }
            textView2.setPadding((int) n.b(viewGroup.getContext(), 16.0f), (int) n.b(viewGroup.getContext(), 17.0f), (int) n.b(viewGroup.getContext(), 16.0f), 0);
            DmtStatusView dmtStatusView2 = (DmtStatusView) a_2.itemView;
            dmtStatusView2.setBuilder(dmtStatusView2.c().b(textView2));
            MethodCollector.o(4490);
            return a_2;
        } else {
            RecyclerView.ViewHolder a_3 = super.a_(viewGroup);
            MethodCollector.o(4490);
            return a_3;
        }
    }

    public b(k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar, a aVar) {
        this.w = kVar;
        this.y = false;
        this.B = true;
        this.A = aVar;
    }

    public b(k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar, boolean z2) {
        this.w = kVar;
        this.y = z2;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar = new com.ss.android.ugc.aweme.choosemusic.viewholder.s(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa2, viewGroup, false), this.f70288i);
            sVar.a(this.C, this.w);
            return sVar;
        } else if (i2 == 2) {
            return this.A.a(viewGroup);
        } else {
            if (i2 == 3) {
                return com.ss.android.ugc.aweme.search.h.f121133a.f().a(viewGroup).b();
            }
            if (i2 == 4) {
                return com.ss.android.ugc.aweme.search.h.f121133a.f().d(viewGroup);
            }
            if (i2 == 5) {
                return com.ss.android.ugc.aweme.search.h.f121133a.f().b(viewGroup).b();
            }
            if (i2 != 6) {
                return new q(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa_, viewGroup, false));
            }
            return com.ss.android.ugc.aweme.search.h.f121133a.f().c(viewGroup);
        }
    }

    public final void a(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, MusicModel musicModel) {
        sVar.getPosition();
        if (this.f70282c == sVar.getPosition()) {
            if (this.f70280a != null) {
                a();
            }
            com.ss.android.ugc.aweme.choosemusic.a.a(sVar, musicModel, this.f70284e, this.z);
            this.z = !this.z;
        } else if (this.f70280a != null) {
            a();
            this.f70282c = sVar.getPosition();
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                MediaPlayer a2 = com.ss.android.ugc.aweme.music.k.c.a();
                try {
                    a2.reset();
                    if (musicModel.getLocalPath().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                        a2.setDataSource(this.f70281b.getContext(), Uri.parse(musicModel.getLocalPath()));
                    } else {
                        a2.setDataSource(musicModel.getLocalPath());
                    }
                    a2.setAudioStreamType(3);
                    a2.prepareAsync();
                    a2.setOnPreparedListener(new d(sVar));
                    a2.setOnErrorListener(e.f70296a);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } else {
                this.f70280a.a(new c(this));
                this.f70280a.a(musicModel, this.f70284e);
                com.ss.android.ugc.aweme.choosemusic.utils.b.f70720c = sVar.getPosition();
            }
            com.ss.android.ugc.aweme.choosemusic.a.a(sVar, musicModel, this.f70284e, false);
            this.z = true;
        }
        this.x = musicModel.getMusicId();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017f  */
    @Override // com.ss.android.ugc.aweme.common.a.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r15, int r16) {
        /*
        // Method dump skipped, instructions count: 576
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.a.b.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
