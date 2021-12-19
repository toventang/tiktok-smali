package com.ss.android.ugc.aweme.kids.choosemusic.i;

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
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.b.b;
import com.ss.android.ugc.aweme.kids.choosemusic.h.k;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ia;
import com.zhiliaoapp.musically.R;

public abstract class a extends RecyclerView.ViewHolder {
    private static int x;
    private boolean A;
    private k B;
    private c<b> C;
    private int D;

    /* renamed from: a  reason: collision with root package name */
    SmartImageView f105737a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f105738b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f105739c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f105740d;

    /* renamed from: e  reason: collision with root package name */
    TextView f105741e;

    /* renamed from: f  reason: collision with root package name */
    TextView f105742f;

    /* renamed from: g  reason: collision with root package name */
    CheckableImageView f105743g;

    /* renamed from: h  reason: collision with root package name */
    ImageView f105744h;

    /* renamed from: i  reason: collision with root package name */
    ViewGroup f105745i;

    /* renamed from: j  reason: collision with root package name */
    ImageView f105746j;

    /* renamed from: k  reason: collision with root package name */
    TextView f105747k;

    /* renamed from: l  reason: collision with root package name */
    ViewGroup f105748l;

    /* renamed from: m  reason: collision with root package name */
    public ViewGroup f105749m;
    ViewGroup n;
    ViewGroup o;
    View p;
    TextView q;
    RecyclerView r;
    public boolean s;
    protected Context t;
    public MusicModel u;
    public int v;
    protected com.ss.android.ugc.aweme.kids.choosemusic.a w;
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(67703);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void c() {
        if (this.u.getCollectionType() != null) {
            this.s = MusicModel.CollectionType.COLLECTED.equals(this.u.getCollectionType());
        }
        e();
    }

    public final void e() {
        int i2;
        CheckableImageView checkableImageView = this.f105743g;
        if (this.s) {
            i2 = 2131232183;
        } else {
            i2 = 2131233019;
        }
        checkableImageView.setImageResource(i2);
    }

    public final void d() {
        String str;
        MusicModel musicModel = this.u;
        if (musicModel != null) {
            if (this.s || com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel, this.t, true)) {
                c<b> cVar = this.C;
                if (cVar != null) {
                    MusicModel musicModel2 = this.u;
                    if (this.s) {
                        str = "unfollow_type";
                    } else {
                        str = "follow_type";
                    }
                    cVar.a(new b(musicModel2, str, this.z, this.v));
                }
                this.s = !this.s;
                this.f105743g.b();
            }
        }
    }

    public final void b() {
        this.itemView.setPadding(0, 0, 0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) n.b(this.t, 2.0f);
        marginLayoutParams.topMargin = (int) n.b(this.t, 2.0f);
        this.n.requestLayout();
        this.p.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.f105745i.getLayoutParams()).rightMargin = (int) n.b(this.t, 8.0f);
        this.f105745i.requestLayout();
    }

    private void d(boolean z2) {
        if (!z2) {
            b(true);
        } else {
            c(true);
        }
    }

    public final void a(View view) {
        k kVar = this.B;
        if (kVar != null && (this instanceof o)) {
            kVar.a((o) this, view, this.u);
        }
    }

    private void a(boolean z2) {
        this.f105740d.clearAnimation();
        if (z2) {
            MusicModel musicModel = this.u;
            if (musicModel == null) {
                return;
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f105740d.setImageResource(2131233023);
            } else if (this.u.getMusicType() == MusicModel.MusicType.ONLINE) {
                this.f105740d.setVisibility(0);
                this.f105740d.setImageResource(2131233023);
            }
        } else {
            this.f105740d.setVisibility(0);
            this.f105740d.setImageResource(2131233024);
        }
    }

    private void b(boolean z2) {
        if (this.f105745i.getVisibility() != 8) {
            if (z2) {
                this.f105749m.setClickable(false);
                int i2 = -x;
                int b2 = (int) n.b(this.t, 30.0f);
                if (gb.a(this.t)) {
                    b2 = -b2;
                }
                a(0, 1, 0, 0, i2, 0, b2, true);
                return;
            }
            this.f105745i.setVisibility(8);
        }
    }

    private void c(boolean z2) {
        if (this.f105745i.getVisibility() != 0) {
            if (z2) {
                this.f105749m.setClickable(false);
                int i2 = -x;
                int b2 = (int) n.b(this.t, 30.0f);
                if (gb.a(this.t)) {
                    b2 = -b2;
                }
                this.f105745i.setVisibility(0);
                if (gb.a(this.t)) {
                    ((ViewGroup.MarginLayoutParams) this.f105748l.getLayoutParams()).leftMargin = -x;
                } else {
                    ((ViewGroup.MarginLayoutParams) this.f105748l.getLayoutParams()).rightMargin = -x;
                }
                a(100, 0, 1, i2, 0, b2, 0, false);
                return;
            }
            this.f105745i.setVisibility(0);
        }
    }

    public final void a(k kVar, c<b> cVar) {
        this.B = kVar;
        this.C = cVar;
    }

    public final void a(boolean z2, boolean z3) {
        if (z2) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.da);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.f105740d.setImageResource(2131232647);
            this.f105740d.startAnimation(loadAnimation);
            return;
        }
        this.f105740d.clearAnimation();
        a(z3);
        d(z3);
    }

    public a(View view, int i2) {
        super(view);
        this.t = view.getContext();
        this.D = i2;
        this.f105737a = (SmartImageView) view.findViewById(R.id.bvt);
        this.f105738b = (ImageView) view.findViewById(R.id.bzl);
        this.f105739c = (ImageView) view.findViewById(R.id.bz6);
        this.f105740d = (ImageView) view.findViewById(R.id.c1h);
        this.f105741e = (TextView) view.findViewById(R.id.f3c);
        this.f105742f = (TextView) view.findViewById(R.id.f7e);
        this.f105743g = (CheckableImageView) view.findViewById(R.id.bz3);
        this.f105744h = (ImageView) view.findViewById(R.id.bz5);
        this.f105745i = (ViewGroup) view.findViewById(R.id.ch1);
        this.f105746j = (ImageView) view.findViewById(R.id.c2p);
        this.f105747k = (TextView) view.findViewById(R.id.f_8);
        this.f105748l = (ViewGroup) view.findViewById(R.id.dpc);
        this.f105749m = (ViewGroup) view.findViewById(R.id.cfv);
        this.n = (ViewGroup) view.findViewById(R.id.dob);
        this.o = (ViewGroup) view.findViewById(R.id.cgv);
        this.p = view.findViewById(R.id.fll);
        this.q = (TextView) view.findViewById(R.id.f35);
        this.r = (RecyclerView) view.findViewById(R.id.cra);
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
        a();
        if (x <= 0) {
            this.f105745i.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            x = (int) (((float) this.f105745i.getMeasuredWidth()) + n.b(this.t, 8.0f));
        }
        this.f105743g.setOnStateChangeListener(new CheckableImageView.a() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.i.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67704);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void bR_() {
                a aVar = a.this;
                boolean z = aVar.s;
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.a.d.a(z ? 1 : 0, aVar.u));
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void a(int i2) {
                if (i2 == 1) {
                    a.this.e();
                }
            }
        });
    }

    public final void a(MusicModel musicModel, boolean z2, boolean z3, int i2, int i3, com.ss.android.ugc.aweme.kids.choosemusic.a aVar) {
        String str;
        TextView textView;
        String singer;
        int i4;
        if (musicModel != null) {
            this.A = z2;
            this.v = i3;
            this.z = i2;
            this.w = aVar;
            this.u = musicModel;
            this.y = 0;
            c();
            if (!TextUtils.isEmpty(this.u.getName())) {
                this.f105741e.setText(this.u.getName());
            } else {
                this.f105741e.setTextColor(androidx.core.content.b.c(this.t, R.color.bx));
                TextView textView2 = this.f105741e;
                if (!TextUtils.isEmpty(this.u.getName())) {
                    str = this.u.getName();
                } else {
                    str = "";
                }
                textView2.setText(str);
            }
            if (TextUtils.isEmpty(this.u.getName()) || (!this.u.isOriginal() && !this.u.isArtist())) {
                this.f105738b.setVisibility(8);
            } else {
                this.f105738b.setVisibility(0);
            }
            com.ss.android.ugc.aweme.kids.a.h.a.c.a(this.f105741e, this.u.getMusic());
            if (this.u.getMatchedPGCSoundInfo() == null || TextUtils.isEmpty(this.u.getMatchedPGCSoundInfo().getMixedAuthor())) {
                textView = this.f105742f;
                if (TextUtils.isEmpty(this.u.getSinger())) {
                    singer = this.t.getString(R.string.h4j);
                } else {
                    singer = this.u.getSinger();
                }
            } else {
                textView = this.f105742f;
                singer = this.u.getMatchedPGCSoundInfo().getMixedAuthor();
            }
            textView.setText(singer);
            SmartImageView smartImageView = this.f105737a;
            smartImageView.post(new f(this.u, smartImageView));
            this.q.setText(ia.a(this.u.getPresenterDuration()));
            a(z3);
            if (z3) {
                c(false);
            } else {
                b(false);
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f105743g.setVisibility(8);
                this.f105744h.setVisibility(8);
            } else {
                this.f105743g.setVisibility(0);
                this.f105744h.setVisibility(8);
            }
            if (!this.A || this.v >= 12) {
                this.f105739c.setVisibility(8);
                return;
            }
            this.f105739c.setVisibility(0);
            switch (this.v) {
                case 0:
                    i4 = 2131232890;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams.topMargin = (int) n.b(this.f105739c.getContext(), 0.0f);
                    marginLayoutParams.leftMargin = marginLayoutParams.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case 1:
                    i4 = 2131232894;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams2.topMargin = (int) n.b(this.f105739c.getContext(), 0.0f);
                    marginLayoutParams2.leftMargin = marginLayoutParams2.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case 2:
                    i4 = 2131232895;
                    ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams22.topMargin = (int) n.b(this.f105739c.getContext(), 0.0f);
                    marginLayoutParams22.leftMargin = marginLayoutParams22.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case 3:
                    i4 = 2131232896;
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams3.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams3.leftMargin = marginLayoutParams3.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case 4:
                    i4 = 2131232897;
                    ViewGroup.MarginLayoutParams marginLayoutParams32 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams32.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams32.leftMargin = marginLayoutParams32.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    i4 = 2131232898;
                    ViewGroup.MarginLayoutParams marginLayoutParams322 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams322.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams322.leftMargin = marginLayoutParams322.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    i4 = 2131232899;
                    ViewGroup.MarginLayoutParams marginLayoutParams3222 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams3222.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams3222.leftMargin = marginLayoutParams3222.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    i4 = 2131233031;
                    ViewGroup.MarginLayoutParams marginLayoutParams32222 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams32222.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams32222.leftMargin = marginLayoutParams32222.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    i4 = 2131232901;
                    ViewGroup.MarginLayoutParams marginLayoutParams322222 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams322222.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams322222.leftMargin = marginLayoutParams322222.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    i4 = 2131232891;
                    ViewGroup.MarginLayoutParams marginLayoutParams3222222 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams3222222.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams3222222.leftMargin = marginLayoutParams3222222.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    i4 = 2131232892;
                    ViewGroup.MarginLayoutParams marginLayoutParams32222222 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams32222222.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams32222222.leftMargin = marginLayoutParams32222222.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    i4 = 2131232893;
                    ViewGroup.MarginLayoutParams marginLayoutParams322222222 = (ViewGroup.MarginLayoutParams) this.f105739c.getLayoutParams();
                    marginLayoutParams322222222.topMargin = (int) n.b(this.f105739c.getContext(), 2.0f);
                    marginLayoutParams322222222.leftMargin = marginLayoutParams322222222.topMargin;
                    this.f105739c.setImageResource(i4);
                    return;
                default:
                    return;
            }
        }
    }

    private void a(long j2, int i2, int i3, int i4, int i5, int i6, int i7, final boolean z2) {
        ValueAnimator duration = ValueAnimator.ofInt(i4, i5).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.i.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(67705);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (gb.a(a.this.t)) {
                    ((ViewGroup.MarginLayoutParams) a.this.f105748l.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((ViewGroup.MarginLayoutParams) a.this.f105748l.getLayoutParams()).rightMargin = intValue;
                }
                a.this.f105748l.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.i.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(67706);
            }

            public final void onAnimationEnd(Animator animator) {
                a.this.f105749m.setClickable(true);
                if (z2) {
                    a.this.f105745i.setVisibility(8);
                    a.this.f105745i.clearAnimation();
                    if (gb.a(a.this.t)) {
                        ((ViewGroup.MarginLayoutParams) a.this.f105748l.getLayoutParams()).leftMargin = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) a.this.f105748l.getLayoutParams()).rightMargin = 0;
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
        this.f105745i.startAnimation(animationSet);
        duration.start();
    }
}
