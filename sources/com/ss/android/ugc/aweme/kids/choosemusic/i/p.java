package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ia;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class p extends com.ss.android.ugc.aweme.arch.widgets.a {
    public static final a u = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public RemoteImageView f105814b;

    /* renamed from: c  reason: collision with root package name */
    public RemoteImageView f105815c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f105816d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f105817e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f105818f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f105819g;

    /* renamed from: h  reason: collision with root package name */
    public RelativeLayout f105820h;

    /* renamed from: i  reason: collision with root package name */
    public CheckableImageView f105821i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f105822j;

    /* renamed from: k  reason: collision with root package name */
    public LinearLayout f105823k;

    /* renamed from: l  reason: collision with root package name */
    public LinearLayout f105824l;

    /* renamed from: m  reason: collision with root package name */
    public LinearLayout f105825m;
    public b n;
    public com.ss.android.ugc.aweme.kids.a.a.b o;
    public com.ss.android.ugc.aweme.kids.a.a.c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> p;
    public List<MusicModel> q;
    public int r;
    public Context s;
    public boolean t;
    private TextView v;
    private ValueAnimator w;
    private Animation x;

    public interface b {
        static {
            Covode.recordClassIndex(67734);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(67726);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67733);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final MusicModel c() {
        MusicModel musicModel;
        List<MusicModel> list = this.q;
        if (list == null || (musicModel = (MusicModel) n.b((List) list, this.r)) == null) {
            return null;
        }
        return musicModel;
    }

    public final void a() {
        int i2;
        CheckableImageView checkableImageView = this.f105821i;
        if (checkableImageView != null) {
            if (this.t) {
                i2 = 2131232183;
            } else {
                i2 = 2131233019;
            }
            checkableImageView.setImageResource(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        LinearLayout linearLayout = this.f105823k;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f105824l;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f105825m;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f105835a;

        static {
            Covode.recordClassIndex(67736);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(p pVar) {
            this.f105835a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            RemoteImageView remoteImageView = this.f105835a.f105815c;
            p pVar = this.f105835a;
            pVar.f105815c = pVar.f105814b;
            this.f105835a.f105814b = remoteImageView;
            p pVar2 = this.f105835a;
            pVar2.a(pVar2.f105815c, this.f105835a.r + 1);
        }
    }

    private static String a(MusicModel musicModel) {
        String picBig;
        if (musicModel != null) {
            String picPremium = musicModel.getPicPremium();
            if (picPremium == null || picPremium.length() == 0) {
                if (!(musicModel == null || (picBig = musicModel.getPicBig()) == null || picBig.length() == 0 || musicModel == null)) {
                    return musicModel.getPicBig();
                }
            } else if (musicModel != null) {
                return musicModel.getPicPremium();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f105832a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.b f105833b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f105834c;

        static {
            Covode.recordClassIndex(67735);
        }

        c(p pVar, z.b bVar, z.b bVar2) {
            this.f105832a = pVar;
            this.f105833b = bVar;
            this.f105834c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            RemoteImageView remoteImageView = this.f105832a.f105814b;
            if (remoteImageView != null) {
                remoteImageView.setScaleX(floatValue);
            }
            RemoteImageView remoteImageView2 = this.f105832a.f105814b;
            if (remoteImageView2 != null) {
                remoteImageView2.setScaleY(floatValue);
            }
            RemoteImageView remoteImageView3 = this.f105832a.f105814b;
            if (remoteImageView3 != null) {
                remoteImageView3.setAlpha((floatValue - this.f105833b.element) / this.f105834c.element);
            }
            RemoteImageView remoteImageView4 = this.f105832a.f105815c;
            if (remoteImageView4 != null) {
                remoteImageView4.setScaleX((this.f105833b.element + 1.0f) - floatValue);
            }
            RemoteImageView remoteImageView5 = this.f105832a.f105815c;
            if (remoteImageView5 != null) {
                remoteImageView5.setScaleY((this.f105833b.element + 1.0f) - floatValue);
            }
            RemoteImageView remoteImageView6 = this.f105832a.f105815c;
            if (remoteImageView6 != null) {
                remoteImageView6.setAlpha((1.0f - floatValue) / this.f105834c.element);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(View view) {
        super(view);
        l.d(view, "");
        MethodCollector.i(11023);
        this.s = view.getContext();
        this.f105814b = (RemoteImageView) view.findViewById(R.id.bvy);
        this.f105815c = (RemoteImageView) view.findViewById(R.id.bvz);
        this.f105816d = (ImageView) view.findViewById(R.id.c1h);
        this.f105817e = (FrameLayout) view.findViewById(R.id.dob);
        this.f105819g = (TextView) view.findViewById(R.id.f7e);
        this.f105818f = (TextView) view.findViewById(R.id.f3c);
        this.f105820h = (RelativeLayout) view.findViewById(R.id.doy);
        this.v = (TextView) view.findViewById(R.id.f35);
        this.f105821i = (CheckableImageView) view.findViewById(R.id.bz3);
        this.f105822j = (LinearLayout) view.findViewById(R.id.cfv);
        this.f105823k = (LinearLayout) view.findViewById(R.id.cf1);
        this.f105824l = (LinearLayout) view.findViewById(R.id.ch1);
        this.f105825m = (LinearLayout) view.findViewById(R.id.ch0);
        View view2 = this.itemView;
        l.b(view2, "");
        Animation loadAnimation = AnimationUtils.loadAnimation(view2.getContext(), R.anim.da);
        this.x = loadAnimation;
        if (loadAnimation != null) {
            loadAnimation.setInterpolator(new LinearInterpolator());
        }
        LinearLayout linearLayout = this.f105823k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.i.p.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f105826a;

                static {
                    Covode.recordClassIndex(67727);
                }

                {
                    this.f105826a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    p pVar = this.f105826a;
                    pVar.b();
                    com.ss.android.ugc.aweme.kids.a.a.b bVar = pVar.o;
                    if (bVar != null) {
                        LinearLayout linearLayout = pVar.f105823k;
                        List<MusicModel> list = pVar.q;
                        if (list != null) {
                            musicModel = (MusicModel) n.b((List) list, pVar.r);
                        } else {
                            musicModel = null;
                        }
                        bVar.a(pVar, linearLayout, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout2 = this.f105825m;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.i.p.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f105827a;

                static {
                    Covode.recordClassIndex(67728);
                }

                {
                    this.f105827a = r1;
                }

                public final void onClick(View view) {
                    int i2;
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    p pVar = this.f105827a;
                    int i3 = pVar.r + 1;
                    List<MusicModel> list = pVar.q;
                    int i4 = 0;
                    if (list != null) {
                        i2 = list.size();
                    } else {
                        i2 = 0;
                    }
                    if (i3 >= i2) {
                        pVar.d();
                        return;
                    }
                    List<MusicModel> list2 = pVar.q;
                    if (list2 != null) {
                        i4 = list2.size();
                    }
                    if (i4 - pVar.r <= 3) {
                        pVar.d();
                    }
                    pVar.r++;
                    pVar.a(pVar.r, true);
                    com.ss.android.ugc.aweme.kids.a.a.b bVar = pVar.o;
                    if (bVar != null) {
                        LinearLayout linearLayout = pVar.f105825m;
                        List<MusicModel> list3 = pVar.q;
                        if (list3 != null) {
                            musicModel = (MusicModel) n.b((List) list3, pVar.r);
                        } else {
                            musicModel = null;
                        }
                        bVar.a(pVar, linearLayout, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout3 = this.f105822j;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.i.p.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f105828a;

                static {
                    Covode.recordClassIndex(67729);
                }

                {
                    this.f105828a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    p pVar = this.f105828a;
                    LinearLayout linearLayout = pVar.f105823k;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        pVar.b();
                    }
                    com.ss.android.ugc.aweme.kids.a.a.b bVar = pVar.o;
                    if (bVar != null) {
                        LinearLayout linearLayout2 = pVar.f105822j;
                        List<MusicModel> list = pVar.q;
                        if (list != null) {
                            musicModel = (MusicModel) n.b((List) list, pVar.r);
                        } else {
                            musicModel = null;
                        }
                        bVar.a(pVar, linearLayout2, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout4 = this.f105824l;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.i.p.AnonymousClass4 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f105829a;

                static {
                    Covode.recordClassIndex(67730);
                }

                {
                    this.f105829a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    p pVar = this.f105829a;
                    com.ss.android.ugc.aweme.kids.a.a.b bVar = pVar.o;
                    if (bVar != null) {
                        LinearLayout linearLayout = pVar.f105824l;
                        List<MusicModel> list = pVar.q;
                        if (list != null) {
                            musicModel = (MusicModel) n.b((List) list, pVar.r);
                        } else {
                            musicModel = null;
                        }
                        bVar.a(pVar, linearLayout, musicModel);
                    }
                }
            });
        }
        CheckableImageView checkableImageView = this.f105821i;
        if (checkableImageView != null) {
            checkableImageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.i.p.AnonymousClass5 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f105830a;

                static {
                    Covode.recordClassIndex(67731);
                }

                {
                    this.f105830a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    p pVar = this.f105830a;
                    com.ss.android.ugc.aweme.kids.a.a.b bVar = pVar.o;
                    if (bVar != null) {
                        CheckableImageView checkableImageView = pVar.f105821i;
                        List<MusicModel> list = pVar.q;
                        if (list != null) {
                            musicModel = (MusicModel) n.b((List) list, pVar.r);
                        } else {
                            musicModel = null;
                        }
                        bVar.a(pVar, checkableImageView, musicModel);
                    }
                }
            });
        }
        CheckableImageView checkableImageView2 = this.f105821i;
        if (checkableImageView2 != null) {
            checkableImageView2.setOnStateChangeListener(new CheckableImageView.a(this) {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.i.p.AnonymousClass6 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f105831a;

                static {
                    Covode.recordClassIndex(67732);
                }

                @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
                public final void bR_() {
                    MusicModel musicModel;
                    p pVar = this.f105831a;
                    boolean z = pVar.t;
                    List<MusicModel> list = pVar.q;
                    if (list != null) {
                        musicModel = (MusicModel) n.b((List) list, pVar.r);
                    } else {
                        musicModel = null;
                    }
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.a.d.a(z ? 1 : 0, musicModel));
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f105831a = r1;
                }

                @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
                public final void a(int i2) {
                    if (i2 == 1) {
                        this.f105831a.a();
                    }
                }
            });
            MethodCollector.o(11023);
            return;
        }
        MethodCollector.o(11023);
    }

    public final void a(List<? extends MusicModel> list) {
        List<MusicModel> list2;
        List<MusicModel> list3 = this.q;
        boolean z = true;
        if ((list3 != null && !list3.isEmpty()) || list == null || list.isEmpty()) {
            z = false;
        }
        if (this.q == null) {
            this.q = new ArrayList();
        }
        if (!(list == null || (list2 = this.q) == null)) {
            list2.addAll(list);
        }
        if (z) {
            a(this.r, false);
        }
    }

    public final void a(RemoteImageView remoteImageView, int i2) {
        int i3;
        MusicModel musicModel;
        List<MusicModel> list = this.q;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i2 < i3) {
            List<MusicModel> list2 = this.q;
            if (list2 != null) {
                musicModel = list2.get(i2);
            } else {
                musicModel = null;
            }
            String a2 = a(musicModel);
            if (a2 == null || a2.length() == 0) {
                e.a(remoteImageView, (int) R.color.f159922f);
            } else {
                e.b(remoteImageView, a2, -1, -1);
            }
        }
    }

    public final void a(int i2, boolean z) {
        int i3;
        MusicModel musicModel;
        boolean z2;
        int i4;
        String str;
        Context context;
        String singer;
        String str2;
        List<MusicModel> list = this.q;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i2 < i3) {
            List<MusicModel> list2 = this.q;
            MusicModel.CollectionType collectionType = null;
            if (list2 != null) {
                musicModel = list2.get(i2);
            } else {
                musicModel = null;
            }
            TextView textView = this.f105818f;
            if (textView != null) {
                if (musicModel != null) {
                    str2 = musicModel.getName();
                } else {
                    str2 = null;
                }
                textView.setText(str2);
            }
            TextView textView2 = this.f105819g;
            if (textView2 != null) {
                if (musicModel == null || (singer = musicModel.getSinger()) == null || singer.length() == 0) {
                    TextView textView3 = this.f105819g;
                    if (!(textView3 == null || (context = textView3.getContext()) == null)) {
                        str = context.getString(R.string.h4j);
                    }
                    str = null;
                } else {
                    if (musicModel != null) {
                        str = musicModel.getSinger();
                    }
                    str = null;
                }
                textView2.setText(str);
            }
            TextView textView4 = this.v;
            if (textView4 != null) {
                if (musicModel != null) {
                    i4 = musicModel.getPresenterDuration();
                } else {
                    i4 = 0;
                }
                textView4.setText(ia.a(i4));
            }
            MusicModel.CollectionType collectionType2 = MusicModel.CollectionType.COLLECTED;
            if (musicModel != null) {
                collectionType = musicModel.getCollectionType();
            }
            if (collectionType2 == collectionType) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.t = z2;
            a();
            if (!z) {
                a(this.f105814b, i2);
                a(this.f105815c, i2 + 1);
                return;
            }
            z.b bVar = new z.b();
            bVar.element = 0.2f;
            z.b bVar2 = new z.b();
            bVar2.element = 1.0f - bVar.element;
            this.w = ValueAnimator.ofFloat(1.0f, bVar.element).setDuration(150L);
            RemoteImageView remoteImageView = this.f105815c;
            if (remoteImageView != null) {
                remoteImageView.setAlpha(0.0f);
            }
            RemoteImageView remoteImageView2 = this.f105815c;
            if (remoteImageView2 != null) {
                remoteImageView2.setVisibility(0);
            }
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new c(this, bVar, bVar2));
            }
            ValueAnimator valueAnimator2 = this.w;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new d(this));
            }
            ValueAnimator valueAnimator3 = this.w;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        ImageView imageView = this.f105816d;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (!z) {
            ImageView imageView2 = this.f105816d;
            if (imageView2 != null) {
                imageView2.setImageResource(2131233024);
            }
        } else if (z2) {
            ImageView imageView3 = this.f105816d;
            if (imageView3 != null) {
                imageView3.setImageResource(2131232647);
            }
            ImageView imageView4 = this.f105816d;
            if (imageView4 != null) {
                imageView4.startAnimation(this.x);
            }
        } else {
            ImageView imageView5 = this.f105816d;
            if (imageView5 != null) {
                imageView5.setImageResource(2131233023);
            }
        }
    }
}
