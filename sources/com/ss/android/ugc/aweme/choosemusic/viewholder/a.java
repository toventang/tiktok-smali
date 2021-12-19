package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.choosemusic.b;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.view.s;
import com.ss.android.ugc.aweme.discover.helper.k;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ia;
import com.zhiliaoapp.musically.R;

public abstract class a extends RecyclerView.ViewHolder {
    private static int z;
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private s E;
    private k F;
    private com.ss.android.ugc.aweme.music.b.k<c> G;
    private int H;

    /* renamed from: a  reason: collision with root package name */
    SmartImageView f70880a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f70881b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f70882c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f70883d;

    /* renamed from: e  reason: collision with root package name */
    TextView f70884e;

    /* renamed from: f  reason: collision with root package name */
    TextView f70885f;

    /* renamed from: g  reason: collision with root package name */
    CheckableImageView f70886g;

    /* renamed from: h  reason: collision with root package name */
    ImageView f70887h;

    /* renamed from: i  reason: collision with root package name */
    ViewGroup f70888i;

    /* renamed from: j  reason: collision with root package name */
    ImageView f70889j;

    /* renamed from: k  reason: collision with root package name */
    TextView f70890k;

    /* renamed from: l  reason: collision with root package name */
    ViewGroup f70891l;

    /* renamed from: m  reason: collision with root package name */
    TextView f70892m;
    ViewGroup n;
    public ViewGroup o;
    ViewGroup p;
    ViewGroup q;
    View r;
    TextView s;
    RecyclerView t;
    public boolean u;
    protected Context v;
    public MusicModel w;
    public int x;
    protected b y;

    static {
        Covode.recordClassIndex(43666);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void d() {
        if (this.w.getCollectionType() != null) {
            this.u = MusicModel.CollectionType.COLLECTED.equals(this.w.getCollectionType());
        }
        f();
    }

    public final void f() {
        int i2;
        CheckableImageView checkableImageView = this.f70886g;
        if (this.u) {
            i2 = 2131232183;
        } else {
            i2 = 2131232184;
        }
        checkableImageView.setImageResource(i2);
    }

    public final void b() {
        this.itemView.setPadding(0, 0, 0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) n.b(this.v, 2.0f);
        marginLayoutParams.topMargin = (int) n.b(this.v, 2.0f);
        this.p.requestLayout();
        this.r.setVisibility(8);
        this.f70888i.requestLayout();
    }

    public final void e() {
        String str;
        MusicModel musicModel = this.w;
        if (musicModel != null) {
            if (this.u || d.a(musicModel, this.v, true)) {
                com.ss.android.ugc.aweme.music.b.k<c> kVar = this.G;
                if (kVar != null) {
                    MusicModel musicModel2 = this.w;
                    if (this.u) {
                        str = "unfollow_type";
                    } else {
                        str = "follow_type";
                    }
                    kVar.a(new c(musicModel2, str, this.B, this.x));
                }
                this.u = !this.u;
                this.f70886g.b();
            }
        }
    }

    private void d(boolean z2) {
        if (!z2) {
            b(true);
        } else {
            c(true);
        }
    }

    public final void a(View view) {
        s sVar = this.E;
        if (sVar != null && (this instanceof s)) {
            sVar.a((s) this, view, this.w, this.A);
        }
    }

    private void a(boolean z2) {
        this.f70883d.clearAnimation();
        if (z2) {
            MusicModel musicModel = this.w;
            if (musicModel == null) {
                return;
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f70883d.setImageResource(2131232373);
            } else if (this.w.getMusicType() == MusicModel.MusicType.ONLINE) {
                this.f70883d.setVisibility(0);
                this.f70883d.setImageResource(2131232373);
            }
        } else {
            this.f70883d.setVisibility(0);
            this.f70883d.setImageResource(2131232354);
        }
    }

    private void b(boolean z2) {
        if (this.D) {
            this.f70891l.setVisibility(8);
        } else if (this.f70888i.getVisibility() != 8) {
            if (z2) {
                this.o.setClickable(false);
                int i2 = -z;
                int b2 = (int) n.b(this.v, 30.0f);
                if (gb.a(this.v)) {
                    b2 = -b2;
                }
                a(0, 1, 0, 0, i2, 0, b2, true);
                return;
            }
            this.f70888i.setVisibility(8);
        }
    }

    private void c(boolean z2) {
        if (this.D) {
            this.f70891l.setVisibility(0);
        } else if (this.f70888i.getVisibility() != 0) {
            if (z2) {
                this.o.setClickable(false);
                int i2 = -z;
                int b2 = (int) n.b(this.v, 30.0f);
                if (gb.a(this.v)) {
                    b2 = -b2;
                }
                this.f70888i.setVisibility(0);
                if (gb.a(this.v)) {
                    ((ViewGroup.MarginLayoutParams) this.n.getLayoutParams()).leftMargin = -z;
                } else {
                    ((ViewGroup.MarginLayoutParams) this.n.getLayoutParams()).rightMargin = -z;
                }
                a(100, 0, 1, i2, 0, b2, 0, false);
                return;
            }
            this.f70888i.setVisibility(0);
        }
    }

    public final void a(s sVar, com.ss.android.ugc.aweme.music.b.k<c> kVar) {
        this.E = sVar;
        this.G = kVar;
    }

    public final void a(boolean z2, boolean z3) {
        if (z2) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.da);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.f70883d.setImageResource(2131232648);
            this.f70883d.startAnimation(loadAnimation);
            return;
        }
        this.f70883d.clearAnimation();
        a(z3);
        d(z3);
    }

    public a(View view, int i2) {
        super(view);
        this.v = view.getContext();
        this.H = i2;
        this.f70880a = (SmartImageView) view.findViewById(R.id.bvt);
        this.f70881b = (ImageView) view.findViewById(R.id.bzl);
        this.f70882c = (ImageView) view.findViewById(R.id.bz6);
        this.f70883d = (ImageView) view.findViewById(R.id.c1h);
        this.f70884e = (TextView) view.findViewById(R.id.f3c);
        this.f70885f = (TextView) view.findViewById(R.id.f7e);
        this.f70886g = (CheckableImageView) view.findViewById(R.id.bz3);
        this.f70887h = (ImageView) view.findViewById(R.id.bz5);
        this.f70888i = (ViewGroup) view.findViewById(R.id.ch1);
        this.f70889j = (ImageView) view.findViewById(R.id.c2p);
        this.f70890k = (TextView) view.findViewById(R.id.f_8);
        this.f70891l = (ViewGroup) view.findViewById(R.id.dpd);
        this.f70892m = (TextView) view.findViewById(R.id.f_9);
        this.n = (ViewGroup) view.findViewById(R.id.dpc);
        this.o = (ViewGroup) view.findViewById(R.id.cfv);
        this.p = (ViewGroup) view.findViewById(R.id.dob);
        this.q = (ViewGroup) view.findViewById(R.id.cgv);
        this.r = view.findViewById(R.id.fll);
        this.s = (TextView) view.findViewById(R.id.f35);
        this.t = (RecyclerView) view.findViewById(R.id.cra);
        View findViewById = view.findViewById(R.id.bz5);
        if (findViewById != null) {
            findViewById.setOnClickListener(new b(this));
        }
        View findViewById2 = view.findViewById(R.id.bz3);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new c(this));
        }
        View findViewById3 = view.findViewById(R.id.ch1);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new d(this));
        }
        View findViewById4 = view.findViewById(R.id.cfv);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new e(this));
        }
        View findViewById5 = view.findViewById(R.id.dpd);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new f(this));
        }
        a();
        if (z <= 0) {
            this.f70888i.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            z = (int) (((float) this.f70888i.getMeasuredWidth()) + n.b(this.v, 8.0f));
        }
        this.f70886g.setOnStateChangeListener(new CheckableImageView.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.viewholder.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43667);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void bR_() {
                a aVar = a.this;
                boolean z = aVar.u;
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.music.f.b(z ? 1 : 0, aVar.w));
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void a(int i2) {
                if (i2 == 1) {
                    a.this.f();
                }
            }
        });
    }

    public final void a(MusicModel musicModel, boolean z2, boolean z3, boolean z4, int i2, int i3, b bVar) {
        String str;
        String singer;
        int i4;
        if (musicModel != null) {
            this.C = z2;
            this.D = z3;
            this.x = i3;
            this.B = i2;
            this.y = bVar;
            this.w = musicModel;
            this.A = 0;
            d();
            if (!TextUtils.isEmpty(this.w.getName())) {
                this.f70884e.setText(this.w.getName());
            } else {
                this.f70884e.setTextColor(androidx.core.content.b.c(this.v, R.color.bx));
                TextView textView = this.f70884e;
                if (!TextUtils.isEmpty(this.w.getName())) {
                    str = this.w.getName();
                } else {
                    str = "";
                }
                textView.setText(str);
            }
            if (TextUtils.isEmpty(this.w.getName()) || (!this.w.isOriginal() && !this.w.isArtist())) {
                this.f70881b.setVisibility(8);
            } else {
                this.f70881b.setVisibility(0);
            }
            com.ss.android.ugc.aweme.music.ui.b.d.a(this.f70884e, this.w.getMusic());
            if (this.w.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(this.w.getMatchedPGCSoundInfo().getMixedAuthor())) {
                this.f70885f.setText(this.w.getMatchedPGCSoundInfo().getMixedAuthor());
            } else if (this.w.isPgc() || this.w.getMatchedSongInfo() == null || TextUtils.isEmpty(this.w.getMatchedSongInfo().getTitle())) {
                TextView textView2 = this.f70885f;
                if (TextUtils.isEmpty(this.w.getSinger())) {
                    singer = this.v.getString(R.string.h4j);
                } else {
                    singer = this.w.getSinger();
                }
                textView2.setText(singer);
            } else {
                try {
                    this.f70885f.setText(this.itemView.getContext().getString(R.string.n, "\"" + this.w.getMatchedSongInfo().getTitle() + "\""));
                } catch (Exception e2) {
                    e2.printStackTrace();
                    this.f70885f.setVisibility(8);
                }
            }
            SmartImageView smartImageView = this.f70880a;
            smartImageView.post(new h(this.w, smartImageView));
            this.s.setText(ia.a(this.w.getPresenterDuration()));
            a(z4);
            if (z4) {
                c(false);
            } else {
                b(false);
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f70886g.setVisibility(8);
                this.f70887h.setVisibility(8);
            } else {
                this.f70886g.setVisibility(0);
                this.f70887h.setVisibility(8);
            }
            if (this.C && this.x < 12) {
                this.f70882c.setVisibility(0);
                switch (this.x) {
                    case 0:
                        i4 = 2131232890;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams.topMargin = (int) n.b(this.f70882c.getContext(), 0.0f);
                        marginLayoutParams.leftMargin = marginLayoutParams.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case 1:
                        i4 = 2131232894;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams2.topMargin = (int) n.b(this.f70882c.getContext(), 0.0f);
                        marginLayoutParams2.leftMargin = marginLayoutParams2.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case 2:
                        i4 = 2131232895;
                        ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams22.topMargin = (int) n.b(this.f70882c.getContext(), 0.0f);
                        marginLayoutParams22.leftMargin = marginLayoutParams22.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case 3:
                        i4 = 2131232896;
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams3.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams3.leftMargin = marginLayoutParams3.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case 4:
                        i4 = 2131232897;
                        ViewGroup.MarginLayoutParams marginLayoutParams32 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams32.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams32.leftMargin = marginLayoutParams32.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        i4 = 2131232898;
                        ViewGroup.MarginLayoutParams marginLayoutParams322 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams322.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams322.leftMargin = marginLayoutParams322.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        i4 = 2131232899;
                        ViewGroup.MarginLayoutParams marginLayoutParams3222 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams3222.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams3222.leftMargin = marginLayoutParams3222.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        i4 = 2131232900;
                        ViewGroup.MarginLayoutParams marginLayoutParams32222 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams32222.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams32222.leftMargin = marginLayoutParams32222.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        i4 = 2131232901;
                        ViewGroup.MarginLayoutParams marginLayoutParams322222 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams322222.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams322222.leftMargin = marginLayoutParams322222.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        i4 = 2131232891;
                        ViewGroup.MarginLayoutParams marginLayoutParams3222222 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams3222222.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams3222222.leftMargin = marginLayoutParams3222222.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        i4 = 2131232892;
                        ViewGroup.MarginLayoutParams marginLayoutParams32222222 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams32222222.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams32222222.leftMargin = marginLayoutParams32222222.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        i4 = 2131232893;
                        ViewGroup.MarginLayoutParams marginLayoutParams322222222 = (ViewGroup.MarginLayoutParams) this.f70882c.getLayoutParams();
                        marginLayoutParams322222222.topMargin = (int) n.b(this.f70882c.getContext(), 2.0f);
                        marginLayoutParams322222222.leftMargin = marginLayoutParams322222222.topMargin;
                        this.f70882c.setImageResource(i4);
                        break;
                }
            } else {
                this.f70882c.setVisibility(8);
            }
            c();
            if (musicModel.getSoundsListType() == 2) {
                if (this.F == null) {
                    this.F = h.f121133a.f().a(new k.b(this.p, new g(this)));
                }
                k.a aVar = new k.a();
                aVar.f81126a = ((Integer) musicModel.getExtraParamFromPretreatment().get("rank", (Object) -1)).intValue();
                this.F.a(aVar);
                return;
            }
            k kVar = this.F;
            if (kVar != null) {
                kVar.a(new k.a());
            }
        }
    }

    private void a(long j2, int i2, int i3, int i4, int i5, int i6, int i7, final boolean z2) {
        ValueAnimator duration = ValueAnimator.ofInt(i4, i5).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.choosemusic.viewholder.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(43668);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (gb.a(a.this.v)) {
                    ((ViewGroup.MarginLayoutParams) a.this.n.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((ViewGroup.MarginLayoutParams) a.this.n.getLayoutParams()).rightMargin = intValue;
                }
                a.this.n.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.choosemusic.viewholder.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(43669);
            }

            public final void onAnimationEnd(Animator animator) {
                a.this.o.setClickable(true);
                if (z2) {
                    a.this.f70888i.setVisibility(8);
                    a.this.f70888i.clearAnimation();
                    if (gb.a(a.this.v)) {
                        ((ViewGroup.MarginLayoutParams) a.this.n.getLayoutParams()).leftMargin = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) a.this.n.getLayoutParams()).rightMargin = 0;
                    }
                }
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation((float) i2, (float) i3);
        TranslateAnimation translateAnimation = new TranslateAnimation((float) i6, (float) i7, 0.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(100);
        animationSet.setStartOffset(j2);
        this.f70888i.startAnimation(animationSet);
        duration.start();
    }
}
