package com.ss.android.ugc.aweme.feed.assem.avatar;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.avatar.c;
import com.ss.android.ugc.aweme.story.avatar.d;
import com.ss.android.ugc.aweme.story.avatar.e;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    SmartAvatarBorderView f92053a;

    /* renamed from: b  reason: collision with root package name */
    public StoryBrandView f92054b;

    /* renamed from: c  reason: collision with root package name */
    AvatarImageWithLive f92055c;

    /* renamed from: d  reason: collision with root package name */
    LiveCircleView f92056d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f92057e;

    /* renamed from: f  reason: collision with root package name */
    public final a f92058f;

    /* renamed from: g  reason: collision with root package name */
    private final h f92059g = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(57989);
    }

    private final d c() {
        return (d) this.f92059g.getValue();
    }

    static final class a extends m implements h.f.a.a<d> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(57990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            d a2;
            c d2 = g.f137757a.d();
            if (d2 == null || (a2 = d2.a(new e(this) {
                /* class com.ss.android.ugc.aweme.feed.assem.avatar.o.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f92060a;

                static {
                    Covode.recordClassIndex(57991);
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final com.ss.android.ugc.aweme.story.avatar.o c() {
                    return com.ss.android.ugc.aweme.story.avatar.o.FEED;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final /* bridge */ /* synthetic */ androidx.lifecycle.m b() {
                    return this.f92060a.this$0.f92058f;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final StoryBrandView a() {
                    return o.a(this.f92060a.this$0);
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.h
                public final boolean d() {
                    if (this.f92060a.this$0.a()) {
                        return false;
                    }
                    return true;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f92060a = r1;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final void a(SmartRoute smartRoute, Aweme aweme) {
                    String str = "";
                    l.d(smartRoute, str);
                    l.d(aweme, str);
                    String str2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92060a.this$0.f92058f)).mEventType;
                    if (str2 != null) {
                        str = str2;
                    }
                    smartRoute.withParam("enter_from", str).withParam("story_req_id", this.f92060a.this$0.b());
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.h
                public final void a(boolean z, com.ss.android.ugc.aweme.tux.business.story.a aVar) {
                    l.d(aVar, "");
                    int i2 = !z ? 1 : 0;
                    SmartAvatarBorderView smartAvatarBorderView = this.f92060a.this$0.f92053a;
                    if (smartAvatarBorderView == null) {
                        l.a("avatarView");
                    }
                    smartAvatarBorderView.setBorderWidth(i2);
                    com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) smartAvatarBorderView.getHierarchy();
                    l.b(aVar2, "");
                    aVar2.a(aVar2.f47454a);
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.g
                public final boolean a(String str, HashMap<String, String> hashMap) {
                    String str2 = "";
                    l.d(str, str2);
                    l.d(hashMap, str2);
                    if (l.a((Object) str, (Object) "story_show")) {
                        if (this.f92060a.this$0.f92057e) {
                            return false;
                        }
                        this.f92060a.this$0.f92057e = true;
                    }
                    String str3 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92060a.this$0.f92058f)).mEventType;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    hashMap.put("enter_from", str3);
                    String b2 = this.f92060a.this$0.b();
                    if (b2 != null) {
                        str2 = b2;
                    }
                    hashMap.put("req_id", str2);
                    return true;
                }
            })) == null) {
                return null;
            }
            o.a(this.this$0).addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2223a(this));
            return a2;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.o$a$a  reason: collision with other inner class name */
        public static final class View$OnAttachStateChangeListenerC2223a implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f92061a;

            static {
                Covode.recordClassIndex(57992);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            View$OnAttachStateChangeListenerC2223a(a aVar) {
                this.f92061a = aVar;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f92061a.this$0.f92057e = false;
            }
        }
    }

    private final boolean d() {
        if (l.a((Object) ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92058f)).mEventType, (Object) "homepage_hot") || l.a((Object) ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92058f)).mEventType, (Object) "homepage_follow")) {
            return true;
        }
        return false;
    }

    public final String b() {
        Aweme aweme;
        IRequestIdService a2 = RequestIdService.a();
        VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92058f);
        Integer num = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92058f);
        if (videoItemParams2 != null) {
            num = Integer.valueOf(videoItemParams2.mPageType);
        }
        return a2.a(aweme, num.intValue());
    }

    public final boolean a() {
        AvatarImageWithLive avatarImageWithLive = this.f92055c;
        if (avatarImageWithLive == null) {
            l.a("avatarLiveView");
        }
        if (avatarImageWithLive.getVisibility() == 0) {
            return true;
        }
        LiveCircleView liveCircleView = this.f92056d;
        if (liveCircleView == null) {
            l.a("avatarBorderView");
        }
        if (liveCircleView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ StoryBrandView a(o oVar) {
        StoryBrandView storyBrandView = oVar.f92054b;
        if (storyBrandView == null) {
            l.a("storyBrandView");
        }
        return storyBrandView;
    }

    public o(a aVar) {
        l.d(aVar, "");
        this.f92058f = aVar;
    }

    private static boolean a(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 40) {
            return false;
        }
        return true;
    }

    public final void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
        Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92058f)).mAweme;
        l.b(aweme, "");
        a(aweme.getAuthor(), aweme);
    }

    private final void a(User user, Aweme aweme) {
        boolean z = !a(aweme);
        boolean a2 = a();
        boolean d2 = d();
        if (!z || a2 || !d2) {
            user = null;
        }
        d c2 = c();
        if (c2 != null) {
            c2.a(user, true);
        }
    }
}
