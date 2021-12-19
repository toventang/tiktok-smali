package com.ss.android.ugc.aweme.im.sdk.relations.ui.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;

public final class f extends c {
    static {
        Covode.recordClassIndex(66179);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c
    public final /* synthetic */ a.b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public class a extends a.b {

        /* renamed from: e  reason: collision with root package name */
        public AvatarImageView f103233e;

        /* renamed from: f  reason: collision with root package name */
        public RemoteImageView f103234f;

        /* renamed from: h  reason: collision with root package name */
        private TextView f103236h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f103237i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f103238j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f103239k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f103240l;

        /* renamed from: m  reason: collision with root package name */
        private ImageView f103241m;
        private ImageView n;
        private TuxIconView o;
        private View p;
        private LinearLayout q;

        static {
            Covode.recordClassIndex(66180);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.b, com.ss.android.ugc.aweme.im.sdk.common.ui.base.a
        public final void b() {
            this.p = this.itemView.findViewById(R.id.ca6);
            this.q = (LinearLayout) this.itemView.findViewById(R.id.emo);
            this.f103238j = (TextView) this.itemView.findViewById(R.id.title_tv);
            this.n = (ImageView) this.itemView.findViewById(R.id.bnv);
            this.f103240l = (TextView) this.itemView.findViewById(R.id.bnx);
            this.f103233e = (AvatarImageView) this.itemView.findViewById(R.id.pf);
            this.f103241m = (ImageView) this.itemView.findViewById(R.id.fez);
            this.f103236h = (TextView) this.itemView.findViewById(R.id.csg);
            this.f103237i = (TextView) this.itemView.findViewById(R.id.ei7);
            this.f103239k = (TextView) this.itemView.findViewById(R.id.al5);
            this.f103234f = (RemoteImageView) this.itemView.findViewById(R.id.a4v);
            this.o = (TuxIconView) this.itemView.findViewById(R.id.b7o);
        }

        public a(View view) {
            super(view);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.b
        public final void a(IMContact iMContact, int i2) {
            if (iMContact.getType() != -1) {
                if (f.this.f103183k != null) {
                    this.itemView.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.f.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(66181);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            f.this.f103183k.a(a.this.itemView, a.this.getAdapterPosition());
                        }
                    });
                    this.f103233e.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.f.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(66182);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            f.this.f103183k.a(a.this.f103233e, a.this.getAdapterPosition());
                        }
                    });
                    this.f103234f.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.f.a.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(66183);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            f.this.f103183k.a(a.this.f103234f, a.this.getAdapterPosition());
                        }
                    });
                }
                this.n.setVisibility(8);
                if (iMContact.getType() == 6 || iMContact.getType() == 5) {
                    if (iMContact.getType() != 5 || !TextUtils.isEmpty(f.this.f103177e)) {
                        this.q.setVisibility(8);
                        this.p.setVisibility(8);
                    } else {
                        this.q.setVisibility(0);
                        this.f103238j.setText(R.string.cgf);
                        this.n.setVisibility(0);
                        this.p.setVisibility(8);
                    }
                    this.f103240l.setVisibility(8);
                } else if (iMContact.getType() == 0 || iMContact.getType() == 3) {
                    if (iMContact.getType() != 3 || !TextUtils.isEmpty(f.this.f103177e)) {
                        this.q.setVisibility(8);
                        this.p.setVisibility(8);
                    } else {
                        this.q.setVisibility(0);
                        this.f103238j.setText(R.string.cge);
                        this.n.setVisibility(8);
                        this.p.setVisibility(0);
                    }
                    if (f.this.f103173a != 1) {
                        c.b c2 = f.this.c(i2);
                        if (c2 != null) {
                            if (!TextUtils.isEmpty(c2.f103213d)) {
                                this.f103240l.setText(c2.f103213d);
                                this.f103240l.setVisibility(0);
                            } else {
                                this.f103240l.setVisibility(8);
                            }
                        }
                    } else {
                        this.f103240l.setVisibility(8);
                    }
                }
                if (i2 == 0) {
                    this.f103238j.setText("");
                    this.n.setVisibility(8);
                }
                UrlModel displayAvatar = iMContact.getDisplayAvatar();
                if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                    e.a(this.f103233e, 2131232324);
                } else {
                    e.a(this.f103233e, displayAvatar);
                }
                this.f103234f.setVisibility(8);
                if (iMContact instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact;
                    io.a(this.itemView.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f103236h);
                    f.a(this.f103236h, iMUser, f.this.f103177e);
                    f.b(this.f103239k, iMUser, f.this.f103177e);
                    if (iMUser.getFollowStatus() == 2) {
                        this.o.setVisibility(0);
                    } else {
                        this.o.setVisibility(8);
                    }
                    this.f103237i.setVisibility(8);
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a(this.f103233e, iMUser);
                } else if (iMContact instanceof IMConversation) {
                    IMConversation iMConversation = (IMConversation) iMContact;
                    io.a(this.itemView.getContext(), "", "", this.f103236h);
                    this.f103237i.setVisibility(8);
                    this.o.setVisibility(8);
                    int conversationMemberCount = iMConversation.getConversationMemberCount();
                    this.f103239k.setText(this.f103239k.getContext().getResources().getQuantityString(R.plurals.cy, conversationMemberCount, Integer.valueOf(conversationMemberCount)));
                    if (TextUtils.isEmpty(f.this.f103177e)) {
                        this.f103236h.setText(iMConversation.getDisplayName());
                    } else {
                        f.a(this.f103236h, iMConversation.getDisplayName(), f.this.f103177e, 0);
                    }
                }
                this.f103234f.setTag(83886080, iMContact);
                this.itemView.setTag(83886080, iMContact);
                this.f103233e.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, 50331648);
                this.f103234f.setTag(50331648, 100663296);
                this.f103233e.setTag(50331648, 50331649);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c
    public final a.b a(ViewGroup viewGroup, int i2) {
        int i3;
        if (i2 == 1 && this.f103179g != null) {
            return super.a(viewGroup, i2);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            i3 = R.layout.a6g;
        } else {
            i3 = R.layout.a6i;
        }
        return new a(com.a.a(from, i3, viewGroup, false));
    }

    private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6329);
        a.b a3 = fVar.a(viewGroup, i2);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(6329);
        return a3;
    }
}
