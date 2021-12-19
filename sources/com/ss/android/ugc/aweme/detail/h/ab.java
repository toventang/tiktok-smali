package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.effect.h;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ab extends y {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f79651a;

    static {
        Covode.recordClassIndex(49489);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final void n() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final int o() {
        return R.string.h7n;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f79652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f79653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f79654c;

        static {
            Covode.recordClassIndex(49490);
        }

        a(TextView textView, String str, View view) {
            this.f79652a = textView;
            this.f79653b = str;
            this.f79654c = view;
        }

        public final void run() {
            this.f79652a.setText(this.f79653b);
            v.j(this.f79654c).a(1.0f).a(100L).c();
        }
    }

    public final void ab() {
        if (this.be instanceof h) {
            Object obj = this.be;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.effect.IStickerQuery");
            ((h) obj).a(y(), new c(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<g, z> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(49492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ab abVar) {
            super(1);
            this.this$0 = abVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f79656a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f79657b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g f79658c;

            static {
                Covode.recordClassIndex(49493);
            }

            a(View view, c cVar, g gVar) {
                this.f79656a = view;
                this.f79657b = cVar;
                this.f79658c = gVar;
            }

            public final void run() {
                com.bytedance.lighten.a.v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(this.f79658c.iconUrl));
                a2.E = (SmartImageView) this.f79656a.findViewById(R.id.eb4);
                a2.f39917m = 200;
                a2.c();
                LinearLayout linearLayout = (LinearLayout) this.f79656a.findViewById(R.id.ebt);
                l.b(linearLayout, "");
                TuxTextView tuxTextView = (TuxTextView) this.f79656a.findViewById(R.id.ebs);
                l.b(tuxTextView, "");
                String str = this.f79658c.name;
                l.b(str, "");
                ab.a(linearLayout, tuxTextView, str);
                ((TuxTextView) this.f79656a.findViewById(R.id.ebs)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.detail.h.ab.c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f79659a;

                    static {
                        Covode.recordClassIndex(49494);
                    }

                    {
                        this.f79659a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        ab abVar = this.f79659a.f79657b.this$0;
                        l.b(view, "");
                        Context context = view.getContext();
                        l.b(context, "");
                        abVar.a(context, this.f79659a.f79658c);
                    }
                });
                ((SmartImageView) this.f79656a.findViewById(R.id.eb4)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.detail.h.ab.c.a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f79660a;

                    static {
                        Covode.recordClassIndex(49495);
                    }

                    {
                        this.f79660a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        ab abVar = this.f79660a.f79657b.this$0;
                        l.b(view, "");
                        Context context = view.getContext();
                        l.b(context, "");
                        abVar.a(context, this.f79660a.f79658c);
                    }
                });
                this.f79656a.findViewById(R.id.vc).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.detail.h.ab.c.a.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f79661a;

                    static {
                        Covode.recordClassIndex(49496);
                    }

                    {
                        this.f79661a = r1;
                    }

                    public final void onClick(View view) {
                        Music music;
                        int i2;
                        Video video;
                        ClickAgent.onClick(view);
                        ab abVar = this.f79661a.f79657b.this$0;
                        g gVar = this.f79661a.f79658c;
                        g gVar2 = new g();
                        gVar2.id = gVar.effectId;
                        IPropReuseService c2 = PropReuseServiceImpl.c();
                        Activity activity = abVar.bv;
                        l.b(activity, "");
                        ArrayList<g> d2 = n.d(gVar2);
                        Aweme y = abVar.y();
                        String str = null;
                        if (y != null) {
                            music = y.getMusic();
                        } else {
                            music = null;
                        }
                        String previousPage = abVar.aJ.getPreviousPage();
                        l.b(previousPage, "");
                        String str2 = gVar.ownerId;
                        Aweme y2 = abVar.y();
                        if (y2 != null) {
                            str = y2.getAid();
                        }
                        Aweme y3 = abVar.y();
                        if (y3 == null || (video = y3.getVideo()) == null) {
                            i2 = 0;
                        } else {
                            i2 = video.getVideoLength();
                        }
                        c2.a(activity, d2, music, previousPage, str2, str, i2);
                    }
                });
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f79662a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f79663b;

            static {
                Covode.recordClassIndex(49497);
            }

            b(View view, c cVar) {
                this.f79662a = view;
                this.f79663b = cVar;
            }

            public final void run() {
                com.bytedance.lighten.a.v a2 = r.a(2131231899);
                a2.E = (SmartImageView) this.f79662a.findViewById(R.id.eb4);
                a2.f39917m = 200;
                a2.c();
                LinearLayout linearLayout = (LinearLayout) this.f79662a.findViewById(R.id.ebt);
                l.b(linearLayout, "");
                TuxTextView tuxTextView = (TuxTextView) this.f79662a.findViewById(R.id.ebs);
                l.b(tuxTextView, "");
                ab.a(linearLayout, tuxTextView, "");
                ((TuxTextView) this.f79662a.findViewById(R.id.ebs)).setOnClickListener(null);
                this.f79662a.findViewById(R.id.vc).setOnClickListener(null);
                ((SmartImageView) this.f79662a.findViewById(R.id.eb4)).setOnClickListener(null);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(g gVar) {
            g gVar2 = gVar;
            if (gVar2 != null) {
                com.ss.android.ugc.aweme.feed.x.v.f95366a = gVar2.effectId;
                View view = this.this$0.F;
                if (view != null) {
                    view.post(new a(view, this, gVar2));
                }
            } else {
                com.ss.android.ugc.aweme.feed.x.v.f95366a = null;
                View view2 = this.this$0.F;
                if (view2 != null) {
                    view2.post(new b(view2, this));
                }
            }
            return z.f158842a;
        }
    }

    public static final class b implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ab f79655a;

        static {
            Covode.recordClassIndex(49491);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ab abVar) {
            this.f79655a = abVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f79655a.ab();
        }
    }

    public ab(Bundle bundle) {
        this.f79651a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void c(List<Aweme> list) {
        super.c(list);
        ab();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final View a(RelativeLayout relativeLayout) {
        View a2 = com.a.a(LayoutInflater.from(this.bv), R.layout.wr, relativeLayout, false);
        l.b(a2, "");
        return a2;
    }

    public final void a(Context context, g gVar) {
        String str;
        String str2 = gVar.effectId;
        if (str2 != null) {
            d a2 = new d().a("enter_from", this.aJ.getPreviousPage()).a("prop_id", gVar.effectId).a("author_id", gVar.ownerId);
            Aweme y = y();
            Music music = null;
            if (y != null) {
                str = y.getAid();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.common.r.a("enter_prop_detail", a2.a("group_id", str).a("enter_method", "profile_tab_bottom").f66730a);
            SmartRoute withParam = SmartRouter.buildRoute(context, "aweme://stickers/detail").withParam("extra_sticker_from", "from_sticker_master_profile").withParam("extra_music_from", "from_sticker_master_profile").withParam("extra_stickers", n.d(str2));
            Aweme y2 = y();
            if (y2 != null) {
                music = y2.getMusic();
            }
            withParam.withParam("music_model", music).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.detail.h.b
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ab();
        this.N.a(new b(this));
    }

    public static void a(View view, TextView textView, String str) {
        androidx.core.h.z a2 = v.j(view).a(0.0f).a(100L);
        a aVar = new a(textView, str, view);
        View view2 = a2.f2582a.get();
        if (view2 != null) {
            int i2 = Build.VERSION.SDK_INT;
            view2.animate().withEndAction(aVar);
        }
        a2.c();
    }
}
