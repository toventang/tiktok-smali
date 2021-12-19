package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.j;
import com.ss.android.ugc.aweme.shortvideo.dm;
import com.ss.android.ugc.aweme.shortvideo.q;
import com.ss.android.ugc.aweme.tools.b.e;
import com.ss.android.ugc.aweme.tools.b.g;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class bs implements v {

    /* renamed from: h  reason: collision with root package name */
    public static final a f129096h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ShortVideoContext f129097a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends com.ss.android.ugc.aweme.shortvideo.c> f129098b;

    /* renamed from: c  reason: collision with root package name */
    public long f129099c;

    /* renamed from: d  reason: collision with root package name */
    public long f129100d;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f129101e;

    /* renamed from: f  reason: collision with root package name */
    public final long f129102f;

    /* renamed from: g  reason: collision with root package name */
    public final long f129103g;

    /* renamed from: i  reason: collision with root package name */
    private List<? extends MediaModel> f129104i;

    /* renamed from: j  reason: collision with root package name */
    private int f129105j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f129106k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.tools.view.e.b f129107l;

    /* renamed from: m  reason: collision with root package name */
    private long f129108m = -1;

    static {
        Covode.recordClassIndex(84736);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84737);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Intent a(Activity activity, ShortVideoContext shortVideoContext, int i2, long j2) {
            l.d(activity, "");
            l.d(shortVideoContext, "");
            Intent intent = new Intent();
            intent.putExtra("extra_start_enter_cut_page", j2);
            intent.putExtra("enter_method", shortVideoContext.y);
            intent.putExtra("from_music_detail", l.a((Object) "single_song", (Object) shortVideoContext.r));
            intent.putExtra("creation_id", shortVideoContext.q);
            intent.putExtra("shoot_way", shortVideoContext.r);
            intent.putExtra("shoot_from", shortVideoContext.t);
            intent.putExtra("shout_out_data", shortVideoContext.ab);
            intent.putExtra("extra_stick_point_type", i2);
            intent.putExtra("comment_video_model", shortVideoContext.f124767l);
            intent.putExtra("question_answer_video_model", shortVideoContext.f124768m);
            intent.putExtra("share_id", shortVideoContext.f124763h);
            intent.putExtra("channel", shortVideoContext.B);
            intent.putExtra("is_rivate", shortVideoContext.L);
            Workspace workspace = shortVideoContext.f124757b.f124713h;
            l.b(workspace, "");
            if (com.ss.android.ugc.aweme.shortvideo.af.b.a(workspace.c(), activity)) {
                Workspace workspace2 = shortVideoContext.f124757b.f124713h;
                l.b(workspace2, "");
                intent.putExtra("path", workspace2.c());
            }
            cr a2 = cr.a();
            l.b(a2, "");
            List<AVChallenge> list = a2.f125298d;
            if (!h.a(list)) {
                AVChallenge aVChallenge = list.get(0);
                if (!(aVChallenge instanceof Serializable)) {
                    aVChallenge = null;
                }
                intent.putExtra("av_challenge", (Serializable) aVChallenge);
            }
            intent.putExtra("micro_app_info", shortVideoContext.ah);
            intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.f124756a);
            intent.putExtra("auto_selected_anchor", shortVideoContext.aW);
            intent.putExtra("open_platform_extra", shortVideoContext.aX);
            intent.putExtra("open_platform_client_key", shortVideoContext.aY);
            g.a(intent, q.b(shortVideoContext), e.RECORD, e.CUT);
            if (TextUtils.equals(shortVideoContext.x, "douplus")) {
                intent.putExtra("extra_mention_user_model", shortVideoContext.an);
                intent.putExtra("enter_from", "douplus");
            }
            intent.putExtra("upload_method", shortVideoContext.f124759d);
            dm.a(intent, shortVideoContext);
            return intent;
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bs f129109a;

        static {
            Covode.recordClassIndex(84738);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g
        public final void a() {
            this.f129109a.b();
            this.f129109a.a(null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(bs bsVar) {
            this.f129109a = bsVar;
        }
    }

    private long d() {
        long j2 = this.f129099c;
        if (j2 > 60000) {
            return 0;
        }
        return j2;
    }

    private long e() {
        long j2 = this.f129100d;
        if (j2 > 60000) {
            return 0;
        }
        return j2;
    }

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bs f129110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f129111b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ StringBuilder f129112c;

        static {
            Covode.recordClassIndex(84739);
        }

        public static final class a implements i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f129113a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z.d f129114b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f129115c;

            static {
                Covode.recordClassIndex(84740);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
            public final void a() {
                this.f129114b.element = System.currentTimeMillis();
                this.f129113a.f129110a.f129099c = this.f129114b.element - this.f129115c;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
            public final void b() {
                this.f129113a.f129110a.b();
                this.f129113a.f129110a.a(this.f129113a.f129110a.f129098b);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
            public final void c() {
                this.f129113a.f129110a.b();
                this.f129113a.f129110a.a(this.f129113a.f129110a.f129098b);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
            public final void a(List<? extends com.ss.android.ugc.aweme.shortvideo.c> list) {
                this.f129113a.f129110a.f129098b = list;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
            public final void a(Exception exc) {
                this.f129113a.f129110a.b();
                this.f129113a.f129110a.a(null);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
            public final void b(Exception exc) {
                this.f129113a.f129110a.b();
                this.f129113a.f129110a.a(null);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
            public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
                this.f129113a.f129110a.f129100d = System.currentTimeMillis() - this.f129114b.element;
                this.f129113a.f129110a.b();
                this.f129113a.f129110a.a(this.f129113a.f129110a.f129098b);
            }

            a(c cVar, z.d dVar, long j2) {
                this.f129113a = cVar;
                this.f129114b = dVar;
                this.f129115c = j2;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g
        public final void a() {
            long currentTimeMillis = System.currentTimeMillis();
            z.d dVar = new z.d();
            dVar.element = 0;
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a a2 = j.a();
            Context applicationContext = this.f129110a.f129101e.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            a2.a(applicationContext, this.f129111b, this.f129112c.toString(), new a(this, dVar, currentTimeMillis));
        }

        c(bs bsVar, int i2, StringBuilder sb) {
            this.f129110a = bsVar;
            this.f129111b = i2;
            this.f129112c = sb;
        }
    }

    public final void b() {
        com.ss.android.ugc.tools.view.e.b bVar;
        com.ss.android.ugc.tools.view.e.b bVar2 = this.f129107l;
        if (bVar2 != null) {
            Boolean valueOf = Boolean.valueOf(bVar2.isShowing());
            if (valueOf == null) {
                l.b();
            }
            if (valueOf.booleanValue() && (bVar = this.f129107l) != null) {
                bVar.dismiss();
            }
        }
    }

    private final void c() {
        d.a("tool_performance_ai_clip", new com.ss.android.ugc.tools.f.b().a("fetch_music", d()).a("fetch_algorithm", e()).f149193a);
    }

    private final void f() {
        Activity activity = this.f129101e;
        if (activity != null && !activity.isFinishing()) {
            Activity activity2 = this.f129101e;
            com.ss.android.ugc.tools.view.e.b b2 = com.ss.android.ugc.tools.view.e.b.b(activity2, activity2.getString(R.string.g4k));
            this.f129107l = b2;
            if (b2 != null) {
                b2.setIndeterminate(true);
            }
        }
    }

    private final Intent b(List<? extends com.ss.android.ugc.aweme.shortvideo.c> list) {
        if (list != null && !list.isEmpty()) {
            c();
        }
        Activity activity = this.f129101e;
        ShortVideoContext shortVideoContext = this.f129097a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        Intent a2 = a.a(activity, shortVideoContext, this.f129105j, this.f129108m);
        if (!k.a(list)) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic>");
            a2.putExtra("extra_stickpoint_music_list", (ArrayList) list);
        }
        return a2;
    }

    public final void a(List<? extends com.ss.android.ugc.aweme.shortvideo.c> list) {
        int i2;
        if (this.f129097a != null) {
            ShortVideoContext shortVideoContext = this.f129097a;
            if (shortVideoContext == null) {
                l.a("shortVideoContext");
            }
            if (shortVideoContext.ai) {
                i2 = 1002;
            } else {
                i2 = -1;
            }
            com.ss.android.ugc.aweme.shortvideo.r.a.a().a((com.ss.android.ugc.aweme.shortvideo.r.b) this.f129101e, (Context) b(list), (Intent) i2, (int) ((h.f.a.a<h.z>) null));
        }
    }

    public bs(Activity activity, long j2, long j3) {
        l.d(activity, "");
        this.f129101e = activity;
        this.f129102f = j2;
        this.f129103g = j3;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        ArrayList parcelableArrayListExtra;
        l.d(intent, "");
        if (i3 == -1 && i2 == 1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null) {
            this.f129104i = parcelableArrayListExtra;
            ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
            if (shortVideoContext != null) {
                this.f129097a = shortVideoContext;
                int i4 = 0;
                this.f129105j = intent.getIntExtra("extra_stick_point_type", 0);
                this.f129106k = intent.getBooleanExtra("extra_stickpoint_mode", false);
                this.f129108m = intent.getLongExtra("extra_start_enter_edit_page", -1);
                List<? extends MediaModel> list = this.f129104i;
                if (list == null) {
                    l.a("selectedMediaData");
                }
                u uVar = bq.a(this.f129101e, list, this.f129102f, 3600000);
                boolean booleanValue = ((Boolean) uVar.component1()).booleanValue();
                int intValue = ((Number) uVar.component2()).intValue();
                long longValue = ((Number) uVar.component3()).longValue();
                if (booleanValue) {
                    com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a.b();
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a.a((MediaModel) list.get(i5));
                    }
                    if (this.f129097a != null) {
                        ShortVideoContext shortVideoContext2 = this.f129097a;
                        if (shortVideoContext2 == null) {
                            l.a("shortVideoContext");
                        }
                        String str = shortVideoContext2.r;
                        ShortVideoContext shortVideoContext3 = this.f129097a;
                        if (shortVideoContext3 == null) {
                            l.a("shortVideoContext");
                        }
                        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(str, shortVideoContext3.q);
                    }
                    ShortVideoContext shortVideoContext4 = this.f129097a;
                    if (shortVideoContext4 == null) {
                        l.a("shortVideoContext");
                    }
                    bt.a(shortVideoContext4, list, intValue, (int) longValue);
                    bt.a(list);
                    if (f.f125945d && list.size() > 1) {
                        f();
                        int size2 = list.size();
                        StringBuilder sb = new StringBuilder();
                        for (T t : list) {
                            int i6 = i4 + 1;
                            if (i4 < 0) {
                                n.a();
                            }
                            sb.append(t.f109396h);
                            if (i4 < size2 - 1) {
                                sb.append(",");
                            }
                            i4 = i6;
                        }
                        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(list, new c(this, size2, sb));
                    } else if (list.size() <= 1 || !f.f125945d) {
                        a(null);
                    } else {
                        f();
                        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(list, new b(this));
                    }
                }
            }
        }
    }
}
