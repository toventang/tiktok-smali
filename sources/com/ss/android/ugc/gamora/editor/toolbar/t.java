package com.ss.android.ugc.gamora.editor.toolbar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.b.b;
import com.bytedance.jedi.arch.ah;
import com.facebook.drawee.view.SimpleDraweeView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.property.cm;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.k;
import com.ss.android.ugc.aweme.shortvideo.edit.m;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.zhiliaoapp.musically.R;
import h.p;
import h.y;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.tux.tooltip.a f147141a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.dmt.ui.b.b f147142b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.fragment.app.e f147143c;

    /* renamed from: d  reason: collision with root package name */
    public final VideoPublishEditModel f147144d;

    /* renamed from: e  reason: collision with root package name */
    public final EditToolbarViewModel f147145e;

    /* renamed from: f  reason: collision with root package name */
    private final f.a.b.a f147146f = new f.a.b.a();

    /* renamed from: g  reason: collision with root package name */
    private final List<p<LiveData<Object>, u<Object>>> f147147g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final com.bytedance.scene.group.b f147148h;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.editor.music.a f147149i;

    static {
        Covode.recordClassIndex(96942);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        com.bytedance.tux.tooltip.a aVar = this.f147141a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    public static final class a implements com.ss.android.ugc.aweme.cz.a.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f147150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f147151b;

        static {
            Covode.recordClassIndex(96943);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$a$a  reason: collision with other inner class name */
        static final class RunnableC3948a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f147152a;

            static {
                Covode.recordClassIndex(96944);
            }

            RunnableC3948a(a aVar) {
                this.f147152a = aVar;
            }

            public final void run() {
                t tVar = this.f147152a.f147150a;
                View view = this.f147152a.f147151b;
                if (tVar.f147145e.f146975a.f145947a && !l.f115658a.b().h()) {
                    tVar.b(view);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.cz.a.i
        public final void a() {
            boolean z;
            int i2;
            Integer b2;
            com.ss.android.ugc.aweme.cz.a.e a2 = l.f115658a.b().k().a();
            com.ss.android.ugc.gamora.editor.g gVar = this.f147150a.f147145e.f146975a;
            int i3 = 0;
            if (a2.a() || ((b2 = a2.b()) != null && b2.intValue() == 3)) {
                z = false;
            } else {
                z = true;
            }
            gVar.f145948b = z;
            this.f147150a.f147143c.runOnUiThread(new RunnableC3948a(this));
            if (this.f147150a.f147145e.f146975a.f145948b && a2.c() >= 0) {
                VideoPublishEditModel videoPublishEditModel = this.f147150a.f147144d;
                h.f.b.l.d(videoPublishEditModel, "");
                h.f.b.l.d(a2, "");
                StringBuilder sb = new StringBuilder();
                if (!a2.a()) {
                    List<com.ss.android.ugc.aweme.shortvideo.c> e2 = a2.e();
                    if (e2 == null) {
                        h.f.b.l.b();
                    }
                    boolean z2 = false;
                    for (T t : e2) {
                        if (z2) {
                            sb.append(",");
                        }
                        sb.append(t.getMid());
                        z2 = true;
                    }
                }
                com.ss.android.ugc.tools.f.b a3 = bl.l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_edit_page");
                List<com.ss.android.ugc.aweme.shortvideo.c> e3 = a2.e();
                if (e3 != null) {
                    i3 = e3.size();
                }
                com.ss.android.ugc.tools.f.b a4 = a3.a("music_upload_num", i3).a("music_upload_duration", a2.c()).a("music_id_list", sb.toString());
                Integer b3 = a2.b();
                if (b3 != null) {
                    i2 = b3.intValue();
                } else {
                    i2 = 2;
                }
                r.a("music_upload_done", a4.a("music_rec_type", i2).f149193a);
                a2.d();
            }
        }

        a(t tVar, View view) {
            this.f147150a = tVar;
            this.f147151b = view;
        }
    }

    /* access modifiers changed from: package-private */
    public final View c() {
        m mVar;
        g gVar = (g) this.f147148h.a("EditTitleBarScene");
        if (gVar == null || (mVar = gVar.f147105h) == null) {
            return null;
        }
        return mVar.f127808b;
    }

    public final void a() {
        this.f147146f.a();
        for (T t : this.f147147g) {
            ((LiveData) t.getFirst()).removeObserver((u) t.getSecond());
        }
        this.f147147g.clear();
        b();
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f147160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f147161b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f147162c;

        static {
            Covode.recordClassIndex(96952);
        }

        i(t tVar, View view, boolean z) {
            this.f147160a = tVar;
            this.f147161b = view;
            this.f147162c = z;
        }

        public final void run() {
            if (this.f147161b.getVisibility() == 0) {
                com.bytedance.ies.dmt.ui.b.b bVar = this.f147160a.f147142b;
                if (bVar == null) {
                    h.f.b.l.b();
                }
                bVar.a();
                View contentView = bVar.getContentView();
                h.f.b.l.b(contentView, "");
                int measuredWidth = contentView.getMeasuredWidth();
                com.bytedance.ies.dmt.ui.b.a aVar = bVar.f33310g;
                if (aVar == null) {
                    h.f.b.l.a("mDmtBubbleLayout");
                }
                float padding = ((float) ((measuredWidth - (aVar.getPADDING() * 4)) - this.f147161b.getMeasuredWidth())) + n.b(this.f147160a.f147143c, 8.0f);
                float b2 = n.b(this.f147160a.f147143c, 3.0f) + padding;
                if (com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                    com.bytedance.ies.dmt.ui.b.b bVar2 = this.f147160a.f147142b;
                    if (bVar2 == null) {
                        h.f.b.l.b();
                    }
                    bVar2.a(this.f147161b, 80, true);
                } else if (this.f147162c) {
                    com.bytedance.ies.dmt.ui.b.b bVar3 = this.f147160a.f147142b;
                    if (bVar3 == null) {
                        h.f.b.l.b();
                    }
                    bVar3.a(this.f147161b, b2, -((int) padding));
                } else {
                    int b3 = (int) n.b(this.f147160a.f147143c, 12.0f);
                    com.bytedance.ies.dmt.ui.b.b bVar4 = this.f147160a.f147142b;
                    if (bVar4 == null) {
                        h.f.b.l.b();
                    }
                    bVar4.a(this.f147161b, ((float) b3) + n.b(this.f147160a.f147143c, 3.0f), -b3);
                }
                r.a("function_toast_show", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a(StringSet.type, "music").f149193a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f147163a;

        static {
            Covode.recordClassIndex(96953);
        }

        j(t tVar) {
            this.f147163a = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147163a.f147145e.a(1);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f147153a;

        static {
            Covode.recordClassIndex(96948);
        }

        e(View view) {
            this.f147153a = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            float f2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                this.f147153a.setEnabled(booleanValue);
                if (booleanValue) {
                    view = this.f147153a;
                    f2 = 1.0f;
                } else {
                    view = this.f147153a;
                    f2 = 0.5f;
                }
                view.setAlpha(f2);
            }
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f147158a;

        static {
            Covode.recordClassIndex(96950);
        }

        g(View view) {
            this.f147158a = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            float f2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    view = this.f147158a;
                    f2 = 1.0f;
                } else {
                    view = this.f147158a;
                    f2 = 0.5f;
                }
                view.setAlpha(f2);
            }
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f147159a;

        static {
            Covode.recordClassIndex(96951);
        }

        h(View view) {
            this.f147159a = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                View view = this.f147159a;
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }

    public final void c(Map<Integer, ? extends View> map) {
        h.f.b.l.d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> c2 = this.f147145e.c(intValue);
            if (c2 != null) {
                a(c2, this.f147143c, new g(view));
            }
        }
    }

    public final void a(View view) {
        if (!l.f115658a.b().h()) {
            l.f115658a.b().k().a(new a(this, view));
        }
    }

    public final void b(Map<Integer, ? extends View> map) {
        h.f.b.l.d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            androidx.lifecycle.t<Boolean> tVar = this.f147145e.h().get(Integer.valueOf(intValue));
            if (tVar != null) {
                a(tVar, this.f147143c, new e(view));
            }
        }
    }

    public final void a(Map<Integer, ? extends View> map) {
        h.f.b.l.d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> d2 = this.f147145e.d(intValue);
            if (d2 != null) {
                a(d2, this.f147143c, new h(view));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(View view) {
        com.bytedance.tux.tooltip.h hVar;
        String str;
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        com.ss.android.ugc.aweme.shortvideo.c cVar2;
        MethodCollector.i(3571);
        if (view == null) {
            MethodCollector.o(3571);
            return;
        }
        if (this.f147145e.f146975a.f145948b) {
            String str2 = null;
            View inflate = View.inflate(this.f147143c, R.layout.aqu, null);
            h.f.b.l.b(inflate, "");
            View findViewById = inflate.findViewById(R.id.fa4);
            h.f.b.l.b(findViewById, "");
            TextView textView = (TextView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.c34);
            h.f.b.l.b(findViewById2, "");
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById2;
            List<com.ss.android.ugc.aweme.shortvideo.c> e2 = l.f115658a.b().k().a().e();
            if (!com.bytedance.common.utility.collection.b.a((Collection) e2)) {
                if (e2 == null || (cVar2 = e2.get(0)) == null) {
                    str = null;
                } else {
                    str = cVar2.getName();
                }
                textView.setText(str);
                if (!(e2 == null || (cVar = e2.get(0)) == null)) {
                    str2 = cVar.getPicMedium();
                }
                simpleDraweeView.setImageURI(str2);
            }
            b.a aVar = new b.a(this.f147143c);
            aVar.f33329m = false;
            h.f.b.l.d(inflate, "");
            aVar.n = inflate;
            aVar.z = 8.0f;
            aVar.f33328l = 5000;
            aVar.A = true;
            this.f147142b = aVar.a();
            new ToolSafeHandler(this.f147143c).post(new i(this, view, com.ss.android.ugc.aweme.tools.c.a(this.f147143c)));
            com.bytedance.ies.dmt.ui.b.b bVar = this.f147142b;
            if (bVar == null) {
                h.f.b.l.b();
            }
            bVar.getContentView().setOnClickListener(new j(this));
        } else {
            com.bytedance.tux.tooltip.b b2 = new com.bytedance.tux.tooltip.a.b.a(this.f147143c).e(R.string.bk4).a(5000L).a(true).b(view);
            if (com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                hVar = com.bytedance.tux.tooltip.h.BOTTOM;
            } else {
                hVar = com.bytedance.tux.tooltip.h.TOP;
            }
            b2.a(hVar).d().a();
        }
        l.f115658a.b().i();
        this.f147145e.f146975a.f145947a = false;
        VideoPublishEditModel videoPublishEditModel = this.f147144d;
        h.f.b.l.d(videoPublishEditModel, "");
        r.a("change_music_toast_show", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).f149193a);
        MethodCollector.o(3571);
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f147154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f147155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f147156c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f147157d;

        static {
            Covode.recordClassIndex(96949);
        }

        f(t tVar, int i2, View view, int i3) {
            this.f147154a = tVar;
            this.f147155b = i2;
            this.f147156c = view;
            this.f147157d = i3;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.ies.dmt.ui.b.b bVar;
            int i2;
            com.bytedance.tux.tooltip.h hVar;
            com.bytedance.tux.tooltip.h hVar2;
            int i3;
            com.bytedance.tux.tooltip.h hVar3;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                t tVar = this.f147154a;
                int i4 = this.f147155b;
                View view = this.f147156c;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 != 6) {
                                    if (i4 == 15 && booleanValue) {
                                        com.bytedance.tux.tooltip.b a2 = ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(tVar.f147143c).a(com.bytedance.tux.tooltip.h.START)).e(R.string.q0).a(true).a(5000L);
                                        if (view.getHeight() == 0) {
                                            View c2 = tVar.c();
                                            if (c2 != null) {
                                                a2.b(c2);
                                            } else {
                                                return;
                                            }
                                        } else {
                                            View findViewById = view.findViewById(R.id.a00);
                                            if (findViewById != null) {
                                                a2.b(findViewById);
                                            } else {
                                                a2.b(view);
                                            }
                                        }
                                        a2.d().a();
                                        w.b("cut_optimized");
                                    }
                                } else if (booleanValue) {
                                    com.bytedance.tux.tooltip.b a3 = ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(tVar.f147143c).a(com.bytedance.tux.tooltip.h.START)).e(R.string.bk7).a(true).a(5000L);
                                    if (view.getHeight() == 0) {
                                        View c3 = tVar.c();
                                        if (c3 != null) {
                                            a3.b(c3);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        View findViewById2 = view.findViewById(R.id.a00);
                                        if (findViewById2 != null) {
                                            a3.b(findViewById2);
                                        } else {
                                            a3.b(view);
                                        }
                                    }
                                    a3.d().a();
                                    w.b("voice");
                                    r.a("function_toast_show", new com.ss.android.ugc.tools.f.b().a("creation_id", tVar.f147144d.creationId).a("content_type", bl.a(tVar.f147144d)).a("content_source", bl.b(tVar.f147144d)).a("enter_from", "video_edit_page").a(StringSet.type, "voice").f149193a);
                                }
                            } else if (booleanValue) {
                                boolean b2 = w.b();
                                boolean c4 = w.c();
                                if (c4) {
                                    i3 = R.string.byk;
                                } else if (b2) {
                                    i3 = R.string.ay2;
                                } else {
                                    i3 = R.string.bk6;
                                }
                                com.bytedance.tux.tooltip.b b3 = new com.bytedance.tux.tooltip.a.b.a(tVar.f147143c).e(i3).a(5000L).a(true).b(view);
                                if (com.ss.android.ugc.gamora.editor.lightening.a.a() || cm.c()) {
                                    hVar3 = com.bytedance.tux.tooltip.h.START;
                                } else {
                                    hVar3 = com.bytedance.tux.tooltip.h.TOP;
                                }
                                b3.a(hVar3).d().a();
                                String str = "custom_sticker";
                                if (w.b()) {
                                    w.b(str);
                                } else if (w.c()) {
                                    w.b("countdown_sticker");
                                } else {
                                    w.b("sticker");
                                }
                                if (c4) {
                                    str = "live_countdown";
                                } else if (!b2) {
                                    str = "info_sticker";
                                }
                                r.a("function_toast_show", new com.ss.android.ugc.tools.f.b().a("creation_id", tVar.f147144d.creationId).a("content_type", bl.a(tVar.f147144d)).a("content_source", bl.b(tVar.f147144d)).a("enter_from", "video_edit_page").a(StringSet.type, str).f149193a);
                            }
                        } else if (booleanValue) {
                            com.bytedance.tux.tooltip.b b4 = new com.bytedance.tux.tooltip.a.b.a(tVar.f147143c).b(view);
                            if (com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                                hVar2 = com.bytedance.tux.tooltip.h.START;
                            } else {
                                hVar2 = com.bytedance.tux.tooltip.h.TOP;
                            }
                            ((com.bytedance.tux.tooltip.a.b.a) b4.a(hVar2)).e(R.string.ayd).a(true).a(5000L).d().a();
                            w.b("text");
                            try {
                                r.a("function_toast_show", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a(StringSet.type, "text").a("creation_id", tVar.f147144d.creationId).a("content_type", bl.a(tVar.f147144d)).a("content_source", bl.b(tVar.f147144d)).f149193a);
                            } catch (y e2) {
                                bj.b("Publish Edit Model late init exception:" + e2.getMessage());
                            }
                        }
                    } else if (booleanValue) {
                        if (com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                            hVar = com.bytedance.tux.tooltip.h.START;
                        } else {
                            hVar = com.bytedance.tux.tooltip.h.TOP;
                        }
                        if (tVar.f147141a == null) {
                            tVar.f147141a = new com.bytedance.tux.tooltip.a.b.a(tVar.f147143c).e(R.string.bk3).a(5000L).b(view).a(hVar).d();
                        }
                        com.bytedance.tux.tooltip.a aVar = tVar.f147141a;
                        if (aVar != null) {
                            aVar.a();
                        }
                        w.b("effect");
                        r.a("function_toast_show", new com.ss.android.ugc.tools.f.b().a("creation_id", tVar.f147144d.creationId).a("content_type", bl.a(tVar.f147144d)).a("content_source", bl.b(tVar.f147144d)).a("enter_from", "video_edit_page").a(StringSet.type, "effect").f149193a);
                    } else {
                        tVar.b();
                    }
                } else if (!AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee() && !cm.b()) {
                    if (booleanValue) {
                        if (!com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.b(tVar.f147144d) || !bp.a()) {
                            com.bytedance.tux.tooltip.a.b.a aVar2 = (com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(tVar.f147143c).b(view).a(com.bytedance.tux.tooltip.h.TOP);
                            if (com.ss.android.ugc.aweme.property.a.a.a()) {
                                i2 = R.string.bli;
                            } else {
                                i2 = R.string.bk4;
                            }
                            aVar2.e(i2).a(true).a(5000L).d().a();
                            w.b("music");
                            r.a("function_toast_show", new com.ss.android.ugc.tools.f.b().a("creation_id", tVar.f147144d.creationId).a("content_type", bl.a(tVar.f147144d)).a("content_source", bl.b(tVar.f147144d)).a("enter_from", "video_edit_page").a(StringSet.type, "music").f149193a);
                            return;
                        }
                        tVar.b(view);
                    } else if (bp.l(tVar.f147144d) && (bVar = tVar.f147142b) != null && bVar.isShowing()) {
                        bVar.dismiss();
                    }
                }
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, String, z> {
        final /* synthetic */ k $item;

        static {
            Covode.recordClassIndex(96946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(2);
            this.$item = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, String str) {
            String str2 = str;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(str2, "");
            this.$item.setText(str2);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Drawable, z> {
        final /* synthetic */ k $item;

        static {
            Covode.recordClassIndex(96947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar) {
            super(2);
            this.$item = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Drawable drawable) {
            Drawable drawable2 = drawable;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(drawable2, "");
            this.$item.setIcon(drawable2);
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, a, z> {
        final /* synthetic */ k $item;
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(96945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar, k kVar) {
            super(2);
            this.this$0 = tVar;
            this.$item = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(aVar2, "");
            this.$item.setIcon(aVar2.f147017a);
            if (aVar2.f147019c) {
                com.ss.android.ugc.aweme.shortvideo.edit.b.d.a().storeBoolean("key_show_toast", false);
                if (aVar2.f147018b) {
                    new com.bytedance.tux.g.b(this.this$0.f147143c).e(R.string.bjj).b();
                } else {
                    new com.bytedance.tux.g.b(this.this$0.f147143c).e(R.string.bji).b();
                }
            }
            return z.f158842a;
        }
    }

    public final void a(com.bytedance.jedi.arch.b bVar, k kVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(kVar, "");
        bVar.selectNonNullSubscribe(this.f147145e, v.f147165a, new ah(), new c(kVar));
        bVar.selectNonNullSubscribe(this.f147145e, w.f147166a, new ah(), new d(kVar));
    }

    public final void a(Map<Integer, ? extends View> map, int i2) {
        h.f.b.l.d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            androidx.lifecycle.t<Boolean> tVar = this.f147145e.i().get(Integer.valueOf(intValue));
            if (tVar != null) {
                a(tVar, this.f147143c, new f(this, intValue, view, i2));
            }
        }
    }

    private final <T> void a(LiveData<T> liveData, androidx.lifecycle.m mVar, u<T> uVar) {
        liveData.observe(mVar, uVar);
        List<p<LiveData<Object>, u<Object>>> list = this.f147147g;
        Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        list.add(new p<>(liveData, uVar));
    }

    public t(androidx.fragment.app.e eVar, VideoPublishEditModel videoPublishEditModel, EditToolbarViewModel editToolbarViewModel, com.bytedance.scene.group.b bVar, com.ss.android.ugc.gamora.editor.music.a aVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(videoPublishEditModel, "");
        h.f.b.l.d(editToolbarViewModel, "");
        h.f.b.l.d(bVar, "");
        this.f147143c = eVar;
        this.f147144d = videoPublishEditModel;
        this.f147145e = editToolbarViewModel;
        this.f147148h = bVar;
        this.f147149i = aVar;
    }
}
