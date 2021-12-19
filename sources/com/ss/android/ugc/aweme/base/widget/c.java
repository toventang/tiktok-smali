package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.h.i;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.experiment.fv;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.ss.android.ugc.aweme.friends.ui.au;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.a;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class c extends LinearLayout implements com.ss.android.ugc.aweme.recommend.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68477b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super Integer, z> f68478a;

    /* renamed from: d  reason: collision with root package name */
    private final int f68479d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.inbox.widget.b f68480e;

    /* renamed from: f  reason: collision with root package name */
    private int f68481f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f68482g;

    static {
        Covode.recordClassIndex(42162);
    }

    private View c(int i2) {
        if (this.f68482g == null) {
            this.f68482g = new SparseArray();
        }
        View view = (View) this.f68482g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f68482g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.recommend.a
    public final c getView() {
        return this;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42163);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getScenario() {
        return this.f68481f;
    }

    public final int getScene() {
        return this.f68479d;
    }

    public final com.ss.android.ugc.aweme.inbox.widget.b getUiStyleConfig() {
        return this.f68480e;
    }

    private final boolean a() {
        int i2 = this.f68481f;
        if (i2 == 1 || i2 == 8 || i2 == 9) {
            return true;
        }
        return false;
    }

    private final int getAvatarMarginLeft() {
        if (this.f68481f == 1) {
            return 12;
        }
        return 16;
    }

    private final int getItemVerticalPaddingByScenario() {
        int i2 = this.f68481f;
        if (i2 == 1 || i2 == 5) {
            return 10;
        }
        return 8;
    }

    @Override // com.ss.android.ugc.aweme.recommend.a
    public final com.ss.android.ugc.aweme.following.ui.view.a getFollowBtn() {
        NewFollowButton newFollowButton = (NewFollowButton) c(R.id.b7b);
        l.b(newFollowButton, "");
        return newFollowButton;
    }

    private final int getAvatarSize() {
        int i2 = this.f68481f;
        if (i2 == 1 || i2 == 5) {
            return 48;
        }
        if (a.C3099a.f120060a.contains(Integer.valueOf(this.f68481f))) {
            return 40;
        }
        return 56;
    }

    private final int getFollowBtnMarginRight() {
        int i2 = this.f68481f;
        if (i2 == 1) {
            return 12;
        }
        if (i2 == 8 || a.C3099a.f120060a.contains(Integer.valueOf(i2))) {
            return 16;
        }
        return 0;
    }

    private final int getItemHeightByScenario() {
        int i2 = this.f68481f;
        if (i2 == 1 || i2 == 5) {
            return 68;
        }
        if (a.C3099a.f120060a.contains(Integer.valueOf(this.f68481f))) {
            return 56;
        }
        return 72;
    }

    private final void b() {
        NewFollowButton newFollowButton = (NewFollowButton) c(R.id.b7b);
        l.b(newFollowButton, "");
        ViewGroup.LayoutParams layoutParams = newFollowButton.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, 0, 0);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams2.setMarginEnd(h.g.a.a(TypedValue.applyDimension(1, 0.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams2.width = h.g.a.a(TypedValue.applyDimension(1, 88.0f, system2.getDisplayMetrics()));
        NewFollowButton newFollowButton2 = (NewFollowButton) c(R.id.b7b);
        l.b(newFollowButton2, "");
        newFollowButton2.setLayoutParams(layoutParams2);
    }

    private final void c() {
        NewFollowButton newFollowButton = (NewFollowButton) c(R.id.b7b);
        l.b(newFollowButton, "");
        ViewGroup.LayoutParams layoutParams = newFollowButton.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams2.setMargins(0, 0, h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())), 0);
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams2.setMarginEnd(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        layoutParams2.width = h.g.a.a(TypedValue.applyDimension(1, 120.0f, system3.getDisplayMetrics()));
        NewFollowButton newFollowButton2 = (NewFollowButton) c(R.id.b7b);
        l.b(newFollowButton2, "");
        newFollowButton2.setLayoutParams(layoutParams2);
    }

    @Override // com.ss.android.ugc.aweme.recommend.a
    public final void setEventListener(h.f.a.b<? super Integer, z> bVar) {
        this.f68478a = bVar;
    }

    public final void setScenario(int i2) {
        this.f68481f = i2;
    }

    public final void setUiStyleConfig(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        this.f68480e = bVar;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f68483a;

        static {
            Covode.recordClassIndex(42164);
        }

        b(c cVar) {
            this.f68483a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super Integer, z> bVar = this.f68483a.f68478a;
            if (bVar != null) {
                bVar.invoke(1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC1547c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f68484a;

        static {
            Covode.recordClassIndex(42165);
        }

        View$OnClickListenerC1547c(c cVar) {
            this.f68484a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super Integer, z> bVar = this.f68484a.f68478a;
            if (bVar != null) {
                bVar.invoke(0);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f68485a;

        static {
            Covode.recordClassIndex(42166);
        }

        d(c cVar) {
            this.f68485a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super Integer, z> bVar = this.f68485a.f68478a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(au.f97191d));
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f68486a;

        static {
            Covode.recordClassIndex(42167);
        }

        e(c cVar) {
            this.f68486a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super Integer, z> bVar = this.f68486a.f68478a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(au.f97192e));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.recommend.a
    public final void a(boolean z) {
        ((NewFollowButton) c(R.id.b7b)).setShouldShowMessageText(z);
    }

    private final void a(int i2) {
        if (!a()) {
            if (i2 == 0) {
                TuxIconView tuxIconView = (TuxIconView) c(R.id.tq);
                l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                return;
            }
            TuxIconView tuxIconView2 = (TuxIconView) c(R.id.tq);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
    }

    private final void b(int i2) {
        if (a()) {
            if (this.f68481f != 9) {
                b();
            }
        } else if (i2 == 0) {
            b();
        } else if (i2 == 1 || i2 == 2 || i2 == 4) {
            c();
        }
    }

    private final void setRecommendReason(User user) {
        if (!TextUtils.isEmpty(user.getRecommendReason())) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.dhz);
            l.b(tuxTextView, "");
            String recommendReason = user.getRecommendReason();
            if (recommendReason == null) {
                recommendReason = "";
            }
            tuxTextView.setText(recommendReason);
        }
    }

    private final void a(View view) {
        com.ss.android.ugc.aweme.inbox.widget.b bVar = this.f68480e;
        if (bVar != null && bVar.f104382j != -1 && 1 != 0 && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = bVar.f104382j;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.recommend.a
    public final void a(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        boolean z;
        com.ss.android.ugc.aweme.inbox.widget.b bVar2;
        l.d(bVar, "");
        if (!l.a(this.f68480e, bVar)) {
            this.f68480e = bVar;
            if (bVar.f104374b != -1) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.inbox.widget.b bVar3 = null;
            if (z) {
                SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) c(R.id.ov);
                l.b(smartAvatarImageView, "");
                SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) c(R.id.ov);
                l.b(smartAvatarImageView2, "");
                ViewGroup.LayoutParams layoutParams = smartAvatarImageView2.getLayoutParams();
                layoutParams.width = bVar.f104374b;
                layoutParams.height = bVar.f104374b;
                smartAvatarImageView.setLayoutParams(layoutParams);
            }
            if (bVar.f104377e != -1) {
                bVar2 = bVar;
            } else {
                bVar2 = null;
            }
            if (bVar2 != null) {
                ((TuxTextView) c(R.id.ck0)).setTuxFont(bVar2.f104377e);
            }
            if (bVar.f104378f != -1) {
                ((TuxTextView) c(R.id.ck0)).a((float) bVar.f104378f);
            }
            if (bVar.f104379g != -1) {
                bVar3 = bVar;
            }
            if (bVar3 != null) {
                ((TuxTextView) c(R.id.ak_)).setTuxFont(bVar3.f104379g);
            }
            if (bVar.f104381i != -1) {
                ((TuxTextView) c(R.id.ak_)).setTextColor(bVar.f104381i);
            }
            TuxTextView tuxTextView = (TuxTextView) c(R.id.ak_);
            l.b(tuxTextView, "");
            a(tuxTextView);
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.dhz);
            l.b(tuxTextView2, "");
            a(tuxTextView2);
            MutualRelationView mutualRelationView = (MutualRelationView) c(R.id.crt);
            l.b(mutualRelationView, "");
            a(mutualRelationView);
        }
    }

    @Override // com.ss.android.ugc.aweme.recommend.a
    public final void a(User user) {
        l.d(user, "");
        setOnClickListener(new b(this));
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(user.getAvatarThumb()));
        a2.E = (SmartImageView) c(R.id.ov);
        a2.a("NewRecommendSuggestedItemView").c();
        int a3 = fv.a();
        if (a3 == fv.f90107a) {
            int i2 = this.f68481f;
            if (i2 == 2 || i2 == 1 || i2 == 7 || i2 == 6) {
                TuxTextView tuxTextView = (TuxTextView) c(R.id.ck0);
                l.b(tuxTextView, "");
                tuxTextView.setText(user.getNickname());
                TuxTextView tuxTextView2 = (TuxTextView) c(R.id.ak_);
                l.b(tuxTextView2, "");
                tuxTextView2.setText(user.getUniqueId());
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) c(R.id.ck0);
                l.b(tuxTextView3, "");
                tuxTextView3.setText(user.getUniqueId());
                TuxTextView tuxTextView4 = (TuxTextView) c(R.id.ak_);
                l.b(tuxTextView4, "");
                tuxTextView4.setText(user.getNickname());
            }
        } else if (a3 == fv.f90108b) {
            TuxTextView tuxTextView5 = (TuxTextView) c(R.id.ck0);
            l.b(tuxTextView5, "");
            tuxTextView5.setText(user.getNickname());
            TuxTextView tuxTextView6 = (TuxTextView) c(R.id.ak_);
            l.b(tuxTextView6, "");
            tuxTextView6.setText(user.getUniqueId());
        } else if (a3 == fv.f90109c) {
            TuxTextView tuxTextView7 = (TuxTextView) c(R.id.ck0);
            l.b(tuxTextView7, "");
            tuxTextView7.setText(user.getUniqueId());
            TuxTextView tuxTextView8 = (TuxTextView) c(R.id.ak_);
            l.b(tuxTextView8, "");
            tuxTextView8.setText(user.getNickname());
        } else if (a3 == fv.f90110d) {
            TuxTextView tuxTextView9 = (TuxTextView) c(R.id.ck0);
            l.b(tuxTextView9, "");
            tuxTextView9.setText(user.getNickname());
            TuxTextView tuxTextView10 = (TuxTextView) c(R.id.ak_);
            l.b(tuxTextView10, "");
            tuxTextView10.setVisibility(8);
        } else if (a3 == fv.f90111e) {
            TuxTextView tuxTextView11 = (TuxTextView) c(R.id.ck0);
            l.b(tuxTextView11, "");
            tuxTextView11.setText(user.getUniqueId());
            TuxTextView tuxTextView12 = (TuxTextView) c(R.id.ak_);
            l.b(tuxTextView12, "");
            tuxTextView12.setVisibility(8);
        }
        if (this.f68481f == 8) {
            TuxTextView tuxTextView13 = (TuxTextView) c(R.id.ck0);
            l.b(tuxTextView13, "");
            tuxTextView13.setText(user.getNickname());
            TuxTextView tuxTextView14 = (TuxTextView) c(R.id.ak_);
            l.b(tuxTextView14, "");
            tuxTextView14.setText(user.getUniqueId());
            TuxTextView tuxTextView15 = (TuxTextView) c(R.id.ak_);
            l.b(tuxTextView15, "");
            tuxTextView15.setVisibility(0);
        }
        ((TuxTextView) c(R.id.ck0)).setOnClickListener(new View$OnClickListenerC1547c(this));
        if (user.getMutualStruct() != null) {
            TuxTextView tuxTextView16 = (TuxTextView) c(R.id.dhz);
            l.b(tuxTextView16, "");
            tuxTextView16.setVisibility(8);
            MutualRelationView mutualRelationView = (MutualRelationView) c(R.id.crt);
            l.b(mutualRelationView, "");
            mutualRelationView.setVisibility(0);
            ((MutualRelationView) c(R.id.crt)).setTextColor(androidx.core.content.b.c(getContext(), R.color.c5));
            ((MutualRelationView) c(R.id.crt)).a(user.getMutualStruct(), com.ss.android.ugc.aweme.friends.e.d());
        } else {
            com.ss.android.ugc.aweme.social.ext.a.a((TuxTextView) c(R.id.dhz), user, null, null, 6);
            MutualRelationView mutualRelationView2 = (MutualRelationView) c(R.id.crt);
            l.b(mutualRelationView2, "");
            mutualRelationView2.setVisibility(8);
            TuxTextView tuxTextView17 = (TuxTextView) c(R.id.dhz);
            l.b(tuxTextView17, "");
            tuxTextView17.setVisibility(0);
        }
        ((NewFollowButton) c(R.id.b7b)).setOnClickListener(new d(this));
        if (a()) {
            NewFollowButton newFollowButton = (NewFollowButton) c(R.id.b7b);
            l.b(newFollowButton, "");
            ViewGroup.LayoutParams layoutParams = newFollowButton.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float followBtnMarginRight = (float) getFollowBtnMarginRight();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a4 = h.g.a.a(TypedValue.applyDimension(1, followBtnMarginRight, system.getDisplayMetrics()));
            layoutParams2.setMarginEnd(a4);
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, a4, layoutParams2.bottomMargin);
            NewFollowButton newFollowButton2 = (NewFollowButton) c(R.id.b7b);
            l.b(newFollowButton2, "");
            newFollowButton2.setLayoutParams(layoutParams2);
            TuxIconView tuxIconView = (TuxIconView) c(R.id.tq);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(8);
        } else {
            NewFollowButton newFollowButton3 = (NewFollowButton) c(R.id.b7b);
            l.b(newFollowButton3, "");
            ViewGroup.LayoutParams layoutParams3 = newFollowButton3.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            layoutParams4.setMarginEnd(h.g.a.a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics())));
            int i3 = layoutParams4.leftMargin;
            int i4 = layoutParams4.topMargin;
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            layoutParams4.setMargins(i3, i4, h.g.a.a(TypedValue.applyDimension(1, 0.0f, system3.getDisplayMetrics())), layoutParams4.bottomMargin);
            NewFollowButton newFollowButton4 = (NewFollowButton) c(R.id.b7b);
            l.b(newFollowButton4, "");
            newFollowButton4.setLayoutParams(layoutParams4);
            TuxIconView tuxIconView2 = (TuxIconView) c(R.id.tq);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
            ((TuxIconView) c(R.id.tq)).setOnClickListener(new e(this));
        }
        a(user.getFollowStatus(), user.getFollowerStatus(), user.getUid());
        TuxIconView tuxIconView3 = (TuxIconView) c(R.id.fey);
        l.b(tuxIconView3, "");
        tuxIconView3.setVisibility(8);
        io.a(getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), (TextView) c(R.id.ck0));
    }

    private final void a(int i2, int i3) {
        if (in.d()) {
            NewFollowButton newFollowButton = (NewFollowButton) c(R.id.b7b);
            l.b(newFollowButton, "");
            newFollowButton.setVisibility(8);
            return;
        }
        ((NewFollowButton) c(R.id.b7b)).a(i2, i3);
        b(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context, int i2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(11523);
        this.f68481f = i2;
        this.f68479d = i2;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float itemVerticalPaddingByScenario = (float) getItemVerticalPaddingByScenario();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, itemVerticalPaddingByScenario, system.getDisplayMetrics()));
        i.a((View) this, Integer.valueOf(paddingLeft), Integer.valueOf(a2), Integer.valueOf(paddingRight), Integer.valueOf(a2), false, 16);
        LayoutInflater.from(context).inflate(R.layout.aq5, this);
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) c(R.id.ov);
        l.b(smartAvatarImageView, "");
        ViewGroup.LayoutParams layoutParams = smartAvatarImageView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float avatarSize = (float) getAvatarSize();
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            layoutParams2.width = h.g.a.a(TypedValue.applyDimension(1, avatarSize, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            layoutParams2.height = h.g.a.a(TypedValue.applyDimension(1, avatarSize, system3.getDisplayMetrics()));
            float avatarMarginLeft = (float) getAvatarMarginLeft();
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            layoutParams2.setMarginStart(h.g.a.a(TypedValue.applyDimension(1, avatarMarginLeft, system4.getDisplayMetrics())));
            float avatarMarginLeft2 = (float) getAvatarMarginLeft();
            Resources system5 = Resources.getSystem();
            l.a((Object) system5, "");
            layoutParams2.setMargins(h.g.a.a(TypedValue.applyDimension(1, avatarMarginLeft2, system5.getDisplayMetrics())), layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) c(R.id.ov);
            l.b(smartAvatarImageView2, "");
            smartAvatarImageView2.setLayoutParams(layoutParams2);
            setBackgroundResource(R.drawable.bav);
            setWeightSum(1.0f);
            MethodCollector.o(11523);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        MethodCollector.o(11523);
        throw nullPointerException;
    }

    public /* synthetic */ c(Context context, int i2, byte b2) {
        this(context, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r0 == null) goto L_0x0022;
     */
    @Override // com.ss.android.ugc.aweme.recommend.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            r4.a(r5)
            r0 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r3 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r0)
            r0 = 2131364421(0x7f0a0a45, float:1.8348679E38)
            android.view.View r2 = r4.c(r0)
            com.ss.android.ugc.aweme.follow.NewFollowButton r2 = (com.ss.android.ugc.aweme.follow.NewFollowButton) r2
            if (r3 == 0) goto L_0x0022
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            java.lang.String r0 = r3.getEntranceButtonText(r1, r7)
            if (r0 != 0) goto L_0x002d
        L_0x0022:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131825868(0x7f1114cc, float:1.9284604E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x002d:
            r2.setMessageText(r0)
            r4.a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.widget.c.a(int, int, java.lang.String):void");
    }
}
