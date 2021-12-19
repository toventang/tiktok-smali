package com.ss.android.ugc.aweme.music.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.q;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.music.b.d;
import com.ss.android.ugc.aweme.music.f.b;
import com.ss.android.ugc.aweme.music.f.d;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

public final class f extends RecyclerView.ViewHolder {
    private static int s;

    /* renamed from: a  reason: collision with root package name */
    TextView f111335a;

    /* renamed from: b  reason: collision with root package name */
    TextView f111336b;

    /* renamed from: c  reason: collision with root package name */
    TextView f111337c;

    /* renamed from: d  reason: collision with root package name */
    RemoteImageView f111338d;

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f111339e;

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f111340f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f111341g;

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f111342h;

    /* renamed from: i  reason: collision with root package name */
    ProgressBar f111343i;

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f111344j;

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f111345k;

    /* renamed from: l  reason: collision with root package name */
    ImageView f111346l;

    /* renamed from: m  reason: collision with root package name */
    View f111347m;
    LinearLayout n;
    public MusicModel o;
    CheckableImageView p;
    ImageView q;
    boolean r;
    private Context t;
    private b u;
    private Context v;
    private int w;
    private String x;
    private k<d> y;
    private int z;

    static {
        Covode.recordClassIndex(71542);
    }

    private static String a(int i2) {
        return i2 == 0 ? "popular_song" : i2 == 3 ? "song_category" : i2 == 2 ? "search_result" : "";
    }

    private static String b(int i2) {
        if (i2 == 0) {
            return "music_library_hot";
        }
        if (i2 == 1) {
            return "music_library_mine";
        }
        if (i2 == 2) {
            return "music_library_search";
        }
        if (i2 == 3) {
            return "music_library_list";
        }
        return null;
    }

    public final void a() {
        int i2;
        CheckableImageView checkableImageView = this.p;
        if (this.r) {
            i2 = 2131232183;
        } else {
            i2 = 2131232184;
        }
        checkableImageView.setImageResource(i2);
    }

    public final void a(View view) {
        String str;
        String str2;
        int id = view.getId();
        if (id == R.id.a8h) {
            if (!AccountService.a().e().isLogin()) {
                c.a(com.bytedance.ies.ugc.appcontext.f.j(), a(this.w), "click_favorite_music");
                return;
            }
            MusicModel musicModel = this.o;
            if (musicModel != null && com.ss.android.ugc.aweme.music.k.d.a(musicModel, this.v, true)) {
                k<d> kVar = this.y;
                if (kVar != null) {
                    MusicModel musicModel2 = this.o;
                    if (this.r) {
                        str2 = "unfollow_type";
                    } else {
                        str2 = "follow_type";
                    }
                    kVar.a(new d(musicModel2, str2));
                }
                this.r = !this.r;
                MobClick obtain = MobClick.obtain();
                if (this.r) {
                    str = "collection_music";
                } else {
                    str = "collection_music_cancel";
                }
                MobClick extValueLong = obtain.setEventName(str).setLabelName(b(this.w)).setValue(String.valueOf(this.o.getMusicId())).setExtValueLong(0);
                if (!TextUtils.isEmpty(this.x)) {
                    extValueLong.setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("search_keyword", this.x).a());
                }
                r.onEvent(extValueLong);
                this.p.b();
            }
        } else if (id == R.id.cpx) {
            MusicModel musicModel3 = this.o;
            if (musicModel3 == null || musicModel3.getMusicStatus() != 0 || this.o.getMusic() == null) {
                MusicModel musicModel4 = this.o;
                if (musicModel4 != null) {
                    if (com.ss.android.ugc.aweme.music.k.d.a(musicModel4, this.itemView.getContext(), true)) {
                        t.a(t.a(), "aweme://music/detail/" + this.o.getMusicId());
                        MobClick value = MobClick.obtain().setEventName("music_detail").setLabelName(b(this.w)).setValue(this.o.getMusicId());
                        if (!TextUtils.isEmpty(this.x)) {
                            value.setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("search_keyword", this.x).a());
                        }
                        r.onEvent(value);
                    } else {
                        return;
                    }
                }
            } else {
                String offlineDesc = this.o.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.v.getString(R.string.dcb);
                }
                new a(view.getContext()).a(offlineDesc).a();
                return;
            }
        }
        b bVar = this.u;
        if (bVar != null) {
            bVar.a(view);
        }
    }

    public final void a(MusicModel musicModel, String str, boolean z2, int i2) {
        boolean z3;
        String singer;
        String str2;
        int indexOf;
        if (musicModel != null) {
            this.o = musicModel;
            this.w = i2;
            this.x = str;
            if (musicModel.getCollectionType() != null) {
                this.r = MusicModel.CollectionType.COLLECTED.equals(musicModel.getCollectionType());
            }
            a();
            boolean z4 = true;
            if (TextUtils.isEmpty(this.o.getName()) || TextUtils.isEmpty(str) || (indexOf = this.o.getName().indexOf(str)) <= 0) {
                z3 = false;
            } else {
                SpannableString spannableString = new SpannableString(this.o.getName());
                spannableString.setSpan(new ForegroundColorSpan(this.itemView.getResources().getColor(R.color.f159917a)), indexOf, str.length() + indexOf, 17);
                this.f111335a.setText(spannableString);
                z3 = true;
            }
            String str3 = "";
            if (!z3) {
                this.f111335a.setTextColor(this.itemView.getResources().getColor(R.color.bx));
                TextView textView = this.f111335a;
                if (!TextUtils.isEmpty(this.o.getName())) {
                    str2 = this.o.getName();
                } else {
                    str2 = str3;
                }
                textView.setText(str2);
            }
            int i3 = 8;
            if (this.o.getMusicType() == MusicModel.MusicType.LOCAL) {
                TextView textView2 = this.f111337c;
                long localMusicDuration = this.o.getLocalMusicDuration();
                if (localMusicDuration > 0) {
                    long j2 = localMusicDuration / 1000;
                    long j3 = j2 % 60;
                    long j4 = j2 / 60;
                    long j5 = j4 / 60;
                    long j6 = j4 % 60;
                    if (0 == j5) {
                        str3 = com.a.a(Locale.getDefault(), "%02d:%02d", new Object[]{Long.valueOf(j6), Long.valueOf(j3)});
                    } else {
                        str3 = com.a.a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j3)});
                    }
                }
                textView2.setText(str3);
            } else {
                this.f111337c.setText(com.ss.android.ugc.aweme.music.k.d.a(this.o.getPresenterDuration()));
                if (this.o.getDuration() > 0) {
                    this.f111337c.setVisibility(0);
                } else {
                    this.f111337c.setVisibility(8);
                }
            }
            TextView textView3 = this.f111336b;
            if (TextUtils.isEmpty(this.o.getSinger())) {
                singer = this.itemView.getResources().getString(R.string.h4j);
            } else {
                singer = this.o.getSinger();
            }
            textView3.setText(singer);
            if (!TextUtils.isEmpty(this.o.getPicPremium())) {
                e.b(this.f111338d, this.o.getPicPremium(), -1, -1);
            } else if (!TextUtils.isEmpty(this.o.getPicBig())) {
                e.b(this.f111338d, this.o.getPicBig(), -1, -1);
            } else {
                e.a(this.f111338d, 2131232252);
            }
            if (this.o.isOriginal()) {
                this.q.setVisibility(8);
                Drawable drawable = this.itemView.getContext().getResources().getDrawable(2131232362);
                drawable.setBounds(0, 0, (int) n.b(this.itemView.getContext(), 16.0f), (int) n.b(this.itemView.getContext(), 16.0f));
                this.f111335a.setCompoundDrawables(drawable, null, null, null);
                this.f111335a.setCompoundDrawablePadding((int) n.b(this.itemView.getContext(), 2.0f));
            } else {
                this.f111335a.setCompoundDrawables(null, null, null, null);
                this.q.setVisibility(8);
            }
            if (z2) {
                this.f111345k.setClickable(false);
                int i4 = -s;
                int b2 = (int) n.b(this.t, 30.0f);
                this.f111339e.setVisibility(0);
                if (gb.a(com.bytedance.ies.ugc.appcontext.d.a())) {
                    ((ViewGroup.MarginLayoutParams) this.n.getLayoutParams()).leftMargin = -s;
                } else {
                    ((ViewGroup.MarginLayoutParams) this.n.getLayoutParams()).rightMargin = -s;
                }
                a(100, 0, 1, i4, 0, b2, 0, false);
                if (this.o.getMusicType() == MusicModel.MusicType.LOCAL) {
                    this.f111341g.setImageResource(2131232373);
                    this.f111343i.setVisibility(8);
                } else if (this.o.getMusicType() == MusicModel.MusicType.ONLINE) {
                    this.f111341g.setVisibility(0);
                    this.f111341g.setImageResource(2131232373);
                    this.f111343i.setVisibility(8);
                } else {
                    this.f111341g.setVisibility(0);
                    this.f111341g.setImageResource(2131232373);
                    this.f111343i.setVisibility(8);
                }
            } else {
                if (this.f111339e.getVisibility() == 0) {
                    this.f111345k.setClickable(false);
                    a(0, 1, 0, 0, -s, 0, (int) n.b(this.t, 30.0f), true);
                }
                this.f111343i.setVisibility(8);
                this.f111341g.setVisibility(0);
                this.f111341g.setImageResource(2131232354);
            }
            if (musicModel.isChallengeMusic()) {
                this.f111344j.setVisibility(8);
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
            }
            LinearLayout linearLayout = this.f111344j;
            if (this.z == 1) {
                i3 = 0;
            }
            linearLayout.setVisibility(i3);
            LinearLayout linearLayout2 = this.f111344j;
            if (this.z != 1) {
                z4 = false;
            }
            linearLayout2.setEnabled(z4);
            this.p.setOnStateChangeListener(new CheckableImageView.a() {
                /* class com.ss.android.ugc.aweme.music.b.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(71543);
                }

                @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
                public final void bR_() {
                    f fVar = f.this;
                    boolean z = fVar.r;
                    com.ss.android.ugc.d.a.c.a(new b(z ? 1 : 0, fVar.o));
                }

                @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
                public final void a(int i2) {
                    if (i2 == 1) {
                        f.this.a();
                    }
                }
            });
            String a2 = a(i2);
            this.f111342h.getContext();
            r.a("show_music", a2, musicModel.getMusicId(), 0);
            if (!q.a()) {
                com.ss.android.ugc.aweme.common.q.a("client_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "popular_song").a("music_id", "123321").a("content", "music").f66730a);
            }
        }
    }

    public f(View view, b bVar, int i2, d.a aVar, k<com.ss.android.ugc.aweme.music.f.d> kVar) {
        super(view);
        this.t = view.getContext();
        this.u = bVar;
        this.y = kVar;
        this.f111335a = (TextView) view.findViewById(R.id.f3c);
        this.f111336b = (TextView) view.findViewById(R.id.f7e);
        this.f111337c = (TextView) view.findViewById(R.id.eyv);
        this.f111338d = (RemoteImageView) view.findViewById(R.id.dtl);
        this.f111339e = (LinearLayout) view.findViewById(R.id.don);
        this.f111340f = (RelativeLayout) view.findViewById(R.id.doy);
        this.f111341g = (ImageView) view.findViewById(R.id.c1h);
        this.f111342h = (LinearLayout) view.findViewById(R.id.cgx);
        this.f111343i = (ProgressBar) view.findViewById(R.id.d2s);
        this.f111344j = (LinearLayout) view.findViewById(R.id.cpx);
        this.f111345k = (LinearLayout) view.findViewById(R.id.cqk);
        this.f111346l = (ImageView) view.findViewById(R.id.cpw);
        this.f111347m = view.findViewById(R.id.crg);
        this.n = (LinearLayout) view.findViewById(R.id.a8h);
        this.p = (CheckableImageView) view.findViewById(R.id.cpr);
        this.q = (ImageView) view.findViewById(R.id.d0d);
        View findViewById = view.findViewById(R.id.don);
        if (findViewById != null) {
            findViewById.setOnClickListener(new g(this));
        }
        View findViewById2 = view.findViewById(R.id.cgx);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new h(this));
        }
        View findViewById3 = view.findViewById(R.id.a8h);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new i(this));
        }
        View findViewById4 = view.findViewById(R.id.cpx);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new j(this));
        }
        this.v = view.getContext();
        this.z = i2;
        aVar.ordinal();
        if (s <= 0) {
            this.f111339e.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            s = (int) (((float) this.f111339e.getMeasuredWidth()) + n.b(this.t, 8.0f));
        }
    }

    private void a(long j2, int i2, int i3, int i4, int i5, int i6, int i7, final boolean z2) {
        ValueAnimator duration = ValueAnimator.ofInt(i4, i5).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.music.b.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(71544);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (gb.a(com.bytedance.ies.ugc.appcontext.d.a())) {
                    ((ViewGroup.MarginLayoutParams) f.this.n.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((ViewGroup.MarginLayoutParams) f.this.n.getLayoutParams()).rightMargin = intValue;
                }
                f.this.n.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.music.b.f.AnonymousClass3 */

            static {
                Covode.recordClassIndex(71545);
            }

            public final void onAnimationEnd(Animator animator) {
                f.this.f111345k.setClickable(true);
                if (z2) {
                    f.this.f111339e.setVisibility(8);
                    if (gb.a(com.bytedance.ies.ugc.appcontext.d.a())) {
                        ((ViewGroup.MarginLayoutParams) f.this.n.getLayoutParams()).leftMargin = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) f.this.n.getLayoutParams()).rightMargin = 0;
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
        this.f111339e.startAnimation(animationSet);
        duration.start();
    }
}
