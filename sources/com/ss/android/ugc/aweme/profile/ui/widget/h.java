package com.ss.android.ugc.aweme.profile.ui.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.d.c;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.g;
import com.ss.android.ugc.aweme.profile.ui.widget.l;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h extends f<User> {

    /* renamed from: a  reason: collision with root package name */
    public int f117414a;

    /* renamed from: b  reason: collision with root package name */
    public b f117415b;

    /* renamed from: c  reason: collision with root package name */
    public a f117416c;

    /* renamed from: d  reason: collision with root package name */
    public c f117417d;

    /* renamed from: e  reason: collision with root package name */
    public String f117418e;

    /* renamed from: f  reason: collision with root package name */
    public int f117419f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, Integer> f117420g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public l.a f117421h = new l.a() {
        /* class com.ss.android.ugc.aweme.profile.ui.widget.h.AnonymousClass3 */

        static {
            Covode.recordClassIndex(75861);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.l.a
        public final void a(User user, int i2) {
            if (i2 >= 0 && i2 < h.this.f76354l.size()) {
                h.this.f76354l.remove(i2);
                h.this.notifyItemRemoved(i2);
                if (h.this.f117415b != null) {
                    h.this.f117415b.a(user);
                    if (h.this.f76354l.isEmpty()) {
                        h.this.f117415b.a();
                    }
                }
                if (i2 != h.this.f76354l.size()) {
                    h hVar = h.this;
                    hVar.notifyItemRangeChanged(i2, hVar.f76354l.size() - i2);
                }
                if (h.this.v) {
                    if (h.this.f76354l.size() <= 10) {
                        h.this.d(false);
                    } else {
                        h.this.d(true);
                    }
                }
            }
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public l.b f117422i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f117423j = false;

    /* renamed from: k  reason: collision with root package name */
    private Object f117424k = new Object();

    public interface a {
        static {
            Covode.recordClassIndex(75862);
        }

        void a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(75863);
        }

        void a();

        void a(User user);

        void b(User user);

        void c(User user);
    }

    static {
        Covode.recordClassIndex(75858);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final void a(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final List<User> e() {
        return this.f76354l;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        if (this.f76354l.get(i2) instanceof RecommendContact) {
            return 1;
        }
        return 0;
    }

    private User a(int i2) {
        if (this.f76354l == null || i2 < 0 || i2 >= this.f76354l.size()) {
            return null;
        }
        return (User) this.f76354l.get(i2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aas, viewGroup, false);
        a2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.profile.ui.widget.h.AnonymousClass2 */

            static {
                Covode.recordClassIndex(75860);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (h.this.f117416c != null) {
                    h.this.f117416c.a();
                }
            }
        });
        return new b(a2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        c cVar;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof l) && (cVar = this.f117417d) != null) {
            cVar.a(viewHolder);
        } else if ((viewHolder instanceof g) && !this.f117423j) {
            com.ss.android.ugc.aweme.recommend.users.a.f120113a.a();
            ((g) viewHolder).a();
            this.f117423j = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<User> list) {
        if (!(list == null || list.size() == 0)) {
            if (this.f76354l == null) {
                this.f76354l = new ArrayList();
            }
            this.f76354l.clear();
            this.f76354l.addAll(list);
            for (int i2 = 0; i2 < this.f76354l.size(); i2++) {
                User user = (User) this.f76354l.get(i2);
                if (!(user instanceof RecommendContact)) {
                    this.f117420g.put(user.getUid(), Integer.valueOf(i2));
                }
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new g(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aar, viewGroup, false), this.f117419f);
        }
        return new l(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aar, viewGroup, false), this.f117419f, this.f117424k);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof l) {
            l lVar = (l) viewHolder;
            User a2 = a(i2);
            l.a aVar = this.f117421h;
            l.b bVar = this.f117422i;
            b bVar2 = this.f117415b;
            int i3 = this.f117414a;
            String str = this.f117418e;
            if (a2 != null) {
                lVar.f117463i = bVar2;
                lVar.f117459e = a2;
                lVar.f117461g = aVar;
                lVar.f117462h = bVar;
                lVar.f117460f = i2;
                lVar.f117455a.setUserData(new UserVerify(a2.getAvatarThumb(), a2.getCustomVerify(), a2.getEnterpriseVerifyReason(), Integer.valueOf(a2.getVerificationType())));
                lVar.f117455a.a();
                lVar.a(lVar.f117459e);
                TextView textView = lVar.f117457c;
                int i4 = lVar.f117466l;
                User user = lVar.f117459e;
                if (i4 == 0) {
                    textView.setText("@" + user.getUniqueId());
                    textView.setMaxLines(1);
                } else {
                    textView.setText(user.getRecommendReason());
                }
                int followStatus = lVar.f117459e.getFollowStatus();
                lVar.f117459e.getFollowerStatus();
                lVar.a(followStatus);
                lVar.f117459e.getFollowStatus();
                RecyclerView.j jVar = (RecyclerView.j) lVar.f117464j.getLayoutParams();
                if (i2 != 0) {
                    i3 = 0;
                }
                jVar.leftMargin = i3;
                lVar.f117464j.setLayoutParams(jVar);
                lVar.f117465k = str;
                io.a(lVar.itemView.getContext(), a2.getCustomVerify(), a2.getEnterpriseVerifyReason(), lVar.f117456b);
            }
        } else if (viewHolder instanceof g) {
            g gVar = (g) viewHolder;
            RecommendContact recommendContact = (RecommendContact) a(i2);
            h.f.b.l.d(recommendContact, "");
            gVar.f117401b.setPlaceHolder(2131233517);
            gVar.f117402c.setText(R.string.bxq);
            gVar.f117403d.setText(R.string.p7);
            gVar.f117405f.setOnClickListener(new g.a(gVar, recommendContact, i2));
            gVar.f117404e.setText("");
            gVar.f117404e.setBackgroundResource(R.drawable.nc);
            gVar.f117404e.setTextColor(androidx.core.content.b.c(gVar.f117400a, R.color.a9));
            gVar.f117404e.setOnClickListener(new g.b(gVar, recommendContact, i2));
            gVar.f117406g = new m<RecommendContact, Integer, z>() {
                /* class com.ss.android.ugc.aweme.profile.ui.widget.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75859);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(RecommendContact recommendContact, Integer num) {
                    RecommendContact recommendContact2 = recommendContact;
                    Integer num2 = num;
                    if (h.this.f117421h == null) {
                        return null;
                    }
                    h.this.f117421h.a(recommendContact2, num2.intValue());
                    return null;
                }
            };
        }
    }
}
