package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.gn;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagLabelEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class an {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TextView f94237a;

    /* renamed from: b  reason: collision with root package name */
    public View f94238b;

    /* renamed from: c  reason: collision with root package name */
    public View f94239c;

    /* renamed from: d  reason: collision with root package name */
    public TuxTextView f94240d;

    /* renamed from: e  reason: collision with root package name */
    public MutualRelationView f94241e;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f94242f;

    /* renamed from: g  reason: collision with root package name */
    public DataCenter f94243g;

    /* renamed from: h  reason: collision with root package name */
    public String f94244h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f94245i = "low_interest";

    /* renamed from: j  reason: collision with root package name */
    public Aweme f94246j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f94247k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f94248l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f94249m;
    public final HashMap<String, String> n;
    private TextView p;
    private List<InteractionTagUserInfo> q = new ArrayList();
    private final h r = i.a((h.f.a.a) new d(this));
    private final h s = i.a((h.f.a.a) new f(this));
    private final h t = i.a((h.f.a.a) new e(this));

    static {
        Covode.recordClassIndex(59875);
    }

    /* access modifiers changed from: protected */
    public final float a() {
        return ((Number) this.r.getValue()).floatValue();
    }

    /* access modifiers changed from: protected */
    public final float b() {
        return ((Number) this.s.getValue()).floatValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59876);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<Float> {
        final /* synthetic */ an this$0;

        static {
            Covode.recordClassIndex(59880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(an anVar) {
            super(0);
            this.this$0 = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f94249m, 4.0f));
        }
    }

    static final class f extends m implements h.f.a.a<Float> {
        final /* synthetic */ an this$0;

        static {
            Covode.recordClassIndex(59881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(an anVar) {
            super(0);
            this.this$0 = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f94249m, 30.0f));
        }
    }

    static final class d extends m implements h.f.a.a<Float> {
        final /* synthetic */ an this$0;

        static {
            Covode.recordClassIndex(59879);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(an anVar) {
            super(0);
            this.this$0 = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(((float) com.ss.android.ugc.aweme.base.utils.i.b(this.this$0.f94249m)) - n.b(this.this$0.f94249m, 105.0f));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f94257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f94258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f94259c;

        static {
            Covode.recordClassIndex(59882);
        }

        g(Aweme aweme, an anVar, Aweme aweme2) {
            this.f94257a = aweme;
            this.f94258b = anVar;
            this.f94259c = aweme2;
        }

        public final void run() {
            an anVar = this.f94258b;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("social_video_tagged_state", this.f94258b.b(this.f94257a));
            anVar.a(hashMap, false);
        }
    }

    private final void d() {
        TextView textView = this.f94237a;
        if (textView != null) {
            textView.setPadding(0, textView.getPaddingTop(), 0, textView.getPaddingTop());
        }
        o.a(this.p, 8);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        String str;
        String authorUid;
        Context context = this.f94249m;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (activity != null && (activity instanceof androidx.fragment.app.e) && this.f94242f != null) {
            CommentService e2 = CommentServiceImpl.e();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            Aweme aweme = this.f94242f;
            if (aweme == null) {
                l.b();
            }
            e2.a(eVar, aweme, this.f94244h, this.f94245i);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f94244h);
            Aweme aweme2 = this.f94242f;
            String str2 = "";
            if (aweme2 == null || (str = aweme2.getAid()) == null) {
                str = str2;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str);
            Aweme aweme3 = this.f94242f;
            if (!(aweme3 == null || (authorUid = aweme3.getAuthorUid()) == null)) {
                str2 = authorUid;
            }
            r.a("tag_anchor_click", a3.a("author_id", str2).a("anchor_type", this.f94245i).f66730a);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        l.d(str, "");
        this.f94245i = str;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f94250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f94251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f94252c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ an f94253d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HashMap f94254e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f94255f;

        static {
            Covode.recordClassIndex(59877);
        }

        b(Object obj, View view, float f2, an anVar, HashMap hashMap, boolean z) {
            this.f94250a = obj;
            this.f94251b = view;
            this.f94252c = f2;
            this.f94253d = anVar;
            this.f94254e = hashMap;
            this.f94255f = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94253d.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ an f94256a;

        static {
            Covode.recordClassIndex(59878);
        }

        c(an anVar) {
            this.f94256a = anVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DataCenter dataCenter = this.f94256a.f94243g;
            if (dataCenter != null) {
                dataCenter.a("title_view_click", this.f94256a.f94244h);
            }
        }
    }

    private final void b(String str) {
        TextView textView = this.f94237a;
        if (textView != null) {
            textView.setPadding(0, textView.getPaddingTop(), 0, 0);
        }
        TextView textView2 = this.p;
        if (textView2 != null) {
            textView2.setText(str);
        }
        o.a(this.p, 0);
    }

    private final String d(String str) {
        String str2;
        try {
            Context context = this.f94249m;
            Object[] objArr = new Object[1];
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            objArr[0] = str2;
            String string = context.getString(R.string.bvy, objArr);
            l.b(string, "");
            return string;
        } catch (Throwable unused) {
            if (str == null) {
                str = "";
            }
            return str;
        }
    }

    private final String c(String str) {
        StringBuilder sb = new StringBuilder("· ");
        String string = this.f94249m.getString(R.string.aat);
        l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{str}, 1));
        l.b(a2, "");
        return sb.append(a2).toString();
    }

    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        TextView textView;
        if (bVar != null && (str = bVar.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -969411447) {
                if (hashCode == 1104022845 && str.equals("bind_title_touch_listener") && (textView = this.f94237a) != null) {
                    textView.setOnTouchListener((View.OnTouchListener) bVar.a());
                }
            } else if (str.equals("social_video_tag_info")) {
                Aweme aweme = (Aweme) bVar.a();
                if (aweme != null) {
                    Aweme aweme2 = this.f94242f;
                    if (aweme2 != null && l.a((Object) aweme.getAid(), (Object) aweme2.getAid())) {
                        aweme2.setInteractionTagInfo(aweme.getInteractionTagInfo());
                        p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new g(aweme2, this, aweme)));
                        return;
                    }
                    return;
                }
                View view = this.f94239c;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r3 == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.an.a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final String b(Aweme aweme) {
        String a2;
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        List<InteractionTagUserInfo> list = null;
        if (!(interactionTagInfo == null || (list = interactionTagInfo.getTaggedUsers()) == null)) {
            Iterator<T> it = this.q.iterator();
            while (it.hasNext()) {
                if (!list.contains(it.next())) {
                    new InteractionTagLabelEvent(aweme).post();
                }
            }
            this.q = list;
        }
        if (list == null || !(!list.isEmpty())) {
            return "";
        }
        if (list.size() != 1) {
            String string = this.f94249m.getResources().getString(R.string.gc1);
            l.b(string, "");
            a2 = com.a.a(string, Arrays.copyOf(new Object[]{"", Integer.valueOf(list.size())}, 2));
            l.b(a2, "");
        } else if (com.ss.android.ugc.aweme.language.d.c()) {
            a2 = list.get(0).getNickname();
        } else {
            a2 = list.get(0).getUniqueId();
        }
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    public void a(HashMap<String, Object> hashMap) {
        TextView textView;
        l.d(hashMap, "");
        Object obj = hashMap.get("title_text_state");
        if (!(obj == null || (textView = this.f94237a) == null)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            textView.setText((String) obj);
        }
        User user = (User) hashMap.get("author_state");
        if (user != null) {
            TextUtils.equals(this.f94244h, "homepage_hot");
            io.a(this.f94249m, user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f94237a);
        }
        Object obj2 = hashMap.get("no_visible_state");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj2).booleanValue()) {
            TextView textView2 = this.f94237a;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        } else {
            TextView textView3 = this.f94237a;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        a(hashMap, true);
        if (gn.a() == 2) {
            int i2 = Build.VERSION.SDK_INT;
            TextView textView4 = this.p;
            if (textView4 != null) {
                textView4.setTextDirection(2);
            }
            Object obj3 = hashMap.get("post_time_state");
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj3).booleanValue()) {
                Object obj4 = hashMap.get("play_count_state");
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                b(c((String) obj4));
                return;
            }
            d();
            return;
        }
        Object obj5 = hashMap.get("play_time_style_state");
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj5).booleanValue()) {
            Object obj6 = hashMap.get("post_time_state");
            Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj6).booleanValue()) {
                Object obj7 = hashMap.get("play_count_state");
                Objects.requireNonNull(obj7, "null cannot be cast to non-null type kotlin.String");
                b((String) obj7);
                return;
            }
            d();
            return;
        }
        o.a(this.p, 8);
    }

    public final void a(DataCenter dataCenter, GenericWidget genericWidget) {
        l.d(genericWidget, "");
        this.f94243g = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("bind_title_touch_listener", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) genericWidget);
            dataCenter.a("social_video_tag_info", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) genericWidget);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ed, code lost:
        if (r0 == null) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r0.isDelete() != false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.ss.android.ugc.aweme.feed.model.VideoItemParams r13, java.util.HashMap<java.lang.String, java.lang.Object> r14) {
        /*
        // Method dump skipped, instructions count: 598
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.an.a(com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.util.HashMap):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.HashMap<java.lang.String, java.lang.Object> r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 496
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.an.a(java.util.HashMap, boolean):void");
    }

    public an(View view, View.OnTouchListener onTouchListener, Context context, HashMap<String, String> hashMap) {
        TextView textView;
        TextView textView2;
        View view2;
        TuxTextView tuxTextView;
        MutualRelationView mutualRelationView;
        View findViewById;
        l.d(context, "");
        this.f94249m = context;
        this.n = hashMap;
        View view3 = null;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.f4s);
        } else {
            textView = null;
        }
        this.p = textView;
        if (view != null) {
            textView2 = (TextView) view.findViewById(R.id.title);
        } else {
            textView2 = null;
        }
        this.f94237a = textView2;
        if (textView2 != null) {
            textView2.setOnTouchListener(onTouchListener);
        }
        if (view != null) {
            view2 = view.findViewById(R.id.dqk);
        } else {
            view2 = null;
        }
        this.f94238b = view2;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.e73);
        } else {
            tuxTextView = null;
        }
        this.f94240d = tuxTextView;
        if (view == null || (mutualRelationView = (MutualRelationView) view.findViewById(R.id.e72)) == null) {
            mutualRelationView = null;
        } else {
            mutualRelationView.setSocialVideoTag(true);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            mutualRelationView.a(a2, h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        }
        this.f94241e = mutualRelationView;
        if (!(view == null || (findViewById = view.findViewById(R.id.e74)) == null)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(n.b(context, 2.0f));
            Integer a3 = com.bytedance.tux.h.d.a(context, R.attr.a9);
            if (a3 != null) {
                gradientDrawable.setColor(a3.intValue());
            }
            findViewById.setBackground(gradientDrawable);
            view3 = findViewById;
        }
        this.f94239c = view3;
    }
}
