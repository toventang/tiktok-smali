package com.ss.android.ugc.aweme.friends.invite.v2;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.k;
import com.ss.android.ugc.aweme.emoji.widget.EmojiCompatTuxTextView;
import com.ss.android.ugc.aweme.friends.i.f;
import com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.share.improve.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.m.p;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

public final class ContactInvitationItemView extends ConstraintLayout implements com.ss.android.ugc.aweme.friends.invite.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f96901k = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public InvitationViewModel f96902g;

    /* renamed from: h  reason: collision with root package name */
    public Fragment f96903h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f96904i;

    /* renamed from: j  reason: collision with root package name */
    public h.f.a.b<? super String, z> f96905j;

    /* renamed from: l  reason: collision with root package name */
    private final h f96906l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.inbox.widget.b f96907m;
    private SparseArray n;

    static {
        Covode.recordClassIndex(61494);
    }

    public final View b(int i2) {
        if (this.n == null) {
            this.n = new SparseArray();
        }
        View view = (View) this.n.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.n.put(i2, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final InvitedLifecycleCallback getInvitedLifecycle() {
        return (InvitedLifecycleCallback) this.f96906l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61496);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<InvitedLifecycleCallback> {
        final /* synthetic */ ContactInvitationItemView this$0;

        static {
            Covode.recordClassIndex(61497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ContactInvitationItemView contactInvitationItemView) {
            super(0);
            this.this$0 = contactInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InvitedLifecycleCallback invoke() {
            return new InvitedLifecycleCallback(this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.a
    public final LiveData<Boolean> getOnLoading() {
        InvitationViewModel invitationViewModel = this.f96902g;
        if (invitationViewModel == null) {
            l.a("invitationVM");
        }
        return invitationViewModel.a();
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.a
    public final void a() {
        Fragment fragment = this.f96903h;
        if (fragment == null) {
            l.a("fragment");
        }
        fragment.getLifecycle().a(getInvitedLifecycle());
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.a
    public final void b() {
        Fragment fragment = this.f96903h;
        if (fragment == null) {
            l.a("fragment");
        }
        fragment.getLifecycle().b(getInvitedLifecycle());
    }

    public static final class InvitedLifecycleCallback implements au {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<ContactInvitationItemView> f96908a;

        static {
            Covode.recordClassIndex(61495);
        }

        @Override // androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            if (aVar == i.a.ON_RESUME) {
                onResume();
            }
        }

        @v(a = i.a.ON_RESUME)
        public final void onResume() {
            ContactInvitationItemView contactInvitationItemView = this.f96908a.get();
            if (contactInvitationItemView != null && contactInvitationItemView.f96904i) {
                contactInvitationItemView.f96904i = false;
                TuxButton tuxButton = (TuxButton) contactInvitationItemView.b(R.id.yt);
                l.b(tuxButton, "");
                tuxButton.setEnabled(false);
                TuxButton tuxButton2 = (TuxButton) contactInvitationItemView.b(R.id.yt);
                l.b(tuxButton2, "");
                tuxButton2.setText(contactInvitationItemView.getResources().getString(R.string.cm_));
                new com.bytedance.tux.g.b(contactInvitationItemView).e(R.string.cm5).b();
                Fragment fragment = contactInvitationItemView.f96903h;
                if (fragment == null) {
                    l.a("fragment");
                }
                fragment.getLifecycle().b(contactInvitationItemView.getInvitedLifecycle());
            }
        }

        public InvitedLifecycleCallback(ContactInvitationItemView contactInvitationItemView) {
            l.d(contactInvitationItemView, "");
            this.f96908a = new WeakReference<>(contactInvitationItemView);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.a
    public final void setOutClickListener(h.f.a.b<? super String, z> bVar) {
        l.d(bVar, "");
        this.f96905j = bVar;
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.a
    public final void a(Fragment fragment) {
        l.d(fragment, "");
        this.f96903h = fragment;
        this.f96902g = InvitationViewModel.a.a(fragment);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactInvitationItemView f96909a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f96910b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f96911c;

        static {
            Covode.recordClassIndex(61498);
        }

        c(ContactInvitationItemView contactInvitationItemView, String str, com.ss.android.ugc.aweme.sharer.b bVar) {
            this.f96909a = contactInvitationItemView;
            this.f96910b = str;
            this.f96911c = bVar;
        }

        public final void onClick(final View view) {
            ClickAgent.onClick(view);
            InvitationViewModel invitationViewModel = this.f96909a.f96902g;
            if (invitationViewModel == null) {
                l.a("invitationVM");
            }
            Fragment fragment = this.f96909a.f96903h;
            if (fragment == null) {
                l.a("fragment");
            }
            invitationViewModel.a(new k<>(fragment, new h.f.a.b<InvitationViewModel.b, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.invite.v2.ContactInvitationItemView.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(61499);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(InvitationViewModel.b bVar) {
                    InvitationViewModel.b bVar2 = bVar;
                    l.d(bVar2, "");
                    ContactInvitationItemView contactInvitationItemView = this.this$0.f96909a;
                    View view = view;
                    l.b(view, "");
                    Context context = view.getContext();
                    l.b(context, "");
                    String str = this.this$0.f96910b;
                    l.b(str, "");
                    contactInvitationItemView.f96904i = f.a(context, str, bVar2.f96949b, R.string.cm4);
                    h.f.a.b<? super String, z> bVar3 = this.this$0.f96909a.f96905j;
                    if (bVar3 != null) {
                        bVar3.invoke(bVar2.f96948a);
                    }
                    return z.f158842a;
                }
            }, new h.f.a.b<Throwable, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.invite.v2.ContactInvitationItemView.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(61500);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Throwable th) {
                    new com.bytedance.tux.g.b(this.this$0.f96909a).e(R.string.cm4).b();
                    com.ss.android.ugc.aweme.common.f.a("ContactInvitationItemView", "invite contact request text error!", th);
                    h.f.a.b<? super String, z> bVar = this.this$0.f96909a.f96905j;
                    if (bVar != null) {
                        bVar.invoke("");
                    }
                    return z.f158842a;
                }
            }), this.f96911c);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.a
    public final void a(Friend friend) {
        l.d(friend, "");
        setUpView(friend);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ContactInvitationItemView(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(10026);
        LayoutInflater.from(context).inflate(R.layout.a2b, this);
        setLayoutParams(new ConstraintLayout.a(-1, -2));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        com.bytedance.tux.h.i.a((View) this, valueOf, valueOf2, valueOf3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics()))), false, 16);
        this.f96906l = h.i.a((h.f.a.a) new b(this));
        MethodCollector.o(10026);
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.a
    public final void a(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        boolean z;
        com.ss.android.ugc.aweme.inbox.widget.b bVar2;
        l.d(bVar, "");
        if (!l.a(this.f96907m, bVar)) {
            this.f96907m = bVar;
            if (bVar.f104374b != -1) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.inbox.widget.b bVar3 = null;
            if (z) {
                FrameLayout frameLayout = (FrameLayout) b(R.id.p4);
                l.b(frameLayout, "");
                FrameLayout frameLayout2 = (FrameLayout) b(R.id.p4);
                l.b(frameLayout2, "");
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                layoutParams.width = bVar.f104374b;
                layoutParams.height = bVar.f104374b;
                frameLayout.setLayoutParams(layoutParams);
            }
            if (bVar.f104377e != -1) {
                bVar2 = bVar;
            } else {
                bVar2 = null;
            }
            if (bVar2 != null) {
                ((TuxTextView) b(R.id.f3c)).setTuxFont(bVar2.f104377e);
            }
            if (bVar.f104378f != -1) {
                ((TuxTextView) b(R.id.f3c)).a((float) bVar.f104378f);
            }
            if (bVar.f104379g != -1) {
                bVar3 = bVar;
            }
            if (bVar3 != null) {
                ((TuxTextView) b(R.id.f3u)).setTuxFont(bVar3.f104379g);
            }
            if (bVar.f104382j != -1) {
                TuxTextView tuxTextView = (TuxTextView) b(R.id.f3u);
                l.b(tuxTextView, "");
                if (tuxTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    TuxTextView tuxTextView2 = (TuxTextView) b(R.id.f3u);
                    l.b(tuxTextView2, "");
                    TuxTextView tuxTextView3 = (TuxTextView) b(R.id.f3u);
                    l.b(tuxTextView3, "");
                    ViewGroup.LayoutParams layoutParams2 = tuxTextView3.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = bVar.f104382j;
                    tuxTextView2.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    private final void setUpView(Friend friend) {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.f3c);
        l.b(tuxTextView, "");
        tuxTextView.setText(friend.getNickname());
        String socialName = friend.getSocialName();
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.f3u);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(socialName);
        if (friend.isInvited()) {
            TuxButton tuxButton = (TuxButton) b(R.id.yt);
            l.b(tuxButton, "");
            tuxButton.setEnabled(false);
            TuxButton tuxButton2 = (TuxButton) b(R.id.yt);
            l.b(tuxButton2, "");
            tuxButton2.setText(getResources().getString(R.string.cm_));
        } else {
            TuxButton tuxButton3 = (TuxButton) b(R.id.yt);
            l.b(tuxButton3, "");
            tuxButton3.setEnabled(true);
            TuxButton tuxButton4 = (TuxButton) b(R.id.yt);
            l.b(tuxButton4, "");
            tuxButton4.setText(getResources().getString(R.string.cm9));
        }
        String photoUri = friend.getPhotoUri();
        if (photoUri != null) {
            com.bytedance.lighten.a.v a2 = r.a(photoUri);
            a2.E = (SmartImageView) b(R.id.bu0);
            a2.c();
            EmojiCompatTuxTextView emojiCompatTuxTextView = (EmojiCompatTuxTextView) b(R.id.pn);
            l.b(emojiCompatTuxTextView, "");
            emojiCompatTuxTextView.setVisibility(8);
        } else {
            String nickname = friend.getNickname();
            if (nickname != null && nickname.length() > 0) {
                String[] split = TextUtils.split(nickname, " ");
                l.b(split, "");
                ArrayList<String> arrayList = new ArrayList();
                for (String str : split) {
                    l.b(str, "");
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (p.b((CharSequence) str).toString().length() > 0) {
                        arrayList.add(str);
                    }
                }
                StringBuilder sb = new StringBuilder("");
                for (String str2 : arrayList) {
                    if (sb.length() < 2) {
                        l.b(str2, "");
                        if (str2.length() > 0) {
                            sb.append(Character.toUpperCase(str2.charAt(0)));
                        }
                    }
                }
                EmojiCompatTuxTextView emojiCompatTuxTextView2 = (EmojiCompatTuxTextView) b(R.id.pn);
                l.b(emojiCompatTuxTextView2, "");
                emojiCompatTuxTextView2.setText(sb.toString());
            }
            com.bytedance.lighten.a.v a3 = r.a((int) R.drawable.a9p);
            a3.E = (SmartImageView) b(R.id.bu0);
            a3.c();
            EmojiCompatTuxTextView emojiCompatTuxTextView3 = (EmojiCompatTuxTextView) b(R.id.pn);
            l.b(emojiCompatTuxTextView3, "");
            emojiCompatTuxTextView3.setVisibility(0);
        }
        com.ss.android.ugc.aweme.sharer.b bVar = a.C3201a.a("sms", com.bytedance.ies.ugc.appcontext.f.j());
        TuxButton tuxButton5 = (TuxButton) b(R.id.yt);
        l.b(tuxButton5, "");
        if (!(!tuxButton5.isEnabled() || bVar == null || bVar.c())) {
            ((TuxButton) b(R.id.yt)).setOnClickListener(new c(this, socialName, bVar));
        }
    }

    public /* synthetic */ ContactInvitationItemView(Context context, byte b2) {
        this(context);
    }
}
