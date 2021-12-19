package com.bytedance.android.livesdk.feed.i;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.feed.c;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.g.d;
import com.bytedance.android.livesdkapi.g.e;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class m extends com.bytedance.android.livesdk.ui.b<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f17534a;

    /* renamed from: b  reason: collision with root package name */
    public List<FeedItem> f17535b;

    /* renamed from: c  reason: collision with root package name */
    public Context f17536c;

    /* renamed from: d  reason: collision with root package name */
    private BannerSwipeRefreshLayout.a f17537d;

    static {
        Covode.recordClassIndex(9710);
    }

    /* access modifiers changed from: package-private */
    public class b extends com.bytedance.android.livesdk.ui.b<FeedItem> {

        /* renamed from: b  reason: collision with root package name */
        private HSImageView f17540b = ((HSImageView) this.itemView.findViewById(R.id.es4));

        /* renamed from: c  reason: collision with root package name */
        private TextView f17541c = ((TextView) this.itemView.findViewById(R.id.es8));

        /* renamed from: d  reason: collision with root package name */
        private View f17542d;

        /* renamed from: e  reason: collision with root package name */
        private d f17543e;

        /* renamed from: f  reason: collision with root package name */
        private View.OnAttachStateChangeListener f17544f = new View.OnAttachStateChangeListener() {
            /* class com.bytedance.android.livesdk.feed.i.m.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(9713);
            }

            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
            }
        };

        static {
            Covode.recordClassIndex(9712);
        }

        @Override // com.bytedance.android.livesdk.ui.b
        public final void a() {
            super.a();
        }

        @Override // com.bytedance.android.livesdk.ui.b
        public final void b() {
            super.b();
        }

        public static boolean d() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.bytedance.android.livesdk.ui.b
        public final /* synthetic */ void a(FeedItem feedItem, int i2) {
            FeedItem feedItem2 = feedItem;
            if (feedItem2 != null && (feedItem2.item instanceof Room)) {
                User owner = ((Room) feedItem2.item).getOwner();
                if (owner != null) {
                    ImageModel avatarThumb = owner.getAvatarThumb();
                    if (avatarThumb != null && !h.a(avatarThumb.getUrls())) {
                        this.f17540b.setImageURI(avatarThumb.getUrls().get(0));
                    }
                    this.f17541c.setText(owner.getNickName());
                }
                this.f17540b.setVisibility(8);
                this.f17540b.setVisibility(0);
                d avatarBorderController = ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).avatarBorderController();
                this.f17543e = avatarBorderController;
                if (avatarBorderController != null) {
                    this.f17540b.addOnAttachStateChangeListener(this.f17544f);
                }
                this.itemView.setOnClickListener(new o(this, feedItem2));
            }
        }

        b(ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b8w, viewGroup, false));
            MethodCollector.i(2419);
            e liveCircleView = ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).liveCircleView(viewGroup.getContext());
            if (liveCircleView instanceof View) {
                View view = (View) liveCircleView;
                this.f17542d = view;
                view.setLayoutParams(this.itemView.findViewById(R.id.es5).getLayoutParams());
                int b2 = (int) n.b(viewGroup.getContext(), 3.0f);
                this.f17542d.setPadding(b2, b2, b2, b2);
                ((FrameLayout) this.itemView.findViewById(R.id.erl)).addView(this.f17542d, 0);
                this.itemView.findViewById(R.id.bjg).setVisibility(0);
            }
            MethodCollector.o(2419);
        }
    }

    class a extends RecyclerView.a<com.bytedance.android.livesdk.ui.b> {
        static {
            Covode.recordClassIndex(9711);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ com.bytedance.android.livesdk.ui.b onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return m.this.f17535b.size();
        }

        private a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onViewAttachedToWindow(com.bytedance.android.livesdk.ui.b bVar) {
            long id;
            String str;
            super.onViewAttachedToWindow(bVar);
            int position = bVar.getPosition();
            if (position >= 0 && position < m.this.f17535b.size() && m.this.f17535b.get(position) != null && (m.this.f17535b.get(position).item instanceof Room)) {
                Room room = (Room) m.this.f17535b.get(position).item;
                if (room.getOwner() == null) {
                    id = 0;
                } else {
                    id = room.getOwner().getId();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("log_pb", room.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(id));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("show_type", "stay");
                hashMap.put("live_type", j.a(room.getStreamType()));
                if (room.isThirdParty) {
                    str = "thirdparty";
                } else {
                    str = "general";
                }
                hashMap.put("streaming_type", str);
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "follow_live");
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", "live");
                hashMap.put("action_type", "click");
                if (!(room.getOwner() == null || room.getOwner().getFollowInfo() == null)) {
                    hashMap.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
                }
                String g2 = com.bytedance.android.livesdk.ab.e.g();
                if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
                    hashMap.put("is_subscribe", "0");
                } else {
                    hashMap.put("is_subscribe", "1");
                }
                hashMap.put("is_return", "0");
                b.a.a("live_show").a((Map<String, String>) hashMap).b();
            }
        }

        /* synthetic */ a(m mVar, byte b2) {
            this();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(com.bytedance.android.livesdk.ui.b bVar, int i2) {
            com.bytedance.android.livesdk.ui.b bVar2 = bVar;
            if (i2 >= 0 && i2 < m.this.f17535b.size() && m.this.f17535b.get(i2) != null) {
                bVar2.a(m.this.f17535b.get(i2), i2);
            }
        }

        private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(2379);
            b bVar = new b(viewGroup);
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = bVar.getClass().getName();
            MethodCollector.o(2379);
            return bVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.ui.b
    public final /* synthetic */ void a(FeedItem feedItem, int i2) {
        FeedItem feedItem2 = feedItem;
        if (feedItem2 instanceof c) {
            this.f17535b = ((c) feedItem2).f17465a;
            this.f17534a.setAdapter(new a(this, (byte) 0));
        }
    }

    public m(View view, BannerSwipeRefreshLayout.a aVar) {
        super(view);
        this.f17536c = view.getContext();
        this.f17537d = aVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.es7);
        this.f17534a = recyclerView;
        recyclerView.setLayoutManager(new SSLinearLayoutManager(0));
        this.f17534a.setOnTouchListener(new n(this));
    }
}
