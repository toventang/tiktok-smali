package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.app.Activity;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.cp.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class m extends a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    ViewGroup f94849a;

    /* renamed from: b  reason: collision with root package name */
    AnimationImageView f94850b;

    /* renamed from: c  reason: collision with root package name */
    public l f94851c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f94852d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.feed.x.a f94853e = new com.ss.android.ugc.aweme.feed.x.a();

    /* renamed from: f  reason: collision with root package name */
    private b f94854f;

    static {
        Covode.recordClassIndex(60163);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(66, new g(m.class, "onFollowEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private b c() {
        if (this.f94854f == null) {
            this.f94854f = new b();
        }
        return this.f94854f;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void g() {
        super.g();
        l lVar = this.f94851c;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        EventBus.a().b(this);
        l lVar = this.f94851c;
        if (lVar != null) {
            EventBus.a().b(lVar);
            lVar.f94830m.b(lVar.n);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (!this.f94852d) {
            this.f94850b.setAnimation("common_feed_anim_follow_people.json");
            this.f94850b.a();
            this.f94850b.a(new Animator.AnimatorListener() {
                /* class com.ss.android.ugc.aweme.feed.ui.m.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(60165);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    m.this.f94852d = false;
                }
            });
            this.f94852d = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    public m(View view) {
        super(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("update_ad_user_follow_ui", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("bind_follow_view", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
        }
    }

    @r
    public void onFollowEvent(FollowStatusEvent followStatusEvent) {
        o oVar = new o(this, followStatusEvent.status, this.L);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            oVar.run();
            return;
        }
        AnimationImageView animationImageView = this.f94850b;
        if (animationImageView != null) {
            animationImageView.post(oVar);
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "onFollowEvent mFollowView is null!");
        }
    }

    public static String a(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().getUid());
        }
    }

    public static String b(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().id);
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().roomId);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        this.T = c.a((Activity) this.R, (int) R.layout.sl);
        this.f94849a = (ViewGroup) this.T.findViewById(R.id.b7j);
        this.f94850b = (AnimationImageView) this.T.findViewById(R.id.b7a);
        View findViewById = this.T.findViewById(R.id.b7j);
        if (findViewById != null) {
            findViewById.setOnClickListener(new n(this));
        }
        this.f94851c = new l(this.T);
        p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.ui.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60164);
            }

            public final void run() {
                DataCenter a2;
                DataCenter a3;
                DataCenter a4;
                if (m.this.f94851c != null) {
                    l lVar = m.this.f94851c;
                    DataCenter dataCenter = m.this.Q;
                    GenericWidget genericWidget = m.this.J;
                    l.d(genericWidget, "");
                    lVar.f94823f = dataCenter;
                    if (dataCenter != null && (a2 = dataCenter.a("startPlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) genericWidget)) != null && (a3 = a2.a("stopPlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) genericWidget)) != null && (a4 = a3.a("on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) genericWidget)) != null) {
                        a4.a("image_pause", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) genericWidget);
                    }
                }
            }
        }));
        if (k.a()) {
            d.a(this.f94849a, 8);
        }
        EventBus.a(EventBus.a(), this);
        b c2 = c();
        c2.f78240a = this.S;
        c2.f78241b = this.T;
        c2.f78242c = this.f94849a;
        c2.f78243d = this.f94850b;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        AnimationImageView animationImageView;
        MethodCollector.i(7651);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
        }
        if (bVar == null) {
            MethodCollector.o(7651);
            return;
        }
        HashMap<String, Object> hashMap = (HashMap) bVar.a();
        if (hashMap.get("aweme_state") == null) {
            MethodCollector.o(7651);
            return;
        }
        Aweme aweme = (Aweme) hashMap.get("aweme_state");
        this.f94850b.d();
        this.f94852d = false;
        this.f94849a.setVisibility(0);
        int i2 = 8;
        if (br.a(aweme, 3)) {
            animationImageView = this.f94850b;
        } else if (in.a(aweme)) {
            animationImageView = this.f94850b;
            i2 = 4;
        } else {
            animationImageView = this.f94850b;
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.V(aweme) && !aweme.isDelete()) {
                i2 = 0;
            }
        }
        animationImageView.setVisibility(i2);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aq(aweme)) {
            this.f94850b.setVisibility(4);
        }
        this.f94851c.a(aweme.getAuthor(), hashMap);
        c().c();
        MethodCollector.o(7651);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        User user = null;
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (!TextUtils.equals(bVar.f67014a, "video_params")) {
            return null;
        }
        Aweme aweme = this.L;
        HashMap<String, Object> hashMap = new HashMap<>();
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.b("ui_state", hashMap);
        hashMap.put("aweme_state", aweme);
        l lVar = this.f94851c;
        VideoItemParams videoItemParams = (VideoItemParams) bVar.a();
        l.d(hashMap, "");
        if (videoItemParams != null) {
            lVar.f94818a = videoItemParams.mAweme;
            lVar.f94822e = videoItemParams.mPageType;
            lVar.f94819b = videoItemParams.mEventType;
            lVar.f94820c = videoItemParams.mRequestId;
            lVar.f94821d = videoItemParams.isMyProfile;
        }
        Aweme aweme2 = lVar.f94818a;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        }
        lVar.f94825h = user;
        lVar.a(hashMap, lVar.f94825h);
        if (this.L.getAuthor() != null) {
            String nickname = this.L.getAuthor().getNickname();
            try {
                this.f94850b.setContentDescription(this.R.getString(R.string.kv, nickname));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return bVar2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r2.equals("bind_follow_view") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r0.getStreamUrlModel() != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        if (r2.equals("stopPlayAnimation") != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        if (r2.equals("image_pause") != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        r3.b();
     */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(final com.ss.android.ugc.aweme.arch.widgets.base.b r9) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.m.c(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }

    public final void a(int i2, Map<String, Object> map) {
        Aweme aweme;
        String str;
        if (map == null) {
            aweme = this.L;
            str = this.M;
        } else {
            aweme = (Aweme) map.get("aweme_state");
            str = (String) map.get("event_type_state");
        }
        if (aweme == null) {
            com.ss.android.ugc.aweme.framework.a.a.c(4, "FeedAvatarView", "aweme is null. FollowStatus is :".concat(String.valueOf(i2)));
        } else if (aweme.getAuthor() == null) {
            com.ss.android.ugc.aweme.framework.a.a.c(4, "FeedAvatarView", "author is null. AwemeId is :" + aweme.getAid() + ", FollowStatus is :" + i2);
        } else {
            com.ss.android.ugc.aweme.framework.a.a.c(4, "FeedAvatarView", "AuthorUid is: " + aweme.getAuthorUid() + ", AwemeId is :" + aweme.getAid() + ", FollowStatus is :" + i2);
            if (aweme.isDelete()) {
                this.f94850b.setVisibility(4);
                this.f94849a.setVisibility(4);
                com.ss.android.ugc.aweme.framework.a.a.c(4, "FeedAvatarView", "aweme is delete!updateFollowView!");
                return;
            }
            this.f94850b.clearAnimation();
            User author = aweme.getAuthor();
            int i3 = 8;
            if (com.bytedance.common.utility.m.a(author.getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId()) || com.bytedance.common.utility.m.a(str, "homepage_follow") || !aweme.isCanPlay()) {
                if (!com.bytedance.common.utility.m.a(str, "homepage_follow") || com.bytedance.common.utility.m.a(author.getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId()) || !aweme.isCanPlay() || i2 != 0) {
                    this.f94850b.setVisibility(4);
                } else {
                    this.f94850b.setAnimation("common_feed_anim_follow_people.json");
                    if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aq(aweme)) {
                        AnimationImageView animationImageView = this.f94850b;
                        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.V(aweme) && !aweme.isDelete()) {
                            i3 = 0;
                        }
                        animationImageView.setVisibility(i3);
                    }
                    this.f94850b.setProgress(0.0f);
                }
                if (!com.ss.android.ugc.aweme.commercialize.e.a.b.y(aweme) && (!author.isLive() || !com.ss.android.ugc.aweme.story.c.a() || author.isBlock())) {
                    l lVar = this.f94851c;
                    if (lVar != null && lVar.f94826i != null) {
                        ((RelativeLayout.LayoutParams) this.f94851c.f94826i.getLayoutParams()).bottomMargin = (int) n.b(this.R, 10.0f);
                        return;
                    }
                    return;
                }
                l lVar2 = this.f94851c;
                if (lVar2 != null && lVar2.f94827j != null) {
                    ((RelativeLayout.LayoutParams) this.f94851c.f94827j.getLayoutParams()).bottomMargin = (int) n.b(this.R, 12.5f);
                    return;
                }
                return;
            }
            if (i2 == 0) {
                try {
                    if (this.L == null || !this.L.isImage()) {
                        if (com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.n.b(aweme)) {
                        }
                    }
                    if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aq(aweme)) {
                        this.f94850b.setImageDrawable(androidx.core.content.b.a(this.R, 2131231737));
                        AnimationImageView animationImageView2 = this.f94850b;
                        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.V(aweme) && !aweme.isDelete()) {
                            i3 = 0;
                        }
                        animationImageView2.setVisibility(i3);
                        return;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            if (!this.f94852d) {
                this.f94850b.setVisibility(4);
            }
        }
    }
}
