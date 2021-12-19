package com.ss.android.ugc.aweme.feed.trending;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.trending.TrendingCurChangeCallBack;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.concurrent.TimeUnit;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: e  reason: collision with root package name */
    public static final C2278a f93943e = new C2278a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ViewPropertyAnimator f93944a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f93945b;

    /* renamed from: c  reason: collision with root package name */
    public View f93946c;

    /* renamed from: d  reason: collision with root package name */
    public e f93947d;

    /* renamed from: f  reason: collision with root package name */
    private TuxTextView f93948f;

    /* renamed from: g  reason: collision with root package name */
    private f.a.b.b f93949g;

    static {
        Covode.recordClassIndex(59756);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.trending.a$a  reason: collision with other inner class name */
    public static final class C2278a {
        static {
            Covode.recordClassIndex(59758);
        }

        private C2278a() {
        }

        public /* synthetic */ C2278a(byte b2) {
            this();
        }
    }

    public final void a() {
        String str;
        Aweme aweme = this.f93945b;
        if (aweme != null) {
            aweme.getAid();
        }
        f.a.b.b bVar = this.f93949g;
        if (bVar != null) {
            bVar.dispose();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f93944a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        View view = this.f93946c;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f93946c;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        TuxTextView tuxTextView = this.f93948f;
        if (tuxTextView != null) {
            Aweme aweme2 = this.f93945b;
            if (aweme2 != null) {
                str = aweme2.getTrendingName();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
    }

    public final void b() {
        this.f93949g = t.b("").e(1000, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f93951a;

        static {
            Covode.recordClassIndex(59759);
        }

        b(a aVar) {
            this.f93951a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ViewPropertyAnimator viewPropertyAnimator;
            Aweme aweme = this.f93951a.f93945b;
            if (aweme != null) {
                aweme.getAid();
            }
            View view = this.f93951a.f93946c;
            if (view == null || view.getVisibility() != 8) {
                a aVar = this.f93951a;
                View view2 = aVar.f93946c;
                if (view2 != null) {
                    viewPropertyAnimator = view2.animate();
                } else {
                    viewPropertyAnimator = null;
                }
                aVar.f93944a = viewPropertyAnimator;
                ViewPropertyAnimator viewPropertyAnimator2 = this.f93951a.f93944a;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.setDuration(100);
                    viewPropertyAnimator2.alpha(0.0f);
                    viewPropertyAnimator2.start();
                    viewPropertyAnimator2.setListener(new AnimatorListenerAdapter(this) {
                        /* class com.ss.android.ugc.aweme.feed.trending.a.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f93952a;

                        static {
                            Covode.recordClassIndex(59760);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f93952a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            View view = this.f93952a.f93951a.f93946c;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            Aweme aweme = this.f93952a.f93951a.f93945b;
                            if (aweme != null) {
                                aweme.getAid();
                            }
                        }
                    });
                }
            }
        }
    }

    static final class c extends m implements h.f.a.m<Aweme, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(59761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Aweme aweme, Boolean bool) {
            String str;
            Aweme aweme2 = aweme;
            boolean booleanValue = bool.booleanValue();
            if (aweme2 != null) {
                Aweme aweme3 = this.this$0.f93945b;
                if (aweme3 != null) {
                    str = aweme3.getAid();
                } else {
                    str = null;
                }
                if (!(!l.a((Object) str, (Object) aweme2.getAid()))) {
                    Aweme aweme4 = this.this$0.f93945b;
                    if (aweme4 != null) {
                        aweme4.getAid();
                    }
                    Aweme aweme5 = this.this$0.f93945b;
                    if (aweme5 != null) {
                        aweme5.getDesc();
                    }
                    if (booleanValue) {
                        this.this$0.a();
                    } else {
                        View view = this.this$0.f93946c;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, e eVar) {
        super(view);
        l.d(view, "");
        l.d(eVar, "");
        this.f93947d = eVar;
        this.f93946c = view.findViewById(R.id.er1);
        this.f93948f = (TuxTextView) view.findViewById(R.id.er2);
        e eVar2 = this.f93947d;
        c cVar = new c(this);
        l.d(eVar2, "");
        l.d(eVar2, "");
        l.d(cVar, "");
        TrendingCurChangeCallBack.a.a(eVar2).observe(eVar2, new TrendingCurChangeCallBack.a.C2277a(cVar));
        View view2 = this.f93946c;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.feed.trending.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f93950a;

                static {
                    Covode.recordClassIndex(59757);
                }

                {
                    this.f93950a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    View view2 = this.f93950a.f93946c;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
            });
        }
    }
}
