package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.af;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.v;
import java.util.List;
import java.util.Objects;

public final class f extends ConstraintLayout implements com.ss.android.ugc.aweme.recommend.d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f68503i = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    String f68504g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f68505h;

    /* renamed from: j  reason: collision with root package name */
    private final h f68506j;

    /* renamed from: k  reason: collision with root package name */
    private final h f68507k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.inbox.widget.b f68508l;

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f68509m;

    static {
        Covode.recordClassIndex(42174);
    }

    private View b(int i2) {
        if (this.f68509m == null) {
            this.f68509m = new SparseArray();
        }
        View view = (View) this.f68509m.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f68509m.put(i2, findViewById);
        return findViewById;
    }

    private final int getNormalTextColor() {
        return ((Number) this.f68506j.getValue()).intValue();
    }

    private final int getPressedTextColor() {
        return ((Number) this.f68507k.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42177);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final com.ss.android.ugc.aweme.inbox.widget.b getUiStyleConfig() {
        return this.f68508l;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f68513a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f68514b;

        static {
            Covode.recordClassIndex(42179);
        }

        c(f fVar, SpannableStringBuilder spannableStringBuilder) {
            this.f68513a = fVar;
            this.f68514b = spannableStringBuilder;
        }

        public final void run() {
            this.f68513a.a(this.f68514b);
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(42180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.$context, R.color.bx));
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(42181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.$context, R.color.c4));
        }
    }

    public final void setUiStyleConfig(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        this.f68508l = bVar;
    }

    public static final class b implements af.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f68512a;

        static {
            Covode.recordClassIndex(42178);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(f fVar) {
            this.f68512a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.common.af.a
        public final void a(View view, User user, int i2) {
            l.d(view, "");
            if (i2 == 1) {
                View.OnClickListener onClickListener = this.f68512a.f68505h;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                f fVar = this.f68512a;
                if (user == null) {
                    l.b();
                }
                SmartRouter.buildRoute(fVar.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("enter_from", fVar.f68504g).withParam("sec_user_id", user.getSecUid()).withParam("previous_page", "message").withParam("enter_method", "follow_button").withParam("extra_from_pre_page", "notification_page").withParam("extra_previous_page_position", "card_head").open();
            } else if (i2 == 0) {
                this.f68512a.performClick();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.recommend.d
    public final void setEnterFrom(String str) {
        l.d(str, "");
        this.f68504g = str;
    }

    @Override // com.ss.android.ugc.aweme.recommend.d
    public final void setOutClickListener(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        this.f68505h = onClickListener;
    }

    private final af a(User user) {
        return new af(user, new b(this), getNormalTextColor(), getPressedTextColor());
    }

    public final void b(View view) {
        View.OnClickListener onClickListener = this.f68505h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        SmartRouter.buildRoute(getContext(), "//friends/find").withParam("previous_page", "notification_page").open();
        r.a("enter_find_friends", ag.a(v.a("enter_from", "notification_page")));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(10664);
        LayoutInflater.from(context).inflate(R.layout.as0, this);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        setLayoutParams(new ConstraintLayout.a(-1, h.g.a.a(TypedValue.applyDimension(1, 56.0f, system.getDisplayMetrics()))));
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.base.widget.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f68510a;

            static {
                Covode.recordClassIndex(42175);
            }

            {
                this.f68510a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                    f fVar = this.f68510a;
                    l.b(view, "");
                    fVar.b(view);
                }
            }
        });
        ((TuxTextView) b(R.id.exf)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.base.widget.f.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f68511a;

            static {
                Covode.recordClassIndex(42176);
            }

            {
                this.f68511a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                    f fVar = this.f68511a;
                    l.b(view, "");
                    fVar.b(view);
                }
            }
        });
        this.f68506j = i.a((h.f.a.a) new d(context));
        this.f68507k = i.a((h.f.a.a) new e(context));
        this.f68504g = "";
        MethodCollector.o(10664);
    }

    public final void a(SpannableStringBuilder spannableStringBuilder) {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.exf);
        l.b(tuxTextView, "");
        if (tuxTextView.getWidth() == 0) {
            ((TuxTextView) b(R.id.exf)).post(new c(this, spannableStringBuilder));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            TuxTextView tuxTextView2 = (TuxTextView) b(R.id.exf);
            l.b(tuxTextView2, "");
            tuxTextView2.setBreakStrategy(0);
        }
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.exf);
        l.b(tuxTextView3, "");
        TuxTextView tuxTextView4 = (TuxTextView) b(R.id.exf);
        l.b(tuxTextView4, "");
        TextPaint paint = tuxTextView4.getPaint();
        l.b(paint, "");
        TuxTextView tuxTextView5 = (TuxTextView) b(R.id.exf);
        l.b(tuxTextView5, "");
        int width = tuxTextView5.getWidth();
        TuxTextView tuxTextView6 = (TuxTextView) b(R.id.exf);
        l.b(tuxTextView6, "");
        tuxTextView3.setText(com.ss.android.ugc.aweme.base.utils.r.a(spannableStringBuilder, paint, width, tuxTextView6.getMaxLines(), 0, 0));
    }

    @Override // com.ss.android.ugc.aweme.recommend.d
    public final void a(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        if (!l.a(this.f68508l, bVar)) {
            this.f68508l = bVar;
            if (bVar.f104374b != -1 && 1 != 0 && bVar.f104375c != -1 && bVar.f104376d != -1) {
                RemoteImageView remoteImageView = (RemoteImageView) b(R.id.bu5);
                l.b(remoteImageView, "");
                if (remoteImageView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    RemoteImageView remoteImageView2 = (RemoteImageView) b(R.id.bu3);
                    l.b(remoteImageView2, "");
                    RemoteImageView remoteImageView3 = (RemoteImageView) b(R.id.bu3);
                    l.b(remoteImageView3, "");
                    ViewGroup.LayoutParams layoutParams = remoteImageView3.getLayoutParams();
                    layoutParams.width = bVar.f104375c;
                    layoutParams.height = bVar.f104375c;
                    remoteImageView2.setLayoutParams(layoutParams);
                    RemoteImageView remoteImageView4 = (RemoteImageView) b(R.id.bu5);
                    l.b(remoteImageView4, "");
                    RemoteImageView remoteImageView5 = (RemoteImageView) b(R.id.bu5);
                    l.b(remoteImageView5, "");
                    ViewGroup.LayoutParams layoutParams2 = remoteImageView5.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.width = bVar.f104376d;
                    marginLayoutParams.height = bVar.f104376d;
                    int i2 = bVar.f104374b;
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    marginLayoutParams.setMarginStart((i2 + h.g.a.a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()))) - bVar.f104376d);
                    remoteImageView4.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.recommend.d
    public final void a(List<? extends User> list, int i2) {
        Integer num;
        CharSequence quantityText;
        if (list == null || list.size() < 2) {
            StringBuilder sb = new StringBuilder("bind but friends data invalid:");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.common.f.c("RecommendAggregate", sb.append(num).append(", ").append(i2).toString());
            return;
        }
        User user = (User) list.get(0);
        User user2 = (User) list.get(1);
        com.ss.android.ugc.aweme.base.e.a((RemoteImageView) b(R.id.bu3), user.getAvatarThumb());
        com.ss.android.ugc.aweme.base.e.a((RemoteImageView) b(R.id.bu5), user2.getAvatarThumb());
        if (list.size() == 2) {
            Context context = getContext();
            l.b(context, "");
            quantityText = context.getResources().getString(R.string.cln);
        } else {
            Context context2 = getContext();
            l.b(context2, "");
            quantityText = context2.getResources().getQuantityText(R.plurals.db, i2 - 2);
        }
        SpannableStringBuilder a2 = a(a(new SpannableStringBuilder(quantityText), "%1$s", user), "%2$s", user2);
        int i3 = i2 - 2;
        int a3 = p.a((CharSequence) a2, "%3$d", 0, false, 6);
        if (a3 >= 0) {
            a2.replace(a3, a3 + 4, (CharSequence) String.valueOf(i3));
        }
        a(a2);
        TuxTextView tuxTextView = (TuxTextView) b(R.id.exf);
        l.b(tuxTextView, "");
        if (com.ss.android.ugc.aweme.base.ui.h.f68367a == null) {
            com.ss.android.ugc.aweme.base.ui.h.f68367a = new com.ss.android.ugc.aweme.base.ui.h();
        }
        tuxTextView.setMovementMethod(com.ss.android.ugc.aweme.base.ui.h.f68367a);
    }

    private final SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, String str, User user) {
        int a2;
        String nickname = user.getNickname();
        if (!(nickname == null || nickname.length() == 0 || nickname == null || (a2 = p.a((CharSequence) spannableStringBuilder, str, 0, false, 6)) < 0)) {
            spannableStringBuilder.replace(a2, str.length() + a2, (CharSequence) nickname);
            spannableStringBuilder.setSpan(a(user), a2, nickname.length() + a2, 17);
        }
        return spannableStringBuilder;
    }
}
