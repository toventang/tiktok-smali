package com.ss.android.ugc.aweme.story.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.h.i;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.b.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class StoryHeaderView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public Aweme f138523g;

    /* renamed from: h  reason: collision with root package name */
    public String f138524h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f138525i;

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f138526a = new a();

        static {
            Covode.recordClassIndex(90618);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f138527a = new b();

        static {
            Covode.recordClassIndex(90619);
        }

        b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f138532a = new d();

        static {
            Covode.recordClassIndex(90621);
        }

        d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(90617);
    }

    public StoryHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View b(int i2) {
        if (this.f138525i == null) {
            this.f138525i = new SparseArray();
        }
        View view = (View) this.f138525i.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f138525i.put(i2, findViewById);
        return findViewById;
    }

    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f138533a;

        static {
            Covode.recordClassIndex(90622);
        }

        public e(h.f.a.a aVar) {
            this.f138533a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                this.f138533a.invoke();
            }
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryHeaderView f138528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ cf f138530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f138531d;

        static {
            Covode.recordClassIndex(90620);
        }

        public c(StoryHeaderView storyHeaderView, String str, cf cfVar, Aweme aweme) {
            this.f138528a = storyHeaderView;
            this.f138529b = str;
            this.f138530c = cfVar;
            this.f138531d = aweme;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                if (this.f138529b.equals("personal_homepage") || this.f138529b.equals("others_homepage")) {
                    androidx.fragment.app.e activity = this.f138530c.f91768c.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                StoryHeaderView storyHeaderView = this.f138528a;
                User author = this.f138531d.getAuthor();
                l.b(author, "");
                q qVar = (q) new q().g(storyHeaderView.f138523g).o(storyHeaderView.f138524h).a("click_head");
                qVar.Z = "main_head";
                Aweme aweme = storyHeaderView.f138523g;
                String str2 = null;
                if (aweme != null) {
                    user = aweme.getAuthor();
                } else {
                    user = null;
                }
                qVar.V = h.a(user);
                if (com.ss.android.ugc.aweme.story.d.a.g(storyHeaderView.f138523g)) {
                    str = "story";
                } else {
                    str = UGCMonitor.TYPE_POST;
                }
                qVar.W = str;
                Aweme aweme2 = storyHeaderView.f138523g;
                if (aweme2 != null) {
                    str2 = com.ss.android.ugc.aweme.story.d.a.b(aweme2);
                }
                qVar.b_(str2).f();
                SmartRouter.buildRoute(storyHeaderView.getContext(), "aweme://user/profile/" + author.getUid()).withParam("sec_user_id", author.getSecUid()).open();
            }
        }
    }

    private /* synthetic */ StoryHeaderView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryHeaderView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), R.layout.b28, this, true);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        i.a((View) this, valueOf, (Integer) 0, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()))), (Integer) 0, false, 16);
        setBackgroundResource(R.drawable.a07);
        this.f138524h = "";
    }
}
