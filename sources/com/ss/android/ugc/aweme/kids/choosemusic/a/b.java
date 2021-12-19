package com.ss.android.ugc.aweme.kids.choosemusic.a;

import android.app.Activity;
import android.media.MediaPlayer;
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
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.kids.choosemusic.h.k;
import com.ss.android.ugc.aweme.kids.choosemusic.i.m;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.music.k.h;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

public final class b extends f<MusicModel> {
    private k A = new k() {
        /* class com.ss.android.ugc.aweme.kids.choosemusic.a.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(67577);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.k
        public final void a(o oVar, View view, MusicModel musicModel) {
            if (musicModel != null && view != null && view.getContext() != null) {
                view.getContext();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = a();
                }
                if (!j.f107229h) {
                    new a(view.getContext()).a(R.string.de8).a();
                    return;
                }
                int id = view.getId();
                b.this.f105454e.f105440i = musicModel.getLogPb();
                if (id == R.id.bz3) {
                    Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                    if (j2 != null) {
                        j2.getString(R.string.bss);
                    }
                    oVar.d();
                    boolean z = oVar.s;
                    String musicId = musicModel.getMusicId();
                    com.ss.android.ugc.aweme.kids.choosemusic.a aVar = b.this.f105454e;
                    musicModel.getLogPb();
                    c.a(z, musicId, aVar);
                } else if (id == R.id.bz5) {
                    if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(R.string.dcb);
                        }
                        new a(view.getContext()).a(offlineDesc).a();
                    } else if (com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel, view.getContext(), true)) {
                        t.a(t.a(), u.a("aweme://music/detail/" + musicModel.getMusicId()).a("process_id", UUID.randomUUID().toString()).a());
                    }
                } else if (id == R.id.ch1) {
                    if (com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel, view.getContext(), true) && b.this.f105450a != null) {
                        d.a(view.getContext(), "av_settings.xml", 0);
                        b.this.f105450a.b(musicModel);
                        com.ss.android.ugc.aweme.kids.choosemusic.a aVar2 = b.this.f105454e;
                        String musicId2 = musicModel.getMusicId();
                        int layoutPosition = oVar.getLayoutPosition();
                        musicModel.getLogPb();
                        c.a(aVar2, musicId2, layoutPosition);
                    }
                } else if (id == R.id.cfv) {
                    if (b.this.f105452c == oVar.getPosition()) {
                        if (b.this.f105450a != null) {
                            b.this.l();
                        }
                    } else if (b.this.f105450a != null) {
                        b.this.l();
                        b.this.f105452c = oVar.getPosition();
                        if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                            MediaPlayer a2 = com.ss.android.ugc.aweme.kids.a.i.b.a();
                            try {
                                a2.reset();
                                a2.setDataSource(musicModel.getLocalPath());
                                a2.setAudioStreamType(3);
                                a2.prepareAsync();
                                a2.setOnPreparedListener(new c(oVar));
                                a2.setOnErrorListener(d.f105465a);
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            b.this.f105450a.a(new f(this));
                            b.this.f105450a.a(musicModel, b.this.f105454e);
                            c.f105650b = oVar.getPosition();
                        }
                    }
                    b.this.f105453d = musicModel.getMusicId();
                    b bVar = b.this;
                    bVar.f105458i = !bVar.f105458i;
                }
            }
        }
    };
    private RecyclerView.c B = new RecyclerView.c() {
        /* class com.ss.android.ugc.aweme.kids.choosemusic.a.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(67578);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            super.a();
            b.this.m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            b.this.m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            b.this.m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            b.this.m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            b.this.m();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.d.b f105450a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f105451b;

    /* renamed from: c  reason: collision with root package name */
    public int f105452c = -1;

    /* renamed from: d  reason: collision with root package name */
    public String f105453d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.a f105454e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f105455f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f105456g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f105457h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f105458i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.e.t f105459j;

    /* renamed from: k  reason: collision with root package name */
    String f105460k = "";
    private com.ss.android.ugc.aweme.kids.a.a.c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> w;
    private boolean x;
    private com.ss.android.ugc.aweme.kids.a.a.a y;
    private boolean z;

    static {
        Covode.recordClassIndex(67575);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void ah_() {
        super.ah_();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.f
    public final int c() {
        if (!this.z) {
            return super.c();
        }
        if (this.f76354l == null) {
            return 0;
        }
        return this.f76354l.size() + 1;
    }

    public final void l() {
        if (this.f105452c >= 0) {
            MediaPlayer a2 = com.ss.android.ugc.aweme.kids.a.i.b.a();
            int i2 = this.f105452c;
            if (i2 != -1) {
                RecyclerView.ViewHolder f2 = this.f105451b.f(i2);
                if (f2 instanceof o) {
                    ((com.ss.android.ugc.aweme.kids.choosemusic.i.a) f2).a(false, false);
                }
                int i3 = this.f105452c;
                this.f105452c = -1;
                this.f105453d = null;
                if (f2 == null) {
                    notifyItemChanged(i3);
                }
            }
            if (a2 != null && a2.isPlaying()) {
                a2.pause();
            }
            com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar = this.f105450a;
            if (bVar != null) {
                bVar.a((MusicModel) null);
            }
        }
    }

    public final void m() {
        int i2 = -1;
        if (TextUtils.isEmpty(this.f105453d) || com.bytedance.common.utility.collection.b.a((Collection) e())) {
            this.f105452c = -1;
            return;
        }
        for (MusicModel musicModel : e()) {
            i2++;
            if (musicModel != null && TextUtils.equals(musicModel.getMusicId(), this.f105453d)) {
                this.f105452c = i2;
                return;
            }
        }
        this.f105452c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f105451b = recyclerView;
        registerAdapterDataObserver(this.B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.B);
        this.f105451b = null;
    }

    public b(com.ss.android.ugc.aweme.kids.a.a.c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> cVar) {
        this.w = cVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        Object obj;
        if (!this.z) {
            obj = this.f76354l.get(i2);
        } else if (i2 == 0) {
            return 2;
        } else {
            obj = this.f76354l.get(i2 - 1);
        }
        if (obj != null) {
            return 0;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        boolean z2;
        MethodCollector.i(10124);
        try {
            z2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getShowMusicFeedbackEntrance().booleanValue();
        } catch (Exception unused) {
            z2 = false;
        }
        if (!this.x || !z2) {
            RecyclerView.ViewHolder a_ = super.a_(viewGroup);
            MethodCollector.o(10124);
            return a_;
        }
        RecyclerView.ViewHolder a_2 = super.a_(viewGroup);
        try {
            this.f105460k = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getFeConfigCollection().getMusicFaq().getSchema();
        } catch (Exception unused2) {
        }
        SpannableString spannableString = new SpannableString("");
        AnonymousClass1 r1 = new ClickableSpan() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67576);
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                h.a a2 = h.a(b.this.f105460k);
                a2.a("enter_from", "video_shoot_page");
                t.a(t.a(), a2.a().toString());
            }
        };
        if (spannableString.length() > 9) {
            spannableString.setSpan(r1, 9, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(viewGroup.getContext(), R.color.nh)), 9, spannableString.length(), 33);
        }
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjc, (ViewGroup) null);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(androidx.core.content.b.c(viewGroup.getContext(), R.color.c6));
        textView.setPadding(0, 20, 0, 0);
        DmtStatusView dmtStatusView = (DmtStatusView) a_2.itemView;
        dmtStatusView.setBuilder(dmtStatusView.c().b(textView));
        MethodCollector.o(10124);
        return a_2;
    }

    public b(com.ss.android.ugc.aweme.kids.a.a.c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> cVar, byte b2) {
        this.w = cVar;
        this.x = false;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            o oVar = new o(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.adm, viewGroup, false), this.f105457h);
            oVar.a(this.A, this.w);
            return oVar;
        } else if (i2 != 2) {
            return new m(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa_, viewGroup, false));
        } else {
            return this.y.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0173  */
    @Override // com.ss.android.ugc.aweme.common.a.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r13, int r14) {
        /*
        // Method dump skipped, instructions count: 446
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.choosemusic.a.b.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
