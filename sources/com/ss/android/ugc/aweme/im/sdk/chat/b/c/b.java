package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import android.graphics.drawable.Animatable;
import android.util.LruCache;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.u;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.q;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c f100168a;

    /* renamed from: b  reason: collision with root package name */
    public static String f100169b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f100170c = "";

    /* renamed from: d  reason: collision with root package name */
    public static am f100171d = an.a(bf.f159040a);

    /* renamed from: e  reason: collision with root package name */
    public static final LruCache<String, a> f100172e = new LruCache<>(100);

    /* renamed from: f  reason: collision with root package name */
    public static final b f100173f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final h.h f100174g = h.i.a((h.f.a.a) e.f100189a);

    public static Map<RemoteImageView, h.f.a.b<Boolean, z>> a() {
        return (Map) f100174g.getValue();
    }

    private b() {
    }

    public static void a(ShareAwemeContent shareAwemeContent, AwemeStatusBean awemeStatusBean, Aweme aweme) {
        f100172e.put(shareAwemeContent.getItemId(), new a(awemeStatusBean, aweme));
    }

    public static final boolean a(ai aiVar) {
        return l.a((Object) aiVar.getLocalExt().get("story_video_is_expired"), (Object) "1");
    }

    public static final void a(String str, String str2, View view, ai aiVar, ShareAwemeContent shareAwemeContent, h.f.a.b<? super Boolean, z> bVar) {
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.a.a()) {
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.adu);
            l.b(remoteImageView, "");
            remoteImageView.setVisibility(8);
            ((RemoteImageView) view.findViewById(R.id.ady)).setBackgroundResource(R.drawable.aud);
            ((TuxIconView) view.findViewById(R.id.f2k)).setIconRes(R.raw.icon_spinner_normal);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bzw);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(4);
            boolean z = false;
            ((RelativeLayout) view.findViewById(R.id.a0b)).setBackgroundColor(0);
            boolean a2 = a(aiVar);
            boolean z2 = !l.a((Object) str, (Object) "0");
            boolean b2 = b(shareAwemeContent);
            if (ShareStoryContent.Companion.isStory(shareAwemeContent) && !com.ss.android.ugc.aweme.story.g.f137757a.a()) {
                z = true;
            }
            if ((!a2 || b2) && !z2) {
                if (!z) {
                    b(view, aiVar, shareAwemeContent, bVar);
                    return;
                }
            } else if (!z) {
                if (a2) {
                    str2 = view.getContext().getString(R.string.h8n);
                    str = "1025";
                }
                a(str, aiVar, shareAwemeContent);
                a(view, str2);
                return;
            }
            str2 = view.getContext().getString(R.string.hav);
            str = "1026";
            a(str, aiVar, shareAwemeContent);
            a(view, str2);
            return;
        }
        RemoteImageView remoteImageView2 = (RemoteImageView) view.findViewById(R.id.adu);
        l.b(remoteImageView2, "");
        remoteImageView2.setVisibility(8);
        ((RemoteImageView) view.findViewById(R.id.ady)).setBackgroundResource(R.drawable.auh);
        a(str, view, aiVar, shareAwemeContent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent.Companion.isStory(r15) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void a(java.lang.String r12, android.view.View r13, com.bytedance.im.core.d.ai r14, com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent r15) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.a(java.lang.String, android.view.View, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent):void");
    }

    public static final void a(AwemeDetailList awemeDetailList, List<ai> list, Set<String> set) {
        List<AwemeStatusBean> list2;
        List<Aweme> list3 = null;
        if (awemeDetailList != null) {
            list2 = awemeDetailList.getAwemeStatus();
            list3 = awemeDetailList.getAwemeList();
        } else {
            list2 = null;
        }
        if (list2 == null) {
            com.ss.android.ugc.aweme.im.service.m.a.e("AwemeCoverManager", "server returned null list");
            return;
        }
        if (list2.size() != set.size()) {
            com.ss.android.ugc.aweme.im.service.m.a.e("AwemeCoverManager", "server returned " + list2.size() + " aweme status info but query for " + set.size());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (T t : list2) {
            if (t == null) {
                com.ss.android.ugc.aweme.im.service.m.a.e("AwemeCoverManager", "returned null bean");
            } else if (t.getAwemeId() == null || t.getStatus() == null) {
                com.ss.android.ugc.aweme.im.service.m.a.e("AwemeCoverManager", "returned bean id: " + t.getAwemeId() + " / status: " + t.getStatus());
            } else {
                String awemeId = t.getAwemeId();
                if (awemeId == null) {
                    l.b();
                }
                if (!set.contains(awemeId)) {
                    com.ss.android.ugc.aweme.im.service.m.a.e("AwemeCoverManager", "returned wrong aweme id " + t.getAwemeId());
                } else {
                    String awemeId2 = t.getAwemeId();
                    if (awemeId2 == null) {
                        l.b();
                    }
                    linkedHashMap.put(awemeId2, t);
                    Integer status = t.getStatus();
                    int parseInt = Integer.parseInt("0");
                    if ((status == null || status.intValue() != parseInt) && t.getStatusText() == null) {
                        com.ss.android.ugc.aweme.im.service.m.a.e("AwemeCoverManager", "returned bean id: " + t.getAwemeId() + " has status: " + t.getStatus() + " but text is null");
                    }
                }
            }
        }
        if (list3 != null) {
            for (T t2 : list3) {
                String aid = t2.getAid();
                l.b(aid, "");
                linkedHashMap2.put(aid, t2);
            }
        }
        for (T t3 : list) {
            BaseContent b2 = b.f.b(t3);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent");
            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b2;
            String itemId = shareAwemeContent.getItemId();
            AwemeStatusBean awemeStatusBean = (AwemeStatusBean) linkedHashMap.get(itemId);
            if (awemeStatusBean == null) {
                com.ss.android.ugc.aweme.im.service.m.a.e("AwemeCoverManager", "aweme id: " + itemId + " not returned");
            } else {
                Aweme aweme = (Aweme) linkedHashMap2.get(itemId);
                if (aweme == null) {
                    Integer status2 = awemeStatusBean.getStatus();
                    int parseInt2 = Integer.parseInt("0");
                    if (status2 != null && status2.intValue() == parseInt2) {
                        com.ss.android.ugc.aweme.im.service.m.a.e("AwemeCoverManager", "aweme id: " + itemId + " is Normal but detail not returned");
                    }
                }
                a((ai) t3, awemeStatusBean, aweme);
                a(shareAwemeContent, awemeStatusBean, aweme);
            }
        }
    }

    public static final boolean a(ai aiVar, AwemeStatusBean awemeStatusBean, Aweme aweme) {
        boolean z;
        String valueOf = String.valueOf(awemeStatusBean.getStatus());
        String statusText = awemeStatusBean.getStatusText();
        if (a(aiVar, valueOf, statusText)) {
            aiVar.addLocalExt("feed_video_status_flag", valueOf);
            if (statusText != null) {
                aiVar.addLocalExt("feed_video_status_text", statusText);
            } else {
                aiVar.clearLocalExt("feed_video_status_text");
            }
            z = true;
        } else {
            z = false;
        }
        if (aweme != null) {
            Video video = aweme.getVideo();
            l.b(video, "");
            UrlModel originCover = video.getOriginCover();
            l.b(originCover, "");
            List<String> urlList = originCover.getUrlList();
            if (urlList != null && urlList.size() > 0) {
                aiVar.addLocalExt("feed_video_origin_cover_url", urlList.get(0));
            }
            User author = aweme.getAuthor();
            l.b(author, "");
            if (author.isAdFake()) {
                User author2 = aweme.getAuthor();
                l.b(author2, "");
                aiVar.addLocalExt("feed_ad_fake_nickname", author2.getNickname());
            }
        }
        aiVar.addLocalExt("feed_video_last_query_time", String.valueOf(System.currentTimeMillis()));
        t.a(aiVar);
        return z;
    }

    private static final boolean a(ai aiVar, String str, String str2) {
        String str3 = aiVar.getLocalExt().get("feed_video_status_flag");
        String str4 = aiVar.getLocalExt().get("feed_video_status_text");
        if (str3 == null && l.a((Object) str, (Object) "0")) {
            return false;
        }
        if (l.a((Object) str3, (Object) "0") && l.a((Object) str, (Object) "0")) {
            return false;
        }
        if (!l.a((Object) str3, (Object) str)) {
            return true;
        }
        return !l.a((Object) str4, (Object) str2);
    }

    public static final void a(String str, ai aiVar, ShareAwemeContent shareAwemeContent) {
        if (!l.a((Object) aiVar.getLocalExt().get("feed_video_last_unavailable_pid"), (Object) f100169b)) {
            String itemId = shareAwemeContent.getItemId();
            a(aiVar.getConversationId(), shareAwemeContent.getUser(), itemId, str);
            aiVar.addLocalExt("feed_video_last_unavailable_pid", f100169b);
            t.a(aiVar);
        }
    }

    private static final void a(String str, String str2, String str3, String str4) {
        r.a("chat_video_cover_failed", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "chat").a("process_id", f100169b).a("conversation_id", str).a("group_id", str3).a("to_user_id", str2).a("error_code", str4).f66730a);
    }

    static final class e extends m implements h.f.a.a<Map<RemoteImageView, h.f.a.b<? super Boolean, ? extends z>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f100189a = new e();

        static {
            Covode.recordClassIndex(63851);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<RemoteImageView, h.f.a.b<? super Boolean, ? extends z>> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(63844);
    }

    public static final class h implements com.bytedance.im.core.a.a.b<ai> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f100190a;

        static {
            Covode.recordClassIndex(63857);
        }

        h(h.c.d dVar) {
            this.f100190a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(ai aiVar) {
            this.f100190a.resumeWith(q.m223constructorimpl(aiVar));
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            Throwable th;
            h.c.d dVar = this.f100190a;
            if (uVar == null || (th = uVar.f38030h) == null) {
                th = new RuntimeException("getMsgByServerId() failed without error");
            }
            dVar.resumeWith(q.m223constructorimpl(h.r.a(th)));
        }
    }

    private static final boolean b(ShareAwemeContent shareAwemeContent) {
        return l.a((Object) shareAwemeContent.getUser(), (Object) f100170c);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$b  reason: collision with other inner class name */
    public static final class C2462b implements com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f100178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ai f100179b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ShareAwemeContent f100180c;

        static {
            Covode.recordClassIndex(63846);
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
            RemoteImageView remoteImageView = (RemoteImageView) this.f100178a.findViewById(R.id.ady);
            l.b(remoteImageView, "");
            b.a(remoteImageView);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$b$a */
        static final class a extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
            int label;
            final /* synthetic */ C2462b this$0;

            static {
                Covode.recordClassIndex(63847);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h.c.d dVar, C2462b bVar) {
                super(2, dVar);
                this.this$0 = bVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(dVar, this.this$0);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    h.r.a(obj);
                    b.a(this.this$0.f100178a, this.this$0.f100179b, this.this$0.f100180c, (h.f.a.b<? super Boolean, z>) null);
                    return z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
            b.a(this.f100178a, this.f100179b, this.f100180c);
        }

        C2462b(View view, ai aiVar, ShareAwemeContent shareAwemeContent) {
            this.f100178a = view;
            this.f100179b = aiVar;
            this.f100180c = shareAwemeContent;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            RemoteImageView remoteImageView = (RemoteImageView) this.f100178a.findViewById(R.id.ady);
            l.b(remoteImageView, "");
            b.a(remoteImageView);
            String str2 = this.f100179b.getLocalExt().get("feed_video_status_flag");
            if (str2 == null || !(!l.a((Object) str2, (Object) "0"))) {
                ((RelativeLayout) this.f100178a.findViewById(R.id.a0b)).setBackgroundResource(2131232762);
                TuxIconView tuxIconView = (TuxIconView) this.f100178a.findViewById(R.id.bzw);
                l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                return;
            }
            bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.af.a.f66269a), null, null, new a(null, this), 3);
        }
    }

    public static final void a(RemoteImageView remoteImageView) {
        bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.af.a.f66269a), null, null, new j(remoteImageView, null), 3);
    }

    public static final class c implements com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f100181a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareAwemeContent f100182b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f100183c;

        static {
            Covode.recordClassIndex(63848);
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
        }

        static final class a extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
            int label;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(63849);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h.c.d dVar, c cVar) {
                super(2, dVar);
                this.this$0 = cVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(dVar, this.this$0);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    h.r.a(obj);
                    b.a(this.this$0.f100183c, this.this$0.f100181a, this.this$0.f100182b, (h.f.a.b<? super Boolean, z>) null);
                    return z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
            b.a("0", this.f100181a, this.f100182b);
        }

        c(ai aiVar, ShareAwemeContent shareAwemeContent, View view) {
            this.f100181a = aiVar;
            this.f100182b = shareAwemeContent;
            this.f100183c = view;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            String str2 = this.f100181a.getLocalExt().get("feed_video_status_flag");
            if (str2 != null && (!l.a((Object) str2, (Object) "0"))) {
                bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.af.a.f66269a), null, null, new a(null, this), 3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ RemoteImageView $key;
        int label;

        static {
            Covode.recordClassIndex(63861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(RemoteImageView remoteImageView, h.c.d dVar) {
            super(2, dVar);
            this.$key = remoteImageView;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new j(this.$key, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((j) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                h.f.a.b<Boolean, z> bVar = b.a().get(this.$key);
                if (bVar != null) {
                    bVar.invoke(false);
                    b.a().remove(this.$key);
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static p<AwemeStatusBean, Aweme> a(ShareAwemeContent shareAwemeContent) {
        a aVar = f100172e.get(shareAwemeContent.getItemId());
        if (aVar != null) {
            if (System.currentTimeMillis() - aVar.f100177c <= com.ss.android.ugc.aweme.im.sdk.common.controller.c.a.a()) {
                return v.a(aVar.f100175a, aVar.f100176b);
            }
        }
        return null;
    }

    public static final class g extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ List $msgList;
        Object L$0;
        Object L$1;
        int label;

        static {
            Covode.recordClassIndex(63856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(List list, h.c.d dVar) {
            super(2, dVar);
            this.$msgList = list;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new g(this.$msgList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Set set;
            ArrayList<ai> arrayList;
            boolean z;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                List list = this.$msgList;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean z2 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ai aiVar = (ai) next;
                    if (aiVar.getMsgType() == 8 || aiVar.getMsgType() == 1025) {
                        z2 = true;
                    }
                    if (z2) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
                if (arrayList.isEmpty()) {
                    return z.f158842a;
                }
                set = new LinkedHashSet();
                for (ai aiVar2 : arrayList) {
                    BaseContent b2 = b.f.b(aiVar2);
                    Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent");
                    ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b2;
                    String itemId = shareAwemeContent.getItemId();
                    if (itemId == null) {
                        itemId = "";
                    }
                    if (itemId.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && b.a(shareAwemeContent) == null) {
                        set.add(itemId);
                    }
                }
                try {
                    String obj2 = set.toString();
                    this.L$0 = arrayList;
                    this.L$1 = set;
                    this.label = 1;
                    obj = com.ss.android.ugc.aweme.im.sdk.common.data.api.b.a(obj2, "chat", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("AwemeCoverManager", e2);
                }
            } else if (i2 == 1) {
                set = (Set) this.L$1;
                arrayList = (List) this.L$0;
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.a((AwemeDetailList) obj, arrayList, set);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ ShareAwemeContent $content;
        final /* synthetic */ com.facebook.drawee.c.d $controllerListener;
        final /* synthetic */ String $convID;
        final /* synthetic */ Long $replyMsgID;
        final /* synthetic */ RemoteImageView $view;
        Object L$0;
        int label;

        static {
            Covode.recordClassIndex(63858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Long l2, String str, com.facebook.drawee.c.d dVar, ShareAwemeContent shareAwemeContent, RemoteImageView remoteImageView, h.c.d dVar2) {
            super(2, dVar2);
            this.$replyMsgID = l2;
            this.$convID = str;
            this.$controllerListener = dVar;
            this.$content = shareAwemeContent;
            this.$view = remoteImageView;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new i(this.$replyMsgID, this.$convID, this.$controllerListener, this.$content, this.$view, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((i) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 185
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ a.AbstractC2574a $callback;
        final /* synthetic */ ShareAwemeContent $content;
        final /* synthetic */ ai $msg;
        final /* synthetic */ View $rootView;
        private /* synthetic */ Object L$0;
        int label;

        static {
            Covode.recordClassIndex(63852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ShareAwemeContent shareAwemeContent, a.AbstractC2574a aVar, View view, ai aiVar, h.c.d dVar) {
            super(2, dVar);
            this.$content = shareAwemeContent;
            this.$callback = aVar;
            this.$rootView = view;
            this.$msg = aiVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            f fVar = new f(this.$content, this.$callback, this.$rootView, this.$msg, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0104 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0117  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 316
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final AwemeStatusBean f100175a;

        /* renamed from: b  reason: collision with root package name */
        public final Aweme f100176b;

        /* renamed from: c  reason: collision with root package name */
        public final long f100177c;

        static {
            Covode.recordClassIndex(63845);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f100175a, aVar.f100175a) && l.a(this.f100176b, aVar.f100176b) && this.f100177c == aVar.f100177c;
        }

        public final int hashCode() {
            AwemeStatusBean awemeStatusBean = this.f100175a;
            int i2 = 0;
            int hashCode = (awemeStatusBean != null ? awemeStatusBean.hashCode() : 0) * 31;
            Aweme aweme = this.f100176b;
            if (aweme != null) {
                i2 = aweme.hashCode();
            }
            long j2 = this.f100177c;
            return ((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "AwemeCacheItem(bean=" + this.f100175a + ", aweme=" + this.f100176b + ", cacheTimestamp=" + this.f100177c + ")";
        }

        public /* synthetic */ a(AwemeStatusBean awemeStatusBean, Aweme aweme) {
            this(awemeStatusBean, aweme, System.currentTimeMillis());
        }

        private a(AwemeStatusBean awemeStatusBean, Aweme aweme, long j2) {
            l.d(awemeStatusBean, "");
            this.f100175a = awemeStatusBean;
            this.f100176b = aweme;
            this.f100177c = j2;
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.im.sdk.common.controller.utils.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareAwemeContent f100184a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f100185b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Long f100186c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f100187d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.facebook.drawee.c.d f100188e;

        static {
            Covode.recordClassIndex(63850);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.e
        public final void a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            a();
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
            String uri;
            StringBuilder sb = new StringBuilder("Not able to load cover url ");
            UrlModel coverUrl = this.f100184a.getCoverUrl();
            l.b(coverUrl, "");
            if (com.bytedance.ies.im.core.api.e.a.a((Collection<? extends Object>) coverUrl.getUrlList())) {
                UrlModel coverUrl2 = this.f100184a.getCoverUrl();
                l.b(coverUrl2, "");
                uri = coverUrl2.getUrlList().get(0);
            } else {
                UrlModel coverUrl3 = this.f100184a.getCoverUrl();
                l.b(coverUrl3, "");
                uri = coverUrl3.getUri();
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("ReplyMessageLayout", sb.append(uri).toString());
            RemoteImageView remoteImageView = this.f100185b;
            Long l2 = this.f100186c;
            String str2 = this.f100187d;
            ShareAwemeContent shareAwemeContent = this.f100184a;
            bz unused = kotlinx.coroutines.i.a(b.f100171d, bf.f159041b, null, new i(l2, str2, this.f100188e, shareAwemeContent, remoteImageView, null), 2);
        }

        d(ShareAwemeContent shareAwemeContent, RemoteImageView remoteImageView, Long l2, String str, com.facebook.drawee.c.d dVar) {
            this.f100184a = shareAwemeContent;
            this.f100185b = remoteImageView;
            this.f100186c = l2;
            this.f100187d = str;
            this.f100188e = dVar;
        }
    }

    public static final UrlModel a(ai aiVar, ShareAwemeContent shareAwemeContent) {
        boolean z;
        String str = aiVar.getLocalExt().get("feed_video_origin_cover_url");
        if (str == null) {
            return shareAwemeContent.getCoverUrl();
        }
        if (shareAwemeContent.getCoverUrl() == null) {
            shareAwemeContent.setCoverUrl(new UrlModel());
        }
        UrlModel coverUrl = shareAwemeContent.getCoverUrl();
        List<String> urlList = coverUrl.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            coverUrl.setUrlList(n.c(str));
            return coverUrl;
        }
        List<String> urlList2 = coverUrl.getUrlList();
        l.b(urlList2, "");
        if (!(!l.a(n.i((List) urlList2), (Object) str))) {
            return coverUrl;
        }
        try {
            coverUrl.getUrlList().add(str);
            return coverUrl;
        } catch (UnsupportedOperationException unused) {
            List<String> urlList3 = coverUrl.getUrlList();
            l.b(urlList3, "");
            List<String> g2 = n.g((Collection) urlList3);
            g2.add(str);
            coverUrl.setUrlList(g2);
            return coverUrl;
        }
    }

    private static final void a(View view, String str) {
        ((RemoteImageView) view.findViewById(R.id.ady)).setBackgroundResource(R.drawable.aud);
        ((SimpleDraweeView) view.findViewById(R.id.ady)).setActualImageResource(R.drawable.aud);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ae1);
        l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        ((TuxTextView) view.findViewById(R.id.aeb)).setTextColor(androidx.core.content.b.c(view.getContext(), R.color.bx));
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ae0);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.ae0);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(str);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.ae0);
            l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
        StoryBrandView storyBrandView = (StoryBrandView) view.findViewById(R.id.ebz);
        l.b(storyBrandView, "");
        storyBrandView.setVisibility(8);
    }

    public static void a(View view, ai aiVar, ShareAwemeContent shareAwemeContent) {
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.ady);
        l.b(remoteImageView, "");
        a(remoteImageView);
        ((RemoteImageView) view.findViewById(R.id.ady)).setBackgroundResource(R.drawable.aue);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bzw);
        l.b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        ((TuxTextView) view.findViewById(R.id.aeb)).setTextColor(androidx.core.content.b.c(view.getContext(), R.color.bx));
        a("0", aiVar, shareAwemeContent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.util.Map<com.ss.android.ugc.aweme.base.ui.RemoteImageView, h.f.a.b<java.lang.Boolean, h.z>> */
    /* JADX WARN: Multi-variable type inference failed */
    private static final void b(View view, ai aiVar, ShareAwemeContent shareAwemeContent, h.f.a.b<? super Boolean, z> bVar) {
        int i2 = 8;
        if (bVar != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ae1);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            bVar.invoke(true);
            Map<RemoteImageView, h.f.a.b<Boolean, z>> a2 = a();
            View findViewById = view.findViewById(R.id.ady);
            l.b(findViewById, "");
            a2.put(findViewById, bVar);
        }
        ((TuxTextView) view.findViewById(R.id.aeb)).setTextColor(androidx.core.content.b.c(view.getContext(), R.color.a9));
        UrlModel a3 = a(aiVar, shareAwemeContent);
        if (a3 == null) {
            a(view, aiVar, shareAwemeContent);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a((RemoteImageView) view.findViewById(R.id.ady), a3, new C2462b(view, aiVar, shareAwemeContent));
        StoryBrandView storyBrandView = (StoryBrandView) view.findViewById(R.id.ebz);
        l.b(storyBrandView, "");
        if (ShareStoryContent.Companion.isStory(shareAwemeContent)) {
            i2 = 0;
        }
        storyBrandView.setVisibility(i2);
    }

    public static final void a(View view, ai aiVar, ShareAwemeContent shareAwemeContent, h.f.a.b<? super Boolean, z> bVar) {
        l.d(view, "");
        l.d(aiVar, "");
        l.d(shareAwemeContent, "");
        if (aiVar.getMsgType() == 1025) {
            ShareStoryContent.Companion companion = ShareStoryContent.Companion;
            Objects.requireNonNull(shareAwemeContent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent");
            boolean isStoryExpired = companion.isStoryExpired((ShareStoryContent) shareAwemeContent);
            boolean a2 = a(aiVar);
            boolean b2 = b(shareAwemeContent);
            if (isStoryExpired) {
                if (!b2 && !a2) {
                    Map<String, String> localExt = aiVar.getLocalExt();
                    l.b(localExt, "");
                    localExt.put("story_video_is_expired", "1");
                }
            } else if (a2) {
                aiVar.getLocalExt().remove("story_video_is_expired");
            }
        }
        String str = aiVar.getLocalExt().get("feed_video_status_flag");
        if (str == null) {
            str = "0";
        }
        a(str, aiVar.getLocalExt().get("feed_video_status_text"), view, aiVar, shareAwemeContent, bVar);
    }

    public static final void a(RemoteImageView remoteImageView, Long l2, String str, ShareAwemeContent shareAwemeContent, com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f> dVar) {
        l.d(remoteImageView, "");
        l.d(str, "");
        l.d(shareAwemeContent, "");
        l.d(dVar, "");
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView, shareAwemeContent.getCoverUrl(), new d(shareAwemeContent, remoteImageView, l2, str, dVar));
    }
}
