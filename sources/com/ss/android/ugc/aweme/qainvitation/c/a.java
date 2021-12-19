package com.ss.android.ugc.aweme.qainvitation.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final C3069a f119078g = new C3069a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private final IQAInvitationService f119079h;

    /* renamed from: i  reason: collision with root package name */
    private String f119080i;

    /* renamed from: j  reason: collision with root package name */
    private String f119081j;

    /* renamed from: k  reason: collision with root package name */
    private long f119082k;

    /* renamed from: l  reason: collision with root package name */
    private long f119083l;

    /* renamed from: m  reason: collision with root package name */
    private List<? extends User> f119084m;

    static {
        Covode.recordClassIndex(77343);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.c.a$a  reason: collision with other inner class name */
    public static final class C3069a {
        static {
            Covode.recordClassIndex(77344);
        }

        private C3069a() {
        }

        public /* synthetic */ C3069a(byte b2) {
            this();
        }
    }

    public final String getEnterFrom() {
        return this.f119081j;
    }

    public final String getEnterMethod() {
        return this.f119080i;
    }

    public final IQAInvitationService getQaInviteService() {
        return this.f119079h;
    }

    public final long getQuestionId() {
        return this.f119082k;
    }

    public final long getQuestionUserId() {
        return this.f119083l;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getUsers() {
        return this.f119084m;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        l.b(parent, "");
        if (parent.getParent() != null) {
            ViewParent parent2 = getParent();
            l.b(parent2, "");
            ViewParent parent3 = parent2.getParent();
            Objects.requireNonNull(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
            View findViewById = ((ViewGroup) parent3).findViewById(R.id.e2o);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public final void setQuestionId(long j2) {
        this.f119082k = j2;
    }

    public final void setQuestionUserId(long j2) {
        this.f119083l = j2;
    }

    public final void setEnterFrom(String str) {
        l.d(str, "");
        this.f119081j = str;
    }

    public final void setEnterMethod(String str) {
        l.d(str, "");
        this.f119080i = str;
    }

    public final void setUsers(List<? extends User> list) {
        l.d(list, "");
        this.f119084m = list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(String str, String str2, long j2, long j3, List<? extends User> list, Context context) {
        super(context, null, 0);
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(context, "");
        MethodCollector.i(5675);
        this.f119080i = str;
        this.f119081j = str2;
        this.f119082k = j2;
        this.f119083l = j3;
        this.f119084m = list;
        IQAInvitationService b2 = QAInvitationService.b();
        l.b(b2, "");
        this.f119079h = b2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ars, this);
        l.b(inflate, "");
        List<IMUser> a2 = b2.a(this.f119084m);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.djj);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) inflate.findViewById(R.id.djj)).setHasFixedSize(true);
        b bVar = new b(a2);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.djj);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(bVar);
        r.a("enter_qa_invited_users_panel", new d().a("enter_from", this.f119081j).a("enter_method", this.f119080i).a("question_id", this.f119082k).a("question_user_id", this.f119083l).a("invitee_count", a2.size()).f66730a);
        MethodCollector.o(5675);
    }

    public /* synthetic */ a(String str, String str2, long j2, long j3, List list, Context context, byte b2) {
        this(str, str2, j2, j3, list, context);
    }
}
