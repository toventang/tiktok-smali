package com.ss.android.ugc.aweme.find.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;

public final class FindFriendsTailViewHolder extends FindFriendsBaseViewHolder implements au {

    /* renamed from: c  reason: collision with root package name */
    public int f96102c;

    /* renamed from: d  reason: collision with root package name */
    public final View f96103d;

    static {
        Covode.recordClassIndex(60876);
    }

    @Override // com.ss.android.ugc.aweme.find.viewholder.FindFriendsBaseViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a extends h.f.b.m implements h.f.a.b<FindFriendsState, z> {
        final /* synthetic */ FindFriendsTailViewHolder this$0;

        static {
            Covode.recordClassIndex(60880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(FindFriendsTailViewHolder findFriendsTailViewHolder) {
            super(1);
            this.this$0 = findFriendsTailViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            this.this$0.a(findFriendsState2.getTailChannels());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsTailViewHolder f96105a;

        static {
            Covode.recordClassIndex(60881);
        }

        b(FindFriendsTailViewHolder findFriendsTailViewHolder) {
            this.f96105a = findFriendsTailViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96105a.f96077a.b(103);
            com.ss.android.ugc.aweme.friends.e.a.a("contact", this.f96105a.f96077a.f96128c, com.ss.android.ugc.aweme.friends.i.a.b());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsTailViewHolder f96106a;

        static {
            Covode.recordClassIndex(60882);
        }

        c(FindFriendsTailViewHolder findFriendsTailViewHolder) {
            this.f96106a = findFriendsTailViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96106a.f96077a.b(102);
            com.ss.android.ugc.aweme.friends.e.a.d();
            com.ss.android.ugc.aweme.friends.e.a.a("facebook", this.f96106a.f96077a.f96128c, FindFriendsTailViewHolder.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsTailViewHolder f96107a;

        static {
            Covode.recordClassIndex(60883);
        }

        d(FindFriendsTailViewHolder findFriendsTailViewHolder) {
            this.f96107a = findFriendsTailViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96107a.f96077a.b(101);
            com.ss.android.ugc.aweme.friends.e.a.a("find_friends_page");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FindFriendsTailViewHolder(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559490(0x7f0d0442, float:1.8744326E38)
            r0 = 0
            android.view.View r1 = com.a.a(r2, r1, r4, r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r3.<init>(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder.<init>(android.view.ViewGroup):void");
    }

    public final void a(List<Integer> list) {
        if (list.contains(1)) {
            this.f96102c = 1;
            ((TuxIconView) this.f96103d.findViewById(R.id.aw4)).setIconRes(R.raw.icon_color_contact_circle);
            TuxTextView tuxTextView = (TuxTextView) this.f96103d.findViewById(R.id.awb);
            l.b(tuxTextView, "");
            tuxTextView.setText(this.f96103d.getResources().getString(R.string.a76));
            TuxTextView tuxTextView2 = (TuxTextView) this.f96103d.findViewById(R.id.aw0);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(this.f96103d.getResources().getString(R.string.a71));
            TuxButton tuxButton = (TuxButton) this.f96103d.findViewById(R.id.avw);
            l.b(tuxButton, "");
            tuxButton.setText(this.f96103d.getResources().getString(R.string.a7v));
            ((TuxButton) this.f96103d.findViewById(R.id.avw)).setOnClickListener(new b(this));
        } else if (list.contains(2)) {
            this.f96102c = 2;
            ((TuxIconView) this.f96103d.findViewById(R.id.aw4)).setIconRes(R.raw.icon_color_facebook_circle);
            TuxTextView tuxTextView3 = (TuxTextView) this.f96103d.findViewById(R.id.awb);
            l.b(tuxTextView3, "");
            tuxTextView3.setText(this.f96103d.getResources().getString(R.string.bt2));
            TuxTextView tuxTextView4 = (TuxTextView) this.f96103d.findViewById(R.id.aw0);
            l.b(tuxTextView4, "");
            tuxTextView4.setText(this.f96103d.getResources().getString(R.string.a71));
            TuxButton tuxButton2 = (TuxButton) this.f96103d.findViewById(R.id.avw);
            l.b(tuxButton2, "");
            tuxButton2.setText(this.f96103d.getResources().getString(R.string.a7v));
            ((TuxButton) this.f96103d.findViewById(R.id.avw)).setOnClickListener(new c(this));
        } else {
            this.f96102c = 0;
            ((TuxIconView) this.f96103d.findViewById(R.id.aw4)).setIconRes(R.raw.icon_color_invitation_circle);
            TuxTextView tuxTextView5 = (TuxTextView) this.f96103d.findViewById(R.id.awb);
            l.b(tuxTextView5, "");
            tuxTextView5.setText(this.f96103d.getResources().getString(R.string.a77));
            TuxTextView tuxTextView6 = (TuxTextView) this.f96103d.findViewById(R.id.aw0);
            l.b(tuxTextView6, "");
            tuxTextView6.setText(this.f96103d.getResources().getString(R.string.a72));
            TuxButton tuxButton3 = (TuxButton) this.f96103d.findViewById(R.id.avw);
            l.b(tuxButton3, "");
            tuxButton3.setText(this.f96103d.getResources().getString(R.string.a7t));
            ((TuxButton) this.f96103d.findViewById(R.id.avw)).setOnClickListener(new d(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FindFriendsTailViewHolder(ViewGroup viewGroup, View view) {
        super(view);
        l.d(viewGroup, "");
        l.d(view, "");
        this.f96103d = view;
        this.f96078b.getLifecycle().a(this);
        f.a.b.b unused = selectSubscribe(this.f96077a, b.f96123a, new ah(), new h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Integer>, z>(this) {
            /* class com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder.AnonymousClass1 */
            final /* synthetic */ FindFriendsTailViewHolder this$0;

            static {
                Covode.recordClassIndex(60877);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Integer> list) {
                List<? extends Integer> list2 = list;
                l.d(iVar, "");
                l.d(list2, "");
                this.this$0.a(list2);
                return z.f158842a;
            }
        });
        withState(this.f96077a, new h.f.a.b<FindFriendsState, z>(this) {
            /* class com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder.AnonymousClass2 */
            final /* synthetic */ FindFriendsTailViewHolder this$0;

            static {
                Covode.recordClassIndex(60878);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(FindFriendsState findFriendsState) {
                FindFriendsState findFriendsState2 = findFriendsState;
                l.d(findFriendsState2, "");
                this.this$0.a(findFriendsState2.getTailChannels());
                return z.f158842a;
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FindFriendsTailViewHolder f96104a;

            static {
                Covode.recordClassIndex(60879);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f96104a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                int i2 = this.f96104a.f96102c;
                if (i2 == 0) {
                    com.ss.android.ugc.aweme.friends.e.a.c();
                } else if (i2 == 1) {
                    com.ss.android.ugc.aweme.friends.e.a.b("contact", this.f96104a.f96077a.f96128c, com.ss.android.ugc.aweme.friends.i.a.b());
                } else if (i2 == 2) {
                    com.ss.android.ugc.aweme.friends.e.a.b("facebook", this.f96104a.f96077a.f96128c, FindFriendsTailViewHolder.a());
                }
            }
        });
    }
}
